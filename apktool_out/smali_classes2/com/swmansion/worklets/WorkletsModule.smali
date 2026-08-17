.class public Lcom/swmansion/worklets/WorkletsModule;
.super Lcom/swmansion/worklets/NativeWorkletsModuleSpec;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "WorkletsModule"
.end annotation


# instance fields
.field private final mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

.field private final mAnimationFrameQueue:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

.field private mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Lq3/a;
    .end annotation
.end field

.field private final mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mMessageQueueThread:Lcom/swmansion/worklets/WorkletsMessageQueueThread;

.field private mSlowAnimationsEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "worklets"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/worklets/NativeWorkletsModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/swmansion/worklets/WorkletsMessageQueueThread;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/swmansion/worklets/WorkletsMessageQueueThread;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mMessageQueueThread:Lcom/swmansion/worklets/WorkletsMessageQueueThread;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->assertOnJSQueueThread()V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lcom/swmansion/worklets/AndroidUIScheduler;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 28
    .line 29
    new-instance v0, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAnimationFrameQueue:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 35
    .line 36
    return-void
.end method

.method private native initHybrid(JLcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/swmansion/worklets/AndroidUIScheduler;)Lcom/facebook/jni/HybridData;
.end method

.method private native invalidateCpp()V
.end method


# virtual methods
.method protected getHybridData()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    return-object v0
.end method

.method public installTurboModule()Z
    .locals 8
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
        isBlockingSynchronousMethod = true
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->assertOnJSQueueThread()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->get()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-static {v0}, Lcom/swmansion/worklets/JSCallInvokerResolver;->getJSCallInvokerHolder(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v5, p0, Lcom/swmansion/worklets/WorkletsModule;->mMessageQueueThread:Lcom/swmansion/worklets/WorkletsMessageQueueThread;

    .line 24
    .line 25
    iget-object v7, p0, Lcom/swmansion/worklets/WorkletsModule;->mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    invoke-direct/range {v2 .. v7}, Lcom/swmansion/worklets/WorkletsModule;->initHybrid(JLcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/swmansion/worklets/AndroidUIScheduler;)Lcom/facebook/jni/HybridData;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, v2, Lcom/swmansion/worklets/WorkletsModule;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    return v0
.end method

.method public invalidate()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

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
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/swmansion/worklets/WorkletsModule;->invalidateCpp()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAndroidUIScheduler:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/swmansion/worklets/AndroidUIScheduler;->deactivate()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public isOnJSQueueThread()Z
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isOnJSQueueThread()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public onHostDestroy()V
    .locals 0

    .line 1
    return-void
.end method

.method public onHostPause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAnimationFrameQueue:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->pause()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onHostResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAnimationFrameQueue:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->resume()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public requestAnimationFrame(Lcom/swmansion/worklets/runloop/AnimationFrameCallback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mAnimationFrameQueue:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->requestAnimationFrame(Lcom/swmansion/worklets/runloop/AnimationFrameCallback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toggleSlowAnimations()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mSlowAnimationsEnabled:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/swmansion/worklets/WorkletsModule;->mSlowAnimationsEnabled:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/swmansion/worklets/WorkletsModule;->mAnimationFrameQueue:Lcom/swmansion/worklets/runloop/AnimationFrameQueue;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-virtual {v1, v0, v2}, Lcom/swmansion/worklets/runloop/AnimationFrameQueue;->enableSlowAnimations(ZI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
