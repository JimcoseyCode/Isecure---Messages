.class public final Lcom/facebook/react/uimanager/style/BorderInsets;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BorderInsets;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/react/uimanager/style/LogicalEdge;",
        "edge",
        "",
        "width",
        "Li7/B;",
        "setBorderWidth",
        "(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V",
        "",
        "layoutDirection",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/RectF;",
        "resolve",
        "(ILandroid/content/Context;)Landroid/graphics/RectF;",
        "",
        "edgeInsets",
        "[Ljava/lang/Float;",
        "ReactAndroid_release"
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
.field private final edgeInsets:[Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->values()[Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    array-length v0, v0

    .line 9
    new-array v0, v0, [Ljava/lang/Float;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final resolve(ILandroid/content/Context;)Landroid/graphics/RectF;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_26

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne p1, v1, :cond_25

    .line 11
    .line 12
    sget-object p1, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->Companion:Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_12

    .line 23
    .line 24
    new-instance p1, Landroid/graphics/RectF;

    .line 25
    .line 26
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 27
    .line 28
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    aget-object p2, p2, v1

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 44
    .line 45
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    aget-object p2, p2, v1

    .line 52
    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 57
    .line 58
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    aget-object p2, p2, v1

    .line 65
    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 70
    .line 71
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    aget-object p2, p2, v1

    .line 78
    .line 79
    if-eqz p2, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move p2, v0

    .line 83
    :goto_1
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 84
    .line 85
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    aget-object v1, v1, v2

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 101
    .line 102
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    aget-object v1, v1, v2

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 114
    .line 115
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    aget-object v1, v1, v2

    .line 122
    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 127
    .line 128
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    aget-object v1, v1, v2

    .line 135
    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 140
    .line 141
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    aget-object v1, v1, v2

    .line 148
    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_8
    move v1, v0

    .line 153
    :goto_3
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 154
    .line 155
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    aget-object v2, v2, v3

    .line 162
    .line 163
    if-eqz v2, :cond_9

    .line 164
    .line 165
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    goto :goto_5

    .line 170
    :cond_9
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 171
    .line 172
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    aget-object v2, v2, v3

    .line 179
    .line 180
    if-eqz v2, :cond_a

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 184
    .line 185
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    aget-object v2, v2, v3

    .line 192
    .line 193
    if-eqz v2, :cond_b

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_b
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 197
    .line 198
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    aget-object v2, v2, v3

    .line 205
    .line 206
    if-eqz v2, :cond_c

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_c
    move v2, v0

    .line 210
    :goto_5
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 211
    .line 212
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 213
    .line 214
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    aget-object v3, v3, v4

    .line 219
    .line 220
    if-eqz v3, :cond_d

    .line 221
    .line 222
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    goto :goto_7

    .line 227
    :cond_d
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 228
    .line 229
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    aget-object v3, v3, v4

    .line 236
    .line 237
    if-eqz v3, :cond_e

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_e
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 241
    .line 242
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 243
    .line 244
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    aget-object v3, v3, v4

    .line 249
    .line 250
    if-eqz v3, :cond_f

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_f
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 254
    .line 255
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    aget-object v3, v3, v4

    .line 262
    .line 263
    if-eqz v3, :cond_10

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_10
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 267
    .line 268
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    aget-object v3, v3, v4

    .line 275
    .line 276
    if-eqz v3, :cond_11

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_11
    :goto_7
    invoke-direct {p1, p2, v1, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 280
    .line 281
    .line 282
    return-object p1

    .line 283
    :cond_12
    new-instance p1, Landroid/graphics/RectF;

    .line 284
    .line 285
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 286
    .line 287
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    aget-object p2, p2, v1

    .line 294
    .line 295
    if-eqz p2, :cond_13

    .line 296
    .line 297
    :goto_8
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 298
    .line 299
    .line 300
    move-result p2

    .line 301
    goto :goto_9

    .line 302
    :cond_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 303
    .line 304
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    aget-object p2, p2, v1

    .line 311
    .line 312
    if-eqz p2, :cond_14

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 316
    .line 317
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    aget-object p2, p2, v1

    .line 324
    .line 325
    if-eqz p2, :cond_15

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 329
    .line 330
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    aget-object p2, p2, v1

    .line 337
    .line 338
    if-eqz p2, :cond_16

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_16
    move p2, v0

    .line 342
    :goto_9
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 343
    .line 344
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    aget-object v1, v1, v2

    .line 351
    .line 352
    if-eqz v1, :cond_17

    .line 353
    .line 354
    :goto_a
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    goto :goto_b

    .line 359
    :cond_17
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 360
    .line 361
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    aget-object v1, v1, v2

    .line 368
    .line 369
    if-eqz v1, :cond_18

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_18
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 373
    .line 374
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 375
    .line 376
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    aget-object v1, v1, v2

    .line 381
    .line 382
    if-eqz v1, :cond_19

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_19
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 386
    .line 387
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    aget-object v1, v1, v2

    .line 394
    .line 395
    if-eqz v1, :cond_1a

    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_1a
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 399
    .line 400
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 401
    .line 402
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    aget-object v1, v1, v2

    .line 407
    .line 408
    if-eqz v1, :cond_1b

    .line 409
    .line 410
    goto :goto_a

    .line 411
    :cond_1b
    move v1, v0

    .line 412
    :goto_b
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 413
    .line 414
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 415
    .line 416
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    aget-object v2, v2, v3

    .line 421
    .line 422
    if-eqz v2, :cond_1c

    .line 423
    .line 424
    :goto_c
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    goto :goto_d

    .line 429
    :cond_1c
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 430
    .line 431
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 432
    .line 433
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    aget-object v2, v2, v3

    .line 438
    .line 439
    if-eqz v2, :cond_1d

    .line 440
    .line 441
    goto :goto_c

    .line 442
    :cond_1d
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 443
    .line 444
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 445
    .line 446
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    aget-object v2, v2, v3

    .line 451
    .line 452
    if-eqz v2, :cond_1e

    .line 453
    .line 454
    goto :goto_c

    .line 455
    :cond_1e
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 456
    .line 457
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 458
    .line 459
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    aget-object v2, v2, v3

    .line 464
    .line 465
    if-eqz v2, :cond_1f

    .line 466
    .line 467
    goto :goto_c

    .line 468
    :cond_1f
    move v2, v0

    .line 469
    :goto_d
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 470
    .line 471
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 472
    .line 473
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    aget-object v3, v3, v4

    .line 478
    .line 479
    if-eqz v3, :cond_20

    .line 480
    .line 481
    :goto_e
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    goto :goto_f

    .line 486
    :cond_20
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 487
    .line 488
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 489
    .line 490
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    aget-object v3, v3, v4

    .line 495
    .line 496
    if-eqz v3, :cond_21

    .line 497
    .line 498
    goto :goto_e

    .line 499
    :cond_21
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 500
    .line 501
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 502
    .line 503
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    aget-object v3, v3, v4

    .line 508
    .line 509
    if-eqz v3, :cond_22

    .line 510
    .line 511
    goto :goto_e

    .line 512
    :cond_22
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 513
    .line 514
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 515
    .line 516
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    aget-object v3, v3, v4

    .line 521
    .line 522
    if-eqz v3, :cond_23

    .line 523
    .line 524
    goto :goto_e

    .line 525
    :cond_23
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 526
    .line 527
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 528
    .line 529
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    aget-object v3, v3, v4

    .line 534
    .line 535
    if-eqz v3, :cond_24

    .line 536
    .line 537
    goto :goto_e

    .line 538
    :cond_24
    :goto_f
    invoke-direct {p1, p2, v1, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 539
    .line 540
    .line 541
    return-object p1

    .line 542
    :cond_25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 543
    .line 544
    const-string p2, "Expected resolved layout direction"

    .line 545
    .line 546
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw p1

    .line 550
    :cond_26
    new-instance p1, Landroid/graphics/RectF;

    .line 551
    .line 552
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 553
    .line 554
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    aget-object p2, p2, v1

    .line 561
    .line 562
    if-eqz p2, :cond_27

    .line 563
    .line 564
    :goto_10
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 565
    .line 566
    .line 567
    move-result p2

    .line 568
    goto :goto_11

    .line 569
    :cond_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 570
    .line 571
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 572
    .line 573
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    aget-object p2, p2, v1

    .line 578
    .line 579
    if-eqz p2, :cond_28

    .line 580
    .line 581
    goto :goto_10

    .line 582
    :cond_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 583
    .line 584
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 585
    .line 586
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 587
    .line 588
    .line 589
    move-result v1

    .line 590
    aget-object p2, p2, v1

    .line 591
    .line 592
    if-eqz p2, :cond_29

    .line 593
    .line 594
    goto :goto_10

    .line 595
    :cond_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 596
    .line 597
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 598
    .line 599
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    aget-object p2, p2, v1

    .line 604
    .line 605
    if-eqz p2, :cond_2a

    .line 606
    .line 607
    goto :goto_10

    .line 608
    :cond_2a
    move p2, v0

    .line 609
    :goto_11
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 610
    .line 611
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 612
    .line 613
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    aget-object v1, v1, v2

    .line 618
    .line 619
    if-eqz v1, :cond_2b

    .line 620
    .line 621
    :goto_12
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    goto :goto_13

    .line 626
    :cond_2b
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 627
    .line 628
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 629
    .line 630
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    aget-object v1, v1, v2

    .line 635
    .line 636
    if-eqz v1, :cond_2c

    .line 637
    .line 638
    goto :goto_12

    .line 639
    :cond_2c
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 640
    .line 641
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 642
    .line 643
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    aget-object v1, v1, v2

    .line 648
    .line 649
    if-eqz v1, :cond_2d

    .line 650
    .line 651
    goto :goto_12

    .line 652
    :cond_2d
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 653
    .line 654
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 655
    .line 656
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    aget-object v1, v1, v2

    .line 661
    .line 662
    if-eqz v1, :cond_2e

    .line 663
    .line 664
    goto :goto_12

    .line 665
    :cond_2e
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 666
    .line 667
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 668
    .line 669
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 670
    .line 671
    .line 672
    move-result v2

    .line 673
    aget-object v1, v1, v2

    .line 674
    .line 675
    if-eqz v1, :cond_2f

    .line 676
    .line 677
    goto :goto_12

    .line 678
    :cond_2f
    move v1, v0

    .line 679
    :goto_13
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 680
    .line 681
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 682
    .line 683
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 684
    .line 685
    .line 686
    move-result v3

    .line 687
    aget-object v2, v2, v3

    .line 688
    .line 689
    if-eqz v2, :cond_30

    .line 690
    .line 691
    :goto_14
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    goto :goto_15

    .line 696
    :cond_30
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 697
    .line 698
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 699
    .line 700
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    aget-object v2, v2, v3

    .line 705
    .line 706
    if-eqz v2, :cond_31

    .line 707
    .line 708
    goto :goto_14

    .line 709
    :cond_31
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 710
    .line 711
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 712
    .line 713
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    aget-object v2, v2, v3

    .line 718
    .line 719
    if-eqz v2, :cond_32

    .line 720
    .line 721
    goto :goto_14

    .line 722
    :cond_32
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 723
    .line 724
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 725
    .line 726
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 727
    .line 728
    .line 729
    move-result v3

    .line 730
    aget-object v2, v2, v3

    .line 731
    .line 732
    if-eqz v2, :cond_33

    .line 733
    .line 734
    goto :goto_14

    .line 735
    :cond_33
    move v2, v0

    .line 736
    :goto_15
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 737
    .line 738
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 739
    .line 740
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 741
    .line 742
    .line 743
    move-result v4

    .line 744
    aget-object v3, v3, v4

    .line 745
    .line 746
    if-eqz v3, :cond_34

    .line 747
    .line 748
    :goto_16
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 749
    .line 750
    .line 751
    move-result v0

    .line 752
    goto :goto_17

    .line 753
    :cond_34
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 754
    .line 755
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 756
    .line 757
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 758
    .line 759
    .line 760
    move-result v4

    .line 761
    aget-object v3, v3, v4

    .line 762
    .line 763
    if-eqz v3, :cond_35

    .line 764
    .line 765
    goto :goto_16

    .line 766
    :cond_35
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 767
    .line 768
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 769
    .line 770
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 771
    .line 772
    .line 773
    move-result v4

    .line 774
    aget-object v3, v3, v4

    .line 775
    .line 776
    if-eqz v3, :cond_36

    .line 777
    .line 778
    goto :goto_16

    .line 779
    :cond_36
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 780
    .line 781
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 782
    .line 783
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 784
    .line 785
    .line 786
    move-result v4

    .line 787
    aget-object v3, v3, v4

    .line 788
    .line 789
    if-eqz v3, :cond_37

    .line 790
    .line 791
    goto :goto_16

    .line 792
    :cond_37
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 793
    .line 794
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 795
    .line 796
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    aget-object v3, v3, v4

    .line 801
    .line 802
    if-eqz v3, :cond_38

    .line 803
    .line 804
    goto :goto_16

    .line 805
    :cond_38
    :goto_17
    invoke-direct {p1, p2, v1, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 806
    .line 807
    .line 808
    return-object p1
.end method

.method public final setBorderWidth(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V
    .locals 1

    .line 1
    const-string v0, "edge"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aput-object p2, v0, p1

    .line 13
    .line 14
    return-void
.end method
