.class public final LA8/m;
.super LO7/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LL7/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA8/m$a;,
        LA8/m$b;,
        LA8/m$c;
    }
.end annotation


# instance fields
.field private final A:LB8/i;

.field private final B:LB8/j;

.field private final C:LB8/i;

.field private final D:LB8/j;

.field private final E:Ly8/N$a;

.field private final F:LM7/h;

.field private final l:Lf8/c;

.field private final m:Lh8/a;

.field private final n:LL7/h0;

.field private final o:Lk8/b;

.field private final p:LL7/E;

.field private final q:LL7/u;

.field private final r:LL7/f;

.field private final s:Ly8/p;

.field private final t:Z

.field private final u:Lv8/l;

.field private final v:LA8/m$b;

.field private final w:LL7/f0;

.field private final x:LA8/m$c;

.field private final y:LL7/m;

.field private final z:LB8/j;


# direct methods
.method public constructor <init>(Ly8/p;Lf8/c;Lh8/c;Lh8/a;LL7/h0;)V
    .locals 9

    .line 1
    const-string v0, "outerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classProto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "nameResolver"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "metadataVersion"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "sourceElement"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2}, Lf8/c;->E0()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p3, v1}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lk8/b;->h()Lk8/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {p0, v0, v1}, LO7/a;-><init>(LB8/n;Lk8/f;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, LA8/m;->l:Lf8/c;

    .line 46
    .line 47
    iput-object p4, p0, LA8/m;->m:Lh8/a;

    .line 48
    .line 49
    iput-object p5, p0, LA8/m;->n:LL7/h0;

    .line 50
    .line 51
    invoke-virtual {p2}, Lf8/c;->E0()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {p3, v0}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, LA8/m;->o:Lk8/b;

    .line 60
    .line 61
    sget-object v0, Ly8/O;->a:Ly8/O;

    .line 62
    .line 63
    sget-object v1, Lh8/b;->e:Lh8/b$d;

    .line 64
    .line 65
    invoke-virtual {p2}, Lf8/c;->D0()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {v1, v2}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Lf8/k;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ly8/O;->b(Lf8/k;)LL7/E;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, LA8/m;->p:LL7/E;

    .line 80
    .line 81
    sget-object v1, Lh8/b;->d:Lh8/b$d;

    .line 82
    .line 83
    invoke-virtual {p2}, Lf8/c;->D0()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v1, v2}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lf8/x;

    .line 92
    .line 93
    invoke-static {v0, v1}, Ly8/P;->a(Ly8/O;Lf8/x;)LL7/u;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, LA8/m;->q:LL7/u;

    .line 98
    .line 99
    sget-object v1, Lh8/b;->f:Lh8/b$d;

    .line 100
    .line 101
    invoke-virtual {p2}, Lf8/c;->D0()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {v1, v2}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Lf8/c$c;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ly8/O;->a(Lf8/c$c;)LL7/f;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, LA8/m;->r:LL7/f;

    .line 116
    .line 117
    invoke-virtual {p2}, Lf8/c;->g1()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v1, "getTypeParameterList(...)"

    .line 122
    .line 123
    invoke-static {v3, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v5, Lh8/g;

    .line 127
    .line 128
    invoke-virtual {p2}, Lf8/c;->h1()Lf8/t;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "getTypeTable(...)"

    .line 133
    .line 134
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v5, v1}, Lh8/g;-><init>(Lf8/t;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, Lh8/h;->b:Lh8/h$a;

    .line 141
    .line 142
    invoke-virtual {p2}, Lf8/c;->j1()Lf8/w;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v4, "getVersionRequirementTable(...)"

    .line 147
    .line 148
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Lh8/h$a;->a(Lf8/w;)Lh8/h;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    move-object v2, p0

    .line 156
    move-object v1, p1

    .line 157
    move-object v4, p3

    .line 158
    move-object v7, p4

    .line 159
    invoke-virtual/range {v1 .. v7}, Ly8/p;->a(LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;)Ly8/p;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iput-object p1, v2, LA8/m;->s:Ly8/p;

    .line 164
    .line 165
    sget-object p3, Lh8/b;->m:Lh8/b$b;

    .line 166
    .line 167
    invoke-virtual {p2}, Lf8/c;->D0()I

    .line 168
    .line 169
    .line 170
    move-result p4

    .line 171
    invoke-virtual {p3, p4}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    const-string p4, "get(...)"

    .line 176
    .line 177
    invoke-static {p3, p4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result p3

    .line 184
    iput-boolean p3, v2, LA8/m;->t:Z

    .line 185
    .line 186
    sget-object p4, LL7/f;->j:LL7/f;

    .line 187
    .line 188
    if-ne v0, p4, :cond_2

    .line 189
    .line 190
    if-nez p3, :cond_1

    .line 191
    .line 192
    invoke-virtual {p1}, Ly8/p;->c()Ly8/n;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    invoke-virtual {p3}, Ly8/n;->i()Ly8/v;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    invoke-interface {p3}, Ly8/v;->a()Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-static {p3, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    if-eqz p3, :cond_0

    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_0
    const/4 p3, 0x0

    .line 214
    goto :goto_1

    .line 215
    :cond_1
    :goto_0
    const/4 p3, 0x1

    .line 216
    :goto_1
    new-instance v3, Lv8/q;

    .line 217
    .line 218
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-direct {v3, v4, p0, p3}, Lv8/q;-><init>(LB8/n;LL7/e;Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_2
    sget-object v3, Lv8/k$b;->b:Lv8/k$b;

    .line 227
    .line 228
    :goto_2
    iput-object v3, v2, LA8/m;->u:Lv8/l;

    .line 229
    .line 230
    new-instance p3, LA8/m$b;

    .line 231
    .line 232
    invoke-direct {p3, p0}, LA8/m$b;-><init>(LA8/m;)V

    .line 233
    .line 234
    .line 235
    iput-object p3, v2, LA8/m;->v:LA8/m$b;

    .line 236
    .line 237
    sget-object p3, LL7/f0;->e:LL7/f0$a;

    .line 238
    .line 239
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {p1}, Ly8/p;->c()Ly8/n;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-virtual {v4}, Ly8/n;->n()LD8/p;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-interface {v4}, LD8/p;->d()LD8/g;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    new-instance v5, LA8/m$f;

    .line 256
    .line 257
    invoke-direct {v5, p0}, LA8/m$f;-><init>(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p3, p0, v3, v4, v5}, LL7/f0$a;->a(LL7/e;LB8/n;LD8/g;Lkotlin/jvm/functions/Function1;)LL7/f0;

    .line 261
    .line 262
    .line 263
    move-result-object p3

    .line 264
    iput-object p3, v2, LA8/m;->w:LL7/f0;

    .line 265
    .line 266
    const/4 p3, 0x0

    .line 267
    if-ne v0, p4, :cond_3

    .line 268
    .line 269
    new-instance p4, LA8/m$c;

    .line 270
    .line 271
    invoke-direct {p4, p0}, LA8/m$c;-><init>(LA8/m;)V

    .line 272
    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_3
    move-object p4, p3

    .line 276
    :goto_3
    iput-object p4, v2, LA8/m;->x:LA8/m$c;

    .line 277
    .line 278
    invoke-virtual {v1}, Ly8/p;->e()LL7/m;

    .line 279
    .line 280
    .line 281
    move-result-object p4

    .line 282
    iput-object p4, v2, LA8/m;->y:LL7/m;

    .line 283
    .line 284
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    new-instance v1, LA8/d;

    .line 289
    .line 290
    invoke-direct {v1, p0}, LA8/d;-><init>(LA8/m;)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v0, v1}, LB8/n;->g(Lw7/a;)LB8/j;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    iput-object v0, v2, LA8/m;->z:LB8/j;

    .line 298
    .line 299
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v1, LA8/e;

    .line 304
    .line 305
    invoke-direct {v1, p0}, LA8/e;-><init>(LA8/m;)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v0, v1}, LB8/n;->e(Lw7/a;)LB8/i;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    iput-object v0, v2, LA8/m;->A:LB8/i;

    .line 313
    .line 314
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    new-instance v1, LA8/f;

    .line 319
    .line 320
    invoke-direct {v1, p0}, LA8/f;-><init>(LA8/m;)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v0, v1}, LB8/n;->g(Lw7/a;)LB8/j;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iput-object v0, v2, LA8/m;->B:LB8/j;

    .line 328
    .line 329
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v1, LA8/g;

    .line 334
    .line 335
    invoke-direct {v1, p0}, LA8/g;-><init>(LA8/m;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v0, v1}, LB8/n;->e(Lw7/a;)LB8/i;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iput-object v0, v2, LA8/m;->C:LB8/i;

    .line 343
    .line 344
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    new-instance v1, LA8/h;

    .line 349
    .line 350
    invoke-direct {v1, p0}, LA8/h;-><init>(LA8/m;)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v0, v1}, LB8/n;->g(Lw7/a;)LB8/j;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iput-object v0, v2, LA8/m;->D:LB8/j;

    .line 358
    .line 359
    new-instance v3, Ly8/N$a;

    .line 360
    .line 361
    invoke-virtual {p1}, Ly8/p;->g()Lh8/c;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-virtual {p1}, Ly8/p;->j()Lh8/g;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    instance-of v0, p4, LA8/m;

    .line 370
    .line 371
    if-eqz v0, :cond_4

    .line 372
    .line 373
    check-cast p4, LA8/m;

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_4
    move-object p4, p3

    .line 377
    :goto_4
    if-eqz p4, :cond_5

    .line 378
    .line 379
    iget-object p3, p4, LA8/m;->E:Ly8/N$a;

    .line 380
    .line 381
    :cond_5
    move-object v4, p2

    .line 382
    move-object v8, p3

    .line 383
    move-object v7, p5

    .line 384
    invoke-direct/range {v3 .. v8}, Ly8/N$a;-><init>(Lf8/c;Lh8/c;Lh8/g;LL7/h0;Ly8/N$a;)V

    .line 385
    .line 386
    .line 387
    iput-object v3, v2, LA8/m;->E:Ly8/N$a;

    .line 388
    .line 389
    sget-object p2, Lh8/b;->c:Lh8/b$b;

    .line 390
    .line 391
    invoke-virtual {v4}, Lf8/c;->D0()I

    .line 392
    .line 393
    .line 394
    move-result p3

    .line 395
    invoke-virtual {p2, p3}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object p2

    .line 399
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 400
    .line 401
    .line 402
    move-result p2

    .line 403
    if-nez p2, :cond_6

    .line 404
    .line 405
    sget-object p1, LM7/h;->a:LM7/h$a;

    .line 406
    .line 407
    invoke-virtual {p1}, LM7/h$a;->b()LM7/h;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    goto :goto_5

    .line 412
    :cond_6
    new-instance p2, LA8/T;

    .line 413
    .line 414
    invoke-virtual {p1}, Ly8/p;->h()LB8/n;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    new-instance p3, LA8/i;

    .line 419
    .line 420
    invoke-direct {p3, p0}, LA8/i;-><init>(LA8/m;)V

    .line 421
    .line 422
    .line 423
    invoke-direct {p2, p1, p3}, LA8/T;-><init>(LB8/n;Lw7/a;)V

    .line 424
    .line 425
    .line 426
    move-object p1, p2

    .line 427
    :goto_5
    iput-object p1, v2, LA8/m;->F:LM7/h;

    .line 428
    .line 429
    return-void
