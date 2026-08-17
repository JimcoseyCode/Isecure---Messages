.class Lcom/horcrux/svg/Q;
.super Lcom/horcrux/svg/RenderableView;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private g:Lcom/horcrux/svg/SVGLength;

.field private h:Lcom/horcrux/svg/SVGLength;

.field private i:Lcom/horcrux/svg/SVGLength;

.field private j:Lcom/horcrux/svg/SVGLength;

.field private k:Lcom/horcrux/svg/SVGLength;

.field private l:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Q;->j:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Q;->k:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Q;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Q;->i:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Q;->g:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lcom/horcrux/svg/Q;->g:Lcom/horcrux/svg/SVGLength;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 11
    .line 12
    .line 13
    move-result-wide v9

    .line 14
    iget-object v2, v0, Lcom/horcrux/svg/Q;->h:Lcom/horcrux/svg/SVGLength;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 17
    .line 18
    .line 19
    move-result-wide v11

    .line 20
    iget-object v2, v0, Lcom/horcrux/svg/Q;->i:Lcom/horcrux/svg/SVGLength;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 23
    .line 24
    .line 25
    move-result-wide v13

    .line 26
    iget-object v2, v0, Lcom/horcrux/svg/Q;->j:Lcom/horcrux/svg/SVGLength;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 29
    .line 30
    .line 31
    move-result-wide v15

    .line 32
    iget-object v2, v0, Lcom/horcrux/svg/Q;->k:Lcom/horcrux/svg/SVGLength;

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    iget-object v3, v0, Lcom/horcrux/svg/Q;->l:Lcom/horcrux/svg/SVGLength;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    double-to-float v2, v9

    .line 42
    double-to-float v3, v11

    .line 43
    add-double v4, v9, v13

    .line 44
    .line 45
    double-to-float v4, v4

    .line 46
    add-double v5, v11, v15

    .line 47
    .line 48
    double-to-float v5, v5

    .line 49
    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 50
    .line 51
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 59
    .line 60
    iget-object v2, v0, Lcom/horcrux/svg/Q;->l:Lcom/horcrux/svg/SVGLength;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    :goto_1
    move-wide v4, v2

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    iget-object v3, v0, Lcom/horcrux/svg/Q;->l:Lcom/horcrux/svg/SVGLength;

    .line 69
    .line 70
    if-nez v3, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    iget-object v4, v0, Lcom/horcrux/svg/Q;->l:Lcom/horcrux/svg/SVGLength;

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    :goto_2
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 88
    .line 89
    div-double v17, v13, v6

    .line 90
    .line 91
    cmpl-double v8, v2, v17

    .line 92
    .line 93
    if-lez v8, :cond_4

    .line 94
    .line 95
    move-wide/from16 v2, v17

    .line 96
    .line 97
    :cond_4
    div-double v6, v15, v6

    .line 98
    .line 99
    cmpl-double v8, v4, v6

    .line 100
    .line 101
    if-lez v8, :cond_5

    .line 102
    .line 103
    move-wide v4, v6

    .line 104
    :cond_5
    double-to-float v6, v9

    .line 105
    double-to-float v7, v11

    .line 106
    move v8, v6

    .line 107
    move/from16 v17, v7

    .line 108
    .line 109
    add-double v6, v9, v13

    .line 110
    .line 111
    double-to-float v6, v6

    .line 112
    move/from16 v18, v6

    .line 113
    .line 114
    add-double v6, v11, v15

    .line 115
    .line 116
    double-to-float v6, v6

    .line 117
    double-to-float v2, v2

    .line 118
    double-to-float v7, v4

    .line 119
    move v5, v6

    .line 120
    move v6, v2

    .line 121
    move v2, v8

    .line 122
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 123
    .line 124
    move/from16 v3, v17

    .line 125
    .line 126
    move/from16 v4, v18

    .line 127
    .line 128
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    .line 129
    .line 130
    .line 131
    :goto_3
    new-instance v2, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 137
    .line 138
    new-instance v3, Lcom/horcrux/svg/H;

    .line 139
    .line 140
    sget-object v4, Lcom/horcrux/svg/g;->i:Lcom/horcrux/svg/g;

    .line 141
    .line 142
    new-instance v5, Lcom/horcrux/svg/L;

    .line 143
    .line 144
    invoke-direct {v5, v9, v10, v11, v12}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 145
    .line 146
    .line 147
    filled-new-array {v5}, [Lcom/horcrux/svg/L;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 158
    .line 159
    new-instance v3, Lcom/horcrux/svg/H;

    .line 160
    .line 161
    sget-object v4, Lcom/horcrux/svg/g;->j:Lcom/horcrux/svg/g;

    .line 162
    .line 163
    new-instance v5, Lcom/horcrux/svg/L;

    .line 164
    .line 165
    add-double/2addr v13, v9

    .line 166
    invoke-direct {v5, v13, v14, v11, v12}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 167
    .line 168
    .line 169
    filled-new-array {v5}, [Lcom/horcrux/svg/L;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 180
    .line 181
    new-instance v3, Lcom/horcrux/svg/H;

    .line 182
    .line 183
    new-instance v5, Lcom/horcrux/svg/L;

    .line 184
    .line 185
    add-double v6, v11, v15

    .line 186
    .line 187
    invoke-direct {v5, v13, v14, v6, v7}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 188
    .line 189
    .line 190
    filled-new-array {v5}, [Lcom/horcrux/svg/L;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 201
    .line 202
    new-instance v3, Lcom/horcrux/svg/H;

    .line 203
    .line 204
    new-instance v5, Lcom/horcrux/svg/L;

    .line 205
    .line 206
    invoke-direct {v5, v9, v10, v6, v7}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 207
    .line 208
    .line 209
    filled-new-array {v5}, [Lcom/horcrux/svg/L;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    iget-object v2, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 220
    .line 221
    new-instance v3, Lcom/horcrux/svg/H;

    .line 222
    .line 223
    new-instance v5, Lcom/horcrux/svg/L;

    .line 224
    .line 225
    invoke-direct {v5, v9, v10, v11, v12}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 226
    .line 227
    .line 228
    filled-new-array {v5}, [Lcom/horcrux/svg/L;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-direct {v3, v4, v5}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    return-object v1
.end method

.method public h(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/Q;->h:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
