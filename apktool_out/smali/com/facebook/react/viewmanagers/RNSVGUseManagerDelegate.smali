.class public Lcom/facebook/react/viewmanagers/RNSVGUseManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface<",
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
    const/16 v3, 0x1f

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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

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
    const/16 v3, 0x18

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
    const/16 v3, 0x17

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
    const/16 v3, 0x16

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
    const/16 v3, 0x15

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
    const/16 v3, 0x14

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
    const/16 v3, 0x13

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
    const/16 v3, 0x12

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
    const/16 v3, 0x11

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "href"

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
    const/16 v3, 0x10

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "fill"

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
    const/16 v3, 0xf

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "y"

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
    const/16 v3, 0xe

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "x"

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
    const/16 v3, 0xd

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xc

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xb

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xa

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x9

    .line 335
    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :sswitch_17
    const-string v0, "fillRule"

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
    const/16 v3, 0x8

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :sswitch_18
    const-string v0, "stroke"

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
    goto :goto_0

    .line 361
    :cond_18
    const/4 v3, 0x7

    .line 362
    goto :goto_0

    .line 363
    :sswitch_19
    const-string v0, "markerMid"

    .line 364
    .line 365
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-nez v0, :cond_19

    .line 370
    .line 371
    goto :goto_0

    .line 372
    :cond_19
    const/4 v3, 0x6

    .line 373
    goto :goto_0

    .line 374
    :sswitch_1a
    const-string v0, "markerEnd"

    .line 375
    .line 376
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-nez v0, :cond_1a

    .line 381
    .line 382
    goto :goto_0

    .line 383
    :cond_1a
    const/4 v3, 0x5

    .line 384
    goto :goto_0

    .line 385
    :sswitch_1b
    const-string v0, "propList"

    .line 386
    .line 387
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-nez v0, :cond_1b

    .line 392
    .line 393
    goto :goto_0

    .line 394
    :cond_1b
    const/4 v3, 0x4

    .line 395
    goto :goto_0

    .line 396
    :sswitch_1c
    const-string v0, "matrix"

    .line 397
    .line 398
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-nez v0, :cond_1c

    .line 403
    .line 404
    goto :goto_0

    .line 405
    :cond_1c
    const/4 v3, 0x3

    .line 406
    goto :goto_0

    .line 407
    :sswitch_1d
    const-string v0, "height"

    .line 408
    .line 409
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-nez v0, :cond_1d

    .line 414
    .line 415
    goto :goto_0

    .line 416
    :cond_1d
    const/4 v3, 0x2

    .line 417
    goto :goto_0

    .line 418
    :sswitch_1e
    const-string v0, "opacity"

    .line 419
    .line 420
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-nez v0, :cond_1e

    .line 425
    .line 426
    goto :goto_0

    .line 427
    :cond_1e
    move v3, v1

    .line 428
    goto :goto_0

    .line 429
    :sswitch_1f
    const-string v0, "filter"

    .line 430
    .line 431
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-nez v0, :cond_1f

    .line 436
    .line 437
    goto :goto_0

    .line 438
    :cond_1f
    move v3, v2

    .line 439
    :goto_0
    const/4 v0, 0x0

    .line 440
    const/high16 v4, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/4 v5, 0x0

    .line 443
    packed-switch v3, :pswitch_data_0

    .line 444
    .line 445
    .line 446
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 451
    .line 452
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 453
    .line 454
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 455
    .line 456
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 460
    .line 461
    .line 462
    return-void

    .line 463
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 464
    .line 465
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 466
    .line 467
    if-nez p3, :cond_20

    .line 468
    .line 469
    goto :goto_1

    .line 470
    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    .line 471
    .line 472
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 481
    .line 482
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 483
    .line 484
    if-nez p3, :cond_21

    .line 485
    .line 486
    goto :goto_2

    .line 487
    :cond_21
    check-cast p3, Ljava/lang/Double;

    .line 488
    .line 489
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 498
    .line 499
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 500
    .line 501
    if-nez p3, :cond_22

    .line 502
    .line 503
    goto :goto_3

    .line 504
    :cond_22
    move-object v5, p3

    .line 505
    check-cast v5, Ljava/lang/String;

    .line 506
    .line 507
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 512
    .line 513
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 514
    .line 515
    if-nez p3, :cond_23

    .line 516
    .line 517
    goto :goto_4

    .line 518
    :cond_23
    check-cast p3, Ljava/lang/Double;

    .line 519
    .line 520
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 529
    .line 530
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 531
    .line 532
    if-nez p3, :cond_24

    .line 533
    .line 534
    goto :goto_5

    .line 535
    :cond_24
    check-cast p3, Ljava/lang/Double;

    .line 536
    .line 537
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 546
    .line 547
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 548
    .line 549
    if-nez p3, :cond_25

    .line 550
    .line 551
    goto :goto_6

    .line 552
    :cond_25
    move-object v5, p3

    .line 553
    check-cast v5, Ljava/lang/String;

    .line 554
    .line 555
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 560
    .line 561
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 562
    .line 563
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 564
    .line 565
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 573
    .line 574
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 575
    .line 576
    if-nez p3, :cond_26

    .line 577
    .line 578
    goto :goto_7

    .line 579
    :cond_26
    move-object v5, p3

    .line 580
    check-cast v5, Ljava/lang/String;

    .line 581
    .line 582
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 587
    .line 588
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 589
    .line 590
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 591
    .line 592
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 600
    .line 601
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 602
    .line 603
    if-nez p3, :cond_27

    .line 604
    .line 605
    goto :goto_8

    .line 606
    :cond_27
    check-cast p3, Ljava/lang/Double;

    .line 607
    .line 608
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 613
    .line 614
    .line 615
    return-void

    .line 616
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 617
    .line 618
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 619
    .line 620
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object p3

    .line 628
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 629
    .line 630
    .line 631
    return-void

    .line 632
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 633
    .line 634
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 635
    .line 636
    if-nez p3, :cond_28

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_28
    check-cast p3, Ljava/lang/Double;

    .line 640
    .line 641
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 646
    .line 647
    .line 648
    return-void

    .line 649
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 650
    .line 651
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 652
    .line 653
    if-nez p3, :cond_29

    .line 654
    .line 655
    goto :goto_a

    .line 656
    :cond_29
    move-object v5, p3

    .line 657
    check-cast v5, Ljava/lang/String;

    .line 658
    .line 659
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    return-void

    .line 663
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 664
    .line 665
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 666
    .line 667
    if-nez p3, :cond_2a

    .line 668
    .line 669
    goto :goto_b

    .line 670
    :cond_2a
    move-object v5, p3

    .line 671
    check-cast v5, Ljava/lang/String;

    .line 672
    .line 673
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 678
    .line 679
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 680
    .line 681
    if-nez p3, :cond_2b

    .line 682
    .line 683
    goto :goto_c

    .line 684
    :cond_2b
    move-object v5, p3

    .line 685
    check-cast v5, Ljava/lang/String;

    .line 686
    .line 687
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setHref(Landroid/view/View;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    return-void

    .line 691
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 692
    .line 693
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 694
    .line 695
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 696
    .line 697
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 701
    .line 702
    .line 703
    return-void

    .line 704
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 705
    .line 706
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 707
    .line 708
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 709
    .line 710
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 714
    .line 715
    .line 716
    return-void

    .line 717
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 718
    .line 719
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 720
    .line 721
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 722
    .line 723
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 731
    .line 732
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 733
    .line 734
    if-nez p3, :cond_2c

    .line 735
    .line 736
    goto :goto_d

    .line 737
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 738
    .line 739
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    :goto_d
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 744
    .line 745
    .line 746
    return-void

    .line 747
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 748
    .line 749
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 750
    .line 751
    if-nez p3, :cond_2d

    .line 752
    .line 753
    goto :goto_e

    .line 754
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 755
    .line 756
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 757
    .line 758
    .line 759
    move-result v4

    .line 760
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 761
    .line 762
    .line 763
    return-void

    .line 764
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 765
    .line 766
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 767
    .line 768
    if-nez p3, :cond_2e

    .line 769
    .line 770
    goto :goto_f

    .line 771
    :cond_2e
    move-object v5, p3

    .line 772
    check-cast v5, Ljava/lang/String;

    .line 773
    .line 774
    :goto_f
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    return-void

    .line 778
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 779
    .line 780
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 781
    .line 782
    if-nez p3, :cond_2f

    .line 783
    .line 784
    goto :goto_10

    .line 785
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 786
    .line 787
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    :goto_10
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 792
    .line 793
    .line 794
    return-void

    .line 795
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 796
    .line 797
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 798
    .line 799
    if-nez p3, :cond_30

    .line 800
    .line 801
    goto :goto_11

    .line 802
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 803
    .line 804
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    :goto_11
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 809
    .line 810
    .line 811
    return-void

    .line 812
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 813
    .line 814
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 815
    .line 816
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 817
    .line 818
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 819
    .line 820
    .line 821
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 822
    .line 823
    .line 824
    return-void

    .line 825
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 826
    .line 827
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 828
    .line 829
    if-nez p3, :cond_31

    .line 830
    .line 831
    goto :goto_12

    .line 832
    :cond_31
    move-object v5, p3

    .line 833
    check-cast v5, Ljava/lang/String;

    .line 834
    .line 835
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    return-void

    .line 839
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 840
    .line 841
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 842
    .line 843
    if-nez p3, :cond_32

    .line 844
    .line 845
    goto :goto_13

    .line 846
    :cond_32
    move-object v5, p3

    .line 847
    check-cast v5, Ljava/lang/String;

    .line 848
    .line 849
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    return-void

    .line 853
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 854
    .line 855
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 856
    .line 857
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 858
    .line 859
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 860
    .line 861
    .line 862
    return-void

    .line 863
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 864
    .line 865
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 866
    .line 867
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 868
    .line 869
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 870
    .line 871
    .line 872
    return-void

    .line 873
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 874
    .line 875
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 876
    .line 877
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 878
    .line 879
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 883
    .line 884
    .line 885
    return-void

    .line 886
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 887
    .line 888
    if-nez p3, :cond_33

    .line 889
    .line 890
    goto :goto_14

    .line 891
    :cond_33
    check-cast p3, Ljava/lang/Double;

    .line 892
    .line 893
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 894
    .line 895
    .line 896
    move-result v4

    .line 897
    :goto_14
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 898
    .line 899
    .line 900
    return-void

    .line 901
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 902
    .line 903
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;

    .line 904
    .line 905
    if-nez p3, :cond_34

    .line 906
    .line 907
    goto :goto_15

    .line 908
    :cond_34
    move-object v5, p3

    .line 909
    check-cast v5, Ljava/lang/String;

    .line 910
    .line 911
    :goto_15
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGUseManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    return-void

    .line 915
    :sswitch_data_0
    .sparse-switch
        -0x4bf73488 -> :sswitch_1f
        -0x4b8807f5 -> :sswitch_1e
        -0x48c76ed9 -> :sswitch_1d
        -0x4072683f -> :sswitch_1c
        -0x3b3da15f -> :sswitch_1b
        -0x37a9a5bf -> :sswitch_1a
        -0x37a98852 -> :sswitch_19
        -0x352a89c8 -> :sswitch_18
        -0x2b7578e1 -> :sswitch_17
        -0x18d3d54d -> :sswitch_16
        -0x117e564a -> :sswitch_15
        -0x3330ef8 -> :sswitch_14
        -0x2a83503 -> :sswitch_13
        0x78 -> :sswitch_12
        0x79 -> :sswitch_11
        0x2ff583 -> :sswitch_10
        0x30ff2b -> :sswitch_f
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

    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
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
    :pswitch_data_0
    .packed-switch 0x0
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
