.class Lg0/I$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lg0/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private b:Lb0/c$a;

.field private final c:Ljava/util/List;

.field final synthetic d:Lg0/I;


# direct methods
.method constructor <init>(Lg0/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0/I$e;->d:Lg0/I;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lg0/I$e;->a:Ljava/util/Map;

    .line 12
    .line 13
    sget-object p1, Lb0/c$a;->h:Lb0/c$a;

    .line 14
    .line 15
    iput-object p1, p0, Lg0/I$e;->b:Lb0/c$a;

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lg0/I$e;->c:Ljava/util/List;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic f(Lg0/I$e;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lg0/I$e;->b:Lb0/c$a;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic g(Ljava/util/Map$Entry;Lb0/c$a;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, LF/V0$a;

    .line 6
    .line 7
    invoke-interface {p0, p1}, LF/V0$a;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic h(Lg0/I$e;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/I$e;->d:Lg0/I;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/I;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lg0/N;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lg0/N;-><init>(Lg0/I$e;Landroidx/concurrent/futures/c$a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    const-string p0, "fetchData"

    .line 14
    .line 15
    return-object p0
.end method

.method public static synthetic i(Lg0/I$e;LF/V0$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/I$e;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LF/V0$a;

    .line 8
    .line 9
    invoke-static {p2}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lg0/I$e;->b:Lb0/c$a;

    .line 19
    .line 20
    new-instance v0, Lg0/Q;

    .line 21
    .line 22
    invoke-direct {v0, p1, p0}, Lg0/Q;-><init>(LF/V0$a;Lb0/c$a;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static synthetic j(LF/V0$a;Lb0/c$a;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LF/V0$a;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lg0/I$e;LF/V0$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lg0/I$e;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic l(Lg0/I$e;Lm5/a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lg0/I$e;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic m(Lg0/I$e;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/I$e;->d:Lg0/I;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/I;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lg0/P;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lg0/P;-><init>(Lg0/I$e;Landroidx/concurrent/futures/c$a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    const-string p0, "acquireBuffer"

    .line 14
    .line 15
    return-object p0
.end method

.method public static synthetic n(Lg0/I$e;Landroidx/concurrent/futures/c$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/I$e;->b:Lb0/c$a;

    .line 2
    .line 3
    sget-object v1, Lb0/c$a;->g:Lb0/c$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lg0/I$e;->d:Lg0/I;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg0/I;->F()Lm5/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, LJ/n;->t(Lm5/a;Landroidx/concurrent/futures/c$a;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lg0/S;

    .line 17
    .line 18
    invoke-direct {v1, p0, v0}, Lg0/S;-><init>(Lg0/I$e;Lm5/a;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1, v1, v2}, Landroidx/concurrent/futures/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lg0/I$e;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    new-instance p1, Lg0/T;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0}, Lg0/T;-><init>(Lg0/I$e;Lm5/a;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lg0/I$e;->d:Lg0/I;

    .line 39
    .line 40
    iget-object p0, p0, Lg0/I;->i:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    invoke-interface {v0, p1, p0}, Lm5/a;->h(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    sget-object v1, Lb0/c$a;->h:Lb0/c$a;

    .line 47
    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "BufferProvider is not active."

    .line 53
    .line 54
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "Unknown state: "

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lg0/I$e;->b:Lb0/c$a;

    .line 74
    .line 75
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static synthetic o(Lg0/I$e;Lm5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lg0/I$e;->p(Lm5/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private p(Lm5/a;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, LH0/g;->i(Z)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lg0/i0;

    .line 20
    .line 21
    invoke-interface {p1}, Lg0/i0;->cancel()Z
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :catch_2
    move-exception p1

    .line 30
    :goto_0
    iget-object v0, p0, Lg0/I$e;->d:Lg0/I;

    .line 31
    .line 32
    iget-object v0, v0, Lg0/I;->a:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "Unable to cancel the input buffer: "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v0, p1}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Lg0/M;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lg0/M;-><init>(Lg0/I$e;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public c(Ljava/util/concurrent/Executor;LF/V0$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/I$e;->d:Lg0/I;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/I;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lg0/L;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1}, Lg0/L;-><init>(Lg0/I$e;LF/V0$a;Ljava/util/concurrent/Executor;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public d()Lm5/a;
    .locals 1

    .line 1
    new-instance v0, Lg0/J;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lg0/J;-><init>(Lg0/I$e;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public e(LF/V0$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/I$e;->d:Lg0/I;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/I;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Lg0/O;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lg0/O;-><init>(Lg0/I$e;LF/V0$a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method q(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lb0/c$a;->g:Lb0/c$a;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lb0/c$a;->h:Lb0/c$a;

    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lg0/I$e;->b:Lb0/c$a;

    .line 9
    .line 10
    if-ne v0, p1, :cond_1

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_1
    iput-object p1, p0, Lg0/I$e;->b:Lb0/c$a;

    .line 14
    .line 15
    sget-object v0, Lb0/c$a;->h:Lb0/c$a;

    .line 16
    .line 17
    if-ne p1, v0, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Lg0/I$e;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lm5/a;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-object v0, p0, Lg0/I$e;->c:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v0, p0, Lg0/I$e;->a:Ljava/util/Map;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/util/Map$Entry;

    .line 68
    .line 69
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 74
    .line 75
    new-instance v3, Lg0/K;

    .line 76
    .line 77
    invoke-direct {v3, v1, p1}, Lg0/K;-><init>(Ljava/util/Map$Entry;Lb0/c$a;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catch_0
    move-exception v1

    .line 85
    iget-object v2, p0, Lg0/I$e;->d:Lg0/I;

    .line 86
    .line 87
    iget-object v2, v2, Lg0/I;->a:Ljava/lang/String;

    .line 88
    .line 89
    const-string v3, "Unable to post to the supplied executor."

    .line 90
    .line 91
    invoke-static {v2, v3, v1}, Ly/h0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    :goto_3
    return-void
.end method
