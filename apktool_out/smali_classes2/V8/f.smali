.class public abstract LV8/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final synthetic a(LU8/c;Ln7/j;)LU8/c;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LV8/f;->d(LU8/c;Ln7/j;)LU8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final b(Ln7/j;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p0, p2}, LW8/L;->i(Ln7/j;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :try_start_0
    new-instance v0, LV8/t;

    .line 6
    .line 7
    invoke-direct {v0, p4, p0}, LV8/t;-><init>(Ln7/f;Ln7/j;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, p3, Lkotlin/coroutines/jvm/internal/a;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {p3, p1, v0}, Lo7/b;->d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/4 v1, 0x2

    .line 22
    invoke-static {p3, v1}, Lkotlin/jvm/internal/I;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    check-cast p3, Lkotlin/jvm/functions/Function2;

    .line 27
    .line 28
    invoke-interface {p3, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :goto_0
    invoke-static {p0, p2}, LW8/L;->f(Ln7/j;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p1, p0, :cond_1

    .line 40
    .line 41
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object p1

    .line 45
    :goto_1
    invoke-static {p0, p2}, LW8/L;->f(Ln7/j;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public static synthetic c(Ln7/j;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x4

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, LW8/L;->g(Ln7/j;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LV8/f;->b(Ln7/j;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static final d(LU8/c;Ln7/j;)LU8/c;
    .locals 1

    .line 1
    instance-of v0, p0, LV8/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LV8/u;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, LV8/u;-><init>(LU8/c;Ln7/j;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    return-object p0
.end method
