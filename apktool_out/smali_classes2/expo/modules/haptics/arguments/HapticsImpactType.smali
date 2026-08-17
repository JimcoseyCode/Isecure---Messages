.class public final Lexpo/modules/haptics/arguments/HapticsImpactType;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/haptics/arguments/HapticsImpactType;",
        "",
        "<init>",
        "()V",
        "types",
        "",
        "",
        "Lexpo/modules/haptics/arguments/HapticsVibrationType;",
        "fromString",
        "style",
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


# static fields
.field public static final INSTANCE:Lexpo/modules/haptics/arguments/HapticsImpactType;

.field private static final types:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lexpo/modules/haptics/arguments/HapticsVibrationType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsImpactType;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/haptics/arguments/HapticsImpactType;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/haptics/arguments/HapticsImpactType;->INSTANCE:Lexpo/modules/haptics/arguments/HapticsImpactType;

    .line 7
    .line 8
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    new-array v2, v1, [J

    .line 12
    .line 13
    fill-array-data v2, :array_0

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/16 v4, 0x1e

    .line 18
    .line 19
    filled-new-array {v3, v4}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    new-array v6, v1, [J

    .line 24
    .line 25
    fill-array-data v6, :array_1

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v2, v5, v6}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 29
    .line 30
    .line 31
    const-string v2, "light"

    .line 32
    .line 33
    invoke-static {v2, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v2, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 38
    .line 39
    new-array v5, v1, [J

    .line 40
    .line 41
    fill-array-data v5, :array_2

    .line 42
    .line 43
    .line 44
    filled-new-array {v3, v4}, [I

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-array v6, v1, [J

    .line 49
    .line 50
    fill-array-data v6, :array_3

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v5, v4, v6}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 54
    .line 55
    .line 56
    const-string v4, "soft"

    .line 57
    .line 58
    invoke-static {v4, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v4, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 63
    .line 64
    new-array v5, v1, [J

    .line 65
    .line 66
    fill-array-data v5, :array_4

    .line 67
    .line 68
    .line 69
    const/16 v6, 0x32

    .line 70
    .line 71
    filled-new-array {v3, v6}, [I

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    new-array v8, v1, [J

    .line 76
    .line 77
    fill-array-data v8, :array_5

    .line 78
    .line 79
    .line 80
    invoke-direct {v4, v5, v7, v8}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 81
    .line 82
    .line 83
    const-string v5, "medium"

    .line 84
    .line 85
    invoke-static {v5, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    new-instance v5, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 90
    .line 91
    new-array v7, v1, [J

    .line 92
    .line 93
    fill-array-data v7, :array_6

    .line 94
    .line 95
    .line 96
    filled-new-array {v3, v6}, [I

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    new-array v8, v1, [J

    .line 101
    .line 102
    fill-array-data v8, :array_7

    .line 103
    .line 104
    .line 105
    invoke-direct {v5, v7, v6, v8}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 106
    .line 107
    .line 108
    const-string v6, "rigid"

    .line 109
    .line 110
    invoke-static {v6, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    new-instance v6, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 115
    .line 116
    new-array v7, v1, [J

    .line 117
    .line 118
    fill-array-data v7, :array_8

    .line 119
    .line 120
    .line 121
    const/16 v8, 0x46

    .line 122
    .line 123
    filled-new-array {v3, v8}, [I

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    new-array v1, v1, [J

    .line 128
    .line 129
    fill-array-data v1, :array_9

    .line 130
    .line 131
    .line 132
    invoke-direct {v6, v7, v3, v1}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 133
    .line 134
    .line 135
    const-string v1, "heavy"

    .line 136
    .line 137
    invoke-static {v1, v6}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    filled-new-array {v0, v2, v4, v5, v1}, [Lkotlin/Pair;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sput-object v0, Lexpo/modules/haptics/arguments/HapticsImpactType;->types:Ljava/util/Map;

    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :array_0
    .array-data 8
        0x0
        0x32
    .end array-data

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    :array_1
    .array-data 8
        0x0
        0x14
    .end array-data

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :array_2
    .array-data 8
        0x0
        0x32
    .end array-data

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    :array_3
    .array-data 8
        0x0
        0x14
    .end array-data

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    :array_4
    .array-data 8
        0x0
        0x2b
    .end array-data

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    :array_5
    .array-data 8
        0x0
        0x2b
    .end array-data

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :array_6
    .array-data 8
        0x0
        0x2b
    .end array-data

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :array_7
    .array-data 8
        0x0
        0x2b
    .end array-data

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    :array_8
    .array-data 8
        0x0
        0x3c
    .end array-data

    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    :array_9
    .array-data 8
        0x0
        0x3d
    .end array-data
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


# virtual methods
.method public final fromString(Ljava/lang/String;)Lexpo/modules/haptics/arguments/HapticsVibrationType;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;
        }
    .end annotation

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/haptics/arguments/HapticsImpactType;->types:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast v0, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "\'style\' must be one of [\'light\', \'medium\', \'heavy\', \'rigid\', \'soft\']. Obtained "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, "\'."

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v0, p1}, Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method
