.class public LE/V;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LE/X;


# instance fields
.field private final a:LE/i0;

.field private final b:LE/i0$a;

.field private final c:Lm5/a;

.field private final d:Lm5/a;

.field private e:Landroidx/concurrent/futures/c$a;

.field private f:Landroidx/concurrent/futures/c$a;

.field private g:Z

.field private h:Z

.field private i:Lm5/a;


# direct methods
.method constructor <init>(LE/i0;LE/i0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LE/V;->g:Z

    .line 6
    .line 7
    iput-boolean v0, p0, LE/V;->h:Z

    .line 8
    .line 9
    iput-object p1, p0, LE/V;->a:LE/i0;

    .line 10
    .line 11
    iput-object p2, p0, LE/V;->b:LE/i0$a;

    .line 12
    .line 13
    new-instance p1, LE/T;

    .line 14
    .line 15
    invoke-direct {p1, p0}, LE/T;-><init>(LE/V;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, LE/V;->c:Lm5/a;

    .line 23
    .line 24
    new-instance p1, LE/U;

    .line 25
    .line 26
    invoke-direct {p1, p0}, LE/U;-><init>(LE/V;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LE/V;->d:Lm5/a;

    .line 34
    .line 35
    return-void
.end method

.method public static synthetic i(LE/V;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, LE/V;->e:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    const-string p0, "CaptureCompleteFuture"

    .line 4
    .line 5
    return-object p0
.end method

.method public static synthetic j(LE/V;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, LE/V;->f:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    const-string p0, "RequestCompleteFuture"

    .line 4
    .line 5
    return-object p0
.end method

.method private k(Ly/X;)V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, LE/V;->g:Z

    .line 6
    .line 7
    iget-object v1, p0, LE/V;->i:Lm5/a;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    check-cast v1, Lm5/a;

    .line 13
    .line 14
    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LE/V;->e:Landroidx/concurrent/futures/c$a;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LE/V;->f:Landroidx/concurrent/futures/c$a;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private n()V
    .locals 2

    .line 1
    iget-object v0, p0, LE/V;->c:Lm5/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "onImageCaptured() must be called before onFinalResult()"

    .line 8
    .line 9
    invoke-static {v0, v1}, LH0/g;->j(ZLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private q()V
    .locals 2

    .line 1
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/i0;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 10
    .line 11
    invoke-virtual {v0}, LE/i0;->s()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 19
    .line 20
    invoke-virtual {v0}, LE/i0;->t()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, LE/V;->d:Lm5/a;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    xor-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    const-string v1, "The callback can only complete once."

    .line 35
    .line 36
    invoke-static {v0, v1}, LH0/g;->j(ZLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, LE/V;->f:Landroidx/concurrent/futures/c$a;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private r(Ly/X;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LE/i0;->x(Ly/X;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE/V;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public b(Ly/X;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, LE/V;->n()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, LE/V;->q()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, LE/V;->r(Ly/X;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c(Ly/X;)V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 10
    .line 11
    invoke-virtual {v0}, LE/i0;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, p1}, LE/V;->r(Ly/X;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-direct {p0}, LE/V;->q()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, LE/V;->e:Landroidx/concurrent/futures/c$a;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 26
    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object p1, p0, LE/V;->b:LE/i0$a;

    .line 31
    .line 32
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 33
    .line 34
    invoke-interface {p1, v0}, LE/i0$a;->f(LE/i0;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v0, p0, LE/V;->h:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LE/V;->g()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, LE/V;->e:Landroidx/concurrent/futures/c$a;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public e(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LE/i0;->y(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public f(Ly/V$h;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, LE/V;->n()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, LE/V;->q()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LE/i0;->A(Ly/V$h;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    iget-boolean v0, p0, LE/V;->h:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, LE/V;->h:Z

    .line 15
    .line 16
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 17
    .line 18
    invoke-virtual {v0}, LE/i0;->j()Ly/V$e;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Ly/V$e;->onCaptureStarted()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 28
    .line 29
    invoke-virtual {v0}, LE/i0;->l()Ly/V$f;

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_0
    return-void
.end method

.method public h(Landroidx/camera/core/o;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/camera/core/o;->close()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, LE/V;->n()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, LE/V;->q()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LE/i0;->z(Landroidx/camera/core/o;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method l(Ly/X;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/V;->d:Lm5/a;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0, p1}, LE/V;->k(Ly/X;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LE/V;->r(Ly/X;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method m()V
    .locals 4

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/V;->d:Lm5/a;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Ly/X;

    .line 14
    .line 15
    const-string v1, "The request is aborted silently and retried."

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-direct {v0, v3, v1, v2}, Ly/X;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, LE/V;->k(Ly/X;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LE/V;->b:LE/i0$a;

    .line 26
    .line 27
    iget-object v1, p0, LE/V;->a:LE/i0;

    .line 28
    .line 29
    invoke-interface {v0, v1}, LE/i0$a;->f(LE/i0;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method o()Lm5/a;
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/V;->c:Lm5/a;

    .line 5
    .line 6
    return-object v0
.end method

.method public onCaptureProcessProgressed(I)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, LE/V;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LE/V;->a:LE/i0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LE/i0;->w(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method p()Lm5/a;
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/V;->d:Lm5/a;

    .line 5
    .line 6
    return-object v0
.end method

.method public s(Lm5/a;)V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/V;->i:Lm5/a;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-string v1, "CaptureRequestFuture can only be set once."

    .line 12
    .line 13
    invoke-static {v0, v1}, LH0/g;->j(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LE/V;->i:Lm5/a;

    .line 17
    .line 18
    return-void
.end method
