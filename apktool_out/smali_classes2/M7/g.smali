.class public abstract LM7/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:Lk8/f;

.field private static final b:Lk8/f;

.field private static final c:Lk8/f;

.field private static final d:Lk8/f;

.field private static final e:Lk8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "identifier(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, LM7/g;->a:Lk8/f;

    .line 13
    .line 14
    const-string v0, "replaceWith"

    .line 15
    .line 16
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LM7/g;->b:Lk8/f;

    .line 24
    .line 25
    const-string v0, "level"

    .line 26
    .line 27
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LM7/g;->c:Lk8/f;

    .line 35
    .line 36
    const-string v0, "expression"

    .line 37
    .line 38
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, LM7/g;->d:Lk8/f;

    .line 46
    .line 47
    const-string v0, "imports"

    .line 48
    .line 49
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-object v0, LM7/g;->e:Lk8/f;

    .line 57
    .line 58
    return-void
.end method

.method static synthetic a(LI7/i;LL7/H;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LM7/g;->d(LI7/i;LL7/H;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final b(LI7/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LM7/c;
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "message"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "replaceWith"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "level"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, LM7/l;

    .line 22
    .line 23
    sget-object v3, LI7/o$a;->B:Lk8/c;

    .line 24
    .line 25
    sget-object v0, LM7/g;->d:Lk8/f;

    .line 26
    .line 27
    new-instance v2, Lq8/x;

    .line 28
    .line 29
    invoke-direct {v2, p2}, Lq8/x;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    sget-object v0, LM7/g;->e:Lk8/f;

    .line 37
    .line 38
    new-instance v2, Lq8/b;

    .line 39
    .line 40
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v5, LM7/f;

    .line 45
    .line 46
    invoke-direct {v5, p0}, LM7/f;-><init>(LI7/i;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v4, v5}, Lq8/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    filled-new-array {p2, v0}, [Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p2}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const/16 v6, 0x8

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    move-object v2, p0

    .line 69
    invoke-direct/range {v1 .. v7}, LM7/l;-><init>(LI7/i;Lk8/c;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, LM7/l;

    .line 73
    .line 74
    sget-object p2, LI7/o$a;->y:Lk8/c;

    .line 75
    .line 76
    sget-object v0, LM7/g;->a:Lk8/f;

    .line 77
    .line 78
    new-instance v3, Lq8/x;

    .line 79
    .line 80
    invoke-direct {v3, p1}, Lq8/x;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object v0, LM7/g;->b:Lk8/f;

    .line 88
    .line 89
    new-instance v3, Lq8/a;

    .line 90
    .line 91
    invoke-direct {v3, v1}, Lq8/a;-><init>(LM7/c;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v3}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v1, LM7/g;->c:Lk8/f;

    .line 99
    .line 100
    new-instance v3, Lq8/k;

    .line 101
    .line 102
    sget-object v4, Lk8/b;->d:Lk8/b$a;

    .line 103
    .line 104
    sget-object v5, LI7/o$a;->A:Lk8/c;

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {p3}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    const-string v5, "identifier(...)"

    .line 115
    .line 116
    invoke-static {p3, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {v3, v4, p3}, Lq8/k;-><init>(Lk8/b;Lk8/f;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1, v3}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    filled-new-array {p1, v0, p3}, [Lkotlin/Pair;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-direct {p0, v2, p2, p1, p4}, LM7/l;-><init>(LI7/i;Lk8/c;Ljava/util/Map;Z)V

    .line 135
    .line 136
    .line 137
    return-object p0
.end method

.method public static synthetic c(LI7/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)LM7/c;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x4

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    const-string p3, "WARNING"

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 14
    .line 15
    if-eqz p5, :cond_2

    .line 16
    .line 17
    const/4 p4, 0x0

    .line 18
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, LM7/g;->b(LI7/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LM7/c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static final d(LI7/i;LL7/H;)LC8/S;
    .locals 1

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LL7/H;->n()LI7/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, LC8/N0;->k:LC8/N0;

    .line 11
    .line 12
    invoke-virtual {p0}, LI7/i;->W()LC8/d0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p1, v0, p0}, LI7/i;->l(LC8/N0;LC8/S;)LC8/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "getArrayType(...)"

    .line 21
    .line 22
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method
