.class public final Lcom/facebook/react/runtime/ReactLifecycleStateManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/ReactLifecycleStateManager$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\r\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000cJ#\u0010\u000e\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0019\u0010\u000f\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/facebook/react/runtime/ReactLifecycleStateManager;",
        "",
        "Lcom/facebook/react/runtime/ReactHostStateTracker;",
        "stateTracker",
        "<init>",
        "(Lcom/facebook/react/runtime/ReactHostStateTracker;)V",
        "Lcom/facebook/react/bridge/ReactContext;",
        "currentContext",
        "Landroid/app/Activity;",
        "activity",
        "Li7/B;",
        "resumeReactContextIfHostResumed",
        "(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V",
        "moveToOnHostResume",
        "moveToOnHostPause",
        "moveToOnHostDestroy",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "Lcom/facebook/react/runtime/ReactHostStateTracker;",
        "Lcom/facebook/react/common/LifecycleState;",
        "state",
        "Lcom/facebook/react/common/LifecycleState;",
        "getLifecycleState",
        "()Lcom/facebook/react/common/LifecycleState;",
        "lifecycleState",
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


# instance fields
.field private state:Lcom/facebook/react/common/LifecycleState;

.field private final stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;


# direct methods
.method public constructor <init>(Lcom/facebook/react/runtime/ReactHostStateTracker;)V
    .locals 1

    .line 1
    const-string v0, "stateTracker"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 10
    .line 11
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->BEFORE_CREATE:Lcom/facebook/react/common/LifecycleState;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getLifecycleState()Lcom/facebook/react/common/LifecycleState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final moveToOnHostDestroy(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 4
    .line 5
    sget-object v1, Lcom/facebook/react/runtime/ReactLifecycleStateManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const-string v1, "ReactContext.onHostDestroy()"

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x3

    .line 20
    if-eq v0, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 24
    .line 25
    invoke-static {v0, v1, v3, v2, v3}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostDestroy()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 33
    .line 34
    const-string v4, "ReactContext.onHostPause()"

    .line 35
    .line 36
    invoke-static {v0, v4, v3, v2, v3}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 43
    .line 44
    invoke-static {v0, v1, v3, v2, v3}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostDestroy()V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->BEFORE_CREATE:Lcom/facebook/react/common/LifecycleState;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 53
    .line 54
    return-void
.end method

.method public final moveToOnHostPause(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 4
    .line 5
    sget-object v1, Lcom/facebook/react/runtime/ReactLifecycleStateManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const-string v2, "ReactContext.onHostPause()"

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 24
    .line 25
    invoke-static {p2, v2, v4, v3, v4}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 33
    .line 34
    const-string v1, "ReactContext.onHostResume()"

    .line 35
    .line 36
    invoke-static {v0, v1, v4, v3, v4}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 43
    .line 44
    invoke-static {p2, v2, v4, v3, v4}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->BEFORE_RESUME:Lcom/facebook/react/common/LifecycleState;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 53
    .line 54
    return-void
.end method

.method public final moveToOnHostResume(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/common/LifecycleState;->RESUMED:Lcom/facebook/react/common/LifecycleState;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 11
    .line 12
    const-string v2, "ReactContext.onHostResume()"

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static {v0, v2, v4, v3, v4}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-object v1, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 23
    .line 24
    return-void
.end method

.method public final resumeReactContextIfHostResumed(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 4

    .line 1
    const-string v0, "currentContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->state:Lcom/facebook/react/common/LifecycleState;

    .line 7
    .line 8
    sget-object v1, Lcom/facebook/react/common/LifecycleState;->RESUMED:Lcom/facebook/react/common/LifecycleState;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactLifecycleStateManager;->stateTracker:Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 13
    .line 14
    const-string v1, "ReactContext.onHostResume()"

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v0, v1, v3, v2, v3}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState$default(Lcom/facebook/react/runtime/ReactHostStateTracker;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
