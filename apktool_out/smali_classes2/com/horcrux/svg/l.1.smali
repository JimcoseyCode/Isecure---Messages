.class Lcom/horcrux/svg/l;
.super Lcom/horcrux/svg/q;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:F

.field l:F

.field m:F

.field n:F

.field o:Lcom/horcrux/svg/u;


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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lcom/horcrux/svg/l;->i:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1, v2, v3}, Lcom/horcrux/svg/q;->e(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v0, Lcom/horcrux/svg/l;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v2, v4}, Lcom/horcrux/svg/q;->e(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 28
    .line 29
    invoke-static {v1, v2, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    new-instance v1, Landroid/graphics/Canvas;

    .line 34
    .line 35
    invoke-direct {v1, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Landroid/graphics/Paint;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-virtual {v1, v3, v4, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 46
    .line 47
    .line 48
    sget-object v3, Lcom/horcrux/svg/l$a;->a:[I

    .line 49
    .line 50
    iget-object v7, v0, Lcom/horcrux/svg/l;->o:Lcom/horcrux/svg/u;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    aget v3, v3, v7

    .line 57
    .line 58
    packed-switch v3, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :pswitch_0
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    mul-int/2addr v3, v7

    .line 72
    new-array v7, v3, [I

    .line 73
    .line 74
    new-array v14, v3, [I

    .line 75
    .line 76
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 92
    .line 93
    .line 94
    move-object v13, v6

    .line 95
    move-object v15, v7

    .line 96
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v9, 0x0

    .line 110
    move-object v6, v14

    .line 111
    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 112
    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    :goto_0
    if-ge v8, v3, :cond_0

    .line 116
    .line 117
    aget v9, v15, v8

    .line 118
    .line 119
    aget v10, v6, v8

    .line 120
    .line 121
    shr-int/lit8 v11, v9, 0x10

    .line 122
    .line 123
    const/16 v12, 0xff

    .line 124
    .line 125
    and-int/2addr v11, v12

    .line 126
    shr-int/lit8 v14, v9, 0x8

    .line 127
    .line 128
    and-int/2addr v14, v12

    .line 129
    and-int/lit16 v4, v9, 0xff

    .line 130
    .line 131
    ushr-int/lit8 v9, v9, 0x18

    .line 132
    .line 133
    shr-int/lit8 v7, v10, 0x10

    .line 134
    .line 135
    and-int/2addr v7, v12

    .line 136
    move/from16 v16, v3

    .line 137
    .line 138
    shr-int/lit8 v3, v10, 0x8

    .line 139
    .line 140
    and-int/2addr v3, v12

    .line 141
    and-int/lit16 v12, v10, 0xff

    .line 142
    .line 143
    ushr-int/lit8 v10, v10, 0x18

    .line 144
    .line 145
    move-object/from16 v17, v6

    .line 146
    .line 147
    iget v6, v0, Lcom/horcrux/svg/l;->k:F

    .line 148
    .line 149
    int-to-float v11, v11

    .line 150
    mul-float v18, v6, v11

    .line 151
    .line 152
    int-to-float v7, v7

    .line 153
    mul-float v18, v18, v7

    .line 154
    .line 155
    move/from16 v19, v6

    .line 156
    .line 157
    iget v6, v0, Lcom/horcrux/svg/l;->l:F

    .line 158
    .line 159
    mul-float/2addr v11, v6

    .line 160
    add-float v18, v18, v11

    .line 161
    .line 162
    iget v11, v0, Lcom/horcrux/svg/l;->m:F

    .line 163
    .line 164
    mul-float/2addr v7, v11

    .line 165
    add-float v18, v18, v7

    .line 166
    .line 167
    iget v7, v0, Lcom/horcrux/svg/l;->n:F

    .line 168
    .line 169
    move/from16 v20, v6

    .line 170
    .line 171
    add-float v6, v18, v7

    .line 172
    .line 173
    float-to-int v6, v6

    .line 174
    int-to-float v14, v14

    .line 175
    mul-float v18, v19, v14

    .line 176
    .line 177
    int-to-float v3, v3

    .line 178
    mul-float v18, v18, v3

    .line 179
    .line 180
    mul-float v14, v14, v20

    .line 181
    .line 182
    add-float v18, v18, v14

    .line 183
    .line 184
    mul-float/2addr v3, v11

    .line 185
    add-float v18, v18, v3

    .line 186
    .line 187
    add-float v3, v18, v7

    .line 188
    .line 189
    float-to-int v3, v3

    .line 190
    int-to-float v4, v4

    .line 191
    mul-float v14, v19, v4

    .line 192
    .line 193
    int-to-float v12, v12

    .line 194
    mul-float/2addr v14, v12

    .line 195
    mul-float v4, v4, v20

    .line 196
    .line 197
    add-float/2addr v14, v4

    .line 198
    mul-float/2addr v12, v11

    .line 199
    add-float/2addr v14, v12

    .line 200
    add-float/2addr v14, v7

    .line 201
    float-to-int v4, v14

    .line 202
    int-to-float v9, v9

    .line 203
    mul-float v12, v19, v9

    .line 204
    .line 205
    int-to-float v10, v10

    .line 206
    mul-float/2addr v12, v10

    .line 207
    mul-float v9, v9, v20

    .line 208
    .line 209
    add-float/2addr v12, v9

    .line 210
    mul-float/2addr v11, v10

    .line 211
    add-float/2addr v12, v11

    .line 212
    add-float/2addr v12, v7

    .line 213
    float-to-int v7, v12

    .line 214
    const/4 v9, 0x0

    .line 215
    invoke-static {v9, v6}, Ljava/lang/Math;->max(II)I

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    const/16 v10, 0xff

    .line 220
    .line 221
    invoke-static {v10, v6}, Ljava/lang/Math;->min(II)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-static {v10, v3}, Ljava/lang/Math;->min(II)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    invoke-static {v10, v4}, Ljava/lang/Math;->min(II)I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    invoke-static {v10, v7}, Ljava/lang/Math;->min(II)I

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    shl-int/lit8 v7, v7, 0x18

    .line 250
    .line 251
    shl-int/lit8 v6, v6, 0x10

    .line 252
    .line 253
    or-int/2addr v6, v7

    .line 254
    shl-int/lit8 v3, v3, 0x8

    .line 255
    .line 256
    or-int/2addr v3, v6

    .line 257
    or-int/2addr v3, v4

    .line 258
    aput v3, v15, v8

    .line 259
    .line 260
    add-int/lit8 v8, v8, 0x1

    .line 261
    .line 262
    move/from16 v3, v16

    .line 263
    .line 264
    move-object/from16 v6, v17

    .line 265
    .line 266
    const/4 v4, 0x0

    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :cond_0
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    move-object v6, v13

    .line 278
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 279
    .line 280
    .line 281
    move-result v13

    .line 282
    const/4 v8, 0x0

    .line 283
    const/4 v10, 0x0

    .line 284
    const/4 v11, 0x0

    .line 285
    move-object v7, v15

    .line 286
    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 287
    .line 288
    .line 289
    goto :goto_1

    .line 290
    :pswitch_1
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 291
    .line 292
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    .line 293
    .line 294
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 298
    .line 299
    .line 300
    goto :goto_1

    .line 301
    :pswitch_2
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 302
    .line 303
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 304
    .line 305
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 309
    .line 310
    .line 311
    goto :goto_1

    .line 312
    :pswitch_3
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 313
    .line 314
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 315
    .line 316
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 320
    .line 321
    .line 322
    goto :goto_1

    .line 323
    :pswitch_4
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 324
    .line 325
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 326
    .line 327
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 331
    .line 332
    .line 333
    goto :goto_1

    .line 334
    :pswitch_5
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 335
    .line 336
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 337
    .line 338
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 342
    .line 343
    .line 344
    :goto_1
    iget-object v3, v0, Lcom/horcrux/svg/l;->o:Lcom/horcrux/svg/u;

    .line 345
    .line 346
    sget-object v4, Lcom/horcrux/svg/u;->m:Lcom/horcrux/svg/u;

    .line 347
    .line 348
    if-eq v3, v4, :cond_1

    .line 349
    .line 350
    const/4 v3, 0x0

    .line 351
    invoke-virtual {v1, v5, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 352
    .line 353
    .line 354
    :cond_1
    return-object v6

    .line 355
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/l;->i:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/horcrux/svg/l;->j:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Ljava/lang/Float;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/horcrux/svg/l;->k:F

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public n(Ljava/lang/Float;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/horcrux/svg/l;->l:F

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o(Ljava/lang/Float;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/horcrux/svg/l;->m:F

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(Ljava/lang/Float;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/horcrux/svg/l;->n:F

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/u;->j(Ljava/lang/String;)Lcom/horcrux/svg/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/l;->o:Lcom/horcrux/svg/u;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
