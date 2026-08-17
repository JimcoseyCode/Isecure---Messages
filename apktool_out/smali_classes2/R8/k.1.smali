.class abstract synthetic LR8/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final a(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;)LR8/V;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LR8/H;->j(LR8/N;Ln7/j;)Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, LR8/P;->k()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, LR8/I0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, LR8/I0;-><init>(Ln7/j;Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, LR8/W;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, LR8/W;-><init>(Ln7/j;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LR8/a;->P0(LR8/P;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic b(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/V;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Ln7/k;->g:Ln7/k;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, LR8/P;->g:LR8/P;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, LR8/i;->a(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;)LR8/V;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final c(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;)LR8/A0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LR8/H;->j(LR8/N;Ln7/j;)Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, LR8/P;->k()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, LR8/J0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, LR8/J0;-><init>(Ln7/j;Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, LR8/R0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, LR8/R0;-><init>(Ln7/j;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LR8/a;->P0(LR8/P;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Ln7/k;->g:Ln7/k;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, LR8/P;->g:LR8/P;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, LR8/i;->c(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;)LR8/A0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final e(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, Ln7/f;->getContext()Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, LR8/H;->k(Ln7/j;Ln7/j;)Ln7/j;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, LR8/D0;->g(Ln7/j;)V

    .line 10
    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    new-instance v0, LW8/A;

    .line 15
    .line 16
    invoke-direct {v0, p0, p2}, LW8/A;-><init>(Ln7/j;Ln7/f;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v0, p1}, LX8/b;->d(LW8/A;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, Ln7/g;->e:Ln7/g$b;

    .line 25
    .line 26
    invoke-interface {p0, v1}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v0, v1}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v0, LR8/b1;

    .line 41
    .line 42
    invoke-direct {v0, p0, p2}, LR8/b1;-><init>(Ln7/j;Ln7/f;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, LR8/a;->getContext()Ln7/j;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p0, v1}, LW8/L;->i(Ln7/j;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :try_start_0
    invoke-static {v0, v0, p1}, LX8/b;->d(LW8/A;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-static {p0, v1}, LW8/L;->f(Ln7/j;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    invoke-static {p0, v1}, LW8/L;->f(Ln7/j;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_1
    new-instance v0, LR8/a0;

    .line 69
    .line 70
    invoke-direct {v0, p0, p2}, LR8/a0;-><init>(Ln7/j;Ln7/f;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0, v0}, LX8/a;->b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, LR8/a0;->R0()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_0
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p0, p1, :cond_2

    .line 85
    .line 86
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-object p0
.end method
