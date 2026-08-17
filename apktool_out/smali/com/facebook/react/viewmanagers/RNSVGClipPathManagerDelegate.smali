.class public Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface<",
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
    const/16 v3, 0x1d

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
    const/16 v3, 0x1c

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
    const/16 v3, 0x1b

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
    const/16 v3, 0x1a

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
    const/16 v3, 0x19

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
    const/16 v3, 0x18

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
    const/16 v3, 0x17

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
    const/16 v3, 0x16

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "fontSize"

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
    const/16 v3, 0x15

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
    const/16 v3, 0x14

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
    const/16 v3, 0x13

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
    const/16 v3, 0x12

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
    const/16 v3, 0x11

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
    const/16 v3, 0x10

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
    const/16 v3, 0xf

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "font"

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
    const/16 v3, 0xe

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
    const/16 v3, 0xd

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "strokeDashoffset"

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
    const/16 v3, 0xc

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "fillOpacity"

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
    const/16 v3, 0xb

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "pointerEvents"

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
    const/16 v3, 0xa

    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :sswitch_14
    const-string v0, "strokeOpacity"

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
    const/16 v3, 0x9

    .line 307
    .line 308
    goto/16 :goto_0

    .line 309
    .line 310
    :sswitch_15
    const-string v0, "fillRule"

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
    const/16 v3, 0x8

    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :sswitch_16
    const-string v0, "fontWeight"

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
    goto :goto_0

    .line 333
    :cond_16
    const/4 v3, 0x7

    .line 334
    goto :goto_0

    .line 335
    :sswitch_17
    const-string v0, "stroke"

    .line 336
    .line 337
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-nez v0, :cond_17

    .line 342
    .line 343
    goto :goto_0

    .line 344
    :cond_17
    const/4 v3, 0x6

    .line 345
    goto :goto_0

    .line 346
    :sswitch_18
    const-string v0, "markerMid"

    .line 347
    .line 348
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-nez v0, :cond_18

    .line 353
    .line 354
    goto :goto_0

    .line 355
    :cond_18
    const/4 v3, 0x5

    .line 356
    goto :goto_0

    .line 357
    :sswitch_19
    const-string v0, "markerEnd"

    .line 358
    .line 359
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-nez v0, :cond_19

    .line 364
    .line 365
    goto :goto_0

    .line 366
    :cond_19
    const/4 v3, 0x4

    .line 367
    goto :goto_0

    .line 368
    :sswitch_1a
    const-string v0, "propList"

    .line 369
    .line 370
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-nez v0, :cond_1a

    .line 375
    .line 376
    goto :goto_0

    .line 377
    :cond_1a
    const/4 v3, 0x3

    .line 378
    goto :goto_0

    .line 379
    :sswitch_1b
    const-string v0, "matrix"

    .line 380
    .line 381
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_1b

    .line 386
    .line 387
    goto :goto_0

    .line 388
    :cond_1b
    const/4 v3, 0x2

    .line 389
    goto :goto_0

    .line 390
    :sswitch_1c
    const-string v0, "opacity"

    .line 391
    .line 392
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-nez v0, :cond_1c

    .line 397
    .line 398
    goto :goto_0

    .line 399
    :cond_1c
    move v3, v1

    .line 400
    goto :goto_0

    .line 401
    :sswitch_1d
    const-string v0, "filter"

    .line 402
    .line 403
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    if-nez v0, :cond_1d

    .line 408
    .line 409
    goto :goto_0

    .line 410
    :cond_1d
    move v3, v2

    .line 411
    :goto_0
    const/4 v0, 0x0

    .line 412
    const/high16 v4, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/4 v5, 0x0

    .line 415
    packed-switch v3, :pswitch_data_0

    .line 416
    .line 417
    .line 418
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 423
    .line 424
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 425
    .line 426
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 427
    .line 428
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStrokeWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 436
    .line 437
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 438
    .line 439
    if-nez p3, :cond_1e

    .line 440
    .line 441
    goto :goto_1

    .line 442
    :cond_1e
    check-cast p3, Ljava/lang/Boolean;

    .line 443
    .line 444
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setResponsible(Landroid/view/View;Z)V

    .line 449
    .line 450
    .line 451
    return-void

    .line 452
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 453
    .line 454
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 455
    .line 456
    if-nez p3, :cond_1f

    .line 457
    .line 458
    goto :goto_2

    .line 459
    :cond_1f
    check-cast p3, Ljava/lang/Double;

    .line 460
    .line 461
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStrokeLinejoin(Landroid/view/View;I)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 470
    .line 471
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 472
    .line 473
    if-nez p3, :cond_20

    .line 474
    .line 475
    goto :goto_3

    .line 476
    :cond_20
    move-object v5, p3

    .line 477
    check-cast v5, Ljava/lang/String;

    .line 478
    .line 479
    :goto_3
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 484
    .line 485
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 486
    .line 487
    if-nez p3, :cond_21

    .line 488
    .line 489
    goto :goto_4

    .line 490
    :cond_21
    check-cast p3, Ljava/lang/Double;

    .line 491
    .line 492
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStrokeLinecap(Landroid/view/View;I)V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 501
    .line 502
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 503
    .line 504
    if-nez p3, :cond_22

    .line 505
    .line 506
    goto :goto_5

    .line 507
    :cond_22
    check-cast p3, Ljava/lang/Double;

    .line 508
    .line 509
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    :goto_5
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setClipRule(Landroid/view/View;I)V

    .line 514
    .line 515
    .line 516
    return-void

    .line 517
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 518
    .line 519
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 520
    .line 521
    if-nez p3, :cond_23

    .line 522
    .line 523
    goto :goto_6

    .line 524
    :cond_23
    move-object v5, p3

    .line 525
    check-cast v5, Ljava/lang/String;

    .line 526
    .line 527
    :goto_6
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 532
    .line 533
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 534
    .line 535
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 536
    .line 537
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStrokeDasharray(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 541
    .line 542
    .line 543
    return-void

    .line 544
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 545
    .line 546
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 547
    .line 548
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 549
    .line 550
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setFontSize(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 558
    .line 559
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 560
    .line 561
    if-nez p3, :cond_24

    .line 562
    .line 563
    goto :goto_7

    .line 564
    :cond_24
    move-object v5, p3

    .line 565
    check-cast v5, Ljava/lang/String;

    .line 566
    .line 567
    :goto_7
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 572
    .line 573
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 574
    .line 575
    if-nez p3, :cond_25

    .line 576
    .line 577
    goto :goto_8

    .line 578
    :cond_25
    check-cast p3, Ljava/lang/Double;

    .line 579
    .line 580
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setVectorEffect(Landroid/view/View;I)V

    .line 585
    .line 586
    .line 587
    return-void

    .line 588
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 589
    .line 590
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 591
    .line 592
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 597
    .line 598
    .line 599
    move-result-object p3

    .line 600
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 605
    .line 606
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 607
    .line 608
    if-nez p3, :cond_26

    .line 609
    .line 610
    goto :goto_9

    .line 611
    :cond_26
    check-cast p3, Ljava/lang/Double;

    .line 612
    .line 613
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStrokeMiterlimit(Landroid/view/View;F)V

    .line 618
    .line 619
    .line 620
    return-void

    .line 621
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 622
    .line 623
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 624
    .line 625
    if-nez p3, :cond_27

    .line 626
    .line 627
    goto :goto_a

    .line 628
    :cond_27
    move-object v5, p3

    .line 629
    check-cast v5, Ljava/lang/String;

    .line 630
    .line 631
    :goto_a
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setName(Landroid/view/View;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 636
    .line 637
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 638
    .line 639
    if-nez p3, :cond_28

    .line 640
    .line 641
    goto :goto_b

    .line 642
    :cond_28
    move-object v5, p3

    .line 643
    check-cast v5, Ljava/lang/String;

    .line 644
    .line 645
    :goto_b
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setMask(Landroid/view/View;Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    return-void

    .line 649
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 650
    .line 651
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 652
    .line 653
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 654
    .line 655
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setFont(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 659
    .line 660
    .line 661
    return-void

    .line 662
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 663
    .line 664
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 665
    .line 666
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 667
    .line 668
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setFill(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 676
    .line 677
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 678
    .line 679
    if-nez p3, :cond_29

    .line 680
    .line 681
    goto :goto_c

    .line 682
    :cond_29
    check-cast p3, Ljava/lang/Double;

    .line 683
    .line 684
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 685
    .line 686
    .line 687
    move-result v0

    .line 688
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStrokeDashoffset(Landroid/view/View;F)V

    .line 689
    .line 690
    .line 691
    return-void

    .line 692
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 693
    .line 694
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 695
    .line 696
    if-nez p3, :cond_2a

    .line 697
    .line 698
    goto :goto_d

    .line 699
    :cond_2a
    check-cast p3, Ljava/lang/Double;

    .line 700
    .line 701
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    :goto_d
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setFillOpacity(Landroid/view/View;F)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 710
    .line 711
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 712
    .line 713
    if-nez p3, :cond_2b

    .line 714
    .line 715
    goto :goto_e

    .line 716
    :cond_2b
    move-object v5, p3

    .line 717
    check-cast v5, Ljava/lang/String;

    .line 718
    .line 719
    :goto_e
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    return-void

    .line 723
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 724
    .line 725
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 726
    .line 727
    if-nez p3, :cond_2c

    .line 728
    .line 729
    goto :goto_f

    .line 730
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 731
    .line 732
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    :goto_f
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStrokeOpacity(Landroid/view/View;F)V

    .line 737
    .line 738
    .line 739
    return-void

    .line 740
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 741
    .line 742
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 743
    .line 744
    if-nez p3, :cond_2d

    .line 745
    .line 746
    goto :goto_10

    .line 747
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 748
    .line 749
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    :goto_10
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setFillRule(Landroid/view/View;I)V

    .line 754
    .line 755
    .line 756
    return-void

    .line 757
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 758
    .line 759
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 760
    .line 761
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 762
    .line 763
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setFontWeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 767
    .line 768
    .line 769
    return-void

    .line 770
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 771
    .line 772
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 773
    .line 774
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 775
    .line 776
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setStroke(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 780
    .line 781
    .line 782
    return-void

    .line 783
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 784
    .line 785
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 786
    .line 787
    if-nez p3, :cond_2e

    .line 788
    .line 789
    goto :goto_11

    .line 790
    :cond_2e
    move-object v5, p3

    .line 791
    check-cast v5, Ljava/lang/String;

    .line 792
    .line 793
    :goto_11
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 798
    .line 799
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 800
    .line 801
    if-nez p3, :cond_2f

    .line 802
    .line 803
    goto :goto_12

    .line 804
    :cond_2f
    move-object v5, p3

    .line 805
    check-cast v5, Ljava/lang/String;

    .line 806
    .line 807
    :goto_12
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    return-void

    .line 811
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 812
    .line 813
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 814
    .line 815
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 816
    .line 817
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setPropList(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 818
    .line 819
    .line 820
    return-void

    .line 821
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 822
    .line 823
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 824
    .line 825
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 826
    .line 827
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 828
    .line 829
    .line 830
    return-void

    .line 831
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 832
    .line 833
    if-nez p3, :cond_30

    .line 834
    .line 835
    goto :goto_13

    .line 836
    :cond_30
    check-cast p3, Ljava/lang/Double;

    .line 837
    .line 838
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 839
    .line 840
    .line 841
    move-result v4

    .line 842
    :goto_13
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 843
    .line 844
    .line 845
    return-void

    .line 846
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 847
    .line 848
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;

    .line 849
    .line 850
    if-nez p3, :cond_31

    .line 851
    .line 852
    goto :goto_14

    .line 853
    :cond_31
    move-object v5, p3

    .line 854
    check-cast v5, Ljava/lang/String;

    .line 855
    .line 856
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSVGClipPathManagerInterface;->setFilter(Landroid/view/View;Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    return-void

    .line 860
    nop

    .line 861
    :sswitch_data_0
    .sparse-switch
        -0x4bf73488 -> :sswitch_1d
        -0x4b8807f5 -> :sswitch_1c
        -0x4072683f -> :sswitch_1b
        -0x3b3da15f -> :sswitch_1a
        -0x37a9a5bf -> :sswitch_19
        -0x37a98852 -> :sswitch_18
        -0x352a89c8 -> :sswitch_17
        -0x2bc67c59 -> :sswitch_16
        -0x2b7578e1 -> :sswitch_15
        -0x18d3d54d -> :sswitch_14
        -0x117e564a -> :sswitch_13
        -0x3330ef8 -> :sswitch_12
        -0x2a83503 -> :sswitch_11
        0x2ff583 -> :sswitch_10
        0x300c4f -> :sswitch_f
        0x3306ec -> :sswitch_e
        0x337a8b -> :sswitch_d
        0x4b3162e -> :sswitch_c
        0x5a72f63 -> :sswitch_b
        0x63a48b4 -> :sswitch_a
        0xcf0d448 -> :sswitch_9
        0x15caa0f0 -> :sswitch_8
        0x17f096af -> :sswitch_7
        0x36b25395 -> :sswitch_6
        0x36b3866c -> :sswitch_5
        0x3d3f8e06 -> :sswitch_4
        0x63a518c2 -> :sswitch_3
        0x6ab59576 -> :sswitch_2
        0x6e2146f6 -> :sswitch_1
        0x72aeea6e -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
