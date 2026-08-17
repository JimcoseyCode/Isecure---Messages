.class Lcom/horcrux/svg/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/a$a;,
        Lcom/horcrux/svg/a$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/horcrux/svg/a$a;

.field private final b:[Lcom/horcrux/svg/SVGLength;

.field private c:Lcom/facebook/react/bridge/ReadableArray;

.field private final d:Z

.field private e:Z

.field private f:Landroid/graphics/Matrix;

.field private g:Landroid/graphics/Rect;

.field private h:Lcom/horcrux/svg/K;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/a$a;[Lcom/horcrux/svg/SVGLength;Lcom/horcrux/svg/a$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/horcrux/svg/a;->a:Lcom/horcrux/svg/a$a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 7
    .line 8
    sget-object p1, Lcom/horcrux/svg/a$b;->g:Lcom/horcrux/svg/a$b;

    .line 9
    .line 10
    if-ne p3, p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iput-boolean p1, p0, Lcom/horcrux/svg/a;->d:Z

    .line 16
    .line 17
    return-void
.end method

.method private a(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/horcrux/svg/a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Landroid/graphics/RectF;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/horcrux/svg/a;->g:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-boolean v2, p0, Lcom/horcrux/svg/a;->d:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    move p1, v2

    .line 32
    :goto_1
    new-instance v3, Landroid/graphics/RectF;

    .line 33
    .line 34
    add-float/2addr v0, v2

    .line 35
    add-float/2addr v1, p1

    .line 36
    invoke-direct {v3, v2, p1, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 37
    .line 38
    .line 39
    return-object v3
.end method

.method private b(Lcom/horcrux/svg/SVGLength;DFF)D
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/horcrux/svg/a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/horcrux/svg/SVGLength;->b:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 6
    .line 7
    sget-object v2, Lcom/horcrux/svg/SVGLength$UnitType;->NUMBER:Lcom/horcrux/svg/SVGLength$UnitType;

    .line 8
    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    move-wide v6, p2

    .line 12
    :goto_0
    move v0, p5

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    float-to-double v2, p4

    .line 15
    move-wide v6, v2

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    float-to-double v8, v0

    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    move-object v1, p1

    .line 21
    move-wide v2, p2

    .line 22
    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/M;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
.end method

.method private static c(Lcom/facebook/react/bridge/ReadableArray;I[F[IF)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_0

    .line 3
    .line 4
    mul-int/lit8 v1, v0, 0x2

    .line 5
    .line 6
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    double-to-float v2, v2

    .line 11
    aput v2, p2, v0

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    ushr-int/lit8 v2, v1, 0x18

    .line 20
    .line 21
    int-to-float v2, v2

    .line 22
    mul-float/2addr v2, p4

    .line 23
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shl-int/lit8 v2, v2, 0x18

    .line 28
    .line 29
    const v3, 0xffffff

    .line 30
    .line 31
    .line 32
    and-int/2addr v1, v3

    .line 33
    or-int/2addr v1, v2

    .line 34
    aput v1, p3, v0

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method


# virtual methods
.method d(Lcom/horcrux/svg/a$b;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/horcrux/svg/a$b;->g:Lcom/horcrux/svg/a$b;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    iput-boolean p1, p0, Lcom/horcrux/svg/a;->e:Z

    .line 9
    .line 10
    return-void
.end method

.method e(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/a;->c:Lcom/facebook/react/bridge/ReadableArray;

    .line 2
    .line 3
    return-void
.end method

.method f(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/a;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-void
.end method

.method g(Lcom/horcrux/svg/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/a;->h:Lcom/horcrux/svg/K;

    .line 2
    .line 3
    return-void
.end method

.method h(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/a;->g:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-void
.end method

.method i(Landroid/graphics/Paint;Landroid/graphics/RectF;FF)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move/from16 v7, p4

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/horcrux/svg/a;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    iget v10, v1, Landroid/graphics/RectF;->left:F

    .line 22
    .line 23
    iget v11, v1, Landroid/graphics/RectF;->top:F

    .line 24
    .line 25
    invoke-virtual {v6}, Landroid/graphics/Paint;->getTextSize()F

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iget-object v1, v0, Lcom/horcrux/svg/a;->a:Lcom/horcrux/svg/a$a;

    .line 30
    .line 31
    sget-object v2, Lcom/horcrux/svg/a$a;->i:Lcom/horcrux/svg/a$a;

    .line 32
    .line 33
    const/4 v14, 0x1

    .line 34
    const/4 v15, 0x0

    .line 35
    if-ne v1, v2, :cond_4

    .line 36
    .line 37
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 38
    .line 39
    aget-object v1, v1, v15

    .line 40
    .line 41
    float-to-double v2, v8

    .line 42
    move/from16 v4, p3

    .line 43
    .line 44
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 45
    .line 46
    .line 47
    move-result-wide v10

    .line 48
    move-wide v15, v2

    .line 49
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 50
    .line 51
    aget-object v1, v1, v14

    .line 52
    .line 53
    float-to-double v2, v9

    .line 54
    const/16 p2, 0x3

    .line 55
    .line 56
    const/16 v17, 0x2

    .line 57
    .line 58
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 59
    .line 60
    .line 61
    move-result-wide v12

    .line 62
    move-wide/from16 v18, v2

    .line 63
    .line 64
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 65
    .line 66
    aget-object v1, v1, v17

    .line 67
    .line 68
    move-wide v2, v15

    .line 69
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 70
    .line 71
    .line 72
    move-result-wide v14

    .line 73
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 74
    .line 75
    aget-object v1, v1, p2

    .line 76
    .line 77
    move-wide/from16 v2, v18

    .line 78
    .line 79
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 80
    .line 81
    .line 82
    move-result-wide v1

    .line 83
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 84
    .line 85
    cmpl-double v5, v14, v3

    .line 86
    .line 87
    if-lez v5, :cond_c

    .line 88
    .line 89
    cmpl-double v3, v1, v3

    .line 90
    .line 91
    if-gtz v3, :cond_0

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_0
    double-to-int v3, v14

    .line 96
    double-to-int v4, v1

    .line 97
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 98
    .line 99
    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    new-instance v4, Landroid/graphics/Canvas;

    .line 104
    .line 105
    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 106
    .line 107
    .line 108
    iget-object v5, v0, Lcom/horcrux/svg/a;->h:Lcom/horcrux/svg/K;

    .line 109
    .line 110
    invoke-virtual {v5}, Lcom/horcrux/svg/K;->getViewBox()Landroid/graphics/RectF;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    if-eqz v5, :cond_1

    .line 115
    .line 116
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 117
    .line 118
    .line 119
    move-result v16

    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    cmpl-float v16, v16, v17

    .line 123
    .line 124
    if-lez v16, :cond_1

    .line 125
    .line 126
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 127
    .line 128
    .line 129
    move-result v16

    .line 130
    cmpl-float v16, v16, v17

    .line 131
    .line 132
    if-lez v16, :cond_1

    .line 133
    .line 134
    move/from16 v16, v9

    .line 135
    .line 136
    new-instance v9, Landroid/graphics/RectF;

    .line 137
    .line 138
    double-to-float v10, v10

    .line 139
    double-to-float v11, v12

    .line 140
    double-to-float v12, v14

    .line 141
    double-to-float v1, v1

    .line 142
    invoke-direct {v9, v10, v11, v12, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 143
    .line 144
    .line 145
    iget-object v1, v0, Lcom/horcrux/svg/a;->h:Lcom/horcrux/svg/K;

    .line 146
    .line 147
    iget-object v2, v1, Lcom/horcrux/svg/K;->v:Ljava/lang/String;

    .line 148
    .line 149
    iget v1, v1, Lcom/horcrux/svg/K;->w:I

    .line 150
    .line 151
    invoke-static {v5, v9, v2, v1}, Lcom/horcrux/svg/q0;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/lang/String;I)Landroid/graphics/Matrix;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v4, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_1
    move/from16 v16, v9

    .line 160
    .line 161
    :goto_0
    iget-boolean v1, v0, Lcom/horcrux/svg/a;->e:Z

    .line 162
    .line 163
    if-eqz v1, :cond_2

    .line 164
    .line 165
    div-float v8, v8, p3

    .line 166
    .line 167
    div-float v9, v16, p3

    .line 168
    .line 169
    invoke-virtual {v4, v8, v9}, Landroid/graphics/Canvas;->scale(FF)V

    .line 170
    .line 171
    .line 172
    :cond_2
    iget-object v1, v0, Lcom/horcrux/svg/a;->h:Lcom/horcrux/svg/K;

    .line 173
    .line 174
    new-instance v2, Landroid/graphics/Paint;

    .line 175
    .line 176
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v4, v2, v7}, Lcom/horcrux/svg/B;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 180
    .line 181
    .line 182
    new-instance v1, Landroid/graphics/Matrix;

    .line 183
    .line 184
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 185
    .line 186
    .line 187
    iget-object v2, v0, Lcom/horcrux/svg/a;->f:Landroid/graphics/Matrix;

    .line 188
    .line 189
    if-eqz v2, :cond_3

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 192
    .line 193
    .line 194
    :cond_3
    new-instance v2, Landroid/graphics/BitmapShader;

    .line 195
    .line 196
    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 197
    .line 198
    invoke-direct {v2, v3, v4, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_4
    move/from16 v16, v9

    .line 209
    .line 210
    const/16 p2, 0x3

    .line 211
    .line 212
    const/16 v17, 0x2

    .line 213
    .line 214
    iget-object v1, v0, Lcom/horcrux/svg/a;->c:Lcom/facebook/react/bridge/ReadableArray;

    .line 215
    .line 216
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    const-string v2, "ReactNative"

    .line 221
    .line 222
    if-nez v1, :cond_5

    .line 223
    .line 224
    const-string v1, "Gradient contains no stops"

    .line 225
    .line 226
    invoke-static {v2, v1}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_5
    div-int/lit8 v1, v1, 0x2

    .line 231
    .line 232
    new-array v3, v1, [I

    .line 233
    .line 234
    new-array v4, v1, [F

    .line 235
    .line 236
    iget-object v9, v0, Lcom/horcrux/svg/a;->c:Lcom/facebook/react/bridge/ReadableArray;

    .line 237
    .line 238
    invoke-static {v9, v1, v4, v3, v7}, Lcom/horcrux/svg/a;->c(Lcom/facebook/react/bridge/ReadableArray;I[F[IF)V

    .line 239
    .line 240
    .line 241
    if-ne v1, v14, :cond_6

    .line 242
    .line 243
    move/from16 v1, v17

    .line 244
    .line 245
    new-array v7, v1, [I

    .line 246
    .line 247
    aget v9, v3, v15

    .line 248
    .line 249
    aput v9, v7, v15

    .line 250
    .line 251
    aget v3, v3, v15

    .line 252
    .line 253
    aput v3, v7, v14

    .line 254
    .line 255
    new-array v3, v1, [F

    .line 256
    .line 257
    aget v1, v4, v15

    .line 258
    .line 259
    aput v1, v3, v15

    .line 260
    .line 261
    aget v1, v4, v15

    .line 262
    .line 263
    aput v1, v3, v14

    .line 264
    .line 265
    const-string v1, "Gradient contains only one stop"

    .line 266
    .line 267
    invoke-static {v2, v1}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    move-object/from16 v24, v3

    .line 271
    .line 272
    move-object/from16 v23, v7

    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_6
    move-object/from16 v23, v3

    .line 276
    .line 277
    move-object/from16 v24, v4

    .line 278
    .line 279
    :goto_1
    iget-object v1, v0, Lcom/horcrux/svg/a;->a:Lcom/horcrux/svg/a$a;

    .line 280
    .line 281
    sget-object v2, Lcom/horcrux/svg/a$a;->g:Lcom/horcrux/svg/a$a;

    .line 282
    .line 283
    if-ne v1, v2, :cond_8

    .line 284
    .line 285
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 286
    .line 287
    aget-object v1, v1, v15

    .line 288
    .line 289
    float-to-double v2, v8

    .line 290
    move/from16 v4, p3

    .line 291
    .line 292
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 293
    .line 294
    .line 295
    move-result-wide v7

    .line 296
    move-wide v12, v2

    .line 297
    float-to-double v9, v10

    .line 298
    add-double/2addr v7, v9

    .line 299
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 300
    .line 301
    aget-object v1, v1, v14

    .line 302
    .line 303
    move/from16 v2, v16

    .line 304
    .line 305
    float-to-double v2, v2

    .line 306
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 307
    .line 308
    .line 309
    move-result-wide v14

    .line 310
    move-wide/from16 v18, v2

    .line 311
    .line 312
    float-to-double v1, v11

    .line 313
    add-double/2addr v14, v1

    .line 314
    iget-object v3, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 315
    .line 316
    const/16 v17, 0x2

    .line 317
    .line 318
    aget-object v3, v3, v17

    .line 319
    .line 320
    move-wide/from16 v31, v1

    .line 321
    .line 322
    move-object v1, v3

    .line 323
    move-wide v2, v12

    .line 324
    move-wide/from16 v11, v31

    .line 325
    .line 326
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 327
    .line 328
    .line 329
    move-result-wide v1

    .line 330
    add-double/2addr v9, v1

    .line 331
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 332
    .line 333
    aget-object v1, v1, p2

    .line 334
    .line 335
    move-wide/from16 v2, v18

    .line 336
    .line 337
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 338
    .line 339
    .line 340
    move-result-wide v1

    .line 341
    add-double/2addr v1, v11

    .line 342
    new-instance v18, Landroid/graphics/LinearGradient;

    .line 343
    .line 344
    double-to-float v3, v7

    .line 345
    double-to-float v4, v14

    .line 346
    double-to-float v5, v9

    .line 347
    double-to-float v1, v1

    .line 348
    sget-object v25, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 349
    .line 350
    move/from16 v22, v1

    .line 351
    .line 352
    move/from16 v19, v3

    .line 353
    .line 354
    move/from16 v20, v4

    .line 355
    .line 356
    move/from16 v21, v5

    .line 357
    .line 358
    invoke-direct/range {v18 .. v25}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 359
    .line 360
    .line 361
    move-object/from16 v1, v18

    .line 362
    .line 363
    iget-object v2, v0, Lcom/horcrux/svg/a;->f:Landroid/graphics/Matrix;

    .line 364
    .line 365
    if-eqz v2, :cond_7

    .line 366
    .line 367
    new-instance v2, Landroid/graphics/Matrix;

    .line 368
    .line 369
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 370
    .line 371
    .line 372
    iget-object v3, v0, Lcom/horcrux/svg/a;->f:Landroid/graphics/Matrix;

    .line 373
    .line 374
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 378
    .line 379
    .line 380
    :cond_7
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :cond_8
    move/from16 v2, v16

    .line 385
    .line 386
    move-object/from16 v7, v23

    .line 387
    .line 388
    move-object/from16 v9, v24

    .line 389
    .line 390
    sget-object v3, Lcom/horcrux/svg/a$a;->h:Lcom/horcrux/svg/a$a;

    .line 391
    .line 392
    if-ne v1, v3, :cond_c

    .line 393
    .line 394
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 395
    .line 396
    const/16 v17, 0x2

    .line 397
    .line 398
    aget-object v1, v1, v17

    .line 399
    .line 400
    float-to-double v3, v8

    .line 401
    move v8, v2

    .line 402
    move-wide v2, v3

    .line 403
    move/from16 v4, p3

    .line 404
    .line 405
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 406
    .line 407
    .line 408
    move-result-wide v12

    .line 409
    move-wide/from16 v18, v2

    .line 410
    .line 411
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 412
    .line 413
    aget-object v1, v1, p2

    .line 414
    .line 415
    float-to-double v2, v8

    .line 416
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 417
    .line 418
    .line 419
    move-result-wide v20

    .line 420
    move-wide/from16 v22, v2

    .line 421
    .line 422
    const-wide/16 v1, 0x0

    .line 423
    .line 424
    cmpg-double v3, v12, v1

    .line 425
    .line 426
    if-lez v3, :cond_9

    .line 427
    .line 428
    cmpg-double v1, v20, v1

    .line 429
    .line 430
    if-gtz v1, :cond_a

    .line 431
    .line 432
    :cond_9
    const/4 v1, 0x2

    .line 433
    goto :goto_2

    .line 434
    :cond_a
    move-object/from16 v28, v7

    .line 435
    .line 436
    move-object/from16 v29, v9

    .line 437
    .line 438
    move-wide/from16 v2, v20

    .line 439
    .line 440
    goto :goto_3

    .line 441
    :goto_2
    new-array v2, v1, [F

    .line 442
    .line 443
    aget v3, v9, v15

    .line 444
    .line 445
    aput v3, v2, v15

    .line 446
    .line 447
    array-length v3, v9

    .line 448
    sub-int/2addr v3, v14

    .line 449
    aget v3, v9, v3

    .line 450
    .line 451
    aput v3, v2, v14

    .line 452
    .line 453
    new-array v1, v1, [I

    .line 454
    .line 455
    array-length v3, v7

    .line 456
    sub-int/2addr v3, v14

    .line 457
    aget v3, v7, v3

    .line 458
    .line 459
    aput v3, v1, v15

    .line 460
    .line 461
    array-length v3, v7

    .line 462
    sub-int/2addr v3, v14

    .line 463
    aget v3, v7, v3

    .line 464
    .line 465
    aput v3, v1, v14

    .line 466
    .line 467
    move-object/from16 v28, v1

    .line 468
    .line 469
    move-object/from16 v29, v2

    .line 470
    .line 471
    move-wide/from16 v12, v18

    .line 472
    .line 473
    move-wide/from16 v2, v22

    .line 474
    .line 475
    :goto_3
    div-double v7, v2, v12

    .line 476
    .line 477
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 478
    .line 479
    const/4 v2, 0x4

    .line 480
    aget-object v1, v1, v2

    .line 481
    .line 482
    move/from16 v4, p3

    .line 483
    .line 484
    move-wide/from16 v2, v18

    .line 485
    .line 486
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 487
    .line 488
    .line 489
    move-result-wide v1

    .line 490
    float-to-double v3, v10

    .line 491
    add-double v9, v1, v3

    .line 492
    .line 493
    iget-object v1, v0, Lcom/horcrux/svg/a;->b:[Lcom/horcrux/svg/SVGLength;

    .line 494
    .line 495
    const/4 v2, 0x5

    .line 496
    aget-object v1, v1, v2

    .line 497
    .line 498
    div-double v2, v22, v7

    .line 499
    .line 500
    move/from16 v4, p3

    .line 501
    .line 502
    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/a;->b(Lcom/horcrux/svg/SVGLength;DFF)D

    .line 503
    .line 504
    .line 505
    move-result-wide v1

    .line 506
    float-to-double v3, v11

    .line 507
    div-double/2addr v3, v7

    .line 508
    add-double/2addr v1, v3

    .line 509
    new-instance v24, Landroid/graphics/RadialGradient;

    .line 510
    .line 511
    double-to-float v3, v9

    .line 512
    double-to-float v1, v1

    .line 513
    double-to-float v2, v12

    .line 514
    sget-object v30, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 515
    .line 516
    move/from16 v26, v1

    .line 517
    .line 518
    move/from16 v27, v2

    .line 519
    .line 520
    move/from16 v25, v3

    .line 521
    .line 522
    invoke-direct/range {v24 .. v30}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 523
    .line 524
    .line 525
    move-object/from16 v1, v24

    .line 526
    .line 527
    new-instance v2, Landroid/graphics/Matrix;

    .line 528
    .line 529
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 530
    .line 531
    .line 532
    const/high16 v3, 0x3f800000    # 1.0f

    .line 533
    .line 534
    double-to-float v4, v7

    .line 535
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 536
    .line 537
    .line 538
    iget-object v3, v0, Lcom/horcrux/svg/a;->f:Landroid/graphics/Matrix;

    .line 539
    .line 540
    if-eqz v3, :cond_b

    .line 541
    .line 542
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 543
    .line 544
    .line 545
    :cond_b
    invoke-virtual {v1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 549
    .line 550
    .line 551
    :cond_c
    :goto_4
    return-void
.end method
