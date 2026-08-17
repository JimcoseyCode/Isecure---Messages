.class public Lcom/facebook/drawee/view/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/drawee/drawable/F;


# instance fields
.field private g:Z

.field private h:Z

.field private i:Z

.field private j:LB2/b;

.field private k:LB2/a;

.field private final l:Lv2/c;


# direct methods
.method public constructor <init>(LB2/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->h:Z

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->i:Z

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 14
    .line 15
    invoke-static {}, Lv2/c;->a()Lv2/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/view/b;->q(LB2/b;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 7
    .line 8
    sget-object v1, Lv2/c$a;->m:Lv2/c$a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, LB2/a;->d()LB2/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 27
    .line 28
    invoke-interface {v0}, LB2/a;->g()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method private b()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/b;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/facebook/drawee/view/b;->i:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->a()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->e()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static c(LB2/b;Landroid/content/Context;)Lcom/facebook/drawee/view/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/drawee/view/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/drawee/view/b;-><init>(LB2/b;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/view/b;->n(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method private e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 7
    .line 8
    sget-object v1, Lv2/c$a;->n:Lv2/c$a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/drawee/view/b;->j()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 23
    .line 24
    invoke-interface {v0}, LB2/a;->c()V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method private r(Lcom/facebook/drawee/drawable/F;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/drawee/view/b;->h()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/facebook/drawee/drawable/E;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/facebook/drawee/drawable/E;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/facebook/drawee/drawable/E;->g(Lcom/facebook/drawee/drawable/F;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public d(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/b;->i:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    sget-object v1, Lv2/c$a;->w:Lv2/c$a;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    sget-object v1, Lv2/c$a;->x:Lv2/c$a;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 16
    .line 17
    .line 18
    iput-boolean p1, p0, Lcom/facebook/drawee/view/b;->i:Z

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->b()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public f()LB2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()LB2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->j:LB2/b;

    .line 2
    .line 3
    invoke-static {v0}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB2/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public h()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->j:LB2/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, LB2/b;->e()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->j:LB2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public j()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LB2/a;->d()LB2/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/facebook/drawee/view/b;->j:LB2/b;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 2
    .line 3
    sget-object v1, Lv2/c$a;->u:Lv2/c$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->h:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 2
    .line 3
    sget-object v1, Lv2/c$a;->v:Lv2/c$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->h:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public m(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/drawee/view/b;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 10
    .line 11
    invoke-interface {v0, p1}, LB2/a;->e(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public n(Landroid/content/Context;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/facebook/drawee/view/b;->p(LB2/a;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public onDraw()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, Lcom/facebook/drawee/view/b;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v1, Lv2/c;

    .line 33
    .line 34
    const-string v2, "%x: Draw requested for a non-attached controller %x. %s"

    .line 35
    .line 36
    invoke-static {v1, v2, v0}, Ld2/a;->G(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->h:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/facebook/drawee/view/b;->i:Z

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->b()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public p(LB2/a;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->e()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/drawee/view/b;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 15
    .line 16
    sget-object v2, Lv2/c$a;->j:Lv2/c$a;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lv2/c;->b(Lv2/c$a;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-interface {v1, v2}, LB2/a;->b(LB2/b;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object p1, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 32
    .line 33
    sget-object v1, Lv2/c$a;->i:Lv2/c$a;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/facebook/drawee/view/b;->j:LB2/b;

    .line 41
    .line 42
    invoke-interface {p1, v1}, LB2/a;->b(LB2/b;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object p1, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 47
    .line 48
    sget-object v1, Lv2/c$a;->k:Lv2/c$a;

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-direct {p0}, Lcom/facebook/drawee/view/b;->a()V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method public q(LB2/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 2
    .line 3
    sget-object v1, Lv2/c$a;->g:Lv2/c$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lv2/c;->b(Lv2/c$a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/drawee/view/b;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, v1}, Lcom/facebook/drawee/view/b;->r(Lcom/facebook/drawee/drawable/F;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LB2/b;

    .line 21
    .line 22
    iput-object v1, p0, Lcom/facebook/drawee/view/b;->j:LB2/b;

    .line 23
    .line 24
    invoke-interface {v1}, LB2/b;->e()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 40
    :goto_1
    invoke-virtual {p0, v1}, Lcom/facebook/drawee/view/b;->d(Z)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p0}, Lcom/facebook/drawee/view/b;->r(Lcom/facebook/drawee/drawable/F;)V

    .line 44
    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/facebook/drawee/view/b;->k:LB2/a;

    .line 49
    .line 50
    invoke-interface {v0, p1}, LB2/a;->b(LB2/b;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lc2/i;->b(Ljava/lang/Object;)Lc2/i$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "controllerAttached"

    .line 6
    .line 7
    iget-boolean v2, p0, Lcom/facebook/drawee/view/b;->g:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lc2/i$a;->c(Ljava/lang/String;Z)Lc2/i$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "holderAttached"

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/facebook/drawee/view/b;->h:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lc2/i$a;->c(Ljava/lang/String;Z)Lc2/i$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "drawableVisible"

    .line 22
    .line 23
    iget-boolean v2, p0, Lcom/facebook/drawee/view/b;->i:Z

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lc2/i$a;->c(Ljava/lang/String;Z)Lc2/i$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/facebook/drawee/view/b;->l:Lv2/c;

    .line 30
    .line 31
    invoke-virtual {v1}, Lv2/c;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "events"

    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Lc2/i$a;->b(Ljava/lang/String;Ljava/lang/Object;)Lc2/i$a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lc2/i$a;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
