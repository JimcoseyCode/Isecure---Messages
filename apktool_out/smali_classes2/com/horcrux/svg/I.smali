.class abstract Lcom/horcrux/svg/I;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field static a:F

.field private static b:I

.field private static c:I

.field private static d:Ljava/lang/String;

.field private static e:Landroid/graphics/Path;

.field static f:Ljava/util/ArrayList;

.field private static g:F

.field private static h:F

.field private static i:F

.field private static j:F

.field private static k:F

.field private static l:F

.field private static m:Z


# direct methods
.method private static A(FFFF)V
    .locals 9

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    sget v2, Lcom/horcrux/svg/I;->i:F

    .line 7
    .line 8
    sub-float v3, v0, v2

    .line 9
    .line 10
    sget v0, Lcom/horcrux/svg/I;->h:F

    .line 11
    .line 12
    mul-float/2addr v0, v1

    .line 13
    sget v1, Lcom/horcrux/svg/I;->j:F

    .line 14
    .line 15
    sub-float v4, v0, v1

    .line 16
    .line 17
    sput p0, Lcom/horcrux/svg/I;->i:F

    .line 18
    .line 19
    sput p1, Lcom/horcrux/svg/I;->j:F

    .line 20
    .line 21
    move v5, p0

    .line 22
    move v6, p1

    .line 23
    move v7, p2

    .line 24
    move v8, p3

    .line 25
    invoke-static/range {v3 .. v8}, Lcom/horcrux/svg/I;->e(FFFFFF)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static B(FF)V
    .locals 1

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    add-float/2addr p0, v0

    .line 4
    sget v0, Lcom/horcrux/svg/I;->h:F

    .line 5
    .line 6
    add-float/2addr p1, v0

    .line 7
    invoke-static {p0, p1}, Lcom/horcrux/svg/I;->C(FF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static C(FF)V
    .locals 3

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    sget v2, Lcom/horcrux/svg/I;->i:F

    .line 7
    .line 8
    sub-float/2addr v0, v2

    .line 9
    sget v2, Lcom/horcrux/svg/I;->h:F

    .line 10
    .line 11
    mul-float/2addr v2, v1

    .line 12
    sget v1, Lcom/horcrux/svg/I;->j:F

    .line 13
    .line 14
    sub-float/2addr v2, v1

    .line 15
    invoke-static {v0, v2, p0, p1}, Lcom/horcrux/svg/I;->u(FFFF)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static a(FFFZZFF)V
    .locals 1

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    add-float/2addr p5, v0

    .line 4
    sget v0, Lcom/horcrux/svg/I;->h:F

    .line 5
    .line 6
    add-float/2addr p6, v0

    .line 7
    invoke-static/range {p0 .. p6}, Lcom/horcrux/svg/I;->b(FFFZZFF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static b(FFFZZFF)V
    .locals 21

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    move/from16 v6, p4

    .line 4
    .line 5
    sget v1, Lcom/horcrux/svg/I;->g:F

    .line 6
    .line 7
    sget v2, Lcom/horcrux/svg/I;->h:F

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    cmpl-float v4, p1, v3

    .line 11
    .line 12
    if-nez v4, :cond_1

    .line 13
    .line 14
    cmpl-float v4, p0, v3

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    sub-float v4, p6, v2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move/from16 v4, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move/from16 v4, p1

    .line 25
    .line 26
    :goto_0
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    cmpl-float v5, p0, v3

    .line 31
    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    sub-float v5, p5, v1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move/from16 v5, p0

    .line 38
    .line 39
    :goto_1
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    cmpl-float v7, v5, v3

    .line 44
    .line 45
    if-eqz v7, :cond_b

    .line 46
    .line 47
    cmpl-float v7, v4, v3

    .line 48
    .line 49
    if-eqz v7, :cond_b

    .line 50
    .line 51
    cmpl-float v7, p5, v1

    .line 52
    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    cmpl-float v7, p6, v2

    .line 56
    .line 57
    if-nez v7, :cond_3

    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_3
    move/from16 v7, p2

    .line 62
    .line 63
    float-to-double v7, v7

    .line 64
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    double-to-float v7, v7

    .line 69
    float-to-double v8, v7

    .line 70
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 71
    .line 72
    .line 73
    move-result-wide v10

    .line 74
    double-to-float v10, v10

    .line 75
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v8

    .line 79
    double-to-float v8, v8

    .line 80
    sub-float v9, p5, v1

    .line 81
    .line 82
    sub-float v11, p6, v2

    .line 83
    .line 84
    mul-float v12, v10, v9

    .line 85
    .line 86
    const/high16 v13, 0x40000000    # 2.0f

    .line 87
    .line 88
    div-float/2addr v12, v13

    .line 89
    mul-float v14, v8, v11

    .line 90
    .line 91
    div-float/2addr v14, v13

    .line 92
    add-float/2addr v12, v14

    .line 93
    neg-float v14, v8

    .line 94
    mul-float v15, v14, v9

    .line 95
    .line 96
    div-float/2addr v15, v13

    .line 97
    mul-float v16, v10, v11

    .line 98
    .line 99
    div-float v16, v16, v13

    .line 100
    .line 101
    add-float v15, v15, v16

    .line 102
    .line 103
    mul-float v16, v5, v5

    .line 104
    .line 105
    mul-float v17, v16, v4

    .line 106
    .line 107
    mul-float v17, v17, v4

    .line 108
    .line 109
    mul-float v18, v4, v4

    .line 110
    .line 111
    mul-float v18, v18, v12

    .line 112
    .line 113
    mul-float v18, v18, v12

    .line 114
    .line 115
    mul-float v16, v16, v15

    .line 116
    .line 117
    mul-float v16, v16, v15

    .line 118
    .line 119
    sub-float v19, v17, v16

    .line 120
    .line 121
    sub-float v19, v19, v18

    .line 122
    .line 123
    cmpg-float v20, v19, v3

    .line 124
    .line 125
    if-gez v20, :cond_4

    .line 126
    .line 127
    const/high16 v12, 0x3f800000    # 1.0f

    .line 128
    .line 129
    div-float v19, v19, v17

    .line 130
    .line 131
    sub-float v12, v12, v19

    .line 132
    .line 133
    move/from16 v17, v3

    .line 134
    .line 135
    move/from16 p1, v4

    .line 136
    .line 137
    float-to-double v3, v12

    .line 138
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 139
    .line 140
    .line 141
    move-result-wide v3

    .line 142
    double-to-float v3, v3

    .line 143
    mul-float/2addr v5, v3

    .line 144
    mul-float v4, p1, v3

    .line 145
    .line 146
    div-float v3, v9, v13

    .line 147
    .line 148
    div-float v12, v11, v13

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move/from16 v17, v3

    .line 152
    .line 153
    move/from16 p1, v4

    .line 154
    .line 155
    add-float v16, v16, v18

    .line 156
    .line 157
    div-float v3, v19, v16

    .line 158
    .line 159
    float-to-double v3, v3

    .line 160
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    double-to-float v3, v3

    .line 165
    if-ne v0, v6, :cond_5

    .line 166
    .line 167
    neg-float v3, v3

    .line 168
    :cond_5
    neg-float v4, v3

    .line 169
    mul-float/2addr v4, v15

    .line 170
    mul-float/2addr v4, v5

    .line 171
    div-float v4, v4, p1

    .line 172
    .line 173
    mul-float/2addr v3, v12

    .line 174
    mul-float v3, v3, p1

    .line 175
    .line 176
    div-float/2addr v3, v5

    .line 177
    mul-float v12, v10, v4

    .line 178
    .line 179
    mul-float v15, v8, v3

    .line 180
    .line 181
    sub-float/2addr v12, v15

    .line 182
    div-float v15, v9, v13

    .line 183
    .line 184
    add-float/2addr v12, v15

    .line 185
    mul-float/2addr v4, v8

    .line 186
    mul-float/2addr v3, v10

    .line 187
    add-float/2addr v4, v3

    .line 188
    div-float v3, v11, v13

    .line 189
    .line 190
    add-float/2addr v3, v4

    .line 191
    move v4, v12

    .line 192
    move v12, v3

    .line 193
    move v3, v4

    .line 194
    move/from16 v4, p1

    .line 195
    .line 196
    :goto_2
    div-float v13, v10, v5

    .line 197
    .line 198
    div-float/2addr v8, v5

    .line 199
    div-float/2addr v14, v4

    .line 200
    div-float/2addr v10, v4

    .line 201
    neg-float v15, v3

    .line 202
    mul-float v16, v14, v15

    .line 203
    .line 204
    neg-float v0, v12

    .line 205
    mul-float v18, v10, v0

    .line 206
    .line 207
    move/from16 v19, v0

    .line 208
    .line 209
    add-float v0, v16, v18

    .line 210
    .line 211
    move/from16 v16, v1

    .line 212
    .line 213
    float-to-double v0, v0

    .line 214
    mul-float/2addr v15, v13

    .line 215
    mul-float v18, v8, v19

    .line 216
    .line 217
    add-float v15, v15, v18

    .line 218
    .line 219
    move/from16 v18, v2

    .line 220
    .line 221
    move/from16 v19, v3

    .line 222
    .line 223
    float-to-double v2, v15

    .line 224
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 225
    .line 226
    .line 227
    move-result-wide v0

    .line 228
    double-to-float v0, v0

    .line 229
    sub-float v1, v9, v19

    .line 230
    .line 231
    mul-float/2addr v14, v1

    .line 232
    sub-float v2, v11, v12

    .line 233
    .line 234
    mul-float/2addr v10, v2

    .line 235
    add-float/2addr v14, v10

    .line 236
    float-to-double v14, v14

    .line 237
    mul-float/2addr v13, v1

    .line 238
    mul-float/2addr v8, v2

    .line 239
    add-float/2addr v13, v8

    .line 240
    float-to-double v1, v13

    .line 241
    invoke-static {v14, v15, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    .line 242
    .line 243
    .line 244
    move-result-wide v1

    .line 245
    double-to-float v1, v1

    .line 246
    add-float v3, v19, v16

    .line 247
    .line 248
    add-float v12, v12, v18

    .line 249
    .line 250
    add-float v9, v9, v16

    .line 251
    .line 252
    add-float v11, v11, v18

    .line 253
    .line 254
    invoke-static {}, Lcom/horcrux/svg/I;->w()V

    .line 255
    .line 256
    .line 257
    sput v9, Lcom/horcrux/svg/I;->i:F

    .line 258
    .line 259
    sput v9, Lcom/horcrux/svg/I;->g:F

    .line 260
    .line 261
    sput v11, Lcom/horcrux/svg/I;->j:F

    .line 262
    .line 263
    sput v11, Lcom/horcrux/svg/I;->h:F

    .line 264
    .line 265
    cmpl-float v2, v5, v4

    .line 266
    .line 267
    if-nez v2, :cond_6

    .line 268
    .line 269
    cmpl-float v2, v7, v17

    .line 270
    .line 271
    if-eqz v2, :cond_7

    .line 272
    .line 273
    :cond_6
    move v2, v4

    .line 274
    move v4, v0

    .line 275
    move v0, v3

    .line 276
    move v3, v2

    .line 277
    move v2, v5

    .line 278
    move v5, v1

    .line 279
    move v1, v12

    .line 280
    goto :goto_5

    .line 281
    :cond_7
    float-to-double v7, v0

    .line 282
    invoke-static {v7, v8}, Ljava/lang/Math;->toDegrees(D)D

    .line 283
    .line 284
    .line 285
    move-result-wide v7

    .line 286
    double-to-float v0, v7

    .line 287
    float-to-double v1, v1

    .line 288
    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    .line 289
    .line 290
    .line 291
    move-result-wide v1

    .line 292
    double-to-float v1, v1

    .line 293
    sub-float v1, v0, v1

    .line 294
    .line 295
    const/high16 v2, 0x43b40000    # 360.0f

    .line 296
    .line 297
    rem-float/2addr v1, v2

    .line 298
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    const/high16 v4, 0x43340000    # 180.0f

    .line 303
    .line 304
    if-eqz p3, :cond_8

    .line 305
    .line 306
    cmpg-float v4, v1, v4

    .line 307
    .line 308
    if-gez v4, :cond_9

    .line 309
    .line 310
    :goto_3
    sub-float v1, v2, v1

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_8
    cmpl-float v4, v1, v4

    .line 314
    .line 315
    if-lez v4, :cond_9

    .line 316
    .line 317
    goto :goto_3

    .line 318
    :cond_9
    :goto_4
    if-nez v6, :cond_a

    .line 319
    .line 320
    neg-float v1, v1

    .line 321
    :cond_a
    new-instance v2, Landroid/graphics/RectF;

    .line 322
    .line 323
    sub-float v4, v3, v5

    .line 324
    .line 325
    sget v6, Lcom/horcrux/svg/I;->a:F

    .line 326
    .line 327
    mul-float/2addr v4, v6

    .line 328
    sub-float v7, v12, v5

    .line 329
    .line 330
    mul-float/2addr v7, v6

    .line 331
    add-float/2addr v3, v5

    .line 332
    mul-float/2addr v3, v6

    .line 333
    add-float/2addr v12, v5

    .line 334
    mul-float/2addr v12, v6

    .line 335
    invoke-direct {v2, v4, v7, v3, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 336
    .line 337
    .line 338
    sget-object v3, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 339
    .line 340
    invoke-virtual {v3, v2, v0, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 341
    .line 342
    .line 343
    sget-object v0, Lcom/horcrux/svg/I;->f:Ljava/util/ArrayList;

    .line 344
    .line 345
    new-instance v1, Lcom/horcrux/svg/H;

    .line 346
    .line 347
    sget-object v2, Lcom/horcrux/svg/g;->g:Lcom/horcrux/svg/g;

    .line 348
    .line 349
    new-instance v3, Lcom/horcrux/svg/L;

    .line 350
    .line 351
    float-to-double v4, v9

    .line 352
    float-to-double v6, v11

    .line 353
    invoke-direct {v3, v4, v5, v6, v7}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 354
    .line 355
    .line 356
    filled-new-array {v3}, [Lcom/horcrux/svg/L;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-direct {v1, v2, v3}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :goto_5
    invoke-static/range {v0 .. v7}, Lcom/horcrux/svg/I;->c(FFFFFFZF)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_b
    :goto_6
    invoke-static/range {p5 .. p6}, Lcom/horcrux/svg/I;->l(FF)V

    .line 372
    .line 373
    .line 374
    return-void
.end method

.method private static c(FFFFFFZF)V
    .locals 23

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    move/from16 v1, p7

    .line 4
    .line 5
    float-to-double v1, v1

    .line 6
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v3

    .line 10
    double-to-float v3, v3

    .line 11
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    double-to-float v1, v1

    .line 16
    mul-float v2, v3, p2

    .line 17
    .line 18
    neg-float v4, v1

    .line 19
    mul-float v4, v4, p3

    .line 20
    .line 21
    mul-float v1, v1, p2

    .line 22
    .line 23
    mul-float v3, v3, p3

    .line 24
    .line 25
    sub-float v5, p5, v0

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    cmpg-float v7, v5, v6

    .line 29
    .line 30
    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    if-gez v7, :cond_0

    .line 36
    .line 37
    if-eqz p6, :cond_0

    .line 38
    .line 39
    float-to-double v5, v5

    .line 40
    add-double/2addr v5, v8

    .line 41
    :goto_0
    double-to-float v5, v5

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    cmpl-float v6, v5, v6

    .line 44
    .line 45
    if-lez v6, :cond_1

    .line 46
    .line 47
    if-nez p6, :cond_1

    .line 48
    .line 49
    float-to-double v5, v5

    .line 50
    sub-double/2addr v5, v8

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    float-to-double v6, v5

    .line 53
    const-wide v8, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    div-double/2addr v6, v8

    .line 59
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->v(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    double-to-int v6, v6

    .line 72
    int-to-float v7, v6

    .line 73
    div-float/2addr v5, v7

    .line 74
    const/high16 v7, 0x40800000    # 4.0f

    .line 75
    .line 76
    div-float v7, v5, v7

    .line 77
    .line 78
    float-to-double v7, v7

    .line 79
    invoke-static {v7, v8}, Ljava/lang/Math;->tan(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    const-wide v9, 0x3ff5555555555555L    # 1.3333333333333333

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    mul-double/2addr v7, v9

    .line 89
    double-to-float v7, v7

    .line 90
    float-to-double v8, v0

    .line 91
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v10

    .line 95
    double-to-float v10, v10

    .line 96
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v8

    .line 100
    double-to-float v8, v8

    .line 101
    const/4 v9, 0x0

    .line 102
    :goto_2
    if-ge v9, v6, :cond_2

    .line 103
    .line 104
    mul-float v11, v7, v8

    .line 105
    .line 106
    sub-float v11, v10, v11

    .line 107
    .line 108
    mul-float/2addr v10, v7

    .line 109
    add-float/2addr v8, v10

    .line 110
    add-float/2addr v0, v5

    .line 111
    float-to-double v12, v0

    .line 112
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 113
    .line 114
    .line 115
    move-result-wide v14

    .line 116
    double-to-float v10, v14

    .line 117
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v12

    .line 121
    double-to-float v12, v12

    .line 122
    mul-float v13, v7, v12

    .line 123
    .line 124
    add-float/2addr v13, v10

    .line 125
    mul-float v14, v7, v10

    .line 126
    .line 127
    sub-float v14, v12, v14

    .line 128
    .line 129
    mul-float v15, v2, v11

    .line 130
    .line 131
    add-float v15, p0, v15

    .line 132
    .line 133
    mul-float v16, v4, v8

    .line 134
    .line 135
    add-float v15, v15, v16

    .line 136
    .line 137
    mul-float/2addr v11, v1

    .line 138
    add-float v11, p1, v11

    .line 139
    .line 140
    mul-float/2addr v8, v3

    .line 141
    add-float/2addr v11, v8

    .line 142
    mul-float v8, v2, v13

    .line 143
    .line 144
    add-float v8, p0, v8

    .line 145
    .line 146
    mul-float v16, v4, v14

    .line 147
    .line 148
    add-float v8, v8, v16

    .line 149
    .line 150
    mul-float/2addr v13, v1

    .line 151
    add-float v13, p1, v13

    .line 152
    .line 153
    mul-float/2addr v14, v3

    .line 154
    add-float/2addr v13, v14

    .line 155
    mul-float v14, v2, v10

    .line 156
    .line 157
    add-float v14, p0, v14

    .line 158
    .line 159
    mul-float v16, v4, v12

    .line 160
    .line 161
    add-float v14, v14, v16

    .line 162
    .line 163
    mul-float v16, v1, v10

    .line 164
    .line 165
    add-float v16, p1, v16

    .line 166
    .line 167
    mul-float v17, v3, v12

    .line 168
    .line 169
    move/from16 p2, v0

    .line 170
    .line 171
    add-float v0, v16, v17

    .line 172
    .line 173
    sget-object v16, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 174
    .line 175
    sget v17, Lcom/horcrux/svg/I;->a:F

    .line 176
    .line 177
    move/from16 v18, v17

    .line 178
    .line 179
    mul-float v17, v15, v18

    .line 180
    .line 181
    move/from16 v19, v18

    .line 182
    .line 183
    mul-float v18, v11, v19

    .line 184
    .line 185
    move/from16 v20, v19

    .line 186
    .line 187
    mul-float v19, v8, v20

    .line 188
    .line 189
    move/from16 v21, v20

    .line 190
    .line 191
    mul-float v20, v13, v21

    .line 192
    .line 193
    move/from16 v22, v21

    .line 194
    .line 195
    mul-float v21, v14, v22

    .line 196
    .line 197
    mul-float v22, v22, v0

    .line 198
    .line 199
    invoke-virtual/range {v16 .. v22}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 200
    .line 201
    .line 202
    move/from16 p7, v1

    .line 203
    .line 204
    sget-object v1, Lcom/horcrux/svg/I;->f:Ljava/util/ArrayList;

    .line 205
    .line 206
    move/from16 v16, v2

    .line 207
    .line 208
    new-instance v2, Lcom/horcrux/svg/H;

    .line 209
    .line 210
    move/from16 p3, v3

    .line 211
    .line 212
    sget-object v3, Lcom/horcrux/svg/g;->g:Lcom/horcrux/svg/g;

    .line 213
    .line 214
    move/from16 v17, v4

    .line 215
    .line 216
    new-instance v4, Lcom/horcrux/svg/L;

    .line 217
    .line 218
    move/from16 p5, v5

    .line 219
    .line 220
    move/from16 v18, v6

    .line 221
    .line 222
    float-to-double v5, v15

    .line 223
    move v15, v9

    .line 224
    move/from16 v19, v10

    .line 225
    .line 226
    float-to-double v9, v11

    .line 227
    invoke-direct {v4, v5, v6, v9, v10}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 228
    .line 229
    .line 230
    new-instance v5, Lcom/horcrux/svg/L;

    .line 231
    .line 232
    float-to-double v8, v8

    .line 233
    float-to-double v10, v13

    .line 234
    invoke-direct {v5, v8, v9, v10, v11}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 235
    .line 236
    .line 237
    new-instance v6, Lcom/horcrux/svg/L;

    .line 238
    .line 239
    float-to-double v8, v14

    .line 240
    float-to-double v10, v0

    .line 241
    invoke-direct {v6, v8, v9, v10, v11}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 242
    .line 243
    .line 244
    filled-new-array {v4, v5, v6}, [Lcom/horcrux/svg/L;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-direct {v2, v3, v0}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    add-int/lit8 v9, v15, 0x1

    .line 255
    .line 256
    move/from16 v0, p2

    .line 257
    .line 258
    move/from16 v3, p3

    .line 259
    .line 260
    move/from16 v5, p5

    .line 261
    .line 262
    move/from16 v1, p7

    .line 263
    .line 264
    move v8, v12

    .line 265
    move/from16 v2, v16

    .line 266
    .line 267
    move/from16 v4, v17

    .line 268
    .line 269
    move/from16 v6, v18

    .line 270
    .line 271
    move/from16 v10, v19

    .line 272
    .line 273
    goto/16 :goto_2

    .line 274
    .line 275
    :cond_2
    return-void
.end method

.method private static d()V
    .locals 8

    .line 1
    sget-boolean v0, Lcom/horcrux/svg/I;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Lcom/horcrux/svg/I;->k:F

    .line 6
    .line 7
    sput v0, Lcom/horcrux/svg/I;->g:F

    .line 8
    .line 9
    sget v0, Lcom/horcrux/svg/I;->l:F

    .line 10
    .line 11
    sput v0, Lcom/horcrux/svg/I;->h:F

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    sput-boolean v0, Lcom/horcrux/svg/I;->m:Z

    .line 15
    .line 16
    sget-object v0, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/horcrux/svg/I;->f:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance v1, Lcom/horcrux/svg/H;

    .line 24
    .line 25
    sget-object v2, Lcom/horcrux/svg/g;->k:Lcom/horcrux/svg/g;

    .line 26
    .line 27
    new-instance v3, Lcom/horcrux/svg/L;

    .line 28
    .line 29
    sget v4, Lcom/horcrux/svg/I;->g:F

    .line 30
    .line 31
    float-to-double v4, v4

    .line 32
    sget v6, Lcom/horcrux/svg/I;->h:F

    .line 33
    .line 34
    float-to-double v6, v6

    .line 35
    invoke-direct {v3, v4, v5, v6, v7}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 36
    .line 37
    .line 38
    filled-new-array {v3}, [Lcom/horcrux/svg/L;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {v1, v2, v3}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method private static e(FFFFFF)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/horcrux/svg/I;->w()V

    .line 2
    .line 3
    .line 4
    sput p4, Lcom/horcrux/svg/I;->g:F

    .line 5
    .line 6
    sput p5, Lcom/horcrux/svg/I;->h:F

    .line 7
    .line 8
    sget-object v0, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 9
    .line 10
    sget v1, Lcom/horcrux/svg/I;->a:F

    .line 11
    .line 12
    move v2, v1

    .line 13
    mul-float v1, p0, v2

    .line 14
    .line 15
    move v3, v2

    .line 16
    mul-float v2, p1, v3

    .line 17
    .line 18
    move v4, v3

    .line 19
    mul-float v3, p2, v4

    .line 20
    .line 21
    move v5, v4

    .line 22
    mul-float v4, p3, v5

    .line 23
    .line 24
    move v6, v5

    .line 25
    mul-float v5, p4, v6

    .line 26
    .line 27
    mul-float/2addr v6, p5

    .line 28
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lcom/horcrux/svg/I;->f:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance v1, Lcom/horcrux/svg/H;

    .line 34
    .line 35
    sget-object v2, Lcom/horcrux/svg/g;->g:Lcom/horcrux/svg/g;

    .line 36
    .line 37
    new-instance v3, Lcom/horcrux/svg/L;

    .line 38
    .line 39
    float-to-double v4, p0

    .line 40
    float-to-double p0, p1

    .line 41
    invoke-direct {v3, v4, v5, p0, p1}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Lcom/horcrux/svg/L;

    .line 45
    .line 46
    float-to-double p1, p2

    .line 47
    float-to-double v4, p3

    .line 48
    invoke-direct {p0, p1, p2, v4, v5}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lcom/horcrux/svg/L;

    .line 52
    .line 53
    float-to-double p2, p4

    .line 54
    float-to-double p4, p5

    .line 55
    invoke-direct {p1, p2, p3, p4, p5}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 56
    .line 57
    .line 58
    filled-new-array {v3, p0, p1}, [Lcom/horcrux/svg/L;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {v1, v2, p0}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private static f(FFFFFF)V
    .locals 2

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    add-float/2addr p0, v0

    .line 4
    sget v1, Lcom/horcrux/svg/I;->h:F

    .line 5
    .line 6
    add-float/2addr p1, v1

    .line 7
    add-float/2addr p2, v0

    .line 8
    add-float/2addr p3, v1

    .line 9
    add-float/2addr p4, v0

    .line 10
    add-float/2addr p5, v1

    .line 11
    invoke-static/range {p0 .. p5}, Lcom/horcrux/svg/I;->g(FFFFFF)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static g(FFFFFF)V
    .locals 0

    .line 1
    sput p2, Lcom/horcrux/svg/I;->i:F

    .line 2
    .line 3
    sput p3, Lcom/horcrux/svg/I;->j:F

    .line 4
    .line 5
    invoke-static/range {p0 .. p5}, Lcom/horcrux/svg/I;->e(FFFFFF)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static h(C)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static i(C)Z
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    nop

    .line 9
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_0
        0x43 -> :sswitch_0
        0x48 -> :sswitch_0
        0x4c -> :sswitch_0
        0x4d -> :sswitch_0
        0x51 -> :sswitch_0
        0x53 -> :sswitch_0
        0x54 -> :sswitch_0
        0x56 -> :sswitch_0
        0x5a -> :sswitch_0
        0x61 -> :sswitch_0
        0x63 -> :sswitch_0
        0x68 -> :sswitch_0
        0x6c -> :sswitch_0
        0x6d -> :sswitch_0
        0x71 -> :sswitch_0
        0x73 -> :sswitch_0
        0x74 -> :sswitch_0
        0x76 -> :sswitch_0
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method private static j(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x39

    .line 6
    .line 7
    if-le p0, v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x2e

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x2d

    .line 14
    .line 15
    if-eq p0, v0, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x2b

    .line 18
    .line 19
    if-ne p0, v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method private static k(FF)V
    .locals 1

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    add-float/2addr p0, v0

    .line 4
    sget v0, Lcom/horcrux/svg/I;->h:F

    .line 5
    .line 6
    add-float/2addr p1, v0

    .line 7
    invoke-static {p0, p1}, Lcom/horcrux/svg/I;->l(FF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static l(FF)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/horcrux/svg/I;->w()V

    .line 2
    .line 3
    .line 4
    sput p0, Lcom/horcrux/svg/I;->g:F

    .line 5
    .line 6
    sput p0, Lcom/horcrux/svg/I;->i:F

    .line 7
    .line 8
    sput p1, Lcom/horcrux/svg/I;->h:F

    .line 9
    .line 10
    sput p1, Lcom/horcrux/svg/I;->j:F

    .line 11
    .line 12
    sget-object v0, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 13
    .line 14
    sget v1, Lcom/horcrux/svg/I;->a:F

    .line 15
    .line 16
    mul-float v2, p0, v1

    .line 17
    .line 18
    mul-float/2addr v1, p1

    .line 19
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lcom/horcrux/svg/I;->f:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v1, Lcom/horcrux/svg/H;

    .line 25
    .line 26
    sget-object v2, Lcom/horcrux/svg/g;->j:Lcom/horcrux/svg/g;

    .line 27
    .line 28
    new-instance v3, Lcom/horcrux/svg/L;

    .line 29
    .line 30
    float-to-double v4, p0

    .line 31
    float-to-double p0, p1

    .line 32
    invoke-direct {v3, v4, v5, p0, p1}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 33
    .line 34
    .line 35
    filled-new-array {v3}, [Lcom/horcrux/svg/L;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v1, v2, p0}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private static m(FF)V
    .locals 1

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    add-float/2addr p0, v0

    .line 4
    sget v0, Lcom/horcrux/svg/I;->h:F

    .line 5
    .line 6
    add-float/2addr p1, v0

    .line 7
    invoke-static {p0, p1}, Lcom/horcrux/svg/I;->n(FF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static n(FF)V
    .locals 6

    .line 1
    sput p0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    sput p0, Lcom/horcrux/svg/I;->i:F

    .line 4
    .line 5
    sput p0, Lcom/horcrux/svg/I;->k:F

    .line 6
    .line 7
    sput p1, Lcom/horcrux/svg/I;->h:F

    .line 8
    .line 9
    sput p1, Lcom/horcrux/svg/I;->j:F

    .line 10
    .line 11
    sput p1, Lcom/horcrux/svg/I;->l:F

    .line 12
    .line 13
    sget-object v0, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 14
    .line 15
    sget v1, Lcom/horcrux/svg/I;->a:F

    .line 16
    .line 17
    mul-float v2, p0, v1

    .line 18
    .line 19
    mul-float/2addr v1, p1

    .line 20
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lcom/horcrux/svg/I;->f:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v1, Lcom/horcrux/svg/H;

    .line 26
    .line 27
    sget-object v2, Lcom/horcrux/svg/g;->i:Lcom/horcrux/svg/g;

    .line 28
    .line 29
    new-instance v3, Lcom/horcrux/svg/L;

    .line 30
    .line 31
    float-to-double v4, p0

    .line 32
    float-to-double p0, p1

    .line 33
    invoke-direct {v3, v4, v5, p0, p1}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 34
    .line 35
    .line 36
    filled-new-array {v3}, [Lcom/horcrux/svg/L;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v1, v2, p0}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method static o(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 23

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/horcrux/svg/I;->f:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput v0, Lcom/horcrux/svg/I;->c:I

    .line 23
    .line 24
    sput-object p0, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    sput v0, Lcom/horcrux/svg/I;->b:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    sput v1, Lcom/horcrux/svg/I;->g:F

    .line 31
    .line 32
    sput v1, Lcom/horcrux/svg/I;->h:F

    .line 33
    .line 34
    sput v1, Lcom/horcrux/svg/I;->i:F

    .line 35
    .line 36
    sput v1, Lcom/horcrux/svg/I;->j:F

    .line 37
    .line 38
    sput v1, Lcom/horcrux/svg/I;->k:F

    .line 39
    .line 40
    sput v1, Lcom/horcrux/svg/I;->l:F

    .line 41
    .line 42
    sput-boolean v0, Lcom/horcrux/svg/I;->m:Z

    .line 43
    .line 44
    const/16 v2, 0x20

    .line 45
    .line 46
    move v3, v2

    .line 47
    :cond_1
    :goto_0
    sget v4, Lcom/horcrux/svg/I;->b:I

    .line 48
    .line 49
    sget v5, Lcom/horcrux/svg/I;->c:I

    .line 50
    .line 51
    if-ge v4, v5, :cond_d

    .line 52
    .line 53
    invoke-static {}, Lcom/horcrux/svg/I;->y()V

    .line 54
    .line 55
    .line 56
    sget v4, Lcom/horcrux/svg/I;->b:I

    .line 57
    .line 58
    sget v5, Lcom/horcrux/svg/I;->c:I

    .line 59
    .line 60
    if-lt v4, v5, :cond_2

    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_2
    const/4 v5, 0x1

    .line 65
    if-eq v3, v2, :cond_3

    .line 66
    .line 67
    move v6, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v6, v0

    .line 70
    :goto_1
    sget-object v7, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    const-string v7, "Unexpected character \'%c\' (i=%d, s=%s)"

    .line 77
    .line 78
    const/16 v8, 0x6d

    .line 79
    .line 80
    const/16 v9, 0x4d

    .line 81
    .line 82
    if-nez v6, :cond_5

    .line 83
    .line 84
    if-eq v4, v9, :cond_5

    .line 85
    .line 86
    if-ne v4, v8, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget v2, Lcom/horcrux/svg/I;->b:I

    .line 96
    .line 97
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    sget-object v3, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 102
    .line 103
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_5
    :goto_2
    invoke-static {v4}, Lcom/horcrux/svg/I;->i(C)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_6

    .line 120
    .line 121
    sget v3, Lcom/horcrux/svg/I;->b:I

    .line 122
    .line 123
    add-int/2addr v3, v5

    .line 124
    sput v3, Lcom/horcrux/svg/I;->b:I

    .line 125
    .line 126
    move v5, v0

    .line 127
    move v3, v4

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    invoke-static {v4}, Lcom/horcrux/svg/I;->j(C)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_c

    .line 134
    .line 135
    if-eqz v6, :cond_c

    .line 136
    .line 137
    const/16 v4, 0x5a

    .line 138
    .line 139
    if-eq v3, v4, :cond_b

    .line 140
    .line 141
    const/16 v4, 0x7a

    .line 142
    .line 143
    if-eq v3, v4, :cond_b

    .line 144
    .line 145
    if-eq v3, v9, :cond_8

    .line 146
    .line 147
    if-ne v3, v8, :cond_7

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    move v5, v0

    .line 151
    goto :goto_4

    .line 152
    :cond_8
    :goto_3
    invoke-static {v3}, Lcom/horcrux/svg/I;->h(C)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_9

    .line 157
    .line 158
    const/16 v3, 0x4c

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_9
    const/16 v3, 0x6c

    .line 162
    .line 163
    :goto_4
    invoke-static {v3}, Lcom/horcrux/svg/I;->h(C)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    sparse-switch v3, :sswitch_data_0

    .line 168
    .line 169
    .line 170
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    sget-object v2, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 177
    .line 178
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    const-string v2, "Unexpected comand \'%c\' (s=%s)"

    .line 183
    .line 184
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v0

    .line 192
    :sswitch_0
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    invoke-static {v1, v6}, Lcom/horcrux/svg/I;->k(FF)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_5

    .line 200
    .line 201
    :sswitch_1
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->B(FF)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_5

    .line 213
    .line 214
    :sswitch_2
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/I;->z(FFFF)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_5

    .line 234
    .line 235
    :sswitch_3
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/I;->t(FFFF)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_5

    .line 255
    .line 256
    :sswitch_4
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->m(FF)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_5

    .line 268
    .line 269
    :sswitch_5
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->k(FF)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_5

    .line 281
    .line 282
    :sswitch_6
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    invoke-static {v6, v1}, Lcom/horcrux/svg/I;->k(FF)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_5

    .line 290
    .line 291
    :sswitch_7
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 300
    .line 301
    .line 302
    move-result v12

    .line 303
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 304
    .line 305
    .line 306
    move-result v13

    .line 307
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    invoke-static/range {v10 .. v15}, Lcom/horcrux/svg/I;->f(FFFFFF)V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_5

    .line 319
    .line 320
    :sswitch_8
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 321
    .line 322
    .line 323
    move-result v16

    .line 324
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 325
    .line 326
    .line 327
    move-result v17

    .line 328
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 329
    .line 330
    .line 331
    move-result v18

    .line 332
    invoke-static {}, Lcom/horcrux/svg/I;->p()Z

    .line 333
    .line 334
    .line 335
    move-result v19

    .line 336
    invoke-static {}, Lcom/horcrux/svg/I;->p()Z

    .line 337
    .line 338
    .line 339
    move-result v20

    .line 340
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 341
    .line 342
    .line 343
    move-result v21

    .line 344
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 345
    .line 346
    .line 347
    move-result v22

    .line 348
    invoke-static/range {v16 .. v22}, Lcom/horcrux/svg/I;->a(FFFZZFF)V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_5

    .line 352
    .line 353
    :sswitch_9
    invoke-static {}, Lcom/horcrux/svg/I;->d()V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_5

    .line 357
    .line 358
    :sswitch_a
    sget v6, Lcom/horcrux/svg/I;->g:F

    .line 359
    .line 360
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->l(FF)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_5

    .line 368
    .line 369
    :sswitch_b
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->C(FF)V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_5

    .line 381
    .line 382
    :sswitch_c
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 391
    .line 392
    .line 393
    move-result v10

    .line 394
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/I;->A(FFFF)V

    .line 399
    .line 400
    .line 401
    goto :goto_5

    .line 402
    :sswitch_d
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 415
    .line 416
    .line 417
    move-result v11

    .line 418
    invoke-static {v6, v7, v10, v11}, Lcom/horcrux/svg/I;->u(FFFF)V

    .line 419
    .line 420
    .line 421
    goto :goto_5

    .line 422
    :sswitch_e
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 427
    .line 428
    .line 429
    move-result v7

    .line 430
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->n(FF)V

    .line 431
    .line 432
    .line 433
    goto :goto_5

    .line 434
    :sswitch_f
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 439
    .line 440
    .line 441
    move-result v7

    .line 442
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->l(FF)V

    .line 443
    .line 444
    .line 445
    goto :goto_5

    .line 446
    :sswitch_10
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    sget v7, Lcom/horcrux/svg/I;->h:F

    .line 451
    .line 452
    invoke-static {v6, v7}, Lcom/horcrux/svg/I;->l(FF)V

    .line 453
    .line 454
    .line 455
    goto :goto_5

    .line 456
    :sswitch_11
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 457
    .line 458
    .line 459
    move-result v10

    .line 460
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 465
    .line 466
    .line 467
    move-result v12

    .line 468
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 469
    .line 470
    .line 471
    move-result v13

    .line 472
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 473
    .line 474
    .line 475
    move-result v14

    .line 476
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 477
    .line 478
    .line 479
    move-result v15

    .line 480
    invoke-static/range {v10 .. v15}, Lcom/horcrux/svg/I;->g(FFFFFF)V

    .line 481
    .line 482
    .line 483
    goto :goto_5

    .line 484
    :sswitch_12
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 485
    .line 486
    .line 487
    move-result v16

    .line 488
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 489
    .line 490
    .line 491
    move-result v17

    .line 492
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 493
    .line 494
    .line 495
    move-result v18

    .line 496
    invoke-static {}, Lcom/horcrux/svg/I;->p()Z

    .line 497
    .line 498
    .line 499
    move-result v19

    .line 500
    invoke-static {}, Lcom/horcrux/svg/I;->p()Z

    .line 501
    .line 502
    .line 503
    move-result v20

    .line 504
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 505
    .line 506
    .line 507
    move-result v21

    .line 508
    invoke-static {}, Lcom/horcrux/svg/I;->q()F

    .line 509
    .line 510
    .line 511
    move-result v22

    .line 512
    invoke-static/range {v16 .. v22}, Lcom/horcrux/svg/I;->b(FFFZZFF)V

    .line 513
    .line 514
    .line 515
    :goto_5
    if-eqz v5, :cond_1

    .line 516
    .line 517
    if-eqz v4, :cond_a

    .line 518
    .line 519
    move v3, v9

    .line 520
    goto/16 :goto_0

    .line 521
    .line 522
    :cond_a
    move v3, v8

    .line 523
    goto/16 :goto_0

    .line 524
    .line 525
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 526
    .line 527
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 528
    .line 529
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    const-string v2, "Unexpected number after \'z\' (s=%s)"

    .line 534
    .line 535
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    throw v0

    .line 543
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 544
    .line 545
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    sget v2, Lcom/horcrux/svg/I;->b:I

    .line 550
    .line 551
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    sget-object v3, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 556
    .line 557
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    throw v0

    .line 569
    :cond_d
    :goto_6
    sget-object v0, Lcom/horcrux/svg/I;->e:Landroid/graphics/Path;

    .line 570
    .line 571
    return-object v0

    .line 572
    nop

    .line 573
    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_12
        0x43 -> :sswitch_11
        0x48 -> :sswitch_10
        0x4c -> :sswitch_f
        0x4d -> :sswitch_e
        0x51 -> :sswitch_d
        0x53 -> :sswitch_c
        0x54 -> :sswitch_b
        0x56 -> :sswitch_a
        0x5a -> :sswitch_9
        0x61 -> :sswitch_8
        0x63 -> :sswitch_7
        0x68 -> :sswitch_6
        0x6c -> :sswitch_5
        0x6d -> :sswitch_4
        0x71 -> :sswitch_3
        0x73 -> :sswitch_2
        0x74 -> :sswitch_1
        0x76 -> :sswitch_0
        0x7a -> :sswitch_9
    .end sparse-switch
.end method

.method private static p()Z
    .locals 5

    .line 1
    invoke-static {}, Lcom/horcrux/svg/I;->y()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 5
    .line 6
    sget v1, Lcom/horcrux/svg/I;->b:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x30

    .line 13
    .line 14
    const/16 v2, 0x31

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Ljava/lang/Error;

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget v2, Lcom/horcrux/svg/I;->b:I

    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v3, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 34
    .line 35
    filled-new-array {v0, v2, v3}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v2, "Unexpected flag \'%c\' (i=%d, s=%s)"

    .line 40
    .line 41
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_1
    :goto_0
    sget v1, Lcom/horcrux/svg/I;->b:I

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    add-int/2addr v1, v3

    .line 53
    sput v1, Lcom/horcrux/svg/I;->b:I

    .line 54
    .line 55
    sget v4, Lcom/horcrux/svg/I;->c:I

    .line 56
    .line 57
    if-ge v1, v4, :cond_2

    .line 58
    .line 59
    sget-object v4, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/16 v4, 0x2c

    .line 66
    .line 67
    if-ne v1, v4, :cond_2

    .line 68
    .line 69
    sget v1, Lcom/horcrux/svg/I;->b:I

    .line 70
    .line 71
    add-int/2addr v1, v3

    .line 72
    sput v1, Lcom/horcrux/svg/I;->b:I

    .line 73
    .line 74
    :cond_2
    invoke-static {}, Lcom/horcrux/svg/I;->y()V

    .line 75
    .line 76
    .line 77
    if-ne v0, v2, :cond_3

    .line 78
    .line 79
    return v3

    .line 80
    :cond_3
    const/4 v0, 0x0

    .line 81
    return v0
.end method

.method private static q()F
    .locals 3

    .line 1
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 2
    .line 3
    sget v1, Lcom/horcrux/svg/I;->c:I

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/horcrux/svg/I;->s()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {}, Lcom/horcrux/svg/I;->y()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/horcrux/svg/I;->r()V

    .line 15
    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/Error;

    .line 19
    .line 20
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 21
    .line 22
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "Unexpected end (s=%s)"

    .line 27
    .line 28
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method private static r()V
    .locals 2

    .line 1
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 2
    .line 3
    sget v1, Lcom/horcrux/svg/I;->c:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x2c

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    sput v0, Lcom/horcrux/svg/I;->b:I

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private static s()F
    .locals 10

    .line 1
    invoke-static {}, Lcom/horcrux/svg/I;->y()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 5
    .line 6
    sget v1, Lcom/horcrux/svg/I;->c:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_c

    .line 9
    .line 10
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x2b

    .line 17
    .line 18
    const/16 v3, 0x2d

    .line 19
    .line 20
    if-eq v1, v3, :cond_0

    .line 21
    .line 22
    if-ne v1, v2, :cond_1

    .line 23
    .line 24
    :cond_0
    sget v1, Lcom/horcrux/svg/I;->b:I

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    sput v1, Lcom/horcrux/svg/I;->b:I

    .line 29
    .line 30
    sget-object v4, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :cond_1
    const-string v4, "Invalid number formating character \'%c\' (i=%d, s=%s)"

    .line 37
    .line 38
    const/16 v5, 0x2e

    .line 39
    .line 40
    const/16 v6, 0x39

    .line 41
    .line 42
    const/16 v7, 0x30

    .line 43
    .line 44
    if-lt v1, v7, :cond_2

    .line 45
    .line 46
    if-gt v1, v6, :cond_2

    .line 47
    .line 48
    invoke-static {}, Lcom/horcrux/svg/I;->x()V

    .line 49
    .line 50
    .line 51
    sget v8, Lcom/horcrux/svg/I;->b:I

    .line 52
    .line 53
    sget v9, Lcom/horcrux/svg/I;->c:I

    .line 54
    .line 55
    if-ge v8, v9, :cond_3

    .line 56
    .line 57
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    if-ne v1, v5, :cond_b

    .line 65
    .line 66
    :cond_3
    :goto_0
    if-ne v1, v5, :cond_4

    .line 67
    .line 68
    sget v5, Lcom/horcrux/svg/I;->b:I

    .line 69
    .line 70
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    sput v5, Lcom/horcrux/svg/I;->b:I

    .line 73
    .line 74
    invoke-static {}, Lcom/horcrux/svg/I;->x()V

    .line 75
    .line 76
    .line 77
    sget v5, Lcom/horcrux/svg/I;->b:I

    .line 78
    .line 79
    sget v8, Lcom/horcrux/svg/I;->c:I

    .line 80
    .line 81
    if-ge v5, v8, :cond_4

    .line 82
    .line 83
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    :cond_4
    const/16 v5, 0x65

    .line 90
    .line 91
    if-eq v1, v5, :cond_5

    .line 92
    .line 93
    const/16 v5, 0x45

    .line 94
    .line 95
    if-ne v1, v5, :cond_9

    .line 96
    .line 97
    :cond_5
    sget v1, Lcom/horcrux/svg/I;->b:I

    .line 98
    .line 99
    add-int/lit8 v5, v1, 0x1

    .line 100
    .line 101
    sget v8, Lcom/horcrux/svg/I;->c:I

    .line 102
    .line 103
    if-ge v5, v8, :cond_9

    .line 104
    .line 105
    sget-object v5, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const/16 v5, 0x6d

    .line 114
    .line 115
    if-eq v1, v5, :cond_9

    .line 116
    .line 117
    const/16 v5, 0x78

    .line 118
    .line 119
    if-eq v1, v5, :cond_9

    .line 120
    .line 121
    sget v1, Lcom/horcrux/svg/I;->b:I

    .line 122
    .line 123
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    sput v1, Lcom/horcrux/svg/I;->b:I

    .line 126
    .line 127
    sget-object v5, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eq v1, v2, :cond_8

    .line 134
    .line 135
    if-ne v1, v3, :cond_6

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_6
    if-lt v1, v7, :cond_7

    .line 139
    .line 140
    if-gt v1, v6, :cond_7

    .line 141
    .line 142
    invoke-static {}, Lcom/horcrux/svg/I;->x()V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 147
    .line 148
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget v2, Lcom/horcrux/svg/I;->b:I

    .line 153
    .line 154
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    sget-object v3, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 159
    .line 160
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_8
    :goto_1
    sget v1, Lcom/horcrux/svg/I;->b:I

    .line 173
    .line 174
    add-int/lit8 v1, v1, 0x1

    .line 175
    .line 176
    sput v1, Lcom/horcrux/svg/I;->b:I

    .line 177
    .line 178
    invoke-static {}, Lcom/horcrux/svg/I;->x()V

    .line 179
    .line 180
    .line 181
    :cond_9
    :goto_2
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 182
    .line 183
    sget v2, Lcom/horcrux/svg/I;->b:I

    .line 184
    .line 185
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-nez v3, :cond_a

    .line 198
    .line 199
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-nez v3, :cond_a

    .line 204
    .line 205
    return v2

    .line 206
    :cond_a
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 207
    .line 208
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sget v3, Lcom/horcrux/svg/I;->b:I

    .line 213
    .line 214
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    sget-object v4, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 219
    .line 220
    filled-new-array {v1, v0, v3, v4}, [Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const-string v1, "Invalid number \'%s\' (start=%d, i=%d, s=%s)"

    .line 225
    .line 226
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v2

    .line 234
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 235
    .line 236
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    sget v2, Lcom/horcrux/svg/I;->b:I

    .line 241
    .line 242
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    sget-object v3, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 247
    .line 248
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_c
    new-instance v0, Ljava/lang/Error;

    .line 261
    .line 262
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 263
    .line 264
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const-string v2, "Unexpected end (s=%s)"

    .line 269
    .line 270
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v0
.end method

.method private static t(FFFF)V
    .locals 2

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    add-float/2addr p0, v0

    .line 4
    sget v1, Lcom/horcrux/svg/I;->h:F

    .line 5
    .line 6
    add-float/2addr p1, v1

    .line 7
    add-float/2addr p2, v0

    .line 8
    add-float/2addr p3, v1

    .line 9
    invoke-static {p0, p1, p2, p3}, Lcom/horcrux/svg/I;->u(FFFF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static u(FFFF)V
    .locals 9

    .line 1
    sput p0, Lcom/horcrux/svg/I;->i:F

    .line 2
    .line 3
    sput p1, Lcom/horcrux/svg/I;->j:F

    .line 4
    .line 5
    const/high16 v0, 0x40000000    # 2.0f

    .line 6
    .line 7
    mul-float/2addr p0, v0

    .line 8
    add-float v1, p2, p0

    .line 9
    .line 10
    const/high16 v2, 0x40400000    # 3.0f

    .line 11
    .line 12
    div-float v5, v1, v2

    .line 13
    .line 14
    mul-float/2addr p1, v0

    .line 15
    add-float v0, p3, p1

    .line 16
    .line 17
    div-float v6, v0, v2

    .line 18
    .line 19
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 20
    .line 21
    add-float/2addr v0, p0

    .line 22
    div-float v3, v0, v2

    .line 23
    .line 24
    sget p0, Lcom/horcrux/svg/I;->h:F

    .line 25
    .line 26
    add-float/2addr p0, p1

    .line 27
    div-float v4, p0, v2

    .line 28
    .line 29
    move v7, p2

    .line 30
    move v8, p3

    .line 31
    invoke-static/range {v3 .. v8}, Lcom/horcrux/svg/I;->e(FFFFFF)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static v(D)D
    .locals 4

    .line 1
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 2
    .line 3
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    mul-double/2addr p0, v0

    .line 10
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    long-to-double p0, p0

    .line 15
    div-double/2addr p0, v0

    .line 16
    return-wide p0
.end method

.method private static w()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/horcrux/svg/I;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 6
    .line 7
    sput v0, Lcom/horcrux/svg/I;->k:F

    .line 8
    .line 9
    sget v0, Lcom/horcrux/svg/I;->h:F

    .line 10
    .line 11
    sput v0, Lcom/horcrux/svg/I;->l:F

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    sput-boolean v0, Lcom/horcrux/svg/I;->m:Z

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private static x()V
    .locals 2

    .line 1
    :goto_0
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 2
    .line 3
    sget v1, Lcom/horcrux/svg/I;->c:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    sput v0, Lcom/horcrux/svg/I;->b:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method private static y()V
    .locals 2

    .line 1
    :goto_0
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 2
    .line 3
    sget v1, Lcom/horcrux/svg/I;->c:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/horcrux/svg/I;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget v0, Lcom/horcrux/svg/I;->b:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    sput v0, Lcom/horcrux/svg/I;->b:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method private static z(FFFF)V
    .locals 2

    .line 1
    sget v0, Lcom/horcrux/svg/I;->g:F

    .line 2
    .line 3
    add-float/2addr p0, v0

    .line 4
    sget v1, Lcom/horcrux/svg/I;->h:F

    .line 5
    .line 6
    add-float/2addr p1, v1

    .line 7
    add-float/2addr p2, v0

    .line 8
    add-float/2addr p3, v1

    .line 9
    invoke-static {p0, p1, p2, p3}, Lcom/horcrux/svg/I;->A(FFFF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
