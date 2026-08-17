.class public final Lexpo/modules/webview/DomWebViewModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lexpo/modules/webview/DomWebViewModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "expo-dom-webview_release"
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


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 24

    .line 1
    const-class v0, Li7/B;

    .line 2
    .line 3
    const-class v1, Lexpo/modules/webview/ScrollToParam;

    .line 4
    .line 5
    const-class v2, Lexpo/modules/webview/DomWebViewSource;

    .line 6
    .line 7
    const-class v3, Ljava/lang/Integer;

    .line 8
    .line 9
    const-class v4, Lexpo/modules/webview/DomWebView;

    .line 10
    .line 11
    const-class v5, Ljava/lang/Boolean;

    .line 12
    .line 13
    const-class v6, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    new-instance v8, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v7, ".ModuleDefinition"

    .line 28
    .line 29
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    new-instance v8, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v9, "["

    .line 42
    .line 43
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v9, "ExpoModulesCore"

    .line 47
    .line 48
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v9, "] "

    .line 52
    .line 53
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, Ll1/a;->c(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    new-instance v7, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 67
    .line 68
    move-object/from16 v8, p0

    .line 69
    .line 70
    invoke-direct {v7, v8}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 71
    .line 72
    .line 73
    const-string v9, "ExpoDomWebViewModule"

    .line 74
    .line 75
    invoke-virtual {v7, v9}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    sget-object v10, Lexpo/modules/kotlin/events/EventName;->MODULE_DESTROY:Lexpo/modules/kotlin/events/EventName;

    .line 83
    .line 84
    new-instance v11, Lexpo/modules/kotlin/events/BasicEventListener;

    .line 85
    .line 86
    new-instance v12, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$OnDestroy$1;

    .line 87
    .line 88
    invoke-direct {v12}, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$OnDestroy$1;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-direct {v11, v10, v12}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v9, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    const-string v9, "evalJsForWebViewAsync"

    .line 98
    .line 99
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    sget-object v11, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 104
    .line 105
    new-instance v12, Lkotlin/Pair;

    .line 106
    .line 107
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    .line 125
    .line 126
    if-nez v12, :cond_0

    .line 127
    .line 128
    sget-object v12, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$1;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$1;

    .line 129
    .line 130
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 131
    .line 132
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 133
    .line 134
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    move-object/from16 v16, v1

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    invoke-direct {v13, v3, v1, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v15, v13, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 145
    .line 146
    .line 147
    move-object v12, v15

    .line 148
    goto :goto_0

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    goto/16 :goto_6

    .line 151
    .line 152
    :cond_0
    move-object/from16 v16, v1

    .line 153
    .line 154
    :goto_0
    new-instance v1, Lkotlin/Pair;

    .line 155
    .line 156
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-direct {v1, v3, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    .line 172
    .line 173
    if-nez v1, :cond_1

    .line 174
    .line 175
    sget-object v1, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$2;

    .line 176
    .line 177
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 178
    .line 179
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 180
    .line 181
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    move-object/from16 v17, v2

    .line 186
    .line 187
    const/4 v2, 0x0

    .line 188
    invoke-direct {v13, v15, v2, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v3, v13, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 192
    .line 193
    .line 194
    move-object v1, v3

    .line 195
    goto :goto_1

    .line 196
    :cond_1
    move-object/from16 v17, v2

    .line 197
    .line 198
    :goto_1
    filled-new-array {v12, v1}, [Lexpo/modules/kotlin/types/AnyType;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    new-instance v2, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$3;

    .line 203
    .line 204
    invoke-direct {v2}, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$3;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance v3, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 208
    .line 209
    invoke-direct {v3, v9, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    new-instance v2, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;

    .line 224
    .line 225
    new-instance v18, Lexpo/modules/kotlin/types/LazyKType;

    .line 226
    .line 227
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 228
    .line 229
    .line 230
    move-result-object v19

    .line 231
    sget-object v21, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$View$1;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$$inlined$View$1;

    .line 232
    .line 233
    const/16 v22, 0x2

    .line 234
    .line 235
    const/16 v23, 0x0

    .line 236
    .line 237
    const/16 v20, 0x0

    .line 238
    .line 239
    invoke-direct/range {v18 .. v23}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v3, v18

    .line 243
    .line 244
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    invoke-direct {v2, v1, v3, v9}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;-><init>(LC7/d;LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v2}, Lexpo/modules/kotlin/views/decorators/CSSPropsKt;->UseCSSProps(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 252
    .line 253
    .line 254
    const-string v1, "onMessage"

    .line 255
    .line 256
    filled-new-array {v1}, [Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v2, v1}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->Events([Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    const-string v1, "source"

    .line 264
    .line 265
    sget-object v3, Lexpo/modules/webview/DomWebViewModule$definition$1$3$1;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$1;

    .line 266
    .line 267
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    new-instance v10, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 272
    .line 273
    new-instance v12, Lkotlin/Pair;

    .line 274
    .line 275
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    .line 291
    .line 292
    if-nez v12, :cond_2

    .line 293
    .line 294
    sget-object v12, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$1;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$1;

    .line 295
    .line 296
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 297
    .line 298
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 299
    .line 300
    move-object/from16 v19, v4

    .line 301
    .line 302
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    move-object/from16 v17, v5

    .line 307
    .line 308
    const/4 v5, 0x0

    .line 309
    invoke-direct {v13, v4, v5, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 310
    .line 311
    .line 312
    const/4 v4, 0x0

    .line 313
    invoke-direct {v15, v13, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 314
    .line 315
    .line 316
    move-object v12, v15

    .line 317
    goto :goto_2

    .line 318
    :cond_2
    move-object/from16 v19, v4

    .line 319
    .line 320
    move-object/from16 v17, v5

    .line 321
    .line 322
    :goto_2
    invoke-direct {v10, v1, v12, v3}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v9, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    const-string v1, "injectedJavaScriptBeforeContentLoaded"

    .line 329
    .line 330
    sget-object v3, Lexpo/modules/webview/DomWebViewModule$definition$1$3$2;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$2;

    .line 331
    .line 332
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    new-instance v5, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 337
    .line 338
    new-instance v9, Lkotlin/Pair;

    .line 339
    .line 340
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    invoke-direct {v9, v10, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 348
    .line 349
    .line 350
    move-result-object v10

    .line 351
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 356
    .line 357
    if-nez v9, :cond_3

    .line 358
    .line 359
    sget-object v9, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$2;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$2;

    .line 360
    .line 361
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 362
    .line 363
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 364
    .line 365
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    const/4 v15, 0x0

    .line 370
    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 371
    .line 372
    .line 373
    const/4 v9, 0x0

    .line 374
    invoke-direct {v10, v12, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 375
    .line 376
    .line 377
    move-object v9, v10

    .line 378
    :cond_3
    invoke-direct {v5, v1, v9, v3}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    const-string v1, "webviewDebuggingEnabled"

    .line 385
    .line 386
    sget-object v3, Lexpo/modules/webview/DomWebViewModule$definition$1$3$3;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$3;

    .line 387
    .line 388
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    new-instance v5, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 393
    .line 394
    new-instance v9, Lkotlin/Pair;

    .line 395
    .line 396
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 397
    .line 398
    .line 399
    move-result-object v10

    .line 400
    invoke-direct {v9, v10, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 412
    .line 413
    if-nez v9, :cond_4

    .line 414
    .line 415
    sget-object v9, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$3;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$3;

    .line 416
    .line 417
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 418
    .line 419
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 420
    .line 421
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 422
    .line 423
    .line 424
    move-result-object v13

    .line 425
    const/4 v15, 0x0

    .line 426
    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 427
    .line 428
    .line 429
    const/4 v9, 0x0

    .line 430
    invoke-direct {v10, v12, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 431
    .line 432
    .line 433
    move-object v9, v10

    .line 434
    :cond_4
    invoke-direct {v5, v1, v9, v3}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    const-string v1, "showsHorizontalScrollIndicator"

    .line 441
    .line 442
    sget-object v3, Lexpo/modules/webview/DomWebViewModule$definition$1$3$4;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$4;

    .line 443
    .line 444
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    new-instance v5, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 449
    .line 450
    new-instance v9, Lkotlin/Pair;

    .line 451
    .line 452
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 453
    .line 454
    .line 455
    move-result-object v10

    .line 456
    invoke-direct {v9, v10, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 460
    .line 461
    .line 462
    move-result-object v10

    .line 463
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 468
    .line 469
    if-nez v9, :cond_5

    .line 470
    .line 471
    sget-object v9, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$4;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$4;

    .line 472
    .line 473
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 474
    .line 475
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 476
    .line 477
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 478
    .line 479
    .line 480
    move-result-object v13

    .line 481
    const/4 v15, 0x0

    .line 482
    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 483
    .line 484
    .line 485
    const/4 v9, 0x0

    .line 486
    invoke-direct {v10, v12, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 487
    .line 488
    .line 489
    move-object v9, v10

    .line 490
    :cond_5
    invoke-direct {v5, v1, v9, v3}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 491
    .line 492
    .line 493
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    const-string v1, "showsVerticalScrollIndicator"

    .line 497
    .line 498
    sget-object v3, Lexpo/modules/webview/DomWebViewModule$definition$1$3$5;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$5;

    .line 499
    .line 500
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    new-instance v5, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 505
    .line 506
    new-instance v9, Lkotlin/Pair;

    .line 507
    .line 508
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 509
    .line 510
    .line 511
    move-result-object v10

    .line 512
    invoke-direct {v9, v10, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 516
    .line 517
    .line 518
    move-result-object v10

    .line 519
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v9

    .line 523
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 524
    .line 525
    if-nez v9, :cond_6

    .line 526
    .line 527
    sget-object v9, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$5;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$5;

    .line 528
    .line 529
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 530
    .line 531
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 532
    .line 533
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 534
    .line 535
    .line 536
    move-result-object v13

    .line 537
    const/4 v15, 0x0

    .line 538
    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 539
    .line 540
    .line 541
    const/4 v9, 0x0

    .line 542
    invoke-direct {v10, v12, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 543
    .line 544
    .line 545
    move-object v9, v10

    .line 546
    :cond_6
    invoke-direct {v5, v1, v9, v3}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 547
    .line 548
    .line 549
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    const-string v1, "nestedScrollEnabled"

    .line 553
    .line 554
    sget-object v3, Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$1$3$6;

    .line 555
    .line 556
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    new-instance v5, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 561
    .line 562
    new-instance v9, Lkotlin/Pair;

    .line 563
    .line 564
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 565
    .line 566
    .line 567
    move-result-object v10

    .line 568
    invoke-direct {v9, v10, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 572
    .line 573
    .line 574
    move-result-object v10

    .line 575
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v9

    .line 579
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 580
    .line 581
    if-nez v9, :cond_7

    .line 582
    .line 583
    sget-object v9, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$6;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$6;

    .line 584
    .line 585
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 586
    .line 587
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 588
    .line 589
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 590
    .line 591
    .line 592
    move-result-object v13

    .line 593
    const/4 v15, 0x0

    .line 594
    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 595
    .line 596
    .line 597
    const/4 v9, 0x0

    .line 598
    invoke-direct {v10, v12, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 599
    .line 600
    .line 601
    move-object v9, v10

    .line 602
    :cond_7
    invoke-direct {v5, v1, v9, v3}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 603
    .line 604
    .line 605
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    const-string v1, "scrollTo"

    .line 609
    .line 610
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    new-instance v4, Lkotlin/Pair;

    .line 615
    .line 616
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    invoke-direct {v4, v5, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 624
    .line 625
    .line 626
    move-result-object v5

    .line 627
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    .line 632
    .line 633
    if-nez v4, :cond_8

    .line 634
    .line 635
    sget-object v4, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$1;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$1;

    .line 636
    .line 637
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 638
    .line 639
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    .line 640
    .line 641
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 642
    .line 643
    .line 644
    move-result-object v10

    .line 645
    const/4 v15, 0x0

    .line 646
    invoke-direct {v9, v10, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 647
    .line 648
    .line 649
    invoke-direct {v5, v9, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 650
    .line 651
    .line 652
    move-object v4, v5

    .line 653
    :cond_8
    new-instance v5, Lkotlin/Pair;

    .line 654
    .line 655
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 656
    .line 657
    .line 658
    move-result-object v9

    .line 659
    invoke-direct {v5, v9, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 663
    .line 664
    .line 665
    move-result-object v9

    .line 666
    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v5

    .line 670
    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    .line 671
    .line 672
    if-nez v5, :cond_9

    .line 673
    .line 674
    sget-object v5, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$2;

    .line 675
    .line 676
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 677
    .line 678
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 679
    .line 680
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 681
    .line 682
    .line 683
    move-result-object v12

    .line 684
    const/4 v15, 0x0

    .line 685
    invoke-direct {v10, v12, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 686
    .line 687
    .line 688
    invoke-direct {v9, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 689
    .line 690
    .line 691
    move-object v5, v9

    .line 692
    :cond_9
    filled-new-array {v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    .line 693
    .line 694
    .line 695
    move-result-object v3

    .line 696
    new-instance v4, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$3;

    .line 697
    .line 698
    invoke-direct {v4}, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$3;-><init>()V

    .line 699
    .line 700
    .line 701
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 702
    .line 703
    invoke-static {v0, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 707
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 708
    .line 709
    sget-object v12, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 710
    .line 711
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 712
    .line 713
    if-eqz v9, :cond_a

    .line 714
    .line 715
    :try_start_1
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 716
    .line 717
    invoke-direct {v9, v1, v3, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 718
    .line 719
    .line 720
    goto :goto_3

    .line 721
    :cond_a
    invoke-static {v0, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result v9

    .line 725
    if-eqz v9, :cond_b

    .line 726
    .line 727
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 728
    .line 729
    invoke-direct {v9, v1, v3, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 730
    .line 731
    .line 732
    goto :goto_3

    .line 733
    :cond_b
    invoke-static {v0, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    move-result v9

    .line 737
    if-eqz v9, :cond_c

    .line 738
    .line 739
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 740
    .line 741
    invoke-direct {v9, v1, v3, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 742
    .line 743
    .line 744
    goto :goto_3

    .line 745
    :cond_c
    invoke-static {v0, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    move-result v9

    .line 749
    if-eqz v9, :cond_d

    .line 750
    .line 751
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 752
    .line 753
    invoke-direct {v9, v1, v3, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 754
    .line 755
    .line 756
    goto :goto_3

    .line 757
    :cond_d
    invoke-static {v0, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v9

    .line 761
    if-eqz v9, :cond_e

    .line 762
    .line 763
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 764
    .line 765
    invoke-direct {v9, v1, v3, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 766
    .line 767
    .line 768
    goto :goto_3

    .line 769
    :cond_e
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 770
    .line 771
    invoke-direct {v9, v1, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 772
    .line 773
    .line 774
    :goto_3
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    invoke-interface {v3, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    const-string v1, "injectJavaScript"

    .line 782
    .line 783
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    new-instance v4, Lkotlin/Pair;

    .line 788
    .line 789
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    invoke-direct {v4, v9, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 797
    .line 798
    .line 799
    move-result-object v9

    .line 800
    invoke-interface {v9, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v4

    .line 804
    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    .line 805
    .line 806
    if-nez v4, :cond_f

    .line 807
    .line 808
    sget-object v4, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$4;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$4;

    .line 809
    .line 810
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 811
    .line 812
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    .line 813
    .line 814
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 815
    .line 816
    .line 817
    move-result-object v8

    .line 818
    move-object/from16 v16, v11

    .line 819
    .line 820
    const/4 v11, 0x0

    .line 821
    invoke-direct {v15, v8, v11, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 822
    .line 823
    .line 824
    invoke-direct {v9, v15, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 825
    .line 826
    .line 827
    move-object v4, v9

    .line 828
    goto :goto_4

    .line 829
    :cond_f
    move-object/from16 v16, v11

    .line 830
    .line 831
    :goto_4
    new-instance v8, Lkotlin/Pair;

    .line 832
    .line 833
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 834
    .line 835
    .line 836
    move-result-object v9

    .line 837
    invoke-direct {v8, v9, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 841
    .line 842
    .line 843
    move-result-object v9

    .line 844
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v8

    .line 848
    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    .line 849
    .line 850
    if-nez v8, :cond_10

    .line 851
    .line 852
    sget-object v8, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$5;

    .line 853
    .line 854
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 855
    .line 856
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    .line 857
    .line 858
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 859
    .line 860
    .line 861
    move-result-object v14

    .line 862
    const/4 v15, 0x0

    .line 863
    invoke-direct {v11, v14, v15, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 864
    .line 865
    .line 866
    invoke-direct {v9, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 867
    .line 868
    .line 869
    move-object v8, v9

    .line 870
    :cond_10
    filled-new-array {v4, v8}, [Lexpo/modules/kotlin/types/AnyType;

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    new-instance v4, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$6;

    .line 875
    .line 876
    invoke-direct {v4}, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$6;-><init>()V

    .line 877
    .line 878
    .line 879
    invoke-static {v0, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    move-result v5

    .line 883
    if-eqz v5, :cond_11

    .line 884
    .line 885
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 886
    .line 887
    invoke-direct {v0, v1, v3, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 888
    .line 889
    .line 890
    goto :goto_5

    .line 891
    :cond_11
    invoke-static {v0, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v5

    .line 895
    if-eqz v5, :cond_12

    .line 896
    .line 897
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 898
    .line 899
    invoke-direct {v0, v1, v3, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 900
    .line 901
    .line 902
    goto :goto_5

    .line 903
    :cond_12
    invoke-static {v0, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v5

    .line 907
    if-eqz v5, :cond_13

    .line 908
    .line 909
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 910
    .line 911
    invoke-direct {v0, v1, v3, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 912
    .line 913
    .line 914
    goto :goto_5

    .line 915
    :cond_13
    invoke-static {v0, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v5

    .line 919
    if-eqz v5, :cond_14

    .line 920
    .line 921
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 922
    .line 923
    invoke-direct {v0, v1, v3, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 924
    .line 925
    .line 926
    goto :goto_5

    .line 927
    :cond_14
    invoke-static {v0, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    move-result v0

    .line 931
    if-eqz v0, :cond_15

    .line 932
    .line 933
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 934
    .line 935
    invoke-direct {v0, v1, v3, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 936
    .line 937
    .line 938
    goto :goto_5

    .line 939
    :cond_15
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 940
    .line 941
    invoke-direct {v0, v1, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 942
    .line 943
    .line 944
    :goto_5
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    new-instance v0, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$OnViewDidUpdateProps$1;

    .line 952
    .line 953
    invoke-direct {v0}, Lexpo/modules/webview/DomWebViewModule$definition$lambda$6$lambda$5$$inlined$OnViewDidUpdateProps$1;-><init>()V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->setOnViewDidUpdateProps(Lkotlin/jvm/functions/Function1;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->build()Lexpo/modules/kotlin/views/ViewManagerDefinition;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-virtual {v7, v0}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->registerViewDefinition(Lexpo/modules/kotlin/views/ViewManagerDefinition;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v7}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 967
    .line 968
    .line 969
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 970
    invoke-static {}, Ll1/a;->f()V

    .line 971
    .line 972
    .line 973
    return-object v0

    .line 974
    :goto_6
    invoke-static {}, Ll1/a;->f()V

    .line 975
    .line 976
    .line 977
    throw v0
.end method
