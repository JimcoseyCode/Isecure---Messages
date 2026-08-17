package expo.modules.notifications.service.delegates;

import android.content.Context;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.messaging.RemoteMessage;
import expo.modules.interfaces.taskManager.TaskServiceProviderHelper;
import expo.modules.notifications.notifications.RemoteMessageSerializer;
import expo.modules.notifications.notifications.background.BackgroundRemoteNotificationTaskConsumer;
import expo.modules.notifications.notifications.debug.DebugLogging;
import expo.modules.notifications.notifications.interfaces.INotificationContent;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.model.RemoteNotificationContent;
import expo.modules.notifications.notifications.model.triggers.FirebaseNotificationTrigger;
import expo.modules.notifications.service.NotificationsService;
import expo.modules.notifications.tokens.interfaces.FirebaseTokenListener;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate;", "Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "token", "Li7/B;", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Lexpo/modules/notifications/notifications/model/Notification;", "createNotification", "(Lcom/google/firebase/messaging/RemoteMessage;)Lexpo/modules/notifications/notifications/model/Notification;", "getNotificationIdentifier", "(Lcom/google/firebase/messaging/RemoteMessage;)Ljava/lang/String;", NotificationsService.IDENTIFIER_KEY, "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;", "content", "Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;", "notificationTrigger", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "createNotificationRequest", "(Ljava/lang/String;Lexpo/modules/notifications/notifications/interfaces/INotificationContent;Lexpo/modules/notifications/notifications/model/triggers/FirebaseNotificationTrigger;)Lexpo/modules/notifications/notifications/model/NotificationRequest;", "onDeletedMessages", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FirebaseMessagingDelegate implements expo.modules.notifications.service.interfaces.FirebaseMessagingDelegate {
    private static String sLastToken;
    private final Context context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashSet<FirebaseTokenListener> sTokenListenersReferences = new HashSet<>();
    private static Set<BackgroundRemoteNotificationTaskConsumer> sBackgroundTaskConsumers = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lexpo/modules/notifications/service/delegates/FirebaseMessagingDelegate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;", "listener", "Li7/B;", "addTokenListener", "(Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "removeTokenListener", "(Lexpo/modules/notifications/tokens/interfaces/FirebaseTokenListener;)Z", "Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;", "taskConsumer", "addBackgroundTaskConsumer", "(Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;)V", "removeBackgroundTaskConsumer", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getBackgroundTasks", "()Ljava/util/List;", "Landroid/content/Context;", "applicationContext", "Landroid/os/Bundle;", "bundle", "runTaskManagerTasks", "(Landroid/content/Context;Landroid/os/Bundle;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sLastToken", "Ljava/lang/String;", "getSLastToken", "()Ljava/lang/String;", "setSLastToken", "(Ljava/lang/String;)V", "Ljava/util/HashSet;", "sTokenListenersReferences", "Ljava/util/HashSet;", "getSTokenListenersReferences", "()Ljava/util/HashSet;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sBackgroundTaskConsumers", "Ljava/util/Set;", "getSBackgroundTaskConsumers", "()Ljava/util/Set;", "setSBackgroundTaskConsumers", "(Ljava/util/Set;)V", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addBackgroundTaskConsumer(BackgroundRemoteNotificationTaskConsumer taskConsumer) {
            AbstractC2855l.g(taskConsumer, "taskConsumer");
            getSBackgroundTaskConsumers().add(taskConsumer);
        }

        public final void addTokenListener(FirebaseTokenListener listener) {
            AbstractC2855l.g(listener, "listener");
            synchronized (getSTokenListenersReferences()) {
                try {
                    Companion companion = FirebaseMessagingDelegate.INSTANCE;
                    if (!companion.getSTokenListenersReferences().contains(listener)) {
                        companion.getSTokenListenersReferences().add(listener);
                        String sLastToken = companion.getSLastToken();
                        if (sLastToken != null) {
                            listener.onNewToken(sLastToken);
                        }
                    }
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final List<BackgroundRemoteNotificationTaskConsumer> getBackgroundTasks() {
            return AbstractC2800q.P0(getSBackgroundTaskConsumers());
        }

        protected final Set<BackgroundRemoteNotificationTaskConsumer> getSBackgroundTaskConsumers() {
            return FirebaseMessagingDelegate.sBackgroundTaskConsumers;
        }

        protected final String getSLastToken() {
            return FirebaseMessagingDelegate.sLastToken;
        }

        protected final HashSet<FirebaseTokenListener> getSTokenListenersReferences() {
            return FirebaseMessagingDelegate.sTokenListenersReferences;
        }

        public final void removeBackgroundTaskConsumer(BackgroundRemoteNotificationTaskConsumer taskConsumer) {
            AbstractC2855l.g(taskConsumer, "taskConsumer");
            getSBackgroundTaskConsumers().remove(taskConsumer);
        }

        public final boolean removeTokenListener(FirebaseTokenListener listener) {
            boolean zRemove;
            AbstractC2855l.g(listener, "listener");
            synchronized (getSTokenListenersReferences()) {
                zRemove = FirebaseMessagingDelegate.INSTANCE.getSTokenListenersReferences().remove(listener);
            }
            return zRemove;
        }

        public final void runTaskManagerTasks(Context applicationContext, Bundle bundle) {
            AbstractC2855l.g(applicationContext, "applicationContext");
            AbstractC2855l.g(bundle, "bundle");
            TaskServiceProviderHelper.INSTANCE.getTaskServiceImpl(applicationContext);
            Iterator<T> it = getBackgroundTasks().iterator();
            while (it.hasNext()) {
                ((BackgroundRemoteNotificationTaskConsumer) it.next()).executeTask(bundle);
            }
        }

        protected final void setSBackgroundTaskConsumers(Set<BackgroundRemoteNotificationTaskConsumer> set) {
            AbstractC2855l.g(set, "<set-?>");
            FirebaseMessagingDelegate.sBackgroundTaskConsumers = set;
        }

        protected final void setSLastToken(String str) {
            FirebaseMessagingDelegate.sLastToken = str;
        }

        private Companion() {
        }
    }

    public FirebaseMessagingDelegate(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
    }

    public static final void addTokenListener(FirebaseTokenListener firebaseTokenListener) {
        INSTANCE.addTokenListener(firebaseTokenListener);
    }

    public static final boolean removeTokenListener(FirebaseTokenListener firebaseTokenListener) {
        return INSTANCE.removeTokenListener(firebaseTokenListener);
    }

    protected final Notification createNotification(RemoteMessage remoteMessage) {
        AbstractC2855l.g(remoteMessage, "remoteMessage");
        return new Notification(createNotificationRequest(getNotificationIdentifier(remoteMessage), new RemoteNotificationContent(remoteMessage), new FirebaseNotificationTrigger(remoteMessage)), new Date(remoteMessage.J0()));
    }

    protected NotificationRequest createNotificationRequest(String identifier, INotificationContent content, FirebaseNotificationTrigger notificationTrigger) {
        AbstractC2855l.g(identifier, "identifier");
        AbstractC2855l.g(content, "content");
        AbstractC2855l.g(notificationTrigger, "notificationTrigger");
        return new NotificationRequest(identifier, content, notificationTrigger);
    }

    protected final Context getContext() {
        return this.context;
    }

    protected final String getNotificationIdentifier(RemoteMessage remoteMessage) {
        AbstractC2855l.g(remoteMessage, "remoteMessage");
        String str = (String) remoteMessage.s().get("tag");
        if (str != null) {
            return str;
        }
        String strK0 = remoteMessage.k0();
        if (strK0 != null) {
            return strK0;
        }
        String string = UUID.randomUUID().toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    @Override // expo.modules.notifications.service.interfaces.FirebaseMessagingDelegate
    public void onDeletedMessages() {
        NotificationsService.INSTANCE.handleDropped(this.context);
    }

    @Override // expo.modules.notifications.service.interfaces.FirebaseMessagingDelegate
    public void onMessageReceived(RemoteMessage remoteMessage) {
        AbstractC2855l.g(remoteMessage, "remoteMessage");
        DebugLogging debugLogging = DebugLogging.INSTANCE;
        debugLogging.logRemoteMessage("FirebaseMessagingDelegate.onMessageReceived: message", remoteMessage);
        Notification notificationCreateNotification = createNotification(remoteMessage);
        debugLogging.logNotification("FirebaseMessagingDelegate.onMessageReceived: notification", notificationCreateNotification);
        NotificationsService.Companion.receive$default(NotificationsService.INSTANCE, this.context, notificationCreateNotification, null, 4, null);
        Companion companion = INSTANCE;
        Context applicationContext = this.context.getApplicationContext();
        AbstractC2855l.f(applicationContext, "getApplicationContext(...)");
        Bundle bundle = RemoteMessageSerializer.toBundle(remoteMessage);
        AbstractC2855l.f(bundle, "toBundle(...)");
        companion.runTaskManagerTasks(applicationContext, bundle);
    }

    @Override // expo.modules.notifications.service.interfaces.FirebaseMessagingDelegate
    public void onNewToken(String token) {
        AbstractC2855l.g(token, "token");
        Iterator<FirebaseTokenListener> it = sTokenListenersReferences.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            FirebaseTokenListener next = it.next();
            AbstractC2855l.f(next, "next(...)");
            next.onNewToken(token);
        }
        sLastToken = token;
    }
}
