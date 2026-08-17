.class final Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/image/thumbhash/ThumbhashEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Channel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\r\n\u0002\u0010\u0012\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0014J\u001e\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008\"\u0004\u0008\u000c\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u0010\"\u0004\u0008\u001b\u0010\u0012\u00a8\u0006%"
    }
    d2 = {
        "Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;",
        "",
        "nx",
        "",
        "ny",
        "<init>",
        "(II)V",
        "getNx",
        "()I",
        "setNx",
        "(I)V",
        "getNy",
        "setNy",
        "dc",
        "",
        "getDc",
        "()F",
        "setDc",
        "(F)V",
        "ac",
        "",
        "getAc",
        "()[F",
        "setAc",
        "([F)V",
        "scale",
        "getScale",
        "setScale",
        "encode",
        "w",
        "h",
        "channel",
        "writeTo",
        "hash",
        "",
        "start",
        "index",
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

.field private dc:F

.field private nx:I

.field private ny:I

.field private scale:F


# direct methods
.method public constructor <init>(II)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->nx:I

    .line 5
    .line 6
    iput p2, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ny:I

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    move v0, p1

    .line 10
    move v1, v0

    .line 11
    :goto_0
    if-ge v0, p2, :cond_2

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    move v2, p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v2, 0x1

    .line 18
    :goto_1
    iget v3, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ny:I

    .line 19
    .line 20
    mul-int v4, v2, v3

    .line 21
    .line 22
    iget v5, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->nx:I

    .line 23
    .line 24
    sub-int/2addr v3, v0

    .line 25
    mul-int/2addr v5, v3

    .line 26
    if-ge v4, v5, :cond_1

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    new-array p1, v1, [F

    .line 37
    .line 38
    iput-object p1, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ac:[F

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final encode(II[F)Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "channel"

    .line 10
    .line 11
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-array v4, v1, [F

    .line 15
    .line 16
    iget v5, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ny:I

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    move v7, v6

    .line 20
    move v8, v7

    .line 21
    :goto_0
    if-ge v7, v5, :cond_6

    .line 22
    .line 23
    move v11, v6

    .line 24
    :goto_1
    iget v12, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ny:I

    .line 25
    .line 26
    mul-int v13, v11, v12

    .line 27
    .line 28
    iget v14, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->nx:I

    .line 29
    .line 30
    sub-int/2addr v12, v7

    .line 31
    mul-int/2addr v14, v12

    .line 32
    if-ge v13, v14, :cond_5

    .line 33
    .line 34
    move v12, v6

    .line 35
    :goto_2
    const-wide v13, 0x400921fb54442d18L    # Math.PI

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    if-ge v12, v1, :cond_0

    .line 41
    .line 42
    const/4 v15, 0x0

    .line 43
    const/high16 v16, 0x3f000000    # 0.5f

    .line 44
    .line 45
    int-to-double v9, v1

    .line 46
    div-double/2addr v13, v9

    .line 47
    int-to-double v9, v11

    .line 48
    mul-double/2addr v13, v9

    .line 49
    int-to-float v9, v12

    .line 50
    add-float v9, v9, v16

    .line 51
    .line 52
    float-to-double v9, v9

    .line 53
    mul-double/2addr v13, v9

    .line 54
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    double-to-float v9, v9

    .line 59
    aput v9, v4, v12

    .line 60
    .line 61
    add-int/lit8 v12, v12, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_0
    const/4 v15, 0x0

    .line 65
    const/high16 v16, 0x3f000000    # 0.5f

    .line 66
    .line 67
    move v9, v6

    .line 68
    move v10, v15

    .line 69
    :goto_3
    if-ge v9, v2, :cond_2

    .line 70
    .line 71
    move-wide/from16 v17, v13

    .line 72
    .line 73
    int-to-double v13, v2

    .line 74
    div-double v13, v17, v13

    .line 75
    .line 76
    int-to-double v2, v7

    .line 77
    mul-double/2addr v13, v2

    .line 78
    int-to-float v2, v9

    .line 79
    add-float v2, v2, v16

    .line 80
    .line 81
    float-to-double v2, v2

    .line 82
    mul-double/2addr v13, v2

    .line 83
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    double-to-float v2, v2

    .line 88
    move v3, v6

    .line 89
    :goto_4
    if-ge v3, v1, :cond_1

    .line 90
    .line 91
    mul-int v12, v9, v1

    .line 92
    .line 93
    add-int/2addr v12, v3

    .line 94
    aget v12, p3, v12

    .line 95
    .line 96
    aget v13, v4, v3

    .line 97
    .line 98
    mul-float/2addr v12, v13

    .line 99
    mul-float/2addr v12, v2

    .line 100
    add-float/2addr v10, v12

    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 105
    .line 106
    move/from16 v2, p2

    .line 107
    .line 108
    move-object/from16 v3, p3

    .line 109
    .line 110
    move-wide/from16 v13, v17

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_2
    mul-int v2, v1, p2

    .line 114
    .line 115
    int-to-float v2, v2

    .line 116
    div-float/2addr v10, v2

    .line 117
    if-gtz v11, :cond_4

    .line 118
    .line 119
    if-lez v7, :cond_3

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_3
    iput v10, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->dc:F

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_4
    :goto_5
    iget-object v2, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ac:[F

    .line 126
    .line 127
    add-int/lit8 v3, v8, 0x1

    .line 128
    .line 129
    aput v10, v2, v8

    .line 130
    .line 131
    iget v2, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->scale:F

    .line 132
    .line 133
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    invoke-static {v2, v8}, Ljava/lang/Math;->max(FF)F

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    iput v2, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->scale:F

    .line 142
    .line 143
    move v8, v3

    .line 144
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 145
    .line 146
    move/from16 v2, p2

    .line 147
    .line 148
    move-object/from16 v3, p3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 152
    .line 153
    move/from16 v2, p2

    .line 154
    .line 155
    move-object/from16 v3, p3

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_6
    const/4 v15, 0x0

    .line 160
    const/high16 v16, 0x3f000000    # 0.5f

    .line 161
    .line 162
    iget v1, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->scale:F

    .line 163
    .line 164
    cmpl-float v1, v1, v15

    .line 165
    .line 166
    if-lez v1, :cond_7

    .line 167
    .line 168
    iget-object v1, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ac:[F

    .line 169
    .line 170
    array-length v1, v1

    .line 171
    :goto_7
    if-ge v6, v1, :cond_7

    .line 172
    .line 173
    iget-object v2, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ac:[F

    .line 174
    .line 175
    iget v3, v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->scale:F

    .line 176
    .line 177
    div-float v10, v16, v3

    .line 178
    .line 179
    aget v3, v2, v6

    .line 180
    .line 181
    mul-float/2addr v10, v3

    .line 182
    add-float v10, v10, v16

    .line 183
    .line 184
    aput v10, v2, v6

    .line 185
    .line 186
    add-int/lit8 v6, v6, 0x1

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_7
    return-object v0
.end method

.method public final getAc()[F
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ac:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDc()F
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->dc:F

    .line 2
    .line 3
    return v0
.end method

.method public final getNx()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->nx:I

    .line 2
    .line 3
    return v0
.end method

.method public final getNy()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ny:I

    .line 2
    .line 3
    return v0
.end method

.method public final getScale()F
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->scale:F

    .line 2
    .line 3
    return v0
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
    iput-object p1, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ac:[F

    .line 7
    .line 8
    return-void
.end method

.method public final setDc(F)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->dc:F

    .line 2
    .line 3
    return-void
.end method

.method public final setNx(I)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->nx:I

    .line 2
    .line 3
    return-void
.end method

.method public final setNy(I)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ny:I

    .line 2
    .line 3
    return-void
.end method

.method public final setScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->scale:F

    .line 2
    .line 3
    return-void
.end method

.method public final writeTo([BII)I
    .locals 7

    .line 1
    const-string v0, "hash"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->ac:[F

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget v3, v0, v2

    .line 13
    .line 14
    shr-int/lit8 v4, p3, 0x1

    .line 15
    .line 16
    add-int/2addr v4, p2

    .line 17
    aget-byte v5, p1, v4

    .line 18
    .line 19
    const/high16 v6, 0x41700000    # 15.0f

    .line 20
    .line 21
    mul-float/2addr v3, v6

    .line 22
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    and-int/lit8 v6, p3, 0x1

    .line 27
    .line 28
    shl-int/lit8 v6, v6, 0x2

    .line 29
    .line 30
    shl-int/2addr v3, v6

    .line 31
    or-int/2addr v3, v5

    .line 32
    int-to-byte v3, v3

    .line 33
    aput-byte v3, p1, v4

    .line 34
    .line 35
    add-int/lit8 p3, p3, 0x1

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return p3
.end method
