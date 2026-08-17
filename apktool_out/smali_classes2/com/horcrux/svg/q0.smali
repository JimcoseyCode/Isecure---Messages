.class abstract Lcom/horcrux/svg/q0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method static a(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 10
    .line 11
    float-to-double v4, v4

    .line 12
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 13
    .line 14
    float-to-double v6, v6

    .line 15
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 16
    .line 17
    .line 18
    move-result v8

    .line 19
    float-to-double v8, v8

    .line 20
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    float-to-double v10, v0

    .line 25
    iget v0, v1, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    float-to-double v12, v0

    .line 28
    iget v0, v1, Landroid/graphics/RectF;->top:F

    .line 29
    .line 30
    float-to-double v14, v0

    .line 31
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    float-to-double v0, v0

    .line 36
    move-wide/from16 v16, v0

    .line 37
    .line 38
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/RectF;->height()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    float-to-double v0, v0

    .line 43
    move-wide/from16 p0, v0

    .line 44
    .line 45
    div-double v0, v16, v8

    .line 46
    .line 47
    move-wide/from16 v18, v4

    .line 48
    .line 49
    div-double v4, p0, v10

    .line 50
    .line 51
    mul-double v20, v18, v0

    .line 52
    .line 53
    sub-double v20, v12, v20

    .line 54
    .line 55
    mul-double v22, v6, v4

    .line 56
    .line 57
    sub-double v22, v14, v22

    .line 58
    .line 59
    move-wide/from16 v24, v6

    .line 60
    .line 61
    const/4 v6, 0x2

    .line 62
    const-wide/high16 v26, 0x4000000000000000L    # 2.0

    .line 63
    .line 64
    if-ne v3, v6, :cond_2

    .line 65
    .line 66
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 71
    .line 72
    cmpl-double v2, v0, v2

    .line 73
    .line 74
    if-lez v2, :cond_0

    .line 75
    .line 76
    div-double v2, v16, v0

    .line 77
    .line 78
    sub-double/2addr v2, v8

    .line 79
    div-double v2, v2, v26

    .line 80
    .line 81
    sub-double v20, v20, v2

    .line 82
    .line 83
    div-double v2, p0, v0

    .line 84
    .line 85
    sub-double/2addr v2, v10

    .line 86
    :goto_0
    div-double v2, v2, v26

    .line 87
    .line 88
    sub-double v22, v22, v2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    mul-double/2addr v8, v0

    .line 92
    sub-double v2, v16, v8

    .line 93
    .line 94
    div-double v2, v2, v26

    .line 95
    .line 96
    sub-double v20, v20, v2

    .line 97
    .line 98
    mul-double/2addr v10, v0

    .line 99
    sub-double v2, p0, v10

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :goto_1
    move-wide v4, v0

    .line 103
    :cond_1
    :goto_2
    move-wide/from16 v2, v20

    .line 104
    .line 105
    move-wide/from16 v6, v22

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_2
    const-string v6, "none"

    .line 109
    .line 110
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-nez v7, :cond_3

    .line 115
    .line 116
    if-nez v3, :cond_3

    .line 117
    .line 118
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 119
    .line 120
    .line 121
    move-result-wide v0

    .line 122
    :goto_3
    move-wide v4, v0

    .line 123
    goto :goto_4

    .line 124
    :cond_3
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-nez v6, :cond_4

    .line 129
    .line 130
    const/4 v6, 0x1

    .line 131
    if-ne v3, v6, :cond_4

    .line 132
    .line 133
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 134
    .line 135
    .line 136
    move-result-wide v0

    .line 137
    goto :goto_3

    .line 138
    :cond_4
    :goto_4
    mul-double v6, v18, v0

    .line 139
    .line 140
    sub-double/2addr v12, v6

    .line 141
    mul-double v6, v24, v4

    .line 142
    .line 143
    sub-double/2addr v14, v6

    .line 144
    const-string v3, "xMid"

    .line 145
    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_5

    .line 151
    .line 152
    mul-double v6, v8, v0

    .line 153
    .line 154
    sub-double v6, v16, v6

    .line 155
    .line 156
    div-double v6, v6, v26

    .line 157
    .line 158
    add-double/2addr v12, v6

    .line 159
    :cond_5
    const-string v3, "xMax"

    .line 160
    .line 161
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_6

    .line 166
    .line 167
    mul-double/2addr v8, v0

    .line 168
    sub-double v6, v16, v8

    .line 169
    .line 170
    add-double/2addr v12, v6

    .line 171
    :cond_6
    move-wide/from16 v20, v12

    .line 172
    .line 173
    const-string v3, "YMid"

    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_7

    .line 180
    .line 181
    mul-double v6, v10, v4

    .line 182
    .line 183
    sub-double v6, p0, v6

    .line 184
    .line 185
    div-double v6, v6, v26

    .line 186
    .line 187
    add-double/2addr v14, v6

    .line 188
    :cond_7
    move-wide/from16 v22, v14

    .line 189
    .line 190
    const-string v3, "YMax"

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_1

    .line 197
    .line 198
    mul-double/2addr v10, v4

    .line 199
    sub-double v2, p0, v10

    .line 200
    .line 201
    add-double v22, v22, v2

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :goto_5
    new-instance v8, Landroid/graphics/Matrix;

    .line 205
    .line 206
    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 207
    .line 208
    .line 209
    double-to-float v2, v2

    .line 210
    double-to-float v3, v6

    .line 211
    invoke-virtual {v8, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 212
    .line 213
    .line 214
    double-to-float v0, v0

    .line 215
    double-to-float v1, v4

    .line 216
    invoke-virtual {v8, v0, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 217
    .line 218
    .line 219
    return-object v8
.end method
