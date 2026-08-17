.class public final Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0007R\u001a\u0010\u000c\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;",
        "",
        "<init>",
        "()V",
        "",
        "host",
        "httpScheme$ReactAndroid_release",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "httpScheme",
        "wsScheme$ReactAndroid_release",
        "wsScheme",
        "Le9/z;",
        "httpClient",
        "Le9/z;",
        "getHttpClient$ReactAndroid_release",
        "()Le9/z;",
        "websocketClient",
        "getWebsocketClient$ReactAndroid_release",
        "ReactAndroid_release"
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
.field public static final INSTANCE:Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;

.field private static final httpClient:Le9/z;

.field private static final websocketClient:Le9/z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;->INSTANCE:Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;

    .line 7
    .line 8
    invoke-static {}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->getOkHttpClient()Le9/z;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Le9/z;->C()Le9/z$a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    const-wide/16 v2, 0x5

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3, v1}, Le9/z$a;->f(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    invoke-virtual {v0, v3, v4, v2}, Le9/z$a;->Q(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    invoke-virtual {v0, v3, v4, v2}, Le9/z$a;->P(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Le9/z$a;->c()Le9/z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;->httpClient:Le9/z;

    .line 43
    .line 44
    invoke-virtual {v0}, Le9/z;->C()Le9/z$a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-wide/16 v2, 0xa

    .line 49
    .line 50
    invoke-virtual {v0, v2, v3, v1}, Le9/z$a;->f(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v2, v3, v1}, Le9/z$a;->Q(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Le9/z$a;->c()Le9/z;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;->websocketClient:Le9/z;

    .line 63
    .line 64
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


# virtual methods
.method public final getHttpClient$ReactAndroid_release()Le9/z;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;->httpClient:Le9/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWebsocketClient$ReactAndroid_release()Le9/z;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;->websocketClient:Le9/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final httpScheme$ReactAndroid_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, ":443"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v3, v0, v1}, LP8/q;->w(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p1, "https"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string p1, "http"

    .line 21
    .line 22
    return-object p1
.end method

.method public final wsScheme$ReactAndroid_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, ":443"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v3, v0, v1}, LP8/q;->w(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p1, "wss"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string p1, "ws"

    .line 21
    .line 22
    return-object p1
.end method
