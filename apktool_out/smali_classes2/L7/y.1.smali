.class public abstract LL7/y;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method static synthetic a(Lk8/b;)I
    .locals 0

    .line 1
    invoke-static {p0}, LL7/y;->e(Lk8/b;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final b(LL7/H;Lk8/b;)LL7/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, LL7/y;->c(LL7/H;Lk8/b;)LL7/h;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p1, p0, LL7/e;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, LL7/e;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static final c(LL7/H;Lk8/b;)LL7/h;
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lo8/s;->a(LL7/H;)LL7/H;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "first(...)"

    .line 17
    .line 18
    const-string v3, "pathSegments(...)"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v0, :cond_5

    .line 22
    .line 23
    invoke-virtual {p1}, Lk8/b;->f()Lk8/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p0, v0}, LL7/H;->e0(Lk8/c;)LL7/V;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1}, Lk8/b;->g()Lk8/c;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lk8/c;->f()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0}, LL7/V;->o()Lv8/k;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p1}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast v0, Lk8/f;

    .line 54
    .line 55
    sget-object v2, LT7/d;->x:LT7/d;

    .line 56
    .line 57
    invoke-interface {p0, v0, v2}, Lv8/n;->f(Lk8/f;LT7/b;)LL7/h;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-nez p0, :cond_0

    .line 62
    .line 63
    return-object v4

    .line 64
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lk8/f;

    .line 87
    .line 88
    instance-of v1, p0, LL7/e;

    .line 89
    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    return-object v4

    .line 93
    :cond_1
    check-cast p0, LL7/e;

    .line 94
    .line 95
    invoke-interface {p0}, LL7/e;->v0()Lv8/k;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object v1, LT7/d;->x:LT7/d;

    .line 103
    .line 104
    invoke-interface {p0, v0, v1}, Lv8/n;->f(Lk8/f;LT7/b;)LL7/h;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    instance-of v0, p0, LL7/e;

    .line 109
    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    check-cast p0, LL7/e;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    move-object p0, v4

    .line 116
    :goto_1
    if-eqz p0, :cond_3

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-object v4

    .line 120
    :cond_4
    return-object p0

    .line 121
    :cond_5
    invoke-virtual {p1}, Lk8/b;->f()Lk8/c;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-interface {v0, v5}, LL7/H;->e0(Lk8/c;)LL7/V;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p1}, Lk8/b;->g()Lk8/c;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v5}, Lk8/c;->f()Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {v5, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, LL7/V;->o()Lv8/k;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v5}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-static {v6, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    check-cast v6, Lk8/f;

    .line 152
    .line 153
    sget-object v7, LT7/d;->x:LT7/d;

    .line 154
    .line 155
    invoke-interface {v0, v6, v7}, Lv8/n;->f(Lk8/f;LT7/b;)LL7/h;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-nez v0, :cond_7

    .line 160
    .line 161
    :cond_6
    :goto_2
    move-object v0, v4

    .line 162
    goto :goto_5

    .line 163
    :cond_7
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    invoke-interface {v5, v1, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_a

    .line 180
    .line 181
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    check-cast v6, Lk8/f;

    .line 186
    .line 187
    instance-of v7, v0, LL7/e;

    .line 188
    .line 189
    if-nez v7, :cond_8

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_8
    check-cast v0, LL7/e;

    .line 193
    .line 194
    invoke-interface {v0}, LL7/e;->v0()Lv8/k;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v7, LT7/d;->x:LT7/d;

    .line 202
    .line 203
    invoke-interface {v0, v6, v7}, Lv8/n;->f(Lk8/f;LT7/b;)LL7/h;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    instance-of v6, v0, LL7/e;

    .line 208
    .line 209
    if-eqz v6, :cond_9

    .line 210
    .line 211
    check-cast v0, LL7/e;

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_9
    move-object v0, v4

    .line 215
    :goto_4
    if-eqz v0, :cond_6

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_a
    :goto_5
    if-nez v0, :cond_10

    .line 219
    .line 220
    invoke-virtual {p1}, Lk8/b;->f()Lk8/c;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-interface {p0, v0}, LL7/H;->e0(Lk8/c;)LL7/V;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p1}, Lk8/b;->g()Lk8/c;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1}, Lk8/c;->f()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-interface {p0}, LL7/V;->o()Lv8/k;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-static {p1}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    check-cast v0, Lk8/f;

    .line 251
    .line 252
    sget-object v2, LT7/d;->x:LT7/d;

    .line 253
    .line 254
    invoke-interface {p0, v0, v2}, Lv8/n;->f(Lk8/f;LT7/b;)LL7/h;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    if-nez p0, :cond_b

    .line 259
    .line 260
    return-object v4

    .line 261
    :cond_b
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_f

    .line 278
    .line 279
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, Lk8/f;

    .line 284
    .line 285
    instance-of v1, p0, LL7/e;

    .line 286
    .line 287
    if-nez v1, :cond_c

    .line 288
    .line 289
    return-object v4

    .line 290
    :cond_c
    check-cast p0, LL7/e;

    .line 291
    .line 292
    invoke-interface {p0}, LL7/e;->v0()Lv8/k;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    sget-object v1, LT7/d;->x:LT7/d;

    .line 300
    .line 301
    invoke-interface {p0, v0, v1}, Lv8/n;->f(Lk8/f;LT7/b;)LL7/h;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    instance-of v0, p0, LL7/e;

    .line 306
    .line 307
    if-eqz v0, :cond_d

    .line 308
    .line 309
    check-cast p0, LL7/e;

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_d
    move-object p0, v4

    .line 313
    :goto_7
    if-eqz p0, :cond_e

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_e
    return-object v4

    .line 317
    :cond_f
    return-object p0

    .line 318
    :cond_10
    return-object v0
.end method

.method public static final d(LL7/H;Lk8/b;LL7/M;)LL7/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notFoundClasses"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, LL7/y;->b(LL7/H;Lk8/b;)LL7/e;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, LL7/y$a;->g:LL7/y$a;

    .line 24
    .line 25
    invoke-static {p1, p0}, LO8/l;->n(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, LL7/x;->g:LL7/x;

    .line 30
    .line 31
    invoke-static {p0, v0}, LO8/l;->J(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, LO8/l;->S(LO8/i;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p2, p1, p0}, LL7/M;->d(Lk8/b;Ljava/util/List;)LL7/e;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method private static final e(Lk8/b;)I
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static final f(LL7/H;Lk8/b;)LL7/l0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, LL7/y;->c(LL7/H;Lk8/b;)LL7/h;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p1, p0, LL7/l0;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, LL7/l0;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method
