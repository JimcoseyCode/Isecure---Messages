.class public abstract LX8/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method private static final a(Ln7/f;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p1, LR8/Z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LR8/Z;

    .line 6
    .line 7
    invoke-virtual {p1}, LR8/Z;->getCause()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 12
    .line 13
    invoke-static {p1}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p0, v0}, Ln7/f;->resumeWith(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public static final b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2}, Lo7/b;->a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ln7/f;)Ln7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, Li7/o;->h:Li7/o$a;

    .line 10
    .line 11
    sget-object p1, Li7/B;->a:Li7/B;

    .line 12
    .line 13
    invoke-static {p1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1}, LW8/j;->b(Ln7/f;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    invoke-static {p2, p0}, LX8/a;->a(Ln7/f;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final c(Ln7/f;Ln7/f;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 6
    .line 7
    sget-object v0, Li7/B;->a:Li7/B;

    .line 8
    .line 9
    invoke-static {v0}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, LW8/j;->b(Ln7/f;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-static {p1, p0}, LX8/a;->a(Ln7/f;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
