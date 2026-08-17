.class public Lcom/facebook/react/viewmanagers/RNSVGRectManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface<",
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
    const/16 v3, 0x20

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "responsible"

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
    const/16 v3, 0x1f

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "strokeLinejoin"

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
    const/16 v3, 0x1e

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "display"

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
    const/16 v3, 0x1d

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "strokeLinecap"

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
    const/16 v3, 0x1c

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "clipRule"

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
    const/16 v3, 0x1b

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "clipPath"

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
    const/16 v3, 0x1a

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "strokeDasharray"

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
    const/16 v3, 0x19

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "markerStart"

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
    const/16 v3, 0x18

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "width"

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
    const/16 v3, 0x17

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x16

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "color"

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
    const/16 v3, 0x15

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x14

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "name"

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
    const/16 v3, 0x13

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "mask"

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
    const/16 v3, 0x12

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "fill"

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
    const/16 v3, 0x11

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "ry"

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
    const/16 v3, 0x10

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "rx"

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
    const/16 v3, 0xf

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "y"

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
    const/16 v3, 0xe

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "x"

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
    const/16 v3, 0xd

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xc

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xb

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xa

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x9

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "fillRule"

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
    const/16 v3, 0x8

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "stroke"

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
    goto :goto_0

    .line 375
    :cond_19
    const/4 v3, 0x7

    .line 376
    goto :goto_0

    .line 377
    :sswitch_1a
    const-string v0, "markerMid"

    .line 378
    .line 379
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-nez v0, :cond_1a

    .line 384
    .line 385
    goto :goto_0

    .line 386
    :cond_1a
    const/4 v3, 0x6

    .line 387
    goto :goto_0

    .line 388
    :sswitch_1b
    const-string v0, "markerEnd"

    .line 389
    .line 390
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-nez v0, :cond_1b

    .line 395
    .line 396
    goto :goto_0

    .line 397
    :cond_1b
    const/4 v3, 0x5

    .line 398
    goto :goto_0

    .line 399
    :sswitch_1c
    const-string v0, "propList"

    .line 400
    .line 401
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    if-nez v0, :cond_1c

    .line 406
    .line 407
    goto :goto_0

    .line 408
    :cond_1c
    const/4 v3, 0x4

    .line 409
    goto :goto_0

    .line 410
    :sswitch_1d
    const-string v0, "matrix"

    .line 411
    .line 412
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-nez v0, :cond_1d

    .line 417
    .line 418
    goto :goto_0

    .line 419
    :cond_1d
    const/4 v3, 0x3

    .line 420
    goto :goto_0

    .line 421
    :sswitch_1e
    const-string v0, "height"

    .line 422
    .line 423
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-nez v0, :cond_1e

    .line 428
    .line 429
    goto :goto_0

    .line 430
    :cond_1e
    const/4 v3, 0x2

    .line 431
    goto :goto_0

    .line 432
    :sswitch_1f
    const-string v0, "opacity"

    .line 433
    .line 434
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-nez v0, :cond_1f

    .line 439
    .line 440
    goto :goto_0

    .line 441
    :cond_1f
    move v3, v1

    .line 442
    goto :goto_0

    .line 443
    :sswitch_20
    const-string v0, "filter"

    .line 444
    .line 445
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-nez v0, :cond_20

    .line 450
    .line 451
    goto :goto_0

    .line 452
    :cond_20
    move v3, v2

    .line 453
    :goto_0
    const/4 v0, 0x0

    .line 454
    const/high16 v4, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/4 v5, 0x0

    .line 457
    packed-switch v3, :pswitch_data_0

    .line 458
    .line 459
    .line 460
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 465
    .line 466
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 467
    .line 468
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 469
    .line 470
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 474
    .line 475
    .line 476
    return-void

    .line 477
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 478
    .line 479
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 480
    .line 481
    if-nez p3, :cond_21

    .line 482
    .line 483
    goto :goto_1

    .line 484
    :cond_21
    check-cast p3, Ljava/lang/Boolean;

    .line 485
    .line 486
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 495
    .line 496
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 497
    .line 498
    if-nez p3, :cond_22

    .line 499
    .line 500
    goto :goto_2

    .line 501
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 502
    .line 503
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 512
    .line 513
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 514
    .line 515
    if-nez p3, :cond_23

    .line 516
    .line 517
    goto :goto_3

    .line 518
    :cond_23
    move-object v5, p3

    .line 519
    check-cast v5, Ljava/lang/String;

    .line 520
    .line 521
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 526
    .line 527
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 528
    .line 529
    if-nez p3, :cond_24

    .line 530
    .line 531
    goto :goto_4

    .line 532
    :cond_24
    check-cast p3, Ljava/lang/Double;

    .line 533
    .line 534
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 539
    .line 540
    .line 541
    return-void

    .line 542
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 543
    .line 544
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 545
    .line 546
    if-nez p3, :cond_25

    .line 547
    .line 548
    goto :goto_5

    .line 549
    :cond_25
    check-cast p3, Ljava/lang/Double;

    .line 550
    .line 551
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 560
    .line 561
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 562
    .line 563
    if-nez p3, :cond_26

    .line 564
    .line 565
    goto :goto_6

    .line 566
    :cond_26
    move-object v5, p3

    .line 567
    check-cast v5, Ljava/lang/String;

    .line 568
    .line 569
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    return-void

    .line 573
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 574
    .line 575
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 576
    .line 577
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 578
    .line 579
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 587
    .line 588
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 589
    .line 590
    if-nez p3, :cond_27

    .line 591
    .line 592
    goto :goto_7

    .line 593
    :cond_27
    move-object v5, p3

    .line 594
    check-cast v5, Ljava/lang/String;

    .line 595
    .line 596
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 601
    .line 602
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 603
    .line 604
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 605
    .line 606
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 610
    .line 611
    .line 612
    return-void

    .line 613
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 614
    .line 615
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 616
    .line 617
    if-nez p3, :cond_28

    .line 618
    .line 619
    goto :goto_8

    .line 620
    :cond_28
    check-cast p3, Ljava/lang/Double;

    .line 621
    .line 622
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 627
    .line 628
    .line 629
    return-void

    .line 630
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 631
    .line 632
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 633
    .line 634
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 639
    .line 640
    .line 641
    move-result-object p3

    .line 642
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 643
    .line 644
    .line 645
    return-void

    .line 646
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 647
    .line 648
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 649
    .line 650
    if-nez p3, :cond_29

    .line 651
    .line 652
    goto :goto_9

    .line 653
    :cond_29
    check-cast p3, Ljava/lang/Double;

    .line 654
    .line 655
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 660
    .line 661
    .line 662
    return-void

    .line 663
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 664
    .line 665
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 666
    .line 667
    if-nez p3, :cond_2a

    .line 668
    .line 669
    goto :goto_a

    .line 670
    :cond_2a
    move-object v5, p3

    .line 671
    check-cast v5, Ljava/lang/String;

    .line 672
    .line 673
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 678
    .line 679
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 680
    .line 681
    if-nez p3, :cond_2b

    .line 682
    .line 683
    goto :goto_b

    .line 684
    :cond_2b
    move-object v5, p3

    .line 685
    check-cast v5, Ljava/lang/String;

    .line 686
    .line 687
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    return-void

    .line 691
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 692
    .line 693
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 694
    .line 695
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 696
    .line 697
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 701
    .line 702
    .line 703
    return-void

    .line 704
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 705
    .line 706
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 707
    .line 708
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 709
    .line 710
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 714
    .line 715
    .line 716
    return-void

    .line 717
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 718
    .line 719
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 720
    .line 721
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 722
    .line 723
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setRx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 731
    .line 732
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 733
    .line 734
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 735
    .line 736
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 740
    .line 741
    .line 742
    return-void

    .line 743
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 744
    .line 745
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 746
    .line 747
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 748
    .line 749
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 753
    .line 754
    .line 755
    return-void

    .line 756
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 757
    .line 758
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 759
    .line 760
    if-nez p3, :cond_2c

    .line 761
    .line 762
    goto :goto_c

    .line 763
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 764
    .line 765
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 770
    .line 771
    .line 772
    return-void

    .line 773
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 774
    .line 775
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 776
    .line 777
    if-nez p3, :cond_2d

    .line 778
    .line 779
    goto :goto_d

    .line 780
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 781
    .line 782
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 783
    .line 784
    .line 785
    move-result v4

    .line 786
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 787
    .line 788
    .line 789
    return-void

    .line 790
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 791
    .line 792
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 793
    .line 794
    if-nez p3, :cond_2e

    .line 795
    .line 796
    goto :goto_e

    .line 797
    :cond_2e
    move-object v5, p3

    .line 798
    check-cast v5, Ljava/lang/String;

    .line 799
    .line 800
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    return-void

    .line 804
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 805
    .line 806
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 807
    .line 808
    if-nez p3, :cond_2f

    .line 809
    .line 810
    goto :goto_f

    .line 811
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 812
    .line 813
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 818
    .line 819
    .line 820
    return-void

    .line 821
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 822
    .line 823
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 824
    .line 825
    if-nez p3, :cond_30

    .line 826
    .line 827
    goto :goto_10

    .line 828
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 829
    .line 830
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 835
    .line 836
    .line 837
    return-void

    .line 838
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 839
    .line 840
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 841
    .line 842
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 843
    .line 844
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 848
    .line 849
    .line 850
    return-void

    .line 851
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 852
    .line 853
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 854
    .line 855
    if-nez p3, :cond_31

    .line 856
    .line 857
    goto :goto_11

    .line 858
    :cond_31
    move-object v5, p3

    .line 859
    check-cast v5, Ljava/lang/String;

    .line 860
    .line 861
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    return-void

    .line 865
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 866
    .line 867
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 868
    .line 869
    if-nez p3, :cond_32

    .line 870
    .line 871
    goto :goto_12

    .line 872
    :cond_32
    move-object v5, p3

    .line 873
    check-cast v5, Ljava/lang/String;

    .line 874
    .line 875
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    return-void

    .line 879
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 880
    .line 881
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 882
    .line 883
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 884
    .line 885
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 890
    .line 891
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 892
    .line 893
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 894
    .line 895
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 896
    .line 897
    .line 898
    return-void

    .line 899
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 900
    .line 901
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 902
    .line 903
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 904
    .line 905
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 909
    .line 910
    .line 911
    return-void

    .line 912
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 913
    .line 914
    if-nez p3, :cond_33

    .line 915
    .line 916
    goto :goto_13

    .line 917
    :cond_33
    check-cast p3, Ljava/lang/Double;

    .line 918
    .line 919
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 920
    .line 921
    .line 922
    move-result v4

    .line 923
    :goto_13
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 924
    .line 925
    .line 926
    return-void

    .line 927
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 928
    .line 929
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;

    .line 930
    .line 931
    if-nez p3, :cond_34

    .line 932
    .line 933
    goto :goto_14

    .line 934
    :cond_34
    move-object v5, p3

    .line 935
    check-cast v5, Ljava/lang/String;

    .line 936
    .line 937
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGRectManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    return-void

    .line 941
    :sswitch_data_0
    .sparse-switch
        -0x4bf73488 -> :sswitch_20
        -0x4b8807f5 -> :sswitch_1f
        -0x48c76ed9 -> :sswitch_1e
        -0x4072683f -> :sswitch_1d
        -0x3b3da15f -> :sswitch_1c
        -0x37a9a5bf -> :sswitch_1b
        -0x37a98852 -> :sswitch_1a
        -0x352a89c8 -> :sswitch_19
        -0x2b7578e1 -> :sswitch_18
        -0x18d3d54d -> :sswitch_17
        -0x117e564a -> :sswitch_16
        -0x3330ef8 -> :sswitch_15
        -0x2a83503 -> :sswitch_14
        0x78 -> :sswitch_13
        0x79 -> :sswitch_12
        0xe46 -> :sswitch_11
        0xe47 -> :sswitch_10
        0x2ff583 -> :sswitch_f
        0x3306ec -> :sswitch_e
        0x337a8b -> :sswitch_d
        0x4b3162e -> :sswitch_c
        0x5a72f63 -> :sswitch_b
        0x63a48b4 -> :sswitch_a
        0x6be2dc6 -> :sswitch_9
        0xcf0d448 -> :sswitch_8
        0x17f096af -> :sswitch_7
        0x36b25395 -> :sswitch_6
        0x36b3866c -> :sswitch_5
        0x3d3f8e06 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
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
    :pswitch_data_0
    .packed-switch 0x0
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
