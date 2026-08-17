.class final LA8/m$b;
.super LC8/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final d:LB8/i;

.field final synthetic e:LA8/m;


# direct methods
.method public constructor <init>(LA8/m;)V
    .locals 2

    .line 1
    iput-object p1, p0, LA8/m$b;->e:LA8/m;

    .line 2
    .line 3
    invoke-virtual {p1}, LA8/m;->a1()Ly8/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ly8/p;->h()LB8/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, LC8/b;-><init>(LB8/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LA8/m;->a1()Ly8/p;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ly8/p;->h()LB8/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, LA8/n;

    .line 23
    .line 24
    invoke-direct {v1, p1}, LA8/n;-><init>(LA8/m;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, LB8/n;->e(Lw7/a;)LB8/i;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, LA8/m$b;->d:LB8/i;

    .line 32
    .line 33
    return-void
.end method

.method static synthetic I(LA8/m;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LA8/m$b;->K(LA8/m;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final K(LA8/m;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LL7/q0;->g(LL7/i;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public bridge synthetic H()LL7/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/m$b;->J()LA8/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public J()LA8/m;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m$b;->e:LA8/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/m$b;->d:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method protected m()Ljava/util/Collection;
    .locals 7

    .line 1
    iget-object v0, p0, LA8/m$b;->e:LA8/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LA8/m;->b1()Lf8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LA8/m$b;->e:LA8/m;

    .line 8
    .line 9
    invoke-virtual {v1}, LA8/m;->a1()Ly8/p;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ly8/p;->j()Lh8/g;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lh8/f;->o(Lf8/c;Lh8/g;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, LA8/m$b;->e:LA8/m;

    .line 22
    .line 23
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    invoke-static {v0, v3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lf8/q;

    .line 49
    .line 50
    invoke-virtual {v1}, LA8/m;->a1()Ly8/p;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ly8/p;->i()Ly8/X;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5, v4}, Ly8/X;->u(Lf8/q;)LC8/S;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, LA8/m$b;->e:LA8/m;

    .line 67
    .line 68
    invoke-virtual {v0}, LA8/m;->a1()Ly8/p;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ly8/p;->c()Ly8/n;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ly8/n;->c()LN7/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v1, p0, LA8/m$b;->e:LA8/m;

    .line 81
    .line 82
    invoke-interface {v0, v1}, LN7/a;->a(LL7/e;)Ljava/util/Collection;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v2, v0}, Lj7/q;->z0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, LC8/S;

    .line 110
    .line 111
    invoke-virtual {v4}, LC8/S;->K0()LC8/v0;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-interface {v4}, LC8/v0;->p()LL7/h;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    instance-of v5, v4, LL7/M$b;

    .line 120
    .line 121
    if-eqz v5, :cond_2

    .line 122
    .line 123
    check-cast v4, LL7/M$b;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    const/4 v4, 0x0

    .line 127
    :goto_2
    if-eqz v4, :cond_1

    .line 128
    .line 129
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-nez v2, :cond_7

    .line 138
    .line 139
    iget-object v2, p0, LA8/m$b;->e:LA8/m;

    .line 140
    .line 141
    invoke-virtual {v2}, LA8/m;->a1()Ly8/p;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Ly8/p;->c()Ly8/n;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ly8/n;->j()Ly8/w;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-object v4, p0, LA8/m$b;->e:LA8/m;

    .line 154
    .line 155
    new-instance v5, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-static {v1, v3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_6

    .line 173
    .line 174
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, LL7/M$b;

    .line 179
    .line 180
    invoke-static {v3}, Ls8/e;->n(LL7/h;)Lk8/b;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    if-eqz v6, :cond_4

    .line 185
    .line 186
    invoke-virtual {v6}, Lk8/b;->a()Lk8/c;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    if-eqz v6, :cond_4

    .line 191
    .line 192
    invoke-virtual {v6}, Lk8/c;->b()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    if-nez v6, :cond_5

    .line 197
    .line 198
    :cond_4
    invoke-virtual {v3}, LO7/a;->getName()Lk8/f;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v3}, Lk8/f;->j()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    const-string v3, "asString(...)"

    .line 207
    .line 208
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_5
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_6
    invoke-interface {v2, v4, v5}, Ly8/w;->b(LL7/e;Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    :cond_7
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0
.end method

.method public bridge synthetic p()LL7/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/m$b;->J()LA8/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LA8/m$b;->e:LA8/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LO7/a;->getName()Lk8/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lk8/f;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "toString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method protected u()LL7/k0;
    .locals 1

    .line 1
    sget-object v0, LL7/k0$a;->a:LL7/k0$a;

    .line 2
    .line 3
    return-object v0
.end method
