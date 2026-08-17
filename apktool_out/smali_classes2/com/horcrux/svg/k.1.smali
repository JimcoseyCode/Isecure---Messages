.class Lcom/horcrux/svg/k;
.super Lcom/horcrux/svg/q;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field i:Ljava/lang/String;

.field j:Lcom/horcrux/svg/t;

.field k:Lcom/facebook/react/bridge/ReadableArray;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/q;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Ljava/util/HashMap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/horcrux/svg/k;->i:Ljava/lang/String;

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    invoke-static {v2, v3, v1}, Lcom/horcrux/svg/q;->e(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Landroid/graphics/ColorMatrix;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/graphics/ColorMatrix;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v3, Lcom/horcrux/svg/k$a;->a:[I

    .line 19
    .line 20
    iget-object v4, v0, Lcom/horcrux/svg/k;->j:Lcom/horcrux/svg/t;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    aget v3, v3, v4

    .line 27
    .line 28
    const/16 v4, 0x14

    .line 29
    .line 30
    const/4 v5, 0x4

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x1

    .line 33
    if-eq v3, v7, :cond_5

    .line 34
    .line 35
    const/4 v8, 0x2

    .line 36
    if-eq v3, v8, :cond_3

    .line 37
    .line 38
    const/4 v9, 0x3

    .line 39
    if-eq v3, v9, :cond_1

    .line 40
    .line 41
    if-eq v3, v5, :cond_0

    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_0
    new-array v3, v4, [F

    .line 46
    .line 47
    fill-array-data v3, :array_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    iget-object v3, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 56
    .line 57
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eq v3, v7, :cond_2

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    iget-object v3, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 66
    .line 67
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 68
    .line 69
    .line 70
    move-result-wide v10

    .line 71
    double-to-float v3, v10

    .line 72
    float-to-double v10, v3

    .line 73
    const-wide v12, 0x400921fb54442d18L    # Math.PI

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    mul-double/2addr v10, v12

    .line 79
    const-wide v12, 0x4066800000000000L    # 180.0

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    div-double/2addr v10, v12

    .line 85
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 86
    .line 87
    .line 88
    move-result-wide v12

    .line 89
    double-to-float v3, v12

    .line 90
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide v10

    .line 94
    double-to-float v10, v10

    .line 95
    const v11, 0x3f4978d5    # 0.787f

    .line 96
    .line 97
    .line 98
    mul-float v12, v3, v11

    .line 99
    .line 100
    const v13, 0x3e5a1cac    # 0.213f

    .line 101
    .line 102
    .line 103
    add-float/2addr v12, v13

    .line 104
    mul-float v14, v10, v13

    .line 105
    .line 106
    sub-float/2addr v12, v14

    .line 107
    const v14, 0x3f370a3d    # 0.715f

    .line 108
    .line 109
    .line 110
    mul-float v15, v3, v14

    .line 111
    .line 112
    sub-float v15, v14, v15

    .line 113
    .line 114
    mul-float v16, v10, v14

    .line 115
    .line 116
    sub-float v17, v15, v16

    .line 117
    .line 118
    const v18, 0x3d9374bc    # 0.072f

    .line 119
    .line 120
    .line 121
    mul-float v19, v3, v18

    .line 122
    .line 123
    sub-float v19, v18, v19

    .line 124
    .line 125
    const v20, 0x3f6d9168    # 0.928f

    .line 126
    .line 127
    .line 128
    mul-float v21, v10, v20

    .line 129
    .line 130
    add-float v21, v19, v21

    .line 131
    .line 132
    mul-float v22, v3, v13

    .line 133
    .line 134
    sub-float v13, v13, v22

    .line 135
    .line 136
    const v22, 0x3e126e98    # 0.143f

    .line 137
    .line 138
    .line 139
    mul-float v22, v22, v10

    .line 140
    .line 141
    add-float v22, v13, v22

    .line 142
    .line 143
    const v23, 0x3e91eb85    # 0.285f

    .line 144
    .line 145
    .line 146
    mul-float v23, v23, v3

    .line 147
    .line 148
    add-float v23, v23, v14

    .line 149
    .line 150
    const v14, 0x3e0f5c29    # 0.14f

    .line 151
    .line 152
    .line 153
    mul-float/2addr v14, v10

    .line 154
    add-float v23, v23, v14

    .line 155
    .line 156
    const v14, 0x3e90e560    # 0.283f

    .line 157
    .line 158
    .line 159
    mul-float/2addr v14, v10

    .line 160
    sub-float v19, v19, v14

    .line 161
    .line 162
    mul-float/2addr v11, v10

    .line 163
    sub-float/2addr v13, v11

    .line 164
    add-float v15, v15, v16

    .line 165
    .line 166
    mul-float v3, v3, v20

    .line 167
    .line 168
    add-float v3, v3, v18

    .line 169
    .line 170
    mul-float v10, v10, v18

    .line 171
    .line 172
    add-float/2addr v3, v10

    .line 173
    new-array v4, v4, [F

    .line 174
    .line 175
    aput v12, v4, v6

    .line 176
    .line 177
    aput v17, v4, v7

    .line 178
    .line 179
    aput v21, v4, v8

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    aput v6, v4, v9

    .line 183
    .line 184
    aput v6, v4, v5

    .line 185
    .line 186
    const/4 v5, 0x5

    .line 187
    aput v22, v4, v5

    .line 188
    .line 189
    const/4 v5, 0x6

    .line 190
    aput v23, v4, v5

    .line 191
    .line 192
    const/4 v5, 0x7

    .line 193
    aput v19, v4, v5

    .line 194
    .line 195
    const/16 v5, 0x8

    .line 196
    .line 197
    aput v6, v4, v5

    .line 198
    .line 199
    const/16 v5, 0x9

    .line 200
    .line 201
    aput v6, v4, v5

    .line 202
    .line 203
    const/16 v5, 0xa

    .line 204
    .line 205
    aput v13, v4, v5

    .line 206
    .line 207
    const/16 v5, 0xb

    .line 208
    .line 209
    aput v15, v4, v5

    .line 210
    .line 211
    const/16 v5, 0xc

    .line 212
    .line 213
    aput v3, v4, v5

    .line 214
    .line 215
    const/16 v3, 0xd

    .line 216
    .line 217
    aput v6, v4, v3

    .line 218
    .line 219
    const/16 v3, 0xe

    .line 220
    .line 221
    aput v6, v4, v3

    .line 222
    .line 223
    const/16 v3, 0xf

    .line 224
    .line 225
    aput v6, v4, v3

    .line 226
    .line 227
    const/16 v3, 0x10

    .line 228
    .line 229
    aput v6, v4, v3

    .line 230
    .line 231
    const/16 v3, 0x11

    .line 232
    .line 233
    aput v6, v4, v3

    .line 234
    .line 235
    const/high16 v3, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/16 v5, 0x12

    .line 238
    .line 239
    aput v3, v4, v5

    .line 240
    .line 241
    const/16 v3, 0x13

    .line 242
    .line 243
    aput v6, v4, v3

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_3
    iget-object v3, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 250
    .line 251
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eq v3, v7, :cond_4

    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_4
    iget-object v3, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 259
    .line 260
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 261
    .line 262
    .line 263
    move-result-wide v3

    .line 264
    double-to-float v3, v3

    .line 265
    invoke-virtual {v2, v3}, Landroid/graphics/ColorMatrix;->setSaturation(F)V

    .line 266
    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_5
    iget-object v3, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 270
    .line 271
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-ge v3, v4, :cond_6

    .line 276
    .line 277
    :goto_0
    return-object v1

    .line 278
    :cond_6
    iget-object v3, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 279
    .line 280
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    new-array v3, v3, [F

    .line 285
    .line 286
    :goto_1
    iget-object v4, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 287
    .line 288
    invoke-interface {v4}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-ge v6, v4, :cond_8

    .line 293
    .line 294
    iget-object v4, v0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 295
    .line 296
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 297
    .line 298
    .line 299
    move-result-wide v8

    .line 300
    double-to-float v4, v8

    .line 301
    rem-int/lit8 v8, v6, 0x5

    .line 302
    .line 303
    if-ne v8, v5, :cond_7

    .line 304
    .line 305
    const/16 v8, 0xff

    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_7
    move v8, v7

    .line 309
    :goto_2
    int-to-float v8, v8

    .line 310
    mul-float/2addr v4, v8

    .line 311
    aput v4, v3, v6

    .line 312
    .line 313
    add-int/lit8 v6, v6, 0x1

    .line 314
    .line 315
    goto :goto_1

    .line 316
    :cond_8
    invoke-virtual {v2, v3}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 317
    .line 318
    .line 319
    :goto_3
    invoke-static {v2, v1}, Lcom/horcrux/svg/FilterUtils;->getBitmapWithColorMatrix(Landroid/graphics/ColorMatrix;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    return-object v1

    .line 324
    nop

    .line 325
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3e59999a    # 0.2125f
        0x3f372474    # 0.7154f
        0x3d93a92a    # 0.0721f
        0x0
        0x0
    .end array-data
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/k;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/t;->j(Ljava/lang/String;)Lcom/horcrux/svg/t;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/k;->j:Lcom/horcrux/svg/t;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public m(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/k;->k:Lcom/facebook/react/bridge/ReadableArray;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
