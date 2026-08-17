.class final LF7/v0$a;
.super LF7/d0$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# static fields
.field static final synthetic j:[LC7/k;


# instance fields
.field private final d:LF7/a1$a;

.field private final e:LF7/a1$a;

.field private final f:Lkotlin/Lazy;

.field private final g:Lkotlin/Lazy;

.field private final h:LF7/a1$a;

.field final synthetic i:LF7/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LF7/v0$a;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "kotlinClass"

    .line 10
    .line 11
    const-string v4, "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;"

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
    const-string v4, "scope"

    .line 27
    .line 28
    const-string v5, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

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
    const-string v4, "members"

    .line 44
    .line 45
    const-string v5, "getMembers()Ljava/util/Collection;"

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
    sput-object v3, LF7/v0$a;->j:[LC7/k;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(LF7/v0;)V
    .locals 2

    .line 1
    iput-object p1, p0, LF7/v0$a;->i:LF7/v0;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LF7/d0$b;-><init>(LF7/d0;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LF7/q0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LF7/q0;-><init>(LF7/v0;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LF7/a1;->c(Lw7/a;)LF7/a1$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LF7/v0$a;->d:LF7/a1$a;

    .line 16
    .line 17
    new-instance v0, LF7/r0;

    .line 18
    .line 19
    invoke-direct {v0, p0}, LF7/r0;-><init>(LF7/v0$a;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, LF7/a1;->c(Lw7/a;)LF7/a1$a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, LF7/v0$a;->e:LF7/a1$a;

    .line 27
    .line 28
    sget-object v0, Li7/l;->h:Li7/l;

    .line 29
    .line 30
    new-instance v1, LF7/s0;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1}, LF7/s0;-><init>(LF7/v0$a;LF7/v0;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, p0, LF7/v0$a;->f:Lkotlin/Lazy;

    .line 40
    .line 41
    new-instance v1, LF7/t0;

    .line 42
    .line 43
    invoke-direct {v1, p0}, LF7/t0;-><init>(LF7/v0$a;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, LF7/v0$a;->g:Lkotlin/Lazy;

    .line 51
    .line 52
    new-instance v0, LF7/u0;

    .line 53
    .line 54
    invoke-direct {v0, p1, p0}, LF7/u0;-><init>(LF7/v0;LF7/v0$a;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, LF7/a1;->c(Lw7/a;)LF7/a1$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, LF7/v0$a;->h:LF7/a1$a;

    .line 62
    .line 63
    return-void
.end method

.method static synthetic d(LF7/v0;)LQ7/f;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/v0$a;->m(LF7/v0;)LQ7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(LF7/v0$a;)Lv8/k;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/v0$a;->q(LF7/v0$a;)Lv8/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic f(LF7/v0$a;LF7/v0;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LF7/v0$a;->p(LF7/v0$a;LF7/v0;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(LF7/v0$a;)Li7/s;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/v0$a;->o(LF7/v0$a;)Li7/s;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic h(LF7/v0;LF7/v0$a;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LF7/v0$a;->n(LF7/v0;LF7/v0$a;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final i()LQ7/f;
    .locals 3

    .line 1
    iget-object v0, p0, LF7/v0$a;->d:LF7/a1$a;

    .line 2
    .line 3
    sget-object v1, LF7/v0$a;->j:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LF7/a1$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LQ7/f;

    .line 13
    .line 14
    return-object v0
.end method

.method private static final m(LF7/v0;)LQ7/f;
    .locals 1

    .line 1
    sget-object v0, LQ7/f;->c:LQ7/f$a;

    .line 2
    .line 3
    invoke-virtual {p0}, LF7/v0;->b()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, LQ7/f$a;->a(Ljava/lang/Class;)LQ7/f;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final n(LF7/v0;LF7/v0$a;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, LF7/v0$a;->l()Lv8/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, LF7/d0$d;->g:LF7/d0$d;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, LF7/d0;->H(Lv8/k;LF7/d0$d;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final o(LF7/v0$a;)Li7/s;
    .locals 3

    .line 1
    invoke-direct {p0}, LF7/v0$a;->i()LQ7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LQ7/f;->a()Le8/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Le8/a;->a()[Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0}, Le8/a;->g()[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-static {v1, v2}, Lj8/i;->m([Ljava/lang/String;[Ljava/lang/String;)Lkotlin/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lj8/f;

    .line 35
    .line 36
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lf8/l;

    .line 41
    .line 42
    new-instance v2, Li7/s;

    .line 43
    .line 44
    invoke-virtual {p0}, Le8/a;->d()Lj8/e;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v2, v1, v0, p0}, Li7/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_0
    return-object v0
.end method

.method private static final p(LF7/v0$a;LF7/v0;)Ljava/lang/Class;
    .locals 7

    .line 1
    invoke-direct {p0}, LF7/v0$a;->i()LQ7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LQ7/f;->a()Le8/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Le8/a;->e()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    move-object v1, p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v0

    .line 21
    :goto_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-lez p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, LF7/v0;->b()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 v5, 0x4

    .line 38
    const/4 v6, 0x0

    .line 39
    const/16 v2, 0x2f

    .line 40
    .line 41
    const/16 v3, 0x2e

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-static/range {v1 .. v6}, LP8/q;->D(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_1
    return-object v0
.end method

.method private static final q(LF7/v0$a;)Lv8/k;
    .locals 1

    .line 1
    invoke-direct {p0}, LF7/v0$a;->i()LQ7/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LF7/d0$b;->b()LQ7/k;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, LQ7/k;->c()LQ7/a;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, v0}, LQ7/a;->a(LQ7/f;)Lv8/k;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lv8/k$b;->b:Lv8/k$b;

    .line 21
    .line 22
    return-object p0
.end method


# virtual methods
.method public final j()Li7/s;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/v0$a;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li7/s;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/v0$a;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    return-object v0
.end method

.method public final l()Lv8/k;
    .locals 3

    .line 1
    iget-object v0, p0, LF7/v0$a;->e:LF7/a1$a;

    .line 2
    .line 3
    sget-object v1, LF7/v0$a;->j:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LF7/a1$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getValue(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Lv8/k;

    .line 18
    .line 19
    return-object v0
.end method
