.class public final LY/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/r;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ly/D$b;

.field private c:Lm5/a;

.field private d:Lm5/a;

.field private final e:LY/h;

.field private f:Ly/C;

.field private g:Landroid/content/Context;

.field private final h:Ljava/util/Map;

.field private final i:Ljava/util/HashSet;

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LY/g;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {v0}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "immediateFuture(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LY/g;->d:Lm5/a;

    .line 22
    .line 23
    invoke-static {}, LY/h;->c()LY/h;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "getInstance(...)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LY/g;->e:LY/h;

    .line 33
    .line 34
    new-instance v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LY/g;->h:Ljava/util/Map;

    .line 40
    .line 41
    new-instance v0, Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, LY/g;->i:Ljava/util/HashSet;

    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    iput v0, p0, LY/g;->j:I

    .line 50
    .line 51
    return-void
.end method

.method private static final D(LY/g;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/g;->E()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LY/g;->e:LY/h;

    .line 5
    .line 6
    iget-object p0, p0, LY/g;->i:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, LY/h;->i(Ljava/util/Set;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic b(LY/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, LY/g;->D(LY/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ly/C;Ljava/lang/Void;)Lm5/a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/g;->w(Ly/C;Ljava/lang/Void;)Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lm5/a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/g;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(LY/g;Ly/s;Ly/q;)LF/E;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LY/g;->r(Ly/s;Ly/q;)LF/E;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(LY/g;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, LY/g;->h:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(LY/g;)I
    .locals 0

    .line 1
    invoke-direct {p0}, LY/g;->t()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic h(LY/g;)Ly/C;
    .locals 0

    .line 1
    iget-object p0, p0, LY/g;->f:Ly/C;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(LY/g;)Ljava/util/HashSet;
    .locals 0

    .line 1
    iget-object p0, p0, LY/g;->i:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(LY/g;)LY/h;
    .locals 0

    .line 1
    iget-object p0, p0, LY/g;->e:LY/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(LY/g;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LY/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(LY/g;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/g;->y(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic m(LY/g;Ly/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/g;->f:Ly/C;

    .line 2
    .line 3
    return-void
.end method

.method private final o(Landroidx/lifecycle/r;Ly/s;Ly/s;Ly/F;Ly/F;Ly/v0;)Ly/i;
    .locals 13

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    const-string v2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo"

    .line 4
    .line 5
    const-string v3, "CX:bindToLifecycle-internal"

    .line 6
    .line 7
    invoke-static {v3}, Ll1/a;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, LH/y;->b()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, LY/g;->h(LY/g;)Ly/C;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Ly/C;->h()LF/Z;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, LF/Z;->m()Ljava/util/LinkedHashSet;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p2, v3}, Ly/s;->g(Ljava/util/LinkedHashSet;)LF/M;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v3, "select(...)"

    .line 33
    .line 34
    invoke-static {v5, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-interface {v5, v3}, LF/M;->p(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p2}, LY/g;->s(Ly/s;)Ly/q;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v7, v0

    .line 49
    check-cast v7, LF/d;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-static {p0}, LY/g;->h(LY/g;)Ly/C;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ly/C;->h()LF/Z;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, LF/Z;->m()Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v1, v0}, Ly/s;->g(Ljava/util/LinkedHashSet;)LF/M;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-interface {v0, v4}, LF/M;->p(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, LY/g;->s(Ly/s;)Ly/q;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    check-cast v1, LF/d;

    .line 84
    .line 85
    move-object v6, v0

    .line 86
    move-object v8, v1

    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_0
    const/4 v0, 0x0

    .line 93
    move-object v6, v0

    .line 94
    move-object v8, v6

    .line 95
    :goto_0
    sget-object v0, Ly/p;->c:Ly/p$a;

    .line 96
    .line 97
    invoke-virtual {v0, v7, v8}, Ly/p$a;->e(LF/d;LF/d;)Ly/p;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {p0}, LY/g;->j(LY/g;)LY/h;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1, p1, v0}, LY/h;->d(Landroidx/lifecycle/r;Ly/p;)LY/c;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {p0}, LY/g;->j(LY/g;)LY/h;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, LY/h;->f()Ljava/util/Collection;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual/range {p6 .. p6}, Ly/v0;->k()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_4

    .line 130
    .line 131
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    check-cast v9, Ly/J0;

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    :cond_2
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_1

    .line 146
    .line 147
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    const-string v12, "next(...)"

    .line 152
    .line 153
    invoke-static {v11, v12}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    check-cast v11, LY/c;

    .line 157
    .line 158
    invoke-virtual {v11, v9}, LY/c;->w(Ly/J0;)Z

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    if-eqz v12, :cond_2

    .line 163
    .line 164
    invoke-virtual {v11}, LY/c;->u()Landroidx/lifecycle/r;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    invoke-static {v11, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-eqz v11, :cond_3

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 178
    .line 179
    const-string v0, "Use case %s already bound to a different lifecycle."

    .line 180
    .line 181
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v1, "format(...)"

    .line 194
    .line 195
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p1

    .line 202
    :cond_4
    if-nez v1, :cond_5

    .line 203
    .line 204
    invoke-static {p0}, LY/g;->j(LY/g;)LY/h;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {p0}, LY/g;->h(LY/g;)Ly/C;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Ly/C;->i()Ly/v;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    move-object/from16 v9, p4

    .line 220
    .line 221
    move-object/from16 v10, p5

    .line 222
    .line 223
    invoke-interface/range {v4 .. v10}, Ly/v;->a(LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;)LK/f;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v1, p1, v2}, LY/h;->b(Landroidx/lifecycle/r;LK/f;)LY/c;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    :cond_5
    invoke-virtual/range {p6 .. p6}, Ly/v0;->k()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_6

    .line 240
    .line 241
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_6
    invoke-static {p0}, LY/g;->j(LY/g;)LY/h;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-static {p0}, LY/g;->h(LY/g;)Ly/C;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3}, Ly/C;->g()LF/K;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-interface {v3}, LF/K;->f()Lz/a;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    move-object/from16 v4, p6

    .line 268
    .line 269
    invoke-virtual {v2, v1, v4, v3}, LY/h;->a(LY/c;Ly/v0;Lz/a;)V

    .line 270
    .line 271
    .line 272
    invoke-static {p0}, LY/g;->i(LY/g;)Ljava/util/HashSet;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {p1, v0}, LY/h$a;->a(Landroidx/lifecycle/r;Ly/p;)LY/h$a;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 281
    .line 282
    .line 283
    :goto_2
    invoke-static {}, Ll1/a;->f()V

    .line 284
    .line 285
    .line 286
    return-object v1

    .line 287
    :goto_3
    invoke-static {}, Ll1/a;->f()V

    .line 288
    .line 289
    .line 290
    throw p1
.end method

.method static synthetic p(LY/g;Landroidx/lifecycle/r;Ly/s;Ly/s;Ly/F;Ly/F;Ly/v0;ILjava/lang/Object;)Ly/i;
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x4

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    move-object v3, p3

    .line 7
    and-int/lit8 p3, p7, 0x8

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    sget-object p4, Ly/F;->d:Ly/F;

    .line 12
    .line 13
    :cond_1
    move-object v4, p4

    .line 14
    and-int/lit8 p3, p7, 0x10

    .line 15
    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    sget-object p5, Ly/F;->d:Ly/F;

    .line 19
    .line 20
    :cond_2
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move-object v5, p5

    .line 24
    move-object v6, p6

    .line 25
    invoke-direct/range {v0 .. v6}, LY/g;->o(Landroidx/lifecycle/r;Ly/s;Ly/s;Ly/F;Ly/F;Ly/v0;)Ly/i;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method private final r(Ly/s;Ly/q;)LF/E;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ly/s;->c()Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "iterator(...)"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "next(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast v1, Ly/o;

    .line 31
    .line 32
    invoke-interface {v1}, Ly/o;->a()LF/A0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v3, Ly/o;->a:LF/A0;

    .line 37
    .line 38
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Ly/o;->a()LF/A0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, LF/x0;->a(Ljava/lang/Object;)LF/G;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v2, p0, LY/g;->g:Landroid/content/Context;

    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, p2, v2}, LF/G;->b(Ly/q;Landroid/content/Context;)LF/E;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    if-nez v0, :cond_2

    .line 65
    .line 66
    move-object v0, v1

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const-string p2, "Cannot apply multiple extended camera configs at the same time."

    .line 71
    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_3
    if-nez v0, :cond_4

    .line 77
    .line 78
    invoke-static {}, LF/H;->a()LF/E;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :cond_4
    return-object v0
.end method

.method private final t()I
    .locals 1

    .line 1
    iget-object v0, p0, LY/g;->f:Ly/C;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ly/C;->g()LF/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, LF/K;->f()Lz/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lz/a;->c()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method private static final w(Ly/C;Ljava/lang/Void;)Lm5/a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly/C;->l()Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lm5/a;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lm5/a;

    .line 6
    .line 7
    return-object p0
.end method

.method private final y(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/g;->f:Ly/C;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ly/C;->g()LF/K;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, LF/K;->f()Lz/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1}, Lz/a;->h(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 0

    .line 1
    iput p1, p0, LY/g;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public final B(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/g;->g:Landroid/content/Context;

    .line 2
    .line 3
    return-void
.end method

.method public final C(Z)Lm5/a;
    .locals 3

    .line 1
    new-instance v0, LY/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LY/f;-><init>(LY/g;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LH/y;->f(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LY/g;->f:Ly/C;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly/C;->q()Lm5/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v1}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, LY/g;->a:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v2

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    :try_start_0
    iput-object v1, p0, LY/g;->b:Ly/D$b;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    iput-object v1, p0, LY/g;->c:Lm5/a;

    .line 40
    .line 41
    iput-object v0, p0, LY/g;->d:Lm5/a;

    .line 42
    .line 43
    iget-object p1, p0, LY/g;->h:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LY/g;->i:Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 51
    .line 52
    .line 53
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    monitor-exit v2

    .line 56
    iput-object v1, p0, LY/g;->f:Ly/C;

    .line 57
    .line 58
    iput-object v1, p0, LY/g;->g:Landroid/content/Context;

    .line 59
    .line 60
    return-object v0

    .line 61
    :goto_2
    monitor-exit v2

    .line 62
    throw p1
.end method

.method public E()V
    .locals 2

    .line 1
    const-string v0, "CX:unbindAll"

    .line 2
    .line 3
    invoke-static {v0}, Ll1/a;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, LH/y;->b()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p0, v0}, LY/g;->l(LY/g;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, LY/g;->j(LY/g;)LY/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p0}, LY/g;->i(LY/g;)Ljava/util/HashSet;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, LY/h;->m(Ljava/util/Set;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    invoke-static {}, Ll1/a;->f()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    invoke-static {}, Ll1/a;->f()V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LY/g;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public n(Landroidx/lifecycle/r;Ly/s;Ly/K0;)Ly/i;
    .locals 10

    .line 1
    const-string v0, "lifecycleOwner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraSelector"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "useCaseGroup"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "CX:bindToLifecycle-UseCaseGroup"

    .line 17
    .line 18
    invoke-static {v0}, Ll1/a;->c(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-static {p0}, LY/g;->g(LY/g;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x2

    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-static {p0, v0}, LY/g;->l(LY/g;I)V

    .line 30
    .line 31
    .line 32
    new-instance v7, Ly/g0;

    .line 33
    .line 34
    invoke-direct {v7, p3}, Ly/g0;-><init>(Ly/K0;)V

    .line 35
    .line 36
    .line 37
    const/16 v8, 0x1c

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v1, p0

    .line 44
    move-object v2, p1

    .line 45
    move-object v3, p2

    .line 46
    invoke-static/range {v1 .. v9}, LY/g;->p(LY/g;Landroidx/lifecycle/r;Ly/s;Ly/s;Ly/F;Ly/F;Ly/v0;ILjava/lang/Object;)Ly/i;

    .line 47
    .line 48
    .line 49
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-static {}, Ll1/a;->f()V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 58
    .line 59
    const-string p2, "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first."

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :goto_0
    invoke-static {}, Ll1/a;->f()V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public final q(Ly/D;)V
    .locals 3

    .line 1
    const-string v0, "cameraXConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CX:configureInstanceInternal"

    .line 7
    .line 8
    invoke-static {v0}, Ll1/a;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p0}, LY/g;->k(LY/g;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :try_start_1
    invoke-static {p1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LY/g;->u()Ly/D$b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    const-string v2, "CameraX has already been configured. To use a different configuration, shutdown() must be called."

    .line 29
    .line 30
    invoke-static {v1, v2}, LH0/g;->j(ZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, LY/g$a;

    .line 34
    .line 35
    invoke-direct {v1, p1}, LY/g$a;-><init>(Ly/D;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, LY/g;->z(Ly/D$b;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    invoke-static {}, Ll1/a;->f()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception p1

    .line 51
    :try_start_3
    monitor-exit v0

    .line 52
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 53
    :goto_1
    invoke-static {}, Ll1/a;->f()V

    .line 54
    .line 55
    .line 56
    throw p1
.end method

.method public s(Ly/s;)Ly/q;
    .locals 5

    .line 1
    const-string v0, "cameraSelector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CX:getCameraInfo"

    .line 7
    .line 8
    invoke-static {v0}, Ll1/a;->c(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p0}, LY/g;->h(LY/g;)Ly/C;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ly/C;->h()LF/Z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, LF/Z;->m()Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Ly/s;->g(Ljava/util/LinkedHashSet;)LF/M;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, LF/M;->r()LF/L;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "getCameraInfoInternal(...)"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1, v0}, LY/g;->e(LY/g;Ly/s;Ly/q;)LF/E;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, Ly/p;->c:Ly/p$a;

    .line 44
    .line 45
    invoke-interface {v0}, LF/L;->f()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, "getCameraId(...)"

    .line 50
    .line 51
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, LF/E;->T()LF/A0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {v1, v2, v4, v3}, Ly/p$a;->b(Ljava/lang/String;Ljava/lang/String;LF/A0;)Ly/p;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {p0}, LY/g;->k(LY/g;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 68
    :try_start_1
    invoke-static {p0}, LY/g;->f(LY/g;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    if-nez v3, :cond_0

    .line 77
    .line 78
    new-instance v3, LF/d;

    .line 79
    .line 80
    invoke-direct {v3, v0, p1}, LF/d;-><init>(LF/L;LF/E;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, LY/g;->f(LY/g;)Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    goto :goto_1

    .line 93
    :cond_0
    :goto_0
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    :try_start_2
    monitor-exit v2

    .line 96
    check-cast v3, LF/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    .line 98
    invoke-static {}, Ll1/a;->f()V

    .line 99
    .line 100
    .line 101
    return-object v3

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    goto :goto_2

    .line 104
    :goto_1
    :try_start_3
    monitor-exit v2

    .line 105
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 106
    :goto_2
    invoke-static {}, Ll1/a;->f()V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method public final u()Ly/D$b;
    .locals 1

    .line 1
    iget-object v0, p0, LY/g;->b:Ly/D$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v(Landroid/content/Context;Ly/D;)Lm5/a;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY/g;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, LY/g;->c:Lm5/a;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string p1, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>"

    .line 14
    .line 15
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz p2, :cond_1

    .line 23
    .line 24
    :try_start_1
    invoke-virtual {p0, p2}, LY/g;->q(Ly/D;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    new-instance p2, Ly/C;

    .line 28
    .line 29
    iget-object v1, p0, LY/g;->b:Ly/D$b;

    .line 30
    .line 31
    invoke-direct {p2, p1, v1}, Ly/C;-><init>(Landroid/content/Context;Ly/D$b;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ly/C;->j()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p0, v1}, LY/g;->A(I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, LY/g;->d:Lm5/a;

    .line 42
    .line 43
    invoke-static {v1}, LJ/d;->a(Lm5/a;)LJ/d;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, LY/d;

    .line 48
    .line 49
    invoke-direct {v2, p2}, LY/d;-><init>(Ly/C;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, LY/e;

    .line 53
    .line 54
    invoke-direct {v3, v2}, LY/e;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v3, v2}, LJ/d;->e(LJ/a;Ljava/util/concurrent/Executor;)LJ/d;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "transformAsync(...)"

    .line 66
    .line 67
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, LY/g;->c:Lm5/a;

    .line 71
    .line 72
    new-instance v2, LY/g$b;

    .line 73
    .line 74
    invoke-direct {v2, p0, p2, p1}, LY/g$b;-><init>(LY/g;Ly/C;Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {v1, v2, p1}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1}, LJ/n;->s(Lm5/a;)Lm5/a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string p2, "nonCancellationPropagating(...)"

    .line 89
    .line 90
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    monitor-exit v0

    .line 94
    return-object p1

    .line 95
    :goto_0
    monitor-exit v0

    .line 96
    throw p1
.end method

.method public final z(Ly/D$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/g;->b:Ly/D$b;

    .line 2
    .line 3
    return-void
.end method
