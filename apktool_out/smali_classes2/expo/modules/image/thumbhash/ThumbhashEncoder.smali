.class public final Lexpo/modules/image/thumbhash/ThumbhashEncoder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/image/thumbhash/ThumbhashEncoder;",
        "",
        "<init>",
        "()V",
        "encode",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "resizeKeepingAspectRatio",
        "maxSize",
        "",
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
.field public static final INSTANCE:Lexpo/modules/image/thumbhash/ThumbhashEncoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/image/thumbhash/ThumbhashEncoder;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder;->INSTANCE:Lexpo/modules/image/thumbhash/ThumbhashEncoder;

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

.method private final resizeKeepingAspectRatio(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v0, v0

    .line 10
    int-to-float v1, v1

    .line 11
    div-float/2addr v0, v1

    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    cmpl-float v1, v0, v1

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    int-to-float v1, p2

    .line 19
    div-float/2addr v1, v0

    .line 20
    float-to-int v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    int-to-float v1, p2

    .line 23
    mul-float/2addr v1, v0

    .line 24
    float-to-int v0, v1

    .line 25
    move v2, v0

    .line 26
    move v0, p2

    .line 27
    move p2, v2

    .line 28
    :goto_0
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, p2, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p2, "createScaledBitmap(...)"

    .line 34
    .line 35
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method


# virtual methods
.method public final encode(Landroid/graphics/Bitmap;)[B
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "bitmap"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x64

    .line 9
    .line 10
    move-object/from16 v2, p0

    .line 11
    .line 12
    invoke-direct {v2, v0, v1}, Lexpo/modules/image/thumbhash/ThumbhashEncoder;->resizeKeepingAspectRatio(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v10

    .line 24
    mul-int v0, v6, v10

    .line 25
    .line 26
    new-array v4, v0, [I

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    move v9, v6

    .line 32
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    move v7, v1

    .line 37
    move v8, v7

    .line 38
    move v9, v8

    .line 39
    move v11, v9

    .line 40
    const/4 v5, 0x0

    .line 41
    :goto_0
    const/high16 v12, 0x437f0000    # 255.0f

    .line 42
    .line 43
    if-ge v5, v0, :cond_0

    .line 44
    .line 45
    aget v13, v4, v5

    .line 46
    .line 47
    invoke-static {v13}, Landroid/graphics/Color;->alpha(I)I

    .line 48
    .line 49
    .line 50
    move-result v13

    .line 51
    int-to-float v13, v13

    .line 52
    div-float/2addr v13, v12

    .line 53
    div-float v12, v13, v12

    .line 54
    .line 55
    aget v14, v4, v5

    .line 56
    .line 57
    invoke-static {v14}, Landroid/graphics/Color;->red(I)I

    .line 58
    .line 59
    .line 60
    move-result v14

    .line 61
    int-to-float v14, v14

    .line 62
    mul-float/2addr v14, v12

    .line 63
    add-float/2addr v8, v14

    .line 64
    aget v14, v4, v5

    .line 65
    .line 66
    invoke-static {v14}, Landroid/graphics/Color;->green(I)I

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    int-to-float v14, v14

    .line 71
    mul-float/2addr v14, v12

    .line 72
    add-float/2addr v9, v14

    .line 73
    aget v14, v4, v5

    .line 74
    .line 75
    invoke-static {v14}, Landroid/graphics/Color;->blue(I)I

    .line 76
    .line 77
    .line 78
    move-result v14

    .line 79
    int-to-float v14, v14

    .line 80
    mul-float/2addr v12, v14

    .line 81
    add-float/2addr v11, v12

    .line 82
    add-float/2addr v7, v13

    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    cmpl-float v1, v7, v1

    .line 87
    .line 88
    if-lez v1, :cond_1

    .line 89
    .line 90
    div-float/2addr v8, v7

    .line 91
    div-float/2addr v9, v7

    .line 92
    div-float/2addr v11, v7

    .line 93
    :cond_1
    int-to-float v1, v0

    .line 94
    cmpg-float v1, v7, v1

    .line 95
    .line 96
    const/4 v5, 0x1

    .line 97
    if-gez v1, :cond_2

    .line 98
    .line 99
    move v1, v5

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    const/4 v1, 0x0

    .line 102
    :goto_1
    if-eqz v1, :cond_3

    .line 103
    .line 104
    const/4 v13, 0x5

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    const/4 v13, 0x7

    .line 107
    :goto_2
    mul-int v14, v13, v6

    .line 108
    .line 109
    int-to-float v14, v14

    .line 110
    invoke-static {v6, v10}, Ljava/lang/Math;->max(II)I

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    int-to-float v15, v15

    .line 115
    div-float/2addr v14, v15

    .line 116
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 117
    .line 118
    .line 119
    move-result v14

    .line 120
    invoke-static {v5, v14}, Ljava/lang/Math;->max(II)I

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    mul-int/2addr v13, v10

    .line 125
    int-to-float v13, v13

    .line 126
    invoke-static {v6, v10}, Ljava/lang/Math;->max(II)I

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    int-to-float v15, v15

    .line 131
    div-float/2addr v13, v15

    .line 132
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    invoke-static {v5, v13}, Ljava/lang/Math;->max(II)I

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    new-array v15, v0, [F

    .line 141
    .line 142
    move/from16 p1, v5

    .line 143
    .line 144
    new-array v5, v0, [F

    .line 145
    .line 146
    move/from16 v16, v12

    .line 147
    .line 148
    new-array v12, v0, [F

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    new-array v3, v0, [F

    .line 153
    .line 154
    move/from16 v7, v17

    .line 155
    .line 156
    :goto_3
    if-ge v7, v0, :cond_4

    .line 157
    .line 158
    aget v19, v4, v7

    .line 159
    .line 160
    move/from16 v20, v0

    .line 161
    .line 162
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->alpha(I)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    and-int/lit16 v0, v0, 0xff

    .line 167
    .line 168
    int-to-float v0, v0

    .line 169
    div-float v0, v0, v16

    .line 170
    .line 171
    const/high16 v19, 0x3f800000    # 1.0f

    .line 172
    .line 173
    sub-float v19, v19, v0

    .line 174
    .line 175
    mul-float v21, v8, v19

    .line 176
    .line 177
    div-float v22, v0, v16

    .line 178
    .line 179
    aget v23, v4, v7

    .line 180
    .line 181
    move/from16 v24, v0

    .line 182
    .line 183
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->red(I)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    int-to-float v0, v0

    .line 188
    mul-float v0, v0, v22

    .line 189
    .line 190
    add-float v21, v21, v0

    .line 191
    .line 192
    mul-float v0, v9, v19

    .line 193
    .line 194
    aget v23, v4, v7

    .line 195
    .line 196
    move/from16 v25, v0

    .line 197
    .line 198
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->green(I)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    int-to-float v0, v0

    .line 203
    mul-float v0, v0, v22

    .line 204
    .line 205
    add-float v0, v25, v0

    .line 206
    .line 207
    mul-float v19, v19, v11

    .line 208
    .line 209
    aget v23, v4, v7

    .line 210
    .line 211
    move/from16 v25, v0

    .line 212
    .line 213
    invoke-static/range {v23 .. v23}, Landroid/graphics/Color;->blue(I)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    int-to-float v0, v0

    .line 218
    mul-float v22, v22, v0

    .line 219
    .line 220
    add-float v19, v19, v22

    .line 221
    .line 222
    add-float v0, v21, v25

    .line 223
    .line 224
    add-float v22, v0, v19

    .line 225
    .line 226
    const/high16 v23, 0x40400000    # 3.0f

    .line 227
    .line 228
    div-float v22, v22, v23

    .line 229
    .line 230
    aput v22, v15, v7

    .line 231
    .line 232
    const/high16 v22, 0x40000000    # 2.0f

    .line 233
    .line 234
    div-float v0, v0, v22

    .line 235
    .line 236
    sub-float v0, v0, v19

    .line 237
    .line 238
    aput v0, v5, v7

    .line 239
    .line 240
    sub-float v21, v21, v25

    .line 241
    .line 242
    aput v21, v12, v7

    .line 243
    .line 244
    aput v24, v3, v7

    .line 245
    .line 246
    add-int/lit8 v7, v7, 0x1

    .line 247
    .line 248
    move/from16 v0, v20

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_4
    new-instance v0, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 252
    .line 253
    const/4 v4, 0x3

    .line 254
    invoke-static {v4, v14}, Ljava/lang/Math;->max(II)I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    invoke-direct {v0, v7, v8}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;-><init>(II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v6, v10, v15}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->encode(II[F)Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    new-instance v7, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 270
    .line 271
    invoke-direct {v7, v4, v4}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;-><init>(II)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7, v6, v10, v5}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->encode(II[F)Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    new-instance v7, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 279
    .line 280
    invoke-direct {v7, v4, v4}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;-><init>(II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, v6, v10, v12}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->encode(II[F)Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    if-eqz v1, :cond_5

    .line 288
    .line 289
    new-instance v8, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 290
    .line 291
    const/4 v9, 0x5

    .line 292
    invoke-direct {v8, v9, v9}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;-><init>(II)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v8, v6, v10, v3}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->encode(II[F)Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    goto :goto_4

    .line 300
    :cond_5
    const/4 v3, 0x0

    .line 301
    :goto_4
    if-le v6, v10, :cond_6

    .line 302
    .line 303
    move/from16 v6, p1

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_6
    move/from16 v6, v17

    .line 307
    .line 308
    :goto_5
    invoke-virtual {v0}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getDc()F

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    const/high16 v9, 0x427c0000    # 63.0f

    .line 313
    .line 314
    mul-float/2addr v8, v9

    .line 315
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    invoke-virtual {v5}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getDc()F

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    const/high16 v11, 0x41fc0000    # 31.5f

    .line 324
    .line 325
    mul-float/2addr v10, v11

    .line 326
    add-float/2addr v10, v11

    .line 327
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    const/4 v12, 0x6

    .line 332
    shl-int/2addr v10, v12

    .line 333
    or-int/2addr v8, v10

    .line 334
    invoke-virtual {v7}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getDc()F

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    mul-float/2addr v10, v11

    .line 339
    add-float/2addr v10, v11

    .line 340
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    shl-int/lit8 v10, v10, 0xc

    .line 345
    .line 346
    or-int/2addr v8, v10

    .line 347
    const/high16 v10, 0x41f80000    # 31.0f

    .line 348
    .line 349
    invoke-virtual {v0}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getScale()F

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    mul-float/2addr v11, v10

    .line 354
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    shl-int/lit8 v10, v10, 0x12

    .line 359
    .line 360
    or-int/2addr v8, v10

    .line 361
    if-eqz v1, :cond_7

    .line 362
    .line 363
    const/high16 v10, 0x800000

    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_7
    move/from16 v10, v17

    .line 367
    .line 368
    :goto_6
    or-int/2addr v8, v10

    .line 369
    if-eqz v6, :cond_8

    .line 370
    .line 371
    move v14, v13

    .line 372
    :cond_8
    invoke-virtual {v5}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getScale()F

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    mul-float/2addr v10, v9

    .line 377
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    shl-int/2addr v10, v4

    .line 382
    or-int/2addr v10, v14

    .line 383
    invoke-virtual {v7}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getScale()F

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    mul-float/2addr v11, v9

    .line 388
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 389
    .line 390
    .line 391
    move-result v9

    .line 392
    shl-int/lit8 v9, v9, 0x9

    .line 393
    .line 394
    or-int/2addr v9, v10

    .line 395
    if-eqz v6, :cond_9

    .line 396
    .line 397
    const v6, 0x8000

    .line 398
    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_9
    move/from16 v6, v17

    .line 402
    .line 403
    :goto_7
    or-int/2addr v6, v9

    .line 404
    if-eqz v1, :cond_a

    .line 405
    .line 406
    move v9, v12

    .line 407
    goto :goto_8

    .line 408
    :cond_a
    const/4 v9, 0x5

    .line 409
    :goto_8
    invoke-virtual {v0}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getAc()[F

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    array-length v10, v10

    .line 414
    invoke-virtual {v5}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getAc()[F

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    array-length v11, v11

    .line 419
    add-int/2addr v10, v11

    .line 420
    invoke-virtual {v7}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getAc()[F

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    array-length v11, v11

    .line 425
    add-int/2addr v10, v11

    .line 426
    if-eqz v1, :cond_b

    .line 427
    .line 428
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getAc()[F

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    array-length v11, v11

    .line 436
    goto :goto_9

    .line 437
    :cond_b
    move/from16 v11, v17

    .line 438
    .line 439
    :goto_9
    add-int/2addr v10, v11

    .line 440
    add-int/lit8 v10, v10, 0x1

    .line 441
    .line 442
    const/4 v11, 0x2

    .line 443
    div-int/2addr v10, v11

    .line 444
    add-int/2addr v10, v9

    .line 445
    new-array v10, v10, [B

    .line 446
    .line 447
    int-to-byte v12, v8

    .line 448
    aput-byte v12, v10, v17

    .line 449
    .line 450
    shr-int/lit8 v12, v8, 0x8

    .line 451
    .line 452
    int-to-byte v12, v12

    .line 453
    aput-byte v12, v10, p1

    .line 454
    .line 455
    shr-int/lit8 v8, v8, 0x10

    .line 456
    .line 457
    int-to-byte v8, v8

    .line 458
    aput-byte v8, v10, v11

    .line 459
    .line 460
    int-to-byte v8, v6

    .line 461
    aput-byte v8, v10, v4

    .line 462
    .line 463
    shr-int/lit8 v4, v6, 0x8

    .line 464
    .line 465
    int-to-byte v4, v4

    .line 466
    const/4 v6, 0x4

    .line 467
    aput-byte v4, v10, v6

    .line 468
    .line 469
    if-eqz v1, :cond_c

    .line 470
    .line 471
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getDc()F

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    const/high16 v8, 0x41700000    # 15.0f

    .line 479
    .line 480
    mul-float/2addr v4, v8

    .line 481
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    invoke-virtual {v3}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->getScale()F

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    mul-float/2addr v11, v8

    .line 490
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 491
    .line 492
    .line 493
    move-result v8

    .line 494
    shl-int/lit8 v6, v8, 0x4

    .line 495
    .line 496
    or-int/2addr v4, v6

    .line 497
    int-to-byte v4, v4

    .line 498
    const/16 v18, 0x5

    .line 499
    .line 500
    aput-byte v4, v10, v18

    .line 501
    .line 502
    :cond_c
    move/from16 v4, v17

    .line 503
    .line 504
    invoke-virtual {v0, v10, v9, v4}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->writeTo([BII)I

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    invoke-virtual {v5, v10, v9, v0}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->writeTo([BII)I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    invoke-virtual {v7, v10, v9, v0}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->writeTo([BII)I

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v1, :cond_d

    .line 517
    .line 518
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, v10, v9, v0}, Lexpo/modules/image/thumbhash/ThumbhashEncoder$Channel;->writeTo([BII)I

    .line 522
    .line 523
    .line 524
    :cond_d
    return-object v10
.end method
