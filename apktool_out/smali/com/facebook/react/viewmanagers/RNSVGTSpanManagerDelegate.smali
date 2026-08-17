.class public Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface<",
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
    const/16 v3, 0x29

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
    const/16 v3, 0x28

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
    const/16 v3, 0x27

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
    const/16 v3, 0x26

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "textLength"

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
    const/16 v3, 0x25

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
    const/16 v3, 0x24

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "content"

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
    const/16 v3, 0x23

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "clipRule"

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
    const/16 v3, 0x22

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "clipPath"

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
    const/16 v3, 0x21

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "inlineSize"

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
    const/16 v3, 0x20

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "strokeDasharray"

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
    const/16 v3, 0x1f

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "fontSize"

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
    const/16 v3, 0x1e

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "baselineShift"

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
    const/16 v3, 0x1d

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "markerStart"

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x19

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "name"

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
    const/16 v3, 0x18

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "mask"

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
    const/16 v3, 0x17

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "font"

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
    const/16 v3, 0x16

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "fill"

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
    const/16 v3, 0x15

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "dy"

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
    const/16 v3, 0x14

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "dx"

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
    const/16 v3, 0x13

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "y"

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
    const/16 v3, 0x12

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "x"

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
    const/16 v3, 0x11

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :sswitch_19
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0x10

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :sswitch_1a
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xf

    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :sswitch_1b
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xe

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :sswitch_1c
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0xd

    .line 419
    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :sswitch_1d
    const-string v0, "fillRule"

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
    const/16 v3, 0xc

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :sswitch_1e
    const-string v0, "fontWeight"

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
    const/16 v3, 0xb

    .line 447
    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :sswitch_1f
    const-string v0, "stroke"

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
    const/16 v3, 0xa

    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :sswitch_20
    const-string v0, "rotate"

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
    const/16 v3, 0x9

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :sswitch_21
    const-string v0, "markerMid"

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
    const/16 v3, 0x8

    .line 489
    .line 490
    goto/16 :goto_0

    .line 491
    .line 492
    :sswitch_22
    const-string v0, "markerEnd"

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
    goto :goto_0

    .line 501
    :cond_22
    const/4 v3, 0x7

    .line 502
    goto :goto_0

    .line 503
    :sswitch_23
    const-string v0, "propList"

    .line 504
    .line 505
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-nez v0, :cond_23

    .line 510
    .line 511
    goto :goto_0

    .line 512
    :cond_23
    const/4 v3, 0x6

    .line 513
    goto :goto_0

    .line 514
    :sswitch_24
    const-string v0, "matrix"

    .line 515
    .line 516
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-nez v0, :cond_24

    .line 521
    .line 522
    goto :goto_0

    .line 523
    :cond_24
    const/4 v3, 0x5

    .line 524
    goto :goto_0

    .line 525
    :sswitch_25
    const-string v0, "verticalAlign"

    .line 526
    .line 527
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-nez v0, :cond_25

    .line 532
    .line 533
    goto :goto_0

    .line 534
    :cond_25
    const/4 v3, 0x4

    .line 535
    goto :goto_0

    .line 536
    :sswitch_26
    const-string v0, "alignmentBaseline"

    .line 537
    .line 538
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    if-nez v0, :cond_26

    .line 543
    .line 544
    goto :goto_0

    .line 545
    :cond_26
    const/4 v3, 0x3

    .line 546
    goto :goto_0

    .line 547
    :sswitch_27
    const-string v0, "opacity"

    .line 548
    .line 549
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-nez v0, :cond_27

    .line 554
    .line 555
    goto :goto_0

    .line 556
    :cond_27
    const/4 v3, 0x2

    .line 557
    goto :goto_0

    .line 558
    :sswitch_28
    const-string v0, "filter"

    .line 559
    .line 560
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-nez v0, :cond_28

    .line 565
    .line 566
    goto :goto_0

    .line 567
    :cond_28
    move v3, v1

    .line 568
    goto :goto_0

    .line 569
    :sswitch_29
    const-string v0, "lengthAdjust"

    .line 570
    .line 571
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-nez v0, :cond_29

    .line 576
    .line 577
    goto :goto_0

    .line 578
    :cond_29
    move v3, v2

    .line 579
    :goto_0
    const/4 v0, 0x0

    .line 580
    const/high16 v4, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v5, 0x0

    .line 583
    packed-switch v3, :pswitch_data_0

    .line 584
    .line 585
    .line 586
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 591
    .line 592
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 593
    .line 594
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 595
    .line 596
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 600
    .line 601
    .line 602
    return-void

    .line 603
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 604
    .line 605
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 606
    .line 607
    if-nez p3, :cond_2a

    .line 608
    .line 609
    goto :goto_1

    .line 610
    :cond_2a
    check-cast p3, Ljava/lang/Boolean;

    .line 611
    .line 612
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 617
    .line 618
    .line 619
    return-void

    .line 620
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 621
    .line 622
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 623
    .line 624
    if-nez p3, :cond_2b

    .line 625
    .line 626
    goto :goto_2

    .line 627
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 628
    .line 629
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 634
    .line 635
    .line 636
    return-void

    .line 637
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 638
    .line 639
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 640
    .line 641
    if-nez p3, :cond_2c

    .line 642
    .line 643
    goto :goto_3

    .line 644
    :cond_2c
    move-object v5, p3

    .line 645
    check-cast v5, Ljava/lang/String;

    .line 646
    .line 647
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 652
    .line 653
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 654
    .line 655
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 656
    .line 657
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setTextLength(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 661
    .line 662
    .line 663
    return-void

    .line 664
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 665
    .line 666
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 667
    .line 668
    if-nez p3, :cond_2d

    .line 669
    .line 670
    goto :goto_4

    .line 671
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 672
    .line 673
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 678
    .line 679
    .line 680
    return-void

    .line 681
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 682
    .line 683
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 684
    .line 685
    if-nez p3, :cond_2e

    .line 686
    .line 687
    goto :goto_5

    .line 688
    :cond_2e
    move-object v5, p3

    .line 689
    check-cast v5, Ljava/lang/String;

    .line 690
    .line 691
    :goto_5
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setContent(Landroid/view/View;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    return-void

    .line 695
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 696
    .line 697
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 698
    .line 699
    if-nez p3, :cond_2f

    .line 700
    .line 701
    goto :goto_6

    .line 702
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 703
    .line 704
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 709
    .line 710
    .line 711
    return-void

    .line 712
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 713
    .line 714
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 715
    .line 716
    if-nez p3, :cond_30

    .line 717
    .line 718
    goto :goto_7

    .line 719
    :cond_30
    move-object v5, p3

    .line 720
    check-cast v5, Ljava/lang/String;

    .line 721
    .line 722
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    return-void

    .line 726
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 727
    .line 728
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 729
    .line 730
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 731
    .line 732
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setInlineSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 736
    .line 737
    .line 738
    return-void

    .line 739
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 740
    .line 741
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 742
    .line 743
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 744
    .line 745
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 749
    .line 750
    .line 751
    return-void

    .line 752
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 753
    .line 754
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 755
    .line 756
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 757
    .line 758
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 762
    .line 763
    .line 764
    return-void

    .line 765
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 766
    .line 767
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 768
    .line 769
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 770
    .line 771
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setBaselineShift(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 775
    .line 776
    .line 777
    return-void

    .line 778
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 779
    .line 780
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 781
    .line 782
    if-nez p3, :cond_31

    .line 783
    .line 784
    goto :goto_8

    .line 785
    :cond_31
    move-object v5, p3

    .line 786
    check-cast v5, Ljava/lang/String;

    .line 787
    .line 788
    :goto_8
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    return-void

    .line 792
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 793
    .line 794
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 795
    .line 796
    if-nez p3, :cond_32

    .line 797
    .line 798
    goto :goto_9

    .line 799
    :cond_32
    check-cast p3, Ljava/lang/Double;

    .line 800
    .line 801
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    :goto_9
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 806
    .line 807
    .line 808
    return-void

    .line 809
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 810
    .line 811
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 812
    .line 813
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 818
    .line 819
    .line 820
    move-result-object p3

    .line 821
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 822
    .line 823
    .line 824
    return-void

    .line 825
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 826
    .line 827
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 828
    .line 829
    if-nez p3, :cond_33

    .line 830
    .line 831
    goto :goto_a

    .line 832
    :cond_33
    check-cast p3, Ljava/lang/Double;

    .line 833
    .line 834
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    :goto_a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 839
    .line 840
    .line 841
    return-void

    .line 842
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 843
    .line 844
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 845
    .line 846
    if-nez p3, :cond_34

    .line 847
    .line 848
    goto :goto_b

    .line 849
    :cond_34
    move-object v5, p3

    .line 850
    check-cast v5, Ljava/lang/String;

    .line 851
    .line 852
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    return-void

    .line 856
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 857
    .line 858
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 859
    .line 860
    if-nez p3, :cond_35

    .line 861
    .line 862
    goto :goto_c

    .line 863
    :cond_35
    move-object v5, p3

    .line 864
    check-cast v5, Ljava/lang/String;

    .line 865
    .line 866
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    return-void

    .line 870
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 871
    .line 872
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 873
    .line 874
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 875
    .line 876
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 880
    .line 881
    .line 882
    return-void

    .line 883
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 884
    .line 885
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 886
    .line 887
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 888
    .line 889
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 893
    .line 894
    .line 895
    return-void

    .line 896
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 897
    .line 898
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 899
    .line 900
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 901
    .line 902
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setDy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 906
    .line 907
    .line 908
    return-void

    .line 909
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 910
    .line 911
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 912
    .line 913
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 914
    .line 915
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setDx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 919
    .line 920
    .line 921
    return-void

    .line 922
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 923
    .line 924
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 925
    .line 926
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 927
    .line 928
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 932
    .line 933
    .line 934
    return-void

    .line 935
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 936
    .line 937
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 938
    .line 939
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 940
    .line 941
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 942
    .line 943
    .line 944
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 945
    .line 946
    .line 947
    return-void

    .line 948
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 949
    .line 950
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 951
    .line 952
    if-nez p3, :cond_36

    .line 953
    .line 954
    goto :goto_d

    .line 955
    :cond_36
    check-cast p3, Ljava/lang/Double;

    .line 956
    .line 957
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    :goto_d
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 962
    .line 963
    .line 964
    return-void

    .line 965
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 966
    .line 967
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 968
    .line 969
    if-nez p3, :cond_37

    .line 970
    .line 971
    goto :goto_e

    .line 972
    :cond_37
    check-cast p3, Ljava/lang/Double;

    .line 973
    .line 974
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 975
    .line 976
    .line 977
    move-result v4

    .line 978
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 979
    .line 980
    .line 981
    return-void

    .line 982
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 983
    .line 984
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 985
    .line 986
    if-nez p3, :cond_38

    .line 987
    .line 988
    goto :goto_f

    .line 989
    :cond_38
    move-object v5, p3

    .line 990
    check-cast v5, Ljava/lang/String;

    .line 991
    .line 992
    :goto_f
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    return-void

    .line 996
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 997
    .line 998
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 999
    .line 1000
    if-nez p3, :cond_39

    .line 1001
    .line 1002
    goto :goto_10

    .line 1003
    :cond_39
    check-cast p3, Ljava/lang/Double;

    .line 1004
    .line 1005
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1006
    .line 1007
    .line 1008
    move-result v4

    .line 1009
    :goto_10
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 1010
    .line 1011
    .line 1012
    return-void

    .line 1013
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1014
    .line 1015
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1016
    .line 1017
    if-nez p3, :cond_3a

    .line 1018
    .line 1019
    goto :goto_11

    .line 1020
    :cond_3a
    check-cast p3, Ljava/lang/Double;

    .line 1021
    .line 1022
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 1023
    .line 1024
    .line 1025
    move-result v1

    .line 1026
    :goto_11
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 1027
    .line 1028
    .line 1029
    return-void

    .line 1030
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1031
    .line 1032
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1033
    .line 1034
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1035
    .line 1036
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1040
    .line 1041
    .line 1042
    return-void

    .line 1043
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1044
    .line 1045
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1046
    .line 1047
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1048
    .line 1049
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1053
    .line 1054
    .line 1055
    return-void

    .line 1056
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1057
    .line 1058
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1059
    .line 1060
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1061
    .line 1062
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setRotate(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1066
    .line 1067
    .line 1068
    return-void

    .line 1069
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1070
    .line 1071
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1072
    .line 1073
    if-nez p3, :cond_3b

    .line 1074
    .line 1075
    goto :goto_12

    .line 1076
    :cond_3b
    move-object v5, p3

    .line 1077
    check-cast v5, Ljava/lang/String;

    .line 1078
    .line 1079
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 1080
    .line 1081
    .line 1082
    return-void

    .line 1083
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1084
    .line 1085
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1086
    .line 1087
    if-nez p3, :cond_3c

    .line 1088
    .line 1089
    goto :goto_13

    .line 1090
    :cond_3c
    move-object v5, p3

    .line 1091
    check-cast v5, Ljava/lang/String;

    .line 1092
    .line 1093
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    return-void

    .line 1097
    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1098
    .line 1099
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1100
    .line 1101
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1102
    .line 1103
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1104
    .line 1105
    .line 1106
    return-void

    .line 1107
    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1108
    .line 1109
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1110
    .line 1111
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 1112
    .line 1113
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1114
    .line 1115
    .line 1116
    return-void

    .line 1117
    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1118
    .line 1119
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1120
    .line 1121
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 1122
    .line 1123
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 1124
    .line 1125
    .line 1126
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setVerticalAlign(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 1127
    .line 1128
    .line 1129
    return-void

    .line 1130
    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1131
    .line 1132
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1133
    .line 1134
    if-nez p3, :cond_3d

    .line 1135
    .line 1136
    goto :goto_14

    .line 1137
    :cond_3d
    move-object v5, p3

    .line 1138
    check-cast v5, Ljava/lang/String;

    .line 1139
    .line 1140
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setAlignmentBaseline(Landroid/view/View;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1145
    .line 1146
    if-nez p3, :cond_3e

    .line 1147
    .line 1148
    goto :goto_15

    .line 1149
    :cond_3e
    check-cast p3, Ljava/lang/Double;

    .line 1150
    .line 1151
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 1152
    .line 1153
    .line 1154
    move-result v4

    .line 1155
    :goto_15
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 1156
    .line 1157
    .line 1158
    return-void

    .line 1159
    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1160
    .line 1161
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1162
    .line 1163
    if-nez p3, :cond_3f

    .line 1164
    .line 1165
    goto :goto_16

    .line 1166
    :cond_3f
    move-object v5, p3

    .line 1167
    check-cast v5, Ljava/lang/String;

    .line 1168
    .line 1169
    :goto_16
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 1170
    .line 1171
    .line 1172
    return-void

    .line 1173
    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1174
    .line 1175
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;

    .line 1176
    .line 1177
    if-nez p3, :cond_40

    .line 1178
    .line 1179
    goto :goto_17

    .line 1180
    :cond_40
    move-object v5, p3

    .line 1181
    check-cast v5, Ljava/lang/String;

    .line 1182
    .line 1183
    :goto_17
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGTSpanManagerInterface;->setLengthAdjust(Landroid/view/View;Ljava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    return-void

    .line 1187
    :sswitch_data_0
    .sparse-switch
        -0x5f8de5eb -> :sswitch_29
        -0x4bf73488 -> :sswitch_28
        -0x4b8807f5 -> :sswitch_27
        -0x45d9a6b8 -> :sswitch_26
        -0x43f186d1 -> :sswitch_25
        -0x4072683f -> :sswitch_24
        -0x3b3da15f -> :sswitch_23
        -0x37a9a5bf -> :sswitch_22
        -0x37a98852 -> :sswitch_21
        -0x372522a5 -> :sswitch_20
        -0x352a89c8 -> :sswitch_1f
        -0x2bc67c59 -> :sswitch_1e
        -0x2b7578e1 -> :sswitch_1d
        -0x18d3d54d -> :sswitch_1c
        -0x117e564a -> :sswitch_1b
        -0x3330ef8 -> :sswitch_1a
        -0x2a83503 -> :sswitch_19
        0x78 -> :sswitch_18
        0x79 -> :sswitch_17
        0xc94 -> :sswitch_16
        0xc95 -> :sswitch_15
        0x2ff583 -> :sswitch_14
        0x300c4f -> :sswitch_13
        0x3306ec -> :sswitch_12
        0x337a8b -> :sswitch_11
        0x4b3162e -> :sswitch_10
        0x5a72f63 -> :sswitch_f
        0x63a48b4 -> :sswitch_e
        0xcf0d448 -> :sswitch_d
        0x1071b93d -> :sswitch_c
        0x15caa0f0 -> :sswitch_b
        0x17f096af -> :sswitch_a
        0x2e60023a -> :sswitch_9
        0x36b25395 -> :sswitch_8
        0x36b3866c -> :sswitch_7
        0x38b73479 -> :sswitch_6
        0x3d3f8e06 -> :sswitch_5
        0x619a1673 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
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
    :pswitch_data_0
    .packed-switch 0x0
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
