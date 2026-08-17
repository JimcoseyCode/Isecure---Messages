package expo.modules.sharing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.ReactActivity;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/sharing/SharingReactActivityLifecycleListener;", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "Landroid/content/Context;", "activityContext", "<init>", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "misavedInstanceState", "Li7/B;", "onCreate", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onNewIntent", "(Landroid/content/Intent;)Z", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/ReactActivity;", "Ljava/lang/ref/WeakReference;", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharingReactActivityLifecycleListener implements ReactActivityLifecycleListener {
    private final WeakReference<ReactActivity> activityContext;

    public SharingReactActivityLifecycleListener(Context activityContext) {
        AbstractC2855l.g(activityContext, "activityContext");
        ReactActivity reactActivity = activityContext instanceof ReactActivity ? (ReactActivity) activityContext : null;
        if (reactActivity == null) {
            throw new IllegalArgumentException("The `activityContext` argument of SharingReactActivityLifecycleListener must be a ReactActivity");
        }
        this.activityContext = new WeakReference<>(reactActivity);
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public void onCreate(Activity activity, Bundle misavedInstanceState) {
        if ((activity != null ? activity.getIntent() : null) != null) {
            Intent intent = activity.getIntent();
            AbstractC2855l.f(intent, "getIntent(...)");
            if (ShareIntoUtilsKt.isShareIntent(intent)) {
                SharingSingleton.INSTANCE.setIntent(new Intent(activity.getIntent()));
                Uri shareIntentUri = ShareIntoUtilsKt.getShareIntentUri(activity);
                if (shareIntentUri != null) {
                    activity.getIntent().setAction("android.intent.action.VIEW");
                    activity.getIntent().setData(shareIntentUri);
                }
            }
        }
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public boolean onNewIntent(Intent intent) {
        ReactActivity reactActivity = this.activityContext.get();
        if (reactActivity != null && intent != null && ShareIntoUtilsKt.isShareIntent(intent)) {
            ShareIntoUtilsKt.emitShareIntentReceived(reactActivity, intent);
        }
        return false;
    }
}
