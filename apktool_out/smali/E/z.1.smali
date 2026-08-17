.class public LE/z;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static f:I

.field static final g:LN/b;


# instance fields
.field private final a:LF/C0;

.field private final b:LF/h0;

.field private final c:LE/u;

.field private final d:LE/Q;

.field private final e:LE/u$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LN/b;

    .line 2
    .line 3
    invoke-direct {v0}, LN/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LE/z;->g:LN/b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LF/C0;Landroid/util/Size;Landroid/hardware/camera2/CameraCharacteristics;Ly/k;ZLE/G;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LH/y;->b()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LE/z;->a:LF/C0;

    .line 8
    .line 9
    invoke-static {p1}, LF/h0$a;->j(LF/D1;)LF/h0$a;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-virtual {p4}, LF/h0$a;->h()LF/h0;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    iput-object p4, p0, LE/z;->b:LF/h0;

    .line 18
    .line 19
    new-instance p4, LE/u;

    .line 20
    .line 21
    invoke-direct {p4}, LE/u;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p4, p0, LE/z;->c:LE/u;

    .line 25
    .line 26
    new-instance v0, LE/Q;

    .line 27
    .line 28
    invoke-static {}, LI/c;->d()Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1, v1}, LF/C0;->k0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v0, v1, p3, v2}, LE/Q;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;LP/w;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, LE/z;->d:LE/Q;

    .line 46
    .line 47
    new-instance v5, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, LF/D0;->J()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    const/16 p3, 0x20

    .line 59
    .line 60
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-interface {v5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    const/16 p3, 0x100

    .line 68
    .line 69
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-interface {v5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-direct {p0}, LE/z;->i()I

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    invoke-interface {v5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-virtual {p1}, LF/C0;->r()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {p1}, LF/C0;->j0()Ly/d0;

    .line 93
    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    move-object v3, p2

    .line 97
    move v6, p5

    .line 98
    move-object v8, p6

    .line 99
    invoke-static/range {v3 .. v8}, LE/u$c;->n(Landroid/util/Size;ILjava/util/List;ZLy/d0;LE/G;)LE/u$c;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, p0, LE/z;->e:LE/u$c;

    .line 104
    .line 105
    invoke-virtual {p4, p1}, LE/u;->s(LE/u$c;)LE/Q$a;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v0, p1}, LE/Q;->p(LE/Q$a;)Ljava/lang/Void;

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method private b(ILF/g0;LE/i0;LE/X;)LE/k;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {p2}, LF/g0;->a()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    check-cast p2, Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_6

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, LF/i0;

    .line 38
    .line 39
    new-instance v3, LF/h0$a;

    .line 40
    .line 41
    invoke-direct {v3}, LF/h0$a;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v4, p0, LE/z;->b:LF/h0;

    .line 45
    .line 46
    invoke-virtual {v4}, LF/h0;->k()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {v3, v4}, LF/h0$a;->v(I)V

    .line 51
    .line 52
    .line 53
    iget-object v4, p0, LE/z;->b:LF/h0;

    .line 54
    .line 55
    invoke-virtual {v4}, LF/h0;->g()LF/j0;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v3, v4}, LF/h0$a;->e(LF/j0;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3}, LE/i0;->q()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v3, v4}, LF/h0$a;->a(Ljava/util/Collection;)V

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, LE/z;->e:LE/u$c;

    .line 70
    .line 71
    invoke-virtual {v4}, LE/u$c;->l()LF/q0;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v3, v4}, LF/h0$a;->f(LF/q0;)V

    .line 76
    .line 77
    .line 78
    iget-object v4, p0, LE/z;->e:LE/u$c;

    .line 79
    .line 80
    invoke-virtual {v4}, LE/u$c;->e()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v5, 0x1

    .line 89
    if-le v4, v5, :cond_0

    .line 90
    .line 91
    iget-object v4, p0, LE/z;->e:LE/u$c;

    .line 92
    .line 93
    invoke-virtual {v4}, LE/u$c;->j()LF/q0;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-eqz v4, :cond_0

    .line 98
    .line 99
    iget-object v4, p0, LE/z;->e:LE/u$c;

    .line 100
    .line 101
    invoke-virtual {v4}, LE/u$c;->j()LF/q0;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v3, v4}, LF/h0$a;->f(LF/q0;)V

    .line 106
    .line 107
    .line 108
    :cond_0
    invoke-direct {p0}, LE/z;->l()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_1

    .line 113
    .line 114
    iget-object v6, p0, LE/z;->e:LE/u$c;

    .line 115
    .line 116
    invoke-virtual {v6}, LE/u$c;->g()LF/q0;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v6}, LF/h0$a;->f(LF/q0;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    invoke-virtual {v3, v4}, LF/h0$a;->t(Z)V

    .line 127
    .line 128
    .line 129
    iget-object v4, p0, LE/z;->e:LE/u$c;

    .line 130
    .line 131
    invoke-virtual {v4}, LE/u$c;->d()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-static {v4}, LO/b;->i(I)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-nez v4, :cond_2

    .line 140
    .line 141
    iget-object v4, p0, LE/z;->e:LE/u$c;

    .line 142
    .line 143
    invoke-virtual {v4}, LE/u$c;->d()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-static {v4}, LO/b;->j(I)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_4

    .line 152
    .line 153
    :cond_2
    sget-object v4, LE/z;->g:LN/b;

    .line 154
    .line 155
    invoke-virtual {v4}, LN/b;->a()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_3

    .line 160
    .line 161
    sget-object v4, LF/h0;->i:LF/j0$a;

    .line 162
    .line 163
    invoke-virtual {p3}, LE/i0;->n()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-virtual {v3, v4, v6}, LF/h0$a;->d(LF/j0$a;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_3
    sget-object v4, LF/h0;->j:LF/j0$a;

    .line 175
    .line 176
    invoke-virtual {p0, p3}, LE/z;->g(LE/i0;)I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v3, v4, v6}, LF/h0$a;->d(LF/j0$a;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_4
    invoke-interface {v2}, LF/i0;->a()LF/h0;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-virtual {v4}, LF/h0;->g()LF/j0;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v3, v4}, LF/h0$a;->e(LF/j0;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v2}, LF/i0;->getId()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v3, v1, v2}, LF/h0$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, p1}, LF/h0$a;->r(I)V

    .line 210
    .line 211
    .line 212
    iget-object v2, p0, LE/z;->e:LE/u$c;

    .line 213
    .line 214
    invoke-virtual {v2}, LE/u$c;->a()LF/r;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v3, v2}, LF/h0$a;->c(LF/r;)V

    .line 219
    .line 220
    .line 221
    iget-object v2, p0, LE/z;->e:LE/u$c;

    .line 222
    .line 223
    invoke-virtual {v2}, LE/u$c;->e()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-le v2, v5, :cond_5

    .line 232
    .line 233
    iget-object v2, p0, LE/z;->e:LE/u$c;

    .line 234
    .line 235
    invoke-virtual {v2}, LE/u$c;->i()LF/r;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    if-eqz v2, :cond_5

    .line 240
    .line 241
    iget-object v2, p0, LE/z;->e:LE/u$c;

    .line 242
    .line 243
    invoke-virtual {v2}, LE/u$c;->i()LF/r;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v3, v2}, LF/h0$a;->c(LF/r;)V

    .line 248
    .line 249
    .line 250
    :cond_5
    invoke-virtual {v3}, LF/h0$a;->h()LF/h0;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_6
    new-instance p1, LE/k;

    .line 260
    .line 261
    invoke-direct {p1, v0, p4}, LE/k;-><init>(Ljava/util/List;LE/X;)V

    .line 262
    .line 263
    .line 264
    return-object p1
