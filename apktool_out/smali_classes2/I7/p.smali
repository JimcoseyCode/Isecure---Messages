.class public abstract LI7/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:LO7/G;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, LO7/G;

    .line 2
    .line 3
    new-instance v1, LO7/p;

    .line 4
    .line 5
    sget-object v2, LE8/l;->a:LE8/l;

    .line 6
    .line 7
    invoke-virtual {v2}, LE8/l;->i()LL7/H;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget-object v3, LI7/o;->s:Lk8/c;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, LO7/p;-><init>(LL7/H;Lk8/c;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, LL7/f;->i:LL7/f;

    .line 17
    .line 18
    sget-object v3, LI7/o;->v:Lk8/c;

    .line 19
    .line 20
    invoke-virtual {v3}, Lk8/c;->g()Lk8/f;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    sget-object v6, LL7/h0;->a:LL7/h0;

    .line 25
    .line 26
    sget-object v7, LB8/f;->e:LB8/n;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct/range {v0 .. v7}, LO7/G;-><init>(LL7/m;LL7/f;ZZLk8/f;LL7/h0;LB8/n;)V

    .line 31
    .line 32
    .line 33
    move-object v6, v7

    .line 34
    sget-object v1, LL7/E;->k:LL7/E;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, LO7/G;->J0(LL7/E;)V

    .line 37
    .line 38
    .line 39
    sget-object v1, LL7/t;->e:LL7/u;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, LO7/G;->L0(LL7/u;)V

    .line 42
    .line 43
    .line 44
    sget-object v1, LM7/h;->a:LM7/h$a;

    .line 45
    .line 46
    invoke-virtual {v1}, LM7/h$a;->b()LM7/h;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v3, LC8/N0;->l:LC8/N0;

    .line 51
    .line 52
    const-string v2, "T"

    .line 53
    .line 54
    invoke-static {v2}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-static/range {v0 .. v6}, LO7/U;->O0(LL7/m;LM7/h;ZLC8/N0;Lk8/f;ILB8/n;)LL7/m0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, LO7/G;->K0(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, LO7/G;->H0()V

    .line 72
    .line 73
    .line 74
    sput-object v0, LI7/p;->a:LO7/G;

    .line 75
    .line 76
    return-void
.end method

.method public static final a(LC8/S;)LC8/d0;
    .locals 13

    .line 1
    const-string v0, "suspendFunType"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LI7/h;->r(LC8/S;)Z

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, LH8/d;->n(LC8/S;)LI7/i;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, LC8/S;->getAnnotations()LM7/h;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p0}, LI7/h;->k(LC8/S;)LC8/S;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {p0}, LI7/h;->e(LC8/S;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {p0}, LI7/h;->m(LC8/S;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v5, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v6, 0xa

    .line 32
    .line 33
    invoke-static {v0, v6}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, LC8/B0;

    .line 55
    .line 56
    invoke-interface {v6}, LC8/B0;->getType()LC8/S;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object v0, LC8/r0;->h:LC8/r0$a;

    .line 65
    .line 66
    invoke-virtual {v0}, LC8/r0$a;->j()LC8/r0;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    sget-object v0, LI7/p;->a:LO7/G;

    .line 71
    .line 72
    invoke-virtual {v0}, LO7/G;->j()LC8/v0;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    const-string v0, "getTypeConstructor(...)"

    .line 77
    .line 78
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0}, LI7/h;->l(LC8/S;)LC8/S;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, LH8/d;->d(LC8/S;)LC8/B0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    const/16 v11, 0x10

    .line 94
    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-static/range {v6 .. v12}, LC8/V;->k(LC8/r0;LC8/v0;Ljava/util/List;ZLD8/g;ILjava/lang/Object;)LC8/d0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v5, v0}, Lj7/q;->A0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-static {p0}, LH8/d;->n(LC8/S;)LI7/i;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, LI7/i;->I()LC8/d0;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const-string v0, "getNullableAnyType(...)"

    .line 115
    .line 116
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/16 v9, 0x80

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    invoke-static/range {v1 .. v10}, LI7/h;->c(LI7/i;LM7/h;LC8/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;ZILjava/lang/Object;)LC8/d0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p0}, LC8/S;->L0()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    invoke-virtual {v0, p0}, LC8/d0;->R0(Z)LC8/d0;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method
