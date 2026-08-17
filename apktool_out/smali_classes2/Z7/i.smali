.class public final LZ7/i;
.super LC8/E0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ7/i$a;
    }
.end annotation


# static fields
.field public static final e:LZ7/i$a;

.field private static final f:LZ7/a;

.field private static final g:LZ7/a;


# instance fields
.field private final c:LZ7/g;

.field private final d:LC8/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, LZ7/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LZ7/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LZ7/i;->e:LZ7/i$a;

    .line 8
    .line 9
    sget-object v2, LC8/I0;->h:LC8/I0;

    .line 10
    .line 11
    const/4 v6, 0x5

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static/range {v2 .. v7}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, LZ7/c;->i:LZ7/c;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, LZ7/a;->l(LZ7/c;)LZ7/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, LZ7/i;->f:LZ7/a;

    .line 27
    .line 28
    invoke-static/range {v2 .. v7}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, LZ7/c;->h:LZ7/c;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, LZ7/a;->l(LZ7/c;)LZ7/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LZ7/i;->g:LZ7/a;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(LC8/A0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, LC8/E0;-><init>()V

    .line 2
    new-instance v0, LZ7/g;

    invoke-direct {v0}, LZ7/g;-><init>()V

    iput-object v0, p0, LZ7/i;->c:LZ7/g;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, LC8/A0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, LC8/A0;-><init>(LC8/F;LC8/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    iput-object p1, p0, LZ7/i;->d:LC8/A0;

    return-void
.end method

.method public synthetic constructor <init>(LC8/A0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, LZ7/i;-><init>(LC8/A0;)V

    return-void
.end method

.method static synthetic i(LL7/e;LZ7/i;LC8/d0;LZ7/a;LD8/g;)LC8/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LZ7/i;->k(LL7/e;LZ7/i;LC8/d0;LZ7/a;LD8/g;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final j(LC8/d0;LL7/e;LZ7/a;)Lkotlin/Pair;
    .locals 13

    .line 1
    move-object/from16 v3, p3

    .line 2
    .line 3
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, LC8/v0;->getParameters()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {p1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-static {p1}, LI7/i;->c0(LC8/S;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, LC8/S;->I0()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, LC8/B0;

    .line 40
    .line 41
    new-instance v1, LC8/D0;

    .line 42
    .line 43
    invoke-interface {v0}, LC8/B0;->a()LC8/N0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v0}, LC8/B0;->getType()LC8/S;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v4, "getType(...)"

    .line 52
    .line 53
    invoke-static {v0, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v0, v3}, LZ7/i;->l(LC8/S;LZ7/a;)LC8/S;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {v1, v2, v0}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {p1}, LC8/S;->J0()LC8/r0;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {p1}, LC8/S;->L0()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    const/16 v8, 0x10

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    invoke-static/range {v3 .. v9}, LC8/V;->k(LC8/r0;LC8/v0;Ljava/util/List;ZLD8/g;ILjava/lang/Object;)LC8/d0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-static {p1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    :cond_1
    invoke-static {p1}, LC8/W;->a(LC8/S;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_2

    .line 99
    .line 100
    sget-object v0, LE8/k;->Q:LE8/k;

    .line 101
    .line 102
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    filled-new-array {p1}, [Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {v0, p1}, LE8/l;->d(LE8/k;[Ljava/lang/String;)LE8/i;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-static {p1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :cond_2
    invoke-interface {p2, p0}, LL7/e;->n0(LC8/E0;)Lv8/k;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    const-string v1, "getMemberScope(...)"

    .line 130
    .line 131
    invoke-static {v8, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, LC8/S;->J0()LC8/r0;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-interface {p2}, LL7/h;->j()LC8/v0;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    const-string v1, "getTypeConstructor(...)"

    .line 143
    .line 144
    invoke-static {v10, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p2}, LL7/h;->j()LC8/v0;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-interface {v1}, LC8/v0;->getParameters()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const-string v2, "getParameters(...)"

    .line 156
    .line 157
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    new-instance v11, Ljava/util/ArrayList;

    .line 161
    .line 162
    const/16 v2, 0xa

    .line 163
    .line 164
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_3

    .line 180
    .line 181
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    move-object v2, v1

    .line 186
    check-cast v2, LL7/m0;

    .line 187
    .line 188
    iget-object v1, p0, LZ7/i;->c:LZ7/g;

    .line 189
    .line 190
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-object v4, p0, LZ7/i;->d:LC8/A0;

    .line 194
    .line 195
    const/16 v6, 0x8

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    const/4 v5, 0x0

    .line 199
    invoke-static/range {v1 .. v7}, LC8/F;->b(LC8/F;LL7/m0;LC8/G;LC8/A0;LC8/S;ILjava/lang/Object;)LC8/B0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-interface {v11, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_3
    invoke-virtual {p1}, LC8/S;->L0()Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    new-instance v5, LZ7/h;

    .line 212
    .line 213
    invoke-direct {v5, p2, p0, p1, v3}, LZ7/h;-><init>(LL7/e;LZ7/i;LC8/d0;LZ7/a;)V

    .line 214
    .line 215
    .line 216
    move v3, v1

    .line 217
    move-object v4, v8

    .line 218
    move-object v0, v9

    .line 219
    move-object v1, v10

    .line 220
    move-object v2, v11

    .line 221
    invoke-static/range {v0 .. v5}, LC8/V;->n(LC8/r0;LC8/v0;Ljava/util/List;ZLv8/k;Lkotlin/jvm/functions/Function1;)LC8/d0;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-static {p1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    return-object p1
.end method

.method private static final k(LL7/e;LZ7/i;LC8/d0;LZ7/a;LD8/g;)LC8/d0;
    .locals 2

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ls8/e;->n(LL7/h;)Lk8/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    invoke-virtual {p4, v0}, LD8/g;->b(Lk8/b;)LL7/e;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    if-nez p4, :cond_1

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    invoke-static {p4, p0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_2
    invoke-direct {p1, p2, p4, p3}, LZ7/i;->j(LC8/d0;LL7/e;LZ7/a;)Lkotlin/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, LC8/d0;

    .line 37
    .line 38
    return-object p0
.end method

.method private final l(LC8/S;LZ7/a;)LC8/S;
    .locals 3

    .line 1
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LC8/v0;->p()LL7/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, LL7/m0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, LZ7/i;->d:LC8/A0;

    .line 14
    .line 15
    check-cast v0, LL7/m0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {p2, v1}, LZ7/a;->j(Z)LZ7/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v0, v1}, LC8/A0;->e(LL7/m0;LC8/G;)LC8/S;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1, p2}, LZ7/i;->l(LC8/S;LZ7/a;)LC8/S;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_0
    instance-of p2, v0, LL7/e;

    .line 32
    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    invoke-static {p1}, LC8/L;->d(LC8/S;)LC8/d0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, LC8/S;->K0()LC8/v0;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p2}, LC8/v0;->p()LL7/h;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    instance-of v1, p2, LL7/e;

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-static {p1}, LC8/L;->c(LC8/S;)LC8/d0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v0, LL7/e;

    .line 56
    .line 57
    sget-object v2, LZ7/i;->f:LZ7/a;

    .line 58
    .line 59
    invoke-direct {p0, v1, v0, v2}, LZ7/i;->j(LC8/d0;LL7/e;LZ7/a;)Lkotlin/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, LC8/d0;

    .line 68
    .line 69
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p1}, LC8/L;->d(LC8/S;)LC8/d0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p2, LL7/e;

    .line 84
    .line 85
    sget-object v2, LZ7/i;->g:LZ7/a;

    .line 86
    .line 87
    invoke-direct {p0, p1, p2, v2}, LZ7/i;->j(LC8/d0;LL7/e;LZ7/a;)Lkotlin/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, LC8/d0;

    .line 96
    .line 97
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    invoke-static {v1, p2}, LC8/V;->e(LC8/d0;LC8/d0;)LC8/M0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :cond_2
    :goto_0
    new-instance p1, LZ7/k;

    .line 118
    .line 119
    invoke-direct {p1, v1, p2}, LZ7/k;-><init>(LC8/d0;LC8/d0;)V

    .line 120
    .line 121
    .line 122
    return-object p1

    .line 123
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v1, "For some reason declaration for upper bound is not a class but \""

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p2, "\" while for lower it\'s \""

    .line 137
    .line 138
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const/16 p2, 0x22

    .line 145
    .line 146
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p2

    .line 163
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    new-instance p2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v1, "Unexpected declaration kind: "

    .line 171
    .line 172
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
.end method

.method static synthetic m(LZ7/i;LC8/S;LZ7/a;ILjava/lang/Object;)LC8/S;
    .locals 9

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance v0, LZ7/a;

    .line 6
    .line 7
    sget-object v1, LC8/I0;->h:LC8/I0;

    .line 8
    .line 9
    const/16 v7, 0x3e

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-direct/range {v0 .. v8}, LZ7/a;-><init>(LC8/I0;LZ7/c;ZZLjava/util/Set;LC8/d0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    move-object p2, v0

    .line 21
    :cond_0
    invoke-direct {p0, p1, p2}, LZ7/i;->l(LC8/S;LZ7/a;)LC8/S;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method


# virtual methods
.method public bridge synthetic e(LC8/S;)LC8/B0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LZ7/i;->n(LC8/S;)LC8/D0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public n(LC8/S;)LC8/D0;
    .locals 3

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/D0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {p0, p1, v1, v2, v1}, LZ7/i;->m(LZ7/i;LC8/S;LZ7/a;ILjava/lang/Object;)LC8/S;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, LC8/D0;-><init>(LC8/S;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
