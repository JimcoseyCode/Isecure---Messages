.class public final Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010#R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0016\u0010\'\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u0010(R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008*\u0010(R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008-\u0010(\u00a8\u0006/"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/Function0;",
        "Li7/B;",
        "onButtonPress",
        "<init>",
        "(Landroid/content/Context;Lw7/a;)V",
        "Landroid/app/Dialog;",
        "createToolbarDialog",
        "()Landroid/app/Dialog;",
        "",
        "offsetX",
        "offsetY",
        "createAnchoredDialog",
        "(FF)Landroid/app/Dialog;",
        "Landroid/widget/LinearLayout;",
        "createInnerLayout",
        "()Landroid/widget/LinearLayout;",
        "dp",
        "dpToPx",
        "(F)F",
        "show",
        "()V",
        "hide",
        "Lcom/facebook/react/devsupport/interfaces/TracingState;",
        "state",
        "updateRecordingState",
        "(Lcom/facebook/react/devsupport/interfaces/TracingState;)V",
        "",
        "count",
        "updatePerfIssueCount",
        "(I)V",
        "Landroid/content/Context;",
        "Lw7/a;",
        "dialog",
        "Landroid/app/Dialog;",
        "Landroid/widget/TextView;",
        "statusIndicator",
        "Landroid/widget/TextView;",
        "statusLabel",
        "tooltipLabel",
        "issuesContainer",
        "Landroid/widget/LinearLayout;",
        "issueCountLabel",
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
.field private static final COLOR_OVERLAY_BORDER:I

.field public static final Companion:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView$Companion;

.field private static final TEXT_SIZE_ACCESSORY:F

.field private static final TEXT_SIZE_PRIMARY:F

.field private static final TYPEFACE_BOLD:Landroid/graphics/Typeface;


# instance fields
.field private final context:Landroid/content/Context;

.field private final dialog:Landroid/app/Dialog;

.field private issueCountLabel:Landroid/widget/TextView;

.field private issuesContainer:Landroid/widget/LinearLayout;

.field private final onButtonPress:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field

.field private statusIndicator:Landroid/widget/TextView;

.field private statusLabel:Landroid/widget/TextView;

