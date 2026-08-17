.class Lcom/horcrux/svg/o0;
.super Lcom/horcrux/svg/B;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field l:Lcom/horcrux/svg/SVGLength;

.field m:Lcom/horcrux/svg/SVGLength;

.field private n:Ljava/lang/String;

.field o:Lcom/horcrux/svg/j0;

.field private p:Lcom/horcrux/svg/d0;

.field private q:Ljava/util/ArrayList;

.field private r:Ljava/util/ArrayList;

.field private s:Ljava/util/ArrayList;

.field private t:Ljava/util/ArrayList;

.field private u:Ljava/util/ArrayList;

.field v:D


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/B;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/horcrux/svg/o0;->m:Lcom/horcrux/svg/SVGLength;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 10
    .line 11
    sget-object p1, Lcom/horcrux/svg/j0;->g:Lcom/horcrux/svg/j0;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/horcrux/svg/o0;->o:Lcom/horcrux/svg/j0;

    .line 14
    .line 15
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public A(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->a(Lcom/facebook/react/bridge/Dynamic;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->r:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public B(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->a(Lcom/facebook/react/bridge/Dynamic;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->s:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public C(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->m:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public D(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->c(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Lcom/horcrux/svg/d0;->j(Ljava/lang/String;)Lcom/horcrux/svg/d0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iput-object v2, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    sget-object v2, Lcom/horcrux/svg/d0;->h:Lcom/horcrux/svg/d0;

    .line 30
    .line 31
    iput-object v2, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 32
    .line 33
    :goto_0
    const/4 v2, 0x0

    .line 34
    :try_start_1
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catch_1
    iput-object v0, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    sget-object p1, Lcom/horcrux/svg/d0;->h:Lcom/horcrux/svg/d0;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 49
    .line 50
    :goto_1
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method clearCache()V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 4
    .line 5
    invoke-super {p0}, Lcom/horcrux/svg/VirtualView;->clearCache()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/horcrux/svg/B;->m(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualView;->clip(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/o0;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->i()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->h()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method f(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Region$Op;)Landroid/graphics/Path;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/o0;->getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/horcrux/svg/B;->m(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/o0;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method i()V
    .locals 10

    .line 1
    instance-of v0, p0, Lcom/horcrux/svg/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p0, Lcom/horcrux/svg/b0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :goto_0
    move v2, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :goto_1
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->g()Lcom/horcrux/svg/z;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v4, p0, Lcom/horcrux/svg/B;->g:Lcom/facebook/react/bridge/ReadableMap;

    .line 19
    .line 20
    iget-object v5, p0, Lcom/horcrux/svg/o0;->q:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v6, p0, Lcom/horcrux/svg/o0;->r:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v7, p0, Lcom/horcrux/svg/o0;->t:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v8, p0, Lcom/horcrux/svg/o0;->u:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v9, p0, Lcom/horcrux/svg/o0;->s:Ljava/util/ArrayList;

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    invoke-virtual/range {v1 .. v9}, Lcom/horcrux/svg/z;->p(ZLcom/horcrux/svg/o0;Lcom/facebook/react/bridge/ReadableMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public invalidate()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-super {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->s()Lcom/horcrux/svg/o0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/horcrux/svg/VirtualView;->clearChildCache()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method n()Lcom/horcrux/svg/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    instance-of v1, v0, Lcom/horcrux/svg/o0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Lcom/horcrux/svg/o0;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v1, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    sget-object v0, Lcom/horcrux/svg/d0;->h:Lcom/horcrux/svg/d0;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 39
    .line 40
    return-object v0
.end method

.method o()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    instance-of v1, v0, Lcom/horcrux/svg/o0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Lcom/horcrux/svg/o0;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v1, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 31
    .line 32
    return-object v0
.end method

.method p(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->i()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/B;->getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->h()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 19
    .line 20
    return-object p1
.end method

.method q(Landroid/graphics/Paint;)D
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    instance-of v4, v3, Lcom/horcrux/svg/o0;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    check-cast v3, Lcom/horcrux/svg/o0;

    .line 30
    .line 31
    invoke-virtual {v3, p1}, Lcom/horcrux/svg/o0;->q(Landroid/graphics/Paint;)D

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    add-double/2addr v0, v3

    .line 36
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iput-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 40
    .line 41
    return-wide v0
.end method

.method r()Lcom/horcrux/svg/o0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->g()Lcom/horcrux/svg/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/horcrux/svg/z;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/lit8 v2, v2, -0x1

    .line 16
    .line 17
    move-object v3, p0

    .line 18
    :goto_0
    if-ltz v2, :cond_1

    .line 19
    .line 20
    instance-of v4, v1, Lcom/horcrux/svg/o0;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lcom/horcrux/svg/x;

    .line 29
    .line 30
    iget-object v4, v4, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/h0;

    .line 31
    .line 32
    sget-object v5, Lcom/horcrux/svg/h0;->g:Lcom/horcrux/svg/h0;

    .line 33
    .line 34
    if-eq v4, v5, :cond_1

    .line 35
    .line 36
    iget-object v4, v3, Lcom/horcrux/svg/o0;->q:Ljava/util/ArrayList;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    move-object v3, v1

    .line 42
    check-cast v3, Lcom/horcrux/svg/o0;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    add-int/lit8 v2, v2, -0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :goto_1
    return-object v3
.end method

.method s()Lcom/horcrux/svg/o0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v1, p0

    .line 6
    :goto_0
    instance-of v2, v0, Lcom/horcrux/svg/o0;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Lcom/horcrux/svg/o0;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v1
.end method

.method public t(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->c(Lcom/facebook/react/bridge/Dynamic;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public u(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->a(Lcom/facebook/react/bridge/Dynamic;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->t:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public v(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->a(Lcom/facebook/react/bridge/Dynamic;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->u:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public w(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/j0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->o:Lcom/horcrux/svg/j0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/d0;->j(Ljava/lang/String;)Lcom/horcrux/svg/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->p:Lcom/horcrux/svg/d0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public z(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->a(Lcom/facebook/react/bridge/Dynamic;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/o0;->q:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
