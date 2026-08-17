.class public final Lexpo/modules/router/ExpoRouterModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/router/ExpoRouterModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0012\u001a\u00020\u000bH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/router/ExpoRouterModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "materialColor",
        "",
        "name",
        "scheme",
        "dynamicColor",
        "getColorFromTheme",
        "themeResId",
        "",
        "getSystemScheme",
        "Companion",
        "expo-router_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lexpo/modules/router/ExpoRouterModule$Companion;

.field private static final attrMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 48

    .line 1
    new-instance v0, Lexpo/modules/router/ExpoRouterModule$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/router/ExpoRouterModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/router/ExpoRouterModule;->Companion:Lexpo/modules/router/ExpoRouterModule$Companion;

    .line 8
    .line 9
    sget v0, Lf/a;->w:I

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "primary"

    .line 16
    .line 17
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v0, LQ4/a;->j:I

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "onprimary"

    .line 28
    .line 29
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    sget v0, LQ4/a;->A:I

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "primarycontainer"

    .line 40
    .line 41
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget v0, LQ4/a;->k:I

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "onprimarycontainer"

    .line 52
    .line 53
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    sget v0, LQ4/a;->D:I

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "primaryinverse"

    .line 64
    .line 65
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    sget v0, LQ4/a;->B:I

    .line 70
    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "primaryfixed"

    .line 76
    .line 77
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    sget v0, LQ4/a;->C:I

    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "primaryfixeddim"

    .line 88
    .line 89
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    sget v0, LQ4/a;->l:I

    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "onprimaryfixed"

    .line 100
    .line 101
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    sget v0, LQ4/a;->m:I

    .line 106
    .line 107
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v1, "onprimaryfixedvariant"

    .line 112
    .line 113
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    sget v0, LQ4/a;->F:I

    .line 118
    .line 119
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v1, "secondary"

    .line 124
    .line 125
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    sget v0, LQ4/a;->n:I

    .line 130
    .line 131
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-string v1, "onsecondary"

    .line 136
    .line 137
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    sget v0, LQ4/a;->G:I

    .line 142
    .line 143
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v1, "secondarycontainer"

    .line 148
    .line 149
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    sget v0, LQ4/a;->o:I

    .line 154
    .line 155
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v1, "onsecondarycontainer"

    .line 160
    .line 161
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    sget v0, LQ4/a;->H:I

    .line 166
    .line 167
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const-string v1, "secondaryfixed"

    .line 172
    .line 173
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    sget v0, LQ4/a;->I:I

    .line 178
    .line 179
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const-string v1, "secondaryfixeddim"

    .line 184
    .line 185
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 186
    .line 187
    .line 188
    move-result-object v16

    .line 189
    sget v0, LQ4/a;->p:I

    .line 190
    .line 191
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    const-string v1, "onsecondaryfixed"

    .line 196
    .line 197
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 198
    .line 199
    .line 200
    move-result-object v17

    .line 201
    sget v0, LQ4/a;->q:I

    .line 202
    .line 203
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v1, "onsecondaryfixedvariant"

    .line 208
    .line 209
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 210
    .line 211
    .line 212
    move-result-object v18

    .line 213
    sget v0, LQ4/a;->T:I

    .line 214
    .line 215
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-string v1, "tertiary"

    .line 220
    .line 221
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 222
    .line 223
    .line 224
    move-result-object v19

    .line 225
    sget v0, LQ4/a;->u:I

    .line 226
    .line 227
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const-string v1, "ontertiary"

    .line 232
    .line 233
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 234
    .line 235
    .line 236
    move-result-object v20

    .line 237
    sget v0, LQ4/a;->U:I

    .line 238
    .line 239
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    const-string v1, "tertiarycontainer"

    .line 244
    .line 245
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 246
    .line 247
    .line 248
    move-result-object v21

    .line 249
    sget v0, LQ4/a;->v:I

    .line 250
    .line 251
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    const-string v1, "ontertiarycontainer"

    .line 256
    .line 257
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 258
    .line 259
    .line 260
    move-result-object v22

    .line 261
    sget v0, LQ4/a;->V:I

    .line 262
    .line 263
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    const-string v1, "tertiaryfixed"

    .line 268
    .line 269
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 270
    .line 271
    .line 272
    move-result-object v23

    .line 273
    sget v0, LQ4/a;->W:I

    .line 274
    .line 275
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    const-string v1, "tertiaryfixeddim"

    .line 280
    .line 281
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 282
    .line 283
    .line 284
    move-result-object v24

    .line 285
    sget v0, LQ4/a;->w:I

    .line 286
    .line 287
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const-string v1, "ontertiaryfixed"

    .line 292
    .line 293
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 294
    .line 295
    .line 296
    move-result-object v25

    .line 297
    sget v0, LQ4/a;->x:I

    .line 298
    .line 299
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    const-string v1, "ontertiaryfixedvariant"

    .line 304
    .line 305
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 306
    .line 307
    .line 308
    move-result-object v26

    .line 309
    sget v0, Lf/a;->v:I

    .line 310
    .line 311
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    const-string v1, "error"

    .line 316
    .line 317
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 318
    .line 319
    .line 320
    move-result-object v27

    .line 321
    sget v0, LQ4/a;->h:I

    .line 322
    .line 323
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    const-string v1, "onerror"

    .line 328
    .line 329
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 330
    .line 331
    .line 332
    move-result-object v28

    .line 333
    sget v0, LQ4/a;->f:I

    .line 334
    .line 335
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    const-string v1, "errorcontainer"

    .line 340
    .line 341
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 342
    .line 343
    .line 344
    move-result-object v29

    .line 345
    sget v0, LQ4/a;->i:I

    .line 346
    .line 347
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    const-string v1, "onerrorcontainer"

    .line 352
    .line 353
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 354
    .line 355
    .line 356
    move-result-object v30

    .line 357
    sget v0, LQ4/a;->y:I

    .line 358
    .line 359
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    const-string v1, "outline"

    .line 364
    .line 365
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 366
    .line 367
    .line 368
    move-result-object v31

    .line 369
    sget v0, LQ4/a;->z:I

    .line 370
    .line 371
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const-string v1, "outlinevariant"

    .line 376
    .line 377
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 378
    .line 379
    .line 380
    move-result-object v32

    .line 381
    const v0, 0x1010031

    .line 382
    .line 383
    .line 384
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const-string v1, "background"

    .line 389
    .line 390
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 391
    .line 392
    .line 393
    move-result-object v33

    .line 394
    sget v0, LQ4/a;->g:I

    .line 395
    .line 396
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    const-string v1, "onbackground"

    .line 401
    .line 402
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 403
    .line 404
    .line 405
    move-result-object v34

    .line 406
    sget v0, LQ4/a;->J:I

    .line 407
    .line 408
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const-string v1, "surface"

    .line 413
    .line 414
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 415
    .line 416
    .line 417
    move-result-object v35

    .line 418
    sget v0, LQ4/a;->r:I

    .line 419
    .line 420
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    const-string v1, "onsurface"

    .line 425
    .line 426
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 427
    .line 428
    .line 429
    move-result-object v36

    .line 430
    sget v0, LQ4/a;->S:I

    .line 431
    .line 432
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    const-string v1, "surfacevariant"

    .line 437
    .line 438
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 439
    .line 440
    .line 441
    move-result-object v37

    .line 442
    sget v0, LQ4/a;->t:I

    .line 443
    .line 444
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    const-string v1, "onsurfacevariant"

    .line 449
    .line 450
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 451
    .line 452
    .line 453
    move-result-object v38

    .line 454
    sget v0, LQ4/a;->R:I

    .line 455
    .line 456
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    const-string v1, "surfaceinverse"

    .line 461
    .line 462
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 463
    .line 464
    .line 465
    move-result-object v39

    .line 466
    sget v0, LQ4/a;->s:I

    .line 467
    .line 468
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-string v1, "onsurfaceinverse"

    .line 473
    .line 474
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 475
    .line 476
    .line 477
    move-result-object v40

    .line 478
    sget v0, LQ4/a;->K:I

    .line 479
    .line 480
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    const-string v1, "surfacebright"

    .line 485
    .line 486
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 487
    .line 488
    .line 489
    move-result-object v41

    .line 490
    sget v0, LQ4/a;->Q:I

    .line 491
    .line 492
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    const-string v1, "surfacedim"

    .line 497
    .line 498
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 499
    .line 500
    .line 501
    move-result-object v42

    .line 502
    sget v0, LQ4/a;->L:I

    .line 503
    .line 504
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    const-string v1, "surfacecontainer"

    .line 509
    .line 510
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 511
    .line 512
    .line 513
    move-result-object v43

    .line 514
    sget v0, LQ4/a;->O:I

    .line 515
    .line 516
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    const-string v1, "surfacecontainerlow"

    .line 521
    .line 522
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 523
    .line 524
    .line 525
    move-result-object v44

    .line 526
    sget v0, LQ4/a;->P:I

    .line 527
    .line 528
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    const-string v1, "surfacecontainerlowest"

    .line 533
    .line 534
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 535
    .line 536
    .line 537
    move-result-object v45

    .line 538
    sget v0, LQ4/a;->M:I

    .line 539
    .line 540
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    const-string v1, "surfacecontainerhigh"

    .line 545
    .line 546
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 547
    .line 548
    .line 549
    move-result-object v46

    .line 550
    sget v0, LQ4/a;->N:I

    .line 551
    .line 552
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    const-string v1, "surfacecontainerhighest"

    .line 557
    .line 558
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 559
    .line 560
    .line 561
    move-result-object v47

    .line 562
    filled-new-array/range {v2 .. v47}, [Lkotlin/Pair;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-static {v0}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    sput-object v0, Lexpo/modules/router/ExpoRouterModule;->attrMap:Ljava/util/Map;

    .line 571
    .line 572
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$dynamicColor(Lexpo/modules/router/ExpoRouterModule;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/router/ExpoRouterModule;->dynamicColor(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getAttrMap$cp()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/router/ExpoRouterModule;->attrMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$materialColor(Lexpo/modules/router/ExpoRouterModule;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/router/ExpoRouterModule;->materialColor(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final dynamicColor(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "dark"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "light"

    .line 10
    .line 11
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lexpo/modules/router/ExpoRouterModule;->getSystemScheme()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_0
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    sget p2, LQ4/j;->g:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget p2, LQ4/j;->h:I

    .line 31
    .line 32
    :goto_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/router/ExpoRouterModule;->getColorFromTheme(Ljava/lang/String;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method

.method private final getColorFromTheme(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Landroidx/appcompat/view/d;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/router/ExpoRouterModule;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p2}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    sget-object p2, Lexpo/modules/router/ExpoRouterModule;->attrMap:Ljava/util/Map;

    .line 11
    .line 12
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v1, "toLowerCase(...)"

    .line 19
    .line 20
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/Integer;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {v0, p1}, LX4/a;->f(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    sget-object p2, Lexpo/modules/router/ExpoRouterModule;->Companion:Lexpo/modules/router/ExpoRouterModule$Companion;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Lexpo/modules/router/ExpoRouterModule$Companion;->colorToHex(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_0
    return-object p2
.end method

.method private final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    .line 13
    .line 14
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final getSystemScheme()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-direct {p0}, Lexpo/modules/router/ExpoRouterModule;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 14
    .line 15
    and-int/lit8 v0, v0, 0x30

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    const-string v2, "light"

    .line 20
    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_0
    const-string v0, "dark"

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    return-object v2
.end method

.method private final materialColor(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "dark"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "light"

    .line 10
    .line 11
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lexpo/modules/router/ExpoRouterModule;->getSystemScheme()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_0
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    sget p2, LQ4/j;->d:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget p2, LQ4/j;->i:I

    .line 31
    .line 32
    :goto_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/router/ExpoRouterModule;->getColorFromTheme(Ljava/lang/String;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 13

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ".ModuleDefinition"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "["

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, "ExpoModulesCore"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, "] "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Ll1/a;->c(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    new-instance v1, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 57
    .line 58
    .line 59
    const-string v2, "ExpoRouter"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "Material3Color"

    .line 65
    .line 66
    new-instance v3, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 67
    .line 68
    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 73
    .line 74
    new-instance v6, Lkotlin/Pair;

    .line 75
    .line 76
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-direct {v6, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    if-nez v6, :cond_0

    .line 97
    .line 98
    sget-object v6, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$1;->INSTANCE:Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$1;

    .line 99
    .line 100
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 101
    .line 102
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    invoke-direct {v10, v11, v7, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v9, v10, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 112
    .line 113
    .line 114
    move-object v6, v9

    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :cond_0
    :goto_0
    new-instance v9, Lkotlin/Pair;

    .line 120
    .line 121
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 137
    .line 138
    if-nez v9, :cond_1

    .line 139
    .line 140
    sget-object v9, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$2;->INSTANCE:Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$2;

    .line 141
    .line 142
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 143
    .line 144
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    invoke-direct {v11, v12, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v10, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 154
    .line 155
    .line 156
    move-object v9, v10

    .line 157
    :cond_1
    filled-new-array {v6, v9}, [Lexpo/modules/kotlin/types/AnyType;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    sget-object v6, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 162
    .line 163
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    check-cast v9, Lexpo/modules/kotlin/types/ReturnType;

    .line 176
    .line 177
    if-nez v9, :cond_2

    .line 178
    .line 179
    new-instance v9, Lexpo/modules/kotlin/types/ReturnType;

    .line 180
    .line 181
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-direct {v9, v10}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-interface {v10, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :cond_2
    new-instance v10, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$3;

    .line 200
    .line 201
    invoke-direct {v10, p0}, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$3;-><init>(Lexpo/modules/router/ExpoRouterModule;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v3, v2, v4, v9, v10}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    const-string v2, "Material3DynamicColor"

    .line 215
    .line 216
    new-instance v3, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 217
    .line 218
    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    new-instance v9, Lkotlin/Pair;

    .line 223
    .line 224
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 240
    .line 241
    if-nez v9, :cond_3

    .line 242
    .line 243
    sget-object v9, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$4;->INSTANCE:Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$4;

    .line 244
    .line 245
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 246
    .line 247
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    .line 248
    .line 249
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    invoke-direct {v11, v12, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 254
    .line 255
    .line 256
    invoke-direct {v10, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 257
    .line 258
    .line 259
    move-object v9, v10

    .line 260
    :cond_3
    new-instance v10, Lkotlin/Pair;

    .line 261
    .line 262
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 263
    .line 264
    .line 265
    move-result-object v11

    .line 266
    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    .line 278
    .line 279
    if-nez v5, :cond_4

    .line 280
    .line 281
    sget-object v5, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$5;->INSTANCE:Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$5;

    .line 282
    .line 283
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 284
    .line 285
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 286
    .line 287
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 288
    .line 289
    .line 290
    move-result-object v11

    .line 291
    invoke-direct {v10, v11, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 292
    .line 293
    .line 294
    invoke-direct {v8, v10, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 295
    .line 296
    .line 297
    move-object v5, v8

    .line 298
    :cond_4
    filled-new-array {v9, v5}, [Lexpo/modules/kotlin/types/AnyType;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    .line 315
    .line 316
    if-nez v5, :cond_5

    .line 317
    .line 318
    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    .line 319
    .line 320
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    invoke-direct {v5, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-interface {v6, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    :cond_5
    new-instance v0, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$6;

    .line 339
    .line 340
    invoke-direct {v0, p0}, Lexpo/modules/router/ExpoRouterModule$definition$lambda$2$$inlined$Function$6;-><init>(Lexpo/modules/router/ExpoRouterModule;)V

    .line 341
    .line 342
    .line 343
    invoke-direct {v3, v2, v4, v5, v0}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 354
    .line 355
    .line 356
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    invoke-static {}, Ll1/a;->f()V

    .line 358
    .line 359
    .line 360
    return-object v0

    .line 361
    :goto_1
    invoke-static {}, Ll1/a;->f()V

    .line 362
    .line 363
    .line 364
    throw v0
.end method
