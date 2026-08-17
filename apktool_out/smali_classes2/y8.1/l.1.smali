.class public final Ly8/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/l$a;,
        Ly8/l$b;
    }
.end annotation


# static fields
.field public static final c:Ly8/l$b;

.field private static final d:Ljava/util/Set;


# instance fields
.field private final a:Ly8/n;

.field private final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly8/l$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly8/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly8/l;->c:Ly8/l$b;

    .line 8
    .line 9
    sget-object v0, Lk8/b;->d:Lk8/b$a;

    .line 10
    .line 11
    sget-object v1, LI7/o$a;->d:Lk8/d;

    .line 12
    .line 13
    invoke-virtual {v1}, Lk8/d;->l()Lk8/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "toSafe(...)"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lj7/T;->d(Ljava/lang/Object;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Ly8/l;->d:Ljava/util/Set;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Ly8/n;)V
    .locals 1

    .line 1
    const-string v0, "components"

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
    iput-object p1, p0, Ly8/l;->a:Ly8/n;

    .line 10
    .line 11
    invoke-virtual {p1}, Ly8/n;->u()LB8/n;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Ly8/k;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Ly8/k;-><init>(Ly8/l;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0}, LB8/n;->i(Lkotlin/jvm/functions/Function1;)LB8/h;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Ly8/l;->b:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic a()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Ly8/l;->d:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic b(Ly8/l;Ly8/l$a;)LL7/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly8/l;->c(Ly8/l;Ly8/l$a;)LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Ly8/l;Ly8/l$a;)LL7/e;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ly8/l;->d(Ly8/l$a;)LL7/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final d(Ly8/l$a;)LL7/e;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ly8/l$a;->b()Lk8/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ly8/l;->a:Ly8/n;

    .line 6
    .line 7
    invoke-virtual {v1}, Ly8/n;->l()Ljava/lang/Iterable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, LN7/b;

    .line 26
    .line 27
    invoke-interface {v2, v0}, LN7/b;->c(Lk8/b;)LL7/e;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_1
    sget-object v1, Ly8/l;->d:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_2
    invoke-virtual {p1}, Ly8/l$a;->a()Ly8/i;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    iget-object p1, p0, Ly8/l;->a:Ly8/n;

    .line 51
    .line 52
    invoke-virtual {p1}, Ly8/n;->e()Ly8/j;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1, v0}, Ly8/j;->a(Lk8/b;)Ly8/i;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_3
    invoke-virtual {p1}, Ly8/i;->a()Lh8/c;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {p1}, Ly8/i;->b()Lf8/c;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p1}, Ly8/i;->c()Lh8/a;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {p1}, Ly8/i;->d()LL7/h0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v0}, Lk8/b;->e()Lk8/b;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-eqz v3, :cond_7

    .line 84
    .line 85
    const/4 v4, 0x2

    .line 86
    invoke-static {p0, v3, v2, v4, v2}, Ly8/l;->f(Ly8/l;Lk8/b;Ly8/i;ILjava/lang/Object;)LL7/e;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    instance-of v4, v3, LA8/m;

    .line 91
    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    check-cast v3, LA8/m;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    move-object v3, v2

    .line 98
    :goto_0
    if-nez v3, :cond_5

    .line 99
    .line 100
    return-object v2

    .line 101
    :cond_5
    invoke-virtual {v0}, Lk8/b;->h()Lk8/f;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v3, v0}, LA8/m;->h1(Lk8/f;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_6

    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_6
    invoke-virtual {v3}, LA8/m;->a1()Ly8/p;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_1
    move-object v4, v0

    .line 117
    goto :goto_3

    .line 118
    :cond_7
    iget-object v3, p0, Ly8/l;->a:Ly8/n;

    .line 119
    .line 120
    invoke-virtual {v3}, Ly8/n;->s()LL7/O;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v0}, Lk8/b;->f()Lk8/c;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-static {v3, v4}, LL7/T;->c(LL7/O;Lk8/c;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_9

    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    move-object v6, v4

    .line 147
    check-cast v6, LL7/N;

    .line 148
    .line 149
    instance-of v8, v6, Ly8/r;

    .line 150
    .line 151
    if-eqz v8, :cond_a

    .line 152
    .line 153
    check-cast v6, Ly8/r;

    .line 154
    .line 155
    invoke-virtual {v0}, Lk8/b;->h()Lk8/f;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-virtual {v6, v8}, Ly8/r;->H0(Lk8/f;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-eqz v6, :cond_8

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_9
    move-object v4, v2

    .line 167
    :cond_a
    :goto_2
    check-cast v4, LL7/N;

    .line 168
    .line 169
    if-nez v4, :cond_b

    .line 170
    .line 171
    return-object v2

    .line 172
    :cond_b
    iget-object v3, p0, Ly8/l;->a:Ly8/n;

    .line 173
    .line 174
    new-instance v6, Lh8/g;

    .line 175
    .line 176
    invoke-virtual {v1}, Lf8/c;->h1()Lf8/t;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    const-string v2, "getTypeTable(...)"

    .line 181
    .line 182
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v6, v0}, Lh8/g;-><init>(Lf8/t;)V

    .line 186
    .line 187
    .line 188
    sget-object v0, Lh8/h;->b:Lh8/h$a;

    .line 189
    .line 190
    invoke-virtual {v1}, Lf8/c;->j1()Lf8/w;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v8, "getVersionRequirementTable(...)"

    .line 195
    .line 196
    invoke-static {v2, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v2}, Lh8/h$a;->a(Lf8/w;)Lh8/h;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    const/4 v9, 0x0

    .line 204
    move-object v8, v7

    .line 205
    move-object v7, v0

    .line 206
    invoke-virtual/range {v3 .. v9}, Ly8/n;->a(LL7/N;Lh8/c;Lh8/g;Lh8/h;Lh8/a;LA8/s;)Ly8/p;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    move-object v7, v8

    .line 211
    goto :goto_1

    .line 212
    :goto_3
    new-instance v3, LA8/m;

    .line 213
    .line 214
    move-object v8, p1

    .line 215
    move-object v6, v5

    .line 216
    move-object v5, v1

    .line 217
    invoke-direct/range {v3 .. v8}, LA8/m;-><init>(Ly8/p;Lf8/c;Lh8/c;Lh8/a;LL7/h0;)V

    .line 218
    .line 219
    .line 220
    return-object v3
.end method

.method public static synthetic f(Ly8/l;Lk8/b;Ly8/i;ILjava/lang/Object;)LL7/e;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Ly8/l;->e(Lk8/b;Ly8/i;)LL7/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final e(Lk8/b;Ly8/i;)LL7/e;
    .locals 2

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly8/l;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    new-instance v1, Ly8/l$a;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2}, Ly8/l$a;-><init>(Lk8/b;Ly8/i;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LL7/e;

    .line 18
    .line 19
    return-object p1
.end method
