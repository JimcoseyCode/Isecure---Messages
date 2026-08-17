.class Lcom/horcrux/svg/F;
.super Lcom/horcrux/svg/B;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private l:Lcom/horcrux/svg/SVGLength;

.field private m:Lcom/horcrux/svg/SVGLength;

.field private n:Lcom/horcrux/svg/SVGLength;

.field private o:Lcom/horcrux/svg/SVGLength;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field v:Ljava/lang/String;

.field w:I

.field x:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/B;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method n(Landroid/graphics/Canvas;Landroid/graphics/Paint;FLcom/horcrux/svg/N;F)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mCTM:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/horcrux/svg/VirtualView;->saveAndSetupCanvas(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p4, Lcom/horcrux/svg/N;->b:Lcom/horcrux/svg/L;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 15
    .line 16
    iget-wide v3, v1, Lcom/horcrux/svg/L;->a:D

    .line 17
    .line 18
    double-to-float v3, v3

    .line 19
    iget-wide v4, v1, Lcom/horcrux/svg/L;->b:D

    .line 20
    .line 21
    double-to-float v1, v4

    .line 22
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 23
    .line 24
    .line 25
    const-string v1, "auto"

    .line 26
    .line 27
    iget-object v2, p0, Lcom/horcrux/svg/F;->q:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    move-wide v4, v2

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v1, p0, Lcom/horcrux/svg/F;->q:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    :goto_0
    cmpl-double v1, v4, v2

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-wide v4, p4, Lcom/horcrux/svg/N;->c:D

    .line 50
    .line 51
    :cond_1
    double-to-float p4, v4

    .line 52
    const/high16 v1, 0x43340000    # 180.0f

    .line 53
    .line 54
    add-float/2addr p4, v1

    .line 55
    iget-object v1, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 56
    .line 57
    invoke-virtual {v1, p4}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 58
    .line 59
    .line 60
    const-string p4, "strokeWidth"

    .line 61
    .line 62
    iget-object v1, p0, Lcom/horcrux/svg/F;->p:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p4

    .line 68
    if-eqz p4, :cond_2

    .line 69
    .line 70
    iget-object p4, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 71
    .line 72
    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 73
    .line 74
    div-float v2, p5, v1

    .line 75
    .line 76
    div-float/2addr p5, v1

    .line 77
    invoke-virtual {p4, v2, p5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object p4, p0, Lcom/horcrux/svg/F;->n:Lcom/horcrux/svg/SVGLength;

    .line 81
    .line 82
    invoke-virtual {p0, p4}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 83
    .line 84
    .line 85
    move-result-wide p4

    .line 86
    iget-object v1, p0, Lcom/horcrux/svg/F;->o:Lcom/horcrux/svg/SVGLength;

    .line 87
    .line 88
    invoke-virtual {p0, v1}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    new-instance v3, Landroid/graphics/RectF;

    .line 93
    .line 94
    double-to-float p4, p4

    .line 95
    double-to-float p5, v1

    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-direct {v3, v1, v1, p4, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 98
    .line 99
    .line 100
    iget-object p4, p0, Lcom/horcrux/svg/F;->v:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz p4, :cond_3

    .line 103
    .line 104
    new-instance p4, Landroid/graphics/RectF;

    .line 105
    .line 106
    iget p5, p0, Lcom/horcrux/svg/F;->r:F

    .line 107
    .line 108
    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 109
    .line 110
    mul-float v2, p5, v1

    .line 111
    .line 112
    iget v4, p0, Lcom/horcrux/svg/F;->s:F

    .line 113
    .line 114
    mul-float v5, v4, v1

    .line 115
    .line 116
    iget v6, p0, Lcom/horcrux/svg/F;->t:F

    .line 117
    .line 118
    add-float/2addr p5, v6

    .line 119
    mul-float/2addr p5, v1

    .line 120
    iget v6, p0, Lcom/horcrux/svg/F;->u:F

    .line 121
    .line 122
    add-float/2addr v4, v6

    .line 123
    mul-float/2addr v4, v1

    .line 124
    invoke-direct {p4, v2, v5, p5, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 125
    .line 126
    .line 127
    iget-object p5, p0, Lcom/horcrux/svg/F;->v:Ljava/lang/String;

    .line 128
    .line 129
    iget v1, p0, Lcom/horcrux/svg/F;->w:I

    .line 130
    .line 131
    invoke-static {p4, v3, p5, v1}, Lcom/horcrux/svg/q0;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;

    .line 132
    .line 133
    .line 134
    move-result-object p4

    .line 135
    const/16 p5, 0x9

    .line 136
    .line 137
    new-array p5, p5, [F

    .line 138
    .line 139
    invoke-virtual {p4, p5}, Landroid/graphics/Matrix;->getValues([F)V

    .line 140
    .line 141
    .line 142
    iget-object p4, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 143
    .line 144
    const/4 v1, 0x0

    .line 145
    aget v1, p5, v1

    .line 146
    .line 147
    const/4 v2, 0x4

    .line 148
    aget p5, p5, v2

    .line 149
    .line 150
    invoke-virtual {p4, v1, p5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 151
    .line 152
    .line 153
    :cond_3
    iget-object p4, p0, Lcom/horcrux/svg/F;->l:Lcom/horcrux/svg/SVGLength;

    .line 154
    .line 155
    invoke-virtual {p0, p4}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 156
    .line 157
    .line 158
    move-result-wide p4

    .line 159
    iget-object v1, p0, Lcom/horcrux/svg/F;->m:Lcom/horcrux/svg/SVGLength;

    .line 160
    .line 161
    invoke-virtual {p0, v1}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 162
    .line 163
    .line 164
    move-result-wide v1

    .line 165
    iget-object v3, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 166
    .line 167
    neg-double p4, p4

    .line 168
    double-to-float p4, p4

    .line 169
    neg-double v1, v1

    .line 170
    double-to-float p5, v1

    .line 171
    invoke-virtual {v3, p4, p5}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 172
    .line 173
    .line 174
    iget-object p4, p0, Lcom/horcrux/svg/F;->x:Landroid/graphics/Matrix;

    .line 175
    .line 176
    invoke-virtual {p1, p4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p1, v0}, Lcom/horcrux/svg/VirtualView;->restoreCanvas(Landroid/graphics/Canvas;I)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public o(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/F;->o:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/F;->p:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/F;->n:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/F;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
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
    iput-object p1, p0, Lcom/horcrux/svg/F;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method saveDefinition()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Lcom/horcrux/svg/SvgView;->defineMarker(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ge v0, v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    instance-of v2, v1, Lcom/horcrux/svg/VirtualView;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    check-cast v1, Lcom/horcrux/svg/VirtualView;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/horcrux/svg/VirtualView;->saveDefinition()V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public setAlign(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/F;->v:Ljava/lang/String;

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
    iput p1, p0, Lcom/horcrux/svg/F;->w:I

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
    iput p1, p0, Lcom/horcrux/svg/F;->r:F

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
    iput p1, p0, Lcom/horcrux/svg/F;->s:F

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
    iput p1, p0, Lcom/horcrux/svg/F;->u:F

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
    iput p1, p0, Lcom/horcrux/svg/F;->t:F

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
    iput-object p1, p0, Lcom/horcrux/svg/F;->m:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
