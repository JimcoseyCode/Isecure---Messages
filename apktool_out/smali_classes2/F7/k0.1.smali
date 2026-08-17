.class public final LF7/k0;
.super LF7/B0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC7/l;
.implements LC7/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/k0$a;
    }
.end annotation


# instance fields
.field private final w:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LF7/d0;LL7/Z;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "descriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LF7/B0;-><init>(LF7/d0;LL7/Z;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Li7/l;->h:Li7/l;

    .line 15
    .line 16
    new-instance p2, LF7/j0;

    .line 17
    .line 18
    invoke-direct {p2, p0}, LF7/j0;-><init>(LF7/k0;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, LF7/k0;->w:Lkotlin/Lazy;

    .line 26
    .line 27
    return-void
.end method

.method private static final p0(LF7/k0;)LF7/k0$a;
    .locals 1

    .line 1
    new-instance v0, LF7/k0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LF7/k0$a;-><init>(LF7/k0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static synthetic q0(LF7/k0;)LF7/k0$a;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/k0;->p0(LF7/k0;)LF7/k0$a;

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
    invoke-virtual {p0}, LF7/k0;->r0()LF7/k0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public r0()LF7/k0$a;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/k0;->w:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF7/k0$a;

    .line 8
    .line 9
    return-object v0
.end method

.method public s0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/k0;->r0()LF7/k0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

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
