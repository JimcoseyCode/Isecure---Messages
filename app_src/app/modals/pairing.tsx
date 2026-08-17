import React, { useState, useCallback, useEffect, useRef } from 'react';
import {
  View, Text, TouchableOpacity, StyleSheet, ScrollView, Alert, ActivityIndicator,
  TextInput, Switch, LayoutAnimation, Platform, UIManager,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter, useLocalSearchParams } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { LinearGradient } from 'expo-linear-gradient';
import Svg, { Circle } from 'react-native-svg';
import * as Clipboard from 'expo-clipboard';
import { Colors } from '@/constants/colors';
import { OvCore, Sms, onSmsReceived } from '@/lib/native/ovcore';
import {
  createEcdhSession, getPendingEcdhSession, completeEcdhSession,
  updateContactKeyPool, getContact, Contact, getSetting,
} from '@/lib/database/db';

if (Platform.OS === 'android' && UIManager.setLayoutAnimationEnabledExperimental) {
  UIManager.setLayoutAnimationEnabledExperimental(true);
}

type Step = 'choose' | 'send_waiting' | 'receive_input' | 'sas_verify' | 'done';

const WINDOW_SECONDS = 8 * 60; // time-limited arming window

type Flow = { icon: string; text: string };
const FLOW: Flow[] = [
  { icon: 'call-outline', text: 'Appelez votre contact — l’opération se fait à deux, en direct.' },
  { icon: 'shield-half-outline', text: 'Armez le pairing des deux côtés avec le curseur ci-dessus.' },
  { icon: 'swap-horizontal-outline', text: 'L’un envoie, l’autre reçoit — décidez ensemble.' },
  { icon: 'paper-plane-outline', text: 'La clé publique part automatiquement par SMS.' },
  { icon: 'checkmark-circle-outline', text: 'Le récepteur accepte la demande reçue.' },
  { icon: 'arrow-undo-outline', text: 'Une réponse chiffrée repart automatiquement.' },
  { icon: 'keypad-outline', text: 'Un code de 12 caractères s’affiche des deux côtés.' },
  { icon: 'shield-checkmark-outline', text: 'Lisez-le à voix haute — s’il concorde, validez.' },
];

function mmss(s: number) { return `${Math.floor(s / 60)}:${(s % 60).toString().padStart(2, '0')}`; }

// Circular countdown ring — drains over the arming window.
function TimerRing({ armed, secondsLeft }: { armed: boolean; secondsLeft: number }) {
  const size = 60, sw = 5, r = (size - sw) / 2, c = 2 * Math.PI * r;
  const pct = armed ? secondsLeft / WINDOW_SECONDS : 0;
  return (
    <View style={{ width: size, height: size, alignItems: 'center', justifyContent: 'center' }}>
      <Svg width={size} height={size} style={{ position: 'absolute', transform: [{ rotate: '-90deg' }] }}>
        <Circle cx={size / 2} cy={size / 2} r={r} stroke={Colors.borderLight} strokeWidth={sw} fill="none" />
        {armed && (
          <Circle
            cx={size / 2} cy={size / 2} r={r} stroke={Colors.success} strokeWidth={sw} fill="none"
            strokeLinecap="round" strokeDasharray={c} strokeDashoffset={c * (1 - pct)}
          />
        )}
      </Svg>
      {armed
        ? <Text style={styles.ringTime}>{mmss(secondsLeft)}</Text>
        : <Ionicons name="lock-closed" size={22} color={Colors.textMuted} />}
    </View>
  );
}

