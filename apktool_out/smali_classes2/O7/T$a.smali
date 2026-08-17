.class public final LO7/T$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, LO7/T$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LO7/T$a;LL7/l0;)LC8/G0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LO7/T$a;->c(LL7/l0;)LC8/G0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c(LL7/l0;)LC8/G0;
    .locals 1

    .line 1
    invoke-interface {p1}, LL7/l0;->q()LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, LL7/l0;->T()LC8/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, LC8/G0;->f(LC8/S;)LC8/G0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method


# virtual methods
.method public final b(LB8/n;LL7/l0;LL7/d;)LO7/Q;
    .locals 22

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    move-object/from16 v9, p3

    .line 4
    .line 5
    const-string v0, "storageManager"

    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "typeAliasDescriptor"

    .line 13
    .line 14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "constructor"

    .line 18
    .line 19
    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    move-object/from16 v10, p0

    .line 23
    .line 24
    invoke-direct {v10, v2}, LO7/T$a;->c(LL7/l0;)LC8/G0;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    const/4 v12, 0x0

    .line 29
    if-nez v11, :cond_0

    .line 30
    .line 31
    return-object v12

    .line 32
    :cond_0
    invoke-interface {v9, v11}, LL7/d;->c(LC8/G0;)LL7/d;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    return-object v12

    .line 39
    :cond_1
    new-instance v13, LO7/T;

    .line 40
    .line 41
    invoke-interface {v9}, LM7/a;->getAnnotations()LM7/h;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-interface {v9}, LL7/b;->getKind()LL7/b$a;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v0, "getKind(...)"

    .line 50
    .line 51
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2}, LL7/p;->g()LL7/h0;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    const-string v0, "getSource(...)"

    .line 59
    .line 60
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v4, 0x0

    .line 65
    move-object v0, v13

    .line 66
    invoke-direct/range {v0 .. v8}, LO7/T;-><init>(LB8/n;LL7/l0;LL7/d;LO7/Q;LM7/h;LL7/b$a;LL7/h0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v9}, LL7/a;->i()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v13, v0, v11}, LO7/s;->L0(LL7/z;Ljava/util/List;LC8/G0;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v18

    .line 77
    if-nez v18, :cond_2

    .line 78
    .line 79
    return-object v12

    .line 80
    :cond_2
    invoke-interface {v3}, LL7/l;->getReturnType()LC8/S;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, LC8/S;->N0()LC8/M0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, LC8/L;->c(LC8/S;)LC8/d0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface/range {p2 .. p2}, LL7/h;->r()LC8/d0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, "getDefaultType(...)"

    .line 97
    .line 98
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, LC8/h0;->j(LC8/d0;LC8/d0;)LC8/d0;

    .line 102
    .line 103
    .line 104
    move-result-object v19

    .line 105
    invoke-interface {v9}, LL7/a;->a0()LL7/c0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    invoke-interface {v0}, LL7/s0;->getType()LC8/S;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget-object v1, LC8/N0;->k:LC8/N0;

    .line 116
    .line 117
    invoke-virtual {v11, v0, v1}, LC8/G0;->n(LC8/S;LC8/N0;)LC8/S;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sget-object v1, LM7/h;->a:LM7/h$a;

    .line 122
    .line 123
    invoke-virtual {v1}, LM7/h$a;->b()LM7/h;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v13, v0, v1}, Lo8/h;->i(LL7/a;LC8/S;LM7/h;)LL7/c0;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    :cond_3
    move-object v14, v12

    .line 132
    invoke-interface/range {p2 .. p2}, LL7/l0;->q()LL7/e;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    invoke-interface {v9}, LL7/a;->m0()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v2, "getContextReceiverParameters(...)"

    .line 143
    .line 144
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v2, Ljava/util/ArrayList;

    .line 148
    .line 149
    const/16 v3, 0xa

    .line 150
    .line 151
    invoke-static {v1, v3}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const/4 v3, 0x0

    .line 163
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_5

    .line 168
    .line 169
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    add-int/lit8 v5, v3, 0x1

    .line 174
    .line 175
    if-gez v3, :cond_4

    .line 176
    .line 177
    invoke-static {}, Lj7/q;->t()V

    .line 178
    .line 179
    .line 180
    :cond_4
    check-cast v4, LL7/c0;

    .line 181
    .line 182
    invoke-interface {v4}, LL7/s0;->getType()LC8/S;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    sget-object v7, LC8/N0;->k:LC8/N0;

    .line 187
    .line 188
    invoke-virtual {v11, v6, v7}, LC8/G0;->n(LC8/S;LC8/N0;)LC8/S;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-interface {v4}, LL7/c0;->getValue()Lw8/g;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    const-string v7, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver"

    .line 197
    .line 198
    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    check-cast v4, Lw8/f;

    .line 202
    .line 203
    invoke-interface {v4}, Lw8/f;->a()Lk8/f;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    sget-object v7, LM7/h;->a:LM7/h$a;

    .line 208
    .line 209
    invoke-virtual {v7}, LM7/h$a;->b()LM7/h;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-static {v0, v6, v4, v7, v3}, Lo8/h;->c(LL7/e;LC8/S;Lk8/f;LM7/h;I)LL7/c0;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move v3, v5

    .line 221
    goto :goto_0

    .line 222
    :cond_5
    :goto_1
    move-object/from16 v16, v2

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_6
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    goto :goto_1

    .line 230
    :goto_2
    invoke-interface/range {p2 .. p2}, LL7/i;->t()Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v17

    .line 234
    sget-object v20, LL7/E;->h:LL7/E;

    .line 235
    .line 236
    invoke-interface/range {p2 .. p2}, LL7/D;->getVisibility()LL7/u;

    .line 237
    .line 238
    .line 239
    move-result-object v21

    .line 240
    const/4 v15, 0x0

    .line 241
    invoke-virtual/range {v13 .. v21}, LO7/s;->O0(LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;)LO7/s;

    .line 242
    .line 243
    .line 244
    return-object v13
.end method
