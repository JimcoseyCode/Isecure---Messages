import React, { useState, useEffect, useCallback } from 'react';
import {
  View, Text, FlatList, TouchableOpacity, StyleSheet, } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import { SearchBar } from '@/components/ui/SearchBar';
import { Avatar } from '@/components/ui/Avatar';
import { getContacts, Contact } from '@/lib/database/db';
import { FadeSlideIn } from '@/components/ui/Motion';

export default function NewMessageModal() {
  const router = useRouter();
  const [contacts, setContacts] = useState<Contact[]>([]);
  const [search, setSearch] = useState('');

  useEffect(() => {
    getContacts().then(setContacts);
  }, []);

  const filtered = contacts.filter((c) =>
    c.name.toLowerCase().includes(search.toLowerCase()) || c.phone.includes(search)
  );

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>{S.newMessage}</Text>
      </View>

      <SearchBar placeholder={S.searchContact} value={search} onChangeText={setSearch} />

      <FadeSlideIn style={{ flex: 1 }}>
      <FlatList
        data={filtered}
        keyExtractor={(item) => String(item.id)}
        renderItem={({ item }) => (
          <TouchableOpacity
            style={styles.contactItem}
            onPress={() => {
              router.back();
              router.push(`/tabs/discussions/${item.id}`);
            }}
            activeOpacity={0.7}
          >
            <Avatar name={item.name} size={48} filled />
            <View style={styles.contactContent}>
              <Text style={styles.contactName}>{item.name}</Text>
              <Text style={styles.contactPhone}>{item.phone}</Text>
            </View>
          </TouchableOpacity>
        )}
        ItemSeparatorComponent={() => <View style={styles.separator} />}
      />
      </FadeSlideIn>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.background },
  header: {
    flexDirection: 'row', alignItems: 'center',
    paddingHorizontal: 16, paddingVertical: 14, gap: 14,
    borderBottomWidth: 1, borderBottomColor: Colors.separator,
  },
  title: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  contactItem: {
    flexDirection: 'row', alignItems: 'center',
    paddingHorizontal: 16, paddingVertical: 12,
  },
  contactContent: { flex: 1, marginLeft: 14 },
  contactName: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  contactPhone: { fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular' },
  separator: { height: 1, backgroundColor: Colors.separator, marginLeft: 78 },
});
