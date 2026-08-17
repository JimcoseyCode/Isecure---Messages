.class public final Lr6/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr6/g;-><init>(Landroid/widget/EditText;Lw7/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Lr6/g;


# direct methods
.method constructor <init>(Lr6/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr6/g$a;->g:Lr6/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lr6/g$a;->g:Lr6/g;

    .line 4
    .line 5
    invoke-static {v1}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, v0, Lr6/g$a;->g:Lr6/g;

    .line 14
    .line 15
    invoke-static {v2}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v3, v0, Lr6/g$a;->g:Lr6/g;

    .line 24
    .line 25
    invoke-static {v3}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget-object v4, v0, Lr6/g$a;->g:Lr6/g;

    .line 34
    .line 35
    invoke-static {v4}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v6, 0x1

    .line 44
    if-nez v5, :cond_0

    .line 45
    .line 46
    return v6

    .line 47
    :cond_0
    iget-object v7, v0, Lr6/g$a;->g:Lr6/g;

    .line 48
    .line 49
    invoke-static {v7}, Lr6/g;->e(Lr6/g;)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-ne v7, v1, :cond_1

    .line 54
    .line 55
    iget-object v7, v0, Lr6/g$a;->g:Lr6/g;

    .line 56
    .line 57
    invoke-static {v7}, Lr6/g;->d(Lr6/g;)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-ne v7, v2, :cond_1

    .line 62
    .line 63
    iget-object v7, v0, Lr6/g$a;->g:Lr6/g;

    .line 64
    .line 65
    invoke-static {v7}, Lr6/g;->c(Lr6/g;)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eq v7, v3, :cond_6

    .line 70
    .line 71
    :cond_1
    iget-object v7, v0, Lr6/g$a;->g:Lr6/g;

    .line 72
    .line 73
    invoke-static {v7, v1}, Lr6/g;->h(Lr6/g;I)V

    .line 74
    .line 75
    .line 76
    iget-object v7, v0, Lr6/g$a;->g:Lr6/g;

    .line 77
    .line 78
    invoke-static {v7, v2}, Lr6/g;->g(Lr6/g;I)V

    .line 79
    .line 80
    .line 81
    iget-object v7, v0, Lr6/g$a;->g:Lr6/g;

    .line 82
    .line 83
    invoke-static {v7, v3}, Lr6/g;->f(Lr6/g;I)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-virtual {v5, v7}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineTop(I)I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 107
    .line 108
    const/16 v12, 0x1d

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    if-lt v11, v12, :cond_2

    .line 112
    .line 113
    invoke-static {v4}, Lcom/google/android/material/textfield/H;->a(Landroid/widget/EditText;)Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    if-eqz v11, :cond_2

    .line 118
    .line 119
    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    :cond_2
    iget-object v11, v0, Lr6/g$a;->g:Lr6/g;

    .line 124
    .line 125
    invoke-static {v11}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    invoke-virtual {v11}, Landroid/widget/TextView;->getGravity()I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    and-int/lit8 v11, v11, 0x70

    .line 134
    .line 135
    iget-object v12, v0, Lr6/g$a;->g:Lr6/g;

    .line 136
    .line 137
    invoke-static {v12}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-virtual {v12}, Landroid/view/View;->getPaddingTop()I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    iget-object v14, v0, Lr6/g$a;->g:Lr6/g;

    .line 146
    .line 147
    invoke-static {v14}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    invoke-virtual {v14}, Landroid/view/View;->getPaddingBottom()I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    add-int/2addr v12, v14

    .line 156
    iget-object v14, v0, Lr6/g$a;->g:Lr6/g;

    .line 157
    .line 158
    invoke-static {v14}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    invoke-virtual {v14}, Landroid/widget/TextView;->getLineHeight()I

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    div-int/lit8 v14, v14, 0x2

    .line 167
    .line 168
    sub-int/2addr v3, v12

    .line 169
    if-gt v10, v3, :cond_5

    .line 170
    .line 171
    const/16 v12, 0x10

    .line 172
    .line 173
    if-eq v11, v12, :cond_4

    .line 174
    .line 175
    const/16 v12, 0x50

    .line 176
    .line 177
    if-eq v11, v12, :cond_3

    .line 178
    .line 179
    iget-object v3, v0, Lr6/g$a;->g:Lr6/g;

    .line 180
    .line 181
    invoke-static {v3}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    :goto_0
    add-int/2addr v3, v14

    .line 190
    goto :goto_1

    .line 191
    :cond_3
    iget-object v11, v0, Lr6/g$a;->g:Lr6/g;

    .line 192
    .line 193
    invoke-static {v11}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-virtual {v11}, Landroid/view/View;->getPaddingTop()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    sub-int/2addr v3, v10

    .line 202
    add-int/2addr v11, v3

    .line 203
    add-int v3, v11, v14

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_4
    sub-int/2addr v3, v10

    .line 207
    div-int/lit8 v3, v3, 0x2

    .line 208
    .line 209
    iget-object v10, v0, Lr6/g$a;->g:Lr6/g;

    .line 210
    .line 211
    invoke-static {v10}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    invoke-virtual {v10}, Landroid/view/View;->getPaddingTop()I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    add-int/2addr v3, v10

    .line 220
    goto :goto_0

    .line 221
    :cond_5
    iget-object v3, v0, Lr6/g$a;->g:Lr6/g;

    .line 222
    .line 223
    invoke-static {v3}, Lr6/g;->b(Lr6/g;)Landroid/widget/EditText;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    goto :goto_0

    .line 232
    :goto_1
    invoke-virtual {v5, v7}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    add-int/2addr v9, v3

    .line 237
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    sub-int/2addr v9, v10

    .line 242
    int-to-float v9, v9

    .line 243
    invoke-virtual {v5, v8}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-virtual {v5, v8}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    invoke-virtual {v5, v10}, Landroid/text/Layout;->getLineBottom(I)I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    int-to-float v10, v13

    .line 256
    add-float/2addr v8, v10

    .line 257
    add-int/2addr v5, v3

    .line 258
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    sub-int/2addr v5, v3

    .line 263
    int-to-float v3, v5

    .line 264
    iget-object v4, v0, Lr6/g$a;->g:Lr6/g;

    .line 265
    .line 266
    invoke-static {v4}, Lr6/g;->a(Lr6/g;)Lw7/r;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v12

    .line 278
    invoke-static {v7}, Lr6/f;->a(F)D

    .line 279
    .line 280
    .line 281
    move-result-wide v1

    .line 282
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    invoke-static {v9}, Lr6/f;->a(F)D

    .line 287
    .line 288
    .line 289
    move-result-wide v1

    .line 290
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 291
    .line 292
    .line 293
    move-result-object v14

    .line 294
    invoke-static {v8}, Lr6/f;->a(F)D

    .line 295
    .line 296
    .line 297
    move-result-wide v1

    .line 298
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 299
    .line 300
    .line 301
    move-result-object v15

    .line 302
    invoke-static {v3}, Lr6/f;->a(F)D

    .line 303
    .line 304
    .line 305
    move-result-wide v1

    .line 306
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 307
    .line 308
    .line 309
    move-result-object v16

    .line 310
    invoke-interface/range {v10 .. v16}, Lw7/r;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_6
    return v6
.end method
