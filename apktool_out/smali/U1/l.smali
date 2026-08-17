.class public abstract LU1/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final a(LU1/g$N;IZ)V
    .locals 2

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, LU1/g$s;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p0, LU1/g$L;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    move-object p2, p0

    .line 18
    check-cast p2, LU1/g$L;

    .line 19
    .line 20
    invoke-static {p2}, LU1/l;->d(LU1/g$L;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p2, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    :goto_0
    const/4 p2, 0x1

    .line 30
    :goto_1
    move-object v0, p0

    .line 31
    check-cast v0, LU1/g$L;

    .line 32
    .line 33
    iget-object v1, v0, LU1/g$L;->e:LU1/g$E;

    .line 34
    .line 35
    invoke-static {v1, p1}, LU1/l;->f(LU1/g$E;I)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, LU1/g$L;->f:LU1/g$E;

    .line 39
    .line 40
    invoke-static {v1, p1}, LU1/l;->f(LU1/g$E;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p1, p2}, LU1/l;->c(LU1/g$L;IZ)V

    .line 44
    .line 45
    .line 46
    :cond_3
    instance-of v0, p0, LU1/g$J;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    check-cast p0, LU1/g$J;

    .line 51
    .line 52
    invoke-interface {p0}, LU1/g$J;->b()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, LU1/g$N;

    .line 71
    .line 72
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p1, p2}, LU1/l;->a(LU1/g$N;IZ)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    return-void
.end method

.method public static final b(LU1/g;I)V
    .locals 2

    .line 1
    const-string v0, "svg"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LU1/g;->m()LU1/g$F;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, LU1/g;->d()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LU1/b$p;

    .line 31
    .line 32
    iget-object v1, v1, LU1/b$p;->b:LU1/g$E;

    .line 33
    .line 34
    invoke-static {v1, p1}, LU1/l;->f(LU1/g$E;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p0, v0, LU1/g$L;->e:LU1/g$E;

    .line 39
    .line 40
    invoke-static {p0, p1}, LU1/l;->f(LU1/g$E;I)V

    .line 41
    .line 42
    .line 43
    iget-object p0, v0, LU1/g$L;->f:LU1/g$E;

    .line 44
    .line 45
    invoke-static {p0, p1}, LU1/l;->f(LU1/g$E;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, LU1/l;->d(LU1/g$L;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    iget-object v0, v0, LU1/g$H;->i:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, LU1/g$N;

    .line 72
    .line 73
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, p1, p0}, LU1/l;->a(LU1/g$N;IZ)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    return-void
.end method

.method public static final c(LU1/g$L;IZ)V
    .locals 1

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object p2, p0, LU1/g$L;->f:LU1/g$E;

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    new-instance p2, LU1/g$E;

    .line 15
    .line 16
    invoke-direct {p2}, LU1/g$E;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LU1/g$L;->f:LU1/g$E;

    .line 20
    .line 21
    :goto_0
    new-instance v0, LU1/g$f;

    .line 22
    .line 23
    invoke-direct {v0, p1}, LU1/g$f;-><init>(I)V

    .line 24
    .line 25
    .line 26
    instance-of p1, p0, LU1/g$v;

    .line 27
    .line 28
    if-nez p1, :cond_4

    .line 29
    .line 30
    instance-of p1, p0, LU1/g$d;

    .line 31
    .line 32
    if-nez p1, :cond_4

    .line 33
    .line 34
    instance-of p1, p0, LU1/g$i;

    .line 35
    .line 36
    if-nez p1, :cond_4

    .line 37
    .line 38
    instance-of p1, p0, LU1/g$B;

    .line 39
    .line 40
    if-nez p1, :cond_4

    .line 41
    .line 42
    instance-of p1, p0, LU1/g$C;

    .line 43
    .line 44
    if-nez p1, :cond_4

    .line 45
    .line 46
    instance-of p1, p0, LU1/g$q;

    .line 47
    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    instance-of p1, p0, LU1/g$A;

    .line 51
    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    instance-of p1, p0, LU1/g$z;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    instance-of p0, p0, LU1/g$Z;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    iput-object v0, p2, LU1/g$E;->t:LU1/g$f;

    .line 64
    .line 65
    const-wide/16 p0, 0x1000

    .line 66
    .line 67
    iput-wide p0, p2, LU1/g$E;->g:J

    .line 68
    .line 69
    :cond_3
    :goto_1
    return-void

    .line 70
    :cond_4
    :goto_2
    iput-object v0, p2, LU1/g$E;->h:LU1/g$O;

    .line 71
    .line 72
    const-wide/16 p0, 0x1

    .line 73
    .line 74
    iput-wide p0, p2, LU1/g$E;->g:J

    .line 75
    .line 76
    return-void
.end method

.method public static final d(LU1/g$L;)Z
    .locals 4

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU1/g$L;->f:LU1/g$E;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, LU1/g$L;->e:LU1/g$E;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v3, v0, LU1/g$E;->t:LU1/g$f;

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    iget-object v3, v0, LU1/g$E;->h:LU1/g$O;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    iget-object v3, v0, LU1/g$E;->k:LU1/g$O;

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    iget-object v3, v0, LU1/g$E;->I:LU1/g$O;

    .line 34
    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, LU1/g$E;->N:LU1/g$O;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    :cond_1
    return v2

    .line 42
    :cond_2
    iget-object p0, p0, LU1/g$L;->e:LU1/g$E;

    .line 43
    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    iget-object v0, p0, LU1/g$E;->t:LU1/g$f;

    .line 48
    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    iget-object v0, p0, LU1/g$E;->h:LU1/g$O;

    .line 52
    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    iget-object v0, p0, LU1/g$E;->k:LU1/g$O;

    .line 56
    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    iget-object v0, p0, LU1/g$E;->P:LU1/g$O;

    .line 60
    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    iget-object v0, p0, LU1/g$E;->I:LU1/g$O;

    .line 64
    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    iget-object p0, p0, LU1/g$E;->N:LU1/g$O;

    .line 68
    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    return v1

    .line 73
    :cond_5
    :goto_0
    return v2
.end method

.method public static final e(LU1/g$O;I)V
    .locals 1

    .line 1
    instance-of v0, p0, LU1/g$f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LU1/g$f;->i:LU1/g$f;

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    check-cast p0, LU1/g$f;

    .line 10
    .line 11
    iput p1, p0, LU1/g$f;->g:I

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public static final f(LU1/g$E;I)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LU1/g$E;->t:LU1/g$f;

    .line 5
    .line 6
    invoke-static {v0, p1}, LU1/l;->e(LU1/g$O;I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LU1/g$E;->h:LU1/g$O;

    .line 10
    .line 11
    invoke-static {v0, p1}, LU1/l;->e(LU1/g$O;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LU1/g$E;->k:LU1/g$O;

    .line 15
    .line 16
    invoke-static {v0, p1}, LU1/l;->e(LU1/g$O;I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LU1/g$E;->I:LU1/g$O;

    .line 20
    .line 21
    invoke-static {v0, p1}, LU1/l;->e(LU1/g$O;I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LU1/g$E;->N:LU1/g$O;

    .line 25
    .line 26
    invoke-static {v0, p1}, LU1/l;->e(LU1/g$O;I)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, LU1/g$E;->P:LU1/g$O;

    .line 30
    .line 31
    invoke-static {p0, p1}, LU1/l;->e(LU1/g$O;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
