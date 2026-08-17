.class public Lcom/horcrux/svg/CustomFilter;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static apply(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/horcrux/svg/d;)Landroid/graphics/Bitmap;
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    mul-int v0, v3, v7

    .line 10
    .line 11
    new-array v1, v0, [I

    .line 12
    .line 13
    new-array v8, v0, [I

    .line 14
    .line 15
    new-array v9, v0, [I

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    new-array v10, v0, [F

    .line 19
    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    aput v2, v10, v11

    .line 23
    .line 24
    const/4 v12, 0x1

    .line 25
    aput v2, v10, v12

    .line 26
    .line 27
    const/4 v13, 0x2

    .line 28
    aput v2, v10, v13

    .line 29
    .line 30
    const/4 v14, 0x3

    .line 31
    aput v2, v10, v14

    .line 32
    .line 33
    new-array v15, v0, [F

    .line 34
    .line 35
    aput v2, v15, v11

    .line 36
    .line 37
    aput v2, v15, v12

    .line 38
    .line 39
    aput v2, v15, v13

    .line 40
    .line 41
    aput v2, v15, v14

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    move v6, v3

    .line 47
    move-object/from16 v0, p0

    .line 48
    .line 49
    :try_start_0
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    move-object/from16 v16, v1

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v2, 0x0

    .line 57
    move v6, v3

    .line 58
    move-object/from16 v0, p1

    .line 59
    .line 60
    move-object v1, v8

    .line 61
    :try_start_1
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-object/from16 v16, v1

    .line 66
    .line 67
    move-object v1, v8

    .line 68
    :catch_1
    :goto_0
    move v0, v11

    .line 69
    :goto_1
    if-ge v0, v7, :cond_1

    .line 70
    .line 71
    move v2, v11

    .line 72
    :goto_2
    if-ge v2, v3, :cond_0

    .line 73
    .line 74
    mul-int v4, v0, v3

    .line 75
    .line 76
    add-int/2addr v4, v2

    .line 77
    aget v5, v16, v4

    .line 78
    .line 79
    shr-int/lit8 v6, v5, 0x18

    .line 80
    .line 81
    and-int/lit16 v6, v6, 0xff

    .line 82
    .line 83
    int-to-float v6, v6

    .line 84
    const/high16 v8, 0x437f0000    # 255.0f

    .line 85
    .line 86
    div-float/2addr v6, v8

    .line 87
    aput v6, v10, v11

    .line 88
    .line 89
    shr-int/lit8 v6, v5, 0x10

    .line 90
    .line 91
    and-int/lit16 v6, v6, 0xff

    .line 92
    .line 93
    int-to-float v6, v6

    .line 94
    div-float/2addr v6, v8

    .line 95
    aput v6, v10, v12

    .line 96
    .line 97
    shr-int/lit8 v6, v5, 0x8

    .line 98
    .line 99
    and-int/lit16 v6, v6, 0xff

    .line 100
    .line 101
    int-to-float v6, v6

    .line 102
    div-float/2addr v6, v8

    .line 103
    aput v6, v10, v13

    .line 104
    .line 105
    and-int/lit16 v5, v5, 0xff

    .line 106
    .line 107
    int-to-float v5, v5

    .line 108
    div-float/2addr v5, v8

    .line 109
    aput v5, v10, v14

    .line 110
    .line 111
    aget v5, v1, v4

    .line 112
    .line 113
    shr-int/lit8 v6, v5, 0x18

    .line 114
    .line 115
    and-int/lit16 v6, v6, 0xff

    .line 116
    .line 117
    int-to-float v6, v6

    .line 118
    div-float/2addr v6, v8

    .line 119
    aput v6, v15, v11

    .line 120
    .line 121
    shr-int/lit8 v6, v5, 0x10

    .line 122
    .line 123
    and-int/lit16 v6, v6, 0xff

    .line 124
    .line 125
    int-to-float v6, v6

    .line 126
    div-float/2addr v6, v8

    .line 127
    aput v6, v15, v12

    .line 128
    .line 129
    shr-int/lit8 v6, v5, 0x8

    .line 130
    .line 131
    and-int/lit16 v6, v6, 0xff

    .line 132
    .line 133
    int-to-float v6, v6

    .line 134
    div-float/2addr v6, v8

    .line 135
    aput v6, v15, v13

    .line 136
    .line 137
    and-int/lit16 v5, v5, 0xff

    .line 138
    .line 139
    int-to-float v5, v5

    .line 140
    div-float/2addr v5, v8

    .line 141
    aput v5, v15, v14

    .line 142
    .line 143
    move-object/from16 v5, p2

    .line 144
    .line 145
    invoke-interface {v5, v10, v15}, Lcom/horcrux/svg/d;->a([F[F)[F

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {v6}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloats([F)I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    aput v6, v9, v4

    .line 154
    .line 155
    add-int/lit8 v2, v2, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_0
    move-object/from16 v5, p2

    .line 159
    .line 160
    add-int/lit8 v0, v0, 0x1

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 164
    .line 165
    invoke-static {v9, v3, v7, v0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0
.end method

.method public static normalizeFromFloat(F)I
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p0, v0

    .line 4
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v0, 0xff

    .line 14
    .line 15
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public static normalizeFromFloats([F)I
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x0

    .line 4
    if-lt v0, v1, :cond_1

    .line 5
    .line 6
    aget v0, p0, v2

    .line 7
    .line 8
    invoke-static {v0}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    aget v0, p0, v2

    .line 16
    .line 17
    invoke-static {v0}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    shl-int/lit8 v0, v0, 0x18

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    aget v1, p0, v1

    .line 25
    .line 26
    aget v3, p0, v2

    .line 27
    .line 28
    div-float/2addr v1, v3

    .line 29
    invoke-static {v1}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    shl-int/lit8 v1, v1, 0x10

    .line 34
    .line 35
    or-int/2addr v0, v1

    .line 36
    const/4 v1, 0x2

    .line 37
    aget v1, p0, v1

    .line 38
    .line 39
    aget v3, p0, v2

    .line 40
    .line 41
    div-float/2addr v1, v3

    .line 42
    invoke-static {v1}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    shl-int/lit8 v1, v1, 0x8

    .line 47
    .line 48
    or-int/2addr v0, v1

    .line 49
    const/4 v1, 0x3

    .line 50
    aget v1, p0, v1

    .line 51
    .line 52
    aget p0, p0, v2

    .line 53
    .line 54
    div-float/2addr v1, p0

    .line 55
    invoke-static {v1}, Lcom/horcrux/svg/CustomFilter;->normalizeFromFloat(F)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    or-int/2addr p0, v0

    .line 60
    return p0

    .line 61
    :cond_1
    :goto_0
    return v2
.end method