.field private tooltipLabel:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->Companion:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView$Companion;

    .line 8
    .line 9
    const-string v0, "#6C6C6C"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->COLOR_OVERLAY_BORDER:I

    .line 16
    .line 17
    const/high16 v0, 0x41400000    # 12.0f

    .line 18
    .line 19
    sput v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->TEXT_SIZE_PRIMARY:F

    .line 20
    .line 21
    const/high16 v0, 0x41200000    # 10.0f

    .line 22
    .line 23
    sput v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->TEXT_SIZE_ACCESSORY:F

    .line 24
    .line 25
    const-string v0, "sans-serif"

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->TYPEFACE_BOLD:Landroid/graphics/Typeface;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onButtonPress"

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
    iput-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->onButtonPress:Lw7/a;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->initDisplayMetricsIfNotInitialized(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->createToolbarDialog()Landroid/app/Dialog;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dialog:Landroid/app/Dialog;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(FLandroid/app/Dialog;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->createAnchoredDialog$lambda$16$lambda$15(FLandroid/app/Dialog;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$dpToPx(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;F)F
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->createToolbarDialog$lambda$8(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final createAnchoredDialog(FF)Landroid/app/Dialog;
    .locals 4

    .line 1
    new-instance v0, Landroid/app/Dialog;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 4
    .line 5
    sget v2, Lcom/facebook/react/R$style;->NoAnimationDialog:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 22
    .line 23
    invoke-direct {v3, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v1, v3}, Landroid/view/Window;->setDimAmount(F)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    const/4 v3, -0x2

    .line 55
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 56
    .line 57
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 58
    .line 59
    const v3, 0x800035

    .line 60
    .line 61
    .line 62
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 63
    .line 64
    float-to-int p1, p1

    .line 65
    iput p1, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 66
    .line 67
    float-to-int p1, p2

    .line 68
    iput p1, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    new-instance v1, Lcom/facebook/react/devsupport/perfmonitor/e;

    .line 88
    .line 89
    invoke-direct {v1, p2, v0}, Lcom/facebook/react/devsupport/perfmonitor/e;-><init>(FLandroid/app/Dialog;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1, v1}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    return-object v0
.end method

.method private static final createAnchoredDialog$lambda$16$lambda$15(FLandroid/app/Dialog;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "windowInsets"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p3, v0}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const-string v0, "getInsets(...)"

    .line 20
    .line 21
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams"

    .line 29
    .line 30
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast p2, Landroid/view/WindowManager$LayoutParams;

    .line 34
    .line 35
    iget p3, p3, Lx0/e;->b:I

    .line 36
    .line 37
    float-to-int p0, p0

    .line 38
    add-int/2addr p3, p0

    .line 39
    iput p3, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    sget-object p0, Landroidx/core/view/L0;->b:Landroidx/core/view/L0;

    .line 51
    .line 52
    return-object p0
.end method

.method private final createInnerLayout()Landroid/widget/LinearLayout;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    const/high16 v2, 0x41600000    # 14.0f

    .line 18
    .line 19
    invoke-direct {p0, v2}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    float-to-int v2, v2

    .line 24
    const/high16 v3, 0x40e00000    # 7.0f

    .line 25
    .line 26
    invoke-direct {p0, v3}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    float-to-int v3, v3

    .line 31
    invoke-virtual {v0, v2, v3, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 35
    .line 36
    const/4 v3, -0x2

    .line 37
    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 44
    .line 45
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 49
    .line 50
    .line 51
    const/high16 v1, -0x1000000

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 54
    .line 55
    .line 56
    const/high16 v1, 0x41680000    # 14.5f

    .line 57
    .line 58
    invoke-direct {p0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0x66

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 68
    .line 69
    .line 70
    const/high16 v1, 0x3f800000    # 1.0f

    .line 71
    .line 72
    invoke-direct {p0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    float-to-int v1, v1

    .line 77
    sget v3, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->COLOR_OVERLAY_BORDER:I

    .line 78
    .line 79
    invoke-virtual {v2, v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setShowDividers(I)V

    .line 87
    .line 88
    .line 89
    new-instance v1, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView$createInnerLayout$1$2;

    .line 90
    .line 91
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView$createInnerLayout$1$2;-><init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

.method private final createToolbarDialog()Landroid/app/Dialog;
    .locals 11

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/high16 v1, 0x41400000    # 12.0f

    .line 9
    .line 10
    invoke-direct {p0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    float-to-int v2, v2

    .line 15
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setWidth(I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    float-to-int v2, v2

    .line 23
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHeight(I)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 27
    .line 28
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 33
    .line 34
    .line 35
    const/high16 v4, -0x10000

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusIndicator:Landroid/widget/TextView;

    .line 44
    .line 45
    new-instance v0, Landroid/widget/LinearLayout;

    .line 46
    .line 47
    iget-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 48
    .line 49
    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 53
    .line 54
    .line 55
    const/high16 v2, 0x40000000    # 2.0f

    .line 56
    .line 57
    invoke-direct {p0, v2}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    float-to-int v2, v2

    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-virtual {v0, v2, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Landroid/widget/TextView;

    .line 67
    .line 68
    iget-object v5, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 69
    .line 70
    invoke-direct {v2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    sget v5, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->TEXT_SIZE_PRIMARY:F

    .line 74
    .line 75
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 76
    .line 77
    .line 78
    const/4 v6, -0x1

    .line 79
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 80
    .line 81
    .line 82
    sget-object v7, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->TYPEFACE_BOLD:Landroid/graphics/Typeface;

    .line 83
    .line 84
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusLabel:Landroid/widget/TextView;

    .line 88
    .line 89
    new-instance v2, Landroid/widget/TextView;

    .line 90
    .line 91
    iget-object v8, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 92
    .line 93
    invoke-direct {v2, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    sget v8, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->TEXT_SIZE_ACCESSORY:F

    .line 97
    .line 98
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 105
    .line 106
    .line 107
    iput-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->tooltipLabel:Landroid/widget/TextView;

    .line 108
    .line 109
    iget-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusLabel:Landroid/widget/TextView;

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    if-nez v2, :cond_0

    .line 113
    .line 114
    const-string v2, "statusLabel"

    .line 115
    .line 116
    invoke-static {v2}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    move-object v2, v8

    .line 120
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    iget-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->tooltipLabel:Landroid/widget/TextView;

    .line 124
    .line 125
    if-nez v2, :cond_1

    .line 126
    .line 127
    const-string v2, "tooltipLabel"

    .line 128
    .line 129
    invoke-static {v2}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v2, v8

    .line 133
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Landroid/widget/LinearLayout;

    .line 137
    .line 138
    iget-object v9, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 139
    .line 140
    invoke-direct {v2, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 141
    .line 142
    .line 143
    const/high16 v9, 0x41000000    # 8.0f

    .line 144
    .line 145
    invoke-direct {p0, v9}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    float-to-int v9, v9

    .line 150
    invoke-virtual {v2, v9, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 151
    .line 152
    .line 153
    const/16 v9, 0x8

    .line 154
    .line 155
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 156
    .line 157
    .line 158
    iput-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->issuesContainer:Landroid/widget/LinearLayout;

    .line 159
    .line 160
    new-instance v2, Landroid/widget/TextView;

    .line 161
    .line 162
    iget-object v10, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 163
    .line 164
    invoke-direct {v2, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    const v7, 0x1080027

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v7}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    if-eqz v6, :cond_2

    .line 188
    .line 189
    invoke-direct {p0, v5}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    float-to-int v7, v7

    .line 194
    invoke-direct {p0, v5}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    float-to-int v5, v5

    .line 199
    add-int/2addr v5, v3

    .line 200
    invoke-virtual {v6, v4, v3, v7, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_2
    move-object v6, v8

    .line 205
    :goto_0
    invoke-virtual {v2, v6, v8, v8, v8}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 206
    .line 207
    .line 208
    const/high16 v3, 0x40c00000    # 6.0f

    .line 209
    .line 210
    invoke-direct {p0, v3}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    float-to-int v3, v3

    .line 215
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 216
    .line 217
    .line 218
    iput-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->issueCountLabel:Landroid/widget/TextView;

    .line 219
    .line 220
    iget-object v2, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->issuesContainer:Landroid/widget/LinearLayout;

    .line 221
    .line 222
    const-string v3, "issuesContainer"

    .line 223
    .line 224
    if-nez v2, :cond_3

    .line 225
    .line 226
    invoke-static {v3}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    move-object v2, v8

    .line 230
    :cond_3
    iget-object v4, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->issueCountLabel:Landroid/widget/TextView;

    .line 231
    .line 232
    if-nez v4, :cond_4

    .line 233
    .line 234
    const-string v4, "issueCountLabel"

    .line 235
    .line 236
    invoke-static {v4}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    move-object v4, v8

    .line 240
    :cond_4
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->createInnerLayout()Landroid/widget/LinearLayout;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    new-instance v4, Lcom/facebook/react/devsupport/perfmonitor/f;

    .line 248
    .line 249
    invoke-direct {v4, p0}, Lcom/facebook/react/devsupport/perfmonitor/f;-><init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    .line 254
    .line 255
    iget-object v4, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusIndicator:Landroid/widget/TextView;

    .line 256
    .line 257
    if-nez v4, :cond_5

    .line 258
    .line 259
    const-string v4, "statusIndicator"

    .line 260
    .line 261
    invoke-static {v4}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    move-object v4, v8

    .line 265
    :cond_5
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->issuesContainer:Landroid/widget/LinearLayout;

    .line 272
    .line 273
    if-nez v0, :cond_6

    .line 274
    .line 275
    invoke-static {v3}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    move-object v0, v8

    .line 279
    :cond_6
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {p0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    invoke-direct {p0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dpToPx(F)F

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->createAnchoredDialog(FF)Landroid/app/Dialog;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    if-eqz v1, :cond_8

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    if-eqz v2, :cond_7

    .line 308
    .line 309
    iget v3, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 310
    .line 311
    or-int/2addr v3, v9

    .line 312
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 313
    .line 314
    move-object v8, v2

    .line 315
    :cond_7
    invoke-virtual {v1, v8}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 316
    .line 317
    .line 318
    :cond_8
    return-object v0
.end method

.method private static final createToolbarDialog$lambda$8(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->onButtonPress:Lw7/a;

    .line 2
    .line 3
    invoke-interface {p0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final dpToPx(F)F
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method


# virtual methods
.method public final hide()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final updatePerfIssueCount(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->issueCountLabel:Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "issueCountLabel"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->issuesContainer:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "issuesContainer"

    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v0

    .line 30
    :goto_0
    if-nez p1, :cond_2

    .line 31
    .line 32
    const/16 p1, 0x8

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    :goto_1
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final updateRecordingState(Lcom/facebook/react/devsupport/interfaces/TracingState;)V
    .locals 7

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/devsupport/interfaces/TracingState;->ENABLEDINCDPMODE:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dialog:Landroid/app/Dialog;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Lcom/facebook/react/devsupport/interfaces/TracingState;->ENABLEDINBACKGROUNDMODE:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 17
    .line 18
    const-string v1, "android.hardware.touchscreen"

    .line 19
    .line 20
    const-string v2, "tooltipLabel"

    .line 21
    .line 22
    const-string v3, "statusLabel"

    .line 23
    .line 24
    const-string v4, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    .line 25
    .line 26
    const-string v5, "statusIndicator"

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-ne p1, v0, :cond_5

    .line 30
    .line 31
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusIndicator:Landroid/widget/TextView;

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    invoke-static {v5}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object p1, v6

    .line 39
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast p1, Landroid/graphics/drawable/GradientDrawable;

    .line 47
    .line 48
    const/high16 v0, -0x10000

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusLabel:Landroid/widget/TextView;

    .line 54
    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    move-object p1, v6

    .line 61
    :cond_2
    const-string v0, "Profiling Active"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->tooltipLabel:Landroid/widget/TextView;

    .line 67
    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    invoke-static {v2}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move-object v6, p1

    .line 75
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    const-string p1, "Tap to open"

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    const-string p1, "Press \u2630 to open"

    .line 91
    .line 92
    :goto_1
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_5
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusIndicator:Landroid/widget/TextView;

    .line 97
    .line 98
    if-nez p1, :cond_6

    .line 99
    .line 100
    invoke-static {v5}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object p1, v6

    .line 104
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    check-cast p1, Landroid/graphics/drawable/GradientDrawable;

    .line 112
    .line 113
    const v0, -0x777778

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->statusLabel:Landroid/widget/TextView;

    .line 120
    .line 121
    if-nez p1, :cond_7

    .line 122
    .line 123
    invoke-static {v3}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object p1, v6

    .line 127
    :cond_7
    const-string v0, "Profiling Stopped"

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->tooltipLabel:Landroid/widget/TextView;

    .line 133
    .line 134
    if-nez p1, :cond_8

    .line 135
    .line 136
    invoke-static {v2}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_8
    move-object v6, p1

    .line 141
    :goto_2
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->context:Landroid/content/Context;

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_9

    .line 152
    .line 153
    const-string p1, "Tap to restart"

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_9
    const-string p1, "Press \u2630 to restart"

    .line 157
    .line 158
    :goto_3
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    :goto_4
    iget-object p1, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->dialog:Landroid/app/Dialog;

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 164
    .line 165
    .line 166
    return-void
.end method
