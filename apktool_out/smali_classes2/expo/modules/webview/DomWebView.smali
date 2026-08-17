.class public final Lexpo/modules/webview/DomWebView;
.super Lexpo/modules/kotlin/views/ExpoView;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u000c\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00152\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0011\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'J#\u0010-\u001a\u00020,2\u0008\u0010)\u001a\u0004\u0018\u00010(2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010/\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u0010\u000bR\u001b\u00103\u001a\u00060\u000fj\u0002`28\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109R\"\u0010:\u001a\u00020,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R\"\u0010@\u001a\u00020,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010;\u001a\u0004\u0008A\u0010=\"\u0004\u0008B\u0010?R\u0016\u0010C\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010;R!\u0010J\u001a\u0008\u0012\u0004\u0012\u00020E0D8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010I\u00a8\u0006K"
    }
    d2 = {
        "Lexpo/modules/webview/DomWebView;",
        "Lexpo/modules/kotlin/views/ExpoView;",
        "Landroid/view/View$OnTouchListener;",
        "Landroid/content/Context;",
        "context",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V",
        "Landroid/webkit/WebView;",
        "createWebView",
        "()Landroid/webkit/WebView;",
        "expo/modules/webview/DomWebView$createWebViewClient$1",
        "createWebViewClient",
        "()Lexpo/modules/webview/DomWebView$createWebViewClient$1;",
        "",
        "deferredId",
        "",
        "source",
        "nativeJsiEvalSync",
        "(ILjava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "Li7/B;",
        "reload",
        "()V",
        "Lexpo/modules/webview/DomWebViewSource;",
        "setSource",
        "(Lexpo/modules/webview/DomWebViewSource;)V",
        "script",
        "setInjectedJSBeforeContentLoaded",
        "(Ljava/lang/String;)V",
        "injectJavaScript",
        "message",
        "dispatchMessageEvent",
        "data",
        "evalSync",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lexpo/modules/webview/ScrollToParam;",
        "param",
        "scrollTo",
        "(Lexpo/modules/webview/ScrollToParam;)V",
        "Landroid/view/View;",
        "view",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouch",
        "(Landroid/view/View;Landroid/view/MotionEvent;)Z",
        "webView",
        "Landroid/webkit/WebView;",
        "getWebView",
        "Lexpo/modules/webview/WebViewId;",
        "webViewId",
        "I",
        "getWebViewId",
        "()I",
        "Lexpo/modules/webview/DomWebViewSource;",
        "injectedJSBeforeContentLoaded",
        "Ljava/lang/String;",
        "webviewDebuggingEnabled",
        "Z",
        "getWebviewDebuggingEnabled",
        "()Z",
        "setWebviewDebuggingEnabled",
        "(Z)V",
        "nestedScrollEnabled",
        "getNestedScrollEnabled",
        "setNestedScrollEnabled",
        "needsResetupScripts",
        "Lexpo/modules/kotlin/viewevent/ViewEventCallback;",
        "Lexpo/modules/webview/OnMessageEvent;",
        "onMessage$delegate",
        "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;",
        "getOnMessage",
        "()Lexpo/modules/kotlin/viewevent/ViewEventCallback;",
        "onMessage",
        "expo-dom-webview_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[LC7/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LC7/k;"
        }
    .end annotation
.end field


# instance fields
.field private injectedJSBeforeContentLoaded:Ljava/lang/String;

.field private needsResetupScripts:Z

.field private nestedScrollEnabled:Z

.field private final onMessage$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private source:Lexpo/modules/webview/DomWebViewSource;

.field private final webView:Landroid/webkit/WebView;

.field private final webViewId:I

