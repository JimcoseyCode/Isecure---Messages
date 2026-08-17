.class public final Lc8/e0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lc8/g;


# direct methods
.method public constructor <init>(Lc8/g;)V
    .locals 1

    .line 1
    const-string v0, "typeEnhancement"

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
    iput-object p1, p0, Lc8/e0;->a:Lc8/g;

    .line 10
    .line 11
    return-void
.end method

.method static synthetic a(LL7/b;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0}, Lc8/e0;->n(LL7/b;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(LL7/t0;LL7/b;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc8/e0;->o(LL7/t0;LL7/b;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(LL7/b;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0}, Lc8/e0;->m(LL7/b;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(LC8/M0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lc8/e0;->s(LC8/M0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic e(LC8/M0;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0}, Lc8/e0;->g(LC8/M0;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final f(LC8/S;)Z
    .locals 1

    .line 1
    sget-object v0, Lc8/d0;->g:Lc8/d0;

    .line 2
    .line 3
    invoke-static {p1, v0}, LC8/J0;->c(LC8/S;Lkotlin/jvm/functions/Function1;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method private static final g(LC8/M0;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p0}, LC8/S;->K0()LC8/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, LC8/v0;->p()LL7/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, LL7/J;->getName()Lk8/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, LK7/c;->a:LK7/c;

    .line 19
    .line 20
    invoke-virtual {v1}, LK7/c;->h()Lk8/c;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lk8/c;->g()Lk8/f;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Ls8/e;->k(LL7/m;)Lk8/c;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v1}, LK7/c;->h()Lk8/c;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method private final h(LL7/b;LM7/a;ZLX7/k;LU7/c;Lc8/j0;ZLkotlin/jvm/functions/Function1;)LC8/S;
    .locals 9

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    new-instance v1, Lc8/g0;

    .line 4
    .line 5
    const/16 v7, 0x10

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v2, p2

    .line 10
    move v3, p3

    .line 11
    move-object v4, p4

    .line 12
    move-object v5, p5

    .line 13
    invoke-direct/range {v1 .. v8}, Lc8/g0;-><init>(LM7/a;ZLX7/k;LU7/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    move-object v3, p2

    .line 21
    check-cast v3, LC8/S;

    .line 22
    .line 23
    invoke-interface {p1}, LL7/b;->e()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "getOverriddenDescriptors(...)"

    .line 28
    .line 29
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v4, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 p2, 0xa

    .line 35
    .line 36
    invoke-static {p1, p2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-direct {v4, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_0

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, LL7/b;

    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, LC8/S;

    .line 67
    .line 68
    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move-object v5, p6

    .line 73
    move/from16 v6, p7

    .line 74
    .line 75
    move-object v2, v1

    .line 76
    move-object v1, p0

    .line 77
    invoke-direct/range {v1 .. v6}, Lc8/e0;->i(Lc8/g0;LC8/S;Ljava/util/List;Lc8/j0;Z)LC8/S;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1
.end method

.method private final i(Lc8/g0;LC8/S;Ljava/util/List;Lc8/j0;Z)LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lc8/e0;->a:Lc8/g;

    .line 2
    .line 3
    invoke-virtual {p1, p2, p3, p4, p5}, Lc8/d;->d(LG8/i;Ljava/lang/Iterable;Lc8/j0;Z)Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p1}, Lc8/g0;->z()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p2, p3, p1}, Lc8/g;->a(LC8/S;Lkotlin/jvm/functions/Function1;Z)LC8/S;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method static synthetic j(Lc8/e0;LL7/b;LM7/a;ZLX7/k;LU7/c;Lc8/j0;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LC8/S;
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x20

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move v8, v0

    .line 7
    :goto_0
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object v6, p5

    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move-object/from16 v9, p8

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move/from16 v8, p7

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    invoke-direct/range {v1 .. v9}, Lc8/e0;->h(LL7/b;LM7/a;ZLX7/k;LU7/c;Lc8/j0;ZLkotlin/jvm/functions/Function1;)LC8/S;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method static synthetic k(Lc8/e0;Lc8/g0;LC8/S;Ljava/util/List;Lc8/j0;ZILjava/lang/Object;)LC8/S;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v4, p4

    .line 7
    and-int/lit8 p4, p6, 0x8

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p5, 0x0

    .line 12
    :cond_1
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    move-object v3, p3

    .line 16
    move v5, p5

    .line 17
    invoke-direct/range {v0 .. v5}, Lc8/e0;->i(Lc8/g0;LC8/S;Ljava/util/List;Lc8/j0;Z)LC8/S;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final l(LL7/b;LX7/k;)LL7/b;
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    instance-of v0, v1, LW7/a;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    invoke-interface {v1}, LL7/b;->getKind()LL7/b$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, LL7/b$a;->h:LL7/b$a;

    .line 13
    .line 14
    const/4 v11, 0x1

    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, LL7/b;->a()LL7/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, LL7/b;->e()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, v11, :cond_1

    .line 30
    .line 31
    move-object/from16 v0, p0

    .line 32
    .line 33
    goto/16 :goto_17

    .line 34
    .line 35
    :cond_1
    invoke-direct/range {p0 .. p2}, Lc8/e0;->u(LL7/b;LX7/k;)LM7/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object/from16 v7, p2

    .line 40
    .line 41
    invoke-static {v7, v0}, LX7/c;->k(LX7/k;LM7/h;)LX7/k;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    instance-of v0, v1, LW7/f;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    move-object v0, v1

    .line 50
    check-cast v0, LO7/K;

    .line 51
    .line 52
    invoke-virtual {v0}, LO7/K;->O0()LO7/L;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2}, LO7/J;->S()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, LO7/K;->O0()LO7/L;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v8, v0

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v8, v1

    .line 74
    :goto_0
    invoke-interface {v1}, LL7/a;->h0()LL7/c0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const/4 v12, 0x0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    instance-of v0, v8, LL7/z;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    move-object v0, v8

    .line 86
    check-cast v0, LL7/z;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move-object v0, v12

    .line 90
    :goto_1
    if-eqz v0, :cond_4

    .line 91
    .line 92
    sget-object v2, LW7/e;->M:LL7/a$a;

    .line 93
    .line 94
    invoke-interface {v0, v2}, LL7/a;->g0(LL7/a$a;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, LL7/t0;

    .line 99
    .line 100
    move-object v2, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v2, v12

    .line 103
    :goto_2
    const/4 v5, 0x0

    .line 104
    sget-object v6, Lc8/Z;->g:Lc8/Z;

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    move-object/from16 v0, p0

    .line 108
    .line 109
    invoke-direct/range {v0 .. v6}, Lc8/e0;->t(LL7/b;LL7/t0;LX7/k;Lc8/j0;ZLkotlin/jvm/functions/Function1;)LC8/S;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v13, v2

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move-object v13, v12

    .line 116
    :goto_3
    instance-of v0, v1, LW7/e;

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    move-object v0, v1

    .line 121
    check-cast v0, LW7/e;

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    move-object v0, v12

    .line 125
    :goto_4
    const/4 v14, 0x0

    .line 126
    if-eqz v0, :cond_b

    .line 127
    .line 128
    sget-object v2, Ld8/F;->a:Ld8/F;

    .line 129
    .line 130
    invoke-virtual {v0}, LO7/n;->b()LL7/m;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 135
    .line 136
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    check-cast v4, LL7/e;

    .line 140
    .line 141
    const/4 v5, 0x3

    .line 142
    invoke-static {v0, v14, v14, v5, v12}, Ld8/C;->c(LL7/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v2, v4, v0}, Ld8/B;->a(Ld8/F;LL7/e;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v0, :cond_b

    .line 151
    .line 152
    invoke-static {}, Lc8/X;->u0()Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Lc8/Y;

    .line 161
    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    invoke-virtual {v0}, Lc8/Y;->a()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-eqz v2, :cond_8

    .line 169
    .line 170
    invoke-virtual {v0}, Lc8/Y;->a()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-eqz v2, :cond_7

    .line 175
    .line 176
    const-string v4, "2."

    .line 177
    .line 178
    const/4 v5, 0x2

    .line 179
    invoke-static {v2, v4, v14, v5, v12}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-ne v2, v11, :cond_7

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    const-string v1, "Check failed."

    .line 189
    .line 190
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v0

    .line 194
    :cond_8
    :goto_5
    invoke-virtual {v0}, Lc8/Y;->a()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    if-nez v2, :cond_9

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_9
    invoke-virtual {v0}, Lc8/Y;->d()Lc8/Y;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    goto :goto_6

    .line 206
    :cond_a
    move-object v0, v12

    .line 207
    :goto_6
    move-object v9, v0

    .line 208
    goto :goto_7

    .line 209
    :cond_b
    move-object v9, v12

    .line 210
    :goto_7
    if-eqz v9, :cond_c

    .line 211
    .line 212
    invoke-virtual {v9}, Lc8/Y;->b()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-object v0, v1

    .line 220
    check-cast v0, LW7/e;

    .line 221
    .line 222
    invoke-virtual {v0}, LO7/s;->i()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    :cond_c
    invoke-virtual {v7}, LX7/k;->a()LX7/d;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, LX7/d;->i()LU7/D;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, LU7/V;->c(LU7/D;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-nez v0, :cond_d

    .line 242
    .line 243
    invoke-virtual {v3}, LX7/k;->a()LX7/d;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0}, LX7/d;->q()LX7/e;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0}, LX7/e;->b()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_e

    .line 256
    .line 257
    :cond_d
    invoke-static {v1}, LU7/V;->b(LL7/b;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_e

    .line 262
    .line 263
    move v5, v11

    .line 264
    goto :goto_8

    .line 265
    :cond_e
    move v5, v14

    .line 266
    :goto_8
    invoke-interface {v8}, LL7/a;->i()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const-string v15, "getValueParameters(...)"

    .line 271
    .line 272
    invoke-static {v0, v15}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    new-instance v7, Ljava/util/ArrayList;

    .line 276
    .line 277
    const/16 v10, 0xa

    .line 278
    .line 279
    invoke-static {v0, v10}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v16

    .line 290
    :goto_9
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_10

    .line 295
    .line 296
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    move-object v2, v0

    .line 301
    check-cast v2, LL7/t0;

    .line 302
    .line 303
    if-eqz v9, :cond_f

    .line 304
    .line 305
    invoke-virtual {v9}, Lc8/Y;->b()Ljava/util/List;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_f

    .line 310
    .line 311
    invoke-interface {v2}, LL7/t0;->getIndex()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    invoke-static {v0, v4}, Lj7/q;->h0(Ljava/util/List;I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, Lc8/j0;

    .line 320
    .line 321
    move-object v4, v0

    .line 322
    goto :goto_a

    .line 323
    :cond_f
    move-object v4, v12

    .line 324
    :goto_a
    new-instance v6, Lc8/a0;

    .line 325
    .line 326
    invoke-direct {v6, v2}, Lc8/a0;-><init>(LL7/t0;)V

    .line 327
    .line 328
    .line 329
    move-object/from16 v0, p0

    .line 330
    .line 331
    invoke-direct/range {v0 .. v6}, Lc8/e0;->t(LL7/b;LL7/t0;LX7/k;Lc8/j0;ZLkotlin/jvm/functions/Function1;)LC8/S;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-interface {v7, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_10
    instance-of v0, v1, LL7/Z;

    .line 340
    .line 341
    if-eqz v0, :cond_11

    .line 342
    .line 343
    move-object v0, v1

    .line 344
    check-cast v0, LL7/Z;

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_11
    move-object v0, v12

    .line 348
    :goto_b
    if-eqz v0, :cond_12

    .line 349
    .line 350
    invoke-static {v0}, LY7/d;->a(LL7/Z;)Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-ne v0, v11, :cond_12

    .line 355
    .line 356
    sget-object v0, LU7/c;->j:LU7/c;

    .line 357
    .line 358
    :goto_c
    move-object v5, v0

    .line 359
    goto :goto_d

    .line 360
    :cond_12
    sget-object v0, LU7/c;->h:LU7/c;

    .line 361
    .line 362
    goto :goto_c

    .line 363
    :goto_d
    if-eqz v9, :cond_13

    .line 364
    .line 365
    invoke-virtual {v9}, Lc8/Y;->c()Lc8/j0;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    move-object v6, v0

    .line 370
    :goto_e
    move-object v2, v8

    .line 371
    goto :goto_f

    .line 372
    :cond_13
    move-object v6, v12

    .line 373
    goto :goto_e

    .line 374
    :goto_f
    sget-object v8, Lc8/b0;->g:Lc8/b0;

    .line 375
    .line 376
    const/16 v9, 0x20

    .line 377
    .line 378
    move v0, v10

    .line 379
    const/4 v10, 0x0

    .line 380
    move-object v4, v3

    .line 381
    const/4 v3, 0x1

    .line 382
    move-object/from16 v16, v7

    .line 383
    .line 384
    const/4 v7, 0x0

    .line 385
    move v11, v0

    .line 386
    move-object/from16 p2, v16

    .line 387
    .line 388
    move-object/from16 v0, p0

    .line 389
    .line 390
    invoke-static/range {v0 .. v10}, Lc8/e0;->j(Lc8/e0;LL7/b;LM7/a;ZLX7/k;LU7/c;Lc8/j0;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LC8/S;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-interface {v1}, LL7/a;->getReturnType()LC8/S;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-direct {v0, v3}, Lc8/e0;->f(LC8/S;)Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    const-string v4, "getType(...)"

    .line 406
    .line 407
    if-nez v3, :cond_19

    .line 408
    .line 409
    invoke-interface {v1}, LL7/a;->h0()LL7/c0;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    if-eqz v3, :cond_14

    .line 414
    .line 415
    invoke-interface {v3}, LL7/s0;->getType()LC8/S;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    if-eqz v3, :cond_14

    .line 420
    .line 421
    invoke-direct {v0, v3}, Lc8/e0;->f(LC8/S;)Z

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    goto :goto_10

    .line 426
    :cond_14
    move v3, v14

    .line 427
    :goto_10
    if-nez v3, :cond_19

    .line 428
    .line 429
    invoke-interface {v1}, LL7/a;->i()Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-static {v3, v15}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    if-eqz v3, :cond_16

    .line 437
    .line 438
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    if-eqz v5, :cond_16

    .line 443
    .line 444
    :cond_15
    move v3, v14

    .line 445
    goto :goto_11

    .line 446
    :cond_16
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    :cond_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-eqz v5, :cond_15

    .line 455
    .line 456
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    check-cast v5, LL7/t0;

    .line 461
    .line 462
    invoke-interface {v5}, LL7/s0;->getType()LC8/S;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-static {v5, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-direct {v0, v5}, Lc8/e0;->f(LC8/S;)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-eqz v5, :cond_17

    .line 474
    .line 475
    const/4 v3, 0x1

    .line 476
    :goto_11
    if-eqz v3, :cond_18

    .line 477
    .line 478
    goto :goto_12

    .line 479
    :cond_18
    move v3, v14

    .line 480
    goto :goto_13

    .line 481
    :cond_19
    :goto_12
    const/4 v3, 0x1

    .line 482
    :goto_13
    if-eqz v3, :cond_1a

    .line 483
    .line 484
    invoke-static {}, Lr8/d;->a()LL7/a$a;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    new-instance v5, LU7/n;

    .line 489
    .line 490
    invoke-direct {v5, v1}, LU7/n;-><init>(LL7/m;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v3, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    goto :goto_14

    .line 498
    :cond_1a
    move-object v3, v12

    .line 499
    :goto_14
    if-nez v13, :cond_20

    .line 500
    .line 501
    if-nez v2, :cond_20

    .line 502
    .line 503
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    if-eqz v5, :cond_1c

    .line 508
    .line 509
    :cond_1b
    move/from16 v16, v14

    .line 510
    .line 511
    goto :goto_16

    .line 512
    :cond_1c
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    :cond_1d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v6

    .line 520
    if-eqz v6, :cond_1b

    .line 521
    .line 522
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    check-cast v6, LC8/S;

    .line 527
    .line 528
    if-eqz v6, :cond_1e

    .line 529
    .line 530
    const/4 v6, 0x1

    .line 531
    goto :goto_15

    .line 532
    :cond_1e
    move v6, v14

    .line 533
    :goto_15
    if-eqz v6, :cond_1d

    .line 534
    .line 535
    const/16 v16, 0x1

    .line 536
    .line 537
    :goto_16
    if-nez v16, :cond_20

    .line 538
    .line 539
    if-eqz v3, :cond_1f

    .line 540
    .line 541
    goto :goto_18

    .line 542
    :cond_1f
    :goto_17
    return-object v1

    .line 543
    :cond_20
    :goto_18
    move-object v5, v1

    .line 544
    check-cast v5, LW7/a;

    .line 545
    .line 546
    if-nez v13, :cond_21

    .line 547
    .line 548
    invoke-interface {v1}, LL7/a;->h0()LL7/c0;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    if-eqz v6, :cond_22

    .line 553
    .line 554
    invoke-interface {v6}, LL7/s0;->getType()LC8/S;

    .line 555
    .line 556
    .line 557
    move-result-object v12

    .line 558
    goto :goto_19

    .line 559
    :cond_21
    move-object v12, v13

    .line 560
    :cond_22
    :goto_19
    new-instance v6, Ljava/util/ArrayList;

    .line 561
    .line 562
    move-object/from16 v7, p2

    .line 563
    .line 564
    invoke-static {v7, v11}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 565
    .line 566
    .line 567
    move-result v8

    .line 568
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 569
    .line 570
    .line 571
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    :goto_1a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 576
    .line 577
    .line 578
    move-result v8

    .line 579
    if-eqz v8, :cond_25

    .line 580
    .line 581
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v8

    .line 585
    add-int/lit8 v9, v14, 0x1

    .line 586
    .line 587
    if-gez v14, :cond_23

    .line 588
    .line 589
    invoke-static {}, Lj7/q;->t()V

    .line 590
    .line 591
    .line 592
    :cond_23
    check-cast v8, LC8/S;

    .line 593
    .line 594
    if-nez v8, :cond_24

    .line 595
    .line 596
    invoke-interface {v1}, LL7/a;->i()Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v8

    .line 600
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v8

    .line 604
    check-cast v8, LL7/t0;

    .line 605
    .line 606
    invoke-interface {v8}, LL7/s0;->getType()LC8/S;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    invoke-static {v8, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    :cond_24
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move v14, v9

    .line 617
    goto :goto_1a

    .line 618
    :cond_25
    if-nez v2, :cond_26

    .line 619
    .line 620
    invoke-interface {v1}, LL7/a;->getReturnType()LC8/S;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    :cond_26
    invoke-interface {v5, v12, v6, v2, v3}, LW7/a;->v(LC8/S;Ljava/util/List;LC8/S;Lkotlin/Pair;)LW7/a;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    const-string v2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"

    .line 632
    .line 633
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    return-object v1
.end method

.method private static final m(LL7/b;)LC8/S;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LL7/a;->getReturnType()LC8/S;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method private static final n(LL7/b;)LC8/S;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LL7/a;->h0()LL7/c0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, LL7/s0;->getType()LC8/S;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "getType(...)"

    .line 18
    .line 19
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method private static final o(LL7/t0;LL7/b;)LC8/S;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LL7/a;->i()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0}, LL7/t0;->getIndex()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, LL7/t0;

    .line 19
    .line 20
    invoke-interface {p0}, LL7/s0;->getType()LC8/S;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "getType(...)"

    .line 25
    .line 26
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method private static final s(LC8/M0;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p0, p0, LC8/c0;

    .line 7
    .line 8
    return p0
.end method

.method private final t(LL7/b;LL7/t0;LX7/k;Lc8/j0;ZLkotlin/jvm/functions/Function1;)LC8/S;
    .locals 10

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-interface {p2}, LM7/a;->getAnnotations()LM7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p3, v0}, LX7/c;->k(LX7/k;LM7/h;)LX7/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v5, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move-object v5, p3

    .line 17
    :goto_1
    sget-object v6, LU7/c;->i:LU7/c;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v7, p4

    .line 24
    move v8, p5

    .line 25
    move-object/from16 v9, p6

    .line 26
    .line 27
    invoke-direct/range {v1 .. v9}, Lc8/e0;->h(LL7/b;LM7/a;ZLX7/k;LU7/c;Lc8/j0;ZLkotlin/jvm/functions/Function1;)LC8/S;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method private final u(LL7/b;LX7/k;)LM7/h;
    .locals 5

    .line 1
    invoke-static {p1}, LL7/s;->a(LL7/m;)LL7/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, LM7/a;->getAnnotations()LM7/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    instance-of v1, v0, LY7/n;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, LY7/n;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v2

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, LY7/n;->Q0()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_2
    if-eqz v2, :cond_5

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v1, 0xa

    .line 39
    .line 40
    invoke-static {v2, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lb8/a;

    .line 62
    .line 63
    new-instance v3, LY7/j;

    .line 64
    .line 65
    const/4 v4, 0x1

    .line 66
    invoke-direct {v3, p2, v2, v4}, LY7/j;-><init>(LX7/k;Lb8/a;Z)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    sget-object p2, LM7/h;->a:LM7/h$a;

    .line 74
    .line 75
    invoke-interface {p1}, LM7/a;->getAnnotations()LM7/h;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, v0}, Lj7/q;->x0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p2, p1}, LM7/h$a;->a(Ljava/util/List;)LM7/h;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_5
    :goto_2
    invoke-interface {p1}, LM7/a;->getAnnotations()LM7/h;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method


# virtual methods
.method public final p(LX7/k;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "platformSignatures"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    invoke-static {p2, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, LL7/b;

    .line 37
    .line 38
    invoke-direct {p0, v1, p1}, Lc8/e0;->l(LL7/b;LX7/k;)LL7/b;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v0
.end method

.method public final q(LC8/S;LX7/k;)LC8/S;
    .locals 9

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lc8/g0;

    .line 12
    .line 13
    sget-object v5, LU7/c;->k:LU7/c;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v4, p2

    .line 19
    invoke-direct/range {v1 .. v6}, Lc8/g0;-><init>(LM7/a;ZLX7/k;LU7/c;Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v7, 0xc

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v3, p1

    .line 32
    move-object v2, v1

    .line 33
    move-object v1, p0

    .line 34
    invoke-static/range {v1 .. v8}, Lc8/e0;->k(Lc8/e0;Lc8/g0;LC8/S;Ljava/util/List;Lc8/j0;ZILjava/lang/Object;)LC8/S;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_0
    return-object p1
.end method

.method public final r(LL7/m0;Ljava/util/List;LX7/k;)Ljava/util/List;
    .locals 11

    .line 1
    const-string v1, "typeParameter"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "bounds"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "context"

    .line 12
    .line 13
    invoke-static {p3, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {p2, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object v10, v2

    .line 42
    check-cast v10, LC8/S;

    .line 43
    .line 44
    sget-object v2, Lc8/c0;->g:Lc8/c0;

    .line 45
    .line 46
    invoke-static {v10, v2}, LH8/d;->e(LC8/S;Lkotlin/jvm/functions/Function1;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    move-object v5, v10

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    new-instance v2, Lc8/g0;

    .line 55
    .line 56
    sget-object v6, LU7/c;->l:LU7/c;

    .line 57
    .line 58
    const/16 v8, 0x10

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    move-object v3, p1

    .line 64
    move-object v5, p3

    .line 65
    invoke-direct/range {v2 .. v9}, Lc8/g0;-><init>(LM7/a;ZLX7/k;LU7/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const/16 v9, 0xc

    .line 73
    .line 74
    move-object v5, v10

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    move-object v3, p0

    .line 79
    move-object v4, v2

    .line 80
    invoke-static/range {v3 .. v10}, Lc8/e0;->k(Lc8/e0;Lc8/g0;LC8/S;Ljava/util/List;Lc8/j0;ZILjava/lang/Object;)LC8/S;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    if-nez v10, :cond_1

    .line 85
    .line 86
    :goto_1
    move-object v10, v5

    .line 87
    :cond_1
    invoke-interface {v1, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    return-object v1
.end method
