.class public final Lcom/canhub/cropper/k;
.super Landroid/view/animation/Animation;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field private final g:Landroid/widget/ImageView;

.field private final h:Lcom/canhub/cropper/CropOverlayView;

.field private final i:[F

.field private final j:[F

.field private final k:Landroid/graphics/RectF;

.field private final l:Landroid/graphics/RectF;

.field private final m:[F

.field private final n:[F


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V
    .locals 1

    .line 1
    const-string v0, "imageView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cropOverlayView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/canhub/cropper/k;->g:Landroid/widget/ImageView;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/canhub/cropper/k;->h:Lcom/canhub/cropper/CropOverlayView;

    .line 17
    .line 18
    const/16 p1, 0x8

    .line 19
    .line 20
    new-array p2, p1, [F

    .line 21
    .line 22
    iput-object p2, p0, Lcom/canhub/cropper/k;->i:[F

    .line 23
    .line 24
    new-array p1, p1, [F

    .line 25
    .line 26
    iput-object p1, p0, Lcom/canhub/cropper/k;->j:[F

    .line 27
    .line 28
    new-instance p1, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/canhub/cropper/k;->k:Landroid/graphics/RectF;

    .line 34
    .line 35
    new-instance p1, Landroid/graphics/RectF;

    .line 36
    .line 37
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/canhub/cropper/k;->l:Landroid/graphics/RectF;

    .line 41
    .line 42
    const/16 p1, 0x9

    .line 43
    .line 44
    new-array p2, p1, [F

    .line 45
    .line 46
    iput-object p2, p0, Lcom/canhub/cropper/k;->m:[F

    .line 47
    .line 48
    new-array p1, p1, [F

    .line 49
    .line 50
    iput-object p1, p0, Lcom/canhub/cropper/k;->n:[F

    .line 51
    .line 52
    const-wide/16 p1, 0x12c

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    invoke-virtual {p0, p1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 62
    .line 63
    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a([FLandroid/graphics/Matrix;)V
    .locals 3

    .line 1
    const-string v0, "boundPoints"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "imageMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/canhub/cropper/k;->j:[F

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/canhub/cropper/k;->l:Landroid/graphics/RectF;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/canhub/cropper/k;->h:Lcom/canhub/cropper/CropOverlayView;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/canhub/cropper/k;->n:[F

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 6

    .line 1
    const-string v0, "t"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/canhub/cropper/k;->k:Landroid/graphics/RectF;

    .line 12
    .line 13
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget-object v2, p0, Lcom/canhub/cropper/k;->l:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 18
    .line 19
    sub-float/2addr v3, v1

    .line 20
    mul-float/2addr v3, p1

    .line 21
    add-float/2addr v1, v3

    .line 22
    iput v1, p2, Landroid/graphics/RectF;->left:F

    .line 23
    .line 24
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 25
    .line 26
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 27
    .line 28
    sub-float/2addr v3, v1

    .line 29
    mul-float/2addr v3, p1

    .line 30
    add-float/2addr v1, v3

    .line 31
    iput v1, p2, Landroid/graphics/RectF;->top:F

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 34
    .line 35
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 36
    .line 37
    sub-float/2addr v3, v1

    .line 38
    mul-float/2addr v3, p1

    .line 39
    add-float/2addr v1, v3

    .line 40
    iput v1, p2, Landroid/graphics/RectF;->right:F

    .line 41
    .line 42
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 43
    .line 44
    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    .line 45
    .line 46
    sub-float/2addr v1, v0

    .line 47
    mul-float/2addr v1, p1

    .line 48
    add-float/2addr v0, v1

    .line 49
    iput v0, p2, Landroid/graphics/RectF;->bottom:F

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    new-array v1, v0, [F

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    move v3, v2

    .line 57
    :goto_0
    if-ge v3, v0, :cond_0

    .line 58
    .line 59
    iget-object v4, p0, Lcom/canhub/cropper/k;->i:[F

    .line 60
    .line 61
    aget v4, v4, v3

    .line 62
    .line 63
    iget-object v5, p0, Lcom/canhub/cropper/k;->j:[F

    .line 64
    .line 65
    aget v5, v5, v3

    .line 66
    .line 67
    sub-float/2addr v5, v4

    .line 68
    mul-float/2addr v5, p1

    .line 69
    add-float/2addr v4, v5

    .line 70
    aput v4, v1, v3

    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/k;->h:Lcom/canhub/cropper/CropOverlayView;

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p0, Lcom/canhub/cropper/k;->g:Landroid/widget/ImageView;

    .line 81
    .line 82
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iget-object v3, p0, Lcom/canhub/cropper/k;->g:Landroid/widget/ImageView;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {v0, v1, p2, v3}, Lcom/canhub/cropper/CropOverlayView;->u([FII)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 96
    .line 97
    .line 98
    const/16 p2, 0x9

    .line 99
    .line 100
    new-array v0, p2, [F

    .line 101
    .line 102
    :goto_1
    if-ge v2, p2, :cond_1

    .line 103
    .line 104
    iget-object v1, p0, Lcom/canhub/cropper/k;->m:[F

    .line 105
    .line 106
    aget v1, v1, v2

    .line 107
    .line 108
    iget-object v3, p0, Lcom/canhub/cropper/k;->n:[F

    .line 109
    .line 110
    aget v3, v3, v2

    .line 111
    .line 112
    sub-float/2addr v3, v1

    .line 113
    mul-float/2addr v3, p1

    .line 114
    add-float/2addr v1, v3

    .line 115
    aput v1, v0, v2

    .line 116
    .line 117
    add-int/lit8 v2, v2, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    iget-object p1, p0, Lcom/canhub/cropper/k;->g:Landroid/widget/ImageView;

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final b([FLandroid/graphics/Matrix;)V
    .locals 3

    .line 1
    const-string v0, "boundPoints"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "imageMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/animation/Animation;->reset()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/canhub/cropper/k;->i:[F

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/canhub/cropper/k;->k:Landroid/graphics/RectF;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/canhub/cropper/k;->h:Lcom/canhub/cropper/CropOverlayView;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/canhub/cropper/k;->m:[F

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/canhub/cropper/k;->g:Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
