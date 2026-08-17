.class public final Lexpo/modules/image/blurhash/BlurhashDecoder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0013\n\u0002\u0008\u0007\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000c\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JE\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\'\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\'\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008%\u0010$J;\u0010+\u001a\u00020**\u00020\"2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\r\u00100\u001a\u00020/\u00a2\u0006\u0004\u00080\u0010\u0003J=\u00103\u001a\u0004\u0018\u00010\u001e2\u0008\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0002\u00102\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u00083\u00104R0\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"05j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"`68\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R0\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"05j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"`68\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u00108R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=\u00a8\u0006>"
    }
    d2 = {
        "Lexpo/modules/image/blurhash/BlurhashDecoder;",
        "",
        "<init>",
        "()V",
        "",
        "str",
        "",
        "from",
        "to",
        "decode83",
        "(Ljava/lang/String;II)I",
        "colorEnc",
        "",
        "decodeDc",
        "(I)[F",
        "value",
        "",
        "maxAc",
        "decodeAc",
        "(IF)[F",
        "signedPow2",
        "(F)F",
        "width",
        "height",
        "numCompX",
        "numCompY",
        "",
        "colors",
        "",
        "useCache",
        "Landroid/graphics/Bitmap;",
        "composeBitmap",
        "(IIII[[FZ)Landroid/graphics/Bitmap;",
        "calculate",
        "",
        "getArrayForCosinesY",
        "(ZII)[D",
        "getArrayForCosinesX",
        "x",
        "numComp",
        "y",
        "size",
        "",
        "getCos",
        "([DZIIII)D",
        "linearToSrgb",
        "(F)I",
        "Li7/B;",
        "clearCache",
        "blurHash",
        "punch",
        "decode",
        "(Ljava/lang/String;IIFZ)Landroid/graphics/Bitmap;",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "cacheCosinesX",
        "Ljava/util/HashMap;",
        "cacheCosinesY",
        "",
        "",
        "charMap",
        "Ljava/util/Map;",
        "expo-image_release"
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
.field public static final INSTANCE:Lexpo/modules/image/blurhash/BlurhashDecoder;

.field private static final cacheCosinesX:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "[D>;"
        }
    .end annotation
.end field

.field private static final cacheCosinesY:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "[D>;"
        }
    .end annotation
.end field

