.class Lcom/horcrux/svg/c0;
.super Lcom/horcrux/svg/o0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private A:Lcom/horcrux/svg/k0;

.field private B:Lcom/horcrux/svg/n0;

.field private w:Ljava/lang/String;

.field private x:Lcom/horcrux/svg/m0;

.field private y:Lcom/horcrux/svg/l0;

.field private z:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/o0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/horcrux/svg/k0;->g:Lcom/horcrux/svg/k0;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/horcrux/svg/c0;->A:Lcom/horcrux/svg/k0;

    .line 7
    .line 8
    sget-object p1, Lcom/horcrux/svg/n0;->h:Lcom/horcrux/svg/n0;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/horcrux/svg/c0;->B:Lcom/horcrux/svg/n0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method E()Lcom/horcrux/svg/l0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/c0;->y:Lcom/horcrux/svg/l0;

    .line 2
    .line 3
    return-object v0
.end method

.method F()Lcom/horcrux/svg/m0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/c0;->x:Lcom/horcrux/svg/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method G()Lcom/horcrux/svg/SVGLength;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/c0;->z:Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    return-object v0
.end method

.method H(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/horcrux/svg/c0;->w:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/horcrux/svg/SvgView;->getDefinedTemplate(Ljava/lang/String;)Lcom/horcrux/svg/VirtualView;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lcom/horcrux/svg/RenderableView;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_0
    check-cast v0, Lcom/horcrux/svg/RenderableView;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lcom/horcrux/svg/RenderableView;->getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public I(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/c0;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/l0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/l0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/c0;->y:Lcom/horcrux/svg/l0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/m0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/m0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/c0;->x:Lcom/horcrux/svg/m0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public L(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/n0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/n0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/c0;->B:Lcom/horcrux/svg/n0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public M(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/c0;->z:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/o0;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method h()V
    .locals 0

    .line 1
    return-void
.end method

.method i()V
    .locals 0

    .line 1
    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/k0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/k0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/c0;->A:Lcom/horcrux/svg/k0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
