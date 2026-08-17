package expo.modules.notifications.service.interfaces;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.service.NotificationsService;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, d2 = {"Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "setupScheduledNotifications", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "getAllScheduledNotifications", "()Ljava/util/Collection;", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIER_KEY, "getScheduledNotification", "(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationRequest;", "request", "scheduleNotification", "(Lexpo/modules/notifications/notifications/model/NotificationRequest;)V", "triggerNotification", "(Ljava/lang/String;)V", NotificationsService.IDENTIFIERS_KEY, "removeScheduledNotifications", "(Ljava/util/Collection;)V", "removeAllScheduledNotifications", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SchedulingDelegate {
    Collection<NotificationRequest> getAllScheduledNotifications();

    NotificationRequest getScheduledNotification(String identifier);

    void removeAllScheduledNotifications();

    void removeScheduledNotifications(Collection<String> identifiers);

    void scheduleNotification(NotificationRequest request);

    void setupScheduledNotifications();

    void triggerNotification(String identifier);
}
