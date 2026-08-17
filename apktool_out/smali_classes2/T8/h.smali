.class public abstract LT8/h;
.super LR8/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LT8/g;


# instance fields
.field private final j:LT8/g;


# direct methods
.method public constructor <init>(Ln7/j;LT8/g;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, LR8/a;-><init>(Ln7/j;ZZ)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LT8/h;->j:LT8/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected final Q0()LT8/g;
    .locals 1

    .line 1
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LT8/v;->a(Ln7/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LT8/w;->b(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 2
    .line 3
    invoke-interface {v0}, LT8/v;->c()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LT8/w;->h(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public iterator()LT8/i;
    .locals 1

    .line 1
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 2
    .line 3
    invoke-interface {v0}, LT8/v;->iterator()LT8/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR8/G0;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    new-instance p1, LR8/B0;

    .line 11
    .line 12
    invoke-static {p0}, LR8/G0;->m(LR8/G0;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1, p0}, LR8/B0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LR8/A0;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, LT8/h;->z(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LT8/w;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public z(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1, v0}, LR8/G0;->F0(LR8/G0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LT8/h;->j:LT8/g;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LT8/v;->k(Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, LR8/G0;->x(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
