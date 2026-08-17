.class public LF/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/M;


# instance fields
.field private final g:LF/M;

.field private final h:LF/d;

.field private final i:LF/c;


# direct methods
.method public constructor <init>(LF/M;LF/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/e;->g:LF/M;

    .line 5
    .line 6
    iput-object p2, p0, LF/e;->h:LF/d;

    .line 7
    .line 8
    invoke-virtual {p2}, LF/d;->B()LF/E;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance v0, LF/c;

    .line 13
    .line 14
    invoke-interface {p1}, LF/M;->h()LF/I;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p2, v1}, LF/E;->R(LF/m1;)LF/m1;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p1, v1}, LF/c;-><init>(LF/I;LF/m1;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LF/e;->i:LF/c;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a()Lm5/a;
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0}, LF/M;->a()Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Ly/j;
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->i:LF/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LF/V0;
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0}, LF/M;->c()LF/V0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Ly/q;
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->h:LF/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Ly/J0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ly/J0$c;->e(Ly/J0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0}, LF/M;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g(Ly/J0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ly/J0$c;->g(Ly/J0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h()LF/I;
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->i:LF/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()LF/E;
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0}, LF/M;->i()LF/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/M;->j(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Ly/J0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ly/J0$c;->k(Ly/J0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(Ljava/util/Collection;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/M;->l(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Ljava/util/Collection;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/M;->m(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0}, LF/M;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/M;->p(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(LF/E;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/M;->q(LF/E;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r()LF/L;
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->h:LF/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public s(Ly/J0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->g:LF/M;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ly/J0$c;->s(Ly/J0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
