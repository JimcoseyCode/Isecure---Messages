.class public LM3/g;
.super Lcom/github/penfeizhou/animation/decode/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM3/g$b;
    }
.end annotation


# instance fields
.field private v:LN3/a;

.field private final w:Landroid/graphics/Paint;

.field private x:I

.field private final y:LM3/g$b;

.field private z:I


# direct methods
.method public constructor <init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/b;-><init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LN3/a;

    .line 5
    .line 6
    invoke-direct {p1}, LN3/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LM3/g;->v:LN3/a;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LM3/g;->w:Landroid/graphics/Paint;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    iput p2, p0, LM3/g;->x:I

    .line 20
    .line 21
    new-instance p2, LM3/g$b;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p2, v0}, LM3/g$b;-><init>(LM3/g$a;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, LM3/g;->y:LM3/g$b;

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    iput p2, p0, LM3/g;->z:I

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM3/g;->W(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/gif/io/GifReader;

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
    invoke-virtual {p0}, LM3/g;->X()LN3/a;

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
    check-cast p1, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LM3/g;->Y(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Landroid/graphics/Rect;

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
    iget-object v0, p0, LM3/g;->y:LM3/g$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, LM3/g$b;->a:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput-object v1, p0, LM3/g;->v:LN3/a;

    .line 7
    .line 8
    return-void
.end method

.method protected O(Lcom/github/penfeizhou/animation/decode/a;)V
    .locals 11

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 11
    .line 12
    div-int/2addr v1, v2

    .line 13
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v3, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 20
    .line 21
    div-int/2addr v2, v3

    .line 22
    invoke-virtual {p0, v1, v2}, Lcom/github/penfeizhou/animation/decode/b;->I(II)Landroid/graphics/Bitmap;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b;->n:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/graphics/Canvas;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    new-instance v1, Landroid/graphics/Canvas;

    .line 37
    .line 38
    invoke-direct {v1, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->n:Ljava/util/Map;

    .line 42
    .line 43
    invoke-interface {v2, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    invoke-virtual {v6, v2}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->transparencyFlag()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    iget v2, p0, LM3/g;->x:I

    .line 63
    .line 64
    :goto_0
    move v7, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    goto :goto_0

    .line 68
    :goto_1
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 69
    .line 70
    if-nez v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 78
    .line 79
    add-int/lit8 v2, v2, -0x1

    .line 80
    .line 81
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 88
    .line 89
    .line 90
    iget v3, v2, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 91
    .line 92
    iget v4, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 93
    .line 94
    div-int v5, v3, v4

    .line 95
    .line 96
    iget v8, v2, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 97
    .line 98
    div-int v9, v8, v4

    .line 99
    .line 100
    iget v10, v2, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 101
    .line 102
    add-int/2addr v3, v10

    .line 103
    div-int/2addr v3, v4

    .line 104
    iget v10, v2, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 105
    .line 106
    add-int/2addr v8, v10

    .line 107
    div-int/2addr v8, v4

    .line 108
    invoke-virtual {v1, v5, v9, v3, v8}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 109
    .line 110
    .line 111
    iget v3, v2, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 112
    .line 113
    const/4 v4, 0x2

    .line 114
    const/4 v5, 0x3

    .line 115
    if-eq v3, v4, :cond_4

    .line 116
    .line 117
    if-eq v3, v5, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    iget-object v3, p0, LM3/g;->y:LM3/g$b;

    .line 121
    .line 122
    iget-object v3, v3, LM3/g$b;->a:Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 125
    .line 126
    .line 127
    iget v3, p0, LM3/g;->x:I

    .line 128
    .line 129
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 130
    .line 131
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 132
    .line 133
    .line 134
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 135
    .line 136
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    iget v4, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 141
    .line 142
    div-int/2addr v3, v4

    .line 143
    iget-object v4, p0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 144
    .line 145
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    iget v8, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 150
    .line 151
    div-int/2addr v4, v8

    .line 152
    invoke-virtual {p0, v3, v4}, Lcom/github/penfeizhou/animation/decode/b;->I(II)Landroid/graphics/Bitmap;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    iget-object v4, p0, LM3/g;->y:LM3/g$b;

    .line 157
    .line 158
    iget-object v4, v4, LM3/g$b;->a:Ljava/nio/ByteBuffer;

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, p0, LM3/g;->w:Landroid/graphics/Paint;

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    invoke-virtual {v1, v3, v8, v8, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v3}, Lcom/github/penfeizhou/animation/decode/b;->L(Landroid/graphics/Bitmap;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    iget v3, p0, LM3/g;->x:I

    .line 174
    .line 175
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 176
    .line 177
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 178
    .line 179
    .line 180
    :goto_2
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 181
    .line 182
    .line 183
    iget v3, v0, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 184
    .line 185
    if-ne v3, v5, :cond_5

    .line 186
    .line 187
    iget v2, v2, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->disposalMethod:I

    .line 188
    .line 189
    if-eq v2, v5, :cond_5

    .line 190
    .line 191
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 194
    .line 195
    .line 196
    iget-object v2, p0, LM3/g;->y:LM3/g$b;

    .line 197
    .line 198
    iget-object v2, v2, LM3/g$b;->a:Ljava/nio/ByteBuffer;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 201
    .line 202
    .line 203
    iget-object v2, p0, LM3/g;->y:LM3/g$b;

    .line 204
    .line 205
    iget-object v2, v2, LM3/g$b;->a:Ljava/nio/ByteBuffer;

    .line 206
    .line 207
    iget-object v3, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 208
    .line 209
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    .line 212
    :cond_5
    :goto_3
    iget v2, p1, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 213
    .line 214
    iget v3, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 215
    .line 216
    div-int/2addr v2, v3

    .line 217
    iget p1, p1, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 218
    .line 219
    div-int/2addr p1, v3

    .line 220
    invoke-virtual {p0, v2, p1}, Lcom/github/penfeizhou/animation/decode/b;->I(II)Landroid/graphics/Bitmap;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    iget-object v2, p0, LM3/g;->w:Landroid/graphics/Paint;

    .line 225
    .line 226
    iget v3, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 227
    .line 228
    invoke-virtual {p0}, LM3/g;->X()LN3/a;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual/range {v0 .. v5}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;LN3/a;)Landroid/graphics/Bitmap;

    .line 233
    .line 234
    .line 235
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 236
    .line 237
    invoke-virtual {v1, v7, p1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v4}, Lcom/github/penfeizhou/animation/decode/b;->L(Landroid/graphics/Bitmap;)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 246
    .line 247
    .line 248
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 249
    .line 250
    invoke-virtual {v6, p1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v6}, Lcom/github/penfeizhou/animation/decode/b;->L(Landroid/graphics/Bitmap;)V

    .line 254
    .line 255
    .line 256
    return-void
.end method

.method protected W(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/gif/io/GifReader;
    .locals 1

    .line 1
    new-instance v0, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected X()LN3/a;
    .locals 1

    .line 1
    iget-object v0, p0, LM3/g;->v:LN3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LN3/a;

    .line 6
    .line 7
    invoke-direct {v0}, LN3/a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LM3/g;->v:LN3/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LM3/g;->v:LN3/a;

    .line 13
    .line 14
    return-object v0
.end method

.method protected Y(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Landroid/graphics/Rect;
    .locals 13

    .line 1
    invoke-static {p1}, LM3/h;->c(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, -0x1

    .line 12
    move v4, v1

    .line 13
    move v5, v4

    .line 14
    move-object v6, v2

    .line 15
    move-object v7, v6

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    if-eqz v8, :cond_6

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    check-cast v8, LM3/b;

    .line 27
    .line 28
    instance-of v9, v8, LM3/k;

    .line 29
    .line 30
    if-eqz v9, :cond_1

    .line 31
    .line 32
    check-cast v8, LM3/k;

    .line 33
    .line 34
    iget v4, v8, LM3/k;->a:I

    .line 35
    .line 36
    iget v5, v8, LM3/k;->b:I

    .line 37
    .line 38
    invoke-virtual {v8}, LM3/k;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_0

    .line 43
    .line 44
    iget-byte v3, v8, LM3/k;->d:B

    .line 45
    .line 46
    and-int/lit16 v3, v3, 0xff

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    instance-of v9, v8, LM3/c;

    .line 50
    .line 51
    if-eqz v9, :cond_2

    .line 52
    .line 53
    move-object v6, v8

    .line 54
    check-cast v6, LM3/c;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    instance-of v9, v8, LM3/i;

    .line 58
    .line 59
    if-eqz v9, :cond_3

    .line 60
    .line 61
    move-object v7, v8

    .line 62
    check-cast v7, LM3/i;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    instance-of v9, v8, LM3/j;

    .line 66
    .line 67
    if-eqz v9, :cond_4

    .line 68
    .line 69
    new-instance v9, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;

    .line 70
    .line 71
    check-cast v8, LM3/j;

    .line 72
    .line 73
    invoke-direct {v9, p1, v6, v7, v8}, Lcom/github/penfeizhou/animation/gif/decode/GifFrame;-><init>(Lcom/github/penfeizhou/animation/gif/io/GifReader;LM3/c;LM3/i;LM3/j;)V

    .line 74
    .line 75
    .line 76
    iget-object v8, p0, Lcom/github/penfeizhou/animation/decode/b;->d:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    instance-of v9, v8, LM3/a;

    .line 83
    .line 84
    if-eqz v9, :cond_0

    .line 85
    .line 86
    check-cast v8, LM3/a;

    .line 87
    .line 88
    iget-object v9, v8, LM3/a;->b:Ljava/lang/String;

    .line 89
    .line 90
    const-string v10, "NETSCAPE2.0"

    .line 91
    .line 92
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_0

    .line 97
    .line 98
    iget v8, v8, LM3/a;->a:I

    .line 99
    .line 100
    if-nez v8, :cond_5

    .line 101
    .line 102
    iput v1, p0, LM3/g;->z:I

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    if-lez v8, :cond_0

    .line 106
    .line 107
    add-int/lit8 v8, v8, 0x1

    .line 108
    .line 109
    iput v8, p0, LM3/g;->z:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_6
    int-to-long v7, v4

    .line 113
    int-to-long v9, v5

    .line 114
    mul-long/2addr v7, v9

    .line 115
    iget p1, p0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 116
    .line 117
    int-to-long v9, p1

    .line 118
    int-to-long v11, p1

    .line 119
    mul-long/2addr v9, v11

    .line 120
    div-long/2addr v7, v9

    .line 121
    const-wide/16 v9, 0x1

    .line 122
    .line 123
    add-long/2addr v7, v9

    .line 124
    const-wide/16 v9, 0x4

    .line 125
    .line 126
    mul-long/2addr v7, v9

    .line 127
    long-to-int p1, v7

    .line 128
    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    iget-object v0, p0, LM3/g;->y:LM3/g$b;

    .line 135
    .line 136
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, v0, LM3/g$b;->a:Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    .line 142
    if-eqz v6, :cond_7

    .line 143
    .line 144
    if-ltz v3, :cond_7

    .line 145
    .line 146
    invoke-virtual {v6}, LM3/c;->b()[I

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    array-length p1, p1

    .line 151
    if-ge v3, p1, :cond_7

    .line 152
    .line 153
    invoke-virtual {v6}, LM3/c;->b()[I

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    aget p1, p1, v3

    .line 158
    .line 159
    and-int/lit16 v0, p1, 0xff

    .line 160
    .line 161
    shr-int/lit8 v2, p1, 0x8

    .line 162
    .line 163
    and-int/lit16 v2, v2, 0xff

    .line 164
    .line 165
    shr-int/lit8 p1, p1, 0x10

    .line 166
    .line 167
    and-int/lit16 p1, p1, 0xff

    .line 168
    .line 169
    invoke-static {v0, v2, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    iput p1, p0, LM3/g;->x:I

    .line 174
    .line 175
    :cond_7
    new-instance p1, Landroid/graphics/Rect;

    .line 176
    .line 177
    invoke-direct {p1, v1, v1, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 178
    .line 179
    .line 180
    return-object p1

    .line 181
    :catch_0
    move-exception p1

    .line 182
    long-to-double v0, v7

    .line 183
    const-wide/high16 v3, 0x4130000000000000L    # 1048576.0

    .line 184
    .line 185
    div-double/2addr v0, v3

    .line 186
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v1, "OutOfMemoryError in GifDecoder: Buffer needed: %.2fMB (%,d bytes)"

    .line 199
    .line 200
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    iput-object v2, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 204
    .line 205
    iget-object v0, p0, LM3/g;->y:LM3/g$b;

    .line 206
    .line 207
    iput-object v2, v0, LM3/g$b;->a:Ljava/nio/ByteBuffer;

    .line 208
    .line 209
    throw p1
.end method

.method protected t(II)I
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method protected x()I
    .locals 1

    .line 1
    iget v0, p0, LM3/g;->z:I

    .line 2
    .line 3
    return v0
.end method
