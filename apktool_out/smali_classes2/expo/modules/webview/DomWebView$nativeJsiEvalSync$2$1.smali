.class final Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/webview/DomWebView;->nativeJsiEvalSync(ILjava/lang/String;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $continuation:Ln7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/f;"
        }
    .end annotation
.end field

.field final synthetic $deferredId:I

.field final synthetic $source:Ljava/lang/String;

.field final synthetic this$0:Lexpo/modules/webview/DomWebView;


# direct methods
.method constructor <init>(ILexpo/modules/webview/DomWebView;Ljava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lexpo/modules/webview/DomWebView;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput p1, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->$deferredId:I

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->this$0:Lexpo/modules/webview/DomWebView;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->$source:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->$continuation:Ln7/f;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->$deferredId:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    const/4 v5, 0x4

    .line 8
    const/4 v6, 0x0

    .line 9
    const-string v1, "\n// browserScripts/NativeEvalWrapper/index.ts\n(function() {\n  const result = \"%%SOURCE%%\";\n  if (result instanceof Promise) {\n    result.then((resolved) => {\n      const resolvedString = JSON.stringify(resolved);\n      const script = \'window.ExpoDomWebView.resolveDeferred(\"%%DEFERRED_ID%%\", \' + resolvedString + \")\";\n      globalThis.expo.modules.ExpoDomWebViewModule.evalJsForWebViewAsync(\"%%WEBVIEW_ID%%\", script);\n    }).catch((error) => {\n      const errorString = JSON.stringify(error);\n      const script = \'window.ExpoDomWebView.rejectDeferred(\"%%DEFERRED_ID%%\", \' + errorString + \")\";\n      globalThis.expo.modules.ExpoDomWebViewModule.evalJsForWebViewAsync(\"%%WEBVIEW_ID%%\", script);\n    });\n    return JSON.stringify({ isPromise: true, value: null });\n  } else {\n    return JSON.stringify({ isPromise: false, value: result });\n  }\n})();\n\n"

    .line 10
    .line 11
    const-string v2, "\"%%DEFERRED_ID%%\""

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static/range {v1 .. v6}, LP8/q;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    iget-object v0, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->this$0:Lexpo/modules/webview/DomWebView;

    .line 19
    .line 20
    invoke-virtual {v0}, Lexpo/modules/webview/DomWebView;->getWebViewId()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    const/4 v11, 0x4

    .line 29
    const/4 v12, 0x0

    .line 30
    const-string v8, "\"%%WEBVIEW_ID%%\""

    .line 31
    .line 32
    const/4 v10, 0x0

    .line 33
    invoke-static/range {v7 .. v12}, LP8/q;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v2, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->$source:Ljava/lang/String;

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    const/4 v5, 0x0

    .line 41
    const-string v1, "\"%%SOURCE%%\""

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static/range {v0 .. v5}, LP8/q;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :try_start_0
    iget-object v1, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->this$0:Lexpo/modules/webview/DomWebView;

    .line 49
    .line 50
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/ExpoView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lexpo/modules/kotlin/AppContext;->getRuntime()Lexpo/modules/kotlin/runtime/MainRuntime;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/runtime/MainRuntime;->eval(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->$continuation:Ln7/f;

    .line 63
    .line 64
    sget-object v2, Li7/o;->h:Li7/o$a;

    .line 65
    .line 66
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptValue;->getString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v1, v0}, Ln7/f;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_0
    move-exception v0

    .line 79
    iget-object v1, p0, Lexpo/modules/webview/DomWebView$nativeJsiEvalSync$2$1;->$continuation:Ln7/f;

    .line 80
    .line 81
    sget-object v2, Li7/o;->h:Li7/o$a;

    .line 82
    .line 83
    invoke-static {v0}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v1, v0}, Ln7/f;->resumeWith(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method
