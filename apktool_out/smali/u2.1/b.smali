.class public Lu2/b;
.super LN2/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;
.implements Lcom/facebook/drawee/drawable/F;


# instance fields
.field private final i:Lj2/b;

.field private final j:LN2/j;

.field private final k:LN2/i;

.field private l:LN2/i;

.field private final m:Z


# direct methods
.method public constructor <init>(Lj2/b;LN2/j;LN2/i;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lu2/b;-><init>(Lj2/b;LN2/j;LN2/i;Z)V

    return-void
.end method

.method public constructor <init>(Lj2/b;LN2/j;LN2/i;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, LN2/a;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lu2/b;->l:LN2/i;

    .line 4
    iput-object p1, p0, Lu2/b;->i:Lj2/b;

    .line 5
    iput-object p2, p0, Lu2/b;->j:LN2/j;

    .line 6
    iput-object p3, p0, Lu2/b;->k:LN2/i;

    .line 7
    iput-boolean p4, p0, Lu2/b;->m:Z

    return-void
.end method

.method private I(LN2/j;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, LN2/j;->R(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, LN2/j;->L(J)V

    .line 6
    .line 7
    .line 8
    sget-object p2, LN2/n;->l:LN2/n;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lu2/b;->X(LN2/j;LN2/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private W(LN2/j;LN2/e;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, LN2/j;->H(LN2/e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu2/b;->k:LN2/i;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, LN2/i;->b(LN2/j;LN2/e;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lu2/b;->l:LN2/i;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, LN2/i;->b(LN2/j;LN2/e;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private X(LN2/j;LN2/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/b;->k:LN2/i;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LN2/i;->a(LN2/j;LN2/n;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu2/b;->l:LN2/i;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, LN2/i;->a(LN2/j;LN2/n;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Ld3/m;LN2/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/b;->i:Lj2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lu2/b;->j:LN2/j;

    .line 8
    .line 9
    invoke-virtual {v2, p3}, LN2/j;->F(LN2/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, LN2/j;->A(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0, v1}, LN2/j;->J(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p1}, LN2/j;->B(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p2}, LN2/j;->G(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, LN2/e;->m:LN2/e;

    .line 25
    .line 26
    invoke-direct {p0, v2, p1}, Lu2/b;->W(LN2/j;LN2/e;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public B(Ljava/lang/String;Ld3/m;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/b;->i:Lj2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lu2/b;->j:LN2/j;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, LN2/j;->C(J)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, p1}, LN2/j;->B(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p2}, LN2/j;->G(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, LN2/e;->l:LN2/e;

    .line 19
    .line 20
    invoke-direct {p0, v2, p1}, Lu2/b;->W(LN2/j;LN2/e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public J(LN2/j;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, LN2/j;->R(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, LN2/j;->Q(J)V

    .line 6
    .line 7
    .line 8
    sget-object p2, LN2/n;->k:LN2/n;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lu2/b;->X(LN2/j;LN2/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public M()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/b;->j:LN2/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LN2/j;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu2/b;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lu2/b;->j:LN2/j;

    .line 4
    .line 5
    iget-object v0, p0, Lu2/b;->i:Lj2/b;

    .line 6
    .line 7
    invoke-interface {v0}, Lj2/b;->now()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0, p1, v0, v1}, Lu2/b;->J(LN2/j;J)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lu2/b;->j:LN2/j;

    .line 16
    .line 17
    iget-object v0, p0, Lu2/b;->i:Lj2/b;

    .line 18
    .line 19
    invoke-interface {v0}, Lj2/b;->now()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-direct {p0, p1, v0, v1}, Lu2/b;->I(LN2/j;J)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Throwable;LN2/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/b;->i:Lj2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lu2/b;->j:LN2/j;

    .line 8
    .line 9
    invoke-virtual {v2, p3}, LN2/j;->F(LN2/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, LN2/j;->z(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, LN2/j;->B(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p2}, LN2/j;->E(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, LN2/e;->n:LN2/e;

    .line 22
    .line 23
    invoke-direct {p0, v2, p1}, Lu2/b;->W(LN2/j;LN2/e;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v2, v0, v1}, Lu2/b;->I(LN2/j;J)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public k(Ljava/lang/String;LN2/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/b;->i:Lj2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lu2/b;->j:LN2/j;

    .line 8
    .line 9
    invoke-virtual {v2, p2}, LN2/j;->F(LN2/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, p1}, LN2/j;->B(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, LN2/e;->p:LN2/e;

    .line 16
    .line 17
    invoke-direct {p0, v2, p1}, Lu2/b;->W(LN2/j;LN2/e;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Lu2/b;->m:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-direct {p0, v2, v0, v1}, Lu2/b;->I(LN2/j;J)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public bridge synthetic m(Ljava/lang/String;Ljava/lang/Object;LN2/b$a;)V
    .locals 0

    .line 1
    check-cast p2, Ld3/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lu2/b;->A(Ljava/lang/String;Ld3/m;LN2/b$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onDraw()V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onIntermediateImageSet(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ld3/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu2/b;->B(Ljava/lang/String;Ld3/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s(Ljava/lang/String;Ljava/lang/Object;LN2/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/b;->i:Lj2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lu2/b;->j:LN2/j;

    .line 8
    .line 9
    invoke-virtual {v2}, LN2/j;->x()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, LN2/j;->D(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, LN2/j;->B(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p2}, LN2/j;->y(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p3}, LN2/j;->F(LN2/b$a;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, LN2/e;->k:LN2/e;

    .line 25
    .line 26
    invoke-direct {p0, v2, p1}, Lu2/b;->W(LN2/j;LN2/e;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Lu2/b;->m:Z

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v2, v0, v1}, Lu2/b;->J(LN2/j;J)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
