import { useEffect, useState, useRef } from 'react';
import { DeviceEventEmitter, AppState, Alert } from 'react-native';
import { Stack, router } from 'expo-router';
import { useFonts } from 'expo-font';
import * as SplashScreen from 'expo-splash-screen';
import { StatusBar } from 'expo-status-bar';
import { SafeAreaProvider } from 'react-native-safe-area-context';
import { initDB, getSetting, getContacts, updateContactKeyPool } from '@/lib/database/db';
import { Sms, OvCore, onSmsReceived } from '@/lib/native/ovcore';
import { applyLanguage } from '@/constants/strings';

const REKEY_PREFIX = 'ISREKEY:';

SplashScreen.preventAutoHideAsync();

export default function RootLayout() {
  const [fontsLoaded] = useFonts({
    'Roboto-Regular': require('../assets/fonts/Roboto-Regular.ttf'),
    'Roboto-Medium': require('../assets/fonts/Roboto-Medium.ttf'),
    'Roboto-Bold': require('../assets/fonts/Roboto-Bold.ttf'),
  });

  // Bumping this key re-mounts the whole tree so mutated S.xxx strings refresh.
  const [langKey, setLangKey] = useState(0);













  useEffect(() => {
    initDB()
      .then(async () => {
        applyLanguage(await getSetting('language', 'fr'));
        setLangKey((k) => k + 1);
        // Apply anti-screenshot (FLAG_SECURE) explicitly — set OR clear — from
        // the stored preference, so no stale secure flag lingers across launches.
        const secure = (await getSetting('anti_screenshot', '0')) === '1';
        Sms.setScreenSecure(secure).catch(() => {});
      })
      .catch(console.error);

    const sub = DeviceEventEmitter.addListener('languageChanged', (code: string) => {
      applyLanguage(code);
      setLangKey((k) => k + 1);
    });
    return () => sub.remove();
  }, []);

  // Global auto re-pair receiver: a contact rotated their key and sent it encrypted
  // under the current key (ISREKEY:). Decrypt, warn the user (possible compromise),
  // let them accept the new key. Works regardless of which screen is open.
  useEffect(() => {
    const unsub = onSmsReceived(async (sms) => {
      const body = (sms.body ?? '').trim();
      if (!body.startsWith(REKEY_PREFIX)) return;
      const norm = (s: string) => s.replace(/\D/g, '').slice(-9);
      const contact = (await getContacts()).find(x => norm(x.phone) === norm(sms.address));
      if (!contact?.key_pool) return;
      try {
        const pool: string[] = JSON.parse(contact.key_pool);
        const curKey = pool[(contact.current_key_index || 0) % pool.length];
        const master = (await OvCore.openMessage(curKey, body.slice(REKEY_PREFIX.length))).trim();
        if (!/^[0-9a-fA-F]{64}$/.test(master)) return;
        Alert.alert(
          'Clé changée',
          `${contact.name} a régénéré sa clé de chiffrement (rotation de sécurité — il a peut-être été compromis). Accepter la nouvelle clé ?`,
          [
            { text: 'Refuser', style: 'cancel' },
            { text: 'Accepter', onPress: async () => {
              const newPool = await OvCore.deriveKeyPool(master, 500);
              await updateContactKeyPool(contact.id, master, newPool, 0);
            } },
          ],
        );
      } catch { /* not for us / undecryptable */ }
    });
    return unsub;
  }, []);

  // Auto-lock: when the app returns to the foreground after being backgrounded,
  // re-lock to the password screen (only if both auto-lock and a login password
  // are enabled). ponytail: locks on every foreground; add a grace timeout if
  // users find it too aggressive.
  const bgAt = useRef<number | null>(null);
  useEffect(() => {
    const sub = AppState.addEventListener('change', async (state) => {
      if (state === 'background' || state === 'inactive') {
        bgAt.current = Date.now();
      } else if (state === 'active' && bgAt.current !== null) {
        bgAt.current = null;
        const [autoLock, hasPw] = await Promise.all([
          getSetting('auto_lock', '0'),
          getSetting('login_password', '0'),
        ]);
        if (autoLock === '1' && hasPw === '1') router.replace('/auth/login');
      }
    });
    return () => sub.remove();
  }, []);

  useEffect(() => {
    if (fontsLoaded) SplashScreen.hideAsync();
  }, [fontsLoaded]);

  if (!fontsLoaded) return null;

  return (
    <SafeAreaProvider key={langKey}>
      <StatusBar style="dark" />
      <Stack screenOptions={{ headerShown: false }}>
        <Stack.Screen name="auth/onboarding" />
        <Stack.Screen name="auth/login" />
        <Stack.Screen name="auth/setup-phone" />
        <Stack.Screen name="tabs" />
        <Stack.Screen name="modals/pairing" options={{ presentation: 'modal' }} />
        <Stack.Screen name="modals/new-message" options={{ presentation: 'modal' }} />
        <Stack.Screen name="modals/notes" options={{ presentation: 'modal' }} />
        <Stack.Screen name="modals/universal-encrypt" options={{ presentation: 'modal' }} />
        <Stack.Screen name="modals/add-contact" options={{ presentation: 'modal' }} />
        <Stack.Screen name="modals/key-share" options={{ presentation: 'modal' }} />
        <Stack.Screen name="tabs/discussions/blocked-contacts" />
        <Stack.Screen name="tabs/settings/language" />
        <Stack.Screen name="tabs/settings/file-performance" />
        <Stack.Screen name="tabs/settings/permissions" />
        <Stack.Screen name="tabs/settings/help" />
        <Stack.Screen name="tabs/settings/rcs" />
      </Stack>
    </SafeAreaProvider>
  );
}
