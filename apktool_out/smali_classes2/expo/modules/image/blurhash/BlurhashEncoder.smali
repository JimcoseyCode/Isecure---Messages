.class public final Lexpo/modules/image/blurhash/BlurhashEncoder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0015\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ;\u0010\u0012\u001a\u00020\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\n\u0010\u0011\u001a\u00060\u0007j\u0002`\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013JS\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J1\u0010\"\u001a\u00020\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010!\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\"\u0010#JQ\u0010\'\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\'\u0010(J)\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008+\u0010,R\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u0006/"
    }
    d2 = {
        "Lexpo/modules/image/blurhash/BlurhashEncoder;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Pair;",
        "",
        "numberOfComponents",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "hashBuilder",
        "Li7/B;",
        "encodeFlag",
        "(Lkotlin/Pair;Ljava/lang/StringBuilder;)V",
        "",
        "Li7/s;",
        "",
        "ac",
        "hash",
        "encodeMaximumValue",
        "(Ljava/util/List;Ljava/lang/StringBuilder;)F",
        "",
        "pixels",
        "width",
        "height",
        "calculateBlurFactors",
        "([IIILkotlin/Pair;)Ljava/util/List;",
        "value",
        "length",
        "",
        "encode83",
        "(II)Ljava/lang/String;",
        "encodeDC",
        "(Li7/s;)I",
        "maximumValue",
        "encodeAC",
        "(Li7/s;F)I",
        "x",
        "y",
        "normalisation",
        "multiplyBasisFunction",
        "([IIIIIF)Li7/s;",
        "Landroid/graphics/Bitmap;",
        "image",
        "encode",
        "(Landroid/graphics/Bitmap;Lkotlin/Pair;)Ljava/lang/String;",
        "ENCODE_CHARACTERS",
        "Ljava/lang/String;",
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


# static fields
.field private static final ENCODE_CHARACTERS:Ljava/lang/String; = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz#$%*+,-.:;=?@[]^_{|}~"

.field public static final INSTANCE:Lexpo/modules/image/blurhash/BlurhashEncoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/image/blurhash/BlurhashEncoder;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/image/blurhash/BlurhashEncoder;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/image/blurhash/BlurhashEncoder;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashEncoder;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final calculateBlurFactors([IIILkotlin/Pair;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([III",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Li7/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    move v8, v2

    .line 18
    :goto_0
    if-ge v8, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p4}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v10

    .line 30
    move v7, v2

    .line 31
    :goto_1
    if-ge v7, v10, :cond_1

    .line 32
    .line 33
    if-nez v7, :cond_0

    .line 34
    .line 35
    if-nez v8, :cond_0

    .line 36
    .line 37
    const/high16 v3, 0x3f800000    # 1.0f

    .line 38
    .line 39
    :goto_2
    move-object v4, p1

    .line 40
    move v5, p2

    .line 41
    move v6, p3

    .line 42
    move v9, v3

    .line 43
    move-object v3, p0

    .line 44
    goto :goto_3

    .line 45
    :cond_0
    const/high16 v3, 0x40000000    # 2.0f

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :goto_3
    invoke-direct/range {v3 .. v9}, Lexpo/modules/image/blurhash/BlurhashEncoder;->multiplyBasisFunction([IIIIIF)Li7/s;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    add-int/lit8 v7, v7, 0x1

    .line 56
    .line 57
    move-object p1, v4

    .line 58
    move p2, v5

    .line 59
    move p3, v6

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v4, p1

    .line 62
    move v5, p2

    .line 63
    move v6, p3

    .line 64
    add-int/lit8 v8, v8, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-object v0
.end method

.method private final encode83(II)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-gt v1, p2, :cond_0

    .line 5
    .line 6
    :goto_0
    int-to-float v2, p1

    .line 7
    const/high16 v3, 0x42a60000    # 83.0f

    .line 8
    .line 9
    float-to-double v4, v3

    .line 10
    sub-int v6, p2, v1

    .line 11
    .line 12
    int-to-float v6, v6

    .line 13
    float-to-double v6, v6

    .line 14
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    double-to-float v4, v4

    .line 19
    div-float/2addr v2, v4

    .line 20
    rem-float/2addr v2, v3

    .line 21
    const-string v3, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz#$%*+,-.:;=?@[]^_{|}~"

    .line 22
    .line 23
    float-to-int v2, v2

    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eq v1, p2, :cond_0

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-object v0
.end method

.method private final encodeAC(Li7/s;F)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/s;",
            "F)I"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/image/blurhash/BlurhashHelpers;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashHelpers;

    .line 2
    .line 3
    invoke-virtual {p1}, Li7/s;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    div-float/2addr v1, p2

    .line 14
    const/high16 v2, 0x3f000000    # 0.5f

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lexpo/modules/image/blurhash/BlurhashHelpers;->signPow(FF)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/high16 v3, 0x41100000    # 9.0f

    .line 21
    .line 22
    mul-float/2addr v1, v3

    .line 23
    const/high16 v4, 0x41180000    # 9.5f

    .line 24
    .line 25
    add-float/2addr v1, v4

    .line 26
    float-to-double v5, v1

    .line 27
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    double-to-float v1, v5

    .line 32
    const/high16 v5, 0x41900000    # 18.0f

    .line 33
    .line 34
    invoke-static {v5, v1}, Ljava/lang/Math;->min(FF)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-static {v6, v1}, Ljava/lang/Math;->max(FF)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Li7/s;->e()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    div-float/2addr v7, p2

    .line 54
    invoke-virtual {v0, v7, v2}, Lexpo/modules/image/blurhash/BlurhashHelpers;->signPow(FF)F

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    mul-float/2addr v7, v3

    .line 59
    add-float/2addr v7, v4

    .line 60
    float-to-double v7, v7

    .line 61
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    double-to-float v7, v7

    .line 66
    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    invoke-virtual {p1}, Li7/s;->f()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    div-float/2addr p1, p2

    .line 85
    invoke-virtual {v0, p1, v2}, Lexpo/modules/image/blurhash/BlurhashHelpers;->signPow(FF)F

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    mul-float/2addr p1, v3

    .line 90
    add-float/2addr p1, v4

    .line 91
    float-to-double p1, p1

    .line 92
    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    double-to-float p1, p1

    .line 97
    invoke-static {v5, p1}, Ljava/lang/Math;->min(FF)F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {v6, p1}, Ljava/lang/Math;->max(FF)F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    const/high16 p2, 0x41980000    # 19.0f

    .line 106
    .line 107
    mul-float/2addr v1, p2

    .line 108
    mul-float/2addr v1, p2

    .line 109
    mul-float/2addr v7, p2

    .line 110
    add-float/2addr v1, v7

    .line 111
    add-float/2addr v1, p1

    .line 112
    float-to-int p1, v1

    .line 113
    return p1
.end method

.method private final encodeDC(Li7/s;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/s;",
            ")I"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/image/blurhash/BlurhashHelpers;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashHelpers;

    .line 2
    .line 3
    invoke-virtual {p1}, Li7/s;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, v1}, Lexpo/modules/image/blurhash/BlurhashHelpers;->linearTosRGB(F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1}, Li7/s;->e()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0, v2}, Lexpo/modules/image/blurhash/BlurhashHelpers;->linearTosRGB(F)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1}, Li7/s;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {v0, p1}, Lexpo/modules/image/blurhash/BlurhashHelpers;->linearTosRGB(F)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    shl-int/lit8 v0, v1, 0x10

    .line 46
    .line 47
    shl-int/lit8 v1, v2, 0x8

    .line 48
    .line 49
    add-int/2addr v0, v1

    .line 50
    add-int/2addr v0, p1

    .line 51
    return v0
.end method

.method private final encodeFlag(Lkotlin/Pair;Ljava/lang/StringBuilder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/StringBuilder;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sub-int/2addr p1, v1

    .line 24
    mul-int/lit8 p1, p1, 0x9

    .line 25
    .line 26
    add-int/2addr v0, p1

    .line 27
    invoke-direct {p0, v0, v1}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encode83(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final encodeMaximumValue(Ljava/util/List;Ljava/lang/StringBuilder;)F
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li7/s;",
            ">;",
            "Ljava/lang/StringBuilder;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Li7/s;

    .line 23
    .line 24
    invoke-virtual {v0}, Li7/s;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v0}, Li7/s;->e()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v0}, Li7/s;->f()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Li7/s;

    .line 85
    .line 86
    invoke-virtual {v2}, Li7/s;->d()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v2}, Li7/s;->e()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v2}, Li7/s;->f()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    goto :goto_0

    .line 141
    :cond_0
    const/high16 p1, 0x43260000    # 166.0f

    .line 142
    .line 143
    mul-float/2addr v0, p1

    .line 144
    const/high16 v2, 0x3f000000    # 0.5f

    .line 145
    .line 146
    sub-float/2addr v0, v2

    .line 147
    float-to-double v2, v0

    .line 148
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    double-to-float v0, v2

    .line 153
    const/high16 v2, 0x42a40000    # 82.0f

    .line 154
    .line 155
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    float-to-int v0, v0

    .line 165
    add-int/lit8 v2, v0, 0x1

    .line 166
    .line 167
    int-to-float v2, v2

    .line 168
    div-float/2addr v2, p1

    .line 169
    invoke-direct {p0, v0, v1}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encode83(II)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    return v2

    .line 177
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 178
    .line 179
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_2
    const/4 p1, 0x0

    .line 184
    invoke-direct {p0, p1, v1}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encode83(II)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 p1, 0x3f800000    # 1.0f

    .line 192
    .line 193
    return p1
.end method

.method private final multiplyBasisFunction([IIIIIF)Li7/s;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([IIIIIF)",
            "Li7/s;"
        }
    .end annotation

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move v4, v2

    .line 8
    move v5, v4

    .line 9
    move v6, v3

    .line 10
    :goto_0
    if-ge v6, v1, :cond_1

    .line 11
    .line 12
    move v7, v3

    .line 13
    :goto_1
    if-ge v7, v0, :cond_0

    .line 14
    .line 15
    move/from16 v8, p4

    .line 16
    .line 17
    int-to-float v9, v8

    .line 18
    const v10, 0x40490fdb    # (float)Math.PI

    .line 19
    .line 20
    .line 21
    mul-float/2addr v9, v10

    .line 22
    int-to-float v11, v7

    .line 23
    mul-float/2addr v9, v11

    .line 24
    int-to-float v11, v0

    .line 25
    div-float/2addr v9, v11

    .line 26
    float-to-double v11, v9

    .line 27
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v11

    .line 31
    double-to-float v9, v11

    .line 32
    mul-float v9, v9, p6

    .line 33
    .line 34
    move/from16 v11, p5

    .line 35
    .line 36
    int-to-float v12, v11

    .line 37
    mul-float/2addr v12, v10

    .line 38
    int-to-float v10, v6

    .line 39
    mul-float/2addr v12, v10

    .line 40
    int-to-float v10, v1

    .line 41
    div-float/2addr v12, v10

    .line 42
    float-to-double v12, v12

    .line 43
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v12

    .line 47
    double-to-float v10, v12

    .line 48
    mul-float/2addr v9, v10

    .line 49
    mul-int v10, v6, v0

    .line 50
    .line 51
    add-int/2addr v10, v7

    .line 52
    aget v10, p1, v10

    .line 53
    .line 54
    sget-object v12, Lexpo/modules/image/blurhash/BlurhashHelpers;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashHelpers;

    .line 55
    .line 56
    invoke-static {v10}, Landroid/graphics/Color;->red(I)I

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    invoke-virtual {v12, v13}, Lexpo/modules/image/blurhash/BlurhashHelpers;->srgbToLinear(I)F

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    invoke-static {v10}, Landroid/graphics/Color;->green(I)I

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    invoke-virtual {v12, v14}, Lexpo/modules/image/blurhash/BlurhashHelpers;->srgbToLinear(I)F

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    invoke-static {v10}, Landroid/graphics/Color;->blue(I)I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    invoke-virtual {v12, v10}, Lexpo/modules/image/blurhash/BlurhashHelpers;->srgbToLinear(I)F

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    mul-float/2addr v13, v9

    .line 81
    add-float/2addr v2, v13

    .line 82
    mul-float/2addr v14, v9

    .line 83
    add-float/2addr v4, v14

    .line 84
    mul-float/2addr v9, v10

    .line 85
    add-float/2addr v5, v9

    .line 86
    add-int/lit8 v7, v7, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    move/from16 v8, p4

    .line 90
    .line 91
    move/from16 v11, p5

    .line 92
    .line 93
    add-int/lit8 v6, v6, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    mul-int/2addr v0, v1

    .line 97
    int-to-float v0, v0

    .line 98
    const/high16 v1, 0x3f800000    # 1.0f

    .line 99
    .line 100
    div-float/2addr v1, v0

    .line 101
    new-instance v0, Li7/s;

    .line 102
    .line 103
    mul-float/2addr v2, v1

    .line 104
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    mul-float/2addr v4, v1

    .line 109
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    mul-float/2addr v5, v1

    .line 114
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-direct {v0, v2, v3, v1}, Li7/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-object v0
.end method


# virtual methods
.method public final encode(Landroid/graphics/Bitmap;Lkotlin/Pair;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "image"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "numberOfComponents"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    mul-int/2addr v0, v1

    .line 20
    new-array v2, v0, [I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v1, p1

    .line 38
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-direct {p0, v2, p1, v0, p2}, Lexpo/modules/image/blurhash/BlurhashEncoder;->calculateBlurFactors([IIILkotlin/Pair;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Li7/s;

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    invoke-static {p1, v1}, Lj7/q;->Z(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, p2, v1}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encodeFlag(Lkotlin/Pair;Ljava/lang/StringBuilder;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, p1, v1}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encodeMaximumValue(Ljava/util/List;Ljava/lang/StringBuilder;)F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-direct {p0, v0}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encodeDC(Li7/s;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v2, 0x4

    .line 81
    invoke-direct {p0, v0, v2}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encode83(II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_0

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Li7/s;

    .line 103
    .line 104
    invoke-direct {p0, v0, p2}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encodeAC(Li7/s;F)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v2, 0x2

    .line 109
    invoke-direct {p0, v0, v2}, Lexpo/modules/image/blurhash/BlurhashEncoder;->encode83(II)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const-string p2, "toString(...)"

    .line 122
    .line 123
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object p1
.end method
