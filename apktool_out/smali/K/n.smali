.class public final LK/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LK/m;


# instance fields
.field private final c:LF/E1;

.field private d:LF/J;


# direct methods
.method public constructor <init>(LF/E1;LF/J;)V
    .locals 1

    .line 1
    const-string v0, "useCaseConfigFactory"

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
    iput-object p1, p0, LK/n;->c:LF/E1;

    .line 10
    .line 11
    iput-object p2, p0, LK/n;->d:LF/J;

    .line 12
    .line 13
    return-void
.end method

.method private final c(ILF/L;Ljava/util/List;)Landroid/util/Pair;
    .locals 23

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p2 .. p2}, LF/L;->f()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v1, "getCameraId(...)"

    .line 11
    .line 12
    invoke-static {v3, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v10, v1

    .line 40
    check-cast v10, Ly/J0;

    .line 41
    .line 42
    invoke-virtual {v10}, Ly/J0;->g()LF/o1;

    .line 43
    .line 44
    .line 45
    move-result-object v11

    .line 46
    move-object/from16 v12, p0

    .line 47
    .line 48
    if-eqz v11, :cond_3

    .line 49
    .line 50
    iget-object v1, v12, LK/n;->d:LF/J;

    .line 51
    .line 52
    const-string v13, "Required value was null."

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v10}, Ly/J0;->p()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {v10}, Ly/J0;->h()Landroid/util/Size;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-virtual {v10}, Ly/J0;->l()LF/D1;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface {v2}, LF/D1;->F()LF/p1;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    move/from16 v2, p1

    .line 75
    .line 76
    invoke-interface/range {v1 .. v6}, LF/J;->b(ILjava/lang/String;ILandroid/util/Size;LF/p1;)LF/r1;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    const-string v1, "transformSurfaceConfig(...)"

    .line 81
    .line 82
    invoke-static {v14, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10}, Ly/J0;->p()I

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    invoke-virtual {v10}, Ly/J0;->h()Landroid/util/Size;

    .line 90
    .line 91
    .line 92
    move-result-object v16

    .line 93
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v11}, LF/o1;->b()Ly/H;

    .line 97
    .line 98
    .line 99
    move-result-object v17

    .line 100
    invoke-static {v10}, LT/g;->q0(Ly/J0;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v18

    .line 104
    invoke-virtual {v11}, LF/o1;->d()LF/j0;

    .line 105
    .line 106
    .line 107
    move-result-object v19

    .line 108
    invoke-virtual {v10}, Ly/J0;->l()LF/D1;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const/4 v2, 0x0

    .line 113
    invoke-interface {v1, v2}, LF/D1;->q(I)I

    .line 114
    .line 115
    .line 116
    move-result v20

    .line 117
    invoke-virtual {v10}, Ly/J0;->l()LF/D1;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    sget-object v2, LF/o1;->a:Landroid/util/Range;

    .line 122
    .line 123
    invoke-interface {v1, v2}, LF/D1;->K(Landroid/util/Range;)Landroid/util/Range;

    .line 124
    .line 125
    .line 126
    move-result-object v21

    .line 127
    if-eqz v21, :cond_0

    .line 128
    .line 129
    invoke-virtual {v10}, Ly/J0;->l()LF/D1;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v1}, LF/D1;->S()Z

    .line 134
    .line 135
    .line 136
    move-result v22

    .line 137
    invoke-static/range {v14 .. v22}, LF/f;->a(LF/r1;ILandroid/util/Size;Ly/H;Ljava/util/List;LF/j0;ILandroid/util/Range;Z)LF/f;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, "create(...)"

    .line 142
    .line 143
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    invoke-interface {v8, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    invoke-interface {v7, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    const-string v1, "Attached surface resolution cannot be null for already attached use cases."

    .line 165
    .line 166
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v0

    .line 176
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    const-string v1, "Attached stream spec cannot be null for already attached use cases."

    .line 179
    .line 180
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_4
    move-object/from16 v12, p0

    .line 185
    .line 186
    new-instance v0, Landroid/util/Pair;

    .line 187
    .line 188
    invoke-direct {v0, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    return-object v0
.end method

.method private final d(ILF/L;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZ)LK/l;
    .locals 15

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    invoke-interface {v0}, LF/L;->f()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    const-string v2, "getCameraId(...)"

    .line 10
    .line 11
    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_b

    .line 24
    .line 25
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    :try_start_0
    invoke-interface {v0}, LF/L;->i()Landroid/graphics/Rect;

    .line 37
    .line 38
    .line 39
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-object v3, v2

    .line 42
    :goto_0
    new-instance v5, LK/o;

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-static {v3}, LH/z;->m(Landroid/graphics/Rect;)Landroid/util/Size;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :cond_0
    invoke-direct {v5, v0, v2}, LK/o;-><init>(LF/L;Landroid/util/Size;)V

    .line 51
    .line 52
    .line 53
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/4 v3, 0x0

    .line 58
    :cond_1
    move v7, v3

    .line 59
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    const-string v13, "Required value was null."

    .line 64
    .line 65
    if-eqz v8, :cond_5

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    check-cast v8, Ly/J0;

    .line 72
    .line 73
    move-object/from16 v9, p5

    .line 74
    .line 75
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    if-eqz v10, :cond_4

    .line 80
    .line 81
    check-cast v10, LK/f$b;

    .line 82
    .line 83
    iget-object v13, v10, LK/f$b;->a:LF/D1;

    .line 84
    .line 85
    iget-object v10, v10, LK/f$b;->b:LF/D1;

    .line 86
    .line 87
    invoke-virtual {v8, v0, v13, v10}, Ly/J0;->I(LF/L;LF/D1;LF/D1;)LF/D1;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    const-string v13, "mergeConfigs(...)"

    .line 92
    .line 93
    invoke-static {v10, v13}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v12, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v10}, LK/o;->m(LF/D1;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    const-string v14, "getSortedSupportedOutputSizes(...)"

    .line 104
    .line 105
    invoke-static {v13, v14}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v6, v10, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    instance-of v13, v8, Ly/p0;

    .line 112
    .line 113
    if-nez v13, :cond_3

    .line 114
    .line 115
    instance-of v8, v8, LT/g;

    .line 116
    .line 117
    if-eqz v8, :cond_2

    .line 118
    .line 119
    :cond_3
    invoke-interface {v10}, LF/D1;->Q()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    const/4 v8, 0x2

    .line 124
    if-ne v7, v8, :cond_1

    .line 125
    .line 126
    const/4 v7, 0x1

    .line 127
    goto :goto_1

    .line 128
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 129
    .line 130
    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_5
    iget-object v2, p0, LK/n;->d:LF/J;

    .line 135
    .line 136
    if-eqz v2, :cond_a

    .line 137
    .line 138
    new-instance v5, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 145
    .line 146
    .line 147
    invoke-static/range {p3 .. p3}, LK/f;->U(Ljava/util/Collection;)Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    move/from16 v3, p1

    .line 152
    .line 153
    move/from16 v9, p6

    .line 154
    .line 155
    move/from16 v10, p7

    .line 156
    .line 157
    invoke-interface/range {v2 .. v10}, LF/J;->f(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;ZZZZ)LF/t1;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v2, "getSuggestedStreamSpecs(...)"

    .line 162
    .line 163
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, LF/t1;->a()Ljava/util/Map;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v0}, LF/t1;->b()Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v0}, LF/t1;->c()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_7

    .line 191
    .line 192
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, Ljava/util/Map$Entry;

    .line 197
    .line 198
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    if-eqz v5, :cond_6

    .line 211
    .line 212
    invoke-interface {v11, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 217
    .line 218
    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_7
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_c

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, Ljava/util/Map$Entry;

    .line 241
    .line 242
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_8

    .line 251
    .line 252
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-eqz v4, :cond_9

    .line 261
    .line 262
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-interface {v11, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 271
    .line 272
    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 277
    .line 278
    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v0

    .line 282
    :cond_b
    const v0, 0x7fffffff

    .line 283
    .line 284
    .line 285
    :cond_c
    new-instance v1, LK/l;

    .line 286
    .line 287
    invoke-direct {v1, v11, v0}, LK/l;-><init>(Ljava/util/Map;I)V

    .line 288
    .line 289
    .line 290
    return-object v1
.end method


# virtual methods
.method public a(LF/J;)V
    .locals 1

    .line 1
    const-string v0, "cameraDeviceSurfaceManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LK/n;->d:LF/J;

    .line 7
    .line 8
    return-void
.end method

.method public b(ILF/L;Ljava/util/List;Ljava/util/List;LF/E;ILandroid/util/Range;ZZ)LK/l;
    .locals 10

    .line 1
    move-object/from16 v4, p7

    .line 2
    .line 3
    const-string v5, "cameraInfoInternal"

    .line 4
    .line 5
    invoke-static {p2, v5}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v5, "newUseCases"

    .line 9
    .line 10
    invoke-static {p3, v5}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v5, "attachedUseCases"

    .line 14
    .line 15
    invoke-static {p4, v5}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v5, "cameraConfig"

    .line 19
    .line 20
    invoke-static {p5, v5}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v5, "targetFrameRate"

    .line 24
    .line 25
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, p2, p4}, LK/n;->c(ILF/L;Ljava/util/List;)Landroid/util/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    iget-object v1, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 33
    .line 34
    const-string v7, "second"

    .line 35
    .line 36
    invoke-static {v1, v7}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v1, Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {p5}, LF/E;->j()LF/E1;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iget-object v7, p0, LK/n;->c:LF/E1;

    .line 46
    .line 47
    move/from16 v9, p6

    .line 48
    .line 49
    invoke-static {p3, v6, v7, v9, v4}, LK/f;->L(Ljava/util/Collection;LF/E1;LF/E1;ILandroid/util/Range;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-string v6, "getConfigs(...)"

    .line 54
    .line 55
    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    move-object v0, p0

    .line 59
    move-object v2, p2

    .line 60
    move-object v3, p3

    .line 61
    move/from16 v6, p8

    .line 62
    .line 63
    move/from16 v7, p9

    .line 64
    .line 65
    move-object v5, v4

    .line 66
    move-object v4, v1

    .line 67
    move v1, p1

    .line 68
    invoke-direct/range {v0 .. v7}, LK/n;->d(ILF/L;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZ)LK/l;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v0, LK/l;

    .line 73
    .line 74
    iget-object v2, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 75
    .line 76
    const-string v3, "first"

    .line 77
    .line 78
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    check-cast v2, Ljava/util/Map;

    .line 82
    .line 83
    invoke-virtual {v1}, LK/l;->b()Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v2, v3}, Lj7/K;->o(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1}, LK/l;->a()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-direct {v0, v2, v1}, LK/l;-><init>(Ljava/util/Map;I)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method
