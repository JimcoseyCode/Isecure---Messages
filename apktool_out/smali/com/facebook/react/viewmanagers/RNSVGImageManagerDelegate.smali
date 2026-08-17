.class public Lcom/facebook/react/viewmanagers/RNSVGImageManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface<",
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
    const/16 v3, 0x21

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
    const/16 v3, 0x20

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
    const/16 v3, 0x1f

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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "markerStart"

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
    const/16 v3, 0x18

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "width"

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
    const/16 v3, 0x17

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x16

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "color"

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
    const/16 v3, 0x15

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "align"

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
    const/16 v3, 0x14

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x13

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "name"

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
    const/16 v3, 0x12

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "mask"

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
    const/16 v3, 0x11

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "fill"

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
    const/16 v3, 0x10

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "src"

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
    const/16 v3, 0xf

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "y"

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
    const/16 v3, 0xe

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "x"

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
    const/16 v3, 0xd

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xc

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xb

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xa

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x9

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "fillRule"

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
    const/16 v3, 0x8

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "stroke"

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
    goto :goto_0

    .line 389
    :cond_1a
    const/4 v3, 0x7

    .line 390
    goto :goto_0

    .line 391
    :sswitch_1b
    const-string v0, "markerMid"

    .line 392
    .line 393
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-nez v0, :cond_1b

    .line 398
    .line 399
    goto :goto_0

    .line 400
    :cond_1b
    const/4 v3, 0x6

    .line 401
    goto :goto_0

    .line 402
    :sswitch_1c
    const-string v0, "markerEnd"

    .line 403
    .line 404
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-nez v0, :cond_1c

    .line 409
    .line 410
    goto :goto_0

    .line 411
    :cond_1c
    const/4 v3, 0x5

    .line 412
    goto :goto_0

    .line 413
    :sswitch_1d
    const-string v0, "propList"

    .line 414
    .line 415
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-nez v0, :cond_1d

    .line 420
    .line 421
    goto :goto_0

    .line 422
    :cond_1d
    const/4 v3, 0x4

    .line 423
    goto :goto_0

    .line 424
    :sswitch_1e
    const-string v0, "matrix"

    .line 425
    .line 426
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-nez v0, :cond_1e

    .line 431
    .line 432
    goto :goto_0

    .line 433
    :cond_1e
    const/4 v3, 0x3

    .line 434
    goto :goto_0

    .line 435
    :sswitch_1f
    const-string v0, "height"

    .line 436
    .line 437
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-nez v0, :cond_1f

    .line 442
    .line 443
    goto :goto_0

    .line 444
    :cond_1f
    const/4 v3, 0x2

    .line 445
    goto :goto_0

    .line 446
    :sswitch_20
    const-string v0, "opacity"

    .line 447
    .line 448
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-nez v0, :cond_20

    .line 453
    .line 454
    goto :goto_0

    .line 455
    :cond_20
    move v3, v1

    .line 456
    goto :goto_0

    .line 457
    :sswitch_21
    const-string v0, "filter"

    .line 458
    .line 459
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-nez v0, :cond_21

    .line 464
    .line 465
    goto :goto_0

    .line 466
    :cond_21
    move v3, v2

    .line 467
    :goto_0
    const/4 v0, 0x0

    .line 468
    const/high16 v4, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v5, 0x0

    .line 471
    packed-switch v3, :pswitch_data_0

    .line 472
    .line 473
    .line 474
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    return-void

    .line 478
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 479
    .line 480
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 481
    .line 482
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 483
    .line 484
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 488
    .line 489
    .line 490
    return-void

    .line 491
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 492
    .line 493
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 494
    .line 495
    if-nez p3, :cond_22

    .line 496
    .line 497
    goto :goto_1

    .line 498
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 499
    .line 500
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 509
    .line 510
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 511
    .line 512
    if-nez p3, :cond_23

    .line 513
    .line 514
    goto :goto_2

    .line 515
    :cond_23
    check-cast p3, Ljava/lang/Boolean;

    .line 516
    .line 517
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 526
    .line 527
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 528
    .line 529
    if-nez p3, :cond_24

    .line 530
    .line 531
    goto :goto_3

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
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 539
    .line 540
    .line 541
    return-void

    .line 542
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 543
    .line 544
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 545
    .line 546
    if-nez p3, :cond_25

    .line 547
    .line 548
    goto :goto_4

    .line 549
    :cond_25
    move-object v5, p3

    .line 550
    check-cast v5, Ljava/lang/String;

    .line 551
    .line 552
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    return-void

    .line 556
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 557
    .line 558
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 559
    .line 560
    if-nez p3, :cond_26

    .line 561
    .line 562
    goto :goto_5

    .line 563
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 564
    .line 565
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 570
    .line 571
    .line 572
    return-void

    .line 573
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 574
    .line 575
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 576
    .line 577
    if-nez p3, :cond_27

    .line 578
    .line 579
    goto :goto_6

    .line 580
    :cond_27
    check-cast p3, Ljava/lang/Double;

    .line 581
    .line 582
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 591
    .line 592
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 593
    .line 594
    if-nez p3, :cond_28

    .line 595
    .line 596
    goto :goto_7

    .line 597
    :cond_28
    move-object v5, p3

    .line 598
    check-cast v5, Ljava/lang/String;

    .line 599
    .line 600
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 605
    .line 606
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 607
    .line 608
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 609
    .line 610
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 614
    .line 615
    .line 616
    return-void

    .line 617
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 618
    .line 619
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 620
    .line 621
    if-nez p3, :cond_29

    .line 622
    .line 623
    goto :goto_8

    .line 624
    :cond_29
    move-object v5, p3

    .line 625
    check-cast v5, Ljava/lang/String;

    .line 626
    .line 627
    :goto_8
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    return-void

    .line 631
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 632
    .line 633
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 634
    .line 635
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 636
    .line 637
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 641
    .line 642
    .line 643
    return-void

    .line 644
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 645
    .line 646
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 647
    .line 648
    if-nez p3, :cond_2a

    .line 649
    .line 650
    goto :goto_9

    .line 651
    :cond_2a
    check-cast p3, Ljava/lang/Double;

    .line 652
    .line 653
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    :goto_9
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 658
    .line 659
    .line 660
    return-void

    .line 661
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 662
    .line 663
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 664
    .line 665
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 670
    .line 671
    .line 672
    move-result-object p3

    .line 673
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 678
    .line 679
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 680
    .line 681
    if-nez p3, :cond_2b

    .line 682
    .line 683
    goto :goto_a

    .line 684
    :cond_2b
    move-object v5, p3

    .line 685
    check-cast v5, Ljava/lang/String;

    .line 686
    .line 687
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    return-void

    .line 691
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 692
    .line 693
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 694
    .line 695
    if-nez p3, :cond_2c

    .line 696
    .line 697
    goto :goto_b

    .line 698
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 699
    .line 700
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 705
    .line 706
    .line 707
    return-void

    .line 708
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 709
    .line 710
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 711
    .line 712
    if-nez p3, :cond_2d

    .line 713
    .line 714
    goto :goto_c

    .line 715
    :cond_2d
    move-object v5, p3

    .line 716
    check-cast v5, Ljava/lang/String;

    .line 717
    .line 718
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    return-void

    .line 722
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 723
    .line 724
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 725
    .line 726
    if-nez p3, :cond_2e

    .line 727
    .line 728
    goto :goto_d

    .line 729
    :cond_2e
    move-object v5, p3

    .line 730
    check-cast v5, Ljava/lang/String;

    .line 731
    .line 732
    :goto_d
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 737
    .line 738
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 739
    .line 740
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 741
    .line 742
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 746
    .line 747
    .line 748
    return-void

    .line 749
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 750
    .line 751
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 752
    .line 753
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 754
    .line 755
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setSrc(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 760
    .line 761
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 762
    .line 763
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 764
    .line 765
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 769
    .line 770
    .line 771
    return-void

    .line 772
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 773
    .line 774
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 775
    .line 776
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 777
    .line 778
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 782
    .line 783
    .line 784
    return-void

    .line 785
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 786
    .line 787
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 788
    .line 789
    if-nez p3, :cond_2f

    .line 790
    .line 791
    goto :goto_e

    .line 792
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 793
    .line 794
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    :goto_e
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 799
    .line 800
    .line 801
    return-void

    .line 802
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 803
    .line 804
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 805
    .line 806
    if-nez p3, :cond_30

    .line 807
    .line 808
    goto :goto_f

    .line 809
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 810
    .line 811
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 812
    .line 813
    .line 814
    move-result v4

    .line 815
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 816
    .line 817
    .line 818
    return-void

    .line 819
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 820
    .line 821
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 822
    .line 823
    if-nez p3, :cond_31

    .line 824
    .line 825
    goto :goto_10

    .line 826
    :cond_31
    move-object v5, p3

    .line 827
    check-cast v5, Ljava/lang/String;

    .line 828
    .line 829
    :goto_10
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    return-void

    .line 833
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 834
    .line 835
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 836
    .line 837
    if-nez p3, :cond_32

    .line 838
    .line 839
    goto :goto_11

    .line 840
    :cond_32
    check-cast p3, Ljava/lang/Double;

    .line 841
    .line 842
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 843
    .line 844
    .line 845
    move-result v4

    .line 846
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 847
    .line 848
    .line 849
    return-void

    .line 850
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 851
    .line 852
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 853
    .line 854
    if-nez p3, :cond_33

    .line 855
    .line 856
    goto :goto_12

    .line 857
    :cond_33
    check-cast p3, Ljava/lang/Double;

    .line 858
    .line 859
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 860
    .line 861
    .line 862
    move-result v1

    .line 863
    :goto_12
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 864
    .line 865
    .line 866
    return-void

    .line 867
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 868
    .line 869
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 870
    .line 871
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 872
    .line 873
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 877
    .line 878
    .line 879
    return-void

    .line 880
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 881
    .line 882
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 883
    .line 884
    if-nez p3, :cond_34

    .line 885
    .line 886
    goto :goto_13

    .line 887
    :cond_34
    move-object v5, p3

    .line 888
    check-cast v5, Ljava/lang/String;

    .line 889
    .line 890
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    return-void

    .line 894
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 895
    .line 896
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 897
    .line 898
    if-nez p3, :cond_35

    .line 899
    .line 900
    goto :goto_14

    .line 901
    :cond_35
    move-object v5, p3

    .line 902
    check-cast v5, Ljava/lang/String;

    .line 903
    .line 904
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    return-void

    .line 908
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 909
    .line 910
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 911
    .line 912
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 913
    .line 914
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 915
    .line 916
    .line 917
    return-void

    .line 918
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 919
    .line 920
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 921
    .line 922
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 923
    .line 924
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 925
    .line 926
    .line 927
    return-void

    .line 928
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 929
    .line 930
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 931
    .line 932
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 933
    .line 934
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 938
    .line 939
    .line 940
    return-void

    .line 941
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 942
    .line 943
    if-nez p3, :cond_36

    .line 944
    .line 945
    goto :goto_15

    .line 946
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 947
    .line 948
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 949
    .line 950
    .line 951
    move-result v4

    .line 952
    :goto_15
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 953
    .line 954
    .line 955
    return-void

    .line 956
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 957
    .line 958
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;

    .line 959
    .line 960
    if-nez p3, :cond_37

    .line 961
    .line 962
    goto :goto_16

    .line 963
    :cond_37
    move-object v5, p3

    .line 964
    check-cast v5, Ljava/lang/String;

    .line 965
    .line 966
    :goto_16
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGImageManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    return-void

    .line 970
    nop

    .line 971
    :sswitch_data_0
    .sparse-switch
        -0x4bf73488 -> :sswitch_21
        -0x4b8807f5 -> :sswitch_20
        -0x48c76ed9 -> :sswitch_1f
        -0x4072683f -> :sswitch_1e
        -0x3b3da15f -> :sswitch_1d
        -0x37a9a5bf -> :sswitch_1c
        -0x37a98852 -> :sswitch_1b
        -0x352a89c8 -> :sswitch_1a
        -0x2b7578e1 -> :sswitch_19
        -0x18d3d54d -> :sswitch_18
        -0x117e564a -> :sswitch_17
        -0x3330ef8 -> :sswitch_16
        -0x2a83503 -> :sswitch_15
        0x78 -> :sswitch_14
        0x79 -> :sswitch_13
        0x1bde4 -> :sswitch_12
        0x2ff583 -> :sswitch_11
        0x3306ec -> :sswitch_10
        0x337a8b -> :sswitch_f
        0x4b3162e -> :sswitch_e
        0x5899705 -> :sswitch_d
        0x5a72f63 -> :sswitch_c
        0x63a48b4 -> :sswitch_b
        0x6be2dc6 -> :sswitch_a
        0xcf0d448 -> :sswitch_9
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
    :pswitch_data_0
    .packed-switch 0x0
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
