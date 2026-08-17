import { Stack } from 'expo-router';

// Nests the discussions screens under one Stack so the parent Tabs shows a
// single "Messages" tab instead of one tab per nested screen.
export default function DiscussionsLayout() {
  return <Stack screenOptions={{ headerShown: false }} />;
}
