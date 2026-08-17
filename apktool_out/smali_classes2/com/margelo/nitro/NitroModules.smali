.class public final Lcom/margelo/nitro/NitroModules;
.super Lcom/margelo/nitro/NitroModulesSpec;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/margelo/nitro/NitroModules$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 \u00a2\u0006\u0004\u0008\u0007\u0010\u0008J \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0082 \u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0017\u00a2\u0006\u0004\u0008\u000e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/margelo/nitro/NitroModules;",
        "Lcom/margelo/nitro/NitroModulesSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "context",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "Lcom/facebook/jni/HybridData;",
        "initHybrid",
        "()Lcom/facebook/jni/HybridData;",
        "",
        "jsRuntimePointer",
        "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;",
        "callInvokerHolder",
        "Li7/B;",
        "install",
        "(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "getContext",
        "()Lcom/facebook/react/bridge/ReactApplicationContext;",
        "mHybridData",
        "Lcom/facebook/jni/HybridData;",
        "Companion",
        "a",
        "react-native-nitro-modules_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lq3/a;
.end annotation


# static fields
.field public static final Companion:Lcom/margelo/nitro/NitroModules$a;

.field public static final NAME:Ljava/lang/String; = "NitroModules"

.field private static applicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# instance fields
.field private final context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/margelo/nitro/NitroModules$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/margelo/nitro/NitroModules$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/margelo/nitro/NitroModules;->Companion:Lcom/margelo/nitro/NitroModules$a;

    .line 8
    .line 9
    invoke-static {}, Ln6/a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/margelo/nitro/NitroModulesSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/margelo/nitro/NitroModules;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/margelo/nitro/NitroModules;->initHybrid()Lcom/facebook/jni/HybridData;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/margelo/nitro/NitroModules;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 16
    .line 17
    sput-object p1, Lcom/margelo/nitro/NitroModules;->applicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 18
    .line 19
    return-void
.end method

.method public static final synthetic access$getApplicationContext$cp()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 1
    sget-object v0, Lcom/margelo/nitro/NitroModules;->applicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setApplicationContext$cp(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/margelo/nitro/NitroModules;->applicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    return-void
.end method

.method public static final getApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 1
    sget-object v0, Lcom/margelo/nitro/NitroModules;->Companion:Lcom/margelo/nitro/NitroModules$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/margelo/nitro/NitroModules$a;->a()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method private final native install(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V
.end method

.method public static final setApplicationContext(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/margelo/nitro/NitroModules;->Companion:Lcom/margelo/nitro/NitroModules$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/margelo/nitro/NitroModules$a;->b(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getContext()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/margelo/nitro/NitroModules;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NitroModules"

    .line 2
    .line 3
    return-object v0
.end method

.method public install()Ljava/lang/String;
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/margelo/nitro/NitroModules;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    const-string v0, "ReactApplicationContext.javaScriptContextHolder is null!"

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/margelo/nitro/NitroModules;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;

    move-result-object v1

    instance-of v2, v1, Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_2

    .line 4
    const-string v0, "ReactApplicationContext.jsCallInvokerHolder is null!"

    return-object v0

    .line 5
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->get()J

    move-result-wide v4

    invoke-direct {p0, v4, v5, v1}, Lcom/margelo/nitro/NitroModules;->install(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v3

    .line 6
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
