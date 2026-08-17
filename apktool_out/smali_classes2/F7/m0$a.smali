.class public final LF7/m0$a;
.super LF7/K0$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC7/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final p:LF7/m0;


# direct methods
.method public constructor <init>(LF7/m0;)V
    .locals 1

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LF7/K0$d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LF7/m0$a;->p:LF7/m0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic a0()LF7/K0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/m0$a;->g0()LF7/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g0()LF7/m0;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/m0$a;->p:LF7/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public h0(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/m0$a;->g0()LF7/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LF7/m0;->s0(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LF7/m0$a;->h0(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Li7/B;->a:Li7/B;

    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic j()LC7/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/m0$a;->g0()LF7/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
