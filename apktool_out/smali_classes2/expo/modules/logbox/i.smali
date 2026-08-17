.class public final synthetic Lexpo/modules/logbox/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic g:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

.field public final synthetic h:Lcom/google/gson/k;

.field public final synthetic i:Lcom/google/gson/k;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/logbox/i;->g:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/logbox/i;->h:Lcom/google/gson/k;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/logbox/i;->i:Lcom/google/gson/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/i;->g:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/logbox/i;->h:Lcom/google/gson/k;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/logbox/i;->i:Lcom/google/gson/k;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Exception;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->t(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/Exception;)Li7/B;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
