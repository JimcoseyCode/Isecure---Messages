.class public final Lexpo/modules/kotlin/traits/SavableTrait$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/traits/SavableTrait;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/traits/SavableTrait$Companion$SavableBitmapOptions;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JM\u0010\r\u001a\u00020\u000c\"\u0006\u0008\u0001\u0010\u0004\u0018\u0001\"\u0006\u0008\u0002\u0010\u0005\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062 \u0008\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\n0\u0008H\u0081\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ8\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0014\"\u0010\u0008\u0001\u0010\u0011\u0018\u0001*\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/kotlin/traits/SavableTrait$Companion;",
        "",
        "<init>",
        "()V",
        "InputType",
        "OptionType",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "Lkotlin/Function3;",
        "Ljava/io/File;",
        "Li7/B;",
        "saveToFile",
        "Lexpo/modules/kotlin/objects/ObjectDefinitionData;",
        "createImplementation",
        "(Lexpo/modules/kotlin/AppContext;Lw7/o;)Lexpo/modules/kotlin/objects/ObjectDefinitionData;",
        "Lexpo/modules/kotlin/sharedobjects/SharedRef;",
        "Landroid/graphics/Bitmap;",
        "T",
        "LC7/d;",
        "klass",
        "Lexpo/modules/kotlin/traits/SavableTrait;",
        "create",
        "(LC7/d;)Lexpo/modules/kotlin/traits/SavableTrait;",
        "SavableBitmapOptions",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/traits/SavableTrait$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lexpo/modules/kotlin/traits/SavableTrait$Companion;LC7/d;ILjava/lang/Object;)Lexpo/modules/kotlin/traits/SavableTrait;
    .locals 0

    .line 1
    and-int/lit8 p0, p2, 0x1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x4

    .line 6
    const-string p1, "T"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-class p0, Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 12
    .line 13
    invoke-static {p0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    const-string p0, "klass"

    .line 18
    .line 19
    invoke-static {p1, p0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Lexpo/modules/kotlin/traits/SavableTrait;

    .line 23
    .line 24
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lexpo/modules/kotlin/traits/SavableTrait$Companion$create$1;->INSTANCE:Lexpo/modules/kotlin/traits/SavableTrait$Companion$create$1;

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/traits/SavableTrait;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method


# virtual methods
.method public final synthetic create(LC7/d;)Lexpo/modules/kotlin/traits/SavableTrait;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lexpo/modules/kotlin/sharedobjects/SharedRef<",
            "Landroid/graphics/Bitmap;",
            ">;>(",
            "LC7/d;",
            ")",
            "Lexpo/modules/kotlin/traits/SavableTrait<",
            "TT;>;"
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
    new-instance p1, Lexpo/modules/kotlin/traits/SavableTrait;

    .line 7
    .line 8
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lexpo/modules/kotlin/traits/SavableTrait$Companion$create$1;->INSTANCE:Lexpo/modules/kotlin/traits/SavableTrait$Companion$create$1;

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/traits/SavableTrait;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final synthetic createImplementation(Lexpo/modules/kotlin/AppContext;Lw7/o;)Lexpo/modules/kotlin/objects/ObjectDefinitionData;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<InputType:",
            "Ljava/lang/Object;",
            "OptionType:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/AppContext;",
            "Lw7/o;",
            ")",
            "Lexpo/modules/kotlin/objects/ObjectDefinitionData;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "appContext"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "saveToFile"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lexpo/modules/kotlin/UtilsKt;->weak(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v2, v3, v4, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v4, 0x4

    .line 31
    const-string v5, "InputType"

    .line 32
    .line 33
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v6, "OptionType"

    .line 37
    .line 38
    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 42
    .line 43
    new-instance v8, Lkotlin/Pair;

    .line 44
    .line 45
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-class v9, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    const/4 v11, 0x3

    .line 55
    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v12, 0x0

    .line 59
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    invoke-direct {v8, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    .line 75
    .line 76
    if-nez v8, :cond_0

    .line 77
    .line 78
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 82
    .line 83
    .line 84
    sget-object v8, Lexpo/modules/kotlin/traits/SavableTrait$Companion$createImplementation$$inlined$apply$lambda$1;->INSTANCE:Lexpo/modules/kotlin/traits/SavableTrait$Companion$createImplementation$$inlined$apply$lambda$1;

    .line 85
    .line 86
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 87
    .line 88
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    .line 89
    .line 90
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v14, v15, v12, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v10, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 104
    .line 105
    .line 106
    move-object v8, v10

    .line 107
    :cond_0
    new-instance v5, Lkotlin/Pair;

    .line 108
    .line 109
    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v5, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    .line 131
    .line 132
    if-nez v5, :cond_1

    .line 133
    .line 134
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 138
    .line 139
    .line 140
    sget-object v5, Lexpo/modules/kotlin/traits/SavableTrait$Companion$createImplementation$$inlined$apply$lambda$2;->INSTANCE:Lexpo/modules/kotlin/traits/SavableTrait$Companion$createImplementation$$inlined$apply$lambda$2;

    .line 141
    .line 142
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 143
    .line 144
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 145
    .line 146
    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v10, v4, v12, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v7, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 160
    .line 161
    .line 162
    move-object v5, v7

    .line 163
    :cond_1
    filled-new-array {v8, v5}, [Lexpo/modules/kotlin/types/AnyType;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 168
    .line 169
    .line 170
    new-instance v4, Lexpo/modules/kotlin/traits/SavableTrait$Companion$createImplementation$lambda$1$$inlined$AsyncFunction$3;

    .line 171
    .line 172
    invoke-direct {v4, v1, v0}, Lexpo/modules/kotlin/traits/SavableTrait$Companion$createImplementation$lambda$1$$inlined$AsyncFunction$3;-><init>(Ljava/lang/ref/WeakReference;Lw7/o;)V

    .line 173
    .line 174
    .line 175
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 176
    .line 177
    const-class v1, Li7/B;

    .line 178
    .line 179
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    const-string v5, "saveAsync"

    .line 184
    .line 185
    if-eqz v0, :cond_2

    .line 186
    .line 187
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 188
    .line 189
    invoke-direct {v0, v5, v3, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 194
    .line 195
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_3

    .line 200
    .line 201
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 202
    .line 203
    invoke-direct {v0, v5, v3, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 204
    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_3
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 208
    .line 209
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 216
    .line 217
    invoke-direct {v0, v5, v3, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 218
    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_4
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 222
    .line 223
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_5

    .line 228
    .line 229
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 230
    .line 231
    invoke-direct {v0, v5, v3, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 232
    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_5
    const-class v0, Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_6

    .line 242
    .line 243
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 244
    .line 245
    invoke-direct {v0, v5, v3, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 246
    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_6
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 250
    .line 251
    invoke-direct {v0, v5, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 252
    .line 253
    .line 254
    :goto_0
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-interface {v1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->buildObject()Lexpo/modules/kotlin/objects/ObjectDefinitionData;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    return-object v0
.end method
