.class public final Lcom/facebook/react/modules/core/ReactChoreographer;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;,
        Lcom/facebook/react/modules/core/ReactChoreographer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lcom/facebook/react/modules/core/ReactChoreographer;",
        "",
        "Lcom/facebook/react/internal/ChoreographerProvider;",
        "choreographerProvider",
        "<init>",
        "(Lcom/facebook/react/internal/ChoreographerProvider;)V",
        "Li7/B;",
        "postFrameCallbackOnChoreographer",
        "()V",
        "maybeRemoveFrameCallback",
        "Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;",
        "type",
        "Landroid/view/Choreographer$FrameCallback;",
        "callback",
        "postFrameCallback",
        "(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V",
        "frameCallback",
        "removeFrameCallback",
        "Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;",
        "choreographer$1",
        "Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;",
        "choreographer",
        "",
        "Ljava/util/ArrayDeque;",
        "callbackQueues",
        "[Ljava/util/ArrayDeque;",
        "",
        "totalCallbacks",
        "I",
        "",
        "hasPostedCallback",
        "Z",
        "Landroid/view/Choreographer$FrameCallback;",
        "Companion",
        "CallbackType",
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
.field public static final Companion:Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

.field private static choreographer:Lcom/facebook/react/modules/core/ReactChoreographer;


# instance fields
.field private final callbackQueues:[Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/ArrayDeque<",
            "Landroid/view/Choreographer$FrameCallback;",
            ">;"
        }
    .end annotation
.end field

.field private choreographer$1:Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;

.field private final frameCallback:Landroid/view/Choreographer$FrameCallback;

.field private hasPostedCallback:Z

.field private totalCallbacks:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/core/ReactChoreographer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/core/ReactChoreographer;->Companion:Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lcom/facebook/react/internal/ChoreographerProvider;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/util/ArrayDeque;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v3, Ljava/util/ArrayDeque;

    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 4
    new-instance v0, Lcom/facebook/react/modules/core/e;

    invoke-direct {v0, p0}, Lcom/facebook/react/modules/core/e;-><init>(Lcom/facebook/react/modules/core/ReactChoreographer;)V

    iput-object v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->frameCallback:Landroid/view/Choreographer$FrameCallback;

    .line 5
    new-instance v0, Lcom/facebook/react/modules/core/f;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/modules/core/f;-><init>(Lcom/facebook/react/modules/core/ReactChoreographer;Lcom/facebook/react/internal/ChoreographerProvider;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/internal/ChoreographerProvider;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/core/ReactChoreographer;-><init>(Lcom/facebook/react/internal/ChoreographerProvider;)V

    return-void
.end method

.method private static final _init_$lambda$2(Lcom/facebook/react/modules/core/ReactChoreographer;Lcom/facebook/react/internal/ChoreographerProvider;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/internal/ChoreographerProvider;->getChoreographer()Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->choreographer$1:Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/core/ReactChoreographer;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/modules/core/ReactChoreographer;->frameCallback$lambda$1(Lcom/facebook/react/modules/core/ReactChoreographer;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getChoreographer$cp()Lcom/facebook/react/modules/core/ReactChoreographer;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/core/ReactChoreographer;->choreographer:Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setChoreographer$cp(Lcom/facebook/react/modules/core/ReactChoreographer;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/facebook/react/modules/core/ReactChoreographer;->choreographer:Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/core/ReactChoreographer;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallbackOnChoreographer$lambda$6(Lcom/facebook/react/modules/core/ReactChoreographer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/modules/core/ReactChoreographer;Lcom/facebook/react/internal/ChoreographerProvider;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/modules/core/ReactChoreographer;->_init_$lambda$2(Lcom/facebook/react/modules/core/ReactChoreographer;Lcom/facebook/react/internal/ChoreographerProvider;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final frameCallback$lambda$1(Lcom/facebook/react/modules/core/ReactChoreographer;J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->hasPostedCallback:Z

    .line 6
    .line 7
    iget-object v2, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    move v3, v1

    .line 11
    :goto_0
    if-ge v3, v2, :cond_2

    .line 12
    .line 13
    iget-object v4, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 14
    .line 15
    aget-object v4, v4, v3

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    move v6, v1

    .line 22
    :goto_1
    if-ge v6, v5, :cond_1

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    check-cast v7, Landroid/view/Choreographer$FrameCallback;

    .line 29
    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-interface {v7, p1, p2}, Landroid/view/Choreographer$FrameCallback;->doFrame(J)V

    .line 33
    .line 34
    .line 35
    iget v7, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 36
    .line 37
    add-int/lit8 v7, v7, -0x1

    .line 38
    .line 39
    iput v7, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    const-string v7, "ReactNative"

    .line 45
    .line 46
    const-string v8, "Tried to execute non-existent frame callback"

    .line 47
    .line 48
    invoke-static {v7, v8}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->maybeRemoveFrameCallback()V

    .line 58
    .line 59
    .line 60
    sget-object p0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :goto_3
    monitor-exit v0

    .line 65
    throw p0
.end method

.method public static final getInstance()Lcom/facebook/react/modules/core/ReactChoreographer;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/core/ReactChoreographer;->Companion:Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/ReactChoreographer$Companion;->getInstance()Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final initialize(Lcom/facebook/react/internal/ChoreographerProvider;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/core/ReactChoreographer;->Companion:Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/modules/core/ReactChoreographer$Companion;->initialize(Lcom/facebook/react/internal/ChoreographerProvider;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final maybeRemoveFrameCallback()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    invoke-static {v0}, Lo3/a;->a(Z)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->hasPostedCallback:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->choreographer$1:Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->frameCallback:Landroid/view/Choreographer$FrameCallback;

    .line 25
    .line 26
    invoke-interface {v0, v2}, Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iput-boolean v1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->hasPostedCallback:Z

    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method private final postFrameCallbackOnChoreographer()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->hasPostedCallback:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->choreographer$1:Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/modules/core/g;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/core/g;-><init>(Lcom/facebook/react/modules/core/ReactChoreographer;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->frameCallback:Landroid/view/Choreographer$FrameCallback;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->hasPostedCallback:Z

    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method private static final postFrameCallbackOnChoreographer$lambda$6(Lcom/facebook/react/modules/core/ReactChoreographer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallbackOnChoreographer()V

    .line 5
    .line 6
    .line 7
    sget-object p0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0

    .line 13
    throw p0
.end method


# virtual methods
.method public final postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->getOrder$ReactAndroid_release()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget-object p1, v1, p1

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    add-int/2addr p1, p2

    .line 29
    iput p1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 30
    .line 31
    if-lez p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p2, 0x0

    .line 35
    :goto_0
    invoke-static {p2}, Lo3/a;->a(Z)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallbackOnChoreographer()V

    .line 39
    .line 40
    .line 41
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    monitor-exit v0

    .line 47
    throw p1
.end method

.method public final removeFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->callbackQueues:[Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->getOrder$ReactAndroid_release()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    aget-object p1, v1, p1

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->removeFirstOccurrence(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget p1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, -0x1

    .line 26
    .line 27
    iput p1, p0, Lcom/facebook/react/modules/core/ReactChoreographer;->totalCallbacks:I

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->maybeRemoveFrameCallback()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const-string p1, "ReactNative"

    .line 36
    .line 37
    const-string p2, "Tried to remove non-existent frame callback"

    .line 38
    .line 39
    invoke-static {p1, p2}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw p1
.end method
