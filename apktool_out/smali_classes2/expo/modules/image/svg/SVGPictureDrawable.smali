.class public final Lexpo/modules/image/svg/SVGPictureDrawable;
.super Landroid/graphics/drawable/PictureDrawable;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/image/svg/SVGPictureDrawable;",
        "Landroid/graphics/drawable/PictureDrawable;",
        "picture",
        "Landroid/graphics/Picture;",
        "svgIntrinsicWidth",
        "",
        "svgIntrinsicHeight",
        "<init>",
        "(Landroid/graphics/Picture;II)V",
        "getSvgIntrinsicWidth",
        "()I",
        "getSvgIntrinsicHeight",
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
.field private final svgIntrinsicHeight:I

.field private final svgIntrinsicWidth:I


# direct methods
.method public constructor <init>(Landroid/graphics/Picture;II)V
    .locals 1

    .line 1
    const-string v0, "picture"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/graphics/drawable/PictureDrawable;-><init>(Landroid/graphics/Picture;)V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lexpo/modules/image/svg/SVGPictureDrawable;->svgIntrinsicWidth:I

    .line 10
    .line 11
    iput p3, p0, Lexpo/modules/image/svg/SVGPictureDrawable;->svgIntrinsicHeight:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final getSvgIntrinsicHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/svg/SVGPictureDrawable;->svgIntrinsicHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSvgIntrinsicWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/svg/SVGPictureDrawable;->svgIntrinsicWidth:I

    .line 2
    .line 3
    return v0
.end method
