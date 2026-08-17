.class public abstract LR8/O;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final a(Ln7/j;)LR8/N;
    .locals 3

    .line 1
    new-instance v0, LW8/e;

    .line 2
    .line 3
    sget-object v1, LR8/A0;->c:LR8/A0$b;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, v1, v2}, LR8/D0;->b(LR8/A0;ILjava/lang/Object;)LR8/z;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p0, v1}, Ln7/j;->X(Ln7/j;)Ln7/j;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, LW8/e;-><init>(Ln7/j;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(LR8/N;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-interface {p0}, LR8/N;->i()Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR8/A0;->c:LR8/A0$b;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LR8/A0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1}, LR8/A0;->k(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public static final c(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LW8/A;

    .line 2
    .line 3
    invoke-interface {p1}, Ln7/f;->getContext()Ln7/j;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, LW8/A;-><init>(Ln7/j;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v0, p0}, LX8/b;->d(LW8/A;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object p0
.end method

.method public static final d(LR8/N;)V
    .locals 0

    .line 1
    invoke-interface {p0}, LR8/N;->i()Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LR8/D0;->g(Ln7/j;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final e(LR8/N;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, LR8/N;->i()Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, LR8/A0;->c:LR8/A0$b;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, LR8/A0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, LR8/A0;->d()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method