.end method

.method public static final synthetic H0(LA8/m;)Lk8/b;
    .locals 0

    .line 1
    iget-object p0, p0, LA8/m;->o:Lk8/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I0(LA8/m;)LA8/m$c;
    .locals 0

    .line 1
    iget-object p0, p0, LA8/m;->x:LA8/m$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J0(LA8/m;)LA8/m$b;
    .locals 0

    .line 1
    iget-object p0, p0, LA8/m;->v:LA8/m$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K0(LA8/m;Lk8/f;)LC8/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LA8/m;->g1(Lk8/f;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic L0(LA8/m;)LL7/d;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/m;->i1(LA8/m;)LL7/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic M0(LA8/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/m;->Z0(LA8/m;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic N0(LA8/m;)LL7/e;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/m;->S0(LA8/m;)LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic O0(LA8/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/m;->j1(LA8/m;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic P0(LA8/m;)LL7/r0;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/m;->k1(LA8/m;)LL7/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic Q0(LA8/m;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/m;->R0(LA8/m;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final R0(LA8/m;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->s:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->c()Ly8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ly8/n;->d()Ly8/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, LA8/m;->E:Ly8/N$a;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ly8/h;->d(Ly8/N$a;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static final S0(LA8/m;)LL7/e;
    .locals 0

    .line 1
    invoke-direct {p0}, LA8/m;->T0()LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final T0()LL7/e;
    .locals 4

    .line 1
    iget-object v0, p0, LA8/m;->l:Lf8/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf8/c;->k1()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    iget-object v0, p0, LA8/m;->s:Ly8/p;

    .line 12
    .line 13
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, LA8/m;->l:Lf8/c;

    .line 18
    .line 19
    invoke-virtual {v2}, Lf8/c;->q0()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v0, v2}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p0}, LA8/m;->c1()LA8/m$a;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, LT7/d;->x:LT7/d;

    .line 32
    .line 33
    invoke-virtual {v2, v0, v3}, LA8/m$a;->f(Lk8/f;LT7/b;)LL7/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v2, v0, LL7/e;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    check-cast v0, LL7/e;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    return-object v1
.end method

.method private final U0()Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-direct {p0}, LA8/m;->W0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LA8/m;->O()LL7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lj7/q;->n(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lj7/q;->z0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, LA8/m;->s:Ly8/p;

    .line 18
    .line 19
    invoke-virtual {v1}, Ly8/p;->c()Ly8/n;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ly8/n;->c()LN7/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1, p0}, LN7/a;->b(LL7/e;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lj7/q;->z0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method private final V0()LL7/d;
    .locals 5

    .line 1
    iget-object v0, p0, LA8/m;->r:LL7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LL7/f;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LL7/h0;->a:LL7/h0;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lo8/h;->l(LL7/e;LL7/h0;)LO7/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, LO7/a;->r()LC8/d0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, LO7/s;->d1(LC8/S;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-object v0, p0, LA8/m;->l:Lf8/c;

    .line 24
    .line 25
    invoke-virtual {v0}, Lf8/c;->t0()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "getConstructorList(...)"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v3, v1

    .line 50
    check-cast v3, Lf8/d;

    .line 51
    .line 52
    sget-object v4, Lh8/b;->n:Lh8/b$b;

    .line 53
    .line 54
    invoke-virtual {v3}, Lf8/d;->I()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v4, v3}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v1, v2

    .line 70
    :goto_0
    check-cast v1, Lf8/d;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, LA8/m;->s:Ly8/p;

    .line 75
    .line 76
    invoke-virtual {v0}, Ly8/p;->f()Ly8/K;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-virtual {v0, v1, v2}, Ly8/K;->r(Lf8/d;Z)LL7/d;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :cond_3
    return-object v2
.end method

.method private final W0()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, LA8/m;->l:Lf8/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf8/c;->t0()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getConstructorList(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lf8/d;

    .line 33
    .line 34
    sget-object v4, Lh8/b;->n:Lh8/b$b;

    .line 35
    .line 36
    invoke-virtual {v3}, Lf8/d;->I()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v4, v3}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "get(...)"

    .line 45
    .line 46
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    const/16 v2, 0xa

    .line 62
    .line 63
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lf8/d;

    .line 85
    .line 86
    iget-object v3, p0, LA8/m;->s:Ly8/p;

    .line 87
    .line 88
    invoke-virtual {v3}, Ly8/p;->f()Ly8/K;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-virtual {v3, v2, v4}, Ly8/K;->r(Lf8/d;Z)LL7/d;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    return-object v0
.end method

.method private final X0()Ljava/util/Collection;
    .locals 5

    .line 1
    iget-object v0, p0, LA8/m;->p:LL7/E;

    .line 2
    .line 3
    sget-object v1, LL7/E;->i:LL7/E;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, LA8/m;->l:Lf8/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lf8/c;->W0()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/Integer;

    .line 47
    .line 48
    iget-object v3, p0, LA8/m;->s:Ly8/p;

    .line 49
    .line 50
    invoke-virtual {v3}, Ly8/p;->c()Ly8/n;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object v4, p0, LA8/m;->s:Ly8/p;

    .line 55
    .line 56
    invoke-virtual {v4}, Ly8/p;->g()Lh8/c;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v4, v2}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v3, v2}, Ly8/n;->b(Lk8/b;)LL7/e;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    return-object v1

    .line 82
    :cond_3
    sget-object v0, Lo8/a;->a:Lo8/a;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-virtual {v0, p0, v1}, Lo8/a;->a(LL7/e;Z)Ljava/util/Collection;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0
.end method

.method private final Y0()LL7/r0;
    .locals 6

    .line 1
    invoke-virtual {p0}, LA8/m;->isInline()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LA8/m;->l()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    iget-object v0, p0, LA8/m;->l:Lf8/c;

    .line 16
    .line 17
    iget-object v2, p0, LA8/m;->s:Ly8/p;

    .line 18
    .line 19
    invoke-virtual {v2}, Ly8/p;->g()Lh8/c;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, LA8/m;->s:Ly8/p;

    .line 24
    .line 25
    invoke-virtual {v3}, Ly8/p;->j()Lh8/g;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, LA8/m$d;

    .line 30
    .line 31
    iget-object v5, p0, LA8/m;->s:Ly8/p;

    .line 32
    .line 33
    invoke-virtual {v5}, Ly8/p;->i()Ly8/X;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-direct {v4, v5}, LA8/m$d;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v5, LA8/m$e;

    .line 41
    .line 42
    invoke-direct {v5, p0}, LA8/m$e;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2, v3, v4, v5}, Ly8/Z;->a(Lf8/c;Lh8/c;Lh8/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LL7/r0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    iget-object v0, p0, LA8/m;->m:Lh8/a;

    .line 53
    .line 54
    const/4 v2, 0x5

    .line 55
    const/4 v3, 0x1

    .line 56
    invoke-virtual {v0, v3, v2, v3}, Lh8/a;->c(III)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, LA8/m;->O()LL7/d;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-interface {v0}, LL7/a;->i()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "getValueParameters(...)"

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, LL7/t0;

    .line 82
    .line 83
    invoke-interface {v0}, LL7/J;->getName()Lk8/f;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "getName(...)"

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v0}, LA8/m;->g1(Lk8/f;)LC8/d0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    new-instance v2, LL7/A;

    .line 99
    .line 100
    invoke-direct {v2, v0, v1}, LL7/A;-><init>(Lk8/f;LG8/j;)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v2, "Value class has no underlying property: "

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v2, "Inline class has no primary constructor: "

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_4
    return-object v1
.end method

.method private static final Z0(LA8/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-direct {p0}, LA8/m;->U0()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c1()LA8/m$a;
    .locals 2

    .line 1
    iget-object v0, p0, LA8/m;->w:LL7/f0;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->s:Ly8/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Ly8/p;->c()Ly8/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ly8/n;->n()LD8/p;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, LD8/p;->d()LD8/g;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, LL7/f0;->c(LD8/g;)Lv8/k;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LA8/m$a;

    .line 22
    .line 23
    return-object v0
.end method

.method private final g1(Lk8/f;)LC8/d0;
    .locals 5

    .line 1
    invoke-direct {p0}, LA8/m;->c1()LA8/m$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LT7/d;->x:LT7/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, LA8/m$a;->d(Lk8/f;LT7/b;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    move-object v2, v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    move-object v4, v3

    .line 29
    check-cast v4, LL7/Z;

    .line 30
    .line 31
    invoke-interface {v4}, LL7/a;->h0()LL7/c0;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :goto_1
    move-object v2, v0

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const/4 v1, 0x1

    .line 42
    move-object v2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    if-nez v1, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_2
    check-cast v2, LL7/Z;

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    invoke-interface {v2}, LL7/s0;->getType()LC8/S;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_4
    check-cast v0, LC8/d0;

    .line 56
    .line 57
    return-object v0
.end method

.method private static final i1(LA8/m;)LL7/d;
    .locals 0

    .line 1
    invoke-direct {p0}, LA8/m;->V0()LL7/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final j1(LA8/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-direct {p0}, LA8/m;->X0()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k1(LA8/m;)LL7/r0;
    .locals 0

    .line 1
    invoke-direct {p0}, LA8/m;->Y0()LL7/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public B0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public C()Z
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->l:Lh8/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public D0()Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, LA8/m;->l:Lf8/c;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->s:Ly8/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Ly8/p;->j()Lh8/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lh8/f;->b(Lf8/c;Lh8/g;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {v0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lf8/q;

    .line 39
    .line 40
    iget-object v3, p0, LA8/m;->s:Ly8/p;

    .line 41
    .line 42
    invoke-virtual {v3}, Ly8/p;->i()Ly8/X;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3, v2}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, LO7/N;

    .line 51
    .line 52
    invoke-virtual {p0}, LO7/a;->G0()LL7/c0;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, Lw8/b;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v5, p0, v2, v6, v6}, Lw8/b;-><init>(LL7/e;LC8/S;Lk8/f;Lw8/g;)V

    .line 60
    .line 61
    .line 62
    sget-object v2, LM7/h;->a:LM7/h$a;

    .line 63
    .line 64
    invoke-virtual {v2}, LM7/h$a;->b()LM7/h;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v3, v4, v5, v2}, LO7/N;-><init>(LL7/m;Lw8/g;LM7/h;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-object v1
.end method

.method public F0()Z
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->h:Lh8/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public I()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->C:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object v0
.end method

.method public J()Z
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->j:Lh8/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public K()Z
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->g:Lh8/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method protected L(LD8/g;)Lv8/k;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA8/m;->w:LL7/f0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LL7/f0;->c(LD8/g;)Lv8/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public O()LL7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->z:LB8/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LL7/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic P()Lv8/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/m;->e1()Lv8/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public R()LL7/e;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->B:LB8/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LL7/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public final a1()Ly8/p;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->s:Ly8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()LL7/m;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->y:LL7/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b1()Lf8/c;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->l:Lf8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d1()Lh8/a;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->m:Lh8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e1()Lv8/l;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->u:Lv8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->A:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object v0
.end method

.method public final f1()Ly8/N$a;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->E:Ly8/N$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()LL7/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->n:LL7/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAnnotations()LM7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->F:LM7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getKind()LL7/f;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->r:LL7/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisibility()LL7/u;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->q:LL7/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h1(Lk8/f;)Z
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LA8/m;->c1()LA8/m$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, LA8/w;->t()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public isExternal()Z
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->i:Lh8/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public isInline()Z
    .locals 3

    .line 1
    sget-object v0, Lh8/b;->k:Lh8/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LA8/m;->m:Lh8/a;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2, v1, v2}, Lh8/a;->e(III)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public j()LC8/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->v:LA8/m$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LL7/E;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->p:LL7/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Z
    .locals 4

    .line 1
    sget-object v0, Lh8/b;->k:Lh8/b$b;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LA8/m;->m:Lh8/a;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    const/4 v2, 0x2

    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v0, v3, v1, v2}, Lh8/a;->c(III)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return v3

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public t()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->s:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->i()Ly8/X;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ly8/X;->m()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "deserialized "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LA8/m;->J()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v1, "expect "

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v1, ""

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "class "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LO7/a;->getName()Lk8/f;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method

.method public w0()LL7/r0;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m;->D:LB8/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LL7/r0;

    .line 8
    .line 9
    return-object v0
.end method

.method public y()Z
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->f:Lh8/b$d;

    .line 2
    .line 3
    iget-object v1, p0, LA8/m;->l:Lf8/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf8/c;->D0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lf8/c$c;->n:Lf8/c$c;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method
