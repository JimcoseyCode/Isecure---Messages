.class public final Lexpo/modules/fetch/ExpoFetchModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/fetch/ExpoFetchModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u000c\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\t\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\t\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lexpo/modules/fetch/ExpoFetchModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "definition",
        "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "Le9/z;",
        "client$delegate",
        "Lkotlin/Lazy;",
        "getClient",
        "()Le9/z;",
        "client",
        "Lcom/facebook/react/modules/network/ForwardingCookieHandler;",
        "cookieHandler$delegate",
        "getCookieHandler",
        "()Lcom/facebook/react/modules/network/ForwardingCookieHandler;",
        "cookieHandler",
        "Lcom/facebook/react/modules/network/CookieJarContainer;",
        "cookieJarContainer$delegate",
        "getCookieJarContainer",
        "()Lcom/facebook/react/modules/network/CookieJarContainer;",
        "cookieJarContainer",
        "LR8/N;",
        "moduleCoroutineScope$delegate",
        "getModuleCoroutineScope",
        "()LR8/N;",
        "moduleCoroutineScope",
        "Lcom/facebook/react/bridge/ReactContext;",
        "getReactContext",
        "()Lcom/facebook/react/bridge/ReactContext;",
        "reactContext",
        "Companion",
        "expo_release"
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
.field public static final Companion:Lexpo/modules/fetch/ExpoFetchModule$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final client$delegate:Lkotlin/Lazy;

.field private final cookieHandler$delegate:Lkotlin/Lazy;

.field private final cookieJarContainer$delegate:Lkotlin/Lazy;

