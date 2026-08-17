.class public final Lexpo/modules/haptics/arguments/HapticsNotificationType;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/haptics/arguments/HapticsNotificationType;",
        "",
        "<init>",
        "()V",
        "types",
        "",
        "",
        "Lexpo/modules/haptics/arguments/HapticsVibrationType;",
        "fromString",
        "type",
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
.field public static final INSTANCE:Lexpo/modules/haptics/arguments/HapticsNotificationType;

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
    .locals 7

    .line 1
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsNotificationType;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/haptics/arguments/HapticsNotificationType;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/haptics/arguments/HapticsNotificationType;->INSTANCE:Lexpo/modules/haptics/arguments/HapticsNotificationType;

    .line 7
    .line 8
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 9
    .line 10
    const/4 v1, 0x4

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
    const/16 v4, 0x32

    .line 18
    .line 19
    const/16 v5, 0x3c

    .line 20
    .line 21
    filled-new-array {v3, v4, v3, v5}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    new-array v6, v1, [J

    .line 26
    .line 27
    fill-array-data v6, :array_1

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v2, v4, v6}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 31
    .line 32
    .line 33
    const-string v2, "success"

    .line 34
    .line 35
    invoke-static {v2, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 40
    .line 41
    new-array v4, v1, [J

    .line 42
    .line 43
    fill-array-data v4, :array_2

    .line 44
    .line 45
    .line 46
    const/16 v6, 0x28

    .line 47
    .line 48
    filled-new-array {v3, v6, v3, v5}, [I

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    new-array v1, v1, [J

    .line 53
    .line 54
    fill-array-data v1, :array_3

    .line 55
    .line 56
    .line 57
    invoke-direct {v2, v4, v3, v1}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 58
    .line 59
    .line 60
    const-string v1, "warning"

    .line 61
    .line 62
    invoke-static {v1, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 67
    .line 68
    const/4 v3, 0x6

    .line 69
    new-array v4, v3, [J

    .line 70
    .line 71
    fill-array-data v4, :array_4

    .line 72
    .line 73
    .line 74
    new-array v5, v3, [I

    .line 75
    .line 76
    fill-array-data v5, :array_5

    .line 77
    .line 78
    .line 79
    new-array v3, v3, [J

    .line 80
    .line 81
    fill-array-data v3, :array_6

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v4, v5, v3}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 85
    .line 86
    .line 87
    const-string v3, "error"

    .line 88
    .line 89
    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, Lexpo/modules/haptics/arguments/HapticsNotificationType;->types:Ljava/util/Map;

    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :array_0
    .array-data 8
        0x0
        0x28
        0x64
        0x28
    .end array-data

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    :array_1
    .array-data 8
        0x0
        0x28
        0x64
        0x28
    .end array-data

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    :array_2
    .array-data 8
        0x0
        0x28
        0x78
        0x3c
    .end array-data

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
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
    :array_3
    .array-data 8
        0x0
        0x28
        0x78
        0x3c
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    :array_4
    .array-data 8
        0x0
        0x3c
        0x64
        0x28
        0x50
        0x32
    .end array-data

    .line 186
    .line 187
    .line 188
    .line 189
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
    .array-data 4
        0x0
        0x32
        0x0
        0x28
        0x0
        0x32
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
    .line 226
    .line 227
    .line 228
    .line 229
    :array_6
    .array-data 8
        0x0
        0x3c
        0x64
        0x28
        0x50
        0x32
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
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/haptics/arguments/HapticsNotificationType;->types:Ljava/util/Map;

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
    const-string v2, "\'type\' must be one of [\'success\', \'warning\', \'error\']. Obtained \'"

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
