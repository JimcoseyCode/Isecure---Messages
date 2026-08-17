.class public final Lcom/swmansion/rnscreens/safearea/d;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/core/view/I;
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/safearea/d$a;
    }
.end annotation


# static fields
.field public static final o:Lcom/swmansion/rnscreens/safearea/d$a;


# instance fields
.field private final g:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private h:Ljava/lang/ref/WeakReference;

.field private i:Lcom/swmansion/rnscreens/safearea/a;

.field private j:Lcom/swmansion/rnscreens/safearea/a;

.field private k:Z

.field private l:Lcom/facebook/react/uimanager/StateWrapper;

.field private m:LU6/a;

.field private n:Lcom/swmansion/rnscreens/safearea/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/safearea/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/safearea/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/safearea/d;->o:Lcom/swmansion/rnscreens/safearea/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

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
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->h:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    sget-object p1, Lcom/swmansion/rnscreens/safearea/a;->e:Lcom/swmansion/rnscreens/safearea/a$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/a$a;->b()Lcom/swmansion/rnscreens/safearea/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/swmansion/rnscreens/safearea/d;->i:Lcom/swmansion/rnscreens/safearea/a;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/a$a;->b()Lcom/swmansion/rnscreens/safearea/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->j:Lcom/swmansion/rnscreens/safearea/a;

    .line 32
    .line 33
    sget-object p1, Lcom/swmansion/rnscreens/safearea/b;->g:Lcom/swmansion/rnscreens/safearea/b;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->n:Lcom/swmansion/rnscreens/safearea/b;

    .line 36
    .line 37
    invoke-static {p0, p0}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private final c()Lcom/swmansion/rnscreens/safearea/c;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v1, v0, Lcom/swmansion/rnscreens/safearea/c;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    :goto_1
    instance-of v1, v0, Lcom/swmansion/rnscreens/safearea/c;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    check-cast v0, Lcom/swmansion/rnscreens/safearea/c;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method private final d(Lx0/e;)Lx0/e;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/safearea/d;->m:LU6/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LU6/a;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget v0, p1, Lx0/e;->a:I

    .line 17
    .line 18
    :goto_1
    iget-object v2, p0, Lcom/swmansion/rnscreens/safearea/d;->m:LU6/a;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v2}, LU6/a;->d()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move v2, v1

    .line 28
    :goto_2
    if-eqz v2, :cond_3

    .line 29
    .line 30
    move v2, v1

    .line 31
    goto :goto_3

    .line 32
    :cond_3
    iget v2, p1, Lx0/e;->b:I

    .line 33
    .line 34
    :goto_3
    iget-object v3, p0, Lcom/swmansion/rnscreens/safearea/d;->m:LU6/a;

    .line 35
    .line 36
    if-eqz v3, :cond_4

    .line 37
    .line 38
    invoke-virtual {v3}, LU6/a;->c()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_4

    .line 43
    :cond_4
    move v3, v1

    .line 44
    :goto_4
    if-eqz v3, :cond_5

    .line 45
    .line 46
    move v3, v1

    .line 47
    goto :goto_5

    .line 48
    :cond_5
    iget v3, p1, Lx0/e;->c:I

    .line 49
    .line 50
    :goto_5
    iget-object v4, p0, Lcom/swmansion/rnscreens/safearea/d;->m:LU6/a;

    .line 51
    .line 52
    if-eqz v4, :cond_6

    .line 53
    .line 54
    invoke-virtual {v4}, LU6/a;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    goto :goto_6

    .line 59
    :cond_6
    move v4, v1

    .line 60
    :goto_6
    if-eqz v4, :cond_7

    .line 61
    .line 62
    goto :goto_7

    .line 63
    :cond_7
    iget v1, p1, Lx0/e;->d:I

    .line 64
    .line 65
    :goto_7
    invoke-static {v0, v2, v3, v1}, Lx0/e;->c(IIII)Lx0/e;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "of(...)"

    .line 70
    .line 71
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object p1
.end method

