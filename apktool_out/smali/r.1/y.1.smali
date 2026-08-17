.class public Lr/y;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/I;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/y$a;,
        Lr/y$b;,
        Lr/y$c;
    }
.end annotation


# instance fields
.field private A:I

.field private B:J

.field private final C:Lr/y$a;

.field final b:Lr/y$b;

.field final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/lang/Object;

.field private final e:Ls/E;

.field private final f:LF/I$d;

.field private final g:LF/k1$b;

.field private final h:Lr/K1;

.field private final i:Lr/E2;

.field private final j:Lr/x2;

.field private final k:Lr/U1;

.field private final l:Lr/t1;

.field m:Lr/G2;

.field private final n:Lx/g;

.field private final o:Lr/h0;

.field private final p:Lr/B2;

.field private q:I

.field private r:Ly/V$i;

.field private volatile s:I

.field private volatile t:I

.field private volatile u:Z

.field private volatile v:I

.field private final w:Lv/a;

.field private x:Z

.field private final y:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile z:Lm5/a;


# direct methods
.method constructor <init>(Ls/E;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;LF/I$d;LF/g1;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr/y;->d:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, LF/k1$b;

    .line 12
    .line 13
    invoke-direct {v0}, LF/k1$b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr/y;->g:LF/k1$b;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput v1, p0, Lr/y;->q:I

    .line 20
    .line 21
    iput v1, p0, Lr/y;->s:I

    .line 22
    .line 23
    iput-boolean v1, p0, Lr/y;->u:Z

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    iput v1, p0, Lr/y;->v:I

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, p0, Lr/y;->x:Z

    .line 30
    .line 31
    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    const-wide/16 v3, 0x0

    .line 34
    .line 35
    invoke-direct {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lr/y;->y:Ljava/util/concurrent/atomic/AtomicLong;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v2}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iput-object v2, p0, Lr/y;->z:Lm5/a;

    .line 46
    .line 47
    iput v1, p0, Lr/y;->A:I

    .line 48
    .line 49
    iput-wide v3, p0, Lr/y;->B:J

    .line 50
    .line 51
    new-instance v1, Lr/y$a;

    .line 52
    .line 53
    invoke-direct {v1}, Lr/y$a;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lr/y;->C:Lr/y$a;

    .line 57
    .line 58
    iput-object p1, p0, Lr/y;->e:Ls/E;

    .line 59
    .line 60
    iput-object p4, p0, Lr/y;->f:LF/I$d;

    .line 61
    .line 62
    iput-object p3, p0, Lr/y;->c:Ljava/util/concurrent/Executor;

    .line 63
    .line 64
    new-instance p4, Lr/B2;

    .line 65
    .line 66
    invoke-direct {p4, p3}, Lr/B2;-><init>(Ljava/util/concurrent/Executor;)V

    .line 67
    .line 68
    .line 69
    iput-object p4, p0, Lr/y;->p:Lr/B2;

    .line 70
    .line 71
    new-instance p4, Lr/y$b;

    .line 72
    .line 73
    invoke-direct {p4, p3}, Lr/y$b;-><init>(Ljava/util/concurrent/Executor;)V

    .line 74
    .line 75
    .line 76
    iput-object p4, p0, Lr/y;->b:Lr/y$b;

    .line 77
    .line 78
    iget v2, p0, Lr/y;->A:I

    .line 79
    .line 80
    invoke-virtual {v0, v2}, LF/k1$b;->B(I)LF/k1$b;

    .line 81
    .line 82
    .line 83
    invoke-static {p4}, Lr/b1;->e(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lr/b1;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    invoke-virtual {v0, p4}, LF/k1$b;->j(LF/r;)LF/k1$b;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, LF/k1$b;->j(LF/r;)LF/k1$b;

    .line 91
    .line 92
    .line 93
    new-instance p4, Lr/t1;

    .line 94
    .line 95
    invoke-direct {p4, p0, p1, p3}, Lr/t1;-><init>(Lr/y;Ls/E;Ljava/util/concurrent/Executor;)V

    .line 96
    .line 97
    .line 98
    iput-object p4, p0, Lr/y;->l:Lr/t1;

    .line 99
    .line 100
    new-instance p4, Lr/K1;

    .line 101
    .line 102
    invoke-direct {p4, p0, p2, p3, p5}, Lr/K1;-><init>(Lr/y;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;LF/g1;)V

    .line 103
    .line 104
    .line 105
    iput-object p4, p0, Lr/y;->h:Lr/K1;

    .line 106
    .line 107
    new-instance p4, Lr/E2;

    .line 108
    .line 109
    invoke-direct {p4, p0, p1, p3}, Lr/E2;-><init>(Lr/y;Ls/E;Ljava/util/concurrent/Executor;)V

    .line 110
    .line 111
    .line 112
    iput-object p4, p0, Lr/y;->i:Lr/E2;

    .line 113
    .line 114
    new-instance p4, Lr/x2;

    .line 115
    .line 116
    invoke-direct {p4, p0, p1, p3}, Lr/x2;-><init>(Lr/y;Ls/E;Ljava/util/concurrent/Executor;)V

    .line 117
    .line 118
    .line 119
    iput-object p4, p0, Lr/y;->j:Lr/x2;

    .line 120
    .line 121
    invoke-virtual {p1}, Ls/E;->c()I

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    iput p4, p0, Lr/y;->t:I

    .line 126
    .line 127
    new-instance p4, Lr/U1;

    .line 128
    .line 129
    invoke-direct {p4, p0, p1, p3}, Lr/U1;-><init>(Lr/y;Ls/E;Ljava/util/concurrent/Executor;)V

    .line 130
    .line 131
    .line 132
    iput-object p4, p0, Lr/y;->k:Lr/U1;

    .line 133
    .line 134
    new-instance p4, Lr/K2;

    .line 135
    .line 136
    invoke-direct {p4, p1, p3}, Lr/K2;-><init>(Ls/E;Ljava/util/concurrent/Executor;)V

    .line 137
    .line 138
    .line 139
    iput-object p4, p0, Lr/y;->m:Lr/G2;

    .line 140
    .line 141
    new-instance p4, Lv/a;

    .line 142
    .line 143
    invoke-direct {p4, p5}, Lv/a;-><init>(LF/g1;)V

    .line 144
    .line 145
    .line 146
    iput-object p4, p0, Lr/y;->w:Lv/a;

    .line 147
    .line 148
    new-instance p4, Lx/g;

    .line 149
    .line 150
    invoke-direct {p4, p0, p3}, Lx/g;-><init>(Lr/y;Ljava/util/concurrent/Executor;)V

    .line 151
    .line 152
    .line 153
    iput-object p4, p0, Lr/y;->n:Lx/g;

    .line 154
    .line 155
    new-instance v0, Lr/h0;

    .line 156
    .line 157
    move-object v1, p0

    .line 158
    move-object v2, p1

    .line 159
    move-object v5, p2

    .line 160
    move-object v4, p3

    .line 161
    move-object v3, p5

    .line 162
    invoke-direct/range {v0 .. v5}, Lr/h0;-><init>(Lr/y;Ls/E;LF/g1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 163
    .line 164
    .line 165
    iput-object v0, v1, Lr/y;->o:Lr/h0;

    .line 166
    .line 167
    return-void
.end method

.method public static synthetic A(JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    .line 1
    invoke-static {p3, p0, p1}, Lr/y;->e0(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-virtual {p2, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static R(Ls/E;I)I
    .locals 2

    .line 1
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ls/E;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-static {p1, p0}, Lr/y;->c0(I[I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x1

    .line 21
    invoke-static {p1, p0}, Lr/y;->c0(I[I)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    return p1

    .line 28
    :cond_2
    return v0
.end method

.method private T(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr/y;->e:Ls/E;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls/E;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-static {p1, v0}, Lr/y;->c0(I[I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x1

    .line 23
    invoke-static {p1, v0}, Lr/y;->c0(I[I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    return v1
.end method

.method private Z()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr/y;->V()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private static c0(I[I)Z
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p1, v2

    .line 7
    .line 8
    if-ne p0, v3, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v1
.end method

.method private d0()Z
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lr/p;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr/p;-><init>(Lr/y;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return v0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    goto :goto_0

    .line 23
    :catch_1
    move-exception v0

    .line 24
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v2, "Unable to check if repeating request is available."

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v1
.end method

.method static e0(Landroid/hardware/camera2/TotalCaptureResult;J)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v0, p0, LF/u1;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p0, LF/u1;

    .line 22
    .line 23
    const-string v0, "CameraControlSessionUpdateId"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, LF/u1;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/Long;

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    cmp-long p0, v2, p1

    .line 39
    .line 40
    if-ltz p0, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_2
    return v1
.end method

.method private i0()V
    .locals 4

    .line 1
    new-instance v0, LF/h0$a;

    .line 2
    .line 3
    invoke-direct {v0}, LF/h0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lr/y;->A:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LF/h0$a;->v(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, LF/h0$a;->w(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lq/a$a;

    .line 16
    .line 17
    invoke-direct {v2}, Lq/a$a;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lr/y;->Q(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v2, v3, v1}, Lq/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 31
    .line 32
    .line 33
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v1, v3}, Lq/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lq/a$a;->a()Lq/a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, LF/h0$a;->e(LF/j0;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, LF/h0$a;->h()LF/h0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Lr/y;->q0(Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static synthetic p(Lr/y;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lr/y;->c:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    new-instance v1, Lr/k;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lr/k;-><init>(Lr/y;Landroidx/concurrent/futures/c$a;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    const-string v0, "Unable to check if repeating request is available. Camera executor shut down."

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 23
    .line 24
    .line 25
    :goto_0
    const-string p0, "isRepeatingRequestAvailable"

    .line 26
    .line 27
    return-object p0
.end method

.method public static synthetic q()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic r()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic s(Lr/y;Landroidx/concurrent/futures/c$a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr/y;->s0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p0, v0, v1}, Lr/y;->t0(J)Lm5/a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0, p1}, LJ/n;->t(Lm5/a;Landroidx/concurrent/futures/c$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic t(Lr/y;IIILjava/lang/Void;)Lm5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lr/y;->o:Lr/h0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lr/h0;->c(III)LE/j;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private t0(J)Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Lr/l;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lr/l;-><init>(Lr/y;J)V

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

.method public static synthetic u(Lr/y;LF/r;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lr/y;->C:Lr/y$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr/y$a;->i(LF/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic v(Lr/y;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr/m;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3}, Lr/m;-><init>(JLandroidx/concurrent/futures/c$a;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lr/y;->B(Lr/y$c;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string p3, "waitForSessionUpdateId:"

    .line 18
    .line 19
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static synthetic w(Lr/y;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lr/y;->x:Z

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic x(Lr/y;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->c:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/j;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lr/j;-><init>(Lr/y;Landroidx/concurrent/futures/c$a;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "updateSessionConfigAsync"

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic y(Lr/y;Ljava/util/concurrent/Executor;LF/r;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lr/y;->C:Lr/y$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lr/y$a;->h(Ljava/util/concurrent/Executor;LF/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic z(Lr/y;Ljava/util/List;IIILjava/lang/Void;)Lm5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lr/y;->o:Lr/h0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lr/h0;->h(Ljava/util/List;III)Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method B(Lr/y$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->b:Lr/y$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/y$b;->b(Lr/y$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method C(Ljava/util/concurrent/Executor;LF/r;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->c:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/q;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lr/q;-><init>(Lr/y;Ljava/util/concurrent/Executor;LF/r;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method D()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/y;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lr/y;->q:I

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    iput v1, p0, Lr/y;->q:I

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v2, "Decrementing use count occurs more times than incrementing"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v1

    .line 24
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
.end method

.method E(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/y;->u:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lr/y;->f0()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-direct {p0}, Lr/y;->i0()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lr/y;->s:I

    .line 19
    .line 20
    iget-object v0, p0, Lr/y;->j:Lr/x2;

    .line 21
    .line 22
    invoke-virtual {v0}, Lr/x2;->f()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput-boolean p1, p0, Lr/y;->u:Z

    .line 26
    .line 27
    invoke-virtual {p0}, Lr/y;->s0()J

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method F(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/y;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lr/y;->s:I

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-direct {p0}, Lr/y;->i0()V

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0}, Lr/y;->s0()J

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method G()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->i:Lr/E2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/E2;->e()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public H()I
    .locals 1

    .line 1
    iget v0, p0, Lr/y;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public I()Lr/K1;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->h:Lr/K1;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()Lr/U1;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->k:Lr/U1;

    .line 2
    .line 3
    return-object v0
.end method

.method K()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->e:Ls/E;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls/E;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method L()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->e:Ls/E;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls/E;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method M()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->e:Ls/E;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AWB:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls/E;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public N()Ly/V$i;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->r:Ly/V$i;

    .line 2
    .line 3
    return-object v0
.end method

.method public O()LF/k1;
    .locals 3

    .line 1
    iget-object v0, p0, Lr/y;->g:LF/k1$b;

    .line 2
    .line 3
    iget v1, p0, Lr/y;->A:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LF/k1$b;->B(I)LF/k1$b;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lr/y;->g:LF/k1$b;

    .line 9
    .line 10
    invoke-virtual {p0}, Lr/y;->P()LF/j0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, LF/k1$b;->w(LF/j0;)LF/k1$b;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lr/y;->g:LF/k1$b;

    .line 18
    .line 19
    iget-wide v1, p0, Lr/y;->B:J

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "CameraControlSessionUpdateId"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, LF/k1$b;->o(Ljava/lang/String;Ljava/lang/Object;)LF/k1$b;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lr/y;->g:LF/k1$b;

    .line 31
    .line 32
    invoke-virtual {v0}, LF/k1$b;->p()LF/k1;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method P()LF/j0;
    .locals 7

    .line 1
    new-instance v0, Lq/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lq/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    sget-object v4, LF/j0$c;->i:LF/j0$c;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v3, v4}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lr/y;->h:Lr/K1;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lr/K1;->p(Lq/a$a;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lr/y;->i:Lr/E2;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lr/E2;->c(Lq/a$a;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lr/y;->h:Lr/K1;

    .line 29
    .line 30
    invoke-virtual {v1}, Lr/K1;->J()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x5

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v1, v2

    .line 39
    :goto_0
    iget-boolean v3, p0, Lr/y;->u:Z

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p0}, Lr/y;->f0()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v5, 0x2

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v0, v3, v6, v4}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 59
    .line 60
    .line 61
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v6, 0x23

    .line 64
    .line 65
    if-lt v3, v6, :cond_7

    .line 66
    .line 67
    iget v3, p0, Lr/y;->s:I

    .line 68
    .line 69
    if-ne v3, v2, :cond_2

    .line 70
    .line 71
    invoke-static {}, Lr/i;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget v5, p0, Lr/y;->t:I

    .line 76
    .line 77
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v0, v3, v5, v4}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    iget v3, p0, Lr/y;->s:I

    .line 86
    .line 87
    if-ne v3, v5, :cond_7

    .line 88
    .line 89
    invoke-static {}, Lr/i;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget-object v5, p0, Lr/y;->e:Ls/E;

    .line 94
    .line 95
    invoke-virtual {v5}, Ls/E;->c()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v0, v3, v5, v4}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    iget v3, p0, Lr/y;->v:I

    .line 108
    .line 109
    if-eqz v3, :cond_6

    .line 110
    .line 111
    if-eq v3, v2, :cond_5

    .line 112
    .line 113
    if-eq v3, v5, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    move v1, v2

    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const/4 v1, 0x3

    .line 119
    goto :goto_1

    .line 120
    :cond_6
    iget-object v1, p0, Lr/y;->w:Lv/a;

    .line 121
    .line 122
    invoke-virtual {v1, v5}, Lv/a;->a(I)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    :cond_7
    :goto_1
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 127
    .line 128
    invoke-virtual {p0, v1}, Lr/y;->Q(I)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v0, v3, v1, v4}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 137
    .line 138
    .line 139
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 140
    .line 141
    invoke-direct {p0, v2}, Lr/y;->T(I)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v0, v1, v2, v4}, Lq/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lr/y;->l:Lr/t1;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Lr/t1;->c(Lq/a$a;)V

    .line 155
    .line 156
    .line 157
    iget-object v1, p0, Lr/y;->n:Lx/g;

    .line 158
    .line 159
    invoke-virtual {v1, v0}, Lx/g;->i(Lq/a$a;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lq/a$a;->a()Lq/a;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0
.end method

.method Q(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->e:Ls/E;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lr/y;->R(Ls/E;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method S(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr/y;->e:Ls/E;

    .line 2
    .line 3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls/E;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-static {p1, v0}, Lr/y;->c0(I[I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x4

    .line 23
    invoke-static {p1, v0}, Lr/y;->c0(I[I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    const/4 p1, 0x1

    .line 31
    invoke-static {p1, v0}, Lr/y;->c0(I[I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    return p1

    .line 38
    :cond_3
    return v1
.end method

.method public U()Lr/x2;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->j:Lr/x2;

    .line 2
    .line 3
    return-object v0
.end method

.method V()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lr/y;->q:I

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public W()Lr/E2;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->i:Lr/E2;

    .line 2
    .line 3
    return-object v0
.end method

.method public X()Lr/G2;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->m:Lr/G2;

    .line 2
    .line 3
    return-object v0
.end method

.method Y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lr/y;->q:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    iput v1, p0, Lr/y;->q:I

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->m:Lr/G2;

    .line 2
    .line 3
    invoke-interface {v0}, Lr/G2;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lr/y;->p:Lr/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/B2;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "isInVideoUsage: mVideoUsageControl value = "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "Camera2CameraControlImp"

    .line 25
    .line 26
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    if-lez v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public b(LF/k1$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->m:Lr/G2;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lr/G2;->b(LF/k1$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method b0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/y;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public c(Ly/V$i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/y;->r:Ly/V$i;

    .line 2
    .line 3
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->p:Lr/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/B2;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(Ljava/util/List;II)Lm5/a;
    .locals 7

    .line 1
    invoke-direct {p0}, Lr/y;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Camera2CameraControlImp"

    .line 8
    .line 9
    const-string p2, "Camera is not active."

    .line 10
    .line 11
    invoke-static {p1, p2}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Ly/j$a;

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lr/y;->H()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v0, p0, Lr/y;->z:Lm5/a;

    .line 29
    .line 30
    invoke-static {v0}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, LJ/d;->a(Lm5/a;)LJ/d;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    new-instance v0, Lr/n;

    .line 39
    .line 40
    move-object v1, p0

    .line 41
    move-object v2, p1

    .line 42
    move v3, p2

    .line 43
    move v5, p3

    .line 44
    invoke-direct/range {v0 .. v5}, Lr/n;-><init>(Lr/y;Ljava/util/List;III)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v1, Lr/y;->c:Ljava/util/concurrent/Executor;

    .line 48
    .line 49
    invoke-virtual {v6, v0, p1}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public f()Lm5/a;
    .locals 2

    .line 1
    invoke-direct {p0}, Lr/y;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

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
    invoke-static {v0}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-direct {p0}, Lr/y;->d0()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ly/j$a;

    .line 26
    .line 27
    const-string v1, "Repeating request is not available possibly because it\'s disable for the ImageCapture."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_1
    iget-object v0, p0, Lr/y;->h:Lr/K1;

    .line 38
    .line 39
    invoke-virtual {v0}, Lr/K1;->r()Lm5/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method f0()Z
    .locals 1

    .line 1
    iget v0, p0, Lr/y;->s:I

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

.method public g(F)Lm5/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lr/y;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Ly/j$a;

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v0, p0, Lr/y;->i:Lr/E2;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lr/E2;->k(F)Lm5/a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method g0(Lr/y$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->b:Lr/y$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/y$b;->c(Lr/y$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lr/y;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Camera2CameraControlImp"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, "Camera is not active."

    .line 10
    .line 11
    invoke-static {v1, p1}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iput p1, p0, Lr/y;->v:I

    .line 16
    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v0, "setFlashMode: mFlashMode = "

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget v0, p0, Lr/y;->v:I

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lr/y;->m:Lr/G2;

    .line 40
    .line 41
    iget v0, p0, Lr/y;->v:I

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    iget v0, p0, Lr/y;->v:I

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    :cond_2
    :goto_0
    invoke-interface {p1, v1}, Lr/G2;->e(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lr/y;->r0()Lm5/a;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lr/y;->z:Lm5/a;

    .line 60
    .line 61
    return-void
.end method

.method h0(LF/r;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->c:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lr/s;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lr/s;-><init>(Lr/y;LF/r;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public i(Ly/J;)Lm5/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lr/y;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Ly/j$a;

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-direct {p0}, Lr/y;->d0()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    new-instance p1, Ly/j$a;

    .line 26
    .line 27
    const-string v0, "Repeating request is not available possibly because it\'s disable for the ImageCapture."

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    iget-object v0, p0, Lr/y;->h:Lr/K1;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lr/K1;->Q(Ly/J;)Lm5/a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public j(LF/j0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->n:Lx/g;

    .line 2
    .line 3
    invoke-static {p1}, Lx/l$a;->e(LF/j0;)Lx/l$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lx/l$a;->d()Lx/l;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1}, Lx/g;->g(Lx/l;)Lm5/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Lr/r;

    .line 16
    .line 17
    invoke-direct {v0}, Lr/r;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p1, v0, v1}, Lm5/a;->h(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method j0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lr/y;->o0(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public k(Z)Lm5/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lr/y;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, Ly/j$a;

    .line 8
    .line 9
    const-string v0, "Camera is not active."

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v0, p0, Lr/y;->j:Lr/x2;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lr/x2;->d(Z)Lm5/a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method k0(Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "setActive: isActive = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Camera2CameraControlImp"

    .line 19
    .line 20
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lr/y;->h:Lr/K1;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lr/K1;->M(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lr/y;->i:Lr/E2;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lr/E2;->j(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lr/y;->k:Lr/U1;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lr/U1;->d(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lr/y;->j:Lr/x2;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lr/x2;->i(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lr/y;->l:Lr/t1;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lr/t1;->b(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lr/y;->n:Lx/g;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lx/g;->o(Z)V

    .line 51
    .line 52
    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Lr/y;->r:Ly/V$i;

    .line 57
    .line 58
    iget-object p1, p0, Lr/y;->p:Lr/B2;

    .line 59
    .line 60
    invoke-virtual {p1}, Lr/B2;->h()V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method public l(II)Lm5/a;
    .locals 3

    .line 1
    invoke-direct {p0}, Lr/y;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Camera2CameraControlImp"

    .line 8
    .line 9
    const-string p2, "Camera is not active."

    .line 10
    .line 11
    invoke-static {p1, p2}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Ly/j$a;

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ly/j$a;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-virtual {p0}, Lr/y;->H()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, Lr/y;->z:Lm5/a;

    .line 29
    .line 30
    invoke-static {v1}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, LJ/d;->a(Lm5/a;)LJ/d;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lr/o;

    .line 39
    .line 40
    invoke-direct {v2, p0, p1, v0, p2}, Lr/o;-><init>(Lr/y;III)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lr/y;->c:Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-virtual {v1, v2, p1}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
.end method

.method l0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/y;->x:Z

    .line 2
    .line 3
    return-void
.end method

.method public m()LF/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->n:Lx/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx/g;->n()Lq/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public m0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->k:Lr/U1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/U1;->f(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/y;->n:Lx/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx/g;->j()Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lr/u;

    .line 8
    .line 9
    invoke-direct {v1}, Lr/u;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v0, v1, v2}, Lm5/a;->h(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public n0(Landroid/util/Rational;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->h:Lr/K1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/K1;->N(Landroid/util/Rational;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->p:Lr/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/B2;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method o0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lr/y;->A:I

    .line 2
    .line 3
    iget-object v0, p0, Lr/y;->h:Lr/K1;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lr/K1;->O(I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lr/y;->o:Lr/h0;

    .line 9
    .line 10
    iget v0, p0, Lr/y;->A:I

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lr/h0;->g(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public p0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->m:Lr/G2;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lr/G2;->f(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method q0(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/y;->f:LF/I$d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/I$d;->b(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r0()Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Lr/t;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr/t;-><init>(Lr/y;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method s0()J
    .locals 2

    .line 1
    iget-object v0, p0, Lr/y;->y:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lr/y;->B:J

    .line 8
    .line 9
    iget-object v0, p0, Lr/y;->f:LF/I$d;

    .line 10
    .line 11
    invoke-interface {v0}, LF/I$d;->a()V

    .line 12
    .line 13
    .line 14
    iget-wide v0, p0, Lr/y;->B:J

    .line 15
    .line 16
    return-wide v0
.end method
