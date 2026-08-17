package expo.modules.logbox;

import android.app.Activity;
import android.app.Dialog;
import android.widget.FrameLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.B;
import e9.C;
import e9.D;
import e9.E;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import e9.x;
import e9.z;
import expo.modules.logbox.ExpoLogBoxWebViewWrapper;
import i7.C2735B;
import i7.t;
import j7.K;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;
import w7.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019RT\u0010\u001e\u001aB\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001b\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u001cj\u0002`\u001d\u0012\u0004\u0012\u00020\b0\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;", "Lcom/facebook/react/common/SurfaceDelegate;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "<init>", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "appKey", "Li7/B;", "createContentView", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isContentViewReady", "()Z", "destroyContentView", "()V", "show", "hide", "isShowing", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "Lkotlin/Function0;", "onReload", "Lw7/a;", "Lkotlin/Function5;", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fetchTextAsync", "Lw7/q;", "Companion", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoLogBoxSurfaceDelegate implements SurfaceDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DevSupportManager devSupportManager;
    private Dialog dialog;
    private final q fetchTextAsync;
    private final InterfaceC3487a onReload;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Ljava/lang/Runnable;", "runnable", "Li7/B;", "runAfterHostResume", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/Runnable;)V", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runAfterHostResume(final ReactContext reactContext, final Runnable runnable) {
            reactContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: expo.modules.logbox.ExpoLogBoxSurfaceDelegate$Companion$runAfterHostResume$1
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

    public ExpoLogBoxSurfaceDelegate(DevSupportManager devSupportManager) {
        AbstractC2855l.g(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
        this.onReload = new InterfaceC3487a() { // from class: expo.modules.logbox.c
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ExpoLogBoxSurfaceDelegate.onReload$lambda$4(this.f26647g);
            }
        };
        this.fetchTextAsync = new q() { // from class: expo.modules.logbox.d
            @Override // w7.q
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return ExpoLogBoxSurfaceDelegate.fetchTextAsync$lambda$5((String) obj, (String) obj2, (String) obj3, (Function1) obj4, (Function1) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B fetchTextAsync$lambda$5(String url, String method, String body, final Function1 onResult, final Function1 onFailure) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.g(onResult, "onResult");
        AbstractC2855l.g(onFailure, "onFailure");
        z zVar = new z();
        Locale locale = Locale.ROOT;
        String upperCase = method.toUpperCase(locale);
        AbstractC2855l.f(upperCase, "toUpperCase(...)");
        C cF = !AbstractC2855l.b(upperCase, "GET") ? C.Companion.f(body, x.f26347g.c("application/json; charset=utf-8")) : null;
        B.a aVarM = new B.a().m(url);
        String upperCase2 = method.toUpperCase(locale);
        AbstractC2855l.f(upperCase2, "toUpperCase(...)");
        zVar.a(aVarM.g(upperCase2, cF).b()).t0(new InterfaceC2438f() { // from class: expo.modules.logbox.ExpoLogBoxSurfaceDelegate$fetchTextAsync$1$1
            @Override // e9.InterfaceC2438f
            public void onFailure(InterfaceC2437e call, IOException e10) {
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(e10, "e");
                onFailure.invoke(e10);
            }

            @Override // e9.InterfaceC2438f
            public void onResponse(InterfaceC2437e call, D response) throws IOException {
                String strString;
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(response, "response");
                Function1 function1 = onResult;
                try {
                    E eR = response.r();
                    if (eR == null || (strString = eR.string()) == null) {
                        strString = "{}";
                    }
                    function1.invoke(strString);
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(response, null);
                } finally {
                }
            }
        });
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B onReload$lambda$4(ExpoLogBoxSurfaceDelegate expoLogBoxSurfaceDelegate) {
        expoLogBoxSurfaceDelegate.devSupportManager.handleReloadJS();
        return C2735B.f28704a;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(String appKey) {
        AbstractC2855l.g(appKey, "appKey");
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return true;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        Dialog dialog = this.dialog;
        return dialog != null && dialog.isShowing();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        ArrayList arrayList;
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        if (currentActivity.isFinishing()) {
            ReactContext currentReactContext = this.devSupportManager.getCurrentReactContext();
            if (currentReactContext != null) {
                INSTANCE.runAfterHostResume(currentReactContext, new Runnable() { // from class: expo.modules.logbox.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26648g.show();
                    }
                });
                return;
            }
            return;
        }
        this.dialog = new Dialog(currentActivity, android.R.style.Theme.NoTitleBar);
        FrameLayout frameLayout = new FrameLayout(currentActivity);
        frameLayout.setFitsSystemWindows(true);
        String lastErrorTitle = this.devSupportManager.getLastErrorTitle();
        StackFrame[] lastErrorStack = this.devSupportManager.getLastErrorStack();
        if (lastErrorStack != null) {
            arrayList = new ArrayList(lastErrorStack.length);
            for (StackFrame stackFrame : lastErrorStack) {
                arrayList.add(K.l(t.a("file", stackFrame.getFile()), t.a("methodName", stackFrame.getMethod()), t.a("arguments", new String[0]), t.a("lineNumber", Integer.valueOf(stackFrame.getLine())), t.a("column", Integer.valueOf(stackFrame.getColumn())), t.a(StackTraceHelper.COLLAPSE_KEY, Boolean.valueOf(stackFrame.getIsCollapsed()))));
            }
        } else {
            arrayList = null;
        }
        frameLayout.addView(new ExpoLogBoxWebViewWrapper(new ExpoLogBoxWebViewWrapper.Actions(new ExpoLogBoxWebViewWrapper.Actions.OnReload(this.onReload, null, 2, null), new ExpoLogBoxWebViewWrapper.Actions.FetchTextAsync(this.fetchTextAsync, null, 2, null)), K.l(t.a("platform", "android"), t.a("nativeLogs", new Map[]{K.l(t.a("message", lastErrorTitle), t.a(StackTraceHelper.STACK_KEY, arrayList))})), currentActivity).getWebView());
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.setContentView(frameLayout);
        }
        Dialog dialog2 = this.dialog;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
    }
}
