.class public final LC8/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC8/g$a;
    }
.end annotation


# static fields
.field public static final a:LC8/g;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC8/g;

    .line 2
    .line 3
    invoke-direct {v0}, LC8/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC8/g;->a:LC8/g;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final A(LC8/u0;Ljava/util/List;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    check-cast v3, LG8/j;

    .line 34
    .line 35
    invoke-interface {p1, v3}, LG8/o;->z0(LG8/j;)LG8/k;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {p1, v3}, LG8/o;->F0(LG8/k;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x0

    .line 44
    :goto_1
    if-ge v5, v4, :cond_2

    .line 45
    .line 46
    invoke-interface {p1, v3, v5}, LG8/o;->I(LG8/k;I)LG8/l;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {p1, v6}, LG8/o;->h(LG8/l;)LG8/i;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-interface {p1, v6}, LG8/o;->b0(LG8/i;)LG8/g;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    if-nez v6, :cond_1

    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    :goto_2
    return-object p2
.end method

.method static synthetic a(Ljava/util/Collection;LC8/u0;LG8/o;LG8/j;LC8/u0$a;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LC8/g;->x(Ljava/util/Collection;LC8/u0;LG8/o;LG8/j;LC8/u0$a;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(LC8/u0;LG8/o;LG8/j;LG8/j;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LC8/g;->y(LC8/u0;LG8/o;LG8/j;LG8/j;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final c(LC8/u0;LG8/j;LG8/j;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p2}, LG8/o;->c0(LG8/j;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, p3}, LG8/o;->c0(LG8/j;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    invoke-static {v0, p2}, LC8/g;->f(LG8/o;LG8/j;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {v0, p3}, LC8/g;->f(LG8/o;LG8/j;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-interface {v0, p2}, LG8/o;->c0(LG8/j;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-static {v0, p1, p2, p3, v1}, LC8/g;->g(LG8/o;LC8/u0;LG8/j;LG8/j;Z)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-interface {v0, p3}, LG8/o;->c0(LG8/j;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-static {v0, p2}, LC8/g;->e(LG8/o;LG8/j;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-static {v0, p1, p3, p2, v1}, LC8/g;->g(LG8/o;LC8/u0;LG8/j;LG8/j;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    return-object v2
.end method

.method private static final d(LG8/o;LG8/j;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LG8/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, LG8/d;

    .line 8
    .line 9
    invoke-interface {p0, p1}, LG8/o;->z(LG8/d;)LG8/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p1}, LG8/o;->o0(LG8/c;)LG8/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p1}, LG8/o;->l(LG8/l;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0, p1}, LG8/o;->h(LG8/l;)LG8/i;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p0, p1}, LG8/o;->m0(LG8/i;)LG8/j;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p0, p1}, LG8/o;->c0(LG8/j;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    return v1
.end method

.method private static final e(LG8/o;LG8/j;)Z
    .locals 2

    .line 1
    invoke-interface {p0, p1}, LG8/o;->c(LG8/j;)LG8/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, LG8/h;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p0, p1}, LG8/o;->m(LG8/m;)Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LG8/i;

    .line 37
    .line 38
    invoke-interface {p0, v0}, LG8/o;->a(LG8/i;)LG8/j;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-interface {p0, v0}, LG8/o;->c0(LG8/j;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v1, 0x1

    .line 49
    if-ne v0, v1, :cond_1

    .line 50
    .line 51
    return v1

    .line 52
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method private static final f(LG8/o;LG8/j;)Z
    .locals 1

    .line 1
    invoke-interface {p0, p1}, LG8/o;->c0(LG8/j;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0, p1}, LC8/g;->d(LG8/o;LG8/j;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method private static final g(LG8/o;LC8/u0;LG8/j;LG8/j;Z)Z
    .locals 9

    .line 1
    invoke-interface {p0, p2}, LG8/o;->S(LG8/j;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move-object v5, v1

    .line 30
    check-cast v5, LG8/i;

    .line 31
    .line 32
    invoke-interface {p0, v5}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {p0, p3}, LG8/o;->c(LG8/j;)LG8/m;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    if-eqz p4, :cond_1

    .line 47
    .line 48
    sget-object v2, LC8/g;->a:LC8/g;

    .line 49
    .line 50
    const/16 v7, 0x8

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    move-object v3, p1

    .line 55
    move-object v4, p3

    .line 56
    invoke-static/range {v2 .. v8}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v3, p1

    .line 64
    move-object v4, p3

    .line 65
    :cond_2
    move-object p1, v3

    .line 66
    move-object p3, v4

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_4
    return v0
.end method

.method private final h(LC8/u0;LG8/j;LG8/j;)Ljava/lang/Boolean;
    .locals 12

    .line 1
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v8

    .line 5
    invoke-interface {v8, p2}, LG8/o;->E0(LG8/i;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v9, 0x0

    .line 10
    if-nez v0, :cond_17

    .line 11
    .line 12
    invoke-interface {v8, p3}, LG8/o;->E0(LG8/i;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_8

    .line 19
    .line 20
    :cond_0
    invoke-interface {v8, p2}, LG8/o;->x(LG8/j;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v10, 0x1

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-interface {v8, p3}, LG8/o;->x(LG8/j;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    sget-object v0, LC8/g;->a:LC8/g;

    .line 34
    .line 35
    invoke-direct {v0, v8, p2, p3}, LC8/g;->r(LG8/o;LG8/j;LG8/j;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, LC8/u0;->n()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    :cond_1
    move v9, v10

    .line 48
    :cond_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_3
    invoke-interface {v8, p2}, LG8/o;->E(LG8/j;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_16

    .line 58
    .line 59
    invoke-interface {v8, p3}, LG8/o;->E(LG8/j;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_4
    invoke-interface {v8, p3}, LG8/o;->B0(LG8/j;)LG8/e;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-interface {v8, v0}, LG8/o;->e0(LG8/e;)LG8/j;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-nez v0, :cond_6

    .line 78
    .line 79
    :cond_5
    move-object v0, p3

    .line 80
    :cond_6
    invoke-interface {v8, v0}, LG8/o;->d(LG8/j;)LG8/d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const/4 v11, 0x0

    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    invoke-interface {v8, v0}, LG8/o;->H(LG8/d;)LG8/i;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_0

    .line 92
    :cond_7
    move-object v1, v11

    .line 93
    :goto_0
    if-eqz v0, :cond_d

    .line 94
    .line 95
    if-eqz v1, :cond_d

    .line 96
    .line 97
    invoke-interface {v8, p3}, LG8/o;->W(LG8/j;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_9

    .line 102
    .line 103
    invoke-interface {v8, v1, v10}, LG8/o;->O(LG8/i;Z)LG8/i;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :cond_8
    :goto_1
    move-object v3, v1

    .line 108
    goto :goto_2

    .line 109
    :cond_9
    invoke-interface {v8, p3}, LG8/o;->f0(LG8/i;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_8

    .line 114
    .line 115
    invoke-interface {v8, v1}, LG8/o;->C0(LG8/i;)LG8/i;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    goto :goto_1

    .line 120
    :goto_2
    invoke-virtual {p1, p2, v0}, LC8/u0;->g(LG8/j;LG8/d;)LC8/u0$b;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget-object v4, LC8/g$a;->b:[I

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    aget v0, v4, v0

    .line 131
    .line 132
    if-eq v0, v10, :cond_c

    .line 133
    .line 134
    const/4 v4, 0x2

    .line 135
    if-eq v0, v4, :cond_b

    .line 136
    .line 137
    const/4 v3, 0x3

    .line 138
    if-ne v0, v3, :cond_a

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_a
    new-instance v0, Li7/m;

    .line 142
    .line 143
    invoke-direct {v0}, Li7/m;-><init>()V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :cond_b
    sget-object v0, LC8/g;->a:LC8/g;

    .line 148
    .line 149
    const/16 v5, 0x8

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v4, 0x0

    .line 153
    move-object v1, p1

    .line 154
    move-object v2, p2

    .line 155
    invoke-static/range {v0 .. v6}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_d

    .line 160
    .line 161
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 162
    .line 163
    return-object v0

    .line 164
    :cond_c
    sget-object v0, LC8/g;->a:LC8/g;

    .line 165
    .line 166
    const/16 v5, 0x8

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v4, 0x0

    .line 170
    move-object v1, p1

    .line 171
    move-object v2, p2

    .line 172
    invoke-static/range {v0 .. v6}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    return-object v0

    .line 181
    :cond_d
    :goto_3
    invoke-interface {v8, p3}, LG8/o;->c(LG8/j;)LG8/m;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v8, v0}, LG8/o;->r(LG8/m;)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_11

    .line 190
    .line 191
    invoke-interface {v8, p3}, LG8/o;->W(LG8/j;)Z

    .line 192
    .line 193
    .line 194
    invoke-interface {v8, v0}, LG8/o;->m(LG8/m;)Ljava/util/Collection;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-eqz v0, :cond_f

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_f

    .line 205
    .line 206
    :cond_e
    move v9, v10

    .line 207
    goto :goto_4

    .line 208
    :cond_f
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    :cond_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_e

    .line 217
    .line 218
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    move-object v3, v0

    .line 223
    check-cast v3, LG8/i;

    .line 224
    .line 225
    sget-object v0, LC8/g;->a:LC8/g;

    .line 226
    .line 227
    const/16 v5, 0x8

    .line 228
    .line 229
    const/4 v6, 0x0

    .line 230
    const/4 v4, 0x0

    .line 231
    move-object v1, p1

    .line 232
    move-object v2, p2

    .line 233
    invoke-static/range {v0 .. v6}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_10

    .line 238
    .line 239
    :goto_4
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    return-object v0

    .line 244
    :cond_11
    invoke-interface {v8, p2}, LG8/o;->c(LG8/j;)LG8/m;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    instance-of v1, p2, LG8/d;

    .line 249
    .line 250
    if-nez v1, :cond_14

    .line 251
    .line 252
    invoke-interface {v8, v0}, LG8/o;->r(LG8/m;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_15

    .line 257
    .line 258
    invoke-interface {v8, v0}, LG8/o;->m(LG8/m;)Ljava/util/Collection;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-eqz v0, :cond_12

    .line 263
    .line 264
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_12

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_14

    .line 280
    .line 281
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    check-cast v1, LG8/i;

    .line 286
    .line 287
    instance-of v1, v1, LG8/d;

    .line 288
    .line 289
    if-nez v1, :cond_13

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_14
    :goto_5
    sget-object v0, LC8/g;->a:LC8/g;

    .line 293
    .line 294
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-direct {v0, v1, p3, p2}, LC8/g;->o(LG8/o;LG8/i;LG8/i;)LG8/n;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-eqz v0, :cond_15

    .line 303
    .line 304
    invoke-interface {v8, p3}, LG8/o;->c(LG8/j;)LG8/m;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-interface {v8, v0, v1}, LG8/o;->u(LG8/n;LG8/m;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_15

    .line 313
    .line 314
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 315
    .line 316
    return-object v0

    .line 317
    :cond_15
    :goto_6
    return-object v11

    .line 318
    :cond_16
    :goto_7
    invoke-virtual {p1}, LC8/u0;->n()Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    return-object v0

    .line 327
    :cond_17
    :goto_8
    invoke-virtual {p1}, LC8/u0;->m()Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_18

    .line 332
    .line 333
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_18
    invoke-interface {v8, p2}, LG8/o;->W(LG8/j;)Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_19

    .line 341
    .line 342
    invoke-interface {v8, p3}, LG8/o;->W(LG8/j;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-nez v0, :cond_19

    .line 347
    .line 348
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 349
    .line 350
    return-object v0

    .line 351
    :cond_19
    sget-object v0, LC8/d;->a:LC8/d;

    .line 352
    .line 353
    invoke-interface {v8, p2, v9}, LG8/o;->g(LG8/j;Z)LG8/j;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-interface {v8, p3, v9}, LG8/o;->g(LG8/j;Z)LG8/j;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v0, v8, v1, v2}, LC8/d;->b(LG8/o;LG8/i;LG8/i;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0
.end method

.method private final i(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;
    .locals 12

    .line 1
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p2, p3}, LG8/o;->M(LG8/j;LG8/m;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-interface {v0, p3}, LG8/o;->t0(LG8/m;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p2}, LG8/o;->B(LG8/j;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    invoke-interface {v0, p3}, LG8/o;->t(LG8/m;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-interface {v0, p2}, LG8/o;->c(LG8/j;)LG8/m;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1, p3}, LG8/o;->V(LG8/m;LG8/m;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    sget-object p1, LG8/b;->g:LG8/b;

    .line 46
    .line 47
    invoke-interface {v0, p2, p1}, LG8/o;->R(LG8/j;LG8/b;)LG8/j;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-object p2, p1

    .line 55
    :goto_0
    invoke-static {p2}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_3
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_4
    new-instance v1, LM8/k;

    .line 66
    .line 67
    invoke-direct {v1}, LM8/k;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, LC8/u0;->k()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, LC8/u0;->h()Ljava/util/ArrayDeque;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, LC8/u0;->i()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_c

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const/16 v5, 0x3e8

    .line 101
    .line 102
    if-gt v4, v5, :cond_b

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, LG8/j;

    .line 109
    .line 110
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_5

    .line 118
    .line 119
    sget-object v5, LG8/b;->g:LG8/b;

    .line 120
    .line 121
    invoke-interface {v0, v4, v5}, LG8/o;->R(LG8/j;LG8/b;)LG8/j;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-nez v5, :cond_6

    .line 126
    .line 127
    move-object v5, v4

    .line 128
    :cond_6
    invoke-interface {v0, v5}, LG8/o;->c(LG8/j;)LG8/m;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-interface {v0, v6, p3}, LG8/o;->V(LG8/m;LG8/m;)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_7

    .line 137
    .line 138
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    sget-object v5, LC8/u0$c$c;->a:LC8/u0$c$c;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    invoke-interface {v0, v5}, LG8/o;->x0(LG8/i;)I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-nez v6, :cond_8

    .line 149
    .line 150
    sget-object v5, LC8/u0$c$b;->a:LC8/u0$c$b;

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_8
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-interface {v6, v5}, LG8/o;->J(LG8/j;)LC8/u0$c;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    :goto_2
    sget-object v6, LC8/u0$c$c;->a:LC8/u0$c$c;

    .line 162
    .line 163
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-nez v6, :cond_9

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_9
    const/4 v5, 0x0

    .line 171
    :goto_3
    if-nez v5, :cond_a

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_a
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-interface {v6, v4}, LG8/o;->c(LG8/j;)LG8/m;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-interface {v6, v4}, LG8/o;->m(LG8/m;)Ljava/util/Collection;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_5

    .line 195
    .line 196
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    check-cast v6, LG8/i;

    .line 201
    .line 202
    invoke-virtual {v5, p1, v6}, LC8/u0$c;->a(LC8/u0;LG8/i;)LG8/j;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-virtual {v2, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    new-instance p3, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v0, "Too many supertypes for type: "

    .line 218
    .line 219
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string p2, ". Supertypes = "

    .line 226
    .line 227
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const/16 v10, 0x3f

    .line 231
    .line 232
    const/4 v11, 0x0

    .line 233
    const/4 v4, 0x0

    .line 234
    const/4 v5, 0x0

    .line 235
    const/4 v6, 0x0

    .line 236
    const/4 v7, 0x0

    .line 237
    const/4 v8, 0x0

    .line 238
    const/4 v9, 0x0

    .line 239
    invoke-static/range {v3 .. v11}, Lj7/q;->o0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :cond_c
    invoke-virtual {p1}, LC8/u0;->e()V

    .line 259
    .line 260
    .line 261
    return-object v1
.end method

.method private final j(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LC8/g;->i(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, LC8/g;->A(LC8/u0;Ljava/util/List;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final k(LC8/u0;LG8/i;LG8/i;Z)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, p2}, LC8/u0;->p(LG8/i;)LG8/i;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, LC8/u0;->o(LG8/i;)LG8/i;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p3}, LC8/u0;->p(LG8/i;)LG8/i;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p1, p3}, LC8/u0;->o(LG8/i;)LG8/i;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    sget-object v1, LC8/g;->a:LC8/g;

    .line 22
    .line 23
    invoke-interface {v0, p2}, LG8/o;->K(LG8/i;)LG8/j;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, p3}, LG8/o;->m0(LG8/i;)LG8/j;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v1, p1, v2, v3}, LC8/g;->h(LC8/u0;LG8/j;LG8/j;)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, p2, p3, p4}, LC8/u0;->c(LG8/i;LG8/i;Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :cond_0
    invoke-virtual {p1, p2, p3, p4}, LC8/u0;->c(LG8/i;LG8/i;Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    if-eqz p4, :cond_1

    .line 50
    .line 51
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :cond_1
    invoke-interface {v0, p2}, LG8/o;->K(LG8/i;)LG8/j;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-interface {v0, p3}, LG8/o;->m0(LG8/i;)LG8/j;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-direct {v1, p1, p2, p3}, LC8/g;->w(LC8/u0;LG8/j;LG8/j;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1
.end method

.method private final o(LG8/o;LG8/i;LG8/i;)LG8/n;
    .locals 6

    .line 1
    invoke-interface {p1, p2}, LG8/o;->x0(LG8/i;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/4 v3, 0x0

    .line 8
    if-ge v2, v0, :cond_6

    .line 9
    .line 10
    invoke-interface {p1, p2, v2}, LG8/o;->T(LG8/i;I)LG8/l;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-interface {p1, v4}, LG8/o;->l(LG8/l;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    move-object v3, v4

    .line 21
    :cond_0
    if-eqz v3, :cond_5

    .line 22
    .line 23
    invoke-interface {p1, v3}, LG8/o;->h(LG8/l;)LG8/i;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-interface {p1, v3}, LG8/o;->K(LG8/i;)LG8/j;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {p1, v4}, LG8/o;->H0(LG8/j;)LG8/j;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {p1, v4}, LG8/o;->L(LG8/i;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-interface {p1, p3}, LG8/o;->K(LG8/i;)LG8/j;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {p1, v4}, LG8/o;->H0(LG8/j;)LG8/j;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {p1, v4}, LG8/o;->L(LG8/i;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v4, v1

    .line 61
    :goto_1
    invoke-static {v3, p3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-nez v5, :cond_4

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    invoke-interface {p1, v3}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p1, p3}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-direct {p0, p1, v3, p3}, LC8/g;->o(LG8/o;LG8/i;LG8/i;)LG8/n;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_4
    :goto_2
    invoke-interface {p1, p2}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-interface {p1, p2, v2}, LG8/o;->y0(LG8/m;I)LG8/n;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    return-object v3
.end method

.method private final p(LC8/u0;LG8/j;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p2}, LG8/o;->c(LG8/j;)LG8/m;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, LG8/o;->t0(LG8/m;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, LG8/o;->w(LG8/m;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-interface {v0, p2}, LG8/o;->c(LG8/j;)LG8/m;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, LG8/o;->w(LG8/m;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    invoke-virtual {p1}, LC8/u0;->k()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, LC8/u0;->h()Ljava/util/ArrayDeque;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, LC8/u0;->i()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_8

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/16 v5, 0x3e8

    .line 63
    .line 64
    if-gt v4, v5, :cond_7

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, LG8/j;

    .line 71
    .line 72
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    invoke-interface {v0, v4}, LG8/o;->B(LG8/j;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    sget-object v5, LC8/u0$c$c;->a:LC8/u0$c$c;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    sget-object v5, LC8/u0$c$b;->a:LC8/u0$c$b;

    .line 91
    .line 92
    :goto_1
    sget-object v6, LC8/u0$c$c;->a:LC8/u0$c$c;

    .line 93
    .line 94
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-nez v6, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    const/4 v5, 0x0

    .line 102
    :goto_2
    if-nez v5, :cond_5

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-interface {v6, v4}, LG8/o;->c(LG8/j;)LG8/m;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-interface {v6, v4}, LG8/o;->m(LG8/m;)Ljava/util/Collection;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_2

    .line 126
    .line 127
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    check-cast v6, LG8/i;

    .line 132
    .line 133
    invoke-virtual {v5, p1, v6}, LC8/u0$c;->a(LC8/u0;LG8/i;)LG8/j;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-interface {v0, v6}, LG8/o;->c(LG8/j;)LG8/m;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-interface {v0, v7}, LG8/o;->w(LG8/m;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_6

    .line 146
    .line 147
    invoke-virtual {p1}, LC8/u0;->e()V

    .line 148
    .line 149
    .line 150
    return v2

    .line 151
    :cond_6
    invoke-virtual {v1, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 156
    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v1, "Too many supertypes for type: "

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string p2, ". Supertypes = "

    .line 171
    .line 172
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const/16 v10, 0x3f

    .line 176
    .line 177
    const/4 v11, 0x0

    .line 178
    const/4 v4, 0x0

    .line 179
    const/4 v5, 0x0

    .line 180
    const/4 v6, 0x0

    .line 181
    const/4 v7, 0x0

    .line 182
    const/4 v8, 0x0

    .line 183
    const/4 v9, 0x0

    .line 184
    invoke-static/range {v3 .. v11}, Lj7/q;->o0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p1

    .line 203
    :cond_8
    invoke-virtual {p1}, LC8/u0;->e()V

    .line 204
    .line 205
    .line 206
    const/4 p1, 0x0

    .line 207
    return p1
.end method

.method private final q(LG8/o;LG8/i;)Z
    .locals 1

    .line 1
    invoke-interface {p1, p2}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, LG8/o;->j(LG8/m;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, p2}, LG8/o;->Q(LG8/i;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, p2}, LG8/o;->f0(LG8/i;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p1, p2}, LG8/o;->v(LG8/i;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, p2}, LG8/o;->s0(LG8/i;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method private final r(LG8/o;LG8/j;LG8/j;)Z
    .locals 3

    .line 1
    invoke-interface {p1, p2}, LG8/o;->B0(LG8/j;)LG8/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0}, LG8/o;->e0(LG8/e;)LG8/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    move-object v0, p2

    .line 14
    :cond_1
    invoke-interface {p1, p3}, LG8/o;->B0(LG8/j;)LG8/e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {p1, v1}, LG8/o;->e0(LG8/e;)LG8/j;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    :cond_2
    move-object v1, p3

    .line 27
    :cond_3
    invoke-interface {p1, v0}, LG8/o;->c(LG8/j;)LG8/m;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p1, v1}, LG8/o;->c(LG8/j;)LG8/m;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eq v0, v1, :cond_4

    .line 37
    .line 38
    return v2

    .line 39
    :cond_4
    invoke-interface {p1, p2}, LG8/o;->f0(LG8/i;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_5

    .line 44
    .line 45
    invoke-interface {p1, p3}, LG8/o;->f0(LG8/i;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    return v2

    .line 52
    :cond_5
    invoke-interface {p1, p2}, LG8/o;->W(LG8/j;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_6

    .line 57
    .line 58
    invoke-interface {p1, p3}, LG8/o;->W(LG8/j;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_6

    .line 63
    .line 64
    return v2

    .line 65
    :cond_6
    const/4 p1, 0x1

    .line 66
    return p1
.end method

.method public static synthetic v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LC8/g;->u(LC8/u0;LG8/i;LG8/i;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private final w(LC8/u0;LG8/j;LG8/j;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, LC8/u0;->j()LG8/o;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-boolean v4, LC8/g;->b:Z

    .line 12
    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    invoke-interface {v3, v1}, LG8/o;->b(LG8/j;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    invoke-interface {v3, v1}, LG8/o;->c(LG8/j;)LG8/m;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v3, v4}, LG8/o;->r(LG8/m;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    invoke-virtual/range {p1 .. p2}, LC8/u0;->l(LG8/i;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    :cond_0
    invoke-interface {v3, v2}, LG8/o;->b(LG8/j;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, v2}, LC8/u0;->l(LG8/i;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    :cond_1
    sget-object v4, LC8/c;->a:LC8/c;

    .line 46
    .line 47
    invoke-virtual {v4, v0, v1, v2}, LC8/c;->d(LC8/u0;LG8/j;LG8/j;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    return v5

    .line 55
    :cond_2
    sget-object v4, LC8/g;->a:LC8/g;

    .line 56
    .line 57
    invoke-interface {v3, v1}, LG8/o;->K(LG8/i;)LG8/j;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-interface {v3, v2}, LG8/o;->m0(LG8/i;)LG8/j;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-direct {v4, v0, v6, v7}, LC8/g;->c(LC8/u0;LG8/j;LG8/j;)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    const/4 v4, 0x4

    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-static/range {v0 .. v5}, LC8/u0;->d(LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    return v6

    .line 82
    :cond_3
    invoke-interface {v3, v2}, LG8/o;->c(LG8/j;)LG8/m;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {v3, v1}, LG8/o;->c(LG8/j;)LG8/m;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-interface {v3, v7, v6}, LG8/o;->V(LG8/m;LG8/m;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    const/4 v8, 0x1

    .line 95
    if-eqz v7, :cond_4

    .line 96
    .line 97
    invoke-interface {v3, v6}, LG8/o;->D(LG8/m;)I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-nez v7, :cond_4

    .line 102
    .line 103
    return v8

    .line 104
    :cond_4
    invoke-interface {v3, v2}, LG8/o;->c(LG8/j;)LG8/m;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-interface {v3, v7}, LG8/o;->G0(LG8/m;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_5

    .line 113
    .line 114
    return v8

    .line 115
    :cond_5
    invoke-virtual {v4, v0, v1, v6}, LC8/g;->n(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    const/16 v9, 0xa

    .line 124
    .line 125
    if-le v7, v8, :cond_8

    .line 126
    .line 127
    invoke-virtual {v0}, LC8/u0;->j()LG8/o;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    instance-of v11, v7, LG8/q;

    .line 132
    .line 133
    if-eqz v11, :cond_6

    .line 134
    .line 135
    check-cast v7, LG8/q;

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_6
    const/4 v7, 0x0

    .line 139
    :goto_0
    if-eqz v7, :cond_8

    .line 140
    .line 141
    invoke-interface {v7}, LG8/q;->i0()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-ne v7, v8, :cond_8

    .line 146
    .line 147
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 148
    .line 149
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_a

    .line 161
    .line 162
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    check-cast v11, LG8/j;

    .line 167
    .line 168
    invoke-virtual {v0, v11}, LC8/u0;->o(LG8/i;)LG8/i;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    invoke-interface {v3, v12}, LG8/o;->a(LG8/i;)LG8/j;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    if-nez v12, :cond_7

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_7
    move-object v11, v12

    .line 180
    :goto_2
    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_8
    new-instance v7, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-static {v4, v9}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    if-eqz v11, :cond_a

    .line 202
    .line 203
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    check-cast v11, LG8/j;

    .line 208
    .line 209
    invoke-virtual {v0, v11}, LC8/u0;->o(LG8/i;)LG8/i;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    invoke-interface {v3, v12}, LG8/o;->a(LG8/i;)LG8/j;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    if-nez v12, :cond_9

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_9
    move-object v11, v12

    .line 221
    :goto_4
    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_a
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-eqz v4, :cond_14

    .line 230
    .line 231
    if-eq v4, v8, :cond_13

    .line 232
    .line 233
    new-instance v4, LG8/a;

    .line 234
    .line 235
    invoke-interface {v3, v6}, LG8/o;->D(LG8/m;)I

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    invoke-direct {v4, v11}, LG8/a;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v3, v6}, LG8/o;->D(LG8/m;)I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    move v12, v5

    .line 247
    move v13, v12

    .line 248
    :goto_5
    if-ge v12, v11, :cond_11

    .line 249
    .line 250
    if-nez v13, :cond_c

    .line 251
    .line 252
    invoke-interface {v3, v6, v12}, LG8/o;->y0(LG8/m;I)LG8/n;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    invoke-interface {v3, v13}, LG8/o;->y(LG8/n;)LG8/s;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    sget-object v14, LG8/s;->i:LG8/s;

    .line 261
    .line 262
    if-eq v13, v14, :cond_b

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_b
    move v13, v5

    .line 266
    goto :goto_7

    .line 267
    :cond_c
    :goto_6
    move v13, v8

    .line 268
    :goto_7
    if-nez v13, :cond_10

    .line 269
    .line 270
    new-instance v14, Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-static {v7, v9}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 273
    .line 274
    .line 275
    move-result v15

    .line 276
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object v15

    .line 283
    :goto_8
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v16

    .line 287
    if-eqz v16, :cond_f

    .line 288
    .line 289
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v16

    .line 293
    move-object/from16 v5, v16

    .line 294
    .line 295
    check-cast v5, LG8/j;

    .line 296
    .line 297
    move/from16 v16, v8

    .line 298
    .line 299
    invoke-interface {v3, v5, v12}, LG8/o;->l0(LG8/j;I)LG8/l;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    if-eqz v8, :cond_e

    .line 304
    .line 305
    invoke-interface {v3, v8}, LG8/o;->A0(LG8/l;)LG8/s;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    sget-object v10, LG8/s;->j:LG8/s;

    .line 310
    .line 311
    if-ne v9, v10, :cond_d

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_d
    const/4 v8, 0x0

    .line 315
    :goto_9
    if-eqz v8, :cond_e

    .line 316
    .line 317
    invoke-interface {v3, v8}, LG8/o;->h(LG8/l;)LG8/i;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    if-eqz v8, :cond_e

    .line 322
    .line 323
    invoke-interface {v14, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move/from16 v8, v16

    .line 327
    .line 328
    const/4 v5, 0x0

    .line 329
    const/16 v9, 0xa

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 333
    .line 334
    new-instance v3, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 337
    .line 338
    .line 339
    const-string v4, "Incorrect type: "

    .line 340
    .line 341
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string v4, ", subType: "

    .line 348
    .line 349
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v1, ", superType: "

    .line 356
    .line 357
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    throw v0

    .line 375
    :cond_f
    move/from16 v16, v8

    .line 376
    .line 377
    invoke-interface {v3, v14}, LG8/o;->Z(Ljava/util/Collection;)LG8/i;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    invoke-interface {v3, v5}, LG8/o;->X(LG8/i;)LG8/l;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_10
    move/from16 v16, v8

    .line 390
    .line 391
    :goto_a
    add-int/lit8 v12, v12, 0x1

    .line 392
    .line 393
    move/from16 v8, v16

    .line 394
    .line 395
    const/4 v5, 0x0

    .line 396
    const/16 v9, 0xa

    .line 397
    .line 398
    goto/16 :goto_5

    .line 399
    .line 400
    :cond_11
    move/from16 v16, v8

    .line 401
    .line 402
    if-nez v13, :cond_12

    .line 403
    .line 404
    sget-object v1, LC8/g;->a:LC8/g;

    .line 405
    .line 406
    invoke-virtual {v1, v0, v4, v2}, LC8/g;->s(LC8/u0;LG8/k;LG8/j;)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-eqz v1, :cond_12

    .line 411
    .line 412
    return v16

    .line 413
    :cond_12
    new-instance v1, LC8/e;

    .line 414
    .line 415
    invoke-direct {v1, v7, v0, v3, v2}, LC8/e;-><init>(Ljava/util/Collection;LC8/u0;LG8/o;LG8/j;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v1}, LC8/u0;->q(Lkotlin/jvm/functions/Function1;)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    return v0

    .line 423
    :cond_13
    sget-object v1, LC8/g;->a:LC8/g;

    .line 424
    .line 425
    invoke-static {v7}, Lj7/q;->d0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    check-cast v4, LG8/j;

    .line 430
    .line 431
    invoke-interface {v3, v4}, LG8/o;->z0(LG8/j;)LG8/k;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v1, v0, v3, v2}, LC8/g;->s(LC8/u0;LG8/k;LG8/j;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    return v0

    .line 440
    :cond_14
    sget-object v2, LC8/g;->a:LC8/g;

    .line 441
    .line 442
    invoke-direct {v2, v0, v1}, LC8/g;->p(LC8/u0;LG8/j;)Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    return v0
.end method

.method private static final x(Ljava/util/Collection;LC8/u0;LG8/o;LG8/j;LC8/u0$a;)Li7/B;
    .locals 2

    .line 1
    const-string v0, "$this$runForkingPoint"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LG8/j;

    .line 21
    .line 22
    new-instance v1, LC8/f;

    .line 23
    .line 24
    invoke-direct {v1, p1, p2, v0, p3}, LC8/f;-><init>(LC8/u0;LG8/o;LG8/j;LG8/j;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p4, v1}, LC8/u0$a;->a(Lw7/a;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p0, Li7/B;->a:Li7/B;

    .line 32
    .line 33
    return-object p0
.end method

.method private static final y(LC8/u0;LG8/o;LG8/j;LG8/j;)Z
    .locals 1

    .line 1
    sget-object v0, LC8/g;->a:LC8/g;

    .line 2
    .line 3
    invoke-interface {p1, p2}, LG8/o;->z0(LG8/j;)LG8/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p0, p1, p3}, LC8/g;->s(LC8/u0;LG8/k;LG8/j;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private final z(LG8/o;LG8/i;LG8/i;LG8/m;)Z
    .locals 1

    .line 1
    invoke-interface {p1, p2}, LG8/o;->a(LG8/i;)LG8/j;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of p4, p2, LG8/d;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p4, :cond_2

    .line 9
    .line 10
    check-cast p2, LG8/d;

    .line 11
    .line 12
    invoke-interface {p1, p2}, LG8/o;->k(LG8/d;)Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-nez p4, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, p2}, LG8/o;->z(LG8/d;)LG8/c;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-interface {p1, p4}, LG8/o;->o0(LG8/c;)LG8/l;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-interface {p1, p4}, LG8/o;->l(LG8/l;)Z

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    if-nez p4, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {p1, p2}, LG8/o;->N(LG8/d;)LG8/b;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    sget-object p4, LG8/b;->g:LG8/b;

    .line 38
    .line 39
    if-eq p2, p4, :cond_1

    .line 40
    .line 41
    return v0

    .line 42
    :cond_1
    invoke-interface {p1, p3}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public final l(LG8/s;LG8/s;)LG8/s;
    .locals 1

    .line 1
    const-string v0, "declared"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "useSite"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LG8/s;->j:LG8/s;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-object p2

    .line 16
    :cond_0
    if-ne p2, v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    :goto_0
    return-object p1

    .line 22
    :cond_2
    const/4 p1, 0x0

    .line 23
    return-object p1
.end method

.method public final m(LC8/u0;LG8/i;LG8/i;)Z
    .locals 11

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "a"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "b"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p2, p3, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    sget-object v2, LC8/g;->a:LC8/g;

    .line 25
    .line 26
    invoke-direct {v2, v0, p2}, LC8/g;->q(LG8/o;LG8/i;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v9, 0x0

    .line 31
    if-eqz v3, :cond_5

    .line 32
    .line 33
    invoke-direct {v2, v0, p3}, LC8/g;->q(LG8/o;LG8/i;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_5

    .line 38
    .line 39
    invoke-virtual {p1, p2}, LC8/u0;->p(LG8/i;)LG8/i;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {p1, v3}, LC8/u0;->o(LG8/i;)LG8/i;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {p1, p3}, LC8/u0;->p(LG8/i;)LG8/i;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {p1, v4}, LC8/u0;->o(LG8/i;)LG8/i;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v0, v3}, LG8/o;->K(LG8/i;)LG8/j;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-interface {v0, v3}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-interface {v0, v4}, LG8/o;->D0(LG8/i;)LG8/m;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-interface {v0, v6, v7}, LG8/o;->V(LG8/m;LG8/m;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_1

    .line 72
    .line 73
    return v9

    .line 74
    :cond_1
    invoke-interface {v0, v5}, LG8/o;->x0(LG8/i;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_5

    .line 79
    .line 80
    invoke-interface {v0, v3}, LG8/o;->p0(LG8/i;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_4

    .line 85
    .line 86
    invoke-interface {v0, v4}, LG8/o;->p0(LG8/i;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-interface {v0, v5}, LG8/o;->W(LG8/j;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-interface {v0, v4}, LG8/o;->K(LG8/i;)LG8/j;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-interface {v0, p2}, LG8/o;->W(LG8/j;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-ne p1, p2, :cond_3

    .line 106
    .line 107
    return v1

    .line 108
    :cond_3
    return v9

    .line 109
    :cond_4
    :goto_0
    return v1

    .line 110
    :cond_5
    const/16 v7, 0x8

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    move-object v3, p1

    .line 115
    move-object v4, p2

    .line 116
    move-object v5, p3

    .line 117
    invoke-static/range {v2 .. v8}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    const/16 v7, 0x8

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    move-object v10, v5

    .line 128
    move-object v5, v4

    .line 129
    move-object v4, v10

    .line 130
    invoke-static/range {v2 .. v8}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    return v1

    .line 137
    :cond_6
    return v9
.end method

.method public final n(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;
    .locals 12

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superConstructor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p2}, LG8/o;->B(LG8/j;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget-object v0, LC8/g;->a:LC8/g;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2, p3}, LC8/g;->j(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-interface {v0, p3}, LG8/o;->t0(LG8/m;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v0, p3}, LG8/o;->q(LG8/m;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    sget-object v0, LC8/g;->a:LC8/g;

    .line 46
    .line 47
    invoke-direct {v0, p1, p2, p3}, LC8/g;->i(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_1
    new-instance v1, LM8/k;

    .line 53
    .line 54
    invoke-direct {v1}, LM8/k;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, LC8/u0;->k()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, LC8/u0;->h()Ljava/util/ArrayDeque;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, LC8/u0;->i()Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_7

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const/16 v5, 0x3e8

    .line 88
    .line 89
    if-gt v4, v5, :cond_6

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, LG8/j;

    .line 96
    .line 97
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_2

    .line 105
    .line 106
    invoke-interface {v0, v4}, LG8/o;->B(LG8/j;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_3

    .line 111
    .line 112
    invoke-virtual {v1, v4}, LM8/k;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    sget-object v5, LC8/u0$c$c;->a:LC8/u0$c$c;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    sget-object v5, LC8/u0$c$b;->a:LC8/u0$c$b;

    .line 119
    .line 120
    :goto_1
    sget-object v6, LC8/u0$c$c;->a:LC8/u0$c$c;

    .line 121
    .line 122
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_4

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    const/4 v5, 0x0

    .line 130
    :goto_2
    if-nez v5, :cond_5

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_5
    invoke-virtual {p1}, LC8/u0;->j()LG8/o;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-interface {v6, v4}, LG8/o;->c(LG8/j;)LG8/m;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-interface {v6, v4}, LG8/o;->m(LG8/m;)Ljava/util/Collection;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_2

    .line 154
    .line 155
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    check-cast v6, LG8/i;

    .line 160
    .line 161
    invoke-virtual {v5, p1, v6}, LC8/u0$c;->a(LC8/u0;LG8/i;)LG8/j;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v2, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    new-instance p3, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v0, "Too many supertypes for type: "

    .line 177
    .line 178
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p2, ". Supertypes = "

    .line 185
    .line 186
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const/16 v10, 0x3f

    .line 190
    .line 191
    const/4 v11, 0x0

    .line 192
    const/4 v4, 0x0

    .line 193
    const/4 v5, 0x0

    .line 194
    const/4 v6, 0x0

    .line 195
    const/4 v7, 0x0

    .line 196
    const/4 v8, 0x0

    .line 197
    const/4 v9, 0x0

    .line 198
    invoke-static/range {v3 .. v11}, Lj7/q;->o0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :cond_7
    invoke-virtual {p1}, LC8/u0;->e()V

    .line 218
    .line 219
    .line 220
    new-instance p2, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eqz v1, :cond_8

    .line 234
    .line 235
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, LG8/j;

    .line 240
    .line 241
    sget-object v2, LC8/g;->a:LC8/g;

    .line 242
    .line 243
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v2, p1, v1, p3}, LC8/g;->j(LC8/u0;LG8/j;LG8/m;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-static {p2, v1}, Lj7/q;->A(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_8
    return-object p2
.end method

.method public final s(LC8/u0;LG8/k;LG8/j;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    const-string v0, "<this>"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "capturedSubArguments"

    .line 13
    .line 14
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "superType"

    .line 18
    .line 19
    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, LC8/u0;->j()LG8/o;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    invoke-interface {v9, v8}, LG8/o;->c(LG8/j;)LG8/m;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    invoke-interface {v9, v7}, LG8/o;->F0(LG8/k;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {v9, v10}, LG8/o;->D(LG8/m;)I

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    const/4 v12, 0x0

    .line 39
    if-ne v0, v11, :cond_9

    .line 40
    .line 41
    invoke-interface {v9, v8}, LG8/o;->x0(LG8/i;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eq v0, v2, :cond_0

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    move v13, v12

    .line 50
    :goto_0
    const/4 v0, 0x1

    .line 51
    if-ge v13, v11, :cond_8

    .line 52
    .line 53
    invoke-interface {v9, v8, v13}, LG8/o;->T(LG8/i;I)LG8/l;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v9, v2}, LG8/o;->l(LG8/l;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_7

    .line 62
    .line 63
    invoke-interface {v9, v2}, LG8/o;->h(LG8/l;)LG8/i;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v9, v7, v13}, LG8/o;->I(LG8/k;I)LG8/l;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {v9, v4}, LG8/o;->A0(LG8/l;)LG8/s;

    .line 72
    .line 73
    .line 74
    sget-object v5, LG8/s;->j:LG8/s;

    .line 75
    .line 76
    invoke-interface {v9, v4}, LG8/o;->h(LG8/l;)LG8/i;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    sget-object v6, LC8/g;->a:LC8/g;

    .line 81
    .line 82
    invoke-interface {v9, v10, v13}, LG8/o;->y0(LG8/m;I)LG8/n;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    invoke-interface {v9, v14}, LG8/o;->y(LG8/n;)LG8/s;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    invoke-interface {v9, v2}, LG8/o;->A0(LG8/l;)LG8/s;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v6, v14, v2}, LC8/g;->l(LG8/s;LG8/s;)LG8/s;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-nez v2, :cond_1

    .line 99
    .line 100
    invoke-virtual {v1}, LC8/u0;->m()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    return v0

    .line 105
    :cond_1
    if-ne v2, v5, :cond_2

    .line 106
    .line 107
    invoke-direct {v6, v9, v4, v3, v10}, LC8/g;->z(LG8/o;LG8/i;LG8/i;LG8/m;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_7

    .line 112
    .line 113
    invoke-direct {v6, v9, v3, v4, v10}, LC8/g;->z(LG8/o;LG8/i;LG8/i;LG8/m;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_2

    .line 118
    .line 119
    goto/16 :goto_2

    .line 120
    .line 121
    :cond_2
    invoke-static {v1}, LC8/u0;->a(LC8/u0;)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    const/16 v14, 0x64

    .line 126
    .line 127
    if-gt v5, v14, :cond_6

    .line 128
    .line 129
    invoke-static {v1}, LC8/u0;->a(LC8/u0;)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    add-int/2addr v5, v0

    .line 134
    invoke-static {v1, v5}, LC8/u0;->b(LC8/u0;I)V

    .line 135
    .line 136
    .line 137
    sget-object v5, LC8/g$a;->a:[I

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    aget v2, v5, v2

    .line 144
    .line 145
    if-eq v2, v0, :cond_5

    .line 146
    .line 147
    const/4 v0, 0x2

    .line 148
    if-eq v2, v0, :cond_4

    .line 149
    .line 150
    const/4 v0, 0x3

    .line 151
    if-ne v2, v0, :cond_3

    .line 152
    .line 153
    const/16 v5, 0x8

    .line 154
    .line 155
    move-object v0, v6

    .line 156
    const/4 v6, 0x0

    .line 157
    move-object v2, v4

    .line 158
    const/4 v4, 0x0

    .line 159
    move-object v15, v3

    .line 160
    move-object v3, v2

    .line 161
    move-object v2, v15

    .line 162
    invoke-static/range {v0 .. v6}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    move-object/from16 v1, p1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    new-instance v0, Li7/m;

    .line 170
    .line 171
    invoke-direct {v0}, Li7/m;-><init>()V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :cond_4
    move-object v2, v3

    .line 176
    move-object v3, v4

    .line 177
    move-object v0, v6

    .line 178
    const/16 v5, 0x8

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    const/4 v4, 0x0

    .line 182
    move-object v1, v3

    .line 183
    move-object v3, v2

    .line 184
    move-object v2, v1

    .line 185
    move-object/from16 v1, p1

    .line 186
    .line 187
    invoke-static/range {v0 .. v6}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    goto :goto_1

    .line 192
    :cond_5
    move-object v2, v3

    .line 193
    move-object v3, v4

    .line 194
    move-object v0, v6

    .line 195
    invoke-virtual {v0, v1, v3, v2}, LC8/g;->m(LC8/u0;LG8/i;LG8/i;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    :goto_1
    invoke-static {v1}, LC8/u0;->a(LC8/u0;)I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    add-int/lit8 v2, v2, -0x1

    .line 204
    .line 205
    invoke-static {v1, v2}, LC8/u0;->b(LC8/u0;I)V

    .line 206
    .line 207
    .line 208
    if-nez v0, :cond_7

    .line 209
    .line 210
    return v12

    .line 211
    :cond_6
    move-object v3, v4

    .line 212
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    new-instance v1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v2, "Arguments depth is too high. Some related argument: "

    .line 220
    .line 221
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v0

    .line 239
    :cond_7
    :goto_2
    add-int/lit8 v13, v13, 0x1

    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_8
    return v0

    .line 244
    :cond_9
    :goto_3
    return v12
.end method

.method public final t(LC8/u0;LG8/i;LG8/i;)Z
    .locals 8

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/16 v6, 0x8

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move-object v4, p3

    .line 24
    invoke-static/range {v1 .. v7}, LC8/g;->v(LC8/g;LC8/u0;LG8/i;LG8/i;ZILjava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method public final u(LC8/u0;LG8/i;LG8/i;Z)Z
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-ne p2, p3, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-virtual {p1, p2, p3}, LC8/u0;->f(LG8/i;LG8/i;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LC8/g;->k(LC8/u0;LG8/i;LG8/i;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method
