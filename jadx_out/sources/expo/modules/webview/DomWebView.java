package expo.modules.webview;

import C7.k;
import P8.q;
import R8.AbstractC1415j;
import R8.N;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.viewevent.ViewEventCallback;
import expo.modules.kotlin.viewevent.ViewEventDelegate;
import expo.modules.kotlin.views.ExpoView;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.v;
import o7.AbstractC3016b;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J#\u0010-\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u000bR\u001b\u00103\u001a\u00060\u000fj\u0002`28\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010:\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u0016\u0010C\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010;R!\u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lexpo/modules/webview/DomWebView;", "Lexpo/modules/kotlin/views/ExpoView;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V", "Landroid/webkit/WebView;", "createWebView", "()Landroid/webkit/WebView;", "expo/modules/webview/DomWebView$createWebViewClient$1", "createWebViewClient", "()Lexpo/modules/webview/DomWebView$createWebViewClient$1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deferredId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "source", "nativeJsiEvalSync", "(ILjava/lang/String;Ln7/f;)Ljava/lang/Object;", "Li7/B;", "reload", "()V", "Lexpo/modules/webview/DomWebViewSource;", "setSource", "(Lexpo/modules/webview/DomWebViewSource;)V", "script", "setInjectedJSBeforeContentLoaded", "(Ljava/lang/String;)V", "injectJavaScript", "message", "dispatchMessageEvent", "data", "evalSync", "(Ljava/lang/String;)Ljava/lang/String;", "Lexpo/modules/webview/ScrollToParam;", "param", "scrollTo", "(Lexpo/modules/webview/ScrollToParam;)V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "webView", "Landroid/webkit/WebView;", "getWebView", "Lexpo/modules/webview/WebViewId;", "webViewId", "I", "getWebViewId", "()I", "Lexpo/modules/webview/DomWebViewSource;", "injectedJSBeforeContentLoaded", "Ljava/lang/String;", "webviewDebuggingEnabled", "Z", "getWebviewDebuggingEnabled", "()Z", "setWebviewDebuggingEnabled", "(Z)V", "nestedScrollEnabled", "getNestedScrollEnabled", "setNestedScrollEnabled", "needsResetupScripts", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "Lexpo/modules/webview/OnMessageEvent;", "onMessage$delegate", "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", "getOnMessage", "()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "onMessage", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class DomWebView extends ExpoView implements View.OnTouchListener {
    static final /* synthetic */ k[] $$delegatedProperties = {D.k(new v(DomWebView.class, "onMessage", "getOnMessage()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};
    private String injectedJSBeforeContentLoaded;
    private boolean needsResetupScripts;
    private boolean nestedScrollEnabled;

    /* JADX INFO: renamed from: onMessage$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onMessage;
    private DomWebViewSource source;
    private final WebView webView;
    private final int webViewId;
    private boolean webviewDebuggingEnabled;

    /* JADX INFO: renamed from: expo.modules.webview.DomWebView$evalSync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.webview.DomWebView$evalSync$1", f = "DomWebView.kt", l = {100}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    static final class C25671 extends l implements Function2 {
        final /* synthetic */ int $deferredId;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25671(int i10, String str, n7.f fVar) {
            super(2, fVar);
            this.$deferredId = i10;
            this.$source = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return DomWebView.this.new C25671(this.$deferredId, this.$source, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C25671) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            DomWebView domWebView = DomWebView.this;
            int i11 = this.$deferredId;
            String str = this.$source;
            AbstractC2855l.d(str);
            this.label = 1;
            Object objNativeJsiEvalSync = domWebView.nativeJsiEvalSync(i11, str, this);
            return objNativeJsiEvalSync == objE ? objE : objNativeJsiEvalSync;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomWebView(Context context, AppContext appContext) {
        super(context, appContext);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(appContext, "appContext");
        this.webViewId = DomWebViewRegistry.INSTANCE.add(this);
        this.nestedScrollEnabled = true;
        this.onMessage = new ViewEventDelegate(this, null);
        WebView webViewCreateWebView = createWebView();
        this.webView = webViewCreateWebView;
        addView(webViewCreateWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final WebView createWebView() {
        WebView webView = new WebView(getContext());
        webView.setBackgroundColor(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(createWebViewClient());
        webView.addJavascriptInterface(new RNCWebViewBridge(this), "ReactNativeWebView");
        webView.addJavascriptInterface(new DomWebViewBridge(this), "ExpoDomWebViewBridge");
        webView.setOnTouchListener(this);
        return webView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [expo.modules.webview.DomWebView$createWebViewClient$1] */
    private final AnonymousClass1 createWebViewClient() {
        return new WebViewClient() { // from class: expo.modules.webview.DomWebView.createWebViewClient.1
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                DomWebView domWebView = DomWebView.this;
                domWebView.injectJavaScript(q.E(DomWebViewBrowserScriptsKt.INSTALL_GLOBALS_SCRIPT, "\"%%WEBVIEW_ID%%\"", String.valueOf(domWebView.getWebViewId()), false, 4, null));
                String str = DomWebView.this.injectedJSBeforeContentLoaded;
                if (str != null) {
                    DomWebView.this.injectJavaScript(str);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchMessageEvent$lambda$2(DomWebView domWebView, String str) {
        String title = domWebView.webView.getTitle();
        String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        if (title == null) {
            title = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        String url = domWebView.webView.getUrl();
        if (url != null) {
            str2 = url;
        }
        domWebView.getOnMessage().invoke(new OnMessageEvent(title, str2, str));
    }

    private final ViewEventCallback<OnMessageEvent> getOnMessage() {
        return this.onMessage.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void injectJavaScript$lambda$1(DomWebView domWebView, String str) {
        domWebView.webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object nativeJsiEvalSync(final int i10, final String str, n7.f fVar) {
        final n7.l lVar = new n7.l(AbstractC3016b.c(fVar));
        getAppContext().executeOnJavaScriptThread(new Runnable() { // from class: expo.modules.webview.DomWebView$nativeJsiEvalSync$2$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JavaScriptValue javaScriptValueEval = this.getAppContext().getRuntime().eval(q.E(q.E(q.E(DomWebViewBrowserScriptsKt.NATIVE_EVAL_WRAPPER_SCRIPT, "\"%%DEFERRED_ID%%\"", String.valueOf(i10), false, 4, null), "\"%%WEBVIEW_ID%%\"", String.valueOf(this.getWebViewId()), false, 4, null), "\"%%SOURCE%%\"", str, false, 4, null));
                    n7.f fVar2 = lVar;
                    C2752o.a aVar = C2752o.f28721h;
                    fVar2.resumeWith(C2752o.b(javaScriptValueEval.getString()));
                } catch (Exception e10) {
                    n7.f fVar3 = lVar;
                    C2752o.a aVar2 = C2752o.f28721h;
                    fVar3.resumeWith(C2752o.b(AbstractC2753p.a(e10)));
                }
            }
        });
        Object objA = lVar.a();
        if (objA == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollTo$lambda$3(ScrollToParam scrollToParam, DomWebView domWebView) {
        if (!scrollToParam.getAnimated()) {
            domWebView.webView.scrollTo((int) scrollToParam.getX(), (int) scrollToParam.getY());
            return;
        }
        WebView webView = domWebView.webView;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(webView, "scrollX", webView.getScrollX(), (int) scrollToParam.getX());
        objectAnimatorOfInt.setDuration(250L);
        WebView webView2 = domWebView.webView;
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(webView2, "scrollY", webView2.getScrollY(), (int) scrollToParam.getY());
        objectAnimatorOfInt2.setDuration(250L);
        objectAnimatorOfInt.start();
        objectAnimatorOfInt2.start();
    }

    public final void dispatchMessageEvent(final String message) {
        AbstractC2855l.g(message, "message");
        this.webView.post(new Runnable() { // from class: expo.modules.webview.c
            @Override // java.lang.Runnable
            public final void run() {
                DomWebView.dispatchMessageEvent$lambda$2(this.f26712g, message);
            }
        });
    }

    public final String evalSync(String data) {
        AbstractC2855l.g(data, "data");
        JSONObject jSONObject = new JSONObject(data);
        return (String) AbstractC1415j.b(null, new C25671(jSONObject.getInt("deferredId"), jSONObject.getString("source"), null), 1, null);
    }

    public final boolean getNestedScrollEnabled() {
        return this.nestedScrollEnabled;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final int getWebViewId() {
        return this.webViewId;
    }

    public final boolean getWebviewDebuggingEnabled() {
        return this.webviewDebuggingEnabled;
    }

    public final void injectJavaScript(final String script) {
        AbstractC2855l.g(script, "script");
        this.webView.post(new Runnable() { // from class: expo.modules.webview.b
            @Override // java.lang.Runnable
            public final void run() {
                DomWebView.injectJavaScript$lambda$1(this.f26710g, script);
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        if (!this.nestedScrollEnabled) {
            return false;
        }
        requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public final void reload() {
        String uri;
        WebView.setWebContentsDebuggingEnabled(this.webviewDebuggingEnabled);
        DomWebViewSource domWebViewSource = this.source;
        if (domWebViewSource != null && (uri = domWebViewSource.getUri()) != null) {
            if (AbstractC2855l.b(uri, this.webView.getUrl())) {
                return;
            }
            this.webView.loadUrl(uri);
        } else if (this.needsResetupScripts) {
            this.needsResetupScripts = false;
            this.webView.reload();
        }
    }

    public final void scrollTo(final ScrollToParam param) {
        AbstractC2855l.g(param, "param");
        this.webView.post(new Runnable() { // from class: expo.modules.webview.a
            @Override // java.lang.Runnable
            public final void run() {
                DomWebView.scrollTo$lambda$3(param, this);
            }
        });
    }

    public final void setInjectedJSBeforeContentLoaded(String script) {
        String str;
        if (script == null || script.length() == 0) {
            str = null;
        } else {
            str = "(function() { " + script + "; })();true;";
        }
        this.injectedJSBeforeContentLoaded = str;
        this.needsResetupScripts = true;
    }

    public final void setNestedScrollEnabled(boolean z10) {
        this.nestedScrollEnabled = z10;
    }

    public final void setSource(DomWebViewSource source) {
        AbstractC2855l.g(source, "source");
        this.source = source;
    }

    public final void setWebviewDebuggingEnabled(boolean z10) {
        this.webviewDebuggingEnabled = z10;
    }
}
