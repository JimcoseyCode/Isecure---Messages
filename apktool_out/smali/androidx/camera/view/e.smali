.class final Landroidx/camera/view/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/V0$a;


# instance fields
.field private final a:LF/L;

.field private final b:Landroidx/lifecycle/A;

.field private c:Landroidx/camera/view/m$e;

.field private final d:Landroidx/camera/view/n;

.field e:Lm5/a;

.field private f:Z


# direct methods
.method constructor <init>(LF/L;Landroidx/lifecycle/A;Landroidx/camera/view/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/camera/view/e;->f:Z

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/camera/view/e;->a:LF/L;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/camera/view/e;->b:Landroidx/lifecycle/A;

    .line 10
    .line 11
    iput-object p3, p0, Landroidx/camera/view/e;->d:Landroidx/camera/view/n;

    .line 12
    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    invoke-virtual {p2}, Landroidx/lifecycle/x;->e()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroidx/camera/view/m$e;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/camera/view/e;->c:Landroidx/camera/view/m$e;

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
.end method

.method public static synthetic b(Landroidx/camera/view/e;Ly/q;Ljava/util/List;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/camera/view/e$b;

    .line 5
    .line 6
    invoke-direct {v0, p0, p3, p1}, Landroidx/camera/view/e$b;-><init>(Landroidx/camera/view/e;Landroidx/concurrent/futures/c$a;Ly/q;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    check-cast p1, LF/L;

    .line 13
    .line 14
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p1, p0, v0}, LF/L;->z(Ljava/util/concurrent/Executor;LF/r;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "waitForCaptureResult"

    .line 22
    .line 23
    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/view/e;Ljava/lang/Void;)Lm5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/view/e;->d:Landroidx/camera/view/n;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/camera/view/n;->i()Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic d(Landroidx/camera/view/e;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, Landroidx/camera/view/m$e;->h:Landroidx/camera/view/m$e;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/camera/view/e;->i(Landroidx/camera/view/m$e;)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0
.end method

.method private e()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/view/e;->e:Lm5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Landroidx/camera/view/e;->e:Lm5/a;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private h(Ly/q;)V
    .locals 4

    .line 1
    sget-object v0, Landroidx/camera/view/m$e;->g:Landroidx/camera/view/m$e;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/camera/view/e;->i(Landroidx/camera/view/m$e;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Landroidx/camera/view/e;->j(Ly/q;Ljava/util/List;)Lm5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, LJ/d;->a(Lm5/a;)LJ/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Landroidx/camera/view/b;

    .line 20
    .line 21
    invoke-direct {v2, p0}, Landroidx/camera/view/b;-><init>(Landroidx/camera/view/e;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v2, v3}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Landroidx/camera/view/c;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Landroidx/camera/view/c;-><init>(Landroidx/camera/view/e;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1, v2, v3}, LJ/d;->d(Ln/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p0, Landroidx/camera/view/e;->e:Lm5/a;

    .line 46
    .line 47
    new-instance v2, Landroidx/camera/view/e$a;

    .line 48
    .line 49
    invoke-direct {v2, p0, v0, p1}, Landroidx/camera/view/e$a;-><init>(Landroidx/camera/view/e;Ljava/util/List;Ly/q;)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v1, v2, p1}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private j(Ly/q;Ljava/util/List;)Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/view/d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Landroidx/camera/view/d;-><init>(Landroidx/camera/view/e;Ly/q;Ljava/util/List;)V

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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LF/M$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/view/e;->g(LF/M$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method f()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/view/e;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(LF/M$a;)V
    .locals 1

    .line 1
    sget-object v0, LF/M$a;->l:LF/M$a;

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    sget-object v0, LF/M$a;->j:LF/M$a;

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    sget-object v0, LF/M$a;->i:LF/M$a;

    .line 10
    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    sget-object v0, LF/M$a;->h:LF/M$a;

    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, LF/M$a;->m:LF/M$a;

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    sget-object v0, LF/M$a;->n:LF/M$a;

    .line 23
    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    sget-object v0, LF/M$a;->k:LF/M$a;

    .line 27
    .line 28
    if-ne p1, v0, :cond_3

    .line 29
    .line 30
    :cond_1
    iget-boolean p1, p0, Landroidx/camera/view/e;->f:Z

    .line 31
    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/camera/view/e;->a:LF/L;

    .line 35
    .line 36
    invoke-direct {p0, p1}, Landroidx/camera/view/e;->h(Ly/q;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Landroidx/camera/view/e;->f:Z

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    :goto_0
    sget-object p1, Landroidx/camera/view/m$e;->g:Landroidx/camera/view/m$e;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroidx/camera/view/e;->i(Landroidx/camera/view/m$e;)V

    .line 46
    .line 47
    .line 48
    iget-boolean p1, p0, Landroidx/camera/view/e;->f:Z

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput-boolean p1, p0, Landroidx/camera/view/e;->f:Z

    .line 54
    .line 55
    invoke-direct {p0}, Landroidx/camera/view/e;->e()V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method i(Landroidx/camera/view/m$e;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/camera/view/e;->c:Landroidx/camera/view/m$e;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput-object p1, p0, Landroidx/camera/view/e;->c:Landroidx/camera/view/m$e;

    .line 15
    .line 16
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    const-string v0, "StreamStateObserver"

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Update Preview stream state to "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Landroidx/camera/view/e;->b:Landroidx/lifecycle/A;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroidx/lifecycle/A;->l(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/camera/view/e;->f()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Landroidx/camera/view/m$e;->g:Landroidx/camera/view/m$e;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/camera/view/e;->i(Landroidx/camera/view/m$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
