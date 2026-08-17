import React, { useState } from 'react';
import {
  View, Text, ScrollView, TouchableOpacity, StyleSheet, LayoutAnimation, Platform, UIManager,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { KeyExchangeDemo } from '@/components/ui/KeyExchangeDemo';

if (Platform.OS === 'android' && UIManager.setLayoutAnimationEnabledExperimental) {
  UIManager.setLayoutAnimationEnabledExperimental(true);
}

type Guide = { title: string; icon: string; color: string; steps: string[] };

const GUIDES: Guide[] = [
  {
    title: 'Appairer les clés avec un contact',
    icon: 'swap-horizontal-outline',
    color: Colors.primary,
    steps: [
      'Ouvrez la conversation puis touchez l’icône d’échange (⇄) en haut, ou Options → « Appairage des clés ».',
      'À faire à deux, en direct (appel téléphonique conseillé). L’un choisit « Envoyer », l’autre « Recevoir ».',
      'L’émetteur envoie automatiquement un message OVB:A: (sa clé publique hybride ML-KEM-768 + X25519).',
      'Le destinataire colle ce message, l’app calcule la clé et renvoie une réponse OVB:B:.',
      'L’émetteur colle la réponse OVB:B: et touche « Calculer la clé commune ».',
      'Les deux téléphones affichent un code SAS de 12 caractères. Comparez-le de vive voix : s’il est identique, touchez « Les codes correspondent ». S’il diffère, annulez — quelqu’un s’est interposé.',
      'Un pool de 500 clés est généré. La conversation est désormais chiffrée de bout en bout.',
    ],
  },
  {
    title: 'Lire le chat chiffré (cadenas & couleurs)',
    icon: 'chatbubble-ellipses-outline',
    color: Colors.success,
    steps: [
      'Bulle bleue = message chiffré (AES-256-GCM). Un cadenas vert « Chiffré » confirme le déchiffrement réussi.',
      'Bulle verte = SMS en clair (non chiffré), comme un SMS classique.',
      'Bulle grise = message reçu en clair.',
      'Cadenas rouge « Déchiffrement échoué » = les clés ne correspondent pas ou le message a été altéré.',
      'Touchez le cadenas en bas à gauche de la saisie pour activer/désactiver le chiffrement avant d’envoyer.',
    ],
  },
  {
    title: 'Le pool de 500 clés (rotation)',
    icon: 'layers-outline',
    color: Colors.warning,
    steps: [
      'À l’appairage, l’app dérive 500 clés uniques à partir du secret commun (HKDF).',
      'Chaque message utilise la clé suivante du pool, puis passe à la suivante automatiquement.',
      'L’indice de clé voyage avec le message : le destinataire sait toujours quelle clé utiliser.',
      'Avantage : même si une clé était compromise, elle ne sert qu’à un seul message.',
    ],
  },
  {
    title: 'Chiffrement universel (toute plateforme)',
    icon: 'shield-outline',
    color: Colors.purpleIconBg,
    steps: [
      'Menu → « Chiffrement universel ». Entrez une clé (ou générez-en une dans la fiche contact).',
      'Onglet Texte : collez du texte, « Chiffrer » produit un bloc que vous pouvez copier dans WhatsApp, e-mail, n’importe où.',
      'Le destinataire colle ce bloc dans son « Chiffrement universel » avec la même clé et touche « Déchiffrer ».',
      'Onglet Fichier : chiffre/déchiffre n’importe quel fichier en .ov, indépendamment d’un contact.',
    ],
  },
  {
    title: 'Messages éphémères',
    icon: 'timer-outline',
    color: Colors.warning,
    steps: [
      'Dans une conversation : Options → « Messages éphémères ».',
      'Choisissez une durée (5 min à 1 semaine).',
      'Chaque message envoyé après affiche un compte à rebours et s’autodétruit à l’expiration, des deux côtés.',
    ],
  },
  {
    title: 'Mode Forteresse',
    icon: 'business-outline',
    color: Colors.primary,
    steps: [
      'Réglages → « Mode Forteresse ».',
      'Une fois actif, tout message reçu NON chiffré est bloqué et affiché « Bloqué — Mode Forteresse ».',
      'Protège contre les messages en clair injectés à votre insu.',
    ],
  },
  {
    title: 'Chiffrement forcé',
    icon: 'eye-off-outline',
    color: Colors.purpleIconBg,
    steps: [
      'Réglages → « Chiffrement forcé ».',
      'Force le chiffrement sur toutes les transmissions : impossible d’envoyer en clair par erreur.',
      'Une bannière l’indique en haut de chaque conversation.',
    ],
  },
  {
    title: 'Mot de passe & Mode Panique',
    icon: 'flame-outline',
    color: Colors.error,
    steps: [
      'Réglages → « Mot de passe de connexion » : protège l’ouverture de l’app (dérivation Argon2id, résistante au brute-force).',
      '« Mode Panique » : définissez un SECOND mot de passe. Le saisir à l’ouverture déclenche la destruction totale des données (clés, contacts, messages) — irréversible.',
      '« Panique Clés uniquement » : détruit seulement les clés ; les messages restent mais deviennent illisibles.',
      '« Auto-destruction (3 essais) » : efface tout après 3 mots de passe incorrects.',
    ],
  },
  {
    title: 'Anti-capture d’écran',
    icon: 'camera-outline',
    color: Colors.textPrimary,
    steps: [
      'Réglages → « Anti-capture d’écran ».',
      'Active le drapeau sécurisé du système : les captures d’écran sont bloquées et l’app apparaît en noir dans l’aperçu multitâche.',
      'S’applique à toute l’app tant que l’option est active.',
    ],
  },
  {
    title: 'Notes chiffrées',
    icon: 'document-text-outline',
    color: Colors.success,
    steps: [
      'Menu → « Notes ». Touchez + pour créer une note.',
      'Chaque note est chiffrée en AES-256-GCM avec une clé d’appareil stockée dans le coffre sécurisé du système.',
      'Les notes ne sont jamais écrites en clair sur le disque.',
    ],
  },
  {
    title: 'Fichiers chiffrés .ov',
    icon: 'document-lock-outline',
    color: Colors.primary,
    steps: [
      'Dans une conversation, touchez le trombone pour joindre un fichier.',
      'L’app le chiffre et le renomme en ov_xxxxxxxx.ov — nom d’origine, type et contenu sont dans la partie chiffrée.',
      'Le destinataire ouvre le .ov dans iSecure, qui le déchiffre avec la clé commune.',
      'Le fichier déchiffré va dans un dossier temporaire, jamais conservé en clair.',
    ],
  },
  {
    title: 'Envoi/réception par SMS',
    icon: 'phone-portrait-outline',
    color: Colors.primary,
    steps: [
      'iSecure transmet par SMS classique : aucun serveur, aucun compte.',
      'Les messages longs sont automatiquement découpés en plusieurs SMS et réassemblés à l’arrivée.',
      'Pour recevoir en arrière-plan et remplacer l’app SMS du système, définissez iSecure comme application SMS par défaut (Réglages du téléphone).',
    ],
  },
];

export default function HelpScreen() {
  const router = useRouter();
  const [open, setOpen] = useState<number | null>(0);

  function toggle(i: number) {
    LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
    setOpen((cur) => (cur === i ? null : i));
  }

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>Aide & Support</Text>
      </View>

      <ScrollView contentContainerStyle={styles.body}>
        <Text style={styles.intro}>
          Tous les guides pour prendre en main iSecure. Touchez un guide pour le déplier.
        </Text>

        {/* Clé publique / privée — concept de base */}
        <View style={styles.chip}>
          <Ionicons name="key-outline" size={16} color={Colors.primary} />
          <Text style={styles.chipText}>Comment marche le chiffrement</Text>
        </View>
        <Text style={styles.paragraph}>
          Pour les échanges à distance, iSecure combine votre clé privée (jamais transmise) avec la
          clé publique de votre contact pour calculer une clé secrète commune. Les deux téléphones
          obtiennent la même clé sans jamais l’avoir envoyée — c’est pourquoi intercepter la clé
          publique ne sert à rien.
        </Text>

        {/* Accordéon des guides */}
        <View style={styles.chip}>
          <Ionicons name="book-outline" size={16} color={Colors.primary} />
          <Text style={styles.chipText}>Guides pas-à-pas</Text>
        </View>

        {GUIDES.map((g, i) => {
          const expanded = open === i;
          return (
            <View key={g.title} style={styles.guideCard}>
              <TouchableOpacity style={styles.guideRow} activeOpacity={0.7} onPress={() => toggle(i)}>
                <View style={[styles.guideIcon, { backgroundColor: g.color + '22' }]}>
                  <Ionicons name={g.icon as any} size={22} color={g.color} />
                </View>
                <Text style={[styles.guideTitle, { color: g.color, flex: 1 }]}>{g.title}</Text>
                <Ionicons name={expanded ? 'chevron-down' : 'chevron-forward'} size={18} color={Colors.textMuted} />
              </TouchableOpacity>
              {expanded && (
                <View style={styles.guideBody}>
                  {i === 0 && <KeyExchangeDemo />}
                  {g.steps.map((s, k) => (
                    <View key={k} style={styles.stepRow}>
                      <View style={[styles.stepNum, { backgroundColor: g.color }]}>
                        <Text style={styles.stepNumText}>{k + 1}</Text>
                      </View>
                      <Text style={styles.stepText}>{s}</Text>
                    </View>
                  ))}
                </View>
              )}
            </View>
          );
        })}
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.background },
  header: {
    flexDirection: 'row', alignItems: 'center', gap: 14,
    paddingHorizontal: 16, paddingVertical: 14,
    borderBottomWidth: 1, borderBottomColor: Colors.separator,
  },
  title: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  body: { padding: 16, gap: 12, paddingBottom: 40 },
  intro: { fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', lineHeight: 20 },
  chip: {
    flexDirection: 'row', alignItems: 'center', gap: 8,
    backgroundColor: Colors.backgroundSecondary, borderRadius: 20,
    paddingHorizontal: 14, paddingVertical: 8, alignSelf: 'flex-start', marginTop: 8,
  },
  chipText: { fontSize: 14, fontFamily: 'Roboto-Medium', color: Colors.primary },
  paragraph: { fontSize: 14, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', lineHeight: 22 },

  guideCard: {
    backgroundColor: Colors.backgroundSecondary, borderRadius: 14, overflow: 'hidden',
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  guideRow: { flexDirection: 'row', alignItems: 'center', gap: 14, padding: 14 },
  guideIcon: { width: 44, height: 44, borderRadius: 22, alignItems: 'center', justifyContent: 'center' },
  guideTitle: { fontSize: 15, fontFamily: 'Roboto-Bold' },
  guideBody: { paddingHorizontal: 14, paddingBottom: 14, gap: 10 },
  stepRow: { flexDirection: 'row', gap: 10, alignItems: 'flex-start' },
  stepNum: { width: 22, height: 22, borderRadius: 11, alignItems: 'center', justifyContent: 'center', marginTop: 1 },
  stepNumText: { color: '#fff', fontSize: 12, fontFamily: 'Roboto-Bold' },
  stepText: { flex: 1, fontSize: 14, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', lineHeight: 21 },
});
