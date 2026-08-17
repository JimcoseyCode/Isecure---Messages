.class public final Lexpo/modules/image/ImageUtilsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u001a2\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u001a2\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a8\u0006\r"
    }
    d2 = {
        "calcXTranslation",
        "",
        "value",
        "imageRect",
        "Landroid/graphics/RectF;",
        "viewRect",
        "isPercentage",
        "",
        "isReverse",
        "calcYTranslation",
        "calcTranslation",
        "imageRefValue",
        "viewRefValue",
        "expo-image_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final calcTranslation(FFFZZ)F
    .locals 0

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    const/high16 p3, 0x42c80000    # 100.0f

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    sub-float p0, p3, p0

    .line 8
    .line 9
    :cond_0
    div-float/2addr p0, p3

    .line 10
    sub-float/2addr p2, p1

    .line 11
    mul-float/2addr p0, p2

    .line 12
    return p0

    .line 13
    :cond_1
    if-eqz p4, :cond_2

    .line 14
    .line 15
    sub-float/2addr p2, p1

    .line 16
    sub-float/2addr p2, p0

    .line 17
    return p2

    .line 18
    :cond_2
    return p0
.end method

.method public static synthetic calcTranslation$default(FFFZZILjava/lang/Object;)F
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p3, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x10

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p4, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lexpo/modules/image/ImageUtilsKt;->calcTranslation(FFFZZ)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F
    .locals 1

    .line 1
    const-string v0, "imageRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p0, p1, p2, p3, p4}, Lexpo/modules/image/ImageUtilsKt;->calcTranslation(FFFZZ)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static synthetic calcXTranslation$default(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZILjava/lang/Object;)F
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p3, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x10

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p4, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lexpo/modules/image/ImageUtilsKt;->calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F
    .locals 1

    .line 1
    const-string v0, "imageRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p0, p1, p2, p3, p4}, Lexpo/modules/image/ImageUtilsKt;->calcTranslation(FFFZZ)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public static synthetic calcYTranslation$default(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZILjava/lang/Object;)F
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p3, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x10

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p4, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lexpo/modules/image/ImageUtilsKt;->calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
