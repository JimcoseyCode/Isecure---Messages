.class public interface abstract LF/D1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LK/q;
.implements LF/D0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/D1$b;
    }
.end annotation


# static fields
.field public static final A:LF/j0$a;

.field public static final B:LF/j0$a;

.field public static final C:LF/j0$a;

.field public static final D:LF/j0$a;

.field public static final E:LF/j0$a;

.field public static final F:LF/j0$a;

.field public static final G:LF/j0$a;

.field public static final H:LF/j0$a;

.field public static final I:LF/j0$a;

.field public static final J:LF/j0$a;

.field public static final K:LF/j0$a;

.field public static final w:LF/j0$a;

.field public static final x:LF/j0$a;

.field public static final y:LF/j0$a;

.field public static final z:LF/j0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "camerax.core.useCase.defaultSessionConfig"

    .line 2
    .line 3
    const-class v1, LF/k1;

    .line 4
    .line 5
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LF/D1;->w:LF/j0$a;

    .line 10
    .line 11
    const-string v0, "camerax.core.useCase.defaultCaptureConfig"

    .line 12
    .line 13
    const-class v1, LF/h0;

    .line 14
    .line 15
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LF/D1;->x:LF/j0$a;

    .line 20
    .line 21
    const-string v0, "camerax.core.useCase.sessionConfigUnpacker"

    .line 22
    .line 23
    const-class v1, LF/k1$e;

    .line 24
    .line 25
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LF/D1;->y:LF/j0$a;

    .line 30
    .line 31
    const-string v0, "camerax.core.useCase.captureConfigUnpacker"

    .line 32
    .line 33
    const-class v1, LF/h0$b;

    .line 34
    .line 35
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LF/D1;->z:LF/j0$a;

    .line 40
    .line 41
    const-string v0, "camerax.core.useCase.surfaceOccupancyPriority"

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, LF/D1;->A:LF/j0$a;

    .line 50
    .line 51
    const-string v0, "camerax.core.useCase.sessionType"

    .line 52
    .line 53
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, LF/D1;->B:LF/j0$a;

    .line 58
    .line 59
    const-string v0, "camerax.core.useCase.targetFrameRate"

    .line 60
    .line 61
    const-class v2, Landroid/util/Range;

    .line 62
    .line 63
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, LF/D1;->C:LF/j0$a;

    .line 68
    .line 69
    const-string v0, "camerax.core.useCase.isStrictFrameRateRequired"

    .line 70
    .line 71
    const-class v2, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, LF/D1;->D:LF/j0$a;

    .line 78
    .line 79
    const-string v0, "camerax.core.useCase.zslDisabled"

    .line 80
    .line 81
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 82
    .line 83
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, LF/D1;->E:LF/j0$a;

    .line 88
    .line 89
    const-string v0, "camerax.core.useCase.highResolutionDisabled"

    .line 90
    .line 91
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, LF/D1;->F:LF/j0$a;

    .line 96
    .line 97
    const-string v0, "camerax.core.useCase.captureType"

    .line 98
    .line 99
    const-class v2, LF/E1$b;

    .line 100
    .line 101
    invoke-static {v0, v2}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, LF/D1;->G:LF/j0$a;

    .line 106
    .line 107
    const-string v0, "camerax.core.useCase.previewStabilizationMode"

    .line 108
    .line 109
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sput-object v0, LF/D1;->H:LF/j0$a;

    .line 114
    .line 115
    const-string v0, "camerax.core.useCase.videoStabilizationMode"

    .line 116
    .line 117
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sput-object v0, LF/D1;->I:LF/j0$a;

    .line 122
    .line 123
    const-string v0, "camerax.core.useCase.takePictureManagerProvider"

    .line 124
    .line 125
    const-class v1, LE/Y$b;

    .line 126
    .line 127
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sput-object v0, LF/D1;->J:LF/j0$a;

    .line 132
    .line 133
    const-string v0, "camerax.core.useCase.streamUseCase"

    .line 134
    .line 135
    const-class v1, LF/p1;

    .line 136
    .line 137
    invoke-static {v0, v1}, LF/j0$a;->a(Ljava/lang/String;Ljava/lang/Class;)LF/j0$a;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    sput-object v0, LF/D1;->K:LF/j0$a;

    .line 142
    .line 143
    return-void
.end method


# virtual methods
.method public E(LF/h0;)LF/h0;
    .locals 1

    .line 1
    sget-object v0, LF/D1;->x:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LF/h0;

    .line 8
    .line 9
    return-object p1
.end method

.method public F()LF/p1;
    .locals 2

    .line 1
    sget-object v0, LF/D1;->K:LF/j0$a;

    .line 2
    .line 3
    sget-object v1, LF/p1;->h:LF/p1;

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LF/p1;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public G()LF/E1$b;
    .locals 1

    .line 1
    sget-object v0, LF/D1;->G:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LF/h1;->d(LF/j0$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF/E1$b;

    .line 8
    .line 9
    return-object v0
.end method

.method public H()I
    .locals 2

    .line 1
    sget-object v0, LF/D1;->I:LF/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public I(LF/k1$e;)LF/k1$e;
    .locals 1

    .line 1
    sget-object v0, LF/D1;->y:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LF/k1$e;

    .line 8
    .line 9
    return-object p1
.end method

.method public K(Landroid/util/Range;)Landroid/util/Range;
    .locals 1

    .line 1
    sget-object v0, LF/D1;->C:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/util/Range;

    .line 8
    .line 9
    return-object p1
.end method

.method public N(I)I
    .locals 1

    .line 1
    sget-object v0, LF/D1;->A:LF/j0$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public Q()I
    .locals 2

    .line 1
    sget-object v0, LF/D1;->H:LF/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public S()Z
    .locals 2

    .line 1
    sget-object v0, LF/D1;->D:LF/j0$a;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public Z(Z)Z
    .locals 1

    .line 1
    sget-object v0, LF/D1;->F:LF/j0$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public b0()Z
    .locals 1

    .line 1
    sget-object v0, LF/D1;->C:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LF/h1;->b(LF/j0$a;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e0(LF/h0$b;)LF/h0$b;
    .locals 1

    .line 1
    sget-object v0, LF/D1;->z:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LF/h0$b;

    .line 8
    .line 9
    return-object p1
.end method

.method public q(I)I
    .locals 1

    .line 1
    sget-object v0, LF/D1;->B:LF/j0$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public s()LE/Y$b;
    .locals 2

    .line 1
    sget-object v0, LF/D1;->J:LF/j0$a;

    .line 2
    .line 3
    new-instance v1, LF/D1$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LF/D1$a;-><init>(LF/D1;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0, v1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LE/Y$b;

    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    check-cast v0, LE/Y$b;

    .line 18
    .line 19
    return-object v0
.end method

.method public w()LF/k1;
    .locals 1

    .line 1
    sget-object v0, LF/D1;->w:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LF/h1;->d(LF/j0$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF/k1;

    .line 8
    .line 9
    return-object v0
.end method

.method public x(LF/k1;)LF/k1;
    .locals 1

    .line 1
    sget-object v0, LF/D1;->w:LF/j0$a;

    .line 2
    .line 3
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LF/k1;

    .line 8
    .line 9
    return-object p1
.end method

.method public y(Z)Z
    .locals 1

    .line 1
    sget-object v0, LF/D1;->E:LF/j0$a;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, v0, p1}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
