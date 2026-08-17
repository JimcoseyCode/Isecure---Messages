.class public final Lcom/facebook/react/uimanager/style/ColorStopUtils;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/ColorStopUtils$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0006\u0010\t\u001a\u00020\nJ!\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\rH\u0002\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/ColorStopUtils;",
        "",
        "<init>",
        "()V",
        "getFixedColorStops",
        "",
        "Lcom/facebook/react/uimanager/style/ProcessedColorStop;",
        "colorStops",
        "Lcom/facebook/react/uimanager/style/ColorStop;",
        "gradientLineLength",
        "",
        "processColorTransitionHints",
        "originalStops",
        "",
        "([Lcom/facebook/react/uimanager/style/ProcessedColorStop;)Ljava/util/List;",
        "resolveColorStopPosition",
        "position",
        "Lcom/facebook/react/uimanager/LengthPercentage;",
        "(Lcom/facebook/react/uimanager/LengthPercentage;F)Ljava/lang/Float;",
        "ReactAndroid_release"
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
.field public static final INSTANCE:Lcom/facebook/react/uimanager/style/ColorStopUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/ColorStopUtils;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/style/ColorStopUtils;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/uimanager/style/ColorStopUtils;->INSTANCE:Lcom/facebook/react/uimanager/style/ColorStopUtils;

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

