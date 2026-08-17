.class public final Lexpo/modules/intentlauncher/IntentLauncherModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/intentlauncher/IntentLauncherModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "pendingPromise",
        "Lexpo/modules/kotlin/Promise;",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "expo-intent-launcher_release"
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
.field private pendingPromise:Lexpo/modules/kotlin/Promise;


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

.method public static final synthetic access$getContext(Lexpo/modules/intentlauncher/IntentLauncherModule;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/intentlauncher/IntentLauncherModule;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getPendingPromise$p(Lexpo/modules/intentlauncher/IntentLauncherModule;)Lexpo/modules/kotlin/Promise;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/intentlauncher/IntentLauncherModule;->pendingPromise:Lexpo/modules/kotlin/Promise;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setPendingPromise$p(Lexpo/modules/intentlauncher/IntentLauncherModule;Lexpo/modules/kotlin/Promise;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/intentlauncher/IntentLauncherModule;->pendingPromise:Lexpo/modules/kotlin/Promise;

    .line 2
    .line 3
    return-void
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


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 14

    .line 1
    const-class v0, Lexpo/modules/intentlauncher/IntentLauncherParams;

    .line 2
    .line 3
    const-class v1, Li7/B;

    .line 4
    .line 5
    const-class v2, Ljava/lang/String;

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
    const-string v4, "ExpoIntentLauncher"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "startActivity"

    .line 69
    .line 70
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 71
    .line 72
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 77
    .line 78
    new-instance v8, Lkotlin/Pair;

    .line 79
    .line 80
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    if-nez v8, :cond_0

    .line 101
    .line 102
    sget-object v8, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$1;

    .line 103
    .line 104
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 105
    .line 106
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 107
    .line 108
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    invoke-direct {v12, v13, v9, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v11, v12, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 116
    .line 117
    .line 118
    move-object v8, v11

    .line 119
    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_0
    :goto_0
    new-instance v11, Lkotlin/Pair;

    .line 124
    .line 125
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    .line 141
    .line 142
    if-nez v11, :cond_1

    .line 143
    .line 144
    sget-object v11, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$2;

    .line 145
    .line 146
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 147
    .line 148
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 149
    .line 150
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {v13, v0, v9, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {v12, v13, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 158
    .line 159
    .line 160
    move-object v11, v12

    .line 161
    :cond_1
    filled-new-array {v8, v11}, [Lexpo/modules/kotlin/types/AnyType;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v6, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$3;

    .line 166
    .line 167
    invoke-direct {v6, p0}, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunctionWithPromise$3;-><init>(Lexpo/modules/intentlauncher/IntentLauncherModule;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v5, v4, v0, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const-string v0, "openApplication"

    .line 181
    .line 182
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 183
    .line 184
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    new-instance v6, Lkotlin/Pair;

    .line 189
    .line 190
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-direct {v6, v8, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    .line 206
    .line 207
    if-nez v6, :cond_2

    .line 208
    .line 209
    sget-object v6, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$1;->INSTANCE:Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$1;

    .line 210
    .line 211
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 212
    .line 213
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    .line 214
    .line 215
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    invoke-direct {v11, v12, v9, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v8, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 223
    .line 224
    .line 225
    move-object v6, v8

    .line 226
    :cond_2
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    sget-object v6, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 231
    .line 232
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    check-cast v8, Lexpo/modules/kotlin/types/ReturnType;

    .line 245
    .line 246
    if-nez v8, :cond_3

    .line 247
    .line 248
    new-instance v8, Lexpo/modules/kotlin/types/ReturnType;

    .line 249
    .line 250
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    invoke-direct {v8, v11}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-interface {v6, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    :cond_3
    new-instance v1, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$2;

    .line 269
    .line 270
    invoke-direct {v1, p0}, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$Function$2;-><init>(Lexpo/modules/intentlauncher/IntentLauncherModule;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v4, v0, v5, v8, v1}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    const-string v0, "getApplicationIcon"

    .line 284
    .line 285
    const-class v1, Lexpo/modules/kotlin/Promise;

    .line 286
    .line 287
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_4

    .line 292
    .line 293
    new-instance v1, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 294
    .line 295
    new-array v2, v9, [Lexpo/modules/kotlin/types/AnyType;

    .line 296
    .line 297
    new-instance v4, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$1;

    .line 298
    .line 299
    invoke-direct {v4, p0}, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$1;-><init>(Lexpo/modules/intentlauncher/IntentLauncherModule;)V

    .line 300
    .line 301
    .line 302
    invoke-direct {v1, v0, v2, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_2

    .line 306
    .line 307
    :cond_4
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    new-instance v4, Lkotlin/Pair;

    .line 312
    .line 313
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    .line 329
    .line 330
    if-nez v4, :cond_5

    .line 331
    .line 332
    sget-object v4, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$2;

    .line 333
    .line 334
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 335
    .line 336
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    .line 337
    .line 338
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    invoke-direct {v6, v7, v9, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 343
    .line 344
    .line 345
    invoke-direct {v5, v6, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 346
    .line 347
    .line 348
    move-object v4, v5

    .line 349
    :cond_5
    filled-new-array {v4}, [Lexpo/modules/kotlin/types/AnyType;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    new-instance v4, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$3;

    .line 354
    .line 355
    invoke-direct {v4, p0}, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$AsyncFunction$3;-><init>(Lexpo/modules/intentlauncher/IntentLauncherModule;)V

    .line 356
    .line 357
    .line 358
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 359
    .line 360
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-eqz v5, :cond_6

    .line 365
    .line 366
    new-instance v2, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 367
    .line 368
    invoke-direct {v2, v0, v1, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 369
    .line 370
    .line 371
    :goto_1
    move-object v1, v2

    .line 372
    goto :goto_2

    .line 373
    :cond_6
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 374
    .line 375
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-eqz v5, :cond_7

    .line 380
    .line 381
    new-instance v2, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 382
    .line 383
    invoke-direct {v2, v0, v1, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 384
    .line 385
    .line 386
    goto :goto_1

    .line 387
    :cond_7
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 388
    .line 389
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_8

    .line 394
    .line 395
    new-instance v2, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 396
    .line 397
    invoke-direct {v2, v0, v1, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 398
    .line 399
    .line 400
    goto :goto_1

    .line 401
    :cond_8
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 402
    .line 403
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    if-eqz v5, :cond_9

    .line 408
    .line 409
    new-instance v2, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 410
    .line 411
    invoke-direct {v2, v0, v1, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 412
    .line 413
    .line 414
    goto :goto_1

    .line 415
    :cond_9
    invoke-static {v2, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-eqz v2, :cond_a

    .line 420
    .line 421
    new-instance v2, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 422
    .line 423
    invoke-direct {v2, v0, v1, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 424
    .line 425
    .line 426
    goto :goto_1

    .line 427
    :cond_a
    new-instance v2, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 428
    .line 429
    invoke-direct {v2, v0, v1, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 430
    .line 431
    .line 432
    goto :goto_1

    .line 433
    :goto_2
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    sget-object v1, Lexpo/modules/kotlin/events/EventName;->ON_ACTIVITY_RESULT:Lexpo/modules/kotlin/events/EventName;

    .line 445
    .line 446
    new-instance v2, Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;

    .line 447
    .line 448
    new-instance v4, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$OnActivityResult$1;

    .line 449
    .line 450
    invoke-direct {v4, p0}, Lexpo/modules/intentlauncher/IntentLauncherModule$definition$lambda$14$$inlined$OnActivityResult$1;-><init>(Lexpo/modules/intentlauncher/IntentLauncherModule;)V

    .line 451
    .line 452
    .line 453
    invoke-direct {v2, v1, v4}, Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;-><init>(Lexpo/modules/kotlin/events/EventName;Lkotlin/jvm/functions/Function2;)V

    .line 454
    .line 455
    .line 456
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v3}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 460
    .line 461
    .line 462
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 463
    invoke-static {}, Ll1/a;->f()V

    .line 464
    .line 465
    .line 466
    return-object v0

    .line 467
    :goto_3
    invoke-static {}, Ll1/a;->f()V

    .line 468
    .line 469
    .line 470
    throw v0
.end method
