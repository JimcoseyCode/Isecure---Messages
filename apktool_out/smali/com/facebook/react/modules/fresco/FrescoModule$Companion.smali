.class public final Lcom/facebook/react/modules/fresco/FrescoModule$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/fresco/FrescoModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/facebook/react/modules/fresco/FrescoModule$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/react/bridge/ReactContext;",
        "context",
        "LY2/u;",
        "getDefaultConfig",
        "(Lcom/facebook/react/bridge/ReactContext;)LY2/u;",
        "",
        "hasBeenInitialized",
        "()Z",
        "LY2/u$a;",
        "getDefaultConfigBuilder",
        "(Lcom/facebook/react/bridge/ReactContext;)LY2/u$a;",
        "",
        "NAME",
        "Ljava/lang/String;",
        "Z",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/modules/fresco/FrescoModule$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getDefaultConfig(Lcom/facebook/react/modules/fresco/FrescoModule$Companion;Lcom/facebook/react/bridge/ReactContext;)LY2/u;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/fresco/FrescoModule$Companion;->getDefaultConfig(Lcom/facebook/react/bridge/ReactContext;)LY2/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getDefaultConfig(Lcom/facebook/react/bridge/ReactContext;)LY2/u;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/modules/fresco/FrescoModule$Companion;->getDefaultConfigBuilder(Lcom/facebook/react/bridge/ReactContext;)LY2/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LY2/u$a;->a()LY2/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method


# virtual methods
.method public final getDefaultConfigBuilder(Lcom/facebook/react/bridge/ReactContext;)LY2/u$a;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/facebook/react/modules/fresco/SystraceRequestListener;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/facebook/react/modules/fresco/SystraceRequestListener;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->createClient()Le9/z;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Le9/z;->c()Le9/n;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer"

    .line 28
    .line 29
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v2, Lcom/facebook/react/modules/network/CookieJarContainer;

    .line 33
    .line 34
    new-instance v3, Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 35
    .line 36
    invoke-direct {v3}, Lcom/facebook/react/modules/network/ForwardingCookieHandler;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v4, Le9/w;

    .line 40
    .line 41
    invoke-direct {v4, v3}, Le9/w;-><init>(Ljava/net/CookieHandler;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, v4}, Lcom/facebook/react/modules/network/CookieJarContainer;->setCookieJar(Le9/n;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v2, "getApplicationContext(...)"

    .line 52
    .line 53
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v1}, Lcom/facebook/imagepipeline/backends/okhttp3/a;->a(Landroid/content/Context;Le9/z;)LY2/u$a;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v2, Lcom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher;

    .line 61
    .line 62
    invoke-direct {v2, v1}, Lcom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher;-><init>(Le9/z;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, LY2/u$a;->S(Lcom/facebook/imagepipeline/producers/X;)LY2/u$a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v1, LY2/n;->h:LY2/n;

    .line 70
    .line 71
    invoke-virtual {p1, v1}, LY2/u$a;->R(LY2/n;)LY2/u$a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v0}, LY2/u$a;->T(Ljava/util/Set;)LY2/u$a;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, LY2/u$a;->b()LY2/x$a;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-virtual {v0, v1}, LY2/x$a;->d(Z)LY2/x$a;

    .line 85
    .line 86
    .line 87
    return-object p1
.end method

.method public final hasBeenInitialized()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/modules/fresco/FrescoModule;->access$getHasBeenInitialized$cp()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
