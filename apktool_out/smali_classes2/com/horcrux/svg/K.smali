.class Lcom/horcrux/svg/K;
.super Lcom/horcrux/svg/B;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final y:[F


# instance fields
.field private l:Lcom/horcrux/svg/SVGLength;

.field private m:Lcom/horcrux/svg/SVGLength;

.field private n:Lcom/horcrux/svg/SVGLength;

.field private o:Lcom/horcrux/svg/SVGLength;

.field private p:Lcom/horcrux/svg/a$b;

.field private q:Lcom/horcrux/svg/a$b;

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field v:Ljava/lang/String;

.field w:I

.field private x:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/horcrux/svg/K;->y:[F

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/B;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/K;->x:Landroid/graphics/Matrix;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method getViewBox()Landroid/graphics/RectF;
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, p0, Lcom/horcrux/svg/K;->r:F

    .line 4
    .line 5
    iget v2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 6
    .line 7
    mul-float v3, v1, v2

    .line 8
    .line 9
    iget v4, p0, Lcom/horcrux/svg/K;->s:F

    .line 10
    .line 11
    mul-float v5, v4, v2

    .line 12
    .line 13
    iget v6, p0, Lcom/horcrux/svg/K;->t:F

    .line 14
    .line 15
    add-float/2addr v1, v6

    .line 16
    mul-float/2addr v1, v2

    .line 17
    iget v6, p0, Lcom/horcrux/svg/K;->u:F

    .line 18
    .line 19
    add-float/2addr v4, v6

    .line 20
    mul-float/2addr v4, v2

    .line 21
    invoke-direct {v0, v3, v5, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public n(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/K;->o:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lcom/horcrux/svg/a$b;->h:Lcom/horcrux/svg/a$b;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/K;->q:Lcom/horcrux/svg/a$b;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    sget-object p1, Lcom/horcrux/svg/a$b;->g:Lcom/horcrux/svg/a$b;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/horcrux/svg/K;->q:Lcom/horcrux/svg/a$b;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public p(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    sget-object v0, Lcom/horcrux/svg/K;->y:[F

    .line 4
    .line 5
    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lcom/horcrux/svg/M;->c(Lcom/facebook/react/bridge/ReadableArray;[FF)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x6

    .line 12
    if-ne p1, v1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lcom/horcrux/svg/K;->x:Landroid/graphics/Matrix;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/horcrux/svg/K;->x:Landroid/graphics/Matrix;

    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/K;->x:Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, -0x1

    .line 32
    if-eq p1, v0, :cond_3

    .line 33
    .line 34
    const-string p1, "ReactNative"

    .line 35
    .line 36
    const-string v0, "RNSVG: Transform matrices must be of size 6"

    .line 37
    .line 38
    invoke-static {p1, v0}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 p1, 0x0

    .line 43
    iput-object p1, p0, Lcom/horcrux/svg/K;->x:Landroid/graphics/Matrix;

    .line 44
    .line 45
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public q(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lcom/horcrux/svg/a$b;->h:Lcom/horcrux/svg/a$b;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/K;->p:Lcom/horcrux/svg/a$b;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    sget-object p1, Lcom/horcrux/svg/a$b;->g:Lcom/horcrux/svg/a$b;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/horcrux/svg/K;->p:Lcom/horcrux/svg/a$b;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public r(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/K;->n:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public s(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/K;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method saveDefinition()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/horcrux/svg/K;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/horcrux/svg/K;->m:Lcom/horcrux/svg/SVGLength;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/horcrux/svg/K;->n:Lcom/horcrux/svg/SVGLength;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/horcrux/svg/K;->o:Lcom/horcrux/svg/SVGLength;

    .line 12
    .line 13
    filled-new-array {v0, v1, v2, v3}, [Lcom/horcrux/svg/SVGLength;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/horcrux/svg/a;

    .line 18
    .line 19
    sget-object v2, Lcom/horcrux/svg/a$a;->i:Lcom/horcrux/svg/a$a;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/horcrux/svg/K;->p:Lcom/horcrux/svg/a$b;

    .line 22
    .line 23
    invoke-direct {v1, v2, v0, v3}, Lcom/horcrux/svg/a;-><init>(Lcom/horcrux/svg/a$a;[Lcom/horcrux/svg/SVGLength;Lcom/horcrux/svg/a$b;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/horcrux/svg/K;->q:Lcom/horcrux/svg/a$b;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/horcrux/svg/a;->d(Lcom/horcrux/svg/a$b;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Lcom/horcrux/svg/a;->g(Lcom/horcrux/svg/K;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/horcrux/svg/K;->x:Landroid/graphics/Matrix;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lcom/horcrux/svg/a;->f(Landroid/graphics/Matrix;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v2, p0, Lcom/horcrux/svg/K;->p:Lcom/horcrux/svg/a$b;

    .line 46
    .line 47
    sget-object v3, Lcom/horcrux/svg/a$b;->h:Lcom/horcrux/svg/a$b;

    .line 48
    .line 49
    if-eq v2, v3, :cond_1

    .line 50
    .line 51
    iget-object v2, p0, Lcom/horcrux/svg/K;->q:Lcom/horcrux/svg/a$b;

    .line 52
    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->getCanvasBounds()Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Lcom/horcrux/svg/a;->h(Landroid/graphics/Rect;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Lcom/horcrux/svg/SvgView;->defineBrush(Lcom/horcrux/svg/a;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void
.end method

.method public setAlign(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/K;->v:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMeetOrSlice(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/horcrux/svg/K;->w:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMinX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/horcrux/svg/K;->r:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMinY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/horcrux/svg/K;->s:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setVbHeight(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/horcrux/svg/K;->u:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setVbWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/horcrux/svg/K;->t:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public t(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/K;->m:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