export default function PairingModal() {
  const router = useRouter();
  const { contactId } = useLocalSearchParams<{ contactId: string }>();
  const cid = parseInt(contactId ?? '0');

  const [contact, setContact] = useState<Contact | null>(null);
  const [step, setStep] = useState<Step>('choose');
  const [armed, setArmed] = useState(false);
  const [secondsLeft, setSecondsLeft] = useState(WINDOW_SECONDS);
  const [flowOpen, setFlowOpen] = useState(true);
  const [techOpen, setTechOpen] = useState(false);
  const [loading, setLoading] = useState(false);
  const [pasteText, setPasteText] = useState('');
  const [sasCode, setSasCode] = useState('');
  const [pendingSharedKey, setPendingSharedKey] = useState('');
  const [ovCompat, setOvCompat] = useState(false);
  const [ovStateHex, setOvStateHex] = useState('');
  const timer = useRef<ReturnType<typeof setInterval> | null>(null);

  useEffect(() => { 
    getContact(cid).then(setContact); 
    getSetting('ov_compat', '1').then(v => setOvCompat(v === '1'));
  }, [cid]);

  useEffect(() => {
    if (armed) {
      setSecondsLeft(WINDOW_SECONDS);
      timer.current = setInterval(() => {
        setSecondsLeft((s) => { if (s <= 1) { setArmed(false); return WINDOW_SECONDS; } return s - 1; });
      }, 1000);
    } else if (timer.current) { clearInterval(timer.current); timer.current = null; }
    return () => { if (timer.current) { clearInterval(timer.current); timer.current = null; } };
  }, [armed]);

  // AUTO-LISTENER
  useEffect(() => {
    if (!armed) return;
    const unsub = onSmsReceived(async (msg) => {
      // Receiver side (B)
      if (step === 'choose' || step === 'receive_input') {
        console.log('Incoming SMS in choose/receive_input:', msg.body);
        if (msg.body.trim().startsWith('OVPK:') && msg.body.includes(':I:')) {
          const body = msg.body.trim();
          setPasteText(body);
          processReceive(body);
        } else if (msg.body.trim().startsWith('OVB:A:')) {
          const body = msg.body.trim();
          setPasteText(body);
          processReceive(body);
        }
      }
      // Sender side (A) waiting for reply
      if (step === 'send_waiting') {
        console.log('Incoming SMS in send_waiting:', msg.body);
        if (msg.body.trim().startsWith('OVPK:') && msg.body.includes(':R:')) {
          const body = msg.body.trim();
          setPasteText(body);
          processComplete(body);
        } else if (msg.body.trim().startsWith('OVB:B:')) {
          const body = msg.body.trim();
          setPasteText(body);
          processComplete(body);
        }
      }
    });
    return unsub;
  }, [armed, step, cid, ovCompat, pasteText]); // dependencies to get the latest state inside the callback

  // Auto-process latest pairing SMS on mount to make pairing fully fluid (replacing native auto-responder)
  useEffect(() => {
    if (step === 'choose' || step === 'send_waiting') {
      Sms.readLatestPairingSms().then(body => {
        if (!body) return;
        const txt = body.trim();
        // If we are waiting to receive an initiation
        if (step === 'choose') {
           if (txt.startsWith('OVPK:') && txt.includes(':I:')) {
             setPasteText(txt);
             processReceive(txt);
           } else if (txt.startsWith('OVB:A:')) {
             setPasteText(txt);
             processReceive(txt);
           }
        }
        // If we sent the initiation and are waiting for the reply
        else if (step === 'send_waiting') {
           if (txt.startsWith('OVPK:') && txt.includes(':R:')) {
             setPasteText(txt);
             processComplete(txt);
           } else if (txt.startsWith('OVB:B:')) {
             setPasteText(txt);
             processComplete(txt);
           }
        }
      }).catch(console.warn);
    }
  }, [step]);

  function anim() { LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut); }
  const firstName = contact?.name?.split(' ')[0] ?? 'ce contact';

  const handleSend = useCallback(async () => {
    if (!armed) return;
    setLoading(true);
    try {
      const c = await getContact(cid); if (!c) return;
      let smsToSend = '';
      if (ovCompat) {
        Alert.alert('Mode démo', 'Pour l’instant, veuillez initier l’appairage depuis l’application OV Message d’origine (Recevoir une clé).');
        setLoading(false);
        return;
      } else {
        const { keypairHex, sms } = await OvCore.startPairingA();
        await createEcdhSession(cid, keypairHex, '');
        smsToSend = sms;
      }
      if (smsToSend) await Sms.sendSms(c.phone, smsToSend);
      setStep('send_waiting');
    } catch (e: any) { Alert.alert('Erreur', e?.message ?? 'Envoi impossible.'); }
    finally { setLoading(false); }
  }, [cid, armed, ovCompat]);

  const processComplete = async (bSms: string) => {
    if (!bSms.startsWith('OVB:B:') && !bSms.startsWith('OVPK:')) { Alert.alert('Erreur', 'Message d’appairage invalide.'); return; }
    setLoading(true);
    try {
      if (ovCompat && bSms.startsWith('OVPK:')) {
        const session = await getPendingEcdhSession(cid);
        if (!session) { Alert.alert('Erreur', 'Session expirée.'); return; }
        const { contactKeyHex, sas } = await OvCore.ovPairingFinish(session.private_key_hex, bSms);
        setSasCode(sas); setPendingSharedKey(contactKeyHex);
        await completeEcdhSession(session.id, '', contactKeyHex);
        setStep('sas_verify');
      } else {
        const session = await getPendingEcdhSession(cid);
        if (!session) { Alert.alert('Erreur', 'Session expirée.'); return; }
        const { sharedKeyHex, sas } = await OvCore.completePairingA(session.private_key_hex, bSms);
        setSasCode(sas); setPendingSharedKey(sharedKeyHex);
        await completeEcdhSession(session.id, '', sharedKeyHex);
        setStep('sas_verify');
      }
    } catch { Alert.alert('Erreur', 'Échec du calcul de la clé.'); }
    finally { setLoading(false); }
  };

  const handleComplete = useCallback(() => processComplete(pasteText.trim()), [cid, pasteText, ovCompat]);

  const processReceive = async (aSms: string) => {
    if (!aSms.startsWith('OVB:A:') && !aSms.startsWith('OVPK:')) { Alert.alert('Erreur', 'Message d’appairage invalide.'); return; }
    setLoading(true);
    try {
      const c = await getContact(cid); if (!c) return;
      if (ovCompat && aSms.startsWith('OVPK:')) {
        const { replySms, contactKeyHex, sas, ssEcHex, ssPqHex, cipherTextHex } = await OvCore.ovHybridRespond(aSms);
        console.log("CALIBRATION_DATA:", { ssEcHex, ssPqHex, cipherTextHex, ovpkI: aSms });
        await Sms.sendSms(c.phone, replySms);
        setSasCode(sas); setPendingSharedKey(contactKeyHex);
        setStep('sas_verify');
      } else {
        const { sharedKeyHex, sms, sas } = await OvCore.respondPairingB(aSms);
        await Sms.sendSms(c.phone, sms);
        setSasCode(sas); setPendingSharedKey(sharedKeyHex);
        setStep('sas_verify');
      }
    } catch { Alert.alert('Erreur', 'Échec du calcul de la clé.'); }
    finally { setLoading(false); }
  };

  const handleReceive = useCallback(() => processReceive(pasteText.trim()), [cid, pasteText, ovCompat]);

  const handleConfirmSas = useCallback(async () => {
    setLoading(true);
    try {
      if (ovCompat) {
        // En mode OV Compat, pendingSharedKey est la clé "slot4" (chaîne longue issue d'un charset étendu).
        // On ne dérive PAS de pool de clés, on la sauvegarde en tant que clé unique.
        await updateContactKeyPool(cid, pendingSharedKey, [pendingSharedKey], 0);
      } else {
        const pool = await OvCore.deriveKeyPool(pendingSharedKey, 500);
        await updateContactKeyPool(cid, pendingSharedKey, pool, 0);
      }
      setArmed(false);
      setStep('done');
    } catch (e: any) { 
      Alert.alert('Erreur', 'Sauvegarde impossible: ' + (e?.message || 'Erreur inconnue')); 
    }
    finally { setLoading(false); }
  }, [cid, pendingSharedKey, ovCompat]);

  return (
    <SafeAreaView style={styles.container} edges={['top', 'bottom']}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()} style={styles.back}>
          <Ionicons name="chevron-down" size={26} color={Colors.textSecondary} />
        </TouchableOpacity>
        <Text style={styles.headerTitle}>Appairage</Text>
        <View style={{ width: 34 }} />
      </View>

      <ScrollView contentContainerStyle={styles.body} showsVerticalScrollIndicator={false}>
        {step === 'choose' && (
          <>
            {/* Hero */}
            <LinearGradient colors={['#0A84FF', '#5E5CE6']} start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }} style={styles.hero}>
              <View style={styles.heroIcon}><Ionicons name="shield-checkmark" size={30} color="#fff" /></View>
              <Text style={styles.heroTitle}>Sécuriser avec {firstName}</Text>
              <Text style={styles.heroSub}>Créez une clé partagée post-quantique, en direct, en vous appelant.</Text>
            </LinearGradient>

            {/* Arm gate with ring timer */}
            <View style={[styles.armCard, armed && styles.armCardOn]}>
              <TimerRing armed={armed} secondsLeft={secondsLeft} />
              <View style={{ flex: 1 }}>
                <Text style={styles.armTitle}>{armed ? 'Pairing armé' : 'Fenêtre d’appairage'}</Text>
                <Text style={styles.armSub}>
                  {armed ? `Se referme dans ${mmss(secondsLeft)} ou après validation.` : 'Activez des deux côtés pour débloquer.'}
                </Text>
              </View>
              <Switch value={armed} onValueChange={(v) => { anim(); setArmed(v); }}
                trackColor={{ false: Colors.toggleInactive, true: Colors.success }} thumbColor="#fff" />
            </View>

            {/* Action cards */}
            {ovCompat ? (
              <View style={styles.autoWaitCard}>
                 <ActivityIndicator color={Colors.primary} size="large" />
                 <Text style={styles.autoWaitTitle}>En attente d'OV Message</Text>
                 <Text style={styles.autoWaitSub}>L'application écoute automatiquement les SMS d'appairage entrants. Lancez la procédure depuis l'application originale.</Text>
              </View>
            ) : (
              <>
                <TouchableOpacity style={[styles.action, !armed && styles.actionOff]} disabled={!armed || loading} onPress={handleSend} activeOpacity={0.85}>
                  <View style={[styles.actionIcon, { backgroundColor: armed ? `${Colors.primary}18` : Colors.borderLight }]}>
                    {loading ? <ActivityIndicator color={Colors.primary} /> : <Ionicons name="paper-plane" size={22} color={armed ? Colors.primary : Colors.textMuted} />}
                  </View>
                  <View style={{ flex: 1 }}>
                    <Text style={[styles.actionTitle, !armed && styles.dim]}>Envoyer ma clé</Text>
                    <Text style={styles.actionSub}>Vous initiez l’échange.</Text>
                  </View>
                  <Ionicons name={armed ? 'chevron-forward' : 'lock-closed'} size={18} color={Colors.textMuted} />
                </TouchableOpacity>

                <TouchableOpacity style={[styles.action, !armed && styles.actionOff]} disabled={!armed} onPress={() => { anim(); setStep('receive_input'); }} activeOpacity={0.85}>
                  <View style={[styles.actionIcon, { backgroundColor: armed ? `${Colors.success}18` : Colors.borderLight }]}>
                    <Ionicons name="download" size={22} color={armed ? Colors.success : Colors.textMuted} />
                  </View>
                  <View style={{ flex: 1 }}>
                    <Text style={[styles.actionTitle, !armed && styles.dim]}>Recevoir une clé</Text>
                    <Text style={styles.actionSub}>Votre contact a initié.</Text>
                  </View>
                  <Ionicons name={armed ? 'chevron-forward' : 'lock-closed'} size={18} color={Colors.textMuted} />
                </TouchableOpacity>
              </>
            )}

            {/* Timeline */}
            <TouchableOpacity style={styles.sectionHead} onPress={() => { anim(); setFlowOpen(o => !o); }} activeOpacity={0.7}>
              <Text style={styles.sectionTitle}>Comment ça marche</Text>
              <Ionicons name={flowOpen ? 'chevron-up' : 'chevron-down'} size={18} color={Colors.textMuted} />
            </TouchableOpacity>
            {flowOpen && (
              <View style={styles.timeline}>
                {FLOW.map((f, i) => (
                  <View key={i} style={styles.tlRow}>
                    <View style={styles.tlLeft}>
                      <View style={styles.tlDot}><Ionicons name={f.icon as any} size={15} color={Colors.primary} /></View>
                      {i < FLOW.length - 1 && <View style={styles.tlLine} />}
                    </View>
                    <Text style={styles.tlText}>{f.text}</Text>
                  </View>
                ))}
              </View>
            )}

            {/* Détails techniques */}
            <TouchableOpacity style={styles.techChip} onPress={() => { anim(); setTechOpen(o => !o); }} activeOpacity={0.7}>
              <Ionicons name="hardware-chip-outline" size={15} color={Colors.textSecondary} />
              <Text style={styles.techChipText}>Détails techniques</Text>
              <Ionicons name={techOpen ? 'chevron-up' : 'chevron-down'} size={15} color={Colors.textSecondary} />
            </TouchableOpacity>
            {techOpen && (
              <Text style={styles.techText}>
                Protocole hybride ML-KEM-768 (résistant aux ordinateurs quantiques) combiné à X25519.
                La clé secrète est calculée des deux côtés à partir des clés publiques échangées — jamais
                transmise. Un pool de 500 clés est ensuite dérivé (HKDF-SHA256) pour la rotation par message.
              </Text>
            )}
          </>
        )}

        {step === 'send_waiting' && (
          <StatusStep icon="checkmark-circle" color={Colors.success} title="Requête envoyée"
            text="En attente de la réponse de votre contact. L'application écoute automatiquement le réseau.">
            <View style={{ alignItems: 'center', marginTop: 20 }}>
              <ActivityIndicator color={Colors.primary} size="large" />
            </View>
          </StatusStep>
        )}

        {step === 'receive_input' && (
          <StatusStep icon="download" color={Colors.primary} title="En attente d'initiation"
            text="L'application écoute automatiquement la demande de votre contact.">
            <View style={{ alignItems: 'center', marginTop: 20 }}>
              <ActivityIndicator color={Colors.primary} size="large" />
            </View>
          </StatusStep>
        )}

        {step === 'sas_verify' && (
          <StatusStep icon="shield-checkmark" color={Colors.primary} title="Vérifiez le code ensemble"
            text="Lisez ce code à voix haute avec votre contact. Identique des deux côtés → clé authentique.">
            <View style={styles.sasBox}>
              <Text style={styles.sasCode}>{sasCode}</Text>
              <TouchableOpacity onPress={() => Clipboard.setStringAsync(sasCode)} style={styles.copyBtn}>
                <Ionicons name="copy-outline" size={16} color={Colors.primary} /><Text style={styles.copyText}>Copier</Text>
              </TouchableOpacity>
            </View>
            <PrimaryBtn label="Les codes correspondent" loading={loading} onPress={handleConfirmSas} />
            <TouchableOpacity style={styles.danger} onPress={() => router.back()} activeOpacity={0.85}>
              <Text style={styles.dangerText}>Pas de correspondance — annuler</Text>
            </TouchableOpacity>
          </StatusStep>
        )}

        {step === 'done' && (
          <View style={styles.doneBox}>
            <LinearGradient colors={['#30D158', '#0A84FF']} start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }} style={styles.doneIcon}>
              <Ionicons name="lock-closed" size={40} color="#fff" />
            </LinearGradient>
            <Text style={styles.doneTitle}>Conversation sécurisée</Text>
            <Text style={styles.statusText}>
              Un pool de 500 clés a été généré. Vos messages avec {firstName} sont désormais chiffrés
              avec une sécurité post-quantique.
            </Text>
            <PrimaryBtn label="Terminer" onPress={() => router.back()} />
          </View>
        )}
      </ScrollView>
    </SafeAreaView>
  );
}

