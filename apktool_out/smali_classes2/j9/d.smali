.class public final Lj9/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:Lj9/k$b;

.field private b:Lj9/k;

.field private c:I

.field private d:I

.field private e:I

.field private f:Le9/F;

.field private final g:Lj9/h;

.field private final h:Le9/a;

.field private final i:Lj9/e;

.field private final j:Le9/r;


# direct methods
.method public constructor <init>(Lj9/h;Le9/a;Lj9/e;Le9/r;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "address"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "call"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "eventListener"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lj9/d;->g:Lj9/h;

    .line 25
    .line 26
    iput-object p2, p0, Lj9/d;->h:Le9/a;

    .line 27
    .line 28
    iput-object p3, p0, Lj9/d;->i:Lj9/e;

    .line 29
    .line 30
    iput-object p4, p0, Lj9/d;->j:Le9/r;

    .line 31
    .line 32
    return-void
.end method

.method private final b(IIIIZ)Lj9/f;
    .locals 13

    .line 1
    iget-object v0, p0, Lj9/d;->i:Lj9/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj9/e;->s()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    iget-object v0, p0, Lj9/d;->i:Lj9/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Lj9/e;->l()Lj9/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v0, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v1, :cond_6

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    invoke-virtual {v1}, Lj9/f;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lj9/f;->A()Le9/F;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Le9/F;->a()Le9/a;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Le9/a;->l()Le9/u;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {p0, v4}, Lj9/d;->g(Le9/u;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v4, v3

    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    :goto_0
    iget-object v4, p0, Lj9/d;->i:Lj9/e;

    .line 52
    .line 53
    invoke-virtual {v4}, Lj9/e;->w()Ljava/net/Socket;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :goto_1
    sget-object v5, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit v1

    .line 60
    iget-object v5, p0, Lj9/d;->i:Lj9/e;

    .line 61
    .line 62
    invoke-virtual {v5}, Lj9/e;->l()Lj9/f;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v0, v2

    .line 72
    :goto_2
    if-eqz v0, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    const-string p1, "Check failed."

    .line 76
    .line 77
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_4
    if-eqz v4, :cond_5

    .line 84
    .line 85
    invoke-static {v4}, Lf9/c;->k(Ljava/net/Socket;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    iget-object v4, p0, Lj9/d;->j:Le9/r;

    .line 89
    .line 90
    iget-object v5, p0, Lj9/d;->i:Lj9/e;

    .line 91
    .line 92
    invoke-virtual {v4, v5, v1}, Le9/r;->l(Le9/e;Le9/j;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :goto_3
    monitor-exit v1

    .line 97
    throw p1

    .line 98
    :cond_6
    :goto_4
    iput v2, p0, Lj9/d;->c:I

    .line 99
    .line 100
    iput v2, p0, Lj9/d;->d:I

    .line 101
    .line 102
    iput v2, p0, Lj9/d;->e:I

    .line 103
    .line 104
    iget-object v1, p0, Lj9/d;->g:Lj9/h;

    .line 105
    .line 106
    iget-object v4, p0, Lj9/d;->h:Le9/a;

    .line 107
    .line 108
    iget-object v5, p0, Lj9/d;->i:Lj9/e;

    .line 109
    .line 110
    invoke-virtual {v1, v4, v5, v3, v2}, Lj9/h;->a(Le9/a;Lj9/e;Ljava/util/List;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    iget-object p1, p0, Lj9/d;->i:Lj9/e;

    .line 117
    .line 118
    invoke-virtual {p1}, Lj9/e;->l()Lj9/f;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p0, Lj9/d;->j:Le9/r;

    .line 126
    .line 127
    iget-object v0, p0, Lj9/d;->i:Lj9/e;

    .line 128
    .line 129
    invoke-virtual {p2, v0, p1}, Le9/r;->k(Le9/e;Le9/j;)V

    .line 130
    .line 131
    .line 132
    return-object p1

    .line 133
    :cond_7
    iget-object v1, p0, Lj9/d;->f:Le9/F;

    .line 134
    .line 135
    if-eqz v1, :cond_8

    .line 136
    .line 137
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iput-object v3, p0, Lj9/d;->f:Le9/F;

    .line 141
    .line 142
    :goto_5
    move-object v4, v3

    .line 143
    goto :goto_6

    .line 144
    :cond_8
    iget-object v1, p0, Lj9/d;->a:Lj9/k$b;

    .line 145
    .line 146
    if-eqz v1, :cond_9

    .line 147
    .line 148
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Lj9/k$b;->b()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_9

    .line 156
    .line 157
    iget-object v1, p0, Lj9/d;->a:Lj9/k$b;

    .line 158
    .line 159
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Lj9/k$b;->c()Le9/F;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    goto :goto_5

    .line 167
    :cond_9
    iget-object v1, p0, Lj9/d;->b:Lj9/k;

    .line 168
    .line 169
    if-nez v1, :cond_a

    .line 170
    .line 171
    new-instance v1, Lj9/k;

    .line 172
    .line 173
    iget-object v4, p0, Lj9/d;->h:Le9/a;

    .line 174
    .line 175
    iget-object v5, p0, Lj9/d;->i:Lj9/e;

    .line 176
    .line 177
    invoke-virtual {v5}, Lj9/e;->k()Le9/z;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v5}, Le9/z;->x()Lj9/i;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    iget-object v6, p0, Lj9/d;->i:Lj9/e;

    .line 186
    .line 187
    iget-object v7, p0, Lj9/d;->j:Le9/r;

    .line 188
    .line 189
    invoke-direct {v1, v4, v5, v6, v7}, Lj9/k;-><init>(Le9/a;Lj9/i;Le9/e;Le9/r;)V

    .line 190
    .line 191
    .line 192
    iput-object v1, p0, Lj9/d;->b:Lj9/k;

    .line 193
    .line 194
    :cond_a
    invoke-virtual {v1}, Lj9/k;->d()Lj9/k$b;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iput-object v1, p0, Lj9/d;->a:Lj9/k$b;

    .line 199
    .line 200
    invoke-virtual {v1}, Lj9/k$b;->a()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    iget-object v5, p0, Lj9/d;->i:Lj9/e;

    .line 205
    .line 206
    invoke-virtual {v5}, Lj9/e;->s()Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-nez v5, :cond_d

    .line 211
    .line 212
    iget-object v5, p0, Lj9/d;->g:Lj9/h;

    .line 213
    .line 214
    iget-object v6, p0, Lj9/d;->h:Le9/a;

    .line 215
    .line 216
    iget-object v7, p0, Lj9/d;->i:Lj9/e;

    .line 217
    .line 218
    invoke-virtual {v5, v6, v7, v4, v2}, Lj9/h;->a(Le9/a;Lj9/e;Ljava/util/List;Z)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_b

    .line 223
    .line 224
    iget-object p1, p0, Lj9/d;->i:Lj9/e;

    .line 225
    .line 226
    invoke-virtual {p1}, Lj9/e;->l()Lj9/f;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    iget-object p2, p0, Lj9/d;->j:Le9/r;

    .line 234
    .line 235
    iget-object v0, p0, Lj9/d;->i:Lj9/e;

    .line 236
    .line 237
    invoke-virtual {p2, v0, p1}, Le9/r;->k(Le9/e;Le9/j;)V

    .line 238
    .line 239
    .line 240
    return-object p1

    .line 241
    :cond_b
    invoke-virtual {v1}, Lj9/k$b;->c()Le9/F;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    :goto_6
    new-instance v5, Lj9/f;

    .line 246
    .line 247
    iget-object v2, p0, Lj9/d;->g:Lj9/h;

    .line 248
    .line 249
    invoke-direct {v5, v2, v1}, Lj9/f;-><init>(Lj9/h;Le9/F;)V

    .line 250
    .line 251
    .line 252
    iget-object v2, p0, Lj9/d;->i:Lj9/e;

    .line 253
    .line 254
    invoke-virtual {v2, v5}, Lj9/e;->y(Lj9/f;)V

    .line 255
    .line 256
    .line 257
    :try_start_1
    iget-object v11, p0, Lj9/d;->i:Lj9/e;

    .line 258
    .line 259
    iget-object v12, p0, Lj9/d;->j:Le9/r;

    .line 260
    .line 261
    move v6, p1

    .line 262
    move v7, p2

    .line 263
    move/from16 v8, p3

    .line 264
    .line 265
    move/from16 v9, p4

    .line 266
    .line 267
    move/from16 v10, p5

    .line 268
    .line 269
    invoke-virtual/range {v5 .. v12}, Lj9/f;->f(IIIIZLe9/e;Le9/r;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 270
    .line 271
    .line 272
    iget-object p1, p0, Lj9/d;->i:Lj9/e;

    .line 273
    .line 274
    invoke-virtual {p1, v3}, Lj9/e;->y(Lj9/f;)V

    .line 275
    .line 276
    .line 277
    iget-object p1, p0, Lj9/d;->i:Lj9/e;

    .line 278
    .line 279
    invoke-virtual {p1}, Lj9/e;->k()Le9/z;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-virtual {p1}, Le9/z;->x()Lj9/i;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-virtual {v5}, Lj9/f;->A()Le9/F;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    invoke-virtual {p1, p2}, Lj9/i;->a(Le9/F;)V

    .line 292
    .line 293
    .line 294
    iget-object p1, p0, Lj9/d;->g:Lj9/h;

    .line 295
    .line 296
    iget-object p2, p0, Lj9/d;->h:Le9/a;

    .line 297
    .line 298
    iget-object v2, p0, Lj9/d;->i:Lj9/e;

    .line 299
    .line 300
    invoke-virtual {p1, p2, v2, v4, v0}, Lj9/h;->a(Le9/a;Lj9/e;Ljava/util/List;Z)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-eqz p1, :cond_c

    .line 305
    .line 306
    iget-object p1, p0, Lj9/d;->i:Lj9/e;

    .line 307
    .line 308
    invoke-virtual {p1}, Lj9/e;->l()Lj9/f;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iput-object v1, p0, Lj9/d;->f:Le9/F;

    .line 316
    .line 317
    invoke-virtual {v5}, Lj9/f;->E()Ljava/net/Socket;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    invoke-static {p2}, Lf9/c;->k(Ljava/net/Socket;)V

    .line 322
    .line 323
    .line 324
    iget-object p2, p0, Lj9/d;->j:Le9/r;

    .line 325
    .line 326
    iget-object v0, p0, Lj9/d;->i:Lj9/e;

    .line 327
    .line 328
    invoke-virtual {p2, v0, p1}, Le9/r;->k(Le9/e;Le9/j;)V

    .line 329
    .line 330
    .line 331
    return-object p1

    .line 332
    :cond_c
    monitor-enter v5

    .line 333
    :try_start_2
    iget-object p1, p0, Lj9/d;->g:Lj9/h;

    .line 334
    .line 335
    invoke-virtual {p1, v5}, Lj9/h;->e(Lj9/f;)V

    .line 336
    .line 337
    .line 338
    iget-object p1, p0, Lj9/d;->i:Lj9/e;

    .line 339
    .line 340
    invoke-virtual {p1, v5}, Lj9/e;->c(Lj9/f;)V

    .line 341
    .line 342
    .line 343
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 344
    .line 345
    monitor-exit v5

    .line 346
    iget-object p1, p0, Lj9/d;->j:Le9/r;

    .line 347
    .line 348
    iget-object p2, p0, Lj9/d;->i:Lj9/e;

    .line 349
    .line 350
    invoke-virtual {p1, p2, v5}, Le9/r;->k(Le9/e;Le9/j;)V

    .line 351
    .line 352
    .line 353
    return-object v5

    .line 354
    :catchall_1
    move-exception v0

    .line 355
    move-object p1, v0

    .line 356
    monitor-exit v5

    .line 357
    throw p1

    .line 358
    :catchall_2
    move-exception v0

    .line 359
    move-object p1, v0

    .line 360
    iget-object p2, p0, Lj9/d;->i:Lj9/e;

    .line 361
    .line 362
    invoke-virtual {p2, v3}, Lj9/e;->y(Lj9/f;)V

    .line 363
    .line 364
    .line 365
    throw p1

    .line 366
    :cond_d
    new-instance p1, Ljava/io/IOException;

    .line 367
    .line 368
    const-string p2, "Canceled"

    .line 369
    .line 370
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw p1

    .line 374
    :cond_e
    new-instance p1, Ljava/io/IOException;

    .line 375
    .line 376
    const-string p2, "Canceled"

    .line 377
    .line 378
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw p1
.end method

.method private final c(IIIIZZ)Lj9/f;
    .locals 3

    .line 1
    :goto_0
    invoke-direct/range {p0 .. p5}, Lj9/d;->b(IIIIZ)Lj9/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p5

    .line 6
    move p5, p4

    .line 7
    move p4, p3

    .line 8
    move p3, p2

    .line 9
    move p2, p1

    .line 10
    move-object p1, p0

    .line 11
    invoke-virtual {v0, p6}, Lj9/f;->u(Z)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lj9/f;->z()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lj9/d;->f:Le9/F;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :goto_1
    move p1, p2

    .line 26
    move p2, p3

    .line 27
    move p3, p4

    .line 28
    move p4, p5

    .line 29
    move p5, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p1, Lj9/d;->a:Lj9/k$b;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Lj9/k$b;->b()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move v0, v2

    .line 42
    :goto_2
    if-eqz v0, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object v0, p1, Lj9/d;->b:Lj9/k;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Lj9/k;->b()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    :cond_4
    if-eqz v2, :cond_5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    new-instance p2, Ljava/io/IOException;

    .line 57
    .line 58
    const-string p3, "exhausted all routes"

    .line 59
    .line 60
    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p2
.end method

.method private final f()Le9/F;
    .locals 4

    .line 1
    iget v0, p0, Lj9/d;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-gt v0, v2, :cond_3

    .line 6
    .line 7
    iget v0, p0, Lj9/d;->d:I

    .line 8
    .line 9
    if-gt v0, v2, :cond_3

    .line 10
    .line 11
    iget v0, p0, Lj9/d;->e:I

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lj9/d;->i:Lj9/e;

    .line 17
    .line 18
    invoke-virtual {v0}, Lj9/e;->l()Lj9/f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    invoke-virtual {v0}, Lj9/f;->q()I

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-object v1

    .line 33
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lj9/f;->A()Le9/F;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Le9/F;->a()Le9/a;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Le9/a;->l()Le9/u;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v3, p0, Lj9/d;->h:Le9/a;

    .line 46
    .line 47
    invoke-virtual {v3}, Le9/a;->l()Le9/u;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v2, v3}, Lf9/c;->g(Le9/u;Le9/u;)Z

    .line 52
    .line 53
    .line 54
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-object v1

    .line 59
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Lj9/f;->A()Le9/F;

    .line 60
    .line 61
    .line 62
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    monitor-exit v0

    .line 64
    return-object v1

    .line 65
    :catchall_0
    move-exception v1

    .line 66
    monitor-exit v0

    .line 67
    throw v1

    .line 68
    :cond_3
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final a(Le9/z;Lk9/g;)Lk9/d;
    .locals 8

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "chain"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p2}, Lk9/g;->f()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p2}, Lk9/g;->h()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p2}, Lk9/g;->j()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p1}, Le9/z;->E()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p1}, Le9/z;->K()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {p2}, Lk9/g;->i()Le9/B;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Le9/B;->l()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "GET"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0
    :try_end_0
    .catch Lj9/j; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 45
    xor-int/lit8 v7, v0, 0x1

    .line 46
    .line 47
    move-object v1, p0

    .line 48
    :try_start_1
    invoke-direct/range {v1 .. v7}, Lj9/d;->c(IIIIZZ)Lj9/f;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p1, p2}, Lj9/f;->w(Le9/z;Lk9/g;)Lk9/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_1
    .catch Lj9/j; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    return-object p1

    .line 57
    :catch_0
    move-exception v0

    .line 58
    :goto_0
    move-object p1, v0

    .line 59
    goto :goto_2

    .line 60
    :catch_1
    move-exception v0

    .line 61
    :goto_1
    move-object p1, v0

    .line 62
    goto :goto_3

    .line 63
    :catch_2
    move-exception v0

    .line 64
    move-object v1, p0

    .line 65
    goto :goto_0

    .line 66
    :catch_3
    move-exception v0

    .line 67
    move-object v1, p0

    .line 68
    goto :goto_1

    .line 69
    :goto_2
    invoke-virtual {p0, p1}, Lj9/d;->h(Ljava/io/IOException;)V

    .line 70
    .line 71
    .line 72
    new-instance p2, Lj9/j;

    .line 73
    .line 74
    invoke-direct {p2, p1}, Lj9/j;-><init>(Ljava/io/IOException;)V

    .line 75
    .line 76
    .line 77
    throw p2

    .line 78
    :goto_3
    invoke-virtual {p1}, Lj9/j;->c()Ljava/io/IOException;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p0, p2}, Lj9/d;->h(Ljava/io/IOException;)V

    .line 83
    .line 84
    .line 85
    throw p1
