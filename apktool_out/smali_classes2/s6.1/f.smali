.class public final Ls6/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:Landroidx/core/view/K0;

.field private b:Landroid/os/CancellationSignal;

.field private c:Lkotlin/jvm/functions/Function1;

.field private final d:Lkotlin/Lazy;

.field private e:Z

.field private f:LU0/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls6/e;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ls6/e;-><init>(Ls6/f;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ls6/f;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Ls6/f;F)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ls6/f;->i(Ls6/f;F)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ls6/f;LU0/h;ZFF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Ls6/f;->k(Ls6/f;LU0/h;ZFF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroidx/core/view/K0;)F
    .locals 0

    .line 1
    invoke-static {p0}, Ls6/f;->j(Landroidx/core/view/K0;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(Ls6/f;)Ls6/f$a;
    .locals 0

    .line 1
    invoke-static {p0}, Ls6/f;->m(Ls6/f;)Ls6/f$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Ls6/f;Landroidx/core/view/K0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls6/f;->v(Landroidx/core/view/K0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f(Ls6/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls6/f;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g(ZLjava/lang/Float;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    new-instance v1, Ls6/b;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Ls6/b;-><init>(Ls6/f;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ls6/c;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Ls6/c;-><init>(Landroidx/core/view/K0;)V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()Lx0/e;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget p1, p1, Lx0/e;->d:I

    .line 22
    .line 23
    :goto_0
    int-to-float p1, p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()Lx0/e;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget p1, p1, Lx0/e;->d:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-static {v1, v2, p1}, LU0/i;->b(Lkotlin/jvm/functions/Function1;Lw7/a;F)LU0/m;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, LU0/m;->q()LU0/n;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    new-instance v0, LU0/n;

    .line 43
    .line 44
    invoke-direct {v0}, LU0/n;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, LU0/m;->t(LU0/n;)LU0/m;

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, LU0/m;->q()LU0/n;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "spring"

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/high16 v1, 0x3f800000    # 1.0f

    .line 60
    .line 61
    invoke-virtual {v0, v1}, LU0/n;->f(F)LU0/n;

    .line 62
    .line 63
    .line 64
    const v1, 0x44bb8000    # 1500.0f

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, LU0/n;->h(F)LU0/n;

    .line 68
    .line 69
    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-virtual {p1, p2}, LU0/h;->k(F)LU0/h;

    .line 77
    .line 78
    .line 79
    :cond_2
    new-instance p2, Ls6/d;

    .line 80
    .line 81
    invoke-direct {p2, p0}, Ls6/d;-><init>(Ls6/f;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, LU0/h;->b(LU0/h$q;)LU0/h;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, LU0/m;->l()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, Ls6/f;->f:LU0/m;

    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string p2, "Controller should not be null"

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1
.end method

.method static synthetic h(Ls6/f;ZLjava/lang/Float;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Ls6/f;->g(ZLjava/lang/Float;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final i(Ls6/f;F)Li7/B;
    .locals 0

    .line 1
    invoke-static {p1}, Ly7/a;->c(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Ls6/f;->s(I)I

    .line 6
    .line 7
    .line 8
    sget-object p0, Li7/B;->a:Li7/B;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final j(Landroidx/core/view/K0;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/core/view/K0;->c()Lx0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Lx0/e;->d:I

    .line 6
    .line 7
    int-to-float p0, p0

    .line 8
    return p0
.end method

.method private static final k(Ls6/f;LU0/h;ZFF)V
    .locals 0

    .line 1
    iget-object p2, p0, Ls6/f;->f:LU0/m;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Ls6/f;->f:LU0/m;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ls6/f;->o()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final m(Ls6/f;)Ls6/f$a;
    .locals 1

    .line 1
    new-instance v0, Ls6/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ls6/f$a;-><init>(Ls6/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final p()Ls6/f$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/f;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls6/f$a;

    .line 8
    .line 9
    return-object v0
.end method

.method private final v(Landroidx/core/view/K0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 3
    .line 4
    iput-object p1, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 5
    .line 6
    iget-object v1, p0, Ls6/f;->c:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Ls6/f;->c:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    return-void
.end method

.method private final w()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 3
    .line 4
    iput-object v0, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Ls6/f;->e:Z

    .line 8
    .line 9
    iget-object v1, p0, Ls6/f;->f:LU0/m;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, LU0/m;->c()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, Ls6/f;->f:LU0/m;

    .line 17
    .line 18
    iput-object v0, p0, Ls6/f;->c:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic y(Ls6/f;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Ls6/f;->x(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Float;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/os/CancellationSignal;->cancel()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    sget-object v1, Ls6/a;->a:Ls6/a;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2}, Ls6/a;->b(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()Lx0/e;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v1, v1, Lx0/e;->d:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()Lx0/e;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v3, v3, Lx0/e;->d:I

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()Lx0/e;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v4, v4, Lx0/e;->d:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    cmpg-float v0, v0, v1

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    move v2, v5

    .line 50
    :cond_2
    invoke-direct {p0, v2, p1}, Ls6/f;->g(ZLjava/lang/Float;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    if-ne v1, v3, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroidx/core/view/K0;->a(Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    if-ne v1, v4, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroidx/core/view/K0;->a(Z)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_5
    invoke-virtual {v0}, Landroidx/core/view/K0;->b()F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const v0, 0x3e19999a    # 0.15f

    .line 71
    .line 72
    .line 73
    cmpl-float p1, p1, v0

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    const/4 v1, 0x0

    .line 77
    if-ltz p1, :cond_6

    .line 78
    .line 79
    iget-boolean p1, p0, Ls6/f;->e:Z

    .line 80
    .line 81
    xor-int/2addr p1, v5

    .line 82
    invoke-static {p0, p1, v1, v0, v1}, Ls6/f;->h(Ls6/f;ZLjava/lang/Float;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_6
    iget-boolean p1, p0, Ls6/f;->e:Z

    .line 87
    .line 88
    invoke-static {p0, p1, v1, v0, v1}, Ls6/f;->h(Ls6/f;ZLjava/lang/Float;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Ls6/f;->e:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Ls6/f;->f:LU0/m;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, LU0/m;->c()V

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-direct {p0}, Ls6/f;->w()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()Lx0/e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v1, v1, Lx0/e;->d:I

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()Lx0/e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v2, v2, Lx0/e;->d:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()Lx0/e;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v3, v3, Lx0/e;->d:I

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-ne v1, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Landroidx/core/view/K0;->a(Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    if-ne v1, v3, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    invoke-virtual {v0}, Landroidx/core/view/K0;->b()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const v2, 0x3e19999a    # 0.15f

    .line 50
    .line 51
    .line 52
    cmpl-float v1, v1, v2

    .line 53
    .line 54
    if-ltz v1, :cond_4

    .line 55
    .line 56
    iget-boolean v1, p0, Ls6/f;->e:Z

    .line 57
    .line 58
    xor-int/2addr v1, v4

    .line 59
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    iget-boolean v1, p0, Ls6/f;->e:Z

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroidx/core/view/K0;->a(Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final q()I
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()Lx0/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Lx0/e;->d:I

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final r(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Ls6/a;->a:Ls6/a;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v1, v2}, Ls6/a;->b(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()Lx0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v0, v0, Lx0/e;->d:I

    .line 16
    .line 17
    sub-int/2addr v0, p1

    .line 18
    invoke-virtual {p0, v0}, Ls6/f;->s(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public final s(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/core/view/K0;->d()Lx0/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lx0/e;->d:I

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/core/view/K0;->e()Lx0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget v2, v2, Lx0/e;->d:I

    .line 16
    .line 17
    iget-boolean v3, p0, Ls6/f;->e:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    move v4, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v4, v1

    .line 24
    :goto_0
    if-eqz v3, :cond_1

    .line 25
    .line 26
    move v3, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v3, v2

    .line 29
    :goto_1
    invoke-static {p1, v1, v2}, LB7/d;->l(III)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {v0}, Landroidx/core/view/K0;->c()Lx0/e;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget v1, v1, Lx0/e;->d:I

    .line 38
    .line 39
    sub-int/2addr v1, p1

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v2, v2, v2, p1}, Lx0/e;->c(IIII)Lx0/e;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sub-int/2addr p1, v4

    .line 46
    int-to-float p1, p1

    .line 47
    sub-int/2addr v3, v4

    .line 48
    int-to-float v3, v3

    .line 49
    div-float/2addr p1, v3

    .line 50
    const/high16 v3, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-virtual {v0, v2, v3, p1}, Landroidx/core/view/K0;->f(Lx0/e;FF)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/f;->a:Landroidx/core/view/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final x(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ls6/f;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/core/view/a0;->F(Landroid/view/View;)Landroidx/core/view/L0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v0, v3}, Landroidx/core/view/L0;->q(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ne v0, v2, :cond_0

    .line 29
    .line 30
    move v1, v2

    .line 31
    :cond_0
    iput-boolean v1, p0, Ls6/f;->e:Z

    .line 32
    .line 33
    new-instance v0, Landroid/os/CancellationSignal;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 39
    .line 40
    iput-object p2, p0, Ls6/f;->c:Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    sget-object p2, Ls6/a;->a:Ls6/a;

    .line 43
    .line 44
    invoke-virtual {p2, v2}, Ls6/a;->b(Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Landroidx/core/view/a0;->J(Landroid/view/View;)Landroidx/core/view/l1;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-static {}, Ls6/g;->a()Landroid/view/animation/LinearInterpolator;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iget-object v8, p0, Ls6/f;->b:Landroid/os/CancellationSignal;

    .line 62
    .line 63
    invoke-direct {p0}, Ls6/f;->p()Ls6/f$a;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    const-wide/16 v5, -0x1

    .line 68
    .line 69
    invoke-virtual/range {v3 .. v9}, Landroidx/core/view/l1;->a(IJLandroid/view/animation/Interpolator;Landroid/os/CancellationSignal;Landroidx/core/view/D0;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string p2, "Animation in progress. Can not start a new request to controlWindowInsetsAnimation()"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
.end method
