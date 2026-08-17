package expo.modules.logbox;

import android.content.Context;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.ReactInstanceDevHelper;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/logbox/ExpoBridgelessDevSupportManager;", "Lcom/facebook/react/devsupport/DevSupportManagerBase;", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "reactInstanceManagerHelper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "packagerPathForJSBundleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enableOnCreate", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "redBoxHandler", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "devBundleDownloadListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minNumShakes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "customPackagerCommandHandlers", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "surfaceDelegateFactory", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "pausedInDebuggerOverlayManager", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V", "Li7/B;", "handleReloadJS", "()V", "getUniqueTag", "()Ljava/lang/String;", "uniqueTag", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoBridgelessDevSupportManager extends DevSupportManagerBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoBridgelessDevSupportManager(Context applicationContext, ReactInstanceDevHelper reactInstanceManagerHelper, String str, boolean z10, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i10, Map<String, ? extends RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        super(applicationContext, reactInstanceManagerHelper, str, z10, redBoxHandler, devBundleDownloadListener, i10, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        AbstractC2855l.g(applicationContext, "applicationContext");
        AbstractC2855l.g(reactInstanceManagerHelper, "reactInstanceManagerHelper");
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    protected String getUniqueTag() {
        return "Bridgeless";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        hideRedboxDialog();
        getReactInstanceDevHelper().reload("BridgelessDevSupportManager.handleReloadJS()");
    }
}
