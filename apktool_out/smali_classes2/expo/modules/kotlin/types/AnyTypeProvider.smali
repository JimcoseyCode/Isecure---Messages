.class public final Lexpo/modules/kotlin/types/AnyTypeProvider;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R@\u0010\t\u001a\"\u0012\u0018\u0012\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00080\u00048\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u0012\u0004\u0008\r\u0010\u0003\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/AnyTypeProvider;",
        "",
        "<init>",
        "()V",
        "",
        "Lkotlin/Pair;",
        "LC7/d;",
        "",
        "Lexpo/modules/kotlin/types/AnyType;",
        "typesMap",
        "Ljava/util/Map;",
        "getTypesMap",
        "()Ljava/util/Map;",
        "getTypesMap$annotations",
        "expo-modules-core_release"
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
.field public static final INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

.field private static final typesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lkotlin/Pair<",
            "LC7/d;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lexpo/modules/kotlin/types/AnyType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 38

    .line 1
    new-instance v0, Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/kotlin/types/AnyTypeProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 7
    .line 8
    invoke-static {}, Lj7/K;->c()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-class v6, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-class v7, [B

    .line 49
    .line 50
    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const-class v8, [J

    .line 55
    .line 56
    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    const-class v9, [I

    .line 61
    .line 62
    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    const-class v10, [Z

    .line 67
    .line 68
    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    const-class v11, [F

    .line 73
    .line 74
    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    const-class v12, [D

    .line 79
    .line 80
    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    const-class v13, Lexpo/modules/kotlin/jni/JavaScriptValue;

    .line 85
    .line 86
    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    const-class v14, Lexpo/modules/kotlin/jni/JavaScriptObject;

    .line 91
    .line 92
    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 93
    .line 94
    .line 95
    move-result-object v14

    .line 96
    const-class v15, Lexpo/modules/kotlin/typedarray/TypedArray;

    .line 97
    .line 98
    invoke-static {v15}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    const-class v16, Lexpo/modules/kotlin/typedarray/Int8Array;

    .line 103
    .line 104
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 105
    .line 106
    .line 107
    move-result-object v16

    .line 108
    const-class v17, Lexpo/modules/kotlin/typedarray/Int16Array;

    .line 109
    .line 110
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 111
    .line 112
    .line 113
    move-result-object v17

    .line 114
    const-class v18, Lexpo/modules/kotlin/typedarray/Int32Array;

    .line 115
    .line 116
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 117
    .line 118
    .line 119
    move-result-object v18

    .line 120
    const-class v19, Lexpo/modules/kotlin/typedarray/Uint8Array;

    .line 121
    .line 122
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 123
    .line 124
    .line 125
    move-result-object v19

    .line 126
    const-class v20, Lexpo/modules/kotlin/typedarray/Uint8ClampedArray;

    .line 127
    .line 128
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 129
    .line 130
    .line 131
    move-result-object v20

    .line 132
    const-class v21, Lexpo/modules/kotlin/typedarray/Uint16Array;

    .line 133
    .line 134
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 135
    .line 136
    .line 137
    move-result-object v21

    .line 138
    const-class v22, Lexpo/modules/kotlin/typedarray/Uint32Array;

    .line 139
    .line 140
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 141
    .line 142
    .line 143
    move-result-object v22

    .line 144
    const-class v23, Lexpo/modules/kotlin/typedarray/Float32Array;

    .line 145
    .line 146
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 147
    .line 148
    .line 149
    move-result-object v23

    .line 150
    const-class v24, Lexpo/modules/kotlin/typedarray/Float64Array;

    .line 151
    .line 152
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 153
    .line 154
    .line 155
    move-result-object v24

    .line 156
    const-class v25, Lexpo/modules/kotlin/typedarray/BigInt64Array;

    .line 157
    .line 158
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 159
    .line 160
    .line 161
    move-result-object v25

    .line 162
    const-class v26, Lexpo/modules/kotlin/typedarray/BigUint64Array;

    .line 163
    .line 164
    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 165
    .line 166
    .line 167
    move-result-object v26

    .line 168
    const-class v27, Lcom/facebook/react/bridge/ReadableArray;

    .line 169
    .line 170
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 171
    .line 172
    .line 173
    move-result-object v27

    .line 174
    const-class v28, Lcom/facebook/react/bridge/ReadableMap;

    .line 175
    .line 176
    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 177
    .line 178
    .line 179
    move-result-object v28

    .line 180
    const-class v29, Ljava/net/URL;

    .line 181
    .line 182
    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 183
    .line 184
    .line 185
    move-result-object v29

    .line 186
    const-class v30, Landroid/net/Uri;

    .line 187
    .line 188
    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 189
    .line 190
    .line 191
    move-result-object v30

    .line 192
    const-class v31, Ljava/net/URI;

    .line 193
    .line 194
    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 195
    .line 196
    .line 197
    move-result-object v31

    .line 198
    const-class v32, Ljava/io/File;

    .line 199
    .line 200
    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 201
    .line 202
    .line 203
    move-result-object v32

    .line 204
    const-class v33, Ljava/lang/Object;

    .line 205
    .line 206
    invoke-static/range {v33 .. v33}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 207
    .line 208
    .line 209
    move-result-object v33

    .line 210
    const-class v34, Li7/B;

    .line 211
    .line 212
    invoke-static/range {v34 .. v34}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 213
    .line 214
    .line 215
    move-result-object v34

    .line 216
    const-class v35, Lexpo/modules/core/arguments/ReadableArguments;

    .line 217
    .line 218
    invoke-static/range {v35 .. v35}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 219
    .line 220
    .line 221
    move-result-object v35

    .line 222
    move-object/from16 v36, v1

    .line 223
    .line 224
    const/16 v1, 0x23

    .line 225
    .line 226
    new-array v1, v1, [LC7/d;

    .line 227
    .line 228
    move-object/from16 v37, v1

    .line 229
    .line 230
    const/4 v1, 0x0

    .line 231
    aput-object v36, v37, v1

    .line 232
    .line 233
    const/4 v1, 0x1

    .line 234
    aput-object v2, v37, v1

    .line 235
    .line 236
    const/4 v2, 0x2

    .line 237
    aput-object v3, v37, v2

    .line 238
    .line 239
    const/4 v3, 0x3

    .line 240
    aput-object v4, v37, v3

    .line 241
    .line 242
    const/4 v3, 0x4

    .line 243
    aput-object v5, v37, v3

    .line 244
    .line 245
    const/4 v3, 0x5

    .line 246
    aput-object v6, v37, v3

    .line 247
    .line 248
    const/4 v3, 0x6

    .line 249
    aput-object v7, v37, v3

    .line 250
    .line 251
    const/4 v3, 0x7

    .line 252
    aput-object v8, v37, v3

    .line 253
    .line 254
    const/16 v3, 0x8

    .line 255
    .line 256
    aput-object v9, v37, v3

    .line 257
    .line 258
    const/16 v3, 0x9

    .line 259
    .line 260
    aput-object v10, v37, v3

    .line 261
    .line 262
    const/16 v3, 0xa

    .line 263
    .line 264
    aput-object v11, v37, v3

    .line 265
    .line 266
    const/16 v3, 0xb

    .line 267
    .line 268
    aput-object v12, v37, v3

    .line 269
    .line 270
    const/16 v3, 0xc

    .line 271
    .line 272
    aput-object v13, v37, v3

    .line 273
    .line 274
    const/16 v3, 0xd

    .line 275
    .line 276
    aput-object v14, v37, v3

    .line 277
    .line 278
    const/16 v3, 0xe

    .line 279
    .line 280
    aput-object v15, v37, v3

    .line 281
    .line 282
    const/16 v3, 0xf

    .line 283
    .line 284
    aput-object v16, v37, v3

    .line 285
    .line 286
    const/16 v3, 0x10

    .line 287
    .line 288
    aput-object v17, v37, v3

    .line 289
    .line 290
    const/16 v3, 0x11

    .line 291
    .line 292
    aput-object v18, v37, v3

    .line 293
    .line 294
    const/16 v3, 0x12

    .line 295
    .line 296
    aput-object v19, v37, v3

    .line 297
    .line 298
    const/16 v3, 0x13

    .line 299
    .line 300
    aput-object v20, v37, v3

    .line 301
    .line 302
    const/16 v3, 0x14

    .line 303
    .line 304
    aput-object v21, v37, v3

    .line 305
    .line 306
    const/16 v3, 0x15

    .line 307
    .line 308
    aput-object v22, v37, v3

    .line 309
    .line 310
    const/16 v3, 0x16

    .line 311
    .line 312
    aput-object v23, v37, v3

    .line 313
    .line 314
    const/16 v3, 0x17

    .line 315
    .line 316
    aput-object v24, v37, v3

    .line 317
    .line 318
    const/16 v3, 0x18

    .line 319
    .line 320
    aput-object v25, v37, v3

    .line 321
    .line 322
    const/16 v3, 0x19

    .line 323
    .line 324
    aput-object v26, v37, v3

    .line 325
    .line 326
    const/16 v3, 0x1a

    .line 327
    .line 328
    aput-object v27, v37, v3

    .line 329
    .line 330
    const/16 v3, 0x1b

    .line 331
    .line 332
    aput-object v28, v37, v3

    .line 333
    .line 334
    const/16 v3, 0x1c

    .line 335
    .line 336
    aput-object v29, v37, v3

    .line 337
    .line 338
    const/16 v3, 0x1d

    .line 339
    .line 340
    aput-object v30, v37, v3

    .line 341
    .line 342
    const/16 v3, 0x1e

    .line 343
    .line 344
    aput-object v31, v37, v3

    .line 345
    .line 346
    const/16 v3, 0x1f

    .line 347
    .line 348
    aput-object v32, v37, v3

    .line 349
    .line 350
    const/16 v3, 0x20

    .line 351
    .line 352
    aput-object v33, v37, v3

    .line 353
    .line 354
    const/16 v3, 0x21

    .line 355
    .line 356
    aput-object v34, v37, v3

    .line 357
    .line 358
    const/16 v3, 0x22

    .line 359
    .line 360
    aput-object v35, v37, v3

    .line 361
    .line 362
    invoke-static/range {v37 .. v37}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-eqz v4, :cond_0

    .line 375
    .line 376
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    check-cast v4, LC7/d;

    .line 381
    .line 382
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 383
    .line 384
    invoke-static {v4, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 389
    .line 390
    new-instance v7, Lexpo/modules/kotlin/types/EmptyKType;

    .line 391
    .line 392
    const/4 v8, 0x0

    .line 393
    invoke-direct {v7, v4, v8}, Lexpo/modules/kotlin/types/EmptyKType;-><init>(LC7/d;Z)V

    .line 394
    .line 395
    .line 396
    const/4 v9, 0x0

    .line 397
    invoke-direct {v6, v7, v9, v2, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 398
    .line 399
    .line 400
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 404
    .line 405
    invoke-static {v4, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 410
    .line 411
    new-instance v7, Lexpo/modules/kotlin/types/EmptyKType;

    .line 412
    .line 413
    invoke-direct {v7, v4, v1}, Lexpo/modules/kotlin/types/EmptyKType;-><init>(LC7/d;Z)V

    .line 414
    .line 415
    .line 416
    invoke-direct {v6, v7, v9, v2, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 417
    .line 418
    .line 419
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    goto :goto_0

    .line 423
    :cond_0
    invoke-static {v0}, Lj7/K;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    sput-object v0, Lexpo/modules/kotlin/types/AnyTypeProvider;->typesMap:Ljava/util/Map;

    .line 428
    .line 429
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getTypesMap$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final getTypesMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lkotlin/Pair<",
            "LC7/d;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lexpo/modules/kotlin/types/AnyType;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/kotlin/types/AnyTypeProvider;->typesMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
