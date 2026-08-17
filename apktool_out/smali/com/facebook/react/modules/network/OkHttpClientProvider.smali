.class public final Lcom/facebook/react/modules/network/OkHttpClientProvider;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0013J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000b\"\u0004\u0008\u001a\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010\u0008\u00a8\u0006 "
    }
    d2 = {
        "Lcom/facebook/react/modules/network/OkHttpClientProvider;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/react/modules/network/OkHttpClientFactory;",
        "factory",
        "Li7/B;",
        "setOkHttpClientFactory",
        "(Lcom/facebook/react/modules/network/OkHttpClientFactory;)V",
        "Le9/z;",
        "getOkHttpClient",
        "()Le9/z;",
        "createClient",
        "Landroid/content/Context;",
        "context",
        "(Landroid/content/Context;)Le9/z;",
        "Le9/z$a;",
        "createClientBuilder",
        "()Le9/z$a;",
        "(Landroid/content/Context;)Le9/z$a;",
        "",
        "cacheSize",
        "(Landroid/content/Context;I)Le9/z$a;",
        "client",
        "Le9/z;",
        "getClient$ReactAndroid_release",
        "setClient$ReactAndroid_release",
        "(Le9/z;)V",
        "Lcom/facebook/react/modules/network/OkHttpClientFactory;",
        "getFactory$ReactAndroid_release",
        "()Lcom/facebook/react/modules/network/OkHttpClientFactory;",
        "setFactory$ReactAndroid_release",
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
.field public static final INSTANCE:Lcom/facebook/react/modules/network/OkHttpClientProvider;

.field private static client:Le9/z;

.field private static factory:Lcom/facebook/react/modules/network/OkHttpClientFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/modules/network/OkHttpClientProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->INSTANCE:Lcom/facebook/react/modules/network/OkHttpClientProvider;

    .line 7
    .line 8
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

.method public static final createClient()Le9/z;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->factory:Lcom/facebook/react/modules/network/OkHttpClientFactory;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/facebook/react/modules/network/OkHttpClientFactory;->createNewNetworkModuleClient()Le9/z;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-static {}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->createClientBuilder()Le9/z$a;

    move-result-object v0

    invoke-virtual {v0}, Le9/z$a;->c()Le9/z;

    move-result-object v0

    return-object v0
.end method

.method public static final createClient(Landroid/content/Context;)Le9/z;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->factory:Lcom/facebook/react/modules/network/OkHttpClientFactory;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/facebook/react/modules/network/OkHttpClientFactory;->createNewNetworkModuleClient()Le9/z;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->createClientBuilder(Landroid/content/Context;)Le9/z$a;

    move-result-object p0

    invoke-virtual {p0}, Le9/z$a;->c()Le9/z;

    move-result-object p0

    return-object p0
.end method

.method public static final createClientBuilder()Le9/z$a;
    .locals 4

    .line 1
    new-instance v0, Le9/z$a;

    invoke-direct {v0}, Le9/z$a;-><init>()V

    .line 2
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3, v1}, Le9/z$a;->f(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0, v2, v3, v1}, Le9/z$a;->P(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    move-result-object v0

    .line 4
    invoke-virtual {v0, v2, v3, v1}, Le9/z$a;->Q(JLjava/util/concurrent/TimeUnit;)Le9/z$a;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/react/modules/network/ReactCookieJarContainer;

    invoke-direct {v1}, Lcom/facebook/react/modules/network/ReactCookieJarContainer;-><init>()V

    invoke-virtual {v0, v1}, Le9/z$a;->g(Le9/n;)Le9/z$a;

    move-result-object v0

    return-object v0
.end method

.method public static final createClientBuilder(Landroid/content/Context;)Le9/z$a;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0xa00000

    .line 6
    invoke-static {p0, v0}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->createClientBuilder(Landroid/content/Context;I)Le9/z$a;

    move-result-object p0

    return-object p0
.end method

.method public static final createClientBuilder(Landroid/content/Context;I)Le9/z$a;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->createClientBuilder()Le9/z$a;

    move-result-object v0

    if-nez p1, :cond_0

    return-object v0

    .line 8
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v2, "http-cache"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 9
    new-instance p0, Le9/c;

    int-to-long v2, p1

    invoke-direct {p0, v1, v2, v3}, Le9/c;-><init>(Ljava/io/File;J)V

    .line 10
    invoke-virtual {v0, p0}, Le9/z$a;->d(Le9/c;)Le9/z$a;

    move-result-object p0

    return-object p0
.end method

.method public static final getOkHttpClient()Le9/z;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->client:Le9/z;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->createClient()Le9/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->client:Le9/z;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public static final setOkHttpClientFactory(Lcom/facebook/react/modules/network/OkHttpClientFactory;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->factory:Lcom/facebook/react/modules/network/OkHttpClientFactory;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final getClient$ReactAndroid_release()Le9/z;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->client:Le9/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFactory$ReactAndroid_release()Lcom/facebook/react/modules/network/OkHttpClientFactory;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/network/OkHttpClientProvider;->factory:Lcom/facebook/react/modules/network/OkHttpClientFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setClient$ReactAndroid_release(Le9/z;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/facebook/react/modules/network/OkHttpClientProvider;->client:Le9/z;

    .line 2
    .line 3
    return-void
.end method

.method public final setFactory$ReactAndroid_release(Lcom/facebook/react/modules/network/OkHttpClientFactory;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/facebook/react/modules/network/OkHttpClientProvider;->factory:Lcom/facebook/react/modules/network/OkHttpClientFactory;

    .line 2
    .line 3
    return-void
.end method
