import { Tabs } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { StyleSheet } from 'react-native';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import { GlassView } from '@/components/ui/Glass';
import { FLOATING_TAB_BAR_STYLE, TAB_BAR_INSET } from '@/constants/tabBarStyle';

export default function TabsLayout() {
  return (
    <Tabs
      screenOptions={{
        headerShown: false,
        tabBarActiveTintColor: Colors.tabBarActive,
        tabBarInactiveTintColor: Colors.tabBarInactive,
        // Floating "Liquid Glass" pill that content scrolls beneath.
        tabBarStyle: FLOATING_TAB_BAR_STYLE,
        // Visible pill inset from the edges so it floats, centred, never edge-hugging.
        tabBarBackground: () => (
          <GlassView
            radius={31}
            intensity={75}
            style={{ position: 'absolute', left: TAB_BAR_INSET, right: TAB_BAR_INSET, top: 0, bottom: 0 }}
          />
        ),
        tabBarLabelStyle: {
          fontSize: 11,
          fontFamily: 'Roboto-Medium',
        },
      }}
    >
      <Tabs.Screen
        name="discussions"
        options={{
          title: S.tabMessages,
          tabBarIcon: ({ color, focused }) => (
            <Ionicons name={focused ? 'chatbubbles' : 'chatbubbles-outline'} size={24} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="contacts"
        options={{
          title: S.tabContacts,
          tabBarIcon: ({ color, focused }) => (
            <Ionicons name={focused ? 'people' : 'people-outline'} size={24} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="settings"
        options={{
          title: S.tabSettings,
          tabBarIcon: ({ color, focused }) => (
            <Ionicons name={focused ? 'settings' : 'settings-outline'} size={24} color={color} />
          ),
        }}
      />
    </Tabs>
  );
}