.end method

.method public final d()Le9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lj9/d;->h:Le9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget v0, p0, Lj9/d;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lj9/d;->d:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lj9/d;->e:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    iget-object v0, p0, Lj9/d;->f:Le9/F;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    invoke-direct {p0}, Lj9/d;->f()Le9/F;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iput-object v0, p0, Lj9/d;->f:Le9/F;

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    iget-object v0, p0, Lj9/d;->a:Lj9/k$b;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v0}, Lj9/k$b;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    iget-object v0, p0, Lj9/d;->b:Lj9/k;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {v0}, Lj9/k;->b()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    return v0

    .line 50
    :cond_4
    return v1
.end method

.method public final g(Le9/u;)Z
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj9/d;->h:Le9/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Le9/a;->l()Le9/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Le9/u;->l()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Le9/u;->l()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Le9/u;->h()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0}, Le9/u;->h()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return p1
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lj9/d;->f:Le9/F;

    .line 8
    .line 9
    instance-of v0, p1, Lm9/n;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lm9/n;

    .line 15
    .line 16
    iget-object v0, v0, Lm9/n;->g:Lm9/b;

    .line 17
    .line 18
    sget-object v1, Lm9/b;->o:Lm9/b;

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget p1, p0, Lj9/d;->c:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    iput p1, p0, Lj9/d;->c:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    instance-of p1, p1, Lm9/a;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget p1, p0, Lj9/d;->d:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Lj9/d;->d:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget p1, p0, Lj9/d;->e:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput p1, p0, Lj9/d;->e:I

    .line 45
    .line 46
    return-void
.end method
