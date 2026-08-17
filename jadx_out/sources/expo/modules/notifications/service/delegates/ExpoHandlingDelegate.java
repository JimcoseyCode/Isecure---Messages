package expo.modules.notifications.service.delegates;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.E;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.NotificationManager;
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.service.NotificationForwarderActivity;
import expo.modules.notifications.service.NotificationsService;
import expo.modules.notifications.service.delegates.FirebaseMessagingDelegate;
import expo.modules.notifications.service.interfaces.HandlingDelegate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/notifications/service/delegates/ExpoHandlingDelegate;", "Lexpo/modules/notifications/service/interfaces/HandlingDelegate;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lexpo/modules/notifications/notifications/model/Notification;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldPresent", "(Lexpo/modules/notifications/notifications/model/Notification;)Z", "isAppInForeground", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/notifications/NotificationManager;", "getListeners", "()Ljava/util/List;", NotificationsService.NOTIFICATION_KEY, "Li7/B;", "handleNotification", "(Lexpo/modules/notifications/notifications/model/Notification;)V", "Lexpo/modules/notifications/notifications/model/NotificationResponse;", NotificationsService.NOTIFICATION_RESPONSE_KEY, "handleNotificationResponse", "(Lexpo/modules/notifications/notifications/model/NotificationResponse;)V", "handleNotificationsDropped", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoHandlingDelegate implements HandlingDelegate {
    public static final String OPEN_APP_INTENT_ACTION = "expo.modules.notifications.OPEN_APP_ACTION";
    private final Context context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Collection<NotificationResponse> sPendingNotificationResponses = new ArrayList();
    private static WeakHashMap<NotificationManager, WeakReference<NotificationManager>> sListenersReferences = new WeakHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR4\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001f0\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lexpo/modules/notifications/service/delegates/ExpoHandlingDelegate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "getNotificationActionLauncher", "(Landroid/content/Context;)Landroid/content/Intent;", "getMainActivityLauncher", "Lexpo/modules/notifications/notifications/NotificationManager;", "listener", "Li7/B;", "addListener", "(Lexpo/modules/notifications/notifications/NotificationManager;)V", "broadcastIntent", "Landroid/app/PendingIntent;", "createPendingIntentForOpeningApp", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;", "Lexpo/modules/notifications/notifications/model/NotificationResponse;", NotificationsService.NOTIFICATION_RESPONSE_KEY, "openAppToForeground", "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/NotificationResponse;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sPendingNotificationResponses", "Ljava/util/Collection;", "getSPendingNotificationResponses", "()Ljava/util/Collection;", "setSPendingNotificationResponses", "(Ljava/util/Collection;)V", "Ljava/util/WeakHashMap;", "Ljava/lang/ref/WeakReference;", "sListenersReferences", "Ljava/util/WeakHashMap;", "getSListenersReferences", "()Ljava/util/WeakHashMap;", "setSListenersReferences", "(Ljava/util/WeakHashMap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "OPEN_APP_INTENT_ACTION", "Ljava/lang/String;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent getMainActivityLauncher(Context context) {
            return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        }

        private final Intent getNotificationActionLauncher(Context context) {
            Intent intent = new Intent(ExpoHandlingDelegate.OPEN_APP_INTENT_ACTION);
            intent.addFlags(268435456);
            intent.setPackage(context.getApplicationContext().getPackageName());
            if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                return intent;
            }
            return null;
        }

        public final void addListener(NotificationManager listener) {
            AbstractC2855l.g(listener, "listener");
            if (getSListenersReferences().containsKey(listener)) {
                return;
            }
            getSListenersReferences().put(listener, new WeakReference<>(listener));
            Iterator<NotificationResponse> it = getSPendingNotificationResponses().iterator();
            while (it.hasNext()) {
                listener.onNotificationResponseReceived(it.next());
                it.remove();
            }
        }

        public final PendingIntent createPendingIntentForOpeningApp(Context context, Intent broadcastIntent) {
            String className;
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(broadcastIntent, "broadcastIntent");
            int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
            Intent intent = new Intent(context, (Class<?>) NotificationForwarderActivity.class);
            intent.setData(broadcastIntent.getData());
            intent.setFlags(402653184);
            intent.putExtras(broadcastIntent);
            ComponentName component = broadcastIntent.getComponent();
            PendingIntent activity = PendingIntent.getActivity(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10);
            AbstractC2855l.f(activity, "getActivity(...)");
            return activity;
        }

        protected final WeakHashMap<NotificationManager, WeakReference<NotificationManager>> getSListenersReferences() {
            return ExpoHandlingDelegate.sListenersReferences;
        }

        protected final Collection<NotificationResponse> getSPendingNotificationResponses() {
            return ExpoHandlingDelegate.sPendingNotificationResponses;
        }

        public final void openAppToForeground(Context context, NotificationResponse notificationResponse) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(notificationResponse, "notificationResponse");
            Intent notificationActionLauncher = getNotificationActionLauncher(context);
            if (notificationActionLauncher == null) {
                notificationActionLauncher = getMainActivityLauncher(context);
            }
            if (notificationActionLauncher != null) {
                NotificationsService.INSTANCE.setNotificationResponseToIntent(notificationActionLauncher, notificationResponse);
                context.startActivity(notificationActionLauncher);
            }
        }

        protected final void setSListenersReferences(WeakHashMap<NotificationManager, WeakReference<NotificationManager>> weakHashMap) {
            AbstractC2855l.g(weakHashMap, "<set-?>");
            ExpoHandlingDelegate.sListenersReferences = weakHashMap;
        }

        protected final void setSPendingNotificationResponses(Collection<NotificationResponse> collection) {
            AbstractC2855l.g(collection, "<set-?>");
            ExpoHandlingDelegate.sPendingNotificationResponses = collection;
        }

        private Companion() {
        }
    }

    public ExpoHandlingDelegate(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
    }

    private final boolean shouldPresent(Notification notification) {
        String title = notification.getNotificationRequest().getContent().getTitle();
        if (title != null && title.length() != 0) {
            return true;
        }
        String text = notification.getNotificationRequest().getContent().getText();
        return (text == null || text.length() == 0) ? false : true;
    }

    protected final Context getContext() {
        return this.context;
    }

    public final List<NotificationManager> getListeners() {
        Collection<WeakReference<NotificationManager>> collectionValues = sListenersReferences.values();
        AbstractC2855l.f(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            NotificationManager notificationManager = (NotificationManager) ((WeakReference) it.next()).get();
            if (notificationManager != null) {
                arrayList.add(notificationManager);
            }
        }
        return arrayList;
    }

    @Override // expo.modules.notifications.service.interfaces.HandlingDelegate
    public void handleNotification(Notification notification) {
        AbstractC2855l.g(notification, "notification");
        if (isAppInForeground()) {
            Iterator<T> it = getListeners().iterator();
            while (it.hasNext()) {
                ((NotificationManager) it.next()).onNotificationReceived(notification);
            }
        } else if (shouldPresent(notification)) {
            NotificationsService.Companion.present$default(NotificationsService.INSTANCE, this.context, notification, null, null, 12, null);
        }
    }

    @Override // expo.modules.notifications.service.interfaces.HandlingDelegate
    public void handleNotificationResponse(NotificationResponse notificationResponse) {
        AbstractC2855l.g(notificationResponse, "notificationResponse");
        if (notificationResponse.getAction().opensAppToForeground()) {
            INSTANCE.openAppToForeground(this.context, notificationResponse);
        }
        if (!isAppInForeground() && !AbstractC2855l.b(notificationResponse.getActionIdentifier(), NotificationResponse.DEFAULT_ACTION_IDENTIFIER)) {
            FirebaseMessagingDelegate.Companion companion = FirebaseMessagingDelegate.INSTANCE;
            Context applicationContext = this.context.getApplicationContext();
            AbstractC2855l.f(applicationContext, "getApplicationContext(...)");
            Bundle bundle = NotificationSerializer.toBundle(notificationResponse);
            AbstractC2855l.f(bundle, "toBundle(...)");
            companion.runTaskManagerTasks(applicationContext, bundle);
        }
        List<NotificationManager> listeners = getListeners();
        if (listeners.isEmpty()) {
            sPendingNotificationResponses.add(notificationResponse);
            return;
        }
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((NotificationManager) it.next()).onNotificationResponseReceived(notificationResponse);
        }
    }

    @Override // expo.modules.notifications.service.interfaces.HandlingDelegate
    public void handleNotificationsDropped() {
        Iterator<T> it = getListeners().iterator();
        while (it.hasNext()) {
            ((NotificationManager) it.next()).onNotificationsDropped();
        }
    }

    public final boolean isAppInForeground() {
        return E.f17519o.a().getLifecycle().b().j(AbstractC1764k.b.f17594k);
    }
}
