.class public final Lexpo/modules/image/ExpoImageModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lexpo/modules/image/ExpoImageModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
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

.method public static final synthetic access$definition$lambda$30$generatePlaceholder(Lexpo/modules/image/ExpoImageModule;Lexpo/modules/kotlin/types/Either;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/image/ExpoImageModule;->definition$lambda$30$generatePlaceholder(Lexpo/modules/image/ExpoImageModule;Lexpo/modules/kotlin/types/Either;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final definition$lambda$30$generatePlaceholder(Lexpo/modules/image/ExpoImageModule;Lexpo/modules/kotlin/types/Either;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/image/ExpoImageModule;",
            "Lexpo/modules/kotlin/types/Either<",
            "Ljava/net/URL;",
            "Lexpo/modules/image/Image;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;

    .line 11
    .line 12
    iget v3, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;-><init>(Ln7/f;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_2
    iget-object v0, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const-class v1, Lexpo/modules/image/Image;

    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v0, v4}, Lexpo/modules/kotlin/types/Either;->isSecondType(LC7/d;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lexpo/modules/image/Image;

    .line 89
    .line 90
    move-object v1, v0

    .line 91
    move-object/from16 v0, p2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    new-instance v1, Lexpo/modules/image/ImageLoadTask;

    .line 95
    .line 96
    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    new-instance v7, Lexpo/modules/image/records/SourceMap;

    .line 101
    .line 102
    const-class v8, Ljava/net/URL;

    .line 103
    .line 104
    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v0, v8}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/net/URL;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const/16 v15, 0x3e

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    const-wide/16 v11, 0x0

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    invoke-direct/range {v7 .. v16}, Lexpo/modules/image/records/SourceMap;-><init>(Ljava/lang/String;IIDLjava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    new-instance v8, Lexpo/modules/image/records/ImageLoadOptions;

    .line 132
    .line 133
    const/4 v12, 0x7

    .line 134
    const/4 v11, 0x0

    .line 135
    invoke-direct/range {v8 .. v13}, Lexpo/modules/image/records/ImageLoadOptions;-><init>(IILandroid/graphics/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {v1, v4, v7, v8}, Lexpo/modules/image/ImageLoadTask;-><init>(Lexpo/modules/kotlin/AppContext;Lexpo/modules/image/records/SourceMap;Lexpo/modules/image/records/ImageLoadOptions;)V

    .line 139
    .line 140
    .line 141
    move-object/from16 v0, p2

    .line 142
    .line 143
    iput-object v0, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    iput v6, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->label:I

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Lexpo/modules/image/ImageLoadTask;->load(Ln7/f;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    if-ne v1, v3, :cond_5

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    :goto_1
    check-cast v1, Lexpo/modules/image/Image;

    .line 155
    .line 156
    :goto_2
    invoke-static {}, LR8/d0;->a()LR8/J;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    new-instance v6, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$2;

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    invoke-direct {v6, v0, v1, v7}, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$2;-><init>(Lkotlin/jvm/functions/Function1;Lexpo/modules/image/Image;Ln7/f;)V

    .line 164
    .line 165
    .line 166
    iput-object v7, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->L$0:Ljava/lang/Object;

    .line 167
    .line 168
    iput v5, v2, Lexpo/modules/image/ExpoImageModule$definition$1$generatePlaceholder$1;->label:I

    .line 169
    .line 170
    invoke-static {v4, v6, v2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-ne v0, v3, :cond_6

    .line 175
    .line 176
    :goto_3
    return-object v3

    .line 177
    :cond_6
    return-object v0
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 34

    move-object/from16 v1, p0

    .line 1
    const-class v0, Lexpo/modules/image/records/SourceMap;

    const-class v2, Ljava/util/Map;

    const-class v3, Ljava/lang/Object;

    const-class v4, Ljava/lang/Float;

    const-class v5, Lexpo/modules/image/Image;

    const-class v6, Lexpo/modules/image/enums/ContentFit;

    const-class v7, Lexpo/modules/kotlin/types/Either;

    const-class v8, Lexpo/modules/image/records/CachePolicy;

    const-class v9, Ljava/util/List;

    const-class v10, Li7/B;

    const-string v11, "get"

    const-class v12, Ljava/lang/Integer;

    const-class v13, Lexpo/modules/image/ExpoImageViewWrapper;

    const-class v14, Ljava/lang/Boolean;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    move-object/from16 v16, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, ".ModuleDefinition"

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v3

    const-string v3, "["

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "ExpoModulesCore"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] "

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v2}, Ll1/a;->c(Ljava/lang/String;)V

    .line 5
    :try_start_0
    new-instance v2, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    invoke-direct {v2, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 6
    const-string v3, "ExpoImage"

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    move-result-object v3

    sget-object v15, Lexpo/modules/kotlin/events/EventName;->MODULE_CREATE:Lexpo/modules/kotlin/events/EventName;

    move-object/from16 v18, v4

    new-instance v4, Lexpo/modules/kotlin/events/BasicEventListener;

    move-object/from16 v19, v5

    new-instance v5, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$OnCreate$1;

    invoke-direct {v5, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$OnCreate$1;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    invoke-direct {v4, v15, v5}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    invoke-interface {v3, v15, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    move-result-object v3

    sget-object v4, Lexpo/modules/kotlin/events/EventName;->MODULE_DESTROY:Lexpo/modules/kotlin/events/EventName;

    new-instance v5, Lexpo/modules/kotlin/events/BasicEventListener;

    new-instance v15, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$OnDestroy$1;

    invoke-direct {v15, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$OnDestroy$1;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    invoke-direct {v5, v4, v15}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    const-string v3, "prefetch"

    .line 10
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 11
    sget-object v15, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    move-object/from16 v20, v6

    .line 12
    new-instance v6, Lkotlin/Pair;

    move-object/from16 v21, v7

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    move-object/from16 v22, v8

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    invoke-virtual {v15}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_0

    .line 14
    sget-object v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$1;

    .line 15
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v23, v9

    .line 16
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v24, v12

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    move-object/from16 v25, v13

    const/4 v13, 0x0

    invoke-direct {v9, v12, v13, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 17
    invoke-direct {v7, v9, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_0
    move-object/from16 v23, v9

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    .line 18
    :goto_0
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    invoke-virtual {v15}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_1

    .line 20
    sget-object v7, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$2;

    .line 21
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 22
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    move-object/from16 v26, v15

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 23
    invoke-direct {v9, v12, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    goto :goto_1

    :cond_1
    move-object/from16 v26, v15

    .line 24
    :goto_1
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v9, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_2

    .line 26
    sget-object v9, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$3;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$3;

    .line 27
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 28
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v27, v10

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    move-object/from16 v16, v14

    const/4 v14, 0x1

    invoke-direct {v12, v10, v14, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 29
    invoke-direct {v15, v12, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v15

    goto :goto_2

    :cond_2
    move-object/from16 v27, v10

    move-object/from16 v16, v14

    .line 30
    :goto_2
    filled-new-array {v6, v7, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 31
    new-instance v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$4;

    invoke-direct {v6, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$4;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    .line 32
    invoke-direct {v4, v3, v5, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 33
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    const-string v3, "loadAsync"

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 35
    new-instance v4, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v6

    .line 36
    new-instance v7, Lkotlin/Pair;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v7, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_3

    .line 38
    sget-object v7, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$1;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$1;

    .line 39
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 40
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v0

    const/4 v15, 0x0

    invoke-direct {v10, v0, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 41
    invoke-direct {v9, v10, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 42
    :cond_3
    new-instance v0, Lkotlin/Pair;

    const-class v9, Lexpo/modules/image/records/ImageLoadOptions;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v0, v9, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_4

    .line 44
    sget-object v0, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$2;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$2;

    .line 45
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 46
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const-class v12, Lexpo/modules/image/records/ImageLoadOptions;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v14, 0x1

    invoke-direct {v10, v12, v14, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 47
    invoke-direct {v9, v10, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v0, v9

    .line 48
    :cond_4
    filled-new-array {v7, v0}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v0

    .line 49
    new-instance v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$3;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$3;-><init>(Ln7/f;Lexpo/modules/image/ExpoImageModule;)V

    .line 50
    invoke-direct {v4, v5, v0, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 51
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 52
    const-string v0, "generateBlurhashAsync"

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 53
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 54
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_5

    .line 56
    sget-object v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$4;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$4;

    .line 57
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 58
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v10, v12, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 59
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v9

    .line 60
    :cond_5
    new-instance v9, Lkotlin/Pair;

    const-class v10, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_6

    .line 62
    sget-object v9, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$5;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$5;

    .line 63
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 64
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const-class v14, Lkotlin/Pair;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 65
    invoke-direct {v10, v12, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 66
    :cond_6
    filled-new-array {v6, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 67
    new-instance v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$6;

    invoke-direct {v6, v7, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$6;-><init>(Ln7/f;Lexpo/modules/image/ExpoImageModule;)V

    .line 68
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 69
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 70
    const-string v0, "generateThumbhashAsync"

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 71
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 72
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_7

    .line 74
    sget-object v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$7;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$7;

    .line 75
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 76
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v10, v12, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 77
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v9

    .line 78
    :cond_7
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 79
    new-instance v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$8;

    invoke-direct {v6, v7, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Coroutine$8;-><init>(Ln7/f;Lexpo/modules/image/ExpoImageModule;)V

    .line 80
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 81
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 82
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v31

    .line 83
    new-instance v28, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 84
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v0

    if-eqz v0, :cond_44

    invoke-virtual {v0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v29

    .line 85
    invoke-static/range {v31 .. v31}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "getSimpleName(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-direct {v3, v4, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_8

    .line 88
    sget-object v3, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Class$1;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$Class$1;

    .line 89
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 90
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x0

    invoke-direct {v5, v6, v15, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 91
    invoke-direct {v4, v5, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v32, v4

    goto :goto_3

    :cond_8
    move-object/from16 v32, v3

    .line 92
    :goto_3
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v33

    move-object/from16 v30, v0

    .line 93
    invoke-direct/range {v28 .. v33}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 94
    const-string v0, "width"

    .line 95
    new-instance v3, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    invoke-virtual {v4}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 96
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v6

    const/4 v9, 0x2

    invoke-direct {v5, v6, v7, v9, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 97
    sget-object v6, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 98
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v10, :cond_9

    new-instance v10, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v10, v12}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 99
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v12

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v12, v14, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    :cond_9
    new-instance v12, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$1;

    invoke-direct {v12}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$1;-><init>()V

    .line 101
    invoke-direct {v4, v11, v5, v10, v12}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 102
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v5

    invoke-virtual {v4, v5}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v14, 0x1

    .line 103
    invoke-virtual {v4, v14}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 104
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 105
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    const-string v0, "height"

    .line 107
    new-instance v3, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    invoke-virtual {v4}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 108
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v10

    invoke-direct {v5, v10, v7, v9, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 109
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v10, :cond_a

    new-instance v10, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v10, v12}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 110
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v12

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v12, v14, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_a
    new-instance v12, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$2;

    invoke-direct {v12}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$2;-><init>()V

    .line 112
    invoke-direct {v4, v11, v5, v10, v12}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 113
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v5

    invoke-virtual {v4, v5}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v14, 0x1

    .line 114
    invoke-virtual {v4, v14}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 115
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 116
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    const-string v0, "scale"

    .line 118
    new-instance v3, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    invoke-virtual {v4}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 119
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v10

    invoke-direct {v5, v10, v7, v9, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 120
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v10, :cond_b

    new-instance v10, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v10, v12}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 121
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v12

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v12, v14, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    :cond_b
    new-instance v12, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$3;

    invoke-direct {v12, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$3;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    .line 123
    invoke-direct {v4, v11, v5, v10, v12}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 124
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v5

    invoke-virtual {v4, v5}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v14, 0x1

    .line 125
    invoke-virtual {v4, v14}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 126
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 127
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    const-string v0, "isAnimated"

    .line 129
    new-instance v3, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    invoke-virtual {v4}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 130
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v10

    invoke-direct {v5, v10, v7, v9, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 131
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v9, :cond_c

    new-instance v9, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 132
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-interface {v10, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    :cond_c
    new-instance v10, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$4;

    invoke-direct {v10}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$4;-><init>()V

    .line 134
    invoke-direct {v4, v11, v5, v9, v10}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 135
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v5

    invoke-virtual {v4, v5}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v14, 0x1

    .line 136
    invoke-virtual {v4, v14}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 137
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 138
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    const-string v0, "mediaType"

    .line 140
    new-instance v3, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;

    invoke-direct {v3, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v15, 0x0

    new-array v5, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 142
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v9, :cond_d

    new-instance v9, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 143
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-interface {v6, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    :cond_d
    new-instance v6, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$5;

    invoke-direct {v6}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$16$$inlined$Property$5;-><init>()V

    invoke-direct {v4, v11, v5, v9, v6}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 145
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    const-string v0, "clearMemoryCache"

    const/4 v15, 0x0

    .line 148
    new-array v3, v15, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithoutArgs$1;

    invoke-direct {v4, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithoutArgs$1;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    .line 149
    new-instance v5, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v5, v0, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 150
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    sget-object v0, Lexpo/modules/kotlin/functions/Queues;->MAIN:Lexpo/modules/kotlin/functions/Queues;

    invoke-virtual {v5, v0}, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->runOnQueue(Lexpo/modules/kotlin/functions/Queues;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

    .line 152
    const-string v0, "clearDiskCache"

    const/4 v15, 0x0

    .line 153
    new-array v3, v15, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$1;

    invoke-direct {v4, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$1;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    .line 154
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v6, v16

    invoke-static {v6, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v14, Ljava/lang/String;

    if-eqz v9, :cond_e

    .line 155
    :try_start_1
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v9, v0, v3, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_4

    .line 156
    :cond_e
    invoke-static {v6, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    .line 157
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v9, v0, v3, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_4

    .line 158
    :cond_f
    invoke-static {v6, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10

    .line 159
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v9, v0, v3, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_4

    .line 160
    :cond_10
    invoke-static {v6, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    .line 161
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v9, v0, v3, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_4

    .line 162
    :cond_11
    invoke-static {v6, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 163
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v0, v3, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_4

    .line 164
    :cond_12
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v0, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 165
    :goto_4
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v0, "getCachePathAsync"

    .line 167
    const-class v3, Lexpo/modules/kotlin/Promise;

    invoke-static {v14, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 168
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v15, 0x0

    new-array v4, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 169
    new-instance v9, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$2;

    invoke-direct {v9, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$2;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    .line 170
    invoke-direct {v3, v0, v4, v9}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v17, v6

    goto :goto_6

    .line 171
    :cond_13
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 172
    new-instance v4, Lkotlin/Pair;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v4, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_14

    .line 174
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$3;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$3;

    .line 175
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 176
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    move-object/from16 v17, v6

    const/4 v6, 0x0

    invoke-direct {v15, v7, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 177
    invoke-direct {v9, v15, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v9

    goto :goto_5

    :cond_14
    move-object/from16 v17, v6

    .line 178
    :goto_5
    filled-new-array {v4}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 179
    new-instance v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$4;

    invoke-direct {v4, v1}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunction$4;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    .line 180
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v6, v0, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    move-object v3, v6

    .line 181
    :goto_6
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v0

    .line 183
    new-instance v3, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;

    .line 184
    new-instance v28, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v29

    .line 185
    sget-object v31, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$View$1;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$View$1;

    const/16 v32, 0x2

    const/16 v33, 0x0

    const/16 v30, 0x0

    .line 186
    invoke-direct/range {v28 .. v33}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v28

    .line 187
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v6

    .line 188
    invoke-direct {v3, v0, v4, v6}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;-><init>(LC7/d;LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 189
    invoke-static {v3}, Lexpo/modules/kotlin/views/decorators/CSSPropsKt;->UseCSSProps(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 190
    const-string v0, "onLoadStart"

    .line 191
    const-string v4, "onProgress"

    .line 192
    const-string v6, "onError"

    .line 193
    const-string v7, "onLoad"

    .line 194
    const-string v9, "onDisplay"

    filled-new-array {v0, v4, v6, v7, v9}, [Ljava/lang/String;

    move-result-object v0

    .line 195
    invoke-virtual {v3, v0}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->Events([Ljava/lang/String;)V

    .line 196
    const-string v0, "source"

    new-instance v4, Lexpo/modules/image/ExpoImageModule$definition$1$11$1;

    invoke-direct {v4, v1}, Lexpo/modules/image/ExpoImageModule$definition$1$11$1;-><init>(Lexpo/modules/image/ExpoImageModule;)V

    .line 197
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v6

    new-instance v7, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 198
    new-instance v9, Lkotlin/Pair;

    const-class v15, Lexpo/modules/kotlin/types/EitherOfThree;

    invoke-static {v15}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    invoke-direct {v9, v15, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_15

    .line 200
    sget-object v9, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$1;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$1;

    .line 201
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 202
    new-instance v1, Lexpo/modules/kotlin/types/LazyKType;

    const-class v18, Lexpo/modules/kotlin/types/EitherOfThree;

    move-object/from16 v19, v2

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    move-object/from16 v18, v3

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v2, 0x0

    .line 203
    invoke-direct {v15, v1, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v15

    goto :goto_7

    :cond_15
    move-object/from16 v19, v2

    move-object/from16 v18, v3

    .line 204
    :goto_7
    invoke-direct {v7, v0, v9, v4}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    const-string v0, "contentFit"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$2;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$2;

    .line 206
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 207
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_16

    .line 209
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$2;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$2;

    .line 210
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 211
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 212
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 213
    :cond_16
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    const-string v0, "placeholderContentFit"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$3;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$3;

    .line 215
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 216
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_17

    .line 218
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$3;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$3;

    .line 219
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 220
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 221
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 222
    :cond_17
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    const-string v0, "contentPosition"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$4;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$4;

    .line 224
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 225
    new-instance v4, Lkotlin/Pair;

    const-class v6, Lexpo/modules/image/records/ContentPosition;

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 226
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_18

    .line 227
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$4;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$4;

    .line 228
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 229
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const-class v9, Lexpo/modules/image/records/ContentPosition;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 230
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 231
    :cond_18
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    const-string v0, "blurRadius"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$5;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$5;

    .line 233
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 234
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_19

    .line 236
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$5;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$5;

    .line 237
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 238
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 239
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 240
    :cond_19
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    const-string v0, "transition"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$6;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$6;

    .line 242
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 243
    new-instance v4, Lkotlin/Pair;

    const-class v6, Lexpo/modules/image/records/ImageTransition;

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 244
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1a

    .line 245
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$6;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$6;

    .line 246
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 247
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const-class v9, Lexpo/modules/image/records/ImageTransition;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 248
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 249
    :cond_1a
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    const-string v0, "tintColor"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$7;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$7;

    .line 251
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 252
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 253
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1b

    .line 254
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$7;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$7;

    .line 255
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 256
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 257
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 258
    :cond_1b
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    const-string v0, "placeholder"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$8;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$8;

    .line 260
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 261
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1c

    .line 263
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$8;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$8;

    .line 264
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 265
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 266
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 267
    :cond_1c
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    const-string v0, "accessible"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$9;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$9;

    .line 269
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 270
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 271
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1d

    .line 272
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$9;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$9;

    .line 273
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 274
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 275
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 276
    :cond_1d
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    const-string v0, "accessibilityLabel"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$10;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$10;

    .line 278
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 279
    new-instance v4, Lkotlin/Pair;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1e

    .line 281
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$10;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$10;

    .line 282
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 283
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 284
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 285
    :cond_1e
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "focusable"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$11;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$11;

    .line 287
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 288
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 289
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1f

    .line 290
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$11;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$11;

    .line 291
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 292
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 293
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 294
    :cond_1f
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    const-string v0, "priority"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$12;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$12;

    .line 296
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 297
    new-instance v4, Lkotlin/Pair;

    const-class v6, Lexpo/modules/image/enums/Priority;

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 298
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_20

    .line 299
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$12;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$12;

    .line 300
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 301
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const-class v9, Lexpo/modules/image/enums/Priority;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 302
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 303
    :cond_20
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    const-string v0, "cachePolicy"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$13;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$13;

    .line 305
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 306
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 307
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_21

    .line 308
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$13;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$13;

    .line 309
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 310
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 311
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 312
    :cond_21
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    const-string v0, "recyclingKey"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$14;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$14;

    .line 314
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 315
    new-instance v4, Lkotlin/Pair;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_22

    .line 317
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$14;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$14;

    .line 318
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 319
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 320
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 321
    :cond_22
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    const-string v0, "allowDownscaling"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$15;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$15;

    .line 323
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 324
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 325
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_23

    .line 326
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$15;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$15;

    .line 327
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 328
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 329
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 330
    :cond_23
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    const-string v0, "autoplay"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$16;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$16;

    .line 332
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 333
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 334
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_24

    .line 335
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$16;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$16;

    .line 336
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 337
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 338
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 339
    :cond_24
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    const-string v0, "decodeFormat"

    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$1$11$17;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$11$17;

    .line 341
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 342
    new-instance v4, Lkotlin/Pair;

    const-class v6, Lexpo/modules/image/records/DecodeFormat;

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 343
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_25

    .line 344
    sget-object v4, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$17;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$Prop$17;

    .line 345
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 346
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const-class v9, Lexpo/modules/image/records/DecodeFormat;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x1

    invoke-direct {v7, v9, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 347
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 348
    :cond_25
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    const-string v0, "startAnimating"

    .line 350
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-direct {v1, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 351
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_26

    .line 352
    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$2;

    .line 353
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 354
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    const/4 v15, 0x0

    invoke-direct {v3, v4, v15, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 355
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v1, v2

    .line 356
    :cond_26
    filled-new-array {v1}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 357
    new-instance v2, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$3;

    invoke-direct {v2}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$3;-><init>()V

    move-object/from16 v3, v27

    .line 358
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    .line 359
    new-instance v4, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 360
    :cond_27
    invoke-static {v3, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    .line 361
    new-instance v4, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 362
    :cond_28
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    .line 363
    new-instance v4, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 364
    :cond_29
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2a

    .line 365
    new-instance v4, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 366
    :cond_2a
    invoke-static {v3, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b

    .line 367
    new-instance v4, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 368
    :cond_2b
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 369
    :goto_8
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    const-string v0, "stopAnimating"

    .line 371
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-direct {v1, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 372
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_2c

    .line 373
    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$5;

    .line 374
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 375
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x0

    invoke-direct {v4, v6, v15, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v1, 0x0

    .line 376
    invoke-direct {v2, v4, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v1, v2

    .line 377
    :cond_2c
    filled-new-array {v1}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 378
    new-instance v2, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$6;

    invoke-direct {v2}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$6;-><init>()V

    .line 379
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2d

    .line 380
    new-instance v4, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    .line 381
    :cond_2d
    invoke-static {v3, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    .line 382
    new-instance v4, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    .line 383
    :cond_2e
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    .line 384
    new-instance v4, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    .line 385
    :cond_2f
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_30

    .line 386
    new-instance v4, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    .line 387
    :cond_30
    invoke-static {v3, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31

    .line 388
    new-instance v4, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    .line 389
    :cond_31
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 390
    :goto_9
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    const-string v0, "lockResourceAsync"

    .line 392
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-direct {v1, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 393
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_32

    .line 394
    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$8;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$8;

    .line 395
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 396
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x0

    invoke-direct {v4, v6, v15, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v1, 0x0

    .line 397
    invoke-direct {v2, v4, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v1, v2

    .line 398
    :cond_32
    filled-new-array {v1}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 399
    new-instance v2, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$9;

    invoke-direct {v2}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$9;-><init>()V

    .line 400
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_33

    .line 401
    new-instance v4, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 402
    :cond_33
    invoke-static {v3, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_34

    .line 403
    new-instance v4, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 404
    :cond_34
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_35

    .line 405
    new-instance v4, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 406
    :cond_35
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_36

    .line 407
    new-instance v4, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 408
    :cond_36
    invoke-static {v3, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_37

    .line 409
    new-instance v4, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 410
    :cond_37
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 411
    :goto_a
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    const-string v0, "unlockResourceAsync"

    .line 413
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-direct {v1, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 414
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_38

    .line 415
    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$11;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$11;

    .line 416
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 417
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x0

    invoke-direct {v4, v6, v15, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v1, 0x0

    .line 418
    invoke-direct {v2, v4, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v1, v2

    .line 419
    :cond_38
    filled-new-array {v1}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 420
    new-instance v2, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$12;

    invoke-direct {v2}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$12;-><init>()V

    .line 421
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_39

    .line 422
    new-instance v4, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 423
    :cond_39
    invoke-static {v3, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3a

    .line 424
    new-instance v4, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 425
    :cond_3a
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3b

    .line 426
    new-instance v4, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 427
    :cond_3b
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3c

    .line 428
    new-instance v4, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 429
    :cond_3c
    invoke-static {v3, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3d

    .line 430
    new-instance v4, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 431
    :cond_3d
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v4, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 432
    :goto_b
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    const-string v0, "reloadAsync"

    .line 434
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-direct {v1, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_3e

    .line 436
    sget-object v1, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$14;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$14;

    .line 437
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 438
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x0

    invoke-direct {v4, v6, v15, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v1, 0x0

    .line 439
    invoke-direct {v2, v4, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v1, v2

    .line 440
    :cond_3e
    filled-new-array {v1}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 441
    new-instance v2, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$15;

    invoke-direct {v2}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$AsyncFunction$15;-><init>()V

    .line 442
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3f

    .line 443
    new-instance v3, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 444
    :cond_3f
    invoke-static {v3, v12}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_40

    .line 445
    new-instance v3, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 446
    :cond_40
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_41

    .line 447
    new-instance v3, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 448
    :cond_41
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_42

    .line 449
    new-instance v3, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 450
    :cond_42
    invoke-static {v3, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_43

    .line 451
    new-instance v3, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 452
    :cond_43
    new-instance v3, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 453
    :goto_c
    invoke-virtual/range {v18 .. v18}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    new-instance v0, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$OnViewDidUpdateProps$1;

    invoke-direct {v0}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$OnViewDidUpdateProps$1;-><init>()V

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->setOnViewDidUpdateProps(Lkotlin/jvm/functions/Function1;)V

    .line 455
    new-instance v0, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$OnViewDestroys$1;

    invoke-direct {v0}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$lambda$29$$inlined$OnViewDestroys$1;-><init>()V

    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->setOnViewDestroys(Lkotlin/jvm/functions/Function1;)V

    .line 456
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->build()Lexpo/modules/kotlin/views/ViewManagerDefinition;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->registerViewDefinition(Lexpo/modules/kotlin/views/ViewManagerDefinition;)V

    .line 457
    invoke-virtual {v1}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 458
    invoke-static {}, Ll1/a;->f()V

    return-object v0

    .line 459
    :cond_44
    :try_start_2
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 460
    :goto_d
    invoke-static {}, Ll1/a;->f()V

    throw v0
.end method
