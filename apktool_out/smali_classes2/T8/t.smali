.class final LT8/t;
.super LT8/h;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LT8/u;


# direct methods
.method public constructor <init>(Ln7/j;LT8/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0, v0}, LT8/h;-><init>(Ln7/j;LT8/g;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method protected N0(Ljava/lang/Throwable;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LT8/h;->Q0()LT8/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LT8/w;->h(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LR8/a;->getContext()Ln7/j;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p2, p1}, LR8/L;->a(Ln7/j;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public bridge synthetic O0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Li7/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LT8/t;->R0(Li7/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected R0(Li7/B;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LT8/h;->Q0()LT8/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p1, v0, v1, v0}, LT8/w$a;->a(LT8/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    invoke-super {p0}, LR8/a;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
