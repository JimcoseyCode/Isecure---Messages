package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.R;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;", "Lcom/facebook/react/common/SurfaceDelegate;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "<init>", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "appKey", "Li7/B;", "createContentView", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isContentViewReady", "()Z", "destroyContentView", "()V", "show", "hide", "isShowing", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;", "doubleTapReloadRecognizer", "Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "Lcom/facebook/react/devsupport/RedBoxContentView;", "redBoxContentView", "Lcom/facebook/react/devsupport/RedBoxContentView;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RedBoxDialogSurfaceDelegate implements SurfaceDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DevSupportManager devSupportManager;
    private Dialog dialog;
    private final DoubleTapReloadRecognizer doubleTapReloadRecognizer;
    private RedBoxContentView redBoxContentView;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Ljava/lang/Runnable;", "runnable", "Li7/B;", "runAfterHostResume", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/Runnable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runAfterHostResume(final ReactContext reactContext, final Runnable runnable) {
            reactContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate$Companion$runAfterHostResume$1
                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostResume() {
                    runnable.run();
                    reactContext.removeLifecycleEventListener(this);
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostDestroy() {
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostPause() {
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate$show$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$show$2", "Landroid/app/Dialog;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "keyCode", "Landroid/view/KeyEvent;", "event", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "Li7/B;", "onCreate", "(Landroid/os/Bundle;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends Dialog {
        final /* synthetic */ RedBoxDialogSurfaceDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Activity activity, RedBoxDialogSurfaceDelegate redBoxDialogSurfaceDelegate, int i10) {
            super(activity, i10);
            this.this$0 = redBoxDialogSurfaceDelegate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L0 onCreate$lambda$0(int i10, View view, L0 windowInsetsCompat) {
            AbstractC2855l.g(view, "view");
            AbstractC2855l.g(windowInsetsCompat, "windowInsetsCompat");
            x0.e eVarF = windowInsetsCompat.f(i10);
            AbstractC2855l.f(eVarF, "getInsets(...)");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbstractC2855l.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMargins(eVarF.f33237a, eVarF.f33238b, eVarF.f33239c, eVarF.f33240d);
            return L0.f16462b;
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle savedInstanceState) {
            Window window = getWindow();
            if (window == null) {
                throw new IllegalStateException("Required value was null.");
            }
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            final int iG = L0.p.g() | L0.p.a();
            RedBoxContentView redBoxContentView = this.this$0.redBoxContentView;
            if (redBoxContentView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC1658a0.w0(redBoxContentView, new androidx.core.view.I() { // from class: com.facebook.react.devsupport.j0
                @Override // androidx.core.view.I
                public final L0 a(View view, L0 l02) {
                    return RedBoxDialogSurfaceDelegate.AnonymousClass2.onCreate$lambda$0(iG, view, l02);
                }
            });
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int keyCode, KeyEvent event) {
            AbstractC2855l.g(event, "event");
            if (keyCode == 82) {
                this.this$0.devSupportManager.showDevOptionsDialog();
                return true;
            }
            if (this.this$0.doubleTapReloadRecognizer.didDoubleTapR(keyCode, getCurrentFocus())) {
                this.this$0.devSupportManager.handleReloadJS();
            }
            return super.onKeyUp(keyCode, event);
        }
    }

    public RedBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        AbstractC2855l.g(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
        this.doubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(String appKey) {
        AbstractC2855l.g(appKey, "appKey");
        RedBoxHandler redBoxHandler = this.devSupportManager.getRedBoxHandler();
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            RedBoxContentView redBoxContentView = new RedBoxContentView(currentActivity, this.devSupportManager, redBoxHandler);
            redBoxContentView.init();
            this.redBoxContentView = redBoxContentView;
            return;
        }
        String lastErrorTitle = this.devSupportManager.getLastErrorTitle();
        if (lastErrorTitle == null) {
            lastErrorTitle = "N/A";
        }
        AbstractC2325a.m(ReactConstants.TAG, "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: " + lastErrorTitle);
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
        this.redBoxContentView = null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        try {
            Dialog dialog = this.dialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (IllegalArgumentException e10) {
            AbstractC2325a.n(ReactConstants.TAG, "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e10);
        }
        destroyContentView();
        this.dialog = null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return this.redBoxContentView != null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        Dialog dialog = this.dialog;
        return dialog != null && dialog.isShowing();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        String lastErrorTitle = this.devSupportManager.getLastErrorTitle();
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            ReactContext currentReactContext = this.devSupportManager.getCurrentReactContext();
            if (currentReactContext != null) {
                INSTANCE.runAfterHostResume(currentReactContext, new Runnable() { // from class: com.facebook.react.devsupport.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20358g.show();
                    }
                });
                return;
            }
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            AbstractC2325a.m(ReactConstants.TAG, "Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: " + lastErrorTitle);
            return;
        }
        RedBoxContentView redBoxContentView = this.redBoxContentView;
        if ((redBoxContentView != null ? redBoxContentView.getContext() : null) != currentActivity) {
            createContentView(NativeRedBoxSpec.NAME);
        }
        RedBoxContentView redBoxContentView2 = this.redBoxContentView;
        if (redBoxContentView2 != null) {
            redBoxContentView2.refreshContentView();
        }
        if (this.dialog == null) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(currentActivity, this, R.style.Theme_Catalyst_RedBox);
            anonymousClass2.requestWindowFeature(1);
            RedBoxContentView redBoxContentView3 = this.redBoxContentView;
            if (redBoxContentView3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            anonymousClass2.setContentView(redBoxContentView3);
            this.dialog = anonymousClass2;
        }
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.show();
        }
    }
}
