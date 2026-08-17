.class public final Ly/D;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LK/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/D$a;,
        Ly/D$b;
    }
.end annotation


# static fields
.field static final Q:LF/j0$a;

.field static final R:LF/j0$a;

.field static final S:LF/j0$a;

.field static final T:LF/j0$a;

.field static final U:LF/j0$a;

.field static final V:LF/j0$a;

.field static final W:LF/j0$a;

.field static final X:LF/j0$a;

.field static final Y:LF/j0$a;

.field static final Z:LF/j0$a;

.field static final a0:LF/j0$a;

.field static final b0:LF/j0$a;


# instance fields
.field private final P:LF/X0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "camerax.core.appConfig.cameraFactoryProvider"

    .line 2
    .line 3
    const-class v1, LF/K$a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ly/D;->Q:LF/j0$a;

    .line 10
    .line 11
    const-string v0, "camerax.core.appConfig.deviceSurfaceManagerProvider"

    .line 12
    .line 13
    const-class v1, LF/J$a;

    .line 14
    .line 15
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Ly/D;->R:LF/j0$a;

    .line 20
    .line 21
    const-string v0, "camerax.core.appConfig.useCaseConfigFactoryProvider"

    .line 22
    .line 23
    const-class v1, LF/E1$c;

    .line 24
    .line 25
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Ly/D;->S:LF/j0$a;

    .line 30
    .line 31
    const-string v0, "camerax.core.appConfig.cameraExecutor"

    .line 32
    .line 33
    const-class v1, Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Ly/D;->T:LF/j0$a;

    .line 40
    .line 41
    const-string v0, "camerax.core.appConfig.schedulerHandler"

    .line 42
    .line 43
    const-class v1, Landroid/os/Handler;

    .line 44
    .line 45
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Ly/D;->U:LF/j0$a;

    .line 50
    .line 51
    const-string v0, "camerax.core.appConfig.minimumLoggingLevel"

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Ly/D;->V:LF/j0$a;

    .line 60
    .line 61
    const-string v0, "camerax.core.appConfig.availableCamerasLimiter"

    .line 62
    .line 63
    const-class v2, Ly/s;

    .line 64
    .line 65
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Ly/D;->W:LF/j0$a;

    .line 70
    .line 71
    const-string v0, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming"

    .line 72
    .line 73
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Ly/D;->X:LF/j0$a;

    .line 80
    .line 81
    const-string v0, "camerax.core.appConfig.cameraProviderInitRetryPolicy"

    .line 82
    .line 83
    const-class v2, Ly/r0;

    .line 84
    .line 85
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Ly/D;->Y:LF/j0$a;

    .line 90
    .line 91
    const-string v0, "camerax.core.appConfig.quirksSettings"

    .line 92
    .line 93
    const-class v2, LF/c1;

    .line 94
    .line 95
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Ly/D;->Z:LF/j0$a;

    .line 100
    .line 101
    const-string v0, "camerax.core.appConfig.configImplType"

    .line 102
    .line 103
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Ly/D;->a0:LF/j0$a;

    .line 108
    .line 109
    const-string v0, "camerax.core.appConfig.repeatingStreamForced"

    .line 110
    .line 111
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 112
    .line 113
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sput-object v0, Ly/D;->b0:LF/j0$a;

    .line 118
    .line 119
    return-void
.end method

.method constructor <init>(LF/X0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/D;->P:LF/X0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f0(Ly/s;)Ly/s;
    .locals 2

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->W:LF/j0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ly/s;

    .line 10
    .line 11
    return-object p1
.end method

.method public g0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->T:LF/j0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    return-object p1
.end method

.method public h0(LF/K$a;)LF/K$a;
    .locals 2

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->Q:LF/j0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LF/K$a;

    .line 10
    .line 11
    return-object p1
.end method

.method public i0()J
    .locals 4

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->X:LF/j0$a;

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method public j0()Ly/r0;
    .locals 3

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->Y:LF/j0$a;

    .line 4
    .line 5
    sget-object v2, Ly/r0;->b:Ly/r0;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ly/r0;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    check-cast v0, Ly/r0;

    .line 17
    .line 18
    return-object v0
.end method

.method public k0()I
    .locals 3

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->a0:LF/j0$a;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v0, v1, v2}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method

.method public l0(LF/J$a;)LF/J$a;
    .locals 2

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->R:LF/j0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LF/J$a;

    .line 10
    .line 11
    return-object p1
.end method

.method public m0()LF/c1;
    .locals 3

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->Z:LF/j0$a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, LF/c1;

    .line 11
    .line 12
    return-object v0
.end method

.method public n0(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 2

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->U:LF/j0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/os/Handler;

    .line 10
    .line 11
    return-object p1
.end method

.method public o()LF/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    return-object v0
.end method

.method public o0(LF/E1$c;)LF/E1$c;
    .locals 2

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->S:LF/j0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LF/E1$c;

    .line 10
    .line 11
    return-object p1
.end method

.method public p0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly/D;->P:LF/X0;

    .line 2
    .line 3
    sget-object v1, Ly/D;->b0:LF/j0$a;

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LF/X0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method
