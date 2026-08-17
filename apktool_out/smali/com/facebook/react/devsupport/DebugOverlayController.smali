.class public final Lcom/facebook/react/devsupport/DebugOverlayController;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/DebugOverlayController$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/DebugOverlayController;",
        "",
        "Lcom/facebook/react/bridge/ReactContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "",
        "fpsDebugViewVisible",
        "Li7/B;",
        "setFpsDebugViewVisible",
        "(Z)V",
        "Lcom/facebook/react/bridge/ReactContext;",
        "Landroid/view/WindowManager;",
        "windowManager",
        "Landroid/view/WindowManager;",
        "Landroid/widget/FrameLayout;",
        "fpsDebugViewContainer",
        "Landroid/widget/FrameLayout;",
        "Companion",
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
.field public static final Companion:Lcom/facebook/react/devsupport/DebugOverlayController$Companion;


# instance fields
.field private fpsDebugViewContainer:Landroid/widget/FrameLayout;

.field private final reactContext:Lcom/facebook/react/bridge/ReactContext;

.field private final windowManager:Landroid/view/WindowManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/DebugOverlayController$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/DebugOverlayController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/DebugOverlayController;->Companion:Lcom/facebook/react/devsupport/DebugOverlayController$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

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
    iput-object p1, p0, Lcom/facebook/react/devsupport/DebugOverlayController;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    const-string v0, "window"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Landroid/view/WindowManager;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/facebook/react/devsupport/DebugOverlayController;->windowManager:Landroid/view/WindowManager;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic a(ZLcom/facebook/react/devsupport/DebugOverlayController;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/DebugOverlayController;->setFpsDebugViewVisible$lambda$0(ZLcom/facebook/react/devsupport/DebugOverlayController;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final requestPermission(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/DebugOverlayController;->Companion:Lcom/facebook/react/devsupport/DebugOverlayController$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/devsupport/DebugOverlayController$Companion;->requestPermission(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final setFpsDebugViewVisible$lambda$0(ZLcom/facebook/react/devsupport/DebugOverlayController;)V
    .locals 7

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->fpsDebugViewContainer:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object p0, Lcom/facebook/react/devsupport/DebugOverlayController;->Companion:Lcom/facebook/react/devsupport/DebugOverlayController$Companion;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/facebook/react/devsupport/DebugOverlayController$Companion;->access$permissionCheck(Lcom/facebook/react/devsupport/DebugOverlayController$Companion;Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const-string p0, "ReactNative"

    .line 18
    .line 19
    const-string p1, "Wait for overlay permission to be set"

    .line 20
    .line 21
    invoke-static {p0, p1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p0, Lcom/facebook/react/devsupport/FpsView;

    .line 26
    .line 27
    iget-object v0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lcom/facebook/react/devsupport/FpsView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 30
    .line 31
    .line 32
    iput-object p0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->fpsDebugViewContainer:Landroid/widget/FrameLayout;

    .line 33
    .line 34
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    .line 35
    .line 36
    sget v4, Lcom/facebook/react/devsupport/WindowOverlayCompat;->TYPE_SYSTEM_OVERLAY:I

    .line 37
    .line 38
    const/16 v5, 0x18

    .line 39
    .line 40
    const/4 v6, -0x3

    .line 41
    const/4 v2, -0x1

    .line 42
    const/4 v3, -0x1

    .line 43
    invoke-direct/range {v1 .. v6}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->windowManager:Landroid/view/WindowManager;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->fpsDebugViewContainer:Landroid/widget/FrameLayout;

    .line 49
    .line 50
    invoke-interface {p0, p1, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    if-nez p0, :cond_3

    .line 55
    .line 56
    iget-object p0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->fpsDebugViewContainer:Landroid/widget/FrameLayout;

    .line 57
    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object p0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->windowManager:Landroid/view/WindowManager;

    .line 66
    .line 67
    iget-object v0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->fpsDebugViewContainer:Landroid/widget/FrameLayout;

    .line 68
    .line 69
    invoke-interface {p0, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    iput-object p0, p1, Lcom/facebook/react/devsupport/DebugOverlayController;->fpsDebugViewContainer:Landroid/widget/FrameLayout;

    .line 74
    .line 75
    :cond_3
    return-void
.end method


# virtual methods
.method public final setFpsDebugViewVisible(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/k;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lcom/facebook/react/devsupport/k;-><init>(ZLcom/facebook/react/devsupport/DebugOverlayController;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method
