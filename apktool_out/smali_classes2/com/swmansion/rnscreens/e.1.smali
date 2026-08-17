.class public Lcom/swmansion/rnscreens/e;
.super Landroidx/appcompat/widget/Toolbar;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final d0:Lcom/swmansion/rnscreens/a0;

.field private final e0:Z

.field private final f0:Z

.field private g0:Z

.field private h0:Lx0/e;

.field private i0:Z

.field private j0:Z

.field private final k0:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/swmansion/rnscreens/a0;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/swmansion/rnscreens/e;->d0:Lcom/swmansion/rnscreens/a0;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/e;->e0:Z

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/e;->f0:Z

    .line 20
    .line 21
    sget-object p1, Lx0/e;->e:Lx0/e;

    .line 22
    .line 23
    const-string p2, "NONE"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/swmansion/rnscreens/e;->h0:Lx0/e;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 31
    .line 32
    .line 33
    new-instance p1, Lcom/swmansion/rnscreens/e$a;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/e$a;-><init>(Lcom/swmansion/rnscreens/e;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/swmansion/rnscreens/e;->k0:Landroid/view/Choreographer$FrameCallback;

    .line 39
    .line 40
    return-void
.end method

.method public static final synthetic S(Lcom/swmansion/rnscreens/e;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/e;->j0:Z

    .line 2
    .line 3
    return-void
.end method

.method private final T(IIII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/e;->g0:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/e;->U()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final U()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/e;->e0:Z

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/e;->i0:Z

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final V()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/e;->d0:Lcom/swmansion/rnscreens/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/a0;->getPreferredContentInsetStartWithNavigation()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->setContentInsetStartWithNavigation(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/rnscreens/e;->d0:Lcom/swmansion/rnscreens/a0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/a0;->getPreferredContentInsetStart()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/swmansion/rnscreens/e;->d0:Lcom/swmansion/rnscreens/a0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/a0;->getPreferredContentInsetEnd()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/Toolbar;->J(II)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final getConfig()Lcom/swmansion/rnscreens/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/e;->d0:Lcom/swmansion/rnscreens/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-static {}, Landroidx/core/view/L0$p;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move-object v0, p0

    .line 13
    invoke-static/range {v0 .. v5}, LY6/d;->b(Landroid/view/View;ILandroid/view/WindowInsets;ZILjava/lang/Object;)Lx0/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static/range {v0 .. v5}, LY6/d;->b(Landroid/view/View;ILandroid/view/WindowInsets;ZILjava/lang/Object;)Lx0/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget v3, p1, Lx0/e;->a:I

    .line 26
    .line 27
    iget v4, v1, Lx0/e;->a:I

    .line 28
    .line 29
    add-int/2addr v3, v4

    .line 30
    iget v4, p1, Lx0/e;->c:I

    .line 31
    .line 32
    iget v5, v1, Lx0/e;->c:I

    .line 33
    .line 34
    add-int/2addr v4, v5

    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static {v3, v5, v4, v5}, Lx0/e;->c(IIII)Lx0/e;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "of(...)"

    .line 41
    .line 42
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget v6, p1, Lx0/e;->b:I

    .line 46
    .line 47
    iget-boolean v7, v0, Lcom/swmansion/rnscreens/e;->f0:Z

    .line 48
    .line 49
    if-eqz v7, :cond_0

    .line 50
    .line 51
    iget v1, v1, Lx0/e;->b:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v1, v5

    .line 55
    :goto_0
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget p1, p1, Lx0/e;->d:I

    .line 60
    .line 61
    invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-static {v5, v1, v5, p1}, Lx0/e;->c(IIII)Lx0/e;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v3, p1}, Lx0/e;->a(Lx0/e;Lx0/e;)Lx0/e;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v1, "add(...)"

    .line 77
    .line 78
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v0, Lcom/swmansion/rnscreens/e;->h0:Lx0/e;

    .line 82
    .line 83
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_1

    .line 88
    .line 89
    iput-object p1, v0, Lcom/swmansion/rnscreens/e;->h0:Lx0/e;

    .line 90
    .line 91
    iget v1, p1, Lx0/e;->a:I

    .line 92
    .line 93
    iget v3, p1, Lx0/e;->b:I

    .line 94
    .line 95
    iget v4, p1, Lx0/e;->c:I

    .line 96
    .line 97
    iget p1, p1, Lx0/e;->d:I

    .line 98
    .line 99
    invoke-direct {p0, v1, v3, v4, p1}, Lcom/swmansion/rnscreens/e;->T(IIII)V

    .line 100
    .line 101
    .line 102
    :cond_1
    return-object v2
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/Toolbar;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    iget-object p3, p1, Lcom/swmansion/rnscreens/e;->d0:Lcom/swmansion/rnscreens/a0;

    .line 7
    .line 8
    const/4 p4, 0x0

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p1, Lcom/swmansion/rnscreens/e;->i0:Z

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p2, p4

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 19
    :goto_1
    invoke-virtual {p3, p0, p2}, Lcom/swmansion/rnscreens/a0;->k(Landroidx/appcompat/widget/Toolbar;Z)V

    .line 20
    .line 21
    .line 22
    iput-boolean p4, p1, Lcom/swmansion/rnscreens/e;->i0:Z

    .line 23
    .line 24
    return-void
.end method

.method public requestLayout()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Lcom/swmansion/rnscreens/a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/swmansion/rnscreens/a;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/e;->g0:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->isInLayout()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/a;->H(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/e;->g0:Z

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v0, Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 75
    .line 76
    const/16 v1, 0x1d

    .line 77
    .line 78
    if-gt v0, v1, :cond_4

    .line 79
    .line 80
    if-nez v2, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const/16 v1, 0x20

    .line 88
    .line 89
    if-ne v0, v1, :cond_4

    .line 90
    .line 91
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/e;->j0:Z

    .line 92
    .line 93
    if-nez v0, :cond_4

    .line 94
    .line 95
    iget-object v0, p0, Lcom/swmansion/rnscreens/e;->k0:Landroid/view/Choreographer$FrameCallback;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    const/4 v0, 0x1

    .line 100
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/e;->j0:Z

    .line 101
    .line 102
    sget-object v0, Lcom/facebook/react/modules/core/ReactChoreographer;->Companion:Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/ReactChoreographer$Companion;->getInstance()Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sget-object v1, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->NATIVE_ANIMATED_MODULE:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 109
    .line 110
    iget-object v2, p0, Lcom/swmansion/rnscreens/e;->k0:Landroid/view/Choreographer$FrameCallback;

    .line 111
    .line 112
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_1
    return-void
.end method
