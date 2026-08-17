.class public final Lcom/margelo/nitro/core/Promise;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/margelo/nitro/core/Promise$a;,
        Lcom/margelo/nitro/core/Promise$OnRejectedCallback;,
        Lcom/margelo/nitro/core/Promise$OnResolvedCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 $*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0003%&\'B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004B\u0011\u0008\u0013\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0003\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u0082 \u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0082 \u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 \u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0082 \u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u0082 \u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u000bJ\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001a\u0010\u000fJ\'\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\'\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\t0\u001b\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00028\u0000H\u0086@\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006("
    }
    d2 = {
        "Lcom/margelo/nitro/core/Promise;",
        "T",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/jni/HybridData;",
        "hybridData",
        "(Lcom/facebook/jni/HybridData;)V",
        "result",
        "Li7/B;",
        "nativeResolve",
        "(Ljava/lang/Object;)V",
        "",
        "error",
        "nativeReject",
        "(Ljava/lang/Throwable;)V",
        "Lcom/margelo/nitro/core/Promise$OnResolvedCallback;",
        "callback",
        "addOnResolvedListener",
        "(Lcom/margelo/nitro/core/Promise$OnResolvedCallback;)V",
        "Lcom/margelo/nitro/core/Promise$OnRejectedCallback;",
        "addOnRejectedListener",
        "(Lcom/margelo/nitro/core/Promise$OnRejectedCallback;)V",
        "initHybrid",
        "()Lcom/facebook/jni/HybridData;",
        "resolve",
        "reject",
        "Lkotlin/Function1;",
        "listener",
        "then",
        "(Lkotlin/jvm/functions/Function1;)Lcom/margelo/nitro/core/Promise;",
        "catch",
        "await",
        "(Ln7/f;)Ljava/lang/Object;",
        "mHybridData",
        "Lcom/facebook/jni/HybridData;",
        "Companion",
        "OnResolvedCallback",
        "OnRejectedCallback",
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
.field public static final Companion:Lcom/margelo/nitro/core/Promise$a;

.field private static final defaultScope:LR8/N;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lq3/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/margelo/nitro/core/Promise$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/margelo/nitro/core/Promise$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/margelo/nitro/core/Promise;->Companion:Lcom/margelo/nitro/core/Promise$a;

    .line 8
    .line 9
    invoke-static {}, LR8/d0;->a()LR8/J;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, LR8/O;->a(Ln7/j;)LR8/N;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/margelo/nitro/core/Promise;->defaultScope:LR8/N;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-direct {p0}, Lcom/margelo/nitro/core/Promise;->initHybrid()Lcom/facebook/jni/HybridData;

    move-result-object v0

    iput-object v0, p0, Lcom/margelo/nitro/core/Promise;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method private constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lq3/a;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/margelo/nitro/core/Promise;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/margelo/nitro/core/Promise;->then$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getDefaultScope$cp()LR8/N;
    .locals 1

    .line 1
    sget-object v0, Lcom/margelo/nitro/core/Promise;->defaultScope:LR8/N;

    .line 2
    .line 3
    return-object v0
.end method

.method private final native addOnRejectedListener(Lcom/margelo/nitro/core/Promise$OnRejectedCallback;)V
.end method

.method private final native addOnResolvedListener(Lcom/margelo/nitro/core/Promise$OnResolvedCallback;)V
.end method

.method private final native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method private final native nativeReject(Ljava/lang/Throwable;)V
.end method

.method private final native nativeResolve(Ljava/lang/Object;)V
.end method

.method private static final then$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_1
    new-instance p0, Ljava/lang/Error;

    .line 11
    .line 12
    const-string p1, "Failed to cast Object to T!"

    .line 13
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
.end method


# virtual methods
.method public final await(Ln7/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ln7/l;

    .line 2
    .line 3
    invoke-static {p1}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ln7/l;-><init>(Ln7/f;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/margelo/nitro/core/Promise$b;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/margelo/nitro/core/Promise$b;-><init>(Ln7/f;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/margelo/nitro/core/Promise;->then(Lkotlin/jvm/functions/Function1;)Lcom/margelo/nitro/core/Promise;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lcom/margelo/nitro/core/Promise$c;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lcom/margelo/nitro/core/Promise$c;-><init>(Ln7/f;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/margelo/nitro/core/Promise;->catch(Lkotlin/jvm/functions/Function1;)Lcom/margelo/nitro/core/Promise;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ln7/l;->a()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-ne v0, v1, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object v0
.end method

.method public final catch(Lkotlin/jvm/functions/Function1;)Lcom/margelo/nitro/core/Promise;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/margelo/nitro/core/Promise<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/margelo/nitro/core/d;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/margelo/nitro/core/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/margelo/nitro/core/Promise;->addOnRejectedListener(Lcom/margelo/nitro/core/Promise$OnRejectedCallback;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final reject(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/margelo/nitro/core/Promise;->nativeReject(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final resolve(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/margelo/nitro/core/Promise;->nativeResolve(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final then(Lkotlin/jvm/functions/Function1;)Lcom/margelo/nitro/core/Promise;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/margelo/nitro/core/Promise<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/margelo/nitro/core/c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/margelo/nitro/core/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/margelo/nitro/core/Promise;->addOnResolvedListener(Lcom/margelo/nitro/core/Promise$OnResolvedCallback;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method