function StatusStep({ icon, color, title, text, children }: any) {
  return (
    <>
      <View style={styles.statusBox}>
        <View style={[styles.statusIcon, { backgroundColor: `${color}18` }]}><Ionicons name={icon} size={28} color={color} /></View>
        <Text style={styles.statusTitle}>{title}</Text>
        <Text style={styles.statusText}>{text}</Text>
      </View>
      {children}
    </>
  );
}

function PrimaryBtn({ label, onPress, loading, disabled }: { label: string; onPress: () => void; loading?: boolean; disabled?: boolean }) {
  return (
    <TouchableOpacity style={[styles.primary, (disabled || loading) && styles.primaryOff]} disabled={disabled || loading} onPress={onPress} activeOpacity={0.85}>
      {loading ? <ActivityIndicator color="#fff" /> : <Text style={styles.primaryText}>{label}</Text>}
    </TouchableOpacity>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.backgroundSecondary },
  header: { flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', paddingHorizontal: 8, paddingVertical: 8 },
  back: { padding: 4, width: 34, alignItems: 'center' },
  headerTitle: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  body: { padding: 18, gap: 14, paddingBottom: 40 },

  hero: { borderRadius: 22, padding: 22, alignItems: 'center', gap: 8 },
  heroIcon: { width: 62, height: 62, borderRadius: 31, backgroundColor: 'rgba(255,255,255,0.22)', alignItems: 'center', justifyContent: 'center', marginBottom: 4 },
  heroTitle: { fontSize: 21, fontFamily: 'Roboto-Bold', color: '#fff', textAlign: 'center' },
  heroSub: { fontSize: 14, fontFamily: 'Roboto-Regular', color: 'rgba(255,255,255,0.9)', textAlign: 'center', lineHeight: 20 },

  armCard: {
    flexDirection: 'row', alignItems: 'center', gap: 14, backgroundColor: Colors.surface,
    borderRadius: 18, padding: 16, borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  armCardOn: { borderColor: Colors.success },
  ringTime: { fontSize: 13, fontFamily: 'Roboto-Bold', color: Colors.success },
  armTitle: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  armSub: { fontSize: 13, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, marginTop: 2 },

  action: {
    flexDirection: 'row', alignItems: 'center', gap: 14, backgroundColor: Colors.surface,
    borderRadius: 18, padding: 16, borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  actionOff: { opacity: 0.6 },
  actionIcon: { width: 46, height: 46, borderRadius: 23, alignItems: 'center', justifyContent: 'center' },
  actionTitle: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  actionSub: { fontSize: 13, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, marginTop: 1 },
  dim: { color: Colors.textMuted },

  autoWaitCard: { alignItems: 'center', justifyContent: 'center', padding: 24, backgroundColor: Colors.surface, borderRadius: 18, borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border, gap: 12 },
  autoWaitTitle: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  autoWaitSub: { fontSize: 14, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, textAlign: 'center', lineHeight: 21 },

  sectionHead: { flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', marginTop: 6, paddingHorizontal: 2 },
  sectionTitle: { fontSize: 15, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },

  timeline: { backgroundColor: Colors.surface, borderRadius: 18, padding: 16, borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border },
  tlRow: { flexDirection: 'row', gap: 12 },
  tlLeft: { alignItems: 'center', width: 30 },
  tlDot: { width: 30, height: 30, borderRadius: 15, backgroundColor: `${Colors.primary}14`, alignItems: 'center', justifyContent: 'center' },
  tlLine: { flex: 1, width: 2, backgroundColor: Colors.separator, marginVertical: 2, minHeight: 14 },
  tlText: { flex: 1, fontSize: 14, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', lineHeight: 21, paddingBottom: 14 },

  techChip: { flexDirection: 'row', alignItems: 'center', gap: 8, alignSelf: 'flex-start', paddingVertical: 6, paddingHorizontal: 2 },
  techChipText: { fontSize: 14, fontFamily: 'Roboto-Medium', color: Colors.textSecondary },
  techText: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', lineHeight: 20 },

  statusBox: { alignItems: 'center', gap: 8, backgroundColor: Colors.surface, borderRadius: 18, padding: 22, borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border },
  statusIcon: { width: 56, height: 56, borderRadius: 28, alignItems: 'center', justifyContent: 'center' },
  statusTitle: { fontSize: 18, color: Colors.textPrimary, fontFamily: 'Roboto-Bold' },
  statusText: { fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', textAlign: 'center', lineHeight: 21 },
  paste: {
    backgroundColor: Colors.surface, borderRadius: 14, padding: 14, minHeight: 96, textAlignVertical: 'top',
    fontSize: 14, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },

  primary: { backgroundColor: Colors.primary, borderRadius: 15, paddingVertical: 16, alignItems: 'center' },
  primaryOff: { backgroundColor: Colors.borderLight },
  primaryText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 16 },

  sasBox: { backgroundColor: Colors.primary, borderRadius: 18, padding: 24, alignItems: 'center', gap: 12 },
  sasCode: { fontSize: 27, color: '#fff', fontFamily: 'Roboto-Bold', letterSpacing: 5 },
  copyBtn: { flexDirection: 'row', alignItems: 'center', gap: 6, backgroundColor: '#fff', borderRadius: 10, paddingHorizontal: 12, paddingVertical: 6 },
  copyText: { color: Colors.primary, fontFamily: 'Roboto-Medium', fontSize: 13 },
  danger: { borderRadius: 15, paddingVertical: 16, alignItems: 'center', borderWidth: 1.5, borderColor: Colors.error },
  dangerText: { color: Colors.error, fontFamily: 'Roboto-Bold', fontSize: 15 },

  doneBox: { alignItems: 'center', gap: 16, paddingTop: 30 },
  doneIcon: { width: 88, height: 88, borderRadius: 44, alignItems: 'center', justifyContent: 'center' },
  doneTitle: { fontSize: 23, color: Colors.textPrimary, fontFamily: 'Roboto-Bold' },
});