.field private final moduleCoroutineScope$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/fetch/ExpoFetchModule$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/fetch/ExpoFetchModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/fetch/ExpoFetchModule;->Companion:Lexpo/modules/fetch/ExpoFetchModule$Companion;

    .line 8
    .line 9
    const-class v0, Lexpo/modules/fetch/ExpoFetchModule;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lexpo/modules/fetch/ExpoFetchModule;->TAG:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/fetch/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lexpo/modules/fetch/a;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->client$delegate:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, Lexpo/modules/fetch/b;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lexpo/modules/fetch/b;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->cookieHandler$delegate:Lkotlin/Lazy;

    .line 25
    .line 26
    new-instance v0, Lexpo/modules/fetch/c;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lexpo/modules/fetch/c;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->cookieJarContainer$delegate:Lkotlin/Lazy;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/fetch/d;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lexpo/modules/fetch/d;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->moduleCoroutineScope$delegate:Lkotlin/Lazy;

    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic access$getClient(Lexpo/modules/fetch/ExpoFetchModule;)Le9/z;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getClient()Le9/z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getCookieHandler(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/ForwardingCookieHandler;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getCookieHandler()Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getCookieJarContainer(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/CookieJarContainer;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getCookieJarContainer()Lcom/facebook/react/modules/network/CookieJarContainer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getModuleCoroutineScope(Lexpo/modules/fetch/ExpoFetchModule;)LR8/N;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getModuleCoroutineScope()LR8/N;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/fetch/ExpoFetchModule;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/CookieJarContainer;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/fetch/ExpoFetchModule;->cookieJarContainer_delegate$lambda$2(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/CookieJarContainer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/ForwardingCookieHandler;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/fetch/ExpoFetchModule;->cookieHandler_delegate$lambda$1(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final client_delegate$lambda$0(Lexpo/modules/fetch/ExpoFetchModule;)Le9/z;
    .locals 2

    .line 1
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/facebook/react/modules/network/OkHttpClientProvider;->createClient(Landroid/content/Context;)Le9/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Le9/z;->C()Le9/z$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;

    .line 14
    .line 15
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v1, p0}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Le9/z$a;->a(Le9/v;)Le9/z$a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Le9/z$a;->c()Le9/z;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method private static final cookieHandler_delegate$lambda$1(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/ForwardingCookieHandler;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/network/ForwardingCookieHandler;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final cookieJarContainer_delegate$lambda$2(Lexpo/modules/fetch/ExpoFetchModule;)Lcom/facebook/react/modules/network/CookieJarContainer;
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/fetch/ExpoFetchModule;->getClient()Le9/z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Le9/z;->q()Le9/n;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p0, Lcom/facebook/react/modules/network/CookieJarContainer;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic d(Lexpo/modules/fetch/ExpoFetchModule;)Le9/z;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/fetch/ExpoFetchModule;->client_delegate$lambda$0(Lexpo/modules/fetch/ExpoFetchModule;)Le9/z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lexpo/modules/fetch/ExpoFetchModule;)LR8/N;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/fetch/ExpoFetchModule;->moduleCoroutineScope_delegate$lambda$3(Lexpo/modules/fetch/ExpoFetchModule;)LR8/N;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getClient()Le9/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->client$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Le9/z;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getCookieHandler()Lcom/facebook/react/modules/network/ForwardingCookieHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->cookieHandler$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/modules/network/ForwardingCookieHandler;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getCookieJarContainer()Lcom/facebook/react/modules/network/CookieJarContainer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->cookieJarContainer$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/modules/network/CookieJarContainer;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getModuleCoroutineScope()LR8/N;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/ExpoFetchModule;->moduleCoroutineScope$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LR8/N;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getReactContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    .line 21
    .line 22
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method private static final moduleCoroutineScope_delegate$lambda$3(Lexpo/modules/fetch/ExpoFetchModule;)LR8/N;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lexpo/modules/kotlin/AppContext;->getModulesQueue()LR8/N;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, LR8/N;->i()Ln7/j;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v0, LR8/M;

    .line 14
    .line 15
    const-string v1, "expo.modules.fetch.CoroutineScope"

    .line 16
    .line 17
    invoke-direct {v0, v1}, LR8/M;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v0}, Ln7/j;->X(Ln7/j;)Ln7/j;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, LR8/O;->a(Ln7/j;)LR8/N;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Lexpo/modules/fetch/NativeRequestInit;

    .line 4
    .line 5
    const-class v2, Ljava/net/URL;

    .line 6
    .line 7
    const-class v3, Li7/B;

    .line 8
    .line 9
    const-class v4, Lexpo/modules/kotlin/Promise;

    .line 10
    .line 11
    const-string v5, "constructor"

    .line 12
    .line 13
    const-string v6, "getSimpleName(...)"

    .line 14
    .line 15
    const-class v7, Ljava/lang/Integer;

    .line 16
    .line 17
    const-class v8, Ljava/util/List;

    .line 18
    .line 19
    const-class v9, Ljava/lang/Boolean;

    .line 20
    .line 21
    const-string v10, "get"

    .line 22
    .line 23
    const-class v11, Ljava/lang/Object;

    .line 24
    .line 25
    const-class v12, Lexpo/modules/fetch/NativeRequest;

    .line 26
    .line 27
    const-class v13, Ljava/lang/String;

    .line 28
    .line 29
    const-class v14, Lexpo/modules/fetch/NativeResponse;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v15

    .line 35
    move-object/from16 v16, v2

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v15, ".ModuleDefinition"

    .line 46
    .line 47
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    new-instance v15, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    move-object/from16 v17, v7

    .line 60
    .line 61
    const-string v7, "["

    .line 62
    .line 63
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v7, "ExpoModulesCore"

    .line 67
    .line 68
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v7, "] "

    .line 72
    .line 73
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2}, Ll1/a;->c(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :try_start_0
    new-instance v2, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 87
    .line 88
    invoke-direct {v2, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 89
    .line 90
    .line 91
    const-string v7, "ExpoFetchModule"

    .line 92
    .line 93
    invoke-virtual {v2, v7}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    sget-object v15, Lexpo/modules/kotlin/events/EventName;->MODULE_CREATE:Lexpo/modules/kotlin/events/EventName;

    .line 101
    .line 102
    move-object/from16 v18, v2

    .line 103
    .line 104
    new-instance v2, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 105
    .line 106
    move-object/from16 v19, v8

    .line 107
    .line 108
    new-instance v8, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$OnCreate$1;

    .line 109
    .line 110
    invoke-direct {v8, v1}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$OnCreate$1;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v2, v15, v8}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v7, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    sget-object v7, Lexpo/modules/kotlin/events/EventName;->MODULE_DESTROY:Lexpo/modules/kotlin/events/EventName;

    .line 124
    .line 125
    new-instance v8, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 126
    .line 127
    new-instance v15, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$OnDestroy$1;

    .line 128
    .line 129
    invoke-direct {v15, v1}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$OnDestroy$1;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {v8, v7, v15}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 139
    .line 140
    .line 141
    move-result-object v23

    .line 142
    new-instance v20, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 143
    .line 144
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    .line 145
    .line 146
    .line 147
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    const-string v7, "Required value was null."

    .line 149
    .line 150
    if-eqz v2, :cond_22

    .line 151
    .line 152
    :try_start_1
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 153
    .line 154
    .line 155
    move-result-object v21

    .line 156
    invoke-static/range {v23 .. v23}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v2, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 168
    .line 169
    new-instance v15, Lkotlin/Pair;

    .line 170
    .line 171
    move-object/from16 v22, v2

    .line 172
    .line 173
    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    move-object/from16 v26, v8

    .line 178
    .line 179
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-direct {v15, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    .line 193
    .line 194
    if-nez v2, :cond_0

    .line 195
    .line 196
    sget-object v2, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$Class$1;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$Class$1;

    .line 197
    .line 198
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 199
    .line 200
    move-object/from16 v27, v9

    .line 201
    .line 202
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    .line 203
    .line 204
    move-object/from16 v28, v11

    .line 205
    .line 206
    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    move-object/from16 v29, v7

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    invoke-direct {v9, v11, v7, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 214
    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    invoke-direct {v15, v9, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 218
    .line 219
    .line 220
    move-object/from16 v24, v15

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :catchall_0
    move-exception v0

    .line 224
    goto/16 :goto_a

    .line 225
    .line 226
    :cond_0
    move-object/from16 v29, v7

    .line 227
    .line 228
    move-object/from16 v27, v9

    .line 229
    .line 230
    move-object/from16 v28, v11

    .line 231
    .line 232
    move-object/from16 v24, v2

    .line 233
    .line 234
    :goto_0
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 235
    .line 236
    .line 237
    move-result-object v25

    .line 238
    invoke-direct/range {v20 .. v25}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 239
    .line 240
    .line 241
    move-object/from16 v2, v20

    .line 242
    .line 243
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 244
    .line 245
    const/4 v9, 0x0

    .line 246
    new-array v11, v9, [Lexpo/modules/kotlin/types/AnyType;

    .line 247
    .line 248
    sget-object v9, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 249
    .line 250
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    move-object/from16 v20, v9

    .line 255
    .line 256
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    invoke-interface {v15, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    check-cast v9, Lexpo/modules/kotlin/types/ReturnType;

    .line 265
    .line 266
    if-nez v9, :cond_1

    .line 267
    .line 268
    new-instance v9, Lexpo/modules/kotlin/types/ReturnType;

    .line 269
    .line 270
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 271
    .line 272
    .line 273
    move-result-object v15

    .line 274
    invoke-direct {v9, v15}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 278
    .line 279
    .line 280
    move-result-object v15

    .line 281
    move-object/from16 v21, v12

    .line 282
    .line 283
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 284
    .line 285
    .line 286
    move-result-object v12

    .line 287
    invoke-interface {v15, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_1
    move-object/from16 v21, v12

    .line 292
    .line 293
    :goto_1
    new-instance v12, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Constructor$1;

    .line 294
    .line 295
    invoke-direct {v12, v1}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Constructor$1;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 296
    .line 297
    .line 298
    invoke-direct {v7, v5, v11, v9, v12}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v7}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 302
    .line 303
    .line 304
    const-string v7, "startStreaming"

    .line 305
    .line 306
    invoke-static {v14, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    if-eqz v9, :cond_2

    .line 311
    .line 312
    new-instance v9, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 313
    .line 314
    const/4 v11, 0x0

    .line 315
    new-array v12, v11, [Lexpo/modules/kotlin/types/AnyType;

    .line 316
    .line 317
    new-instance v11, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$1;

    .line 318
    .line 319
    invoke-direct {v11}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$1;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-direct {v9, v7, v12, v11}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 323
    .line 324
    .line 325
    move-object/from16 v22, v2

    .line 326
    .line 327
    move-object/from16 v23, v14

    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_2
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    new-instance v11, Lkotlin/Pair;

    .line 335
    .line 336
    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    invoke-direct {v11, v12, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 344
    .line 345
    .line 346
    move-result-object v12

    .line 347
    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    .line 352
    .line 353
    if-nez v11, :cond_3

    .line 354
    .line 355
    sget-object v11, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$2;

    .line 356
    .line 357
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 358
    .line 359
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    .line 360
    .line 361
    move-object/from16 v22, v2

    .line 362
    .line 363
    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    move-object/from16 v23, v14

    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    invoke-direct {v15, v2, v14, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 371
    .line 372
    .line 373
    invoke-direct {v12, v15, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 374
    .line 375
    .line 376
    move-object v11, v12

    .line 377
    goto :goto_2

    .line 378
    :cond_3
    move-object/from16 v22, v2

    .line 379
    .line 380
    move-object/from16 v23, v14

    .line 381
    .line 382
    :goto_2
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    new-instance v9, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$3;

    .line 387
    .line 388
    invoke-direct {v9}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$3;-><init>()V

    .line 389
    .line 390
    .line 391
    new-instance v11, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 392
    .line 393
    invoke-direct {v11, v7, v2, v9}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 394
    .line 395
    .line 396
    move-object v9, v11

    .line 397
    :goto_3
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-interface {v2, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    const-string v2, "cancelStreaming"

    .line 405
    .line 406
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 407
    .line 408
    .line 409
    move-result-object v7

    .line 410
    new-instance v9, Lkotlin/Pair;

    .line 411
    .line 412
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 413
    .line 414
    .line 415
    move-result-object v11

    .line 416
    invoke-direct {v9, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 428
    .line 429
    if-nez v9, :cond_4

    .line 430
    .line 431
    sget-object v9, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$4;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$4;

    .line 432
    .line 433
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 434
    .line 435
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 436
    .line 437
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 438
    .line 439
    .line 440
    move-result-object v14

    .line 441
    const/4 v15, 0x0

    .line 442
    invoke-direct {v12, v14, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 443
    .line 444
    .line 445
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 446
    .line 447
    .line 448
    move-object v9, v11

    .line 449
    :cond_4
    new-instance v11, Lkotlin/Pair;

    .line 450
    .line 451
    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    invoke-direct {v11, v12, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    .line 467
    .line 468
    if-nez v11, :cond_5

    .line 469
    .line 470
    sget-object v11, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$5;

    .line 471
    .line 472
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 473
    .line 474
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    .line 475
    .line 476
    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 477
    .line 478
    .line 479
    move-result-object v15

    .line 480
    move-object/from16 v24, v4

    .line 481
    .line 482
    const/4 v4, 0x0

    .line 483
    invoke-direct {v14, v15, v4, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 484
    .line 485
    .line 486
    invoke-direct {v12, v14, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 487
    .line 488
    .line 489
    move-object v11, v12

    .line 490
    goto :goto_4

    .line 491
    :cond_5
    move-object/from16 v24, v4

    .line 492
    .line 493
    :goto_4
    filled-new-array {v9, v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    new-instance v7, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$6;

    .line 498
    .line 499
    invoke-direct {v7}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$6;-><init>()V

    .line 500
    .line 501
    .line 502
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 503
    .line 504
    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 508
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 509
    .line 510
    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 511
    .line 512
    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 513
    .line 514
    if-eqz v11, :cond_6

    .line 515
    .line 516
    :try_start_2
    new-instance v11, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 517
    .line 518
    invoke-direct {v11, v2, v4, v7}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 519
    .line 520
    .line 521
    goto :goto_5

    .line 522
    :cond_6
    invoke-static {v3, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v11

    .line 526
    if-eqz v11, :cond_7

    .line 527
    .line 528
    new-instance v11, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 529
    .line 530
    invoke-direct {v11, v2, v4, v7}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 531
    .line 532
    .line 533
    goto :goto_5

    .line 534
    :cond_7
    invoke-static {v3, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v11

    .line 538
    if-eqz v11, :cond_8

    .line 539
    .line 540
    new-instance v11, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 541
    .line 542
    invoke-direct {v11, v2, v4, v7}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 543
    .line 544
    .line 545
    goto :goto_5

    .line 546
    :cond_8
    invoke-static {v3, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v11

    .line 550
    if-eqz v11, :cond_9

    .line 551
    .line 552
    new-instance v11, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 553
    .line 554
    invoke-direct {v11, v2, v4, v7}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 555
    .line 556
    .line 557
    goto :goto_5

    .line 558
    :cond_9
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v11

    .line 562
    if-eqz v11, :cond_a

    .line 563
    .line 564
    new-instance v11, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 565
    .line 566
    invoke-direct {v11, v2, v4, v7}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 567
    .line 568
    .line 569
    goto :goto_5

    .line 570
    :cond_a
    new-instance v11, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 571
    .line 572
    invoke-direct {v11, v2, v4, v7}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 573
    .line 574
    .line 575
    :goto_5
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    invoke-interface {v4, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    const-string v2, "bodyUsed"

    .line 583
    .line 584
    new-instance v4, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    .line 585
    .line 586
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    .line 591
    .line 592
    .line 593
    move-result-object v7

    .line 594
    invoke-direct {v4, v7, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 598
    .line 599
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 600
    .line 601
    move-object/from16 v25, v13

    .line 602
    .line 603
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 604
    .line 605
    .line 606
    move-result-object v13

    .line 607
    move-object/from16 v30, v12

    .line 608
    .line 609
    const/4 v12, 0x2

    .line 610
    move-object/from16 v31, v14

    .line 611
    .line 612
    const/4 v14, 0x0

    .line 613
    invoke-direct {v11, v13, v14, v12, v14}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 614
    .line 615
    .line 616
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 617
    .line 618
    .line 619
    move-result-object v11

    .line 620
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 621
    .line 622
    .line 623
    move-result-object v13

    .line 624
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 625
    .line 626
    .line 627
    move-result-object v14

    .line 628
    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v13

    .line 632
    check-cast v13, Lexpo/modules/kotlin/types/ReturnType;

    .line 633
    .line 634
    if-nez v13, :cond_b

    .line 635
    .line 636
    new-instance v13, Lexpo/modules/kotlin/types/ReturnType;

    .line 637
    .line 638
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 639
    .line 640
    .line 641
    move-result-object v14

    .line 642
    invoke-direct {v13, v14}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 646
    .line 647
    .line 648
    move-result-object v14

    .line 649
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 650
    .line 651
    .line 652
    move-result-object v12

    .line 653
    invoke-interface {v14, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    :cond_b
    new-instance v12, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$1;

    .line 657
    .line 658
    invoke-direct {v12}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$1;-><init>()V

    .line 659
    .line 660
    .line 661
    invoke-direct {v7, v10, v11, v13, v12}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 665
    .line 666
    .line 667
    move-result-object v11

    .line 668
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 669
    .line 670
    .line 671
    const/4 v11, 0x1

    .line 672
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v4, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 679
    .line 680
    .line 681
    move-result-object v7

    .line 682
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    const-string v2, "_rawHeaders"

    .line 686
    .line 687
    new-instance v4, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    .line 688
    .line 689
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    .line 690
    .line 691
    .line 692
    move-result-object v7

    .line 693
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    invoke-direct {v4, v7, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 701
    .line 702
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 703
    .line 704
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 705
    .line 706
    .line 707
    move-result-object v13

    .line 708
    const/4 v11, 0x0

    .line 709
    const/4 v14, 0x2

    .line 710
    invoke-direct {v12, v13, v11, v14, v11}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 711
    .line 712
    .line 713
    filled-new-array {v12}, [Lexpo/modules/kotlin/types/AnyType;

    .line 714
    .line 715
    .line 716
    move-result-object v11

    .line 717
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 718
    .line 719
    .line 720
    move-result-object v12

    .line 721
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 722
    .line 723
    .line 724
    move-result-object v13

    .line 725
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v12

    .line 729
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 730
    .line 731
    if-nez v12, :cond_c

    .line 732
    .line 733
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 734
    .line 735
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 736
    .line 737
    .line 738
    move-result-object v13

    .line 739
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 743
    .line 744
    .line 745
    move-result-object v13

    .line 746
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 747
    .line 748
    .line 749
    move-result-object v14

    .line 750
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    :cond_c
    new-instance v13, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$2;

    .line 754
    .line 755
    invoke-direct {v13}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$2;-><init>()V

    .line 756
    .line 757
    .line 758
    invoke-direct {v7, v10, v11, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 762
    .line 763
    .line 764
    move-result-object v11

    .line 765
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 766
    .line 767
    .line 768
    const/4 v11, 0x1

    .line 769
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 776
    .line 777
    .line 778
    move-result-object v7

    .line 779
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    const-string v2, "status"

    .line 783
    .line 784
    new-instance v4, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    .line 785
    .line 786
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    .line 787
    .line 788
    .line 789
    move-result-object v7

    .line 790
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    .line 791
    .line 792
    .line 793
    move-result-object v7

    .line 794
    invoke-direct {v4, v7, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 798
    .line 799
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 800
    .line 801
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 802
    .line 803
    .line 804
    move-result-object v12

    .line 805
    const/4 v13, 0x0

    .line 806
    const/4 v14, 0x2

    .line 807
    invoke-direct {v11, v12, v13, v14, v13}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 808
    .line 809
    .line 810
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 811
    .line 812
    .line 813
    move-result-object v11

    .line 814
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 815
    .line 816
    .line 817
    move-result-object v12

    .line 818
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 819
    .line 820
    .line 821
    move-result-object v13

    .line 822
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v12

    .line 826
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 827
    .line 828
    if-nez v12, :cond_d

    .line 829
    .line 830
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 831
    .line 832
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 833
    .line 834
    .line 835
    move-result-object v13

    .line 836
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 840
    .line 841
    .line 842
    move-result-object v13

    .line 843
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 844
    .line 845
    .line 846
    move-result-object v14

    .line 847
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    :cond_d
    new-instance v13, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$3;

    .line 851
    .line 852
    invoke-direct {v13}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$3;-><init>()V

    .line 853
    .line 854
    .line 855
    invoke-direct {v7, v10, v11, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 859
    .line 860
    .line 861
    move-result-object v11

    .line 862
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 863
    .line 864
    .line 865
    const/4 v11, 0x1

    .line 866
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v4, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 873
    .line 874
    .line 875
    move-result-object v7

    .line 876
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    const-string v2, "statusText"

    .line 880
    .line 881
    new-instance v4, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    .line 882
    .line 883
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    .line 884
    .line 885
    .line 886
    move-result-object v7

    .line 887
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    .line 888
    .line 889
    .line 890
    move-result-object v7

    .line 891
    invoke-direct {v4, v7, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 895
    .line 896
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 897
    .line 898
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 899
    .line 900
    .line 901
    move-result-object v12

    .line 902
    const/4 v13, 0x0

    .line 903
    const/4 v14, 0x2

    .line 904
    invoke-direct {v11, v12, v13, v14, v13}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 905
    .line 906
    .line 907
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 908
    .line 909
    .line 910
    move-result-object v11

    .line 911
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 912
    .line 913
    .line 914
    move-result-object v12

    .line 915
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 916
    .line 917
    .line 918
    move-result-object v13

    .line 919
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v12

    .line 923
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 924
    .line 925
    if-nez v12, :cond_e

    .line 926
    .line 927
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 928
    .line 929
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 930
    .line 931
    .line 932
    move-result-object v13

    .line 933
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 937
    .line 938
    .line 939
    move-result-object v13

    .line 940
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 941
    .line 942
    .line 943
    move-result-object v14

    .line 944
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    :cond_e
    new-instance v13, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$4;

    .line 948
    .line 949
    invoke-direct {v13}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$4;-><init>()V

    .line 950
    .line 951
    .line 952
    invoke-direct {v7, v10, v11, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 956
    .line 957
    .line 958
    move-result-object v11

    .line 959
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 960
    .line 961
    .line 962
    const/4 v11, 0x1

    .line 963
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v4, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 970
    .line 971
    .line 972
    move-result-object v7

    .line 973
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    const-string v2, "url"

    .line 977
    .line 978
    new-instance v4, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    .line 979
    .line 980
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    .line 981
    .line 982
    .line 983
    move-result-object v7

    .line 984
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    .line 985
    .line 986
    .line 987
    move-result-object v7

    .line 988
    invoke-direct {v4, v7, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 992
    .line 993
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 994
    .line 995
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 996
    .line 997
    .line 998
    move-result-object v12

    .line 999
    const/4 v13, 0x0

    .line 1000
    const/4 v14, 0x2

    .line 1001
    invoke-direct {v11, v12, v13, v14, v13}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1002
    .line 1003
    .line 1004
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v11

    .line 1008
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v12

    .line 1012
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v13

    .line 1016
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v12

    .line 1020
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 1021
    .line 1022
    if-nez v12, :cond_f

    .line 1023
    .line 1024
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 1025
    .line 1026
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v13

    .line 1030
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v13

    .line 1037
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v14

    .line 1041
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    :cond_f
    new-instance v13, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$5;

    .line 1045
    .line 1046
    invoke-direct {v13}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$5;-><init>()V

    .line 1047
    .line 1048
    .line 1049
    invoke-direct {v7, v10, v11, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v11

    .line 1056
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 1057
    .line 1058
    .line 1059
    const/4 v11, 0x1

    .line 1060
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v4, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v7

    .line 1070
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    const-string v2, "redirected"

    .line 1074
    .line 1075
    new-instance v4, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    .line 1076
    .line 1077
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v7

    .line 1081
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v7

    .line 1085
    invoke-direct {v4, v7, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 1089
    .line 1090
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 1091
    .line 1092
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v12

    .line 1096
    const/4 v13, 0x0

    .line 1097
    const/4 v14, 0x2

    .line 1098
    invoke-direct {v11, v12, v13, v14, v13}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1099
    .line 1100
    .line 1101
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v11

    .line 1105
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v12

    .line 1109
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v13

    .line 1113
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v12

    .line 1117
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 1118
    .line 1119
    if-nez v12, :cond_10

    .line 1120
    .line 1121
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 1122
    .line 1123
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v13

    .line 1127
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v13

    .line 1134
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v14

    .line 1138
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    :cond_10
    new-instance v13, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$6;

    .line 1142
    .line 1143
    invoke-direct {v13}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$6;-><init>()V

    .line 1144
    .line 1145
    .line 1146
    invoke-direct {v7, v10, v11, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v10

    .line 1153
    invoke-virtual {v7, v10}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 1154
    .line 1155
    .line 1156
    const/4 v11, 0x1

    .line 1157
    invoke-virtual {v7, v11}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v4, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v7

    .line 1167
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    const-string v2, "arrayBuffer"

    .line 1171
    .line 1172
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 1173
    .line 1174
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v7

    .line 1178
    new-instance v10, Lkotlin/Pair;

    .line 1179
    .line 1180
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v11

    .line 1184
    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v11

    .line 1191
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v10

    .line 1195
    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1196
    .line 1197
    if-nez v10, :cond_11

    .line 1198
    .line 1199
    sget-object v10, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$1;

    .line 1200
    .line 1201
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 1202
    .line 1203
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 1204
    .line 1205
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v13

    .line 1209
    const/4 v14, 0x0

    .line 1210
    invoke-direct {v12, v13, v14, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1214
    .line 1215
    .line 1216
    move-object v10, v11

    .line 1217
    :cond_11
    filled-new-array {v10}, [Lexpo/modules/kotlin/types/AnyType;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v7

    .line 1221
    new-instance v10, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$2;

    .line 1222
    .line 1223
    invoke-direct {v10}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$2;-><init>()V

    .line 1224
    .line 1225
    .line 1226
    invoke-direct {v4, v2, v7, v10}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v7

    .line 1233
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    const-string v2, "text"

    .line 1237
    .line 1238
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 1239
    .line 1240
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v7

    .line 1244
    new-instance v10, Lkotlin/Pair;

    .line 1245
    .line 1246
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v11

    .line 1250
    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v11

    .line 1257
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v10

    .line 1261
    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1262
    .line 1263
    if-nez v10, :cond_12

    .line 1264
    .line 1265
    sget-object v10, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$3;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$3;

    .line 1266
    .line 1267
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 1268
    .line 1269
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 1270
    .line 1271
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v13

    .line 1275
    const/4 v14, 0x0

    .line 1276
    invoke-direct {v12, v13, v14, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1277
    .line 1278
    .line 1279
    invoke-direct {v11, v12, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1280
    .line 1281
    .line 1282
    move-object v10, v11

    .line 1283
    :cond_12
    filled-new-array {v10}, [Lexpo/modules/kotlin/types/AnyType;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v7

    .line 1287
    new-instance v10, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$4;

    .line 1288
    .line 1289
    invoke-direct {v10}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$4;-><init>()V

    .line 1290
    .line 1291
    .line 1292
    invoke-direct {v4, v2, v7, v10}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v7

    .line 1299
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v2

    .line 1306
    invoke-virtual/range {v22 .. v22}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v4

    .line 1310
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v35

    .line 1317
    new-instance v32, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 1318
    .line 1319
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v2

    .line 1323
    if-eqz v2, :cond_21

    .line 1324
    .line 1325
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v33

    .line 1329
    invoke-static/range {v35 .. v35}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v2

    .line 1333
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v2

    .line 1337
    invoke-static {v2, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    new-instance v4, Lkotlin/Pair;

    .line 1341
    .line 1342
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v6

    .line 1346
    invoke-direct {v4, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v6

    .line 1353
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v4

    .line 1357
    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    .line 1358
    .line 1359
    if-nez v4, :cond_13

    .line 1360
    .line 1361
    sget-object v4, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$Class$2;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$$inlined$Class$2;

    .line 1362
    .line 1363
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 1364
    .line 1365
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    .line 1366
    .line 1367
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v10

    .line 1371
    const/4 v14, 0x0

    .line 1372
    invoke-direct {v7, v10, v14, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1373
    .line 1374
    .line 1375
    const/4 v13, 0x0

    .line 1376
    invoke-direct {v6, v7, v13}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1377
    .line 1378
    .line 1379
    move-object/from16 v36, v6

    .line 1380
    .line 1381
    goto :goto_6

    .line 1382
    :cond_13
    move-object/from16 v36, v4

    .line 1383
    .line 1384
    :goto_6
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v37

    .line 1388
    move-object/from16 v34, v2

    .line 1389
    .line 1390
    invoke-direct/range {v32 .. v37}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1391
    .line 1392
    .line 1393
    move-object/from16 v2, v32

    .line 1394
    .line 1395
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 1396
    .line 1397
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v6

    .line 1401
    new-instance v7, Lkotlin/Pair;

    .line 1402
    .line 1403
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v10

    .line 1407
    invoke-direct {v7, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v10

    .line 1414
    invoke-interface {v10, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v7

    .line 1418
    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    .line 1419
    .line 1420
    if-nez v7, :cond_14

    .line 1421
    .line 1422
    sget-object v7, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$1;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$1;

    .line 1423
    .line 1424
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1425
    .line 1426
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    .line 1427
    .line 1428
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v12

    .line 1432
    const/4 v14, 0x0

    .line 1433
    invoke-direct {v11, v12, v14, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1434
    .line 1435
    .line 1436
    invoke-direct {v10, v11, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1437
    .line 1438
    .line 1439
    move-object v7, v10

    .line 1440
    :cond_14
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v6

    .line 1444
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v7

    .line 1448
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v10

    .line 1452
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v7

    .line 1456
    check-cast v7, Lexpo/modules/kotlin/types/ReturnType;

    .line 1457
    .line 1458
    if-nez v7, :cond_15

    .line 1459
    .line 1460
    new-instance v7, Lexpo/modules/kotlin/types/ReturnType;

    .line 1461
    .line 1462
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v10

    .line 1466
    invoke-direct {v7, v10}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual/range {v20 .. v20}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v10

    .line 1473
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v11

    .line 1477
    invoke-interface {v10, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    :cond_15
    new-instance v10, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$2;

    .line 1481
    .line 1482
    invoke-direct {v10, v1}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$2;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 1483
    .line 1484
    .line 1485
    invoke-direct {v4, v5, v6, v7, v10}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v2, v4}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 1489
    .line 1490
    .line 1491
    const-string v4, "start"

    .line 1492
    .line 1493
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 1494
    .line 1495
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v6

    .line 1499
    new-instance v7, Lkotlin/Pair;

    .line 1500
    .line 1501
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v10

    .line 1505
    invoke-direct {v7, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v10

    .line 1512
    invoke-interface {v10, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v7

    .line 1516
    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    .line 1517
    .line 1518
    if-nez v7, :cond_16

    .line 1519
    .line 1520
    sget-object v7, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$1;

    .line 1521
    .line 1522
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1523
    .line 1524
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    .line 1525
    .line 1526
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v12

    .line 1530
    const/4 v14, 0x0

    .line 1531
    invoke-direct {v11, v12, v14, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1532
    .line 1533
    .line 1534
    invoke-direct {v10, v11, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1535
    .line 1536
    .line 1537
    move-object v7, v10

    .line 1538
    :cond_16
    new-instance v10, Lkotlin/Pair;

    .line 1539
    .line 1540
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v11

    .line 1544
    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v11

    .line 1551
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v10

    .line 1555
    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    .line 1556
    .line 1557
    if-nez v10, :cond_17

    .line 1558
    .line 1559
    sget-object v10, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$2;

    .line 1560
    .line 1561
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 1562
    .line 1563
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 1564
    .line 1565
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v13

    .line 1569
    const/4 v14, 0x0

    .line 1570
    invoke-direct {v12, v13, v14, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1571
    .line 1572
    .line 1573
    invoke-direct {v11, v12, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1574
    .line 1575
    .line 1576
    move-object v10, v11

    .line 1577
    :cond_17
    new-instance v11, Lkotlin/Pair;

    .line 1578
    .line 1579
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v12

    .line 1583
    invoke-direct {v11, v12, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1584
    .line 1585
    .line 1586
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v12

    .line 1590
    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v11

    .line 1594
    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    .line 1595
    .line 1596
    if-nez v11, :cond_18

    .line 1597
    .line 1598
    sget-object v11, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$3;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$3;

    .line 1599
    .line 1600
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 1601
    .line 1602
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 1603
    .line 1604
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    const/4 v14, 0x0

    .line 1609
    invoke-direct {v13, v0, v14, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1610
    .line 1611
    .line 1612
    invoke-direct {v12, v13, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1613
    .line 1614
    .line 1615
    move-object v11, v12

    .line 1616
    :cond_18
    new-instance v0, Lkotlin/Pair;

    .line 1617
    .line 1618
    const-class v12, [B

    .line 1619
    .line 1620
    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v12

    .line 1624
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1625
    .line 1626
    invoke-direct {v0, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v12

    .line 1633
    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v0

    .line 1637
    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    .line 1638
    .line 1639
    if-nez v0, :cond_19

    .line 1640
    .line 1641
    sget-object v0, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$4;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$4;

    .line 1642
    .line 1643
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 1644
    .line 1645
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 1646
    .line 1647
    const-class v14, [B

    .line 1648
    .line 1649
    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v14

    .line 1653
    move-object/from16 v32, v2

    .line 1654
    .line 1655
    const/4 v2, 0x1

    .line 1656
    invoke-direct {v13, v14, v2, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1657
    .line 1658
    .line 1659
    invoke-direct {v12, v13, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1660
    .line 1661
    .line 1662
    move-object v0, v12

    .line 1663
    goto :goto_7

    .line 1664
    :cond_19
    move-object/from16 v32, v2

    .line 1665
    .line 1666
    :goto_7
    filled-new-array {v7, v10, v11, v0}, [Lexpo/modules/kotlin/types/AnyType;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    new-instance v2, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$5;

    .line 1671
    .line 1672
    invoke-direct {v2, v1}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$5;-><init>(Lexpo/modules/fetch/ExpoFetchModule;)V

    .line 1673
    .line 1674
    .line 1675
    invoke-direct {v5, v4, v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual/range {v32 .. v32}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v0

    .line 1682
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1683
    .line 1684
    .line 1685
    const-string v0, "cancel"

    .line 1686
    .line 1687
    move-object/from16 v4, v21

    .line 1688
    .line 1689
    move-object/from16 v2, v24

    .line 1690
    .line 1691
    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1692
    .line 1693
    .line 1694
    move-result v2

    .line 1695
    if-eqz v2, :cond_1a

    .line 1696
    .line 1697
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 1698
    .line 1699
    const/4 v14, 0x0

    .line 1700
    new-array v3, v14, [Lexpo/modules/kotlin/types/AnyType;

    .line 1701
    .line 1702
    new-instance v4, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$1;

    .line 1703
    .line 1704
    invoke-direct {v4}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$1;-><init>()V

    .line 1705
    .line 1706
    .line 1707
    invoke-direct {v2, v0, v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 1708
    .line 1709
    .line 1710
    goto/16 :goto_9

    .line 1711
    .line 1712
    :cond_1a
    invoke-virtual/range {v32 .. v32}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v2

    .line 1716
    new-instance v5, Lkotlin/Pair;

    .line 1717
    .line 1718
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v6

    .line 1722
    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1723
    .line 1724
    .line 1725
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v6

    .line 1729
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v5

    .line 1733
    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    .line 1734
    .line 1735
    if-nez v5, :cond_1b

    .line 1736
    .line 1737
    sget-object v5, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$2;

    .line 1738
    .line 1739
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 1740
    .line 1741
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    .line 1742
    .line 1743
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v4

    .line 1747
    const/4 v14, 0x0

    .line 1748
    invoke-direct {v7, v4, v14, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 1749
    .line 1750
    .line 1751
    invoke-direct {v6, v7, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 1752
    .line 1753
    .line 1754
    move-object v5, v6

    .line 1755
    :cond_1b
    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v2

    .line 1759
    new-instance v4, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$3;

    .line 1760
    .line 1761
    invoke-direct {v4}, Lexpo/modules/fetch/ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$3;-><init>()V

    .line 1762
    .line 1763
    .line 1764
    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1765
    .line 1766
    .line 1767
    move-result v5

    .line 1768
    if-eqz v5, :cond_1c

    .line 1769
    .line 1770
    new-instance v3, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 1771
    .line 1772
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 1773
    .line 1774
    .line 1775
    :goto_8
    move-object v2, v3

    .line 1776
    goto :goto_9

    .line 1777
    :cond_1c
    invoke-static {v3, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1778
    .line 1779
    .line 1780
    move-result v5

    .line 1781
    if-eqz v5, :cond_1d

    .line 1782
    .line 1783
    new-instance v3, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 1784
    .line 1785
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 1786
    .line 1787
    .line 1788
    goto :goto_8

    .line 1789
    :cond_1d
    move-object/from16 v5, v31

    .line 1790
    .line 1791
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1792
    .line 1793
    .line 1794
    move-result v5

    .line 1795
    if-eqz v5, :cond_1e

    .line 1796
    .line 1797
    new-instance v3, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 1798
    .line 1799
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 1800
    .line 1801
    .line 1802
    goto :goto_8

    .line 1803
    :cond_1e
    move-object/from16 v5, v30

    .line 1804
    .line 1805
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1806
    .line 1807
    .line 1808
    move-result v5

    .line 1809
    if-eqz v5, :cond_1f

    .line 1810
    .line 1811
    new-instance v3, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 1812
    .line 1813
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 1814
    .line 1815
    .line 1816
    goto :goto_8

    .line 1817
    :cond_1f
    move-object/from16 v5, v25

    .line 1818
    .line 1819
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1820
    .line 1821
    .line 1822
    move-result v3

    .line 1823
    if-eqz v3, :cond_20

    .line 1824
    .line 1825
    new-instance v3, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 1826
    .line 1827
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 1828
    .line 1829
    .line 1830
    goto :goto_8

    .line 1831
    :cond_20
    new-instance v3, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 1832
    .line 1833
    invoke-direct {v3, v0, v2, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 1834
    .line 1835
    .line 1836
    goto :goto_8

    .line 1837
    :goto_9
    invoke-virtual/range {v32 .. v32}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v3

    .line 1841
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v0

    .line 1848
    invoke-virtual/range {v32 .. v32}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v2

    .line 1852
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1859
    invoke-static {}, Ll1/a;->f()V

    .line 1860
    .line 1861
    .line 1862
    return-object v0

    .line 1863
    :cond_21
    :try_start_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1864
    .line 1865
    move-object/from16 v2, v29

    .line 1866
    .line 1867
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1868
    .line 1869
    .line 1870
    throw v0

    .line 1871
    :cond_22
    move-object v2, v7

    .line 1872
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1873
    .line 1874
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1875
    .line 1876
    .line 1877
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1878
    :goto_a
    invoke-static {}, Ll1/a;->f()V

    .line 1879
    .line 1880
    .line 1881
    throw v0
.end method
