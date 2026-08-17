.class public final Lexpo/modules/kotlin/defaultmodules/CoreModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0008\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/kotlin/defaultmodules/CoreModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
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

.method public static final synthetic access$getContext(Lexpo/modules/kotlin/defaultmodules/CoreModule;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/defaultmodules/CoreModule;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$AppContextLost;

    .line 13
    .line 14
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$AppContextLost;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "get"

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    const-class v3, Ljava/util/Map;

    .line 8
    .line 9
    const-class v4, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v5, ".ModuleDefinition"

    .line 24
    .line 25
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v7, "["

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v7, "ExpoModulesCore"

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v7, "] "

    .line 48
    .line 49
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v5}, Ll1/a;->c(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :try_start_0
    new-instance v5, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 63
    .line 64
    invoke-direct {v5, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 65
    .line 66
    .line 67
    const-string v6, "expoModulesCoreVersion"

    .line 68
    .line 69
    new-instance v7, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;

    .line 70
    .line 71
    invoke-direct {v7, v6}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v8, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    new-array v10, v9, [Lexpo/modules/kotlin/types/AnyType;

    .line 78
    .line 79
    sget-object v11, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 80
    .line 81
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 94
    .line 95
    if-nez v12, :cond_0

    .line 96
    .line 97
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 98
    .line 99
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_0
    :goto_0
    new-instance v13, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Property$1;

    .line 122
    .line 123
    invoke-direct {v13}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Property$1;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-direct {v8, v0, v10, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v8}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-interface {v8, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    const-string v6, "cacheDir"

    .line 140
    .line 141
    new-instance v7, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;

    .line 142
    .line 143
    invoke-direct {v7, v6}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v8, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 147
    .line 148
    new-array v10, v9, [Lexpo/modules/kotlin/types/AnyType;

    .line 149
    .line 150
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 163
    .line 164
    if-nez v12, :cond_1

    .line 165
    .line 166
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 167
    .line 168
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    :cond_1
    new-instance v13, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Property$2;

    .line 187
    .line 188
    invoke-direct {v13, v1}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Property$2;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v8, v0, v10, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v8}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    invoke-interface {v8, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    const-string v6, "documentsDir"

    .line 205
    .line 206
    new-instance v7, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;

    .line 207
    .line 208
    invoke-direct {v7, v6}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    new-instance v8, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 212
    .line 213
    new-array v10, v9, [Lexpo/modules/kotlin/types/AnyType;

    .line 214
    .line 215
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 228
    .line 229
    if-nez v12, :cond_2

    .line 230
    .line 231
    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    .line 232
    .line 233
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 241
    .line 242
    .line 243
    move-result-object v13

    .line 244
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :cond_2
    new-instance v13, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Property$3;

    .line 252
    .line 253
    invoke-direct {v13, v1}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Property$3;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;)V

    .line 254
    .line 255
    .line 256
    invoke-direct {v8, v0, v10, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v7, v8}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    const-string v0, "uuidv4"

    .line 270
    .line 271
    new-instance v6, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 272
    .line 273
    new-array v7, v9, [Lexpo/modules/kotlin/types/AnyType;

    .line 274
    .line 275
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    check-cast v8, Lexpo/modules/kotlin/types/ReturnType;

    .line 288
    .line 289
    if-nez v8, :cond_3

    .line 290
    .line 291
    new-instance v8, Lexpo/modules/kotlin/types/ReturnType;

    .line 292
    .line 293
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    invoke-direct {v8, v10}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 305
    .line 306
    .line 307
    move-result-object v12

    .line 308
    invoke-interface {v10, v12, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    :cond_3
    new-instance v10, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$1;

    .line 312
    .line 313
    invoke-direct {v10}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$1;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-direct {v6, v0, v7, v8, v10}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-interface {v7, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    const-string v0, "uuidv5"

    .line 327
    .line 328
    new-instance v6, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 329
    .line 330
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 335
    .line 336
    new-instance v10, Lkotlin/Pair;

    .line 337
    .line 338
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 339
    .line 340
    .line 341
    move-result-object v12

    .line 342
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 343
    .line 344
    invoke-direct {v10, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    .line 356
    .line 357
    if-nez v10, :cond_4

    .line 358
    .line 359
    sget-object v10, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$1;->INSTANCE:Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$1;

    .line 360
    .line 361
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 362
    .line 363
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    .line 364
    .line 365
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 366
    .line 367
    .line 368
    move-result-object v15

    .line 369
    invoke-direct {v14, v15, v9, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 370
    .line 371
    .line 372
    invoke-direct {v12, v14, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 373
    .line 374
    .line 375
    move-object v10, v12

    .line 376
    :cond_4
    new-instance v12, Lkotlin/Pair;

    .line 377
    .line 378
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    invoke-direct {v12, v14, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 386
    .line 387
    .line 388
    move-result-object v14

    .line 389
    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v12

    .line 393
    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    .line 394
    .line 395
    if-nez v12, :cond_5

    .line 396
    .line 397
    sget-object v12, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$2;->INSTANCE:Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$2;

    .line 398
    .line 399
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    .line 400
    .line 401
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    .line 402
    .line 403
    move-object/from16 v16, v2

    .line 404
    .line 405
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-direct {v15, v2, v9, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 410
    .line 411
    .line 412
    invoke-direct {v14, v15, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 413
    .line 414
    .line 415
    move-object v12, v14

    .line 416
    goto :goto_1

    .line 417
    :cond_5
    move-object/from16 v16, v2

    .line 418
    .line 419
    :goto_1
    filled-new-array {v10, v12}, [Lexpo/modules/kotlin/types/AnyType;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 428
    .line 429
    .line 430
    move-result-object v10

    .line 431
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    check-cast v7, Lexpo/modules/kotlin/types/ReturnType;

    .line 436
    .line 437
    if-nez v7, :cond_6

    .line 438
    .line 439
    new-instance v7, Lexpo/modules/kotlin/types/ReturnType;

    .line 440
    .line 441
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    invoke-direct {v7, v10}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 453
    .line 454
    .line 455
    move-result-object v12

    .line 456
    invoke-interface {v10, v12, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    :cond_6
    new-instance v10, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$3;

    .line 460
    .line 461
    invoke-direct {v10}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$3;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-direct {v6, v0, v2, v7, v10}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-interface {v2, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    const-string v0, "getViewConfig"

    .line 475
    .line 476
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 477
    .line 478
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    new-instance v7, Lkotlin/Pair;

    .line 483
    .line 484
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    invoke-direct {v7, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 492
    .line 493
    .line 494
    move-result-object v10

    .line 495
    invoke-interface {v10, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v7

    .line 499
    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    .line 500
    .line 501
    if-nez v7, :cond_7

    .line 502
    .line 503
    sget-object v7, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$4;->INSTANCE:Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$4;

    .line 504
    .line 505
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 506
    .line 507
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 508
    .line 509
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 510
    .line 511
    .line 512
    move-result-object v14

    .line 513
    invoke-direct {v12, v14, v9, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 514
    .line 515
    .line 516
    invoke-direct {v10, v12, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 517
    .line 518
    .line 519
    move-object v7, v10

    .line 520
    :cond_7
    new-instance v10, Lkotlin/Pair;

    .line 521
    .line 522
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 523
    .line 524
    .line 525
    move-result-object v12

    .line 526
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 527
    .line 528
    invoke-direct {v10, v12, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 532
    .line 533
    .line 534
    move-result-object v12

    .line 535
    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v10

    .line 539
    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    .line 540
    .line 541
    if-nez v10, :cond_8

    .line 542
    .line 543
    sget-object v10, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$5;->INSTANCE:Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$5;

    .line 544
    .line 545
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 546
    .line 547
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    .line 548
    .line 549
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 550
    .line 551
    .line 552
    move-result-object v15

    .line 553
    const/4 v9, 0x1

    .line 554
    invoke-direct {v14, v15, v9, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 555
    .line 556
    .line 557
    invoke-direct {v12, v14, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 558
    .line 559
    .line 560
    move-object v10, v12

    .line 561
    :cond_8
    filled-new-array {v7, v10}, [Lexpo/modules/kotlin/types/AnyType;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 570
    .line 571
    .line 572
    move-result-object v9

    .line 573
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v7

    .line 577
    check-cast v7, Lexpo/modules/kotlin/types/ReturnType;

    .line 578
    .line 579
    if-nez v7, :cond_9

    .line 580
    .line 581
    new-instance v7, Lexpo/modules/kotlin/types/ReturnType;

    .line 582
    .line 583
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 584
    .line 585
    .line 586
    move-result-object v9

    .line 587
    invoke-direct {v7, v9}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 591
    .line 592
    .line 593
    move-result-object v9

    .line 594
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    invoke-interface {v9, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    :cond_9
    new-instance v3, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$6;

    .line 602
    .line 603
    invoke-direct {v3, v1}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$Function$6;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;)V

    .line 604
    .line 605
    .line 606
    invoke-direct {v2, v0, v6, v7, v3}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    const-string v0, "reloadAppAsync"

    .line 617
    .line 618
    const-class v2, Lexpo/modules/kotlin/Promise;

    .line 619
    .line 620
    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    if-eqz v2, :cond_a

    .line 625
    .line 626
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 627
    .line 628
    const/4 v3, 0x0

    .line 629
    new-array v4, v3, [Lexpo/modules/kotlin/types/AnyType;

    .line 630
    .line 631
    new-instance v3, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$AsyncFunction$1;

    .line 632
    .line 633
    invoke-direct {v3, v1}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$AsyncFunction$1;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;)V

    .line 634
    .line 635
    .line 636
    invoke-direct {v2, v0, v4, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 637
    .line 638
    .line 639
    goto/16 :goto_3

    .line 640
    .line 641
    :cond_a
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    new-instance v3, Lkotlin/Pair;

    .line 646
    .line 647
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 648
    .line 649
    .line 650
    move-result-object v6

    .line 651
    invoke-direct {v3, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 655
    .line 656
    .line 657
    move-result-object v6

    .line 658
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    .line 663
    .line 664
    if-nez v3, :cond_b

    .line 665
    .line 666
    sget-object v3, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$AsyncFunction$2;

    .line 667
    .line 668
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 669
    .line 670
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    .line 671
    .line 672
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 673
    .line 674
    .line 675
    move-result-object v8

    .line 676
    const/4 v9, 0x0

    .line 677
    invoke-direct {v7, v8, v9, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 678
    .line 679
    .line 680
    invoke-direct {v6, v7, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 681
    .line 682
    .line 683
    move-object v3, v6

    .line 684
    :cond_b
    filled-new-array {v3}, [Lexpo/modules/kotlin/types/AnyType;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    new-instance v3, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$AsyncFunction$3;

    .line 689
    .line 690
    invoke-direct {v3, v1}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$AsyncFunction$3;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;)V

    .line 691
    .line 692
    .line 693
    const-class v6, Li7/B;

    .line 694
    .line 695
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 696
    .line 697
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v7

    .line 701
    if-eqz v7, :cond_c

    .line 702
    .line 703
    new-instance v4, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 704
    .line 705
    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 706
    .line 707
    .line 708
    :goto_2
    move-object v2, v4

    .line 709
    goto :goto_3

    .line 710
    :cond_c
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 711
    .line 712
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v7

    .line 716
    if-eqz v7, :cond_d

    .line 717
    .line 718
    new-instance v4, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 719
    .line 720
    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 721
    .line 722
    .line 723
    goto :goto_2

    .line 724
    :cond_d
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 725
    .line 726
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v7

    .line 730
    if-eqz v7, :cond_e

    .line 731
    .line 732
    new-instance v4, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 733
    .line 734
    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 735
    .line 736
    .line 737
    goto :goto_2

    .line 738
    :cond_e
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 739
    .line 740
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v7

    .line 744
    if-eqz v7, :cond_f

    .line 745
    .line 746
    new-instance v4, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 747
    .line 748
    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 749
    .line 750
    .line 751
    goto :goto_2

    .line 752
    :cond_f
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    if-eqz v4, :cond_10

    .line 757
    .line 758
    new-instance v4, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 759
    .line 760
    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 761
    .line 762
    .line 763
    goto :goto_2

    .line 764
    :cond_10
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 765
    .line 766
    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 767
    .line 768
    .line 769
    goto :goto_2

    .line 770
    :goto_3
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    const-string v0, "installOnUIRuntime"

    .line 778
    .line 779
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 780
    .line 781
    const/4 v3, 0x0

    .line 782
    new-array v3, v3, [Lexpo/modules/kotlin/types/AnyType;

    .line 783
    .line 784
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 785
    .line 786
    .line 787
    move-result-object v4

    .line 788
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 789
    .line 790
    .line 791
    move-result-object v6

    .line 792
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    .line 797
    .line 798
    if-nez v4, :cond_11

    .line 799
    .line 800
    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    .line 801
    .line 802
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    invoke-direct {v4, v6}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 810
    .line 811
    .line 812
    move-result-object v6

    .line 813
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 814
    .line 815
    .line 816
    move-result-object v7

    .line 817
    invoke-interface {v6, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    :cond_11
    new-instance v6, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2;

    .line 821
    .line 822
    invoke-direct {v6, v1}, Lexpo/modules/kotlin/defaultmodules/CoreModule$definition$lambda$14$$inlined$FunctionWithoutArgs$2;-><init>(Lexpo/modules/kotlin/defaultmodules/CoreModule;)V

    .line 823
    .line 824
    .line 825
    invoke-direct {v2, v0, v3, v4, v6}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v5}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 836
    .line 837
    .line 838
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 839
    invoke-static {}, Ll1/a;->f()V

    .line 840
    .line 841
    .line 842
    return-object v0

    .line 843
    :goto_4
    invoke-static {}, Ll1/a;->f()V

    .line 844
    .line 845
    .line 846
    throw v0
.end method