.end method

.method private c()LF/g0;
    .locals 2

    .line 1
    iget-object v0, p0, LE/z;->a:LF/C0;

    .line 2
    .line 3
    invoke-static {}, Ly/E;->b()LF/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, LF/C0;->f0(LF/g0;)LF/g0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, LF/g0;

    .line 15
    .line 16
    return-object v0
.end method

.method private d(ILF/g0;LE/i0;LE/X;Lm5/a;)LE/S;
    .locals 6

    .line 1
    new-instance v0, LE/S;

    .line 2
    .line 3
    move v5, p1

    .line 4
    move-object v1, p2

    .line 5
    move-object v2, p3

    .line 6
    move-object v3, p4

    .line 7
    move-object v4, p5

    .line 8
    invoke-direct/range {v0 .. v5}, LE/S;-><init>(LF/g0;LE/i0;LE/X;Lm5/a;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private i()I
    .locals 3

    .line 1
    iget-object v0, p0, LE/z;->a:LF/C0;

    .line 2
    .line 3
    sget-object v1, LF/C0;->T:LF/j0$a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    iget-object v0, p0, LE/z;->a:LF/C0;

    .line 20
    .line 21
    sget-object v1, LF/D0;->j:LF/j0$a;

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Integer;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/16 v2, 0x1005

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/16 v1, 0x20

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    return v1

    .line 51
    :cond_2
    const/16 v0, 0x100

    .line 52
    .line 53
    return v0
.end method

.method private l()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/u$c;->g()LF/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/z;->c:LE/u;

    .line 5
    .line 6
    invoke-virtual {v0}, LE/u;->n()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LE/z;->d:LE/Q;

    .line 10
    .line 11
    invoke-virtual {v0}, LE/Q;->n()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method e(LE/i0;LE/X;Lm5/a;)LH0/d;
    .locals 8

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LE/z;->c()LF/g0;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    sget v1, LE/z;->f:I

    .line 9
    .line 10
    add-int/lit8 v0, v1, 0x1

    .line 11
    .line 12
    sput v0, LE/z;->f:I

    .line 13
    .line 14
    new-instance v6, LH0/d;

    .line 15
    .line 16
    invoke-direct {p0, v1, v2, p1, p2}, LE/z;->b(ILF/g0;LE/i0;LE/X;)LE/k;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    move-object v0, p0

    .line 21
    move-object v3, p1

    .line 22
    move-object v4, p2

    .line 23
    move-object v5, p3

    .line 24
    invoke-direct/range {v0 .. v5}, LE/z;->d(ILF/g0;LE/i0;LE/X;Lm5/a;)LE/S;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v6, v7, p1}, LH0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v6
