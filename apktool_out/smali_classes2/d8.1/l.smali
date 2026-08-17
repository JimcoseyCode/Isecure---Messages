.class public abstract Ld8/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final a(LL7/H;LB8/n;LL7/M;LX7/j;Ld8/v;Ld8/n;Ly8/w;Lj8/e;)Ld8/k;
    .locals 13

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    const-string v3, "module"

    .line 8
    .line 9
    invoke-static {p0, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "storageManager"

    .line 13
    .line 14
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "notFoundClasses"

    .line 18
    .line 19
    invoke-static {p2, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v3, "lazyJavaPackageFragmentProvider"

    .line 23
    .line 24
    move-object/from16 v6, p3

    .line 25
    .line 26
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "reflectKotlinClassFinder"

    .line 30
    .line 31
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v3, "deserializedDescriptorResolver"

    .line 35
    .line 36
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v3, "errorReporter"

    .line 40
    .line 41
    move-object/from16 v8, p6

    .line 42
    .line 43
    invoke-static {v8, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "jvmMetadataVersion"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, Ld8/o;

    .line 52
    .line 53
    invoke-direct {v4, v0, v1}, Ld8/o;-><init>(Ld8/v;Ld8/n;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p2, p1, v0, v2}, Ld8/i;->a(LL7/H;LL7/M;LB8/n;Ld8/v;Lj8/e;)Ld8/h;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    new-instance v0, Ld8/k;

    .line 61
    .line 62
    sget-object v3, Ly8/o$a;->a:Ly8/o$a;

    .line 63
    .line 64
    sget-object v9, LT7/c$a;->a:LT7/c$a;

    .line 65
    .line 66
    sget-object v1, Ly8/m;->a:Ly8/m$a;

    .line 67
    .line 68
    invoke-virtual {v1}, Ly8/m$a;->a()Ly8/m;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    sget-object v1, LD8/p;->b:LD8/p$a;

    .line 73
    .line 74
    invoke-virtual {v1}, LD8/p$a;->a()LD8/q;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    new-instance v12, LF8/a;

    .line 79
    .line 80
    sget-object v1, LC8/x;->a:LC8/x;

    .line 81
    .line 82
    invoke-static {v1}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v12, v1}, LF8/a;-><init>(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    move-object v2, p0

    .line 90
    move-object v1, p1

    .line 91
    move-object v7, p2

    .line 92
    invoke-direct/range {v0 .. v12}, Ld8/k;-><init>(LB8/n;LL7/H;Ly8/o;Ld8/o;Ld8/h;LX7/j;LL7/M;Ly8/w;LT7/c;Ly8/m;LD8/p;LF8/a;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method public static final b(LU7/u;LL7/H;LB8/n;LL7/M;Ld8/v;Ld8/n;Ly8/w;La8/b;LX7/n;Ld8/D;)LX7/j;
    .locals 27

    .line 1
    move-object/from16 v15, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    const-string v2, "javaClassFinder"

    .line 8
    .line 9
    move-object/from16 v3, p0

    .line 10
    .line 11
    invoke-static {v3, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "module"

    .line 15
    .line 16
    invoke-static {v15, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "storageManager"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v2, "notFoundClasses"

    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v2, "reflectKotlinClassFinder"

    .line 30
    .line 31
    move-object/from16 v4, p4

    .line 32
    .line 33
    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v2, "deserializedDescriptorResolver"

    .line 37
    .line 38
    move-object/from16 v5, p5

    .line 39
    .line 40
    invoke-static {v5, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v2, "errorReporter"

    .line 44
    .line 45
    move-object/from16 v6, p6

    .line 46
    .line 47
    invoke-static {v6, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v2, "javaSourceElementFactory"

    .line 51
    .line 52
    move-object/from16 v10, p7

    .line 53
    .line 54
    invoke-static {v10, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v2, "singleModuleClassResolver"

    .line 58
    .line 59
    move-object/from16 v11, p8

    .line 60
    .line 61
    invoke-static {v11, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "packagePartProvider"

    .line 65
    .line 66
    move-object/from16 v12, p9

    .line 67
    .line 68
    invoke-static {v12, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, LX7/d;

    .line 72
    .line 73
    sget-object v5, LV7/o;->a:LV7/o;

    .line 74
    .line 75
    const-string v7, "DO_NOTHING"

    .line 76
    .line 77
    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget-object v7, LV7/j;->a:LV7/j;

    .line 81
    .line 82
    const-string v8, "EMPTY"

    .line 83
    .line 84
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    sget-object v8, LV7/i$a;->a:LV7/i$a;

    .line 88
    .line 89
    new-instance v9, Lu8/b;

    .line 90
    .line 91
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-direct {v9, v1, v13}, Lu8/b;-><init>(LB8/n;Ljava/lang/Iterable;)V

    .line 96
    .line 97
    .line 98
    sget-object v13, LL7/k0$a;->a:LL7/k0$a;

    .line 99
    .line 100
    sget-object v14, LT7/c$a;->a:LT7/c$a;

    .line 101
    .line 102
    new-instance v1, LI7/n;

    .line 103
    .line 104
    invoke-direct {v1, v15, v0}, LI7/n;-><init>(LL7/H;LL7/M;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, LU7/d;

    .line 108
    .line 109
    sget-object v16, LU7/D;->d:LU7/D$b;

    .line 110
    .line 111
    move-object/from16 v17, v1

    .line 112
    .line 113
    invoke-virtual/range {v16 .. v16}, LU7/D$b;->a()LU7/D;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-direct {v0, v1}, LU7/d;-><init>(LU7/D;)V

    .line 118
    .line 119
    .line 120
    new-instance v1, Lc8/e0;

    .line 121
    .line 122
    move-object/from16 p3, v0

    .line 123
    .line 124
    new-instance v0, Lc8/g;

    .line 125
    .line 126
    move-object/from16 v18, v2

    .line 127
    .line 128
    sget-object v2, LX7/e$a;->a:LX7/e$a;

    .line 129
    .line 130
    invoke-direct {v0, v2}, Lc8/g;-><init>(LX7/e;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v1, v0}, Lc8/e0;-><init>(Lc8/g;)V

    .line 134
    .line 135
    .line 136
    sget-object v19, LU7/v$a;->a:LU7/v$a;

    .line 137
    .line 138
    sget-object v0, LD8/p;->b:LD8/p$a;

    .line 139
    .line 140
    invoke-virtual {v0}, LD8/p$a;->a()LD8/q;

    .line 141
    .line 142
    .line 143
    move-result-object v21

    .line 144
    invoke-virtual/range {v16 .. v16}, LU7/D$b;->a()LU7/D;

    .line 145
    .line 146
    .line 147
    move-result-object v22

    .line 148
    new-instance v23, Ld8/l$a;

    .line 149
    .line 150
    invoke-direct/range {v23 .. v23}, Ld8/l$a;-><init>()V

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x800000

    .line 154
    .line 155
    const/16 v26, 0x0

    .line 156
    .line 157
    const/16 v24, 0x0

    .line 158
    .line 159
    move-object/from16 v20, v2

    .line 160
    .line 161
    move-object v2, v3

    .line 162
    move-object v3, v4

    .line 163
    move-object/from16 v16, v17

    .line 164
    .line 165
    move-object/from16 v0, v18

    .line 166
    .line 167
    move-object/from16 v17, p3

    .line 168
    .line 169
    move-object/from16 v4, p5

    .line 170
    .line 171
    move-object/from16 v18, v1

    .line 172
    .line 173
    move-object/from16 v1, p2

    .line 174
    .line 175
    invoke-direct/range {v0 .. v26}, LX7/d;-><init>(LB8/n;LU7/u;Ld8/v;Ld8/n;LV7/o;Ly8/w;LV7/j;LV7/i;Lu8/a;La8/b;LX7/n;Ld8/D;LL7/k0;LT7/c;LL7/H;LI7/n;LU7/d;Lc8/e0;LU7/v;LX7/e;LD8/p;LU7/D;LU7/A;Lt8/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 176
    .line 177
    .line 178
    new-instance v1, LX7/j;

    .line 179
    .line 180
    invoke-direct {v1, v0}, LX7/j;-><init>(LX7/d;)V

    .line 181
    .line 182
    .line 183
    return-object v1
.end method

.method public static synthetic c(LU7/u;LL7/H;LB8/n;LL7/M;Ld8/v;Ld8/n;Ly8/w;La8/b;LX7/n;Ld8/D;ILjava/lang/Object;)LX7/j;
    .locals 11

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ld8/D$a;->a:Ld8/D$a;

    .line 8
    .line 9
    move-object v10, v0

    .line 10
    :goto_0
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move-object v4, p3

    .line 14
    move-object v5, p4

    .line 15
    move-object/from16 v6, p5

    .line 16
    .line 17
    move-object/from16 v7, p6

    .line 18
    .line 19
    move-object/from16 v8, p7

    .line 20
    .line 21
    move-object/from16 v9, p8

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move-object/from16 v10, p9

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    invoke-static/range {v1 .. v10}, Ld8/l;->b(LU7/u;LL7/H;LB8/n;LL7/M;Ld8/v;Ld8/n;Ly8/w;La8/b;LX7/n;Ld8/D;)LX7/j;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
