.class abstract synthetic LR8/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final a(Ln7/j;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ln7/g;->e:Ln7/g$b;

    .line 6
    .line 7
    invoke-interface {p0, v1}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ln7/g;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v1, LR8/V0;->a:LR8/V0;

    .line 16
    .line 17
    invoke-virtual {v1}, LR8/V0;->b()LR8/j0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, LR8/t0;->g:LR8/t0;

    .line 22
    .line 23
    invoke-interface {p0, v1}, Ln7/j;->X(Ln7/j;)Ln7/j;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v2, p0}, LR8/H;->j(LR8/N;Ln7/j;)Ln7/j;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    instance-of v2, v1, LR8/j0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    check-cast v1, LR8/j0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v3

    .line 41
    :goto_0
    if-eqz v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {v1}, LR8/j0;->Z0()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    move-object v3, v1

    .line 50
    :cond_2
    if-nez v3, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object v1, v3

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    :goto_1
    sget-object v1, LR8/V0;->a:LR8/V0;

    .line 56
    .line 57
    invoke-virtual {v1}, LR8/V0;->a()LR8/j0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    sget-object v2, LR8/t0;->g:LR8/t0;

    .line 62
    .line 63
    invoke-static {v2, p0}, LR8/H;->j(LR8/N;Ln7/j;)Ln7/j;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :goto_3
    new-instance v2, LR8/g;

    .line 68
    .line 69
    invoke-direct {v2, p0, v0, v1}, LR8/g;-><init>(Ln7/j;Ljava/lang/Thread;LR8/j0;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, LR8/P;->g:LR8/P;

    .line 73
    .line 74
    invoke-virtual {v2, p0, v2, p1}, LR8/a;->P0(LR8/P;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, LR8/g;->Q0()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static synthetic b(Ln7/j;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p0, Ln7/k;->g:Ln7/k;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, LR8/i;->e(Ln7/j;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
