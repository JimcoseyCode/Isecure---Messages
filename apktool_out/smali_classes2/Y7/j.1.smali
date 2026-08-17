.class public final LY7/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW7/g;


# static fields
.field static final synthetic i:[LC7/k;


# instance fields
.field private final a:LX7/k;

.field private final b:Lb8/a;

.field private final c:LB8/j;

.field private final d:LB8/i;

.field private final e:La8/a;

.field private final f:LB8/i;

.field private final g:Z

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LY7/j;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "fqName"

    .line 10
    .line 11
    const-string v4, "getFqName()Lorg/jetbrains/kotlin/name/FqName;"

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
    const-string v4, "type"

    .line 27
    .line 28
    const-string v5, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

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
    const-string v4, "allValueArguments"

    .line 44
    .line 45
    const-string v5, "getAllValueArguments()Ljava/util/Map;"

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
    sput-object v3, LY7/j;->i:[LC7/k;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(LX7/k;Lb8/a;Z)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaAnnotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LY7/j;->a:LX7/k;

    .line 3
    iput-object p2, p0, LY7/j;->b:Lb8/a;

    .line 4
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object v0

    new-instance v1, LY7/g;

    invoke-direct {v1, p0}, LY7/g;-><init>(LY7/j;)V

    invoke-interface {v0, v1}, LB8/n;->g(Lw7/a;)LB8/j;

    move-result-object v0

    iput-object v0, p0, LY7/j;->c:LB8/j;

    .line 5
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object v0

    new-instance v1, LY7/h;

    invoke-direct {v1, p0}, LY7/h;-><init>(LY7/j;)V

    invoke-interface {v0, v1}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object v0

    iput-object v0, p0, LY7/j;->d:LB8/i;

    .line 6
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    move-result-object v0

    invoke-virtual {v0}, LX7/d;->t()La8/b;

    move-result-object v0

    invoke-interface {v0, p2}, La8/b;->a(Lb8/l;)La8/a;

    move-result-object v0

    iput-object v0, p0, LY7/j;->e:La8/a;

    .line 7
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object p1

    new-instance v0, LY7/i;

    invoke-direct {v0, p0}, LY7/i;-><init>(LY7/j;)V

    invoke-interface {p1, v0}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p1

    iput-object p1, p0, LY7/j;->f:LB8/i;

    .line 8
    invoke-interface {p2}, Lb8/a;->e()Z

    move-result p1

    iput-boolean p1, p0, LY7/j;->g:Z

    .line 9
    invoke-interface {p2}, Lb8/a;->s()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, LY7/j;->h:Z

    return-void
.end method

.method public synthetic constructor <init>(LX7/k;Lb8/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LY7/j;-><init>(LX7/k;Lb8/a;Z)V

    return-void
.end method

.method static synthetic b(LY7/j;)Lk8/c;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/j;->j(LY7/j;)Lk8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(LY7/j;)LC8/d0;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/j;->s(LY7/j;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic f(LY7/j;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/j;->h(LY7/j;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h(LY7/j;)Ljava/util/Map;
    .locals 4

    .line 1
    iget-object v0, p0, LY7/j;->b:Lb8/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lb8/a;->getArguments()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lb8/b;

    .line 27
    .line 28
    invoke-interface {v2}, Lb8/b;->getName()Lk8/f;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    sget-object v3, LU7/I;->c:Lk8/f;

    .line 35
    .line 36
    :cond_1
    invoke-direct {p0, v2}, LY7/j;->n(Lb8/b;)Lq8/g;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v2, 0x0

    .line 48
    :goto_1
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {v1}, Lj7/K;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method private final i(Lk8/c;)LL7/e;
    .locals 2

    .line 1
    iget-object v0, p0, LY7/j;->a:LX7/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/k;->d()LL7/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lk8/b;->d:Lk8/b$a;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, p0, LY7/j;->a:LX7/k;

    .line 14
    .line 15
    invoke-virtual {v1}, LX7/k;->a()LX7/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, LX7/d;->b()Ld8/n;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ld8/n;->f()Ly8/n;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ly8/n;->r()LL7/M;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, p1, v1}, LL7/y;->d(LL7/H;Lk8/b;LL7/M;)LL7/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method private static final j(LY7/j;)Lk8/c;
    .locals 0

    .line 1
    iget-object p0, p0, LY7/j;->b:Lb8/a;

    .line 2
    .line 3
    invoke-interface {p0}, Lb8/a;->c()Lk8/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lk8/b;->a()Lk8/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method private final n(Lb8/b;)Lq8/g;
    .locals 3

    .line 1
    instance-of v0, p1, Lb8/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lq8/i;->a:Lq8/i;

    .line 7
    .line 8
    check-cast p1, Lb8/o;

    .line 9
    .line 10
    invoke-interface {p1}, Lb8/o;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {v0, p1, v1, v2, v1}, Lq8/i;->f(Lq8/i;Ljava/lang/Object;LL7/H;ILjava/lang/Object;)Lq8/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    instance-of v0, p1, Lb8/m;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Lb8/m;

    .line 25
    .line 26
    invoke-interface {p1}, Lb8/m;->b()Lk8/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {p1}, Lb8/m;->d()Lk8/f;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, v0, p1}, LY7/j;->q(Lk8/b;Lk8/f;)Lq8/g;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    instance-of v0, p1, Lb8/e;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast p1, Lb8/e;

    .line 44
    .line 45
    invoke-interface {p1}, Lb8/b;->getName()Lk8/f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    sget-object v0, LU7/I;->c:Lk8/f;

    .line 52
    .line 53
    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Lb8/e;->e()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, v0, p1}, LY7/j;->p(Lk8/f;Ljava/util/List;)Lq8/g;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_3
    instance-of v0, p1, Lb8/c;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    check-cast p1, Lb8/c;

    .line 70
    .line 71
    invoke-interface {p1}, Lb8/c;->a()Lb8/a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, LY7/j;->o(Lb8/a;)Lq8/g;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_4
    instance-of v0, p1, Lb8/h;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    check-cast p1, Lb8/h;

    .line 85
    .line 86
    invoke-interface {p1}, Lb8/h;->c()Lb8/x;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p0, p1}, LY7/j;->r(Lb8/x;)Lq8/g;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_5
    return-object v1
.end method

.method private final o(Lb8/a;)Lq8/g;
    .locals 7

    .line 1
    new-instance v0, Lq8/a;

    .line 2
    .line 3
    new-instance v1, LY7/j;

    .line 4
    .line 5
    iget-object v2, p0, LY7/j;->a:LX7/k;

    .line 6
    .line 7
    const/4 v5, 0x4

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v3, p1

    .line 11
    invoke-direct/range {v1 .. v6}, LY7/j;-><init>(LX7/k;Lb8/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lq8/a;-><init>(LM7/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method private final p(Lk8/f;Ljava/util/List;)Lq8/g;
    .locals 3

    .line 1
    invoke-virtual {p0}, LY7/j;->l()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LC8/W;->a(LC8/S;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-static {p0}, Ls8/e;->l(LM7/c;)LL7/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, LV7/a;->b(Lk8/f;LL7/e;)LL7/t0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, LL7/s0;->getType()LC8/S;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    :cond_1
    iget-object p1, p0, LY7/j;->a:LX7/k;

    .line 33
    .line 34
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, LX7/d;->m()LL7/H;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, LL7/H;->n()LI7/i;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, LC8/N0;->k:LC8/N0;

    .line 47
    .line 48
    sget-object v1, LE8/k;->K0:LE8/k;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    new-array v2, v2, [Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v2}, LE8/l;->d(LE8/k;[Ljava/lang/String;)LE8/i;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p1, v0, v1}, LI7/i;->l(LC8/N0;LC8/S;)LC8/d0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "getArrayType(...)"

    .line 62
    .line 63
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/16 v1, 0xa

    .line 69
    .line 70
    invoke-static {p2, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lb8/b;

    .line 92
    .line 93
    invoke-direct {p0, v1}, LY7/j;->n(Lb8/b;)Lq8/g;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    new-instance v1, Lq8/u;

    .line 100
    .line 101
    invoke-direct {v1}, Lq8/u;-><init>()V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    sget-object p2, Lq8/i;->a:Lq8/i;

    .line 109
    .line 110
    invoke-virtual {p2, v0, p1}, Lq8/i;->b(Ljava/util/List;LC8/S;)Lq8/b;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method

.method private final q(Lk8/b;Lk8/f;)Lq8/g;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lq8/k;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lq8/k;-><init>(Lk8/b;Lk8/f;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private final r(Lb8/x;)Lq8/g;
    .locals 8

    .line 1
    sget-object v0, Lq8/s;->b:Lq8/s$a;

    .line 2
    .line 3
    iget-object v1, p0, LY7/j;->a:LX7/k;

    .line 4
    .line 5
    invoke-virtual {v1}, LX7/k;->g()LZ7/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, LC8/I0;->h:LC8/I0;

    .line 10
    .line 11
    const/4 v6, 0x7

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static/range {v2 .. v7}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, p1, v2}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Lq8/s$a;->a(LC8/S;)Lq8/g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method private static final s(LY7/j;)LC8/d0;
    .locals 6

    .line 1
    invoke-virtual {p0}, LY7/j;->d()Lk8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v0, LE8/k;->L0:LE8/k;

    .line 8
    .line 9
    iget-object p0, p0, LY7/j;->b:Lb8/a;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    filled-new-array {p0}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v0, p0}, LE8/l;->d(LE8/k;[Ljava/lang/String;)LE8/i;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object v0, LK7/d;->a:LK7/d;

    .line 25
    .line 26
    iget-object v2, p0, LY7/j;->a:LX7/k;

    .line 27
    .line 28
    invoke-virtual {v2}, LX7/k;->d()LL7/H;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, LL7/H;->n()LI7/i;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v4, 0x4

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static/range {v0 .. v5}, LK7/d;->f(LK7/d;Lk8/c;LI7/i;Ljava/lang/Integer;ILjava/lang/Object;)LL7/e;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, LY7/j;->b:Lb8/a;

    .line 46
    .line 47
    invoke-interface {v0}, Lb8/a;->resolve()Lb8/g;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v2, p0, LY7/j;->a:LX7/k;

    .line 54
    .line 55
    invoke-virtual {v2}, LX7/k;->a()LX7/d;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, LX7/d;->n()LX7/n;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v2, v0}, LX7/n;->a(Lb8/g;)LL7/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/4 v0, 0x0

    .line 69
    :goto_0
    if-nez v0, :cond_2

    .line 70
    .line 71
    invoke-direct {p0, v1}, LY7/j;->i(Lk8/c;)LL7/e;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_2
    invoke-interface {v0}, LL7/e;->r()LC8/d0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, LY7/j;->f:LB8/i;

    .line 2
    .line 3
    sget-object v1, LY7/j;->i:[LC7/k;

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
    check-cast v0, Ljava/util/Map;

    .line 13
    .line 14
    return-object v0
.end method

.method public d()Lk8/c;
    .locals 3

    .line 1
    iget-object v0, p0, LY7/j;->c:LB8/j;

    .line 2
    .line 3
    sget-object v1, LY7/j;->i:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, LB8/m;->b(LB8/j;Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lk8/c;

    .line 13
    .line 14
    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY7/j;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic g()LL7/h0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY7/j;->k()La8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getType()LC8/S;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY7/j;->l()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()La8/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/j;->e:La8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()LC8/d0;
    .locals 3

    .line 1
    iget-object v0, p0, LY7/j;->d:LB8/i;

    .line 2
    .line 3
    sget-object v1, LY7/j;->i:[LC7/k;

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
    check-cast v0, LC8/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY7/j;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Ln8/n;->h:Ln8/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-static {v0, p0, v1, v2, v1}, Ln8/n;->Q(Ln8/n;LM7/c;LM7/e;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
