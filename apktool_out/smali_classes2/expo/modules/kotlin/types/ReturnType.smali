.class public final Lexpo/modules/kotlin/types/ReturnType;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\r\u001a\u00020\n\"\u0006\u0008\u0000\u0010\t\u0018\u0001H\u0080\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/ReturnType;",
        "",
        "LC7/d;",
        "klass",
        "<init>",
        "(LC7/d;)V",
        "value",
        "convertToJS",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "T",
        "",
        "inheritFrom$expo_modules_core_release",
        "()Z",
        "inheritFrom",
        "LC7/d;",
        "Lexpo/modules/kotlin/types/JSTypeConverter;",
        "converter",
        "Lexpo/modules/kotlin/types/JSTypeConverter;",
        "Lexpo/modules/kotlin/jni/ReturnType;",
        "getCppType",
        "()Lexpo/modules/kotlin/jni/ReturnType;",
        "cppType",
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


# instance fields
.field private final converter:Lexpo/modules/kotlin/types/JSTypeConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/types/JSTypeConverter<",
            "*>;"
        }
    .end annotation
.end field

.field private final klass:LC7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LC7/d;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LC7/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC7/d;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/types/ReturnType;->klass:LC7/d;

    .line 10
    .line 11
    const-class v0, Li7/B;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$PassThroughConverter;

    .line 24
    .line 25
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$PassThroughConverter;-><init>()V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_0
    const-class v0, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$BundleConverter;

    .line 43
    .line 44
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$BundleConverter;-><init>()V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_1
    const-class v0, [I

    .line 50
    .line 51
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$IntArrayConverter;

    .line 62
    .line 63
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$IntArrayConverter;-><init>()V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_2
    const-class v0, [F

    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$FloatArrayConverter;

    .line 81
    .line 82
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$FloatArrayConverter;-><init>()V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_3
    const-class v0, [D

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$DoubleArrayConverter;

    .line 100
    .line 101
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$DoubleArrayConverter;-><init>()V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :cond_4
    const-class v0, [Z

    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$BooleanArrayConverter;

    .line 119
    .line 120
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$BooleanArrayConverter;-><init>()V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :cond_5
    const-class v0, [B

    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$ByteArrayConverter;

    .line 138
    .line 139
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$ByteArrayConverter;-><init>()V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_6
    const-class v0, Ljava/net/URI;

    .line 145
    .line 146
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$URIConverter;

    .line 157
    .line 158
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$URIConverter;-><init>()V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_7
    const-class v0, Ljava/net/URL;

    .line 164
    .line 165
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_8

    .line 174
    .line 175
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$URLConverter;

    .line 176
    .line 177
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$URLConverter;-><init>()V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_8
    const-class v0, Landroid/net/Uri;

    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_9

    .line 193
    .line 194
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$AndroidUriConverter;

    .line 195
    .line 196
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$AndroidUriConverter;-><init>()V

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_9
    const-class v0, Ljava/io/File;

    .line 201
    .line 202
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_a

    .line 211
    .line 212
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$FileConverter;

    .line 213
    .line 214
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$FileConverter;-><init>()V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_a
    const-class v0, Lkotlin/Pair;

    .line 219
    .line 220
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_b

    .line 229
    .line 230
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$PairConverter;

    .line 231
    .line 232
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$PairConverter;-><init>()V

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_b
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 237
    .line 238
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_c

    .line 247
    .line 248
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$LongConverter;

    .line 249
    .line 250
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$LongConverter;-><init>()V

    .line 251
    .line 252
    .line 253
    goto :goto_0

    .line 254
    :cond_c
    const-class v0, LQ8/a;

    .line 255
    .line 256
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_d

    .line 265
    .line 266
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$DurationConverter;

    .line 267
    .line 268
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$DurationConverter;-><init>()V

    .line 269
    .line 270
    .line 271
    goto :goto_0

    .line 272
    :cond_d
    const-class v0, Ljava/lang/Object;

    .line 273
    .line 274
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_e

    .line 283
    .line 284
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$AnyConverter;

    .line 285
    .line 286
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$AnyConverter;-><init>()V

    .line 287
    .line 288
    .line 289
    goto :goto_0

    .line 290
    :cond_e
    const/4 p1, 0x0

    .line 291
    :goto_0
    if-nez p1, :cond_16

    .line 292
    .line 293
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-static {p1}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    const-class v0, Ljava/util/Map;

    .line 302
    .line 303
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_f

    .line 308
    .line 309
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$MapConverter;

    .line 310
    .line 311
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$MapConverter;-><init>()V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :cond_f
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-static {p1}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    const-class v0, Ljava/lang/Enum;

    .line 325
    .line 326
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-eqz p1, :cond_10

    .line 331
    .line 332
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$EnumConverter;

    .line 333
    .line 334
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$EnumConverter;-><init>()V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_1

    .line 338
    .line 339
    :cond_10
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-static {p1}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    const-class v0, Lexpo/modules/kotlin/records/Record;

    .line 348
    .line 349
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    if-eqz p1, :cond_11

    .line 354
    .line 355
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$RecordConverter;

    .line 356
    .line 357
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$RecordConverter;-><init>()V

    .line 358
    .line 359
    .line 360
    goto :goto_1

    .line 361
    :cond_11
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-static {p1}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    const-class v0, Lexpo/modules/kotlin/records/formatters/FormattedRecord;

    .line 370
    .line 371
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    if-eqz p1, :cond_12

    .line 376
    .line 377
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$FormattedRecordConverter;

    .line 378
    .line 379
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$FormattedRecordConverter;-><init>()V

    .line 380
    .line 381
    .line 382
    goto :goto_1

    .line 383
    :cond_12
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-static {p1}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    const-class v0, Lexpo/modules/kotlin/typedarray/RawTypedArrayHolder;

    .line 392
    .line 393
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    if-eqz p1, :cond_13

    .line 398
    .line 399
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$RawTypedArrayHolderConverter;

    .line 400
    .line 401
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$RawTypedArrayHolderConverter;-><init>()V

    .line 402
    .line 403
    .line 404
    goto :goto_1

    .line 405
    :cond_13
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-static {p1}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    const-class v0, [Ljava/lang/Object;

    .line 414
    .line 415
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 416
    .line 417
    .line 418
    move-result p1

    .line 419
    if-eqz p1, :cond_14

    .line 420
    .line 421
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$ArrayConverter;

    .line 422
    .line 423
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$ArrayConverter;-><init>()V

    .line 424
    .line 425
    .line 426
    goto :goto_1

    .line 427
    :cond_14
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-static {p1}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    const-class v0, Ljava/util/Collection;

    .line 436
    .line 437
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 438
    .line 439
    .line 440
    move-result p1

    .line 441
    if-eqz p1, :cond_15

    .line 442
    .line 443
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$CollectionConverter;

    .line 444
    .line 445
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$CollectionConverter;-><init>()V

    .line 446
    .line 447
    .line 448
    goto :goto_1

    .line 449
    :cond_15
    new-instance p1, Lexpo/modules/kotlin/types/JSTypeConverter$PassThroughConverter;

    .line 450
    .line 451
    invoke-direct {p1}, Lexpo/modules/kotlin/types/JSTypeConverter$PassThroughConverter;-><init>()V

    .line 452
    .line 453
    .line 454
    :cond_16
    :goto_1
    iput-object p1, p0, Lexpo/modules/kotlin/types/ReturnType;->converter:Lexpo/modules/kotlin/types/JSTypeConverter;

    .line 455
    .line 456
    return-void
.end method

.method public static final synthetic access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/kotlin/types/ReturnType;->klass:LC7/d;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final convertToJS(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ReturnType;->converter:Lexpo/modules/kotlin/types/JSTypeConverter;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lexpo/modules/kotlin/types/JSTypeConverter;->convertToJS(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final getCppType()Lexpo/modules/kotlin/jni/ReturnType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ReturnType;->converter:Lexpo/modules/kotlin/types/JSTypeConverter;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/kotlin/types/JSTypeConverter;->getReturnType()Lexpo/modules/kotlin/jni/ReturnType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final synthetic inheritFrom$expo_modules_core_release()Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()Z"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/types/ReturnType;->access$getKlass$p(Lexpo/modules/kotlin/types/ReturnType;)LC7/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x4

    .line 10
    const-string v2, "T"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-class v1, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method
