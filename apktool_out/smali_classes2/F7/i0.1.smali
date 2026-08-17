.class public final LF7/i0;
.super LF7/A;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/internal/h;
.implements LC7/g;
.implements LF7/l;


# static fields
.field static final synthetic s:[LC7/k;


# instance fields
.field private final m:LF7/d0;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/Object;

.field private final p:LF7/a1$a;

.field private final q:Lkotlin/Lazy;

.field private final r:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LF7/i0;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "descriptor"

    .line 10
    .line 11
    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    new-array v1, v1, [LC7/k;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    sput-object v1, LF7/i0;->s:[LC7/k;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(LF7/d0;LL7/z;)V
    .locals 9

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-interface {p2}, LL7/J;->getName()Lk8/f;

    move-result-object v0

    invoke-virtual {v0}, Lk8/f;->j()Ljava/lang/String;

    move-result-object v3

    const-string v0, "asString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v0, LF7/f1;->a:LF7/f1;

    invoke-virtual {v0, p2}, LF7/f1;->g(LL7/z;)LF7/n;

    move-result-object v0

    invoke-virtual {v0}, LF7/n;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 13
    invoke-direct/range {v1 .. v8}, LF7/i0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;LL7/z;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;LL7/z;Ljava/lang/Object;)V
    .locals 0

    .line 3
    invoke-direct {p0}, LF7/A;-><init>()V

    .line 4
    iput-object p1, p0, LF7/i0;->m:LF7/d0;

    .line 5
    iput-object p3, p0, LF7/i0;->n:Ljava/lang/String;

    .line 6
    iput-object p5, p0, LF7/i0;->o:Ljava/lang/Object;

    .line 7
    new-instance p1, LF7/f0;

    invoke-direct {p1, p0, p2}, LF7/f0;-><init>(LF7/i0;Ljava/lang/String;)V

    invoke-static {p4, p1}, LF7/a1;->b(Ljava/lang/Object;Lw7/a;)LF7/a1$a;

    move-result-object p1

    iput-object p1, p0, LF7/i0;->p:LF7/a1$a;

    .line 8
    sget-object p1, Li7/l;->h:Li7/l;

    new-instance p2, LF7/g0;

    invoke-direct {p2, p0}, LF7/g0;-><init>(LF7/i0;)V

    invoke-static {p1, p2}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, LF7/i0;->q:Lkotlin/Lazy;

    .line 9
    new-instance p2, LF7/h0;

    invoke-direct {p2, p0}, LF7/h0;-><init>(LF7/i0;)V

    invoke-static {p1, p2}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LF7/i0;->r:Lkotlin/Lazy;

    return-void
.end method

.method synthetic constructor <init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;LL7/z;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    sget-object p5, Lkotlin/jvm/internal/c;->NO_RECEIVER:Ljava/lang/Object;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v5}, LF7/i0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;LL7/z;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .line 10
    invoke-direct/range {v1 .. v6}, LF7/i0;-><init>(LF7/d0;Ljava/lang/String;Ljava/lang/String;LL7/z;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic Z(LF7/i0;Ljava/lang/String;)LL7/z;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LF7/i0;->i0(LF7/i0;Ljava/lang/String;)LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic a0(LF7/i0;)LG7/h;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/i0;->c0(LF7/i0;)LG7/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b0(LF7/i0;)LG7/h;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/i0;->h0(LF7/i0;)LG7/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c0(LF7/i0;)LG7/h;
    .locals 11

    .line 1
    sget-object v0, LF7/f1;->a:LF7/f1;

    .line 2
    .line 3
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, LF7/f1;->g(LL7/z;)LF7/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, LF7/n$d;

    .line 12
    .line 13
    const/16 v2, 0xa

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, LF7/A;->W()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Lkotlin/jvm/internal/d;->b()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p0}, LF7/A;->getParameters()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance v5, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {p0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, LC7/j;

    .line 59
    .line 60
    invoke-interface {v0}, LC7/j;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    sget-object v6, LG7/a$a;->h:LG7/a$a;

    .line 72
    .line 73
    sget-object v7, LG7/a$b;->h:LG7/a$b;

    .line 74
    .line 75
    new-instance v3, LG7/a;

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    const/16 v9, 0x10

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    invoke-direct/range {v3 .. v10}, LG7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LG7/a$a;LG7/a$b;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    return-object v3

    .line 85
    :cond_1
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v0, LF7/n$d;

    .line 90
    .line 91
    invoke-virtual {v0}, LF7/n$d;->b()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v1, v0}, LF7/d0;->u(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto/16 :goto_1

    .line 100
    .line 101
    :cond_2
    instance-of v1, v0, LF7/n$e;

    .line 102
    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v1}, LL7/z;->b()LL7/m;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const-string v3, "getContainingDeclaration(...)"

    .line 114
    .line 115
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, Lo8/k;->d(LL7/m;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_3

    .line 123
    .line 124
    instance-of v2, v1, LL7/l;

    .line 125
    .line 126
    if-eqz v2, :cond_3

    .line 127
    .line 128
    check-cast v1, LL7/l;

    .line 129
    .line 130
    invoke-interface {v1}, LL7/l;->A()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_3

    .line 135
    .line 136
    new-instance v1, LG7/n$b;

    .line 137
    .line 138
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v0, LF7/n$e;

    .line 147
    .line 148
    invoke-virtual {v0}, LF7/n$e;->b()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-interface {p0}, LL7/a;->i()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    const-string v4, "getValueParameters(...)"

    .line 161
    .line 162
    invoke-static {p0, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v1, v2, v3, v0, p0}, LG7/n$b;-><init>(LL7/z;LF7/d0;Ljava/lang/String;Ljava/util/List;)V

    .line 166
    .line 167
    .line 168
    return-object v1

    .line 169
    :cond_3
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v0, LF7/n$e;

    .line 174
    .line 175
    invoke-virtual {v0}, LF7/n$e;->c()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v0}, LF7/n$e;->b()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v1, v2, v0}, LF7/d0;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    goto :goto_1

    .line 188
    :cond_4
    instance-of v1, v0, LF7/n$c;

    .line 189
    .line 190
    const-string v3, "null cannot be cast to non-null type java.lang.reflect.Member"

    .line 191
    .line 192
    if-eqz v1, :cond_5

    .line 193
    .line 194
    check-cast v0, LF7/n$c;

    .line 195
    .line 196
    invoke-virtual {v0}, LF7/n$c;->b()Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_5
    instance-of v1, v0, LF7/n$b;

    .line 205
    .line 206
    if-eqz v1, :cond_a

    .line 207
    .line 208
    check-cast v0, LF7/n$b;

    .line 209
    .line 210
    invoke-virtual {v0}, LF7/n$b;->d()Ljava/lang/reflect/Constructor;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :goto_1
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    .line 218
    .line 219
    const/4 v2, 0x0

    .line 220
    if-eqz v1, :cond_6

    .line 221
    .line 222
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 223
    .line 224
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-direct {p0, v0, v1, v2}, LF7/i0;->d0(Ljava/lang/reflect/Constructor;LL7/z;Z)LG7/i;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    goto :goto_2

    .line 233
    :cond_6
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 234
    .line 235
    if-eqz v1, :cond_9

    .line 236
    .line 237
    check-cast v0, Ljava/lang/reflect/Method;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-nez v1, :cond_7

    .line 248
    .line 249
    invoke-direct {p0, v0}, LF7/i0;->e0(Ljava/lang/reflect/Method;)LG7/i$h;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    goto :goto_2

    .line 254
    :cond_7
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-interface {v1}, LM7/a;->getAnnotations()LM7/h;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {}, LF7/j1;->j()Lk8/c;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-interface {v1, v3}, LM7/h;->b(Lk8/c;)LM7/c;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-eqz v1, :cond_8

    .line 271
    .line 272
    invoke-direct {p0, v0}, LF7/i0;->f0(Ljava/lang/reflect/Method;)LG7/i$h;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    goto :goto_2

    .line 277
    :cond_8
    invoke-direct {p0, v0}, LF7/i0;->g0(Ljava/lang/reflect/Method;)LG7/i$h;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    :goto_2
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    const/4 v1, 0x2

    .line 286
    const/4 v3, 0x0

    .line 287
    invoke-static {v0, p0, v2, v1, v3}, LG7/o;->j(LG7/h;LL7/b;ZILjava/lang/Object;)LG7/h;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :cond_9
    new-instance v1, LF7/Y0;

    .line 293
    .line 294
    new-instance v2, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    const-string v3, "Could not compute caller for function: "

    .line 300
    .line 301
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string p0, " (member = "

    .line 312
    .line 313
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const/16 p0, 0x29

    .line 320
    .line 321
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    invoke-direct {v1, p0}, LF7/Y0;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v1

    .line 332
    :cond_a
    instance-of v1, v0, LF7/n$a;

    .line 333
    .line 334
    if-eqz v1, :cond_c

    .line 335
    .line 336
    check-cast v0, LF7/n$a;

    .line 337
    .line 338
    invoke-virtual {v0}, LF7/n$a;->d()Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-interface {p0}, Lkotlin/jvm/internal/d;->b()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    new-instance v5, Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-static {v8, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 353
    .line 354
    .line 355
    move-result p0

    .line 356
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_b

    .line 368
    .line 369
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    check-cast v0, Ljava/lang/reflect/Method;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    goto :goto_3

    .line 383
    :cond_b
    sget-object v6, LG7/a$a;->h:LG7/a$a;

    .line 384
    .line 385
    sget-object v7, LG7/a$b;->g:LG7/a$b;

    .line 386
    .line 387
    new-instance v3, LG7/a;

    .line 388
    .line 389
    invoke-direct/range {v3 .. v8}, LG7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LG7/a$a;LG7/a$b;Ljava/util/List;)V

    .line 390
    .line 391
    .line 392
    return-object v3

    .line 393
    :cond_c
    new-instance p0, Li7/m;

    .line 394
    .line 395
    invoke-direct {p0}, Li7/m;-><init>()V

    .line 396
    .line 397
    .line 398
    throw p0
