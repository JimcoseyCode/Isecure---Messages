package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/devsupport/DebugOverlayController;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fpsDebugViewVisible", "Li7/B;", "setFpsDebugViewVisible", "(Z)V", "Lcom/facebook/react/bridge/ReactContext;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "Landroid/widget/FrameLayout;", "fpsDebugViewContainer", "Landroid/widget/FrameLayout;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugOverlayController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private FrameLayout fpsDebugViewContainer;
    private final ReactContext reactContext;
    private final WindowManager windowManager;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/devsupport/DebugOverlayController$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "permissionCheck", "(Landroid/content/Context;)Z", "Landroid/content/Intent;", "intent", "canHandleIntent", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Li7/B;", "requestPermission", "(Landroid/content/Context;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean canHandleIntent(Context context, Intent intent) {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || intent.resolveActivity(packageManager) == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean permissionCheck(Context context) {
            return Settings.canDrawOverlays(context);
        }

        public final void requestPermission(Context context) {
            AbstractC2855l.g(context, "context");
            if (Settings.canDrawOverlays(context)) {
                return;
            }
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            AbstractC2325a.I(ReactConstants.TAG, "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (canHandleIntent(context, intent)) {
                context.startActivity(intent);
            }
        }

        private Companion() {
        }
    }

    public DebugOverlayController(ReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        this.reactContext = reactContext;
        Object systemService = reactContext.getSystemService("window");
        AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
    }

    public static final void requestPermission(Context context) {
        INSTANCE.requestPermission(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFpsDebugViewVisible$lambda$0(boolean z10, DebugOverlayController debugOverlayController) {
        FrameLayout frameLayout;
        if (z10 && debugOverlayController.fpsDebugViewContainer == null) {
            if (!INSTANCE.permissionCheck(debugOverlayController.reactContext)) {
                AbstractC2325a.b(ReactConstants.TAG, "Wait for overlay permission to be set");
                return;
            } else {
                debugOverlayController.fpsDebugViewContainer = new FpsView(debugOverlayController.reactContext);
                debugOverlayController.windowManager.addView(debugOverlayController.fpsDebugViewContainer, new WindowManager.LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3));
                return;
            }
        }
        if (z10 || (frameLayout = debugOverlayController.fpsDebugViewContainer) == null) {
            return;
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        debugOverlayController.windowManager.removeView(debugOverlayController.fpsDebugViewContainer);
        debugOverlayController.fpsDebugViewContainer = null;
    }

    public final void setFpsDebugViewVisible(final boolean fpsDebugViewVisible) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.k
            @Override // java.lang.Runnable
            public final void run() {
                DebugOverlayController.setFpsDebugViewVisible$lambda$0(fpsDebugViewVisible, this);
            }
        });
    }
}
