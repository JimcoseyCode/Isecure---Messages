.class public final Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\r\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\r\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\r\u0010\nJ\r\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0011\u0010$\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;",
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorUpdateListener;",
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;",
        "devHelper",
        "Lkotlin/Function0;",
        "Li7/B;",
        "onRequestOpenDevTools",
        "<init>",
        "(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;Lw7/a;)V",
        "handleRecordingButtonPress",
        "()V",
        "enable",
        "disable",
        "startBackgroundTrace",
        "stopBackgroundTrace",
        "Lcom/facebook/react/devsupport/interfaces/TracingState;",
        "state",
        "onRecordingStateChanged",
        "(Lcom/facebook/react/devsupport/interfaces/TracingState;)V",
        "",
        "name",
        "onPerfIssueAdded",
        "(Ljava/lang/String;)V",
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;",
        "Lw7/a;",
        "",
        "enabled",
        "Z",
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;",
        "view",
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;",
        "tracingState",
        "Lcom/facebook/react/devsupport/interfaces/TracingState;",
        "",
        "perfIssueCount",
        "I",
        "isEnabled",
        "()Z",
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
.field private final devHelper:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

.field private enabled:Z

.field private final onRequestOpenDevTools:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field

.field private perfIssueCount:I

.field private tracingState:Lcom/facebook/react/devsupport/interfaces/TracingState;

.field private view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;Lw7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "devHelper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onRequestOpenDevTools"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->devHelper:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->onRequestOpenDevTools:Lw7/a;

    .line 17
    .line 18
    sget-object p1, Lcom/facebook/react/devsupport/interfaces/TracingState;->ENABLEDINCDPMODE:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->tracingState:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enable$lambda$0(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handleRecordingButtonPress(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->handleRecordingButtonPress()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;Lcom/facebook/react/devsupport/interfaces/TracingState;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->onRecordingStateChanged$lambda$4(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;Lcom/facebook/react/devsupport/interfaces/TracingState;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->onPerfIssueAdded$lambda$5(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->disable$lambda$1(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final disable$lambda$1(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->hide()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static final enable$lambda$0(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->devHelper:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 15
    .line 16
    new-instance v2, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager$enable$1$1;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager$enable$1$1;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0, v2}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;-><init>(Landroid/content/Context;Lw7/a;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->show()V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void
.end method

.method private final handleRecordingButtonPress()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->tracingState:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Li7/m;

    .line 22
    .line 23
    invoke-direct {v0}, Li7/m;-><init>()V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->devHelper:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 28
    .line 29
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getInspectorTarget()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->resumeBackgroundTrace()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->devHelper:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 40
    .line 41
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getInspectorTarget()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->pauseAndAnalyzeBackgroundTrace()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->onRequestOpenDevTools:Lw7/a;

    .line 54
    .line 55
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    return-void
.end method

.method private static final onPerfIssueAdded$lambda$5(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->perfIssueCount:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->perfIssueCount:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->updatePerfIssueCount(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->show()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method private static final onRecordingStateChanged$lambda$4(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;Lcom/facebook/react/devsupport/interfaces/TracingState;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->updateRecordingState(Lcom/facebook/react/devsupport/interfaces/TracingState;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->perfIssueCount:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->updatePerfIssueCount(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->view:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->show()V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
.end method


# virtual methods
.method public final disable()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enabled:Z

    .line 3
    .line 4
    new-instance v0, Lcom/facebook/react/devsupport/perfmonitor/c;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/perfmonitor/c;-><init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final enable()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enabled:Z

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/devsupport/perfmonitor/d;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/perfmonitor/d;-><init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public onPerfIssueAdded(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/facebook/react/devsupport/perfmonitor/a;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/perfmonitor/a;-><init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onRecordingStateChanged(Lcom/facebook/react/devsupport/interfaces/TracingState;)V
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->tracingState:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 7
    .line 8
    sget-object v0, Lcom/facebook/react/devsupport/interfaces/TracingState;->DISABLED:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->perfIssueCount:I

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/perfmonitor/b;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/perfmonitor/b;-><init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;Lcom/facebook/react/devsupport/interfaces/TracingState;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final startBackgroundTrace()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->devHelper:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getInspectorTarget()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->resumeBackgroundTrace()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->getTracingState()Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->onRecordingStateChanged(Lcom/facebook/react/devsupport/interfaces/TracingState;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public final stopBackgroundTrace()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->devHelper:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getInspectorTarget()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->stopBackgroundTrace()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->getTracingState()Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->onRecordingStateChanged(Lcom/facebook/react/devsupport/interfaces/TracingState;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method
