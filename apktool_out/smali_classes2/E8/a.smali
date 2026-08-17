.class public final LE8/a;
.super LO7/k;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>(Lk8/f;)V
    .locals 13

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LE8/l;->a:LE8/l;

    .line 7
    .line 8
    invoke-virtual {v0}, LE8/l;->i()LL7/H;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v4, LL7/E;->j:LL7/E;

    .line 13
    .line 14
    sget-object v5, LL7/f;->h:LL7/f;

    .line 15
    .line 16
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    sget-object v7, LL7/h0;->a:LL7/h0;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    sget-object v9, LB8/f;->e:LB8/n;

    .line 24
    .line 25
    move-object v1, p0

    .line 26
    move-object v3, p1

    .line 27
    invoke-direct/range {v1 .. v9}, LO7/k;-><init>(LL7/m;Lk8/f;LL7/E;LL7/f;Ljava/util/Collection;LL7/h0;ZLB8/n;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, LM7/h;->a:LM7/h$a;

    .line 31
    .line 32
    invoke-virtual {p1}, LM7/h$a;->b()LM7/h;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-static {p0, p1, v2, v7}, LO7/i;->k1(LL7/e;LM7/h;ZLL7/h0;)LO7/i;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v3, LL7/t;->d:LL7/u;

    .line 46
    .line 47
    invoke-virtual {p1, v2, v3}, LO7/i;->n1(Ljava/util/List;LL7/u;)LO7/i;

    .line 48
    .line 49
    .line 50
    const-string v2, "apply(...)"

    .line 51
    .line 52
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sget-object v2, LE8/h;->p:LE8/h;

    .line 56
    .line 57
    invoke-virtual {p1}, LO7/m;->getName()Lk8/f;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Lk8/f;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const-string v4, ""

    .line 66
    .line 67
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v2, v3}, LE8/l;->b(LE8/h;[Ljava/lang/String;)LE8/g;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    new-instance v4, LE8/i;

    .line 76
    .line 77
    sget-object v7, LE8/k;->z0:LE8/k;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    new-array v3, v2, [Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v7, v3}, LE8/l;->e(LE8/k;[Ljava/lang/String;)LE8/j;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    new-array v10, v2, [Ljava/lang/String;

    .line 87
    .line 88
    const/16 v11, 0x18

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    invoke-direct/range {v4 .. v12}, LE8/i;-><init>(LC8/v0;Lv8/k;LE8/k;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v4}, LO7/s;->d1(LC8/S;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Lj7/T;->d(Ljava/lang/Object;)Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p0, v6, v0, p1}, LO7/k;->H0(Lv8/k;Ljava/util/Set;LL7/d;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public C0(LC8/G0;)LL7/e;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public G(LC8/E0;LD8/g;)Lv8/k;
    .locals 1

    .line 1
    const-string v0, "typeSubstitution"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kotlinTypeRefiner"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p2, LE8/h;->p:LE8/h;

    .line 12
    .line 13
    invoke-virtual {p0}, LO7/a;->getName()Lk8/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lk8/f;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p2, p1}, LE8/l;->b(LE8/h;[Ljava/lang/String;)LE8/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public bridge synthetic c(LC8/G0;)LL7/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE8/a;->C0(LC8/G0;)LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LO7/a;->getName()Lk8/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk8/f;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "asString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
