.class public final Ld8/k$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld8/k$a$a;
    }
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
    invoke-direct {p0}, Ld8/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ld8/v;Ld8/v;LU7/u;Ljava/lang/String;Ly8/w;La8/b;)Ld8/k$a$a;
    .locals 24

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const-string v1, "kotlinClassFinder"

    .line 4
    .line 5
    move-object/from16 v6, p1

    .line 6
    .line 7
    invoke-static {v6, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "jvmBuiltInsKotlinClassFinder"

    .line 11
    .line 12
    move-object/from16 v14, p2

    .line 13
    .line 14
    invoke-static {v14, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "javaClassFinder"

    .line 18
    .line 19
    move-object/from16 v2, p3

    .line 20
    .line 21
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "moduleName"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "errorReporter"

    .line 30
    .line 31
    move-object/from16 v8, p5

    .line 32
    .line 33
    invoke-static {v8, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v1, "javaSourceElementFactory"

    .line 37
    .line 38
    move-object/from16 v9, p6

    .line 39
    .line 40
    invoke-static {v9, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, LB8/f;

    .line 44
    .line 45
    const-string v1, "DeserializationComponentsForJava.ModuleData"

    .line 46
    .line 47
    invoke-direct {v3, v1}, LB8/f;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, LK7/k;

    .line 51
    .line 52
    sget-object v4, LK7/k$a;->g:LK7/k$a;

    .line 53
    .line 54
    invoke-direct {v1, v3, v4}, LK7/k;-><init>(LB8/n;LK7/k$a;)V

    .line 55
    .line 56
    .line 57
    new-instance v15, LO7/F;

    .line 58
    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const/16 v5, 0x3c

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const/16 v0, 0x3e

    .line 73
    .line 74
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lk8/f;->t(Ljava/lang/String;)Lk8/f;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v4, "special(...)"

    .line 86
    .line 87
    invoke-static {v0, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/16 v22, 0x38

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    move-object/from16 v16, v0

    .line 101
    .line 102
    move-object/from16 v18, v1

    .line 103
    .line 104
    move-object/from16 v17, v3

    .line 105
    .line 106
    invoke-direct/range {v15 .. v23}, LO7/F;-><init>(Lk8/f;LB8/n;LI7/i;Ll8/a;Ljava/util/Map;Lk8/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    .line 108
    .line 109
    move-object/from16 v0, v18

    .line 110
    .line 111
    invoke-virtual {v0, v15}, LI7/i;->E0(LO7/F;)V

    .line 112
    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    invoke-virtual {v0, v15, v1}, LK7/k;->M0(LL7/H;Z)V

    .line 116
    .line 117
    .line 118
    new-instance v7, Ld8/n;

    .line 119
    .line 120
    invoke-direct {v7}, Ld8/n;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v10, LX7/o;

    .line 124
    .line 125
    invoke-direct {v10}, LX7/o;-><init>()V

    .line 126
    .line 127
    .line 128
    new-instance v4, LL7/M;

    .line 129
    .line 130
    invoke-direct {v4, v3, v15}, LL7/M;-><init>(LB8/n;LL7/H;)V

    .line 131
    .line 132
    .line 133
    const/16 v12, 0x200

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v11, 0x0

    .line 137
    move-object v5, v4

    .line 138
    move-object v4, v3

    .line 139
    move-object v3, v15

    .line 140
    invoke-static/range {v2 .. v13}, Ld8/l;->c(LU7/u;LL7/H;LB8/n;LL7/M;Ld8/v;Ld8/n;Ly8/w;La8/b;LX7/n;Ld8/D;ILjava/lang/Object;)LX7/j;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    move-object v3, v4

    .line 145
    move-object v4, v5

    .line 146
    sget-object v9, Lj8/e;->i:Lj8/e;

    .line 147
    .line 148
    move-object v5, v2

    .line 149
    move-object v2, v15

    .line 150
    invoke-static/range {v2 .. v9}, Ld8/l;->a(LL7/H;LB8/n;LL7/M;LX7/j;Ld8/v;Ld8/n;Ly8/w;Lj8/e;)Ld8/k;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    move-object v13, v7

    .line 155
    invoke-virtual {v13, v12}, Ld8/n;->o(Ld8/k;)V

    .line 156
    .line 157
    .line 158
    new-instance v2, Lt8/c;

    .line 159
    .line 160
    sget-object v6, LV7/j;->a:LV7/j;

    .line 161
    .line 162
    const-string v7, "EMPTY"

    .line 163
    .line 164
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v2, v5, v6}, Lt8/c;-><init>(LX7/j;LV7/j;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v10, v2}, LX7/o;->c(Lt8/c;)V

    .line 171
    .line 172
    .line 173
    move-object v5, v2

    .line 174
    new-instance v2, LK7/w;

    .line 175
    .line 176
    invoke-virtual {v0}, LK7/k;->L0()LK7/u;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v0}, LK7/k;->L0()LK7/u;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    sget-object v9, Ly8/o$a;->a:Ly8/o$a;

    .line 185
    .line 186
    sget-object v0, LD8/p;->b:LD8/p$a;

    .line 187
    .line 188
    invoke-virtual {v0}, LD8/p$a;->a()LD8/q;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    new-instance v11, Lu8/b;

    .line 193
    .line 194
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-direct {v11, v3, v0}, Lu8/b;-><init>(LB8/n;Ljava/lang/Iterable;)V

    .line 199
    .line 200
    .line 201
    move-object v6, v4

    .line 202
    move-object v0, v5

    .line 203
    move-object v4, v14

    .line 204
    move-object v5, v15

    .line 205
    invoke-direct/range {v2 .. v11}, LK7/w;-><init>(LB8/n;Ld8/v;LL7/H;LL7/M;LN7/a;LN7/c;Ly8/o;LD8/p;Lu8/a;)V

    .line 206
    .line 207
    .line 208
    filled-new-array {v15}, [LO7/F;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v15, v3}, LO7/F;->T0([LO7/F;)V

    .line 213
    .line 214
    .line 215
    new-instance v3, LO7/l;

    .line 216
    .line 217
    invoke-virtual {v0}, Lt8/c;->a()LX7/j;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    const/4 v4, 0x2

    .line 222
    new-array v4, v4, [LL7/U;

    .line 223
    .line 224
    const/4 v5, 0x0

    .line 225
    aput-object v0, v4, v5

    .line 226
    .line 227
    aput-object v2, v4, v1

    .line 228
    .line 229
    invoke-static {v4}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v2, "CompositeProvider@RuntimeModuleData for "

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-direct {v3, v0, v1}, LO7/l;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v15, v3}, LO7/F;->L0(LL7/O;)V

    .line 254
    .line 255
    .line 256
    new-instance v0, Ld8/k$a$a;

    .line 257
    .line 258
    invoke-direct {v0, v12, v13}, Ld8/k$a$a;-><init>(Ld8/k;Ld8/n;)V

    .line 259
    .line 260
    .line 261
    return-object v0
.end method
