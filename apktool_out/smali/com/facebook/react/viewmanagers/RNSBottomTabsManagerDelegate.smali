.class public Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;
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
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface<",
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
    .locals 5
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
    const-string v0, "tabBarItemTitleFontSizeActive"

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
    const/16 v3, 0x13

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_1
    const-string v0, "tabBarItemTitleFontWeight"

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
    const/16 v3, 0x12

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_2
    const-string v0, "tabBarItemRippleColor"

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
    const/16 v3, 0x11

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :sswitch_3
    const-string v0, "tabBarItemTitleFontFamily"

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
    const/16 v3, 0x10

    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :sswitch_4
    const-string v0, "controlNavigationStateInJS"

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
    const/16 v3, 0xf

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :sswitch_5
    const-string v0, "tabBarItemIconColorActive"

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
    const/16 v3, 0xe

    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :sswitch_6
    const-string v0, "tabBarItemActiveIndicatorEnabled"

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
    const/16 v3, 0xd

    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :sswitch_7
    const-string v0, "nativeContainerBackgroundColor"

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
    const/16 v3, 0xc

    .line 125
    .line 126
    goto/16 :goto_0

    .line 127
    .line 128
    :sswitch_8
    const-string v0, "tabBarHidden"

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
    const/16 v3, 0xb

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :sswitch_9
    const-string v0, "tabBarMinimizeBehavior"

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
    const/16 v3, 0xa

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :sswitch_a
    const-string v0, "tabBarItemTitleFontStyle"

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
    const/16 v3, 0x9

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_b
    const-string v0, "tabBarItemTitleFontColor"

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
    const/16 v3, 0x8

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_c
    const-string v0, "tabBarItemTitleFontSize"

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
    goto :goto_0

    .line 193
    :cond_c
    const/4 v3, 0x7

    .line 194
    goto :goto_0

    .line 195
    :sswitch_d
    const-string v0, "tabBarBackgroundColor"

    .line 196
    .line 197
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_d

    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_d
    const/4 v3, 0x6

    .line 205
    goto :goto_0

    .line 206
    :sswitch_e
    const-string v0, "tabBarItemTitleFontColorActive"

    .line 207
    .line 208
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_e

    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_e
    const/4 v3, 0x5

    .line 216
    goto :goto_0

    .line 217
    :sswitch_f
    const-string v0, "tabBarItemActiveIndicatorColor"

    .line 218
    .line 219
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_f

    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_f
    const/4 v3, 0x4

    .line 227
    goto :goto_0

    .line 228
    :sswitch_10
    const-string v0, "tabBarItemIconColor"

    .line 229
    .line 230
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_10

    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_10
    const/4 v3, 0x3

    .line 238
    goto :goto_0

    .line 239
    :sswitch_11
    const-string v0, "tabBarControllerMode"

    .line 240
    .line 241
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_11

    .line 246
    .line 247
    goto :goto_0

    .line 248
    :cond_11
    const/4 v3, 0x2

    .line 249
    goto :goto_0

    .line 250
    :sswitch_12
    const-string v0, "tabBarItemLabelVisibilityMode"

    .line 251
    .line 252
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_12

    .line 257
    .line 258
    goto :goto_0

    .line 259
    :cond_12
    move v3, v1

    .line 260
    goto :goto_0

    .line 261
    :sswitch_13
    const-string v0, "tabBarTintColor"

    .line 262
    .line 263
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_13

    .line 268
    .line 269
    goto :goto_0

    .line 270
    :cond_13
    move v3, v2

    .line 271
    :goto_0
    const/4 v0, 0x0

    .line 272
    const/4 v4, 0x0

    .line 273
    packed-switch v3, :pswitch_data_0

    .line 274
    .line 275
    .line 276
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 281
    .line 282
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 283
    .line 284
    if-nez p3, :cond_14

    .line 285
    .line 286
    goto :goto_1

    .line 287
    :cond_14
    check-cast p3, Ljava/lang/Double;

    .line 288
    .line 289
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontSizeActive(Landroid/view/View;F)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 298
    .line 299
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 300
    .line 301
    if-nez p3, :cond_15

    .line 302
    .line 303
    goto :goto_2

    .line 304
    :cond_15
    move-object v4, p3

    .line 305
    check-cast v4, Ljava/lang/String;

    .line 306
    .line 307
    :goto_2
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 312
    .line 313
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 314
    .line 315
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object p3

    .line 323
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemRippleColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 328
    .line 329
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 330
    .line 331
    if-nez p3, :cond_16

    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_16
    move-object v4, p3

    .line 335
    check-cast v4, Ljava/lang/String;

    .line 336
    .line 337
    :goto_3
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 342
    .line 343
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 344
    .line 345
    if-nez p3, :cond_17

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_17
    check-cast p3, Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setControlNavigationStateInJS(Landroid/view/View;Z)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 359
    .line 360
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 361
    .line 362
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object p3

    .line 370
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemIconColorActive(Landroid/view/View;Ljava/lang/Integer;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 375
    .line 376
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 377
    .line 378
    if-nez p3, :cond_18

    .line 379
    .line 380
    goto :goto_5

    .line 381
    :cond_18
    check-cast p3, Ljava/lang/Boolean;

    .line 382
    .line 383
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    :goto_5
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemActiveIndicatorEnabled(Landroid/view/View;Z)V

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 392
    .line 393
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 394
    .line 395
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object p3

    .line 403
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setNativeContainerBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 408
    .line 409
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 410
    .line 411
    if-nez p3, :cond_19

    .line 412
    .line 413
    goto :goto_6

    .line 414
    :cond_19
    check-cast p3, Ljava/lang/Boolean;

    .line 415
    .line 416
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarHidden(Landroid/view/View;Z)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 425
    .line 426
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 427
    .line 428
    check-cast p3, Ljava/lang/String;

    .line 429
    .line 430
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarMinimizeBehavior(Landroid/view/View;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 435
    .line 436
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 437
    .line 438
    if-nez p3, :cond_1a

    .line 439
    .line 440
    goto :goto_7

    .line 441
    :cond_1a
    move-object v4, p3

    .line 442
    check-cast v4, Ljava/lang/String;

    .line 443
    .line 444
    :goto_7
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    return-void

    .line 448
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 449
    .line 450
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 451
    .line 452
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object p3

    .line 460
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 465
    .line 466
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 467
    .line 468
    if-nez p3, :cond_1b

    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_1b
    check-cast p3, Ljava/lang/Double;

    .line 472
    .line 473
    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    :goto_8
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontSize(Landroid/view/View;F)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 482
    .line 483
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 484
    .line 485
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 490
    .line 491
    .line 492
    move-result-object p3

    .line 493
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 498
    .line 499
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 500
    .line 501
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object p3

    .line 509
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontColorActive(Landroid/view/View;Ljava/lang/Integer;)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 514
    .line 515
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 516
    .line 517
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object p3

    .line 525
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemActiveIndicatorColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 530
    .line 531
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

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
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemIconColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 546
    .line 547
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 548
    .line 549
    check-cast p3, Ljava/lang/String;

    .line 550
    .line 551
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarControllerMode(Landroid/view/View;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    return-void

    .line 555
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 556
    .line 557
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 558
    .line 559
    check-cast p3, Ljava/lang/String;

    .line 560
    .line 561
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemLabelVisibilityMode(Landroid/view/View;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 566
    .line 567
    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    .line 568
    .line 569
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object p3

    .line 577
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :sswitch_data_0
    .sparse-switch
        -0x6fa58976 -> :sswitch_13
        -0x66559048 -> :sswitch_12
        -0x5e66f4c3 -> :sswitch_11
        -0x459b4b07 -> :sswitch_10
        -0x43feb2b5 -> :sswitch_f
        -0x2b572aed -> :sswitch_e
        -0x8ec3549 -> :sswitch_d
        -0x868c189 -> :sswitch_c
        -0x58e6053 -> :sswitch_b
        -0x4aa7205 -> :sswitch_a
        0x89c876e -> :sswitch_9
        0x10948388 -> :sswitch_8
        0x23800f4b -> :sswitch_7
        0x2859cf29 -> :sswitch_6
        0x2991c15f -> :sswitch_5
        0x56f6390e -> :sswitch_4
        0x581bf45a -> :sswitch_3
        0x73624de2 -> :sswitch_2
        0x7554db6e -> :sswitch_1
        0x784ab45d -> :sswitch_0
    .end sparse-switch

    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    :pswitch_data_0
    .packed-switch 0x0
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
