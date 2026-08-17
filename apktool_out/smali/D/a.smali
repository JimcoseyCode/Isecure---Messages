.class public final LD/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LD/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/a$a;
    }
.end annotation


# static fields
.field private static final b:LD/a$a;


# instance fields
.field private final a:LF/L;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LD/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LD/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LD/a;->b:LD/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LF/L;)V
    .locals 1

    .line 1
    const-string v0, "cameraInfoInternal"

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
    iput-object p1, p0, LD/a;->a:LF/L;

    .line 10
    .line 11
    return-void
.end method

.method private final b(Ly/v0;Ljava/util/List;ILjava/util/List;)LD/b;
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt p3, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ly/v0;->h()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p2, p4}, Lj7/T;->k(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    new-instance p3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string p4, "getFeatureListResolvedByPriority: features = "

    .line 21
    .line 22
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, ", useCases = "

    .line 29
    .line 30
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ly/v0;->k()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const-string p4, "DefaultFeatureGroupResolver"

    .line 45
    .line 46
    invoke-static {p4, p3}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p3, p0, LD/a;->a:LF/L;

    .line 50
    .line 51
    new-instance p4, LB/b;

    .line 52
    .line 53
    invoke-direct {p4, p2}, LB/b;-><init>(Ljava/util/Set;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p3, p4, p1}, LF/L;->q(LB/b;Ly/v0;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    new-instance p1, LD/b$a;

    .line 63
    .line 64
    new-instance p3, LB/b;

    .line 65
    .line 66
    invoke-direct {p3, p2}, LB/b;-><init>(Ljava/util/Set;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p3}, LD/b$a;-><init>(LB/b;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_0
    sget-object p1, LD/b$b;->a:LD/b$b;

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_1
    add-int/lit8 v0, p3, 0x1

    .line 77
    .line 78
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-static {p4, p3}, Lj7/q;->A0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-direct {p0, p1, p2, v0, p3}, LD/a;->b(Ly/v0;Ljava/util/List;ILjava/util/List;)LD/b;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    instance-of v1, p3, LD/b$a;

    .line 91
    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    return-object p3

    .line 95
    :cond_2
    invoke-direct {p0, p1, p2, v0, p4}, LD/a;->b(Ly/v0;Ljava/util/List;ILjava/util/List;)LD/b;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
.end method

.method static synthetic c(LD/a;Ly/v0;Ljava/util/List;ILjava/util/List;ILjava/lang/Object;)LD/b;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LD/a;->b(Ly/v0;Ljava/util/List;ILjava/util/List;)LD/b;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public a(Ly/v0;)LD/b;
    .locals 9

    .line 1
    const-string v0, "sessionConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ly/v0;->k()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Ly/v0;->h()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Ly/v0;->g()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "Must have at least one required or preferred feature"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 40
    const/4 v4, 0x0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    :cond_2
    move v5, v4

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Ly/J0;

    .line 66
    .line 67
    instance-of v6, v6, Ly/V;

    .line 68
    .line 69
    if-eqz v6, :cond_4

    .line 70
    .line 71
    move v5, v3

    .line 72
    :goto_1
    if-eqz v0, :cond_5

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_8

    .line 90
    .line 91
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Ly/J0;

    .line 96
    .line 97
    instance-of v8, v7, Ly/p0;

    .line 98
    .line 99
    if-nez v8, :cond_7

    .line 100
    .line 101
    invoke-static {v7}, LK/f;->e0(Ly/J0;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_6

    .line 106
    .line 107
    :cond_7
    move v4, v3

    .line 108
    :cond_8
    :goto_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_a

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v6, Ly/J0;

    .line 123
    .line 124
    sget-object v7, LB/c;->i:LB/c$a;

    .line 125
    .line 126
    invoke-virtual {v7, v6}, LB/c$a;->c(Ly/J0;)LB/c;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    sget-object v8, LB/c;->n:LB/c;

    .line 131
    .line 132
    if-ne v7, v8, :cond_9

    .line 133
    .line 134
    new-instance p1, LD/b$c;

    .line 135
    .line 136
    invoke-direct {p1, v6}, LD/b$c;-><init>(Ly/J0;)V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_e

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, LA/b;

    .line 155
    .line 156
    instance-of v6, v1, LC/d;

    .line 157
    .line 158
    if-eqz v6, :cond_c

    .line 159
    .line 160
    if-nez v5, :cond_b

    .line 161
    .line 162
    new-instance p1, LD/b$d;

    .line 163
    .line 164
    sget-object v0, LB/c;->k:LB/c;

    .line 165
    .line 166
    invoke-virtual {v0}, LB/c;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-direct {p1, v0, v1}, LD/b$d;-><init>(Ljava/lang/String;LA/b;)V

    .line 171
    .line 172
    .line 173
    return-object p1

    .line 174
    :cond_c
    instance-of v6, v1, LC/a;

    .line 175
    .line 176
    if-nez v6, :cond_d

    .line 177
    .line 178
    instance-of v6, v1, LC/c;

    .line 179
    .line 180
    if-nez v6, :cond_d

    .line 181
    .line 182
    instance-of v6, v1, LC/e;

    .line 183
    .line 184
    if-eqz v6, :cond_b

    .line 185
    .line 186
    :cond_d
    if-nez v4, :cond_b

    .line 187
    .line 188
    new-instance p1, LD/b$d;

    .line 189
    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    sget-object v2, LB/c;->j:LB/c;

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v2, " or "

    .line 201
    .line 202
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    sget-object v2, LB/c;->l:LB/c;

    .line 206
    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-direct {p1, v0, v1}, LD/b$d;-><init>(Ljava/lang/String;LA/b;)V

    .line 215
    .line 216
    .line 217
    return-object p1

    .line 218
    :cond_e
    new-instance v4, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    :cond_f
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_11

    .line 232
    .line 233
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    move-object v2, v1

    .line 238
    check-cast v2, LA/b;

    .line 239
    .line 240
    instance-of v2, v2, LC/d;

    .line 241
    .line 242
    if-eqz v2, :cond_10

    .line 243
    .line 244
    move v2, v5

    .line 245
    goto :goto_4

    .line 246
    :cond_10
    move v2, v3

    .line 247
    :goto_4
    if-eqz v2, :cond_f

    .line 248
    .line 249
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_11
    const/16 v7, 0xc

    .line 254
    .line 255
    const/4 v8, 0x0

    .line 256
    const/4 v5, 0x0

    .line 257
    const/4 v6, 0x0

    .line 258
    move-object v2, p0

    .line 259
    move-object v3, p1

    .line 260
    invoke-static/range {v2 .. v8}, LD/a;->c(LD/a;Ly/v0;Ljava/util/List;ILjava/util/List;ILjava/lang/Object;)LD/b;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    return-object p1
.end method
