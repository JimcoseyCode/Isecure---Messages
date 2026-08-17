package expo.modules.keepawake;

import android.app.Activity;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/keepawake/ExpoKeepAwakeManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tag", "Li7/B;", "activate", "(Ljava/lang/String;)V", "deactivate", "Lexpo/modules/kotlin/AppContext;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tags", "Ljava/util/Set;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isActivated", "()Z", "expo-keep-awake_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoKeepAwakeManager {
    private final AppContext appContext;
    private final Set<String> tags = new LinkedHashSet();

    public ExpoKeepAwakeManager(AppContext appContext) {
        this.appContext = appContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activate$lambda$0(Activity activity) {
        activity.getWindow().addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deactivate$lambda$1(Activity activity) {
        activity.getWindow().clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    }

    private final Activity getCurrentActivity() throws Exceptions.AppContextLost {
        AppContext appContext = this.appContext;
        if (appContext != null) {
            return appContext.getThrowingActivity();
        }
        throw new Exceptions.AppContextLost();
    }

    public final void activate(String tag) throws Exceptions.AppContextLost {
        AbstractC2855l.g(tag, "tag");
        final Activity currentActivity = getCurrentActivity();
        if (!isActivated()) {
            currentActivity.runOnUiThread(new Runnable() { // from class: expo.modules.keepawake.b
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoKeepAwakeManager.activate$lambda$0(currentActivity);
                }
            });
        }
        this.tags.add(tag);
    }

    public final void deactivate(String tag) throws Exceptions.AppContextLost {
        AbstractC2855l.g(tag, "tag");
        final Activity currentActivity = getCurrentActivity();
        if (this.tags.size() == 1 && this.tags.contains(tag)) {
            currentActivity.runOnUiThread(new Runnable() { // from class: expo.modules.keepawake.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoKeepAwakeManager.deactivate$lambda$1(currentActivity);
                }
            });
        }
        this.tags.remove(tag);
    }

    public final boolean isActivated() {
        return !this.tags.isEmpty();
    }
}
