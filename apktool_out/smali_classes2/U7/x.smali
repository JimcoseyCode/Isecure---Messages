.class public abstract LU7/x;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:Ljava/util/List;

.field private static final b:Ljava/util/List;

.field private static final c:Ljava/util/Map;

.field private static final d:Ljava/util/Map;

.field private static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    sget-object v0, LU7/c;->j:LU7/c;

    .line 2
    .line 3
    sget-object v1, LU7/c;->h:LU7/c;

    .line 4
    .line 5
    sget-object v2, LU7/c;->i:LU7/c;

    .line 6
    .line 7
    sget-object v3, LU7/c;->l:LU7/c;

    .line 8
    .line 9
    sget-object v4, LU7/c;->k:LU7/c;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [LU7/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    sput-object v5, LU7/x;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v2}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LU7/x;->b:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {}, LU7/J;->k()Lk8/c;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, LU7/w;

    .line 32
    .line 33
    new-instance v3, Lc8/l;

    .line 34
    .line 35
    sget-object v9, Lc8/k;->i:Lc8/k;

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v13, 0x2

    .line 39
    const/4 v14, 0x0

    .line 40
    invoke-direct {v3, v9, v12, v13, v14}, Lc8/l;-><init>(Lc8/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, v3, v5, v12}, LU7/w;-><init>(Lc8/l;Ljava/util/Collection;Z)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {}, LU7/J;->i()Lk8/c;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    new-instance v3, LU7/w;

    .line 55
    .line 56
    new-instance v4, Lc8/l;

    .line 57
    .line 58
    invoke-direct {v4, v9, v12, v13, v14}, Lc8/l;-><init>(Lc8/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v3, v4, v5, v12}, LU7/w;-><init>(Lc8/l;Ljava/util/Collection;Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v3}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {}, LU7/J;->j()Lk8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    new-instance v3, LU7/w;

    .line 73
    .line 74
    new-instance v4, Lc8/l;

    .line 75
    .line 76
    sget-object v6, Lc8/k;->g:Lc8/k;

    .line 77
    .line 78
    invoke-direct {v4, v6, v12, v13, v14}, Lc8/l;-><init>(Lc8/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    .line 80
    .line 81
    const/4 v7, 0x4

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-direct/range {v3 .. v8}, LU7/w;-><init>(Lc8/l;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v10, v3}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    filled-new-array {v1, v2, v3}, [Lkotlin/Pair;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sput-object v1, LU7/x;->c:Ljava/util/Map;

    .line 100
    .line 101
    invoke-static {}, LU7/J;->d()Lk8/c;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v6, LU7/w;

    .line 106
    .line 107
    new-instance v7, Lc8/l;

    .line 108
    .line 109
    invoke-direct {v7, v9, v12, v13, v14}, Lc8/l;-><init>(Lc8/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 110
    .line 111
    .line 112
    const/4 v10, 0x4

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v9, 0x0

    .line 115
    move-object v8, v0

    .line 116
    invoke-direct/range {v6 .. v11}, LU7/w;-><init>(Lc8/l;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v2, v6}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {}, LU7/J;->e()Lk8/c;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-instance v6, LU7/w;

    .line 128
    .line 129
    new-instance v7, Lc8/l;

    .line 130
    .line 131
    sget-object v3, Lc8/k;->h:Lc8/k;

    .line 132
    .line 133
    invoke-direct {v7, v3, v12, v13, v14}, Lc8/l;-><init>(Lc8/k;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 134
    .line 135
    .line 136
    invoke-direct/range {v6 .. v11}, LU7/w;-><init>(Lc8/l;Ljava/util/Collection;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v2, v6}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    filled-new-array {v0, v2}, [Lkotlin/Pair;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, LU7/x;->d:Ljava/util/Map;

    .line 152
    .line 153
    invoke-static {v1, v0}, Lj7/K;->o(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sput-object v0, LU7/x;->e:Ljava/util/Map;

    .line 158
    .line 159
    return-void
.end method

.method public static final a()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, LU7/x;->e:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, LU7/x;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
