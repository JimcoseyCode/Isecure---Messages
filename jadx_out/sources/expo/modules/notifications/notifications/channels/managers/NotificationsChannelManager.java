package expo.modules.notifications.notifications.channels.managers;

import android.app.NotificationChannel;
import expo.modules.core.arguments.ReadableArguments;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface NotificationsChannelManager {
    NotificationChannel createNotificationChannel(String str, CharSequence charSequence, int i10, ReadableArguments readableArguments);

    boolean customSoundExists(ReadableArguments readableArguments);

    void deleteNotificationChannel(String str);

    NotificationChannel getNotificationChannel(String str);

    List<NotificationChannel> getNotificationChannels();
}
