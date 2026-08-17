.class public Lcom/swmansion/worklets/runloop/AnimationFrameQueue;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private lastFrameTimeMs:D

.field private mAnimationsDragFactor:I

.field private final mCallbackPosted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mChoreographerCallback:Lcom/facebook/react/uimanager/GuardedFrameCallback;

.field private mFirstUptime:Ljava/lang/Long;

.field private final mFrameCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/swmansion/worklets/runloop/AnimationFrameCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final mPaused:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mReactChoreographer:Lcom/facebook/react/modules/core/ReactChoreographer;

.field private mSlowAnimationsEnabled:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFirstUptime:Ljava/lang/Long;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mSlowAnimationsEnabled:Z

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mAnimationsDragFactor:I

    .line 19
    .line 20
    invoke-static {}, Lcom/facebook/react/modules/core/ReactChoreographer;->getInstance()Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mReactChoreographer:Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 25
    .line 26
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mCallbackPosted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mPaused:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFrameCallbacks:Ljava/util/List;

    .line 46
    .line 47
    new-instance v0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue$1;

    .line 48
    .line 49
    invoke-direct {v0, p0, p1}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue$1;-><init>(Lcom/swmansion/worklets/runloop/AnimationFrameQueue;Lcom/facebook/react/bridge/ReactContext;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mChoreographerCallback:Lcom/facebook/react/uimanager/GuardedFrameCallback;

    .line 53
    .line 54
    return-void
.end method

.method static bridge synthetic a(Lcom/swmansion/worklets/runloop/AnimationFrameQueue;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->executeQueue(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private calculateTimestamp(J)D
    .locals 4

    .line 1
    long-to-double p1, p1

    .line 2
    const-wide v0, 0x412e848000000000L    # 1000000.0

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    div-double/2addr p1, v0

    .line 8
    iget-boolean v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mSlowAnimationsEnabled:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFirstUptime:Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-double v0, v0

    .line 19
    iget-object v2, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFirstUptime:Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    long-to-double v2, v2

    .line 26
    sub-double/2addr p1, v2

    .line 27
    iget v2, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mAnimationsDragFactor:I

    .line 28
    .line 29
    int-to-double v2, v2

    .line 30
    div-double/2addr p1, v2

    .line 31
    add-double/2addr v0, p1

    .line 32
    return-wide v0

    .line 33
    :cond_0
    return-wide p1
.end method

.method private executeQueue(J)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->calculateTimestamp(J)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-wide v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->lastFrameTimeMs:D

    .line 6
    .line 7
    cmpg-double v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mCallbackPosted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->scheduleQueueExecution()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-direct {p0}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->pullCallbacks()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v2, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mCallbackPosted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 28
    .line 29
    .line 30
    iput-wide p1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->lastFrameTimeMs:D

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lcom/swmansion/worklets/runloop/AnimationFrameCallback;

    .line 47
    .line 48
    invoke-virtual {v1, p1, p2}, Lcom/swmansion/worklets/runloop/AnimationFrameCallback;->onAnimationFrame(D)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void
.end method

.method private pullCallbacks()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/swmansion/worklets/runloop/AnimationFrameCallback;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFrameCallbacks:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFrameCallbacks:Ljava/util/List;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFrameCallbacks:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 14
    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object v1

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
.end method

.method private scheduleQueueExecution()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mPaused:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mPaused:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mCallbackPosted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mReactChoreographer:Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 22
    .line 23
    sget-object v2, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->NATIVE_ANIMATED_MODULE:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mChoreographerCallback:Lcom/facebook/react/uimanager/GuardedFrameCallback;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw v1
.end method


# virtual methods
.method public enableSlowAnimations(ZI)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mSlowAnimationsEnabled:Z

    .line 2
    .line 3
    iput p2, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mAnimationsDragFactor:I

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFirstUptime:Ljava/lang/Long;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public pause()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mPaused:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mPaused:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mCallbackPosted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mReactChoreographer:Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 23
    .line 24
    sget-object v2, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->NATIVE_ANIMATED_MODULE:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mChoreographerCallback:Lcom/facebook/react/uimanager/GuardedFrameCallback;

    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/modules/core/ReactChoreographer;->removeFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw v1
.end method

.method public requestAnimationFrame(Lcom/swmansion/worklets/runloop/AnimationFrameCallback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFrameCallbacks:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mFrameCallbacks:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-direct {p0}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->scheduleQueueExecution()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method

.method public resume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->mPaused:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->scheduleQueueExecution()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
