package expo.modules.notifications.service.interfaces;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/notifications/service/interfaces/HandlingDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "Li7/B;", "handleNotification", "(Lexpo/modules/notifications/notifications/model/Notification;)V", "Lexpo/modules/notifications/notifications/model/NotificationResponse;", NotificationsService.NOTIFICATION_RESPONSE_KEY, "handleNotificationResponse", "(Lexpo/modules/notifications/notifications/model/NotificationResponse;)V", "handleNotificationsDropped", "()V", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface HandlingDelegate {
    void handleNotification(Notification notification);

    void handleNotificationResponse(NotificationResponse notificationResponse);

    void handleNotificationsDropped();
}
