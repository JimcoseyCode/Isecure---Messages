.class public abstract LC8/p;
.super LC8/v;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC8/p$a;,
        LC8/p$b;
    }
.end annotation


# instance fields
.field private final b:LB8/i;

.field private final c:Z


# direct methods
.method public constructor <init>(LB8/n;)V
    .locals 3

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LC8/v;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LC8/h;

    .line 10
    .line 11
    invoke-direct {v0, p0}, LC8/h;-><init>(LC8/p;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, LC8/i;->g:LC8/i;

    .line 15
    .line 16
    new-instance v2, LC8/j;

    .line 17
    .line 18
    invoke-direct {v2, p0}, LC8/j;-><init>(LC8/p;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1, v2}, LB8/n;->d(Lw7/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LB8/i;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, LC8/p;->b:LB8/i;

    .line 26
    .line 27
    return-void
.end method

.method private static final A(Z)LC8/p$b;
    .locals 1

    .line 1
    new-instance p0, LC8/p$b;

    .line 2
    .line 3
    sget-object v0, LE8/l;->a:LE8/l;

    .line 4
    .line 5
    invoke-virtual {v0}, LE8/l;->l()LC8/S;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, LC8/p$b;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method private static final B(LC8/p;LC8/p$b;)Li7/B;
    .locals 5

    .line 1
    const-string v0, "supertypes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LC8/p;->u()LL7/k0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, LC8/p$b;->a()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, LC8/k;

    .line 15
    .line 16
    invoke-direct {v2, p0}, LC8/k;-><init>(LC8/p;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, LC8/l;

    .line 20
    .line 21
    invoke-direct {v3, p0}, LC8/l;-><init>(LC8/p;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p0, v1, v2, v3}, LL7/k0;->a(LC8/v0;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, LC8/p;->r()LC8/S;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-static {v0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v0, v2

    .line 47
    :goto_0
    if-nez v0, :cond_1

    .line 48
    .line 49
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_1
    invoke-virtual {p0}, LC8/p;->t()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, LC8/p;->u()LL7/k0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v3, LC8/m;

    .line 64
    .line 65
    invoke-direct {v3, p0}, LC8/m;-><init>(LC8/p;)V

    .line 66
    .line 67
    .line 68
    new-instance v4, LC8/n;

    .line 69
    .line 70
    invoke-direct {v4, p0}, LC8/n;-><init>(LC8/p;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, p0, v0, v3, v4}, LL7/k0;->a(LC8/v0;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 74
    .line 75
    .line 76
    :cond_2
    instance-of v1, v0, Ljava/util/List;

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    move-object v2, v0

    .line 81
    check-cast v2, Ljava/util/List;

    .line 82
    .line 83
    :cond_3
    if-nez v2, :cond_4

    .line 84
    .line 85
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :cond_4
    invoke-virtual {p0, v2}, LC8/p;->w(Ljava/util/List;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p1, p0}, LC8/p$b;->c(Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Li7/B;->a:Li7/B;

    .line 97
    .line 98
    return-object p0
.end method

.method private static final C(LC8/p;LC8/v0;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, LC8/p;->l(LC8/v0;Z)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final D(LC8/p;LC8/S;)Li7/B;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LC8/p;->y(LC8/S;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Li7/B;->a:Li7/B;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final E(LC8/p;LC8/v0;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, p1, v0}, LC8/p;->l(LC8/v0;Z)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final F(LC8/p;LC8/S;)Li7/B;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LC8/p;->x(LC8/S;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Li7/B;->a:Li7/B;

    .line 10
    .line 11
    return-object p0
.end method

.method static synthetic d(LC8/p;)LC8/p$b;
    .locals 0

    .line 1
    invoke-static {p0}, LC8/p;->z(LC8/p;)LC8/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(Z)LC8/p$b;
    .locals 0

    .line 1
    invoke-static {p0}, LC8/p;->A(Z)LC8/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic f(LC8/p;LC8/p$b;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LC8/p;->B(LC8/p;LC8/p$b;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic h(LC8/p;LC8/v0;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LC8/p;->C(LC8/p;LC8/v0;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i(LC8/p;LC8/S;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LC8/p;->D(LC8/p;LC8/S;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j(LC8/p;LC8/v0;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LC8/p;->E(LC8/p;LC8/v0;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k(LC8/p;LC8/S;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LC8/p;->F(LC8/p;LC8/S;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final l(LC8/v0;Z)Ljava/util/Collection;
    .locals 2

    .line 1
    instance-of v0, p1, LC8/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LC8/p;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, LC8/p;->b:LB8/i;

    .line 13
    .line 14
    invoke-interface {v1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, LC8/p$b;

    .line 19
    .line 20
    invoke-virtual {v1}, LC8/p$b;->a()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, p2}, LC8/p;->s(Z)Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {v1, p2}, Lj7/q;->z0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_1
    invoke-interface {p1}, LC8/v0;->g()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "getSupertypes(...)"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method private static final z(LC8/p;)LC8/p$b;
    .locals 1

    .line 1
    new-instance v0, LC8/p$b;

    .line 2
    .line 3
    invoke-virtual {p0}, LC8/p;->m()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, LC8/p$b;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public bridge synthetic g()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/p;->v()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected abstract m()Ljava/util/Collection;
.end method

.method public o(LD8/g;)LC8/v0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/p$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, LC8/p$a;-><init>(LC8/p;LD8/g;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method protected abstract r()LC8/S;
.end method

.method protected s(Z)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LC8/p;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method protected abstract u()LL7/k0;
.end method

.method public v()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/p;->b:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC8/p$b;

    .line 8
    .line 9
    invoke-virtual {v0}, LC8/p$b;->b()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method protected w(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "supertypes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method protected x(LC8/S;)V
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

.method protected y(LC8/S;)V
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
