.class public final LB6/d;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final g:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Lcom/facebook/react/views/view/ReactViewGroup;

.field private m:Z

.field private n:Lu6/k;

.field private final o:Lu6/l;

.field private final p:Lx6/b;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 5

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    new-instance v0, Lu6/l;

    .line 12
    .line 13
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    iget-boolean v4, p0, LB6/d;->i:Z

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3, v4}, Lu6/l;-><init>(IIIZ)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LB6/d;->o:Lu6/l;

    .line 28
    .line 29
    new-instance v1, Lx6/b;

    .line 30
    .line 31
    new-instance v2, LB6/d$a;

    .line 32
    .line 33
    invoke-direct {v2, p0}, LB6/d$a;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, p0, p1, v0, v2}, Lx6/b;-><init>(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/uimanager/ThemedReactContext;Lu6/l;Lw7/a;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, LB6/d;->p:Lx6/b;

    .line 40
    .line 41
    sget-object p1, LB6/f;->a:LB6/f;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, LB6/f;->b(LB6/d;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/views/view/ReactViewGroup;)V
    .locals 0

    .line 1
    invoke-static {p0}, LB6/d;->m(Lcom/facebook/react/views/view/ReactViewGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LB6/d;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LB6/d;->q(LB6/d;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(LB6/d;)Lu6/k;
    .locals 0

    .line 1
    invoke-direct {p0}, LB6/d;->getKeyboardCallback()Lu6/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final f()V
    .locals 1

    .line 1
    invoke-direct {p0}, LB6/d;->o()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LB6/d;->p:Lx6/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx6/b;->c()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final g()V
    .locals 1

    .line 1
    invoke-direct {p0}, LB6/d;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LB6/d;->p:Lx6/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx6/b;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final getKeyboardCallback()Lu6/k;
    .locals 1

    .line 1
    iget-object v0, p0, LB6/d;->n:Lu6/k;

    .line 2
    .line 3
    return-object v0
.end method

.method private final h()V
    .locals 0

    .line 1
    invoke-direct {p0}, LB6/d;->p()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LB6/d;->g()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final i()V
    .locals 0

    .line 1
    invoke-direct {p0}, LB6/d;->p()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LB6/d;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final k()V
    .locals 0

    .line 1
    invoke-direct {p0}, LB6/d;->p()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lr6/k;->c(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final l()V
    .locals 3

    .line 1
    iget-object v0, p0, LB6/d;->n:Lu6/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lu6/k;->e()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LB6/d;->l:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 9
    .line 10
    new-instance v1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, LB6/c;

    .line 20
    .line 21
    invoke-direct {v2, v0}, LB6/c;-><init>(Lcom/facebook/react/views/view/ReactViewGroup;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final m(Lcom/facebook/react/views/view/ReactViewGroup;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lr6/j;->a(Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final o()V
    .locals 8

    .line 1
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LB6/d;->l:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 19
    .line 20
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 21
    .line 22
    invoke-static {v0}, Lr6/h;->a(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/ViewGroup;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, LB6/d;->l:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 34
    .line 35
    iget-object v1, p0, LB6/d;->o:Lu6/l;

    .line 36
    .line 37
    new-instance v2, Lu6/k;

    .line 38
    .line 39
    invoke-direct {v2, p0, p0, v0, v1}, Lu6/k;-><init>(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/view/View;Lcom/facebook/react/uimanager/ThemedReactContext;Lu6/l;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, LB6/d;->n:Lu6/k;

    .line 43
    .line 44
    iget-object v0, p0, LB6/d;->l:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-static {v0, v2}, Landroidx/core/view/a0;->C0(Landroid/view/View;Landroidx/core/view/q0$b;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, LB6/d;->n:Lu6/k;

    .line 52
    .line 53
    invoke-static {v0, v1}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lr6/k;->c(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :cond_2
    sget-object v2, Lv6/a;->a:Lv6/a;

    .line 61
    .line 62
    invoke-static {}, LB6/e;->a()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/4 v6, 0x4

    .line 67
    const/4 v7, 0x0

    .line 68
    const-string v4, "Can not setup keyboard animation listener, since `currentActivity` is null"

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-static/range {v2 .. v7}, Lv6/a;->d(Lv6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private final p()V
    .locals 2

    .line 1
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    invoke-static {v0}, Lr6/h;->c(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, LB6/b;

    .line 10
    .line 11
    invoke-direct {v1, p0}, LB6/b;-><init>(LB6/d;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static final q(LB6/d;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 8

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "insets"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 12
    .line 13
    invoke-static {v0}, Lr6/h;->a(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/ViewGroup;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iget-boolean v2, p0, LB6/d;->k:Z

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 29
    .line 30
    invoke-static {v2}, Lr6/h;->e(Lcom/facebook/react/bridge/ReactContext;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/16 v4, 0x10

    .line 35
    .line 36
    if-ne v2, v4, :cond_0

    .line 37
    .line 38
    iget-boolean v2, p0, LB6/d;->j:Z

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v2, v3

    .line 45
    :goto_0
    invoke-static {}, Landroidx/core/view/L0$p;->e()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {p2, v4}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-string v5, "getInsets(...)"

    .line 54
    .line 55
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-virtual {p2, v6}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-static {v6, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    move v2, v3

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {p2, v2}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget v2, v2, Lx0/e;->d:I

    .line 82
    .line 83
    :goto_1
    iget v5, v4, Lx0/e;->a:I

    .line 84
    .line 85
    iget-boolean v7, p0, LB6/d;->h:Z

    .line 86
    .line 87
    if-eqz v7, :cond_2

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    iget v3, v6, Lx0/e;->b:I

    .line 91
    .line 92
    :goto_2
    iget v6, v4, Lx0/e;->c:I

    .line 93
    .line 94
    iget-boolean p0, p0, LB6/d;->i:Z

    .line 95
    .line 96
    if-eqz p0, :cond_3

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    iget p0, v4, Lx0/e;->d:I

    .line 100
    .line 101
    invoke-static {p0, v2}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    :goto_3
    invoke-virtual {v1, v5, v3, v6, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 106
    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-static {p1, p2}, Landroidx/core/view/a0;->W(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method


# virtual methods
.method public final getActive()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LB6/d;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCallback$react_native_keyboard_controller_release()Lu6/k;
    .locals 1

    .line 1
    iget-object v0, p0, LB6/d;->n:Lu6/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LB6/d;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LB6/d;->h:Z

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iput-boolean p1, p0, LB6/d;->h:Z

    .line 10
    .line 11
    invoke-direct {p0}, LB6/d;->k()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, Landroidx/core/view/p0;->c(Landroid/view/Window;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LB6/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/16 v1, 0x400

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LB6/d;->m:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, LB6/d;->m:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, LB6/d;->f()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB6/d;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LB6/d;->g()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setActive(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB6/d;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LB6/d;->i()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, LB6/d;->h()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setCallback$react_native_keyboard_controller_release(Lu6/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB6/d;->n:Lu6/k;

    .line 2
    .line 3
    return-void
.end method

.method public final setNavigationBarTranslucent(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, LB6/d;->i:Z

    .line 2
    .line 3
    iget-object v0, p0, LB6/d;->o:Lu6/l;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lu6/l;->e(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setPreserveEdgeToEdge(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB6/d;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setStatusBarTranslucent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB6/d;->h:Z

    .line 2
    .line 3
    return-void
.end method
