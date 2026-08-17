.class public final Lexpo/modules/image/thumbhash/ThumbhashDecoder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;,
        Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;,
        Lexpo/modules/image/thumbhash/ThumbhashDecoder$RGBA;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lexpo/modules/image/thumbhash/ThumbhashDecoder;",
        "",
        "<init>",
        "()V",
        "thumbHashToRGBA",
        "Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;",
        "hash",
        "",
        "thumbHashToBitmap",
        "Landroid/graphics/Bitmap;",
        "thumbHashToAverageRGBA",
        "Lexpo/modules/image/thumbhash/ThumbhashDecoder$RGBA;",
        "thumbHashToApproximateAspectRatio",
        "",
        "Image",
        "RGBA",
        "Channel",
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
.field public static final INSTANCE:Lexpo/modules/image/thumbhash/ThumbhashDecoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/image/thumbhash/ThumbhashDecoder;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/image/thumbhash/ThumbhashDecoder;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/image/thumbhash/ThumbhashDecoder;->INSTANCE:Lexpo/modules/image/thumbhash/ThumbhashDecoder;

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


# virtual methods
.method public final thumbHashToApproximateAspectRatio([B)F
    .locals 5

    .line 1
    const-string v0, "hash"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    aget-byte v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    aget-byte v1, p1, v1

    .line 11
    .line 12
    and-int/lit16 v1, v1, 0x80

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    move v1, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v2

    .line 21
    :goto_0
    const/4 v4, 0x4

    .line 22
    aget-byte p1, p1, v4

    .line 23
    .line 24
    and-int/lit16 p1, p1, 0x80

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    :cond_1
    const/4 p1, 0x5

    .line 30
    const/4 v3, 0x7

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    move v4, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v4, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    and-int/lit8 v4, v0, 0x7

    .line 40
    .line 41
    :goto_1
    if-eqz v2, :cond_4

    .line 42
    .line 43
    and-int/lit8 p1, v0, 0x7

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    if-eqz v1, :cond_5

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_5
    move p1, v3

    .line 50
    :goto_2
    int-to-float v0, v4

    .line 51
    int-to-float p1, p1

    .line 52
    div-float/2addr v0, p1

    .line 53
    return v0
.end method

.method public final thumbHashToAverageRGBA([B)Lexpo/modules/image/thumbhash/ThumbhashDecoder$RGBA;
    .locals 6

    .line 1
    const-string v0, "hash"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-byte v0, p1, v0

    .line 8
    .line 9
    and-int/lit16 v0, v0, 0xff

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aget-byte v1, p1, v1

    .line 13
    .line 14
    and-int/lit16 v1, v1, 0xff

    .line 15
    .line 16
    shl-int/lit8 v1, v1, 0x8

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    const/4 v1, 0x2

    .line 20
    aget-byte v1, p1, v1

    .line 21
    .line 22
    and-int/lit16 v1, v1, 0xff

    .line 23
    .line 24
    shl-int/lit8 v1, v1, 0x10

    .line 25
    .line 26
    or-int/2addr v0, v1

    .line 27
    and-int/lit8 v1, v0, 0x3f

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    const/high16 v2, 0x427c0000    # 63.0f

    .line 31
    .line 32
    div-float/2addr v1, v2

    .line 33
    shr-int/lit8 v2, v0, 0x6

    .line 34
    .line 35
    and-int/lit8 v2, v2, 0x3f

    .line 36
    .line 37
    int-to-float v2, v2

    .line 38
    const/high16 v3, 0x41fc0000    # 31.5f

    .line 39
    .line 40
    div-float/2addr v2, v3

    .line 41
    const/high16 v4, 0x3f800000    # 1.0f

    .line 42
    .line 43
    sub-float/2addr v2, v4

    .line 44
    shr-int/lit8 v5, v0, 0xc

    .line 45
    .line 46
    and-int/lit8 v5, v5, 0x3f

    .line 47
    .line 48
    int-to-float v5, v5

    .line 49
    div-float/2addr v5, v3

    .line 50
    sub-float/2addr v5, v4

    .line 51
    shr-int/lit8 v0, v0, 0x17

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    const/4 v0, 0x5

    .line 56
    aget-byte p1, p1, v0

    .line 57
    .line 58
    and-int/lit8 p1, p1, 0xf

    .line 59
    .line 60
    int-to-float p1, p1

    .line 61
    const/high16 v0, 0x41700000    # 15.0f

    .line 62
    .line 63
    div-float/2addr p1, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move p1, v4

    .line 66
    :goto_0
    const v0, 0x3f2aaaab

    .line 67
    .line 68
    .line 69
    mul-float/2addr v2, v0

    .line 70
    sub-float v0, v1, v2

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    mul-float/2addr v1, v2

    .line 75
    sub-float/2addr v1, v0

    .line 76
    add-float/2addr v1, v5

    .line 77
    const/high16 v2, 0x40000000    # 2.0f

    .line 78
    .line 79
    div-float/2addr v1, v2

    .line 80
    sub-float v2, v1, v5

    .line 81
    .line 82
    new-instance v3, Lexpo/modules/image/thumbhash/ThumbhashDecoder$RGBA;

    .line 83
    .line 84
    invoke-static {v4, v1}, Ljava/lang/Math;->min(FF)F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-static {v4, v2}, Ljava/lang/Math;->min(FF)F

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v4, v0}, Ljava/lang/Math;->min(FF)F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-direct {v3, v1, v2, v0, p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$RGBA;-><init>(FFFF)V

    .line 110
    .line 111
    .line 112
    return-object v3
.end method

.method public final thumbHashToBitmap([B)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "hash"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder;->thumbHashToRGBA([B)Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    mul-int/2addr v0, v1

    .line 19
    new-array v0, v0, [I

    .line 20
    .line 21
    invoke-virtual {p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->getRgba()[B

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    array-length v3, v1

    .line 28
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    array-length v3, v1

    .line 32
    const/4 v4, 0x0

    .line 33
    move v5, v4

    .line 34
    :goto_0
    if-ge v5, v3, :cond_0

    .line 35
    .line 36
    aget-byte v6, v1, v5

    .line 37
    .line 38
    invoke-static {v6}, Li7/v;->j(B)B

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    and-int/lit16 v6, v6, 0xff

    .line 43
    .line 44
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    add-int/lit8 v5, v5, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/lit8 v1, v1, -0x1

    .line 59
    .line 60
    const/4 v3, 0x4

    .line 61
    invoke-static {v4, v1, v3}, Lq7/c;->b(III)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-ltz v1, :cond_1

    .line 66
    .line 67
    :goto_1
    div-int/lit8 v3, v4, 0x4

    .line 68
    .line 69
    add-int/lit8 v5, v4, 0x3

    .line 70
    .line 71
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    add-int/lit8 v7, v4, 0x1

    .line 92
    .line 93
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    add-int/lit8 v8, v4, 0x2

    .line 104
    .line 105
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    invoke-static {v5, v6, v7, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    aput v5, v0, v3

    .line 120
    .line 121
    if-eq v4, v1, :cond_1

    .line 122
    .line 123
    add-int/lit8 v4, v4, 0x4

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-virtual {p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->getWidth()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-virtual {p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;->getHeight()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 135
    .line 136
    invoke-static {v0, v1, p1, v2}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const-string v0, "createBitmap(...)"

    .line 141
    .line 142
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object p1
.end method

.method public final thumbHashToRGBA([B)Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;
    .locals 35

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "hash"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-byte v2, v0, v1

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0xff

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aget-byte v4, v0, v3

    .line 15
    .line 16
    and-int/lit16 v4, v4, 0xff

    .line 17
    .line 18
    shl-int/lit8 v4, v4, 0x8

    .line 19
    .line 20
    or-int/2addr v2, v4

    .line 21
    const/4 v4, 0x2

    .line 22
    aget-byte v4, v0, v4

    .line 23
    .line 24
    and-int/lit16 v4, v4, 0xff

    .line 25
    .line 26
    shl-int/lit8 v4, v4, 0x10

    .line 27
    .line 28
    or-int/2addr v2, v4

    .line 29
    const/4 v4, 0x3

    .line 30
    aget-byte v5, v0, v4

    .line 31
    .line 32
    and-int/lit16 v5, v5, 0xff

    .line 33
    .line 34
    const/4 v6, 0x4

    .line 35
    aget-byte v7, v0, v6

    .line 36
    .line 37
    and-int/lit16 v7, v7, 0xff

    .line 38
    .line 39
    shl-int/lit8 v7, v7, 0x8

    .line 40
    .line 41
    or-int/2addr v5, v7

    .line 42
    and-int/lit8 v7, v2, 0x3f

    .line 43
    .line 44
    int-to-float v7, v7

    .line 45
    const/high16 v8, 0x427c0000    # 63.0f

    .line 46
    .line 47
    div-float/2addr v7, v8

    .line 48
    shr-int/lit8 v9, v2, 0x6

    .line 49
    .line 50
    and-int/lit8 v9, v9, 0x3f

    .line 51
    .line 52
    int-to-float v9, v9

    .line 53
    const/high16 v10, 0x41fc0000    # 31.5f

    .line 54
    .line 55
    div-float/2addr v9, v10

    .line 56
    const/high16 v11, 0x3f800000    # 1.0f

    .line 57
    .line 58
    sub-float/2addr v9, v11

    .line 59
    shr-int/lit8 v12, v2, 0xc

    .line 60
    .line 61
    and-int/lit8 v12, v12, 0x3f

    .line 62
    .line 63
    int-to-float v12, v12

    .line 64
    div-float/2addr v12, v10

    .line 65
    sub-float/2addr v12, v11

    .line 66
    shr-int/lit8 v10, v2, 0x12

    .line 67
    .line 68
    and-int/lit8 v10, v10, 0x1f

    .line 69
    .line 70
    int-to-float v10, v10

    .line 71
    const/high16 v13, 0x41f80000    # 31.0f

    .line 72
    .line 73
    div-float/2addr v10, v13

    .line 74
    shr-int/lit8 v2, v2, 0x17

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    move v2, v3

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move v2, v1

    .line 81
    :goto_0
    shr-int/lit8 v13, v5, 0x3

    .line 82
    .line 83
    and-int/lit8 v13, v13, 0x3f

    .line 84
    .line 85
    int-to-float v13, v13

    .line 86
    div-float/2addr v13, v8

    .line 87
    shr-int/lit8 v14, v5, 0x9

    .line 88
    .line 89
    and-int/lit8 v14, v14, 0x3f

    .line 90
    .line 91
    int-to-float v14, v14

    .line 92
    div-float/2addr v14, v8

    .line 93
    shr-int/lit8 v8, v5, 0xf

    .line 94
    .line 95
    if-eqz v8, :cond_1

    .line 96
    .line 97
    move v8, v3

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move v8, v1

    .line 100
    :goto_1
    const/4 v15, 0x7

    .line 101
    const/4 v3, 0x5

    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    move/from16 v17, v6

    .line 105
    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    move v6, v3

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    move v6, v15

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    and-int/lit8 v16, v5, 0x7

    .line 113
    .line 114
    move/from16 v17, v6

    .line 115
    .line 116
    move/from16 v6, v16

    .line 117
    .line 118
    :goto_2
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v8, :cond_4

    .line 123
    .line 124
    and-int/2addr v15, v5

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    if-eqz v2, :cond_5

    .line 127
    .line 128
    move v15, v3

    .line 129
    :cond_5
    :goto_3
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    const/high16 v8, 0x41700000    # 15.0f

    .line 134
    .line 135
    if-eqz v2, :cond_6

    .line 136
    .line 137
    aget-byte v15, v0, v3

    .line 138
    .line 139
    and-int/lit8 v15, v15, 0xf

    .line 140
    .line 141
    int-to-float v15, v15

    .line 142
    div-float/2addr v15, v8

    .line 143
    goto :goto_4

    .line 144
    :cond_6
    move v15, v11

    .line 145
    :goto_4
    aget-byte v16, v0, v3

    .line 146
    .line 147
    shr-int/lit8 v16, v16, 0x4

    .line 148
    .line 149
    move/from16 v18, v8

    .line 150
    .line 151
    and-int/lit8 v8, v16, 0xf

    .line 152
    .line 153
    int-to-float v8, v8

    .line 154
    div-float v8, v8, v18

    .line 155
    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    const/16 v16, 0x6

    .line 159
    .line 160
    move/from16 v34, v16

    .line 161
    .line 162
    move/from16 v16, v11

    .line 163
    .line 164
    move/from16 v11, v34

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_7
    move/from16 v16, v11

    .line 168
    .line 169
    move v11, v3

    .line 170
    :goto_5
    new-instance v3, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;

    .line 171
    .line 172
    invoke-direct {v3, v6, v5}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;-><init>(II)V

    .line 173
    .line 174
    .line 175
    new-instance v1, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;

    .line 176
    .line 177
    invoke-direct {v1, v4, v4}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;-><init>(II)V

    .line 178
    .line 179
    .line 180
    move/from16 v19, v2

    .line 181
    .line 182
    new-instance v2, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;

    .line 183
    .line 184
    invoke-direct {v2, v4, v4}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;-><init>(II)V

    .line 185
    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    invoke-virtual {v3, v0, v11, v4, v10}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->decode([BIIF)I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 193
    .line 194
    mul-float/2addr v13, v4

    .line 195
    invoke-virtual {v1, v0, v11, v10, v13}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->decode([BIIF)I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    mul-float/2addr v14, v4

    .line 200
    invoke-virtual {v2, v0, v11, v10, v14}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->decode([BIIF)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    const/4 v10, 0x0

    .line 205
    if-eqz v19, :cond_8

    .line 206
    .line 207
    new-instance v13, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;

    .line 208
    .line 209
    const/4 v14, 0x5

    .line 210
    invoke-direct {v13, v14, v14}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;-><init>(II)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v13, v0, v11, v4, v8}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->decode([BIIF)I

    .line 214
    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_8
    move-object v13, v10

    .line 218
    :goto_6
    invoke-virtual {v3}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->getAc()[F

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->getAc()[F

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v2}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->getAc()[F

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    if-eqz v19, :cond_9

    .line 231
    .line 232
    invoke-static {v13}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v13}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Channel;->getAc()[F

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    :cond_9
    invoke-virtual/range {p0 .. p1}, Lexpo/modules/image/thumbhash/ThumbhashDecoder;->thumbHashToApproximateAspectRatio([B)F

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    cmpl-float v4, v0, v16

    .line 244
    .line 245
    const/high16 v8, 0x42000000    # 32.0f

    .line 246
    .line 247
    if-lez v4, :cond_a

    .line 248
    .line 249
    move v11, v8

    .line 250
    goto :goto_7

    .line 251
    :cond_a
    mul-float v11, v0, v8

    .line 252
    .line 253
    :goto_7
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    if-lez v4, :cond_b

    .line 258
    .line 259
    div-float/2addr v8, v0

    .line 260
    :cond_b
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    mul-int v4, v11, v0

    .line 265
    .line 266
    mul-int/lit8 v4, v4, 0x4

    .line 267
    .line 268
    new-array v4, v4, [B

    .line 269
    .line 270
    if-eqz v19, :cond_c

    .line 271
    .line 272
    const/4 v14, 0x5

    .line 273
    goto :goto_8

    .line 274
    :cond_c
    const/4 v14, 0x3

    .line 275
    :goto_8
    invoke-static {v6, v14}, Ljava/lang/Math;->max(II)I

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    if-eqz v19, :cond_d

    .line 280
    .line 281
    const/4 v14, 0x5

    .line 282
    goto :goto_9

    .line 283
    :cond_d
    const/4 v14, 0x3

    .line 284
    :goto_9
    invoke-static {v5, v14}, Ljava/lang/Math;->max(II)I

    .line 285
    .line 286
    .line 287
    move-result v13

    .line 288
    new-array v14, v8, [F

    .line 289
    .line 290
    move-object/from16 v17, v1

    .line 291
    .line 292
    new-array v1, v13, [F

    .line 293
    .line 294
    move-object/from16 p1, v1

    .line 295
    .line 296
    const/4 v1, 0x0

    .line 297
    const/16 v21, 0x0

    .line 298
    .line 299
    :goto_a
    if-ge v1, v0, :cond_1a

    .line 300
    .line 301
    move-object/from16 v22, v2

    .line 302
    .line 303
    const/4 v2, 0x0

    .line 304
    :goto_b
    if-ge v2, v11, :cond_19

    .line 305
    .line 306
    move-object/from16 v23, v3

    .line 307
    .line 308
    const/4 v3, 0x0

    .line 309
    :goto_c
    const-wide v24, 0x400921fb54442d18L    # Math.PI

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    if-ge v3, v8, :cond_e

    .line 315
    .line 316
    move/from16 v27, v6

    .line 317
    .line 318
    move/from16 v26, v7

    .line 319
    .line 320
    int-to-double v6, v11

    .line 321
    div-double v24, v24, v6

    .line 322
    .line 323
    int-to-float v6, v2

    .line 324
    const/high16 v7, 0x3f000000    # 0.5f

    .line 325
    .line 326
    add-float/2addr v6, v7

    .line 327
    float-to-double v6, v6

    .line 328
    mul-double v24, v24, v6

    .line 329
    .line 330
    int-to-double v6, v3

    .line 331
    mul-double v24, v24, v6

    .line 332
    .line 333
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->cos(D)D

    .line 334
    .line 335
    .line 336
    move-result-wide v6

    .line 337
    double-to-float v6, v6

    .line 338
    aput v6, v14, v3

    .line 339
    .line 340
    add-int/lit8 v3, v3, 0x1

    .line 341
    .line 342
    move/from16 v7, v26

    .line 343
    .line 344
    move/from16 v6, v27

    .line 345
    .line 346
    goto :goto_c

    .line 347
    :cond_e
    move/from16 v27, v6

    .line 348
    .line 349
    move/from16 v26, v7

    .line 350
    .line 351
    const/4 v3, 0x0

    .line 352
    :goto_d
    if-ge v3, v13, :cond_f

    .line 353
    .line 354
    int-to-double v6, v0

    .line 355
    div-double v6, v24, v6

    .line 356
    .line 357
    move/from16 v28, v2

    .line 358
    .line 359
    int-to-float v2, v1

    .line 360
    const/high16 v29, 0x3f000000    # 0.5f

    .line 361
    .line 362
    add-float v2, v2, v29

    .line 363
    .line 364
    move/from16 v29, v1

    .line 365
    .line 366
    float-to-double v1, v2

    .line 367
    mul-double/2addr v6, v1

    .line 368
    int-to-double v1, v3

    .line 369
    mul-double/2addr v6, v1

    .line 370
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 371
    .line 372
    .line 373
    move-result-wide v1

    .line 374
    double-to-float v1, v1

    .line 375
    aput v1, p1, v3

    .line 376
    .line 377
    add-int/lit8 v3, v3, 0x1

    .line 378
    .line 379
    move/from16 v2, v28

    .line 380
    .line 381
    move/from16 v1, v29

    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_f
    move/from16 v29, v1

    .line 385
    .line 386
    move/from16 v28, v2

    .line 387
    .line 388
    move/from16 v3, v26

    .line 389
    .line 390
    const/4 v1, 0x0

    .line 391
    const/4 v2, 0x0

    .line 392
    :goto_e
    const/high16 v6, 0x40000000    # 2.0f

    .line 393
    .line 394
    if-ge v1, v5, :cond_12

    .line 395
    .line 396
    aget v7, p1, v1

    .line 397
    .line 398
    mul-float/2addr v7, v6

    .line 399
    if-lez v1, :cond_10

    .line 400
    .line 401
    const/4 v6, 0x0

    .line 402
    goto :goto_f

    .line 403
    :cond_10
    const/4 v6, 0x1

    .line 404
    :goto_f
    move/from16 v24, v1

    .line 405
    .line 406
    :goto_10
    mul-int v1, v6, v5

    .line 407
    .line 408
    sub-int v25, v5, v24

    .line 409
    .line 410
    move/from16 v30, v2

    .line 411
    .line 412
    mul-int v2, v27, v25

    .line 413
    .line 414
    if-ge v1, v2, :cond_11

    .line 415
    .line 416
    aget v1, v23, v30

    .line 417
    .line 418
    aget v2, v14, v6

    .line 419
    .line 420
    mul-float/2addr v1, v2

    .line 421
    mul-float/2addr v1, v7

    .line 422
    add-float/2addr v3, v1

    .line 423
    add-int/lit8 v6, v6, 0x1

    .line 424
    .line 425
    add-int/lit8 v2, v30, 0x1

    .line 426
    .line 427
    goto :goto_10

    .line 428
    :cond_11
    add-int/lit8 v1, v24, 0x1

    .line 429
    .line 430
    move/from16 v2, v30

    .line 431
    .line 432
    goto :goto_e

    .line 433
    :cond_12
    move/from16 v24, v6

    .line 434
    .line 435
    move v7, v9

    .line 436
    move/from16 v20, v12

    .line 437
    .line 438
    const/4 v1, 0x0

    .line 439
    const/4 v2, 0x0

    .line 440
    :goto_11
    const/4 v6, 0x3

    .line 441
    if-ge v1, v6, :cond_15

    .line 442
    .line 443
    aget v25, p1, v1

    .line 444
    .line 445
    mul-float v25, v25, v24

    .line 446
    .line 447
    if-lez v1, :cond_13

    .line 448
    .line 449
    const/16 v30, 0x0

    .line 450
    .line 451
    goto :goto_12

    .line 452
    :cond_13
    const/16 v30, 0x1

    .line 453
    .line 454
    :goto_12
    move/from16 v6, v30

    .line 455
    .line 456
    :goto_13
    move/from16 v31, v1

    .line 457
    .line 458
    rsub-int/lit8 v1, v31, 0x3

    .line 459
    .line 460
    if-ge v6, v1, :cond_14

    .line 461
    .line 462
    aget v1, v14, v6

    .line 463
    .line 464
    mul-float v1, v1, v25

    .line 465
    .line 466
    aget v32, v17, v2

    .line 467
    .line 468
    mul-float v32, v32, v1

    .line 469
    .line 470
    add-float v7, v7, v32

    .line 471
    .line 472
    aget v32, v22, v2

    .line 473
    .line 474
    mul-float v32, v32, v1

    .line 475
    .line 476
    add-float v20, v20, v32

    .line 477
    .line 478
    add-int/lit8 v6, v6, 0x1

    .line 479
    .line 480
    add-int/lit8 v2, v2, 0x1

    .line 481
    .line 482
    move/from16 v1, v31

    .line 483
    .line 484
    goto :goto_13

    .line 485
    :cond_14
    add-int/lit8 v1, v31, 0x1

    .line 486
    .line 487
    goto :goto_11

    .line 488
    :cond_15
    move v6, v15

    .line 489
    if-eqz v19, :cond_18

    .line 490
    .line 491
    const/4 v1, 0x0

    .line 492
    const/16 v18, 0x0

    .line 493
    .line 494
    :goto_14
    const/4 v2, 0x5

    .line 495
    if-ge v1, v2, :cond_18

    .line 496
    .line 497
    aget v25, p1, v1

    .line 498
    .line 499
    mul-float v25, v25, v24

    .line 500
    .line 501
    if-lez v1, :cond_16

    .line 502
    .line 503
    const/16 v31, 0x0

    .line 504
    .line 505
    goto :goto_15

    .line 506
    :cond_16
    const/16 v31, 0x1

    .line 507
    .line 508
    :goto_15
    move/from16 v2, v31

    .line 509
    .line 510
    :goto_16
    move/from16 v32, v1

    .line 511
    .line 512
    rsub-int/lit8 v1, v32, 0x5

    .line 513
    .line 514
    if-ge v2, v1, :cond_17

    .line 515
    .line 516
    invoke-static {v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    aget v1, v10, v18

    .line 520
    .line 521
    aget v33, v14, v2

    .line 522
    .line 523
    mul-float v1, v1, v33

    .line 524
    .line 525
    mul-float v1, v1, v25

    .line 526
    .line 527
    add-float/2addr v6, v1

    .line 528
    add-int/lit8 v2, v2, 0x1

    .line 529
    .line 530
    add-int/lit8 v18, v18, 0x1

    .line 531
    .line 532
    move/from16 v1, v32

    .line 533
    .line 534
    goto :goto_16

    .line 535
    :cond_17
    add-int/lit8 v1, v32, 0x1

    .line 536
    .line 537
    goto :goto_14

    .line 538
    :cond_18
    const v1, 0x3f2aaaab

    .line 539
    .line 540
    .line 541
    mul-float/2addr v7, v1

    .line 542
    sub-float v1, v3, v7

    .line 543
    .line 544
    const/high16 v2, 0x40400000    # 3.0f

    .line 545
    .line 546
    mul-float/2addr v3, v2

    .line 547
    sub-float/2addr v3, v1

    .line 548
    add-float v3, v3, v20

    .line 549
    .line 550
    div-float v3, v3, v24

    .line 551
    .line 552
    sub-float v2, v3, v20

    .line 553
    .line 554
    move/from16 v7, v16

    .line 555
    .line 556
    invoke-static {v7, v3}, Ljava/lang/Math;->min(FF)F

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    const/high16 v16, 0x437f0000    # 255.0f

    .line 561
    .line 562
    mul-float v3, v3, v16

    .line 563
    .line 564
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    const/4 v7, 0x0

    .line 569
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    int-to-byte v3, v3

    .line 574
    aput-byte v3, v4, v21

    .line 575
    .line 576
    add-int/lit8 v3, v21, 0x1

    .line 577
    .line 578
    const/high16 v7, 0x3f800000    # 1.0f

    .line 579
    .line 580
    invoke-static {v7, v2}, Ljava/lang/Math;->min(FF)F

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    mul-float v2, v2, v16

    .line 585
    .line 586
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    const/4 v7, 0x0

    .line 591
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    int-to-byte v2, v2

    .line 596
    aput-byte v2, v4, v3

    .line 597
    .line 598
    add-int/lit8 v2, v21, 0x2

    .line 599
    .line 600
    const/high16 v3, 0x3f800000    # 1.0f

    .line 601
    .line 602
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    mul-float v1, v1, v16

    .line 607
    .line 608
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    int-to-byte v1, v1

    .line 617
    aput-byte v1, v4, v2

    .line 618
    .line 619
    add-int/lit8 v1, v21, 0x3

    .line 620
    .line 621
    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    mul-float v2, v2, v16

    .line 626
    .line 627
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    int-to-byte v2, v2

    .line 636
    aput-byte v2, v4, v1

    .line 637
    .line 638
    add-int/lit8 v2, v28, 0x1

    .line 639
    .line 640
    add-int/lit8 v21, v21, 0x4

    .line 641
    .line 642
    move/from16 v16, v3

    .line 643
    .line 644
    move-object/from16 v3, v23

    .line 645
    .line 646
    move/from16 v7, v26

    .line 647
    .line 648
    move/from16 v6, v27

    .line 649
    .line 650
    move/from16 v1, v29

    .line 651
    .line 652
    goto/16 :goto_b

    .line 653
    .line 654
    :cond_19
    move/from16 v29, v1

    .line 655
    .line 656
    move-object/from16 v23, v3

    .line 657
    .line 658
    move/from16 v27, v6

    .line 659
    .line 660
    move/from16 v26, v7

    .line 661
    .line 662
    move/from16 v3, v16

    .line 663
    .line 664
    const/4 v7, 0x0

    .line 665
    add-int/lit8 v1, v29, 0x1

    .line 666
    .line 667
    move-object/from16 v2, v22

    .line 668
    .line 669
    move-object/from16 v3, v23

    .line 670
    .line 671
    move/from16 v7, v26

    .line 672
    .line 673
    goto/16 :goto_a

    .line 674
    .line 675
    :cond_1a
    new-instance v1, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;

    .line 676
    .line 677
    invoke-direct {v1, v11, v0, v4}, Lexpo/modules/image/thumbhash/ThumbhashDecoder$Image;-><init>(II[B)V

    .line 678
    .line 679
    .line 680
    return-object v1
.end method
