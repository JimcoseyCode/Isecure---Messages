.class public abstract LD8/f;
.super LC8/q;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LC8/q;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(LC8/d0;)LC8/d0;
    .locals 14

    .line 1
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lp8/c;

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_4

    .line 11
    .line 12
    check-cast v0, Lp8/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lp8/c;->getProjection()LC8/B0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, LC8/B0;->a()LC8/N0;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    sget-object v5, LC8/N0;->l:LC8/N0;

    .line 23
    .line 24
    if-ne v4, v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v3

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, LC8/B0;->getType()LC8/S;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, LC8/S;->N0()LC8/M0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    :cond_1
    move-object v7, v3

    .line 41
    invoke-virtual {v0}, Lp8/c;->b()LD8/n;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Lp8/c;->getProjection()LC8/B0;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v0}, Lp8/c;->g()Ljava/util/Collection;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v10, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, LC8/S;

    .line 79
    .line 80
    invoke-virtual {v2}, LC8/S;->N0()LC8/M0;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    new-instance v8, LD8/n;

    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v12, 0x4

    .line 92
    const/4 v13, 0x0

    .line 93
    invoke-direct/range {v8 .. v13}, LD8/n;-><init>(LC8/B0;Ljava/util/List;LD8/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v8}, Lp8/c;->d(LD8/n;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    new-instance v4, LD8/i;

    .line 100
    .line 101
    sget-object v5, LG8/b;->g:LG8/b;

    .line 102
    .line 103
    invoke-virtual {v0}, Lp8/c;->b()LD8/n;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, LC8/S;->J0()LC8/r0;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {p1}, LC8/S;->L0()Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    const/16 v11, 0x20

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    invoke-direct/range {v4 .. v12}, LD8/i;-><init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 123
    .line 124
    .line 125
    return-object v4

    .line 126
    :cond_4
    instance-of v1, v0, LC8/Q;

    .line 127
    .line 128
    if-eqz v1, :cond_9

    .line 129
    .line 130
    invoke-virtual {p1}, LC8/S;->L0()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_9

    .line 135
    .line 136
    check-cast v0, LC8/Q;

    .line 137
    .line 138
    invoke-virtual {v0}, LC8/Q;->g()Ljava/util/Collection;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance v1, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-static {p1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const/4 v2, 0x0

    .line 156
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, LC8/S;

    .line 167
    .line 168
    invoke-static {v2}, LH8/d;->B(LC8/S;)LC8/S;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    const/4 v2, 0x1

    .line 176
    goto :goto_2

    .line 177
    :cond_5
    if-nez v2, :cond_6

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_6
    invoke-virtual {v0}, LC8/Q;->h()LC8/S;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_7

    .line 185
    .line 186
    invoke-static {p1}, LH8/d;->B(LC8/S;)LC8/S;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    :cond_7
    new-instance p1, LC8/Q;

    .line 191
    .line 192
    invoke-direct {p1, v1}, LC8/Q;-><init>(Ljava/util/Collection;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v3}, LC8/Q;->r(LC8/S;)LC8/Q;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    :goto_3
    if-nez v3, :cond_8

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_8
    move-object v0, v3

    .line 203
    :goto_4
    invoke-virtual {v0}, LC8/Q;->e()LC8/d0;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    :cond_9
    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(LG8/i;)LG8/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD8/f;->b(LG8/i;)LC8/M0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(LG8/i;)LC8/M0;
    .locals 4

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, LC8/S;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    check-cast p1, LC8/S;

    .line 11
    .line 12
    invoke-virtual {p1}, LC8/S;->N0()LC8/M0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of v0, p1, LC8/d0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, LC8/d0;

    .line 22
    .line 23
    invoke-direct {p0, v0}, LD8/f;->c(LC8/d0;)LC8/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    instance-of v0, p1, LC8/I;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    move-object v0, p1

    .line 33
    check-cast v0, LC8/I;

    .line 34
    .line 35
    invoke-virtual {v0}, LC8/I;->S0()LC8/d0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {p0, v1}, LD8/f;->c(LC8/d0;)LC8/d0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0}, LC8/I;->T0()LC8/d0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-direct {p0, v2}, LD8/f;->c(LC8/d0;)LC8/d0;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0}, LC8/I;->S0()LC8/d0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-ne v1, v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, LC8/I;->T0()LC8/d0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eq v2, v0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move-object v0, p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    invoke-static {v1, v2}, LC8/V;->e(LC8/d0;LC8/d0;)LC8/M0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_1
    new-instance v1, LD8/f$b;

    .line 71
    .line 72
    invoke-direct {v1, p0}, LD8/f$b;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p1, v1}, LC8/L0;->c(LC8/M0;LC8/S;Lkotlin/jvm/functions/Function1;)LC8/M0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_3
    new-instance p1, Li7/m;

    .line 81
    .line 82
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    const-string v0, "Failed requirement."

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
.end method
