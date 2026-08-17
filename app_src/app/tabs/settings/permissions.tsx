import React from 'react';
import {
  View, Text, ScrollView, TouchableOpacity, StyleSheet, Linking, Platform,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';

interface Permission {
  icon: string;
  title: string;
  description: string;
  status: 'granted' | 'denied' | 'not_requested';
  settingsKey?: string;
}

const PERMISSIONS: Permission[] = [
  {
    icon: 'chatbubble-outline',
    title: 'App SMS par défaut',
    description: 'Nécessaire pour qu\'iSecure puisse recevoir et envoyer les SMS, gérer vos conversations et afficher les notifications.',
    status: 'not_requested',
  },
  {
    icon: 'mail-outline',
    title: 'Accès aux SMS',
    description: 'Nécessaire pour lire, envoyer et recevoir les SMS à votre place.',
    status: 'granted',
  },
  {
    icon: 'notifications-outline',
    title: 'Notifications',
    description: 'Nécessaire pour vous prévenir à la réception d\'un nouveau message, même lorsque l\'application n\'est pas ouverte.',
    status: 'granted',
  },
  {
    icon: 'people-outline',
    title: 'Contacts',
    description: 'Utilisée pour afficher le nom de vos contacts dans les conversations et faciliter le pairing. Aucun contact n\'est envoyé sur un serveur.',
    status: 'granted',
  },
  {
    icon: 'camera-outline',
    title: 'Caméra',
    description: 'Utilisée pour prendre des photos et vidéos à envoyer dans une conversation et pour scanner les QR codes de pairing.',
    status: 'not_requested',
  },
  {
    icon: 'folder-outline',
    title: 'Stockage',
    description: 'Nécessaire pour accéder aux fichiers à chiffrer et sauvegarder les fichiers déchiffrés.',
    status: 'granted',
  },
];

const statusLabel: Record<Permission['status'], string> = {
  granted: 'Autorisé',
  denied: 'Refusé',
  not_requested: 'Non demandé',
};

const statusColor: Record<Permission['status'], string> = {
  granted: Colors.success,
  denied: Colors.error,
  not_requested: Colors.warning,
};

export default function PermissionsScreen() {
  const router = useRouter();

  function openSettings() {
    if (Platform.OS === 'android') {
      Linking.openSettings();
    }
  }

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>Permissions</Text>
      </View>

      <ScrollView contentContainerStyle={styles.body}>
        <Text style={styles.intro}>
          Retrouvez ici toutes les permissions utilisées par iSecure. Vous pouvez consulter leur état et les autoriser lorsque nécessaire. Une permission refusée peut être réactivée depuis les paramètres de votre téléphone.
        </Text>

        {PERMISSIONS.map((perm) => (
          <View key={perm.title} style={styles.permRow}>
            <Ionicons name={perm.icon as any} size={26} color={Colors.primary} style={styles.permIcon} />
            <View style={styles.permContent}>
              <Text style={styles.permTitle}>{perm.title}</Text>
              <Text style={styles.permDesc}>{perm.description}</Text>
              <View style={[styles.badge, { backgroundColor: statusColor[perm.status] + '22' }]}>
                <Text style={[styles.badgeText, { color: statusColor[perm.status] }]}>
                  {statusLabel[perm.status]}
                </Text>
              </View>
              {perm.status === 'not_requested' && (
                <TouchableOpacity style={styles.authorizeBtn} onPress={openSettings}>
                  <Text style={styles.authorizeBtnText}>Autoriser</Text>
                </TouchableOpacity>
              )}
            </View>
          </View>
        ))}
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
  body: { padding: 16, gap: 0 },
  intro: {
    fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular',
    lineHeight: 20, marginBottom: 20,
  },
  permRow: {
    flexDirection: 'row', paddingVertical: 16, gap: 14,
    borderBottomWidth: 1, borderBottomColor: Colors.separator,
  },
  permIcon: { marginTop: 2 },
  permContent: { flex: 1, gap: 6 },
  permTitle: { fontSize: 15, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  permDesc: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', lineHeight: 18 },
  badge: { alignSelf: 'flex-start', borderRadius: 20, paddingHorizontal: 12, paddingVertical: 4 },
  badgeText: { fontSize: 12, fontFamily: 'Roboto-Medium' },
  authorizeBtn: {
    backgroundColor: Colors.primary, borderRadius: 20,
    paddingHorizontal: 20, paddingVertical: 8, alignSelf: 'flex-start',
  },
  authorizeBtnText: { color: Colors.textWhite, fontFamily: 'Roboto-Medium', fontSize: 13 },
});
