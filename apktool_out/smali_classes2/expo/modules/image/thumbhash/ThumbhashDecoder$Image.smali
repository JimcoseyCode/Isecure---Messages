.class public final Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/image/thumbhash/ThumbhashDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Image"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\n\"\u0004\u0008\u000e\u0010\u000cR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;",
        "",
        "width",
        "",
        "height",
        "rgba",
        "",
        "<init>",
        "(II[B)V",
        "getWidth",
        "()I",
        "setWidth",
        "(I)V",
        "getHeight",
        "setHeight",
        "getRgba",
        "()[B",
        "setRgba",
        "([B)V",
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
.field private height:I

.field private rgba:[B

.field private width:I


# direct methods
.method public constructor <init>(II[B)V
    .locals 1

    .line 1
    const-string v0, "rgba"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->width:I

    .line 10
    .line 11
    iput p2, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->height:I

    .line 12
    .line 13
    iput-object p3, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->rgba:[B

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->height:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRgba()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->rgba:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->width:I

    .line 2
    .line 3
    return v0
.end method

.method public final setHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->height:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRgba([B)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->rgba:[B

    .line 7
    .line 8
    return-void
.end method

.method public final setWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->width:I

    .line 2
    .line 3
    return-void
.end method
