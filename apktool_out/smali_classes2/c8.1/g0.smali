.class final Lc8/g0;
.super Lc8/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LM7/a;

.field private final b:Z

.field private final c:LX7/k;

.field private final d:LU7/c;

.field private final e:Z


# direct methods
.method public constructor <init>(LM7/a;ZLX7/k;LU7/c;Z)V
    .locals 1

    const-string v0, "containerContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerApplicabilityType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lc8/d;-><init>()V

    .line 3
    iput-object p1, p0, Lc8/g0;->a:LM7/a;

    .line 4
    iput-boolean p2, p0, Lc8/g0;->b:Z

    .line 5
    iput-object p3, p0, Lc8/g0;->c:LX7/k;

    .line 6
    iput-object p4, p0, Lc8/g0;->d:LU7/c;

    .line 7
    iput-boolean p5, p0, Lc8/g0;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(LM7/a;ZLX7/k;LU7/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 1
    invoke-direct/range {v0 .. v5}, Lc8/g0;-><init>(LM7/a;ZLX7/k;LU7/c;Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A()LG8/o;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc8/g0;->M()LG8/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public B(LG8/i;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LC8/S;

    .line 7
    .line 8
    invoke-static {p1}, LI7/i;->d0(LC8/S;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc8/g0;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public D(LG8/i;LG8/i;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "other"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc8/g0;->c:LX7/k;

    .line 12
    .line 13
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LX7/d;->k()LD8/p;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast p1, LC8/S;

    .line 22
    .line 23
    check-cast p2, LC8/S;

    .line 24
    .line 25
    invoke-interface {v0, p1, p2}, LD8/e;->c(LC8/S;LC8/S;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public E(LG8/n;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p1, p1, LY7/c0;

    .line 7
    .line 8
    return p1
.end method

.method public F(LG8/i;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LC8/S;

    .line 7
    .line 8
    invoke-virtual {p1}, LC8/S;->N0()LC8/M0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of p1, p1, Lc8/j;

    .line 13
    .line 14
    return p1
.end method

.method public J(LM7/c;LG8/i;)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, LW7/g;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, LW7/g;

    .line 12
    .line 13
    invoke-interface {v0}, LW7/g;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    :cond_0
    instance-of v0, p1, LY7/j;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lc8/g0;->u()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, LY7/j;

    .line 31
    .line 32
    invoke-virtual {v0}, LY7/j;->m()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lc8/g0;->q()LU7/c;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v1, LU7/c;->l:LU7/c;

    .line 43
    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    :cond_1
    if-eqz p2, :cond_3

    .line 47
    .line 48
    check-cast p2, LC8/S;

    .line 49
    .line 50
    invoke-static {p2}, LI7/i;->q0(LC8/S;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Lc8/g0;->K()LU7/d;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2, p1}, LU7/b;->p(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, Lc8/g0;->c:LX7/k;

    .line 67
    .line 68
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, LX7/d;->q()LX7/e;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, LX7/e;->c()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    :cond_2
    const/4 p1, 0x1

    .line 83
    return p1

    .line 84
    :cond_3
    const/4 p1, 0x0

    .line 85
    return p1
.end method

.method public K()LU7/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/g0;->c:LX7/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LX7/d;->a()LU7/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public L(LG8/i;)LC8/S;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LC8/S;

    .line 7
    .line 8
    invoke-static {p1}, LC8/L0;->a(LC8/S;)LC8/S;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public M()LG8/q;
    .locals 1

    .line 1
    sget-object v0, LD8/s;->a:LD8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;LG8/i;)Z
    .locals 0

    .line 1
    check-cast p1, LM7/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lc8/g0;->J(LM7/c;LG8/i;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic m()LU7/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc8/g0;->K()LU7/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n(LG8/i;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LC8/S;

    .line 7
    .line 8
    invoke-virtual {p1}, LC8/S;->getAnnotations()LM7/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public p()Ljava/lang/Iterable;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/g0;->a:LM7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LM7/a;->getAnnotations()LM7/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public q()LU7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/g0;->d:LU7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()LU7/E;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/g0;->c:LX7/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/k;->b()LU7/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public s()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc8/g0;->a:LM7/a;

    .line 2
    .line 3
    instance-of v1, v0, LL7/t0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LL7/t0;

    .line 8
    .line 9
    invoke-interface {v0}, LL7/t0;->f0()LC8/S;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method protected t(Lc8/l;LU7/w;)Lc8/l;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    sget-object v1, Lc8/k;->i:Lc8/k;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-static {p1, v1, v2, v3, v0}, Lc8/l;->b(Lc8/l;Lc8/k;ZILjava/lang/Object;)Lc8/l;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object p1

    .line 16
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2}, LU7/w;->d()Lc8/l;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_2
    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/g0;->c:LX7/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LX7/d;->q()LX7/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, LX7/e;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public bridge synthetic v(LG8/i;)LG8/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc8/g0;->L(LG8/i;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public x(LG8/i;)Lk8/d;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LC8/S;

    .line 7
    .line 8
    invoke-static {p1}, LC8/J0;->f(LC8/S;)LL7/e;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lo8/i;->m(LL7/m;)Lk8/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc8/g0;->e:Z

    .line 2
    .line 3
    return v0
.end method
