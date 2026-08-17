.class public final Ly8/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/g$a;
    }
.end annotation


# instance fields
.field private final a:LL7/H;

.field private final b:LL7/M;


# direct methods
.method public constructor <init>(LL7/H;LL7/M;)V
    .locals 1

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notFoundClasses"

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
    iput-object p1, p0, Ly8/g;->a:LL7/H;

    .line 15
    .line 16
    iput-object p2, p0, Ly8/g;->b:LL7/M;

    .line 17
    .line 18
    return-void
.end method

.method private final b(Lq8/g;LC8/S;Lf8/b$b$c;)Z
    .locals 6

    .line 1
    invoke-virtual {p3}, Lf8/b$b$c;->R()Lf8/b$b$c$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Ly8/g$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/16 v1, 0xa

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v0, v1, :cond_6

    .line 22
    .line 23
    const/16 v1, 0xd

    .line 24
    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    iget-object p3, p0, Ly8/g;->a:LL7/H;

    .line 28
    .line 29
    invoke-virtual {p1, p3}, Lq8/g;->a(LL7/H;)LC8/S;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_1
    instance-of v0, p1, Lq8/b;

    .line 39
    .line 40
    if-eqz v0, :cond_5

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    check-cast v0, Lq8/b;

    .line 44
    .line 45
    invoke-virtual {v0}, Lq8/g;->b()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p3}, Lf8/b$b$c;->I()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-ne v0, v1, :cond_5

    .line 64
    .line 65
    invoke-direct {p0}, Ly8/g;->c()LI7/i;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, p2}, LI7/i;->k(LC8/S;)LC8/S;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    const-string v0, "getArrayElementType(...)"

    .line 74
    .line 75
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    check-cast p1, Lq8/b;

    .line 79
    .line 80
    invoke-virtual {p1}, Lq8/g;->b()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/util/Collection;

    .line 85
    .line 86
    invoke-static {v0}, Lj7/q;->k(Ljava/util/Collection;)LB7/c;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    instance-of v1, v0, Ljava/util/Collection;

    .line 91
    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    move-object v1, v0

    .line 95
    check-cast v1, Ljava/util/Collection;

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    return v3

    .line 104
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    move-object v1, v0

    .line 115
    check-cast v1, Lj7/J;

    .line 116
    .line 117
    invoke-virtual {v1}, Lj7/J;->nextInt()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {p1}, Lq8/g;->b()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Lq8/g;

    .line 132
    .line 133
    invoke-virtual {p3, v1}, Lf8/b$b$c;->G(I)Lf8/b$b$c;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const-string v5, "getArrayElement(...)"

    .line 138
    .line 139
    invoke-static {v1, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {p0, v4, p2, v1}, Ly8/g;->b(Lq8/g;LC8/S;Lf8/b$b$c;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-nez v1, :cond_3

    .line 147
    .line 148
    return v2

    .line 149
    :cond_4
    return v3

    .line 150
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string p3, "Deserialized ArrayValue should have the same number of elements as the original array value: "

    .line 156
    .line 157
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p2

    .line 177
    :cond_6
    invoke-virtual {p2}, LC8/S;->K0()LC8/v0;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-interface {p1}, LC8/v0;->p()LL7/h;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    instance-of p2, p1, LL7/e;

    .line 186
    .line 187
    if-eqz p2, :cond_7

    .line 188
    .line 189
    check-cast p1, LL7/e;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_7
    const/4 p1, 0x0

    .line 193
    :goto_1
    if-eqz p1, :cond_9

    .line 194
    .line 195
    invoke-static {p1}, LI7/i;->l0(LL7/e;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_8

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_8
    return v2

    .line 203
    :cond_9
    :goto_2
    return v3
.end method

.method private final c()LI7/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/g;->a:LL7/H;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/H;->n()LI7/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final d(Lf8/b$b;Ljava/util/Map;Lh8/c;)Lkotlin/Pair;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lf8/b$b;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p3, v0}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, LL7/t0;

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance v0, Lkotlin/Pair;

    .line 20
    .line 21
    invoke-virtual {p1}, Lf8/b$b;->v()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {p3, v1}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {p2}, LL7/s0;->getType()LC8/S;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const-string v2, "getType(...)"

    .line 34
    .line 35
    invoke-static {p2, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lf8/b$b;->w()Lf8/b$b$c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v2, "getValue(...)"

    .line 43
    .line 44
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p2, p1, p3}, Ly8/g;->g(LC8/S;Lf8/b$b$c;Lh8/c;)Lq8/g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method private final e(Lk8/b;)LL7/e;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/g;->a:LL7/H;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/g;->b:LL7/M;

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, LL7/y;->d(LL7/H;Lk8/b;LL7/M;)LL7/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final g(LC8/S;Lf8/b$b$c;Lh8/c;)Lq8/g;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ly8/g;->f(LC8/S;Lf8/b$b$c;Lh8/c;)Lq8/g;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p3, p1, p2}, Ly8/g;->b(Lq8/g;LC8/S;Lf8/b$b$c;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p3, 0x0

    .line 13
    :goto_0
    if-nez p3, :cond_1

    .line 14
    .line 15
    sget-object p3, Lq8/l;->b:Lq8/l$a;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "Unexpected argument value: actual type "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lf8/b$b$c;->R()Lf8/b$b$c$c;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, " != expected type "

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p3, p1}, Lq8/l$a;->a(Ljava/lang/String;)Lq8/l;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_1
    return-object p3
.end method


# virtual methods
.method public final a(Lf8/b;Lh8/c;)LM7/c;
    .locals 5

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lf8/b;->z()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p2, v0}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p0, v0}, Ly8/g;->e(Lk8/b;)LL7/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lf8/b;->w()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-static {v0}, LE8/l;->m(LL7/m;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    invoke-static {v0}, Lo8/i;->t(LL7/m;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, LL7/e;->f()Ljava/util/Collection;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, "getConstructors(...)"

    .line 50
    .line 51
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Lj7/q;->D0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, LL7/d;

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-interface {v2}, LL7/a;->i()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "getValueParameters(...)"

    .line 67
    .line 68
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/16 v2, 0xa

    .line 72
    .line 73
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Lj7/K;->e(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    const/16 v3, 0x10

    .line 82
    .line 83
    invoke-static {v2, v3}, LB7/d;->d(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_0

    .line 101
    .line 102
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    move-object v4, v2

    .line 107
    check-cast v4, LL7/t0;

    .line 108
    .line 109
    invoke-interface {v4}, LL7/J;->getName()Lk8/f;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {p1}, Lf8/b;->x()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const-string v1, "getArgumentList(...)"

    .line 122
    .line 123
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v1, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_2

    .line 140
    .line 141
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Lf8/b$b;

    .line 146
    .line 147
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {p0, v2, v3, p2}, Ly8/g;->d(Lf8/b$b;Ljava/util/Map;Lh8/c;)Lkotlin/Pair;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-eqz v2, :cond_1

    .line 155
    .line 156
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    invoke-static {v1}, Lj7/K;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :cond_3
    new-instance p1, LM7/d;

    .line 165
    .line 166
    invoke-interface {v0}, LL7/e;->r()LC8/d0;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    sget-object v0, LL7/h0;->a:LL7/h0;

    .line 171
    .line 172
    invoke-direct {p1, p2, v1, v0}, LM7/d;-><init>(LC8/S;Ljava/util/Map;LL7/h0;)V

    .line 173
    .line 174
    .line 175
    return-object p1
.end method

.method public final f(LC8/S;Lf8/b$b$c;Lh8/c;)Lq8/g;
    .locals 5

    .line 1
    const-string v0, "expectedType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "nameResolver"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lh8/b;->P:Lh8/b$b;

    .line 17
    .line 18
    invoke-virtual {p2}, Lf8/b$b$c;->N()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "get(...)"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p2}, Lf8/b$b$c;->R()Lf8/b$b$c$c;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    const/4 v1, -0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object v2, Ly8/g$a;->a:[I

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    aget v1, v2, v1

    .line 50
    .line 51
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v1, "Unsupported annotation argument type: "

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Lf8/b$b$c;->R()Lf8/b$b$c$c;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p2, " (expected "

    .line 74
    .line 75
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 p1, 0x29

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p3

    .line 98
    :pswitch_0
    sget-object v0, Lq8/i;->a:Lq8/i;

    .line 99
    .line 100
    invoke-virtual {p2}, Lf8/b$b$c;->I()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const-string v1, "getArrayElementList(...)"

    .line 105
    .line 106
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 v2, 0xa

    .line 112
    .line 113
    invoke-static {p2, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_1

    .line 129
    .line 130
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Lf8/b$b$c;

    .line 135
    .line 136
    invoke-direct {p0}, Ly8/g;->c()LI7/i;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v3}, LI7/i;->i()LC8/d0;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    const-string v4, "getAnyType(...)"

    .line 145
    .line 146
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v3, v2, p3}, Ly8/g;->f(LC8/S;Lf8/b$b$c;Lh8/c;)Lq8/g;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_1
    invoke-virtual {v0, v1, p1}, Lq8/i;->b(Ljava/util/List;LC8/S;)Lq8/b;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :pswitch_1
    new-instance p1, Lq8/a;

    .line 166
    .line 167
    invoke-virtual {p2}, Lf8/b$b$c;->E()Lf8/b;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    const-string v0, "getAnnotation(...)"

    .line 172
    .line 173
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p2, p3}, Ly8/g;->a(Lf8/b;Lh8/c;)LM7/c;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-direct {p1, p2}, Lq8/a;-><init>(LM7/c;)V

    .line 181
    .line 182
    .line 183
    return-object p1

    .line 184
    :pswitch_2
    new-instance p1, Lq8/k;

    .line 185
    .line 186
    invoke-virtual {p2}, Lf8/b$b$c;->J()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-static {p3, v0}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {p2}, Lf8/b$b$c;->M()I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    invoke-static {p3, p2}, Ly8/L;->b(Lh8/c;I)Lk8/f;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-direct {p1, v0, p2}, Lq8/k;-><init>(Lk8/b;Lk8/f;)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :pswitch_3
    new-instance p1, Lq8/s;

    .line 207
    .line 208
    invoke-virtual {p2}, Lf8/b$b$c;->J()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-static {p3, v0}, Ly8/L;->a(Lh8/c;I)Lk8/b;

    .line 213
    .line 214
    .line 215
    move-result-object p3

    .line 216
    invoke-virtual {p2}, Lf8/b$b$c;->F()I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    invoke-direct {p1, p3, p2}, Lq8/s;-><init>(Lk8/b;I)V

    .line 221
    .line 222
    .line 223
    return-object p1

    .line 224
    :pswitch_4
    new-instance p1, Lq8/x;

    .line 225
    .line 226
    invoke-virtual {p2}, Lf8/b$b$c;->Q()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    invoke-interface {p3, p2}, Lh8/c;->getString(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-direct {p1, p2}, Lq8/x;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-object p1

    .line 238
    :pswitch_5
    new-instance p1, Lq8/c;

    .line 239
    .line 240
    invoke-virtual {p2}, Lf8/b$b$c;->P()J

    .line 241
    .line 242
    .line 243
    move-result-wide p2

    .line 244
    const-wide/16 v0, 0x0

    .line 245
    .line 246
    cmp-long p2, p2, v0

    .line 247
    .line 248
    if-eqz p2, :cond_2

    .line 249
    .line 250
    const/4 p2, 0x1

    .line 251
    goto :goto_2

    .line 252
    :cond_2
    const/4 p2, 0x0

    .line 253
    :goto_2
    invoke-direct {p1, p2}, Lq8/c;-><init>(Z)V

    .line 254
    .line 255
    .line 256
    return-object p1

    .line 257
    :pswitch_6
    new-instance p1, Lq8/j;

    .line 258
    .line 259
    invoke-virtual {p2}, Lf8/b$b$c;->L()D

    .line 260
    .line 261
    .line 262
    move-result-wide p2

    .line 263
    invoke-direct {p1, p2, p3}, Lq8/j;-><init>(D)V

    .line 264
    .line 265
    .line 266
    return-object p1

    .line 267
    :pswitch_7
    new-instance p1, Lq8/m;

    .line 268
    .line 269
    invoke-virtual {p2}, Lf8/b$b$c;->O()F

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    invoke-direct {p1, p2}, Lq8/m;-><init>(F)V

    .line 274
    .line 275
    .line 276
    return-object p1

    .line 277
    :pswitch_8
    invoke-virtual {p2}, Lf8/b$b$c;->P()J

    .line 278
    .line 279
    .line 280
    move-result-wide p1

    .line 281
    if-eqz v0, :cond_3

    .line 282
    .line 283
    new-instance p3, Lq8/C;

    .line 284
    .line 285
    invoke-direct {p3, p1, p2}, Lq8/C;-><init>(J)V

    .line 286
    .line 287
    .line 288
    return-object p3

    .line 289
    :cond_3
    new-instance p3, Lq8/t;

    .line 290
    .line 291
    invoke-direct {p3, p1, p2}, Lq8/t;-><init>(J)V

    .line 292
    .line 293
    .line 294
    return-object p3

    .line 295
    :pswitch_9
    invoke-virtual {p2}, Lf8/b$b$c;->P()J

    .line 296
    .line 297
    .line 298
    move-result-wide p1

    .line 299
    long-to-int p1, p1

    .line 300
    if-eqz v0, :cond_4

    .line 301
    .line 302
    new-instance p2, Lq8/B;

    .line 303
    .line 304
    invoke-direct {p2, p1}, Lq8/B;-><init>(I)V

    .line 305
    .line 306
    .line 307
    return-object p2

    .line 308
    :cond_4
    new-instance p2, Lq8/n;

    .line 309
    .line 310
    invoke-direct {p2, p1}, Lq8/n;-><init>(I)V

    .line 311
    .line 312
    .line 313
    return-object p2

    .line 314
    :pswitch_a
    invoke-virtual {p2}, Lf8/b$b$c;->P()J

    .line 315
    .line 316
    .line 317
    move-result-wide p1

    .line 318
    long-to-int p1, p1

    .line 319
    int-to-short p1, p1

    .line 320
    if-eqz v0, :cond_5

    .line 321
    .line 322
    new-instance p2, Lq8/D;

    .line 323
    .line 324
    invoke-direct {p2, p1}, Lq8/D;-><init>(S)V

    .line 325
    .line 326
    .line 327
    return-object p2

    .line 328
    :cond_5
    new-instance p2, Lq8/w;

    .line 329
    .line 330
    invoke-direct {p2, p1}, Lq8/w;-><init>(S)V

    .line 331
    .line 332
    .line 333
    return-object p2

    .line 334
    :pswitch_b
    new-instance p1, Lq8/e;

    .line 335
    .line 336
    invoke-virtual {p2}, Lf8/b$b$c;->P()J

    .line 337
    .line 338
    .line 339
    move-result-wide p2

    .line 340
    long-to-int p2, p2

    .line 341
    int-to-char p2, p2

    .line 342
    invoke-direct {p1, p2}, Lq8/e;-><init>(C)V

    .line 343
    .line 344
    .line 345
    return-object p1

    .line 346
    :pswitch_c
    invoke-virtual {p2}, Lf8/b$b$c;->P()J

    .line 347
    .line 348
    .line 349
    move-result-wide p1

    .line 350
    long-to-int p1, p1

    .line 351
    int-to-byte p1, p1

    .line 352
    if-eqz v0, :cond_6

    .line 353
    .line 354
    new-instance p2, Lq8/A;

    .line 355
    .line 356
    invoke-direct {p2, p1}, Lq8/A;-><init>(B)V

    .line 357
    .line 358
    .line 359
    return-object p2

    .line 360
    :cond_6
    new-instance p2, Lq8/d;

    .line 361
    .line 362
    invoke-direct {p2, p1}, Lq8/d;-><init>(B)V

    .line 363
    .line 364
    .line 365
    return-object p2

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
