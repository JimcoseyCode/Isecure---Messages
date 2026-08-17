.class public LE/Q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE/Q$a;,
        LE/Q$b;
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Executor;

.field final b:LP/w;

.field private final c:Landroid/hardware/camera2/CameraCharacteristics;

.field private d:LE/Q$a;

.field private e:LP/y;

.field private f:LP/y;

.field private g:LP/y;

.field private h:LP/y;

.field private i:LP/y;

.field private j:LP/y;

.field private k:LP/y;

.field private l:LP/y;

.field private m:LP/y;

.field private final n:LF/g1;

.field private final o:Z


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;LP/w;)V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/internal/compat/quirk/a;->c()LF/g1;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, LE/Q;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;LP/w;LF/g1;)V

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;LP/w;LF/g1;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-class v0, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    invoke-static {v0}, Landroidx/camera/core/internal/compat/quirk/a;->b(Ljava/lang/Class;)LF/b1;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, LI/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, LE/Q;->a:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 5
    :cond_0
    iput-object p1, p0, LE/Q;->a:Ljava/util/concurrent/Executor;

    .line 6
    :goto_0
    iput-object p3, p0, LE/Q;->b:LP/w;

    .line 7
    iput-object p2, p0, LE/Q;->c:Landroid/hardware/camera2/CameraCharacteristics;

    .line 8
    iput-object p4, p0, LE/Q;->n:LF/g1;

    .line 9
    const-class p1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    invoke-virtual {p4, p1}, LF/g1;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, LE/Q;->o:Z

    return-void
.end method

