.class final LL6/g$a;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/swmansion/rnscreens/y;

.field private final b:Landroid/view/View;

.field private final c:F

.field private d:F

.field private e:F

.field private f:F

.field private final g:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/y;Landroid/view/View;F)V
    .locals 2

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewToAnimate"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LL6/g$a;->a:Lcom/swmansion/rnscreens/y;

    .line 15
    .line 16
    iput-object p2, p0, LL6/g$a;->b:Landroid/view/View;

    .line 17
    .line 18
    iput p3, p0, LL6/g$a;->c:F

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetLargestUndimmedDetentIndex()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-direct {p0, p2}, LL6/g$a;->f(I)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iput p2, p0, LL6/g$a;->d:F

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetLargestUndimmedDetentIndex()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    const/4 v0, 0x1

    .line 35
    add-int/2addr p2, v0

    .line 36
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, LL6/p;->d()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    sub-int/2addr p1, v0

    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-static {p2, v1, p1}, LB7/d;->l(III)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {p0, p1}, LL6/g$a;->f(I)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput p1, p0, LL6/g$a;->e:F

    .line 55
    .line 56
    iget p2, p0, LL6/g$a;->d:F

    .line 57
    .line 58
    sub-float/2addr p1, p2

    .line 59
    iput p1, p0, LL6/g$a;->f:F

    .line 60
    .line 61
    const/4 p1, 0x2

    .line 62
    new-array p1, p1, [F

    .line 63
    .line 64
    const/4 p2, 0x0

    .line 65
    aput p2, p1, v1

    .line 66
    .line 67
    aput p3, p1, v0

    .line 68
    .line 69
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-wide/16 p2, 0x1

    .line 74
    .line 75
    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 76
    .line 77
    .line 78
    new-instance p2, LL6/f;

    .line 79
    .line 80
    invoke-direct {p2, p0}, LL6/f;-><init>(LL6/g$a;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, LL6/g$a;->g:Landroid/animation/ValueAnimator;

    .line 87
    .line 88
    return-void
.end method

.method public static synthetic d(LL6/g$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL6/g$a;->e(LL6/g$a;Landroid/animation/ValueAnimator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final e(LL6/g$a;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, LL6/g$a;->b:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Ljava/lang/Float;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final f(I)F
    .locals 8

    .line 1
    iget-object v0, p0, LL6/g$a;->a:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LL6/p;->d()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    const/high16 v3, -0x40800000    # -1.0f

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-eq v0, v4, :cond_9

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x2

    .line 21
    if-eq v0, v6, :cond_5

    .line 22
    .line 23
    const/4 v7, 0x3

    .line 24
    if-eq v0, v7, :cond_0

    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    if-eq p1, v2, :cond_4

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    if-eq p1, v4, :cond_2

    .line 32
    .line 33
    if-eq p1, v6, :cond_1

    .line 34
    .line 35
    return v3

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    iget-object p1, p0, LL6/g$a;->a:Lcom/swmansion/rnscreens/y;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetBehavior()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o0()F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_3
    return v5

    .line 52
    :cond_4
    return v3

    .line 53
    :cond_5
    if-eq p1, v2, :cond_8

    .line 54
    .line 55
    if-eqz p1, :cond_7

    .line 56
    .line 57
    if-eq p1, v4, :cond_6

    .line 58
    .line 59
    return v3

    .line 60
    :cond_6
    return v1

    .line 61
    :cond_7
    return v5

    .line 62
    :cond_8
    return v3

    .line 63
    :cond_9
    if-eq p1, v2, :cond_b

    .line 64
    .line 65
    if-eqz p1, :cond_a

    .line 66
    .line 67
    return v3

    .line 68
    :cond_a
    return v1

    .line 69
    :cond_b
    return v3
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 1

    .line 1
    const-string v0, "bottomSheet"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, LL6/g$a;->d:F

    .line 7
    .line 8
    cmpg-float v0, p1, p2

    .line 9
    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, LL6/g$a;->e:F

    .line 13
    .line 14
    cmpg-float v0, p2, v0

    .line 15
    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    sub-float/2addr p2, p1

    .line 19
    iget p1, p0, LL6/g$a;->f:F

    .line 20
    .line 21
    div-float/2addr p2, p1

    .line 22
    iget-object p1, p0, LL6/g$a;->g:Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setCurrentFraction(F)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 1

    .line 1
    const-string v0, "bottomSheet"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-eq p2, p1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-eq p2, v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p2, p0, LL6/g$a;->a:Lcom/swmansion/rnscreens/y;

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetLargestUndimmedDetentIndex()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-direct {p0, p2}, LL6/g$a;->f(I)F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iput p2, p0, LL6/g$a;->d:F

    .line 24
    .line 25
    iget-object p2, p0, LL6/g$a;->a:Lcom/swmansion/rnscreens/y;

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/y;->getSheetLargestUndimmedDetentIndex()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    add-int/2addr p2, p1

    .line 32
    iget-object v0, p0, LL6/g$a;->a:Lcom/swmansion/rnscreens/y;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getSheetDetents()LL6/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, LL6/p;->d()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sub-int/2addr v0, p1

    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-static {p2, p1, v0}, LB7/d;->l(III)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-direct {p0, p1}, LL6/g$a;->f(I)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p0, LL6/g$a;->e:F

    .line 53
    .line 54
    iget p2, p0, LL6/g$a;->d:F

    .line 55
    .line 56
    sub-float/2addr p1, p2

    .line 57
    iput p1, p0, LL6/g$a;->f:F

    .line 58
    .line 59
    return-void
.end method
