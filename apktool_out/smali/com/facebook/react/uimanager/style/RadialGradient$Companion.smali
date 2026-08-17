.class public final Lcom/facebook/react/uimanager/style/RadialGradient$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/style/RadialGradient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/RadialGradient$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/RadialGradient$Companion;",
        "",
        "<init>",
        "()V",
        "parse",
        "Lcom/facebook/react/uimanager/style/Gradient;",
        "gradientMap",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "context",
        "Landroid/content/Context;",
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
    invoke-direct {p0}, Lcom/facebook/react/uimanager/style/RadialGradient$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)Lcom/facebook/react/uimanager/style/Gradient;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "gradientMap"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "context"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "shape"

    .line 16
    .line 17
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    move-object v3, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v3, v4

    .line 27
    :goto_0
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    sget-object v3, Lcom/facebook/react/uimanager/style/RadialGradient$Shape;->Companion:Lcom/facebook/react/uimanager/style/RadialGradient$Shape$Companion;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Lcom/facebook/react/uimanager/style/RadialGradient$Shape$Companion;->fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v2, v4

    .line 43
    :goto_1
    const-string v3, "size"

    .line 44
    .line 45
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    move-object v5, v0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v5, v4

    .line 54
    :goto_2
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x2

    .line 56
    if-eqz v5, :cond_6

    .line 57
    .line 58
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    sget-object v9, Lcom/facebook/react/uimanager/style/RadialGradient$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 63
    .line 64
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    aget v8, v9, v8

    .line 69
    .line 70
    const/4 v9, 0x1

    .line 71
    if-eq v8, v9, :cond_5

    .line 72
    .line 73
    if-eq v8, v7, :cond_3

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_3
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v3, :cond_6

    .line 81
    .line 82
    const-string v5, "x"

    .line 83
    .line 84
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    const-string v9, "y"

    .line 89
    .line 90
    if-eqz v8, :cond_4

    .line 91
    .line 92
    invoke-interface {v3, v9}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    move-object v3, v4

    .line 100
    :goto_3
    if-eqz v3, :cond_6

    .line 101
    .line 102
    sget-object v8, Lcom/facebook/react/uimanager/LengthPercentage;->Companion:Lcom/facebook/react/uimanager/LengthPercentage$Companion;

    .line 103
    .line 104
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-static {v8, v5, v6, v7, v4}, Lcom/facebook/react/uimanager/LengthPercentage$Companion;->setFromDynamic$default(Lcom/facebook/react/uimanager/LengthPercentage$Companion;Lcom/facebook/react/bridge/Dynamic;ZILjava/lang/Object;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-interface {v3, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {v8, v3, v6, v7, v4}, Lcom/facebook/react/uimanager/LengthPercentage$Companion;->setFromDynamic$default(Lcom/facebook/react/uimanager/LengthPercentage$Companion;Lcom/facebook/react/bridge/Dynamic;ZILjava/lang/Object;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-eqz v5, :cond_6

    .line 121
    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    new-instance v8, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 125
    .line 126
    invoke-direct {v8, v5, v3}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;-><init>(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    sget-object v8, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;->Companion:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType$Companion;

    .line 131
    .line 132
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v8, v3}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType$Companion;->fromString(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-eqz v3, :cond_6

    .line 141
    .line 142
    new-instance v5, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;

    .line 143
    .line 144
    invoke-direct {v5, v3}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;-><init>(Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)V

    .line 145
    .line 146
    .line 147
    move-object v8, v5

    .line 148
    goto :goto_5

    .line 149
    :cond_6
    :goto_4
    move-object v8, v4

    .line 150
    :goto_5
    const-string v3, "position"

    .line 151
    .line 152
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    move-object v5, v0

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    move-object v5, v4

    .line 161
    :goto_6
    if-eqz v5, :cond_c

    .line 162
    .line 163
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    if-nez v5, :cond_8

    .line 168
    .line 169
    return-object v4

    .line 170
    :cond_8
    const-string v9, "top"

    .line 171
    .line 172
    invoke-interface {v5, v9}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-eqz v10, :cond_9

    .line 177
    .line 178
    invoke-interface {v5, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    sget-object v10, Lcom/facebook/react/uimanager/LengthPercentage;->Companion:Lcom/facebook/react/uimanager/LengthPercentage$Companion;

    .line 183
    .line 184
    invoke-static {v10, v9, v6, v7, v4}, Lcom/facebook/react/uimanager/LengthPercentage$Companion;->setFromDynamic$default(Lcom/facebook/react/uimanager/LengthPercentage$Companion;Lcom/facebook/react/bridge/Dynamic;ZILjava/lang/Object;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    move-object v10, v4

    .line 189
    goto :goto_7

    .line 190
    :cond_9
    const-string v9, "bottom"

    .line 191
    .line 192
    invoke-interface {v5, v9}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_b

    .line 197
    .line 198
    invoke-interface {v5, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    sget-object v10, Lcom/facebook/react/uimanager/LengthPercentage;->Companion:Lcom/facebook/react/uimanager/LengthPercentage$Companion;

    .line 203
    .line 204
    invoke-static {v10, v9, v6, v7, v4}, Lcom/facebook/react/uimanager/LengthPercentage$Companion;->setFromDynamic$default(Lcom/facebook/react/uimanager/LengthPercentage$Companion;Lcom/facebook/react/bridge/Dynamic;ZILjava/lang/Object;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    move-object v10, v9

    .line 209
    move-object v9, v4

    .line 210
    :goto_7
    const-string v11, "left"

    .line 211
    .line 212
    invoke-interface {v5, v11}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-eqz v12, :cond_a

    .line 217
    .line 218
    invoke-interface {v5, v11}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    sget-object v11, Lcom/facebook/react/uimanager/LengthPercentage;->Companion:Lcom/facebook/react/uimanager/LengthPercentage$Companion;

    .line 223
    .line 224
    invoke-static {v11, v5, v6, v7, v4}, Lcom/facebook/react/uimanager/LengthPercentage$Companion;->setFromDynamic$default(Lcom/facebook/react/uimanager/LengthPercentage$Companion;Lcom/facebook/react/bridge/Dynamic;ZILjava/lang/Object;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    move-object v11, v4

    .line 229
    goto :goto_8

    .line 230
    :cond_a
    const-string v11, "right"

    .line 231
    .line 232
    invoke-interface {v5, v11}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    if-eqz v12, :cond_b

    .line 237
    .line 238
    invoke-interface {v5, v11}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    sget-object v11, Lcom/facebook/react/uimanager/LengthPercentage;->Companion:Lcom/facebook/react/uimanager/LengthPercentage$Companion;

    .line 243
    .line 244
    invoke-static {v11, v5, v6, v7, v4}, Lcom/facebook/react/uimanager/LengthPercentage$Companion;->setFromDynamic$default(Lcom/facebook/react/uimanager/LengthPercentage$Companion;Lcom/facebook/react/bridge/Dynamic;ZILjava/lang/Object;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    move-object v11, v5

    .line 249
    move-object v5, v4

    .line 250
    :goto_8
    new-instance v12, Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 251
    .line 252
    invoke-direct {v12, v9, v5, v11, v10}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;-><init>(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V

    .line 253
    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_b
    return-object v4

    .line 257
    :cond_c
    move-object v12, v4

    .line 258
    :goto_9
    const-string v5, "colorStops"

    .line 259
    .line 260
    invoke-interface {v0, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-eqz v9, :cond_d

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_d
    move-object v0, v4

    .line 268
    :goto_a
    if-eqz v0, :cond_13

    .line 269
    .line 270
    invoke-interface {v0, v5}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-nez v0, :cond_e

    .line 275
    .line 276
    return-object v4

    .line 277
    :cond_e
    new-instance v5, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    move v10, v6

    .line 291
    :goto_b
    if-ge v10, v9, :cond_14

    .line 292
    .line 293
    invoke-interface {v0, v10}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    if-nez v11, :cond_f

    .line 298
    .line 299
    goto :goto_e

    .line 300
    :cond_f
    const-string v13, "color"

    .line 301
    .line 302
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v14

    .line 306
    if-eqz v14, :cond_12

    .line 307
    .line 308
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    move-result v14

    .line 312
    if-eqz v14, :cond_10

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_10
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    sget-object v15, Lcom/facebook/react/bridge/ReadableType;->Map:Lcom/facebook/react/bridge/ReadableType;

    .line 320
    .line 321
    if-ne v14, v15, :cond_11

    .line 322
    .line 323
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 324
    .line 325
    .line 326
    move-result-object v13

    .line 327
    invoke-static {v13, v1}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v13

    .line 331
    goto :goto_d

    .line 332
    :cond_11
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    goto :goto_d

    .line 341
    :cond_12
    :goto_c
    move-object v13, v4

    .line 342
    :goto_d
    sget-object v14, Lcom/facebook/react/uimanager/LengthPercentage;->Companion:Lcom/facebook/react/uimanager/LengthPercentage$Companion;

    .line 343
    .line 344
    invoke-interface {v11, v3}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    invoke-static {v14, v11, v6, v7, v4}, Lcom/facebook/react/uimanager/LengthPercentage$Companion;->setFromDynamic$default(Lcom/facebook/react/uimanager/LengthPercentage$Companion;Lcom/facebook/react/bridge/Dynamic;ZILjava/lang/Object;)Lcom/facebook/react/uimanager/LengthPercentage;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    new-instance v14, Lcom/facebook/react/uimanager/style/ColorStop;

    .line 353
    .line 354
    invoke-direct {v14, v13, v11}, Lcom/facebook/react/uimanager/style/ColorStop;-><init>(Ljava/lang/Integer;Lcom/facebook/react/uimanager/LengthPercentage;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    :goto_e
    add-int/lit8 v10, v10, 0x1

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_13
    move-object v5, v4

    .line 364
    :cond_14
    if-eqz v2, :cond_15

    .line 365
    .line 366
    if-eqz v8, :cond_15

    .line 367
    .line 368
    if-eqz v12, :cond_15

    .line 369
    .line 370
    if-eqz v5, :cond_15

    .line 371
    .line 372
    new-instance v0, Lcom/facebook/react/uimanager/style/RadialGradient;

    .line 373
    .line 374
    invoke-direct {v0, v2, v8, v12, v5}, Lcom/facebook/react/uimanager/style/RadialGradient;-><init>(Lcom/facebook/react/uimanager/style/RadialGradient$Shape;Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;Lcom/facebook/react/uimanager/style/RadialGradient$Position;Ljava/util/List;)V

    .line 375
    .line 376
    .line 377
    return-object v0

    .line 378
    :cond_15
    return-object v4
.end method