.method private final processColorTransitionHints([Lcom/facebook/react/uimanager/style/ProcessedColorStop;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/facebook/react/uimanager/style/ProcessedColorStop;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/ProcessedColorStop;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {v0}, Lj7/j;->E0([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    array-length v2, v0

    .line 8
    const/4 v3, 0x1

    .line 9
    sub-int/2addr v2, v3

    .line 10
    move v5, v3

    .line 11
    const/4 v6, 0x0

    .line 12
    :goto_0
    if-ge v5, v2, :cond_e

    .line 13
    .line 14
    aget-object v7, v0, v5

    .line 15
    .line 16
    invoke-virtual {v7}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getColor()Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int v7, v5, v6

    .line 24
    .line 25
    if-ge v7, v3, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    add-int/lit8 v8, v7, -0x1

    .line 29
    .line 30
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    check-cast v9, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 35
    .line 36
    invoke-virtual {v9}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    add-int/lit8 v10, v7, 0x1

    .line 41
    .line 42
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v11

    .line 46
    check-cast v11, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 47
    .line 48
    invoke-virtual {v11}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    check-cast v12, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 57
    .line 58
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    move-result-object v12

    .line 62
    if-eqz v9, :cond_3

    .line 63
    .line 64
    if-eqz v11, :cond_3

    .line 65
    .line 66
    if-nez v12, :cond_2

    .line 67
    .line 68
    :goto_1
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    sub-float/2addr v13, v14

    .line 78
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    sub-float/2addr v14, v15

    .line 87
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    sub-float/2addr v11, v15

    .line 96
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 101
    .line 102
    invoke-virtual {v8}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getColor()Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 111
    .line 112
    invoke-virtual {v10}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getColor()Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v13, v14}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    if-eqz v15, :cond_4

    .line 121
    .line 122
    invoke-interface {v1, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    add-int/lit8 v6, v6, -0x1

    .line 126
    .line 127
    :cond_3
    :goto_2
    move/from16 v20, v2

    .line 128
    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_4
    const/4 v15, 0x0

    .line 132
    invoke-static {v13, v15}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 133
    .line 134
    .line 135
    move-result v16

    .line 136
    if-eqz v16, :cond_5

    .line 137
    .line 138
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 143
    .line 144
    invoke-virtual {v7, v10}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->setColor(Ljava/lang/Integer;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    invoke-static {v14, v15}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    if-eqz v15, :cond_6

    .line 153
    .line 154
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    check-cast v7, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 159
    .line 160
    invoke-virtual {v7, v8}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->setColor(Ljava/lang/Integer;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    new-instance v15, Ljava/util/ArrayList;

    .line 165
    .line 166
    const/16 v3, 0x9

    .line 167
    .line 168
    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    cmpl-float v3, v13, v14

    .line 172
    .line 173
    const v17, 0x3f2aaaab

    .line 174
    .line 175
    .line 176
    const v18, 0x3eaaaaab

    .line 177
    .line 178
    .line 179
    const/high16 v19, 0x41500000    # 13.0f

    .line 180
    .line 181
    if-lez v3, :cond_8

    .line 182
    .line 183
    const/4 v3, 0x0

    .line 184
    :goto_3
    const/4 v4, 0x7

    .line 185
    if-ge v3, v4, :cond_7

    .line 186
    .line 187
    new-instance v4, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 188
    .line 189
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 190
    .line 191
    .line 192
    move-result v20

    .line 193
    const/high16 v21, 0x40e00000    # 7.0f

    .line 194
    .line 195
    int-to-float v0, v3

    .line 196
    add-float v0, v0, v21

    .line 197
    .line 198
    div-float v0, v0, v19

    .line 199
    .line 200
    mul-float/2addr v0, v13

    .line 201
    add-float v20, v20, v0

    .line 202
    .line 203
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    move/from16 v20, v2

    .line 208
    .line 209
    const/4 v2, 0x0

    .line 210
    invoke-direct {v4, v2, v0}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    add-int/lit8 v3, v3, 0x1

    .line 217
    .line 218
    move-object/from16 v0, p1

    .line 219
    .line 220
    move/from16 v2, v20

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_7
    move/from16 v20, v2

    .line 224
    .line 225
    const/4 v2, 0x0

    .line 226
    new-instance v0, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 227
    .line 228
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    mul-float v18, v18, v14

    .line 233
    .line 234
    add-float v3, v3, v18

    .line 235
    .line 236
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-direct {v0, v2, v3}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    new-instance v0, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 247
    .line 248
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    mul-float v14, v14, v17

    .line 253
    .line 254
    add-float/2addr v3, v14

    .line 255
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-direct {v0, v2, v3}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_8
    move/from16 v20, v2

    .line 267
    .line 268
    const/4 v2, 0x0

    .line 269
    new-instance v0, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 270
    .line 271
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    mul-float v18, v18, v13

    .line 276
    .line 277
    add-float v3, v3, v18

    .line 278
    .line 279
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-direct {v0, v2, v3}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    new-instance v0, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 290
    .line 291
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    mul-float v17, v17, v13

    .line 296
    .line 297
    add-float v3, v3, v17

    .line 298
    .line 299
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-direct {v0, v2, v3}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    const/4 v0, 0x0

    .line 310
    :goto_4
    const/4 v4, 0x7

    .line 311
    if-ge v0, v4, :cond_9

    .line 312
    .line 313
    new-instance v3, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 314
    .line 315
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 316
    .line 317
    .line 318
    move-result v17

    .line 319
    int-to-float v4, v0

    .line 320
    div-float v4, v4, v19

    .line 321
    .line 322
    mul-float/2addr v4, v14

    .line 323
    add-float v17, v17, v4

    .line 324
    .line 325
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-direct {v3, v2, v4}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    add-int/lit8 v0, v0, 0x1

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_9
    :goto_5
    div-float/2addr v13, v11

    .line 339
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 340
    .line 341
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 342
    .line 343
    .line 344
    move-result-wide v2

    .line 345
    float-to-double v12, v13

    .line 346
    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    .line 347
    .line 348
    .line 349
    move-result-wide v12

    .line 350
    double-to-float v0, v12

    .line 351
    float-to-double v12, v0

    .line 352
    div-double/2addr v2, v12

    .line 353
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    const-string v4, "iterator(...)"

    .line 358
    .line 359
    invoke-static {v0, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    :cond_a
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_d

    .line 367
    .line 368
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    const-string v12, "next(...)"

    .line 373
    .line 374
    invoke-static {v4, v12}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    check-cast v4, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 378
    .line 379
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    if-nez v12, :cond_b

    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_b
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 395
    .line 396
    .line 397
    move-result v13

    .line 398
    sub-float/2addr v12, v13

    .line 399
    div-float/2addr v12, v11

    .line 400
    float-to-double v12, v12

    .line 401
    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 402
    .line 403
    .line 404
    move-result-wide v12

    .line 405
    double-to-float v12, v12

    .line 406
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 407
    .line 408
    .line 409
    move-result v13

    .line 410
    const v14, 0x7f7fffff    # Float.MAX_VALUE

    .line 411
    .line 412
    .line 413
    cmpg-float v13, v13, v14

    .line 414
    .line 415
    if-gtz v13, :cond_a

    .line 416
    .line 417
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    if-eqz v13, :cond_c

    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_c
    if-eqz v8, :cond_a

    .line 425
    .line 426
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v13

    .line 430
    if-eqz v10, :cond_a

    .line 431
    .line 432
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 433
    .line 434
    .line 435
    move-result v14

    .line 436
    invoke-static {v13, v14, v12}, Lx0/d;->c(IIF)I

    .line 437
    .line 438
    .line 439
    move-result v12

    .line 440
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v12

    .line 444
    invoke-virtual {v4, v12}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->setColor(Ljava/lang/Integer;)V

    .line 445
    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_d
    invoke-interface {v1, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    invoke-interface {v1, v7, v15}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 452
    .line 453
    .line 454
    add-int/lit8 v6, v6, 0x8

    .line 455
    .line 456
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 457
    .line 458
    move-object/from16 v0, p1

    .line 459
    .line 460
    move/from16 v2, v20

    .line 461
    .line 462
    const/4 v3, 0x1

    .line 463
    goto/16 :goto_0

    .line 464
    .line 465
    :cond_e
    return-object v1
.end method

.method private final resolveColorStopPosition(Lcom/facebook/react/uimanager/LengthPercentage;F)Ljava/lang/Float;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/LengthPercentage;->getType()Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/facebook/react/uimanager/style/ColorStopUtils$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    if-ne v0, p2, :cond_1

    .line 22
    .line 23
    const/high16 p2, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    new-instance p1, Li7/m;

    .line 35
    .line 36
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    div-float/2addr p1, p2

    .line 50
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method


# virtual methods
.method public final getFixedColorStops(Ljava/util/List;F)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/ColorStop;",
            ">;F)",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/ProcessedColorStop;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "colorStops"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-array v1, v0, [Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    const/4 v4, 0x0

    .line 15
    if-ge v3, v0, :cond_0

    .line 16
    .line 17
    new-instance v5, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 18
    .line 19
    const/4 v6, 0x3

    .line 20
    invoke-direct {v5, v4, v4, v6, v4}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    aput-object v5, v1, v3

    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/facebook/react/uimanager/style/ColorStop;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/style/ColorStop;->getPosition()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-direct {p0, v3, p2}, Lcom/facebook/react/uimanager/style/ColorStopUtils;->resolveColorStopPosition(Lcom/facebook/react/uimanager/LengthPercentage;F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const/4 v5, 0x0

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v3, v5

    .line 51
    :goto_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    move v7, v2

    .line 56
    move v8, v7

    .line 57
    :goto_2
    const/4 v9, 0x1

    .line 58
    if-ge v7, v6, :cond_6

    .line 59
    .line 60
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    check-cast v10, Lcom/facebook/react/uimanager/style/ColorStop;

    .line 65
    .line 66
    invoke-virtual {v10}, Lcom/facebook/react/uimanager/style/ColorStop;->getPosition()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-direct {p0, v11, p2}, Lcom/facebook/react/uimanager/style/ColorStopUtils;->resolveColorStopPosition(Lcom/facebook/react/uimanager/LengthPercentage;F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    if-nez v11, :cond_4

    .line 75
    .line 76
    if-nez v7, :cond_2

    .line 77
    .line 78
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    goto :goto_3

    .line 83
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    sub-int/2addr v11, v9

    .line 88
    if-ne v7, v11, :cond_3

    .line 89
    .line 90
    const/high16 v11, 0x3f800000    # 1.0f

    .line 91
    .line 92
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    move-object v11, v4

    .line 98
    :cond_4
    :goto_3
    if-eqz v11, :cond_5

    .line 99
    .line 100
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    invoke-static {v9, v3}, Ljava/lang/Math;->max(FF)F

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    new-instance v11, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 113
    .line 114
    invoke-virtual {v10}, Lcom/facebook/react/uimanager/style/ColorStop;->getColor()Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-direct {v11, v10, v9}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 119
    .line 120
    .line 121
    aput-object v11, v1, v7

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    move v8, v9

    .line 125
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    if-eqz v8, :cond_9

    .line 129
    .line 130
    move p2, v9

    .line 131
    :goto_5
    if-ge p2, v0, :cond_9

    .line 132
    .line 133
    aget-object v3, v1, p2

    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    aget-object v4, v1, v2

    .line 140
    .line 141
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    sub-int v5, p2, v2

    .line 146
    .line 147
    add-int/lit8 v6, v5, -0x1

    .line 148
    .line 149
    if-eqz v3, :cond_8

    .line 150
    .line 151
    if-eqz v4, :cond_8

    .line 152
    .line 153
    if-lez v6, :cond_8

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    sub-float/2addr v3, v7

    .line 164
    int-to-float v5, v5

    .line 165
    div-float/2addr v3, v5

    .line 166
    if-gt v9, v6, :cond_7

    .line 167
    .line 168
    move v5, v9

    .line 169
    :goto_6
    add-int v7, v2, v5

    .line 170
    .line 171
    new-instance v8, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 172
    .line 173
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    check-cast v10, Lcom/facebook/react/uimanager/style/ColorStop;

    .line 178
    .line 179
    invoke-virtual {v10}, Lcom/facebook/react/uimanager/style/ColorStop;->getColor()Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    int-to-float v12, v5

    .line 188
    mul-float/2addr v12, v3

    .line 189
    add-float/2addr v11, v12

    .line 190
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-direct {v8, v10, v11}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    .line 195
    .line 196
    .line 197
    aput-object v8, v1, v7

    .line 198
    .line 199
    if-eq v5, v6, :cond_7

    .line 200
    .line 201
    add-int/lit8 v5, v5, 0x1

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_7
    move v2, p2

    .line 205
    :cond_8
    add-int/lit8 p2, p2, 0x1

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_9
    invoke-direct {p0, v1}, Lcom/facebook/react/uimanager/style/ColorStopUtils;->processColorTransitionHints([Lcom/facebook/react/uimanager/style/ProcessedColorStop;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1
.end method
