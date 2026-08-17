.class public LW8/A;
.super LR8/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field public final j:Ln7/f;


# direct methods
.method public constructor <init>(Ln7/j;Ln7/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, LR8/a;-><init>(Ln7/j;ZZ)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, LW8/A;->j:Ln7/f;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected M0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW8/A;->j:Ln7/f;

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/D;->a(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ln7/f;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public Q0()V
    .locals 0

    .line 1
    return-void
.end method

.method protected final f0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    .line 1
    iget-object v0, p0, LW8/A;->j:Ln7/f;

    .line 2
    .line 3
    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method protected u(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LW8/A;->j:Ln7/f;

    .line 2
    .line 3
    invoke-static {v0}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LW8/A;->j:Ln7/f;

    .line 8
    .line 9
    invoke-static {p1, v1}, LR8/D;->a(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v0, p1}, LW8/j;->b(Ln7/f;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
