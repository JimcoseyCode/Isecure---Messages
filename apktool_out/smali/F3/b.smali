.class public LF3/b;
.super Lcom/github/penfeizhou/animation/decode/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF3/b$b;
    }
.end annotation


# instance fields
.field private v:LG3/b;

.field private w:I

.field private final x:Landroid/graphics/Paint;

.field private final y:LF3/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/b;-><init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LF3/b;->x:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance p2, LF3/b$b;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, v0}, LF3/b$b;-><init>(LF3/b$a;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, LF3/b;->y:LF3/b$b;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF3/b;->W(Lcom/github/penfeizhou/animation/io/Reader;)LG3/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected bridge synthetic C()Lcom/github/penfeizhou/animation/io/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF3/b;->X()LG3/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected bridge synthetic K(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    check-cast p1, LG3/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF3/b;->Y(LG3/a;)Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected M()V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/b;->y:LF3/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, LF3/b$b;->c:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput-object v1, p0, LF3/b;->v:LG3/b;

    .line 7
    .line 8
    return-void
.end method

.method protected O(Lcom/github/penfeizhou/animation/decode/a;)V
    .locals 9

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 16
    .line 17
    div-int/2addr v0, v1

    .line 18
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 25
    .line 26
    div-int/2addr v1, v2

    .line 27
    invoke-virtual {p0, v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->I(II)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->n:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/graphics/Canvas;

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    new-instance v1, Landroid/graphics/Canvas;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->n:Ljava/util/Map;

    .line 47
    .line 48
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object v2, v1

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :goto_0
    instance-of v1, p1, LF3/c;

    .line 58
    .line 59
    if-eqz v1, :cond_7

    .line 60
    .line 61
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 69
    .line 70
    .line 71
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 72
    .line 73
    const/4 v3, 0x2

    .line 74
    const/4 v4, 0x0

    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 78
    .line 79
    invoke-virtual {v2, v4, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, LF3/b;->y:LF3/b$b;

    .line 87
    .line 88
    iget-object v1, v1, LF3/b$b;->b:Landroid/graphics/Rect;

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, LF3/b;->y:LF3/b$b;

    .line 94
    .line 95
    iget-byte v5, v1, LF3/b$b;->a:B

    .line 96
    .line 97
    const/4 v6, 0x1

    .line 98
    if-eq v5, v6, :cond_4

    .line 99
    .line 100
    if-eq v5, v3, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget-object v1, v1, LF3/b$b;->c:Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, LF3/b;->y:LF3/b$b;

    .line 109
    .line 110
    iget-object v1, v1, LF3/b$b;->c:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 117
    .line 118
    invoke-virtual {v2, v4, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 122
    .line 123
    .line 124
    :goto_2
    move-object v1, p1

    .line 125
    check-cast v1, LF3/c;

    .line 126
    .line 127
    iget-byte v1, v1, LF3/c;->b:B

    .line 128
    .line 129
    if-ne v1, v3, :cond_5

    .line 130
    .line 131
    iget-object v1, p0, LF3/b;->y:LF3/b$b;

    .line 132
    .line 133
    iget-byte v5, v1, LF3/b$b;->a:B

    .line 134
    .line 135
    if-eq v5, v3, :cond_5

    .line 136
    .line 137
    iget-object v1, v1, LF3/b$b;->c:Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 140
    .line 141
    .line 142
    iget-object v1, p0, LF3/b;->y:LF3/b$b;

    .line 143
    .line 144
    iget-object v1, v1, LF3/b$b;->c:Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    .line 147
    .line 148
    .line 149
    :cond_5
    iget-object v1, p0, LF3/b;->y:LF3/b$b;

    .line 150
    .line 151
    move-object v3, p1

    .line 152
    check-cast v3, LF3/c;

    .line 153
    .line 154
    iget-byte v3, v3, LF3/c;->b:B

    .line 155
    .line 156
    iput-byte v3, v1, LF3/b$b;->a:B

    .line 157
    .line 158
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 159
    .line 160
    .line 161
    move-object v1, p1

    .line 162
    check-cast v1, LF3/c;

    .line 163
    .line 164
    iget-byte v1, v1, LF3/c;->a:B

    .line 165
    .line 166
    if-nez v1, :cond_6

    .line 167
    .line 168
    iget v1, p1, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 169
    .line 170
    iget v3, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 171
    .line 172
    div-int v5, v1, v3

    .line 173
    .line 174
    iget v6, p1, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 175
    .line 176
    div-int v7, v6, v3

    .line 177
    .line 178
    iget v8, p1, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 179
    .line 180
    add-int/2addr v1, v8

    .line 181
    div-int/2addr v1, v3

    .line 182
    iget v8, p1, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 183
    .line 184
    add-int/2addr v6, v8

    .line 185
    div-int/2addr v6, v3

    .line 186
    invoke-virtual {v2, v5, v7, v1, v6}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 187
    .line 188
    .line 189
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 190
    .line 191
    invoke-virtual {v2, v4, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 192
    .line 193
    .line 194
    :cond_6
    iget-object v1, p0, LF3/b;->y:LF3/b$b;

    .line 195
    .line 196
    iget-object v1, v1, LF3/b$b;->b:Landroid/graphics/Rect;

    .line 197
    .line 198
    iget v3, p1, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 199
    .line 200
    iget v4, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 201
    .line 202
    div-int v5, v3, v4

    .line 203
    .line 204
    iget v6, p1, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 205
    .line 206
    div-int v7, v6, v4

    .line 207
    .line 208
    iget v8, p1, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 209
    .line 210
    add-int/2addr v3, v8

    .line 211
    div-int/2addr v3, v4

    .line 212
    iget v8, p1, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 213
    .line 214
    add-int/2addr v6, v8

    .line 215
    div-int/2addr v6, v4

    .line 216
    invoke-virtual {v1, v5, v7, v3, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 220
    .line 221
    .line 222
    :cond_7
    iget v1, p1, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 223
    .line 224
    iget v3, p1, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 225
    .line 226
    invoke-virtual {p0, v1, v3}, Lcom/github/penfeizhou/animation/decode/b;->I(II)Landroid/graphics/Bitmap;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    iget-object v3, p0, LF3/b;->x:Landroid/graphics/Paint;

    .line 231
    .line 232
    iget v4, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 233
    .line 234
    invoke-virtual {p0}, LF3/b;->X()LG3/b;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    move-object v1, p1

    .line 239
    invoke-virtual/range {v1 .. v6}, Lcom/github/penfeizhou/animation/decode/a;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Lcom/github/penfeizhou/animation/io/e;)Landroid/graphics/Bitmap;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {p0, p1}, Lcom/github/penfeizhou/animation/decode/b;->L(Landroid/graphics/Bitmap;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, v5}, Lcom/github/penfeizhou/animation/decode/b;->L(Landroid/graphics/Bitmap;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 252
    .line 253
    .line 254
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 255
    .line 256
    invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/b;->L(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 264
    .line 265
    .line 266
    :cond_8
    :goto_4
    return-void
.end method

.method protected W(Lcom/github/penfeizhou/animation/io/Reader;)LG3/a;
    .locals 1

    .line 1
    new-instance v0, LG3/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LG3/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected X()LG3/b;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/b;->v:LG3/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LG3/b;

    .line 6
    .line 7
    invoke-direct {v0}, LG3/b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LF3/b;->v:LG3/b;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LF3/b;->v:LG3/b;

    .line 13
    .line 14
    return-object v0
.end method

.method protected Y(LG3/a;)Landroid/graphics/Rect;
    .locals 12

    .line 1
    invoke-static {p1}, LF3/d;->b(LG3/a;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v3, v2, [B

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v2

    .line 19
    move v6, v5

    .line 20
    move v7, v6

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    const/4 v9, 0x1

    .line 26
    if-eqz v8, :cond_8

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    check-cast v8, LF3/e;

    .line 33
    .line 34
    instance-of v10, v8, LF3/i;

    .line 35
    .line 36
    if-eqz v10, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    instance-of v11, v8, LF3/a;

    .line 40
    .line 41
    if-eqz v11, :cond_2

    .line 42
    .line 43
    check-cast v8, LF3/a;

    .line 44
    .line 45
    iget v5, v8, LF3/a;->f:I

    .line 46
    .line 47
    iput v5, p0, LF3/b;->w:I

    .line 48
    .line 49
    move v5, v9

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    instance-of v11, v8, LF3/f;

    .line 52
    .line 53
    if-eqz v11, :cond_3

    .line 54
    .line 55
    new-instance v4, LF3/c;

    .line 56
    .line 57
    check-cast v8, LF3/f;

    .line 58
    .line 59
    invoke-direct {v4, p1, v8}, LF3/c;-><init>(LG3/a;LF3/f;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, v4, LF3/c;->e:Ljava/util/List;

    .line 63
    .line 64
    iput-object v3, v4, LF3/c;->c:[B

    .line 65
    .line 66
    iget-object v8, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    instance-of v11, v8, LF3/g;

    .line 73
    .line 74
    if-eqz v11, :cond_4

    .line 75
    .line 76
    if-eqz v4, :cond_0

    .line 77
    .line 78
    iget-object v9, v4, LF3/c;->d:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    instance-of v11, v8, LF3/h;

    .line 85
    .line 86
    if-eqz v11, :cond_6

    .line 87
    .line 88
    if-nez v5, :cond_5

    .line 89
    .line 90
    new-instance v0, LF3/k;

    .line 91
    .line 92
    invoke-direct {v0, p1}, LF3/k;-><init>(LG3/a;)V

    .line 93
    .line 94
    .line 95
    iput v6, v0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 96
    .line 97
    iput v7, v0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 98
    .line 99
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iput v9, p0, LF3/b;->w:I

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    if-eqz v4, :cond_0

    .line 108
    .line 109
    iget-object v9, v4, LF3/c;->d:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    instance-of v9, v8, LF3/j;

    .line 116
    .line 117
    if-eqz v9, :cond_7

    .line 118
    .line 119
    check-cast v8, LF3/j;

    .line 120
    .line 121
    iget v6, v8, LF3/j;->e:I

    .line 122
    .line 123
    iget v7, v8, LF3/j;->f:I

    .line 124
    .line 125
    iget-object v3, v8, LF3/j;->g:[B

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_7
    if-nez v10, :cond_0

    .line 129
    .line 130
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_8
    :goto_1
    mul-int p1, v6, v7

    .line 135
    .line 136
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 137
    .line 138
    mul-int/2addr v0, v0

    .line 139
    div-int v0, p1, v0

    .line 140
    .line 141
    add-int/2addr v0, v9

    .line 142
    mul-int/lit8 v0, v0, 0x4

    .line 143
    .line 144
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    iget-object v0, p0, LF3/b;->y:LF3/b$b;

    .line 151
    .line 152
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 153
    .line 154
    mul-int/2addr v1, v1

    .line 155
    div-int/2addr p1, v1

    .line 156
    add-int/2addr p1, v9

    .line 157
    mul-int/lit8 p1, p1, 0x4

    .line 158
    .line 159
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iput-object p1, v0, LF3/b$b;->c:Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    new-instance p1, Landroid/graphics/Rect;

    .line 166
    .line 167
    invoke-direct {p1, v2, v2, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 168
    .line 169
    .line 170
    return-object p1
.end method

.method protected x()I
    .locals 1

    .line 1
    iget v0, p0, LF3/b;->w:I

    .line 2
    .line 3
    return v0
.end method
