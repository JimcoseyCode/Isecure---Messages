.class public final Lexpo/modules/haptics/HapticsModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/haptics/HapticsModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "Lexpo/modules/haptics/arguments/HapticsVibrationType;",
        "type",
        "Li7/B;",
        "vibrate",
        "(Lexpo/modules/haptics/arguments/HapticsVibrationType;)V",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "definition",
        "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "context",
        "Landroid/os/Vibrator;",
        "getVibrator",
        "()Landroid/os/Vibrator;",
        "vibrator",
        "expo-haptics_release"
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

.method public static final synthetic access$vibrate(Lexpo/modules/haptics/HapticsModule;Lexpo/modules/haptics/arguments/HapticsVibrationType;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/haptics/HapticsModule;->vibrate(Lexpo/modules/haptics/arguments/HapticsVibrationType;)V

    .line 2
    .line 3
    .line 4
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

.method private final getVibrator()Landroid/os/Vibrator;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lexpo/modules/haptics/HapticsModule;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "vibrator_manager"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "null cannot be cast to non-null type android.os.VibratorManager"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lw3/d;->a(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lw3/e;->a(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    invoke-direct {p0}, Lexpo/modules/haptics/HapticsModule;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "vibrator"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "null cannot be cast to non-null type android.os.Vibrator"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast v0, Landroid/os/Vibrator;

    .line 50
    .line 51
    return-object v0
.end method

.method private final vibrate(Lexpo/modules/haptics/arguments/HapticsVibrationType;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lexpo/modules/haptics/HapticsModule;->getVibrator()Landroid/os/Vibrator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lexpo/modules/haptics/arguments/HapticsVibrationType;->getTimings()[J

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Lexpo/modules/haptics/arguments/HapticsVibrationType;->getAmplitudes()[I

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {v1, p1, v2}, Lexpo/modules/haptics/a;->a([J[II)Landroid/os/VibrationEffect;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {v0, p1}, Lw3/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-direct {p0}, Lexpo/modules/haptics/HapticsModule;->getVibrator()Landroid/os/Vibrator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1}, Lexpo/modules/haptics/arguments/HapticsVibrationType;->getOldSDKPattern()[J

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, p1, v2}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Lexpo/modules/haptics/HapticType;

    .line 4
    .line 5
    const-class v2, Lexpo/modules/kotlin/Promise;

    .line 6
    .line 7
    const-class v3, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v4, ".ModuleDefinition"

    .line 22
    .line 23
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    new-instance v5, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v6, "["

    .line 36
    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v6, "ExpoModulesCore"

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v6, "] "

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v4}, Ll1/a;->c(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    new-instance v4, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 61
    .line 62
    invoke-direct {v4, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 63
    .line 64
    .line 65
    const-string v5, "ExpoHaptics"

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v5, "notificationAsync"

    .line 71
    .line 72
    invoke-static {v3, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    const-class v11, Li7/B;

    .line 85
    .line 86
    const/4 v12, 0x0

    .line 87
    if-eqz v6, :cond_0

    .line 88
    .line 89
    :try_start_1
    new-instance v6, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 90
    .line 91
    new-array v13, v12, [Lexpo/modules/kotlin/types/AnyType;

    .line 92
    .line 93
    new-instance v14, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$1;

    .line 94
    .line 95
    invoke-direct {v14, v1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$1;-><init>(Lexpo/modules/haptics/HapticsModule;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v6, v5, v13, v14}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    move-object/from16 v16, v4

    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :catchall_0
    move-exception v0

    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_0
    invoke-virtual {v4}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    sget-object v13, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 113
    .line 114
    new-instance v14, Lkotlin/Pair;

    .line 115
    .line 116
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-direct {v14, v15, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v13}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    invoke-interface {v12, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    .line 134
    .line 135
    if-nez v12, :cond_1

    .line 136
    .line 137
    sget-object v12, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$2;

    .line 138
    .line 139
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 140
    .line 141
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    .line 142
    .line 143
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    move-object/from16 v16, v4

    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    invoke-direct {v14, v15, v4, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v13, v14, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 154
    .line 155
    .line 156
    move-object v12, v13

    .line 157
    goto :goto_0

    .line 158
    :cond_1
    move-object/from16 v16, v4

    .line 159
    .line 160
    :goto_0
    filled-new-array {v12}, [Lexpo/modules/kotlin/types/AnyType;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    new-instance v6, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$3;

    .line 165
    .line 166
    invoke-direct {v6, v1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$3;-><init>(Lexpo/modules/haptics/HapticsModule;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-eqz v12, :cond_2

    .line 174
    .line 175
    new-instance v12, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 176
    .line 177
    invoke-direct {v12, v5, v4, v6}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 178
    .line 179
    .line 180
    :goto_1
    move-object v6, v12

    .line 181
    goto :goto_2

    .line 182
    :cond_2
    invoke-static {v11, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-eqz v12, :cond_3

    .line 187
    .line 188
    new-instance v12, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 189
    .line 190
    invoke-direct {v12, v5, v4, v6}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_3
    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    if-eqz v12, :cond_4

    .line 199
    .line 200
    new-instance v12, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 201
    .line 202
    invoke-direct {v12, v5, v4, v6}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_4
    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-eqz v12, :cond_5

    .line 211
    .line 212
    new-instance v12, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 213
    .line 214
    invoke-direct {v12, v5, v4, v6}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_5
    invoke-static {v11, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-eqz v12, :cond_6

    .line 223
    .line 224
    new-instance v12, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 225
    .line 226
    invoke-direct {v12, v5, v4, v6}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_6
    new-instance v12, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 231
    .line 232
    invoke-direct {v12, v5, v4, v6}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 233
    .line 234
    .line 235
    goto :goto_1

    .line 236
    :goto_2
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    const-string v4, "selectionAsync"

    .line 244
    .line 245
    const/4 v5, 0x0

    .line 246
    new-array v6, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 247
    .line 248
    new-instance v5, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4;

    .line 249
    .line 250
    invoke-direct {v5, v1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4;-><init>(Lexpo/modules/haptics/HapticsModule;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    if-eqz v12, :cond_7

    .line 258
    .line 259
    new-instance v12, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 260
    .line 261
    invoke-direct {v12, v4, v6, v5}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_7
    invoke-static {v11, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    if-eqz v12, :cond_8

    .line 270
    .line 271
    new-instance v12, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 272
    .line 273
    invoke-direct {v12, v4, v6, v5}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_8
    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    if-eqz v12, :cond_9

    .line 282
    .line 283
    new-instance v12, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 284
    .line 285
    invoke-direct {v12, v4, v6, v5}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_9
    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    if-eqz v12, :cond_a

    .line 294
    .line 295
    new-instance v12, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 296
    .line 297
    invoke-direct {v12, v4, v6, v5}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_a
    invoke-static {v11, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    if-eqz v12, :cond_b

    .line 306
    .line 307
    new-instance v12, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 308
    .line 309
    invoke-direct {v12, v4, v6, v5}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 310
    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_b
    new-instance v12, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 314
    .line 315
    invoke-direct {v12, v4, v6, v5}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 316
    .line 317
    .line 318
    :goto_3
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-interface {v5, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    const-string v4, "impactAsync"

    .line 326
    .line 327
    invoke-static {v3, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    if-eqz v5, :cond_c

    .line 332
    .line 333
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 334
    .line 335
    const/4 v5, 0x0

    .line 336
    new-array v6, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 337
    .line 338
    new-instance v5, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$5;

    .line 339
    .line 340
    invoke-direct {v5, v1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$5;-><init>(Lexpo/modules/haptics/HapticsModule;)V

    .line 341
    .line 342
    .line 343
    invoke-direct {v3, v4, v6, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_4

    .line 347
    .line 348
    :cond_c
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    sget-object v6, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 353
    .line 354
    new-instance v12, Lkotlin/Pair;

    .line 355
    .line 356
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 357
    .line 358
    .line 359
    move-result-object v13

    .line 360
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    invoke-interface {v6, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    .line 374
    .line 375
    if-nez v6, :cond_d

    .line 376
    .line 377
    sget-object v6, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$6;->INSTANCE:Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$6;

    .line 378
    .line 379
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 380
    .line 381
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 382
    .line 383
    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 384
    .line 385
    .line 386
    move-result-object v14

    .line 387
    const/4 v15, 0x0

    .line 388
    invoke-direct {v13, v14, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 389
    .line 390
    .line 391
    invoke-direct {v12, v13, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 392
    .line 393
    .line 394
    move-object v6, v12

    .line 395
    :cond_d
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    new-instance v6, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7;

    .line 400
    .line 401
    invoke-direct {v6, v1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7;-><init>(Lexpo/modules/haptics/HapticsModule;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    if-eqz v7, :cond_e

    .line 409
    .line 410
    new-instance v3, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 411
    .line 412
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 413
    .line 414
    .line 415
    goto :goto_4

    .line 416
    :cond_e
    invoke-static {v11, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_f

    .line 421
    .line 422
    new-instance v3, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 423
    .line 424
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 425
    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_f
    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    if-eqz v7, :cond_10

    .line 433
    .line 434
    new-instance v3, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 435
    .line 436
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 437
    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_10
    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v7

    .line 444
    if-eqz v7, :cond_11

    .line 445
    .line 446
    new-instance v3, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 447
    .line 448
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 449
    .line 450
    .line 451
    goto :goto_4

    .line 452
    :cond_11
    invoke-static {v11, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-eqz v3, :cond_12

    .line 457
    .line 458
    new-instance v3, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 459
    .line 460
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 461
    .line 462
    .line 463
    goto :goto_4

    .line 464
    :cond_12
    new-instance v3, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 465
    .line 466
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 467
    .line 468
    .line 469
    :goto_4
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    const-string v3, "performHapticsAsync"

    .line 477
    .line 478
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-eqz v2, :cond_13

    .line 483
    .line 484
    new-instance v0, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 485
    .line 486
    const/4 v5, 0x0

    .line 487
    new-array v2, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 488
    .line 489
    new-instance v4, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$8;

    .line 490
    .line 491
    invoke-direct {v4, v1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$8;-><init>(Lexpo/modules/haptics/HapticsModule;)V

    .line 492
    .line 493
    .line 494
    invoke-direct {v0, v3, v2, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 495
    .line 496
    .line 497
    goto :goto_5

    .line 498
    :cond_13
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    sget-object v4, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 503
    .line 504
    new-instance v5, Lkotlin/Pair;

    .line 505
    .line 506
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 511
    .line 512
    invoke-direct {v5, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    .line 524
    .line 525
    if-nez v4, :cond_14

    .line 526
    .line 527
    sget-object v4, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$9;->INSTANCE:Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$9;

    .line 528
    .line 529
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 530
    .line 531
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    .line 532
    .line 533
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    const/4 v15, 0x0

    .line 538
    invoke-direct {v6, v0, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 539
    .line 540
    .line 541
    invoke-direct {v5, v6, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 542
    .line 543
    .line 544
    move-object v4, v5

    .line 545
    :cond_14
    filled-new-array {v4}, [Lexpo/modules/kotlin/types/AnyType;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    new-instance v2, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$10;

    .line 550
    .line 551
    invoke-direct {v2, v1}, Lexpo/modules/haptics/HapticsModule$definition$lambda$4$$inlined$AsyncFunction$10;-><init>(Lexpo/modules/haptics/HapticsModule;)V

    .line 552
    .line 553
    .line 554
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 555
    .line 556
    invoke-direct {v4, v3, v0, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 557
    .line 558
    .line 559
    move-object v0, v4

    .line 560
    :goto_5
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 568
    .line 569
    .line 570
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 571
    invoke-static {}, Ll1/a;->f()V

    .line 572
    .line 573
    .line 574
    return-object v0

    .line 575
    :goto_6
    invoke-static {}, Ll1/a;->f()V

    .line 576
    .line 577
    .line 578
    throw v0
.end method
