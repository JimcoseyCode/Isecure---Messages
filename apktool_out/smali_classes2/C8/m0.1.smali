.class public final LC8/m0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC8/m0$a;
    }
.end annotation


# static fields
.field public static final c:LC8/m0$a;

.field private static final d:LC8/m0;


# instance fields
.field private final a:LC8/o0;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LC8/m0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LC8/m0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LC8/m0;->c:LC8/m0$a;

    .line 8
    .line 9
    new-instance v0, LC8/m0;

    .line 10
    .line 11
    sget-object v1, LC8/o0$a;->a:LC8/o0$a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v1, v2}, LC8/m0;-><init>(LC8/o0;Z)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LC8/m0;->d:LC8/m0;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(LC8/o0;Z)V
    .locals 1

    .line 1
    const-string v0, "reportStrategy"

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
    iput-object p1, p0, LC8/m0;->a:LC8/o0;

    .line 10
    .line 11
    iput-boolean p2, p0, LC8/m0;->b:Z

    .line 12
    .line 13
    return-void
.end method

.method private final a(LM7/h;LM7/h;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LM7/c;

    .line 21
    .line 22
    invoke-interface {v1}, LM7/c;->d()Lk8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, LM7/c;

    .line 45
    .line 46
    invoke-interface {p2}, LM7/c;->d()Lk8/c;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, LC8/m0;->a:LC8/o0;

    .line 57
    .line 58
    invoke-interface {v1, p2}, LC8/o0;->a(LM7/c;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    return-void
.end method

.method private final b(LC8/S;LC8/S;)V
    .locals 7

    .line 1
    invoke-static {p2}, LC8/G0;->f(LC8/S;)LC8/G0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "create(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, LC8/S;->I0()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    add-int/lit8 v3, v1, 0x1

    .line 30
    .line 31
    if-gez v1, :cond_0

    .line 32
    .line 33
    invoke-static {}, Lj7/q;->t()V

    .line 34
    .line 35
    .line 36
    :cond_0
    check-cast v2, LC8/B0;

    .line 37
    .line 38
    invoke-interface {v2}, LC8/B0;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, LC8/B0;->getType()LC8/S;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "getType(...)"

    .line 49
    .line 50
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v4}, LH8/d;->g(LC8/S;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, LC8/S;->I0()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, LC8/B0;

    .line 68
    .line 69
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-interface {v6}, LC8/v0;->getParameters()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, LL7/m0;

    .line 82
    .line 83
    iget-boolean v6, p0, LC8/m0;->b:Z

    .line 84
    .line 85
    if-eqz v6, :cond_1

    .line 86
    .line 87
    iget-object v6, p0, LC8/m0;->a:LC8/o0;

    .line 88
    .line 89
    invoke-interface {v4}, LC8/B0;->getType()LC8/S;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, LC8/B0;->getType()LC8/S;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v6, v0, v4, v2, v1}, LC8/o0;->d(LC8/G0;LC8/S;LC8/S;LL7/m0;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    move v1, v3

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    return-void
.end method

.method private final c(LC8/d0;LC8/r0;)LC8/d0;
    .locals 2

    .line 1
    invoke-static {p1}, LC8/W;->a(LC8/S;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, LC8/m0;->g(LC8/S;LC8/r0;)LC8/r0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p1, v1, p2, v0, v1}, LC8/F0;->f(LC8/d0;Ljava/util/List;LC8/r0;ILjava/lang/Object;)LC8/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method private final d(LC8/d0;LC8/S;)LC8/d0;
    .locals 0

    .line 1
    invoke-virtual {p2}, LC8/S;->L0()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p1, p2}, LC8/J0;->r(LC8/d0;Z)LC8/d0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p2, "makeNullableIfNeeded(...)"

    .line 10
    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method private final e(LC8/d0;LC8/S;)LC8/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LC8/m0;->d(LC8/d0;LC8/S;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p2}, LC8/S;->J0()LC8/r0;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {p0, p1, p2}, LC8/m0;->c(LC8/d0;LC8/r0;)LC8/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final f(LC8/n0;LC8/r0;Z)LC8/d0;
    .locals 2

    .line 1
    invoke-virtual {p1}, LC8/n0;->b()LL7/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getTypeConstructor(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LC8/n0;->a()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v1, Lv8/k$b;->b:Lv8/k$b;

    .line 19
    .line 20
    invoke-static {p2, v0, p1, p3, v1}, LC8/V;->m(LC8/r0;LC8/v0;Ljava/util/List;ZLv8/k;)LC8/d0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method private final g(LC8/S;LC8/r0;)LC8/r0;
    .locals 1

    .line 1
    invoke-static {p1}, LC8/W;->a(LC8/S;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LC8/S;->J0()LC8/r0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p1}, LC8/S;->J0()LC8/r0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p2, p1}, LC8/r0;->s(LC8/r0;)LC8/r0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final i(LC8/B0;LC8/n0;I)LC8/B0;
    .locals 11

    .line 1
    invoke-interface {p1}, LC8/B0;->getType()LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC8/S;->N0()LC8/M0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LC8/E;->a(LC8/S;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    move-object v5, p0

    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_1
    invoke-static {v0}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, LC8/W;->a(LC8/S;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-static {v0}, LH8/d;->E(LC8/S;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v0}, LC8/S;->K0()LC8/v0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, LC8/v0;->p()LL7/h;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v1}, LC8/v0;->getParameters()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, LC8/S;->I0()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    instance-of v3, v2, LL7/m0;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    instance-of v3, v2, LL7/l0;

    .line 63
    .line 64
    if-eqz v3, :cond_8

    .line 65
    .line 66
    check-cast v2, LL7/l0;

    .line 67
    .line 68
    invoke-virtual {p2, v2}, LC8/n0;->d(LL7/l0;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    iget-object p1, p0, LC8/m0;->a:LC8/o0;

    .line 75
    .line 76
    invoke-interface {p1, v2}, LC8/o0;->c(LL7/l0;)V

    .line 77
    .line 78
    .line 79
    new-instance p1, LC8/D0;

    .line 80
    .line 81
    sget-object p2, LC8/N0;->k:LC8/N0;

    .line 82
    .line 83
    sget-object p3, LE8/k;->y:LE8/k;

    .line 84
    .line 85
    invoke-interface {v2}, LL7/J;->getName()Lk8/f;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lk8/f;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    filled-new-array {v0}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {p3, v0}, LE8/l;->d(LE8/k;[Ljava/lang/String;)LE8/i;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-direct {p1, p2, p3}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_4
    invoke-virtual {v0}, LC8/S;->I0()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    new-instance v4, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 v5, 0xa

    .line 112
    .line 113
    invoke-static {v3, v5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const/4 v5, 0x0

    .line 125
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_6

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    add-int/lit8 v7, v5, 0x1

    .line 136
    .line 137
    if-gez v5, :cond_5

    .line 138
    .line 139
    invoke-static {}, Lj7/q;->t()V

    .line 140
    .line 141
    .line 142
    :cond_5
    check-cast v6, LC8/B0;

    .line 143
    .line 144
    invoke-interface {v1}, LC8/v0;->getParameters()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, LL7/m0;

    .line 153
    .line 154
    add-int/lit8 v8, p3, 0x1

    .line 155
    .line 156
    invoke-direct {p0, v6, p2, v5, v8}, LC8/m0;->k(LC8/B0;LC8/n0;LL7/m0;I)LC8/B0;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move v5, v7

    .line 164
    goto :goto_1

    .line 165
    :cond_6
    sget-object v1, LC8/n0;->e:LC8/n0$a;

    .line 166
    .line 167
    invoke-virtual {v1, p2, v2, v4}, LC8/n0$a;->a(LC8/n0;LL7/l0;Ljava/util/List;)LC8/n0;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-virtual {v0}, LC8/S;->J0()LC8/r0;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-virtual {v0}, LC8/S;->L0()Z

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    add-int/lit8 v9, p3, 0x1

    .line 180
    .line 181
    const/4 v10, 0x0

    .line 182
    move-object v5, p0

    .line 183
    invoke-direct/range {v5 .. v10}, LC8/m0;->j(LC8/n0;LC8/r0;ZIZ)LC8/d0;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {p0, v0, p2, p3}, LC8/m0;->l(LC8/d0;LC8/n0;I)LC8/d0;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-static {v1}, LC8/E;->a(LC8/S;)Z

    .line 192
    .line 193
    .line 194
    move-result p3

    .line 195
    if-eqz p3, :cond_7

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_7
    invoke-static {v1, p2}, LC8/h0;->j(LC8/d0;LC8/d0;)LC8/d0;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    :goto_2
    new-instance p2, LC8/D0;

    .line 203
    .line 204
    invoke-interface {p1}, LC8/B0;->a()LC8/N0;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-direct {p2, p1, v1}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 209
    .line 210
    .line 211
    return-object p2

    .line 212
    :cond_8
    move-object v5, p0

    .line 213
    invoke-direct {p0, v0, p2, p3}, LC8/m0;->l(LC8/d0;LC8/n0;I)LC8/d0;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-direct {p0, v0, p2}, LC8/m0;->b(LC8/S;LC8/S;)V

    .line 218
    .line 219
    .line 220
    new-instance p3, LC8/D0;

    .line 221
    .line 222
    invoke-interface {p1}, LC8/B0;->a()LC8/N0;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {p3, p1, p2}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 227
    .line 228
    .line 229
    return-object p3

    .line 230
    :goto_3
    return-object p1
.end method

.method private final j(LC8/n0;LC8/r0;ZIZ)LC8/d0;
    .locals 3

    .line 1
    new-instance v0, LC8/D0;

    .line 2
    .line 3
    sget-object v1, LC8/N0;->k:LC8/N0;

    .line 4
    .line 5
    invoke-virtual {p1}, LC8/n0;->b()LL7/l0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, LL7/l0;->b0()LC8/d0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v0, v1, v2}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p0, v0, p1, v1, p4}, LC8/m0;->k(LC8/B0;LC8/n0;LL7/m0;I)LC8/B0;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-interface {p4}, LC8/B0;->getType()LC8/S;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "getType(...)"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, LC8/W;->a(LC8/S;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    invoke-interface {p4}, LC8/B0;->a()LC8/N0;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, LC8/S;->getAnnotations()LM7/h;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    invoke-static {p2}, LC8/t;->a(LC8/r0;)LM7/h;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {p0, p4, v1}, LC8/m0;->a(LM7/h;LM7/h;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v0, p2}, LC8/m0;->c(LC8/d0;LC8/r0;)LC8/d0;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-static {p4, p3}, LC8/J0;->r(LC8/d0;Z)LC8/d0;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    const-string v0, "let(...)"

    .line 64
    .line 65
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    if-eqz p5, :cond_1

    .line 69
    .line 70
    invoke-direct {p0, p1, p2, p3}, LC8/m0;->f(LC8/n0;LC8/r0;Z)LC8/d0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p4, p1}, LC8/h0;->j(LC8/d0;LC8/d0;)LC8/d0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_1
    return-object p4
.end method

.method private final k(LC8/B0;LC8/n0;LL7/m0;I)LC8/B0;
    .locals 3

    .line 1
    sget-object v0, LC8/m0;->c:LC8/m0$a;

    .line 2
    .line 3
    invoke-virtual {p2}, LC8/n0;->b()LL7/l0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, p4, v1}, LC8/m0$a;->a(LC8/m0$a;ILL7/l0;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, LC8/B0;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "makeStarProjection(...)"

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p3}, LC8/J0;->s(LL7/m0;)LC8/B0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-interface {p1}, LC8/B0;->getType()LC8/S;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, "getType(...)"

    .line 34
    .line 35
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LC8/S;->K0()LC8/v0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p2, v2}, LC8/n0;->c(LC8/v0;)LC8/B0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    invoke-direct {p0, p1, p2, p4}, LC8/m0;->i(LC8/B0;LC8/n0;I)LC8/B0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_1
    invoke-interface {v2}, LC8/B0;->b()Z

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    if-eqz p4, :cond_2

    .line 58
    .line 59
    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p3}, LC8/J0;->s(LL7/m0;)LC8/B0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_2
    invoke-interface {v2}, LC8/B0;->getType()LC8/S;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    invoke-virtual {p4}, LC8/S;->N0()LC8/M0;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    invoke-interface {v2}, LC8/B0;->a()LC8/N0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v2, "getProjectionKind(...)"

    .line 83
    .line 84
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, LC8/B0;->a()LC8/N0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    if-ne p1, v1, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    sget-object v2, LC8/N0;->k:LC8/N0;

    .line 98
    .line 99
    if-ne p1, v2, :cond_4

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    if-ne v1, v2, :cond_5

    .line 103
    .line 104
    move-object v1, p1

    .line 105
    goto :goto_0

    .line 106
    :cond_5
    iget-object p1, p0, LC8/m0;->a:LC8/o0;

    .line 107
    .line 108
    invoke-virtual {p2}, LC8/n0;->b()LL7/l0;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {p1, v2, p3, p4}, LC8/o0;->b(LL7/l0;LL7/m0;LC8/S;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    if-eqz p3, :cond_6

    .line 116
    .line 117
    invoke-interface {p3}, LL7/m0;->m()LC8/N0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-nez p1, :cond_7

    .line 122
    .line 123
    :cond_6
    sget-object p1, LC8/N0;->k:LC8/N0;

    .line 124
    .line 125
    :cond_7
    if-ne p1, v1, :cond_8

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_8
    sget-object v2, LC8/N0;->k:LC8/N0;

    .line 129
    .line 130
    if-ne p1, v2, :cond_9

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_9
    if-ne v1, v2, :cond_a

    .line 134
    .line 135
    move-object v1, v2

    .line 136
    goto :goto_1

    .line 137
    :cond_a
    iget-object p1, p0, LC8/m0;->a:LC8/o0;

    .line 138
    .line 139
    invoke-virtual {p2}, LC8/n0;->b()LL7/l0;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-interface {p1, p2, p3, p4}, LC8/o0;->b(LL7/l0;LL7/m0;LC8/S;)V

    .line 144
    .line 145
    .line 146
    :goto_1
    invoke-virtual {v0}, LC8/S;->getAnnotations()LM7/h;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p4}, LC8/S;->getAnnotations()LM7/h;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-direct {p0, p1, p2}, LC8/m0;->a(LM7/h;LM7/h;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p4}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-direct {p0, p1, v0}, LC8/m0;->e(LC8/d0;LC8/S;)LC8/d0;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-instance p2, LC8/D0;

    .line 166
    .line 167
    invoke-direct {p2, v1, p1}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 168
    .line 169
    .line 170
    return-object p2
