.class public final Lk9/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le9/v;


# instance fields
.field private final a:Le9/n;


# direct methods
.method public constructor <init>(Le9/n;)V
    .locals 1

    .line 1
    const-string v0, "cookieJar"

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
    iput-object p1, p0, Lk9/a;->a:Le9/n;

    .line 10
    .line 11
    return-void
.end method

.method private final a(Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    add-int/lit8 v3, v1, 0x1

    .line 22
    .line 23
    if-gez v1, :cond_0

    .line 24
    .line 25
    invoke-static {}, Lj7/q;->t()V

    .line 26
    .line 27
    .line 28
    :cond_0
    check-cast v2, Le9/m;

    .line 29
    .line 30
    if-lez v1, :cond_1

    .line 31
    .line 32
    const-string v1, "; "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v2}, Le9/m;->g()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x3d

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Le9/m;->i()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move v1, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "StringBuilder().apply(builderAction).toString()"

    .line 63
    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object p1
.end method


# virtual methods
.method public intercept(Le9/v$a;)Le9/D;
    .locals 12

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Le9/v$a;->d()Le9/B;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Le9/B;->m()Le9/B$a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0}, Le9/B;->e()Le9/C;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-wide/16 v3, -0x1

    .line 19
    .line 20
    const-string v5, "Content-Type"

    .line 21
    .line 22
    const-string v6, "Content-Length"

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Le9/C;->contentType()Le9/x;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-virtual {v7}, Le9/x;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-virtual {v1, v5, v7}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v2}, Le9/C;->contentLength()J

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    cmp-long v2, v7, v3

    .line 44
    .line 45
    const-string v9, "Transfer-Encoding"

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v6, v2}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v9}, Le9/B$a;->i(Ljava/lang/String;)Le9/B$a;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-string v2, "chunked"

    .line 61
    .line 62
    invoke-virtual {v1, v9, v2}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v6}, Le9/B$a;->i(Ljava/lang/String;)Le9/B$a;

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_0
    const-string v2, "Host"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Le9/B;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x1

    .line 76
    const/4 v10, 0x0

    .line 77
    if-nez v7, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Le9/B;->p()Le9/u;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-static {v7, v8, v9, v10}, Lf9/c;->Q(Le9/u;ZILjava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v1, v2, v7}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 88
    .line 89
    .line 90
    :cond_3
    const-string v2, "Connection"

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Le9/B;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    if-nez v7, :cond_4

    .line 97
    .line 98
    const-string v7, "Keep-Alive"

    .line 99
    .line 100
    invoke-virtual {v1, v2, v7}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 101
    .line 102
    .line 103
    :cond_4
    const-string v2, "Accept-Encoding"

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Le9/B;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const-string v11, "gzip"

    .line 110
    .line 111
    if-nez v7, :cond_5

    .line 112
    .line 113
    const-string v7, "Range"

    .line 114
    .line 115
    invoke-virtual {v0, v7}, Le9/B;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-nez v7, :cond_5

    .line 120
    .line 121
    invoke-virtual {v1, v2, v11}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 122
    .line 123
    .line 124
    move v8, v9

    .line 125
    :cond_5
    iget-object v2, p0, Lk9/a;->a:Le9/n;

    .line 126
    .line 127
    invoke-virtual {v0}, Le9/B;->p()Le9/u;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-interface {v2, v7}, Le9/n;->loadForRequest(Le9/u;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-nez v7, :cond_6

    .line 140
    .line 141
    const-string v7, "Cookie"

    .line 142
    .line 143
    invoke-direct {p0, v2}, Lk9/a;->a(Ljava/util/List;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1, v7, v2}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 148
    .line 149
    .line 150
    :cond_6
    const-string v2, "User-Agent"

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Le9/B;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    if-nez v7, :cond_7

    .line 157
    .line 158
    const-string v7, "okhttp/4.9.2"

    .line 159
    .line 160
    invoke-virtual {v1, v2, v7}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 161
    .line 162
    .line 163
    :cond_7
    invoke-virtual {v1}, Le9/B$a;->b()Le9/B;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-interface {p1, v1}, Le9/v$a;->a(Le9/B;)Le9/D;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object v1, p0, Lk9/a;->a:Le9/n;

    .line 172
    .line 173
    invoke-virtual {v0}, Le9/B;->p()Le9/u;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {p1}, Le9/D;->g0()Le9/t;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-static {v1, v2, v7}, Lk9/e;->f(Le9/n;Le9/u;Le9/t;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Le9/D;->u0()Le9/D$a;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1, v0}, Le9/D$a;->r(Le9/B;)Le9/D$a;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-eqz v8, :cond_8

    .line 193
    .line 194
    const-string v1, "Content-Encoding"

    .line 195
    .line 196
    const/4 v2, 0x2

    .line 197
    invoke-static {p1, v1, v10, v2, v10}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-static {v11, v7, v9}, LP8/q;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    if-eqz v7, :cond_8

    .line 206
    .line 207
    invoke-static {p1}, Lk9/e;->b(Le9/D;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_8

    .line 212
    .line 213
    invoke-virtual {p1}, Le9/D;->r()Le9/E;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    new-instance v8, Lt9/p;

    .line 220
    .line 221
    invoke-virtual {v7}, Le9/E;->source()Lt9/j;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-direct {v8, v7}, Lt9/p;-><init>(Lt9/F;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Le9/D;->g0()Le9/t;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v7}, Le9/t;->r()Le9/t$a;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {v7, v1}, Le9/t$a;->h(Ljava/lang/String;)Le9/t$a;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v1, v6}, Le9/t$a;->h(Ljava/lang/String;)Le9/t$a;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v1}, Le9/t$a;->e()Le9/t;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v0, v1}, Le9/D$a;->k(Le9/t;)Le9/D$a;

    .line 249
    .line 250
    .line 251
    invoke-static {p1, v5, v10, v2, v10}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    new-instance v1, Lk9/h;

    .line 256
    .line 257
    invoke-static {v8}, Lt9/s;->d(Lt9/F;)Lt9/j;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-direct {v1, p1, v3, v4, v2}, Lk9/h;-><init>(Ljava/lang/String;JLt9/j;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v1}, Le9/D$a;->b(Le9/E;)Le9/D$a;

    .line 265
    .line 266
    .line 267
    :cond_8
    invoke-virtual {v0}, Le9/D$a;->c()Le9/D;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    return-object p1
.end method
