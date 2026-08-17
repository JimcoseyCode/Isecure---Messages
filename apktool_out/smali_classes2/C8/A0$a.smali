.class public final LC8/A0$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC8/A0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LC8/A0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LC8/S;LC8/G0;Ljava/util/Set;Z)LC8/S;
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "substitutor"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, LC8/S;->N0()LC8/M0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    instance-of v4, v2, LC8/I;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    const-string v6, "getType(...)"

    .line 25
    .line 26
    const/16 v9, 0xa

    .line 27
    .line 28
    const-string v10, "getParameters(...)"

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    if-eqz v4, :cond_e

    .line 32
    .line 33
    move-object v4, v2

    .line 34
    check-cast v4, LC8/I;

    .line 35
    .line 36
    invoke-virtual {v4}, LC8/I;->S0()LC8/d0;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    invoke-virtual {v12}, LC8/S;->K0()LC8/v0;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    invoke-interface {v13}, LC8/v0;->getParameters()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v13

    .line 48
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    if-nez v13, :cond_6

    .line 53
    .line 54
    invoke-virtual {v12}, LC8/S;->K0()LC8/v0;

    .line 55
    .line 56
    .line 57
    move-result-object v13

    .line 58
    invoke-interface {v13}, LC8/v0;->p()LL7/h;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    if-nez v13, :cond_0

    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_0
    invoke-virtual {v12}, LC8/S;->K0()LC8/v0;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    invoke-interface {v13}, LC8/v0;->getParameters()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v14, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v13, v9}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v15

    .line 83
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v15

    .line 94
    if-eqz v15, :cond_5

    .line 95
    .line 96
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v15

    .line 100
    check-cast v15, LL7/m0;

    .line 101
    .line 102
    invoke-virtual {v3}, LC8/S;->I0()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-interface {v15}, LL7/m0;->getIndex()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    invoke-static {v7, v8}, Lj7/q;->h0(Ljava/util/List;I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, LC8/B0;

    .line 115
    .line 116
    if-eqz p4, :cond_1

    .line 117
    .line 118
    if-eqz v7, :cond_1

    .line 119
    .line 120
    invoke-interface {v7}, LC8/B0;->getType()LC8/S;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    if-eqz v8, :cond_1

    .line 125
    .line 126
    invoke-static {v8}, LH8/d;->i(LC8/S;)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-nez v8, :cond_1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_1
    if-eqz v1, :cond_2

    .line 134
    .line 135
    invoke-interface {v1, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_2

    .line 140
    .line 141
    const/4 v8, 0x1

    .line 142
    goto :goto_1

    .line 143
    :cond_2
    const/4 v8, 0x0

    .line 144
    :goto_1
    if-eqz v7, :cond_3

    .line 145
    .line 146
    if-nez v8, :cond_3

    .line 147
    .line 148
    invoke-virtual {v0}, LC8/G0;->j()LC8/E0;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-interface {v7}, LC8/B0;->getType()LC8/S;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-static {v9, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8, v9}, LC8/E0;->e(LC8/S;)LC8/B0;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    if-nez v8, :cond_4

    .line 164
    .line 165
    :cond_3
    new-instance v7, LC8/k0;

    .line 166
    .line 167
    invoke-direct {v7, v15}, LC8/k0;-><init>(LL7/m0;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    :goto_2
    invoke-interface {v14, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    const/16 v9, 0xa

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_5
    invoke-static {v12, v14, v11, v5, v11}, LC8/F0;->f(LC8/d0;Ljava/util/List;LC8/r0;ILjava/lang/Object;)LC8/d0;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    :cond_6
    :goto_3
    invoke-virtual {v4}, LC8/I;->T0()LC8/d0;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v4}, LC8/S;->K0()LC8/v0;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-interface {v7}, LC8/v0;->getParameters()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-nez v7, :cond_d

    .line 197
    .line 198
    invoke-virtual {v4}, LC8/S;->K0()LC8/v0;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-interface {v7}, LC8/v0;->p()LL7/h;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    if-nez v7, :cond_7

    .line 207
    .line 208
    goto/16 :goto_7

    .line 209
    .line 210
    :cond_7
    invoke-virtual {v4}, LC8/S;->K0()LC8/v0;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-interface {v7}, LC8/v0;->getParameters()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v7, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    new-instance v8, Ljava/util/ArrayList;

    .line 222
    .line 223
    const/16 v9, 0xa

    .line 224
    .line 225
    invoke-static {v7, v9}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    if-eqz v9, :cond_c

    .line 241
    .line 242
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    check-cast v9, LL7/m0;

    .line 247
    .line 248
    invoke-virtual {v3}, LC8/S;->I0()Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    invoke-interface {v9}, LL7/m0;->getIndex()I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    invoke-static {v10, v13}, Lj7/q;->h0(Ljava/util/List;I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    check-cast v10, LC8/B0;

    .line 261
    .line 262
    if-eqz p4, :cond_8

    .line 263
    .line 264
    if-eqz v10, :cond_8

    .line 265
    .line 266
    invoke-interface {v10}, LC8/B0;->getType()LC8/S;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    if-eqz v13, :cond_8

    .line 271
    .line 272
    invoke-static {v13}, LH8/d;->i(LC8/S;)Z

    .line 273
    .line 274
    .line 275
    move-result v13

    .line 276
    if-nez v13, :cond_8

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_8
    if-eqz v1, :cond_9

    .line 280
    .line 281
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v13

    .line 285
    if-eqz v13, :cond_9

    .line 286
    .line 287
    const/4 v13, 0x1

    .line 288
    goto :goto_5

    .line 289
    :cond_9
    const/4 v13, 0x0

    .line 290
    :goto_5
    if-eqz v10, :cond_a

    .line 291
    .line 292
    if-nez v13, :cond_a

    .line 293
    .line 294
    invoke-virtual {v0}, LC8/G0;->j()LC8/E0;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    invoke-interface {v10}, LC8/B0;->getType()LC8/S;

    .line 299
    .line 300
    .line 301
    move-result-object v14

    .line 302
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13, v14}, LC8/E0;->e(LC8/S;)LC8/B0;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    if-nez v13, :cond_b

    .line 310
    .line 311
    :cond_a
    new-instance v10, LC8/k0;

    .line 312
    .line 313
    invoke-direct {v10, v9}, LC8/k0;-><init>(LL7/m0;)V

    .line 314
    .line 315
    .line 316
    :cond_b
    :goto_6
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_c
    invoke-static {v4, v8, v11, v5, v11}, LC8/F0;->f(LC8/d0;Ljava/util/List;LC8/r0;ILjava/lang/Object;)LC8/d0;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    :cond_d
    :goto_7
    invoke-static {v12, v4}, LC8/V;->e(LC8/d0;LC8/d0;)LC8/M0;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    goto/16 :goto_c

    .line 329
    .line 330
    :cond_e
    instance-of v4, v2, LC8/d0;

    .line 331
    .line 332
    if-eqz v4, :cond_16

    .line 333
    .line 334
    move-object v4, v2

    .line 335
    check-cast v4, LC8/d0;

    .line 336
    .line 337
    invoke-virtual {v4}, LC8/S;->K0()LC8/v0;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    invoke-interface {v7}, LC8/v0;->getParameters()Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v7

    .line 349
    if-nez v7, :cond_15

    .line 350
    .line 351
    invoke-virtual {v4}, LC8/S;->K0()LC8/v0;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-interface {v7}, LC8/v0;->p()LL7/h;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    if-nez v7, :cond_f

    .line 360
    .line 361
    goto/16 :goto_b

    .line 362
    .line 363
    :cond_f
    invoke-virtual {v4}, LC8/S;->K0()LC8/v0;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-interface {v7}, LC8/v0;->getParameters()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    invoke-static {v7, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    new-instance v8, Ljava/util/ArrayList;

    .line 375
    .line 376
    const/16 v9, 0xa

    .line 377
    .line 378
    invoke-static {v7, v9}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    if-eqz v9, :cond_14

    .line 394
    .line 395
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    check-cast v9, LL7/m0;

    .line 400
    .line 401
    invoke-virtual {v3}, LC8/S;->I0()Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    invoke-interface {v9}, LL7/m0;->getIndex()I

    .line 406
    .line 407
    .line 408
    move-result v12

    .line 409
    invoke-static {v10, v12}, Lj7/q;->h0(Ljava/util/List;I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    check-cast v10, LC8/B0;

    .line 414
    .line 415
    if-eqz p4, :cond_10

    .line 416
    .line 417
    if-eqz v10, :cond_10

    .line 418
    .line 419
    invoke-interface {v10}, LC8/B0;->getType()LC8/S;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    if-eqz v12, :cond_10

    .line 424
    .line 425
    invoke-static {v12}, LH8/d;->i(LC8/S;)Z

    .line 426
    .line 427
    .line 428
    move-result v12

    .line 429
    if-nez v12, :cond_10

    .line 430
    .line 431
    goto :goto_a

    .line 432
    :cond_10
    if-eqz v1, :cond_11

    .line 433
    .line 434
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v12

    .line 438
    if-eqz v12, :cond_11

    .line 439
    .line 440
    const/4 v12, 0x1

    .line 441
    goto :goto_9

    .line 442
    :cond_11
    const/4 v12, 0x0

    .line 443
    :goto_9
    if-eqz v10, :cond_12

    .line 444
    .line 445
    if-nez v12, :cond_12

    .line 446
    .line 447
    invoke-virtual {v0}, LC8/G0;->j()LC8/E0;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    invoke-interface {v10}, LC8/B0;->getType()LC8/S;

    .line 452
    .line 453
    .line 454
    move-result-object v13

    .line 455
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v13}, LC8/E0;->e(LC8/S;)LC8/B0;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    if-nez v12, :cond_13

    .line 463
    .line 464
    :cond_12
    new-instance v10, LC8/k0;

    .line 465
    .line 466
    invoke-direct {v10, v9}, LC8/k0;-><init>(LL7/m0;)V

    .line 467
    .line 468
    .line 469
    :cond_13
    :goto_a
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_14
    invoke-static {v4, v8, v11, v5, v11}, LC8/F0;->f(LC8/d0;Ljava/util/List;LC8/r0;ILjava/lang/Object;)LC8/d0;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    goto :goto_c

    .line 478
    :cond_15
    :goto_b
    move-object v1, v4

    .line 479
    :goto_c
    invoke-static {v1, v2}, LC8/L0;->b(LC8/M0;LC8/S;)LC8/M0;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    sget-object v2, LC8/N0;->m:LC8/N0;

    .line 484
    .line 485
    invoke-virtual {v0, v1, v2}, LC8/G0;->n(LC8/S;LC8/N0;)LC8/S;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    const-string v1, "safeSubstitute(...)"

    .line 490
    .line 491
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    return-object v0

    .line 495
    :cond_16
    new-instance v0, Li7/m;

    .line 496
    .line 497
    invoke-direct {v0}, Li7/m;-><init>()V

    .line 498
    .line 499
    .line 500
    throw v0
.end method