.end method

.method private final l(LC8/d0;LC8/n0;I)LC8/d0;
    .locals 8

    .line 1
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LC8/S;->I0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-static {v1, v3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    add-int/lit8 v5, v3, 0x1

    .line 36
    .line 37
    if-gez v3, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lj7/q;->t()V

    .line 40
    .line 41
    .line 42
    :cond_0
    check-cast v4, LC8/B0;

    .line 43
    .line 44
    invoke-interface {v0}, LC8/v0;->getParameters()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, LL7/m0;

    .line 53
    .line 54
    add-int/lit8 v6, p3, 0x1

    .line 55
    .line 56
    invoke-direct {p0, v4, p2, v3, v6}, LC8/m0;->k(LC8/B0;LC8/n0;LL7/m0;I)LC8/B0;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v3}, LC8/B0;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v6, LC8/D0;

    .line 68
    .line 69
    invoke-interface {v3}, LC8/B0;->a()LC8/N0;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-interface {v3}, LC8/B0;->getType()LC8/S;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v4}, LC8/B0;->getType()LC8/S;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, LC8/S;->L0()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-static {v3, v4}, LC8/J0;->q(LC8/S;Z)LC8/S;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-direct {v6, v7, v3}, LC8/D0;-><init>(LC8/N0;LC8/S;)V

    .line 90
    .line 91
    .line 92
    move-object v3, v6

    .line 93
    :goto_1
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move v3, v5

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 p2, 0x2

    .line 99
    const/4 p3, 0x0

    .line 100
    invoke-static {p1, v2, p3, p2, p3}, LC8/F0;->f(LC8/d0;Ljava/util/List;LC8/r0;ILjava/lang/Object;)LC8/d0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1
.end method


# virtual methods
.method public final h(LC8/n0;LC8/r0;)LC8/d0;
    .locals 7

    .line 1
    const-string v0, "typeAliasExpansion"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    move-object v3, p2

    .line 17
    invoke-direct/range {v1 .. v6}, LC8/m0;->j(LC8/n0;LC8/r0;ZIZ)LC8/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
