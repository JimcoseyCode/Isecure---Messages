.class public final Ld8/e$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld8/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly8/N;ZZLjava/lang/Boolean;ZLd8/v;Lj8/e;)Ld8/x;
    .locals 6

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kotlinClassFinder"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "jvmMetadataVersion"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p2, :cond_4

    .line 18
    .line 19
    if-eqz p4, :cond_3

    .line 20
    .line 21
    instance-of p2, p1, Ly8/N$a;

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    move-object p2, p1

    .line 26
    check-cast p2, Ly8/N$a;

    .line 27
    .line 28
    invoke-virtual {p2}, Ly8/N$a;->g()Lf8/c$c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v2, Lf8/c$c;->i:Lf8/c$c;

    .line 33
    .line 34
    if-ne v1, v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, Ly8/N$a;->e()Lk8/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string p2, "DefaultImpls"

    .line 41
    .line 42
    invoke-static {p2}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const-string p3, "identifier(...)"

    .line 47
    .line 48
    invoke-static {p2, p3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lk8/b;->d(Lk8/f;)Lk8/b;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p6, p1, p7}, Ld8/w;->b(Ld8/v;Lk8/b;Lj8/e;)Ld8/x;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    instance-of p2, p1, Ly8/N$b;

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Ly8/N;->c()LL7/h0;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    instance-of p4, p2, Ld8/r;

    .line 75
    .line 76
    if-eqz p4, :cond_1

    .line 77
    .line 78
    check-cast p2, Ld8/r;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move-object p2, v0

    .line 82
    :goto_0
    if-eqz p2, :cond_2

    .line 83
    .line 84
    invoke-virtual {p2}, Ld8/r;->f()Lt8/d;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    move-object p2, v0

    .line 90
    :goto_1
    if-eqz p2, :cond_4

    .line 91
    .line 92
    sget-object p1, Lk8/b;->d:Lk8/b$a;

    .line 93
    .line 94
    new-instance p3, Lk8/c;

    .line 95
    .line 96
    invoke-virtual {p2}, Lt8/d;->f()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string p2, "getInternalName(...)"

    .line 101
    .line 102
    invoke-static {v0, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 v4, 0x4

    .line 106
    const/4 v5, 0x0

    .line 107
    const/16 v1, 0x2f

    .line 108
    .line 109
    const/16 v2, 0x2e

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    invoke-static/range {v0 .. v5}, LP8/q;->D(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-direct {p3, p2}, Lk8/c;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p3}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p6, p1, p7}, Ld8/w;->b(Ld8/v;Lk8/b;Lj8/e;)Ld8/x;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string p3, "isConst should not be null for property (container="

    .line 134
    .line 135
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const/16 p1, 0x29

    .line 142
    .line 143
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p2

    .line 160
    :cond_4
    if-eqz p3, :cond_8

    .line 161
    .line 162
    instance-of p2, p1, Ly8/N$a;

    .line 163
    .line 164
    if-eqz p2, :cond_8

    .line 165
    .line 166
    move-object p2, p1

    .line 167
    check-cast p2, Ly8/N$a;

    .line 168
    .line 169
    invoke-virtual {p2}, Ly8/N$a;->g()Lf8/c$c;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    sget-object p4, Lf8/c$c;->n:Lf8/c$c;

    .line 174
    .line 175
    if-ne p3, p4, :cond_8

    .line 176
    .line 177
    invoke-virtual {p2}, Ly8/N$a;->h()Ly8/N$a;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    if-eqz p2, :cond_8

    .line 182
    .line 183
    invoke-virtual {p2}, Ly8/N$a;->g()Lf8/c$c;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    sget-object p4, Lf8/c$c;->h:Lf8/c$c;

    .line 188
    .line 189
    if-eq p3, p4, :cond_5

    .line 190
    .line 191
    invoke-virtual {p2}, Ly8/N$a;->g()Lf8/c$c;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    sget-object p4, Lf8/c$c;->j:Lf8/c$c;

    .line 196
    .line 197
    if-eq p3, p4, :cond_5

    .line 198
    .line 199
    if-eqz p5, :cond_8

    .line 200
    .line 201
    invoke-virtual {p2}, Ly8/N$a;->g()Lf8/c$c;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    sget-object p4, Lf8/c$c;->i:Lf8/c$c;

    .line 206
    .line 207
    if-eq p3, p4, :cond_5

    .line 208
    .line 209
    invoke-virtual {p2}, Ly8/N$a;->g()Lf8/c$c;

    .line 210
    .line 211
    .line 212
    move-result-object p3

    .line 213
    sget-object p4, Lf8/c$c;->l:Lf8/c$c;

    .line 214
    .line 215
    if-ne p3, p4, :cond_8

    .line 216
    .line 217
    :cond_5
    invoke-virtual {p2}, Ly8/N;->c()LL7/h0;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    instance-of p2, p1, Ld8/z;

    .line 222
    .line 223
    if-eqz p2, :cond_6

    .line 224
    .line 225
    check-cast p1, Ld8/z;

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_6
    move-object p1, v0

    .line 229
    :goto_2
    if-eqz p1, :cond_7

    .line 230
    .line 231
    invoke-virtual {p1}, Ld8/z;->d()Ld8/x;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    return-object p1

    .line 236
    :cond_7
    return-object v0

    .line 237
    :cond_8
    instance-of p2, p1, Ly8/N$b;

    .line 238
    .line 239
    if-eqz p2, :cond_a

    .line 240
    .line 241
    invoke-virtual {p1}, Ly8/N;->c()LL7/h0;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    instance-of p2, p2, Ld8/r;

    .line 246
    .line 247
    if-eqz p2, :cond_a

    .line 248
    .line 249
    invoke-virtual {p1}, Ly8/N;->c()LL7/h0;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource"

    .line 254
    .line 255
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    check-cast p1, Ld8/r;

    .line 259
    .line 260
    invoke-virtual {p1}, Ld8/r;->g()Ld8/x;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    if-nez p2, :cond_9

    .line 265
    .line 266
    invoke-virtual {p1}, Ld8/r;->d()Lk8/b;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-static {p6, p1, p7}, Ld8/w;->b(Ld8/v;Lk8/b;Lj8/e;)Ld8/x;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    return-object p1

    .line 275
    :cond_9
    return-object p2

    .line 276
    :cond_a
    return-object v0
.end method
