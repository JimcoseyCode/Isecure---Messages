.class public final LF7/m0;
.super LF7/E0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC7/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/m0$a;
    }
.end annotation


# instance fields
.field private final w:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LF7/d0;LL7/Z;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, LF7/E0;-><init>(LF7/d0;LL7/Z;)V

    .line 4
    sget-object p1, Li7/l;->h:Li7/l;

    new-instance p2, LF7/l0;

    invoke-direct {p2, p0}, LF7/l0;-><init>(LF7/m0;)V

    invoke-static {p1, p2}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LF7/m0;->w:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LF7/E0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    sget-object p1, Li7/l;->h:Li7/l;

    new-instance p2, LF7/l0;

    invoke-direct {p2, p0}, LF7/l0;-><init>(LF7/m0;)V

    invoke-static {p1, p2}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LF7/m0;->w:Lkotlin/Lazy;

    return-void
.end method

.method private static final p0(LF7/m0;)LF7/m0$a;
    .locals 1

    .line 1
    new-instance v0, LF7/m0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LF7/m0$a;-><init>(LF7/m0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static synthetic q0(LF7/m0;)LF7/m0$a;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/m0;->p0(LF7/m0;)LF7/m0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public bridge synthetic h()LC7/h$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/m0;->r0()LF7/m0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()LC7/i$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, LF7/m0;->r0()LF7/m0$a;

    move-result-object v0

    return-object v0
.end method

.method public r0()LF7/m0$a;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/m0;->w:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF7/m0$a;

    .line 8
    .line 9
    return-object v0
.end method

.method public s0(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/m0;->r0()LF7/m0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, LF7/A;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
