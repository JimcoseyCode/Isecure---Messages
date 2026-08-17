.class public final Ly8/K;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Ly8/p;

.field private final b:Ly8/g;


# direct methods
.method public constructor <init>(Ly8/p;)V
    .locals 2

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ly8/K;->a:Ly8/p;

    .line 10
    .line 11
    new-instance v0, Ly8/g;

    .line 12
    .line 13
    invoke-virtual {p1}, Ly8/p;->c()Ly8/n;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ly8/n;->q()LL7/H;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, Ly8/p;->c()Ly8/n;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ly8/n;->r()LL7/M;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v0, v1, p1}, Ly8/g;-><init>(LL7/H;LL7/M;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ly8/K;->b:Ly8/g;

    .line 33
    .line 34
    return-void
.end method

.method private final A(Lf8/q;Ly8/p;LL7/a;I)LL7/c0;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ly8/p;->i()Ly8/X;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2, p1}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, LM7/h;->a:LM7/h$a;

    .line 10
    .line 11
    invoke-virtual {p2}, LM7/h$a;->b()LM7/h;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p3, p1, v0, p2, p4}, Lo8/h;->b(LL7/a;LC8/S;Lk8/f;LM7/h;I)LL7/c0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final B(Ljava/util/List;Lm8/p;Ly8/d;)Ljava/util/List;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ly8/K;->a:Ly8/p;

    .line 4
    .line 5
    invoke-virtual {v0}, Ly8/p;->e()LL7/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v7, v0

    .line 15
    check-cast v7, LL7/a;

    .line 16
    .line 17
    invoke-interface {v7}, LL7/n;->b()LL7/m;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, "getContainingDeclaration(...)"

    .line 22
    .line 23
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0}, Ly8/K;->i(LL7/m;)Ly8/N;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v15, Ljava/util/ArrayList;

    .line 31
    .line 32
    const/16 v0, 0xa

    .line 33
    .line 34
    move-object/from16 v3, p1

    .line 35
    .line 36
    invoke-static {v3, v0}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v16

    .line 47
    const/16 v17, 0x0

    .line 48
    .line 49
    move/from16 v5, v17

    .line 50
    .line 51
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    add-int/lit8 v18, v5, 0x1

    .line 62
    .line 63
    if-gez v5, :cond_0

    .line 64
    .line 65
    invoke-static {}, Lj7/q;->t()V

    .line 66
    .line 67
    .line 68
    :cond_0
    move-object v6, v0

    .line 69
    check-cast v6, Lf8/u;

    .line 70
    .line 71
    invoke-virtual {v6}, Lf8/u;->P()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {v6}, Lf8/u;->J()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    move v8, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move/from16 v8, v17

    .line 84
    .line 85
    :goto_1
    if-eqz v2, :cond_2

    .line 86
    .line 87
    sget-object v0, Lh8/b;->c:Lh8/b$b;

    .line 88
    .line 89
    invoke-virtual {v0, v8}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    new-instance v9, LA8/T;

    .line 100
    .line 101
    iget-object v0, v1, Ly8/K;->a:Ly8/p;

    .line 102
    .line 103
    invoke-virtual {v0}, Ly8/p;->h()LB8/n;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    new-instance v0, Ly8/H;

    .line 108
    .line 109
    move-object/from16 v3, p2

    .line 110
    .line 111
    move-object/from16 v4, p3

    .line 112
    .line 113
    invoke-direct/range {v0 .. v6}, Ly8/H;-><init>(Ly8/K;Ly8/N;Lm8/p;Ly8/d;ILf8/u;)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v9, v10, v0}, LA8/T;-><init>(LB8/n;Lw7/a;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 121
    .line 122
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    :goto_2
    iget-object v0, v1, Ly8/K;->a:Ly8/p;

    .line 127
    .line 128
    invoke-virtual {v0}, Ly8/p;->g()Lh8/c;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v6}, Lf8/u;->K()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-static {v0, v3}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v3, v1, Ly8/K;->a:Ly8/p;

    .line 141
    .line 142
    invoke-virtual {v3}, Ly8/p;->i()Ly8/X;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iget-object v4, v1, Ly8/K;->a:Ly8/p;

    .line 147
    .line 148
    invoke-virtual {v4}, Ly8/p;->j()Lh8/g;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v6, v4}, Lh8/f;->q(Lf8/u;Lh8/g;)Lf8/q;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v3, v4}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    sget-object v4, Lh8/b;->H:Lh8/b$b;

    .line 161
    .line 162
    invoke-virtual {v4, v8}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    const-string v10, "get(...)"

    .line 167
    .line 168
    invoke-static {v4, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    sget-object v11, Lh8/b;->I:Lh8/b$b;

    .line 176
    .line 177
    invoke-virtual {v11, v8}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    invoke-static {v11, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v11

    .line 188
    sget-object v12, Lh8/b;->J:Lh8/b$b;

    .line 189
    .line 190
    invoke-virtual {v12, v8}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-static {v8, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    iget-object v8, v1, Ly8/K;->a:Ly8/p;

    .line 202
    .line 203
    invoke-virtual {v8}, Ly8/p;->j()Lh8/g;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-static {v6, v8}, Lh8/f;->t(Lf8/u;Lh8/g;)Lf8/q;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    if-eqz v6, :cond_3

    .line 212
    .line 213
    iget-object v8, v1, Ly8/K;->a:Ly8/p;

    .line 214
    .line 215
    invoke-virtual {v8}, Ly8/p;->i()Ly8/X;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    invoke-virtual {v8, v6}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    :goto_3
    move-object v13, v6

    .line 224
    goto :goto_4

    .line 225
    :cond_3
    const/4 v6, 0x0

    .line 226
    goto :goto_3

    .line 227
    :goto_4
    sget-object v14, LL7/h0;->a:LL7/h0;

    .line 228
    .line 229
    const-string v6, "NO_SOURCE"

    .line 230
    .line 231
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    move v10, v4

    .line 235
    move-object v4, v7

    .line 236
    move-object v7, v9

    .line 237
    move-object v9, v3

    .line 238
    new-instance v3, LO7/V;

    .line 239
    .line 240
    move v6, v5

    .line 241
    const/4 v5, 0x0

    .line 242
    move-object v8, v0

    .line 243
    invoke-direct/range {v3 .. v14}, LO7/V;-><init>(LL7/a;LL7/t0;ILM7/h;Lk8/f;LC8/S;ZZZLC8/S;LL7/h0;)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v15, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-object v7, v4

    .line 250
    move/from16 v5, v18

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_4
    invoke-static {v15}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    return-object v0
.end method

.method private static final C(Ly8/K;Ly8/N;Lm8/p;Ly8/d;ILf8/u;)Ljava/util/List;
    .locals 6

    .line 1
    iget-object p0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ly8/n;->d()Ly8/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move v4, p4

    .line 15
    move-object v5, p5

    .line 16
    invoke-interface/range {v0 .. v5}, Ly8/h;->h(Ly8/N;Lm8/p;Ly8/d;ILf8/u;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method static synthetic a(Ly8/K;Lf8/n;LA8/N;)LB8/j;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly8/K;->v(Ly8/K;Lf8/n;LA8/N;)LB8/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Ly8/K;Lf8/n;LA8/N;)LB8/j;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly8/K;->x(Ly8/K;Lf8/n;LA8/N;)LB8/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(Ly8/K;Lm8/p;Ly8/d;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly8/K;->k(Ly8/K;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(Ly8/K;ZLf8/n;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly8/K;->n(Ly8/K;ZLf8/n;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(Ly8/K;Lm8/p;Ly8/d;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly8/K;->p(Ly8/K;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic f(Ly8/K;Ly8/N;Lm8/p;Ly8/d;ILf8/u;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Ly8/K;->C(Ly8/K;Ly8/N;Lm8/p;Ly8/d;ILf8/u;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(Ly8/K;Lf8/n;LA8/N;)Lq8/g;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly8/K;->w(Ly8/K;Lf8/n;LA8/N;)Lq8/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic h(Ly8/K;Lf8/n;LA8/N;)Lq8/g;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly8/K;->y(Ly8/K;Lf8/n;LA8/N;)Lq8/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final i(LL7/m;)Ly8/N;
    .locals 4

    .line 1
    instance-of v0, p1, LL7/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly8/N$b;

    .line 6
    .line 7
    check-cast p1, LL7/N;

    .line 8
    .line 9
    invoke-interface {p1}, LL7/N;->d()Lk8/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, p0, Ly8/K;->a:Ly8/p;

    .line 14
    .line 15
    invoke-virtual {v1}, Ly8/p;->g()Lh8/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Ly8/K;->a:Ly8/p;

    .line 20
    .line 21
    invoke-virtual {v2}, Ly8/p;->j()Lh8/g;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, Ly8/K;->a:Ly8/p;

    .line 26
    .line 27
    invoke-virtual {v3}, Ly8/p;->d()LA8/s;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v0, p1, v1, v2, v3}, Ly8/N$b;-><init>(Lk8/c;Lh8/c;Lh8/g;LL7/h0;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    instance-of v0, p1, LA8/m;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    check-cast p1, LA8/m;

    .line 40
    .line 41
    invoke-virtual {p1}, LA8/m;->f1()Ly8/N$a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    return-object p1
.end method

.method private final j(Lm8/p;ILy8/d;)LM7/h;
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->c:Lh8/b$b;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p1, LM7/h;->a:LM7/h$a;

    .line 14
    .line 15
    invoke-virtual {p1}, LM7/h$a;->b()LM7/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p2, LA8/T;

    .line 21
    .line 22
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 23
    .line 24
    invoke-virtual {v0}, Ly8/p;->h()LB8/n;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ly8/E;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, p3}, Ly8/E;-><init>(Ly8/K;Lm8/p;Ly8/d;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p2, v0, v1}, LA8/T;-><init>(LB8/n;Lw7/a;)V

    .line 34
    .line 35
    .line 36
    return-object p2
.end method

.method private static final k(Ly8/K;Lm8/p;Ly8/d;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->e()LL7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ly8/K;->i(LL7/m;)Ly8/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Ly8/K;->a:Ly8/p;

    .line 14
    .line 15
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ly8/n;->d()Ly8/e;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0, v0, p1, p2}, Ly8/h;->e(Ly8/N;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    :goto_0
    if-nez p0, :cond_1

    .line 34
    .line 35
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_1
    return-object p0
.end method

.method private final l()LL7/c0;
    .locals 3

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->e()LL7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, LL7/e;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, LL7/e;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, LL7/e;->G0()LL7/c0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    return-object v2
.end method

.method private final m(Lf8/n;Z)LM7/h;
    .locals 3

    .line 1
    sget-object v0, Lh8/b;->c:Lh8/b$b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf8/n;->Z()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object p1, LM7/h;->a:LM7/h$a;

    .line 18
    .line 19
    invoke-virtual {p1}, LM7/h$a;->b()LM7/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance v0, LA8/T;

    .line 25
    .line 26
    iget-object v1, p0, Ly8/K;->a:Ly8/p;

    .line 27
    .line 28
    invoke-virtual {v1}, Ly8/p;->h()LB8/n;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Ly8/F;

    .line 33
    .line 34
    invoke-direct {v2, p0, p2, p1}, Ly8/F;-><init>(Ly8/K;ZLf8/n;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1, v2}, LA8/T;-><init>(LB8/n;Lw7/a;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private static final n(Ly8/K;ZLf8/n;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->e()LL7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ly8/K;->i(LL7/m;)Ly8/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Ly8/K;->a:Ly8/p;

    .line 16
    .line 17
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ly8/n;->d()Ly8/e;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0, v0, p2}, Ly8/h;->a(Ly8/N;Lf8/n;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object p0, p0, Ly8/K;->a:Ly8/p;

    .line 35
    .line 36
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ly8/n;->d()Ly8/e;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-interface {p0, v0, p2}, Ly8/h;->b(Ly8/N;Lf8/n;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 p0, 0x0

    .line 54
    :goto_0
    if-nez p0, :cond_2

    .line 55
    .line 56
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_2
    return-object p0
.end method

.method private final o(Lm8/p;Ly8/d;)LM7/h;
    .locals 3

    .line 1
    new-instance v0, LA8/a;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/K;->a:Ly8/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Ly8/p;->h()LB8/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ly8/G;

    .line 10
    .line 11
    invoke-direct {v2, p0, p1, p2}, Ly8/G;-><init>(Ly8/K;Lm8/p;Ly8/d;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LA8/a;-><init>(LB8/n;Lw7/a;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method private static final p(Ly8/K;Lm8/p;Ly8/d;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->e()LL7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ly8/K;->i(LL7/m;)Ly8/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Ly8/K;->a:Ly8/p;

    .line 14
    .line 15
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ly8/n;->d()Ly8/e;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0, v0, p1, p2}, Ly8/h;->i(Ly8/N;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    :goto_0
    if-nez p0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    return-object p0
.end method

.method private final q(LA8/O;LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-virtual/range {p1 .. p10}, LO7/O;->l1(LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;Ljava/util/Map;)LO7/O;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final t(I)I
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x3f

    .line 2
    .line 3
    shr-int/lit8 p1, p1, 0x8

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x6

    .line 6
    .line 7
    add-int/2addr v0, p1

    .line 8
    return v0
.end method

.method private static final v(Ly8/K;Lf8/n;LA8/N;)LB8/j;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->h()LB8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ly8/I;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Ly8/I;-><init>(Ly8/K;Lf8/n;LA8/N;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, LB8/n;->g(Lw7/a;)LB8/j;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final w(Ly8/K;Lf8/n;LA8/N;)Lq8/g;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->e()LL7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ly8/K;->i(LL7/m;)Ly8/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ly8/K;->a:Ly8/p;

    .line 15
    .line 16
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ly8/n;->d()Ly8/e;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p2}, LO7/K;->getReturnType()LC8/S;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v1, "getReturnType(...)"

    .line 29
    .line 30
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v0, p1, p2}, Ly8/e;->g(Ly8/N;Lf8/n;LC8/S;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lq8/g;

    .line 38
    .line 39
    return-object p0
.end method

.method private static final x(Ly8/K;Lf8/n;LA8/N;)LB8/j;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->h()LB8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ly8/J;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Ly8/J;-><init>(Ly8/K;Lf8/n;LA8/N;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, LB8/n;->g(Lw7/a;)LB8/j;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final y(Ly8/K;Lf8/n;LA8/N;)Lq8/g;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/K;->a:Ly8/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/p;->e()LL7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ly8/K;->i(LL7/m;)Ly8/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ly8/K;->a:Ly8/p;

    .line 15
    .line 16
    invoke-virtual {p0}, Ly8/p;->c()Ly8/n;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ly8/n;->d()Ly8/e;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p2}, LO7/K;->getReturnType()LC8/S;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v1, "getReturnType(...)"

    .line 29
    .line 30
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v0, p1, p2}, Ly8/e;->l(Ly8/N;Lf8/n;LC8/S;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lq8/g;

    .line 38
    .line 39
    return-object p0
.end method


# virtual methods
.method public final r(Lf8/d;Z)LL7/d;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const-string v1, "proto"

    .line 6
    .line 7
    invoke-static {v7, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Ly8/K;->a:Ly8/p;

    .line 11
    .line 12
    invoke-virtual {v1}, Ly8/p;->e()LL7/m;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, LL7/e;

    .line 23
    .line 24
    new-instance v1, LA8/c;

    .line 25
    .line 26
    invoke-virtual {v7}, Lf8/d;->I()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sget-object v15, Ly8/d;->g:Ly8/d;

    .line 31
    .line 32
    invoke-direct {v0, v7, v3, v15}, Ly8/K;->j(Lm8/p;ILy8/d;)LM7/h;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    sget-object v6, LL7/b$a;->g:LL7/b$a;

    .line 37
    .line 38
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 39
    .line 40
    invoke-virtual {v3}, Ly8/p;->g()Lh8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 45
    .line 46
    invoke-virtual {v3}, Ly8/p;->j()Lh8/g;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 51
    .line 52
    invoke-virtual {v3}, Ly8/p;->k()Lh8/h;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 57
    .line 58
    invoke-virtual {v3}, Ly8/p;->d()LA8/s;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    const/16 v13, 0x400

    .line 63
    .line 64
    const/4 v14, 0x0

    .line 65
    const/4 v3, 0x0

    .line 66
    const/4 v12, 0x0

    .line 67
    move/from16 v5, p2

    .line 68
    .line 69
    invoke-direct/range {v1 .. v14}, LA8/c;-><init>(LL7/e;LL7/l;LM7/h;ZLL7/b$a;Lf8/d;Lh8/c;Lh8/g;Lh8/h;LA8/s;LL7/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    .line 71
    .line 72
    move-object v4, v1

    .line 73
    move-object v1, v7

    .line 74
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 75
    .line 76
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const/16 v10, 0x3c

    .line 81
    .line 82
    const/4 v11, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    invoke-static/range {v3 .. v11}, Ly8/p;->b(Ly8/p;LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;ILjava/lang/Object;)Ly8/p;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ly8/p;->f()Ly8/K;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v1}, Lf8/d;->L()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const-string v6, "getValueParameterList(...)"

    .line 100
    .line 101
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v3, v5, v1, v15}, Ly8/K;->B(Ljava/util/List;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget-object v5, Ly8/O;->a:Ly8/O;

    .line 109
    .line 110
    sget-object v6, Lh8/b;->d:Lh8/b$d;

    .line 111
    .line 112
    invoke-virtual {v1}, Lf8/d;->I()I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    invoke-virtual {v6, v7}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    check-cast v6, Lf8/x;

    .line 121
    .line 122
    invoke-static {v5, v6}, Ly8/P;->a(Ly8/O;Lf8/x;)LL7/u;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v4, v3, v5}, LO7/i;->n1(Ljava/util/List;LL7/u;)LO7/i;

    .line 127
    .line 128
    .line 129
    invoke-interface {v2}, LL7/e;->r()LC8/d0;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v4, v3}, LO7/s;->d1(LC8/S;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v2}, LL7/D;->J()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {v4, v2}, LO7/s;->T0(Z)V

    .line 141
    .line 142
    .line 143
    sget-object v2, Lh8/b;->o:Lh8/b$b;

    .line 144
    .line 145
    invoke-virtual {v1}, Lf8/d;->I()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {v2, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    xor-int/lit8 v1, v1, 0x1

    .line 158
    .line 159
    invoke-virtual {v4, v1}, LO7/s;->V0(Z)V

    .line 160
    .line 161
    .line 162
    return-object v4
.end method

.method public final s(Lf8/i;)LL7/g0;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const-string v1, "proto"

    .line 6
    .line 7
    invoke-static {v7, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v7}, Lf8/i;->s0()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v7}, Lf8/i;->b0()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    move v15, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v7}, Lf8/i;->d0()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {v0, v1}, Ly8/K;->t(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    sget-object v1, Ly8/d;->g:Ly8/d;

    .line 32
    .line 33
    invoke-direct {v0, v7, v15, v1}, Ly8/K;->j(Lm8/p;ILy8/d;)LM7/h;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v7}, Lh8/f;->g(Lf8/i;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-direct {v0, v7, v1}, Ly8/K;->o(Lm8/p;Ly8/d;)LM7/h;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    sget-object v1, LM7/h;->a:LM7/h$a;

    .line 49
    .line 50
    invoke-virtual {v1}, LM7/h$a;->b()LM7/h;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_2
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 55
    .line 56
    invoke-virtual {v2}, Ly8/p;->e()LL7/m;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v2}, Ls8/e;->o(LL7/m;)Lk8/c;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 65
    .line 66
    invoke-virtual {v3}, Ly8/p;->g()Lh8/c;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v7}, Lf8/i;->c0()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {v3, v5}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v2, v3}, Lk8/c;->c(Lk8/f;)Lk8/c;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v3, Ly8/Q;->a:Lk8/c;

    .line 83
    .line 84
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    sget-object v2, Lh8/h;->b:Lh8/h$a;

    .line 91
    .line 92
    invoke-virtual {v2}, Lh8/h$a;->b()Lh8/h;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :goto_3
    move-object v10, v2

    .line 97
    goto :goto_4

    .line 98
    :cond_2
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 99
    .line 100
    invoke-virtual {v2}, Ly8/p;->k()Lh8/h;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    goto :goto_3

    .line 105
    :goto_4
    new-instance v17, LA8/O;

    .line 106
    .line 107
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 108
    .line 109
    invoke-virtual {v2}, Ly8/p;->e()LL7/m;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 114
    .line 115
    invoke-virtual {v3}, Ly8/p;->g()Lh8/c;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v7}, Lf8/i;->c0()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-static {v3, v5}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    sget-object v3, Ly8/O;->a:Ly8/O;

    .line 128
    .line 129
    sget-object v6, Lh8/b;->p:Lh8/b$d;

    .line 130
    .line 131
    invoke-virtual {v6, v15}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    check-cast v6, Lf8/j;

    .line 136
    .line 137
    invoke-static {v3, v6}, Ly8/P;->b(Ly8/O;Lf8/j;)LL7/b$a;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 142
    .line 143
    invoke-virtual {v3}, Ly8/p;->g()Lh8/c;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 148
    .line 149
    invoke-virtual {v3}, Ly8/p;->j()Lh8/g;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 154
    .line 155
    invoke-virtual {v3}, Ly8/p;->d()LA8/s;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    const/16 v13, 0x400

    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v3, 0x0

    .line 163
    const/4 v12, 0x0

    .line 164
    move/from16 v25, v15

    .line 165
    .line 166
    move-object v15, v1

    .line 167
    move-object/from16 v1, v17

    .line 168
    .line 169
    invoke-direct/range {v1 .. v14}, LA8/O;-><init>(LL7/m;LL7/g0;LM7/h;Lk8/f;LL7/b$a;Lf8/i;Lh8/c;Lh8/g;Lh8/h;LA8/s;LL7/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 170
    .line 171
    .line 172
    move-object v11, v7

    .line 173
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 174
    .line 175
    invoke-virtual {v11}, Lf8/i;->k0()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    const-string v4, "getTypeParameterList(...)"

    .line 180
    .line 181
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    const/16 v23, 0x3c

    .line 185
    .line 186
    const/16 v24, 0x0

    .line 187
    .line 188
    const/16 v19, 0x0

    .line 189
    .line 190
    const/16 v20, 0x0

    .line 191
    .line 192
    const/16 v21, 0x0

    .line 193
    .line 194
    const/16 v22, 0x0

    .line 195
    .line 196
    move-object/from16 v16, v2

    .line 197
    .line 198
    move-object/from16 v18, v3

    .line 199
    .line 200
    invoke-static/range {v16 .. v24}, Ly8/p;->b(Ly8/p;LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;ILjava/lang/Object;)Ly8/p;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 205
    .line 206
    invoke-virtual {v2}, Ly8/p;->j()Lh8/g;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-static {v11, v2}, Lh8/f;->k(Lf8/i;Lh8/g;)Lf8/q;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    if-eqz v2, :cond_3

    .line 215
    .line 216
    invoke-virtual {v12}, Ly8/p;->i()Ly8/X;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v3, v2}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    if-eqz v2, :cond_3

    .line 225
    .line 226
    invoke-static {v1, v2, v15}, Lo8/h;->i(LL7/a;LC8/S;LM7/h;)LL7/c0;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    goto :goto_5

    .line 231
    :cond_3
    const/4 v2, 0x0

    .line 232
    :goto_5
    invoke-direct {v0}, Ly8/K;->l()LL7/c0;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    iget-object v4, v0, Ly8/K;->a:Ly8/p;

    .line 237
    .line 238
    invoke-virtual {v4}, Ly8/p;->j()Lh8/g;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-static {v11, v4}, Lh8/f;->c(Lf8/i;Lh8/g;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    move-object v5, v4

    .line 247
    new-instance v4, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    const/4 v6, 0x0

    .line 257
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-eqz v7, :cond_6

    .line 262
    .line 263
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    add-int/lit8 v8, v6, 0x1

    .line 268
    .line 269
    if-gez v6, :cond_4

    .line 270
    .line 271
    invoke-static {}, Lj7/q;->t()V

    .line 272
    .line 273
    .line 274
    :cond_4
    check-cast v7, Lf8/q;

    .line 275
    .line 276
    invoke-direct {v0, v7, v12, v1, v6}, Ly8/K;->A(Lf8/q;Ly8/p;LL7/a;I)LL7/c0;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    if-eqz v6, :cond_5

    .line 281
    .line 282
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    :cond_5
    move v6, v8

    .line 286
    goto :goto_6

    .line 287
    :cond_6
    invoke-virtual {v12}, Ly8/p;->i()Ly8/X;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-virtual {v5}, Ly8/X;->m()Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    invoke-virtual {v12}, Ly8/p;->f()Ly8/K;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    invoke-virtual {v11}, Lf8/i;->p0()Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    const-string v8, "getValueParameterList(...)"

    .line 304
    .line 305
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    sget-object v8, Ly8/d;->g:Ly8/d;

    .line 309
    .line 310
    invoke-direct {v6, v7, v11, v8}, Ly8/K;->B(Ljava/util/List;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-virtual {v12}, Ly8/p;->i()Ly8/X;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    iget-object v8, v0, Ly8/K;->a:Ly8/p;

    .line 319
    .line 320
    invoke-virtual {v8}, Ly8/p;->j()Lh8/g;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-static {v11, v8}, Lh8/f;->m(Lf8/i;Lh8/g;)Lf8/q;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    invoke-virtual {v7, v8}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    sget-object v8, Ly8/O;->a:Ly8/O;

    .line 333
    .line 334
    sget-object v9, Lh8/b;->e:Lh8/b$d;

    .line 335
    .line 336
    move/from16 v13, v25

    .line 337
    .line 338
    invoke-virtual {v9, v13}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    check-cast v9, Lf8/k;

    .line 343
    .line 344
    invoke-virtual {v8, v9}, Ly8/O;->b(Lf8/k;)LL7/E;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    sget-object v10, Lh8/b;->d:Lh8/b$d;

    .line 349
    .line 350
    invoke-virtual {v10, v13}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    check-cast v10, Lf8/x;

    .line 355
    .line 356
    invoke-static {v8, v10}, Ly8/P;->a(Ly8/O;Lf8/x;)LL7/u;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    move-object/from16 v26, v9

    .line 365
    .line 366
    move-object v9, v8

    .line 367
    move-object/from16 v8, v26

    .line 368
    .line 369
    invoke-direct/range {v0 .. v10}, Ly8/K;->q(LA8/O;LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;Ljava/util/Map;)V

    .line 370
    .line 371
    .line 372
    sget-object v2, Lh8/b;->q:Lh8/b$b;

    .line 373
    .line 374
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    invoke-virtual {v1, v2}, LO7/s;->c1(Z)V

    .line 383
    .line 384
    .line 385
    sget-object v2, Lh8/b;->r:Lh8/b$b;

    .line 386
    .line 387
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    invoke-virtual {v1, v2}, LO7/s;->Z0(Z)V

    .line 396
    .line 397
    .line 398
    sget-object v2, Lh8/b;->u:Lh8/b$b;

    .line 399
    .line 400
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-virtual {v1, v2}, LO7/s;->U0(Z)V

    .line 409
    .line 410
    .line 411
    sget-object v2, Lh8/b;->s:Lh8/b$b;

    .line 412
    .line 413
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v1, v2}, LO7/s;->b1(Z)V

    .line 422
    .line 423
    .line 424
    sget-object v2, Lh8/b;->t:Lh8/b$b;

    .line 425
    .line 426
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    invoke-virtual {v1, v2}, LO7/s;->f1(Z)V

    .line 435
    .line 436
    .line 437
    sget-object v2, Lh8/b;->v:Lh8/b$b;

    .line 438
    .line 439
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    invoke-virtual {v1, v2}, LO7/s;->e1(Z)V

    .line 448
    .line 449
    .line 450
    sget-object v2, Lh8/b;->w:Lh8/b$b;

    .line 451
    .line 452
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    invoke-virtual {v1, v2}, LO7/s;->T0(Z)V

    .line 461
    .line 462
    .line 463
    sget-object v2, Lh8/b;->x:Lh8/b$b;

    .line 464
    .line 465
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    xor-int/lit8 v2, v2, 0x1

    .line 474
    .line 475
    invoke-virtual {v1, v2}, LO7/s;->V0(Z)V

    .line 476
    .line 477
    .line 478
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 479
    .line 480
    invoke-virtual {v2}, Ly8/p;->c()Ly8/n;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-virtual {v2}, Ly8/n;->h()Ly8/m;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 489
    .line 490
    invoke-virtual {v3}, Ly8/p;->j()Lh8/g;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-virtual {v12}, Ly8/p;->i()Ly8/X;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    invoke-interface {v2, v11, v1, v3, v4}, Ly8/m;->a(Lf8/i;LL7/z;Lh8/g;Ly8/X;)Lkotlin/Pair;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    if-eqz v2, :cond_7

    .line 503
    .line 504
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    check-cast v3, LL7/a$a;

    .line 509
    .line 510
    invoke-virtual {v2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-virtual {v1, v3, v2}, LO7/s;->R0(LL7/a$a;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    :cond_7
    return-object v1
.end method

.method public final u(Lf8/n;)LL7/Z;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    const-string v1, "proto"

    .line 6
    .line 7
    invoke-static {v15, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v15}, Lf8/n;->o0()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v15}, Lf8/n;->Z()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v15}, Lf8/n;->c0()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v0, v1}, Ly8/K;->t(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_0
    new-instance v3, LA8/N;

    .line 30
    .line 31
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 32
    .line 33
    invoke-virtual {v2}, Ly8/p;->e()LL7/m;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v4, Ly8/d;->h:Ly8/d;

    .line 38
    .line 39
    invoke-direct {v0, v15, v1, v4}, Ly8/K;->j(Lm8/p;ILy8/d;)LM7/h;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    sget-object v5, Ly8/O;->a:Ly8/O;

    .line 44
    .line 45
    sget-object v6, Lh8/b;->e:Lh8/b$d;

    .line 46
    .line 47
    invoke-virtual {v6, v1}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Lf8/k;

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ly8/O;->b(Lf8/k;)LL7/E;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v7, Lh8/b;->d:Lh8/b$d;

    .line 58
    .line 59
    invoke-virtual {v7, v1}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    check-cast v7, Lf8/x;

    .line 64
    .line 65
    invoke-static {v5, v7}, Ly8/P;->a(Ly8/O;Lf8/x;)LL7/u;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    sget-object v8, Lh8/b;->y:Lh8/b$b;

    .line 70
    .line 71
    invoke-virtual {v8, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const-string v9, "get(...)"

    .line 76
    .line 77
    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    iget-object v10, v0, Ly8/K;->a:Ly8/p;

    .line 85
    .line 86
    invoke-virtual {v10}, Ly8/p;->g()Lh8/c;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-virtual {v15}, Lf8/n;->b0()I

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    invoke-static {v10, v11}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    sget-object v11, Lh8/b;->p:Lh8/b$d;

    .line 99
    .line 100
    invoke-virtual {v11, v1}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    check-cast v11, Lf8/j;

    .line 105
    .line 106
    invoke-static {v5, v11}, Ly8/P;->b(Ly8/O;Lf8/j;)LL7/b$a;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    sget-object v11, Lh8/b;->C:Lh8/b$b;

    .line 111
    .line 112
    invoke-virtual {v11, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    sget-object v12, Lh8/b;->B:Lh8/b$b;

    .line 124
    .line 125
    invoke-virtual {v12, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    sget-object v13, Lh8/b;->E:Lh8/b$b;

    .line 137
    .line 138
    invoke-virtual {v13, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    sget-object v14, Lh8/b;->F:Lh8/b$b;

    .line 150
    .line 151
    invoke-virtual {v14, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    move-object/from16 v16, v2

    .line 163
    .line 164
    sget-object v2, Lh8/b;->G:Lh8/b$b;

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v2, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move/from16 v17, v1

    .line 178
    .line 179
    iget-object v1, v0, Ly8/K;->a:Ly8/p;

    .line 180
    .line 181
    invoke-virtual {v1}, Ly8/p;->g()Lh8/c;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    move-object/from16 v18, v1

    .line 186
    .line 187
    iget-object v1, v0, Ly8/K;->a:Ly8/p;

    .line 188
    .line 189
    invoke-virtual {v1}, Ly8/p;->j()Lh8/g;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    move-object/from16 v19, v1

    .line 194
    .line 195
    iget-object v1, v0, Ly8/K;->a:Ly8/p;

    .line 196
    .line 197
    invoke-virtual {v1}, Ly8/p;->k()Lh8/h;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    move-object/from16 v20, v1

    .line 202
    .line 203
    iget-object v1, v0, Ly8/K;->a:Ly8/p;

    .line 204
    .line 205
    invoke-virtual {v1}, Ly8/p;->d()LA8/s;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    move/from16 v21, v17

    .line 210
    .line 211
    move-object/from16 v17, v19

    .line 212
    .line 213
    move-object/from16 v19, v1

    .line 214
    .line 215
    move-object v1, v3

    .line 216
    const/4 v3, 0x0

    .line 217
    move-object/from16 v23, v9

    .line 218
    .line 219
    move/from16 v22, v21

    .line 220
    .line 221
    move-object v9, v5

    .line 222
    move-object v5, v6

    .line 223
    move-object v6, v7

    .line 224
    move v7, v8

    .line 225
    move-object v8, v10

    .line 226
    move v10, v11

    .line 227
    move v11, v12

    .line 228
    move v12, v13

    .line 229
    move v13, v14

    .line 230
    move v14, v2

    .line 231
    move-object/from16 v2, v16

    .line 232
    .line 233
    move-object/from16 v16, v18

    .line 234
    .line 235
    move-object/from16 v18, v20

    .line 236
    .line 237
    invoke-direct/range {v1 .. v19}, LA8/N;-><init>(LL7/m;LL7/Z;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;ZZZZZLf8/n;Lh8/c;Lh8/g;Lh8/h;LA8/s;)V

    .line 238
    .line 239
    .line 240
    move-object v3, v1

    .line 241
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 242
    .line 243
    invoke-virtual {v15}, Lf8/n;->m0()Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    const-string v1, "getTypeParameterList(...)"

    .line 248
    .line 249
    invoke-static {v4, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/16 v9, 0x3c

    .line 253
    .line 254
    const/4 v10, 0x0

    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x0

    .line 257
    const/4 v7, 0x0

    .line 258
    const/4 v8, 0x0

    .line 259
    invoke-static/range {v2 .. v10}, Ly8/p;->b(Ly8/p;LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;ILjava/lang/Object;)Ly8/p;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    sget-object v2, Lh8/b;->z:Lh8/b$b;

    .line 264
    .line 265
    move/from16 v13, v22

    .line 266
    .line 267
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    move-object/from16 v14, v23

    .line 272
    .line 273
    invoke-static {v2, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eqz v8, :cond_1

    .line 281
    .line 282
    invoke-static {v15}, Lh8/f;->h(Lf8/n;)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eqz v2, :cond_1

    .line 287
    .line 288
    sget-object v2, Ly8/d;->i:Ly8/d;

    .line 289
    .line 290
    invoke-direct {v0, v15, v2}, Ly8/K;->o(Lm8/p;Ly8/d;)LM7/h;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    goto :goto_1

    .line 295
    :cond_1
    sget-object v2, LM7/h;->a:LM7/h$a;

    .line 296
    .line 297
    invoke-virtual {v2}, LM7/h$a;->b()LM7/h;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    :goto_1
    invoke-virtual {v1}, Ly8/p;->i()Ly8/X;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    iget-object v5, v0, Ly8/K;->a:Ly8/p;

    .line 306
    .line 307
    invoke-virtual {v5}, Ly8/p;->j()Lh8/g;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-static {v15, v5}, Lh8/f;->n(Lf8/n;Lh8/g;)Lf8/q;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-virtual {v4, v5}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-virtual {v1}, Ly8/p;->i()Ly8/X;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    invoke-virtual {v5}, Ly8/X;->m()Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    move-object v6, v4

    .line 328
    move-object v4, v5

    .line 329
    invoke-direct {v0}, Ly8/K;->l()LL7/c0;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    iget-object v7, v0, Ly8/K;->a:Ly8/p;

    .line 334
    .line 335
    invoke-virtual {v7}, Ly8/p;->j()Lh8/g;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    invoke-static {v15, v7}, Lh8/f;->l(Lf8/n;Lh8/g;)Lf8/q;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    const/16 v16, 0x0

    .line 344
    .line 345
    if-eqz v7, :cond_2

    .line 346
    .line 347
    invoke-virtual {v1}, Ly8/p;->i()Ly8/X;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    invoke-virtual {v9, v7}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    if-eqz v7, :cond_2

    .line 356
    .line 357
    invoke-static {v3, v7, v2}, Lo8/h;->i(LL7/a;LC8/S;LM7/h;)LL7/c0;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    goto :goto_2

    .line 362
    :cond_2
    move-object/from16 v2, v16

    .line 363
    .line 364
    :goto_2
    iget-object v7, v0, Ly8/K;->a:Ly8/p;

    .line 365
    .line 366
    invoke-virtual {v7}, Ly8/p;->j()Lh8/g;

    .line 367
    .line 368
    .line 369
    move-result-object v7

    .line 370
    invoke-static {v15, v7}, Lh8/f;->d(Lf8/n;Lh8/g;)Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    new-instance v9, Ljava/util/ArrayList;

    .line 375
    .line 376
    const/16 v10, 0xa

    .line 377
    .line 378
    invoke-static {v7, v10}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 379
    .line 380
    .line 381
    move-result v10

    .line 382
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v10

    .line 389
    const/4 v7, 0x0

    .line 390
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    if-eqz v12, :cond_4

    .line 395
    .line 396
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v12

    .line 400
    add-int/lit8 v17, v7, 0x1

    .line 401
    .line 402
    if-gez v7, :cond_3

    .line 403
    .line 404
    invoke-static {}, Lj7/q;->t()V

    .line 405
    .line 406
    .line 407
    :cond_3
    check-cast v12, Lf8/q;

    .line 408
    .line 409
    invoke-direct {v0, v12, v1, v3, v7}, Ly8/K;->A(Lf8/q;Ly8/p;LL7/a;I)LL7/c0;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    invoke-interface {v9, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move/from16 v7, v17

    .line 417
    .line 418
    goto :goto_3

    .line 419
    :cond_4
    move-object v7, v6

    .line 420
    move-object v6, v2

    .line 421
    move-object v2, v3

    .line 422
    move-object v3, v7

    .line 423
    move-object v7, v9

    .line 424
    invoke-virtual/range {v2 .. v7}, LO7/K;->Y0(LC8/S;Ljava/util/List;LL7/c0;LL7/c0;Ljava/util/List;)V

    .line 425
    .line 426
    .line 427
    move-object v3, v2

    .line 428
    sget-object v2, Lh8/b;->c:Lh8/b$b;

    .line 429
    .line 430
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-static {v2, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 438
    .line 439
    .line 440
    move-result v17

    .line 441
    sget-object v2, Lh8/b;->d:Lh8/b$d;

    .line 442
    .line 443
    invoke-virtual {v2, v13}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    move-object/from16 v18, v4

    .line 448
    .line 449
    check-cast v18, Lf8/x;

    .line 450
    .line 451
    sget-object v4, Lh8/b;->e:Lh8/b$d;

    .line 452
    .line 453
    invoke-virtual {v4, v13}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    move-object/from16 v19, v5

    .line 458
    .line 459
    check-cast v19, Lf8/k;

    .line 460
    .line 461
    const/16 v21, 0x0

    .line 462
    .line 463
    const/16 v22, 0x0

    .line 464
    .line 465
    const/16 v20, 0x0

    .line 466
    .line 467
    invoke-static/range {v17 .. v22}, Lh8/b;->b(ZLf8/x;Lf8/k;ZZZ)I

    .line 468
    .line 469
    .line 470
    move-result v17

    .line 471
    if-eqz v8, :cond_7

    .line 472
    .line 473
    invoke-virtual {v15}, Lf8/n;->p0()Z

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    if-eqz v6, :cond_5

    .line 478
    .line 479
    invoke-virtual {v15}, Lf8/n;->a0()I

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    goto :goto_4

    .line 484
    :cond_5
    move/from16 v6, v17

    .line 485
    .line 486
    :goto_4
    sget-object v7, Lh8/b;->K:Lh8/b$b;

    .line 487
    .line 488
    invoke-virtual {v7, v6}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 489
    .line 490
    .line 491
    move-result-object v7

    .line 492
    invoke-static {v7, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    sget-object v8, Lh8/b;->L:Lh8/b$b;

    .line 500
    .line 501
    invoke-virtual {v8, v6}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object v8

    .line 505
    invoke-static {v8, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 509
    .line 510
    .line 511
    move-result v8

    .line 512
    sget-object v9, Lh8/b;->M:Lh8/b$b;

    .line 513
    .line 514
    invoke-virtual {v9, v6}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    invoke-static {v9, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    sget-object v10, Ly8/d;->i:Ly8/d;

    .line 526
    .line 527
    invoke-direct {v0, v15, v6, v10}, Ly8/K;->j(Lm8/p;ILy8/d;)LM7/h;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    if-eqz v7, :cond_6

    .line 532
    .line 533
    new-instance v12, LO7/L;

    .line 534
    .line 535
    const/16 v18, 0x1

    .line 536
    .line 537
    sget-object v5, Ly8/O;->a:Ly8/O;

    .line 538
    .line 539
    invoke-virtual {v4, v6}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v19

    .line 543
    move-object/from16 v11, v19

    .line 544
    .line 545
    check-cast v11, Lf8/k;

    .line 546
    .line 547
    invoke-virtual {v5, v11}, Ly8/O;->b(Lf8/k;)LL7/E;

    .line 548
    .line 549
    .line 550
    move-result-object v11

    .line 551
    invoke-virtual {v2, v6}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    check-cast v6, Lf8/x;

    .line 556
    .line 557
    invoke-static {v5, v6}, Ly8/P;->a(Ly8/O;Lf8/x;)LL7/u;

    .line 558
    .line 559
    .line 560
    move-result-object v6

    .line 561
    xor-int/lit8 v7, v7, 0x1

    .line 562
    .line 563
    move-object v5, v4

    .line 564
    move-object v4, v10

    .line 565
    invoke-virtual {v3}, LO7/K;->getKind()LL7/b$a;

    .line 566
    .line 567
    .line 568
    move-result-object v10

    .line 569
    move-object/from16 v19, v5

    .line 570
    .line 571
    move-object v5, v11

    .line 572
    const/4 v11, 0x0

    .line 573
    move-object/from16 v21, v2

    .line 574
    .line 575
    move-object v2, v12

    .line 576
    sget-object v12, LL7/h0;->a:LL7/h0;

    .line 577
    .line 578
    move-object/from16 v24, v1

    .line 579
    .line 580
    move-object/from16 v1, v19

    .line 581
    .line 582
    invoke-direct/range {v2 .. v12}, LO7/L;-><init>(LL7/Z;LM7/h;LL7/E;LL7/u;ZZZLL7/b$a;LL7/a0;LL7/h0;)V

    .line 583
    .line 584
    .line 585
    move-object v12, v2

    .line 586
    goto :goto_5

    .line 587
    :cond_6
    move-object/from16 v24, v1

    .line 588
    .line 589
    move-object/from16 v21, v2

    .line 590
    .line 591
    move-object v1, v4

    .line 592
    move-object v4, v10

    .line 593
    invoke-static {v3, v4}, Lo8/h;->d(LL7/Z;LM7/h;)LO7/L;

    .line 594
    .line 595
    .line 596
    move-result-object v12

    .line 597
    invoke-static {v12}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    :goto_5
    invoke-virtual {v3}, LO7/K;->getReturnType()LC8/S;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-virtual {v12, v2}, LO7/L;->M0(LC8/S;)V

    .line 605
    .line 606
    .line 607
    goto :goto_6

    .line 608
    :cond_7
    move-object/from16 v24, v1

    .line 609
    .line 610
    move-object/from16 v21, v2

    .line 611
    .line 612
    move-object v1, v4

    .line 613
    move-object/from16 v12, v16

    .line 614
    .line 615
    :goto_6
    sget-object v2, Lh8/b;->A:Lh8/b$b;

    .line 616
    .line 617
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    if-eqz v2, :cond_a

    .line 626
    .line 627
    invoke-virtual {v15}, Lf8/n;->w0()Z

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    if-eqz v2, :cond_8

    .line 632
    .line 633
    invoke-virtual {v15}, Lf8/n;->h0()I

    .line 634
    .line 635
    .line 636
    move-result v17

    .line 637
    :cond_8
    move/from16 v2, v17

    .line 638
    .line 639
    sget-object v4, Lh8/b;->K:Lh8/b$b;

    .line 640
    .line 641
    invoke-virtual {v4, v2}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    invoke-static {v4, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 649
    .line 650
    .line 651
    move-result v4

    .line 652
    sget-object v5, Lh8/b;->L:Lh8/b$b;

    .line 653
    .line 654
    invoke-virtual {v5, v2}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 655
    .line 656
    .line 657
    move-result-object v5

    .line 658
    invoke-static {v5, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 662
    .line 663
    .line 664
    move-result v8

    .line 665
    sget-object v5, Lh8/b;->M:Lh8/b$b;

    .line 666
    .line 667
    invoke-virtual {v5, v2}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 668
    .line 669
    .line 670
    move-result-object v5

    .line 671
    invoke-static {v5, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 675
    .line 676
    .line 677
    move-result v9

    .line 678
    sget-object v14, Ly8/d;->j:Ly8/d;

    .line 679
    .line 680
    move v5, v4

    .line 681
    invoke-direct {v0, v15, v2, v14}, Ly8/K;->j(Lm8/p;ILy8/d;)LM7/h;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    if-eqz v5, :cond_9

    .line 686
    .line 687
    new-instance v25, LO7/M;

    .line 688
    .line 689
    sget-object v6, Ly8/O;->a:Ly8/O;

    .line 690
    .line 691
    invoke-virtual {v1, v2}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    check-cast v1, Lf8/k;

    .line 696
    .line 697
    invoke-virtual {v6, v1}, Ly8/O;->b(Lf8/k;)LL7/E;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    move-object/from16 v7, v21

    .line 702
    .line 703
    invoke-virtual {v7, v2}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    check-cast v2, Lf8/x;

    .line 708
    .line 709
    invoke-static {v6, v2}, Ly8/P;->a(Ly8/O;Lf8/x;)LL7/u;

    .line 710
    .line 711
    .line 712
    move-result-object v6

    .line 713
    const/16 v18, 0x1

    .line 714
    .line 715
    xor-int/lit8 v7, v5, 0x1

    .line 716
    .line 717
    invoke-virtual {v3}, LO7/K;->getKind()LL7/b$a;

    .line 718
    .line 719
    .line 720
    move-result-object v10

    .line 721
    const/4 v11, 0x0

    .line 722
    move-object v2, v12

    .line 723
    sget-object v12, LL7/h0;->a:LL7/h0;

    .line 724
    .line 725
    move-object v5, v1

    .line 726
    move-object/from16 v17, v2

    .line 727
    .line 728
    move/from16 v1, v18

    .line 729
    .line 730
    move-object/from16 v2, v25

    .line 731
    .line 732
    invoke-direct/range {v2 .. v12}, LO7/M;-><init>(LL7/Z;LM7/h;LL7/E;LL7/u;ZZZLL7/b$a;LL7/b0;LL7/h0;)V

    .line 733
    .line 734
    .line 735
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 736
    .line 737
    .line 738
    move-result-object v26

    .line 739
    const/16 v31, 0x3c

    .line 740
    .line 741
    const/16 v32, 0x0

    .line 742
    .line 743
    const/16 v27, 0x0

    .line 744
    .line 745
    const/16 v28, 0x0

    .line 746
    .line 747
    const/16 v29, 0x0

    .line 748
    .line 749
    const/16 v30, 0x0

    .line 750
    .line 751
    invoke-static/range {v24 .. v32}, Ly8/p;->b(Ly8/p;LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;ILjava/lang/Object;)Ly8/p;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    move-object/from16 v4, v25

    .line 756
    .line 757
    invoke-virtual {v2}, Ly8/p;->f()Ly8/K;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-virtual {v15}, Lf8/n;->i0()Lf8/u;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    invoke-static {v5}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    invoke-direct {v2, v5, v15, v14}, Ly8/K;->B(Ljava/util/List;Lm8/p;Ly8/d;)Ljava/util/List;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    invoke-static {v2}, Lj7/q;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    check-cast v2, LL7/t0;

    .line 778
    .line 779
    invoke-virtual {v4, v2}, LO7/M;->N0(LL7/t0;)V

    .line 780
    .line 781
    .line 782
    goto :goto_7

    .line 783
    :cond_9
    move-object/from16 v17, v12

    .line 784
    .line 785
    const/4 v1, 0x1

    .line 786
    sget-object v2, LM7/h;->a:LM7/h$a;

    .line 787
    .line 788
    invoke-virtual {v2}, LM7/h$a;->b()LM7/h;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    invoke-static {v3, v4, v2}, Lo8/h;->e(LL7/Z;LM7/h;LM7/h;)LO7/M;

    .line 793
    .line 794
    .line 795
    move-result-object v25

    .line 796
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    move-object/from16 v4, v25

    .line 800
    .line 801
    goto :goto_7

    .line 802
    :cond_a
    move-object/from16 v17, v12

    .line 803
    .line 804
    const/4 v1, 0x1

    .line 805
    move-object/from16 v4, v16

    .line 806
    .line 807
    :goto_7
    sget-object v2, Lh8/b;->D:Lh8/b$b;

    .line 808
    .line 809
    invoke-virtual {v2, v13}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    if-eqz v2, :cond_b

    .line 818
    .line 819
    new-instance v2, Ly8/C;

    .line 820
    .line 821
    invoke-direct {v2, v0, v15, v3}, Ly8/C;-><init>(Ly8/K;Lf8/n;LA8/N;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v3, v2}, LO7/Y;->I0(Lw7/a;)V

    .line 825
    .line 826
    .line 827
    :cond_b
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 828
    .line 829
    invoke-virtual {v2}, Ly8/p;->e()LL7/m;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    instance-of v5, v2, LL7/e;

    .line 834
    .line 835
    if-eqz v5, :cond_c

    .line 836
    .line 837
    check-cast v2, LL7/e;

    .line 838
    .line 839
    goto :goto_8

    .line 840
    :cond_c
    move-object/from16 v2, v16

    .line 841
    .line 842
    :goto_8
    if-eqz v2, :cond_d

    .line 843
    .line 844
    invoke-interface {v2}, LL7/e;->getKind()LL7/f;

    .line 845
    .line 846
    .line 847
    move-result-object v16

    .line 848
    :cond_d
    move-object/from16 v2, v16

    .line 849
    .line 850
    sget-object v5, LL7/f;->l:LL7/f;

    .line 851
    .line 852
    if-ne v2, v5, :cond_e

    .line 853
    .line 854
    new-instance v2, Ly8/D;

    .line 855
    .line 856
    invoke-direct {v2, v0, v15, v3}, Ly8/D;-><init>(Ly8/K;Lf8/n;LA8/N;)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v3, v2}, LO7/Y;->I0(Lw7/a;)V

    .line 860
    .line 861
    .line 862
    :cond_e
    new-instance v2, LO7/r;

    .line 863
    .line 864
    const/4 v5, 0x0

    .line 865
    invoke-direct {v0, v15, v5}, Ly8/K;->m(Lf8/n;Z)LM7/h;

    .line 866
    .line 867
    .line 868
    move-result-object v5

    .line 869
    invoke-direct {v2, v5, v3}, LO7/r;-><init>(LM7/h;LL7/Z;)V

    .line 870
    .line 871
    .line 872
    new-instance v5, LO7/r;

    .line 873
    .line 874
    invoke-direct {v0, v15, v1}, Ly8/K;->m(Lf8/n;Z)LM7/h;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    invoke-direct {v5, v1, v3}, LO7/r;-><init>(LM7/h;LL7/Z;)V

    .line 879
    .line 880
    .line 881
    move-object/from16 v12, v17

    .line 882
    .line 883
    invoke-virtual {v3, v12, v4, v2, v5}, LO7/K;->S0(LO7/L;LL7/b0;LL7/w;LL7/w;)V

    .line 884
    .line 885
    .line 886
    return-object v3
.end method

.method public final z(Lf8/r;)LL7/l0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const-string v1, "proto"

    .line 6
    .line 7
    invoke-static {v7, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LM7/h;->a:LM7/h$a;

    .line 11
    .line 12
    invoke-virtual {v7}, Lf8/r;->P()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "getAnnotationList(...)"

    .line 17
    .line 18
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v4, 0xa

    .line 24
    .line 25
    invoke-static {v2, v4}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lf8/b;

    .line 47
    .line 48
    iget-object v5, v0, Ly8/K;->b:Ly8/g;

    .line 49
    .line 50
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v6, v0, Ly8/K;->a:Ly8/p;

    .line 54
    .line 55
    invoke-virtual {v6}, Ly8/p;->g()Lh8/c;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v5, v4, v6}, Ly8/g;->a(Lf8/b;Lh8/c;)LM7/c;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v1, v3}, LM7/h$a;->a(Ljava/util/List;)LM7/h;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    sget-object v1, Ly8/O;->a:Ly8/O;

    .line 72
    .line 73
    sget-object v2, Lh8/b;->d:Lh8/b$d;

    .line 74
    .line 75
    invoke-virtual {v7}, Lf8/r;->U()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v2, v3}, Lh8/b$d;->d(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lf8/x;

    .line 84
    .line 85
    invoke-static {v1, v2}, Ly8/P;->a(Ly8/O;Lf8/x;)LL7/u;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    new-instance v1, LA8/P;

    .line 90
    .line 91
    iget-object v2, v0, Ly8/K;->a:Ly8/p;

    .line 92
    .line 93
    invoke-virtual {v2}, Ly8/p;->h()LB8/n;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-object v3, v0, Ly8/K;->a:Ly8/p;

    .line 98
    .line 99
    invoke-virtual {v3}, Ly8/p;->e()LL7/m;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    iget-object v5, v0, Ly8/K;->a:Ly8/p;

    .line 104
    .line 105
    invoke-virtual {v5}, Ly8/p;->g()Lh8/c;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v7}, Lf8/r;->V()I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    invoke-static {v5, v8}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    iget-object v8, v0, Ly8/K;->a:Ly8/p;

    .line 118
    .line 119
    invoke-virtual {v8}, Ly8/p;->g()Lh8/c;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    iget-object v9, v0, Ly8/K;->a:Ly8/p;

    .line 124
    .line 125
    invoke-virtual {v9}, Ly8/p;->j()Lh8/g;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    iget-object v10, v0, Ly8/K;->a:Ly8/p;

    .line 130
    .line 131
    invoke-virtual {v10}, Ly8/p;->k()Lh8/h;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    iget-object v11, v0, Ly8/K;->a:Ly8/p;

    .line 136
    .line 137
    invoke-virtual {v11}, Ly8/p;->d()LA8/s;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-direct/range {v1 .. v11}, LA8/P;-><init>(LB8/n;LL7/m;LM7/h;Lk8/f;LL7/u;Lf8/r;Lh8/c;Lh8/g;Lh8/h;LA8/s;)V

    .line 142
    .line 143
    .line 144
    move-object v8, v1

    .line 145
    move-object v1, v7

    .line 146
    iget-object v7, v0, Ly8/K;->a:Ly8/p;

    .line 147
    .line 148
    invoke-virtual {v1}, Lf8/r;->Y()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    const-string v2, "getTypeParameterList(...)"

    .line 153
    .line 154
    invoke-static {v9, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const/16 v14, 0x3c

    .line 158
    .line 159
    const/4 v15, 0x0

    .line 160
    const/4 v10, 0x0

    .line 161
    const/4 v11, 0x0

    .line 162
    const/4 v12, 0x0

    .line 163
    const/4 v13, 0x0

    .line 164
    invoke-static/range {v7 .. v15}, Ly8/p;->b(Ly8/p;LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;ILjava/lang/Object;)Ly8/p;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ly8/p;->i()Ly8/X;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Ly8/X;->m()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v2}, Ly8/p;->i()Ly8/X;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    iget-object v5, v0, Ly8/K;->a:Ly8/p;

    .line 181
    .line 182
    invoke-virtual {v5}, Ly8/p;->j()Lh8/g;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-static {v1, v5}, Lh8/f;->r(Lf8/r;Lh8/g;)Lf8/q;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    const/4 v6, 0x0

    .line 191
    invoke-virtual {v4, v5, v6}, Ly8/X;->o(Lf8/q;Z)LC8/d0;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v2}, Ly8/p;->i()Ly8/X;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    iget-object v5, v0, Ly8/K;->a:Ly8/p;

    .line 200
    .line 201
    invoke-virtual {v5}, Ly8/p;->j()Lh8/g;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-static {v1, v5}, Lh8/f;->e(Lf8/r;Lh8/g;)Lf8/q;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v2, v1, v6}, Ly8/X;->o(Lf8/q;Z)LC8/d0;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v8, v3, v4, v1}, LA8/P;->T0(Ljava/util/List;LC8/d0;LC8/d0;)V

    .line 214
    .line 215
    .line 216
    return-object v8
.end method
