.class public Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface<",
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
    const/16 v3, 0x1e

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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

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
    const/16 v3, 0x18

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
    const/16 v3, 0x17

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
    const/16 v3, 0x16

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "vectorEffect"

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
    const/16 v3, 0x15

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "color"

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
    const/16 v3, 0x14

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "strokeMiterlimit"

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
    const/16 v3, 0x13

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "name"

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
    const/16 v3, 0x12

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "mask"

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
    const/16 v3, 0x11

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "fill"

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
    const/16 v3, 0x10

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "ry"

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
    const/16 v3, 0xf

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "rx"

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
    const/16 v3, 0xe

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "cy"

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
    const/16 v3, 0xd

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "cx"

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
    const/16 v3, 0xc

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
    const/16 v3, 0xb

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
    const/16 v3, 0xa

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
    const/16 v3, 0x9

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
    const/16 v3, 0x8

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
    goto :goto_0

    .line 347
    :cond_17
    const/4 v3, 0x7

    .line 348
    goto :goto_0

    .line 349
    :sswitch_18
    const-string v0, "stroke"

    .line 350
    .line 351
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    if-nez v0, :cond_18

    .line 356
    .line 357
    goto :goto_0

    .line 358
    :cond_18
    const/4 v3, 0x6

    .line 359
    goto :goto_0

    .line 360
    :sswitch_19
    const-string v0, "markerMid"

    .line 361
    .line 362
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-nez v0, :cond_19

    .line 367
    .line 368
    goto :goto_0

    .line 369
    :cond_19
    const/4 v3, 0x5

    .line 370
    goto :goto_0

    .line 371
    :sswitch_1a
    const-string v0, "markerEnd"

    .line 372
    .line 373
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-nez v0, :cond_1a

    .line 378
    .line 379
    goto :goto_0

    .line 380
    :cond_1a
    const/4 v3, 0x4

    .line 381
    goto :goto_0

    .line 382
    :sswitch_1b
    const-string v0, "propList"

    .line 383
    .line 384
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-nez v0, :cond_1b

    .line 389
    .line 390
    goto :goto_0

    .line 391
    :cond_1b
    const/4 v3, 0x3

    .line 392
    goto :goto_0

    .line 393
    :sswitch_1c
    const-string v0, "matrix"

    .line 394
    .line 395
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-nez v0, :cond_1c

    .line 400
    .line 401
    goto :goto_0

    .line 402
    :cond_1c
    const/4 v3, 0x2

    .line 403
    goto :goto_0

    .line 404
    :sswitch_1d
    const-string v0, "opacity"

    .line 405
    .line 406
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-nez v0, :cond_1d

    .line 411
    .line 412
    goto :goto_0

    .line 413
    :cond_1d
    move v3, v1

    .line 414
    goto :goto_0

    .line 415
    :sswitch_1e
    const-string v0, "filter"

    .line 416
    .line 417
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-nez v0, :cond_1e

    .line 422
    .line 423
    goto :goto_0

    .line 424
    :cond_1e
    move v3, v2

    .line 425
    :goto_0
    const/4 v0, 0x0

    .line 426
    const/high16 v4, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v5, 0x0

    .line 429
    packed-switch v3, :pswitch_data_0

    .line 430
    .line 431
    .line 432
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    return-void

    .line 436
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 437
    .line 438
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 439
    .line 440
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 441
    .line 442
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 450
    .line 451
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 452
    .line 453
    if-nez p3, :cond_1f

    .line 454
    .line 455
    goto :goto_1

    .line 456
    :cond_1f
    check-cast p3, Ljava/lang/Boolean;

    .line 457
    .line 458
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 467
    .line 468
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 469
    .line 470
    if-nez p3, :cond_20

    .line 471
    .line 472
    goto :goto_2

    .line 473
    :cond_20
    check-cast p3, Ljava/lang/Double;

    .line 474
    .line 475
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 484
    .line 485
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 486
    .line 487
    if-nez p3, :cond_21

    .line 488
    .line 489
    goto :goto_3

    .line 490
    :cond_21
    move-object v5, p3

    .line 491
    check-cast v5, Ljava/lang/String;

    .line 492
    .line 493
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 498
    .line 499
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 500
    .line 501
    if-nez p3, :cond_22

    .line 502
    .line 503
    goto :goto_4

    .line 504
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 505
    .line 506
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 515
    .line 516
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 517
    .line 518
    if-nez p3, :cond_23

    .line 519
    .line 520
    goto :goto_5

    .line 521
    :cond_23
    check-cast p3, Ljava/lang/Double;

    .line 522
    .line 523
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 532
    .line 533
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 534
    .line 535
    if-nez p3, :cond_24

    .line 536
    .line 537
    goto :goto_6

    .line 538
    :cond_24
    move-object v5, p3

    .line 539
    check-cast v5, Ljava/lang/String;

    .line 540
    .line 541
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 546
    .line 547
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 548
    .line 549
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 550
    .line 551
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 559
    .line 560
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 561
    .line 562
    if-nez p3, :cond_25

    .line 563
    .line 564
    goto :goto_7

    .line 565
    :cond_25
    move-object v5, p3

    .line 566
    check-cast v5, Ljava/lang/String;

    .line 567
    .line 568
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 573
    .line 574
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 575
    .line 576
    if-nez p3, :cond_26

    .line 577
    .line 578
    goto :goto_8

    .line 579
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 580
    .line 581
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 590
    .line 591
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 592
    .line 593
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object p3

    .line 601
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 602
    .line 603
    .line 604
    return-void

    .line 605
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 606
    .line 607
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 608
    .line 609
    if-nez p3, :cond_27

    .line 610
    .line 611
    goto :goto_9

    .line 612
    :cond_27
    check-cast p3, Ljava/lang/Double;

    .line 613
    .line 614
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 619
    .line 620
    .line 621
    return-void

    .line 622
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 623
    .line 624
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 625
    .line 626
    if-nez p3, :cond_28

    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_28
    move-object v5, p3

    .line 630
    check-cast v5, Ljava/lang/String;

    .line 631
    .line 632
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    return-void

    .line 636
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 637
    .line 638
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 639
    .line 640
    if-nez p3, :cond_29

    .line 641
    .line 642
    goto :goto_b

    .line 643
    :cond_29
    move-object v5, p3

    .line 644
    check-cast v5, Ljava/lang/String;

    .line 645
    .line 646
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 651
    .line 652
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 653
    .line 654
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 655
    .line 656
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 660
    .line 661
    .line 662
    return-void

    .line 663
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 664
    .line 665
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 666
    .line 667
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 668
    .line 669
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setRy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 673
    .line 674
    .line 675
    return-void

    .line 676
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 677
    .line 678
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 679
    .line 680
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 681
    .line 682
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setRx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 686
    .line 687
    .line 688
    return-void

    .line 689
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 690
    .line 691
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 692
    .line 693
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 694
    .line 695
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setCy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 699
    .line 700
    .line 701
    return-void

    .line 702
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 703
    .line 704
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 705
    .line 706
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 707
    .line 708
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setCx(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 712
    .line 713
    .line 714
    return-void

    .line 715
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 716
    .line 717
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 718
    .line 719
    if-nez p3, :cond_2a

    .line 720
    .line 721
    goto :goto_c

    .line 722
    :cond_2a
    check-cast p3, Ljava/lang/Double;

    .line 723
    .line 724
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 725
    .line 726
    .line 727
    move-result v0

    .line 728
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 729
    .line 730
    .line 731
    return-void

    .line 732
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 733
    .line 734
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 735
    .line 736
    if-nez p3, :cond_2b

    .line 737
    .line 738
    goto :goto_d

    .line 739
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 740
    .line 741
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 746
    .line 747
    .line 748
    return-void

    .line 749
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 750
    .line 751
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 752
    .line 753
    if-nez p3, :cond_2c

    .line 754
    .line 755
    goto :goto_e

    .line 756
    :cond_2c
    move-object v5, p3

    .line 757
    check-cast v5, Ljava/lang/String;

    .line 758
    .line 759
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    return-void

    .line 763
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 764
    .line 765
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 766
    .line 767
    if-nez p3, :cond_2d

    .line 768
    .line 769
    goto :goto_f

    .line 770
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 771
    .line 772
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 777
    .line 778
    .line 779
    return-void

    .line 780
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 781
    .line 782
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 783
    .line 784
    if-nez p3, :cond_2e

    .line 785
    .line 786
    goto :goto_10

    .line 787
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 788
    .line 789
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 790
    .line 791
    .line 792
    move-result v1

    .line 793
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 798
    .line 799
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 800
    .line 801
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 802
    .line 803
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 807
    .line 808
    .line 809
    return-void

    .line 810
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 811
    .line 812
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 813
    .line 814
    if-nez p3, :cond_2f

    .line 815
    .line 816
    goto :goto_11

    .line 817
    :cond_2f
    move-object v5, p3

    .line 818
    check-cast v5, Ljava/lang/String;

    .line 819
    .line 820
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    return-void

    .line 824
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 825
    .line 826
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 827
    .line 828
    if-nez p3, :cond_30

    .line 829
    .line 830
    goto :goto_12

    .line 831
    :cond_30
    move-object v5, p3

    .line 832
    check-cast v5, Ljava/lang/String;

    .line 833
    .line 834
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    return-void

    .line 838
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 839
    .line 840
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 841
    .line 842
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 843
    .line 844
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 845
    .line 846
    .line 847
    return-void

    .line 848
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 849
    .line 850
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 851
    .line 852
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 853
    .line 854
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 859
    .line 860
    if-nez p3, :cond_31

    .line 861
    .line 862
    goto :goto_13

    .line 863
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 864
    .line 865
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    :goto_13
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 870
    .line 871
    .line 872
    return-void

    .line 873
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 874
    .line 875
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;

    .line 876
    .line 877
    if-nez p3, :cond_32

    .line 878
    .line 879
    goto :goto_14

    .line 880
    :cond_32
    move-object v5, p3

    .line 881
    check-cast v5, Ljava/lang/String;

    .line 882
    .line 883
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGEllipseManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    return-void

    .line 887
    :sswitch_data_0
    .sparse-switch
        -0x4bf73488 -> :sswitch_1e
        -0x4b8807f5 -> :sswitch_1d
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
        0xc75 -> :sswitch_12
        0xc76 -> :sswitch_11
        0xe46 -> :sswitch_10
        0xe47 -> :sswitch_f
        0x2ff583 -> :sswitch_e
        0x3306ec -> :sswitch_d
        0x337a8b -> :sswitch_c
        0x4b3162e -> :sswitch_b
        0x5a72f63 -> :sswitch_a
        0x63a48b4 -> :sswitch_9
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

    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
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
    :pswitch_data_0
    .packed-switch 0x0
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
