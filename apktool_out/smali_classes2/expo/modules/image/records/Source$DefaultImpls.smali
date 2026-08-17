.class public final Lexpo/modules/image/records/Source$DefaultImpls;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/image/records/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getPixelCount(Lexpo/modules/image/records/Source;)D
    .locals 4

    .line 1
    invoke-interface {p0}, Lexpo/modules/image/records/Source;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0}, Lexpo/modules/image/records/Source;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-int/2addr v0, v1

    .line 10
    int-to-double v0, v0

    .line 11
    invoke-interface {p0}, Lexpo/modules/image/records/Source;->getScale()D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    mul-double/2addr v0, v2

    .line 16
    invoke-interface {p0}, Lexpo/modules/image/records/Source;->getScale()D

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    mul-double/2addr v0, v2

    .line 21
    return-wide v0
.end method

.method public static usesPlaceholderContentFit(Lexpo/modules/image/records/Source;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
