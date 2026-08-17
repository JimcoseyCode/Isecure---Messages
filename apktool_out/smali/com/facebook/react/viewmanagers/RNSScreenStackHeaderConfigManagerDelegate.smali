.class public Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface<",
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
    .locals 4
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
    const-string v0, "topInsetEnabled"

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
    const-string v0, "largeTitle"

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
    const-string v0, "largeTitleHideShadow"

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
    const-string v0, "titleFontSize"

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
    const-string v0, "backTitle"

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
    const-string v0, "backgroundColor"

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
    const-string v0, "headerLeftBarButtonItems"

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
    const-string v0, "hideBackButton"

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
    const-string v0, "headerRightBarButtonItems"

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
    const-string v0, "largeTitleFontWeight"

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
    const-string v0, "hideShadow"

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
    const-string v0, "backTitleFontFamily"

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
    const-string v0, "backTitleFontSize"

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
    const-string v0, "title"

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
    const-string v0, "color"

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
    const-string v0, "largeTitleFontFamily"

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
    const-string v0, "backButtonInCustomView"

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
    const-string v0, "largeTitleBackgroundColor"

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
    const-string v0, "direction"

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
    const-string v0, "backTitleVisible"

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
    const-string v0, "backButtonDisplayMode"

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
    const-string v0, "largeTitleFontSize"

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
    const-string v0, "hidden"

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
    const-string v0, "titleFontWeight"

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
    const-string v0, "disableBackButtonMenu"

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
    const-string v0, "titleFontFamily"

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
    const-string v0, "largeTitleColor"

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
    const-string v0, "blurEffect"

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
    const-string v0, "titleColor"

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
    const-string v0, "translucent"

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
    const-string v0, "userInterfaceStyle"

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
    const-string v0, "synchronousShadowStateUpdatesEnabled"

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
    packed-switch v3, :pswitch_data_0

    .line 441
    .line 442
    .line 443
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 448
    .line 449
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 450
    .line 451
    if-nez p3, :cond_20

    .line 452
    .line 453
    goto :goto_1

    .line 454
    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    .line 455
    .line 456
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    :goto_1
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTopInsetEnabled(Landroid/view/View;Z)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 465
    .line 466
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 467
    .line 468
    if-nez p3, :cond_21

    .line 469
    .line 470
    goto :goto_2

    .line 471
    :cond_21
    check-cast p3, Ljava/lang/Boolean;

    .line 472
    .line 473
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    :goto_2
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitle(Landroid/view/View;Z)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 482
    .line 483
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 484
    .line 485
    if-nez p3, :cond_22

    .line 486
    .line 487
    goto :goto_3

    .line 488
    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    .line 489
    .line 490
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    :goto_3
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleHideShadow(Landroid/view/View;Z)V

    .line 495
    .line 496
    .line 497
    return-void

    .line 498
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 499
    .line 500
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 501
    .line 502
    if-nez p3, :cond_23

    .line 503
    .line 504
    goto :goto_4

    .line 505
    :cond_23
    check-cast p3, Ljava/lang/Double;

    .line 506
    .line 507
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontSize(Landroid/view/View;I)V

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 516
    .line 517
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 518
    .line 519
    if-nez p3, :cond_24

    .line 520
    .line 521
    goto :goto_5

    .line 522
    :cond_24
    move-object v0, p3

    .line 523
    check-cast v0, Ljava/lang/String;

    .line 524
    .line 525
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitle(Landroid/view/View;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 530
    .line 531
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 532
    .line 533
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 538
    .line 539
    .line 540
    move-result-object p3

    .line 541
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 546
    .line 547
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 548
    .line 549
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 550
    .line 551
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHeaderLeftBarButtonItems(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 552
    .line 553
    .line 554
    return-void

    .line 555
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 556
    .line 557
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 558
    .line 559
    if-nez p3, :cond_25

    .line 560
    .line 561
    goto :goto_6

    .line 562
    :cond_25
    check-cast p3, Ljava/lang/Boolean;

    .line 563
    .line 564
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHideBackButton(Landroid/view/View;Z)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 573
    .line 574
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 575
    .line 576
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 577
    .line 578
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHeaderRightBarButtonItems(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 579
    .line 580
    .line 581
    return-void

    .line 582
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 583
    .line 584
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 585
    .line 586
    if-nez p3, :cond_26

    .line 587
    .line 588
    goto :goto_7

    .line 589
    :cond_26
    move-object v0, p3

    .line 590
    check-cast v0, Ljava/lang/String;

    .line 591
    .line 592
    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    return-void

    .line 596
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 597
    .line 598
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 599
    .line 600
    if-nez p3, :cond_27

    .line 601
    .line 602
    goto :goto_8

    .line 603
    :cond_27
    check-cast p3, Ljava/lang/Boolean;

    .line 604
    .line 605
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHideShadow(Landroid/view/View;Z)V

    .line 610
    .line 611
    .line 612
    return-void

    .line 613
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 614
    .line 615
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 616
    .line 617
    if-nez p3, :cond_28

    .line 618
    .line 619
    goto :goto_9

    .line 620
    :cond_28
    move-object v0, p3

    .line 621
    check-cast v0, Ljava/lang/String;

    .line 622
    .line 623
    :goto_9
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    return-void

    .line 627
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 628
    .line 629
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 630
    .line 631
    if-nez p3, :cond_29

    .line 632
    .line 633
    goto :goto_a

    .line 634
    :cond_29
    check-cast p3, Ljava/lang/Double;

    .line 635
    .line 636
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    :goto_a
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitleFontSize(Landroid/view/View;I)V

    .line 641
    .line 642
    .line 643
    return-void

    .line 644
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 645
    .line 646
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 647
    .line 648
    if-nez p3, :cond_2a

    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_2a
    move-object v0, p3

    .line 652
    check-cast v0, Ljava/lang/String;

    .line 653
    .line 654
    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitle(Landroid/view/View;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 659
    .line 660
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 661
    .line 662
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 667
    .line 668
    .line 669
    move-result-object p3

    .line 670
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 671
    .line 672
    .line 673
    return-void

    .line 674
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 675
    .line 676
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 677
    .line 678
    if-nez p3, :cond_2b

    .line 679
    .line 680
    goto :goto_c

    .line 681
    :cond_2b
    move-object v0, p3

    .line 682
    check-cast v0, Ljava/lang/String;

    .line 683
    .line 684
    :goto_c
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    return-void

    .line 688
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 689
    .line 690
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 691
    .line 692
    if-nez p3, :cond_2c

    .line 693
    .line 694
    goto :goto_d

    .line 695
    :cond_2c
    check-cast p3, Ljava/lang/Boolean;

    .line 696
    .line 697
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 698
    .line 699
    .line 700
    move-result v2

    .line 701
    :goto_d
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackButtonInCustomView(Landroid/view/View;Z)V

    .line 702
    .line 703
    .line 704
    return-void

    .line 705
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 706
    .line 707
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 708
    .line 709
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 714
    .line 715
    .line 716
    move-result-object p3

    .line 717
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 718
    .line 719
    .line 720
    return-void

    .line 721
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 722
    .line 723
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 724
    .line 725
    check-cast p3, Ljava/lang/String;

    .line 726
    .line 727
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setDirection(Landroid/view/View;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    return-void

    .line 731
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 732
    .line 733
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 734
    .line 735
    if-nez p3, :cond_2d

    .line 736
    .line 737
    goto :goto_e

    .line 738
    :cond_2d
    check-cast p3, Ljava/lang/Boolean;

    .line 739
    .line 740
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackTitleVisible(Landroid/view/View;Z)V

    .line 745
    .line 746
    .line 747
    return-void

    .line 748
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 749
    .line 750
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 751
    .line 752
    check-cast p3, Ljava/lang/String;

    .line 753
    .line 754
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBackButtonDisplayMode(Landroid/view/View;Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    return-void

    .line 758
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 759
    .line 760
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 761
    .line 762
    if-nez p3, :cond_2e

    .line 763
    .line 764
    goto :goto_f

    .line 765
    :cond_2e
    check-cast p3, Ljava/lang/Double;

    .line 766
    .line 767
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    :goto_f
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleFontSize(Landroid/view/View;I)V

    .line 772
    .line 773
    .line 774
    return-void

    .line 775
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 776
    .line 777
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 778
    .line 779
    if-nez p3, :cond_2f

    .line 780
    .line 781
    goto :goto_10

    .line 782
    :cond_2f
    check-cast p3, Ljava/lang/Boolean;

    .line 783
    .line 784
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    :goto_10
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setHidden(Landroid/view/View;Z)V

    .line 789
    .line 790
    .line 791
    return-void

    .line 792
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 793
    .line 794
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 795
    .line 796
    if-nez p3, :cond_30

    .line 797
    .line 798
    goto :goto_11

    .line 799
    :cond_30
    move-object v0, p3

    .line 800
    check-cast v0, Ljava/lang/String;

    .line 801
    .line 802
    :goto_11
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    return-void

    .line 806
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 807
    .line 808
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 809
    .line 810
    if-nez p3, :cond_31

    .line 811
    .line 812
    goto :goto_12

    .line 813
    :cond_31
    check-cast p3, Ljava/lang/Boolean;

    .line 814
    .line 815
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    :goto_12
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setDisableBackButtonMenu(Landroid/view/View;Z)V

    .line 820
    .line 821
    .line 822
    return-void

    .line 823
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 824
    .line 825
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 826
    .line 827
    if-nez p3, :cond_32

    .line 828
    .line 829
    goto :goto_13

    .line 830
    :cond_32
    move-object v0, p3

    .line 831
    check-cast v0, Ljava/lang/String;

    .line 832
    .line 833
    :goto_13
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    return-void

    .line 837
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 838
    .line 839
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 840
    .line 841
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 846
    .line 847
    .line 848
    move-result-object p3

    .line 849
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setLargeTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 850
    .line 851
    .line 852
    return-void

    .line 853
    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 854
    .line 855
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 856
    .line 857
    check-cast p3, Ljava/lang/String;

    .line 858
    .line 859
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setBlurEffect(Landroid/view/View;Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    return-void

    .line 863
    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 864
    .line 865
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 866
    .line 867
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 872
    .line 873
    .line 874
    move-result-object p3

    .line 875
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 876
    .line 877
    .line 878
    return-void

    .line 879
    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 880
    .line 881
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 882
    .line 883
    if-nez p3, :cond_33

    .line 884
    .line 885
    goto :goto_14

    .line 886
    :cond_33
    check-cast p3, Ljava/lang/Boolean;

    .line 887
    .line 888
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    :goto_14
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setTranslucent(Landroid/view/View;Z)V

    .line 893
    .line 894
    .line 895
    return-void

    .line 896
    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 897
    .line 898
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 899
    .line 900
    check-cast p3, Ljava/lang/String;

    .line 901
    .line 902
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setUserInterfaceStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    return-void

    .line 906
    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 907
    .line 908
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;

    .line 909
    .line 910
    if-nez p3, :cond_34

    .line 911
    .line 912
    goto :goto_15

    .line 913
    :cond_34
    check-cast p3, Ljava/lang/Boolean;

    .line 914
    .line 915
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 916
    .line 917
    .line 918
    move-result v2

    .line 919
    :goto_15
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;->setSynchronousShadowStateUpdatesEnabled(Landroid/view/View;Z)V

    .line 920
    .line 921
    .line 922
    return-void

    .line 923
    :sswitch_data_0
    .sparse-switch
        -0x7955e281 -> :sswitch_1f
        -0x6d092b5d -> :sswitch_1e
        -0x6ca400a7 -> :sswitch_1d
        -0x6b402c15 -> :sswitch_1c
        -0x6b085328 -> :sswitch_1b
        -0x69c7227a -> :sswitch_1a
        -0x663e72f5 -> :sswitch_19
        -0x59a25300 -> :sswitch_18
        -0x49058be1 -> :sswitch_17
        -0x48916256 -> :sswitch_16
        -0x413de413 -> :sswitch_15
        -0x41273734 -> :sswitch_14
        -0x3f5e367f -> :sswitch_13
        -0x395ff881 -> :sswitch_12
        -0x17336ac8 -> :sswitch_11
        -0x85931ac -> :sswitch_10
        0x54c50 -> :sswitch_f
        0x5a72f63 -> :sswitch_e
        0x6942258 -> :sswitch_d
        0xaf5e9c1 -> :sswitch_c
        0xe7cf524 -> :sswitch_b
        0x143bc902 -> :sswitch_a
        0x1d3e3364 -> :sswitch_9
        0x3862d70a -> :sswitch_8
        0x3dea1ddb -> :sswitch_7
        0x4a7abaef -> :sswitch_6
        0x4cb7f6d5 -> :sswitch_5
        0x4ef525b1 -> :sswitch_4
        0x5a7d4f68 -> :sswitch_3
        0x5d4078bf -> :sswitch_2
        0x78fc43dd -> :sswitch_1
        0x7d247559 -> :sswitch_0
    .end sparse-switch

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
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
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
