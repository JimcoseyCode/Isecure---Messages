.class public LE/c0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LE/Y;
.implements Landroidx/camera/core/e$a;
.implements LE/i0$a;


# instance fields
.field final a:Ljava/util/Deque;

.field final b:LE/y;

.field c:LE/z;

.field private d:LE/V;

.field private final e:Ljava/util/List;

.field f:Z


# direct methods
.method public constructor <init>(LE/y;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE/c0;->a:Ljava/util/Deque;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, LE/c0;->f:Z

    .line 13
    .line 14
    invoke-static {}, LH/y;->b()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LE/c0;->b:LE/y;

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LE/c0;->e:Ljava/util/List;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic g(LE/c0;LE/V;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE/c0;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic h(LE/c0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LE/c0;->d:LE/V;

    .line 3
    .line 4
    invoke-virtual {p0}, LE/c0;->j()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private k(LE/k;)Lm5/a;
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/c0;->b:LE/y;

    .line 5
    .line 6
    invoke-interface {v0}, LE/y;->b()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LE/c0;->b:LE/y;

    .line 10
    .line 11
    invoke-virtual {p1}, LE/k;->a()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, LE/y;->a(Ljava/util/List;)Lm5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, LE/c0$a;

    .line 20
    .line 21
    invoke-direct {v1, p0, p1}, LE/c0$a;-><init>(LE/c0;LE/k;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0, v1, p1}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method private l(LE/V;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LE/c0;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, LH0/g;->i(Z)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LE/c0;->d:LE/V;

    .line 11
    .line 12
    invoke-virtual {p1}, LE/V;->o()Lm5/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, LE/a0;

    .line 17
    .line 18
    invoke-direct {v1, p0}, LE/a0;-><init>(LE/c0;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0, v1, v2}, Lm5/a;->h(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LE/c0;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, LE/V;->p()Lm5/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, LE/b0;

    .line 38
    .line 39
    invoke-direct {v1, p0, p1}, LE/b0;-><init>(LE/c0;LE/V;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, v1, p1}, Lm5/a;->h(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/o;)V
    .locals 1

    .line 1
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LE/Z;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LE/Z;-><init>(LE/c0;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LE/c0;->f:Z

    .line 6
    .line 7
    invoke-virtual {p0}, LE/c0;->j()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ly/X;

    .line 5
    .line 6
    const-string v1, "Camera is closed."

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x3

    .line 10
    invoke-direct {v0, v3, v1, v2}, Ly/X;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LE/c0;->a:Ljava/util/Deque;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, LE/i0;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, LE/i0;->x(Ly/X;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v1, p0, LE/c0;->a:Ljava/util/Deque;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object v2, p0, LE/c0;->e:Ljava/util/List;

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, LE/V;

    .line 62
    .line 63
    invoke-virtual {v2, v0}, LE/V;->l(Ly/X;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    return-void
.end method

.method public d(LE/z;)V
    .locals 0

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/c0;->c:LE/z;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, LE/z;->k(Landroidx/camera/core/e$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public e(LE/i0;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/c0;->a:Ljava/util/Deque;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Deque;->offer(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LE/c0;->j()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public f(LE/i0;)V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    const-string v0, "TakePictureManagerImpl"

    .line 5
    .line 6
    const-string v1, "Add a new request for retrying."

    .line 7
    .line 8
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LE/c0;->a:Ljava/util/Deque;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LE/c0;->j()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE/c0;->d:LE/V;

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

.method j()V
    .locals 4

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE/c0;->i()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-boolean v0, p0, LE/c0;->f:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, LE/c0;->c:LE/z;

    .line 17
    .line 18
    invoke-virtual {v0}, LE/z;->h()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iget-object v0, p0, LE/c0;->a:Ljava/util/Deque;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, LE/i0;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    new-instance v1, LE/V;

    .line 37
    .line 38
    invoke-direct {v1, v0, p0}, LE/V;-><init>(LE/i0;LE/i0$a;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1}, LE/c0;->l(LE/V;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, LE/c0;->c:LE/z;

    .line 45
    .line 46
    invoke-virtual {v1}, LE/V;->o()Lm5/a;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v0, v1, v3}, LE/z;->e(LE/i0;LE/X;Lm5/a;)LH0/d;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v2, v0, LH0/d;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, LE/k;

    .line 57
    .line 58
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object v0, v0, LH0/d;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LE/S;

    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, LE/c0;->c:LE/z;

    .line 69
    .line 70
    invoke-virtual {v3, v0}, LE/z;->m(LE/S;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v2}, LE/c0;->k(LE/k;)Lm5/a;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v1, v0}, LE/V;->s(Lm5/a;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, LE/c0;->f:Z

    .line 6
    .line 7
    iget-object v0, p0, LE/c0;->d:LE/V;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LE/V;->m()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