.method private final f()V
    .locals 6

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/safearea/a;->e:Lcom/swmansion/rnscreens/safearea/a$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/rnscreens/safearea/d;->n:Lcom/swmansion/rnscreens/safearea/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/safearea/b;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/swmansion/rnscreens/safearea/d;->i:Lcom/swmansion/rnscreens/safearea/a;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/safearea/a$a;->b()Lcom/swmansion/rnscreens/safearea/a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    iget-object v2, p0, Lcom/swmansion/rnscreens/safearea/d;->n:Lcom/swmansion/rnscreens/safearea/b;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/safearea/b;->k()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lcom/swmansion/rnscreens/safearea/d;->j:Lcom/swmansion/rnscreens/safearea/a;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/safearea/a$a;->b()Lcom/swmansion/rnscreens/safearea/a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/swmansion/rnscreens/safearea/a$a;->c(Lcom/swmansion/rnscreens/safearea/a;Lcom/swmansion/rnscreens/safearea/a;)Lcom/swmansion/rnscreens/safearea/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/safearea/d;->getStateWrapper()Lcom/facebook/react/uimanager/StateWrapper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/safearea/a;->c()F

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    float-to-double v3, v3

    .line 56
    const-string v5, "left"

    .line 57
    .line 58
    invoke-interface {v2, v5, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/safearea/a;->e()F

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    float-to-double v3, v3

    .line 70
    const-string v5, "top"

    .line 71
    .line 72
    invoke-interface {v2, v5, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/safearea/a;->d()F

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    float-to-double v3, v3

    .line 84
    const-string v5, "right"

    .line 85
    .line 86
    invoke-interface {v2, v5, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/safearea/a;->b()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    float-to-double v3, v0

    .line 98
    const-string v0, "bottom"

    .line 99
    .line 100
    invoke-interface {v2, v0, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v3, "insets"

    .line 108
    .line 109
    invoke-interface {v0, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v1, v0}, Lcom/facebook/react/uimanager/StateWrapper;->updateState(Lcom/facebook/react/bridge/WritableMap;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    return-void
.end method

.method private final g()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/safearea/d;->k:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lcom/swmansion/rnscreens/safearea/d;->k:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/swmansion/rnscreens/safearea/d;->f()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    return v1
.end method


# virtual methods
.method public a(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "insets"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {}, Landroidx/core/view/L0$p;->a()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    or-int/2addr p1, v0

    .line 20
    invoke-virtual {p2, p1}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "getInsets(...)"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/swmansion/rnscreens/safearea/d;->j:Lcom/swmansion/rnscreens/safearea/a;

    .line 30
    .line 31
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    sget-object v1, Lcom/swmansion/rnscreens/safearea/a;->e:Lcom/swmansion/rnscreens/safearea/a$a;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Lcom/swmansion/rnscreens/safearea/a$a;->a(Lx0/e;)Lcom/swmansion/rnscreens/safearea/a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->j:Lcom/swmansion/rnscreens/safearea/a;

    .line 44
    .line 45
    iget-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->n:Lcom/swmansion/rnscreens/safearea/b;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/b;->k()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/safearea/d;->k:Z

    .line 55
    .line 56
    :cond_0
    new-instance p1, Landroidx/core/view/L0$a;

    .line 57
    .line 58
    invoke-direct {p1, p2}, Landroidx/core/view/L0$a;-><init>(Landroidx/core/view/L0;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/swmansion/rnscreens/safearea/d;->n:Lcom/swmansion/rnscreens/safearea/b;

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/safearea/b;->k()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p2, v1}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, v1}, Lcom/swmansion/rnscreens/safearea/d;->d(Lx0/e;)Lx0/e;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {}, Landroidx/core/view/L0$p;->a()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {p2, v2}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, p2}, Lcom/swmansion/rnscreens/safearea/d;->d(Lx0/e;)Lx0/e;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    sget-object v0, Lx0/e;->e:Lx0/e;

    .line 100
    .line 101
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {p1, v2, v1}, Landroidx/core/view/L0$a;->b(ILx0/e;)Landroidx/core/view/L0$a;

    .line 110
    .line 111
    .line 112
    invoke-static {}, Landroidx/core/view/L0$p;->a()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-virtual {p1, v1, p2}, Landroidx/core/view/L0$a;->b(ILx0/e;)Landroidx/core/view/L0$a;

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_1
    const/4 v0, 0x0

    .line 121
    :goto_0
    invoke-virtual {p1}, Landroidx/core/view/L0$a;->a()Landroidx/core/view/L0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    const-string p2, "build(...)"

    .line 126
    .line 127
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 131
    .line 132
    const/16 v1, 0x1e

    .line 133
    .line 134
    if-ge p2, v1, :cond_2

    .line 135
    .line 136
    if-eqz v0, :cond_2

    .line 137
    .line 138
    invoke-virtual {p1}, Landroidx/core/view/L0;->a()Landroidx/core/view/L0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const-string p2, "consumeDisplayCutout(...)"

    .line 143
    .line 144
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_2
    return-object p1
.end method

.method public final e(Lcom/swmansion/rnscreens/safearea/a;)V
    .locals 1

    .line 1
    const-string v0, "newInterfaceInsets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/safearea/d;->i:Lcom/swmansion/rnscreens/safearea/a;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->i:Lcom/swmansion/rnscreens/safearea/a;

    .line 15
    .line 16
    iget-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->n:Lcom/swmansion/rnscreens/safearea/b;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/safearea/b;->j()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/safearea/d;->k:Z

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final getStateWrapper()Lcom/facebook/react/uimanager/StateWrapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/safearea/d;->l:Lcom/facebook/react/uimanager/StateWrapper;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/swmansion/rnscreens/safearea/d;->c()Lcom/swmansion/rnscreens/safearea/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/safearea/c;->setOnInterfaceInsetsChangeListener(Lcom/swmansion/rnscreens/safearea/d;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/swmansion/rnscreens/safearea/d;->h:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/swmansion/rnscreens/safearea/c;->getInterfaceInsets()Lcom/swmansion/rnscreens/safearea/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/swmansion/rnscreens/safearea/d;->i:Lcom/swmansion/rnscreens/safearea/a;

    .line 33
    .line 34
    invoke-direct {p0}, Lcom/swmansion/rnscreens/safearea/d;->f()V

    .line 35
    .line 36
    .line 37
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/safearea/d;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/swmansion/rnscreens/safearea/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/safearea/c;->c(Lcom/swmansion/rnscreens/safearea/d;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 19
    .line 20
    .line 21
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onPreDraw()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/safearea/d;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    xor-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    return v0
.end method

.method public final setEdges(LU6/a;)V
    .locals 1

    .line 1
    const-string v0, "edges"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->m:LU6/a;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/safearea/d;->k:Z

    .line 13
    .line 14
    return-void
.end method

.method public final setInsetType(Lcom/swmansion/rnscreens/safearea/b;)V
    .locals 1

    .line 1
    const-string v0, "insetType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->n:Lcom/swmansion/rnscreens/safearea/b;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/safearea/d;->k:Z

    .line 13
    .line 14
    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/StateWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/safearea/d;->l:Lcom/facebook/react/uimanager/StateWrapper;

    .line 2
    .line 3
    return-void
.end method
