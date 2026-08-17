.class Lcom/horcrux/svg/E;
.super Lcom/horcrux/svg/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final n:[F


# instance fields
.field private g:Lcom/horcrux/svg/SVGLength;

.field private h:Lcom/horcrux/svg/SVGLength;

.field private i:Lcom/horcrux/svg/SVGLength;

.field private j:Lcom/horcrux/svg/SVGLength;

.field private k:Lcom/facebook/react/bridge/ReadableArray;

.field private l:Lcom/horcrux/svg/a$b;

.field private m:Landroid/graphics/Matrix;


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
    sput-object v0, Lcom/horcrux/svg/E;->n:[F

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
    invoke-direct {p0, p1}, Lcom/horcrux/svg/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/E;->m:Landroid/graphics/Matrix;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public c(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/E;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    sget-object v0, Lcom/horcrux/svg/E;->n:[F

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
    iget-object p1, p0, Lcom/horcrux/svg/E;->m:Landroid/graphics/Matrix;

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
    iput-object p1, p0, Lcom/horcrux/svg/E;->m:Landroid/graphics/Matrix;

    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/E;->m:Landroid/graphics/Matrix;

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
    iput-object p1, p0, Lcom/horcrux/svg/E;->m:Landroid/graphics/Matrix;

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

.method public e(I)V
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
    iput-object p1, p0, Lcom/horcrux/svg/E;->l:Lcom/horcrux/svg/a$b;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    sget-object p1, Lcom/horcrux/svg/a$b;->g:Lcom/horcrux/svg/a$b;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/horcrux/svg/E;->l:Lcom/horcrux/svg/a$b;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 17
    .line 18
    .line 19
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
    iput-object p1, p0, Lcom/horcrux/svg/E;->g:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/E;->i:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/E;->h:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/E;->j:Lcom/horcrux/svg/SVGLength;

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
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/horcrux/svg/E;->g:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/horcrux/svg/E;->h:Lcom/horcrux/svg/SVGLength;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/horcrux/svg/E;->i:Lcom/horcrux/svg/SVGLength;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/horcrux/svg/E;->j:Lcom/horcrux/svg/SVGLength;

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
    sget-object v2, Lcom/horcrux/svg/a$a;->g:Lcom/horcrux/svg/a$a;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/horcrux/svg/E;->l:Lcom/horcrux/svg/a$b;

    .line 22
    .line 23
    invoke-direct {v1, v2, v0, v3}, Lcom/horcrux/svg/a;-><init>(Lcom/horcrux/svg/a$a;[Lcom/horcrux/svg/SVGLength;Lcom/horcrux/svg/a$b;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/horcrux/svg/E;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/horcrux/svg/a;->e(Lcom/facebook/react/bridge/ReadableArray;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/horcrux/svg/E;->m:Landroid/graphics/Matrix;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lcom/horcrux/svg/a;->f(Landroid/graphics/Matrix;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v2, p0, Lcom/horcrux/svg/E;->l:Lcom/horcrux/svg/a$b;

    .line 43
    .line 44
    sget-object v3, Lcom/horcrux/svg/a$b;->h:Lcom/horcrux/svg/a$b;

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->getCanvasBounds()Landroid/graphics/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Lcom/horcrux/svg/a;->h(Landroid/graphics/Rect;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Lcom/horcrux/svg/SvgView;->defineBrush(Lcom/horcrux/svg/a;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method