.method public static synthetic a(LE/S;Ly/V$h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE/S;->r(Ly/V$h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LE/Q;LE/Q$b;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LE/Q$b;->b()LE/S;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LE/S;->l()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, LE/Q$b;->a()Landroidx/camera/core/o;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Landroidx/camera/core/o;->close()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, LE/Q;->a:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    new-instance v1, LE/J;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, LE/J;-><init>(LE/Q;LE/Q$b;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static synthetic c(LE/S;Landroidx/camera/core/o;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE/S;->q(Landroidx/camera/core/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LE/Q;LE/Q$b;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LE/Q$b;->b()LE/S;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LE/S;->l()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string p0, "ProcessingNode"

    .line 15
    .line 16
    const-string v0, "The postview image is closed due to request aborted"

    .line 17
    .line 18
    invoke-static {p0, v0}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, LE/Q$b;->a()Landroidx/camera/core/o;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Landroidx/camera/core/o;->close()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, p0, LE/Q;->a:Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    new-instance v1, LE/I;

    .line 32
    .line 33
    invoke-direct {v1, p0, p1}, LE/I;-><init>(LE/Q;LE/Q$b;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static synthetic e(LE/Q;LE/Q$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE/Q;->m(LE/Q$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(LE/S;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE/S;->t(Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(LE/S;Ly/X;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE/S;->u(Ly/X;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(LE/Q;LE/Q$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE/Q;->k(LE/Q$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private i(LP/z;I)LP/z;
    .locals 1

    .line 1
    invoke-virtual {p1}, LP/z;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, LO/b;->i(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, LH0/g;->i(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LE/Q;->i:LP/y;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, LP/z;

    .line 19
    .line 20
    iget-object v0, p0, LE/Q;->m:LP/y;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {v0, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LP/z;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, LE/Q;->g:LP/y;

    .line 31
    .line 32
    invoke-static {p1, p2}, LE/h$b;->c(LP/z;I)LE/h$b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v0, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, LP/z;

    .line 41
    .line 42
    return-object p1
.end method

.method private o(LE/S;Ly/X;)V
    .locals 2

    .line 1
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE/N;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, LE/N;-><init>(LE/S;Ly/X;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method j(LE/Q$b;)Landroidx/camera/core/o;
    .locals 6

    .line 1
    invoke-virtual {p1}, LE/Q$b;->b()LE/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LE/Q;->e:LP/y;

    .line 6
    .line 7
    invoke-interface {v1, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, LP/z;

    .line 12
    .line 13
    iget-object v1, p0, LE/Q;->d:LE/Q$a;

    .line 14
    .line 15
    invoke-virtual {v1}, LE/Q$a;->c()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x1

    .line 24
    xor-int/2addr v2, v3

    .line 25
    invoke-static {v2}, LH0/g;->a(Z)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {p1}, LP/z;->e()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/16 v5, 0x23

    .line 44
    .line 45
    if-eq v4, v5, :cond_0

    .line 46
    .line 47
    iget-object v4, p0, LE/Q;->m:LP/y;

    .line 48
    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    iget-boolean v4, p0, LE/Q;->o:Z

    .line 52
    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    :cond_0
    const/16 v4, 0x100

    .line 56
    .line 57
    if-ne v2, v4, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, LE/Q;->f:LP/y;

    .line 60
    .line 61
    invoke-virtual {v0}, LE/S;->c()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {p1, v4}, LE/x$a;->c(LP/z;I)LE/x$a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {v2, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, LP/z;

    .line 74
    .line 75
    iget-object v2, p0, LE/Q;->m:LP/y;

    .line 76
    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0}, LE/S;->c()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-direct {p0, p1, v2}, LE/Q;->i(LP/z;I)LP/z;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :cond_1
    iget-object v2, p0, LE/Q;->k:LP/y;

    .line 88
    .line 89
    invoke-interface {v2, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, LP/z;

    .line 94
    .line 95
    :cond_2
    iget-object v2, p0, LE/Q;->j:LP/y;

    .line 96
    .line 97
    invoke-interface {v2, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Landroidx/camera/core/o;

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-le v1, v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v0}, LE/S;->k()LE/i0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-interface {p1}, Landroidx/camera/core/o;->getFormat()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {v0, v1, v3}, LE/i0;->u(IZ)V

    .line 118
    .line 119
    .line 120
    :cond_3
    return-object p1
.end method

.method k(LE/Q$b;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LE/Q$b;->b()LE/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    iget-object v2, p0, LE/Q;->d:LE/Q$a;

    .line 7
    .line 8
    invoke-virtual {v2}, LE/Q$a;->c()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-le v2, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v1

    .line 21
    :goto_0
    invoke-virtual {p1}, LE/Q$b;->b()LE/S;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, LE/S;->m()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, LE/Q;->j(LE/Q$b;)Landroidx/camera/core/o;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, LE/K;

    .line 40
    .line 41
    invoke-direct {v3, v0, p1}, LE/K;-><init>(LE/S;Landroidx/camera/core/o;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_2

    .line 50
    :catch_1
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    :catch_2
    move-exception p1

    .line 53
    goto :goto_4

    .line 54
    :cond_1
    invoke-virtual {p0, p1}, LE/Q;->l(LE/Q$b;)Ly/V$h;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0}, LE/S;->k()LE/i0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, LE/i0;->s()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    return-void

    .line 72
    :cond_3
    :goto_1
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v3, LE/L;

    .line 77
    .line 78
    invoke-direct {v3, v0, p1}, LE/L;-><init>(LE/S;Ly/V$h;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ly/X; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_2
    new-instance v2, Ly/X;

    .line 86
    .line 87
    const-string v3, "Processing failed."

    .line 88
    .line 89
    invoke-direct {v2, v1, v3, p1}, Ly/X;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v0, v2}, LE/Q;->o(LE/S;Ly/X;)V

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :goto_3
    new-instance v2, Ly/X;

    .line 97
    .line 98
    const-string v3, "Processing failed due to low memory."

    .line 99
    .line 100
    invoke-direct {v2, v1, v3, p1}, Ly/X;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0, v0, v2}, LE/Q;->o(LE/S;Ly/X;)V

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :goto_4
    invoke-direct {p0, v0, p1}, LE/Q;->o(LE/S;Ly/X;)V

    .line 108
    .line 109
    .line 110
    :goto_5
    return-void
.end method

.method l(LE/Q$b;)Ly/V$h;
    .locals 7

    .line 1
    iget-object v0, p0, LE/Q;->d:LE/Q$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/Q$a;->c()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    xor-int/2addr v1, v2

    .line 13
    invoke-static {v1}, LH0/g;->a(Z)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-static {v4}, LO/b;->i(I)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, LO/b;->j(I)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v5, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    move v5, v2

    .line 43
    :goto_1
    const-string v6, "On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s"

    .line 44
    .line 45
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v5, v3}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, LE/Q$b;->b()LE/S;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, LE/S;->d()Ly/V$g;

    .line 61
    .line 62
    .line 63
    const-string v5, "OutputFileOptions cannot be empty"

    .line 64
    .line 65
    invoke-static {v1, v5}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v5, p0, LE/Q;->e:LP/y;

    .line 69
    .line 70
    invoke-interface {v5, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, LP/z;

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/16 v5, 0x20

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    if-le v0, v2, :cond_3

    .line 84
    .line 85
    invoke-virtual {v3}, LE/S;->d()Ly/V$g;

    .line 86
    .line 87
    .line 88
    const-string v0, "The number of OutputFileOptions for simultaneous capture should be at least two"

    .line 89
    .line 90
    invoke-static {v1, v0}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, LP/z;->e()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eq p1, v5, :cond_2

    .line 98
    .line 99
    invoke-virtual {v3}, LE/S;->g()Ly/V$g;

    .line 100
    .line 101
    .line 102
    throw v6

    .line 103
    :cond_2
    invoke-virtual {v3}, LE/S;->d()Ly/V$g;

    .line 104
    .line 105
    .line 106
    throw v6

    .line 107
    :cond_3
    if-eq v4, v5, :cond_4

    .line 108
    .line 109
    invoke-virtual {v3}, LE/S;->d()Ly/V$g;

    .line 110
    .line 111
    .line 112
    throw v6

    .line 113
    :cond_4
    invoke-virtual {v3}, LE/S;->d()Ly/V$g;

    .line 114
    .line 115
    .line 116
    throw v6
.end method

.method m(LE/Q$b;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, LE/Q$b;->b()LE/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    iget-object v1, p0, LE/Q;->e:LP/y;

    .line 6
    .line 7
    invoke-interface {v1, p1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LP/z;

    .line 12
    .line 13
    invoke-virtual {v1}, LP/z;->e()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x23

    .line 18
    .line 19
    if-eq v2, v3, :cond_1

    .line 20
    .line 21
    const/16 v3, 0x100

    .line 22
    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    const/16 v3, 0x1005

    .line 26
    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 33
    :goto_1
    const-string v4, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s"

    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v3, v2}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, LE/Q;->l:LP/y;

    .line 51
    .line 52
    invoke-interface {v2, v1}, LP/y;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/graphics/Bitmap;

    .line 57
    .line 58
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, LE/M;

    .line 63
    .line 64
    invoke-direct {v3, v0, v1}, LE/M;-><init>(LE/S;Landroid/graphics/Bitmap;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catch_0
    move-exception v0

    .line 72
    invoke-virtual {p1}, LE/Q$b;->a()Landroidx/camera/core/o;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Landroidx/camera/core/o;->close()V

    .line 77
    .line 78
    .line 79
    const-string p1, "ProcessingNode"

    .line 80
    .line 81
    const-string v1, "process postview input packet failed."

    .line 82
    .line 83
    invoke-static {p1, v1, v0}, Ly/h0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public n()V
    .locals 0

    .line 1
    return-void
.end method

.method public p(LE/Q$a;)Ljava/lang/Void;
    .locals 2

    .line 1
    iput-object p1, p0, LE/Q;->d:LE/Q$a;

    .line 2
    .line 3
    invoke-virtual {p1}, LE/Q$a;->a()LP/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LE/O;

    .line 8
    .line 9
    invoke-direct {v1, p0}, LE/O;-><init>(LE/Q;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LP/u;->a(LH0/a;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, LE/Q$a;->d()LP/u;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, LE/P;

    .line 20
    .line 21
    invoke-direct {v1, p0}, LE/P;-><init>(LE/Q;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, LP/u;->a(LH0/a;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, LE/H;

    .line 28
    .line 29
    invoke-direct {v0}, LE/H;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LE/Q;->e:LP/y;

    .line 33
    .line 34
    new-instance v0, LE/x;

    .line 35
    .line 36
    iget-object v1, p0, LE/Q;->n:LF/g1;

    .line 37
    .line 38
    invoke-direct {v0, v1}, LE/x;-><init>(LF/g1;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, LE/Q;->f:LP/y;

    .line 42
    .line 43
    new-instance v0, LE/A;

    .line 44
    .line 45
    invoke-direct {v0}, LE/A;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, LE/Q;->i:LP/y;

    .line 49
    .line 50
    new-instance v0, LE/h;

    .line 51
    .line 52
    invoke-direct {v0}, LE/h;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, LE/Q;->g:LP/y;

    .line 56
    .line 57
    new-instance v0, LE/B;

    .line 58
    .line 59
    invoke-direct {v0}, LE/B;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, LE/Q;->h:LP/y;

    .line 63
    .line 64
    new-instance v0, LE/D;

    .line 65
    .line 66
    invoke-direct {v0}, LE/D;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, LE/Q;->j:LP/y;

    .line 70
    .line 71
    new-instance v0, LE/w;

    .line 72
    .line 73
    invoke-direct {v0}, LE/w;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, LE/Q;->l:LP/y;

    .line 77
    .line 78
    invoke-virtual {p1}, LE/Q$a;->b()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    const/16 v0, 0x23

    .line 83
    .line 84
    if-eq p1, v0, :cond_0

    .line 85
    .line 86
    iget-boolean p1, p0, LE/Q;->o:Z

    .line 87
    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    :cond_0
    new-instance p1, LE/C;

    .line 91
    .line 92
    invoke-direct {p1}, LE/C;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, LE/Q;->k:LP/y;

    .line 96
    .line 97
    :cond_1
    const/4 p1, 0x0

    .line 98
    return-object p1
.end method
