.class public LF/d;
.super LF/z0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final b:LF/L;

.field private c:Z

.field private d:Z

.field private final e:LF/E;

.field private f:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(LF/L;LF/E;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LF/z0;-><init>(LF/L;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LF/d;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, LF/d;->d:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, LF/d;->f:Landroidx/lifecycle/x;

    .line 11
    .line 12
    iput-object p1, p0, LF/d;->b:LF/L;

    .line 13
    .line 14
    iput-object p2, p0, LF/d;->e:LF/E;

    .line 15
    .line 16
    invoke-interface {p2, v0}, LF/E;->R(LF/m1;)LF/m1;

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, LF/E;->z()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p1}, LF/d;->F(Z)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, LF/E;->U()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0, p1}, LF/d;->E(Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static C(FFF)F
    .locals 3

    .line 1
    cmpl-float v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    cmpl-float v0, p0, p2

    .line 8
    .line 9
    const/high16 v2, 0x3f800000    # 1.0f

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return v2

    .line 14
    :cond_1
    cmpl-float v0, p0, p1

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    return v1

    .line 19
    :cond_2
    div-float p0, v2, p0

    .line 20
    .line 21
    div-float p2, v2, p2

    .line 22
    .line 23
    div-float/2addr v2, p1

    .line 24
    sub-float/2addr p0, v2

    .line 25
    sub-float/2addr p2, v2

    .line 26
    div-float/2addr p0, p2

    .line 27
    return p0
.end method


# virtual methods
.method public B()LF/E;
    .locals 1

    .line 1
    iget-object v0, p0, LF/d;->e:LF/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public D()LF/m1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public E(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LF/d;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public F(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LF/d;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    invoke-super {p0}, LF/z0;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public g()LF/L;
    .locals 1

    .line 1
    iget-object v0, p0, LF/d;->b:LF/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Z
    .locals 2

    .line 1
    const/4 v0, 0x5

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
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    iget-object v0, p0, LF/d;->b:LF/L;

    .line 16
    .line 17
    invoke-interface {v0}, Ly/q;->s()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public y()Landroidx/lifecycle/x;
    .locals 3

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
    new-instance v0, Landroidx/lifecycle/A;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-static {v2, v2, v2, v1}, LK/h;->e(FFFF)Ly/M0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Landroidx/lifecycle/A;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object v0, p0, LF/d;->b:LF/L;

    .line 27
    .line 28
    invoke-interface {v0}, Ly/q;->y()Landroidx/lifecycle/x;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
