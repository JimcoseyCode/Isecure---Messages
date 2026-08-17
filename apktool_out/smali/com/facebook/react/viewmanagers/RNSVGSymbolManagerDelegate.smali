.class public Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U:",
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "TT;+",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        ">;:",
        "Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, -0x1

    .line 11
    sparse-switch v0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :sswitch_0
    const-string v0, "strokeWidth"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v3, 0x23

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "meetOrSlice"

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v3, 0x22

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "responsible"

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_2
    const/16 v3, 0x21

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "strokeLinejoin"

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_3
    const/16 v3, 0x20

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "display"

    .line 73
    .line 74
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_4
    const/16 v3, 0x1f

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "strokeLinecap"

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :cond_5
    const/16 v3, 0x1e

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "clipRule"

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_6

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :cond_6
    const/16 v3, 0x1d

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "clipPath"

    .line 115
    .line 116
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_7

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :cond_7
    const/16 v3, 0x1c

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "strokeDasharray"

    .line 129
    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_8

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :cond_8
    const/16 v3, 0x1b

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "fontSize"

    .line 143
    .line 144
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_9

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_9
    const/16 v3, 0x1a

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "vbWidth"

    .line 157
    .line 158
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_a

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_a
    const/16 v3, 0x19

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "markerStart"

    .line 171
    .line 172
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_b

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_b
    const/16 v3, 0x18

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "vectorEffect"

    .line 185
    .line 186
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_c

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_c
    const/16 v3, 0x17

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "color"

    .line 199
    .line 200
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_d

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_d
    const/16 v3, 0x16

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "align"

    .line 213
    .line 214
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_e

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_e
    const/16 v3, 0x15

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "strokeMiterlimit"

    .line 227
    .line 228
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-nez v0, :cond_f

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_f
    const/16 v3, 0x14

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "name"

    .line 241
    .line 242
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-nez v0, :cond_10

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_10
    const/16 v3, 0x13

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "minY"

    .line 255
    .line 256
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_11

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_11
    const/16 v3, 0x12

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "minX"

    .line 269
    .line 270
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-nez v0, :cond_12

    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_12
    const/16 v3, 0x11

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "mask"

    .line 283
    .line 284
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-nez v0, :cond_13

    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_13
    const/16 v3, 0x10

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "font"

    .line 297
    .line 298
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_14

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_14
    const/16 v3, 0xf

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "fill"

    .line 311
    .line 312
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-nez v0, :cond_15

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_15
    const/16 v3, 0xe

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "strokeDashoffset"

    .line 325
    .line 326
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-nez v0, :cond_16

    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_16
    const/16 v3, 0xd

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "fillOpacity"

    .line 339
    .line 340
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_17

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_17
    const/16 v3, 0xc

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "pointerEvents"

    .line 353
    .line 354
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-nez v0, :cond_18

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_18
    const/16 v3, 0xb

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "strokeOpacity"

    .line 367
    .line 368
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-nez v0, :cond_19

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :cond_19
    const/16 v3, 0xa

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "fillRule"

    .line 381
    .line 382
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-nez v0, :cond_1a

    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :cond_1a
    const/16 v3, 0x9

    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :sswitch_1b
    const-string v0, "fontWeight"

    .line 395
    .line 396
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-nez v0, :cond_1b

    .line 401
    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :cond_1b
    const/16 v3, 0x8

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :sswitch_1c
    const-string v0, "stroke"

    .line 409
    .line 410
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-nez v0, :cond_1c

    .line 415
    .line 416
    goto :goto_0

    .line 417
    :cond_1c
    const/4 v3, 0x7

    .line 418
    goto :goto_0

    .line 419
    :sswitch_1d
    const-string v0, "markerMid"

    .line 420
    .line 421
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-nez v0, :cond_1d

    .line 426
    .line 427
    goto :goto_0

    .line 428
    :cond_1d
    const/4 v3, 0x6

    .line 429
    goto :goto_0

    .line 430
    :sswitch_1e
    const-string v0, "markerEnd"

    .line 431
    .line 432
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-nez v0, :cond_1e

    .line 437
    .line 438
    goto :goto_0

    .line 439
    :cond_1e
    const/4 v3, 0x5

    .line 440
    goto :goto_0

    .line 441
    :sswitch_1f
    const-string v0, "propList"

    .line 442
    .line 443
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-nez v0, :cond_1f

    .line 448
    .line 449
    goto :goto_0

    .line 450
    :cond_1f
    const/4 v3, 0x4

    .line 451
    goto :goto_0

    .line 452
    :sswitch_20
    const-string v0, "matrix"

    .line 453
    .line 454
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-nez v0, :cond_20

    .line 459
    .line 460
    goto :goto_0

    .line 461
    :cond_20
    const/4 v3, 0x3

    .line 462
    goto :goto_0

    .line 463
    :sswitch_21
    const-string v0, "opacity"

    .line 464
    .line 465
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-nez v0, :cond_21

    .line 470
    .line 471
    goto :goto_0

    .line 472
    :cond_21
    const/4 v3, 0x2

    .line 473
    goto :goto_0

    .line 474
    :sswitch_22
    const-string v0, "filter"

    .line 475
    .line 476
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-nez v0, :cond_22

    .line 481
    .line 482
    goto :goto_0

    .line 483
    :cond_22
    move v3, v1

    .line 484
    goto :goto_0

    .line 485
    :sswitch_23
    const-string v0, "vbHeight"

    .line 486
    .line 487
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-nez v0, :cond_23

    .line 492
    .line 493
    goto :goto_0

    .line 494
    :cond_23
    move v3, v2

    .line 495
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v4, 0x0

    .line 498
    const/4 v5, 0x0

    .line 499
    packed-switch v3, :pswitch_data_0

    .line 500
    .line 501
    .line 502
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    return-void

    .line 506
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 507
    .line 508
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 509
    .line 510
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 511
    .line 512
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 516
    .line 517
    .line 518
    return-void

    .line 519
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 520
    .line 521
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 522
    .line 523
    if-nez p3, :cond_24

    .line 524
    .line 525
    goto :goto_1

    .line 526
    :cond_24
    check-cast p3, Ljava/lang/Double;

    .line 527
    .line 528
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 537
    .line 538
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 539
    .line 540
    if-nez p3, :cond_25

    .line 541
    .line 542
    goto :goto_2

    .line 543
    :cond_25
    check-cast p3, Ljava/lang/Boolean;

    .line 544
    .line 545
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 554
    .line 555
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 556
    .line 557
    if-nez p3, :cond_26

    .line 558
    .line 559
    goto :goto_3

    .line 560
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 561
    .line 562
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 567
    .line 568
    .line 569
    return-void

    .line 570
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 571
    .line 572
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 573
    .line 574
    if-nez p3, :cond_27

    .line 575
    .line 576
    goto :goto_4

    .line 577
    :cond_27
    move-object v5, p3

    .line 578
    check-cast v5, Ljava/lang/String;

    .line 579
    .line 580
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    return-void

    .line 584
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 585
    .line 586
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 587
    .line 588
    if-nez p3, :cond_28

    .line 589
    .line 590
    goto :goto_5

    .line 591
    :cond_28
    check-cast p3, Ljava/lang/Double;

    .line 592
    .line 593
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 598
    .line 599
    .line 600
    return-void

    .line 601
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 602
    .line 603
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 604
    .line 605
    if-nez p3, :cond_29

    .line 606
    .line 607
    goto :goto_6

    .line 608
    :cond_29
    check-cast p3, Ljava/lang/Double;

    .line 609
    .line 610
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v2

    .line 614
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 619
    .line 620
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 621
    .line 622
    if-nez p3, :cond_2a

    .line 623
    .line 624
    goto :goto_7

    .line 625
    :cond_2a
    move-object v5, p3

    .line 626
    check-cast v5, Ljava/lang/String;

    .line 627
    .line 628
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    return-void

    .line 632
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 633
    .line 634
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 635
    .line 636
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 637
    .line 638
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 642
    .line 643
    .line 644
    return-void

    .line 645
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 646
    .line 647
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 648
    .line 649
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 650
    .line 651
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 659
    .line 660
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 661
    .line 662
    if-nez p3, :cond_2b

    .line 663
    .line 664
    goto :goto_8

    .line 665
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 666
    .line 667
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    :goto_8
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setVbWidth(Landroid/view/View;F)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 676
    .line 677
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 678
    .line 679
    if-nez p3, :cond_2c

    .line 680
    .line 681
    goto :goto_9

    .line 682
    :cond_2c
    move-object v5, p3

    .line 683
    check-cast v5, Ljava/lang/String;

    .line 684
    .line 685
    :goto_9
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    return-void

    .line 689
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 690
    .line 691
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 692
    .line 693
    if-nez p3, :cond_2d

    .line 694
    .line 695
    goto :goto_a

    .line 696
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 697
    .line 698
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 699
    .line 700
    .line 701
    move-result v2

    .line 702
    :goto_a
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 703
    .line 704
    .line 705
    return-void

    .line 706
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 707
    .line 708
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 709
    .line 710
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object p3

    .line 718
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 719
    .line 720
    .line 721
    return-void

    .line 722
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 723
    .line 724
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 725
    .line 726
    if-nez p3, :cond_2e

    .line 727
    .line 728
    goto :goto_b

    .line 729
    :cond_2e
    move-object v5, p3

    .line 730
    check-cast v5, Ljava/lang/String;

    .line 731
    .line 732
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 737
    .line 738
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 739
    .line 740
    if-nez p3, :cond_2f

    .line 741
    .line 742
    goto :goto_c

    .line 743
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 744
    .line 745
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 746
    .line 747
    .line 748
    move-result v4

    .line 749
    :goto_c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 750
    .line 751
    .line 752
    return-void

    .line 753
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 754
    .line 755
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 756
    .line 757
    if-nez p3, :cond_30

    .line 758
    .line 759
    goto :goto_d

    .line 760
    :cond_30
    move-object v5, p3

    .line 761
    check-cast v5, Ljava/lang/String;

    .line 762
    .line 763
    :goto_d
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    return-void

    .line 767
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 768
    .line 769
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 770
    .line 771
    if-nez p3, :cond_31

    .line 772
    .line 773
    goto :goto_e

    .line 774
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 775
    .line 776
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 777
    .line 778
    .line 779
    move-result v4

    .line 780
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMinY(Landroid/view/View;F)V

    .line 781
    .line 782
    .line 783
    return-void

    .line 784
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 785
    .line 786
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 787
    .line 788
    if-nez p3, :cond_32

    .line 789
    .line 790
    goto :goto_f

    .line 791
    :cond_32
    check-cast p3, Ljava/lang/Double;

    .line 792
    .line 793
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 794
    .line 795
    .line 796
    move-result v4

    .line 797
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMinX(Landroid/view/View;F)V

    .line 798
    .line 799
    .line 800
    return-void

    .line 801
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 802
    .line 803
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 804
    .line 805
    if-nez p3, :cond_33

    .line 806
    .line 807
    goto :goto_10

    .line 808
    :cond_33
    move-object v5, p3

    .line 809
    check-cast v5, Ljava/lang/String;

    .line 810
    .line 811
    :goto_10
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 812
    .line 813
    .line 814
    return-void

    .line 815
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 816
    .line 817
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 818
    .line 819
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 820
    .line 821
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 825
    .line 826
    .line 827
    return-void

    .line 828
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 829
    .line 830
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 831
    .line 832
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 833
    .line 834
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 838
    .line 839
    .line 840
    return-void

    .line 841
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 842
    .line 843
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 844
    .line 845
    if-nez p3, :cond_34

    .line 846
    .line 847
    goto :goto_11

    .line 848
    :cond_34
    check-cast p3, Ljava/lang/Double;

    .line 849
    .line 850
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 851
    .line 852
    .line 853
    move-result v4

    .line 854
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 859
    .line 860
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 861
    .line 862
    if-nez p3, :cond_35

    .line 863
    .line 864
    goto :goto_12

    .line 865
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 866
    .line 867
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    :goto_12
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 872
    .line 873
    .line 874
    return-void

    .line 875
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 876
    .line 877
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 878
    .line 879
    if-nez p3, :cond_36

    .line 880
    .line 881
    goto :goto_13

    .line 882
    :cond_36
    move-object v5, p3

    .line 883
    check-cast v5, Ljava/lang/String;

    .line 884
    .line 885
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 890
    .line 891
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 892
    .line 893
    if-nez p3, :cond_37

    .line 894
    .line 895
    goto :goto_14

    .line 896
    :cond_37
    check-cast p3, Ljava/lang/Double;

    .line 897
    .line 898
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    :goto_14
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 903
    .line 904
    .line 905
    return-void

    .line 906
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 907
    .line 908
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 909
    .line 910
    if-nez p3, :cond_38

    .line 911
    .line 912
    goto :goto_15

    .line 913
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 914
    .line 915
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 916
    .line 917
    .line 918
    move-result v1

    .line 919
    :goto_15
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 920
    .line 921
    .line 922
    return-void

    .line 923
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 924
    .line 925
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 926
    .line 927
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 928
    .line 929
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 930
    .line 931
    .line 932
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 933
    .line 934
    .line 935
    return-void

    .line 936
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 937
    .line 938
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 939
    .line 940
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 941
    .line 942
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 946
    .line 947
    .line 948
    return-void

    .line 949
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 950
    .line 951
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 952
    .line 953
    if-nez p3, :cond_39

    .line 954
    .line 955
    goto :goto_16

    .line 956
    :cond_39
    move-object v5, p3

    .line 957
    check-cast v5, Ljava/lang/String;

    .line 958
    .line 959
    :goto_16
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    return-void

    .line 963
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 964
    .line 965
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 966
    .line 967
    if-nez p3, :cond_3a

    .line 968
    .line 969
    goto :goto_17

    .line 970
    :cond_3a
    move-object v5, p3

    .line 971
    check-cast v5, Ljava/lang/String;

    .line 972
    .line 973
    :goto_17
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    return-void

    .line 977
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 978
    .line 979
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 980
    .line 981
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 982
    .line 983
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 984
    .line 985
    .line 986
    return-void

    .line 987
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 988
    .line 989
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 990
    .line 991
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 992
    .line 993
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 994
    .line 995
    .line 996
    return-void

    .line 997
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 998
    .line 999
    if-nez p3, :cond_3b

    .line 1000
    .line 1001
    goto :goto_18

    .line 1002
    :cond_3b
    check-cast p3, Ljava/lang/Double;

    .line 1003
    .line 1004
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    :goto_18
    invoke-virtual {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 1009
    .line 1010
    .line 1011
    return-void

    .line 1012
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1013
    .line 1014
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 1015
    .line 1016
    if-nez p3, :cond_3c

    .line 1017
    .line 1018
    goto :goto_19

    .line 1019
    :cond_3c
    move-object v5, p3

    .line 1020
    check-cast v5, Ljava/lang/String;

    .line 1021
    .line 1022
    :goto_19
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    return-void

    .line 1026
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1027
    .line 1028
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;

    .line 1029
    .line 1030
    if-nez p3, :cond_3d

    .line 1031
    .line 1032
    goto :goto_1a

    .line 1033
    :cond_3d
    check-cast p3, Ljava/lang/Double;

    .line 1034
    .line 1035
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1036
    .line 1037
    .line 1038
    move-result v4

    .line 1039
    :goto_1a
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGSymbolManagerInterface;->setVbHeight(Landroid/view/View;F)V

    .line 1040
    .line 1041
    .line 1042
    return-void

    .line 1043
    :sswitch_data_0
    .sparse-switch
        -0x5d75250d -> :sswitch_23
        -0x4bf73488 -> :sswitch_22
        -0x4b8807f5 -> :sswitch_21
        -0x4072683f -> :sswitch_20
        -0x3b3da15f -> :sswitch_1f
        -0x37a9a5bf -> :sswitch_1e
        -0x37a98852 -> :sswitch_1d
        -0x352a89c8 -> :sswitch_1c
        -0x2bc67c59 -> :sswitch_1b
        -0x2b7578e1 -> :sswitch_1a
        -0x18d3d54d -> :sswitch_19
        -0x117e564a -> :sswitch_18
        -0x3330ef8 -> :sswitch_17
        -0x2a83503 -> :sswitch_16
        0x2ff583 -> :sswitch_15
        0x300c4f -> :sswitch_14
        0x3306ec -> :sswitch_13
        0x332446 -> :sswitch_12
        0x332447 -> :sswitch_11
        0x337a8b -> :sswitch_10
        0x4b3162e -> :sswitch_f
        0x5899705 -> :sswitch_e
        0x5a72f63 -> :sswitch_d
        0x63a48b4 -> :sswitch_c
        0xcf0d448 -> :sswitch_b
        0xe557a7a -> :sswitch_a
        0x15caa0f0 -> :sswitch_9
        0x17f096af -> :sswitch_8
        0x36b25395 -> :sswitch_7
        0x36b3866c -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x63a518c2 -> :sswitch_4
        0x6ab59576 -> :sswitch_3
        0x6e2146f6 -> :sswitch_2
        0x71baeb28 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
