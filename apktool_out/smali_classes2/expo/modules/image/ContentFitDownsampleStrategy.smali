.class public final Lexpo/modules/image/ContentFitDownsampleStrategy;
.super Lexpo/modules/image/CustomDownsampleStrategy;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/ContentFitDownsampleStrategy$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lexpo/modules/image/ContentFitDownsampleStrategy;",
        "Lexpo/modules/image/CustomDownsampleStrategy;",
        "Lexpo/modules/image/ImageViewWrapperTarget;",
        "target",
        "Lexpo/modules/image/enums/ContentFit;",
        "contentFit",
        "<init>",
        "(Lexpo/modules/image/ImageViewWrapperTarget;Lexpo/modules/image/enums/ContentFit;)V",
        "",
        "sourceWidth",
        "sourceHeight",
        "requestedWidth",
        "requestedHeight",
        "calculateScaleFactor",
        "(FFFF)F",
        "",
        "getScaleFactor",
        "(IIII)F",
        "Lcom/bumptech/glide/load/resource/bitmap/n$g;",
        "getSampleSizeRounding",
        "(IIII)Lcom/bumptech/glide/load/resource/bitmap/n$g;",
        "Lexpo/modules/image/ImageViewWrapperTarget;",
        "Lexpo/modules/image/enums/ContentFit;",
        "",
        "wasTriggered",
        "Z",
        "expo-image_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final contentFit:Lexpo/modules/image/enums/ContentFit;

.field private final target:Lexpo/modules/image/ImageViewWrapperTarget;

.field private wasTriggered:Z


# direct methods
.method public constructor <init>(Lexpo/modules/image/ImageViewWrapperTarget;Lexpo/modules/image/enums/ContentFit;)V
    .locals 1

    .line 1
    const-string v0, "target"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentFit"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lexpo/modules/image/CustomDownsampleStrategy;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/image/ContentFitDownsampleStrategy;->target:Lexpo/modules/image/ImageViewWrapperTarget;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/image/ContentFitDownsampleStrategy;->contentFit:Lexpo/modules/image/enums/ContentFit;

    .line 17
    .line 18
    return-void
.end method

.method private final calculateScaleFactor(FFFF)F
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/image/ContentFitDownsampleStrategy;->contentFit:Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/image/ContentFitDownsampleStrategy$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_3

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    const/high16 v2, 0x3f800000    # 1.0f

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    cmpg-float v0, p3, p1

    .line 24
    .line 25
    if-ltz v0, :cond_2

    .line 26
    .line 27
    cmpg-float v0, p4, p2

    .line 28
    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v2

    .line 33
    :cond_2
    :goto_0
    div-float/2addr p3, p1

    .line 34
    div-float/2addr p4, p2

    .line 35
    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    :cond_3
    div-float/2addr p3, p1

    .line 41
    div-float/2addr p4, p2

    .line 42
    invoke-static {p3, p4}, Ljava/lang/Float;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_4
    div-float/2addr p3, p1

    .line 48
    div-float/2addr p4, p2

    .line 49
    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1
.end method


# virtual methods
.method public getSampleSizeRounding(IIII)Lcom/bumptech/glide/load/resource/bitmap/n$g;
    .locals 0

    .line 1
    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/n$g;->h:Lcom/bumptech/glide/load/resource/bitmap/n$g;

    .line 2
    .line 3
    return-object p1
.end method

.method public getScaleFactor(IIII)F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lexpo/modules/image/ContentFitDownsampleStrategy;->wasTriggered:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lexpo/modules/image/ContentFitDownsampleStrategy;->target:Lexpo/modules/image/ImageViewWrapperTarget;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lexpo/modules/image/ImageViewWrapperTarget;->setSourceWidth(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lexpo/modules/image/ContentFitDownsampleStrategy;->target:Lexpo/modules/image/ImageViewWrapperTarget;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lexpo/modules/image/ImageViewWrapperTarget;->setSourceHeight(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lexpo/modules/image/ContentFitDownsampleStrategy;->wasTriggered:Z

    .line 17
    .line 18
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    const/high16 v1, -0x80000000

    .line 21
    .line 22
    if-eq p3, v1, :cond_2

    .line 23
    .line 24
    if-ne p4, v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    int-to-float p1, p1

    .line 28
    int-to-float p2, p2

    .line 29
    int-to-float p3, p3

    .line 30
    int-to-float p4, p4

    .line 31
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/image/ContentFitDownsampleStrategy;->calculateScaleFactor(FFFF)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    :cond_2
    :goto_0
    return v0
.end method
