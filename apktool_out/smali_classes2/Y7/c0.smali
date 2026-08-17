.class public final LY7/c0;
.super LO7/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final q:LX7/k;

.field private final r:Lb8/y;


# direct methods
.method public constructor <init>(LX7/k;Lb8/y;ILL7/m;)V
    .locals 11

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "javaTypeParameter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "containingDeclaration"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, LX7/g;

    .line 21
    .line 22
    const/4 v7, 0x4

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    move-object v4, p1

    .line 26
    move-object v5, p2

    .line 27
    invoke-direct/range {v3 .. v8}, LX7/g;-><init>(LX7/k;Lb8/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p2}, Lb8/t;->getName()Lk8/f;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    sget-object v6, LC8/N0;->k:LC8/N0;

    .line 35
    .line 36
    sget-object v9, LL7/h0;->a:LL7/h0;

    .line 37
    .line 38
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, LX7/d;->v()LL7/k0;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    const/4 v7, 0x0

    .line 47
    move-object v1, p0

    .line 48
    move v8, p3

    .line 49
    move-object v4, v3

    .line 50
    move-object v3, p4

    .line 51
    invoke-direct/range {v1 .. v10}, LO7/b;-><init>(LB8/n;LL7/m;LM7/h;Lk8/f;LC8/N0;ZILL7/h0;LL7/k0;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v1, LY7/c0;->q:LX7/k;

    .line 55
    .line 56
    iput-object p2, v1, LY7/c0;->r:Lb8/y;

    .line 57
    .line 58
    return-void
.end method

.method private final J0()Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p0, LY7/c0;->r:Lb8/y;

    .line 2
    .line 3
    invoke-interface {v0}, Lb8/y;->getUpperBounds()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LY7/c0;->q:LX7/k;

    .line 14
    .line 15
    invoke-virtual {v0}, LX7/k;->d()LL7/H;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, LL7/H;->n()LI7/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, LI7/i;->i()LC8/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "getAnyType(...)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LY7/c0;->q:LX7/k;

    .line 33
    .line 34
    invoke-virtual {v1}, LX7/k;->d()LL7/H;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, LL7/H;->n()LI7/i;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, LI7/i;->I()LC8/d0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "getNullableAnyType(...)"

    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, LC8/V;->e(LC8/d0;LC8/d0;)LC8/M0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 61
    .line 62
    const/16 v2, 0xa

    .line 63
    .line 64
    invoke-static {v0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lb8/j;

    .line 86
    .line 87
    iget-object v3, p0, LY7/c0;->q:LX7/k;

    .line 88
    .line 89
    invoke-virtual {v3}, LX7/k;->g()LZ7/e;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    sget-object v4, LC8/I0;->h:LC8/I0;

    .line 94
    .line 95
    const/4 v8, 0x3

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v5, 0x0

    .line 98
    const/4 v6, 0x0

    .line 99
    move-object v7, p0

    .line 100
    invoke-static/range {v4 .. v9}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v3, v2, v4}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    return-object v1
.end method


# virtual methods
.method protected C0(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "bounds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY7/c0;->q:LX7/k;

    .line 7
    .line 8
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LX7/d;->r()Lc8/e0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LY7/c0;->q:LX7/k;

    .line 17
    .line 18
    invoke-virtual {v0, p0, p1, v1}, Lc8/e0;->r(LL7/m0;Ljava/util/List;LX7/k;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method protected H0(LC8/S;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected I0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-direct {p0}, LY7/c0;->J0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
