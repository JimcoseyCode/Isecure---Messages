.class public final Lexpo/modules/image/PlaceholderDownsampleStrategy;
.super Lexpo/modules/image/CustomDownsampleStrategy;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J/\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lexpo/modules/image/PlaceholderDownsampleStrategy;",
        "Lexpo/modules/image/CustomDownsampleStrategy;",
        "Lexpo/modules/image/ImageViewWrapperTarget;",
        "target",
        "<init>",
        "(Lexpo/modules/image/ImageViewWrapperTarget;)V",
        "",
        "sourceWidth",
        "sourceHeight",
        "requestedWidth",
        "requestedHeight",
        "",
        "getScaleFactor",
        "(IIII)F",
        "Lcom/bumptech/glide/load/resource/bitmap/n$g;",
        "getSampleSizeRounding",
        "(IIII)Lcom/bumptech/glide/load/resource/bitmap/n$g;",
        "Lexpo/modules/image/ImageViewWrapperTarget;",
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
.field private final target:Lexpo/modules/image/ImageViewWrapperTarget;

.field private wasTriggered:Z


# direct methods
.method public constructor <init>(Lexpo/modules/image/ImageViewWrapperTarget;)V
    .locals 1

    .line 1
    const-string v0, "target"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/image/CustomDownsampleStrategy;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/image/PlaceholderDownsampleStrategy;->target:Lexpo/modules/image/ImageViewWrapperTarget;

    .line 10
    .line 11
    return-void
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
    .locals 0

    .line 1
    iget-boolean p3, p0, Lexpo/modules/image/PlaceholderDownsampleStrategy;->wasTriggered:Z

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lexpo/modules/image/PlaceholderDownsampleStrategy;->target:Lexpo/modules/image/ImageViewWrapperTarget;

    .line 6
    .line 7
    invoke-virtual {p3, p1}, Lexpo/modules/image/ImageViewWrapperTarget;->setPlaceholderWidth(I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lexpo/modules/image/PlaceholderDownsampleStrategy;->target:Lexpo/modules/image/ImageViewWrapperTarget;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lexpo/modules/image/ImageViewWrapperTarget;->setPlaceholderHeight(I)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lexpo/modules/image/PlaceholderDownsampleStrategy;->wasTriggered:Z

    .line 17
    .line 18
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    return p1
.end method
