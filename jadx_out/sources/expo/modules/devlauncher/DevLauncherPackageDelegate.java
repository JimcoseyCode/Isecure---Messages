package expo.modules.devlauncher;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.ApplicationLifecycleListener;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/DevLauncherPackageDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "createNativeModules", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createApplicationLifecycleListeners", "Lexpo/modules/core/interfaces/ApplicationLifecycleListener;", "context", "Landroid/content/Context;", "createReactActivityLifecycleListeners", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "activityContext", "createReactActivityHandlers", "Lexpo/modules/core/interfaces/ReactActivityHandler;", "createReactNativeHostHandlers", "Lexpo/modules/core/interfaces/ReactNativeHostHandler;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevLauncherPackageDelegate {
    public static final int $stable = 0;
    public static final DevLauncherPackageDelegate INSTANCE = new DevLauncherPackageDelegate();

    private DevLauncherPackageDelegate() {
    }

    public final List<ApplicationLifecycleListener> createApplicationLifecycleListeners(Context context) {
        return AbstractC2800q.j();
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return AbstractC2800q.j();
    }

    public final List<ReactActivityHandler> createReactActivityHandlers(Context activityContext) {
        return AbstractC2800q.j();
    }

    public final List<ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context activityContext) {
        return AbstractC2800q.j();
    }

    public final List<ReactNativeHostHandler> createReactNativeHostHandlers(Context context) {
        return AbstractC2800q.j();
    }
}
