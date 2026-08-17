.class public final LG7/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LG7/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG7/n$a;,
        LG7/n$b;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:LG7/h;

.field private final c:Ljava/lang/reflect/Member;

.field private final d:LG7/n$a;

.field private final e:[LB7/c;

.field private final f:Z


# direct methods
.method public constructor <init>(LL7/b;LG7/h;Z)V
    .locals 10

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "oldCaller"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p3, p0, LG7/n;->a:Z

    .line 15
    .line 16
    instance-of v0, p2, LG7/i$h$c;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    invoke-interface {p1}, LL7/a;->h0()LL7/c0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, LL7/a;->a0()LL7/c0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, LL7/s0;->getType()LC8/S;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v0, v1

    .line 40
    :goto_0
    if-eqz v0, :cond_6

    .line 41
    .line 42
    invoke-static {v0}, Lo8/k;->i(LC8/S;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_6

    .line 47
    .line 48
    if-eqz p3, :cond_4

    .line 49
    .line 50
    invoke-interface {p1}, LL7/a;->i()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    const-string v3, "getValueParameters(...)"

    .line 55
    .line 56
    invoke-static {p3, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    :cond_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_6

    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, LL7/t0;

    .line 83
    .line 84
    invoke-interface {v3}, LL7/t0;->q0()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    :cond_4
    invoke-static {v0}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-static {p3}, LG7/o;->n(LC8/d0;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Ljava/util/ArrayList;

    .line 102
    .line 103
    const/16 v3, 0xa

    .line 104
    .line 105
    invoke-static {p3, v3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/lang/reflect/Method;

    .line 127
    .line 128
    move-object v4, p2

    .line 129
    check-cast v4, LG7/i$h$c;

    .line 130
    .line 131
    invoke-virtual {v4}, LG7/i$h$c;->g()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v3, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_5
    new-array p3, v2, [Ljava/lang/Object;

    .line 144
    .line 145
    invoke-interface {v0, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    new-instance v0, LG7/i$h$d;

    .line 150
    .line 151
    check-cast p2, LG7/i$h;

    .line 152
    .line 153
    invoke-virtual {p2}, LG7/i;->b()Ljava/lang/reflect/Member;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    check-cast p2, Ljava/lang/reflect/Method;

    .line 158
    .line 159
    invoke-direct {v0, p2, p3}, LG7/i$h$d;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move-object p2, v0

    .line 163
    :cond_6
    :goto_2
    iput-object p2, p0, LG7/n;->b:LG7/h;

    .line 164
    .line 165
    invoke-interface {p2}, LG7/h;->b()Ljava/lang/reflect/Member;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    iput-object p3, p0, LG7/n;->c:Ljava/lang/reflect/Member;

    .line 170
    .line 171
    invoke-interface {p1}, LL7/a;->getReturnType()LC8/S;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    instance-of v0, p1, LL7/z;

    .line 179
    .line 180
    const/4 v3, 0x1

    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    move-object v4, p1

    .line 184
    check-cast v4, LL7/z;

    .line 185
    .line 186
    invoke-interface {v4}, LL7/z;->isSuspend()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_8

    .line 191
    .line 192
    invoke-static {p3}, Lo8/k;->j(LC8/S;)LC8/S;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    if-eqz v4, :cond_8

    .line 197
    .line 198
    invoke-static {v4}, LI7/i;->s0(LC8/S;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-ne v4, v3, :cond_8

    .line 203
    .line 204
    :cond_7
    move-object p3, v1

    .line 205
    goto :goto_3

    .line 206
    :cond_8
    invoke-static {p3}, LG7/o;->f(LC8/S;)Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    if-eqz p3, :cond_7

    .line 211
    .line 212
    invoke-static {p3, p1}, LG7/o;->c(Ljava/lang/Class;LL7/b;)Ljava/lang/reflect/Method;

    .line 213
    .line 214
    .line 215
    move-result-object p3

    .line 216
    :goto_3
    invoke-static {p1}, Lo8/k;->a(LL7/a;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_9

    .line 221
    .line 222
    new-instance p1, LG7/n$a;

    .line 223
    .line 224
    sget-object p2, LB7/c;->k:LB7/c$a;

    .line 225
    .line 226
    invoke-virtual {p2}, LB7/c$a;->a()LB7/c;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    new-array v0, v2, [Ljava/util/List;

    .line 231
    .line 232
    invoke-direct {p1, p2, v0, p3}, LG7/n$a;-><init>(LB7/c;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_d

    .line 236
    .line 237
    :cond_9
    instance-of v4, p2, LG7/i$h$c;

    .line 238
    .line 239
    const/4 v5, -0x1

    .line 240
    if-nez v4, :cond_e

    .line 241
    .line 242
    instance-of v4, p2, LG7/i$h$d;

    .line 243
    .line 244
    if-eqz v4, :cond_a

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_a
    instance-of v4, p1, LL7/l;

    .line 248
    .line 249
    if-eqz v4, :cond_c

    .line 250
    .line 251
    instance-of v4, p2, LG7/g;

    .line 252
    .line 253
    if-eqz v4, :cond_b

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_b
    :goto_4
    move v5, v2

    .line 257
    goto :goto_5

    .line 258
    :cond_c
    invoke-interface {p1}, LL7/a;->a0()LL7/c0;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    if-eqz v4, :cond_b

    .line 263
    .line 264
    instance-of v4, p2, LG7/g;

    .line 265
    .line 266
    if-nez v4, :cond_b

    .line 267
    .line 268
    invoke-interface {p1}, LL7/n;->b()LL7/m;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    const-string v5, "getContainingDeclaration(...)"

    .line 273
    .line 274
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v4}, Lo8/k;->g(LL7/m;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_d

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_d
    move v5, v3

    .line 285
    :cond_e
    :goto_5
    instance-of v4, p2, LG7/i$h$d;

    .line 286
    .line 287
    if-eqz v4, :cond_f

    .line 288
    .line 289
    move-object v4, p2

    .line 290
    check-cast v4, LG7/i$h$d;

    .line 291
    .line 292
    invoke-virtual {v4}, LG7/i$h$d;->h()I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    neg-int v4, v4

    .line 297
    goto :goto_6

    .line 298
    :cond_f
    move v4, v5

    .line 299
    :goto_6
    invoke-interface {p2}, LG7/h;->b()Ljava/lang/reflect/Member;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    sget-object v6, LG7/m;->g:LG7/m;

    .line 304
    .line 305
    invoke-static {p1, p2, v6}, LG7/o;->e(LL7/b;Ljava/lang/reflect/Member;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    iget-boolean v6, p0, LG7/n;->a:Z

    .line 310
    .line 311
    if-eqz v6, :cond_11

    .line 312
    .line 313
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    move v7, v2

    .line 318
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    if-eqz v8, :cond_10

    .line 323
    .line 324
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    check-cast v8, LC8/S;

    .line 329
    .line 330
    invoke-static {v8}, LG7/n;->e(LC8/S;)I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    add-int/2addr v7, v8

    .line 335
    goto :goto_7

    .line 336
    :cond_10
    add-int/lit8 v7, v7, 0x1f

    .line 337
    .line 338
    div-int/lit8 v7, v7, 0x20

    .line 339
    .line 340
    add-int/2addr v7, v3

    .line 341
    goto :goto_8

    .line 342
    :cond_11
    move v7, v2

    .line 343
    :goto_8
    if-eqz v0, :cond_12

    .line 344
    .line 345
    move-object v0, p1

    .line 346
    check-cast v0, LL7/z;

    .line 347
    .line 348
    invoke-interface {v0}, LL7/z;->isSuspend()Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_12

    .line 353
    .line 354
    move v0, v3

    .line 355
    goto :goto_9

    .line 356
    :cond_12
    move v0, v2

    .line 357
    :goto_9
    add-int/2addr v7, v0

    .line 358
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    move v6, v2

    .line 363
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    if-eqz v8, :cond_13

    .line 368
    .line 369
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    check-cast v8, LC8/S;

    .line 374
    .line 375
    invoke-static {v8}, LG7/n;->e(LC8/S;)I

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    add-int/2addr v6, v8

    .line 380
    goto :goto_a

    .line 381
    :cond_13
    add-int/2addr v6, v4

    .line 382
    add-int/2addr v6, v7

    .line 383
    iget-boolean v0, p0, LG7/n;->a:Z

    .line 384
    .line 385
    invoke-static {p0, v6, p1, v0}, LG7/o;->b(LG7/h;ILL7/b;Z)V

    .line 386
    .line 387
    .line 388
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    add-int/2addr v4, v5

    .line 397
    invoke-static {v0, v4}, LB7/d;->p(II)LB7/c;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    new-array v4, v6, [Ljava/util/List;

    .line 402
    .line 403
    move v7, v2

    .line 404
    :goto_b
    if-ge v7, v6, :cond_15

    .line 405
    .line 406
    invoke-virtual {v0}, LB7/a;->d()I

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    invoke-virtual {v0}, LB7/a;->o()I

    .line 411
    .line 412
    .line 413
    move-result v9

    .line 414
    if-gt v7, v9, :cond_14

    .line 415
    .line 416
    if-gt v8, v7, :cond_14

    .line 417
    .line 418
    sub-int v8, v7, v5

    .line 419
    .line 420
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    check-cast v8, LC8/S;

    .line 425
    .line 426
    invoke-static {v8}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-static {v8, p1}, LG7/o;->d(LC8/d0;LL7/b;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    goto :goto_c

    .line 435
    :cond_14
    move-object v8, v1

    .line 436
    :goto_c
    aput-object v8, v4, v7

    .line 437
    .line 438
    add-int/lit8 v7, v7, 0x1

    .line 439
    .line 440
    goto :goto_b

    .line 441
    :cond_15
    new-instance p1, LG7/n$a;

    .line 442
    .line 443
    invoke-direct {p1, v0, v4, p3}, LG7/n$a;-><init>(LB7/c;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    .line 444
    .line 445
    .line 446
    :goto_d
    iput-object p1, p0, LG7/n;->d:LG7/n$a;

    .line 447
    .line 448
    invoke-static {}, Lj7/q;->c()Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object p2

    .line 452
    iget-object p3, p0, LG7/n;->b:LG7/h;

    .line 453
    .line 454
    instance-of v0, p3, LG7/i$h$d;

    .line 455
    .line 456
    if-eqz v0, :cond_16

    .line 457
    .line 458
    check-cast p3, LG7/i$h$d;

    .line 459
    .line 460
    invoke-virtual {p3}, LG7/i$h$d;->g()[Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p3

    .line 464
    array-length p3, p3

    .line 465
    goto :goto_e

    .line 466
    :cond_16
    instance-of p3, p3, LG7/i$h$c;

    .line 467
    .line 468
    if-eqz p3, :cond_17

    .line 469
    .line 470
    move p3, v3

    .line 471
    goto :goto_e

    .line 472
    :cond_17
    move p3, v2

    .line 473
    :goto_e
    if-lez p3, :cond_18

    .line 474
    .line 475
    invoke-static {v2, p3}, LB7/d;->p(II)LB7/c;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    :cond_18
    invoke-virtual {p1}, LG7/n$a;->c()[Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    array-length v0, p1

    .line 487
    move v1, v2

    .line 488
    :goto_f
    if-ge v1, v0, :cond_1a

    .line 489
    .line 490
    aget-object v4, p1, v1

    .line 491
    .line 492
    if-eqz v4, :cond_19

    .line 493
    .line 494
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    goto :goto_10

    .line 499
    :cond_19
    move v4, v3

    .line 500
    :goto_10
    add-int/2addr v4, p3

    .line 501
    invoke-static {p3, v4}, LB7/d;->p(II)LB7/c;

    .line 502
    .line 503
    .line 504
    move-result-object p3

    .line 505
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    add-int/lit8 v1, v1, 0x1

    .line 509
    .line 510
    move p3, v4

    .line 511
    goto :goto_f

    .line 512
    :cond_1a
    invoke-static {p2}, Lj7/q;->a(Ljava/util/List;)Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    new-array p2, v2, [LB7/c;

    .line 517
    .line 518
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    check-cast p1, [LB7/c;

    .line 523
    .line 524
    iput-object p1, p0, LG7/n;->e:[LB7/c;

    .line 525
    .line 526
    iget-object p1, p0, LG7/n;->d:LG7/n$a;

    .line 527
    .line 528
    invoke-virtual {p1}, LG7/n$a;->a()LB7/c;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    instance-of p2, p1, Ljava/util/Collection;

    .line 533
    .line 534
    if-eqz p2, :cond_1b

    .line 535
    .line 536
    move-object p2, p1

    .line 537
    check-cast p2, Ljava/util/Collection;

    .line 538
    .line 539
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 540
    .line 541
    .line 542
    move-result p2

    .line 543
    if-eqz p2, :cond_1b

    .line 544
    .line 545
    goto :goto_12

    .line 546
    :cond_1b
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    :cond_1c
    :goto_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 551
    .line 552
    .line 553
    move-result p2

    .line 554
    if-eqz p2, :cond_1e

    .line 555
    .line 556
    move-object p2, p1

    .line 557
    check-cast p2, Lj7/J;

    .line 558
    .line 559
    invoke-virtual {p2}, Lj7/J;->nextInt()I

    .line 560
    .line 561
    .line 562
    move-result p2

    .line 563
    iget-object p3, p0, LG7/n;->d:LG7/n$a;

    .line 564
    .line 565
    invoke-virtual {p3}, LG7/n$a;->c()[Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object p3

    .line 569
    aget-object p2, p3, p2

    .line 570
    .line 571
    if-nez p2, :cond_1d

    .line 572
    .line 573
    goto :goto_11

    .line 574
    :cond_1d
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 575
    .line 576
    .line 577
    move-result p2

    .line 578
    if-le p2, v3, :cond_1c

    .line 579
    .line 580
    move v2, v3

    .line 581
    :cond_1e
    :goto_12
    iput-boolean v2, p0, LG7/n;->f:Z

    .line 582
    .line 583
    return-void
.end method

.method static synthetic c(LL7/e;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LG7/n;->d(LL7/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final d(LL7/e;)Z
    .locals 1

    .line 1
    const-string v0, "$this$makeKotlinParameterTypes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lo8/k;->g(LL7/m;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final e(LC8/S;)I
    .locals 0

    .line 1
    invoke-static {p0}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LG7/o;->n(LC8/d0;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LG7/n;->b:LG7/h;

    .line 2
    .line 3
    invoke-interface {v0}, LG7/h;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Ljava/lang/reflect/Member;
    .locals 1

    .line 1
    iget-object v0, p0, LG7/n;->c:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    return-object v0
.end method

.method public call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG7/n;->d:LG7/n$a;

    .line 7
    .line 8
    invoke-virtual {v0}, LG7/n$a;->a()LB7/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LG7/n;->d:LG7/n$a;

    .line 13
    .line 14
    invoke-virtual {v1}, LG7/n$a;->c()[Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, LG7/n;->d:LG7/n$a;

    .line 19
    .line 20
    invoke-virtual {v2}, LG7/n$a;->b()Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0}, LB7/c;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto/16 :goto_8

    .line 32
    .line 33
    :cond_0
    iget-boolean v3, p0, LG7/n;->f:Z

    .line 34
    .line 35
    const-string v5, "getReturnType(...)"

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v3, :cond_7

    .line 39
    .line 40
    array-length v3, p1

    .line 41
    invoke-static {v3}, Lj7/q;->d(I)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v0}, LB7/a;->d()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    move v8, v6

    .line 50
    :goto_0
    if-ge v8, v7, :cond_1

    .line 51
    .line 52
    aget-object v9, p1, v8

    .line 53
    .line 54
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v8, v8, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v0}, LB7/a;->d()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-virtual {v0}, LB7/a;->o()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-gt v7, v8, :cond_5

    .line 69
    .line 70
    :goto_1
    aget-object v9, v1, v7

    .line 71
    .line 72
    aget-object v10, p1, v7

    .line 73
    .line 74
    if-eqz v9, :cond_3

    .line 75
    .line 76
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_4

    .line 85
    .line 86
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    check-cast v11, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    if-eqz v10, :cond_2

    .line 93
    .line 94
    invoke-virtual {v11, v10, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    goto :goto_3

    .line 99
    :cond_2
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v11}, LF7/j1;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    :goto_3
    invoke-interface {v3, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_4
    if-eq v7, v8, :cond_5

    .line 118
    .line 119
    add-int/lit8 v7, v7, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    invoke-virtual {v0}, LB7/a;->o()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    add-int/lit8 v0, v0, 0x1

    .line 127
    .line 128
    invoke-static {p1}, Lj7/j;->K([Ljava/lang/Object;)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-gt v0, v1, :cond_6

    .line 133
    .line 134
    :goto_4
    aget-object v5, p1, v0

    .line 135
    .line 136
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    if-eq v0, v1, :cond_6

    .line 140
    .line 141
    add-int/lit8 v0, v0, 0x1

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_6
    invoke-static {v3}, Lj7/q;->a(Ljava/util/List;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-array v0, v6, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    goto :goto_8

    .line 155
    :cond_7
    array-length v3, p1

    .line 156
    new-array v7, v3, [Ljava/lang/Object;

    .line 157
    .line 158
    :goto_5
    if-ge v6, v3, :cond_c

    .line 159
    .line 160
    invoke-virtual {v0}, LB7/a;->d()I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    invoke-virtual {v0}, LB7/a;->o()I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-gt v6, v9, :cond_b

    .line 169
    .line 170
    if-gt v8, v6, :cond_b

    .line 171
    .line 172
    aget-object v8, v1, v6

    .line 173
    .line 174
    if-eqz v8, :cond_8

    .line 175
    .line 176
    invoke-static {v8}, Lj7/q;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    check-cast v8, Ljava/lang/reflect/Method;

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_8
    move-object v8, v4

    .line 184
    :goto_6
    aget-object v9, p1, v6

    .line 185
    .line 186
    if-nez v8, :cond_9

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_9
    if-eqz v9, :cond_a

    .line 190
    .line 191
    invoke-virtual {v8, v9, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    goto :goto_7

    .line 196
    :cond_a
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    invoke-static {v8, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v8}, LF7/j1;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    goto :goto_7

    .line 208
    :cond_b
    aget-object v9, p1, v6

    .line 209
    .line 210
    :goto_7
    aput-object v9, v7, v6

    .line 211
    .line 212
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_c
    move-object p1, v7

    .line 216
    :goto_8
    iget-object v0, p0, LG7/n;->b:LG7/h;

    .line 217
    .line 218
    invoke-interface {v0, p1}, LG7/h;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne p1, v0, :cond_d

    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_d
    if-eqz v2, :cond_f

    .line 230
    .line 231
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-nez v0, :cond_e

    .line 240
    .line 241
    goto :goto_9

    .line 242
    :cond_e
    return-object v0

    .line 243
    :cond_f
    :goto_9
    return-object p1
.end method

.method public final f(I)LB7/c;
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LG7/n;->e:[LB7/c;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-ge p1, v1, :cond_0

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object v0, p0, LG7/n;->e:[LB7/c;

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v0, LB7/c;

    .line 17
    .line 18
    invoke-direct {v0, p1, p1}, LB7/c;-><init>(II)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    array-length v1, v0

    .line 23
    sub-int/2addr p1, v1

    .line 24
    invoke-static {v0}, Lj7/j;->b0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, LB7/c;

    .line 29
    .line 30
    invoke-virtual {v0}, LB7/a;->o()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    add-int/2addr p1, v0

    .line 37
    new-instance v0, LB7/c;

    .line 38
    .line 39
    invoke-direct {v0, p1, p1}, LB7/c;-><init>(II)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public getReturnType()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, LG7/n;->b:LG7/h;

    .line 2
    .line 3
    invoke-interface {v0}, LG7/h;->getReturnType()Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
