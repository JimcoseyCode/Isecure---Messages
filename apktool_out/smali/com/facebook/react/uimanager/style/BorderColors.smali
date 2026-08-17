.class public final Lcom/facebook/react/uimanager/style/BorderColors;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0081@\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0008\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008\u0088\u0001\u0002\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BorderColors;",
        "",
        "edgeColors",
        "",
        "",
        "constructor-impl",
        "([Ljava/lang/Integer;)[Ljava/lang/Integer;",
        "getEdgeColors",
        "()[Ljava/lang/Integer;",
        "[Ljava/lang/Integer;",
        "resolve",
        "Lcom/facebook/react/uimanager/style/ColorEdges;",
        "layoutDirection",
        "context",
        "Landroid/content/Context;",
        "resolve-impl",
        "([Ljava/lang/Integer;ILandroid/content/Context;)Lcom/facebook/react/uimanager/style/ColorEdges;",
        "equals",
        "",
        "other",
        "equals-impl",
        "([Ljava/lang/Integer;Ljava/lang/Object;)Z",
        "hashCode",
        "hashCode-impl",
        "([Ljava/lang/Integer;)I",
        "toString",
        "",
        "toString-impl",
        "([Ljava/lang/Integer;)Ljava/lang/String;",
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


# instance fields
.field private final edgeColors:[Ljava/lang/Integer;


# direct methods
.method private synthetic constructor <init>([Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic box-impl([Ljava/lang/Integer;)Lcom/facebook/react/uimanager/style/BorderColors;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/BorderColors;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/style/BorderColors;-><init>([Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static constructor-impl([Ljava/lang/Integer;)[Ljava/lang/Integer;
    .locals 1

    .line 1
    const-string v0, "edgeColors"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic constructor-impl$default([Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)[Ljava/lang/Integer;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->values()[Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    array-length p0, p0

    .line 10
    new-array p0, p0, [Ljava/lang/Integer;

    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Lcom/facebook/react/uimanager/style/BorderColors;->constructor-impl([Ljava/lang/Integer;)[Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static equals-impl([Ljava/lang/Integer;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/facebook/react/uimanager/style/BorderColors;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/facebook/react/uimanager/style/BorderColors;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/style/BorderColors;->unbox-impl()[Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final equals-impl0([Ljava/lang/Integer;[Ljava/lang/Integer;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static hashCode-impl([Ljava/lang/Integer;)I
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final resolve-impl([Ljava/lang/Integer;ILandroid/content/Context;)Lcom/facebook/react/uimanager/style/ColorEdges;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/high16 v0, -0x1000000

    .line 7
    .line 8
    if-eqz p1, :cond_26

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne p1, v1, :cond_25

    .line 12
    .line 13
    sget-object p1, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->Companion:Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_12

    .line 24
    .line 25
    new-instance p1, Lcom/facebook/react/uimanager/style/ColorEdges;

    .line 26
    .line 27
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    aget-object p2, p0, p2

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    aget-object p2, p0, p2

    .line 49
    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    aget-object p2, p0, p2

    .line 60
    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    aget-object p2, p0, p2

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move p2, v0

    .line 76
    :goto_1
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    aget-object v1, p0, v1

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    aget-object v1, p0, v1

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    aget-object v1, p0, v1

    .line 109
    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_6
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    aget-object v1, p0, v1

    .line 120
    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_7
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    aget-object v1, p0, v1

    .line 131
    .line 132
    if-eqz v1, :cond_8

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_8
    move v1, v0

    .line 136
    :goto_3
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    aget-object v2, p0, v2

    .line 143
    .line 144
    if-eqz v2, :cond_9

    .line 145
    .line 146
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    goto :goto_5

    .line 151
    :cond_9
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    aget-object v2, p0, v2

    .line 158
    .line 159
    if-eqz v2, :cond_a

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_a
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    aget-object v2, p0, v2

    .line 169
    .line 170
    if-eqz v2, :cond_b

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_b
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    aget-object v2, p0, v2

    .line 180
    .line 181
    if-eqz v2, :cond_c

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_c
    move v2, v0

    .line 185
    :goto_5
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    aget-object v3, p0, v3

    .line 192
    .line 193
    if-eqz v3, :cond_d

    .line 194
    .line 195
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    goto :goto_7

    .line 200
    :cond_d
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    aget-object v3, p0, v3

    .line 207
    .line 208
    if-eqz v3, :cond_e

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_e
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 212
    .line 213
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    aget-object v3, p0, v3

    .line 218
    .line 219
    if-eqz v3, :cond_f

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_f
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    aget-object v3, p0, v3

    .line 229
    .line 230
    if-eqz v3, :cond_10

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_10
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    aget-object p0, p0, v3

    .line 240
    .line 241
    if-eqz p0, :cond_11

    .line 242
    .line 243
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    :cond_11
    :goto_7
    invoke-direct {p1, p2, v1, v2, v0}, Lcom/facebook/react/uimanager/style/ColorEdges;-><init>(IIII)V

    .line 248
    .line 249
    .line 250
    return-object p1

    .line 251
    :cond_12
    new-instance p1, Lcom/facebook/react/uimanager/style/ColorEdges;

    .line 252
    .line 253
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 254
    .line 255
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    aget-object p2, p0, p2

    .line 260
    .line 261
    if-eqz p2, :cond_13

    .line 262
    .line 263
    :goto_8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    goto :goto_9

    .line 268
    :cond_13
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 269
    .line 270
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    aget-object p2, p0, p2

    .line 275
    .line 276
    if-eqz p2, :cond_14

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_14
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 280
    .line 281
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    aget-object p2, p0, p2

    .line 286
    .line 287
    if-eqz p2, :cond_15

    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_15
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 291
    .line 292
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 293
    .line 294
    .line 295
    move-result p2

    .line 296
    aget-object p2, p0, p2

    .line 297
    .line 298
    if-eqz p2, :cond_16

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_16
    move p2, v0

    .line 302
    :goto_9
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    aget-object v1, p0, v1

    .line 309
    .line 310
    if-eqz v1, :cond_17

    .line 311
    .line 312
    :goto_a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    goto :goto_b

    .line 317
    :cond_17
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    aget-object v1, p0, v1

    .line 324
    .line 325
    if-eqz v1, :cond_18

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_18
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    aget-object v1, p0, v1

    .line 335
    .line 336
    if-eqz v1, :cond_19

    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_19
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    aget-object v1, p0, v1

    .line 346
    .line 347
    if-eqz v1, :cond_1a

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_1a
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    aget-object v1, p0, v1

    .line 357
    .line 358
    if-eqz v1, :cond_1b

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_1b
    move v1, v0

    .line 362
    :goto_b
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 363
    .line 364
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    aget-object v2, p0, v2

    .line 369
    .line 370
    if-eqz v2, :cond_1c

    .line 371
    .line 372
    :goto_c
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    goto :goto_d

    .line 377
    :cond_1c
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    aget-object v2, p0, v2

    .line 384
    .line 385
    if-eqz v2, :cond_1d

    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_1d
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    aget-object v2, p0, v2

    .line 395
    .line 396
    if-eqz v2, :cond_1e

    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_1e
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 400
    .line 401
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    aget-object v2, p0, v2

    .line 406
    .line 407
    if-eqz v2, :cond_1f

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_1f
    move v2, v0

    .line 411
    :goto_d
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 412
    .line 413
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    aget-object v3, p0, v3

    .line 418
    .line 419
    if-eqz v3, :cond_20

    .line 420
    .line 421
    :goto_e
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    goto :goto_f

    .line 426
    :cond_20
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 427
    .line 428
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    aget-object v3, p0, v3

    .line 433
    .line 434
    if-eqz v3, :cond_21

    .line 435
    .line 436
    goto :goto_e

    .line 437
    :cond_21
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 438
    .line 439
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    aget-object v3, p0, v3

    .line 444
    .line 445
    if-eqz v3, :cond_22

    .line 446
    .line 447
    goto :goto_e

    .line 448
    :cond_22
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 449
    .line 450
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    aget-object v3, p0, v3

    .line 455
    .line 456
    if-eqz v3, :cond_23

    .line 457
    .line 458
    goto :goto_e

    .line 459
    :cond_23
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    aget-object p0, p0, v3

    .line 466
    .line 467
    if-eqz p0, :cond_24

    .line 468
    .line 469
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    :cond_24
    :goto_f
    invoke-direct {p1, p2, v1, v2, v0}, Lcom/facebook/react/uimanager/style/ColorEdges;-><init>(IIII)V

    .line 474
    .line 475
    .line 476
    return-object p1

    .line 477
    :cond_25
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 478
    .line 479
    const-string p1, "Expected resolved layout direction"

    .line 480
    .line 481
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    throw p0

    .line 485
    :cond_26
    new-instance p1, Lcom/facebook/react/uimanager/style/ColorEdges;

    .line 486
    .line 487
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 488
    .line 489
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 490
    .line 491
    .line 492
    move-result p2

    .line 493
    aget-object p2, p0, p2

    .line 494
    .line 495
    if-eqz p2, :cond_27

    .line 496
    .line 497
    :goto_10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result p2

    .line 501
    goto :goto_11

    .line 502
    :cond_27
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 503
    .line 504
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 505
    .line 506
    .line 507
    move-result p2

    .line 508
    aget-object p2, p0, p2

    .line 509
    .line 510
    if-eqz p2, :cond_28

    .line 511
    .line 512
    goto :goto_10

    .line 513
    :cond_28
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 514
    .line 515
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 516
    .line 517
    .line 518
    move-result p2

    .line 519
    aget-object p2, p0, p2

    .line 520
    .line 521
    if-eqz p2, :cond_29

    .line 522
    .line 523
    goto :goto_10

    .line 524
    :cond_29
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 525
    .line 526
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 527
    .line 528
    .line 529
    move-result p2

    .line 530
    aget-object p2, p0, p2

    .line 531
    .line 532
    if-eqz p2, :cond_2a

    .line 533
    .line 534
    goto :goto_10

    .line 535
    :cond_2a
    move p2, v0

    .line 536
    :goto_11
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 537
    .line 538
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    aget-object v1, p0, v1

    .line 543
    .line 544
    if-eqz v1, :cond_2b

    .line 545
    .line 546
    :goto_12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    goto :goto_13

    .line 551
    :cond_2b
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    aget-object v1, p0, v1

    .line 558
    .line 559
    if-eqz v1, :cond_2c

    .line 560
    .line 561
    goto :goto_12

    .line 562
    :cond_2c
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 563
    .line 564
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    aget-object v1, p0, v1

    .line 569
    .line 570
    if-eqz v1, :cond_2d

    .line 571
    .line 572
    goto :goto_12

    .line 573
    :cond_2d
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 574
    .line 575
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    aget-object v1, p0, v1

    .line 580
    .line 581
    if-eqz v1, :cond_2e

    .line 582
    .line 583
    goto :goto_12

    .line 584
    :cond_2e
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 585
    .line 586
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 587
    .line 588
    .line 589
    move-result v1

    .line 590
    aget-object v1, p0, v1

    .line 591
    .line 592
    if-eqz v1, :cond_2f

    .line 593
    .line 594
    goto :goto_12

    .line 595
    :cond_2f
    move v1, v0

    .line 596
    :goto_13
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 597
    .line 598
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    aget-object v2, p0, v2

    .line 603
    .line 604
    if-eqz v2, :cond_30

    .line 605
    .line 606
    :goto_14
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    goto :goto_15

    .line 611
    :cond_30
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 612
    .line 613
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    aget-object v2, p0, v2

    .line 618
    .line 619
    if-eqz v2, :cond_31

    .line 620
    .line 621
    goto :goto_14

    .line 622
    :cond_31
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 623
    .line 624
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    aget-object v2, p0, v2

    .line 629
    .line 630
    if-eqz v2, :cond_32

    .line 631
    .line 632
    goto :goto_14

    .line 633
    :cond_32
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 634
    .line 635
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    aget-object v2, p0, v2

    .line 640
    .line 641
    if-eqz v2, :cond_33

    .line 642
    .line 643
    goto :goto_14

    .line 644
    :cond_33
    move v2, v0

    .line 645
    :goto_15
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 646
    .line 647
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 648
    .line 649
    .line 650
    move-result v3

    .line 651
    aget-object v3, p0, v3

    .line 652
    .line 653
    if-eqz v3, :cond_34

    .line 654
    .line 655
    :goto_16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    goto :goto_17

    .line 660
    :cond_34
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 661
    .line 662
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    aget-object v3, p0, v3

    .line 667
    .line 668
    if-eqz v3, :cond_35

    .line 669
    .line 670
    goto :goto_16

    .line 671
    :cond_35
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 672
    .line 673
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    aget-object v3, p0, v3

    .line 678
    .line 679
    if-eqz v3, :cond_36

    .line 680
    .line 681
    goto :goto_16

    .line 682
    :cond_36
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 683
    .line 684
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    aget-object v3, p0, v3

    .line 689
    .line 690
    if-eqz v3, :cond_37

    .line 691
    .line 692
    goto :goto_16

    .line 693
    :cond_37
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 694
    .line 695
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    aget-object p0, p0, v3

    .line 700
    .line 701
    if-eqz p0, :cond_38

    .line 702
    .line 703
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    :cond_38
    :goto_17
    invoke-direct {p1, p2, v1, v2, v0}, Lcom/facebook/react/uimanager/style/ColorEdges;-><init>(IIII)V

    .line 708
    .line 709
    .line 710
    return-object p1
.end method

.method public static toString-impl([Ljava/lang/Integer;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "BorderColors(edgeColors="

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, ")"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/style/BorderColors;->equals-impl([Ljava/lang/Integer;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getEdgeColors()[Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/style/BorderColors;->hashCode-impl([Ljava/lang/Integer;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/style/BorderColors;->toString-impl([Ljava/lang/Integer;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final synthetic unbox-impl()[Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
