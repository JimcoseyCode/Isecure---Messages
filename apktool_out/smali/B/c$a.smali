.class public final LB/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/c$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB/c$a;-><init>()V

    return-void
.end method

.method private final d(LC/b;Ly/J0;)Z
    .locals 1

    .line 1
    sget-object v0, LB/c$a$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p2}, LB/c$a;->g(Ly/J0;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    new-instance p1, Li7/m;

    .line 27
    .line 28
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-direct {p0, p2}, LB/c$a;->h(Ly/J0;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_2
    invoke-direct {p0, p2}, LB/c$a;->f(Ly/J0;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_3
    invoke-direct {p0, p2}, LB/c$a;->e(Ly/J0;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
.end method

.method private final e(Ly/J0;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ly/J0;->e()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, LF/D0;->u()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method private final f(Ly/J0;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ly/J0;->e()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, LF/D1;->b0()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method private final g(Ly/J0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ly/J0;->e()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, LF/C0;->U:LF/j0$a;

    .line 6
    .line 7
    invoke-interface {p1, v0}, LF/h1;->b(LF/j0$a;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method private final h(Ly/J0;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ly/J0;->e()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LF/D1;->H:LF/j0$a;

    .line 6
    .line 7
    invoke-interface {v0, v1}, LF/h1;->b(LF/j0$a;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ly/J0;->e()LF/D1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, LF/D1;->I:LF/j0$a;

    .line 18
    .line 19
    invoke-interface {p1, v0}, LF/h1;->b(LF/j0$a;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method


# virtual methods
.method public final a(Ly/J0;)LC/b;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LC/b;->j()Lkotlin/enums/EnumEntries;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, LC/b;

    .line 26
    .line 27
    sget-object v3, LB/c;->i:LB/c$a;

    .line 28
    .line 29
    invoke-direct {v3, v2, p1}, LB/c$a;->d(LC/b;Ly/J0;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    check-cast v1, LC/b;

    .line 38
    .line 39
    return-object v1
.end method

.method public final b(LF/D1;)LB/c;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LF/D1;->G()LF/E1$b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, LB/c$a$a;->a:[I

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    aget p1, v0, p1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq p1, v0, :cond_3

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq p1, v0, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq p1, v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-eq p1, v0, :cond_0

    .line 29
    .line 30
    sget-object p1, LB/c;->n:LB/c;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    sget-object p1, LB/c;->m:LB/c;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    sget-object p1, LB/c;->l:LB/c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_2
    sget-object p1, LB/c;->j:LB/c;

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_3
    sget-object p1, LB/c;->k:LB/c;

    .line 43
    .line 44
    return-object p1
.end method

.method public final c(Ly/J0;)LB/c;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ly/p0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p1, LB/c;->j:LB/c;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    instance-of v0, p1, Ly/V;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object p1, LB/c;->k:LB/c;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    invoke-static {p1}, LK/f;->e0(Ly/J0;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object p1, LB/c;->l:LB/c;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    instance-of p1, p1, LT/g;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    sget-object p1, LB/c;->m:LB/c;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_3
    sget-object p1, LB/c;->n:LB/c;

    .line 37
    .line 38
    return-object p1
.end method
