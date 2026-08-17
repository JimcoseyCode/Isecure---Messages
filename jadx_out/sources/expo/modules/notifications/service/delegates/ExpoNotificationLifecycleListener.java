package expo.modules.notifications.service.delegates;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.notifications.notifications.NotificationManager;
import expo.modules.notifications.notifications.debug.DebugLogging;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/notifications/service/delegates/ExpoNotificationLifecycleListener;", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "<init>", "()V", "Landroid/os/Bundle;", "extras", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isFCMIntent", "(Landroid/os/Bundle;)Z", "Landroid/app/Activity;", "activity", "savedInstanceState", "Li7/B;", "onCreate", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)Z", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoNotificationLifecycleListener implements ReactActivityLifecycleListener {
    private final boolean isFCMIntent(Bundle extras) {
        return extras.containsKey(NotificationsService.GOOGLE_MESSAGE_ID_KEY);
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public void onCreate(Activity activity, Bundle savedInstanceState) {
        Bundle extras;
        AbstractC2855l.g(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || extras.containsKey(NotificationsService.NOTIFICATION_RESPONSE_KEY) || extras.containsKey(NotificationsService.TEXT_INPUT_NOTIFICATION_RESPONSE_KEY) || !isFCMIntent(extras)) {
            return;
        }
        DebugLogging.logBundle("ExpoNotificationLifeCycleListener.onCreate:", extras);
        NotificationManager.INSTANCE.onNotificationResponseFromExtras(extras);
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public boolean onNewIntent(Intent intent) {
        AbstractC2855l.g(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey(NotificationsService.NOTIFICATION_RESPONSE_KEY) || extras.containsKey(NotificationsService.TEXT_INPUT_NOTIFICATION_RESPONSE_KEY)) {
                intent.removeExtra(NotificationsService.NOTIFICATION_RESPONSE_KEY);
                intent.removeExtra(NotificationsService.TEXT_INPUT_NOTIFICATION_RESPONSE_KEY);
            } else {
                if (!isFCMIntent(extras)) {
                    return false;
                }
                DebugLogging.logBundle("ExpoNotificationLifeCycleListener.onNewIntent:", extras);
                NotificationManager.INSTANCE.onNotificationResponseFromExtras(extras);
            }
        }
        return false;
    }
}