.field private webviewDebuggingEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, Lexpo/modules/webview/DomWebView;

    .line 4
    .line 5
    const-string v2, "onMessage"

    .line 6
    .line 7
    const-string v3, "getOnMessage()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/v;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [LC7/k;

    .line 19
    .line 20
    aput-object v0, v1, v4

    .line 21
    .line 22
    sput-object v1, Lexpo/modules/webview/DomWebView;->$$delegatedProperties:[LC7/k;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/views/ExpoView;-><init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lexpo/modules/webview/DomWebViewRegistry;->INSTANCE:Lexpo/modules/webview/DomWebViewRegistry;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lexpo/modules/webview/DomWebViewRegistry;->add(Lexpo/modules/webview/DomWebView;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lexpo/modules/webview/DomWebView;->webViewId:I

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lexpo/modules/webview/DomWebView;->nestedScrollEnabled:Z

    .line 24
    .line 25
    new-instance p1, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {p1, p0, p2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lexpo/modules/webview/DomWebView;->onMessage$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 32
    .line 33
    invoke-direct {p0}, Lexpo/modules/webview/DomWebView;->createWebView()Landroid/webkit/WebView;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 38
    .line 39
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    const/4 v0, -0x1

    .line 42
    invoke-direct {p2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic access$getInjectedJSBeforeContentLoaded$p(Lexpo/modules/webview/DomWebView;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/webview/DomWebView;->injectedJSBeforeContentLoaded:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$nativeJsiEvalSync(Lexpo/modules/webview/DomWebView;ILjava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/webview/DomWebView;->nativeJsiEvalSync(ILjava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/webview/DomWebView;->injectJavaScript$lambda$1(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/webview/DomWebView;->dispatchMessageEvent$lambda$2(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final createWebView()Landroid/webkit/WebView;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/webkit/WebView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lexpo/modules/webview/DomWebView;->createWebViewClient()Lexpo/modules/webview/DomWebView$createWebViewClient$1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lexpo/modules/webview/RNCWebViewBridge;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lexpo/modules/webview/RNCWebViewBridge;-><init>(Lexpo/modules/webview/DomWebView;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "ReactNativeWebView"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lexpo/modules/webview/DomWebViewBridge;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lexpo/modules/webview/DomWebViewBridge;-><init>(Lexpo/modules/webview/DomWebView;)V

    .line 42
    .line 43
    .line 44
    const-string v2, "ExpoDomWebViewBridge"

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method private final createWebViewClient()Lexpo/modules/webview/DomWebView$createWebViewClient$1;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/webview/DomWebView$createWebViewClient$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lexpo/modules/webview/DomWebView$createWebViewClient$1;-><init>(Lexpo/modules/webview/DomWebView;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic d(Lexpo/modules/webview/ScrollToParam;Lexpo/modules/webview/DomWebView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/webview/DomWebView;->scrollTo$lambda$3(Lexpo/modules/webview/ScrollToParam;Lexpo/modules/webview/DomWebView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final dispatchMessageEvent$lambda$2(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/webview/OnMessageEvent;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move-object v1, v2

    .line 14
    :cond_0
    iget-object v3, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object v2, v3

    .line 24
    :goto_0
    invoke-direct {v0, v1, v2, p1}, Lexpo/modules/webview/OnMessageEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lexpo/modules/webview/DomWebView;->getOnMessage()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0, v0}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final getOnMessage()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lexpo/modules/webview/OnMessageEvent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/webview/DomWebView;->onMessage$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/webview/DomWebView;->$$delegatedProperties:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;LC7/k;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method private static final injectJavaScript$lambda$1(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final nativeJsiEvalSync(ILjava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ln7/l;

    .line 2
    .line 3
    invoke-static {p3}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ln7/l;-><init>(Ln7/f;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/ExpoView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;

    .line 15
    .line 16
    invoke-direct {v2, p1, p0, p2, v0}, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;-><init>(ILexpo/modules/webview/DomWebView;Ljava/lang/String;Ln7/f;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lexpo/modules/kotlin/AppContext;->executeOnJavaScriptThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ln7/l;->a()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    if-ne p1, p2, :cond_0

    .line 31
    .line 32
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object p1
.end method

.method private static final scrollTo$lambda$3(Lexpo/modules/webview/ScrollToParam;Lexpo/modules/webview/DomWebView;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lexpo/modules/webview/ScrollToParam;->getAnimated()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 8
    .line 9
    invoke-virtual {p0}, Lexpo/modules/webview/ScrollToParam;->getX()D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-int v0, v0

    .line 14
    invoke-virtual {p0}, Lexpo/modules/webview/ScrollToParam;->getY()D

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    double-to-int p0, v1

    .line 19
    invoke-virtual {p1, v0, p0}, Landroid/view/View;->scrollTo(II)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p1, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p0}, Lexpo/modules/webview/ScrollToParam;->getX()D

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    double-to-int v2, v2

    .line 34
    filled-new-array {v1, v2}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "scrollX"

    .line 39
    .line 40
    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-wide/16 v1, 0xfa

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    .line 49
    iget-object p1, p1, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {p0}, Lexpo/modules/webview/ScrollToParam;->getY()D

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    double-to-int p0, v4

    .line 60
    filled-new-array {v3, p0}, [I

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v3, "scrollY"

    .line 65
    .line 66
    invoke-static {p1, v3, p0}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 77
    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final dispatchMessageEvent(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 7
    .line 8
    new-instance v1, Lexpo/modules/webview/c;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lexpo/modules/webview/c;-><init>(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final evalSync(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "deferredId"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const-string v1, "source"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lexpo/modules/webview/DomWebView$evalSync$1;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, p1, v0, v2}, Lexpo/modules/webview/DomWebView$evalSync$1;-><init>(Lexpo/modules/webview/DomWebView;ILjava/lang/String;Ln7/f;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    invoke-static {v2, v1, p1, v2}, LR8/i;->f(Ln7/j;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    return-object p1
.end method

.method public final getNestedScrollEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/webview/DomWebView;->nestedScrollEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getWebView()Landroid/webkit/WebView;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWebViewId()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/webview/DomWebView;->webViewId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWebviewDebuggingEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/webview/DomWebView;->webviewDebuggingEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final injectJavaScript(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "script"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 7
    .line 8
    new-instance v1, Lexpo/modules/webview/b;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lexpo/modules/webview/b;-><init>(Lexpo/modules/webview/DomWebView;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lexpo/modules/webview/DomWebView;->nestedScrollEnabled:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final reload()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lexpo/modules/webview/DomWebView;->webviewDebuggingEnabled:Z

    .line 2
    .line 3
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/webview/DomWebView;->source:Lexpo/modules/webview/DomWebViewSource;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lexpo/modules/webview/DomWebViewSource;->getUri()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-boolean v0, p0, Lexpo/modules/webview/DomWebView;->needsResetupScripts:Z

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lexpo/modules/webview/DomWebView;->needsResetupScripts:Z

    .line 40
    .line 41
    iget-object v0, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final scrollTo(Lexpo/modules/webview/ScrollToParam;)V
    .locals 2

    .line 1
    const-string v0, "param"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/webview/DomWebView;->webView:Landroid/webkit/WebView;

    .line 7
    .line 8
    new-instance v1, Lexpo/modules/webview/a;

    .line 9
    .line 10
    invoke-direct {v1, p1, p0}, Lexpo/modules/webview/a;-><init>(Lexpo/modules/webview/ScrollToParam;Lexpo/modules/webview/DomWebView;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setInjectedJSBeforeContentLoaded(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "(function() { "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, "; })();true;"

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 34
    :goto_1
    iput-object p1, p0, Lexpo/modules/webview/DomWebView;->injectedJSBeforeContentLoaded:Ljava/lang/String;

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lexpo/modules/webview/DomWebView;->needsResetupScripts:Z

    .line 38
    .line 39
    return-void
.end method

.method public final setNestedScrollEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/webview/DomWebView;->nestedScrollEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSource(Lexpo/modules/webview/DomWebViewSource;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/webview/DomWebView;->source:Lexpo/modules/webview/DomWebViewSource;

    .line 7
    .line 8
    return-void
.end method

.method public final setWebviewDebuggingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/webview/DomWebView;->webviewDebuggingEnabled:Z

    .line 2
    .line 3
    return-void
.end method
