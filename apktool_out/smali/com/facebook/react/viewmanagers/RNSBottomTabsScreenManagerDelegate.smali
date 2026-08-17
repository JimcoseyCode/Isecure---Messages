.class public Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface<",
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
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

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
    const-string v0, "imageIconResource"

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
    const/16 v3, 0x1a

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "selectedIconResourceName"

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
    const/16 v3, 0x19

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "tabBarItemBadgeTextColor"

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
    const/16 v3, 0x18

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "tabBarItemTestID"

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
    const/16 v3, 0x17

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "tabBarItemBadgeBackgroundColor"

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
    const/16 v3, 0x16

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "badgeValue"

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
    const/16 v3, 0x15

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "selectedIconImageSource"

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
    const/16 v3, 0x14

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "systemItem"

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
    const/16 v3, 0x13

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "title"

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
    const/16 v3, 0x12

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "standardAppearance"

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
    const/16 v3, 0x11

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "drawableIconResourceName"

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
    const/16 v3, 0x10

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "scrollEdgeAppearance"

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
    const/16 v3, 0xf

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "tabBarItemAccessibilityLabel"

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
    const/16 v3, 0xe

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_d
    const-string v0, "iconType"

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
    const/16 v3, 0xd

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_e
    const-string v0, "iconImageSource"

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
    const/16 v3, 0xc

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_f
    const-string v0, "tabKey"

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
    const/16 v3, 0xb

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_10
    const-string v0, "isTitleUndefined"

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
    const/16 v3, 0xa

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_11
    const-string v0, "overrideScrollViewContentInsetAdjustmentBehavior"

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
    const/16 v3, 0x9

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :sswitch_12
    const-string v0, "isFocused"

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
    const/16 v3, 0x8

    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :sswitch_13
    const-string v0, "orientation"

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
    goto :goto_0

    .line 291
    :cond_13
    const/4 v3, 0x7

    .line 292
    goto :goto_0

    .line 293
    :sswitch_14
    const-string v0, "iconResourceName"

    .line 294
    .line 295
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_14

    .line 300
    .line 301
    goto :goto_0

    .line 302
    :cond_14
    const/4 v3, 0x6

    .line 303
    goto :goto_0

    .line 304
    :sswitch_15
    const-string v0, "rightScrollEdgeEffect"

    .line 305
    .line 306
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_15

    .line 311
    .line 312
    goto :goto_0

    .line 313
    :cond_15
    const/4 v3, 0x5

    .line 314
    goto :goto_0

    .line 315
    :sswitch_16
    const-string v0, "specialEffects"

    .line 316
    .line 317
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_16

    .line 322
    .line 323
    goto :goto_0

    .line 324
    :cond_16
    const/4 v3, 0x4

    .line 325
    goto :goto_0

    .line 326
    :sswitch_17
    const-string v0, "leftScrollEdgeEffect"

    .line 327
    .line 328
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-nez v0, :cond_17

    .line 333
    .line 334
    goto :goto_0

    .line 335
    :cond_17
    const/4 v3, 0x3

    .line 336
    goto :goto_0

    .line 337
    :sswitch_18
    const-string v0, "userInterfaceStyle"

    .line 338
    .line 339
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-nez v0, :cond_18

    .line 344
    .line 345
    goto :goto_0

    .line 346
    :cond_18
    const/4 v3, 0x2

    .line 347
    goto :goto_0

    .line 348
    :sswitch_19
    const-string v0, "topScrollEdgeEffect"

    .line 349
    .line 350
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-nez v0, :cond_19

    .line 355
    .line 356
    goto :goto_0

    .line 357
    :cond_19
    move v3, v2

    .line 358
    goto :goto_0

    .line 359
    :sswitch_1a
    const-string v0, "bottomScrollEdgeEffect"

    .line 360
    .line 361
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-nez v0, :cond_1a

    .line 366
    .line 367
    goto :goto_0

    .line 368
    :cond_1a
    move v3, v1

    .line 369
    :goto_0
    const/4 v0, 0x0

    .line 370
    packed-switch v3, :pswitch_data_0

    .line 371
    .line 372
    .line 373
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 378
    .line 379
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 380
    .line 381
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 382
    .line 383
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setImageIconResource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 388
    .line 389
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 390
    .line 391
    if-nez p3, :cond_1b

    .line 392
    .line 393
    goto :goto_1

    .line 394
    :cond_1b
    move-object v0, p3

    .line 395
    check-cast v0, Ljava/lang/String;

    .line 396
    .line 397
    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSelectedIconResourceName(Landroid/view/View;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 402
    .line 403
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 404
    .line 405
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object p3

    .line 413
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabBarItemBadgeTextColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 418
    .line 419
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 420
    .line 421
    if-nez p3, :cond_1c

    .line 422
    .line 423
    goto :goto_2

    .line 424
    :cond_1c
    move-object v0, p3

    .line 425
    check-cast v0, Ljava/lang/String;

    .line 426
    .line 427
    :goto_2
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabBarItemTestID(Landroid/view/View;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 432
    .line 433
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 434
    .line 435
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 440
    .line 441
    .line 442
    move-result-object p3

    .line 443
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabBarItemBadgeBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 448
    .line 449
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 450
    .line 451
    if-nez p3, :cond_1d

    .line 452
    .line 453
    goto :goto_3

    .line 454
    :cond_1d
    move-object v0, p3

    .line 455
    check-cast v0, Ljava/lang/String;

    .line 456
    .line 457
    :goto_3
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setBadgeValue(Landroid/view/View;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 462
    .line 463
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 464
    .line 465
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 466
    .line 467
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSelectedIconImageSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 472
    .line 473
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 474
    .line 475
    check-cast p3, Ljava/lang/String;

    .line 476
    .line 477
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSystemItem(Landroid/view/View;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 482
    .line 483
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 484
    .line 485
    if-nez p3, :cond_1e

    .line 486
    .line 487
    goto :goto_4

    .line 488
    :cond_1e
    move-object v0, p3

    .line 489
    check-cast v0, Ljava/lang/String;

    .line 490
    .line 491
    :goto_4
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTitle(Landroid/view/View;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    return-void

    .line 495
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 496
    .line 497
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 498
    .line 499
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 500
    .line 501
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setStandardAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 509
    .line 510
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 511
    .line 512
    if-nez p3, :cond_1f

    .line 513
    .line 514
    goto :goto_5

    .line 515
    :cond_1f
    move-object v0, p3

    .line 516
    check-cast v0, Ljava/lang/String;

    .line 517
    .line 518
    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setDrawableIconResourceName(Landroid/view/View;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 523
    .line 524
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 525
    .line 526
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 527
    .line 528
    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setScrollEdgeAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 536
    .line 537
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 538
    .line 539
    if-nez p3, :cond_20

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_20
    move-object v0, p3

    .line 543
    check-cast v0, Ljava/lang/String;

    .line 544
    .line 545
    :goto_6
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabBarItemAccessibilityLabel(Landroid/view/View;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    return-void

    .line 549
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 550
    .line 551
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 552
    .line 553
    check-cast p3, Ljava/lang/String;

    .line 554
    .line 555
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconType(Landroid/view/View;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 560
    .line 561
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 562
    .line 563
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 564
    .line 565
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconImageSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 570
    .line 571
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 572
    .line 573
    if-nez p3, :cond_21

    .line 574
    .line 575
    goto :goto_7

    .line 576
    :cond_21
    move-object v0, p3

    .line 577
    check-cast v0, Ljava/lang/String;

    .line 578
    .line 579
    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabKey(Landroid/view/View;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 584
    .line 585
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 586
    .line 587
    if-nez p3, :cond_22

    .line 588
    .line 589
    goto :goto_8

    .line 590
    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    .line 591
    .line 592
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 593
    .line 594
    .line 595
    move-result v2

    .line 596
    :goto_8
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIsTitleUndefined(Landroid/view/View;Z)V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 601
    .line 602
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 603
    .line 604
    if-nez p3, :cond_23

    .line 605
    .line 606
    goto :goto_9

    .line 607
    :cond_23
    check-cast p3, Ljava/lang/Boolean;

    .line 608
    .line 609
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    :goto_9
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setOverrideScrollViewContentInsetAdjustmentBehavior(Landroid/view/View;Z)V

    .line 614
    .line 615
    .line 616
    return-void

    .line 617
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 618
    .line 619
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 620
    .line 621
    if-nez p3, :cond_24

    .line 622
    .line 623
    goto :goto_a

    .line 624
    :cond_24
    check-cast p3, Ljava/lang/Boolean;

    .line 625
    .line 626
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    :goto_a
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIsFocused(Landroid/view/View;Z)V

    .line 631
    .line 632
    .line 633
    return-void

    .line 634
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 635
    .line 636
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 637
    .line 638
    check-cast p3, Ljava/lang/String;

    .line 639
    .line 640
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setOrientation(Landroid/view/View;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-void

    .line 644
    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 645
    .line 646
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 647
    .line 648
    if-nez p3, :cond_25

    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_25
    move-object v0, p3

    .line 652
    check-cast v0, Ljava/lang/String;

    .line 653
    .line 654
    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconResourceName(Landroid/view/View;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 659
    .line 660
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 661
    .line 662
    check-cast p3, Ljava/lang/String;

    .line 663
    .line 664
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setRightScrollEdgeEffect(Landroid/view/View;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 669
    .line 670
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 671
    .line 672
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 673
    .line 674
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSpecialEffects(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 675
    .line 676
    .line 677
    return-void

    .line 678
    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 679
    .line 680
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 681
    .line 682
    check-cast p3, Ljava/lang/String;

    .line 683
    .line 684
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setLeftScrollEdgeEffect(Landroid/view/View;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    return-void

    .line 688
    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 689
    .line 690
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 691
    .line 692
    check-cast p3, Ljava/lang/String;

    .line 693
    .line 694
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setUserInterfaceStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    return-void

    .line 698
    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 699
    .line 700
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 701
    .line 702
    check-cast p3, Ljava/lang/String;

    .line 703
    .line 704
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTopScrollEdgeEffect(Landroid/view/View;Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    return-void

    .line 708
    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 709
    .line 710
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    .line 711
    .line 712
    check-cast p3, Ljava/lang/String;

    .line 713
    .line 714
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setBottomScrollEdgeEffect(Landroid/view/View;Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    return-void

    .line 718
    nop

    .line 719
    :sswitch_data_0
    .sparse-switch
        -0x76b75f5a -> :sswitch_1a
        -0x6f92cc30 -> :sswitch_19
        -0x6d092b5d -> :sswitch_18
        -0x6ac1917e -> :sswitch_17
        -0x698ec1f7 -> :sswitch_16
        -0x61113969 -> :sswitch_15
        -0x5cfb612e -> :sswitch_14
        -0x55cd0a30 -> :sswitch_13
        -0x4bbf2d13 -> :sswitch_12
        -0x46b8123f -> :sswitch_11
        -0x4591f65e -> :sswitch_10
        -0x34893d76 -> :sswitch_f
        -0x2e499ce3 -> :sswitch_e
        -0x2bfba4ad -> :sswitch_d
        -0x21486f69 -> :sswitch_c
        -0x101cf9d2 -> :sswitch_b
        -0xa39870 -> :sswitch_a
        0x1b12f01 -> :sswitch_9
        0x6942258 -> :sswitch_8
        0x264cb1e2 -> :sswitch_7
        0x3bb23f02 -> :sswitch_6
        0x3fe5d38e -> :sswitch_5
        0x5a8bcac3 -> :sswitch_4
        0x5dffc4fe -> :sswitch_3
        0x5f200ca4 -> :sswitch_2
        0x78843f8d -> :sswitch_1
        0x7db7a8a2 -> :sswitch_0
    .end sparse-switch

    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
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
    :pswitch_data_0
    .packed-switch 0x0
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
