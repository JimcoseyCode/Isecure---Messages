.class public final LY2/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lc2/n;


# instance fields
.field private final a:LY2/q;

.field private final b:Lg3/D;

.field private final c:LY2/p;

.field private final d:LW2/t;

.field private final e:I

.field private final f:LX1/d;

.field private final g:LX1/d;

.field private final h:Ljava/util/Map;

.field private final i:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LY2/q;LY2/v;)V
    .locals 10

    const-string v0, "fileCacheFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-interface {p2}, LY2/v;->a()Lg3/D;

    move-result-object v3

    .line 12
    invoke-interface {p2}, LY2/v;->H()LY2/p;

    move-result-object v4

    .line 13
    invoke-interface {p2}, LY2/v;->s()LW2/t;

    move-result-object v5

    .line 14
    invoke-interface {p2}, LY2/v;->c()I

    move-result v6

    .line 15
    invoke-interface {p2}, LY2/v;->i()LX1/d;

    move-result-object v7

    .line 16
    invoke-interface {p2}, LY2/v;->r()LX1/d;

    move-result-object v8

    .line 17
    invoke-interface {p2}, LY2/v;->q()Ljava/util/Map;

    move-result-object v9

    move-object v1, p0

    move-object v2, p1

    .line 18
    invoke-direct/range {v1 .. v9}, LY2/k;-><init>(LY2/q;Lg3/D;LY2/p;LW2/t;ILX1/d;LX1/d;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(LY2/q;Lg3/D;LY2/p;LW2/t;ILX1/d;LX1/d;Ljava/util/Map;)V
    .locals 1

    const-string v0, "fileCacheFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poolFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executorSupplier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCacheStatsTracker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainDiskCacheConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smallImageDiskCacheConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LY2/k;->a:LY2/q;

    .line 3
    iput-object p2, p0, LY2/k;->b:Lg3/D;

    .line 4
    iput-object p3, p0, LY2/k;->c:LY2/p;

    .line 5
    iput-object p4, p0, LY2/k;->d:LW2/t;

    .line 6
    iput p5, p0, LY2/k;->e:I

    .line 7
    iput-object p6, p0, LY2/k;->f:LX1/d;

    .line 8
    iput-object p7, p0, LY2/k;->g:LX1/d;

    .line 9
    iput-object p8, p0, LY2/k;->h:Ljava/util/Map;

    .line 10
    sget-object p1, Li7/l;->g:Li7/l;

    new-instance p2, LY2/d;

    invoke-direct {p2, p0}, LY2/d;-><init>(LY2/k;)V

    invoke-static {p1, p2}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LY2/k;->i:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic a(LY2/k;)LY2/k$a;
    .locals 0

    .line 1
    invoke-static {p0}, LY2/k;->j(LY2/k;)LY2/k$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LY2/k;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, LY2/k;->h:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LY2/k;)LY2/p;
    .locals 0

    .line 1
    iget-object p0, p0, LY2/k;->c:LY2/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LY2/k;)LY2/q;
    .locals 0

    .line 1
    iget-object p0, p0, LY2/k;->a:LY2/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LY2/k;)LW2/t;
    .locals 0

    .line 1
    iget-object p0, p0, LY2/k;->d:LW2/t;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LY2/k;)LX1/d;
    .locals 0

    .line 1
    iget-object p0, p0, LY2/k;->f:LX1/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(LY2/k;)I
    .locals 0

    .line 1
    iget p0, p0, LY2/k;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic h(LY2/k;)Lg3/D;
    .locals 0

    .line 1
    iget-object p0, p0, LY2/k;->b:Lg3/D;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(LY2/k;)LX1/d;
    .locals 0

    .line 1
    iget-object p0, p0, LY2/k;->g:LX1/d;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final j(LY2/k;)LY2/k$a;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LY2/k$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LY2/k$a;-><init>(LY2/k;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private final l()LY2/c;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/k;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY2/c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY2/k;->k()LY2/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()LY2/c;
    .locals 1

    .line 1
    invoke-direct {p0}, LY2/k;->l()LY2/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
