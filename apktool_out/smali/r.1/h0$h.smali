.class Lr/h0$h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lr/h0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# static fields
.field private static final g:J


# instance fields
.field private final a:Lr/y;

.field private final b:I

.field private c:Z

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x2

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, Lr/h0$h;->g:J

    .line 10
    .line 11
    return-void
.end method

.method constructor <init>(Lr/y;ILjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lr/h0$h;->c:Z

    .line 6
    .line 7
    iput-object p1, p0, Lr/h0$h;->a:Lr/y;

    .line 8
    .line 9
    iput p2, p0, Lr/h0$h;->b:I

    .line 10
    .line 11
    iput-object p3, p0, Lr/h0$h;->d:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    iput-object p4, p0, Lr/h0$h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    iput-boolean p5, p0, Lr/h0$h;->f:Z

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic d(Lr/h0$h;Ljava/lang/Void;)Lm5/a;
    .locals 0

    .line 1
    iget-boolean p1, p0, Lr/h0$h;->f:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lr/h0$h;->a:Lr/y;

    .line 6
    .line 7
    invoke-virtual {p0}, Lr/y;->I()Lr/K1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lr/K1;->T()Lm5/a;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    invoke-static {p0}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static synthetic e(Lr/h0$h;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lr/h0$h;->a:Lr/y;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr/y;->U()Lr/x2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-virtual {p0, p1, v0}, Lr/x2;->e(Landroidx/concurrent/futures/c$a;I)V

    .line 9
    .line 10
    .line 11
    const-string p0, "TorchOn"

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic f(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lr/h0;->d(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public static synthetic g(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lr/h0$h;Ljava/lang/Void;)Lm5/a;
    .locals 3

    .line 1
    sget-wide v0, Lr/h0$h;->g:J

    .line 2
    .line 3
    iget-object p1, p0, Lr/h0$h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    iget-object p0, p0, Lr/h0$h;->a:Lr/y;

    .line 6
    .line 7
    new-instance v2, Lr/K0;

    .line 8
    .line 9
    invoke-direct {v2}, Lr/K0;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1, p0, v2}, Lr/h0;->i(JLjava/util/concurrent/ScheduledExecutorService;Lr/y;Lr/h0$f$a;)Lm5/a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Lm5/a;
    .locals 3

    .line 1
    iget v0, p0, Lr/h0$h;->b:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Lr/h0;->e(ILandroid/hardware/camera2/TotalCaptureResult;)Z

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
    const-string v2, "TorchTask#preCapture: isFlashRequired = "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "Camera2CapturePipeline"

    .line 25
    .line 26
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget v0, p0, Lr/h0$h;->b:I

    .line 30
    .line 31
    invoke-static {v0, p1}, Lr/h0;->e(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, Lr/h0$h;->a:Lr/y;

    .line 38
    .line 39
    invoke-virtual {p1}, Lr/y;->b0()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const-string p1, "Low-light boost already on, not turn on"

    .line 46
    .line 47
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object p1, p0, Lr/h0$h;->a:Lr/y;

    .line 52
    .line 53
    invoke-virtual {p1}, Lr/y;->f0()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    const-string p1, "Torch already on, not turn on"

    .line 60
    .line 61
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p1, "Turn on torch"

    .line 66
    .line 67
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    iput-boolean p1, p0, Lr/h0$h;->c:Z

    .line 72
    .line 73
    new-instance p1, Lr/G0;

    .line 74
    .line 75
    invoke-direct {p1, p0}, Lr/G0;-><init>(Lr/h0$h;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, LJ/d;->a(Lm5/a;)LJ/d;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    new-instance v0, Lr/H0;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lr/H0;-><init>(Lr/h0$h;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lr/h0$h;->d:Ljava/util/concurrent/Executor;

    .line 92
    .line 93
    invoke-virtual {p1, v0, v1}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Lr/I0;

    .line 98
    .line 99
    invoke-direct {v0, p0}, Lr/I0;-><init>(Lr/h0$h;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Lr/h0$h;->d:Ljava/util/concurrent/Executor;

    .line 103
    .line 104
    invoke-virtual {p1, v0, v1}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v0, Lr/J0;

    .line 109
    .line 110
    invoke-direct {v0}, Lr/J0;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {p1, v0, v1}, LJ/d;->d(Ln/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-static {p1}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget v0, p0, Lr/h0$h;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

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

.method public c()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr/h0$h;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr/h0$h;->a:Lr/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lr/y;->U()Lr/x2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Lr/x2;->e(Landroidx/concurrent/futures/c$a;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "Camera2CapturePipeline"

    .line 17
    .line 18
    const-string v1, "Turning off torch"

    .line 19
    .line 20
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v0, p0, Lr/h0$h;->f:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lr/h0$h;->a:Lr/y;

    .line 28
    .line 29
    invoke-virtual {v0}, Lr/y;->I()Lr/K1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {v0, v2, v1}, Lr/K1;->q(ZZ)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method
