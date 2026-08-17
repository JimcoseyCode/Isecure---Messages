.class public final Lcom/canhub/cropper/CropImageOptions$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropImageOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/canhub/cropper/CropImageOptions;
    .locals 73

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "parcel"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/canhub/cropper/CropImageOptions;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    move v1, v3

    .line 19
    move v3, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v3

    .line 22
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    move v5, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v5, v4

    .line 31
    move v4, v1

    .line 32
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static {v6}, Lcom/canhub/cropper/CropImageView$d;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$d;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-static {v7}, Lcom/canhub/cropper/CropImageView$b;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$b;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    move v8, v5

    .line 49
    move-object v5, v6

    .line 50
    move-object v6, v7

    .line 51
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    move v9, v8

    .line 56
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    move v10, v9

    .line 61
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    invoke-static {v11}, Lcom/canhub/cropper/CropImageView$e;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$e;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    invoke-static {v12}, Lcom/canhub/cropper/CropImageView$l;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$l;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    if-eqz v13, :cond_2

    .line 86
    .line 87
    move v13, v10

    .line 88
    move-object v10, v11

    .line 89
    move-object v11, v12

    .line 90
    move v12, v13

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move v13, v10

    .line 93
    move-object v10, v11

    .line 94
    move-object v11, v12

    .line 95
    move v12, v1

    .line 96
    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    if-eqz v14, :cond_3

    .line 101
    .line 102
    move v14, v13

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move v14, v13

    .line 105
    move v13, v1

    .line 106
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    if-eqz v15, :cond_4

    .line 111
    .line 112
    move v15, v14

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    move v15, v14

    .line 115
    move v14, v1

    .line 116
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result v16

    .line 120
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 121
    .line 122
    .line 123
    move-result v17

    .line 124
    if-eqz v17, :cond_5

    .line 125
    .line 126
    move/from16 v17, v15

    .line 127
    .line 128
    move/from16 v15, v16

    .line 129
    .line 130
    move/from16 v16, v17

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    move/from16 v17, v15

    .line 134
    .line 135
    move/from16 v15, v16

    .line 136
    .line 137
    move/from16 v16, v1

    .line 138
    .line 139
    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 140
    .line 141
    .line 142
    move-result v18

    .line 143
    if-eqz v18, :cond_6

    .line 144
    .line 145
    move/from16 v18, v17

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_6
    move/from16 v18, v17

    .line 149
    .line 150
    move/from16 v17, v1

    .line 151
    .line 152
    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 153
    .line 154
    .line 155
    move-result v19

    .line 156
    if-eqz v19, :cond_7

    .line 157
    .line 158
    move/from16 v19, v18

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_7
    move/from16 v19, v18

    .line 162
    .line 163
    move/from16 v18, v1

    .line 164
    .line 165
    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 166
    .line 167
    .line 168
    move-result v20

    .line 169
    if-eqz v20, :cond_8

    .line 170
    .line 171
    move/from16 v20, v19

    .line 172
    .line 173
    goto :goto_8

    .line 174
    :cond_8
    move/from16 v20, v19

    .line 175
    .line 176
    move/from16 v19, v1

    .line 177
    .line 178
    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 179
    .line 180
    .line 181
    move-result v21

    .line 182
    move/from16 v22, v20

    .line 183
    .line 184
    move/from16 v20, v21

    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 187
    .line 188
    .line 189
    move-result v21

    .line 190
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 191
    .line 192
    .line 193
    move-result v23

    .line 194
    if-eqz v23, :cond_9

    .line 195
    .line 196
    move/from16 v23, v22

    .line 197
    .line 198
    goto :goto_9

    .line 199
    :cond_9
    move/from16 v23, v22

    .line 200
    .line 201
    move/from16 v22, v1

    .line 202
    .line 203
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 204
    .line 205
    .line 206
    move-result v24

    .line 207
    move/from16 v25, v23

    .line 208
    .line 209
    move/from16 v23, v24

    .line 210
    .line 211
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 212
    .line 213
    .line 214
    move-result v24

    .line 215
    move/from16 v26, v25

    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 218
    .line 219
    .line 220
    move-result v25

    .line 221
    move/from16 v27, v26

    .line 222
    .line 223
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 224
    .line 225
    .line 226
    move-result v26

    .line 227
    move/from16 v28, v27

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 230
    .line 231
    .line 232
    move-result v27

    .line 233
    move/from16 v29, v28

    .line 234
    .line 235
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 236
    .line 237
    .line 238
    move-result v28

    .line 239
    move/from16 v30, v29

    .line 240
    .line 241
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 242
    .line 243
    .line 244
    move-result v29

    .line 245
    move/from16 v31, v30

    .line 246
    .line 247
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 248
    .line 249
    .line 250
    move-result v30

    .line 251
    move/from16 v32, v31

    .line 252
    .line 253
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 254
    .line 255
    .line 256
    move-result v31

    .line 257
    move/from16 v33, v32

    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 260
    .line 261
    .line 262
    move-result v32

    .line 263
    move/from16 v34, v33

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 266
    .line 267
    .line 268
    move-result v33

    .line 269
    move/from16 v35, v34

    .line 270
    .line 271
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 272
    .line 273
    .line 274
    move-result v34

    .line 275
    move/from16 v36, v35

    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 278
    .line 279
    .line 280
    move-result v35

    .line 281
    move/from16 v37, v36

    .line 282
    .line 283
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 284
    .line 285
    .line 286
    move-result v36

    .line 287
    move/from16 v38, v37

    .line 288
    .line 289
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 290
    .line 291
    .line 292
    move-result v37

    .line 293
    move/from16 v39, v38

    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 296
    .line 297
    .line 298
    move-result v38

    .line 299
    move/from16 v40, v39

    .line 300
    .line 301
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 302
    .line 303
    .line 304
    move-result v39

    .line 305
    move/from16 v41, v40

    .line 306
    .line 307
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 308
    .line 309
    .line 310
    move-result v40

    .line 311
    sget-object v1, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    .line 312
    .line 313
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v43

    .line 317
    check-cast v43, Ljava/lang/CharSequence;

    .line 318
    .line 319
    const/16 v44, 0x0

    .line 320
    .line 321
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 322
    .line 323
    .line 324
    move-result v42

    .line 325
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 326
    .line 327
    .line 328
    move-result v45

    .line 329
    const/16 v46, 0x0

    .line 330
    .line 331
    if-nez v45, :cond_a

    .line 332
    .line 333
    move-object/from16 v45, v46

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 337
    .line 338
    .line 339
    move-result v45

    .line 340
    invoke-static/range {v45 .. v45}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v45

    .line 344
    :goto_a
    const-class v47, Lcom/canhub/cropper/CropImageOptions;

    .line 345
    .line 346
    move-object/from16 v48, v2

    .line 347
    .line 348
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    check-cast v2, Landroid/net/Uri;

    .line 357
    .line 358
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v49

    .line 362
    invoke-static/range {v49 .. v49}, Landroid/graphics/Bitmap$CompressFormat;->valueOf(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;

    .line 363
    .line 364
    .line 365
    move-result-object v49

    .line 366
    move-object/from16 v50, v46

    .line 367
    .line 368
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 369
    .line 370
    .line 371
    move-result v46

    .line 372
    move-object/from16 v51, v47

    .line 373
    .line 374
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 375
    .line 376
    .line 377
    move-result v47

    .line 378
    move/from16 v52, v44

    .line 379
    .line 380
    move-object/from16 v44, v2

    .line 381
    .line 382
    move-object/from16 v2, v48

    .line 383
    .line 384
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 385
    .line 386
    .line 387
    move-result v48

    .line 388
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v53

    .line 392
    invoke-static/range {v53 .. v53}, Lcom/canhub/cropper/CropImageView$k;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$k;

    .line 393
    .line 394
    .line 395
    move-result-object v53

    .line 396
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 397
    .line 398
    .line 399
    move-result v54

    .line 400
    if-eqz v54, :cond_b

    .line 401
    .line 402
    move-object/from16 v54, v50

    .line 403
    .line 404
    move/from16 v50, v41

    .line 405
    .line 406
    :goto_b
    move-object/from16 v55, v2

    .line 407
    .line 408
    goto :goto_c

    .line 409
    :cond_b
    move-object/from16 v54, v50

    .line 410
    .line 411
    move/from16 v50, v52

    .line 412
    .line 413
    goto :goto_b

    .line 414
    :goto_c
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    move-object/from16 v51, v2

    .line 423
    .line 424
    check-cast v51, Landroid/graphics/Rect;

    .line 425
    .line 426
    move/from16 v2, v52

    .line 427
    .line 428
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 429
    .line 430
    .line 431
    move-result v52

    .line 432
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 433
    .line 434
    .line 435
    move-result v56

    .line 436
    if-eqz v56, :cond_c

    .line 437
    .line 438
    move/from16 v56, v41

    .line 439
    .line 440
    move-object/from16 v41, v43

    .line 441
    .line 442
    move-object/from16 v43, v45

    .line 443
    .line 444
    move-object/from16 v45, v49

    .line 445
    .line 446
    move-object/from16 v49, v53

    .line 447
    .line 448
    move/from16 v53, v56

    .line 449
    .line 450
    goto :goto_d

    .line 451
    :cond_c
    move/from16 v56, v41

    .line 452
    .line 453
    move-object/from16 v41, v43

    .line 454
    .line 455
    move-object/from16 v43, v45

    .line 456
    .line 457
    move-object/from16 v45, v49

    .line 458
    .line 459
    move-object/from16 v49, v53

    .line 460
    .line 461
    move/from16 v53, v2

    .line 462
    .line 463
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 464
    .line 465
    .line 466
    move-result v57

    .line 467
    if-eqz v57, :cond_d

    .line 468
    .line 469
    move-object/from16 v57, v54

    .line 470
    .line 471
    move/from16 v54, v56

    .line 472
    .line 473
    goto :goto_e

    .line 474
    :cond_d
    move-object/from16 v57, v54

    .line 475
    .line 476
    move/from16 v54, v2

    .line 477
    .line 478
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 479
    .line 480
    .line 481
    move-result v58

    .line 482
    if-eqz v58, :cond_e

    .line 483
    .line 484
    move/from16 v58, v2

    .line 485
    .line 486
    move-object/from16 v2, v55

    .line 487
    .line 488
    move/from16 v55, v56

    .line 489
    .line 490
    move/from16 v59, v55

    .line 491
    .line 492
    goto :goto_f

    .line 493
    :cond_e
    move/from16 v58, v2

    .line 494
    .line 495
    move/from16 v59, v56

    .line 496
    .line 497
    move-object/from16 v2, v55

    .line 498
    .line 499
    move/from16 v55, v58

    .line 500
    .line 501
    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 502
    .line 503
    .line 504
    move-result v56

    .line 505
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 506
    .line 507
    .line 508
    move-result v60

    .line 509
    if-eqz v60, :cond_f

    .line 510
    .line 511
    move-object/from16 v60, v57

    .line 512
    .line 513
    move/from16 v57, v59

    .line 514
    .line 515
    goto :goto_10

    .line 516
    :cond_f
    move-object/from16 v60, v57

    .line 517
    .line 518
    move/from16 v57, v58

    .line 519
    .line 520
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 521
    .line 522
    .line 523
    move-result v61

    .line 524
    if-eqz v61, :cond_10

    .line 525
    .line 526
    move/from16 v61, v58

    .line 527
    .line 528
    move/from16 v58, v59

    .line 529
    .line 530
    goto :goto_11

    .line 531
    :cond_10
    move/from16 v61, v58

    .line 532
    .line 533
    :goto_11
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    check-cast v1, Ljava/lang/CharSequence;

    .line 538
    .line 539
    move-object/from16 v62, v60

    .line 540
    .line 541
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 542
    .line 543
    .line 544
    move-result v60

    .line 545
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 546
    .line 547
    .line 548
    move-result v63

    .line 549
    if-eqz v63, :cond_11

    .line 550
    .line 551
    move/from16 v63, v61

    .line 552
    .line 553
    move/from16 v61, v59

    .line 554
    .line 555
    goto :goto_12

    .line 556
    :cond_11
    move/from16 v63, v61

    .line 557
    .line 558
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 559
    .line 560
    .line 561
    move-result v64

    .line 562
    if-eqz v64, :cond_12

    .line 563
    .line 564
    move/from16 v63, v59

    .line 565
    .line 566
    :cond_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v59

    .line 570
    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 571
    .line 572
    .line 573
    move-result-object v64

    .line 574
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 575
    .line 576
    .line 577
    move-result v65

    .line 578
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 579
    .line 580
    .line 581
    move-result v66

    .line 582
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v67

    .line 586
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 587
    .line 588
    .line 589
    move-result v68

    .line 590
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 591
    .line 592
    .line 593
    move-result v69

    .line 594
    if-nez v69, :cond_13

    .line 595
    .line 596
    move-object/from16 v69, v62

    .line 597
    .line 598
    goto :goto_13

    .line 599
    :cond_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 600
    .line 601
    .line 602
    move-result v69

    .line 603
    invoke-static/range {v69 .. v69}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 604
    .line 605
    .line 606
    move-result-object v69

    .line 607
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 608
    .line 609
    .line 610
    move-result v70

    .line 611
    if-nez v70, :cond_14

    .line 612
    .line 613
    move-object/from16 v70, v62

    .line 614
    .line 615
    goto :goto_14

    .line 616
    :cond_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 617
    .line 618
    .line 619
    move-result v70

    .line 620
    invoke-static/range {v70 .. v70}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 621
    .line 622
    .line 623
    move-result-object v70

    .line 624
    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 625
    .line 626
    .line 627
    move-result v71

    .line 628
    if-nez v71, :cond_15

    .line 629
    .line 630
    move-object/from16 v71, v62

    .line 631
    .line 632
    goto :goto_15

    .line 633
    :cond_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 634
    .line 635
    .line 636
    move-result v71

    .line 637
    invoke-static/range {v71 .. v71}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 638
    .line 639
    .line 640
    move-result-object v71

    .line 641
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 642
    .line 643
    .line 644
    move-result v72

    .line 645
    if-nez v72, :cond_16

    .line 646
    .line 647
    move-object/from16 v72, v62

    .line 648
    .line 649
    :goto_16
    move/from16 v62, v63

    .line 650
    .line 651
    move-object/from16 v63, v59

    .line 652
    .line 653
    move-object/from16 v59, v1

    .line 654
    .line 655
    goto :goto_17

    .line 656
    :cond_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    move-object/from16 v72, v0

    .line 665
    .line 666
    goto :goto_16

    .line 667
    :goto_17
    invoke-direct/range {v2 .. v72}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$d;Lcom/canhub/cropper/CropImageView$b;FFFLcom/canhub/cropper/CropImageView$e;Lcom/canhub/cropper/CropImageView$l;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$k;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 668
    .line 669
    .line 670
    return-object v2
.end method

.method public final b(I)[Lcom/canhub/cropper/CropImageOptions;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/canhub/cropper/CropImageOptions;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageOptions$a;->a(Landroid/os/Parcel;)Lcom/canhub/cropper/CropImageOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageOptions$a;->b(I)[Lcom/canhub/cropper/CropImageOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
