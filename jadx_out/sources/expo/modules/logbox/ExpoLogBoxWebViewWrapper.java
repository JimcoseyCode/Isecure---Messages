package expo.modules.logbox;

import R8.AbstractC1417k;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.gson.k;
import expo.modules.logbox.ExpoLogBoxWebViewWrapper;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;
import w7.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0019J!\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u001bJ\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;", "actions", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "props", "Landroid/app/Activity;", "context", "<init>", "(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;Ljava/util/Map;Landroid/app/Activity;)V", "Li7/B;", "initializeLogBoxDomEnvironment", "()V", "rawMessage", "processMessageFromWebView", "(Ljava/lang/String;)V", "result", "uid", "actionId", "sendReturn", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", NotificationsService.EXCEPTION_KEY, "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V", "data", "(Ljava/util/Map;)V", "value", "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;", "getActions", "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;", "Ljava/util/Map;", "getProps", "()Ljava/util/Map;", "Landroid/app/Activity;", "getContext", "()Landroid/app/Activity;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Companion", "Actions", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoLogBoxWebViewWrapper {
    private static final String DOM_EVENT = "$$dom_event";
    private static final String NATIVE_ACTION = "$$native_action";
    private static final String NATIVE_ACTION_RESULT = "$$native_action_result";
    private final Actions actions;
    private final Activity context;
    private final Map<String, Object> props;
    private final WebView webView;

    /* JADX INFO: renamed from: expo.modules.logbox.ExpoLogBoxWebViewWrapper$processMessageFromWebView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.logbox.ExpoLogBoxWebViewWrapper$processMessageFromWebView$1", f = "ExpoLogBoxWebViewWrapper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ k $actionId;
        final /* synthetic */ com.google.gson.e $args;
        final /* synthetic */ k $uid;
        int label;
        final /* synthetic */ ExpoLogBoxWebViewWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.google.gson.e eVar, ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, k kVar, k kVar2, n7.f fVar) {
            super(2, fVar);
            this.$args = eVar;
            this.this$0 = expoLogBoxWebViewWrapper;
            this.$uid = kVar;
            this.$actionId = kVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2735B invokeSuspend$lambda$0(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, k kVar, k kVar2, String str) {
            String strW = kVar.w();
            AbstractC2855l.f(strW, "getAsString(...)");
            String strW2 = kVar2.w();
            AbstractC2855l.f(strW2, "getAsString(...)");
            expoLogBoxWebViewWrapper.sendReturn(str, strW, strW2);
            return C2735B.f28704a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2735B invokeSuspend$lambda$1(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, k kVar, k kVar2, Exception exc) {
            String strW = kVar.w();
            AbstractC2855l.f(strW, "getAsString(...)");
            String strW2 = kVar2.w();
            AbstractC2855l.f(strW2, "getAsString(...)");
            expoLogBoxWebViewWrapper.sendReturn(exc, strW, strW2);
            return C2735B.f28704a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass1(this.$args, this.this$0, this.$uid, this.$actionId, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            String strW = null;
            String strW2 = (this.$args.v(0).t() && this.$args.v(0).p().A()) ? this.$args.v(0).p().w() : null;
            com.google.gson.i iVarO = this.$args.v(1).o();
            String strW3 = (iVarO.A("method") && iVarO.w("method").t() && iVarO.z("method").A()) ? iVarO.z("method").w() : null;
            if (iVarO.A(ExpoNotificationBuilder.EXTRAS_BODY_KEY) && iVarO.w(ExpoNotificationBuilder.EXTRAS_BODY_KEY).t() && iVarO.z(ExpoNotificationBuilder.EXTRAS_BODY_KEY).A()) {
                strW = iVarO.z(ExpoNotificationBuilder.EXTRAS_BODY_KEY).w();
            }
            if (strW2 != null) {
                q action = this.this$0.getActions().getFetchTextAsync().getAction();
                if (strW3 == null) {
                    strW3 = "GET";
                }
                String str = strW3;
                if (strW == null) {
                    strW = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                }
                String str2 = strW;
                final ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper = this.this$0;
                final k kVar = this.$uid;
                final k kVar2 = this.$actionId;
                Function1 function1 = new Function1() { // from class: expo.modules.logbox.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ExpoLogBoxWebViewWrapper.AnonymousClass1.invokeSuspend$lambda$0(expoLogBoxWebViewWrapper, kVar, kVar2, (String) obj2);
                    }
                };
                final ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper2 = this.this$0;
                final k kVar3 = this.$uid;
                final k kVar4 = this.$actionId;
                action.invoke(strW2, str, str2, function1, new Function1() { // from class: expo.modules.logbox.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ExpoLogBoxWebViewWrapper.AnonymousClass1.invokeSuspend$lambda$1(expoLogBoxWebViewWrapper2, kVar3, kVar4, (Exception) obj2);
                    }
                });
            }
            return C2735B.f28704a;
        }
    }

    public ExpoLogBoxWebViewWrapper(Actions actions, Map<String, ? extends Object> props, Activity context) {
        AbstractC2855l.g(actions, "actions");
        AbstractC2855l.g(props, "props");
        AbstractC2855l.g(context, "context");
        this.actions = actions;
        this.props = props;
        this.context = context;
        WebView webView = new WebView(context);
        webView.setBackgroundColor(-16777216);
        webView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        webView.addJavascriptInterface(new Object() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$webView$1$1
            @JavascriptInterface
            public final void postMessage(String rawMessage) {
                AbstractC2855l.g(rawMessage, "rawMessage");
                this.this$0.processMessageFromWebView(rawMessage);
            }
        }, "ReactNativeWebView");
        webView.setWebViewClient(new WebViewClient() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$webView$1$2
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                this.this$0.initializeLogBoxDomEnvironment();
            }
        });
        webView.loadUrl("file:///android_asset/ExpoLogBox.bundle/index.html");
        this.webView = webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeLogBoxDomEnvironment() {
        String strR = new com.google.gson.d().r(K.l(t.a("names", this.actions.getNames()), t.a("props", this.props)));
        final String strJ = P8.q.j("\n            var process=globalThis.process||{};process.env=process.env||{};\n            process.env.EXPO_DEV_SERVER_ORIGIN='" + ("http://" + AndroidInfoHelpers.getServerHost(this.context)) + "';\n            window.$$EXPO_DOM_HOST_OS = 'android';\n            window.$$EXPO_INITIAL_PROPS = " + strR + ";\n    ");
        this.webView.post(new Runnable() { // from class: expo.modules.logbox.f
            @Override // java.lang.Runnable
            public final void run() {
                ExpoLogBoxWebViewWrapper.initializeLogBoxDomEnvironment$lambda$1(this.f26649g, strJ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeLogBoxDomEnvironment$lambda$1(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, String str) {
        expoLogBoxWebViewWrapper.webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMessageFromWebView(String rawMessage) {
        com.google.gson.i iVar = (com.google.gson.i) new com.google.gson.d().i(rawMessage, com.google.gson.i.class);
        k kVarZ = iVar.z(NotificationsService.EVENT_TYPE_KEY);
        if (kVarZ.A() && AbstractC2855l.b(kVarZ.w(), NATIVE_ACTION)) {
            com.google.gson.i iVarY = iVar.y("data");
            k kVarZ2 = iVarY.z("actionId");
            k kVarZ3 = iVarY.z("uid");
            com.google.gson.e eVarX = iVarY.x("args");
            if (kVarZ2.A() && kVarZ3.A() && eVarX.q()) {
                String strW = kVarZ2.w();
                if (AbstractC2855l.b(strW, "onReload")) {
                    this.actions.getOnReload().getAction().invoke();
                } else if (AbstractC2855l.b(strW, "fetchTextAsync")) {
                    AbstractC1417k.d(O.a(C1404d0.a()), null, null, new AnonymousClass1(eVarX, this, kVarZ3, kVarZ2, null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendReturn$lambda$2(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, String str) {
        expoLogBoxWebViewWrapper.webView.evaluateJavascript(str, null);
    }

    public final Actions getActions() {
        return this.actions;
    }

    public final Activity getContext() {
        return this.context;
    }

    public final Map<String, Object> getProps() {
        return this.props;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final void sendReturn(Object result, String uid, String actionId) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(uid, "uid");
        AbstractC2855l.g(actionId, "actionId");
        sendReturn(K.l(t.a(NotificationsService.EVENT_TYPE_KEY, NATIVE_ACTION_RESULT), t.a("data", K.l(t.a("uid", uid), t.a("actionId", actionId), t.a("result", result)))));
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onReload", "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;", "fetchTextAsync", "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;", "<init>", "(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)V", "getOnReload", "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;", "getFetchTextAsync", "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;", "getNames", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "()[Ljava/lang/String;", "component1", "component2", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "OnReload", "FetchTextAsync", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Actions {
        private final FetchTextAsync fetchTextAsync;
        private final OnReload onReload;

        public Actions(OnReload onReload, FetchTextAsync fetchTextAsync) {
            AbstractC2855l.g(onReload, "onReload");
            AbstractC2855l.g(fetchTextAsync, "fetchTextAsync");
            this.onReload = onReload;
            this.fetchTextAsync = fetchTextAsync;
        }

        public static /* synthetic */ Actions copy$default(Actions actions, OnReload onReload, FetchTextAsync fetchTextAsync, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                onReload = actions.onReload;
            }
            if ((i10 & 2) != 0) {
                fetchTextAsync = actions.fetchTextAsync;
            }
            return actions.copy(onReload, fetchTextAsync);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OnReload getOnReload() {
            return this.onReload;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final FetchTextAsync getFetchTextAsync() {
            return this.fetchTextAsync;
        }

        public final Actions copy(OnReload onReload, FetchTextAsync fetchTextAsync) {
            AbstractC2855l.g(onReload, "onReload");
            AbstractC2855l.g(fetchTextAsync, "fetchTextAsync");
            return new Actions(onReload, fetchTextAsync);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) other;
            return AbstractC2855l.b(this.onReload, actions.onReload) && AbstractC2855l.b(this.fetchTextAsync, actions.fetchTextAsync);
        }

        public final FetchTextAsync getFetchTextAsync() {
            return this.fetchTextAsync;
        }

        public final String[] getNames() {
            return new String[]{this.onReload.getName(), this.fetchTextAsync.getName()};
        }

        public final OnReload getOnReload() {
            return this.onReload;
        }

        public int hashCode() {
            return (this.onReload.hashCode() * 31) + this.fetchTextAsync.hashCode();
        }

        public String toString() {
            return "Actions(onReload=" + this.onReload + ", fetchTextAsync=" + this.fetchTextAsync + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012F\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJP\u0010\f\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJd\u0010\u0010\u001a\u00020\u00002H\b\u0002\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019RW\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function5;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function1;", "Li7/B;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "action", "name", "<init>", "(Lw7/q;Ljava/lang/String;)V", "component1", "()Lw7/q;", "component2", "()Ljava/lang/String;", "copy", "(Lw7/q;Ljava/lang/String;)Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Lw7/q;", "getAction", "Ljava/lang/String;", "getName", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FetchTextAsync {
            private final q action;
            private final String name;

            public FetchTextAsync(q action, String name) {
                AbstractC2855l.g(action, "action");
                AbstractC2855l.g(name, "name");
                this.action = action;
                this.name = name;
            }

            public static /* synthetic */ FetchTextAsync copy$default(FetchTextAsync fetchTextAsync, q qVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    qVar = fetchTextAsync.action;
                }
                if ((i10 & 2) != 0) {
                    str = fetchTextAsync.name;
                }
                return fetchTextAsync.copy(qVar, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final q getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final FetchTextAsync copy(q action, String name) {
                AbstractC2855l.g(action, "action");
                AbstractC2855l.g(name, "name");
                return new FetchTextAsync(action, name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchTextAsync)) {
                    return false;
                }
                FetchTextAsync fetchTextAsync = (FetchTextAsync) other;
                return AbstractC2855l.b(this.action, fetchTextAsync.action) && AbstractC2855l.b(this.name, fetchTextAsync.name);
            }

            public final q getAction() {
                return this.action;
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return (this.action.hashCode() * 31) + this.name.hashCode();
            }

            public String toString() {
                return "FetchTextAsync(action=" + this.action + ", name=" + this.name + ")";
            }

            public /* synthetic */ FetchTextAsync(q qVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(qVar, (i10 & 2) != 0 ? "fetchTextAsync" : str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function0;", "Li7/B;", "action", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "<init>", "(Lw7/a;Ljava/lang/String;)V", "component1", "()Lw7/a;", "component2", "()Ljava/lang/String;", "copy", "(Lw7/a;Ljava/lang/String;)Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Lw7/a;", "getAction", "Ljava/lang/String;", "getName", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnReload {
            private final InterfaceC3487a action;
            private final String name;

            public OnReload(InterfaceC3487a action, String name) {
                AbstractC2855l.g(action, "action");
                AbstractC2855l.g(name, "name");
                this.action = action;
                this.name = name;
            }

            public static /* synthetic */ OnReload copy$default(OnReload onReload, InterfaceC3487a interfaceC3487a, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    interfaceC3487a = onReload.action;
                }
                if ((i10 & 2) != 0) {
                    str = onReload.name;
                }
                return onReload.copy(interfaceC3487a, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InterfaceC3487a getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final OnReload copy(InterfaceC3487a action, String name) {
                AbstractC2855l.g(action, "action");
                AbstractC2855l.g(name, "name");
                return new OnReload(action, name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnReload)) {
                    return false;
                }
                OnReload onReload = (OnReload) other;
                return AbstractC2855l.b(this.action, onReload.action) && AbstractC2855l.b(this.name, onReload.name);
            }

            public final InterfaceC3487a getAction() {
                return this.action;
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return (this.action.hashCode() * 31) + this.name.hashCode();
            }

            public String toString() {
                return "OnReload(action=" + this.action + ", name=" + this.name + ")";
            }

            public /* synthetic */ OnReload(InterfaceC3487a interfaceC3487a, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(interfaceC3487a, (i10 & 2) != 0 ? "onReload" : str);
            }
        }
    }

    public final void sendReturn(Exception exception, String uid, String actionId) {
        AbstractC2855l.g(exception, "exception");
        AbstractC2855l.g(uid, "uid");
        AbstractC2855l.g(actionId, "actionId");
        sendReturn(K.l(t.a(NotificationsService.EVENT_TYPE_KEY, NATIVE_ACTION_RESULT), t.a("data", K.l(t.a("uid", uid), t.a("actionId", actionId), t.a("error", K.f(t.a("message", String.valueOf(exception))))))));
    }

    public final void sendReturn(Map<String, ? extends Object> data) {
        AbstractC2855l.g(data, "data");
        String strR = new com.google.gson.d().r(K.f(t.a("detail", data)));
        AbstractC2855l.f(strR, "toJson(...)");
        sendReturn(strR);
    }

    public final void sendReturn(String value) {
        AbstractC2855l.g(value, "value");
        final String str = "\n            ;\n            (function() {\n                try {\n                    console.log(\"received\", " + value + ")\n                    window.dispatchEvent(new CustomEvent(\"$$dom_event\", " + value + "));\n                } catch (e) {\n                    console.log('error', e)\n                }\n            })();\n            true;\n            ";
        this.webView.post(new Runnable() { // from class: expo.modules.logbox.g
            @Override // java.lang.Runnable
            public final void run() {
                ExpoLogBoxWebViewWrapper.sendReturn$lambda$2(this.f26651g, str);
            }
        });
    }
}
