.class abstract Lcom/horcrux/svg/M;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method static a(Lcom/horcrux/svg/SVGLength;DDDD)D
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-wide p3

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/SVGLength;->b:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 5
    .line 6
    iget-wide v1, p0, Lcom/horcrux/svg/SVGLength;->a:D

    .line 7
    .line 8
    sget-object p0, Lcom/horcrux/svg/M$a;->a:[I

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    aget p0, p0, v0

    .line 15
    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :goto_0
    mul-double/2addr v1, p5

    .line 20
    :goto_1
    add-double/2addr v1, p3

    .line 21
    return-wide v1

    .line 22
    :pswitch_0
    const-wide/high16 p7, 0x402e000000000000L    # 15.0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :pswitch_1
    const-wide/high16 p7, 0x3ff4000000000000L    # 1.25

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :pswitch_2
    const-wide p7, 0x4056800000000000L    # 90.0

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :pswitch_3
    const-wide p7, 0x400c58b1572580c3L    # 3.543307

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :pswitch_4
    const-wide p7, 0x4041b76ed677707aL    # 35.43307

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :pswitch_5
    const-wide/high16 p0, 0x4000000000000000L    # 2.0

    .line 47
    .line 48
    div-double/2addr p7, p0

    .line 49
    goto :goto_2

    .line 50
    :pswitch_6
    const-wide/high16 p5, 0x4059000000000000L    # 100.0

    .line 51
    .line 52
    div-double/2addr v1, p5

    .line 53
    mul-double/2addr v1, p1

    .line 54
    goto :goto_1

    .line 55
    :pswitch_7
    const-wide/high16 p7, 0x3ff0000000000000L    # 1.0

    .line 56
    .line 57
    :goto_2
    :pswitch_8
    mul-double/2addr v1, p7

    .line 58
    goto :goto_0

    .line 59
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static b(Ljava/lang/String;DDD)D
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v1, v0, -0x1

    .line 10
    .line 11
    if-eqz v0, :cond_a

    .line 12
    .line 13
    const-string v2, "normal"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_5

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->codePointAt(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/16 v3, 0x25

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-ne v2, v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 41
    .line 42
    .line 43
    move-result-wide p3

    .line 44
    const-wide/high16 p5, 0x4059000000000000L    # 100.0

    .line 45
    .line 46
    div-double/2addr p3, p5

    .line 47
    mul-double/2addr p3, p1

    .line 48
    return-wide p3

    .line 49
    :cond_1
    add-int/lit8 p1, v0, -0x2

    .line 50
    .line 51
    if-lez p1, :cond_9

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/4 v2, -0x1

    .line 65
    sparse-switch v1, :sswitch_data_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :sswitch_0
    const-string v1, "px"

    .line 70
    .line 71
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-nez p2, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 v2, 0x6

    .line 79
    goto :goto_0

    .line 80
    :sswitch_1
    const-string v1, "pt"

    .line 81
    .line 82
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-nez p2, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const/4 v2, 0x5

    .line 90
    goto :goto_0

    .line 91
    :sswitch_2
    const-string v1, "pc"

    .line 92
    .line 93
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-nez p2, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    const/4 v2, 0x4

    .line 101
    goto :goto_0

    .line 102
    :sswitch_3
    const-string v1, "mm"

    .line 103
    .line 104
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_5

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    const/4 v2, 0x3

    .line 112
    goto :goto_0

    .line 113
    :sswitch_4
    const-string v1, "in"

    .line 114
    .line 115
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-nez p2, :cond_6

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_6
    const/4 v2, 0x2

    .line 123
    goto :goto_0

    .line 124
    :sswitch_5
    const-string v1, "em"

    .line 125
    .line 126
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_7

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_7
    const/4 v2, 0x1

    .line 134
    goto :goto_0

    .line 135
    :sswitch_6
    const-string v1, "cm"

    .line 136
    .line 137
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-nez p2, :cond_8

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    move v2, v4

    .line 145
    :goto_0
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 146
    .line 147
    packed-switch v2, :pswitch_data_0

    .line 148
    .line 149
    .line 150
    :goto_1
    move-wide p5, v5

    .line 151
    goto :goto_3

    .line 152
    :pswitch_0
    move v0, p1

    .line 153
    goto :goto_1

    .line 154
    :pswitch_1
    const-wide/high16 p5, 0x3ff4000000000000L    # 1.25

    .line 155
    .line 156
    :goto_2
    :pswitch_2
    move v0, p1

    .line 157
    goto :goto_3

    .line 158
    :pswitch_3
    const-wide/high16 p5, 0x402e000000000000L    # 15.0

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :pswitch_4
    const-wide p5, 0x400c58b1572580c3L    # 3.543307

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :pswitch_5
    const-wide p5, 0x4056800000000000L    # 90.0

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :pswitch_6
    const-wide p5, 0x4041b76ed677707aL    # 35.43307

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :goto_3
    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 188
    .line 189
    .line 190
    move-result-wide p0

    .line 191
    mul-double/2addr p0, p5

    .line 192
    :goto_4
    mul-double/2addr p0, p3

    .line 193
    return-wide p0

    .line 194
    :cond_9
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 199
    .line 200
    .line 201
    move-result-wide p0

    .line 202
    goto :goto_4

    .line 203
    :cond_a
    :goto_5
    const-wide/16 p0, 0x0

    .line 204
    .line 205
    return-wide p0

    .line 206
    nop

    .line 207
    :sswitch_data_0
    .sparse-switch
        0xc6a -> :sswitch_6
        0xca8 -> :sswitch_5
        0xd25 -> :sswitch_4
        0xda0 -> :sswitch_3
        0xdf3 -> :sswitch_2
        0xe04 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
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
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static c(Lcom/facebook/react/bridge/ReadableArray;[FF)I
    .locals 6

    .line 1
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x6

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    double-to-float v2, v2

    .line 15
    aput v2, p1, v0

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    double-to-float v2, v2

    .line 23
    const/4 v3, 0x1

    .line 24
    aput v2, p1, v3

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    double-to-float v4, v4

    .line 32
    mul-float/2addr v4, p2

    .line 33
    aput v4, p1, v0

    .line 34
    .line 35
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    double-to-float v0, v3

    .line 40
    const/4 v3, 0x3

    .line 41
    aput v0, p1, v3

    .line 42
    .line 43
    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    double-to-float v0, v3

    .line 48
    aput v0, p1, v2

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    double-to-float p0, v2

    .line 56
    mul-float/2addr p0, p2

    .line 57
    aput p0, p1, v0

    .line 58
    .line 59
    return v1
.end method