.field private static final charMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 84

    .line 1
    new-instance v0, Lexpo/modules/image/blurhash/BlurhashDecoder;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/image/blurhash/BlurhashDecoder;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/image/blurhash/BlurhashDecoder;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashDecoder;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesX:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesY:Ljava/util/HashMap;

    .line 21
    .line 22
    const/16 v0, 0x30

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/16 v0, 0x31

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/16 v0, 0x32

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/16 v0, 0x33

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/16 v0, 0x34

    .line 47
    .line 48
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/16 v0, 0x35

    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const/16 v0, 0x36

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    const/16 v0, 0x37

    .line 65
    .line 66
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    const/16 v0, 0x38

    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    const/16 v0, 0x39

    .line 77
    .line 78
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    const/16 v0, 0x41

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    const/16 v0, 0x42

    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    const/16 v0, 0x43

    .line 95
    .line 96
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 97
    .line 98
    .line 99
    move-result-object v13

    .line 100
    const/16 v0, 0x44

    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 103
    .line 104
    .line 105
    move-result-object v14

    .line 106
    const/16 v0, 0x45

    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 109
    .line 110
    .line 111
    move-result-object v15

    .line 112
    const/16 v0, 0x46

    .line 113
    .line 114
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    const/16 v0, 0x47

    .line 119
    .line 120
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 121
    .line 122
    .line 123
    move-result-object v17

    .line 124
    const/16 v0, 0x48

    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 127
    .line 128
    .line 129
    move-result-object v18

    .line 130
    const/16 v0, 0x49

    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 133
    .line 134
    .line 135
    move-result-object v19

    .line 136
    const/16 v0, 0x4a

    .line 137
    .line 138
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 139
    .line 140
    .line 141
    move-result-object v20

    .line 142
    const/16 v0, 0x4b

    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 145
    .line 146
    .line 147
    move-result-object v21

    .line 148
    const/16 v0, 0x4c

    .line 149
    .line 150
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 151
    .line 152
    .line 153
    move-result-object v22

    .line 154
    const/16 v0, 0x4d

    .line 155
    .line 156
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 157
    .line 158
    .line 159
    move-result-object v23

    .line 160
    const/16 v0, 0x4e

    .line 161
    .line 162
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 163
    .line 164
    .line 165
    move-result-object v24

    .line 166
    const/16 v0, 0x4f

    .line 167
    .line 168
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 169
    .line 170
    .line 171
    move-result-object v25

    .line 172
    const/16 v0, 0x50

    .line 173
    .line 174
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 175
    .line 176
    .line 177
    move-result-object v26

    .line 178
    const/16 v0, 0x51

    .line 179
    .line 180
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 181
    .line 182
    .line 183
    move-result-object v27

    .line 184
    const/16 v0, 0x52

    .line 185
    .line 186
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 187
    .line 188
    .line 189
    move-result-object v28

    .line 190
    const/16 v0, 0x53

    .line 191
    .line 192
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 193
    .line 194
    .line 195
    move-result-object v29

    .line 196
    const/16 v0, 0x54

    .line 197
    .line 198
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 199
    .line 200
    .line 201
    move-result-object v30

    .line 202
    const/16 v0, 0x55

    .line 203
    .line 204
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 205
    .line 206
    .line 207
    move-result-object v31

    .line 208
    const/16 v0, 0x56

    .line 209
    .line 210
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 211
    .line 212
    .line 213
    move-result-object v32

    .line 214
    const/16 v0, 0x57

    .line 215
    .line 216
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 217
    .line 218
    .line 219
    move-result-object v33

    .line 220
    const/16 v0, 0x58

    .line 221
    .line 222
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 223
    .line 224
    .line 225
    move-result-object v34

    .line 226
    const/16 v0, 0x59

    .line 227
    .line 228
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 229
    .line 230
    .line 231
    move-result-object v35

    .line 232
    const/16 v0, 0x5a

    .line 233
    .line 234
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 235
    .line 236
    .line 237
    move-result-object v36

    .line 238
    const/16 v0, 0x61

    .line 239
    .line 240
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 241
    .line 242
    .line 243
    move-result-object v37

    .line 244
    const/16 v0, 0x62

    .line 245
    .line 246
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 247
    .line 248
    .line 249
    move-result-object v38

    .line 250
    const/16 v0, 0x63

    .line 251
    .line 252
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 253
    .line 254
    .line 255
    move-result-object v39

    .line 256
    const/16 v0, 0x64

    .line 257
    .line 258
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 259
    .line 260
    .line 261
    move-result-object v40

    .line 262
    const/16 v0, 0x65

    .line 263
    .line 264
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 265
    .line 266
    .line 267
    move-result-object v41

    .line 268
    const/16 v0, 0x66

    .line 269
    .line 270
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 271
    .line 272
    .line 273
    move-result-object v42

    .line 274
    const/16 v0, 0x67

    .line 275
    .line 276
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 277
    .line 278
    .line 279
    move-result-object v43

    .line 280
    const/16 v0, 0x68

    .line 281
    .line 282
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 283
    .line 284
    .line 285
    move-result-object v44

    .line 286
    const/16 v0, 0x69

    .line 287
    .line 288
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 289
    .line 290
    .line 291
    move-result-object v45

    .line 292
    const/16 v0, 0x6a

    .line 293
    .line 294
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 295
    .line 296
    .line 297
    move-result-object v46

    .line 298
    const/16 v0, 0x6b

    .line 299
    .line 300
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 301
    .line 302
    .line 303
    move-result-object v47

    .line 304
    const/16 v0, 0x6c

    .line 305
    .line 306
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 307
    .line 308
    .line 309
    move-result-object v48

    .line 310
    const/16 v0, 0x6d

    .line 311
    .line 312
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 313
    .line 314
    .line 315
    move-result-object v49

    .line 316
    const/16 v0, 0x6e

    .line 317
    .line 318
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 319
    .line 320
    .line 321
    move-result-object v50

    .line 322
    const/16 v0, 0x6f

    .line 323
    .line 324
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 325
    .line 326
    .line 327
    move-result-object v51

    .line 328
    const/16 v0, 0x70

    .line 329
    .line 330
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 331
    .line 332
    .line 333
    move-result-object v52

    .line 334
    const/16 v0, 0x71

    .line 335
    .line 336
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 337
    .line 338
    .line 339
    move-result-object v53

    .line 340
    const/16 v0, 0x72

    .line 341
    .line 342
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 343
    .line 344
    .line 345
    move-result-object v54

    .line 346
    const/16 v0, 0x73

    .line 347
    .line 348
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 349
    .line 350
    .line 351
    move-result-object v55

    .line 352
    const/16 v0, 0x74

    .line 353
    .line 354
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 355
    .line 356
    .line 357
    move-result-object v56

    .line 358
    const/16 v0, 0x75

    .line 359
    .line 360
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 361
    .line 362
    .line 363
    move-result-object v57

    .line 364
    const/16 v0, 0x76

    .line 365
    .line 366
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 367
    .line 368
    .line 369
    move-result-object v58

    .line 370
    const/16 v0, 0x77

    .line 371
    .line 372
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 373
    .line 374
    .line 375
    move-result-object v59

    .line 376
    const/16 v0, 0x78

    .line 377
    .line 378
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 379
    .line 380
    .line 381
    move-result-object v60

    .line 382
    const/16 v0, 0x79

    .line 383
    .line 384
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 385
    .line 386
    .line 387
    move-result-object v61

    .line 388
    const/16 v0, 0x7a

    .line 389
    .line 390
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 391
    .line 392
    .line 393
    move-result-object v62

    .line 394
    const/16 v0, 0x23

    .line 395
    .line 396
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 397
    .line 398
    .line 399
    move-result-object v63

    .line 400
    const/16 v0, 0x24

    .line 401
    .line 402
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 403
    .line 404
    .line 405
    move-result-object v64

    .line 406
    const/16 v0, 0x25

    .line 407
    .line 408
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 409
    .line 410
    .line 411
    move-result-object v65

    .line 412
    const/16 v0, 0x2a

    .line 413
    .line 414
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 415
    .line 416
    .line 417
    move-result-object v66

    .line 418
    const/16 v0, 0x2b

    .line 419
    .line 420
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 421
    .line 422
    .line 423
    move-result-object v67

    .line 424
    const/16 v0, 0x2c

    .line 425
    .line 426
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 427
    .line 428
    .line 429
    move-result-object v68

    .line 430
    const/16 v0, 0x2d

    .line 431
    .line 432
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 433
    .line 434
    .line 435
    move-result-object v69

    .line 436
    const/16 v0, 0x2e

    .line 437
    .line 438
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 439
    .line 440
    .line 441
    move-result-object v70

    .line 442
    const/16 v0, 0x3a

    .line 443
    .line 444
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 445
    .line 446
    .line 447
    move-result-object v71

    .line 448
    const/16 v0, 0x3b

    .line 449
    .line 450
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 451
    .line 452
    .line 453
    move-result-object v72

    .line 454
    const/16 v0, 0x3d

    .line 455
    .line 456
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 457
    .line 458
    .line 459
    move-result-object v73

    .line 460
    const/16 v0, 0x3f

    .line 461
    .line 462
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 463
    .line 464
    .line 465
    move-result-object v74

    .line 466
    const/16 v0, 0x40

    .line 467
    .line 468
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 469
    .line 470
    .line 471
    move-result-object v75

    .line 472
    const/16 v0, 0x5b

    .line 473
    .line 474
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 475
    .line 476
    .line 477
    move-result-object v76

    .line 478
    const/16 v0, 0x5d

    .line 479
    .line 480
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 481
    .line 482
    .line 483
    move-result-object v77

    .line 484
    const/16 v0, 0x5e

    .line 485
    .line 486
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 487
    .line 488
    .line 489
    move-result-object v78

    .line 490
    const/16 v0, 0x5f

    .line 491
    .line 492
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 493
    .line 494
    .line 495
    move-result-object v79

    .line 496
    const/16 v0, 0x7b

    .line 497
    .line 498
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 499
    .line 500
    .line 501
    move-result-object v80

    .line 502
    const/16 v0, 0x7c

    .line 503
    .line 504
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 505
    .line 506
    .line 507
    move-result-object v81

    .line 508
    const/16 v0, 0x7d

    .line 509
    .line 510
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 511
    .line 512
    .line 513
    move-result-object v82

    .line 514
    const/16 v0, 0x7e

    .line 515
    .line 516
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 517
    .line 518
    .line 519
    move-result-object v83

    .line 520
    filled-new-array/range {v1 .. v83}, [Ljava/lang/Character;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    new-instance v1, Ljava/util/ArrayList;

    .line 529
    .line 530
    const/16 v2, 0xa

    .line 531
    .line 532
    invoke-static {v0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 537
    .line 538
    .line 539
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    const/4 v2, 0x0

    .line 544
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-eqz v3, :cond_1

    .line 549
    .line 550
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    add-int/lit8 v4, v2, 0x1

    .line 555
    .line 556
    if-gez v2, :cond_0

    .line 557
    .line 558
    invoke-static {}, Lj7/q;->t()V

    .line 559
    .line 560
    .line 561
    :cond_0
    check-cast v3, Ljava/lang/Character;

    .line 562
    .line 563
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 564
    .line 565
    .line 566
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move v2, v4

    .line 578
    goto :goto_0

    .line 579
    :cond_1
    invoke-static {v1}, Lj7/K;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    sput-object v0, Lexpo/modules/image/blurhash/BlurhashDecoder;->charMap:Ljava/util/Map;

    .line 584
    .line 585
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

.method private final composeBitmap(IIII[[FZ)Landroid/graphics/Bitmap;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v6, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move/from16 v8, p4

    .line 10
    .line 11
    mul-int v1, v6, v7

    .line 12
    .line 13
    new-array v9, v1, [I

    .line 14
    .line 15
    if-eqz p6, :cond_1

    .line 16
    .line 17
    sget-object v1, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesX:Ljava/util/HashMap;

    .line 18
    .line 19
    mul-int v2, v6, v4

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 35
    :goto_1
    invoke-direct {v0, v2, v6, v4}, Lexpo/modules/image/blurhash/BlurhashDecoder;->getArrayForCosinesX(ZII)[D

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz p6, :cond_3

    .line 40
    .line 41
    sget-object v3, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesY:Ljava/util/HashMap;

    .line 42
    .line 43
    mul-int v5, v7, v8

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/4 v12, 0x0

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    :goto_2
    const/4 v12, 0x1

    .line 59
    :goto_3
    invoke-direct {v0, v12, v7, v8}, Lexpo/modules/image/blurhash/BlurhashDecoder;->getArrayForCosinesY(ZII)[D

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    const/4 v14, 0x0

    .line 64
    :goto_4
    if-ge v14, v7, :cond_7

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    :goto_5
    if-ge v5, v6, :cond_6

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    move v10, v3

    .line 71
    move v15, v10

    .line 72
    const/4 v11, 0x0

    .line 73
    const/16 v16, 0x1

    .line 74
    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    :goto_6
    if-ge v11, v8, :cond_5

    .line 78
    .line 79
    move/from16 v18, v15

    .line 80
    .line 81
    move v15, v10

    .line 82
    move v10, v3

    .line 83
    move/from16 v3, v17

    .line 84
    .line 85
    :goto_7
    if-ge v3, v4, :cond_4

    .line 86
    .line 87
    invoke-direct/range {v0 .. v6}, Lexpo/modules/image/blurhash/BlurhashDecoder;->getCos([DZIIII)D

    .line 88
    .line 89
    .line 90
    move-result-wide v19

    .line 91
    move v4, v7

    .line 92
    move v7, v6

    .line 93
    move v6, v4

    .line 94
    move v4, v8

    .line 95
    move-object v8, v1

    .line 96
    move-object v1, v13

    .line 97
    move v13, v3

    .line 98
    move v3, v11

    .line 99
    move v11, v2

    .line 100
    move v2, v12

    .line 101
    move v12, v5

    .line 102
    move v5, v14

    .line 103
    invoke-direct/range {v0 .. v6}, Lexpo/modules/image/blurhash/BlurhashDecoder;->getCos([DZIIII)D

    .line 104
    .line 105
    .line 106
    move-result-wide v21

    .line 107
    move-object v4, v1

    .line 108
    move/from16 p6, v2

    .line 109
    .line 110
    mul-double v1, v19, v21

    .line 111
    .line 112
    double-to-float v1, v1

    .line 113
    mul-int v2, v3, p3

    .line 114
    .line 115
    add-int/2addr v2, v13

    .line 116
    aget-object v2, p5, v2

    .line 117
    .line 118
    aget v14, v2, v17

    .line 119
    .line 120
    mul-float/2addr v14, v1

    .line 121
    add-float/2addr v10, v14

    .line 122
    aget v14, v2, v16

    .line 123
    .line 124
    mul-float/2addr v14, v1

    .line 125
    add-float v18, v18, v14

    .line 126
    .line 127
    const/4 v14, 0x2

    .line 128
    aget v2, v2, v14

    .line 129
    .line 130
    mul-float/2addr v2, v1

    .line 131
    add-float/2addr v15, v2

    .line 132
    add-int/lit8 v1, v13, 0x1

    .line 133
    .line 134
    move v2, v7

    .line 135
    move v7, v6

    .line 136
    move v6, v2

    .line 137
    move-object v13, v4

    .line 138
    move v14, v5

    .line 139
    move v2, v11

    .line 140
    move v5, v12

    .line 141
    move/from16 v4, p3

    .line 142
    .line 143
    move/from16 v12, p6

    .line 144
    .line 145
    move v11, v3

    .line 146
    move v3, v1

    .line 147
    move-object v1, v8

    .line 148
    move/from16 v8, p4

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_4
    move/from16 p6, v7

    .line 152
    .line 153
    move v7, v6

    .line 154
    move/from16 v6, p6

    .line 155
    .line 156
    move-object v8, v1

    .line 157
    move v3, v11

    .line 158
    move/from16 p6, v12

    .line 159
    .line 160
    move-object v4, v13

    .line 161
    move v11, v2

    .line 162
    move v12, v5

    .line 163
    move v5, v14

    .line 164
    add-int/lit8 v1, v3, 0x1

    .line 165
    .line 166
    move v2, v7

    .line 167
    move v7, v6

    .line 168
    move v6, v2

    .line 169
    move v3, v10

    .line 170
    move v2, v11

    .line 171
    move v5, v12

    .line 172
    move v10, v15

    .line 173
    move/from16 v15, v18

    .line 174
    .line 175
    move/from16 v4, p3

    .line 176
    .line 177
    move/from16 v12, p6

    .line 178
    .line 179
    move v11, v1

    .line 180
    move-object v1, v8

    .line 181
    move/from16 v8, p4

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_5
    move/from16 p6, v7

    .line 185
    .line 186
    move v7, v6

    .line 187
    move/from16 v6, p6

    .line 188
    .line 189
    move-object v8, v1

    .line 190
    move v11, v2

    .line 191
    move/from16 p6, v12

    .line 192
    .line 193
    move-object v4, v13

    .line 194
    move v12, v5

    .line 195
    move v5, v14

    .line 196
    mul-int v1, v7, v5

    .line 197
    .line 198
    add-int/2addr v1, v12

    .line 199
    invoke-direct {v0, v3}, Lexpo/modules/image/blurhash/BlurhashDecoder;->linearToSrgb(F)I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-direct {v0, v15}, Lexpo/modules/image/blurhash/BlurhashDecoder;->linearToSrgb(F)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-direct {v0, v10}, Lexpo/modules/image/blurhash/BlurhashDecoder;->linearToSrgb(F)I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-static {v2, v3, v10}, Landroid/graphics/Color;->rgb(III)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    aput v2, v9, v1

    .line 216
    .line 217
    add-int/lit8 v1, v12, 0x1

    .line 218
    .line 219
    move v2, v7

    .line 220
    move v7, v6

    .line 221
    move v6, v2

    .line 222
    move/from16 v12, p6

    .line 223
    .line 224
    move v2, v11

    .line 225
    move/from16 v4, p3

    .line 226
    .line 227
    move v5, v1

    .line 228
    move-object v1, v8

    .line 229
    move/from16 v8, p4

    .line 230
    .line 231
    goto/16 :goto_5

    .line 232
    .line 233
    :cond_6
    move/from16 p6, v7

    .line 234
    .line 235
    move v7, v6

    .line 236
    move/from16 v6, p6

    .line 237
    .line 238
    move-object v8, v1

    .line 239
    move v11, v2

    .line 240
    move/from16 p6, v12

    .line 241
    .line 242
    move-object v4, v13

    .line 243
    move v5, v14

    .line 244
    const/16 v16, 0x1

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    add-int/lit8 v14, v5, 0x1

    .line 249
    .line 250
    move v1, v7

    .line 251
    move v7, v6

    .line 252
    move v6, v1

    .line 253
    move-object v1, v8

    .line 254
    move/from16 v4, p3

    .line 255
    .line 256
    move/from16 v8, p4

    .line 257
    .line 258
    goto/16 :goto_4

    .line 259
    .line 260
    :cond_7
    move/from16 v23, v7

    .line 261
    .line 262
    move v7, v6

    .line 263
    move/from16 v6, v23

    .line 264
    .line 265
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 266
    .line 267
    invoke-static {v9, v7, v6, v1}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    const-string v2, "createBitmap(...)"

    .line 272
    .line 273
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v1
.end method

.method public static synthetic decode$default(Lexpo/modules/image/blurhash/BlurhashDecoder;Ljava/lang/String;IIFZILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x8

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/high16 p4, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :cond_0
    move v4, p4

    .line 8
    and-int/lit8 p4, p6, 0x10

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    const/4 p5, 0x1

    .line 13
    :cond_1
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move v2, p2

    .line 16
    move v3, p3

    .line 17
    move v5, p5

    .line 18
    invoke-virtual/range {v0 .. v5}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decode(Ljava/lang/String;IIFZ)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private final decode83(Ljava/lang/String;II)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge p2, p3, :cond_2

    .line 3
    .line 4
    sget-object v1, Lexpo/modules/image/blurhash/BlurhashDecoder;->charMap:Ljava/util/Map;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Integer;

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v1, v2

    .line 29
    :goto_1
    if-eq v1, v2, :cond_1

    .line 30
    .line 31
    mul-int/lit8 v0, v0, 0x53

    .line 32
    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return v0
.end method

.method static synthetic decode83$default(Lexpo/modules/image/blurhash/BlurhashDecoder;Ljava/lang/String;IIILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decode83(Ljava/lang/String;II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method private final decodeAc(IF)[F
    .locals 3

    .line 1
    div-int/lit16 v0, p1, 0x169

    .line 2
    .line 3
    div-int/lit8 v1, p1, 0x13

    .line 4
    .line 5
    rem-int/lit8 v1, v1, 0x13

    .line 6
    .line 7
    rem-int/lit8 p1, p1, 0x13

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x9

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    const/high16 v2, 0x41100000    # 9.0f

    .line 13
    .line 14
    div-float/2addr v0, v2

    .line 15
    invoke-direct {p0, v0}, Lexpo/modules/image/blurhash/BlurhashDecoder;->signedPow2(F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    mul-float/2addr v0, p2

    .line 20
    add-int/lit8 v1, v1, -0x9

    .line 21
    .line 22
    int-to-float v1, v1

    .line 23
    div-float/2addr v1, v2

    .line 24
    invoke-direct {p0, v1}, Lexpo/modules/image/blurhash/BlurhashDecoder;->signedPow2(F)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    mul-float/2addr v1, p2

    .line 29
    add-int/lit8 p1, p1, -0x9

    .line 30
    .line 31
    int-to-float p1, p1

    .line 32
    div-float/2addr p1, v2

    .line 33
    invoke-direct {p0, p1}, Lexpo/modules/image/blurhash/BlurhashDecoder;->signedPow2(F)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    mul-float/2addr p1, p2

    .line 38
    const/4 p2, 0x3

    .line 39
    new-array p2, p2, [F

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    aput v0, p2, v2

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    aput v1, p2, v0

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    aput p1, p2, v0

    .line 49
    .line 50
    return-object p2
.end method

.method private final decodeDc(I)[F
    .locals 4

    .line 1
    shr-int/lit8 v0, p1, 0x10

    .line 2
    .line 3
    shr-int/lit8 v1, p1, 0x8

    .line 4
    .line 5
    and-int/lit16 v1, v1, 0xff

    .line 6
    .line 7
    and-int/lit16 p1, p1, 0xff

    .line 8
    .line 9
    sget-object v2, Lexpo/modules/image/blurhash/BlurhashHelpers;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashHelpers;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lexpo/modules/image/blurhash/BlurhashHelpers;->srgbToLinear(I)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {v2, v1}, Lexpo/modules/image/blurhash/BlurhashHelpers;->srgbToLinear(I)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v2, p1}, Lexpo/modules/image/blurhash/BlurhashHelpers;->srgbToLinear(I)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v2, 0x3

    .line 24
    new-array v2, v2, [F

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aput v0, v2, v3

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    aput v1, v2, v0

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    aput p1, v2, v0

    .line 34
    .line 35
    return-object v2
.end method

.method private final getArrayForCosinesX(ZII)[D
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    mul-int/2addr p2, p3

    .line 4
    new-array p1, p2, [D

    .line 5
    .line 6
    sget-object p3, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesX:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesX:Ljava/util/HashMap;

    .line 17
    .line 18
    mul-int/2addr p2, p3

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, [D

    .line 31
    .line 32
    return-object p1
.end method

.method private final getArrayForCosinesY(ZII)[D
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    mul-int/2addr p2, p3

    .line 4
    new-array p1, p2, [D

    .line 5
    .line 6
    sget-object p3, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesY:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesY:Ljava/util/HashMap;

    .line 17
    .line 18
    mul-int/2addr p2, p3

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, [D

    .line 31
    .line 32
    return-object p1
.end method

.method private final getCos([DZIIII)D
    .locals 4

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    mul-int p2, p4, p5

    .line 4
    .line 5
    add-int/2addr p2, p3

    .line 6
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    int-to-double v2, p5

    .line 12
    mul-double/2addr v2, v0

    .line 13
    int-to-double v0, p3

    .line 14
    mul-double/2addr v2, v0

    .line 15
    int-to-double v0, p6

    .line 16
    div-double/2addr v2, v0

    .line 17
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    aput-wide v0, p1, p2

    .line 22
    .line 23
    :cond_0
    mul-int/2addr p4, p5

    .line 24
    add-int/2addr p3, p4

    .line 25
    aget-wide p2, p1, p3

    .line 26
    .line 27
    return-wide p2
.end method

.method private final linearToSrgb(F)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, LB7/d;->k(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const v0, 0x3b4d2e1c    # 0.0031308f

    .line 9
    .line 10
    .line 11
    cmpg-float v0, p1, v0

    .line 12
    .line 13
    const/high16 v1, 0x3f000000    # 0.5f

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    const v0, 0x414eb852    # 12.92f

    .line 18
    .line 19
    .line 20
    mul-float/2addr p1, v0

    .line 21
    const/high16 v0, 0x437f0000    # 255.0f

    .line 22
    .line 23
    :goto_0
    mul-float/2addr p1, v0

    .line 24
    add-float/2addr p1, v1

    .line 25
    float-to-int p1, p1

    .line 26
    return p1

    .line 27
    :cond_0
    float-to-double v2, p1

    .line 28
    const p1, 0x3ed55555

    .line 29
    .line 30
    .line 31
    float-to-double v4, p1

    .line 32
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    double-to-float p1, v2

    .line 37
    const v0, 0x3f870a3d    # 1.055f

    .line 38
    .line 39
    .line 40
    mul-float/2addr p1, v0

    .line 41
    const v0, 0x3d6147ae    # 0.055f

    .line 42
    .line 43
    .line 44
    sub-float/2addr p1, v0

    .line 45
    const/16 v0, 0xff

    .line 46
    .line 47
    int-to-float v0, v0

    .line 48
    goto :goto_0
.end method

.method private final signedPow2(F)F
    .locals 4

    .line 1
    float-to-double v0, p1

    .line 2
    const/high16 v2, 0x40000000    # 2.0f

    .line 3
    .line 4
    float-to-double v2, v2

    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    double-to-float v0, v0

    .line 10
    invoke-static {v0, p1}, Ljava/lang/Math;->copySign(FF)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method


# virtual methods
.method public final clearCache()V
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesX:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/image/blurhash/BlurhashDecoder;->cacheCosinesY:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final decode(Ljava/lang/String;IIFZ)Landroid/graphics/Bitmap;
    .locals 12

    .line 1
    const/4 v1, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v7, 0x6

    .line 9
    if-ge v2, v7, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {p0, p1, v2, v3}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decode83(Ljava/lang/String;II)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    rem-int/lit8 v5, v4, 0x9

    .line 19
    .line 20
    add-int/2addr v5, v3

    .line 21
    div-int/lit8 v4, v4, 0x9

    .line 22
    .line 23
    add-int/2addr v4, v3

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    mul-int/lit8 v8, v5, 0x2

    .line 29
    .line 30
    mul-int/2addr v8, v4

    .line 31
    add-int/lit8 v8, v8, 0x4

    .line 32
    .line 33
    if-eq v6, v8, :cond_1

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_1
    const/4 v8, 0x2

    .line 37
    invoke-direct {p0, p1, v3, v8}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decode83(Ljava/lang/String;II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v3

    .line 42
    int-to-float v1, v1

    .line 43
    const/high16 v3, 0x43260000    # 166.0f

    .line 44
    .line 45
    div-float v9, v1, v3

    .line 46
    .line 47
    mul-int v10, v5, v4

    .line 48
    .line 49
    move v3, v5

    .line 50
    new-array v5, v10, [[F

    .line 51
    .line 52
    :goto_0
    if-ge v2, v10, :cond_3

    .line 53
    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    sget-object v1, Lexpo/modules/image/blurhash/BlurhashDecoder;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashDecoder;

    .line 57
    .line 58
    invoke-direct {v1, p1, v8, v7}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decode83(Ljava/lang/String;II)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-direct {v1, v6}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decodeDc(I)[F

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    mul-int/lit8 v1, v2, 0x2

    .line 68
    .line 69
    add-int/lit8 v6, v1, 0x4

    .line 70
    .line 71
    sget-object v11, Lexpo/modules/image/blurhash/BlurhashDecoder;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashDecoder;

    .line 72
    .line 73
    add-int/2addr v1, v7

    .line 74
    invoke-direct {v11, p1, v6, v1}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decode83(Ljava/lang/String;II)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    mul-float v6, v9, p4

    .line 79
    .line 80
    invoke-direct {v11, v1, v6}, Lexpo/modules/image/blurhash/BlurhashDecoder;->decodeAc(IF)[F

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :goto_1
    aput-object v1, v5, v2

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    move-object v0, p0

    .line 90
    move v1, p2

    .line 91
    move v2, p3

    .line 92
    move/from16 v6, p5

    .line 93
    .line 94
    invoke-direct/range {v0 .. v6}, Lexpo/modules/image/blurhash/BlurhashDecoder;->composeBitmap(IIII[[FZ)Landroid/graphics/Bitmap;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_4
    :goto_2
    return-object v1
.end method
