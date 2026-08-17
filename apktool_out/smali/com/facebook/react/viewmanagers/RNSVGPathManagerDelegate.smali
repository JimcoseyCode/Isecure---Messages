.class public Lcom/facebook/react/viewmanagers/RNSVGPathManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface<",
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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

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
    const/16 v3, 0x18

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
    const/16 v3, 0x17

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
    const/16 v3, 0x16

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
    const/16 v3, 0x15

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
    const/16 v3, 0x14

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
    const/16 v3, 0x13

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
    const/16 v3, 0x12

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
    const/16 v3, 0x11

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
    const/16 v3, 0x10

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
    const/16 v3, 0xf

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
    const/16 v3, 0xe

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
    const/16 v3, 0xd

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "d"

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
    const/16 v3, 0xc

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xb

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xa

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "pointerEvents"

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
    const/16 v3, 0x9

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x8

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "fillRule"

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
    goto :goto_0

    .line 305
    :cond_14
    const/4 v3, 0x7

    .line 306
    goto :goto_0

    .line 307
    :sswitch_15
    const-string v0, "stroke"

    .line 308
    .line 309
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_15

    .line 314
    .line 315
    goto :goto_0

    .line 316
    :cond_15
    const/4 v3, 0x6

    .line 317
    goto :goto_0

    .line 318
    :sswitch_16
    const-string v0, "markerMid"

    .line 319
    .line 320
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_16

    .line 325
    .line 326
    goto :goto_0

    .line 327
    :cond_16
    const/4 v3, 0x5

    .line 328
    goto :goto_0

    .line 329
    :sswitch_17
    const-string v0, "markerEnd"

    .line 330
    .line 331
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-nez v0, :cond_17

    .line 336
    .line 337
    goto :goto_0

    .line 338
    :cond_17
    const/4 v3, 0x4

    .line 339
    goto :goto_0

    .line 340
    :sswitch_18
    const-string v0, "propList"

    .line 341
    .line 342
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-nez v0, :cond_18

    .line 347
    .line 348
    goto :goto_0

    .line 349
    :cond_18
    const/4 v3, 0x3

    .line 350
    goto :goto_0

    .line 351
    :sswitch_19
    const-string v0, "matrix"

    .line 352
    .line 353
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-nez v0, :cond_19

    .line 358
    .line 359
    goto :goto_0

    .line 360
    :cond_19
    const/4 v3, 0x2

    .line 361
    goto :goto_0

    .line 362
    :sswitch_1a
    const-string v0, "opacity"

    .line 363
    .line 364
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_1a

    .line 369
    .line 370
    goto :goto_0

    .line 371
    :cond_1a
    move v3, v1

    .line 372
    goto :goto_0

    .line 373
    :sswitch_1b
    const-string v0, "filter"

    .line 374
    .line 375
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-nez v0, :cond_1b

    .line 380
    .line 381
    goto :goto_0

    .line 382
    :cond_1b
    move v3, v2

    .line 383
    :goto_0
    const/4 v0, 0x0

    .line 384
    const/high16 v4, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/4 v5, 0x0

    .line 387
    packed-switch v3, :pswitch_data_0

    .line 388
    .line 389
    .line 390
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 395
    .line 396
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 397
    .line 398
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 399
    .line 400
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 408
    .line 409
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 410
    .line 411
    if-nez p3, :cond_1c

    .line 412
    .line 413
    goto :goto_1

    .line 414
    :cond_1c
    check-cast p3, Ljava/lang/Boolean;

    .line 415
    .line 416
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 425
    .line 426
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 427
    .line 428
    if-nez p3, :cond_1d

    .line 429
    .line 430
    goto :goto_2

    .line 431
    :cond_1d
    check-cast p3, Ljava/lang/Double;

    .line 432
    .line 433
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 442
    .line 443
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 444
    .line 445
    if-nez p3, :cond_1e

    .line 446
    .line 447
    goto :goto_3

    .line 448
    :cond_1e
    move-object v5, p3

    .line 449
    check-cast v5, Ljava/lang/String;

    .line 450
    .line 451
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 456
    .line 457
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 458
    .line 459
    if-nez p3, :cond_1f

    .line 460
    .line 461
    goto :goto_4

    .line 462
    :cond_1f
    check-cast p3, Ljava/lang/Double;

    .line 463
    .line 464
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 473
    .line 474
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 475
    .line 476
    if-nez p3, :cond_20

    .line 477
    .line 478
    goto :goto_5

    .line 479
    :cond_20
    check-cast p3, Ljava/lang/Double;

    .line 480
    .line 481
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 490
    .line 491
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 492
    .line 493
    if-nez p3, :cond_21

    .line 494
    .line 495
    goto :goto_6

    .line 496
    :cond_21
    move-object v5, p3

    .line 497
    check-cast v5, Ljava/lang/String;

    .line 498
    .line 499
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 504
    .line 505
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 506
    .line 507
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 508
    .line 509
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 517
    .line 518
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 519
    .line 520
    if-nez p3, :cond_22

    .line 521
    .line 522
    goto :goto_7

    .line 523
    :cond_22
    move-object v5, p3

    .line 524
    check-cast v5, Ljava/lang/String;

    .line 525
    .line 526
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    return-void

    .line 530
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 531
    .line 532
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 533
    .line 534
    if-nez p3, :cond_23

    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_23
    check-cast p3, Ljava/lang/Double;

    .line 538
    .line 539
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 548
    .line 549
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 550
    .line 551
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object p3

    .line 559
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 564
    .line 565
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 566
    .line 567
    if-nez p3, :cond_24

    .line 568
    .line 569
    goto :goto_9

    .line 570
    :cond_24
    check-cast p3, Ljava/lang/Double;

    .line 571
    .line 572
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 577
    .line 578
    .line 579
    return-void

    .line 580
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 581
    .line 582
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 583
    .line 584
    if-nez p3, :cond_25

    .line 585
    .line 586
    goto :goto_a

    .line 587
    :cond_25
    move-object v5, p3

    .line 588
    check-cast v5, Ljava/lang/String;

    .line 589
    .line 590
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 595
    .line 596
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 597
    .line 598
    if-nez p3, :cond_26

    .line 599
    .line 600
    goto :goto_b

    .line 601
    :cond_26
    move-object v5, p3

    .line 602
    check-cast v5, Ljava/lang/String;

    .line 603
    .line 604
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    return-void

    .line 608
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 609
    .line 610
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 611
    .line 612
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 613
    .line 614
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 618
    .line 619
    .line 620
    return-void

    .line 621
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 622
    .line 623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 624
    .line 625
    if-nez p3, :cond_27

    .line 626
    .line 627
    goto :goto_c

    .line 628
    :cond_27
    move-object v5, p3

    .line 629
    check-cast v5, Ljava/lang/String;

    .line 630
    .line 631
    :goto_c
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setD(Landroid/view/View;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 636
    .line 637
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 638
    .line 639
    if-nez p3, :cond_28

    .line 640
    .line 641
    goto :goto_d

    .line 642
    :cond_28
    check-cast p3, Ljava/lang/Double;

    .line 643
    .line 644
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    :goto_d
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 649
    .line 650
    .line 651
    return-void

    .line 652
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 653
    .line 654
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 655
    .line 656
    if-nez p3, :cond_29

    .line 657
    .line 658
    goto :goto_e

    .line 659
    :cond_29
    check-cast p3, Ljava/lang/Double;

    .line 660
    .line 661
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 662
    .line 663
    .line 664
    move-result v4

    .line 665
    :goto_e
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 666
    .line 667
    .line 668
    return-void

    .line 669
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 670
    .line 671
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 672
    .line 673
    if-nez p3, :cond_2a

    .line 674
    .line 675
    goto :goto_f

    .line 676
    :cond_2a
    move-object v5, p3

    .line 677
    check-cast v5, Ljava/lang/String;

    .line 678
    .line 679
    :goto_f
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    return-void

    .line 683
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 684
    .line 685
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 686
    .line 687
    if-nez p3, :cond_2b

    .line 688
    .line 689
    goto :goto_10

    .line 690
    :cond_2b
    check-cast p3, Ljava/lang/Double;

    .line 691
    .line 692
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 693
    .line 694
    .line 695
    move-result v4

    .line 696
    :goto_10
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 697
    .line 698
    .line 699
    return-void

    .line 700
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 701
    .line 702
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 703
    .line 704
    if-nez p3, :cond_2c

    .line 705
    .line 706
    goto :goto_11

    .line 707
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 708
    .line 709
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    :goto_11
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 714
    .line 715
    .line 716
    return-void

    .line 717
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 718
    .line 719
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 720
    .line 721
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 722
    .line 723
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 731
    .line 732
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 733
    .line 734
    if-nez p3, :cond_2d

    .line 735
    .line 736
    goto :goto_12

    .line 737
    :cond_2d
    move-object v5, p3

    .line 738
    check-cast v5, Ljava/lang/String;

    .line 739
    .line 740
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    return-void

    .line 744
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 745
    .line 746
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 747
    .line 748
    if-nez p3, :cond_2e

    .line 749
    .line 750
    goto :goto_13

    .line 751
    :cond_2e
    move-object v5, p3

    .line 752
    check-cast v5, Ljava/lang/String;

    .line 753
    .line 754
    :goto_13
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    return-void

    .line 758
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 759
    .line 760
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 761
    .line 762
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 763
    .line 764
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 765
    .line 766
    .line 767
    return-void

    .line 768
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 769
    .line 770
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 771
    .line 772
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 773
    .line 774
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 775
    .line 776
    .line 777
    return-void

    .line 778
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 779
    .line 780
    if-nez p3, :cond_2f

    .line 781
    .line 782
    goto :goto_14

    .line 783
    :cond_2f
    check-cast p3, Ljava/lang/Double;

    .line 784
    .line 785
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    :goto_14
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 790
    .line 791
    .line 792
    return-void

    .line 793
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 794
    .line 795
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;

    .line 796
    .line 797
    if-nez p3, :cond_30

    .line 798
    .line 799
    goto :goto_15

    .line 800
    :cond_30
    move-object v5, p3

    .line 801
    check-cast v5, Ljava/lang/String;

    .line 802
    .line 803
    :goto_15
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGPathManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    return-void

    .line 807
    :sswitch_data_0
    .sparse-switch
        -0x4bf73488 -> :sswitch_1b
        -0x4b8807f5 -> :sswitch_1a
        -0x4072683f -> :sswitch_19
        -0x3b3da15f -> :sswitch_18
        -0x37a9a5bf -> :sswitch_17
        -0x37a98852 -> :sswitch_16
        -0x352a89c8 -> :sswitch_15
        -0x2b7578e1 -> :sswitch_14
        -0x18d3d54d -> :sswitch_13
        -0x117e564a -> :sswitch_12
        -0x3330ef8 -> :sswitch_11
        -0x2a83503 -> :sswitch_10
        0x64 -> :sswitch_f
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

    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
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
    :pswitch_data_0
    .packed-switch 0x0
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
