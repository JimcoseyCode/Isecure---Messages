.class public final LE8/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LL7/H;


# static fields
.field public static final g:LE8/e;

.field private static final h:Lk8/f;

.field private static final i:Ljava/util/List;

.field private static final j:Ljava/util/List;

.field private static final k:Ljava/util/Set;

.field private static final l:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE8/e;

    .line 2
    .line 3
    invoke-direct {v0}, LE8/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LE8/e;->g:LE8/e;

    .line 7
    .line 8
    sget-object v0, LE8/b;->k:LE8/b;

    .line 9
    .line 10
    invoke-virtual {v0}, LE8/b;->j()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lk8/f;->t(Ljava/lang/String;)Lk8/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "special(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LE8/e;->h:Lk8/f;

    .line 24
    .line 25
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LE8/e;->i:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LE8/e;->j:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {}, Lj7/T;->e()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, LE8/e;->k:Ljava/util/Set;

    .line 42
    .line 43
    sget-object v0, LE8/d;->g:LE8/d;

    .line 44
    .line 45
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, LE8/e;->l:Lkotlin/Lazy;

    .line 50
    .line 51
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic G()LI7/g;
    .locals 1

    .line 1
    invoke-static {}, LE8/e;->L()LI7/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final L()LI7/g;
    .locals 1

    .line 1
    sget-object v0, LI7/g;->h:LI7/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LI7/g$a;->a()LI7/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public E0(LL7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p2, "visitor"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public a()LL7/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public b()LL7/m;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public e0(Lk8/c;)LL7/V;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "Should not be called!"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public getAnnotations()LM7/h;
    .locals 1

    .line 1
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getName()Lk8/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE8/e;->x0()Lk8/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n()LI7/i;
    .locals 1

    .line 1
    sget-object v0, LE8/e;->l:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LI7/i;

    .line 8
    .line 9
    return-object v0
.end method

.method public p(Lk8/c;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "fqName"

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
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public p0()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LE8/e;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public s0(LL7/G;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "capability"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public w(LL7/H;)Z
    .locals 1

    .line 1
    const-string v0, "targetModule"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public x0()Lk8/f;
    .locals 1

    .line 1
    sget-object v0, LE8/e;->h:Lk8/f;

    .line 2
    .line 3
    return-object v0
.end method
