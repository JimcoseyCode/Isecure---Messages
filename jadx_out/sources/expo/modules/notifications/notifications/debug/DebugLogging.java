package expo.modules.notifications.notifications.debug;

import P8.q;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.messaging.RemoteMessage;
import expo.modules.notifications.notifications.debug.DebugLogging;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.service.NotificationsService;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/notifications/notifications/debug/DebugLogging;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "caller", "Landroid/os/Bundle;", "bundleToLog", "Li7/B;", "logBundle", "(Ljava/lang/String;Landroid/os/Bundle;)V", "ignoredCaller", PointerEventHelper.POINTER_TYPE_UNKNOWN, "indent", "bundleString", "(Ljava/lang/String;Landroid/os/Bundle;I)Ljava/lang/String;", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "logRemoteMessage", "(Ljava/lang/String;Lcom/google/firebase/messaging/RemoteMessage;)V", "Lexpo/modules/notifications/notifications/model/Notification;", NotificationsService.NOTIFICATION_KEY, "logNotification", "(Ljava/lang/String;Lexpo/modules/notifications/notifications/model/Notification;)V", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugLogging {
    public static final DebugLogging INSTANCE = new DebugLogging();

    private DebugLogging() {
    }

    private final String bundleString(final String ignoredCaller, final Bundle bundleToLog, final int indent) {
        final StringBuilder sb = new StringBuilder();
        bundleToLog.keySet().forEach(new Consumer() { // from class: e7.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DebugLogging.bundleString$lambda$1$lambda$0(bundleToLog, sb, indent, ignoredCaller, (String) obj);
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bundleString$lambda$1$lambda$0(Bundle bundle, StringBuilder sb, int i10, String str, String key) {
        String string;
        AbstractC2855l.g(key, "key");
        Object obj = bundle.get(key);
        if (obj instanceof Bundle) {
            sb.append(q.A(" ", i10) + key + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb.append(INSTANCE.bundleString(str, (Bundle) obj, i10 + 2));
            return;
        }
        if (obj == null || (string = obj.toString()) == null) {
            string = "(null)";
        }
        sb.append(q.A(" ", i10) + key + ": " + string + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public static final void logBundle(String caller, Bundle bundleToLog) {
        AbstractC2855l.g(caller, "caller");
        AbstractC2855l.g(bundleToLog, "bundleToLog");
    }

    public final void logNotification(String caller, Notification notification) {
        AbstractC2855l.g(caller, "caller");
        AbstractC2855l.g(notification, "notification");
    }

    public final void logRemoteMessage(String caller, RemoteMessage message) {
        AbstractC2855l.g(caller, "caller");
        AbstractC2855l.g(message, "message");
    }
}
