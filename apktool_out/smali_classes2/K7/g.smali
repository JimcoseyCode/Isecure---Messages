.class public final LK7/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LN7/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK7/g$a;
    }
.end annotation


# static fields
.field public static final d:LK7/g$a;

.field static final synthetic e:[LC7/k;

.field private static final f:Lk8/c;

.field private static final g:Lk8/f;

.field private static final h:Lk8/b;


# instance fields
.field private final a:LL7/H;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:LB8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LK7/g;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "cloneable"

    .line 10
    .line 11
    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    new-array v1, v1, [LC7/k;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    sput-object v1, LK7/g;->e:[LC7/k;

    .line 27
    .line 28
    new-instance v0, LK7/g$a;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, v1}, LK7/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LK7/g;->d:LK7/g$a;

    .line 35
    .line 36
    sget-object v0, LI7/o;->A:Lk8/c;

    .line 37
    .line 38
    sput-object v0, LK7/g;->f:Lk8/c;

    .line 39
    .line 40
    sget-object v0, LI7/o$a;->d:Lk8/d;

    .line 41
    .line 42
    invoke-virtual {v0}, Lk8/d;->i()Lk8/f;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "shortName(...)"

    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v1, LK7/g;->g:Lk8/f;

    .line 52
    .line 53
    sget-object v1, Lk8/b;->d:Lk8/b$a;

    .line 54
    .line 55
    invoke-virtual {v0}, Lk8/d;->l()Lk8/c;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v2, "toSafe(...)"

    .line 60
    .line 61
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, LK7/g;->h:Lk8/b;

    .line 69
    .line 70
    return-void
.end method

.method public constructor <init>(LB8/n;LL7/H;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeContainingDeclaration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, LK7/g;->a:LL7/H;

    .line 3
    iput-object p3, p0, LK7/g;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    new-instance p2, LK7/e;

    invoke-direct {p2, p0, p1}, LK7/e;-><init>(LK7/g;LB8/n;)V

    invoke-interface {p1, p2}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p1

    iput-object p1, p0, LK7/g;->c:LB8/i;

    return-void
.end method

.method public synthetic constructor <init>(LB8/n;LL7/H;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, LK7/f;->g:LK7/f;

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LK7/g;-><init>(LB8/n;LL7/H;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final d(LL7/H;)LI7/c;
    .locals 3

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK7/g;->f:Lk8/c;

    .line 7
    .line 8
    invoke-interface {p0, v0}, LL7/H;->e0(Lk8/c;)LL7/V;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, LL7/V;->H()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v2, v1, LI7/c;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v0}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, LI7/c;

    .line 48
    .line 49
    return-object p0
.end method

.method public static final synthetic e()Lk8/b;
    .locals 1

    .line 1
    sget-object v0, LK7/g;->h:Lk8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic f(LK7/g;LB8/n;)LO7/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LK7/g;->h(LK7/g;LB8/n;)LO7/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(LL7/H;)LI7/c;
    .locals 0

    .line 1
    invoke-static {p0}, LK7/g;->d(LL7/H;)LI7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h(LK7/g;LB8/n;)LO7/k;
    .locals 9

    .line 1
    new-instance v0, LO7/k;

    .line 2
    .line 3
    iget-object v1, p0, LK7/g;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object v2, p0, LK7/g;->a:LL7/H;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LL7/m;

    .line 12
    .line 13
    sget-object v2, LK7/g;->g:Lk8/f;

    .line 14
    .line 15
    sget-object v3, LL7/E;->k:LL7/E;

    .line 16
    .line 17
    sget-object v4, LL7/f;->i:LL7/f;

    .line 18
    .line 19
    iget-object p0, p0, LK7/g;->a:LL7/H;

    .line 20
    .line 21
    invoke-interface {p0}, LL7/H;->n()LI7/i;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, LI7/i;->i()LC8/d0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    sget-object v6, LL7/h0;->a:LL7/h0;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v8, p1

    .line 37
    invoke-direct/range {v0 .. v8}, LO7/k;-><init>(LL7/m;Lk8/f;LL7/E;LL7/f;Ljava/util/Collection;LL7/h0;ZLB8/n;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, LK7/a;

    .line 41
    .line 42
    invoke-direct {p0, v8, v0}, LK7/a;-><init>(LB8/n;LL7/e;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lj7/T;->e()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, p0, p1, v1}, LO7/k;->H0(Lv8/k;Ljava/util/Set;LL7/d;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method private final i()LO7/k;
    .locals 3

    .line 1
    iget-object v0, p0, LK7/g;->c:LB8/i;

    .line 2
    .line 3
    sget-object v1, LK7/g;->e:[LC7/k;

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
    check-cast v0, LO7/k;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public a(Lk8/c;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK7/g;->f:Lk8/c;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, LK7/g;->i()LO7/k;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lj7/T;->d(Ljava/lang/Object;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    invoke-static {}, Lj7/T;->e()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public b(Lk8/c;Lk8/f;)Z
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LK7/g;->g:Lk8/f;

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    sget-object p2, LK7/g;->f:Lk8/c;

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public c(Lk8/b;)LL7/e;
    .locals 1

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LK7/g;->h:Lk8/b;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, LK7/g;->i()LO7/k;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method
