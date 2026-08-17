.class public final Lcom/swmansion/rnscreens/y;
.super Lcom/swmansion/rnscreens/h;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/swmansion/rnscreens/B$a;
.implements LO6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/y$a;,
        Lcom/swmansion/rnscreens/y$b;,
        Lcom/swmansion/rnscreens/y$c;,
        Lcom/swmansion/rnscreens/y$d;,
        Lcom/swmansion/rnscreens/y$e;,
        Lcom/swmansion/rnscreens/y$f;,
        Lcom/swmansion/rnscreens/y$g;
    }
.end annotation


# static fields
.field public static final P:Lcom/swmansion/rnscreens/y$b;


# instance fields
.field private A:F

.field private B:Z

.field private C:LL6/p;

.field private D:I

.field private E:I

.field private F:Z

.field private G:F

.field private H:Z

.field private I:Z

.field private J:Z

.field private K:Lcom/swmansion/rnscreens/D;

.field private L:Ljava/lang/String;

.field private M:Ljava/lang/Boolean;

.field private N:Ljava/lang/Boolean;

.field private O:Z

.field private final k:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private l:Z

.field private m:Lcom/swmansion/rnscreens/G;

.field private n:Lcom/swmansion/rnscreens/A;

.field private o:Lcom/swmansion/rnscreens/y$a;

.field private p:Z

.field private q:Lcom/swmansion/rnscreens/y$e;

.field private r:Lcom/swmansion/rnscreens/y$c;

.field private s:Lcom/swmansion/rnscreens/y$d;

.field private t:Z

