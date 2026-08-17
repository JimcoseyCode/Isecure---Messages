.class public final Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$webView$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;-><init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;Ljava/util/Map;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "expo/modules/logbox/ExpoLogBoxWebViewWrapper$webView$1$1",
        "",
        "",
        "rawMessage",
        "Li7/B;",
        "postMessage",
        "(Ljava/lang/String;)V",
        "expo-log-box_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;


# direct methods
.method constructor <init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$webView$1$1;->this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final postMessage(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "rawMessage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$webView$1$1;->this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;->access$processMessageFromWebView(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
