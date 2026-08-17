.class LZ/S$k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "k"
.end annotation


# instance fields
.field private final a:Ly/I0;

.field private final b:LF/v1;

.field private final c:I

.field private d:Z

.field private e:I

.field private f:Ljava/util/concurrent/ScheduledFuture;

.field final synthetic g:LZ/S;


# direct methods
.method constructor <init>(LZ/S;Ly/I0;LF/v1;ZI)V
    .locals 1

    .line 1
    iput-object p1, p0, LZ/S$k;->g:LZ/S;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, LZ/S$k;->d:Z

    .line 8
    .line 9
    iput v0, p0, LZ/S$k;->e:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LZ/S$k;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 13
    .line 14
    iput-object p2, p0, LZ/S$k;->a:Ly/I0;

    .line 15
    .line 16
    iput-object p3, p0, LZ/S$k;->b:LF/v1;

    .line 17
    .line 18
    invoke-static {p1, p4}, LZ/S;->w(LZ/S;Z)Z

    .line 19
    .line 20
    .line 21
    iput p5, p0, LZ/S$k;->c:I

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic a(LZ/S$k;Ly/I0;LF/v1;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ly/I0;->v()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LZ/S$k;->g:LZ/S;

    .line 11
    .line 12
    iget-object v0, v0, LZ/S;->h0:LZ/w0;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LZ/w0;->n(Ly/I0;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, LZ/S$k;->g:LZ/S;

    .line 21
    .line 22
    invoke-virtual {v0}, LZ/S;->S()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, LZ/w0;

    .line 30
    .line 31
    iget-object v1, p0, LZ/S$k;->g:LZ/S;

    .line 32
    .line 33
    invoke-static {v1}, LZ/S;->A(LZ/S;)Lg0/o;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, LZ/S$k;->g:LZ/S;

    .line 38
    .line 39
    iget-object v3, v2, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    invoke-static {v2}, LZ/S;->B(LZ/S;)Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v0, v1, v3, v2}, LZ/w0;-><init>(Lg0/o;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LZ/S$k;->g:LZ/S;

    .line 49
    .line 50
    iget-object v2, v1, LZ/S;->G:LF/T0;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, LZ/S;->M(LF/n1;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, LZ/r;

    .line 57
    .line 58
    invoke-virtual {p1}, Ly/I0;->o()Ly/H;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    iget-object v2, p0, LZ/S$k;->g:LZ/S;

    .line 63
    .line 64
    invoke-static {v2}, LZ/S;->C(LZ/S;)Lb0/i;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v1, v6, v2}, Lf0/m;->e(LZ/r;Ly/H;Lb0/i;)Lf0/p;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v1}, LZ/r;->d()LZ/z0;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {p1}, Ly/I0;->q()Landroid/util/Size;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {p1}, Ly/I0;->p()Landroid/util/Range;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    move-object v3, p2

    .line 85
    invoke-static/range {v2 .. v7}, Lf0/m;->d(Lf0/p;LF/v1;LZ/z0;Landroid/util/Size;Ly/H;Landroid/util/Range;)Lg0/q0;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    iget-object v1, p0, LZ/S$k;->g:LZ/S;

    .line 90
    .line 91
    invoke-static {v1}, LZ/S;->v(LZ/S;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {p2, v1}, Lf0/m;->g(Lg0/q0;Z)Lg0/q0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    iget-object v1, p0, LZ/S$k;->g:LZ/S;

    .line 100
    .line 101
    invoke-static {v1, p2}, LZ/S;->D(LZ/S;Lg0/q0;)Lg0/q0;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1, p2}, LZ/w0;->i(Ly/I0;Lg0/q0;)Lm5/a;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object p2, p0, LZ/S$k;->g:LZ/S;

    .line 109
    .line 110
    iput-object v0, p2, LZ/S;->h0:LZ/w0;

    .line 111
    .line 112
    new-instance p2, LZ/S$k$a;

    .line 113
    .line 114
    invoke-direct {p2, p0, v0}, LZ/S$k$a;-><init>(LZ/S$k;LZ/w0;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, LZ/S$k;->g:LZ/S;

    .line 118
    .line 119
    iget-object p0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 120
    .line 121
    invoke-static {p1, p2, p0}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v0, "Ignore the SurfaceRequest "

    .line 131
    .line 132
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v0, " isServiced: "

    .line 139
    .line 140
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ly/I0;->v()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p1, " VideoEncoderSession: "

    .line 151
    .line 152
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object p0, p0, LZ/S$k;->g:LZ/S;

    .line 156
    .line 157
    iget-object p0, p0, LZ/S;->h0:LZ/w0;

    .line 158
    .line 159
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string p0, " has been configured with a persistent in-progress recording."

    .line 163
    .line 164
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const-string p1, "Recorder"

    .line 172
    .line 173
    invoke-static {p1, p0}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method static synthetic b(LZ/S$k;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LZ/S$k;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic c(LZ/S$k;)Ly/I0;
    .locals 0

    .line 1
    iget-object p0, p0, LZ/S$k;->a:Ly/I0;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(LZ/S$k;)LF/v1;
    .locals 0

    .line 1
    iget-object p0, p0, LZ/S$k;->b:LF/v1;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(LZ/S$k;Ly/I0;LF/v1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LZ/S$k;->k(Ly/I0;LF/v1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic f(LZ/S$k;)I
    .locals 0

    .line 1
    iget p0, p0, LZ/S$k;->e:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic g(LZ/S$k;)I
    .locals 2

    .line 1
    iget v0, p0, LZ/S$k;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, LZ/S$k;->e:I

    .line 6
    .line 7
    return v0
.end method

.method static synthetic h(LZ/S$k;)I
    .locals 0

    .line 1
    iget p0, p0, LZ/S$k;->c:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic i(LZ/S$k;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    iput-object p1, p0, LZ/S$k;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    return-object p1
.end method

.method private k(Ly/I0;LF/v1;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S$k;->g:LZ/S;

    .line 2
    .line 3
    invoke-static {v0}, LZ/S;->x(LZ/S;)Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LZ/Y;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, LZ/Y;-><init>(LZ/S$k;Ly/I0;LF/v1;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LZ/S$k;->g:LZ/S;

    .line 13
    .line 14
    iget-object p1, p1, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, Lm5/a;->h(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method j()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LZ/S$k;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LZ/S$k;->d:Z

    .line 8
    .line 9
    iget-object v0, p0, LZ/S$k;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, LZ/S$k;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method l()V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S$k;->a:Ly/I0;

    .line 2
    .line 3
    iget-object v1, p0, LZ/S$k;->b:LF/v1;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, LZ/S$k;->k(Ly/I0;LF/v1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
