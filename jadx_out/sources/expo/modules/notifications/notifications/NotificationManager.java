package expo.modules.notifications.notifications;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.interfaces.NotificationListener;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.service.NotificationsService;
import expo.modules.notifications.service.delegates.ExpoHandlingDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/notifications/notifications/NotificationManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/notifications/notifications/interfaces/NotificationListener;", "listener", "Li7/B;", "addListener", "(Lexpo/modules/notifications/notifications/interfaces/NotificationListener;)V", "removeListener", "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "onNotificationReceived", "(Lexpo/modules/notifications/notifications/model/Notification;)V", "Lexpo/modules/notifications/notifications/model/NotificationResponse;", "response", "onNotificationResponseReceived", "(Lexpo/modules/notifications/notifications/model/NotificationResponse;)V", "onNotificationsDropped", "Landroid/os/Bundle;", "extras", "onNotificationResponseFromExtras", "(Landroid/os/Bundle;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "listeners", "Ljava/util/Set;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pendingNotificationResponses", "Ljava/util/List;", "pendingNotificationResponsesFromExtras", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationManager {
    public static final NotificationManager INSTANCE;
    private static final Set<NotificationListener> listeners;
    private static final List<NotificationResponse> pendingNotificationResponses;
    private static final List<Bundle> pendingNotificationResponsesFromExtras;

    static {
        NotificationManager notificationManager = new NotificationManager();
        INSTANCE = notificationManager;
        listeners = new LinkedHashSet();
        pendingNotificationResponses = new ArrayList();
        pendingNotificationResponsesFromExtras = new ArrayList();
        ExpoHandlingDelegate.INSTANCE.addListener(notificationManager);
    }

    private NotificationManager() {
    }

    public final void addListener(NotificationListener listener) {
        AbstractC2855l.g(listener, "listener");
        Set<NotificationListener> set = listeners;
        if (set.contains(listener)) {
            return;
        }
        set.add(listener);
        List<NotificationResponse> list = pendingNotificationResponses;
        if (!list.isEmpty()) {
            Iterator<NotificationResponse> it = list.iterator();
            while (it.hasNext()) {
                listener.onNotificationResponseReceived(it.next());
            }
        }
        List<Bundle> list2 = pendingNotificationResponsesFromExtras;
        if (list2.isEmpty()) {
            return;
        }
        Iterator<Bundle> it2 = list2.iterator();
        while (it2.hasNext()) {
            listener.onNotificationResponseIntentReceived(it2.next());
        }
    }

    public final void onNotificationReceived(Notification notification) {
        AbstractC2855l.g(notification, "notification");
        Iterator<NotificationListener> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().onNotificationReceived(notification);
        }
    }

    public final void onNotificationResponseFromExtras(Bundle extras) {
        AbstractC2855l.g(extras, "extras");
        Set<NotificationListener> set = listeners;
        if (!set.isEmpty()) {
            Iterator<NotificationListener> it = set.iterator();
            while (it.hasNext()) {
                it.next().onNotificationResponseIntentReceived(extras);
            }
        } else {
            List<Bundle> list = pendingNotificationResponsesFromExtras;
            if (list.isEmpty()) {
                list.add(extras);
            }
        }
    }

    public final void onNotificationResponseReceived(NotificationResponse response) {
        AbstractC2855l.g(response, "response");
        Set<NotificationListener> set = listeners;
        if (set.isEmpty()) {
            pendingNotificationResponses.add(response);
            return;
        }
        Iterator<NotificationListener> it = set.iterator();
        while (it.hasNext()) {
            it.next().onNotificationResponseReceived(response);
        }
    }

    public final void onNotificationsDropped() {
        Iterator<NotificationListener> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().onNotificationsDropped();
        }
    }

    public final void removeListener(NotificationListener listener) {
        AbstractC2855l.g(listener, "listener");
        listeners.remove(listener);
    }
}