.end method

.method public f(Landroid/util/Size;)LF/k1$b;
    .locals 2

    .line 1
    iget-object v0, p0, LE/z;->a:LF/C0;

    .line 2
    .line 3
    invoke-static {v0, p1}, LF/k1$b;->r(LF/D1;Landroid/util/Size;)LF/k1$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 8
    .line 9
    invoke-virtual {v0}, LE/u$c;->l()LF/q0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, LF/k1$b;->h(LF/q0;)LF/k1$b;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 17
    .line 18
    invoke-virtual {v0}, LE/u$c;->e()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-le v0, v1, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 30
    .line 31
    invoke-virtual {v0}, LE/u$c;->j()LF/q0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 38
    .line 39
    invoke-virtual {v0}, LE/u$c;->j()LF/q0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, LF/k1$b;->h(LF/q0;)LF/k1$b;

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 47
    .line 48
    invoke-virtual {v0}, LE/u$c;->g()LF/q0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 55
    .line 56
    invoke-virtual {v0}, LE/u$c;->g()LF/q0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, LF/k1$b;->y(LF/q0;)LF/k1$b;

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object p1
.end method

.method g(LE/i0;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, LE/i0;->l()Ly/V$f;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LE/i0;->i()Landroid/graphics/Rect;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, LE/z;->e:LE/u$c;

    .line 9
    .line 10
    invoke-virtual {v1}, LE/u$c;->k()Landroid/util/Size;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, LH/z;->h(Landroid/graphics/Rect;Landroid/util/Size;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, LE/i0;->k()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public h()I
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/z;->c:LE/u;

    .line 5
    .line 6
    invoke-virtual {v0}, LE/u;->i()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method j(LE/Y$a;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 5
    .line 6
    invoke-virtual {v0}, LE/u$c;->b()LP/u;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, LP/u;->accept(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public k(Landroidx/camera/core/e$a;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/z;->c:LE/u;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LE/u;->r(Landroidx/camera/core/e$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method m(LE/S;)V
    .locals 1

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE/z;->e:LE/u$c;

    .line 5
    .line 6
    invoke-virtual {v0}, LE/u$c;->h()LP/u;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, LP/u;->accept(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
