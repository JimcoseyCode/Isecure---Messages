package expo.modules.logbox;

import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.ReactInstanceDevHelper;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\b\u0002\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/ReactHost;", "reactHost", "Li7/B;", "injectExpoLogBoxDevSupportManager", "(Lcom/facebook/react/ReactHost;)V", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "currentDevSupportManager", "Ljava/lang/Class;", "devManagerClass", "Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;", "createExpoLogBoxBridgelessDevSupportManager", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Ljava/lang/Class;)Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;", "expo-log-box_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExpoLogBoxReflectionUtilsKt {
    public static final ExpoLogBoxDevSupportManager createExpoLogBoxBridgelessDevSupportManager(DevSupportManager currentDevSupportManager, Class<?> devManagerClass) {
        AbstractC2855l.g(currentDevSupportManager, "currentDevSupportManager");
        AbstractC2855l.g(devManagerClass, "devManagerClass");
        return new ExpoLogBoxDevSupportManager((Context) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "applicationContext"), (ReactInstanceDevHelper) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "reactInstanceDevHelper"), (String) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "jsAppBundleName"), true, (RedBoxHandler) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "redBoxHandler"), (DevBundleDownloadListener) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "devBundleDownloadListener"), 1, (Map) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "customPackagerCommandHandlers"), (SurfaceDelegateFactory) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "surfaceDelegateFactory"), (DevLoadingViewManager) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "devLoadingViewManager"), (PausedInDebuggerOverlayManager) ExpoLogBoxReflectionExtensionsKt.getProtectedFieldValue(devManagerClass, currentDevSupportManager, "pausedInDebuggerOverlayManager"));
    }

    public static /* synthetic */ ExpoLogBoxDevSupportManager createExpoLogBoxBridgelessDevSupportManager$default(DevSupportManager devSupportManager, Class cls, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cls = DevSupportManagerBase.class;
        }
        return createExpoLogBoxBridgelessDevSupportManager(devSupportManager, cls);
    }

    public static final void injectExpoLogBoxDevSupportManager(ReactHost reactHost) {
        DevSupportManager devSupportManager = reactHost != null ? reactHost.getDevSupportManager() : null;
        if (devSupportManager == null || (devSupportManager instanceof ExpoLogBoxDevSupportManager)) {
            return;
        }
        try {
            ExpoLogBoxReflectionExtensionsKt.setProtectedDeclaredField$default(ReactHostImpl.class, reactHost, "devSupportManager", createExpoLogBoxBridgelessDevSupportManager$default(devSupportManager, null, 2, null), null, 8, null);
        } catch (Exception unused) {
        }
    }
}
