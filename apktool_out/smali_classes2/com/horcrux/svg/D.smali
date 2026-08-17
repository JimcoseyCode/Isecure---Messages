.class Lcom/horcrux/svg/D;
.super Lcom/horcrux/svg/RenderableView;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private g:Lcom/horcrux/svg/SVGLength;

.field private h:Lcom/horcrux/svg/SVGLength;

.field private i:Lcom/horcrux/svg/SVGLength;

.field private j:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/D;->g:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/D;->i:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/D;->h:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/D;->j:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 11

    .line 1
    new-instance p1, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/horcrux/svg/D;->g:Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p2, p0, Lcom/horcrux/svg/D;->h:Lcom/horcrux/svg/SVGLength;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget-object p2, p0, Lcom/horcrux/svg/D;->i:Lcom/horcrux/svg/SVGLength;

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    iget-object p2, p0, Lcom/horcrux/svg/D;->j:Lcom/horcrux/svg/SVGLength;

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    double-to-float p2, v0

    .line 31
    double-to-float v8, v2

    .line 32
    invoke-virtual {p1, p2, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 33
    .line 34
    .line 35
    double-to-float p2, v4

    .line 36
    double-to-float v8, v6

    .line 37
    invoke-virtual {p1, p2, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 38
    .line 39
    .line 40
    new-instance p2, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 46
    .line 47
    new-instance v8, Lcom/horcrux/svg/H;

    .line 48
    .line 49
    sget-object v9, Lcom/horcrux/svg/g;->i:Lcom/horcrux/svg/g;

    .line 50
    .line 51
    new-instance v10, Lcom/horcrux/svg/L;

    .line 52
    .line 53
    invoke-direct {v10, v0, v1, v2, v3}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 54
    .line 55
    .line 56
    filled-new-array {v10}, [Lcom/horcrux/svg/L;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {v8, v9, v0}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    iget-object p2, p0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 67
    .line 68
    new-instance v0, Lcom/horcrux/svg/H;

    .line 69
    .line 70
    sget-object v1, Lcom/horcrux/svg/g;->j:Lcom/horcrux/svg/g;

    .line 71
    .line 72
    new-instance v2, Lcom/horcrux/svg/L;

    .line 73
    .line 74
    invoke-direct {v2, v4, v5, v6, v7}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 75
    .line 76
    .line 77
    filled-new-array {v2}, [Lcom/horcrux/svg/L;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v0, v1, v2}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    return-object p1
.end method
