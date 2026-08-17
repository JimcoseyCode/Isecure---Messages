.class public final LL6/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/lifecycle/o;
.implements Landroidx/core/view/I;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL6/o$a;,
        LL6/o$b;,
        LL6/o$c;,
        LL6/o$d;,
        LL6/o$e;
    }
.end annotation


# static fields
.field public static final r:LL6/o$a;


# instance fields
.field private final g:Lcom/swmansion/rnscreens/y;

.field private h:Z

.field private i:Lcom/swmansion/rnscreens/n;

.field private j:Z

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private final o:LL6/o$d;

.field private final p:LL6/o$b;

.field private q:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LL6/o$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LL6/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LL6/o;->r:LL6/o$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/swmansion/rnscreens/y;)V
    .locals 2

    .line 1
    const-string v0, "screen"

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
    iput-object p1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 10
    .line 11
    sget-object v0, Lcom/swmansion/rnscreens/m;->a:Lcom/swmansion/rnscreens/m;

    .line 12
    .line 13
    iput-object v0, p0, LL6/o;->i:Lcom/swmansion/rnscreens/n;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetInitialDetentIndex()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, LL6/o;->m:I

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetInitialDetentIndex()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, LL6/p;->k(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, LL6/o;->n:I

    .line 34
    .line 35
    new-instance v0, LL6/o$d;

    .line 36
    .line 37
    invoke-direct {v0, p0}, LL6/o$d;-><init>(LL6/o;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, LL6/o;->o:LL6/o$d;

    .line 41
    .line 42
    new-instance v1, LL6/o$b;

    .line 43
    .line 44
    invoke-direct {v1, p0}, LL6/o$b;-><init>(LL6/o;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, LL6/o;->p:LL6/o$b;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/k;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, LL6/o;->B()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_0

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v0, "[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only."

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method

.method private final B()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 1

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final C()Lcom/swmansion/rnscreens/X;
    .locals 2

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/swmansion/rnscreens/X;

    .line 13
    .line 14
    return-object v0
.end method

.method private final D()V
    .locals 0

    .line 1
    invoke-direct {p0}, LL6/o;->K()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final E()V
    .locals 0

    .line 1
    invoke-direct {p0}, LL6/o;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final F()V
    .locals 1

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/k;->g:Lcom/swmansion/rnscreens/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/k;->g(Landroidx/core/view/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final G()V
    .locals 1

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/k;->g:Lcom/swmansion/rnscreens/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/k;->b(Landroidx/core/view/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final H()V
    .locals 2

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/k;->g:Lcom/swmansion/rnscreens/k;

    .line 2
    .line 3
    invoke-direct {p0}, LL6/o;->L()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/k;->e(Landroid/view/View;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final J(I)V
    .locals 3

    .line 1
    sget-object v0, LL6/q;->a:LL6/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LL6/q;->b(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, LL6/o;->n:I

    .line 10
    .line 11
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p1}, LL6/p;->h(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, LL6/o;->m:I

    .line 22
    .line 23
    :cond_0
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 24
    .line 25
    iget v2, p0, LL6/o;->m:I

    .line 26
    .line 27
    invoke-virtual {v1, v2, v0}, Lcom/swmansion/rnscreens/y;->x(IZ)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, LL6/o;->N(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-direct {p0}, LL6/o;->C()Lcom/swmansion/rnscreens/X;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/X;->Z()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method private final K()V
    .locals 3

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {v0}, LY6/a;->c(Landroid/view/View;)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iput-object v1, p0, LL6/o;->q:Landroid/view/View;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 47
    .line 48
    const/high16 v2, 0x40000

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, LL6/o;->z()Landroid/view/inputmethod/InputMethodManager;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_0
    return-void
.end method

.method private final L()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getDecorView(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "[RNScreens] Attempt to access activity on detached context"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method private final M()V
    .locals 3

    .line 1
    iget-object v0, p0, LL6/o;->q:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, LL6/o;->z()Landroid/view/inputmethod/InputMethodManager;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, LL6/o;->q:Landroid/view/View;

    .line 20
    .line 21
    return-void
.end method

.method private final N(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method private final O()Ljava/lang/Integer;
    .locals 4

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getContainer()Lcom/swmansion/rnscreens/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v2, 0x1e

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    if-lt v1, v2, :cond_3

    .line 49
    .line 50
    const-string v1, "window"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    instance-of v1, v0, Landroid/view/WindowManager;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    check-cast v0, Landroid/view/WindowManager;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move-object v0, v3

    .line 64
    :goto_0
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-static {v0}, Lr6/a;->a(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-static {v0}, Lr6/b;->a(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :cond_3
    return-object v3
.end method

.method private final Q()Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-direct {p0}, LL6/o;->O()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, LL6/o;->k:I

    .line 12
    .line 13
    sub-int/2addr v0, v1

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method private final S(F)V
    .locals 2

    .line 1
    iget v0, p0, LL6/o;->l:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LL6/o;->m(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 9
    .line 10
    sub-float/2addr p1, v0

    .line 11
    invoke-virtual {v1, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic b(Ljava/lang/Number;)Ljava/lang/Float;
    .locals 0

    .line 1
    invoke-static {p0}, LL6/o;->v(Ljava/lang/Number;)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LL6/o;Ljava/lang/Number;)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL6/o;->u(LL6/o;Ljava/lang/Number;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(LL6/o;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL6/o;->y(LL6/o;Landroid/animation/ValueAnimator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(LL6/g;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL6/o;->q(LL6/g;Landroid/animation/ValueAnimator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(LL6/o;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL6/o;->w(LL6/o;Landroid/animation/ValueAnimator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(LL6/o;)Landroid/view/inputmethod/InputMethodManager;
    .locals 0

    .line 1
    invoke-direct {p0}, LL6/o;->z()Landroid/view/inputmethod/InputMethodManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic i(LL6/o;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LL6/o;->J(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic j(LL6/o;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LL6/o;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method private final l(Landroid/animation/AnimatorSet;ZLcom/swmansion/rnscreens/X;)V
    .locals 3

    .line 1
    new-instance v0, LM6/e;

    .line 2
    .line 3
    new-instance v1, LM6/i;

    .line 4
    .line 5
    iget-object v2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 6
    .line 7
    invoke-direct {v1, v2}, LM6/i;-><init>(Lcom/swmansion/rnscreens/y;)V

    .line 8
    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    sget-object p2, LM6/e$a;->g:LM6/e$a;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object p2, LM6/e$a;->h:LM6/e$a;

    .line 16
    .line 17
    :goto_0
    invoke-direct {v0, p3, v1, p2}, LM6/e;-><init>(Lcom/swmansion/rnscreens/Y;LM6/i;LM6/e$a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, LL6/o$f;

    .line 24
    .line 25
    invoke-direct {p2, p0}, LL6/o$f;-><init>(LL6/o;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic o(LL6/o;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/n;IILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/swmansion/rnscreens/m;->a:Lcom/swmansion/rnscreens/m;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    iget p3, p0, LL6/o;->m:I

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LL6/o;->n(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/n;I)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private final p(FFLL6/g;)Landroid/animation/ValueAnimator;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput p1, v0, v1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    aput p2, v0, p1

    .line 9
    .line 10
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, LL6/m;

    .line 15
    .line 16
    invoke-direct {p2, p3}, LL6/m;-><init>(LL6/g;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 20
    .line 21
    .line 22
    const-string p2, "apply(...)"

    .line 23
    .line 24
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method private static final q(LL6/g;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "animator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    instance-of v0, p1, Ljava/lang/Float;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Float;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0}, LL6/g;->d()LL6/d;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method private final t()Landroid/animation/ValueAnimator;
    .locals 3

    .line 1
    new-instance v0, LL6/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LL6/j;-><init>(LL6/o;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LX6/a;

    .line 7
    .line 8
    new-instance v2, LL6/k;

    .line 9
    .line 10
    invoke-direct {v2}, LL6/k;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, LX6/a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-float v0, v0

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v1, v0}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, LL6/l;

    .line 41
    .line 42
    invoke-direct {v1, p0}, LL6/l;-><init>(LL6/o;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 46
    .line 47
    .line 48
    const-string v1, "apply(...)"

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method private static final u(LL6/o;Ljava/lang/Number;)F
    .locals 0

    .line 1
    iget-object p0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-float p0, p0

    .line 8
    return p0
.end method

.method private static final v(Ljava/lang/Number;)Ljava/lang/Float;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method private static final w(LL6/o;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Float;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-direct {p0, p1}, LL6/o;->S(F)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final x(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/animation/ValueAnimator;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-int/2addr p1, v0

    .line 12
    int-to-float p1, p1

    .line 13
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sub-float/2addr p1, v0

    .line 20
    const/4 v0, 0x2

    .line 21
    new-array v0, v0, [F

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    aput v1, v0, v2

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    aput p1, v0, v1

    .line 29
    .line 30
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, LL6/n;

    .line 35
    .line 36
    invoke-direct {v0, p0}, LL6/n;-><init>(LL6/o;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "apply(...)"

    .line 43
    .line 44
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object p1
.end method

.method private static final y(LL6/o;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Float;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-direct {p0, p1}, LL6/o;->S(F)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final z()Landroid/view/inputmethod/InputMethodManager;
    .locals 2

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "input_method"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Landroid/view/inputmethod/InputMethodManager;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method


# virtual methods
.method public final A()Lcom/swmansion/rnscreens/y;
    .locals 1

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I(Landroidx/core/view/L0;)V
    .locals 1

    .line 1
    const-string v0, "insets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1, v0}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget p1, p1, Lx0/e;->d:I

    .line 15
    .line 16
    iput p1, p0, LL6/o;->l:I

    .line 17
    .line 18
    iget-boolean p1, p0, LL6/o;->j:Z

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-direct {p0, p1}, LL6/o;->S(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final P()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetShouldOverflowTopInset()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LL6/o;->O()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-direct {p0}, LL6/o;->Q()Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public final R(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 6

    .line 1
    const-string v0, "behavior"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LL6/o;->P()Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 13
    .line 14
    invoke-static {v1}, LL6/r;->b(Lcom/swmansion/rnscreens/y;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/y;->getContentWrapper()Lcom/swmansion/rnscreens/B;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v1}, LL6/r;->a(Landroid/view/View;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v2, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-nez v1, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LL6/p;->g()D

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    int-to-double v4, v4

    .line 64
    mul-double/2addr v1, v4

    .line 65
    double-to-int v1, v1

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :goto_0
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, LL6/p;->d()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v4, 0x3

    .line 81
    if-ne v1, v4, :cond_2

    .line 82
    .line 83
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iget v3, p0, LL6/o;->k:I

    .line 94
    .line 95
    invoke-virtual {v1, v0, v3}, LL6/p;->b(II)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :cond_2
    invoke-static {p1, v2, v3}, LL6/a;->b(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    new-instance p1, Li7/m;

    .line 108
    .line 109
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string v0, "[RNScreens] Failed to find window height during bottom sheet behaviour configuration"

    .line 116
    .line 117
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1
.end method

.method public a(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 9

    .line 1
    const-string v1, "v"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "insets"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p2, v1}, Landroidx/core/view/L0;->q(I)Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p2, v1}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "getInsets(...)"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p2, v3}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-static {v7, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroidx/core/view/L0$p;->a()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {p2, v3}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget v2, v7, Lx0/e;->b:I

    .line 55
    .line 56
    iget v3, v3, Lx0/e;->b:I

    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iput v2, p0, LL6/o;->k:I

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    if-eqz v6, :cond_0

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    iput-boolean v2, p0, LL6/o;->h:Z

    .line 69
    .line 70
    new-instance v2, Lcom/swmansion/rnscreens/o;

    .line 71
    .line 72
    iget v1, v1, Lx0/e;->d:I

    .line 73
    .line 74
    invoke-direct {v2, v1}, Lcom/swmansion/rnscreens/o;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, LL6/o;->i:Lcom/swmansion/rnscreens/n;

    .line 78
    .line 79
    invoke-direct {p0}, LL6/o;->B()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    iget-object v2, p0, LL6/o;->i:Lcom/swmansion/rnscreens/n;

    .line 86
    .line 87
    const/4 v4, 0x4

    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v3, 0x0

    .line 90
    move-object v0, p0

    .line 91
    invoke-static/range {v0 .. v5}, LL6/o;->o(LL6/o;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/n;IILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_0
    invoke-direct {p0}, LL6/o;->B()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    iget-boolean v2, p0, LL6/o;->h:Z

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    sget-object v2, Lcom/swmansion/rnscreens/l;->a:Lcom/swmansion/rnscreens/l;

    .line 106
    .line 107
    const/4 v4, 0x4

    .line 108
    const/4 v5, 0x0

    .line 109
    const/4 v3, 0x0

    .line 110
    move-object v0, p0

    .line 111
    invoke-static/range {v0 .. v5}, LL6/o;->o(LL6/o;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/n;IILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    iget-object v2, p0, LL6/o;->i:Lcom/swmansion/rnscreens/n;

    .line 116
    .line 117
    sget-object v3, Lcom/swmansion/rnscreens/m;->a:Lcom/swmansion/rnscreens/m;

    .line 118
    .line 119
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-nez v2, :cond_2

    .line 124
    .line 125
    const/4 v4, 0x4

    .line 126
    const/4 v5, 0x0

    .line 127
    move-object v2, v3

    .line 128
    const/4 v3, 0x0

    .line 129
    move-object v0, p0

    .line 130
    invoke-static/range {v0 .. v5}, LL6/o;->o(LL6/o;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/n;IILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 131
    .line 132
    .line 133
    :cond_2
    :goto_0
    sget-object v1, Lcom/swmansion/rnscreens/m;->a:Lcom/swmansion/rnscreens/m;

    .line 134
    .line 135
    iput-object v1, p0, LL6/o;->i:Lcom/swmansion/rnscreens/n;

    .line 136
    .line 137
    iput-boolean v8, p0, LL6/o;->h:Z

    .line 138
    .line 139
    :cond_3
    :goto_1
    if-nez v6, :cond_4

    .line 140
    .line 141
    iget v8, v7, Lx0/e;->d:I

    .line 142
    .line 143
    :cond_4
    new-instance v1, Landroidx/core/view/L0$a;

    .line 144
    .line 145
    invoke-direct {v1, p2}, Landroidx/core/view/L0$a;-><init>(Landroidx/core/view/L0;)V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    iget v3, v7, Lx0/e;->a:I

    .line 153
    .line 154
    iget v4, v7, Lx0/e;->b:I

    .line 155
    .line 156
    iget v5, v7, Lx0/e;->c:I

    .line 157
    .line 158
    invoke-static {v3, v4, v5, v8}, Lx0/e;->c(IIII)Lx0/e;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v1, v2, v3}, Landroidx/core/view/L0$a;->b(ILx0/e;)Landroidx/core/view/L0$a;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1}, Landroidx/core/view/L0$a;->a()Landroidx/core/view/L0;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    const-string v2, "build(...)"

    .line 171
    .line 172
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-object v1
.end method

.method public k(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, LL6/o$e;->a:[I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    aget p1, p1, p2

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    if-eq p1, p2, :cond_4

    .line 21
    .line 22
    const/4 p2, 0x2

    .line 23
    if-eq p1, p2, :cond_3

    .line 24
    .line 25
    const/4 p2, 0x3

    .line 26
    if-eq p1, p2, :cond_2

    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    if-eq p1, p2, :cond_1

    .line 30
    .line 31
    const/4 p2, 0x5

    .line 32
    if-eq p1, p2, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-direct {p0}, LL6/o;->E()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-direct {p0}, LL6/o;->F()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-direct {p0}, LL6/o;->G()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    invoke-direct {p0}, LL6/o;->H()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    invoke-direct {p0}, LL6/o;->D()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final m(I)I
    .locals 8

    .line 1
    invoke-virtual {p0}, LL6/o;->P()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 8
    .line 9
    invoke-static {v1}, LL6/r;->b(Lcom/swmansion/rnscreens/y;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/y;->getContentWrapper()Lcom/swmansion/rnscreens/B;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v2

    .line 30
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sub-int/2addr v0, v1

    .line 35
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_1
    iget-object v1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, LL6/p;->g()D

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 57
    .line 58
    invoke-static/range {v2 .. v7}, LB7/d;->j(DDD)D

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    int-to-double v3, v3

    .line 67
    mul-double/2addr v1, v3

    .line 68
    double-to-int v1, v1

    .line 69
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    sub-int/2addr v0, v1

    .line 74
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    return p1

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "[RNScreens] Failed to find window height during bottom sheet behaviour configuration"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public final n(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/n;I)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v2

    .line 6
    const-string v1, "behavior"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "keyboardState"

    .line 12
    .line 13
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LL6/o;->P()Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_12

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-virtual {p1, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O0(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I0(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v4, p0, LL6/o;->o:LL6/o$d;

    .line 30
    .line 31
    invoke-virtual {p1, v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 32
    .line 33
    .line 34
    iget-object v4, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/swmansion/rnscreens/y;->getFooter()Lcom/swmansion/rnscreens/D;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4, p1}, Lcom/swmansion/rnscreens/D;->q(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    instance-of v4, p2, Lcom/swmansion/rnscreens/m;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const-string v6, ". Expected at most 3."

    .line 49
    .line 50
    const-string v7, "[RNScreens] Invalid detent count "

    .line 51
    .line 52
    const/4 v8, 0x2

    .line 53
    if-eqz v4, :cond_5

    .line 54
    .line 55
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2}, LL6/p;->d()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eq p2, v3, :cond_3

    .line 66
    .line 67
    if-eq p2, v8, :cond_2

    .line 68
    .line 69
    if-ne p2, v0, :cond_1

    .line 70
    .line 71
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 72
    .line 73
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2, p3}, LL6/p;->k(I)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    iget-object p3, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 82
    .line 83
    invoke-virtual {p3}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {p3, v0}, LL6/p;->c(I)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, LL6/p;->e()F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    invoke-virtual {v2, v3}, LL6/p;->i(I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    iget-object v3, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    iget v4, p0, LL6/o;->k:I

    .line 130
    .line 131
    invoke-virtual {v3, v1, v4}, LL6/p;->b(II)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    move-object v3, p1

    .line 156
    invoke-static/range {v3 .. v8}, LL6/a;->f(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 164
    .line 165
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-virtual {p2}, LL6/p;->d()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    new-instance p3, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p1

    .line 195
    :cond_2
    move-object v9, v1

    .line 196
    move-object v1, p1

    .line 197
    move-object p1, v9

    .line 198
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 199
    .line 200
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p2, p3}, LL6/p;->k(I)I

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    iget-object p3, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 213
    .line 214
    invoke-virtual {p3}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-virtual {p3, v0}, LL6/p;->c(I)I

    .line 223
    .line 224
    .line 225
    move-result p3

    .line 226
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    invoke-virtual {v0, p1}, LL6/p;->i(I)I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-static {v1, p2, p3, p1}, LL6/a;->h(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    return-object p1

    .line 253
    :cond_3
    move-object v9, v1

    .line 254
    move-object v1, p1

    .line 255
    move-object p1, v9

    .line 256
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 257
    .line 258
    invoke-static {p2}, LL6/r;->b(Lcom/swmansion/rnscreens/y;)Z

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    if-eqz p2, :cond_4

    .line 263
    .line 264
    iget-object p1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 265
    .line 266
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 271
    .line 272
    invoke-virtual {p1, p2}, LL6/p;->j(Lcom/swmansion/rnscreens/y;)I

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    goto :goto_0

    .line 277
    :cond_4
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 278
    .line 279
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    invoke-virtual {p2, p1}, LL6/p;->i(I)I

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    const/4 p2, 0x0

    .line 296
    invoke-static {v1, p1, v5, v8, p2}, LL6/a;->e(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 297
    .line 298
    .line 299
    return-object v1

    .line 300
    :cond_5
    move-object v9, v1

    .line 301
    move-object v1, p1

    .line 302
    move-object p1, v9

    .line 303
    instance-of p3, p2, Lcom/swmansion/rnscreens/o;

    .line 304
    .line 305
    if-eqz p3, :cond_c

    .line 306
    .line 307
    check-cast p2, Lcom/swmansion/rnscreens/o;

    .line 308
    .line 309
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/o;->a()I

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    if-eqz p1, :cond_6

    .line 314
    .line 315
    move v5, v3

    .line 316
    :cond_6
    iget-object p1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 317
    .line 318
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {p1}, LL6/p;->d()I

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    if-eq p1, v3, :cond_b

    .line 327
    .line 328
    if-eq p1, v8, :cond_9

    .line 329
    .line 330
    if-ne p1, v0, :cond_8

    .line 331
    .line 332
    if-eqz v5, :cond_7

    .line 333
    .line 334
    const/16 v7, 0x1e

    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    const/4 v3, 0x0

    .line 338
    const/4 v4, 0x0

    .line 339
    const/4 v5, 0x0

    .line 340
    const/4 v6, 0x0

    .line 341
    invoke-static/range {v1 .. v8}, LL6/a;->g(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 342
    .line 343
    .line 344
    move-object v0, v1

    .line 345
    goto :goto_1

    .line 346
    :cond_7
    move-object v0, v1

    .line 347
    const/16 v6, 0x1f

    .line 348
    .line 349
    const/4 v7, 0x0

    .line 350
    const/4 v1, 0x0

    .line 351
    const/4 v2, 0x0

    .line 352
    const/4 v3, 0x0

    .line 353
    const/4 v4, 0x0

    .line 354
    const/4 v5, 0x0

    .line 355
    invoke-static/range {v0 .. v7}, LL6/a;->g(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 356
    .line 357
    .line 358
    :goto_1
    iget-object p1, p0, LL6/o;->p:LL6/o$b;

    .line 359
    .line 360
    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 361
    .line 362
    .line 363
    return-object v0

    .line 364
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 365
    .line 366
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 367
    .line 368
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 369
    .line 370
    .line 371
    move-result-object p2

    .line 372
    invoke-virtual {p2}, LL6/p;->d()I

    .line 373
    .line 374
    .line 375
    move-result p2

    .line 376
    new-instance p3, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw p1

    .line 398
    :cond_9
    move-object v0, v1

    .line 399
    if-eqz v5, :cond_a

    .line 400
    .line 401
    const/4 v5, 0x6

    .line 402
    const/4 v6, 0x0

    .line 403
    const/4 v3, 0x0

    .line 404
    const/4 v4, 0x0

    .line 405
    move-object v1, v0

    .line 406
    invoke-static/range {v1 .. v6}, LL6/a;->i(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 407
    .line 408
    .line 409
    goto :goto_2

    .line 410
    :cond_a
    const/4 v4, 0x7

    .line 411
    const/4 v5, 0x0

    .line 412
    const/4 v1, 0x0

    .line 413
    const/4 v2, 0x0

    .line 414
    const/4 v3, 0x0

    .line 415
    invoke-static/range {v0 .. v5}, LL6/a;->i(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 416
    .line 417
    .line 418
    move-object v1, v0

    .line 419
    :goto_2
    iget-object p1, p0, LL6/o;->p:LL6/o$b;

    .line 420
    .line 421
    invoke-virtual {v1, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 422
    .line 423
    .line 424
    return-object v1

    .line 425
    :cond_b
    iget-object p1, p0, LL6/o;->p:LL6/o$b;

    .line 426
    .line 427
    invoke-virtual {v1, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 428
    .line 429
    .line 430
    return-object v1

    .line 431
    :cond_c
    instance-of p2, p2, Lcom/swmansion/rnscreens/l;

    .line 432
    .line 433
    if-eqz p2, :cond_11

    .line 434
    .line 435
    iget-object p2, p0, LL6/o;->p:LL6/o$b;

    .line 436
    .line 437
    invoke-virtual {v1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D0(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 438
    .line 439
    .line 440
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 441
    .line 442
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 443
    .line 444
    .line 445
    move-result-object p2

    .line 446
    invoke-virtual {p2}, LL6/p;->d()I

    .line 447
    .line 448
    .line 449
    move-result p2

    .line 450
    if-eq p2, v3, :cond_f

    .line 451
    .line 452
    if-eq p2, v8, :cond_e

    .line 453
    .line 454
    if-ne p2, v0, :cond_d

    .line 455
    .line 456
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 457
    .line 458
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 459
    .line 460
    .line 461
    move-result-object p2

    .line 462
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 463
    .line 464
    .line 465
    move-result p3

    .line 466
    invoke-virtual {p2, p3}, LL6/p;->c(I)I

    .line 467
    .line 468
    .line 469
    move-result p2

    .line 470
    iget-object p3, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 471
    .line 472
    invoke-virtual {p3}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 473
    .line 474
    .line 475
    move-result-object p3

    .line 476
    invoke-virtual {p3}, LL6/p;->e()F

    .line 477
    .line 478
    .line 479
    move-result p3

    .line 480
    iget-object v0, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 481
    .line 482
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    invoke-virtual {v0, v2}, LL6/p;->i(I)I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    iget-object v2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 495
    .line 496
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    iget v3, p0, LL6/o;->k:I

    .line 505
    .line 506
    invoke-virtual {v2, p1, v3}, LL6/p;->b(II)I

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    const/4 v6, 0x1

    .line 527
    const/4 v7, 0x0

    .line 528
    move-object v0, v1

    .line 529
    const/4 v1, 0x0

    .line 530
    invoke-static/range {v0 .. v7}, LL6/a;->g(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    return-object p1

    .line 535
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 536
    .line 537
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 538
    .line 539
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 540
    .line 541
    .line 542
    move-result-object p2

    .line 543
    invoke-virtual {p2}, LL6/p;->d()I

    .line 544
    .line 545
    .line 546
    move-result p2

    .line 547
    new-instance p3, Ljava/lang/StringBuilder;

    .line 548
    .line 549
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 550
    .line 551
    .line 552
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object p2

    .line 565
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    throw p1

    .line 569
    :cond_e
    move-object v0, v1

    .line 570
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 571
    .line 572
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 573
    .line 574
    .line 575
    move-result-object p2

    .line 576
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 577
    .line 578
    .line 579
    move-result p3

    .line 580
    invoke-virtual {p2, p3}, LL6/p;->c(I)I

    .line 581
    .line 582
    .line 583
    move-result p2

    .line 584
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 589
    .line 590
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 591
    .line 592
    .line 593
    move-result-object p2

    .line 594
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 595
    .line 596
    .line 597
    move-result p1

    .line 598
    invoke-virtual {p2, p1}, LL6/p;->i(I)I

    .line 599
    .line 600
    .line 601
    move-result p1

    .line 602
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    const/4 v4, 0x1

    .line 607
    const/4 v5, 0x0

    .line 608
    const/4 v1, 0x0

    .line 609
    invoke-static/range {v0 .. v5}, LL6/a;->i(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    return-object p1

    .line 614
    :cond_f
    move-object v0, v1

    .line 615
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 616
    .line 617
    invoke-static {p2}, LL6/r;->b(Lcom/swmansion/rnscreens/y;)Z

    .line 618
    .line 619
    .line 620
    move-result p2

    .line 621
    if-eqz p2, :cond_10

    .line 622
    .line 623
    iget-object p1, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 624
    .line 625
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 626
    .line 627
    .line 628
    move-result-object p1

    .line 629
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 630
    .line 631
    invoke-virtual {p1, p2}, LL6/p;->j(Lcom/swmansion/rnscreens/y;)I

    .line 632
    .line 633
    .line 634
    move-result p1

    .line 635
    goto :goto_3

    .line 636
    :cond_10
    iget-object p2, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 637
    .line 638
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 639
    .line 640
    .line 641
    move-result-object p2

    .line 642
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result p1

    .line 646
    invoke-virtual {p2, p1}, LL6/p;->i(I)I

    .line 647
    .line 648
    .line 649
    move-result p1

    .line 650
    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    invoke-static {v0, p1, v5}, LL6/a;->d(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Z)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 655
    .line 656
    .line 657
    return-object v0

    .line 658
    :cond_11
    new-instance p1, Li7/m;

    .line 659
    .line 660
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 661
    .line 662
    .line 663
    throw p1

    .line 664
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 665
    .line 666
    const-string p2, "[RNScreens] Failed to find window height during bottom sheet behaviour configuration"

    .line 667
    .line 668
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    throw p1
.end method

.method public final r(LL6/o$c;)Landroid/animation/Animator;
    .locals 6

    .line 1
    const-string v0, "sheetAnimationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LL6/o$c;->b()LL6/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, LL6/o$c;->c()Lcom/swmansion/rnscreens/X;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1}, LL6/g;->e()F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {p0, v2, v3, v1}, LL6/o;->p(FFLL6/g;)Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {p0}, LL6/o;->t()Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v4, p0, LL6/o;->g:Lcom/swmansion/rnscreens/y;

    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/swmansion/rnscreens/y;->getSheetInitialDetentIndex()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1, v4, v5}, LL6/g;->j(Lcom/swmansion/rnscreens/y;I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v3, 0x0

    .line 50
    :goto_0
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 53
    .line 54
    .line 55
    :cond_1
    const/4 v1, 0x1

    .line 56
    invoke-direct {p0, v0, v1, p1}, LL6/o;->l(Landroid/animation/AnimatorSet;ZLcom/swmansion/rnscreens/X;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public final s(LL6/o$c;)Landroid/animation/Animator;
    .locals 5

    .line 1
    const-string v0, "sheetAnimationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LL6/o$c;->a()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, LL6/o$c;->b()LL6/g;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1}, LL6/o$c;->c()Lcom/swmansion/rnscreens/X;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v2}, LL6/g;->d()LL6/d;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {p0, v3, v4, v2}, LL6/o;->p(FFLL6/g;)Landroid/animation/ValueAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {p0, v1}, LL6/o;->x(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {p0, v0, v1, p1}, LL6/o;->l(Landroid/animation/AnimatorSet;ZLcom/swmansion/rnscreens/X;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method
