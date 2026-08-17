.class public Lcom/facebook/react/viewmanagers/RNSVGPatternManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface<",
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
    const/16 v3, 0x2a

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
    const/16 v3, 0x29

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
    const/16 v3, 0x28

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
    const/16 v3, 0x27

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
    const/16 v3, 0x26

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
    const/16 v3, 0x25

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
    const/16 v3, 0x24

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
    const/16 v3, 0x23

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "patternTransform"

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
    const/16 v3, 0x22

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "strokeDasharray"

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
    const/16 v3, 0x21

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "fontSize"

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
    const/16 v3, 0x20

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "vbWidth"

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
    const/16 v3, 0x1f

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "markerStart"

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
    const/16 v3, 0x1e

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "width"

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
    const/16 v3, 0x1d

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x1c

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "color"

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
    const/16 v3, 0x1b

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "align"

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
    const/16 v3, 0x1a

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x19

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "name"

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
    const/16 v3, 0x18

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "minY"

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
    const/16 v3, 0x17

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "minX"

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
    const/16 v3, 0x16

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "mask"

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
    const/16 v3, 0x15

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "font"

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
    const/16 v3, 0x14

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "fill"

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
    const/16 v3, 0x13

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "y"

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
    const/16 v3, 0x12

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "x"

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
    const/16 v3, 0x11

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0x10

    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :sswitch_1b
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xf

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :sswitch_1c
    const-string v0, "patternContentUnits"

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
    goto/16 :goto_0

    .line 417
    .line 418
    :cond_1c
    const/16 v3, 0xe

    .line 419
    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :sswitch_1d
    const-string v0, "patternUnits"

    .line 423
    .line 424
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-nez v0, :cond_1d

    .line 429
    .line 430
    goto/16 :goto_0

    .line 431
    .line 432
    :cond_1d
    const/16 v3, 0xd

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :sswitch_1e
    const-string v0, "pointerEvents"

    .line 437
    .line 438
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-nez v0, :cond_1e

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :cond_1e
    const/16 v3, 0xc

    .line 447
    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :sswitch_1f
    const-string v0, "strokeOpacity"

    .line 451
    .line 452
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-nez v0, :cond_1f

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :cond_1f
    const/16 v3, 0xb

    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :sswitch_20
    const-string v0, "fillRule"

    .line 465
    .line 466
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-nez v0, :cond_20

    .line 471
    .line 472
    goto/16 :goto_0

    .line 473
    .line 474
    :cond_20
    const/16 v3, 0xa

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :sswitch_21
    const-string v0, "fontWeight"

    .line 479
    .line 480
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-nez v0, :cond_21

    .line 485
    .line 486
    goto/16 :goto_0

    .line 487
    .line 488
    :cond_21
    const/16 v3, 0x9

    .line 489
    .line 490
    goto/16 :goto_0

    .line 491
    .line 492
    :sswitch_22
    const-string v0, "stroke"

    .line 493
    .line 494
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-nez v0, :cond_22

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :cond_22
    const/16 v3, 0x8

    .line 503
    .line 504
    goto/16 :goto_0

    .line 505
    .line 506
    :sswitch_23
    const-string v0, "markerMid"

    .line 507
    .line 508
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-nez v0, :cond_23

    .line 513
    .line 514
    goto :goto_0

    .line 515
    :cond_23
    const/4 v3, 0x7

    .line 516
    goto :goto_0

    .line 517
    :sswitch_24
    const-string v0, "markerEnd"

    .line 518
    .line 519
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-nez v0, :cond_24

    .line 524
    .line 525
    goto :goto_0

    .line 526
    :cond_24
    const/4 v3, 0x6

    .line 527
    goto :goto_0

    .line 528
    :sswitch_25
    const-string v0, "propList"

    .line 529
    .line 530
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    if-nez v0, :cond_25

    .line 535
    .line 536
    goto :goto_0

    .line 537
    :cond_25
    const/4 v3, 0x5

    .line 538
    goto :goto_0

    .line 539
    :sswitch_26
    const-string v0, "matrix"

    .line 540
    .line 541
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-nez v0, :cond_26

    .line 546
    .line 547
    goto :goto_0

    .line 548
    :cond_26
    const/4 v3, 0x4

    .line 549
    goto :goto_0

    .line 550
    :sswitch_27
    const-string v0, "height"

    .line 551
    .line 552
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-nez v0, :cond_27

    .line 557
    .line 558
    goto :goto_0

    .line 559
    :cond_27
    const/4 v3, 0x3

    .line 560
    goto :goto_0

    .line 561
    :sswitch_28
    const-string v0, "opacity"

    .line 562
    .line 563
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-nez v0, :cond_28

    .line 568
    .line 569
    goto :goto_0

    .line 570
    :cond_28
    const/4 v3, 0x2

    .line 571
    goto :goto_0

    .line 572
    :sswitch_29
    const-string v0, "filter"

    .line 573
    .line 574
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-nez v0, :cond_29

    .line 579
    .line 580
    goto :goto_0

    .line 581
    :cond_29
    move v3, v1

    .line 582
    goto :goto_0

    .line 583
    :sswitch_2a
    const-string v0, "vbHeight"

    .line 584
    .line 585
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-nez v0, :cond_2a

    .line 590
    .line 591
    goto :goto_0

    .line 592
    :cond_2a
    move v3, v2

    .line 593
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/4 v4, 0x0

    .line 596
    const/4 v5, 0x0

    .line 597
    packed-switch v3, :pswitch_data_0

    .line 598
    .line 599
    .line 600
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 605
    .line 606
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 607
    .line 608
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 609
    .line 610
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 614
    .line 615
    .line 616
    return-void

    .line 617
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 618
    .line 619
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 620
    .line 621
    if-nez p3, :cond_2b

    .line 622
    .line 623
    goto :goto_1

    .line 624
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 625
    .line 626
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMeetOrSlice(Landroid/view/View;I)V

    .line 631
    .line 632
    .line 633
    return-void

    .line 634
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 635
    .line 636
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 637
    .line 638
    if-nez p3, :cond_2c

    .line 639
    .line 640
    goto :goto_2

    .line 641
    :cond_2c
    check-cast p3, Ljava/lang/Boolean;

    .line 642
    .line 643
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 652
    .line 653
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 654
    .line 655
    if-nez p3, :cond_2d

    .line 656
    .line 657
    goto :goto_3

    .line 658
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 659
    .line 660
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 669
    .line 670
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 671
    .line 672
    if-nez p3, :cond_2e

    .line 673
    .line 674
    goto :goto_4

    .line 675
    :cond_2e
    move-object v5, p3

    .line 676
    check-cast v5, Ljava/lang/String;

    .line 677
    .line 678
    :goto_4
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    return-void

    .line 682
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 683
    .line 684
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 685
    .line 686
    if-nez p3, :cond_2f

    .line 687
    .line 688
    goto :goto_5

    .line 689
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 690
    .line 691
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 696
    .line 697
    .line 698
    return-void

    .line 699
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 700
    .line 701
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 702
    .line 703
    if-nez p3, :cond_30

    .line 704
    .line 705
    goto :goto_6

    .line 706
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 707
    .line 708
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 709
    .line 710
    .line 711
    move-result v2

    .line 712
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 713
    .line 714
    .line 715
    return-void

    .line 716
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 717
    .line 718
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 719
    .line 720
    if-nez p3, :cond_31

    .line 721
    .line 722
    goto :goto_7

    .line 723
    :cond_31
    move-object v5, p3

    .line 724
    check-cast v5, Ljava/lang/String;

    .line 725
    .line 726
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 731
    .line 732
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 733
    .line 734
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 735
    .line 736
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPatternTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 737
    .line 738
    .line 739
    return-void

    .line 740
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 741
    .line 742
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 743
    .line 744
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 745
    .line 746
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 750
    .line 751
    .line 752
    return-void

    .line 753
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 754
    .line 755
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 756
    .line 757
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 758
    .line 759
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 763
    .line 764
    .line 765
    return-void

    .line 766
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 767
    .line 768
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 769
    .line 770
    if-nez p3, :cond_32

    .line 771
    .line 772
    goto :goto_8

    .line 773
    :cond_32
    check-cast p3, Ljava/lang/Double;

    .line 774
    .line 775
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 776
    .line 777
    .line 778
    move-result v4

    .line 779
    :goto_8
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setVbWidth(Landroid/view/View;F)V

    .line 780
    .line 781
    .line 782
    return-void

    .line 783
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 784
    .line 785
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 786
    .line 787
    if-nez p3, :cond_33

    .line 788
    .line 789
    goto :goto_9

    .line 790
    :cond_33
    move-object v5, p3

    .line 791
    check-cast v5, Ljava/lang/String;

    .line 792
    .line 793
    :goto_9
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 798
    .line 799
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 800
    .line 801
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 802
    .line 803
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 807
    .line 808
    .line 809
    return-void

    .line 810
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 811
    .line 812
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 813
    .line 814
    if-nez p3, :cond_34

    .line 815
    .line 816
    goto :goto_a

    .line 817
    :cond_34
    check-cast p3, Ljava/lang/Double;

    .line 818
    .line 819
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    :goto_a
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 824
    .line 825
    .line 826
    return-void

    .line 827
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 828
    .line 829
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 830
    .line 831
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 836
    .line 837
    .line 838
    move-result-object p3

    .line 839
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 840
    .line 841
    .line 842
    return-void

    .line 843
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 844
    .line 845
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 846
    .line 847
    if-nez p3, :cond_35

    .line 848
    .line 849
    goto :goto_b

    .line 850
    :cond_35
    move-object v5, p3

    .line 851
    check-cast v5, Ljava/lang/String;

    .line 852
    .line 853
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    return-void

    .line 857
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 858
    .line 859
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 860
    .line 861
    if-nez p3, :cond_36

    .line 862
    .line 863
    goto :goto_c

    .line 864
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 865
    .line 866
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 867
    .line 868
    .line 869
    move-result v4

    .line 870
    :goto_c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 871
    .line 872
    .line 873
    return-void

    .line 874
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 875
    .line 876
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 877
    .line 878
    if-nez p3, :cond_37

    .line 879
    .line 880
    goto :goto_d

    .line 881
    :cond_37
    move-object v5, p3

    .line 882
    check-cast v5, Ljava/lang/String;

    .line 883
    .line 884
    :goto_d
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    return-void

    .line 888
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 889
    .line 890
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 891
    .line 892
    if-nez p3, :cond_38

    .line 893
    .line 894
    goto :goto_e

    .line 895
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 896
    .line 897
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 898
    .line 899
    .line 900
    move-result v4

    .line 901
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMinY(Landroid/view/View;F)V

    .line 902
    .line 903
    .line 904
    return-void

    .line 905
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 906
    .line 907
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 908
    .line 909
    if-nez p3, :cond_39

    .line 910
    .line 911
    goto :goto_f

    .line 912
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 913
    .line 914
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 915
    .line 916
    .line 917
    move-result v4

    .line 918
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMinX(Landroid/view/View;F)V

    .line 919
    .line 920
    .line 921
    return-void

    .line 922
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 923
    .line 924
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 925
    .line 926
    if-nez p3, :cond_3a

    .line 927
    .line 928
    goto :goto_10

    .line 929
    :cond_3a
    move-object v5, p3

    .line 930
    check-cast v5, Ljava/lang/String;

    .line 931
    .line 932
    :goto_10
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    return-void

    .line 936
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 937
    .line 938
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 939
    .line 940
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 941
    .line 942
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 946
    .line 947
    .line 948
    return-void

    .line 949
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 950
    .line 951
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 952
    .line 953
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 954
    .line 955
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 959
    .line 960
    .line 961
    return-void

    .line 962
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 963
    .line 964
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 965
    .line 966
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 967
    .line 968
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 972
    .line 973
    .line 974
    return-void

    .line 975
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 976
    .line 977
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 978
    .line 979
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 980
    .line 981
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 982
    .line 983
    .line 984
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 985
    .line 986
    .line 987
    return-void

    .line 988
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 989
    .line 990
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 991
    .line 992
    if-nez p3, :cond_3b

    .line 993
    .line 994
    goto :goto_11

    .line 995
    :cond_3b
    check-cast p3, Ljava/lang/Double;

    .line 996
    .line 997
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    :goto_11
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 1002
    .line 1003
    .line 1004
    return-void

    .line 1005
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1006
    .line 1007
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1008
    .line 1009
    if-nez p3, :cond_3c

    .line 1010
    .line 1011
    goto :goto_12

    .line 1012
    :cond_3c
    check-cast p3, Ljava/lang/Double;

    .line 1013
    .line 1014
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1015
    .line 1016
    .line 1017
    move-result v0

    .line 1018
    :goto_12
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 1019
    .line 1020
    .line 1021
    return-void

    .line 1022
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1023
    .line 1024
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1025
    .line 1026
    if-nez p3, :cond_3d

    .line 1027
    .line 1028
    goto :goto_13

    .line 1029
    :cond_3d
    check-cast p3, Ljava/lang/Double;

    .line 1030
    .line 1031
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1032
    .line 1033
    .line 1034
    move-result v2

    .line 1035
    :goto_13
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPatternContentUnits(Landroid/view/View;I)V

    .line 1036
    .line 1037
    .line 1038
    return-void

    .line 1039
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1040
    .line 1041
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1042
    .line 1043
    if-nez p3, :cond_3e

    .line 1044
    .line 1045
    goto :goto_14

    .line 1046
    :cond_3e
    check-cast p3, Ljava/lang/Double;

    .line 1047
    .line 1048
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1049
    .line 1050
    .line 1051
    move-result v2

    .line 1052
    :goto_14
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPatternUnits(Landroid/view/View;I)V

    .line 1053
    .line 1054
    .line 1055
    return-void

    .line 1056
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1057
    .line 1058
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1059
    .line 1060
    if-nez p3, :cond_3f

    .line 1061
    .line 1062
    goto :goto_15

    .line 1063
    :cond_3f
    move-object v5, p3

    .line 1064
    check-cast v5, Ljava/lang/String;

    .line 1065
    .line 1066
    :goto_15
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    return-void

    .line 1070
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1071
    .line 1072
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1073
    .line 1074
    if-nez p3, :cond_40

    .line 1075
    .line 1076
    goto :goto_16

    .line 1077
    :cond_40
    check-cast p3, Ljava/lang/Double;

    .line 1078
    .line 1079
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1080
    .line 1081
    .line 1082
    move-result v0

    .line 1083
    :goto_16
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1084
    .line 1085
    .line 1086
    return-void

    .line 1087
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1088
    .line 1089
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1090
    .line 1091
    if-nez p3, :cond_41

    .line 1092
    .line 1093
    goto :goto_17

    .line 1094
    :cond_41
    check-cast p3, Ljava/lang/Double;

    .line 1095
    .line 1096
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1097
    .line 1098
    .line 1099
    move-result v1

    .line 1100
    :goto_17
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1101
    .line 1102
    .line 1103
    return-void

    .line 1104
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1105
    .line 1106
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1107
    .line 1108
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1109
    .line 1110
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1114
    .line 1115
    .line 1116
    return-void

    .line 1117
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1118
    .line 1119
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1120
    .line 1121
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1122
    .line 1123
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1124
    .line 1125
    .line 1126
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1127
    .line 1128
    .line 1129
    return-void

    .line 1130
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1131
    .line 1132
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1133
    .line 1134
    if-nez p3, :cond_42

    .line 1135
    .line 1136
    goto :goto_18

    .line 1137
    :cond_42
    move-object v5, p3

    .line 1138
    check-cast v5, Ljava/lang/String;

    .line 1139
    .line 1140
    :goto_18
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1145
    .line 1146
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1147
    .line 1148
    if-nez p3, :cond_43

    .line 1149
    .line 1150
    goto :goto_19

    .line 1151
    :cond_43
    move-object v5, p3

    .line 1152
    check-cast v5, Ljava/lang/String;

    .line 1153
    .line 1154
    :goto_19
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1155
    .line 1156
    .line 1157
    return-void

    .line 1158
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1159
    .line 1160
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1161
    .line 1162
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1163
    .line 1164
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1165
    .line 1166
    .line 1167
    return-void

    .line 1168
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1169
    .line 1170
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1171
    .line 1172
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1173
    .line 1174
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1175
    .line 1176
    .line 1177
    return-void

    .line 1178
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1179
    .line 1180
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1181
    .line 1182
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1183
    .line 1184
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1188
    .line 1189
    .line 1190
    return-void

    .line 1191
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1192
    .line 1193
    if-nez p3, :cond_44

    .line 1194
    .line 1195
    goto :goto_1a

    .line 1196
    :cond_44
    check-cast p3, Ljava/lang/Double;

    .line 1197
    .line 1198
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1199
    .line 1200
    .line 1201
    move-result v0

    .line 1202
    :goto_1a
    invoke-virtual {p2, p1, v0}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 1203
    .line 1204
    .line 1205
    return-void

    .line 1206
    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1207
    .line 1208
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1209
    .line 1210
    if-nez p3, :cond_45

    .line 1211
    .line 1212
    goto :goto_1b

    .line 1213
    :cond_45
    move-object v5, p3

    .line 1214
    check-cast v5, Ljava/lang/String;

    .line 1215
    .line 1216
    :goto_1b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 1217
    .line 1218
    .line 1219
    return-void

    .line 1220
    :pswitch_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1221
    .line 1222
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;

    .line 1223
    .line 1224
    if-nez p3, :cond_46

    .line 1225
    .line 1226
    goto :goto_1c

    .line 1227
    :cond_46
    check-cast p3, Ljava/lang/Double;

    .line 1228
    .line 1229
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1230
    .line 1231
    .line 1232
    move-result v4

    .line 1233
    :goto_1c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPatternManagerInterface;->setVbHeight(Landroid/view/View;F)V

    .line 1234
    .line 1235
    .line 1236
    return-void

    .line 1237
    :sswitch_data_0
    .sparse-switch
        -0x5d75250d -> :sswitch_2a
        -0x4bf73488 -> :sswitch_29
        -0x4b8807f5 -> :sswitch_28
        -0x48c76ed9 -> :sswitch_27
        -0x4072683f -> :sswitch_26
        -0x3b3da15f -> :sswitch_25
        -0x37a9a5bf -> :sswitch_24
        -0x37a98852 -> :sswitch_23
        -0x352a89c8 -> :sswitch_22
        -0x2bc67c59 -> :sswitch_21
        -0x2b7578e1 -> :sswitch_20
        -0x18d3d54d -> :sswitch_1f
        -0x117e564a -> :sswitch_1e
        -0xc62ca41 -> :sswitch_1d
        -0x7ab81da -> :sswitch_1c
        -0x3330ef8 -> :sswitch_1b
        -0x2a83503 -> :sswitch_1a
        0x78 -> :sswitch_19
        0x79 -> :sswitch_18
        0x2ff583 -> :sswitch_17
        0x300c4f -> :sswitch_16
        0x3306ec -> :sswitch_15
        0x332446 -> :sswitch_14
        0x332447 -> :sswitch_13
        0x337a8b -> :sswitch_12
        0x4b3162e -> :sswitch_11
        0x5899705 -> :sswitch_10
        0x5a72f63 -> :sswitch_f
        0x63a48b4 -> :sswitch_e
        0x6be2dc6 -> :sswitch_d
        0xcf0d448 -> :sswitch_c
        0xe557a7a -> :sswitch_b
        0x15caa0f0 -> :sswitch_a
        0x17f096af -> :sswitch_9
        0x2c7fa1bc -> :sswitch_8
        0x36b25395 -> :sswitch_7
        0x36b3866c -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x63a518c2 -> :sswitch_4
        0x6ab59576 -> :sswitch_3
        0x6e2146f6 -> :sswitch_2
        0x71baeb28 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
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
