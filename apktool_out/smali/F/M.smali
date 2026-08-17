.class public interface abstract LF/M;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/i;
.implements Ly/J0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/M$a;
    }
.end annotation


# virtual methods
.method public abstract a()Lm5/a;
.end method

.method public b()Ly/j;
    .locals 1

    .line 1
    invoke-interface {p0}, LF/M;->h()LF/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public abstract c()LF/V0;
.end method

.method public d()Ly/q;
    .locals 1

    .line 1
    invoke-interface {p0}, LF/M;->r()LF/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    invoke-interface {p0}, LF/M;->d()Ly/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ly/q;->k()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public abstract h()LF/I;
.end method

.method public i()LF/E;
    .locals 1

    .line 1
    invoke-static {}, LF/H;->a()LF/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public j(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract l(Ljava/util/Collection;)V
.end method

.method public abstract m(Ljava/util/Collection;)V
.end method

.method public n()V
    .locals 0

    .line 1
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public p(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(LF/E;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract r()LF/L;
.end method
