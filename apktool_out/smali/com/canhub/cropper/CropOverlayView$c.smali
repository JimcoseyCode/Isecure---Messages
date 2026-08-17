.class final Lcom/canhub/cropper/CropOverlayView$c;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropOverlayView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/canhub/cropper/CropOverlayView;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/CropOverlayView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView$c;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 6

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView$c;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/canhub/cropper/CropOverlayView;->a(Lcom/canhub/cropper/CropOverlayView;)Lcom/canhub/cropper/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/canhub/cropper/u;->i()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getCurrentSpanY()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x2

    .line 29
    int-to-float v4, v4

    .line 30
    div-float/2addr v3, v4

    .line 31
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getCurrentSpanX()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    div-float/2addr p1, v4

    .line 36
    sub-float v4, v2, v3

    .line 37
    .line 38
    sub-float v5, v1, p1

    .line 39
    .line 40
    add-float/2addr v1, p1

    .line 41
    add-float/2addr v2, v3

    .line 42
    cmpg-float p1, v5, v1

    .line 43
    .line 44
    if-gez p1, :cond_0

    .line 45
    .line 46
    cmpg-float p1, v4, v2

    .line 47
    .line 48
    if-gtz p1, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    cmpl-float v3, v5, p1

    .line 52
    .line 53
    if-ltz v3, :cond_0

    .line 54
    .line 55
    iget-object v3, p0, Lcom/canhub/cropper/CropOverlayView$c;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 56
    .line 57
    invoke-static {v3}, Lcom/canhub/cropper/CropOverlayView;->a(Lcom/canhub/cropper/CropOverlayView;)Lcom/canhub/cropper/u;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Lcom/canhub/cropper/u;->d()F

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    cmpg-float v3, v1, v3

    .line 66
    .line 67
    if-gtz v3, :cond_0

    .line 68
    .line 69
    cmpl-float p1, v4, p1

    .line 70
    .line 71
    if-ltz p1, :cond_0

    .line 72
    .line 73
    iget-object p1, p0, Lcom/canhub/cropper/CropOverlayView$c;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 74
    .line 75
    invoke-static {p1}, Lcom/canhub/cropper/CropOverlayView;->a(Lcom/canhub/cropper/CropOverlayView;)Lcom/canhub/cropper/u;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/canhub/cropper/u;->c()F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    cmpg-float p1, v2, p1

    .line 84
    .line 85
    if-gtz p1, :cond_0

    .line 86
    .line 87
    invoke-virtual {v0, v5, v4, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/canhub/cropper/CropOverlayView$c;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 91
    .line 92
    invoke-static {p1}, Lcom/canhub/cropper/CropOverlayView;->a(Lcom/canhub/cropper/CropOverlayView;)Lcom/canhub/cropper/u;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1, v0}, Lcom/canhub/cropper/u;->w(Landroid/graphics/RectF;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/canhub/cropper/CropOverlayView$c;->a:Lcom/canhub/cropper/CropOverlayView;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 102
    .line 103
    .line 104
    :cond_0
    const/4 p1, 0x1

    .line 105
    return p1
.end method
