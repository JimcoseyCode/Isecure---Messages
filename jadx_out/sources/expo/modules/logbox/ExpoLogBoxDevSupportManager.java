package expo.modules.logbox;

import android.content.Context;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.ReactInstanceDevHelper;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010 \u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J+\u0010+\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;", "Lexpo/modules/logbox/ExpoBridgelessDevSupportManager;", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "reactInstanceManagerHelper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "packagerPathForJSBundleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enableOnCreate", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "redBoxHandler", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "devBundleDownloadListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minNumShakes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "customPackagerCommandHandlers", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "surfaceDelegateFactory", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "pausedInDebuggerOverlayManager", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/StackFrame;", StackTraceHelper.STACK_KEY, "Li7/B;", "showNewError", "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V", "hideRedboxDialog", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "e", "showNewJavaError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/facebook/react/bridge/ReadableArray;", "details", "errorCookie", "showNewJSError", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V", "Lcom/facebook/react/common/SurfaceDelegate;", "redBoxSurfaceDelegate", "Lcom/facebook/react/common/SurfaceDelegate;", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoLogBoxDevSupportManager extends ExpoBridgelessDevSupportManager {
    private SurfaceDelegate redBoxSurfaceDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoLogBoxDevSupportManager(Context applicationContext, ReactInstanceDevHelper reactInstanceManagerHelper, String str, boolean z10, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i10, Map<String, ? extends RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        super(applicationContext, reactInstanceManagerHelper, str, z10, redBoxHandler, devBundleDownloadListener, i10, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        AbstractC2855l.g(applicationContext, "applicationContext");
        AbstractC2855l.g(reactInstanceManagerHelper, "reactInstanceManagerHelper");
    }

    private final void showNewError(final String message, final StackFrame[] stack) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: expo.modules.logbox.a
            @Override // java.lang.Runnable
            public final void run() {
                ExpoLogBoxDevSupportManager.showNewError$lambda$1(this.f26644g, message, stack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNewError$lambda$1(ExpoLogBoxDevSupportManager expoLogBoxDevSupportManager, String str, StackFrame[] stackFrameArr) {
        SurfaceDelegate surfaceDelegate;
        expoLogBoxDevSupportManager.setLastErrorTitle(str);
        expoLogBoxDevSupportManager.setLastErrorStack(stackFrameArr);
        if (expoLogBoxDevSupportManager.redBoxSurfaceDelegate == null) {
            SurfaceDelegate surfaceDelegateCreateSurfaceDelegate = expoLogBoxDevSupportManager.createSurfaceDelegate(NativeRedBoxSpec.NAME);
            if (surfaceDelegateCreateSurfaceDelegate == null) {
                surfaceDelegateCreateSurfaceDelegate = new ExpoLogBoxSurfaceDelegate(expoLogBoxDevSupportManager);
                surfaceDelegateCreateSurfaceDelegate.createContentView(NativeRedBoxSpec.NAME);
            }
            expoLogBoxDevSupportManager.redBoxSurfaceDelegate = surfaceDelegateCreateSurfaceDelegate;
        }
        SurfaceDelegate surfaceDelegate2 = expoLogBoxDevSupportManager.redBoxSurfaceDelegate;
        if ((surfaceDelegate2 == null || !surfaceDelegate2.isShowing()) && (surfaceDelegate = expoLogBoxDevSupportManager.redBoxSurfaceDelegate) != null) {
            surfaceDelegate.show();
        }
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase, com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
        SurfaceDelegate surfaceDelegate = this.redBoxSurfaceDelegate;
        if (surfaceDelegate != null) {
            surfaceDelegate.hide();
        }
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase, com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String message, ReadableArray details, int errorCookie) {
        showNewError(message, StackTraceHelper.convertJsStackTrace(details));
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase, com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(String message, Throwable e10) {
        AbstractC2855l.g(e10, "e");
        showNewError(message, StackTraceHelper.convertJavaStackTrace(e10));
    }
}