.field private u:Ljava/lang/Integer;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/Boolean;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/y$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/y$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/y;->P:Lcom/swmansion/rnscreens/y$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 3

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/h;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->k:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    sget-object p1, Lcom/swmansion/rnscreens/y$e;->g:Lcom/swmansion/rnscreens/y$e;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->q:Lcom/swmansion/rnscreens/y$e;

    .line 14
    .line 15
    sget-object p1, Lcom/swmansion/rnscreens/y$c;->h:Lcom/swmansion/rnscreens/y$c;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->r:Lcom/swmansion/rnscreens/y$c;

    .line 18
    .line 19
    sget-object p1, Lcom/swmansion/rnscreens/y$d;->g:Lcom/swmansion/rnscreens/y$d;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->s:Lcom/swmansion/rnscreens/y$d;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->t:Z

    .line 25
    .line 26
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->B:Z

    .line 27
    .line 28
    new-instance v0, LL6/p;

    .line 29
    .line 30
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 31
    .line 32
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {v0, v1}, LL6/p;-><init>(Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/swmansion/rnscreens/y;->C:LL6/p;

    .line 44
    .line 45
    const/4 v0, -0x1

    .line 46
    iput v0, p0, Lcom/swmansion/rnscreens/y;->D:I

    .line 47
    .line 48
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->F:Z

    .line 49
    .line 50
    const/high16 v0, 0x41c00000    # 24.0f

    .line 51
    .line 52
    iput v0, p0, Lcom/swmansion/rnscreens/y;->G:F

    .line 53
    .line 54
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->I:Z

    .line 55
    .line 56
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 57
    .line 58
    const/4 v1, 0x2

    .line 59
    invoke-direct {v0, v1}, Landroid/view/WindowManager$LayoutParams;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->O:Z

    .line 66
    .line 67
    return-void
.end method

.method private final B(IF)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, LN6/a;->a(Landroidx/fragment/app/Fragment;)Lcom/swmansion/rnscreens/X;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->d0()LL6/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, LL6/o;->P()Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    add-float/2addr v0, p2

    .line 31
    float-to-int p2, v0

    .line 32
    invoke-static {p1, p2}, LB7/d;->h(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    :cond_0
    return p1
.end method

.method private final C(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 3

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x2

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, p2, v2, v0, v1}, LL6/a;->e(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final E(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    instance-of v3, v2, Landroid/widget/ImageView;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    new-instance v3, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    instance-of v3, v2, Lcom/swmansion/rnscreens/a0;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    move-object v3, v2

    .line 45
    check-cast v3, Lcom/swmansion/rnscreens/a0;

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/swmansion/rnscreens/a0;->getToolbar()Lcom/swmansion/rnscreens/e;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/y;->E(Landroid/view/ViewGroup;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    check-cast v2, Landroid/view/ViewGroup;

    .line 59
    .line 60
    invoke-direct {p0, v2}, Lcom/swmansion/rnscreens/y;->E(Landroid/view/ViewGroup;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    return-void
.end method

.method private final G(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p2, v0}, Lcom/swmansion/rnscreens/y;->B(IF)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-direct {p0, p3, v0}, Lcom/swmansion/rnscreens/y;->B(IF)I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    sub-int p2, p3, p2

    .line 14
    .line 15
    int-to-float p2, p2

    .line 16
    const/4 v1, 0x0

    .line 17
    cmpg-float v2, p2, v1

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    cmpl-float v1, p2, v1

    .line 23
    .line 24
    if-lez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-float/2addr v1, p2

    .line 31
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance v0, Lcom/swmansion/rnscreens/u;

    .line 43
    .line 44
    invoke-direct {v0, p1, p3, p0}, Lcom/swmansion/rnscreens/u;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;ILcom/swmansion/rnscreens/y;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Lcom/swmansion/rnscreens/v;

    .line 52
    .line 53
    invoke-direct {p2, p0}, Lcom/swmansion/rnscreens/v;-><init>(Lcom/swmansion/rnscreens/y;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    sub-float p2, v0, p2

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, p2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    new-instance v1, Lcom/swmansion/rnscreens/w;

    .line 75
    .line 76
    invoke-direct {v1, p1, p3}, Lcom/swmansion/rnscreens/w;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, Lcom/swmansion/rnscreens/x;

    .line 84
    .line 85
    invoke-direct {p2, p0, p3, v0}, Lcom/swmansion/rnscreens/x;-><init>(Lcom/swmansion/rnscreens/y;IF)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method private static final H(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;ILcom/swmansion/rnscreens/y;)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-static {p0, v0, v1, v2, v1}, LL6/a;->c(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sub-int/2addr v0, p1

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p2, p0, v0, p1, v1}, Landroid/view/View;->layout(IIII)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static final I(Lcom/swmansion/rnscreens/y;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/view/ViewParent;->requestLayout()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->y()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final J(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-static {p0, p1, v0, v1, v0}, LL6/a;->c(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final K(Lcom/swmansion/rnscreens/y;IF)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v1, p1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p0, v0, v1, p1, v2}, Landroid/view/View;->layout(IIII)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Landroid/view/ViewParent;->requestLayout()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->y()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final L(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p2, v0}, Lcom/swmansion/rnscreens/y;->B(IF)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {p1, v0, v1, v2, v1}, LL6/a;->c(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr v0, p2

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Landroid/view/ViewParent;->requestLayout()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    float-to-int v1, v1

    .line 58
    add-int/2addr v0, v1

    .line 59
    invoke-virtual {p0, p1, p2, v0}, Lcom/swmansion/rnscreens/h;->b(III)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static synthetic d(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;ILcom/swmansion/rnscreens/y;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/y;->H(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;ILcom/swmansion/rnscreens/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/swmansion/rnscreens/y;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/y;->I(Lcom/swmansion/rnscreens/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/y;->J(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/swmansion/rnscreens/y;IF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/y;->K(Lcom/swmansion/rnscreens/y;IF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final i(III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/h;->b(III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final j(IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->k:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v2, LM6/s;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v2, v0, v3, p1, p2}, LM6/s;-><init>(IIIZ)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private final l(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/core/view/g0;->a(Landroid/view/ViewGroup;)LO8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    instance-of v2, v1, Lcom/swmansion/rnscreens/a0;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, Lcom/swmansion/rnscreens/a0;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/a0;->getToolbar()Lcom/swmansion/rnscreens/e;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {p0, v2}, Lcom/swmansion/rnscreens/y;->l(Landroid/view/ViewGroup;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    check-cast v1, Landroid/view/ViewGroup;

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lcom/swmansion/rnscreens/y;->l(Landroid/view/ViewGroup;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-void
.end method

.method private final m(Landroid/view/ViewGroup;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    instance-of v4, v3, Landroid/webkit/WebView;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    return v5

    .line 19
    :cond_0
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    check-cast v3, Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/y;->m(Landroid/view/ViewGroup;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    return v5

    .line 32
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v1
.end method

.method private final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->n:Lcom/swmansion/rnscreens/A;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/swmansion/rnscreens/S;

    .line 4
    .line 5
    return v0
.end method


# virtual methods
.method public final A()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/y;->J:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final D()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->x:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/y;->x:Z

    .line 7
    .line 8
    invoke-direct {p0, p0}, Lcom/swmansion/rnscreens/y;->E(Landroid/view/ViewGroup;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final F()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/y;->J:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->startPostponedEnterTransition()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public a(ZIIII)V
    .locals 0

    .line 1
    sub-int/2addr p5, p3

    .line 2
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p0}, LL6/r;->d(Lcom/swmansion/rnscreens/y;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_3

    .line 11
    .line 12
    invoke-static {p0}, LL6/r;->b(Lcom/swmansion/rnscreens/y;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_3

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    invoke-static {p1}, LL6/a;->a(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    const/4 p3, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p3, 0x0

    .line 29
    :goto_0
    if-eq p2, p5, :cond_3

    .line 30
    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, p1, p5}, Lcom/swmansion/rnscreens/y;->C(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-boolean p3, p0, Lcom/swmansion/rnscreens/y;->I:Z

    .line 38
    .line 39
    if-eqz p3, :cond_2

    .line 40
    .line 41
    invoke-direct {p0, p1, p2, p5}, Lcom/swmansion/rnscreens/y;->G(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;II)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-direct {p0, p1, p5}, Lcom/swmansion/rnscreens/y;->L(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getActivityState()Lcom/swmansion/rnscreens/y$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->o:Lcom/swmansion/rnscreens/y$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAssociatedFragment()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getContainer()Lcom/swmansion/rnscreens/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->n:Lcom/swmansion/rnscreens/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContentWrapper()Lcom/swmansion/rnscreens/B;
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/core/view/g0;->a(Landroid/view/ViewGroup;)LO8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, Landroid/view/View;

    .line 22
    .line 23
    instance-of v3, v3, Lcom/swmansion/rnscreens/B;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_0
    instance-of v0, v1, Lcom/swmansion/rnscreens/B;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    check-cast v1, Lcom/swmansion/rnscreens/B;

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_2
    return-object v2
.end method

.method public final getFooter()Lcom/swmansion/rnscreens/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->K:Lcom/swmansion/rnscreens/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFragment()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->m:Lcom/swmansion/rnscreens/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getFragmentWrapper()Lcom/swmansion/rnscreens/G;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->m:Lcom/swmansion/rnscreens/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeaderConfig()Lcom/swmansion/rnscreens/a0;
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/core/view/g0;->a(Landroid/view/ViewGroup;)LO8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, Landroid/view/View;

    .line 22
    .line 23
    instance-of v3, v3, Lcom/swmansion/rnscreens/a0;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_0
    instance-of v0, v1, Lcom/swmansion/rnscreens/a0;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    check-cast v1, Lcom/swmansion/rnscreens/a0;

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_2
    return-object v2
.end method

.method public final getInsetsApplied()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNativeBackButtonDismissalEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->O:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->k:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->k:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final getReplaceAnimation()Lcom/swmansion/rnscreens/y$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->r:Lcom/swmansion/rnscreens/y$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScreenId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScreenOrientation()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Lcom/swmansion/rnscreens/y;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->e()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v0, v2

    .line 22
    :goto_1
    instance-of v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_2
    return-object v2
.end method

.method public final getSheetClosesOnTouchOutside()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->F:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSheetCornerRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/y;->A:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSheetDefaultResizeAnimationEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->I:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSheetDetents()LL6/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->C:LL6/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSheetElevation()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/y;->G:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSheetExpandsWhenScrolledToEdge()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->B:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSheetInitialDetentIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/y;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSheetLargestUndimmedDetentIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/y;->D:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSheetShouldOverflowTopInset()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->H:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getShouldTriggerPostponedTransitionAfterLayout()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->J:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getStackAnimation()Lcom/swmansion/rnscreens/y$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->s:Lcom/swmansion/rnscreens/y$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStackPresentation()Lcom/swmansion/rnscreens/y$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->q:Lcom/swmansion/rnscreens/y$e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStatusBarStyle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->L:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getHeaderConfig()Lcom/swmansion/rnscreens/a0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/a0;->getToolbar()Lcom/swmansion/rnscreens/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->x:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/y;->x:Z

    .line 8
    .line 9
    invoke-direct {p0, p0}, Lcom/swmansion/rnscreens/y;->l(Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/y;->l:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, LL6/r;->d(Lcom/swmansion/rnscreens/y;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, LN6/a;->a(Landroidx/fragment/app/Fragment;)Lcom/swmansion/rnscreens/X;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->d0()LL6/o;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    sget-object v1, Lcom/swmansion/rnscreens/k;->g:Lcom/swmansion/rnscreens/k;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lcom/swmansion/rnscreens/k;->b(Landroidx/core/view/I;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/y;->o()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    invoke-static {p0}, LL6/r;->d(Lcom/swmansion/rnscreens/y;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_3

    .line 14
    .line 15
    sub-int/2addr p4, p2

    .line 16
    sub-int/2addr p5, p3

    .line 17
    iget-boolean p1, p0, Lcom/swmansion/rnscreens/y;->l:Z

    .line 18
    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getHeaderConfig()Lcom/swmansion/rnscreens/a0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/a0;->h()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getHeaderConfig()Lcom/swmansion/rnscreens/a0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/a0;->i()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, Lcom/swmansion/rnscreens/y;->k:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 p1, 0x0

    .line 65
    :goto_0
    if-eqz p1, :cond_1

    .line 66
    .line 67
    invoke-static {p1}, LY6/a;->a(Landroid/view/View;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    sub-int/2addr p5, p1

    .line 72
    add-int/2addr p3, p1

    .line 73
    invoke-direct {p0, p4, p5, p3}, Lcom/swmansion/rnscreens/y;->i(III)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    const-string p2, "[RNScreens] DecorView is required for applying inset correction, but was null."

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_2
    invoke-direct {p0, p4, p5, p3}, Lcom/swmansion/rnscreens/y;->i(III)V

    .line 86
    .line 87
    .line 88
    :cond_3
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-static {p0}, LL6/r;->d(Lcom/swmansion/rnscreens/y;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final p()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->N:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->w:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->M:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->q:Lcom/swmansion/rnscreens/y$e;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/y$f;->a:[I

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
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_0
    return v1
.end method

.method public final setActivityState(Lcom/swmansion/rnscreens/y$a;)V
    .locals 2

    .line 1
    const-string v0, "activityState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->o:Lcom/swmansion/rnscreens/y$a;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/swmansion/rnscreens/y;->n:Lcom/swmansion/rnscreens/A;

    .line 12
    .line 13
    instance-of v1, v1, Lcom/swmansion/rnscreens/S;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ltz v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "[RNScreens] activityState can only progress in NativeStack"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_2
    :goto_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->o:Lcom/swmansion/rnscreens/y$a;

    .line 38
    .line 39
    iget-object p1, p0, Lcom/swmansion/rnscreens/y;->n:Lcom/swmansion/rnscreens/A;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/A;->r()V

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_1
    return-void
.end method

.method public final setBeingRemoved(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->x:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setContainer(Lcom/swmansion/rnscreens/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->n:Lcom/swmansion/rnscreens/A;

    .line 2
    .line 3
    return-void
.end method

.method public final setFooter(Lcom/swmansion/rnscreens/D;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->K:Lcom/swmansion/rnscreens/D;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/swmansion/rnscreens/y;->K:Lcom/swmansion/rnscreens/D;

    .line 14
    .line 15
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/swmansion/rnscreens/D;->v(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/swmansion/rnscreens/D;->q(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->K:Lcom/swmansion/rnscreens/D;

    .line 34
    .line 35
    return-void
.end method

.method public final setFragmentWrapper(Lcom/swmansion/rnscreens/G;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->m:Lcom/swmansion/rnscreens/G;

    .line 2
    .line 3
    return-void
.end method

.method public final setGestureEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setInsetsApplied(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLayerType(ILandroid/graphics/Paint;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setNativeBackButtonDismissalEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->O:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNavigationBarHidden(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/g0;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->N:Ljava/lang/Boolean;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/swmansion/rnscreens/y;->m:Lcom/swmansion/rnscreens/G;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->e()Landroid/app/Activity;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/g0;->l(Lcom/swmansion/rnscreens/y;Landroid/app/Activity;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final setReplaceAnimation(Lcom/swmansion/rnscreens/y$c;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->r:Lcom/swmansion/rnscreens/y$c;

    .line 7
    .line 8
    return-void
.end method

.method public final setScreenId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setScreenOrientation(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->u:Ljava/lang/Integer;

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    sget-object v0, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/g0;->d()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sparse-switch v1, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_0
    const-string v1, "landscape_right"

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    goto :goto_1

    .line 31
    :sswitch_1
    const-string v1, "landscape_left"

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/16 p1, 0x8

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :sswitch_2
    const-string v1, "portrait_up"

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 p1, 0x1

    .line 53
    goto :goto_1

    .line 54
    :sswitch_3
    const-string v1, "landscape"

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    const/4 p1, 0x6

    .line 64
    goto :goto_1

    .line 65
    :sswitch_4
    const-string v1, "portrait"

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_5

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    const/4 p1, 0x7

    .line 75
    goto :goto_1

    .line 76
    :sswitch_5
    const-string v1, "all"

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_6

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_6
    const/16 p1, 0xa

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :sswitch_6
    const-string v1, "portrait_down"

    .line 89
    .line 90
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_7

    .line 95
    .line 96
    :goto_0
    const/4 p1, -0x1

    .line 97
    goto :goto_1

    .line 98
    :cond_7
    const/16 p1, 0x9

    .line 99
    .line 100
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->u:Ljava/lang/Integer;

    .line 105
    .line 106
    iget-object p1, p0, Lcom/swmansion/rnscreens/y;->m:Lcom/swmansion/rnscreens/G;

    .line 107
    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->e()Landroid/app/Activity;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/g0;->m(Lcom/swmansion/rnscreens/y;Landroid/app/Activity;)V

    .line 115
    .line 116
    .line 117
    :cond_8
    return-void

    .line 118
    nop

    .line 119
    :sswitch_data_0
    .sparse-switch
        -0x70f1d53a -> :sswitch_6
        0x179a1 -> :sswitch_5
        0x2b77bb9b -> :sswitch_4
        0x5545f2bb -> :sswitch_3
        0x62724dbf -> :sswitch_2
        0x6728e30b -> :sswitch_1
        0x7e49df98 -> :sswitch_0
    .end sparse-switch
.end method

.method public final setSheetClosesOnTouchOutside(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSheetCornerRadius(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/y;->A:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, p0, Lcom/swmansion/rnscreens/y;->A:F

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->z:Z

    .line 12
    .line 13
    return-void
.end method

.method public final setSheetDefaultResizeAnimationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->I:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSheetDetents(LL6/p;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->C:LL6/p;

    .line 7
    .line 8
    return-void
.end method

.method public final setSheetElevation(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/y;->G:F

    .line 2
    .line 3
    return-void
.end method

.method public final setSheetExpandsWhenScrolledToEdge(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->B:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSheetGrabberVisible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSheetInitialDetentIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/y;->E:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSheetLargestUndimmedDetentIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/y;->D:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSheetShouldOverflowTopInset(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->H:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setShouldTriggerPostponedTransitionAfterLayout(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->J:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setStackAnimation(Lcom/swmansion/rnscreens/y$d;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->s:Lcom/swmansion/rnscreens/y$d;

    .line 7
    .line 8
    return-void
.end method

.method public final setStackPresentation(Lcom/swmansion/rnscreens/y$e;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->q:Lcom/swmansion/rnscreens/y$e;

    .line 7
    .line 8
    return-void
.end method

.method public final setStatusBarAnimated(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->w:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setStatusBarHidden(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/g0;->e()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->M:Ljava/lang/Boolean;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/swmansion/rnscreens/y;->m:Lcom/swmansion/rnscreens/G;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->e()Landroid/app/Activity;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/g0;->k(Lcom/swmansion/rnscreens/y;Landroid/app/Activity;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final setStatusBarStyle(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/g0;->e()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->L:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/swmansion/rnscreens/y;->m:Lcom/swmansion/rnscreens/G;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->e()Landroid/app/Activity;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->i()Lcom/facebook/react/bridge/ReactContext;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p0, v1, p1}, Lcom/swmansion/rnscreens/g0;->o(Lcom/swmansion/rnscreens/y;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final setTransitioning(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->p:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/y;->p:Z

    .line 7
    .line 8
    invoke-direct {p0, p0}, Lcom/swmansion/rnscreens/y;->m(Landroid/view/ViewGroup;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x2

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getLayerType()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eq v2, v1, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    if-eqz p1, :cond_2

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const/4 v1, 0x0

    .line 28
    :goto_1
    const/4 p1, 0x0

    .line 29
    invoke-super {p0, v1, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final t(I)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v0, v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, LM6/d;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-float p1, p1

    .line 33
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    float-to-double v4, p1

    .line 38
    invoke-direct {v2, v1, v3, v4, v5}, LM6/d;-><init>(IID)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public final u(Z)V
    .locals 10

    .line 1
    invoke-static {p0}, LL6/r;->d(Lcom/swmansion/rnscreens/y;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/swmansion/rnscreens/y;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0}, LL6/r;->b(Lcom/swmansion/rnscreens/y;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    :cond_1
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-direct {p0, v0, v1, v2}, Lcom/swmansion/rnscreens/y;->i(III)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v3, p0, Lcom/swmansion/rnscreens/y;->K:Lcom/swmansion/rnscreens/D;

    .line 41
    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->n:Lcom/swmansion/rnscreens/A;

    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    move v4, p1

    .line 70
    invoke-virtual/range {v3 .. v9}, Lcom/swmansion/rnscreens/D;->p(ZIIIII)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_0
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/y;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/y;->z:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->w()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final w()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->q:Lcom/swmansion/rnscreens/y$e;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/y$e;->j:Lcom/swmansion/rnscreens/y$e;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Lh5/h;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lh5/h;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lcom/swmansion/rnscreens/y;->A:F

    .line 29
    .line 30
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    new-instance v2, Lh5/l$b;

    .line 40
    .line 41
    invoke-direct {v2}, Lh5/l$b;-><init>()V

    .line 42
    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v2, v3, v1}, Lh5/l$b;->A(IF)Lh5/l$b;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3, v1}, Lh5/l$b;->F(IF)Lh5/l$b;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lh5/l$b;->m()Lh5/l;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Lh5/h;->setShapeAppearanceModel(Lh5/l;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_1
    return-void
.end method

.method public final x(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/y;->j(IZ)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->y()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final y()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    float-to-int v3, v3

    .line 18
    add-int/2addr v2, v3

    .line 19
    invoke-virtual {p0, v0, v1, v2}, Lcom/swmansion/rnscreens/h;->b(III)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final z(Lcom/swmansion/rnscreens/B;)V
    .locals 1

    .line 1
    const-string v0, "wrapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lcom/swmansion/rnscreens/B;->setDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/B$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
