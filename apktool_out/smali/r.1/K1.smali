.class Lr/K1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final x:[Landroid/hardware/camera2/params/MeteringRectangle;


# instance fields
.field private final a:Lr/y;

.field final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private volatile d:Z

.field private volatile e:Landroid/util/Rational;

.field private final f:Lv/m;

.field private g:Z

.field h:Ljava/lang/Integer;

.field private i:Ljava/util/concurrent/ScheduledFuture;

.field private j:Ljava/util/concurrent/ScheduledFuture;

.field k:J

.field l:Z

.field m:Z

.field private n:I

.field private o:Lr/y$c;

.field private p:Lr/y$c;

.field private q:[Landroid/hardware/camera2/params/MeteringRectangle;

.field private r:[Landroid/hardware/camera2/params/MeteringRectangle;

.field private s:[Landroid/hardware/camera2/params/MeteringRectangle;

.field t:Landroidx/concurrent/futures/c$a;

.field u:Landroidx/concurrent/futures/c$a;

.field private v:Z

.field private w:Lr/y$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 3
    .line 4
    sput-object v0, Lr/K1;->x:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 5
    .line 6
    return-void
.end method

.method constructor <init>(Lr/y;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;LF/g1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lr/K1;->d:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lr/K1;->e:Landroid/util/Rational;

    .line 9
    .line 10
    iput-boolean v0, p0, Lr/K1;->g:Z

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, p0, Lr/K1;->h:Ljava/lang/Integer;

    .line 17
    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    iput-wide v2, p0, Lr/K1;->k:J

    .line 21
    .line 22
    iput-boolean v0, p0, Lr/K1;->l:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lr/K1;->m:Z

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    iput v2, p0, Lr/K1;->n:I

    .line 28
    .line 29
    iput-object v1, p0, Lr/K1;->o:Lr/y$c;

    .line 30
    .line 31
    iput-object v1, p0, Lr/K1;->p:Lr/y$c;

    .line 32
    .line 33
    sget-object v2, Lr/K1;->x:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 34
    .line 35
    iput-object v2, p0, Lr/K1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 36
    .line 37
    iput-object v2, p0, Lr/K1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 38
    .line 39
    iput-object v2, p0, Lr/K1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 40
    .line 41
    iput-object v1, p0, Lr/K1;->t:Landroidx/concurrent/futures/c$a;

    .line 42
    .line 43
    iput-object v1, p0, Lr/K1;->u:Landroidx/concurrent/futures/c$a;

    .line 44
    .line 45
    iput-boolean v0, p0, Lr/K1;->v:Z

    .line 46
    .line 47
    iput-object v1, p0, Lr/K1;->w:Lr/y$c;

    .line 48
    .line 49
    iput-object p1, p0, Lr/K1;->a:Lr/y;

    .line 50
    .line 51
    iput-object p3, p0, Lr/K1;->b:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    iput-object p2, p0, Lr/K1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 54
    .line 55
    new-instance p1, Lv/m;

    .line 56
    .line 57
    invoke-direct {p1, p4}, Lv/m;-><init>(LF/g1;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lr/K1;->f:Lv/m;

    .line 61
    .line 62
    return-void
.end method

.method private A([Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;Ly/J;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 2
    .line 3
    iget-object v1, p0, Lr/K1;->o:Lr/y$c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/y;->g0(Lr/y$c;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lr/K1;->x()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lr/K1;->u()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lr/K1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 15
    .line 16
    iput-object p2, p0, Lr/K1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 17
    .line 18
    iput-object p3, p0, Lr/K1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 19
    .line 20
    invoke-direct {p0}, Lr/K1;->P()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 p2, 0x1

    .line 25
    const/4 p3, 0x0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iput-boolean p2, p0, Lr/K1;->g:Z

    .line 29
    .line 30
    iput-boolean p3, p0, Lr/K1;->l:Z

    .line 31
    .line 32
    iput-boolean p3, p0, Lr/K1;->m:Z

    .line 33
    .line 34
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 35
    .line 36
    invoke-virtual {p1}, Lr/y;->s0()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    const/4 p1, 0x0

    .line 41
    invoke-virtual {p0, p1, p2}, Lr/K1;->V(Landroidx/concurrent/futures/c$a;Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iput-boolean p3, p0, Lr/K1;->g:Z

    .line 46
    .line 47
    iput-boolean p2, p0, Lr/K1;->l:Z

    .line 48
    .line 49
    iput-boolean p3, p0, Lr/K1;->m:Z

    .line 50
    .line 51
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 52
    .line 53
    invoke-virtual {p1}, Lr/y;->s0()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Lr/K1;->h:Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-direct {p0}, Lr/K1;->I()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    new-instance p2, Lr/y1;

    .line 68
    .line 69
    invoke-direct {p2, p0, p1, v0, v1}, Lr/y1;-><init>(Lr/K1;ZJ)V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, Lr/K1;->o:Lr/y$c;

    .line 73
    .line 74
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lr/y;->B(Lr/y$c;)V

    .line 77
    .line 78
    .line 79
    iget-wide p1, p0, Lr/K1;->k:J

    .line 80
    .line 81
    const-wide/16 v0, 0x1

    .line 82
    .line 83
    add-long/2addr p1, v0

    .line 84
    iput-wide p1, p0, Lr/K1;->k:J

    .line 85
    .line 86
    new-instance p3, Lr/z1;

    .line 87
    .line 88
    invoke-direct {p3, p0, p1, p2}, Lr/z1;-><init>(Lr/K1;J)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lr/K1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 92
    .line 93
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 94
    .line 95
    invoke-interface {v0, p3, p5, p6, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    iput-object p3, p0, Lr/K1;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 100
    .line 101
    invoke-virtual {p4}, Ly/J;->e()Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-eqz p3, :cond_1

    .line 106
    .line 107
    new-instance p3, Lr/A1;

    .line 108
    .line 109
    invoke-direct {p3, p0, p1, p2}, Lr/A1;-><init>(Lr/K1;J)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Lr/K1;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 113
    .line 114
    invoke-virtual {p4}, Ly/J;->a()J

    .line 115
    .line 116
    .line 117
    move-result-wide p4

    .line 118
    invoke-interface {p1, p3, p4, p5, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, Lr/K1;->i:Ljava/util/concurrent/ScheduledFuture;

    .line 123
    .line 124
    :cond_1
    return-void
.end method

.method private B(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 2
    .line 3
    iget-object v1, p0, Lr/K1;->o:Lr/y$c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/y;->g0(Lr/y$c;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lr/K1;->t:Landroidx/concurrent/futures/c$a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v1, Ly/j$a;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lr/K1;->t:Landroidx/concurrent/futures/c$a;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private C(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 2
    .line 3
    iget-object v1, p0, Lr/K1;->p:Lr/y$c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/y;->g0(Lr/y$c;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lr/K1;->u:Landroidx/concurrent/futures/c$a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v1, Ly/j$a;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lr/K1;->u:Landroidx/concurrent/futures/c$a;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private E()Landroid/util/Rational;
    .locals 3

    .line 1
    iget-object v0, p0, Lr/K1;->e:Landroid/util/Rational;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr/K1;->e:Landroid/util/Rational;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr/y;->G()Landroid/graphics/Rect;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/util/Rational;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {v1, v2, v0}, Landroid/util/Rational;-><init>(II)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method private static F(Ly/k0;Landroid/util/Rational;Landroid/util/Rational;ILv/m;)Landroid/graphics/PointF;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ly/k0;->b()Landroid/util/Rational;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ly/k0;->b()Landroid/util/Rational;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    invoke-virtual {p4, p0, p3}, Lv/m;->a(Ly/k0;I)Landroid/graphics/PointF;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2, p1}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-nez p3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Landroid/util/Rational;->compareTo(Landroid/util/Rational;)I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    const/high16 p4, 0x3f800000    # 1.0f

    .line 26
    .line 27
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 28
    .line 29
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 30
    .line 31
    if-lez p3, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/util/Rational;->doubleValue()D

    .line 34
    .line 35
    .line 36
    move-result-wide p2

    .line 37
    invoke-virtual {p1}, Landroid/util/Rational;->doubleValue()D

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    div-double/2addr p2, v4

    .line 42
    double-to-float p1, p2

    .line 43
    float-to-double p2, p1

    .line 44
    sub-double/2addr p2, v2

    .line 45
    div-double/2addr p2, v0

    .line 46
    double-to-float p2, p2

    .line 47
    iget p3, p0, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    add-float/2addr p2, p3

    .line 50
    div-float/2addr p4, p1

    .line 51
    mul-float/2addr p2, p4

    .line 52
    iput p2, p0, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    invoke-virtual {p1}, Landroid/util/Rational;->doubleValue()D

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    invoke-virtual {p2}, Landroid/util/Rational;->doubleValue()D

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    div-double/2addr v4, p1

    .line 64
    double-to-float p1, v4

    .line 65
    float-to-double p2, p1

    .line 66
    sub-double/2addr p2, v2

    .line 67
    div-double/2addr p2, v0

    .line 68
    double-to-float p2, p2

    .line 69
    iget p3, p0, Landroid/graphics/PointF;->x:F

    .line 70
    .line 71
    add-float/2addr p2, p3

    .line 72
    div-float/2addr p4, p1

    .line 73
    mul-float/2addr p2, p4

    .line 74
    iput p2, p0, Landroid/graphics/PointF;->x:F

    .line 75
    .line 76
    :cond_2
    return-object p0
.end method

.method private static G(Ly/k0;Landroid/graphics/PointF;Landroid/graphics/Rect;)Landroid/hardware/camera2/params/MeteringRectangle;
    .locals 5

    .line 1
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    int-to-float v2, v2

    .line 11
    mul-float/2addr v1, v2

    .line 12
    add-float/2addr v0, v1

    .line 13
    float-to-int v0, v0

    .line 14
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 15
    .line 16
    int-to-float v1, v1

    .line 17
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-float v2, v2

    .line 24
    mul-float/2addr p1, v2

    .line 25
    add-float/2addr v1, p1

    .line 26
    float-to-int p1, v1

    .line 27
    invoke-virtual {p0}, Ly/k0;->a()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    int-to-float v2, v2

    .line 36
    mul-float/2addr v1, v2

    .line 37
    float-to-int v1, v1

    .line 38
    invoke-virtual {p0}, Ly/k0;->a()F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-float v2, v2

    .line 47
    mul-float/2addr p0, v2

    .line 48
    float-to-int p0, p0

    .line 49
    new-instance v2, Landroid/graphics/Rect;

    .line 50
    .line 51
    div-int/lit8 v1, v1, 0x2

    .line 52
    .line 53
    sub-int v3, v0, v1

    .line 54
    .line 55
    div-int/lit8 p0, p0, 0x2

    .line 56
    .line 57
    sub-int v4, p1, p0

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    add-int/2addr p1, p0

    .line 61
    invoke-direct {v2, v3, v4, v0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 62
    .line 63
    .line 64
    iget p0, v2, Landroid/graphics/Rect;->left:I

    .line 65
    .line 66
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 67
    .line 68
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 69
    .line 70
    invoke-static {p0, p1, v0}, Lr/K1;->L(III)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    iput p0, v2, Landroid/graphics/Rect;->left:I

    .line 75
    .line 76
    iget p0, v2, Landroid/graphics/Rect;->right:I

    .line 77
    .line 78
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 79
    .line 80
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 81
    .line 82
    invoke-static {p0, p1, v0}, Lr/K1;->L(III)I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    iput p0, v2, Landroid/graphics/Rect;->right:I

    .line 87
    .line 88
    iget p0, v2, Landroid/graphics/Rect;->top:I

    .line 89
    .line 90
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 91
    .line 92
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 93
    .line 94
    invoke-static {p0, p1, v0}, Lr/K1;->L(III)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    iput p0, v2, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    iget p0, v2, Landroid/graphics/Rect;->bottom:I

    .line 101
    .line 102
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 103
    .line 104
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 105
    .line 106
    invoke-static {p0, p1, p2}, Lr/K1;->L(III)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    iput p0, v2, Landroid/graphics/Rect;->bottom:I

    .line 111
    .line 112
    new-instance p0, Landroid/hardware/camera2/params/MeteringRectangle;

    .line 113
    .line 114
    const/16 p1, 0x3e8

    .line 115
    .line 116
    invoke-direct {p0, v2, p1}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    .line 117
    .line 118
    .line 119
    return-object p0
.end method

.method private H(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroid/util/Rational;

    .line 16
    .line 17
    invoke-virtual {p4}, Landroid/graphics/Rect;->width()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ly/k0;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-ne v3, p2, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static {v2}, Lr/K1;->K(Ly/k0;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object v3, p0, Lr/K1;->f:Lv/m;

    .line 59
    .line 60
    invoke-static {v2, v1, p3, p5, v3}, Lr/K1;->F(Ly/k0;Landroid/util/Rational;Landroid/util/Rational;ILv/m;)Landroid/graphics/PointF;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v2, v3, p4}, Lr/K1;->G(Ly/k0;Landroid/graphics/PointF;Landroid/graphics/Rect;)Landroid/hardware/camera2/params/MeteringRectangle;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Landroid/hardware/camera2/params/MeteringRectangle;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/hardware/camera2/params/MeteringRectangle;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    :goto_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :cond_6
    :goto_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 91
    .line 92
    return-object p1
.end method

.method private I()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lr/y;->S(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private static K(Ly/k0;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly/k0;->c()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ly/k0;->c()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    cmpg-float v0, v0, v2

    .line 17
    .line 18
    if-gtz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ly/k0;->d()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    cmpl-float v0, v0, v1

    .line 25
    .line 26
    if-ltz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ly/k0;->d()F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    cmpg-float p0, p0, v2

    .line 33
    .line 34
    if-gtz p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method private static L(III)I
    .locals 0

    .line 1
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private P()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/K1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public static synthetic a(Lr/K1;IJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 5
    .line 6
    invoke-virtual {p4, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, p1, :cond_0

    .line 17
    .line 18
    invoke-static {p4, p2, p3}, Lr/y;->e0(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-direct {p0}, Lr/K1;->w()V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public static synthetic b(Lr/K1;ZLandroidx/concurrent/futures/c$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 2
    .line 3
    iget-object v1, p0, Lr/K1;->w:Lr/y$c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lr/y;->g0(Lr/y$c;)V

    .line 6
    .line 7
    .line 8
    iput-boolean p1, p0, Lr/K1;->v:Z

    .line 9
    .line 10
    invoke-direct {p0, p2}, Lr/K1;->z(Landroidx/concurrent/futures/c$a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic c(Lr/K1;Ly/J;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lr/K1;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/w1;

    .line 4
    .line 5
    move-object v2, p0

    .line 6
    move-object v4, p1

    .line 7
    move-wide v5, p2

    .line 8
    move-object v3, p4

    .line 9
    invoke-direct/range {v1 .. v6}, Lr/w1;-><init>(Lr/K1;Landroidx/concurrent/futures/c$a;Ly/J;J)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    const-string p0, "startFocusAndMetering"

    .line 16
    .line 17
    return-object p0
.end method

.method public static synthetic d(Lr/K1;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/v1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lr/v1;-><init>(Lr/K1;J)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic e(Lr/K1;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/B1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lr/B1;-><init>(Lr/K1;J)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic f(Lr/K1;ZLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/E1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lr/E1;-><init>(Lr/K1;ZLandroidx/concurrent/futures/c$a;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "enableExternalFlashAeMode"

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic g(Lr/K1;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/K1;->s(Landroidx/concurrent/futures/c$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Lr/K1;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/K1;->U(Landroidx/concurrent/futures/c$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Lr/K1;JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 5
    .line 6
    invoke-virtual {p4, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x5

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v4, "enableExternalFlashAeMode: isAeModeExternalFlash = "

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v4, "FocusMeteringControl"

    .line 42
    .line 43
    invoke-static {v4, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-boolean p0, p0, Lr/K1;->v:Z

    .line 47
    .line 48
    if-ne v0, p0, :cond_2

    .line 49
    .line 50
    invoke-static {p4, p1, p2}, Lr/y;->e0(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    new-instance p0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string p1, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = "

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {v4, p0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    if-eqz p3, :cond_1

    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    invoke-virtual {p3, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_1
    return v3

    .line 83
    :cond_2
    return v2
.end method

.method public static synthetic j(Lr/K1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/F1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lr/F1;-><init>(Lr/K1;Landroidx/concurrent/futures/c$a;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "triggerAePrecapture"

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic k(Lr/K1;J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lr/K1;->k:J

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lr/K1;->m:Z

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lr/K1;->v(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public static synthetic l(Lr/K1;ZJLandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 5
    .line 6
    invoke-virtual {p4, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-direct {p0}, Lr/K1;->P()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lr/K1;->h:Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v1, 0x3

    .line 32
    if-ne p1, v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v1, 0x4

    .line 39
    if-ne p1, v1, :cond_1

    .line 40
    .line 41
    iput-boolean v3, p0, Lr/K1;->m:Z

    .line 42
    .line 43
    iput-boolean v3, p0, Lr/K1;->l:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v1, 0x5

    .line 51
    if-ne p1, v1, :cond_3

    .line 52
    .line 53
    iput-boolean v2, p0, Lr/K1;->m:Z

    .line 54
    .line 55
    iput-boolean v3, p0, Lr/K1;->l:Z

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    iput-boolean v3, p0, Lr/K1;->m:Z

    .line 59
    .line 60
    iput-boolean v3, p0, Lr/K1;->l:Z

    .line 61
    .line 62
    :cond_3
    :goto_1
    iget-boolean p1, p0, Lr/K1;->l:Z

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    invoke-static {p4, p2, p3}, Lr/y;->e0(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    iget-boolean p1, p0, Lr/K1;->m:Z

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lr/K1;->v(Z)V

    .line 75
    .line 76
    .line 77
    return v3

    .line 78
    :cond_4
    iget-object p1, p0, Lr/K1;->h:Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    iput-object v0, p0, Lr/K1;->h:Ljava/lang/Integer;

    .line 89
    .line 90
    :cond_5
    return v2
.end method

.method public static synthetic m(Lr/K1;J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lr/K1;->k:J

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lr/K1;->t()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static synthetic n(Lr/K1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/J1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lr/J1;-><init>(Lr/K1;Landroidx/concurrent/futures/c$a;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "cancelFocusAndMetering"

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic o(Lr/K1;Landroidx/concurrent/futures/c$a;Ly/J;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lr/K1;->S(Landroidx/concurrent/futures/c$a;Ly/J;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lr/K1;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private w()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->u:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lr/K1;->u:Landroidx/concurrent/futures/c$a;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private x()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/K1;->i:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lr/K1;->i:Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private z(Landroidx/concurrent/futures/c$a;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr/K1;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ly/j$a;

    .line 8
    .line 9
    const-string v1, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 19
    .line 20
    invoke-virtual {v0}, Lr/y;->s0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    new-instance v2, Lr/G1;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0, v1, p1}, Lr/G1;-><init>(Lr/K1;JLandroidx/concurrent/futures/c$a;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lr/K1;->w:Lr/y$c;

    .line 30
    .line 31
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lr/y;->B(Lr/y$c;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method D()I
    .locals 2

    .line 1
    iget v0, p0, Lr/K1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    return v0

    .line 8
    :cond_0
    return v1
.end method

.method J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/K1;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method M(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/K1;->d:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lr/K1;->d:Z

    .line 7
    .line 8
    iget-boolean p1, p0, Lr/K1;->d:Z

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lr/K1;->t()V

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    return-void
.end method

.method public N(Landroid/util/Rational;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/K1;->e:Landroid/util/Rational;

    .line 2
    .line 3
    return-void
.end method

.method O(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/K1;->n:I

    .line 2
    .line 3
    return-void
.end method

.method Q(Ly/J;)Lm5/a;
    .locals 2

    .line 1
    const-wide/16 v0, 0x1388

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, v1}, Lr/K1;->R(Ly/J;J)Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method R(Ly/J;J)Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Lr/H1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lr/H1;-><init>(Lr/K1;Ly/J;J)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method S(Landroidx/concurrent/futures/c$a;Ly/J;J)V
    .locals 9

    .line 1
    iget-boolean v1, p0, Lr/K1;->d:Z

    .line 2
    .line 3
    if-nez v1, :cond_0

    .line 4
    .line 5
    new-instance v1, Ly/j$a;

    .line 6
    .line 7
    const-string v2, "Camera is not active."

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, p0, Lr/K1;->a:Lr/y;

    .line 17
    .line 18
    invoke-virtual {v1}, Lr/y;->G()Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-direct {p0}, Lr/K1;->E()Landroid/util/Rational;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {p2}, Ly/J;->c()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, p0, Lr/K1;->a:Lr/y;

    .line 31
    .line 32
    invoke-virtual {v2}, Lr/y;->L()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v5, 0x1

    .line 37
    move-object v0, p0

    .line 38
    invoke-direct/range {v0 .. v5}, Lr/K1;->H(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {p2}, Ly/J;->b()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v2, p0, Lr/K1;->a:Lr/y;

    .line 47
    .line 48
    invoke-virtual {v2}, Lr/y;->K()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v5, 0x2

    .line 53
    invoke-direct/range {v0 .. v5}, Lr/K1;->H(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-virtual {p2}, Ly/J;->d()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v2, p0, Lr/K1;->a:Lr/y;

    .line 62
    .line 63
    invoke-virtual {v2}, Lr/y;->M()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/4 v5, 0x4

    .line 68
    invoke-direct/range {v0 .. v5}, Lr/K1;->H(Ljava/util/List;ILandroid/util/Rational;Landroid/graphics/Rect;I)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    const-string v2, "None of the specified AF/AE/AWB MeteringPoints is supported on this camera."

    .line 93
    .line 94
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_1
    const-string v2, "Cancelled by another startFocusAndMetering()"

    .line 102
    .line 103
    invoke-direct {p0, v2}, Lr/K1;->B(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, v2}, Lr/K1;->C(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, Lr/K1;->x()V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, Lr/K1;->t:Landroidx/concurrent/futures/c$a;

    .line 113
    .line 114
    sget-object v2, Lr/K1;->x:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 115
    .line 116
    invoke-interface {v7, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 121
    .line 122
    invoke-interface {v8, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 127
    .line 128
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 133
    .line 134
    move-object v0, v3

    .line 135
    move-object v3, v1

    .line 136
    move-object v1, v0

    .line 137
    move-object v0, p0

    .line 138
    move-wide v5, p3

    .line 139
    move-object v2, v4

    .line 140
    move-object v4, p2

    .line 141
    invoke-direct/range {v0 .. v6}, Lr/K1;->A([Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;[Landroid/hardware/camera2/params/MeteringRectangle;Ly/J;J)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method T()Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Lr/D1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr/D1;-><init>(Lr/K1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method U(Landroidx/concurrent/futures/c$a;)V
    .locals 4

    .line 1
    const-string v0, "FocusMeteringControl"

    .line 2
    .line 3
    const-string v1, "triggerAePrecapture"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lr/K1;->d:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance v0, Ly/j$a;

    .line 15
    .line 16
    const-string v1, "Camera is not active."

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    new-instance v0, LF/h0$a;

    .line 26
    .line 27
    invoke-direct {v0}, LF/h0$a;-><init>()V

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lr/K1;->n:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, LF/h0$a;->v(I)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, v1}, LF/h0$a;->w(Z)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lq/a$a;

    .line 40
    .line 41
    invoke-direct {v2}, Lq/a$a;-><init>()V

    .line 42
    .line 43
    .line 44
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v2, v3, v1}, Lq/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lq/a$a;->a()Lq/a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, LF/h0$a;->e(LF/j0;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lr/K1$b;

    .line 61
    .line 62
    invoke-direct {v1, p0, p1}, Lr/K1$b;-><init>(Lr/K1;Landroidx/concurrent/futures/c$a;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, LF/h0$a;->c(LF/r;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 69
    .line 70
    invoke-virtual {v0}, LF/h0$a;->h()LF/h0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1, v0}, Lr/y;->q0(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method V(Landroidx/concurrent/futures/c$a;Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lr/K1;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p2, Ly/j$a;

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {p2, v0}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    new-instance v0, LF/h0$a;

    .line 19
    .line 20
    invoke-direct {v0}, LF/h0$a;-><init>()V

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lr/K1;->n:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, LF/h0$a;->v(I)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, LF/h0$a;->w(Z)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lq/a$a;

    .line 33
    .line 34
    invoke-direct {v2}, Lq/a$a;-><init>()V

    .line 35
    .line 36
    .line 37
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2, v3, v4}, Lq/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 44
    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    sget-object p2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 49
    .line 50
    iget-object v3, p0, Lr/K1;->a:Lr/y;

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Lr/y;->Q(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v3, LF/j0$c;->h:LF/j0$c;

    .line 61
    .line 62
    invoke-virtual {v2, p2, v1, v3}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {v2}, Lq/a$a;->a()Lq/a;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {v0, p2}, LF/h0$a;->e(LF/j0;)V

    .line 70
    .line 71
    .line 72
    new-instance p2, Lr/K1$a;

    .line 73
    .line 74
    invoke-direct {p2, p0, p1}, Lr/K1$a;-><init>(Lr/K1;Landroidx/concurrent/futures/c$a;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p2}, LF/h0$a;->c(LF/r;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 81
    .line 82
    invoke-virtual {v0}, LF/h0$a;->h()LF/h0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p1, p2}, Lr/y;->q0(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method p(Lq/a$a;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr/K1;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lr/K1;->D()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 12
    .line 13
    iget-object v2, p0, Lr/K1;->a:Lr/y;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lr/y;->S(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v2, LF/j0$c;->i:LF/j0$c;

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0, v2}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lr/K1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 29
    .line 30
    array-length v1, v0

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 34
    .line 35
    invoke-virtual {p1, v1, v0, v2}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Lr/K1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 39
    .line 40
    array-length v1, v0

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0, v2}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lr/K1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 49
    .line 50
    array-length v1, v0

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 54
    .line 55
    invoke-virtual {p1, v1, v0, v2}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method q(ZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-boolean v1, p0, Lr/K1;->d:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v1, LF/h0$a;

    .line 12
    .line 13
    invoke-direct {v1}, LF/h0$a;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v1, v2}, LF/h0$a;->w(Z)V

    .line 18
    .line 19
    .line 20
    iget v2, p0, Lr/K1;->n:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, LF/h0$a;->v(I)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lq/a$a;

    .line 26
    .line 27
    invoke-direct {v2}, Lq/a$a;-><init>()V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 33
    .line 34
    invoke-virtual {v2, p1, v0}, Lq/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 35
    .line 36
    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    sget-object p1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 40
    .line 41
    invoke-virtual {v2, p1, v0}, Lq/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {v2}, Lq/a$a;->a()Lq/a;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v1, p1}, LF/h0$a;->e(LF/j0;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 52
    .line 53
    invoke-virtual {v1}, LF/h0$a;->h()LF/h0;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1, p2}, Lr/y;->q0(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method r()Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Lr/I1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr/I1;-><init>(Lr/K1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method s(Landroidx/concurrent/futures/c$a;)V
    .locals 3

    .line 1
    const-string v0, "Cancelled by another cancelFocusAndMetering()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lr/K1;->C(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Cancelled by cancelFocusAndMetering()"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lr/K1;->B(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lr/K1;->u:Landroidx/concurrent/futures/c$a;

    .line 12
    .line 13
    invoke-direct {p0}, Lr/K1;->x()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lr/K1;->u()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lr/K1;->P()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    invoke-virtual {p0, p1, v0}, Lr/K1;->q(ZZ)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p1, Lr/K1;->x:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 31
    .line 32
    iput-object p1, p0, Lr/K1;->q:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 33
    .line 34
    iput-object p1, p0, Lr/K1;->r:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 35
    .line 36
    iput-object p1, p0, Lr/K1;->s:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 37
    .line 38
    iput-boolean v0, p0, Lr/K1;->g:Z

    .line 39
    .line 40
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 41
    .line 42
    invoke-virtual {p1}, Lr/y;->s0()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    iget-object p1, p0, Lr/K1;->u:Landroidx/concurrent/futures/c$a;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 51
    .line 52
    invoke-virtual {p0}, Lr/K1;->D()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {p1, v2}, Lr/y;->S(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    new-instance v2, Lr/x1;

    .line 61
    .line 62
    invoke-direct {v2, p0, p1, v0, v1}, Lr/x1;-><init>(Lr/K1;IJ)V

    .line 63
    .line 64
    .line 65
    iput-object v2, p0, Lr/K1;->p:Lr/y$c;

    .line 66
    .line 67
    iget-object p1, p0, Lr/K1;->a:Lr/y;

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Lr/y;->B(Lr/y$c;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method t()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lr/K1;->s(Landroidx/concurrent/futures/c$a;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method v(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr/K1;->u()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr/K1;->t:Landroidx/concurrent/futures/c$a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ly/K;->a(Z)Ly/K;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lr/K1;->t:Landroidx/concurrent/futures/c$a;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method y(Z)Lm5/a;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object v0, p0, Lr/K1;->a:Lr/y;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, Lr/y;->Q(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    invoke-static {v2}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    new-instance v0, Lr/C1;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, Lr/C1;-><init>(Lr/K1;Z)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method
