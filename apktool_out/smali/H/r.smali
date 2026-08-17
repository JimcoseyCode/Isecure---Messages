.class public abstract LH/r;
.super Landroidx/lifecycle/y;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final m:Ljava/lang/Object;

.field private final n:Ln/a;

.field private o:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ln/a;)V
    .locals 1

    .line 1
    const-string v0, "mapFunction"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/lifecycle/y;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LH/r;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, LH/r;->n:Ln/a;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic q(LH/r;Landroidx/lifecycle/x;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LH/r;->u(LH/r;Landroidx/lifecycle/x;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LH/r;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s(LH/r;Ljava/lang/Object;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LH/r;->v(LH/r;Ljava/lang/Object;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final u(LH/r;Landroidx/lifecycle/x;)V
    .locals 2

    .line 1
    new-instance v0, LH/p;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LH/p;-><init>(LH/r;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LH/q;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LH/q;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, v1}, Landroidx/lifecycle/y;->o(Landroidx/lifecycle/x;Landroidx/lifecycle/B;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final v(LH/r;Ljava/lang/Object;)Li7/B;
    .locals 1

    .line 1
    iget-object v0, p0, LH/r;->n:Ln/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroidx/lifecycle/A;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Li7/B;->a:Li7/B;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LH/r;->o:Landroidx/lifecycle/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LH/r;->m:Ljava/lang/Object;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v1, p0, LH/r;->n:Ln/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/lifecycle/x;->e()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v1, v0}, Ln/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public final t(Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    const-string v0, "liveDataSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LH/r;->o:Landroidx/lifecycle/x;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, v0}, Landroidx/lifecycle/y;->p(Landroidx/lifecycle/x;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, LH/r;->o:Landroidx/lifecycle/x;

    .line 17
    .line 18
    new-instance v0, LH/o;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, LH/o;-><init>(LH/r;Landroidx/lifecycle/x;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, LH/y;->e(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
