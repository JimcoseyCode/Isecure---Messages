import { useEffect } from 'react';
import { useRouter } from 'expo-router';
import { getSetting } from '@/lib/database/db';

// Entry point: route based on app state
// - First launch (onboarding not done) → onboarding
// - Has login password → login screen
// - Otherwise → main tabs directly
export default function Index() {
  const router = useRouter();

  useEffect(() => {
    async function route() {
      const onboardingDone = (await getSetting('onboarding_done', '0')) === '1';
      if (!onboardingDone) {
        // Apple-style first-run: name + auto-detected SIM number.
        router.replace('/auth/setup-phone');
        return;
      }
      const hasPassword = (await getSetting('login_password', '0')) === '1';
      if (hasPassword) {
        router.replace('/auth/login');
      } else {
        router.replace('/tabs');
      }
    }
    route().catch(console.error);
  }, [router]);

  return null;
}
