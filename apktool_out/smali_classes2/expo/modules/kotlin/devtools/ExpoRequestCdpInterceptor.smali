.class public final Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00112\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;",
        "Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;",
        "<init>",
        "()V",
        "Lexpo/modules/kotlin/devtools/cdp/Event;",
        "event",
        "Li7/B;",
        "dispatchEvent",
        "(Lexpo/modules/kotlin/devtools/cdp/Event;)V",
        "Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;",
        "delegate",
        "setDelegate",
        "(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;)V",
        "",
        "requestId",
        "Le9/B;",
        "request",
        "Le9/D;",
        "redirectResponse",
        "willSendRequest",
        "(Ljava/lang/String;Le9/B;Le9/D;)V",
        "response",
        "Le9/E;",
        "body",
        "didReceiveResponse",
        "(Ljava/lang/String;Le9/B;Le9/D;Le9/E;)V",
        "Ljava/lang/ref/WeakReference;",
        "Ljava/lang/ref/WeakReference;",
        "LR8/N;",
        "coroutineScope",
        "LR8/N;",
        "getCoroutineScope$expo_modules_core_release",
        "()LR8/N;",
        "setCoroutineScope$expo_modules_core_release",
        "(LR8/N;)V",
        "Delegate",
        "expo-modules-core_release"
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
.field public static final INSTANCE:Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;

.field private static coroutineScope:LR8/N;

.field private static delegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->INSTANCE:Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->delegate:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-static {}, LR8/d0;->a()LR8/J;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LR8/O;->a(Ln7/j;)LR8/N;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->coroutineScope:LR8/N;

    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getDelegate$p()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->delegate:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setDelegate$p(Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    sput-object p0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->delegate:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-void
.end method

.method private final dispatchEvent(Lexpo/modules/kotlin/devtools/cdp/Event;)V
    .locals 6

    .line 1
    sget-object v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->coroutineScope:LR8/N;

    .line 2
    .line 3
    new-instance v3, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$dispatchEvent$1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p1, v1}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$dispatchEvent$1;-><init>(Lexpo/modules/kotlin/devtools/cdp/Event;Ln7/f;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public didReceiveResponse(Ljava/lang/String;Le9/B;Le9/D;Le9/E;)V
    .locals 4

    .line 1
    const-string v0, "requestId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "request"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "response"

    .line 12
    .line 13
    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Ljava/math/BigDecimal;

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    long-to-double v0, v0

    .line 23
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    div-double/2addr v0, v2

    .line 29
    invoke-direct {p2, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 34
    .line 35
    invoke-virtual {p2, v0, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    new-instance v0, Lexpo/modules/kotlin/devtools/cdp/ResponseReceivedParams;

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p2, p1, p3}, Lexpo/modules/kotlin/devtools/cdp/ResponseReceivedParams;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;Le9/D;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lexpo/modules/kotlin/devtools/cdp/Event;

    .line 48
    .line 49
    const-string v2, "Network.responseReceived"

    .line 50
    .line 51
    invoke-direct {v1, v2, v0}, Lexpo/modules/kotlin/devtools/cdp/Event;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v1}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->dispatchEvent(Lexpo/modules/kotlin/devtools/cdp/Event;)V

    .line 55
    .line 56
    .line 57
    if-eqz p4, :cond_0

    .line 58
    .line 59
    new-instance v0, Lexpo/modules/kotlin/devtools/cdp/ExpoReceivedResponseBodyParams;

    .line 60
    .line 61
    invoke-direct {v0, p1, p4}, Lexpo/modules/kotlin/devtools/cdp/ExpoReceivedResponseBodyParams;-><init>(Ljava/lang/String;Le9/E;)V

    .line 62
    .line 63
    .line 64
    new-instance p4, Lexpo/modules/kotlin/devtools/cdp/Event;

    .line 65
    .line 66
    const-string v1, "Expo(Network.receivedResponseBody)"

    .line 67
    .line 68
    invoke-direct {p4, v1, v0}, Lexpo/modules/kotlin/devtools/cdp/Event;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, p4}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->dispatchEvent(Lexpo/modules/kotlin/devtools/cdp/Event;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    new-instance p4, Lexpo/modules/kotlin/devtools/cdp/LoadingFinishedParams;

    .line 75
    .line 76
    invoke-direct {p4, p2, p1, p3}, Lexpo/modules/kotlin/devtools/cdp/LoadingFinishedParams;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;Le9/D;)V

    .line 77
    .line 78
    .line 79
    new-instance p1, Lexpo/modules/kotlin/devtools/cdp/Event;

    .line 80
    .line 81
    const-string p2, "Network.loadingFinished"

    .line 82
    .line 83
    invoke-direct {p1, p2, p4}, Lexpo/modules/kotlin/devtools/cdp/Event;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->dispatchEvent(Lexpo/modules/kotlin/devtools/cdp/Event;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final getCoroutineScope$expo_modules_core_release()LR8/N;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->coroutineScope:LR8/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setCoroutineScope$expo_modules_core_release(LR8/N;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-object p1, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->coroutineScope:LR8/N;

    .line 7
    .line 8
    return-void
.end method

.method public final setDelegate(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;)V
    .locals 6

    .line 1
    sget-object v0, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->coroutineScope:LR8/N;

    .line 2
    .line 3
    new-instance v3, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p1, v1}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$setDelegate$1;-><init>(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;Ln7/f;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public willSendRequest(Ljava/lang/String;Le9/B;Le9/D;)V
    .locals 5

    .line 1
    const-string v0, "requestId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "request"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/math/BigDecimal;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    long-to-double v1, v1

    .line 18
    const-wide v3, 0x408f400000000000L    # 1000.0

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-double/2addr v1, v3

    .line 24
    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v0, p1, p2, p3}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;Le9/D;)V

    .line 40
    .line 41
    .line 42
    new-instance p3, Lexpo/modules/kotlin/devtools/cdp/Event;

    .line 43
    .line 44
    const-string v2, "Network.requestWillBeSent"

    .line 45
    .line 46
    invoke-direct {p3, v2, v1}, Lexpo/modules/kotlin/devtools/cdp/Event;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p3}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->dispatchEvent(Lexpo/modules/kotlin/devtools/cdp/Event;)V

    .line 50
    .line 51
    .line 52
    new-instance p3, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;

    .line 53
    .line 54
    invoke-direct {p3, v0, p1, p2}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;-><init>(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Lexpo/modules/kotlin/devtools/cdp/Event;

    .line 58
    .line 59
    const-string p2, "Network.requestWillBeSentExtraInfo"

    .line 60
    .line 61
    invoke-direct {p1, p2, p3}, Lexpo/modules/kotlin/devtools/cdp/Event;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;->dispatchEvent(Lexpo/modules/kotlin/devtools/cdp/Event;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
