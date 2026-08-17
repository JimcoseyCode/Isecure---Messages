.class LT/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/M;


# instance fields
.field private final g:LF/M;

.field private final h:LT/p;

.field private final i:LT/q;

.field private final j:Ly/J0$c;


# direct methods
.method constructor <init>(LF/M;Ly/J0$c;LT/g$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT/j;->g:LF/M;

    .line 5
    .line 6
    iput-object p2, p0, LT/j;->j:Ly/J0$c;

    .line 7
    .line 8
    new-instance p2, LT/p;

    .line 9
    .line 10
    invoke-interface {p1}, LF/M;->h()LF/I;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p2, v0, p3}, LT/p;-><init>(LF/I;LT/g$a;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, LT/j;->h:LT/p;

    .line 18
    .line 19
    new-instance p2, LT/q;

    .line 20
    .line 21
    invoke-interface {p1}, LF/M;->r()LF/L;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, LT/q;-><init>(LF/L;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, LT/j;->i:LT/q;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public a()Lm5/a;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public c()LF/V0;
    .locals 1

    .line 1
    iget-object v0, p0, LT/j;->g:LF/M;

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

.method public e(Ly/J0;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LT/j;->j:Ly/J0$c;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ly/J0$c;->e(Ly/J0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g(Ly/J0;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LT/j;->j:Ly/J0$c;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ly/J0$c;->g(Ly/J0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h()LF/I;
    .locals 1

    .line 1
    iget-object v0, p0, LT/j;->h:LT/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public k(Ly/J0;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LT/j;->j:Ly/J0$c;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ly/J0$c;->k(Ly/J0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public l(Ljava/util/Collection;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public m(Ljava/util/Collection;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public o()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public r()LF/L;
    .locals 1

    .line 1
    iget-object v0, p0, LT/j;->i:LT/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public s(Ly/J0;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LT/j;->j:Ly/J0$c;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ly/J0$c;->s(Ly/J0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method t(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LT/j;->i:LT/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LT/q;->B(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
