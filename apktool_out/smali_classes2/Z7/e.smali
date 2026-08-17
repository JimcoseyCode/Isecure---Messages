.class public final LZ7/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LX7/k;

.field private final b:LX7/p;

.field private final c:LZ7/g;

.field private final d:LC8/A0;


# direct methods
.method public constructor <init>(LX7/k;LX7/p;)V
    .locals 2

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LZ7/e;->a:LX7/k;

    .line 15
    .line 16
    iput-object p2, p0, LZ7/e;->b:LX7/p;

    .line 17
    .line 18
    new-instance p1, LZ7/g;

    .line 19
    .line 20
    invoke-direct {p1}, LZ7/g;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LZ7/e;->c:LZ7/g;

    .line 24
    .line 25
    new-instance p2, LC8/A0;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {p2, p1, v0, v1, v0}, LC8/A0;-><init>(LC8/F;LC8/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, LZ7/e;->d:LC8/A0;

    .line 33
    .line 34
    return-void
.end method

.method static synthetic a(LZ7/e;LL7/m0;LZ7/a;LC8/v0;Lb8/j;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LZ7/e;->e(LZ7/e;LL7/m0;LZ7/a;LC8/v0;Lb8/j;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(Lb8/j;LL7/e;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Lb8/j;->B()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lj7/q;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lb8/x;

    .line 10
    .line 11
    invoke-static {p1}, Lb8/A;->a(Lb8/x;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    sget-object p1, LK7/d;->a:LK7/d;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, LK7/d;->b(LL7/e;)LL7/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, LL7/h;->j()LC8/v0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, LC8/v0;->getParameters()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p2, "getParameters(...)"

    .line 34
    .line 35
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lj7/q;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, LL7/m0;

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-interface {p1}, LL7/m0;->m()LC8/N0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    sget-object p2, LC8/N0;->m:LC8/N0;

    .line 53
    .line 54
    if-eq p1, p2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_1
    return v0
.end method

.method private final c(Lb8/j;LZ7/a;LC8/v0;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-interface {p1}, Lb8/j;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "getParameters(...)"

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Lb8/j;->B()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p3}, LC8/v0;->getParameters()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 36
    :goto_1
    invoke-interface {p3}, LC8/v0;->getParameters()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-direct {p0, p1, v2, p3, p2}, LZ7/e;->d(Lb8/j;Ljava/util/List;LC8/v0;LZ7/a;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-interface {p1}, Lb8/j;->B()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    const/16 v0, 0xa

    .line 63
    .line 64
    if-eq p2, p3, :cond_4

    .line 65
    .line 66
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-static {v2, v0}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    if-eqz p3, :cond_3

    .line 84
    .line 85
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    check-cast p3, LL7/m0;

    .line 90
    .line 91
    new-instance v0, LC8/D0;

    .line 92
    .line 93
    sget-object v1, LE8/k;->c0:LE8/k;

    .line 94
    .line 95
    invoke-interface {p3}, LL7/J;->getName()Lk8/f;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3}, Lk8/f;->j()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    filled-new-array {p3}, [Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-static {v1, p3}, LE8/l;->d(LE8/k;[Ljava/lang/String;)LE8/i;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-direct {v0, p3}, LC8/D0;-><init>(LC8/S;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    invoke-static {p1}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :cond_4
    invoke-interface {p1}, Lb8/j;->B()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lj7/q;->V0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance p2, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {p1, v0}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    if-eqz p3, :cond_5

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    check-cast p3, Lj7/G;

    .line 155
    .line 156
    invoke-virtual {p3}, Lj7/G;->a()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    invoke-virtual {p3}, Lj7/G;->b()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    check-cast p3, Lb8/x;

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, LL7/m0;

    .line 174
    .line 175
    sget-object v3, LC8/I0;->h:LC8/I0;

    .line 176
    .line 177
    const/4 v7, 0x7

    .line 178
    const/4 v8, 0x0

    .line 179
    const/4 v4, 0x0

    .line 180
    const/4 v5, 0x0

    .line 181
    const/4 v6, 0x0

    .line 182
    invoke-static/range {v3 .. v8}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-direct {p0, p3, v1, v0}, LZ7/e;->q(Lb8/x;LZ7/a;LL7/m0;)LC8/B0;

    .line 190
    .line 191
    .line 192
    move-result-object p3

    .line 193
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_5
    invoke-static {p2}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    return-object p1
.end method

.method private final d(Lb8/j;Ljava/util/List;LC8/v0;LZ7/a;)Ljava/util/List;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p2, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v4, v1

    .line 27
    check-cast v4, LL7/m0;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p4}, LZ7/a;->c()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v4, v1, v2}, LH8/d;->q(LL7/m0;LC8/v0;Ljava/util/Set;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-static {v4, p4}, LC8/J0;->t(LL7/m0;LC8/G;)LC8/B0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    move-object v3, p0

    .line 45
    move-object v7, p1

    .line 46
    move-object v6, p3

    .line 47
    move-object v5, p4

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v1, LC8/Y;

    .line 50
    .line 51
    iget-object v2, p0, LZ7/e;->a:LX7/k;

    .line 52
    .line 53
    invoke-virtual {v2}, LX7/k;->e()LB8/n;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    new-instance v2, LZ7/d;

    .line 58
    .line 59
    move-object v3, p0

    .line 60
    move-object v7, p1

    .line 61
    move-object v6, p3

    .line 62
    move-object v5, p4

    .line 63
    invoke-direct/range {v2 .. v7}, LZ7/d;-><init>(LZ7/e;LL7/m0;LZ7/a;LC8/v0;Lb8/j;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v8, v2}, LC8/Y;-><init>(LB8/n;Lw7/a;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, v3, LZ7/e;->c:LZ7/g;

    .line 70
    .line 71
    invoke-interface {v7}, Lb8/j;->u()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    invoke-virtual {v5, p3}, LZ7/a;->j(Z)LZ7/a;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    iget-object p4, v3, LZ7/e;->d:LC8/A0;

    .line 80
    .line 81
    invoke-virtual {p1, v4, p3, p4, v1}, LZ7/g;->a(LL7/m0;LC8/G;LC8/A0;LC8/S;)LC8/B0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-object p4, v5

    .line 89
    move-object p3, v6

    .line 90
    move-object p1, v7

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move-object v3, p0

    .line 93
    return-object v0
.end method

.method private static final e(LZ7/e;LL7/m0;LZ7/a;LC8/v0;Lb8/j;)LC8/S;
    .locals 0

    .line 1
    iget-object p0, p0, LZ7/e;->d:LC8/A0;

    .line 2
    .line 3
    invoke-interface {p3}, LC8/v0;->p()LL7/h;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-interface {p3}, LL7/h;->r()LC8/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    :goto_0
    invoke-virtual {p2, p3}, LZ7/a;->k(LC8/d0;)LZ7/a;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p4}, Lb8/j;->u()Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    invoke-virtual {p2, p3}, LZ7/a;->j(Z)LZ7/a;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p0, p1, p2}, LC8/A0;->e(LL7/m0;LC8/G;)LC8/S;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method private final f(Lb8/j;LZ7/a;LC8/d0;)LC8/d0;
    .locals 8

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p3}, LC8/S;->J0()LC8/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    move-object v3, p1

    .line 11
    :goto_0
    move-object v1, v0

    .line 12
    goto :goto_2

    .line 13
    :cond_1
    :goto_1
    new-instance v1, LX7/g;

    .line 14
    .line 15
    iget-object v2, p0, LZ7/e;->a:LX7/k;

    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v3, p1

    .line 21
    invoke-direct/range {v1 .. v6}, LX7/g;-><init>(LX7/k;Lb8/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, LC8/s0;->b(LM7/h;)LC8/r0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :goto_2
    invoke-direct {p0, v3, p2}, LZ7/e;->g(Lb8/j;LZ7/a;)LC8/v0;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 p1, 0x0

    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_2
    invoke-direct {p0, p2}, LZ7/e;->j(LZ7/a;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    invoke-virtual {p3}, LC8/S;->K0()LC8/v0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_3
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    invoke-interface {v3}, Lb8/j;->u()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    invoke-virtual {p3, p1}, LC8/d0;->R0(Z)LC8/d0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_4
    invoke-direct {p0, v3, p2, v2}, LZ7/e;->c(Lb8/j;LZ7/a;LC8/v0;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const/16 v6, 0x10

    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-static/range {v1 .. v7}, LC8/V;->k(LC8/r0;LC8/v0;Ljava/util/List;ZLD8/g;ILjava/lang/Object;)LC8/d0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method private final g(Lb8/j;LZ7/a;)LC8/v0;
    .locals 3

    .line 1
    invoke-interface {p1}, Lb8/j;->getClassifier()Lb8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, LZ7/e;->h(Lb8/j;)LC8/v0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    instance-of v1, v0, Lb8/g;

    .line 13
    .line 14
    if-eqz v1, :cond_5

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Lb8/g;

    .line 18
    .line 19
    invoke-interface {v1}, Lb8/g;->d()Lk8/c;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_4

    .line 24
    .line 25
    invoke-direct {p0, p1, p2, v2}, LZ7/e;->k(Lb8/j;LZ7/a;Lk8/c;)LL7/e;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    iget-object p2, p0, LZ7/e;->a:LX7/k;

    .line 32
    .line 33
    invoke-virtual {p2}, LX7/k;->a()LX7/d;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, LX7/d;->n()LX7/n;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {p2, v1}, LX7/n;->a(Lb8/g;)LL7/e;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :cond_1
    if-eqz p2, :cond_3

    .line 46
    .line 47
    invoke-interface {p2}, LL7/h;->j()LC8/v0;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-nez p2, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object p2

    .line 55
    :cond_3
    :goto_0
    invoke-direct {p0, p1}, LZ7/e;->h(Lb8/j;)LC8/v0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string p2, "Class type should have a FQ name: "

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance p2, Ljava/lang/AssertionError;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_5
    instance-of p1, v0, Lb8/y;

    .line 84
    .line 85
    if-eqz p1, :cond_7

    .line 86
    .line 87
    iget-object p1, p0, LZ7/e;->b:LX7/p;

    .line 88
    .line 89
    check-cast v0, Lb8/y;

    .line 90
    .line 91
    invoke-interface {p1, v0}, LX7/p;->a(Lb8/y;)LL7/m0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_6

    .line 96
    .line 97
    invoke-interface {p1}, LL7/m0;->j()LC8/v0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_6
    const/4 p1, 0x0

    .line 103
    return-object p1

    .line 104
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance p2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v1, "Unknown classifier kind: "

    .line 112
    .line 113
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
.end method

.method private final h(Lb8/j;)LC8/v0;
    .locals 2

    .line 1
    sget-object v0, Lk8/b;->d:Lk8/b$a;

    .line 2
    .line 3
    new-instance v1, Lk8/c;

    .line 4
    .line 5
    invoke-interface {p1}, Lb8/j;->v()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v1, p1}, Lk8/c;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, LZ7/e;->a:LX7/k;

    .line 17
    .line 18
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, LX7/d;->b()Ld8/n;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ld8/n;->f()Ly8/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ly8/n;->r()LL7/M;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, p1, v1}, LL7/M;->d(Lk8/b;Ljava/util/List;)LL7/e;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, LL7/h;->j()LC8/v0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "getTypeConstructor(...)"

    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method private final i(LC8/N0;LL7/m0;)Z
    .locals 3

    .line 1
    invoke-interface {p2}, LL7/m0;->m()LC8/N0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LC8/N0;->k:LC8/N0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-interface {p2}, LL7/m0;->m()LC8/N0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eq p1, p2, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_1
    return v2
.end method

.method private final j(LZ7/a;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LZ7/a;->g()LZ7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LZ7/c;->i:LZ7/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-virtual {p1}, LZ7/a;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, LZ7/a;->b()LC8/I0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, LC8/I0;->g:LC8/I0;

    .line 22
    .line 23
    if-eq p1, v0, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1
    return v2
.end method

.method private final k(Lb8/j;LZ7/a;Lk8/c;)LL7/e;
    .locals 6

    .line 1
    invoke-virtual {p2}, LZ7/a;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, LZ7/f;->a()Lk8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, LZ7/e;->a:LX7/k;

    .line 18
    .line 19
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, LX7/d;->p()LI7/n;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, LI7/n;->d()LL7/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    sget-object v0, LK7/d;->a:LK7/d;

    .line 33
    .line 34
    iget-object v1, p0, LZ7/e;->a:LX7/k;

    .line 35
    .line 36
    invoke-virtual {v1}, LX7/k;->d()LL7/H;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, LL7/H;->n()LI7/i;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v4, 0x4

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v1, p3

    .line 48
    invoke-static/range {v0 .. v5}, LK7/d;->f(LK7/d;Lk8/c;LI7/i;Ljava/lang/Integer;ILjava/lang/Object;)LL7/e;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    if-nez p3, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    return-object p1

    .line 56
    :cond_1
    invoke-virtual {v0, p3}, LK7/d;->d(LL7/e;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, LZ7/a;->g()LZ7/c;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget-object v2, LZ7/c;->i:LZ7/c;

    .line 67
    .line 68
    if-eq v1, v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {p2}, LZ7/a;->b()LC8/I0;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    sget-object v1, LC8/I0;->g:LC8/I0;

    .line 75
    .line 76
    if-eq p2, v1, :cond_2

    .line 77
    .line 78
    invoke-direct {p0, p1, p3}, LZ7/e;->b(Lb8/j;LL7/e;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    :cond_2
    invoke-virtual {v0, p3}, LK7/d;->b(LL7/e;)LL7/e;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_3
    return-object p3
.end method

.method public static synthetic m(LZ7/e;Lb8/f;LZ7/a;ZILjava/lang/Object;)LC8/S;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LZ7/e;->l(Lb8/f;LZ7/a;Z)LC8/S;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final n(Lb8/j;LZ7/a;)LC8/S;
    .locals 3

    .line 1
    invoke-virtual {p2}, LZ7/a;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, LZ7/a;->b()LC8/I0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, LC8/I0;->g:LC8/I0;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-interface {p1}, Lb8/j;->u()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-direct {p0, p1, p2, v2}, LZ7/e;->f(Lb8/j;LZ7/a;LC8/d0;)LC8/d0;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_1
    invoke-static {p1}, LZ7/e;->o(Lb8/j;)LE8/i;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_2
    sget-object v0, LZ7/c;->i:LZ7/c;

    .line 40
    .line 41
    invoke-virtual {p2, v0}, LZ7/a;->l(LZ7/c;)LZ7/a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p0, p1, v0, v2}, LZ7/e;->f(Lb8/j;LZ7/a;LC8/d0;)LC8/d0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    invoke-static {p1}, LZ7/e;->o(Lb8/j;)LE8/i;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_3
    sget-object v2, LZ7/c;->h:LZ7/c;

    .line 57
    .line 58
    invoke-virtual {p2, v2}, LZ7/a;->l(LZ7/c;)LZ7/a;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p0, p1, p2, v0}, LZ7/e;->f(Lb8/j;LZ7/a;LC8/d0;)LC8/d0;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-nez p2, :cond_4

    .line 67
    .line 68
    invoke-static {p1}, LZ7/e;->o(Lb8/j;)LE8/i;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_4
    if-eqz v1, :cond_5

    .line 74
    .line 75
    new-instance p1, LZ7/k;

    .line 76
    .line 77
    invoke-direct {p1, v0, p2}, LZ7/k;-><init>(LC8/d0;LC8/d0;)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_5
    invoke-static {v0, p2}, LC8/V;->e(LC8/d0;LC8/d0;)LC8/M0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method

.method private static final o(Lb8/j;)LE8/i;
    .locals 1

    .line 1
    sget-object v0, LE8/k;->l:LE8/k;

    .line 2
    .line 3
    invoke-interface {p0}, Lb8/j;->m()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p0}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {v0, p0}, LE8/l;->d(LE8/k;[Ljava/lang/String;)LE8/i;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private final q(Lb8/x;LZ7/a;LL7/m0;)LC8/B0;
    .locals 8

    .line 1
    instance-of v0, p1, Lb8/C;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    check-cast p1, Lb8/C;

    .line 6
    .line 7
    invoke-interface {p1}, Lb8/C;->y()Lb8/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1}, Lb8/C;->F()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v1, LC8/N0;->m:LC8/N0;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v1, LC8/N0;->l:LC8/N0;

    .line 21
    .line 22
    :goto_0
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-direct {p0, v1, p3}, LZ7/e;->i(LC8/N0;LL7/m0;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object p2, p0, LZ7/e;->a:LX7/k;

    .line 32
    .line 33
    invoke-static {p2, p1}, LU7/V;->a(LX7/k;Lb8/C;)LM7/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v2, LC8/I0;->h:LC8/I0;

    .line 38
    .line 39
    const/4 v6, 0x7

    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static/range {v2 .. v7}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0, v0, p2}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 55
    .line 56
    invoke-virtual {p2}, LC8/S;->getAnnotations()LM7/h;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v2, p1}, Lj7/q;->y0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, LM7/h$a;->a(Ljava/util/List;)LM7/h;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p2, p1}, LH8/d;->C(LC8/S;LM7/h;)LC8/S;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_2
    invoke-static {p2, v1, p3}, LH8/d;->k(LC8/S;LC8/N0;LL7/m0;)LC8/B0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_3
    :goto_1
    invoke-static {p3, p2}, LC8/J0;->t(LL7/m0;LC8/G;)LC8/B0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p2, "makeStarProjection(...)"

    .line 82
    .line 83
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_4
    new-instance p3, LC8/D0;

    .line 88
    .line 89
    sget-object v0, LC8/N0;->k:LC8/N0;

    .line 90
    .line 91
    invoke-virtual {p0, p1, p2}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p3, v0, p1}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 96
    .line 97
    .line 98
    return-object p3
.end method


# virtual methods
.method public final l(Lb8/f;LZ7/a;Z)LC8/S;
    .locals 11

    .line 1
    const-string v0, "arrayType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attr"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lb8/f;->l()Lb8/x;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lb8/v;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, Lb8/v;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v2

    .line 25
    :goto_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Lb8/v;->getType()LI7/l;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    new-instance v1, LX7/g;

    .line 32
    .line 33
    iget-object v3, p0, LZ7/e;->a:LX7/k;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-direct {v1, v3, p1, v4}, LX7/g;-><init>(LX7/k;Lb8/d;Z)V

    .line 37
    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget-object p1, p0, LZ7/e;->a:LX7/k;

    .line 42
    .line 43
    invoke-virtual {p1}, LX7/k;->d()LL7/H;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, LL7/H;->n()LI7/i;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1, v2}, LI7/i;->O(LI7/l;)LC8/d0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance p3, LM7/o;

    .line 59
    .line 60
    invoke-virtual {p1}, LC8/S;->getAnnotations()LM7/h;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v2, 0x2

    .line 65
    new-array v2, v2, [LM7/h;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    aput-object v0, v2, v3

    .line 69
    .line 70
    aput-object v1, v2, v4

    .line 71
    .line 72
    invoke-direct {p3, v2}, LM7/o;-><init>([LM7/h;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, p3}, LH8/d;->C(LC8/S;LM7/h;)LC8/S;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string p3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 80
    .line 81
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast p1, LC8/d0;

    .line 85
    .line 86
    invoke-virtual {p2}, LZ7/a;->h()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_2

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_2
    invoke-virtual {p1, v4}, LC8/d0;->R0(Z)LC8/d0;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {p1, p2}, LC8/V;->e(LC8/d0;LC8/d0;)LC8/M0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_3
    sget-object v5, LC8/I0;->h:LC8/I0;

    .line 103
    .line 104
    invoke-virtual {p2}, LZ7/a;->h()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    const/4 v9, 0x6

    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    invoke-static/range {v5 .. v10}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, v0, p1}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p2}, LZ7/a;->h()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    const-string v0, "getArrayType(...)"

    .line 125
    .line 126
    if-eqz p2, :cond_5

    .line 127
    .line 128
    if-eqz p3, :cond_4

    .line 129
    .line 130
    sget-object p2, LC8/N0;->m:LC8/N0;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    sget-object p2, LC8/N0;->k:LC8/N0;

    .line 134
    .line 135
    :goto_1
    iget-object p3, p0, LZ7/e;->a:LX7/k;

    .line 136
    .line 137
    invoke-virtual {p3}, LX7/k;->d()LL7/H;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-interface {p3}, LL7/H;->n()LI7/i;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-virtual {p3, p2, p1, v1}, LI7/i;->m(LC8/N0;LC8/S;LM7/h;)LC8/d0;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_5
    iget-object p2, p0, LZ7/e;->a:LX7/k;

    .line 154
    .line 155
    invoke-virtual {p2}, LX7/k;->d()LL7/H;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-interface {p2}, LL7/H;->n()LI7/i;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    sget-object p3, LC8/N0;->k:LC8/N0;

    .line 164
    .line 165
    invoke-virtual {p2, p3, p1, v1}, LI7/i;->m(LC8/N0;LC8/S;LM7/h;)LC8/d0;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object p3, p0, LZ7/e;->a:LX7/k;

    .line 173
    .line 174
    invoke-virtual {p3}, LX7/k;->d()LL7/H;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-interface {p3}, LL7/H;->n()LI7/i;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    sget-object v0, LC8/N0;->m:LC8/N0;

    .line 183
    .line 184
    invoke-virtual {p3, v0, p1, v1}, LI7/i;->m(LC8/N0;LC8/S;LM7/h;)LC8/d0;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1, v4}, LC8/d0;->R0(Z)LC8/d0;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {p2, p1}, LC8/V;->e(LC8/d0;LC8/d0;)LC8/M0;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    return-object p1
.end method

.method public final p(Lb8/x;LZ7/a;)LC8/S;
    .locals 7

    .line 1
    const-string v0, "attr"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lb8/v;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Lb8/v;

    .line 11
    .line 12
    invoke-interface {p1}, Lb8/v;->getType()LI7/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, LZ7/e;->a:LX7/k;

    .line 19
    .line 20
    invoke-virtual {p2}, LX7/k;->d()LL7/H;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, LL7/H;->n()LI7/i;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2, p1}, LI7/i;->R(LI7/l;)LC8/d0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p1, p0, LZ7/e;->a:LX7/k;

    .line 34
    .line 35
    invoke-virtual {p1}, LX7/k;->d()LL7/H;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, LL7/H;->n()LI7/i;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, LI7/i;->Z()LC8/d0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    instance-of v0, p1, Lb8/j;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    check-cast p1, Lb8/j;

    .line 56
    .line 57
    invoke-direct {p0, p1, p2}, LZ7/e;->n(Lb8/j;LZ7/a;)LC8/S;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_2
    instance-of v0, p1, Lb8/f;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    move-object v2, p1

    .line 67
    check-cast v2, Lb8/f;

    .line 68
    .line 69
    const/4 v5, 0x4

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    move-object v1, p0

    .line 73
    move-object v3, p2

    .line 74
    invoke-static/range {v1 .. v6}, LZ7/e;->m(LZ7/e;Lb8/f;LZ7/a;ZILjava/lang/Object;)LC8/S;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    move-object v1, p0

    .line 80
    move-object v3, p2

    .line 81
    instance-of p2, p1, Lb8/C;

    .line 82
    .line 83
    const-string v0, "getDefaultBound(...)"

    .line 84
    .line 85
    if-eqz p2, :cond_6

    .line 86
    .line 87
    check-cast p1, Lb8/C;

    .line 88
    .line 89
    invoke-interface {p1}, Lb8/C;->y()Lb8/x;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    invoke-virtual {p0, p1, v3}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    return-object p1

    .line 103
    :cond_5
    :goto_1
    iget-object p1, v1, LZ7/e;->a:LX7/k;

    .line 104
    .line 105
    invoke-virtual {p1}, LX7/k;->d()LL7/H;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1}, LL7/H;->n()LI7/i;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, LI7/i;->y()LC8/d0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_6
    if-nez p1, :cond_7

    .line 122
    .line 123
    iget-object p1, v1, LZ7/e;->a:LX7/k;

    .line 124
    .line 125
    invoke-virtual {p1}, LX7/k;->d()LL7/H;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-interface {p1}, LL7/H;->n()LI7/i;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, LI7/i;->y()LC8/d0;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object p1

    .line 141
    :cond_7
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    .line 142
    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v2, "Unsupported type: "

    .line 149
    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p2
.end method
