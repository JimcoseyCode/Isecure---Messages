.class public final Lexpo/modules/splashscreen/SplashScreenModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lexpo/modules/splashscreen/SplashScreenModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "userControlledAutoHideEnabled",
        "",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "expo-splash-screen_release"
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
.field private userControlledAutoHideEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getUserControlledAutoHideEnabled$p(Lexpo/modules/splashscreen/SplashScreenModule;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lexpo/modules/splashscreen/SplashScreenModule;->userControlledAutoHideEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$setUserControlledAutoHideEnabled$p(Lexpo/modules/splashscreen/SplashScreenModule;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/splashscreen/SplashScreenModule;->userControlledAutoHideEnabled:Z

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 15

    .line 1
    const-class v0, Lexpo/modules/splashscreen/SplashScreenOptions;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-class v2, LR8/A0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, ".ModuleDefinition"

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "["

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v5, "ExpoModulesCore"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v5, "] "

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, Ll1/a;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance v3, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 59
    .line 60
    invoke-direct {v3, p0}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "ExpoSplashScreen"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "preventAutoHideAsync"

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    new-array v6, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 72
    .line 73
    new-instance v7, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunction$1;

    .line 74
    .line 75
    invoke-direct {v7, p0}, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunction$1;-><init>(Lexpo/modules/splashscreen/SplashScreenModule;)V

    .line 76
    .line 77
    .line 78
    const-class v8, Ljava/lang/Boolean;

    .line 79
    .line 80
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    const-class v11, Ljava/lang/String;

    .line 87
    .line 88
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    sget-object v13, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    if-eqz v10, :cond_0

    .line 95
    .line 96
    :try_start_1
    new-instance v8, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 97
    .line 98
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :cond_0
    invoke-static {v8, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_1

    .line 110
    .line 111
    new-instance v8, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 112
    .line 113
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    invoke-static {v8, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_2

    .line 122
    .line 123
    new-instance v8, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 124
    .line 125
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    invoke-static {v8, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_3

    .line 134
    .line 135
    new-instance v8, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 136
    .line 137
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_3
    invoke-static {v8, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_4

    .line 146
    .line 147
    new-instance v8, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 148
    .line 149
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    new-instance v8, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 154
    .line 155
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 156
    .line 157
    .line 158
    :goto_0
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-interface {v6, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    const-string v4, "internalPreventAutoHideAsync"

    .line 166
    .line 167
    new-array v6, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 168
    .line 169
    new-instance v7, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunction$2;

    .line 170
    .line 171
    invoke-direct {v7}, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunction$2;-><init>()V

    .line 172
    .line 173
    .line 174
    const-class v8, Li7/B;

    .line 175
    .line 176
    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-eqz v9, :cond_5

    .line 181
    .line 182
    new-instance v8, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 183
    .line 184
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_5
    invoke-static {v8, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-eqz v9, :cond_6

    .line 193
    .line 194
    new-instance v8, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 195
    .line 196
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_6
    invoke-static {v8, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_7

    .line 205
    .line 206
    new-instance v8, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 207
    .line 208
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_7
    invoke-static {v8, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_8

    .line 217
    .line 218
    new-instance v8, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 219
    .line 220
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_8
    invoke-static {v8, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-eqz v8, :cond_9

    .line 229
    .line 230
    new-instance v8, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 231
    .line 232
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 233
    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_9
    new-instance v8, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 237
    .line 238
    invoke-direct {v8, v4, v6, v7}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 239
    .line 240
    .line 241
    :goto_1
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-interface {v6, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    const-string v4, "setOptions"

    .line 249
    .line 250
    new-instance v6, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 251
    .line 252
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 257
    .line 258
    new-instance v9, Lkotlin/Pair;

    .line 259
    .line 260
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    .line 278
    .line 279
    if-nez v8, :cond_a

    .line 280
    .line 281
    sget-object v8, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$Function$1;->INSTANCE:Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$Function$1;

    .line 282
    .line 283
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 284
    .line 285
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 286
    .line 287
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-direct {v10, v0, v5, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 292
    .line 293
    .line 294
    invoke-direct {v9, v10, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 295
    .line 296
    .line 297
    move-object v8, v9

    .line 298
    :cond_a
    filled-new-array {v8}, [Lexpo/modules/kotlin/types/AnyType;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    sget-object v7, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 303
    .line 304
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    check-cast v8, Lexpo/modules/kotlin/types/ReturnType;

    .line 317
    .line 318
    if-nez v8, :cond_b

    .line 319
    .line 320
    new-instance v8, Lexpo/modules/kotlin/types/ReturnType;

    .line 321
    .line 322
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    invoke-direct {v8, v9}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-interface {v9, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    :cond_b
    new-instance v2, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$Function$2;

    .line 341
    .line 342
    invoke-direct {v2, p0}, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$Function$2;-><init>(Lexpo/modules/splashscreen/SplashScreenModule;)V

    .line 343
    .line 344
    .line 345
    invoke-direct {v6, v4, v0, v8, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    const-string v0, "hide"

    .line 356
    .line 357
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 358
    .line 359
    new-array v4, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 360
    .line 361
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    check-cast v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 374
    .line 375
    if-nez v6, :cond_c

    .line 376
    .line 377
    new-instance v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 378
    .line 379
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    invoke-direct {v6, v8}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-interface {v7, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    :cond_c
    new-instance v1, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$FunctionWithoutArgs$1;

    .line 398
    .line 399
    invoke-direct {v1}, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$FunctionWithoutArgs$1;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-direct {v2, v0, v4, v6, v1}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    const-string v0, "hideAsync"

    .line 413
    .line 414
    new-array v1, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 415
    .line 416
    new-instance v2, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunctionWithoutArgs$1;

    .line 417
    .line 418
    invoke-direct {v2}, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunctionWithoutArgs$1;-><init>()V

    .line 419
    .line 420
    .line 421
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 422
    .line 423
    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    const-string v0, "internalMaybeHideAsync"

    .line 434
    .line 435
    new-array v1, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 436
    .line 437
    new-instance v2, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunctionWithoutArgs$2;

    .line 438
    .line 439
    invoke-direct {v2, p0}, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$AsyncFunctionWithoutArgs$2;-><init>(Lexpo/modules/splashscreen/SplashScreenModule;)V

    .line 440
    .line 441
    .line 442
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 443
    .line 444
    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v3}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    sget-object v1, Lexpo/modules/kotlin/events/EventName;->MODULE_DESTROY:Lexpo/modules/kotlin/events/EventName;

    .line 459
    .line 460
    new-instance v2, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 461
    .line 462
    new-instance v4, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$OnDestroy$1;

    .line 463
    .line 464
    invoke-direct {v4}, Lexpo/modules/splashscreen/SplashScreenModule$definition$lambda$7$$inlined$OnDestroy$1;-><init>()V

    .line 465
    .line 466
    .line 467
    invoke-direct {v2, v1, v4}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 468
    .line 469
    .line 470
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v3}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 474
    .line 475
    .line 476
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 477
    invoke-static {}, Ll1/a;->f()V

    .line 478
    .line 479
    .line 480
    return-object v0

    .line 481
    :goto_2
    invoke-static {}, Ll1/a;->f()V

    .line 482
    .line 483
    .line 484
    throw v0
.end method
