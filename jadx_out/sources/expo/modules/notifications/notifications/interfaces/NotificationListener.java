package expo.modules.notifications.notifications.interfaces;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/notifications/notifications/interfaces/NotificationListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "Li7/B;", "onNotificationReceived", "(Lexpo/modules/notifications/notifications/model/Notification;)V", "Lexpo/modules/notifications/notifications/model/NotificationResponse;", "response", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onNotificationResponseReceived", "(Lexpo/modules/notifications/notifications/model/NotificationResponse;)Z", "Landroid/os/Bundle;", "extras", "onNotificationResponseIntentReceived", "(Landroid/os/Bundle;)V", "onNotificationsDropped", "()V", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NotificationListener {
    void onNotificationReceived(Notification notification);

    void onNotificationResponseIntentReceived(Bundle extras);

    boolean onNotificationResponseReceived(NotificationResponse response);

    void onNotificationsDropped();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onNotificationReceived(NotificationListener notificationListener, Notification notification) {
            AbstractC2855l.g(notification, "notification");
        }

        public static void onNotificationResponseIntentReceived(NotificationListener notificationListener, Bundle extras) {
            AbstractC2855l.g(extras, "extras");
        }

        public static boolean onNotificationResponseReceived(NotificationListener notificationListener, NotificationResponse response) {
            AbstractC2855l.g(response, "response");
            return false;
        }

        public static void onNotificationsDropped(NotificationListener notificationListener) {
        }
    }
}
