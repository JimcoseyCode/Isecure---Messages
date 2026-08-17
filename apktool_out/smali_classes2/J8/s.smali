.class public final LJ8/s;
.super LJ8/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LJ8/s;

.field private static final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 36

    .line 1
    new-instance v0, LJ8/s;

    .line 2
    .line 3
    invoke-direct {v0}, LJ8/s;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ8/s;->a:LJ8/s;

    .line 7
    .line 8
    new-instance v1, LJ8/h;

    .line 9
    .line 10
    sget-object v2, LJ8/t;->k:Lk8/f;

    .line 11
    .line 12
    sget-object v0, LJ8/k$b;->b:LJ8/k$b;

    .line 13
    .line 14
    new-instance v3, LJ8/A$a;

    .line 15
    .line 16
    const/4 v7, 0x1

    .line 17
    invoke-direct {v3, v7}, LJ8/A$a;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v8, 0x2

    .line 21
    move-object v4, v3

    .line 22
    new-array v3, v8, [LJ8/f;

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    aput-object v0, v3, v9

    .line 26
    .line 27
    aput-object v4, v3, v7

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, LJ8/h;

    .line 36
    .line 37
    sget-object v3, LJ8/t;->l:Lk8/f;

    .line 38
    .line 39
    new-instance v4, LJ8/A$a;

    .line 40
    .line 41
    invoke-direct {v4, v8}, LJ8/A$a;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-array v5, v8, [LJ8/f;

    .line 45
    .line 46
    aput-object v0, v5, v9

    .line 47
    .line 48
    aput-object v4, v5, v7

    .line 49
    .line 50
    sget-object v4, LJ8/p;->g:LJ8/p;

    .line 51
    .line 52
    invoke-direct {v2, v3, v5, v4}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;)V

    .line 53
    .line 54
    .line 55
    new-instance v3, LJ8/h;

    .line 56
    .line 57
    sget-object v11, LJ8/t;->b:Lk8/f;

    .line 58
    .line 59
    sget-object v4, LJ8/m;->a:LJ8/m;

    .line 60
    .line 61
    new-instance v5, LJ8/A$a;

    .line 62
    .line 63
    invoke-direct {v5, v8}, LJ8/A$a;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sget-object v6, LJ8/j;->a:LJ8/j;

    .line 67
    .line 68
    const/4 v10, 0x4

    .line 69
    new-array v12, v10, [LJ8/f;

    .line 70
    .line 71
    aput-object v0, v12, v9

    .line 72
    .line 73
    aput-object v4, v12, v7

    .line 74
    .line 75
    aput-object v5, v12, v8

    .line 76
    .line 77
    const/4 v5, 0x3

    .line 78
    aput-object v6, v12, v5

    .line 79
    .line 80
    const/4 v14, 0x4

    .line 81
    const/4 v15, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    move/from16 v35, v10

    .line 84
    .line 85
    move-object v10, v3

    .line 86
    move/from16 v3, v35

    .line 87
    .line 88
    invoke-direct/range {v10 .. v15}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    .line 90
    .line 91
    new-instance v11, LJ8/h;

    .line 92
    .line 93
    sget-object v12, LJ8/t;->c:Lk8/f;

    .line 94
    .line 95
    new-instance v13, LJ8/A$a;

    .line 96
    .line 97
    invoke-direct {v13, v5}, LJ8/A$a;-><init>(I)V

    .line 98
    .line 99
    .line 100
    move-object v14, v13

    .line 101
    new-array v13, v3, [LJ8/f;

    .line 102
    .line 103
    aput-object v0, v13, v9

    .line 104
    .line 105
    aput-object v4, v13, v7

    .line 106
    .line 107
    aput-object v14, v13, v8

    .line 108
    .line 109
    aput-object v6, v13, v5

    .line 110
    .line 111
    const/4 v15, 0x4

    .line 112
    const/16 v16, 0x0

    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    invoke-direct/range {v11 .. v16}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 116
    .line 117
    .line 118
    new-instance v12, LJ8/h;

    .line 119
    .line 120
    sget-object v13, LJ8/t;->d:Lk8/f;

    .line 121
    .line 122
    new-instance v14, LJ8/A$b;

    .line 123
    .line 124
    invoke-direct {v14, v8}, LJ8/A$b;-><init>(I)V

    .line 125
    .line 126
    .line 127
    move-object v15, v14

    .line 128
    new-array v14, v3, [LJ8/f;

    .line 129
    .line 130
    aput-object v0, v14, v9

    .line 131
    .line 132
    aput-object v4, v14, v7

    .line 133
    .line 134
    aput-object v15, v14, v8

    .line 135
    .line 136
    aput-object v6, v14, v5

    .line 137
    .line 138
    const/16 v16, 0x4

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const/4 v15, 0x0

    .line 143
    invoke-direct/range {v12 .. v17}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    new-instance v6, LJ8/h;

    .line 147
    .line 148
    sget-object v14, LJ8/t;->i:Lk8/f;

    .line 149
    .line 150
    new-array v15, v7, [LJ8/f;

    .line 151
    .line 152
    aput-object v0, v15, v9

    .line 153
    .line 154
    const/16 v17, 0x4

    .line 155
    .line 156
    const/16 v18, 0x0

    .line 157
    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    move-object v13, v6

    .line 161
    invoke-direct/range {v13 .. v18}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 162
    .line 163
    .line 164
    new-instance v13, LJ8/h;

    .line 165
    .line 166
    sget-object v14, LJ8/t;->h:Lk8/f;

    .line 167
    .line 168
    sget-object v19, LJ8/A$d;->b:LJ8/A$d;

    .line 169
    .line 170
    sget-object v20, LJ8/v$a;->d:LJ8/v$a;

    .line 171
    .line 172
    new-array v15, v3, [LJ8/f;

    .line 173
    .line 174
    aput-object v0, v15, v9

    .line 175
    .line 176
    aput-object v19, v15, v7

    .line 177
    .line 178
    aput-object v4, v15, v8

    .line 179
    .line 180
    aput-object v20, v15, v5

    .line 181
    .line 182
    invoke-direct/range {v13 .. v18}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 183
    .line 184
    .line 185
    new-instance v21, LJ8/h;

    .line 186
    .line 187
    sget-object v22, LJ8/t;->j:Lk8/f;

    .line 188
    .line 189
    sget-object v14, LJ8/A$c;->b:LJ8/A$c;

    .line 190
    .line 191
    new-array v15, v8, [LJ8/f;

    .line 192
    .line 193
    aput-object v0, v15, v9

    .line 194
    .line 195
    aput-object v14, v15, v7

    .line 196
    .line 197
    const/16 v25, 0x4

    .line 198
    .line 199
    const/16 v26, 0x0

    .line 200
    .line 201
    const/16 v24, 0x0

    .line 202
    .line 203
    move-object/from16 v23, v15

    .line 204
    .line 205
    invoke-direct/range {v21 .. v26}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 206
    .line 207
    .line 208
    new-instance v22, LJ8/h;

    .line 209
    .line 210
    sget-object v23, LJ8/t;->m:Lk8/f;

    .line 211
    .line 212
    new-array v15, v8, [LJ8/f;

    .line 213
    .line 214
    aput-object v0, v15, v9

    .line 215
    .line 216
    aput-object v14, v15, v7

    .line 217
    .line 218
    const/16 v26, 0x4

    .line 219
    .line 220
    const/16 v27, 0x0

    .line 221
    .line 222
    const/16 v25, 0x0

    .line 223
    .line 224
    move-object/from16 v24, v15

    .line 225
    .line 226
    invoke-direct/range {v22 .. v27}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 227
    .line 228
    .line 229
    new-instance v23, LJ8/h;

    .line 230
    .line 231
    sget-object v24, LJ8/t;->n:Lk8/f;

    .line 232
    .line 233
    new-array v15, v5, [LJ8/f;

    .line 234
    .line 235
    aput-object v0, v15, v9

    .line 236
    .line 237
    aput-object v14, v15, v7

    .line 238
    .line 239
    aput-object v20, v15, v8

    .line 240
    .line 241
    const/16 v27, 0x4

    .line 242
    .line 243
    const/16 v28, 0x0

    .line 244
    .line 245
    const/16 v26, 0x0

    .line 246
    .line 247
    move-object/from16 v25, v15

    .line 248
    .line 249
    invoke-direct/range {v23 .. v28}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 250
    .line 251
    .line 252
    new-instance v24, LJ8/h;

    .line 253
    .line 254
    sget-object v25, LJ8/t;->I:Lk8/f;

    .line 255
    .line 256
    new-array v15, v5, [LJ8/f;

    .line 257
    .line 258
    aput-object v0, v15, v9

    .line 259
    .line 260
    aput-object v19, v15, v7

    .line 261
    .line 262
    aput-object v4, v15, v8

    .line 263
    .line 264
    const/16 v28, 0x4

    .line 265
    .line 266
    const/16 v29, 0x0

    .line 267
    .line 268
    const/16 v27, 0x0

    .line 269
    .line 270
    move-object/from16 v26, v15

    .line 271
    .line 272
    invoke-direct/range {v24 .. v29}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 273
    .line 274
    .line 275
    new-instance v25, LJ8/h;

    .line 276
    .line 277
    sget-object v26, LJ8/t;->J:Lk8/f;

    .line 278
    .line 279
    new-array v15, v5, [LJ8/f;

    .line 280
    .line 281
    aput-object v0, v15, v9

    .line 282
    .line 283
    aput-object v19, v15, v7

    .line 284
    .line 285
    aput-object v4, v15, v8

    .line 286
    .line 287
    const/16 v29, 0x4

    .line 288
    .line 289
    const/16 v30, 0x0

    .line 290
    .line 291
    const/16 v28, 0x0

    .line 292
    .line 293
    move-object/from16 v27, v15

    .line 294
    .line 295
    invoke-direct/range {v25 .. v30}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 296
    .line 297
    .line 298
    move-object v15, v13

    .line 299
    new-instance v13, LJ8/h;

    .line 300
    .line 301
    move/from16 v16, v9

    .line 302
    .line 303
    sget-object v9, LJ8/t;->e:Lk8/f;

    .line 304
    .line 305
    move/from16 v17, v8

    .line 306
    .line 307
    new-array v8, v7, [LJ8/f;

    .line 308
    .line 309
    sget-object v18, LJ8/k$a;->b:LJ8/k$a;

    .line 310
    .line 311
    aput-object v18, v8, v16

    .line 312
    .line 313
    move/from16 v18, v7

    .line 314
    .line 315
    sget-object v7, LJ8/q;->g:LJ8/q;

    .line 316
    .line 317
    invoke-direct {v13, v9, v8, v7}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;)V

    .line 318
    .line 319
    .line 320
    new-instance v26, LJ8/h;

    .line 321
    .line 322
    sget-object v27, LJ8/t;->g:Lk8/f;

    .line 323
    .line 324
    new-array v7, v3, [LJ8/f;

    .line 325
    .line 326
    aput-object v0, v7, v16

    .line 327
    .line 328
    sget-object v8, LJ8/v$b;->d:LJ8/v$b;

    .line 329
    .line 330
    aput-object v8, v7, v18

    .line 331
    .line 332
    aput-object v19, v7, v17

    .line 333
    .line 334
    aput-object v4, v7, v5

    .line 335
    .line 336
    const/16 v30, 0x4

    .line 337
    .line 338
    const/16 v31, 0x0

    .line 339
    .line 340
    const/16 v29, 0x0

    .line 341
    .line 342
    move-object/from16 v28, v7

    .line 343
    .line 344
    invoke-direct/range {v26 .. v31}, LJ8/h;-><init>(Lk8/f;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 345
    .line 346
    .line 347
    new-instance v27, LJ8/h;

    .line 348
    .line 349
    sget-object v28, LJ8/t;->Z:Ljava/util/Set;

    .line 350
    .line 351
    new-array v7, v5, [LJ8/f;

    .line 352
    .line 353
    aput-object v0, v7, v16

    .line 354
    .line 355
    aput-object v19, v7, v18

    .line 356
    .line 357
    aput-object v4, v7, v17

    .line 358
    .line 359
    const/16 v31, 0x4

    .line 360
    .line 361
    const/16 v32, 0x0

    .line 362
    .line 363
    const/16 v30, 0x0

    .line 364
    .line 365
    move-object/from16 v29, v7

    .line 366
    .line 367
    invoke-direct/range {v27 .. v32}, LJ8/h;-><init>(Ljava/util/Collection;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 368
    .line 369
    .line 370
    new-instance v28, LJ8/h;

    .line 371
    .line 372
    sget-object v29, LJ8/t;->Y:Ljava/util/Set;

    .line 373
    .line 374
    move/from16 v7, v17

    .line 375
    .line 376
    new-array v8, v7, [LJ8/f;

    .line 377
    .line 378
    aput-object v0, v8, v16

    .line 379
    .line 380
    aput-object v14, v8, v18

    .line 381
    .line 382
    const/16 v32, 0x4

    .line 383
    .line 384
    const/16 v33, 0x0

    .line 385
    .line 386
    const/16 v31, 0x0

    .line 387
    .line 388
    move-object/from16 v30, v8

    .line 389
    .line 390
    invoke-direct/range {v28 .. v33}, LJ8/h;-><init>(Ljava/util/Collection;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 391
    .line 392
    .line 393
    new-instance v7, LJ8/h;

    .line 394
    .line 395
    sget-object v8, LJ8/t;->x:Lk8/f;

    .line 396
    .line 397
    sget-object v9, LJ8/t;->y:Lk8/f;

    .line 398
    .line 399
    filled-new-array {v8, v9}, [Lk8/f;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    invoke-static {v8}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    move/from16 v9, v18

    .line 408
    .line 409
    move/from16 v18, v5

    .line 410
    .line 411
    new-array v5, v9, [LJ8/f;

    .line 412
    .line 413
    aput-object v0, v5, v16

    .line 414
    .line 415
    move/from16 v20, v9

    .line 416
    .line 417
    sget-object v9, LJ8/r;->g:LJ8/r;

    .line 418
    .line 419
    invoke-direct {v7, v8, v5, v9}, LJ8/h;-><init>(Ljava/util/Collection;[LJ8/f;Lkotlin/jvm/functions/Function1;)V

    .line 420
    .line 421
    .line 422
    new-instance v29, LJ8/h;

    .line 423
    .line 424
    sget-object v30, LJ8/t;->e0:Ljava/util/Set;

    .line 425
    .line 426
    new-array v3, v3, [LJ8/f;

    .line 427
    .line 428
    aput-object v0, v3, v16

    .line 429
    .line 430
    sget-object v5, LJ8/v$c;->d:LJ8/v$c;

    .line 431
    .line 432
    aput-object v5, v3, v20

    .line 433
    .line 434
    const/4 v5, 0x2

    .line 435
    aput-object v19, v3, v5

    .line 436
    .line 437
    aput-object v4, v3, v18

    .line 438
    .line 439
    const/16 v33, 0x4

    .line 440
    .line 441
    const/16 v34, 0x0

    .line 442
    .line 443
    const/16 v32, 0x0

    .line 444
    .line 445
    move-object/from16 v31, v3

    .line 446
    .line 447
    invoke-direct/range {v29 .. v34}, LJ8/h;-><init>(Ljava/util/Collection;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 448
    .line 449
    .line 450
    move-object/from16 v18, v29

    .line 451
    .line 452
    new-instance v19, LJ8/h;

    .line 453
    .line 454
    sget-object v30, LJ8/t;->p:LP8/o;

    .line 455
    .line 456
    new-array v3, v5, [LJ8/f;

    .line 457
    .line 458
    aput-object v0, v3, v16

    .line 459
    .line 460
    aput-object v14, v3, v20

    .line 461
    .line 462
    move-object/from16 v31, v3

    .line 463
    .line 464
    move-object/from16 v29, v19

    .line 465
    .line 466
    invoke-direct/range {v29 .. v34}, LJ8/h;-><init>(LP8/o;[LJ8/f;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 467
    .line 468
    .line 469
    move-object/from16 v17, v7

    .line 470
    .line 471
    move-object v3, v10

    .line 472
    move-object v4, v11

    .line 473
    move-object v5, v12

    .line 474
    move-object v7, v15

    .line 475
    move-object/from16 v8, v21

    .line 476
    .line 477
    move-object/from16 v9, v22

    .line 478
    .line 479
    move-object/from16 v10, v23

    .line 480
    .line 481
    move-object/from16 v11, v24

    .line 482
    .line 483
    move-object/from16 v12, v25

    .line 484
    .line 485
    move-object/from16 v14, v26

    .line 486
    .line 487
    move-object/from16 v15, v27

    .line 488
    .line 489
    move-object/from16 v16, v28

    .line 490
    .line 491
    filled-new-array/range {v1 .. v19}, [LJ8/h;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    sput-object v0, LJ8/s;->b:Ljava/util/List;

    .line 500
    .line 501
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ8/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic c(LL7/z;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LJ8/s;->f(LL7/z;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(LL7/z;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LJ8/s;->g(LL7/z;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(LL7/z;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LJ8/s;->i(LL7/z;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final f(LL7/z;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "$this$Checks"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LL7/a;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "getValueParameters(...)"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lj7/q;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, LL7/t0;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Ls8/e;->f(LL7/t0;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, LL7/t0;->f0()LC8/S;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    :cond_0
    if-nez v0, :cond_1

    .line 38
    .line 39
    const-string p0, "last parameter should not have a default value or be a vararg"

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method private static final g(LL7/z;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "$this$Checks"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LL7/z;->b()LL7/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "getContainingDeclaration(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LJ8/s;->h(LL7/m;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_4

    .line 20
    .line 21
    invoke-interface {p0}, LL7/z;->e()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "getOverriddenDescriptors(...)"

    .line 26
    .line 27
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, LL7/z;

    .line 52
    .line 53
    invoke-interface {v2}, LL7/z;->b()LL7/m;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, LJ8/s;->h(LL7/m;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    invoke-static {p0}, LL7/s;->c(LL7/z;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/4 v0, 0x0

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    :goto_1
    const/4 v0, 0x1

    .line 77
    :goto_2
    if-nez v0, :cond_6

    .line 78
    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v2, "must override \'\'equals()\'\' in Any"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-interface {p0}, LL7/z;->b()LL7/m;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v2}, Lo8/k;->g(LL7/m;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    sget-object v1, Ln8/n;->j:Ln8/n;

    .line 103
    .line 104
    invoke-interface {p0}, LL7/z;->b()LL7/m;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 109
    .line 110
    invoke-static {p0, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    check-cast p0, LL7/e;

    .line 114
    .line 115
    invoke-interface {p0}, LL7/e;->r()LC8/d0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v2, "getDefaultType(...)"

    .line 120
    .line 121
    invoke-static {p0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, LH8/d;->D(LC8/S;)LC8/S;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {v1, p0}, Ln8/n;->U(LC8/S;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v2, " or define \'\'equals(other: "

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p0, "): Boolean\'\'"

    .line 146
    .line 147
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    const-string v0, "toString(...)"

    .line 162
    .line 163
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_6
    const/4 p0, 0x0

    .line 168
    return-object p0
.end method

.method private static final h(LL7/m;)Z
    .locals 1

    .line 1
    instance-of v0, p0, LL7/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LL7/e;

    .line 6
    .line 7
    invoke-static {p0}, LI7/i;->a0(LL7/e;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private static final i(LL7/z;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "$this$Checks"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LL7/a;->a0()LL7/c0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, LL7/a;->h0()LL7/c0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    sget-object v1, LJ8/s;->a:LJ8/s;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-interface {p0}, LL7/a;->getReturnType()LC8/S;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, LL7/s0;->getType()LC8/S;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, "getType(...)"

    .line 32
    .line 33
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, LH8/d;->w(LC8/S;LC8/S;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v3, v2

    .line 42
    :goto_0
    if-nez v3, :cond_2

    .line 43
    .line 44
    invoke-direct {v1, p0, v0}, LJ8/s;->j(LL7/z;LL7/c0;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    :cond_2
    const/4 v2, 0x1

    .line 51
    :cond_3
    if-nez v2, :cond_4

    .line 52
    .line 53
    const-string p0, "receiver must be a supertype of the return type"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const/4 p0, 0x0

    .line 57
    return-object p0
.end method

.method private final j(LL7/z;LL7/c0;)Z
    .locals 2

    .line 1
    invoke-interface {p2}, LL7/c0;->getValue()Lw8/g;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "getValue(...)"

    .line 6
    .line 7
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v0, p2, Lw8/e;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    check-cast p2, Lw8/e;

    .line 17
    .line 18
    invoke-virtual {p2}, Lw8/e;->q()LL7/e;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2}, LL7/D;->J()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    invoke-static {p2}, Ls8/e;->n(LL7/h;)Lk8/b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    invoke-static {p2}, Ls8/e;->s(LL7/m;)LL7/H;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2, v0}, LL7/y;->c(LL7/H;Lk8/b;)LL7/h;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    instance-of v0, p2, LL7/l0;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    check-cast p2, LL7/l0;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const/4 p2, 0x0

    .line 52
    :goto_0
    if-nez p2, :cond_4

    .line 53
    .line 54
    return v1

    .line 55
    :cond_4
    invoke-interface {p1}, LL7/a;->getReturnType()LC8/S;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    invoke-interface {p2}, LL7/l0;->T()LC8/d0;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {p1, p2}, LH8/d;->w(LC8/S;LC8/S;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_5
    return v1
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, LJ8/s;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
