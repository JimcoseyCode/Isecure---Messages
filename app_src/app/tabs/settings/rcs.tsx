import React from 'react';
import {
  View, Text, ScrollView, TouchableOpacity, StyleSheet, Linking,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';

export default function RcsScreen() {
  const router = useRouter();

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>Recevez tous vos messages</Text>
      </View>

      <ScrollView contentContainerStyle={styles.body}>
        <View style={styles.chip}>
          <Ionicons name="chatbubbles-outline" size={16} color={Colors.primary} />
          <Text style={styles.chipText}>Présentation</Text>
        </View>
        <Text style={styles.paragraph}>
          Si vous avez défini iSecure comme application SMS par défaut, certaines applications de messagerie peuvent continuer à intercepter vos messages via une technologie appelée RCS (Rich Communication Services).
        </Text>

        <View style={styles.chip}>
          <Ionicons name="help-circle-outline" size={16} color={Colors.primary} />
          <Text style={styles.chipText}>Pourquoi est-ce important ?</Text>
        </View>
        <Text style={styles.paragraph}>
          Le RCS est une technologie qui remplace les SMS traditionnels par des messages enrichis via internet. Lorsque le RCS est activé sur votre téléphone, certains messages qui vous sont envoyés peuvent être acheminés par internet au lieu du SMS, empêchant iSecure de les recevoir.
        </Text>

        <View style={styles.chip}>
          <Ionicons name="build-outline" size={16} color={Colors.primary} />
          <Text style={styles.chipText}>Que faire ?</Text>
        </View>
        <Text style={styles.paragraph}>
          Si vous constatez que vous ne recevez pas certains messages dans iSecure, désactivez les "fonctionnalités de chat" ou le "RCS" dans votre ancienne application de messagerie (voir les instructions ci-dessous).
        </Text>

        {/* Google Messages */}
        <View style={styles.appCard}>
          <View style={styles.appCardHeader}>
            <Ionicons name="chatbubble-ellipses" size={20} color={Colors.primary} />
            <Text style={styles.appCardTitle}>Google Messages</Text>
          </View>
          <Text style={styles.appCardDesc}>
            Profil {'>'} Paramètres de l'application Messages {'>'} Chats RCS {'>'} Désactiver "Activer les chats RCS"
          </Text>
          <TouchableOpacity
            style={styles.openBtn}
            onPress={() => Linking.openURL('sms:')}
          >
            <Ionicons name="open-outline" size={16} color={Colors.textWhite} />
            <Text style={styles.openBtnText}>Ouvrir Google Messages</Text>
          </TouchableOpacity>
        </View>

        {/* Samsung Messages */}
        <View style={styles.appCard}>
          <View style={styles.appCardHeader}>
            <Ionicons name="chatbubble" size={20} color={Colors.primary} />
            <Text style={styles.appCardTitle}>Samsung Messages</Text>
          </View>
          <Text style={styles.appCardDesc}>
            Paramètres {'>'} Paramètres de chat {'>'} Désactiver les fonctionnalités de chat
          </Text>
          <TouchableOpacity
            style={styles.openBtn}
            onPress={() => Linking.openURL('sms:')}
          >
            <Ionicons name="open-outline" size={16} color={Colors.textWhite} />
            <Text style={styles.openBtnText}>Ouvrir Samsung Messages</Text>
          </TouchableOpacity>
        </View>

        {/* Warning */}
        <View style={styles.warningBox}>
          <Ionicons name="warning-outline" size={18} color="#E67E22" />
          <Text style={styles.warningText}>
            Important : après un changement d'application SMS par défaut, votre numéro peut rester associé au RCS pendant 30 jours. Pendant cette période, certains correspondants pourraient vous envoyer des messages via internet au lieu de SMS. Pour éviter cela, désactivez les fonctionnalités de chat dans votre ancienne application de messagerie.
          </Text>
        </View>

        <View style={styles.noteBox}>
          <Ionicons name="bulb-outline" size={16} color={Colors.textMuted} />
          <Text style={styles.noteText}>
            Tous les appareils ne sont pas concernés. Si vous ne trouvez pas l'option RCS ou fonctionnalités de chat dans votre application de messagerie, cela signifie que le RCS n'est pas activé sur votre appareil et aucune action n'est nécessaire.
          </Text>
        </View>
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
  title: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, flex: 1 },
  body: { padding: 16, gap: 14 },
  chip: {
    flexDirection: 'row', alignItems: 'center', gap: 8,
    backgroundColor: Colors.backgroundSecondary, borderRadius: 20,
    paddingHorizontal: 14, paddingVertical: 8, alignSelf: 'flex-start',
  },
  chipText: { fontSize: 14, fontFamily: 'Roboto-Medium', color: Colors.primary },
  paragraph: { fontSize: 14, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', lineHeight: 22 },
  appCard: {
    backgroundColor: Colors.backgroundSecondary, borderRadius: 14, padding: 16, gap: 10,
  },
  appCardHeader: { flexDirection: 'row', alignItems: 'center', gap: 10 },
  appCardTitle: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  appCardDesc: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', lineHeight: 18 },
  openBtn: {
    backgroundColor: Colors.primary, borderRadius: 10,
    paddingVertical: 12, flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: 8,
  },
  openBtnText: { color: Colors.textWhite, fontFamily: 'Roboto-Medium', fontSize: 14 },
  warningBox: {
    flexDirection: 'row', gap: 10, alignItems: 'flex-start',
    backgroundColor: '#FFF3E0', borderRadius: 12, padding: 14,
  },
  warningText: { flex: 1, fontSize: 13, color: '#E67E22', fontFamily: 'Roboto-Regular', lineHeight: 18 },
  noteBox: {
    flexDirection: 'row', gap: 10, alignItems: 'flex-start',
    backgroundColor: Colors.backgroundSecondary, borderRadius: 10, padding: 12,
  },
  noteText: { flex: 1, fontSize: 12, color: Colors.textMuted, fontFamily: 'Roboto-Regular', lineHeight: 18 },
});
