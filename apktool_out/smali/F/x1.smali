.class public final LF/x1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LF/x1;

.field public static b:Ly/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF/x1;

    .line 2
    .line 3
    invoke-direct {v0}, LF/x1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF/x1;->a:LF/x1;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()Ly/v;
    .locals 1

    .line 1
    sget-object v0, LF/x1;->b:Ly/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "cameraUseCaseAdapterProvider"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public static final b(Ly/v;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-object p0, LF/x1;->b:Ly/v;

    .line 7
    .line 8
    return-void
.end method

.method public static final c(LF/L;Ly/v0;ZLB/b;)LK/b;
    .locals 8

    .line 1
    const-string v0, "cameraInfoInternal"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sessionConfig"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LF/x1;->b:Ly/v;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, LF/x1;->a()Ly/v;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p0}, LF/L;->f()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "getCameraId(...)"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ly/v;->b(Ljava/lang/String;)LK/f;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1}, Ly/v0;->l()Ly/L0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, LK/f;->m0(Ly/L0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ly/v0;->c()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, LK/f;->i0(Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ly/v0;->i()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, LK/f;->l0(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ly/v0;->f()Landroid/util/Range;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, LK/f;->k0(Landroid/util/Range;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ly/v0;->k()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-nez p3, :cond_0

    .line 65
    .line 66
    sget-object v2, LB/b;->b:LB/b$a;

    .line 67
    .line 68
    const/4 v6, 0x2

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    move-object v4, p0

    .line 72
    move-object v3, p1

    .line 73
    invoke-static/range {v2 .. v7}, LB/b$a;->c(LB/b$a;Ly/v0;LF/L;LD/c;ILjava/lang/Object;)LB/b;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    :cond_0
    invoke-virtual {v0, v1, p3, p2}, LK/f;->o0(Ljava/util/Collection;LB/b;Z)LK/b;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string p1, "simulateAddUseCases(...)"

    .line 82
    .line 83
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string p1, "mCameraUseCaseAdapterProvider must be initialized first!"

    .line 90
    .line 91
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0
.end method
