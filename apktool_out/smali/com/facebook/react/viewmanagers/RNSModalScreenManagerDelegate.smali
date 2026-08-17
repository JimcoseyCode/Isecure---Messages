.class public Lcom/facebook/react/viewmanagers/RNSModalScreenManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface<",
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
    .locals 7
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
    const/16 v1, 0x18

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, -0x1

    .line 13
    sparse-switch v0, :sswitch_data_0

    .line 14
    .line 15
    .line 16
    :goto_0
    move v0, v4

    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :sswitch_0
    const-string v0, "sheetExpandsWhenScrolledToEdge"

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v0, 0x22

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :sswitch_1
    const-string v0, "nativeBackButtonDismissalEnabled"

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/16 v0, 0x21

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :sswitch_2
    const-string v0, "statusBarAnimation"

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/16 v0, 0x20

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "sheetGrabberVisible"

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
    goto :goto_0

    .line 67
    :cond_3
    const/16 v0, 0x1f

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :sswitch_4
    const-string v0, "sheetDefaultResizeAnimationEnabled"

    .line 72
    .line 73
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_4

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    const/16 v0, 0x1e

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :sswitch_5
    const-string v0, "sheetElevation"

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    const/16 v0, 0x1d

    .line 94
    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :sswitch_6
    const-string v0, "navigationBarTranslucent"

    .line 98
    .line 99
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_6

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_6
    const/16 v0, 0x1c

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :sswitch_7
    const-string v0, "customAnimationOnSwipe"

    .line 111
    .line 112
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_7

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    const/16 v0, 0x1b

    .line 120
    .line 121
    goto/16 :goto_1

    .line 122
    .line 123
    :sswitch_8
    const-string v0, "swipeDirection"

    .line 124
    .line 125
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_8

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_8
    const/16 v0, 0x1a

    .line 133
    .line 134
    goto/16 :goto_1

    .line 135
    .line 136
    :sswitch_9
    const-string v0, "sheetShouldOverflowTopInset"

    .line 137
    .line 138
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_9

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_9
    const/16 v0, 0x19

    .line 147
    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :sswitch_a
    const-string v0, "transitionDuration"

    .line 151
    .line 152
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_a

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_a
    move v0, v1

    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :sswitch_b
    const-string v0, "sheetLargestUndimmedDetent"

    .line 164
    .line 165
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-nez v0, :cond_b

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_b
    const/16 v0, 0x17

    .line 174
    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :sswitch_c
    const-string v0, "screenOrientation"

    .line 178
    .line 179
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_c

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_c
    const/16 v0, 0x16

    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :sswitch_d
    const-string v0, "gestureResponseDistance"

    .line 192
    .line 193
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-nez v0, :cond_d

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_d
    const/16 v0, 0x15

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :sswitch_e
    const-string v0, "fullScreenSwipeEnabled"

    .line 206
    .line 207
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-nez v0, :cond_e

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_e
    const/16 v0, 0x14

    .line 216
    .line 217
    goto/16 :goto_1

    .line 218
    .line 219
    :sswitch_f
    const-string v0, "statusBarHidden"

    .line 220
    .line 221
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_f

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_f
    const/16 v0, 0x13

    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :sswitch_10
    const-string v0, "preventNativeDismiss"

    .line 234
    .line 235
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-nez v0, :cond_10

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_10
    const/16 v0, 0x12

    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :sswitch_11
    const-string v0, "replaceAnimation"

    .line 248
    .line 249
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-nez v0, :cond_11

    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_11
    const/16 v0, 0x11

    .line 258
    .line 259
    goto/16 :goto_1

    .line 260
    .line 261
    :sswitch_12
    const-string v0, "sheetAllowedDetents"

    .line 262
    .line 263
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_12

    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_12
    const/16 v0, 0x10

    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :sswitch_13
    const-string v0, "sheetInitialDetent"

    .line 276
    .line 277
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-nez v0, :cond_13

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_13
    const/16 v0, 0xf

    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :sswitch_14
    const-string v0, "screenId"

    .line 290
    .line 291
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_14

    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_14
    const/16 v0, 0xe

    .line 300
    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :sswitch_15
    const-string v0, "navigationBarColor"

    .line 304
    .line 305
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-nez v0, :cond_15

    .line 310
    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_15
    const/16 v0, 0xd

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :sswitch_16
    const-string v0, "stackAnimation"

    .line 318
    .line 319
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-nez v0, :cond_16

    .line 324
    .line 325
    goto/16 :goto_0

    .line 326
    .line 327
    :cond_16
    const/16 v0, 0xc

    .line 328
    .line 329
    goto/16 :goto_1

    .line 330
    .line 331
    :sswitch_17
    const-string v0, "fullScreenSwipeShadowEnabled"

    .line 332
    .line 333
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-nez v0, :cond_17

    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_17
    const/16 v0, 0xb

    .line 342
    .line 343
    goto/16 :goto_1

    .line 344
    .line 345
    :sswitch_18
    const-string v0, "statusBarStyle"

    .line 346
    .line 347
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-nez v0, :cond_18

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_18
    const/16 v0, 0xa

    .line 356
    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :sswitch_19
    const-string v0, "statusBarColor"

    .line 360
    .line 361
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-nez v0, :cond_19

    .line 366
    .line 367
    goto/16 :goto_0

    .line 368
    .line 369
    :cond_19
    const/16 v0, 0x9

    .line 370
    .line 371
    goto/16 :goto_1

    .line 372
    .line 373
    :sswitch_1a
    const-string v0, "activityState"

    .line 374
    .line 375
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-nez v0, :cond_1a

    .line 380
    .line 381
    goto/16 :goto_0

    .line 382
    .line 383
    :cond_1a
    const/16 v0, 0x8

    .line 384
    .line 385
    goto/16 :goto_1

    .line 386
    .line 387
    :sswitch_1b
    const-string v0, "stackPresentation"

    .line 388
    .line 389
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-nez v0, :cond_1b

    .line 394
    .line 395
    goto/16 :goto_0

    .line 396
    .line 397
    :cond_1b
    const/4 v0, 0x7

    .line 398
    goto :goto_1

    .line 399
    :sswitch_1c
    const-string v0, "statusBarTranslucent"

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
    goto/16 :goto_0

    .line 408
    .line 409
    :cond_1c
    const/4 v0, 0x6

    .line 410
    goto :goto_1

    .line 411
    :sswitch_1d
    const-string v0, "navigationBarHidden"

    .line 412
    .line 413
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-nez v0, :cond_1d

    .line 418
    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_1d
    const/4 v0, 0x5

    .line 422
    goto :goto_1

    .line 423
    :sswitch_1e
    const-string v0, "sheetCornerRadius"

    .line 424
    .line 425
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-nez v0, :cond_1e

    .line 430
    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_1e
    const/4 v0, 0x4

    .line 434
    goto :goto_1

    .line 435
    :sswitch_1f
    const-string v0, "hideKeyboardOnSwipe"

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
    goto/16 :goto_0

    .line 444
    .line 445
    :cond_1f
    const/4 v0, 0x3

    .line 446
    goto :goto_1

    .line 447
    :sswitch_20
    const-string v0, "gestureEnabled"

    .line 448
    .line 449
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-nez v0, :cond_20

    .line 454
    .line 455
    goto/16 :goto_0

    .line 456
    .line 457
    :cond_20
    const/4 v0, 0x2

    .line 458
    goto :goto_1

    .line 459
    :sswitch_21
    const-string v0, "homeIndicatorHidden"

    .line 460
    .line 461
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-nez v0, :cond_21

    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :cond_21
    move v0, v2

    .line 470
    goto :goto_1

    .line 471
    :sswitch_22
    const-string v0, "synchronousShadowStateUpdatesEnabled"

    .line 472
    .line 473
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-nez v0, :cond_22

    .line 478
    .line 479
    goto/16 :goto_0

    .line 480
    .line 481
    :cond_22
    move v0, v3

    .line 482
    :goto_1
    const/high16 v5, -0x40800000    # -1.0f

    .line 483
    .line 484
    const/4 v6, 0x0

    .line 485
    packed-switch v0, :pswitch_data_0

    .line 486
    .line 487
    .line 488
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 493
    .line 494
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 495
    .line 496
    if-nez p3, :cond_23

    .line 497
    .line 498
    goto :goto_2

    .line 499
    :cond_23
    check-cast p3, Ljava/lang/Boolean;

    .line 500
    .line 501
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    :goto_2
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetExpandsWhenScrolledToEdge(Landroid/view/View;Z)V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 510
    .line 511
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 512
    .line 513
    if-nez p3, :cond_24

    .line 514
    .line 515
    goto :goto_3

    .line 516
    :cond_24
    check-cast p3, Ljava/lang/Boolean;

    .line 517
    .line 518
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    :goto_3
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNativeBackButtonDismissalEnabled(Landroid/view/View;Z)V

    .line 523
    .line 524
    .line 525
    return-void

    .line 526
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 527
    .line 528
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 529
    .line 530
    if-nez p3, :cond_25

    .line 531
    .line 532
    goto :goto_4

    .line 533
    :cond_25
    move-object v6, p3

    .line 534
    check-cast v6, Ljava/lang/String;

    .line 535
    .line 536
    :goto_4
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 541
    .line 542
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 543
    .line 544
    if-nez p3, :cond_26

    .line 545
    .line 546
    goto :goto_5

    .line 547
    :cond_26
    check-cast p3, Ljava/lang/Boolean;

    .line 548
    .line 549
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    :goto_5
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetGrabberVisible(Landroid/view/View;Z)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 558
    .line 559
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 560
    .line 561
    if-nez p3, :cond_27

    .line 562
    .line 563
    goto :goto_6

    .line 564
    :cond_27
    check-cast p3, Ljava/lang/Boolean;

    .line 565
    .line 566
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetDefaultResizeAnimationEnabled(Landroid/view/View;Z)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 575
    .line 576
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 577
    .line 578
    if-nez p3, :cond_28

    .line 579
    .line 580
    goto :goto_7

    .line 581
    :cond_28
    check-cast p3, Ljava/lang/Double;

    .line 582
    .line 583
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    :goto_7
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetElevation(Landroid/view/View;I)V

    .line 588
    .line 589
    .line 590
    return-void

    .line 591
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 592
    .line 593
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 594
    .line 595
    if-nez p3, :cond_29

    .line 596
    .line 597
    goto :goto_8

    .line 598
    :cond_29
    check-cast p3, Ljava/lang/Boolean;

    .line 599
    .line 600
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    :goto_8
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNavigationBarTranslucent(Landroid/view/View;Z)V

    .line 605
    .line 606
    .line 607
    return-void

    .line 608
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 609
    .line 610
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 611
    .line 612
    if-nez p3, :cond_2a

    .line 613
    .line 614
    goto :goto_9

    .line 615
    :cond_2a
    check-cast p3, Ljava/lang/Boolean;

    .line 616
    .line 617
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    :goto_9
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setCustomAnimationOnSwipe(Landroid/view/View;Z)V

    .line 622
    .line 623
    .line 624
    return-void

    .line 625
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 626
    .line 627
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 628
    .line 629
    check-cast p3, Ljava/lang/String;

    .line 630
    .line 631
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSwipeDirection(Landroid/view/View;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 636
    .line 637
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 638
    .line 639
    if-nez p3, :cond_2b

    .line 640
    .line 641
    goto :goto_a

    .line 642
    :cond_2b
    check-cast p3, Ljava/lang/Boolean;

    .line 643
    .line 644
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    :goto_a
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetShouldOverflowTopInset(Landroid/view/View;Z)V

    .line 649
    .line 650
    .line 651
    return-void

    .line 652
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 653
    .line 654
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 655
    .line 656
    if-nez p3, :cond_2c

    .line 657
    .line 658
    const/16 p3, 0x1f4

    .line 659
    .line 660
    goto :goto_b

    .line 661
    :cond_2c
    check-cast p3, Ljava/lang/Double;

    .line 662
    .line 663
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 664
    .line 665
    .line 666
    move-result p3

    .line 667
    :goto_b
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setTransitionDuration(Landroid/view/View;I)V

    .line 668
    .line 669
    .line 670
    return-void

    .line 671
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 672
    .line 673
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 674
    .line 675
    if-nez p3, :cond_2d

    .line 676
    .line 677
    goto :goto_c

    .line 678
    :cond_2d
    check-cast p3, Ljava/lang/Double;

    .line 679
    .line 680
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    :goto_c
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetLargestUndimmedDetent(Landroid/view/View;I)V

    .line 685
    .line 686
    .line 687
    return-void

    .line 688
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 689
    .line 690
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 691
    .line 692
    if-nez p3, :cond_2e

    .line 693
    .line 694
    goto :goto_d

    .line 695
    :cond_2e
    move-object v6, p3

    .line 696
    check-cast v6, Ljava/lang/String;

    .line 697
    .line 698
    :goto_d
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setScreenOrientation(Landroid/view/View;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    return-void

    .line 702
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 703
    .line 704
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 705
    .line 706
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 707
    .line 708
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setGestureResponseDistance(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 709
    .line 710
    .line 711
    return-void

    .line 712
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 713
    .line 714
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 715
    .line 716
    check-cast p3, Ljava/lang/String;

    .line 717
    .line 718
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setFullScreenSwipeEnabled(Landroid/view/View;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    return-void

    .line 722
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 723
    .line 724
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 725
    .line 726
    if-nez p3, :cond_2f

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_2f
    check-cast p3, Ljava/lang/Boolean;

    .line 730
    .line 731
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 732
    .line 733
    .line 734
    move-result v3

    .line 735
    :goto_e
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarHidden(Landroid/view/View;Z)V

    .line 736
    .line 737
    .line 738
    return-void

    .line 739
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 740
    .line 741
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 742
    .line 743
    if-nez p3, :cond_30

    .line 744
    .line 745
    goto :goto_f

    .line 746
    :cond_30
    check-cast p3, Ljava/lang/Boolean;

    .line 747
    .line 748
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    :goto_f
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setPreventNativeDismiss(Landroid/view/View;Z)V

    .line 753
    .line 754
    .line 755
    return-void

    .line 756
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 757
    .line 758
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 759
    .line 760
    check-cast p3, Ljava/lang/String;

    .line 761
    .line 762
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setReplaceAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    return-void

    .line 766
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 767
    .line 768
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 769
    .line 770
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 771
    .line 772
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetAllowedDetents(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 773
    .line 774
    .line 775
    return-void

    .line 776
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 777
    .line 778
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 779
    .line 780
    if-nez p3, :cond_31

    .line 781
    .line 782
    goto :goto_10

    .line 783
    :cond_31
    check-cast p3, Ljava/lang/Double;

    .line 784
    .line 785
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    :goto_10
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetInitialDetent(Landroid/view/View;I)V

    .line 790
    .line 791
    .line 792
    return-void

    .line 793
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 794
    .line 795
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 796
    .line 797
    if-nez p3, :cond_32

    .line 798
    .line 799
    const-string p3, ""

    .line 800
    .line 801
    goto :goto_11

    .line 802
    :cond_32
    check-cast p3, Ljava/lang/String;

    .line 803
    .line 804
    :goto_11
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setScreenId(Landroid/view/View;Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    return-void

    .line 808
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 809
    .line 810
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 811
    .line 812
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 817
    .line 818
    .line 819
    move-result-object p3

    .line 820
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNavigationBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 821
    .line 822
    .line 823
    return-void

    .line 824
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 825
    .line 826
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 827
    .line 828
    check-cast p3, Ljava/lang/String;

    .line 829
    .line 830
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStackAnimation(Landroid/view/View;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    return-void

    .line 834
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 835
    .line 836
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 837
    .line 838
    if-nez p3, :cond_33

    .line 839
    .line 840
    goto :goto_12

    .line 841
    :cond_33
    check-cast p3, Ljava/lang/Boolean;

    .line 842
    .line 843
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    :goto_12
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setFullScreenSwipeShadowEnabled(Landroid/view/View;Z)V

    .line 848
    .line 849
    .line 850
    return-void

    .line 851
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 852
    .line 853
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 854
    .line 855
    if-nez p3, :cond_34

    .line 856
    .line 857
    goto :goto_13

    .line 858
    :cond_34
    move-object v6, p3

    .line 859
    check-cast v6, Ljava/lang/String;

    .line 860
    .line 861
    :goto_13
    invoke-interface {p2, p1, v6}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    return-void

    .line 865
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 866
    .line 867
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 868
    .line 869
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 874
    .line 875
    .line 876
    move-result-object p3

    .line 877
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 878
    .line 879
    .line 880
    return-void

    .line 881
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 882
    .line 883
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 884
    .line 885
    if-nez p3, :cond_35

    .line 886
    .line 887
    goto :goto_14

    .line 888
    :cond_35
    check-cast p3, Ljava/lang/Double;

    .line 889
    .line 890
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 891
    .line 892
    .line 893
    move-result v5

    .line 894
    :goto_14
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setActivityState(Landroid/view/View;F)V

    .line 895
    .line 896
    .line 897
    return-void

    .line 898
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 899
    .line 900
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 901
    .line 902
    check-cast p3, Ljava/lang/String;

    .line 903
    .line 904
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStackPresentation(Landroid/view/View;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    return-void

    .line 908
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 909
    .line 910
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 911
    .line 912
    if-nez p3, :cond_36

    .line 913
    .line 914
    goto :goto_15

    .line 915
    :cond_36
    check-cast p3, Ljava/lang/Boolean;

    .line 916
    .line 917
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    :goto_15
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setStatusBarTranslucent(Landroid/view/View;Z)V

    .line 922
    .line 923
    .line 924
    return-void

    .line 925
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 926
    .line 927
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 928
    .line 929
    if-nez p3, :cond_37

    .line 930
    .line 931
    goto :goto_16

    .line 932
    :cond_37
    check-cast p3, Ljava/lang/Boolean;

    .line 933
    .line 934
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    :goto_16
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setNavigationBarHidden(Landroid/view/View;Z)V

    .line 939
    .line 940
    .line 941
    return-void

    .line 942
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 943
    .line 944
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 945
    .line 946
    if-nez p3, :cond_38

    .line 947
    .line 948
    goto :goto_17

    .line 949
    :cond_38
    check-cast p3, Ljava/lang/Double;

    .line 950
    .line 951
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 952
    .line 953
    .line 954
    move-result v5

    .line 955
    :goto_17
    invoke-interface {p2, p1, v5}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSheetCornerRadius(Landroid/view/View;F)V

    .line 956
    .line 957
    .line 958
    return-void

    .line 959
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 960
    .line 961
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 962
    .line 963
    if-nez p3, :cond_39

    .line 964
    .line 965
    goto :goto_18

    .line 966
    :cond_39
    check-cast p3, Ljava/lang/Boolean;

    .line 967
    .line 968
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 969
    .line 970
    .line 971
    move-result v3

    .line 972
    :goto_18
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setHideKeyboardOnSwipe(Landroid/view/View;Z)V

    .line 973
    .line 974
    .line 975
    return-void

    .line 976
    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 977
    .line 978
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 979
    .line 980
    if-nez p3, :cond_3a

    .line 981
    .line 982
    goto :goto_19

    .line 983
    :cond_3a
    check-cast p3, Ljava/lang/Boolean;

    .line 984
    .line 985
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 986
    .line 987
    .line 988
    move-result v2

    .line 989
    :goto_19
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setGestureEnabled(Landroid/view/View;Z)V

    .line 990
    .line 991
    .line 992
    return-void

    .line 993
    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 994
    .line 995
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 996
    .line 997
    if-nez p3, :cond_3b

    .line 998
    .line 999
    goto :goto_1a

    .line 1000
    :cond_3b
    check-cast p3, Ljava/lang/Boolean;

    .line 1001
    .line 1002
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v3

    .line 1006
    :goto_1a
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setHomeIndicatorHidden(Landroid/view/View;Z)V

    .line 1007
    .line 1008
    .line 1009
    return-void

    .line 1010
    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1011
    .line 1012
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;

    .line 1013
    .line 1014
    if-nez p3, :cond_3c

    .line 1015
    .line 1016
    goto :goto_1b

    .line 1017
    :cond_3c
    check-cast p3, Ljava/lang/Boolean;

    .line 1018
    .line 1019
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    :goto_1b
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/viewmanagers/RNSModalScreenManagerInterface;->setSynchronousShadowStateUpdatesEnabled(Landroid/view/View;Z)V

    .line 1024
    .line 1025
    .line 1026
    return-void

    .line 1027
    :sswitch_data_0
    .sparse-switch
        -0x7955e281 -> :sswitch_22
        -0x737a3646 -> :sswitch_21
        -0x6e7b0e48 -> :sswitch_20
        -0x675c3aee -> :sswitch_1f
        -0x506a6dba -> :sswitch_1e
        -0x4ecd6817 -> :sswitch_1d
        -0x44e94228 -> :sswitch_1c
        -0x4496763e -> :sswitch_1b
        -0x3e6b8d3e -> :sswitch_1a
        -0x3a0986de -> :sswitch_19
        -0x39259890 -> :sswitch_18
        -0x38c1d7de -> :sswitch_17
        -0x226f2e24 -> :sswitch_16
        -0x1b948ebc -> :sswitch_15
        -0x1888a159 -> :sswitch_14
        -0x16be52c3 -> :sswitch_13
        -0x1056680e -> :sswitch_12
        -0xf53acd0 -> :sswitch_11
        -0x9ea6485 -> :sswitch_10
        0x1088bcb -> :sswitch_f
        0x7befa22 -> :sswitch_e
        0xb3022bf -> :sswitch_d
        0xd90a1c4 -> :sswitch_c
        0xe6b0c52 -> :sswitch_b
        0x1955fa09 -> :sswitch_a
        0x2741eefc -> :sswitch_9
        0x40806965 -> :sswitch_8
        0x42362208 -> :sswitch_7
        0x4285947a -> :sswitch_6
        0x4ba38bbe -> :sswitch_5
        0x4cb89273 -> :sswitch_4
        0x50f08f6e -> :sswitch_3
        0x52b16dc3 -> :sswitch_2
        0x670fd7dc -> :sswitch_1
        0x7d048c58 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
