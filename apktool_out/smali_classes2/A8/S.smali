.class public final LA8/S;
.super LO7/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final q:Ly8/p;

.field private final r:Lf8/s;

.field private final s:LA8/a;


# direct methods
.method public constructor <init>(Ly8/p;Lf8/s;I)V
    .locals 11

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, Ly8/p;->e()LL7/m;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 20
    .line 21
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {p1}, Ly8/p;->g()Lh8/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, Lf8/s;->M()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    sget-object v0, Ly8/O;->a:Ly8/O;

    .line 38
    .line 39
    invoke-virtual {p2}, Lf8/s;->S()Lf8/s$c;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v6, "getVariance(...)"

    .line 44
    .line 45
    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ly8/O;->d(Lf8/s$c;)LC8/N0;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {p2}, Lf8/s;->N()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    sget-object v9, LL7/h0;->a:LL7/h0;

    .line 57
    .line 58
    sget-object v10, LL7/k0$a;->a:LL7/k0$a;

    .line 59
    .line 60
    move-object v1, p0

    .line 61
    move v8, p3

    .line 62
    invoke-direct/range {v1 .. v10}, LO7/b;-><init>(LB8/n;LL7/m;LM7/h;Lk8/f;LC8/N0;ZILL7/h0;LL7/k0;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, v1, LA8/S;->q:Ly8/p;

    .line 66
    .line 67
    iput-object p2, v1, LA8/S;->r:Lf8/s;

    .line 68
    .line 69
    new-instance p2, LA8/a;

    .line 70
    .line 71
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p3, LA8/Q;

    .line 76
    .line 77
    invoke-direct {p3, p0}, LA8/Q;-><init>(LA8/S;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p2, p1, p3}, LA8/a;-><init>(LB8/n;Lw7/a;)V

    .line 81
    .line 82
    .line 83
    iput-object p2, v1, LA8/S;->s:LA8/a;

    .line 84
    .line 85
    return-void
.end method

.method static synthetic J0(LA8/S;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/S;->K0(LA8/S;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final K0(LA8/S;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LA8/S;->q:Ly8/p;

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
    iget-object v1, p0, LA8/S;->r:Lf8/s;

    .line 12
    .line 13
    iget-object p0, p0, LA8/S;->q:Ly8/p;

    .line 14
    .line 15
    invoke-virtual {p0}, Ly8/p;->g()Lh8/c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {v0, v1, p0}, Ly8/h;->f(Lf8/s;Lh8/c;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method


# virtual methods
.method public bridge synthetic H0(LC8/S;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LA8/S;->M0(LC8/S;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected I0()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, LA8/S;->r:Lf8/s;

    .line 2
    .line 3
    iget-object v1, p0, LA8/S;->q:Ly8/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Ly8/p;->j()Lh8/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lh8/f;->s(Lf8/s;Lh8/g;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Ls8/e;->m(LL7/m;)LI7/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, LI7/i;->y()LC8/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    iget-object v1, p0, LA8/S;->q:Ly8/p;

    .line 33
    .line 34
    invoke-virtual {v1}, Ly8/p;->i()Ly8/X;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v3, 0xa

    .line 41
    .line 42
    invoke-static {v0, v3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Lf8/q;

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    return-object v2
.end method

.method public L0()LA8/a;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/S;->s:LA8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method protected M0(LC8/S;)Ljava/lang/Void;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "There should be no cycles for deserialized type parameters, but found for: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public bridge synthetic getAnnotations()LM7/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/S;->L0()LA8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
