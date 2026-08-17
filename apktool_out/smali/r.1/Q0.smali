.class public final Lr/Q0;
.super LF/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/Q0$a;
    }
.end annotation


# static fields
.field private static final i:Lr/Q0$a;


# instance fields
.field private final f:Ls/S;

.field private final g:Ljava/util/concurrent/Executor;

.field private h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr/Q0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr/Q0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr/Q0;->i:Lr/Q0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ls/S;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    const-string v0, "initialCameraIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "systemCallbackExecutor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LF/b;-><init>(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lr/Q0;->f:Ls/S;

    .line 20
    .line 21
    iput-object p3, p0, Lr/Q0;->g:Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic l(Lr/Q0;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lr/Q0;->p(Lr/Q0;Landroidx/concurrent/futures/c$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(Lr/Q0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lr/Q0;->o(Lr/Q0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lr/Q0;Lm5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr/Q0;->q(Lm5/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final o(Lr/Q0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "completer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/Q0;->g:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v1, Lr/P0;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lr/P0;-><init>(Lr/Q0;Landroidx/concurrent/futures/c$a;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "FetchData for CameraAvailability"

    .line 17
    .line 18
    return-object p0
.end method

.method private static final p(Lr/Q0;Landroidx/concurrent/futures/c$a;)V
    .locals 11

    .line 1
    :try_start_0
    iget-object v0, p0, Lr/Q0;->f:Ls/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls/S;->d()[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getCameraIdList(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    array-length v1, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v1, :cond_0

    .line 21
    .line 22
    aget-object v5, v0, v3

    .line 23
    .line 24
    sget-object v4, Ly/p;->c:Ly/p$a;

    .line 25
    .line 26
    invoke-static {v5}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 v8, 0x6

    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-static/range {v4 .. v9}, Ly/p$a;->d(Ly/p$a;Ljava/lang/String;Ljava/lang/String;LF/A0;ILjava/lang/Object;)Ly/p;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const/16 v9, 0x3f

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    invoke-static/range {v2 .. v10}, Lj7/q;->o0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v2}, LF/b;->i(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v2}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ls/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_1
    invoke-static {v0}, Lr/Z0;->a(Ls/h;)Ly/u;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "createFrom(...)"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, LF/b;->j(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private final q(Lm5/a;)V
    .locals 0

    .line 1
    invoke-static {p1}, LJ/n;->z(Lm5/a;)Lm5/a;

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d()Lm5/a;
    .locals 2

    .line 1
    new-instance v0, Lr/O0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr/O0;-><init>(Lr/Q0;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "getFuture(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/Q0;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr/Q0;->h()V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, Lr/Q0$b;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lr/Q0$b;-><init>(Lr/Q0;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lr/Q0;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    .line 14
    .line 15
    iget-object v1, p0, Lr/Q0;->f:Ls/S;

    .line 16
    .line 17
    iget-object v2, p0, Lr/Q0;->g:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v0}, Ls/S;->g(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lr/Q0;->d()Lm5/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0}, Lr/Q0;->q(Lm5/a;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/Q0;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    iget-object v2, p0, Lr/Q0;->f:Ls/S;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Ls/S;->h(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    :catch_0
    iput-object v1, p0, Lr/Q0;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    iput-object v1, p0, Lr/Q0;->h:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    .line 18
    .line 19
    throw v0

    .line 20
    :cond_0
    :goto_0
    return-void
.end method
