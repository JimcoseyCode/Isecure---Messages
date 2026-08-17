.class public abstract LY7/U;
.super Lv8/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY7/U$a;,
        LY7/U$b;
    }
.end annotation


# static fields
.field static final synthetic m:[LC7/k;


# instance fields
.field private final b:LX7/k;

.field private final c:LY7/U;

.field private final d:LB8/i;

.field private final e:LB8/i;

.field private final f:LB8/g;

.field private final g:LB8/h;

.field private final h:LB8/g;

.field private final i:LB8/i;

.field private final j:LB8/i;

.field private final k:LB8/i;

.field private final l:LB8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LY7/U;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "functionNamesLazy"

    .line 10
    .line 11
    const-string v4, "getFunctionNamesLazy()Ljava/util/Set;"

    .line 12
    .line 13
    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v2, Lkotlin/jvm/internal/v;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "propertyNamesLazy"

    .line 27
    .line 28
    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    .line 29
    .line 30
    invoke-direct {v2, v3, v4, v5}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Lkotlin/jvm/internal/v;

    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v4, "classNamesLazy"

    .line 44
    .line 45
    const-string v5, "getClassNamesLazy()Ljava/util/Set;"

    .line 46
    .line 47
    invoke-direct {v3, v1, v4, v5}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v3}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v3, 0x3

    .line 55
    new-array v3, v3, [LC7/k;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    aput-object v0, v3, v4

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    aput-object v2, v3, v0

    .line 62
    .line 63
    const/4 v0, 0x2

    .line 64
    aput-object v1, v3, v0

    .line 65
    .line 66
    sput-object v3, LY7/U;->m:[LC7/k;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(LX7/k;LY7/U;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lv8/l;-><init>()V

    .line 3
    iput-object p1, p0, LY7/U;->b:LX7/k;

    .line 4
    iput-object p2, p0, LY7/U;->c:LY7/U;

    .line 5
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/H;

    invoke-direct {v0, p0}, LY7/H;-><init>(LY7/U;)V

    .line 6
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, LB8/n;->b(Lw7/a;Ljava/lang/Object;)LB8/i;

    move-result-object p2

    iput-object p2, p0, LY7/U;->d:LB8/i;

    .line 8
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/K;

    invoke-direct {v0, p0}, LY7/K;-><init>(LY7/U;)V

    invoke-interface {p2, v0}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p2

    iput-object p2, p0, LY7/U;->e:LB8/i;

    .line 9
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/L;

    invoke-direct {v0, p0}, LY7/L;-><init>(LY7/U;)V

    invoke-interface {p2, v0}, LB8/n;->h(Lkotlin/jvm/functions/Function1;)LB8/g;

    move-result-object p2

    iput-object p2, p0, LY7/U;->f:LB8/g;

    .line 10
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/M;

    invoke-direct {v0, p0}, LY7/M;-><init>(LY7/U;)V

    invoke-interface {p2, v0}, LB8/n;->i(Lkotlin/jvm/functions/Function1;)LB8/h;

    move-result-object p2

    iput-object p2, p0, LY7/U;->g:LB8/h;

    .line 11
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/N;

    invoke-direct {v0, p0}, LY7/N;-><init>(LY7/U;)V

    invoke-interface {p2, v0}, LB8/n;->h(Lkotlin/jvm/functions/Function1;)LB8/g;

    move-result-object p2

    iput-object p2, p0, LY7/U;->h:LB8/g;

    .line 12
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/O;

    invoke-direct {v0, p0}, LY7/O;-><init>(LY7/U;)V

    invoke-interface {p2, v0}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p2

    iput-object p2, p0, LY7/U;->i:LB8/i;

    .line 13
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/P;

    invoke-direct {v0, p0}, LY7/P;-><init>(LY7/U;)V

    invoke-interface {p2, v0}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p2

    iput-object p2, p0, LY7/U;->j:LB8/i;

    .line 14
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p2

    new-instance v0, LY7/Q;

    invoke-direct {v0, p0}, LY7/Q;-><init>(LY7/U;)V

    invoke-interface {p2, v0}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p2

    iput-object p2, p0, LY7/U;->k:LB8/i;

    .line 15
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p1

    new-instance p2, LY7/S;

    invoke-direct {p2, p0}, LY7/S;-><init>(LY7/U;)V

    invoke-interface {p1, p2}, LB8/n;->h(Lkotlin/jvm/functions/Function1;)LB8/g;

    move-result-object p1

    iput-object p1, p0, LY7/U;->l:LB8/g;

    return-void
.end method

.method public synthetic constructor <init>(LX7/k;LY7/U;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, LY7/U;-><init>(LX7/k;LY7/U;)V

    return-void
.end method

.method private final E(Lb8/n;)LO7/K;
    .locals 9

    .line 1
    invoke-interface {p1}, Lb8/s;->isFinal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v5, v0, 0x1

    .line 6
    .line 7
    iget-object v0, p0, LY7/U;->b:LX7/k;

    .line 8
    .line 9
    invoke-static {v0, p1}, LX7/h;->a(LX7/k;Lb8/d;)LM7/h;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, LY7/U;->R()LL7/m;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v3, LL7/E;->h:LL7/E;

    .line 18
    .line 19
    invoke-interface {p1}, Lb8/s;->getVisibility()LL7/x0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LU7/V;->d(LL7/x0;)LL7/u;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {p1}, Lb8/t;->getName()Lk8/f;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v0, p0, LY7/U;->b:LX7/k;

    .line 32
    .line 33
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, LX7/d;->t()La8/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0, p1}, La8/b;->a(Lb8/l;)La8/a;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-direct {p0, p1}, LY7/U;->U(Lb8/n;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-static/range {v1 .. v8}, LW7/f;->c1(LL7/m;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/h0;Z)LW7/f;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "create(...)"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p1
.end method

.method private static final F(LY7/U;Lk8/f;)LL7/Z;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY7/U;->c:LY7/U;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, v0, LY7/U;->g:LB8/h;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, LL7/Z;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, p0, LY7/U;->e:LB8/i;

    .line 20
    .line 21
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LY7/c;

    .line 26
    .line 27
    invoke-interface {v0, p1}, LY7/c;->c(Lk8/f;)Lb8/n;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Lb8/n;->C()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-direct {p0, p1}, LY7/U;->a0(Lb8/n;)LL7/Z;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method private static final G(LY7/U;Lk8/f;)Ljava/util/Collection;
    .locals 5

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY7/U;->c:LY7/U;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, v0, LY7/U;->f:LB8/g;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/Collection;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LY7/U;->e:LB8/i;

    .line 25
    .line 26
    invoke-interface {v1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LY7/c;

    .line 31
    .line 32
    invoke-interface {v1, p1}, LY7/c;->f(Lk8/f;)Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lb8/r;

    .line 51
    .line 52
    invoke-virtual {p0, v2}, LY7/U;->Z(Lb8/r;)LW7/e;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p0, v3}, LY7/U;->V(LW7/e;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    iget-object v4, p0, LY7/U;->b:LX7/k;

    .line 63
    .line 64
    invoke-virtual {v4}, LX7/k;->a()LX7/d;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, LX7/d;->h()LV7/j;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {v4, v2, v3}, LV7/j;->a(Lb8/q;LL7/g0;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p0, v0, p1}, LY7/U;->y(Ljava/util/Collection;Lk8/f;)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method private static final H(LY7/U;)LY7/c;
    .locals 0

    .line 1
    invoke-virtual {p0}, LY7/U;->z()LY7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final I(LY7/U;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lv8/d;->v:Lv8/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LY7/U;->x(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private static final J(LY7/U;Lk8/f;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    iget-object v1, p0, LY7/U;->f:LB8/g;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LY7/U;->e0(Ljava/util/Set;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, LY7/U;->B(Ljava/util/Collection;Lk8/f;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LY7/U;->b:LX7/k;

    .line 26
    .line 27
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LX7/d;->r()Lc8/e0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p0, p0, LY7/U;->b:LX7/k;

    .line 36
    .line 37
    invoke-virtual {p1, p0, v0}, Lc8/e0;->p(LX7/k;Ljava/util/Collection;)Ljava/util/Collection;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method private final M()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, LY7/U;->k:LB8/i;

    .line 2
    .line 3
    sget-object v1, LY7/U;->m:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, LB8/m;->a(LB8/i;Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
.end method

.method private final P()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, LY7/U;->i:LB8/i;

    .line 2
    .line 3
    sget-object v1, LY7/U;->m:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, LB8/m;->a(LB8/i;Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
.end method

.method private final S()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, LY7/U;->j:LB8/i;

    .line 2
    .line 3
    sget-object v1, LY7/U;->m:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, LB8/m;->a(LB8/i;Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
.end method

.method private final T(Lb8/n;)LC8/S;
    .locals 8

    .line 1
    iget-object v0, p0, LY7/U;->b:LX7/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/k;->g()LZ7/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1}, Lb8/n;->getType()Lb8/x;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, LC8/I0;->h:LC8/I0;

    .line 12
    .line 13
    const/4 v6, 0x7

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static/range {v2 .. v7}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v1, v2}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, LI7/i;->s0(LC8/S;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-static {v0}, LI7/i;->v0(LC8/S;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-direct {p0, p1}, LY7/U;->U(Lb8/n;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, Lb8/n;->K()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-static {v0}, LC8/J0;->n(LC8/S;)LC8/S;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v0, "makeNotNullable(...)"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_1
    return-object v0
.end method

.method private final U(Lb8/n;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Lb8/s;->isFinal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lb8/s;->M()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method private static final W(LY7/U;Lk8/f;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LY7/U;->g:LB8/h;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, LM8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, LY7/U;->C(Lk8/f;Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LY7/U;->R()LL7/m;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lo8/i;->t(LL7/m;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    iget-object p1, p0, LY7/U;->b:LX7/k;

    .line 39
    .line 40
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, LX7/d;->r()Lc8/e0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p0, p0, LY7/U;->b:LX7/k;

    .line 49
    .line 50
    invoke-virtual {p1, p0, v0}, Lc8/e0;->p(LX7/k;Ljava/util/Collection;)Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method private static final X(LY7/U;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lv8/d;->w:Lv8/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LY7/U;->D(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private final a0(Lb8/n;)LL7/Z;
    .locals 9

    .line 1
    new-instance v0, Lkotlin/jvm/internal/C;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/C;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LY7/U;->E(Lb8/n;)LO7/K;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v1, v2, v2, v2, v2}, LO7/K;->S0(LO7/L;LL7/b0;LL7/w;LL7/w;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LY7/U;->T(Lb8/n;)LC8/S;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget-object v1, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v3, v1

    .line 23
    check-cast v3, LO7/K;

    .line 24
    .line 25
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {p0}, LY7/U;->O()LL7/c0;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual/range {v3 .. v8}, LO7/K;->Y0(LC8/S;Ljava/util/List;LL7/c0;LL7/c0;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LY7/U;->R()LL7/m;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    instance-of v3, v1, LL7/e;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    move-object v2, v1

    .line 50
    check-cast v2, LL7/e;

    .line 51
    .line 52
    :cond_0
    if-eqz v2, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, LY7/U;->b:LX7/k;

    .line 55
    .line 56
    invoke-virtual {v1}, LX7/k;->a()LX7/d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, LX7/d;->w()Lt8/f;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v3, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, LO7/K;

    .line 67
    .line 68
    iget-object v4, p0, LY7/U;->b:LX7/k;

    .line 69
    .line 70
    invoke-interface {v1, v2, v3, v4}, Lt8/f;->a(LL7/e;LO7/K;LX7/k;)LO7/K;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_1
    iget-object v1, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v2, v1

    .line 79
    check-cast v2, LL7/u0;

    .line 80
    .line 81
    check-cast v1, LO7/K;

    .line 82
    .line 83
    invoke-virtual {v1}, LO7/X;->getType()LC8/S;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v2, v1}, Lo8/i;->K(LL7/u0;LC8/S;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    iget-object v1, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, LO7/K;

    .line 96
    .line 97
    new-instance v2, LY7/I;

    .line 98
    .line 99
    invoke-direct {v2, p0, p1, v0}, LY7/I;-><init>(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, LO7/Y;->I0(Lw7/a;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    iget-object v1, p0, LY7/U;->b:LX7/k;

    .line 106
    .line 107
    invoke-virtual {v1}, LX7/k;->a()LX7/d;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, LX7/d;->h()LV7/j;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v2, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, LL7/Z;

    .line 118
    .line 119
    invoke-interface {v1, p1, v2}, LV7/j;->b(Lb8/n;LL7/Z;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, LL7/Z;

    .line 125
    .line 126
    return-object p1
.end method

.method private static final b0(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)LB8/j;
    .locals 2

    .line 1
    iget-object v0, p0, LY7/U;->b:LX7/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/k;->e()LB8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LY7/J;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, LY7/J;-><init>(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, LB8/n;->g(Lw7/a;)LB8/j;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final c0(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)Lq8/g;
    .locals 0

    .line 1
    iget-object p0, p0, LY7/U;->b:LX7/k;

    .line 2
    .line 3
    invoke-virtual {p0}, LX7/k;->a()LX7/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LX7/d;->g()LV7/i;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p2, p2, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, LL7/Z;

    .line 14
    .line 15
    invoke-interface {p0, p1, p2}, LV7/i;->a(Lb8/n;LL7/Z;)Lq8/g;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private final e0(Ljava/util/Set;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, LL7/g0;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-static {v3, v6, v6, v4, v5}, Ld8/C;->c(LL7/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    new-instance v4, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v3, 0x1

    .line 75
    if-eq v2, v3, :cond_2

    .line 76
    .line 77
    sget-object v2, LY7/T;->g:LY7/T;

    .line 78
    .line 79
    invoke-static {v1, v2}, Lo8/r;->b(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {p1, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    return-void
.end method

.method private static final f0(LL7/g0;)LL7/a;
    .locals 1

    .line 1
    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method static synthetic h(LY7/U;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/U;->t(LY7/U;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i(LY7/U;)LY7/c;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/U;->H(LY7/U;)LY7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)LB8/j;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY7/U;->b0(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)LB8/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)Lq8/g;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY7/U;->c0(LY7/U;Lb8/n;Lkotlin/jvm/internal/C;)Lq8/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic l(LY7/U;Lk8/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY7/U;->G(LY7/U;Lk8/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic m(LY7/U;Lk8/f;)LL7/Z;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY7/U;->F(LY7/U;Lk8/f;)LL7/Z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic n(LY7/U;Lk8/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY7/U;->J(LY7/U;Lk8/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic o(LY7/U;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/U;->I(LY7/U;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic p(LY7/U;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/U;->X(LY7/U;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic q(LY7/U;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/U;->u(LY7/U;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic r(LY7/U;Lk8/f;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY7/U;->W(LY7/U;Lk8/f;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic s(LL7/g0;)LL7/a;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/U;->f0(LL7/g0;)LL7/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final t(LY7/U;)Ljava/util/Collection;
    .locals 2

    .line 1
    sget-object v0, Lv8/d;->o:Lv8/d;

    .line 2
    .line 3
    sget-object v1, Lv8/k;->a:Lv8/k$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lv8/k$a;->c()Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v0, v1}, LY7/U;->w(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static final u(LY7/U;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lv8/d;->t:Lv8/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LY7/U;->v(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method


# virtual methods
.method protected final A(Lb8/r;LX7/k;)LC8/S;
    .locals 7

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "c"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lb8/q;->L()Lb8/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lb8/g;->o()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v1, LC8/I0;->h:LC8/I0;

    .line 20
    .line 21
    const/4 v5, 0x6

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, LX7/k;->g()LZ7/e;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p1}, Lb8/r;->getReturnType()Lb8/x;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p2, p1, v0}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method protected abstract B(Ljava/util/Collection;Lk8/f;)V
.end method

.method protected abstract C(Lk8/f;Ljava/util/Collection;)V
.end method

.method protected abstract D(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end method

.method protected final K()LB8/i;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/U;->d:LB8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final L()LX7/k;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/U;->b:LX7/k;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final N()LB8/i;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/U;->e:LB8/i;

    .line 2
    .line 3
    return-object v0
.end method

.method protected abstract O()LL7/c0;
.end method

.method protected final Q()LY7/U;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/U;->c:LY7/U;

    .line 2
    .line 3
    return-object v0
.end method

.method protected abstract R()LL7/m;
.end method

.method protected V(LW7/e;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method protected abstract Y(Lb8/r;Ljava/util/List;LC8/S;Ljava/util/List;)LY7/U$a;
.end method

.method protected final Z(Lb8/r;)LW7/e;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    const-string v1, "method"

    .line 6
    .line 7
    invoke-static {v3, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LY7/U;->b:LX7/k;

    .line 11
    .line 12
    invoke-static {v1, v3}, LX7/h;->a(LX7/k;Lb8/d;)LM7/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, LY7/U;->R()LL7/m;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v3}, Lb8/t;->getName()Lk8/f;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v5, v0, LY7/U;->b:LX7/k;

    .line 25
    .line 26
    invoke-virtual {v5}, LX7/k;->a()LX7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5}, LX7/d;->t()La8/b;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v5, v3}, La8/b;->a(Lb8/l;)La8/a;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, v0, LY7/U;->e:LB8/i;

    .line 39
    .line 40
    invoke-interface {v6}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, LY7/c;

    .line 45
    .line 46
    invoke-interface {v3}, Lb8/t;->getName()Lk8/f;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-interface {v6, v7}, LY7/c;->a(Lk8/f;)Lb8/w;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x1

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    invoke-interface {v3}, Lb8/r;->i()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_0

    .line 67
    .line 68
    move v6, v8

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v6, v7

    .line 71
    :goto_0
    invoke-static {v2, v1, v4, v5, v6}, LW7/e;->m1(LL7/m;LM7/h;Lk8/f;LL7/h0;Z)LW7/e;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v1, "createJavaMethod(...)"

    .line 76
    .line 77
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, LY7/U;->b:LX7/k;

    .line 81
    .line 82
    const/4 v5, 0x4

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-static/range {v1 .. v6}, LX7/c;->i(LX7/k;LL7/m;Lb8/z;IILjava/lang/Object;)LX7/k;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v3}, Lb8/z;->getTypeParameters()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    new-instance v5, Ljava/util/ArrayList;

    .line 94
    .line 95
    const/16 v6, 0xa

    .line 96
    .line 97
    invoke-static {v4, v6}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_1

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    check-cast v6, Lb8/y;

    .line 119
    .line 120
    invoke-virtual {v1}, LX7/k;->f()LX7/p;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-interface {v9, v6}, LX7/p;->a(Lb8/y;)LL7/m0;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    invoke-interface {v3}, Lb8/r;->i()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v0, v1, v2, v4}, LY7/U;->d0(LX7/k;LL7/z;Ljava/util/List;)LY7/U$b;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v0, v3, v1}, LY7/U;->A(Lb8/r;LX7/k;)LC8/S;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-virtual {v4}, LY7/U$b;->a()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v0, v3, v5, v6, v9}, LY7/U;->Y(Lb8/r;Ljava/util/List;LC8/S;Ljava/util/List;)LY7/U$a;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v5}, LY7/U$a;->c()LC8/S;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    if-eqz v6, :cond_2

    .line 160
    .line 161
    sget-object v9, LM7/h;->a:LM7/h$a;

    .line 162
    .line 163
    invoke-virtual {v9}, LM7/h$a;->b()LM7/h;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v2, v6, v9}, Lo8/h;->i(LL7/a;LC8/S;LM7/h;)LL7/c0;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    :goto_2
    move-object v10, v6

    .line 172
    goto :goto_3

    .line 173
    :cond_2
    const/4 v6, 0x0

    .line 174
    goto :goto_2

    .line 175
    :goto_3
    invoke-virtual {v0}, LY7/U;->O()LL7/c0;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-virtual {v5}, LY7/U$a;->e()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    invoke-virtual {v5}, LY7/U$a;->f()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    invoke-virtual {v5}, LY7/U$a;->d()LC8/S;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    sget-object v6, LL7/E;->g:LL7/E$a;

    .line 196
    .line 197
    invoke-interface {v3}, Lb8/s;->isAbstract()Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    invoke-interface {v3}, Lb8/s;->isFinal()Z

    .line 202
    .line 203
    .line 204
    move-result v16

    .line 205
    xor-int/lit8 v8, v16, 0x1

    .line 206
    .line 207
    invoke-virtual {v6, v7, v9, v8}, LL7/E$a;->a(ZZZ)LL7/E;

    .line 208
    .line 209
    .line 210
    move-result-object v16

    .line 211
    invoke-interface {v3}, Lb8/s;->getVisibility()LL7/x0;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-static {v3}, LU7/V;->d(LL7/x0;)LL7/u;

    .line 216
    .line 217
    .line 218
    move-result-object v17

    .line 219
    invoke-virtual {v5}, LY7/U$a;->c()LC8/S;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    if-eqz v3, :cond_3

    .line 224
    .line 225
    sget-object v3, LW7/e;->M:LL7/a$a;

    .line 226
    .line 227
    invoke-virtual {v4}, LY7/U$b;->a()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v6}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-static {v3, v6}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v3}, Lj7/K;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :goto_4
    move-object v9, v2

    .line 244
    move-object/from16 v18, v3

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_3
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    goto :goto_4

    .line 252
    :goto_5
    invoke-virtual/range {v9 .. v18}, LW7/e;->l1(LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;Ljava/util/Map;)LO7/O;

    .line 253
    .line 254
    .line 255
    move-object v2, v9

    .line 256
    invoke-virtual {v5}, LY7/U$a;->b()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    invoke-virtual {v4}, LY7/U$b;->b()Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    invoke-virtual {v2, v3, v4}, LW7/e;->p1(ZZ)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5}, LY7/U$a;->a()Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-nez v3, :cond_4

    .line 276
    .line 277
    invoke-virtual {v1}, LX7/k;->a()LX7/d;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1}, LX7/d;->s()LV7/o;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v5}, LY7/U$a;->a()Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v1, v2, v3}, LV7/o;->b(LL7/b;Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    :cond_4
    return-object v2
.end method

.method public a()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-direct {p0}, LY7/U;->P()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b(Lk8/f;LT7/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LY7/U;->a()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object p2, p0, LY7/U;->h:LB8/g;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/Collection;

    .line 33
    .line 34
    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-direct {p0}, LY7/U;->S()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d(Lk8/f;LT7/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LY7/U;->c()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object p2, p0, LY7/U;->l:LB8/g;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/Collection;

    .line 33
    .line 34
    return-object p1
.end method

.method protected final d0(LX7/k;LL7/z;Ljava/util/List;)LY7/U$b;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "c"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "function"

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-static {v3, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "jValueParameters"

    .line 16
    .line 17
    move-object/from16 v14, p3

    .line 18
    .line 19
    invoke-static {v14, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v14}, Lj7/q;->V0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v15, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lj7/G;

    .line 53
    .line 54
    invoke-virtual {v4}, Lj7/G;->a()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-virtual {v4}, Lj7/G;->b()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lb8/B;

    .line 63
    .line 64
    invoke-static {v0, v4}, LX7/h;->a(LX7/k;Lb8/d;)LM7/h;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v7, LC8/I0;->h:LC8/I0;

    .line 69
    .line 70
    const/4 v11, 0x7

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    invoke-static/range {v7 .. v12}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-interface {v4}, Lb8/B;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v10, 0x1

    .line 85
    if-eqz v8, :cond_2

    .line 86
    .line 87
    invoke-interface {v4}, Lb8/B;->getType()Lb8/x;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    instance-of v11, v8, Lb8/f;

    .line 92
    .line 93
    if-eqz v11, :cond_0

    .line 94
    .line 95
    move-object v9, v8

    .line 96
    check-cast v9, Lb8/f;

    .line 97
    .line 98
    :cond_0
    if-eqz v9, :cond_1

    .line 99
    .line 100
    invoke-virtual {v0}, LX7/k;->g()LZ7/e;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v8, v9, v7, v10}, LZ7/e;->l(Lb8/f;LZ7/a;Z)LC8/S;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v0}, LX7/k;->d()LL7/H;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-interface {v8}, LL7/H;->n()LI7/i;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v8, v7}, LI7/i;->k(LC8/S;)LC8/S;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-static {v7, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    goto :goto_1

    .line 125
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 126
    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v2, "Vararg parameter should be an array: "

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_2
    invoke-virtual {v0}, LX7/k;->g()LZ7/e;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-interface {v4}, Lb8/B;->getType()Lb8/x;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v8, v11, v7}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v7, v9}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    :goto_1
    invoke-virtual {v7}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    check-cast v8, LC8/S;

    .line 169
    .line 170
    invoke-virtual {v7}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    move-object v12, v7

    .line 175
    check-cast v12, LC8/S;

    .line 176
    .line 177
    invoke-interface {v3}, LL7/J;->getName()Lk8/f;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v7}, Lk8/f;->j()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    const-string v9, "equals"

    .line 186
    .line 187
    invoke-static {v7, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_4

    .line 192
    .line 193
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-ne v7, v10, :cond_4

    .line 198
    .line 199
    invoke-virtual {v0}, LX7/k;->d()LL7/H;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-interface {v7}, LL7/H;->n()LI7/i;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v7}, LI7/i;->I()LC8/d0;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_4

    .line 216
    .line 217
    const-string v7, "other"

    .line 218
    .line 219
    invoke-static {v7}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    :cond_3
    :goto_2
    move/from16 v16, v2

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    invoke-interface {v4}, Lb8/B;->getName()Lk8/f;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    if-nez v7, :cond_5

    .line 231
    .line 232
    move v2, v10

    .line 233
    :cond_5
    if-nez v7, :cond_3

    .line 234
    .line 235
    new-instance v7, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const/16 v9, 0x70

    .line 241
    .line 242
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-static {v7}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    const-string v9, "identifier(...)"

    .line 257
    .line 258
    invoke-static {v7, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :goto_3
    invoke-static {v7}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    new-instance v2, LO7/V;

    .line 266
    .line 267
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    invoke-virtual {v9}, LX7/d;->t()La8/b;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-interface {v9, v4}, La8/b;->a(Lb8/l;)La8/a;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    const/4 v4, 0x0

    .line 280
    const/4 v9, 0x0

    .line 281
    const/4 v10, 0x0

    .line 282
    const/4 v11, 0x0

    .line 283
    invoke-direct/range {v2 .. v13}, LO7/V;-><init>(LL7/a;LL7/t0;ILM7/h;Lk8/f;LC8/S;ZZZLC8/S;LL7/h0;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v15, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-object/from16 v3, p2

    .line 290
    .line 291
    move/from16 v2, v16

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_6
    invoke-static {v15}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    new-instance v1, LY7/U$b;

    .line 300
    .line 301
    invoke-direct {v1, v0, v2}, LY7/U$b;-><init>(Ljava/util/List;Z)V

    .line 302
    .line 303
    .line 304
    return-object v1
.end method

.method public e()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-direct {p0}, LY7/U;->M()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LY7/U;->d:LB8/i;

    .line 12
    .line 13
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/Collection;

    .line 18
    .line 19
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Lazy scope for "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LY7/U;->R()LL7/m;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method protected abstract v(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end method

.method protected final w(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LT7/d;->s:LT7/d;

    .line 12
    .line 13
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lv8/d;->c:Lv8/d$a;

    .line 19
    .line 20
    invoke-virtual {v2}, Lv8/d$a;->c()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1, v2}, Lv8/d;->a(I)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, LY7/U;->v(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lk8/f;

    .line 49
    .line 50
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0, v3, v0}, Lv8/l;->f(Lk8/f;LT7/b;)LL7/h;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v1, v3}, LM8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object v2, Lv8/d;->c:Lv8/d$a;

    .line 71
    .line 72
    invoke-virtual {v2}, Lv8/d$a;->d()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p1, v2}, Lv8/d;->a(I)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {p1}, Lv8/d;->l()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, Lv8/c$a;->a:Lv8/c$a;

    .line 87
    .line 88
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0, p1, p2}, LY7/U;->x(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Lk8/f;

    .line 113
    .line 114
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    invoke-virtual {p0, v3, v0}, LY7/U;->b(Lk8/f;LT7/b;)Ljava/util/Collection;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    sget-object v2, Lv8/d;->c:Lv8/d$a;

    .line 135
    .line 136
    invoke-virtual {v2}, Lv8/d$a;->i()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {p1, v2}, Lv8/d;->a(I)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    invoke-virtual {p1}, Lv8/d;->l()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    sget-object v3, Lv8/c$a;->a:Lv8/c$a;

    .line 151
    .line 152
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_5

    .line 157
    .line 158
    invoke-virtual {p0, p1, p2}, LY7/U;->D(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_5

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Lk8/f;

    .line 177
    .line 178
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_4

    .line 189
    .line 190
    invoke-virtual {p0, v2, v0}, LY7/U;->d(Lk8/f;LT7/b;)Ljava/util/Collection;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    invoke-static {v1}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1
.end method

.method protected abstract x(Lv8/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end method

.method protected y(Ljava/util/Collection;Lk8/f;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "name"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected abstract z()LY7/c;
.end method
