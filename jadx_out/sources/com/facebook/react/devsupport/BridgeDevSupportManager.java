package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o2.C3006c;
import o3.AbstractC3007a;
import p2.C3049a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/facebook/react/devsupport/BridgeDevSupportManager;", "Lcom/facebook/react/devsupport/DevSupportManagerBase;", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "reactInstanceManagerHelper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "packagerPathForJSBundleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enableOnCreate", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "redBoxHandler", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "devBundleDownloadListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minNumShakes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "customPackagerCommandHandlers", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "surfaceDelegateFactory", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "pausedInDebuggerOverlayManager", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V", "Li7/B;", "handleReloadJS", "()V", "getUniqueTag", "()Ljava/lang/String;", "uniqueTag", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BridgeDevSupportManager extends DevSupportManagerBase {
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/devsupport/BridgeDevSupportManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("BridgeDevSupportManager", LegacyArchitectureLogLevel.ERROR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgeDevSupportManager(Context applicationContext, ReactInstanceDevHelper reactInstanceManagerHelper, String str, boolean z10, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i10, Map<String, ? extends RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        super(applicationContext, reactInstanceManagerHelper, str, z10, redBoxHandler, devBundleDownloadListener, i10, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        AbstractC2855l.g(applicationContext, "applicationContext");
        AbstractC2855l.g(reactInstanceManagerHelper, "reactInstanceManagerHelper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleReloadJS$lambda$1(final BridgeDevSupportManager bridgeDevSupportManager) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.a
            @Override // java.lang.Runnable
            public final void run() {
                BridgeDevSupportManager.handleReloadJS$lambda$1$lambda$0(this.f20334g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleReloadJS$lambda$1$lambda$0(BridgeDevSupportManager bridgeDevSupportManager) {
        bridgeDevSupportManager.getReactInstanceDevHelper().onJSBundleLoadedFromServer();
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    protected String getUniqueTag() {
        return "Bridge";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, getDevSettings().getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        C3006c.a().a(C3049a.f30617d, "RNCore: load from Server");
        DevServerHelper devServerHelper = getDevServerHelper();
        Object objC = AbstractC3007a.c(getJsAppBundleName());
        AbstractC2855l.f(objC, "assertNotNull(...)");
        reloadJSFromServer(devServerHelper.getDevServerBundleURL((String) objC), new BundleLoadCallback() { // from class: com.facebook.react.devsupport.b
            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public final void onSuccess() {
                BridgeDevSupportManager.handleReloadJS$lambda$1(this.f20336a);
            }
        });
    }
}