.end method

.method private final d0(Ljava/lang/reflect/Constructor;LL7/z;Z)LG7/i;
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    invoke-static {p2}, Lt8/b;->f(LL7/b;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, LF7/i0;->X()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, LG7/i$a;

    .line 16
    .line 17
    invoke-direct {p0}, LF7/i0;->j0()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-direct {p2, p1, p3}, LG7/i$a;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_0
    new-instance p2, LG7/i$b;

    .line 26
    .line 27
    invoke-direct {p2, p1}, LG7/i$b;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :cond_1
    invoke-virtual {p0}, LF7/i0;->X()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    new-instance p2, LG7/i$c;

    .line 38
    .line 39
    invoke-direct {p0}, LF7/i0;->j0()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-direct {p2, p1, p3}, LG7/i$c;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_2
    new-instance p2, LG7/i$e;

    .line 48
    .line 49
    invoke-direct {p2, p1}, LG7/i$e;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 50
    .line 51
    .line 52
    return-object p2
.end method

.method private final e0(Ljava/lang/reflect/Method;)LG7/i$h;
    .locals 2

    .line 1
    invoke-virtual {p0}, LF7/i0;->X()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LG7/i$h$a;

    .line 8
    .line 9
    invoke-direct {p0}, LF7/i0;->j0()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, p1, v1}, LG7/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, LG7/i$h$e;

    .line 18
    .line 19
    invoke-direct {v0, p1}, LG7/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method private final f0(Ljava/lang/reflect/Method;)LG7/i$h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->X()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LG7/i$h$b;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LG7/i$h$b;-><init>(Ljava/lang/reflect/Method;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, LG7/i$h$f;

    .line 14
    .line 15
    invoke-direct {v0, p1}, LG7/i$h$f;-><init>(Ljava/lang/reflect/Method;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method private final g0(Ljava/lang/reflect/Method;)LG7/i$h;
    .locals 2

    .line 1
    invoke-virtual {p0}, LF7/i0;->X()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, LG7/i$h$c;

    .line 8
    .line 9
    invoke-direct {p0, p1}, LF7/i0;->m0(Ljava/lang/reflect/Method;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, LF7/i0;->o:Ljava/lang/Object;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-direct {p0}, LF7/i0;->j0()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-direct {v0, p1, v1}, LG7/i$h$c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, LG7/i$h$g;

    .line 27
    .line 28
    invoke-direct {v0, p1}, LG7/i$h$g;-><init>(Ljava/lang/reflect/Method;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method private static final h0(LF7/i0;)LG7/h;
    .locals 11

    .line 1
    sget-object v0, LF7/f1;->a:LF7/f1;

    .line 2
    .line 3
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, LF7/f1;->g(LL7/z;)LF7/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, LF7/n$e;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, LL7/z;->b()LL7/m;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-string v6, "getContainingDeclaration(...)"

    .line 26
    .line 27
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v5}, Lo8/k;->d(LL7/m;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    instance-of v5, v2, LL7/l;

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    check-cast v2, LL7/l;

    .line 41
    .line 42
    invoke-interface {v2}, LL7/l;->A()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v0, LF7/Y0;

    .line 50
    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, LL7/z;->b()LL7/m;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p0, " cannot have default arguments"

    .line 68
    .line 69
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {v0, p0}, LF7/Y0;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_1
    :goto_0
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-direct {p0, v2}, LF7/i0;->l0(LL7/z;)LL7/z;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0, v2}, LF7/f1;->g(LL7/z;)LF7/n;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction"

    .line 95
    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    check-cast v0, LF7/n$e;

    .line 100
    .line 101
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0}, LF7/n$e;->c()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0}, LF7/n$e;->b()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v1, v2, v0, v4}, LF7/d0;->w(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto/16 :goto_3

    .line 118
    .line 119
    :cond_2
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v1, LF7/n$e;

    .line 124
    .line 125
    invoke-virtual {v1}, LF7/n$e;->c()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v1}, LF7/n$e;->b()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {p0}, LF7/i0;->R()LG7/h;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-interface {v5}, LG7/h;->b()Ljava/lang/reflect/Member;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-static {v5}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v5}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    xor-int/2addr v5, v4

    .line 153
    invoke-virtual {v0, v2, v1, v5}, LF7/d0;->w(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    goto/16 :goto_3

    .line 158
    .line 159
    :cond_3
    instance-of v0, v1, LF7/n$d;

    .line 160
    .line 161
    const/16 v2, 0xa

    .line 162
    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    invoke-virtual {p0}, LF7/A;->W()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_5

    .line 170
    .line 171
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-interface {v0}, Lkotlin/jvm/internal/d;->b()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {p0}, LF7/A;->getParameters()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    new-instance v5, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-static {p0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_4

    .line 201
    .line 202
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, LC7/j;

    .line 207
    .line 208
    invoke-interface {v0}, LC7/j;->getName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_4
    sget-object v6, LG7/a$a;->g:LG7/a$a;

    .line 220
    .line 221
    sget-object v7, LG7/a$b;->h:LG7/a$b;

    .line 222
    .line 223
    new-instance v3, LG7/a;

    .line 224
    .line 225
    const/4 v8, 0x0

    .line 226
    const/16 v9, 0x10

    .line 227
    .line 228
    const/4 v10, 0x0

    .line 229
    invoke-direct/range {v3 .. v10}, LG7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LG7/a$a;LG7/a$b;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 230
    .line 231
    .line 232
    return-object v3

    .line 233
    :cond_5
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v1, LF7/n$d;

    .line 238
    .line 239
    invoke-virtual {v1}, LF7/n$d;->b()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v0, v1}, LF7/d0;->v(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    goto :goto_3

    .line 248
    :cond_6
    instance-of v0, v1, LF7/n$a;

    .line 249
    .line 250
    if-eqz v0, :cond_8

    .line 251
    .line 252
    check-cast v1, LF7/n$a;

    .line 253
    .line 254
    invoke-virtual {v1}, LF7/n$a;->d()Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p0}, Lkotlin/jvm/internal/d;->b()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    new-instance v5, Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-static {v8, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_7

    .line 284
    .line 285
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/lang/reflect/Method;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_7
    sget-object v6, LG7/a$a;->g:LG7/a$a;

    .line 300
    .line 301
    sget-object v7, LG7/a$b;->g:LG7/a$b;

    .line 302
    .line 303
    new-instance v3, LG7/a;

    .line 304
    .line 305
    invoke-direct/range {v3 .. v8}, LG7/a;-><init>(Ljava/lang/Class;Ljava/util/List;LG7/a$a;LG7/a$b;Ljava/util/List;)V

    .line 306
    .line 307
    .line 308
    return-object v3

    .line 309
    :cond_8
    move-object v0, v3

    .line 310
    :goto_3
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    .line 311
    .line 312
    if-eqz v1, :cond_9

    .line 313
    .line 314
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 315
    .line 316
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-direct {p0, v0, v1, v4}, LF7/i0;->d0(Ljava/lang/reflect/Constructor;LL7/z;Z)LG7/i;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    goto :goto_4

    .line 325
    :cond_9
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 326
    .line 327
    if-eqz v1, :cond_b

    .line 328
    .line 329
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-interface {v1}, LM7/a;->getAnnotations()LM7/h;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {}, LF7/j1;->j()Lk8/c;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-interface {v1, v2}, LM7/h;->b(Lk8/c;)LM7/c;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    if-eqz v1, :cond_a

    .line 346
    .line 347
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-interface {v1}, LL7/z;->b()LL7/m;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 356
    .line 357
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    check-cast v1, LL7/e;

    .line 361
    .line 362
    invoke-interface {v1}, LL7/e;->y()Z

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    if-nez v1, :cond_a

    .line 367
    .line 368
    check-cast v0, Ljava/lang/reflect/Method;

    .line 369
    .line 370
    invoke-direct {p0, v0}, LF7/i0;->f0(Ljava/lang/reflect/Method;)LG7/i$h;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    goto :goto_4

    .line 375
    :cond_a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 376
    .line 377
    invoke-direct {p0, v0}, LF7/i0;->g0(Ljava/lang/reflect/Method;)LG7/i$h;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    goto :goto_4

    .line 382
    :cond_b
    move-object v0, v3

    .line 383
    :goto_4
    if-eqz v0, :cond_c

    .line 384
    .line 385
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-static {v0, p0, v4}, LG7/o;->i(LG7/h;LL7/b;Z)LG7/h;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    return-object p0

    .line 394
    :cond_c
    return-object v3
.end method

.method private static final i0(LF7/i0;Ljava/lang/String;)LL7/z;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, LF7/i0;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p0}, LF7/d0;->x(Ljava/lang/String;Ljava/lang/String;)LL7/z;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private final j0()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LF7/i0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, LG7/o;->h(Ljava/lang/Object;LL7/b;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method private final l0(LL7/z;)LL7/z;
    .locals 5

    .line 1
    invoke-interface {p1}, LL7/a;->i()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getValueParameters(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, LL7/t0;

    .line 35
    .line 36
    invoke-interface {v3}, LL7/t0;->q0()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_2
    :goto_0
    invoke-interface {p1}, LL7/z;->b()LL7/m;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v3, "getContainingDeclaration(...)"

    .line 48
    .line 49
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lo8/k;->g(LL7/m;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    invoke-virtual {p0}, LF7/i0;->R()LG7/h;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, LG7/h;->b()Ljava/lang/reflect/Member;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    invoke-static {p1, v0}, Ls8/e;->z(LL7/b;Z)LO8/i;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p1}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v3, v0

    .line 99
    check-cast v3, LL7/b;

    .line 100
    .line 101
    invoke-interface {v3}, LL7/a;->i()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v3, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_3

    .line 126
    .line 127
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, LL7/t0;

    .line 132
    .line 133
    invoke-interface {v4}, LL7/t0;->q0()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    move-object v0, v2

    .line 141
    :goto_2
    instance-of p1, v0, LL7/z;

    .line 142
    .line 143
    if-eqz p1, :cond_7

    .line 144
    .line 145
    check-cast v0, LL7/z;

    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_7
    :goto_3
    return-object v2
.end method

.method private final m0(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/a;->a0()LL7/c0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, LL7/s0;->getType()LC8/S;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v0}, Lo8/k;->c(LC8/S;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "getParameterTypes(...)"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lj7/j;->G([Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/lang/Class;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-ne p1, v1, :cond_0

    .line 46
    .line 47
    return v1

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    return p1
.end method


# virtual methods
.method public R()LG7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/i0;->q:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LG7/h;

    .line 8
    .line 9
    return-object v0
.end method

.method public S()LF7/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/i0;->m:LF7/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public T()LG7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LF7/i0;->r:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LG7/h;

    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic U()LL7/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public X()Z
    .locals 2

    .line 1
    iget-object v0, p0, LF7/i0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lkotlin/jvm/internal/c;->NO_RECEIVER:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LF7/l$a;->e(LF7/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-static {p1}, LF7/j1;->c(Ljava/lang/Object;)LF7/i0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, LF7/i0;->S()LF7/d0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, LF7/i0;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, LF7/i0;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, LF7/i0;->n:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, p1, LF7/i0;->n:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, LF7/i0;->o:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object p1, p1, LF7/i0;->o:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_1
    return v0
.end method

.method public getArity()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->R()LG7/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LG7/j;->a(LG7/h;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/J;->getName()Lk8/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lk8/f;->j()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "asString(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, LF7/i0;->S()LF7/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    invoke-virtual {p0}, LF7/i0;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, LF7/i0;->n:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
    return v0
.end method

.method public i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, LF7/l$a;->i(LF7/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, LF7/l$a;->a(LF7/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, LF7/l$a;->b(LF7/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    invoke-static {p0, p1, p2}, LF7/l$a;->c(LF7/l;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4
    invoke-static {p0, p1, p2, p3}, LF7/l$a;->d(LF7/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5
    invoke-static/range {p0 .. p5}, LF7/l$a;->f(LF7/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/D;->isExternal()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isInfix()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/z;->isInfix()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/z;->isInline()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isOperator()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/z;->isOperator()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isSuspend()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/z;->isSuspend()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public k0()LL7/z;
    .locals 3

    .line 1
    iget-object v0, p0, LF7/i0;->p:LF7/a1$a;

    .line 2
    .line 3
    sget-object v1, LF7/i0;->s:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LF7/a1$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getValue(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, LL7/z;

    .line 18
    .line 19
    return-object v0
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, LF7/l$a;->g(LF7/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, LF7/l$a;->j(LF7/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, LF7/l$a;->h(LF7/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, LF7/e1;->a:LF7/e1;

    .line 2
    .line 3
    invoke-virtual {p0}, LF7/i0;->k0()LL7/z;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, LF7/e1;->f(LL7/z;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
