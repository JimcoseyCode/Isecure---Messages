.class final Lcom/canhub/cropper/a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/canhub/cropper/a;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:I

.field private synthetic h:Ljava/lang/Object;

.field final synthetic i:Lcom/canhub/cropper/a;


# direct methods
.method constructor <init>(Lcom/canhub/cropper/a;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 2

    .line 1
    new-instance v0, Lcom/canhub/cropper/a$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/canhub/cropper/a$c;-><init>(Lcom/canhub/cropper/a;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/canhub/cropper/a$c;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/a$c;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/a$c;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/a$c;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, v1, Lcom/canhub/cropper/a$c;->g:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v4, :cond_1

    .line 15
    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_2
    invoke-static/range {p1 .. p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->h:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v6, v0

    .line 45
    check-cast v6, LR8/N;

    .line 46
    .line 47
    :try_start_1
    invoke-static {v6}, LR8/O;->e(LR8/N;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/canhub/cropper/a;->t(Lcom/canhub/cropper/a;)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    sget-object v7, Lcom/canhub/cropper/d;->a:Lcom/canhub/cropper/d;

    .line 62
    .line 63
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 64
    .line 65
    invoke-static {v0}, Lcom/canhub/cropper/a;->d(Lcom/canhub/cropper/a;)Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 70
    .line 71
    invoke-static {v0}, Lcom/canhub/cropper/a;->t(Lcom/canhub/cropper/a;)Landroid/net/Uri;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 76
    .line 77
    invoke-static {v0}, Lcom/canhub/cropper/a;->f(Lcom/canhub/cropper/a;)[F

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/canhub/cropper/a;->h(Lcom/canhub/cropper/a;)I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 88
    .line 89
    invoke-static {v0}, Lcom/canhub/cropper/a;->o(Lcom/canhub/cropper/a;)I

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/canhub/cropper/a;->n(Lcom/canhub/cropper/a;)I

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 100
    .line 101
    invoke-static {v0}, Lcom/canhub/cropper/a;->j(Lcom/canhub/cropper/a;)Z

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 106
    .line 107
    invoke-static {v0}, Lcom/canhub/cropper/a;->a(Lcom/canhub/cropper/a;)I

    .line 108
    .line 109
    .line 110
    move-result v15

    .line 111
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 112
    .line 113
    invoke-static {v0}, Lcom/canhub/cropper/a;->b(Lcom/canhub/cropper/a;)I

    .line 114
    .line 115
    .line 116
    move-result v16

    .line 117
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 118
    .line 119
    invoke-static {v0}, Lcom/canhub/cropper/a;->q(Lcom/canhub/cropper/a;)I

    .line 120
    .line 121
    .line 122
    move-result v17

    .line 123
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 124
    .line 125
    invoke-static {v0}, Lcom/canhub/cropper/a;->p(Lcom/canhub/cropper/a;)I

    .line 126
    .line 127
    .line 128
    move-result v18

    .line 129
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 130
    .line 131
    invoke-static {v0}, Lcom/canhub/cropper/a;->k(Lcom/canhub/cropper/a;)Z

    .line 132
    .line 133
    .line 134
    move-result v19

    .line 135
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 136
    .line 137
    invoke-static {v0}, Lcom/canhub/cropper/a;->l(Lcom/canhub/cropper/a;)Z

    .line 138
    .line 139
    .line 140
    move-result v20

    .line 141
    invoke-virtual/range {v7 .. v20}, Lcom/canhub/cropper/d;->d(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/d$a;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto :goto_0

    .line 146
    :cond_3
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 147
    .line 148
    invoke-static {v0}, Lcom/canhub/cropper/a;->c(Lcom/canhub/cropper/a;)Landroid/graphics/Bitmap;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_4

    .line 153
    .line 154
    sget-object v7, Lcom/canhub/cropper/d;->a:Lcom/canhub/cropper/d;

    .line 155
    .line 156
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 157
    .line 158
    invoke-static {v0}, Lcom/canhub/cropper/a;->c(Lcom/canhub/cropper/a;)Landroid/graphics/Bitmap;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 163
    .line 164
    invoke-static {v0}, Lcom/canhub/cropper/a;->f(Lcom/canhub/cropper/a;)[F

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 169
    .line 170
    invoke-static {v0}, Lcom/canhub/cropper/a;->h(Lcom/canhub/cropper/a;)I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 175
    .line 176
    invoke-static {v0}, Lcom/canhub/cropper/a;->j(Lcom/canhub/cropper/a;)Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 181
    .line 182
    invoke-static {v0}, Lcom/canhub/cropper/a;->a(Lcom/canhub/cropper/a;)I

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 187
    .line 188
    invoke-static {v0}, Lcom/canhub/cropper/a;->b(Lcom/canhub/cropper/a;)I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 193
    .line 194
    invoke-static {v0}, Lcom/canhub/cropper/a;->k(Lcom/canhub/cropper/a;)Z

    .line 195
    .line 196
    .line 197
    move-result v14

    .line 198
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 199
    .line 200
    invoke-static {v0}, Lcom/canhub/cropper/a;->l(Lcom/canhub/cropper/a;)Z

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    invoke-virtual/range {v7 .. v15}, Lcom/canhub/cropper/d;->g(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/d$a;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :goto_0
    sget-object v7, Lcom/canhub/cropper/d;->a:Lcom/canhub/cropper/d;

    .line 209
    .line 210
    invoke-virtual {v0}, Lcom/canhub/cropper/d$a;->a()Landroid/graphics/Bitmap;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    iget-object v9, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 215
    .line 216
    invoke-static {v9}, Lcom/canhub/cropper/a;->q(Lcom/canhub/cropper/a;)I

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    iget-object v10, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 221
    .line 222
    invoke-static {v10}, Lcom/canhub/cropper/a;->p(Lcom/canhub/cropper/a;)I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    iget-object v11, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 227
    .line 228
    invoke-static {v11}, Lcom/canhub/cropper/a;->m(Lcom/canhub/cropper/a;)Lcom/canhub/cropper/CropImageView$k;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-virtual {v7, v8, v9, v10, v11}, Lcom/canhub/cropper/d;->G(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$k;)Landroid/graphics/Bitmap;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    new-instance v9, Lcom/canhub/cropper/a$c$a;

    .line 241
    .line 242
    iget-object v10, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 243
    .line 244
    invoke-direct {v9, v10, v7, v0, v5}, Lcom/canhub/cropper/a$c$a;-><init>(Lcom/canhub/cropper/a;Landroid/graphics/Bitmap;Lcom/canhub/cropper/d$a;Ln7/f;)V

    .line 245
    .line 246
    .line 247
    const/4 v10, 0x2

    .line 248
    const/4 v11, 0x0

    .line 249
    move-object v7, v8

    .line 250
    const/4 v8, 0x0

    .line 251
    invoke-static/range {v6 .. v11}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_4
    iget-object v0, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 256
    .line 257
    new-instance v6, Lcom/canhub/cropper/a$a;

    .line 258
    .line 259
    invoke-direct {v6, v5, v5, v5, v4}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 260
    .line 261
    .line 262
    iput v4, v1, Lcom/canhub/cropper/a$c;->g:I

    .line 263
    .line 264
    invoke-static {v0, v6, v1}, Lcom/canhub/cropper/a;->u(Lcom/canhub/cropper/a;Lcom/canhub/cropper/a$a;Ln7/f;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-ne v0, v2, :cond_5

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_5
    :goto_1
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 272
    .line 273
    return-object v0

    .line 274
    :goto_2
    iget-object v6, v1, Lcom/canhub/cropper/a$c;->i:Lcom/canhub/cropper/a;

    .line 275
    .line 276
    new-instance v7, Lcom/canhub/cropper/a$a;

    .line 277
    .line 278
    invoke-direct {v7, v5, v5, v0, v4}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 279
    .line 280
    .line 281
    iput v3, v1, Lcom/canhub/cropper/a$c;->g:I

    .line 282
    .line 283
    invoke-static {v6, v7, v1}, Lcom/canhub/cropper/a;->u(Lcom/canhub/cropper/a;Lcom/canhub/cropper/a$a;Ln7/f;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-ne v0, v2, :cond_6

    .line 288
    .line 289
    :goto_3
    return-object v2

    .line 290
    :cond_6
    :goto_4
    sget-object v0, Li7/B;->a:Li7/B;

    .line 291
    .line 292
    return-object v0
.end method
