.class public LF/c;
.super LF/y0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final c:LF/I;


# direct methods
.method public constructor <init>(LF/I;LF/m1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LF/y0;-><init>(LF/I;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/c;->c:LF/I;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f()Lm5/a;
    .locals 1

    .line 1
    iget-object v0, p0, LF/c;->c:LF/I;

    .line 2
    .line 3
    invoke-interface {v0}, Ly/j;->f()Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g(F)Lm5/a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    filled-new-array {v0}, [I

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v0}, LH/w;->b(LF/m1;[I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "Zoom is not supported"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v0, p0, LF/c;->c:LF/I;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Ly/j;->g(F)Lm5/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public i(Ly/J;)Lm5/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, LH/w;->a(LF/m1;Ly/J;)Ly/J;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "FocusMetering is not supported"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v0, p0, LF/c;->c:LF/I;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ly/j;->i(Ly/J;)Lm5/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public k(Z)Lm5/a;
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    filled-new-array {v0}, [I

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v0}, LH/w;->b(LF/m1;[I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "Torch is not supported"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v0, p0, LF/c;->c:LF/I;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Ly/j;->k(Z)Lm5/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method
