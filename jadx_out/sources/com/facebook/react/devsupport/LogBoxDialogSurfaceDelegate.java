package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.util.RNLog;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/devsupport/LogBoxDialogSurfaceDelegate;", "Lcom/facebook/react/common/SurfaceDelegate;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "<init>", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "appKey", "Li7/B;", "createContentView", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isContentViewReady", "()Z", "destroyContentView", "()V", "show", "hide", "isShowing", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Landroid/view/View;", "reactRootView", "Landroid/view/View;", "Lcom/facebook/react/devsupport/LogBoxDialog;", "dialog", "Lcom/facebook/react/devsupport/LogBoxDialog;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogBoxDialogSurfaceDelegate implements SurfaceDelegate {
    private final DevSupportManager devSupportManager;
    private LogBoxDialog dialog;
    private View reactRootView;

    public LogBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        AbstractC2855l.g(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(String appKey) {
        AbstractC2855l.g(appKey, "appKey");
        AbstractC3007a.b(AbstractC2855l.b(appKey, "LogBox"), "This surface manager can only create LogBox React application");
        View viewCreateRootView = this.devSupportManager.createRootView("LogBox");
        this.reactRootView = viewCreateRootView;
        if (viewCreateRootView == null) {
            RNLog.e("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
        View view = this.reactRootView;
        if (view != null) {
            this.devSupportManager.destroyRootView(view);
            this.reactRootView = null;
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        LogBoxDialog logBoxDialog;
        if (isShowing() && (logBoxDialog = this.dialog) != null) {
            logBoxDialog.dismiss();
        }
        View view = this.reactRootView;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.reactRootView);
        }
        this.dialog = null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return this.reactRootView != null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        LogBoxDialog logBoxDialog = this.dialog;
        if (logBoxDialog != null) {
            return logBoxDialog.isShowing();
        }
        return false;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        if (isShowing() || !isContentViewReady()) {
            return;
        }
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            RNLog.e("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        LogBoxDialog logBoxDialog = new LogBoxDialog(currentActivity, this.reactRootView);
        this.dialog = logBoxDialog;
        logBoxDialog.setCancelable(false);
        logBoxDialog.show();
    }
}
