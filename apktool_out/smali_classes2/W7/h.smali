.class public abstract LW7/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final a(Ljava/util/Collection;Ljava/util/Collection;LL7/a;)Ljava/util/List;
    .locals 13

    .line 1
    const-string v0, "newValueParameterTypes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "oldValueParameters"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "newOwner"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    invoke-static/range {p0 .. p1}, Lj7/q;->X0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    invoke-static {p0, v0}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lkotlin/Pair;

    .line 52
    .line 53
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v7, v1

    .line 58
    check-cast v7, LC8/S;

    .line 59
    .line 60
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, LL7/t0;

    .line 65
    .line 66
    new-instance v1, LO7/V;

    .line 67
    .line 68
    invoke-interface {v0}, LL7/t0;->getIndex()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-interface {v0}, LM7/a;->getAnnotations()LM7/h;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v0}, LL7/J;->getName()Lk8/f;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const-string v3, "getName(...)"

    .line 81
    .line 82
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0}, LL7/t0;->q0()Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    invoke-interface {v0}, LL7/t0;->X()Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    invoke-interface {v0}, LL7/t0;->V()Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    invoke-interface {v0}, LL7/t0;->f0()LC8/S;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-eqz v3, :cond_0

    .line 102
    .line 103
    invoke-static {p2}, Ls8/e;->s(LL7/m;)LL7/H;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-interface {v3}, LL7/H;->n()LI7/i;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3, v7}, LI7/i;->k(LC8/S;)LC8/S;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :goto_1
    move-object v11, v3

    .line 116
    goto :goto_2

    .line 117
    :cond_0
    const/4 v3, 0x0

    .line 118
    goto :goto_1

    .line 119
    :goto_2
    invoke-interface {v0}, LL7/p;->g()LL7/h0;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    const-string v0, "getSource(...)"

    .line 124
    .line 125
    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    move-object v2, p2

    .line 130
    invoke-direct/range {v1 .. v12}, LO7/V;-><init>(LL7/a;LL7/t0;ILM7/h;Lk8/f;LC8/S;ZZZLC8/S;LL7/h0;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_1
    return-object p1
.end method

.method public static final b(LL7/e;)LY7/a0;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ls8/e;->x(LL7/e;)LL7/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-interface {p0}, LL7/e;->P()Lv8/k;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    instance-of v2, v1, LY7/a0;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    move-object v0, v1

    .line 23
    check-cast v0, LY7/a0;

    .line 24
    .line 25
    :cond_1
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-static {p0}, LW7/h;->b(LL7/e;)LY7/a0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_2
    return-object v0
.end method
