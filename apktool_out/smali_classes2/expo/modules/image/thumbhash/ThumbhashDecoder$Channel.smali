.class final Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/image/thumbhash/ThumbhashDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Channel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0014\n\u0002\u0008\u0006\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J&\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;",
        "",
        "nx",
        "",
        "ny",
        "<init>",
        "(II)V",
        "ac",
        "",
        "getAc",
        "()[F",
        "setAc",
        "([F)V",
        "decode",
        "hash",
        "",
        "start",
        "index",
        "scale",
        "",
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
.field private ac:[F


# direct methods
.method public constructor <init>(II)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, p2, :cond_2

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    move v3, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v3, 0x1

    .line 14
    :goto_1
    mul-int v4, v3, p2

    .line 15
    .line 16
    sub-int v5, p2, v1

    .line 17
    .line 18
    mul-int/2addr v5, p1

    .line 19
    if-ge v4, v5, :cond_1

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    new-array p1, v2, [F

    .line 30
    .line 31
    iput-object p1, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->ac:[F

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final decode([BIIF)I
    .locals 5

    .line 1
    const-string v0, "hash"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->ac:[F

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    shr-int/lit8 v2, p3, 0x1

    .line 13
    .line 14
    add-int/2addr v2, p2

    .line 15
    aget-byte v2, p1, v2

    .line 16
    .line 17
    and-int/lit8 v3, p3, 0x1

    .line 18
    .line 19
    shl-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    shr-int/2addr v2, v3

    .line 22
    iget-object v3, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->ac:[F

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0xf

    .line 25
    .line 26
    int-to-float v2, v2

    .line 27
    const/high16 v4, 0x40f00000    # 7.5f

    .line 28
    .line 29
    div-float/2addr v2, v4

    .line 30
    const/high16 v4, 0x3f800000    # 1.0f

    .line 31
    .line 32
    sub-float/2addr v2, v4

    .line 33
    mul-float/2addr v2, p4

    .line 34
    aput v2, v3, v1

    .line 35
    .line 36
    add-int/lit8 p3, p3, 0x1

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return p3
.end method

.method public final getAc()[F
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->ac:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final setAc([F)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->ac:[F

    .line 7
    .line 8
    return-void
.end method
