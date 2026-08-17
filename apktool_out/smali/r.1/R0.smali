.class final Lr/R0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/k1$e;


# static fields
.field static final a:Lr/R0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr/R0;

    .line 2
    .line 3
    invoke-direct {v0}, Lr/R0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr/R0;->a:Lr/R0;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;LF/D1;LF/k1$b;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p2, v0}, LF/D1;->x(LF/k1;)LF/k1;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {}, LF/X0;->g0()LF/X0;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {}, LF/k1;->b()LF/k1;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, LF/k1;->p()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, LF/k1;->p()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1}, LF/k1;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p3, v2}, LF/k1$b;->b(Ljava/util/Collection;)LF/k1$b;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, LF/k1;->l()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p3, v2}, LF/k1$b;->d(Ljava/util/List;)LF/k1$b;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, LF/k1;->j()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p3, v2}, LF/k1$b;->c(Ljava/util/Collection;)LF/k1$b;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, LF/k1;->g()LF/j0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_0
    invoke-virtual {p3, v2}, LF/k1$b;->w(LF/j0;)LF/k1$b;

    .line 50
    .line 51
    .line 52
    instance-of v1, p2, LF/a1;

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-static {p1, p3}, Lv/p;->b(Landroid/util/Size;LF/k1$b;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    new-instance p1, Lq/a;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Lq/a;-><init>(LF/j0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v3}, Lq/a;->h0(I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p3, v1}, LF/k1$b;->B(I)LF/k1$b;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lr/V0;->b()Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1, v1}, Lq/a;->i0(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {p3, v1}, LF/k1$b;->f(Landroid/hardware/camera2/CameraDevice$StateCallback;)LF/k1$b;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lr/U0;->b()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p1, v1}, Lq/a;->l0(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p3, v1}, LF/k1$b;->k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)LF/k1$b;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lr/c0;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p1, v1}, Lq/a;->k0(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1}, Lr/b1;->e(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lr/b1;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {p3, v1}, LF/k1$b;->e(LF/r;)LF/k1$b;

    .line 106
    .line 107
    .line 108
    invoke-interface {p2}, LF/D1;->H()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {p3, v1}, LF/k1$b;->C(I)LF/k1$b;

    .line 113
    .line 114
    .line 115
    invoke-interface {p2}, LF/D1;->Q()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-virtual {p3, p2}, LF/k1$b;->z(I)LF/k1$b;

    .line 120
    .line 121
    .line 122
    invoke-static {}, LF/S0;->i0()LF/S0;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    sget-object v1, Lq/a;->W:LF/j0$a;

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Lq/a;->j0(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p2, v1, v0}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lq/a;->R:LF/j0$a;

    .line 136
    .line 137
    const-wide/16 v1, -0x1

    .line 138
    .line 139
    invoke-virtual {p1, v1, v2}, Lq/a;->m0(J)J

    .line 140
    .line 141
    .line 142
    move-result-wide v1

    .line 143
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {p2, v0, v1}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p3, p2}, LF/k1$b;->g(LF/j0;)LF/k1$b;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lq/a;->g0()Lx/l;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p3, p1}, LF/k1$b;->g(LF/j0;)LF/k1$b;

    .line 158
    .line 159
    .line 160
    return-void
.end method
