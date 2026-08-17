package expo.modules.notifications.service.interfaces;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.service.NotificationsService;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/notifications/service/interfaces/PresentationDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;", "behavior", "Li7/B;", "presentNotification", "(Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAllPresentedNotifications", "()Ljava/util/Collection;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIERS_KEY, "dismissNotifications", "(Ljava/util/Collection;)V", "dismissAllNotifications", "()V", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PresentationDelegate {
    void dismissAllNotifications();

    void dismissNotifications(Collection<String> identifiers);

    Collection<Notification> getAllPresentedNotifications();

    void presentNotification(Notification notification, NotificationBehaviorRecord behavior);
}
