.class public final Ly8/X;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Ly8/p;

.field private final b:Ly8/X;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lkotlin/jvm/functions/Function1;

.field private final f:Lkotlin/jvm/functions/Function1;

.field private final g:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ly8/p;Ly8/X;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterProtos"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "debugName"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "containerPresentableName"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ly8/X;->a:Ly8/p;

    .line 25
    .line 26
    iput-object p2, p0, Ly8/X;->b:Ly8/X;

    .line 27
    .line 28
    iput-object p4, p0, Ly8/X;->c:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p5, p0, Ly8/X;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance p4, Ly8/S;

    .line 37
    .line 38
    invoke-direct {p4, p0}, Ly8/S;-><init>(Ly8/X;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p2, p4}, LB8/n;->i(Lkotlin/jvm/functions/Function1;)LB8/h;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iput-object p2, p0, Ly8/X;->e:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Ly8/T;

    .line 52
    .line 53
    invoke-direct {p2, p0}, Ly8/T;-><init>(Ly8/X;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p2}, LB8/n;->i(Lkotlin/jvm/functions/Function1;)LB8/h;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Ly8/X;->f:Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :cond_0
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const/4 p3, 0x0

    .line 83
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    if-eqz p4, :cond_1

    .line 88
    .line 89
    add-int/lit8 p4, p3, 0x1

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p5

    .line 95
    check-cast p5, Lf8/s;

    .line 96
    .line 97
    invoke-virtual {p5}, Lf8/s;->L()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v1, LA8/S;

    .line 106
    .line 107
    iget-object v2, p0, Ly8/X;->a:Ly8/p;

    .line 108
    .line 109
    invoke-direct {v1, v2, p5, p3}, LA8/S;-><init>(Ly8/p;Lf8/s;I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move p3, p4

    .line 116
    goto :goto_0

    .line 117
    :cond_1
    :goto_1
    iput-object p1, p0, Ly8/X;->g:Ljava/util/Map;

    .line 118
    .line 119
    return-void
.end method

.method private static final A(Lf8/q;)I
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf8/q;->T()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method static synthetic a(Ly8/X;I)LL7/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly8/X;->f(Ly8/X;I)LL7/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Ly8/X;I)LL7/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly8/X;->v(Ly8/X;I)LL7/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(Ly8/X;Lf8/q;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly8/X;->r(Ly8/X;Lf8/q;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(Ly8/X;Lf8/q;)Lf8/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly8/X;->z(Ly8/X;Lf8/q;)Lf8/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(Lf8/q;)I
    .locals 0

    .line 1
    invoke-static {p0}, Ly8/X;->A(Lf8/q;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final f(Ly8/X;I)LL7/h;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly8/X;->g(I)LL7/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g(I)LL7/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lk8/b;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 18
    .line 19
    invoke-virtual {v0}, Ly8/p;->c()Ly8/n;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Ly8/n;->b(Lk8/b;)LL7/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 29
    .line 30
    invoke-virtual {v0}, Ly8/p;->c()Ly8/n;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ly8/n;->q()LL7/H;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, p1}, LL7/y;->c(LL7/H;Lk8/b;)LL7/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method private final h(I)LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lk8/b;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Ly8/X;->a:Ly8/p;

    .line 18
    .line 19
    invoke-virtual {p1}, Ly8/p;->c()Ly8/n;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ly8/n;->o()Ly8/B;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ly8/B;->a()LC8/d0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method private final i(I)LL7/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lk8/b;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 20
    .line 21
    invoke-virtual {v0}, Ly8/p;->c()Ly8/n;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ly8/n;->q()LL7/H;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, p1}, LL7/y;->f(LL7/H;Lk8/b;)LL7/l0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method private final j(LC8/S;LC8/S;)LC8/d0;
    .locals 8

    .line 1
    invoke-static {p1}, LH8/d;->n(LC8/S;)LI7/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LC8/S;->getAnnotations()LM7/h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p1}, LI7/h;->k(LC8/S;)LC8/S;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p1}, LI7/h;->e(LC8/S;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {p1}, LI7/h;->m(LC8/S;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-static {v4, v5}, Lj7/q;->a0(Ljava/util/List;I)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    move-object v5, v4

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/16 v6, 0xa

    .line 30
    .line 31
    invoke-static {v5, v6}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, LC8/B0;

    .line 53
    .line 54
    invoke-interface {v6}, LC8/B0;->getType()LC8/S;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v5, 0x0

    .line 63
    const/4 v7, 0x1

    .line 64
    move-object v6, p2

    .line 65
    invoke-static/range {v0 .. v7}, LI7/h;->b(LI7/i;LM7/h;LC8/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;Z)LC8/d0;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p1}, LC8/S;->L0()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {p2, p1}, LC8/d0;->R0(Z)LC8/d0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method

.method private final k(LC8/r0;LC8/v0;Ljava/util/List;Z)LC8/d0;
    .locals 8

    .line 1
    invoke-interface {p2}, LC8/v0;->getParameters()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    :cond_0
    move-object v3, p3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr v0, v2

    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p2}, LC8/v0;->n()LI7/i;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v0}, LI7/i;->X(I)LL7/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v0, "getTypeConstructor(...)"

    .line 42
    .line 43
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/16 v6, 0x10

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    move-object v1, p1

    .line 51
    move-object v3, p3

    .line 52
    move v4, p4

    .line 53
    invoke-static/range {v1 .. v7}, LC8/V;->k(LC8/r0;LC8/v0;Ljava/util/List;ZLD8/g;ILjava/lang/Object;)LC8/d0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v1, p1

    .line 59
    move-object v3, p3

    .line 60
    move v4, p4

    .line 61
    invoke-direct {p0, v1, p2, v3, v4}, Ly8/X;->l(LC8/r0;LC8/v0;Ljava/util/List;Z)LC8/d0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_0
    if-nez v1, :cond_3

    .line 66
    .line 67
    sget-object p1, LE8/l;->a:LE8/l;

    .line 68
    .line 69
    sget-object p3, LE8/k;->V:LE8/k;

    .line 70
    .line 71
    const/4 p4, 0x0

    .line 72
    new-array p4, p4, [Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1, p3, v3, p2, p4}, LE8/l;->f(LE8/k;Ljava/util/List;LC8/v0;[Ljava/lang/String;)LE8/i;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    return-object v1
.end method

.method private final l(LC8/r0;LC8/v0;Ljava/util/List;Z)LC8/d0;
    .locals 7

    .line 1
    const/16 v5, 0x10

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v4, 0x0

    .line 5
    move-object v0, p1

    .line 6
    move-object v1, p2

    .line 7
    move-object v2, p3

    .line 8
    move v3, p4

    .line 9
    invoke-static/range {v0 .. v6}, LC8/V;->k(LC8/r0;LC8/v0;Ljava/util/List;ZLD8/g;ILjava/lang/Object;)LC8/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, LI7/h;->q(LC8/S;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-direct {p0, p1}, Ly8/X;->t(LC8/S;)LC8/d0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method private final n(I)LL7/m0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/X;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LL7/m0;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Ly8/X;->b:Ly8/X;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ly8/X;->n(I)LL7/m0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    return-object v0
.end method

.method private static final p(Lf8/q;Ly8/X;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf8/q;->U()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getArgumentList(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Ly8/X;->a:Ly8/p;

    .line 11
    .line 12
    invoke-virtual {v1}, Ly8/p;->j()Lh8/g;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p0, v1}, Lh8/f;->j(Lf8/q;Lh8/g;)Lf8/q;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-static {p0, p1}, Ly8/X;->p(Lf8/q;Ly8/X;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-nez p0, :cond_1

    .line 29
    .line 30
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    invoke-static {v0, p0}, Lj7/q;->z0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static synthetic q(Ly8/X;Lf8/q;ZILjava/lang/Object;)LC8/d0;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Ly8/X;->o(Lf8/q;Z)LC8/d0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final r(Ly8/X;Lf8/q;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->c()Ly8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ly8/n;->d()Ly8/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Ly8/X;->a:Ly8/p;

    .line 12
    .line 13
    invoke-virtual {p0}, Ly8/p;->g()Lh8/c;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {v0, p1, p0}, Ly8/h;->j(Lf8/q;Lh8/c;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final s(Ljava/util/List;LM7/h;LC8/v0;LL7/m;)LC8/r0;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, LC8/q0;

    .line 27
    .line 28
    invoke-interface {v1, p2, p3, p4}, LC8/q0;->a(LM7/h;LC8/v0;LL7/m;)LC8/r0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v0}, Lj7/q;->w(Ljava/lang/Iterable;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object p2, LC8/r0;->h:LC8/r0$a;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, LC8/r0$a;->i(Ljava/util/List;)LC8/r0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method private final t(LC8/S;)LC8/d0;
    .locals 5

    .line 1
    invoke-static {p1}, LI7/h;->m(LC8/S;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lj7/q;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LC8/B0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    invoke-interface {v0}, LC8/B0;->getType()LC8/S;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    invoke-virtual {v0}, LC8/S;->K0()LC8/v0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, LC8/v0;->p()LL7/h;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-static {v2}, Ls8/e;->o(LL7/m;)Lk8/c;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v2, v1

    .line 37
    :goto_0
    invoke-virtual {v0}, LC8/S;->I0()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x1

    .line 46
    if-ne v3, v4, :cond_6

    .line 47
    .line 48
    sget-object v3, LI7/o;->v:Lk8/c;

    .line 49
    .line 50
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    invoke-static {}, Ly8/Y;->a()Lk8/c;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0}, LC8/S;->I0()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lj7/q;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, LC8/B0;

    .line 76
    .line 77
    invoke-interface {v0}, LC8/B0;->getType()LC8/S;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v2, "getType(...)"

    .line 82
    .line 83
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Ly8/X;->a:Ly8/p;

    .line 87
    .line 88
    invoke-virtual {v2}, Ly8/p;->e()LL7/m;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    instance-of v3, v2, LL7/a;

    .line 93
    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    check-cast v2, LL7/a;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v2, v1

    .line 100
    :goto_1
    if-eqz v2, :cond_4

    .line 101
    .line 102
    invoke-static {v2}, Ls8/e;->k(LL7/m;)Lk8/c;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_4
    sget-object v2, Ly8/Q;->a:Lk8/c;

    .line 107
    .line 108
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-direct {p0, p1, v0}, Ly8/X;->j(LC8/S;LC8/S;)LC8/d0;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    :cond_5
    invoke-direct {p0, p1, v0}, Ly8/X;->j(LC8/S;LC8/S;)LC8/d0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_6
    :goto_2
    check-cast p1, LC8/d0;

    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_7
    :goto_3
    return-object v1
.end method

.method private static final v(Ly8/X;I)LL7/h;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly8/X;->i(I)LL7/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final w(LL7/m0;Lf8/q$b;)LC8/B0;
    .locals 2

    .line 1
    invoke-virtual {p2}, Lf8/q$b;->w()Lf8/q$b$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lf8/q$b$c;->k:Lf8/q$b$c;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    new-instance p1, LC8/i0;

    .line 12
    .line 13
    iget-object p2, p0, Ly8/X;->a:Ly8/p;

    .line 14
    .line 15
    invoke-virtual {p2}, Ly8/p;->c()Ly8/n;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Ly8/n;->q()LL7/H;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, LL7/H;->n()LI7/i;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, LC8/i0;-><init>(LI7/i;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance p2, LC8/k0;

    .line 32
    .line 33
    invoke-direct {p2, p1}, LC8/k0;-><init>(LL7/m0;)V

    .line 34
    .line 35
    .line 36
    return-object p2

    .line 37
    :cond_1
    sget-object p1, Ly8/O;->a:Ly8/O;

    .line 38
    .line 39
    invoke-virtual {p2}, Lf8/q$b;->w()Lf8/q$b$c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "getProjection(...)"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ly8/O;->c(Lf8/q$b$c;)LC8/N0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 53
    .line 54
    invoke-virtual {v0}, Ly8/p;->j()Lh8/g;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {p2, v0}, Lh8/f;->p(Lf8/q$b;Lh8/g;)Lf8/q;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    new-instance p1, LC8/D0;

    .line 65
    .line 66
    sget-object v0, LE8/k;->F0:LE8/k;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    filled-new-array {p2}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {v0, p2}, LE8/l;->d(LE8/k;[Ljava/lang/String;)LE8/i;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, LC8/D0;-><init>(LC8/S;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_2
    new-instance p2, LC8/D0;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {p2, p1, v0}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 91
    .line 92
    .line 93
    return-object p2
.end method

.method private final x(Lf8/q;)LC8/v0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lf8/q;->k0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ly8/X;->e:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    invoke-virtual {p1}, Lf8/q;->V()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LL7/h;

    .line 22
    .line 23
    if-nez v0, :cond_5

    .line 24
    .line 25
    invoke-virtual {p1}, Lf8/q;->V()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p0, p1, v0}, Ly8/X;->y(Ly8/X;Lf8/q;I)LL7/e;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1}, Lf8/q;->u0()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Lf8/q;->g0()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {p0, v0}, Ly8/X;->n(I)LL7/m0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    sget-object v0, LE8/l;->a:LE8/l;

    .line 52
    .line 53
    sget-object v1, LE8/k;->T:LE8/k;

    .line 54
    .line 55
    invoke-virtual {p1}, Lf8/q;->g0()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v2, p0, Ly8/X;->d:Ljava/lang/String;

    .line 64
    .line 65
    filled-new-array {p1, v2}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, v1, p1}, LE8/l;->e(LE8/k;[Ljava/lang/String;)LE8/j;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_1
    invoke-virtual {p1}, Lf8/q;->v0()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 81
    .line 82
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1}, Lf8/q;->h0()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-interface {v0, p1}, Lh8/c;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0}, Ly8/X;->m()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move-object v2, v1

    .line 113
    check-cast v2, LL7/m0;

    .line 114
    .line 115
    invoke-interface {v2}, LL7/J;->getName()Lk8/f;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Lk8/f;->j()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v2, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    const/4 v1, 0x0

    .line 131
    :goto_0
    move-object v0, v1

    .line 132
    check-cast v0, LL7/m0;

    .line 133
    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    sget-object v0, LE8/l;->a:LE8/l;

    .line 137
    .line 138
    sget-object v1, LE8/k;->U:LE8/k;

    .line 139
    .line 140
    iget-object v2, p0, Ly8/X;->a:Ly8/p;

    .line 141
    .line 142
    invoke-virtual {v2}, Ly8/p;->e()LL7/m;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    filled-new-array {p1, v2}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v0, v1, p1}, LE8/l;->e(LE8/k;[Ljava/lang/String;)LE8/j;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1

    .line 159
    :cond_4
    invoke-virtual {p1}, Lf8/q;->t0()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    iget-object v0, p0, Ly8/X;->f:Lkotlin/jvm/functions/Function1;

    .line 166
    .line 167
    invoke-virtual {p1}, Lf8/q;->f0()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, LL7/h;

    .line 180
    .line 181
    if-nez v0, :cond_5

    .line 182
    .line 183
    invoke-virtual {p1}, Lf8/q;->f0()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-static {p0, p1, v0}, Ly8/X;->y(Ly8/X;Lf8/q;I)LL7/e;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :cond_5
    :goto_1
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const-string v0, "getTypeConstructor(...)"

    .line 196
    .line 197
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object p1

    .line 201
    :cond_6
    sget-object p1, LE8/l;->a:LE8/l;

    .line 202
    .line 203
    sget-object v0, LE8/k;->X:LE8/k;

    .line 204
    .line 205
    const/4 v1, 0x0

    .line 206
    new-array v1, v1, [Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {p1, v0, v1}, LE8/l;->e(LE8/k;[Ljava/lang/String;)LE8/j;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1
.end method

.method private static final y(Ly8/X;Lf8/q;I)LL7/e;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p2}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    new-instance v0, Ly8/V;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ly8/V;-><init>(Ly8/X;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, LO8/l;->n(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, Ly8/W;->g:Ly8/W;

    .line 21
    .line 22
    invoke-static {p1, v0}, LO8/l;->J(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, LO8/l;->T(LO8/i;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object v0, Ly8/X$a;->g:Ly8/X$a;

    .line 31
    .line 32
    invoke-static {p2, v0}, LO8/l;->n(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, LO8/l;->v(LO8/i;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-ge v1, v0, :cond_0

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p0, p0, Ly8/X;->a:Ly8/p;

    .line 56
    .line 57
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ly8/n;->r()LL7/M;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0, p2, p1}, LL7/M;->d(Lk8/b;Ljava/util/List;)LL7/e;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method private static final z(Ly8/X;Lf8/q;)Lf8/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly8/X;->a:Ly8/p;

    .line 7
    .line 8
    invoke-virtual {p0}, Ly8/p;->j()Lh8/g;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1, p0}, Lh8/f;->j(Lf8/q;Lh8/g;)Lf8/q;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/X;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final o(Lf8/q;Z)LC8/d0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "proto"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lf8/q;->k0()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Lf8/q;->V()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v2}, Ly8/X;->h(I)LC8/d0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Lf8/q;->t0()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Lf8/q;->f0()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-direct {v0, v2}, Ly8/X;->h(I)LC8/d0;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v2, 0x0

    .line 41
    :goto_0
    if-eqz v2, :cond_2

    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_2
    invoke-direct/range {p0 .. p1}, Ly8/X;->x(Lf8/q;)LC8/v0;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v4}, LC8/v0;->p()LL7/h;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, LE8/l;->m(LL7/m;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    sget-object v1, LE8/l;->a:LE8/l;

    .line 59
    .line 60
    sget-object v2, LE8/k;->A0:LE8/k;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    filled-new-array {v3}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v1, v2, v4, v3}, LE8/l;->c(LE8/k;LC8/v0;[Ljava/lang/String;)LE8/i;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    return-object v1

    .line 75
    :cond_3
    new-instance v2, LA8/a;

    .line 76
    .line 77
    iget-object v3, v0, Ly8/X;->a:Ly8/p;

    .line 78
    .line 79
    invoke-virtual {v3}, Ly8/p;->h()LB8/n;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-instance v5, Ly8/U;

    .line 84
    .line 85
    invoke-direct {v5, v0, v1}, Ly8/U;-><init>(Ly8/X;Lf8/q;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v2, v3, v5}, LA8/a;-><init>(LB8/n;Lw7/a;)V

    .line 89
    .line 90
    .line 91
    iget-object v3, v0, Ly8/X;->a:Ly8/p;

    .line 92
    .line 93
    invoke-virtual {v3}, Ly8/p;->c()Ly8/n;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ly8/n;->v()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object v5, v0, Ly8/X;->a:Ly8/p;

    .line 102
    .line 103
    invoke-virtual {v5}, Ly8/p;->e()LL7/m;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-direct {v0, v3, v2, v4, v5}, Ly8/X;->s(Ljava/util/List;LM7/h;LC8/v0;LL7/m;)LC8/r0;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v1, v0}, Ly8/X;->p(Lf8/q;Ly8/X;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    new-instance v6, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    invoke-static {v5, v7}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const/4 v10, 0x0

    .line 131
    move v7, v10

    .line 132
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_5

    .line 137
    .line 138
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    add-int/lit8 v9, v7, 0x1

    .line 143
    .line 144
    if-gez v7, :cond_4

    .line 145
    .line 146
    invoke-static {}, Lj7/q;->t()V

    .line 147
    .line 148
    .line 149
    :cond_4
    check-cast v8, Lf8/q$b;

    .line 150
    .line 151
    invoke-interface {v4}, LC8/v0;->getParameters()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    const-string v12, "getParameters(...)"

    .line 156
    .line 157
    invoke-static {v11, v12}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v11, v7}, Lj7/q;->h0(Ljava/util/List;I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    check-cast v7, LL7/m0;

    .line 165
    .line 166
    invoke-direct {v0, v7, v8}, Ly8/X;->w(LL7/m0;Lf8/q$b;)LC8/B0;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move v7, v9

    .line 174
    goto :goto_1

    .line 175
    :cond_5
    invoke-static {v6}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-interface {v4}, LC8/v0;->p()LL7/h;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    if-eqz p2, :cond_8

    .line 184
    .line 185
    instance-of v7, v6, LL7/l0;

    .line 186
    .line 187
    if-eqz v7, :cond_8

    .line 188
    .line 189
    check-cast v6, LL7/l0;

    .line 190
    .line 191
    invoke-static {v6, v5}, LC8/V;->c(LL7/l0;Ljava/util/List;)LC8/d0;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    iget-object v5, v0, Ly8/X;->a:Ly8/p;

    .line 196
    .line 197
    invoke-virtual {v5}, Ly8/p;->c()Ly8/n;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Ly8/n;->v()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    sget-object v6, LM7/h;->a:LM7/h$a;

    .line 206
    .line 207
    invoke-virtual {v3}, LC8/S;->getAnnotations()LM7/h;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-static {v2, v7}, Lj7/q;->x0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v6, v2}, LM7/h$a;->a(Ljava/util/List;)LM7/h;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    iget-object v6, v0, Ly8/X;->a:Ly8/p;

    .line 220
    .line 221
    invoke-virtual {v6}, Ly8/p;->e()LL7/m;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-direct {v0, v5, v2, v4, v6}, Ly8/X;->s(Ljava/util/List;LM7/h;LC8/v0;LL7/m;)LC8/r0;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v3}, LC8/W;->b(LC8/S;)Z

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-nez v4, :cond_7

    .line 234
    .line 235
    invoke-virtual {v1}, Lf8/q;->c0()Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_6

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_6
    move v4, v10

    .line 243
    goto :goto_3

    .line 244
    :cond_7
    :goto_2
    const/4 v4, 0x1

    .line 245
    :goto_3
    invoke-virtual {v3, v4}, LC8/d0;->R0(Z)LC8/d0;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {v3, v2}, LC8/d0;->S0(LC8/r0;)LC8/d0;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    goto :goto_4

    .line 254
    :cond_8
    sget-object v2, Lh8/b;->a:Lh8/b$b;

    .line 255
    .line 256
    invoke-virtual {v1}, Lf8/q;->Y()I

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    invoke-virtual {v2, v6}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_9

    .line 269
    .line 270
    invoke-virtual {v1}, Lf8/q;->c0()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-direct {v0, v3, v4, v5, v2}, Ly8/X;->k(LC8/r0;LC8/v0;Ljava/util/List;Z)LC8/d0;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    goto :goto_4

    .line 279
    :cond_9
    invoke-virtual {v1}, Lf8/q;->c0()Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    const/16 v8, 0x10

    .line 284
    .line 285
    const/4 v9, 0x0

    .line 286
    const/4 v7, 0x0

    .line 287
    invoke-static/range {v3 .. v9}, LC8/V;->k(LC8/r0;LC8/v0;Ljava/util/List;ZLD8/g;ILjava/lang/Object;)LC8/d0;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    sget-object v2, Lh8/b;->b:Lh8/b$b;

    .line 292
    .line 293
    invoke-virtual {v1}, Lf8/q;->Y()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    invoke-virtual {v2, v3}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_b

    .line 306
    .line 307
    sget-object v11, LC8/y;->j:LC8/y$a;

    .line 308
    .line 309
    const/4 v15, 0x4

    .line 310
    const/16 v16, 0x0

    .line 311
    .line 312
    const/4 v13, 0x1

    .line 313
    const/4 v14, 0x0

    .line 314
    invoke-static/range {v11 .. v16}, LC8/y$a;->c(LC8/y$a;LC8/M0;ZZILjava/lang/Object;)LC8/y;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    if-eqz v2, :cond_a

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 322
    .line 323
    new-instance v2, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const-string v3, "null DefinitelyNotNullType for \'"

    .line 329
    .line 330
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const/16 v3, 0x27

    .line 337
    .line 338
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw v1

    .line 353
    :cond_b
    move-object v2, v12

    .line 354
    :goto_4
    iget-object v3, v0, Ly8/X;->a:Ly8/p;

    .line 355
    .line 356
    invoke-virtual {v3}, Ly8/p;->j()Lh8/g;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v1, v3}, Lh8/f;->a(Lf8/q;Lh8/g;)Lf8/q;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    if-eqz v1, :cond_d

    .line 365
    .line 366
    invoke-virtual {v0, v1, v10}, Ly8/X;->o(Lf8/q;Z)LC8/d0;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-static {v2, v1}, LC8/h0;->j(LC8/d0;LC8/d0;)LC8/d0;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    if-nez v1, :cond_c

    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_c
    return-object v1

    .line 378
    :cond_d
    :goto_5
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ly8/X;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ly8/X;->b:Ly8/X;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, ". Child of "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Ly8/X;->b:Ly8/X;

    .line 29
    .line 30
    iget-object v2, v2, Ly8/X;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method

.method public final u(Lf8/q;)LC8/S;
    .locals 6

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lf8/q;->n0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ly8/X;->a:Ly8/p;

    .line 13
    .line 14
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, Lf8/q;->Z()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-interface {v0, v1}, Lh8/c;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {p0, p1, v1, v2, v3}, Ly8/X;->q(Ly8/X;Lf8/q;ZILjava/lang/Object;)LC8/d0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p0, Ly8/X;->a:Ly8/p;

    .line 34
    .line 35
    invoke-virtual {v5}, Ly8/p;->j()Lh8/g;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {p1, v5}, Lh8/f;->f(Lf8/q;Lh8/g;)Lf8/q;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v5}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v5, v1, v2, v3}, Ly8/X;->q(Ly8/X;Lf8/q;ZILjava/lang/Object;)LC8/d0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Ly8/X;->a:Ly8/p;

    .line 51
    .line 52
    invoke-virtual {v2}, Ly8/p;->c()Ly8/n;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ly8/n;->m()Ly8/x;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v2, p1, v0, v4, v1}, Ly8/x;->a(Lf8/q;Ljava/lang/String;LC8/d0;LC8/d0;)LC8/S;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_0
    const/4 v0, 0x1

    .line 66
    invoke-virtual {p0, p1, v0}, Ly8/X;->o(Lf8/q;Z)LC8/d0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method
