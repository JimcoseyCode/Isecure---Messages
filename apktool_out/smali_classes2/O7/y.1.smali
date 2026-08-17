.class public LO7/y;
.super LO7/z;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final h:LO7/z;

.field private final i:LC8/G0;

.field private j:LC8/G0;

.field private k:Ljava/util/List;

.field private l:Ljava/util/List;

.field private m:LC8/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LO7/z;LC8/G0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LO7/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO7/y;->h:LO7/z;

    .line 5
    .line 6
    iput-object p2, p0, LO7/y;->i:LC8/G0;

    .line 7
    .line 8
    return-void
.end method

.method static synthetic C0(LO7/y;LC8/d0;)LC8/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LO7/y;->J0(LC8/d0;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private H0()LC8/G0;
    .locals 3

    .line 1
    iget-object v0, p0, LO7/y;->j:LC8/G0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LO7/y;->i:LC8/G0;

    .line 6
    .line 7
    invoke-virtual {v0}, LC8/G0;->k()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LO7/y;->i:LC8/G0;

    .line 14
    .line 15
    iput-object v0, p0, LO7/y;->j:LC8/G0;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 19
    .line 20
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, LC8/v0;->getParameters()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, LO7/y;->k:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p0, LO7/y;->i:LC8/G0;

    .line 40
    .line 41
    invoke-virtual {v1}, LC8/G0;->j()LC8/E0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v2, p0, LO7/y;->k:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v0, v1, p0, v2}, LC8/C;->b(Ljava/util/List;LC8/E0;LL7/m;Ljava/util/List;)LC8/G0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, LO7/y;->j:LC8/G0;

    .line 52
    .line 53
    iget-object v0, p0, LO7/y;->k:Ljava/util/List;

    .line 54
    .line 55
    new-instance v1, LO7/y$a;

    .line 56
    .line 57
    invoke-direct {v1, p0}, LO7/y$a;-><init>(LO7/y;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lj7/q;->b0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, LO7/y;->l:Ljava/util/List;

    .line 65
    .line 66
    :cond_1
    :goto_0
    iget-object v0, p0, LO7/y;->j:LC8/G0;

    .line 67
    .line 68
    return-object v0
.end method

.method private J0(LC8/d0;)LC8/d0;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LO7/y;->i:LC8/G0;

    .line 4
    .line 5
    invoke-virtual {v0}, LC8/G0;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, LO7/y;->H0()LC8/G0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, LC8/N0;->k:LC8/N0;

    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, LC8/G0;->p(LC8/S;LC8/N0;)LC8/S;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, LC8/d0;

    .line 23
    .line 24
    :cond_1
    :goto_0
    return-object p1
.end method

.method private static synthetic x0(I)V
    .locals 15

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const/4 v5, 0x5

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    if-eq p0, v7, :cond_0

    .line 14
    .line 15
    if-eq p0, v6, :cond_0

    .line 16
    .line 17
    if-eq p0, v5, :cond_0

    .line 18
    .line 19
    if-eq p0, v4, :cond_0

    .line 20
    .line 21
    if-eq p0, v3, :cond_0

    .line 22
    .line 23
    if-eq p0, v2, :cond_0

    .line 24
    .line 25
    if-eq p0, v1, :cond_0

    .line 26
    .line 27
    if-eq p0, v0, :cond_0

    .line 28
    .line 29
    const-string v8, "@NotNull method %s.%s must not return null"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v8, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 33
    .line 34
    :goto_0
    if-eq p0, v7, :cond_1

    .line 35
    .line 36
    if-eq p0, v6, :cond_1

    .line 37
    .line 38
    if-eq p0, v5, :cond_1

    .line 39
    .line 40
    if-eq p0, v4, :cond_1

    .line 41
    .line 42
    if-eq p0, v3, :cond_1

    .line 43
    .line 44
    if-eq p0, v2, :cond_1

    .line 45
    .line 46
    if-eq p0, v1, :cond_1

    .line 47
    .line 48
    if-eq p0, v0, :cond_1

    .line 49
    .line 50
    move v9, v7

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v9, v6

    .line 53
    :goto_1
    new-array v9, v9, [Ljava/lang/Object;

    .line 54
    .line 55
    const-string v10, "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    if-eq p0, v7, :cond_5

    .line 59
    .line 60
    if-eq p0, v6, :cond_4

    .line 61
    .line 62
    if-eq p0, v5, :cond_3

    .line 63
    .line 64
    if-eq p0, v4, :cond_4

    .line 65
    .line 66
    if-eq p0, v3, :cond_5

    .line 67
    .line 68
    if-eq p0, v2, :cond_3

    .line 69
    .line 70
    if-eq p0, v1, :cond_4

    .line 71
    .line 72
    if-eq p0, v0, :cond_2

    .line 73
    .line 74
    aput-object v10, v9, v11

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const-string v12, "substitutor"

    .line 78
    .line 79
    aput-object v12, v9, v11

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const-string v12, "typeSubstitution"

    .line 83
    .line 84
    aput-object v12, v9, v11

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    const-string v12, "kotlinTypeRefiner"

    .line 88
    .line 89
    aput-object v12, v9, v11

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const-string v12, "typeArguments"

    .line 93
    .line 94
    aput-object v12, v9, v11

    .line 95
    .line 96
    :goto_2
    const-string v11, "getMemberScope"

    .line 97
    .line 98
    const-string v12, "getUnsubstitutedMemberScope"

    .line 99
    .line 100
    const-string v13, "substitute"

    .line 101
    .line 102
    const/4 v14, 0x1

    .line 103
    packed-switch p0, :pswitch_data_0

    .line 104
    .line 105
    .line 106
    const-string v10, "getTypeConstructor"

    .line 107
    .line 108
    aput-object v10, v9, v14

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :pswitch_0
    const-string v10, "getSealedSubclasses"

    .line 112
    .line 113
    aput-object v10, v9, v14

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :pswitch_1
    const-string v10, "getDeclaredTypeParameters"

    .line 117
    .line 118
    aput-object v10, v9, v14

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :pswitch_2
    const-string v10, "getSource"

    .line 122
    .line 123
    aput-object v10, v9, v14

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :pswitch_3
    const-string v10, "getUnsubstitutedInnerClassesScope"

    .line 127
    .line 128
    aput-object v10, v9, v14

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :pswitch_4
    const-string v10, "getVisibility"

    .line 132
    .line 133
    aput-object v10, v9, v14

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :pswitch_5
    const-string v10, "getModality"

    .line 137
    .line 138
    aput-object v10, v9, v14

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :pswitch_6
    const-string v10, "getKind"

    .line 142
    .line 143
    aput-object v10, v9, v14

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :pswitch_7
    aput-object v13, v9, v14

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :pswitch_8
    const-string v10, "getContainingDeclaration"

    .line 150
    .line 151
    aput-object v10, v9, v14

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :pswitch_9
    const-string v10, "getOriginal"

    .line 155
    .line 156
    aput-object v10, v9, v14

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :pswitch_a
    const-string v10, "getName"

    .line 160
    .line 161
    aput-object v10, v9, v14

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :pswitch_b
    const-string v10, "getAnnotations"

    .line 165
    .line 166
    aput-object v10, v9, v14

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :pswitch_c
    const-string v10, "getConstructors"

    .line 170
    .line 171
    aput-object v10, v9, v14

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :pswitch_d
    const-string v10, "getContextReceivers"

    .line 175
    .line 176
    aput-object v10, v9, v14

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_e
    const-string v10, "getDefaultType"

    .line 180
    .line 181
    aput-object v10, v9, v14

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :pswitch_f
    const-string v10, "getStaticScope"

    .line 185
    .line 186
    aput-object v10, v9, v14

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :pswitch_10
    aput-object v12, v9, v14

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :pswitch_11
    aput-object v11, v9, v14

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :pswitch_12
    aput-object v10, v9, v14

    .line 196
    .line 197
    :goto_3
    if-eq p0, v7, :cond_8

    .line 198
    .line 199
    if-eq p0, v6, :cond_8

    .line 200
    .line 201
    if-eq p0, v5, :cond_8

    .line 202
    .line 203
    if-eq p0, v4, :cond_8

    .line 204
    .line 205
    if-eq p0, v3, :cond_8

    .line 206
    .line 207
    if-eq p0, v2, :cond_8

    .line 208
    .line 209
    if-eq p0, v1, :cond_7

    .line 210
    .line 211
    if-eq p0, v0, :cond_6

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_6
    aput-object v13, v9, v7

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_7
    aput-object v12, v9, v7

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_8
    aput-object v11, v9, v7

    .line 221
    .line 222
    :goto_4
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    if-eq p0, v7, :cond_9

    .line 227
    .line 228
    if-eq p0, v6, :cond_9

    .line 229
    .line 230
    if-eq p0, v5, :cond_9

    .line 231
    .line 232
    if-eq p0, v4, :cond_9

    .line 233
    .line 234
    if-eq p0, v3, :cond_9

    .line 235
    .line 236
    if-eq p0, v2, :cond_9

    .line 237
    .line 238
    if-eq p0, v1, :cond_9

    .line 239
    .line 240
    if-eq p0, v0, :cond_9

    .line 241
    .line 242
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 243
    .line 244
    invoke-direct {p0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 249
    .line 250
    invoke-direct {p0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :goto_5
    throw p0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_12
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_12
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public A0()Lv8/k;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-static {v0}, Lo8/i;->g(LL7/m;)LL7/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ls8/e;->r(LL7/H;)LD8/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, LO7/y;->L(LD8/g;)Lv8/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/16 v1, 0xc

    .line 18
    .line 19
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v0
.end method

.method public B0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/D;->B0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->C()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public D0()Ljava/util/List;
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public E0(LL7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, LL7/o;->h(LL7/e;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public F0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->F0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public G(LC8/E0;LD8/g;)Lv8/k;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    invoke-static {v0}, LO7/y;->x0(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p2, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    invoke-static {v0}, LO7/y;->x0(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, LO7/z;->G(LC8/E0;LD8/g;)Lv8/k;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, LO7/y;->i:LC8/G0;

    .line 20
    .line 21
    invoke-virtual {p2}, LC8/G0;->k()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    const/4 p2, 0x7

    .line 30
    invoke-static {p2}, LO7/y;->x0(I)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-object p1

    .line 34
    :cond_3
    new-instance p2, Lv8/t;

    .line 35
    .line 36
    invoke-direct {p0}, LO7/y;->H0()LC8/G0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p2, p1, v0}, Lv8/t;-><init>(Lv8/k;LC8/G0;)V

    .line 41
    .line 42
    .line 43
    return-object p2
.end method

.method public G0()LL7/c0;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public I()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->I()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public I0(LC8/G0;)LL7/e;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x17

    .line 4
    .line 5
    invoke-static {v0}, LO7/y;->x0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, LC8/G0;->k()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v0, LO7/y;

    .line 16
    .line 17
    invoke-virtual {p1}, LC8/G0;->j()LC8/E0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0}, LO7/y;->H0()LC8/G0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, LC8/G0;->j()LC8/E0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {p1, v1}, LC8/G0;->h(LC8/E0;LC8/E0;)LC8/G0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v0, p0, p1}, LO7/y;-><init>(LO7/z;LC8/G0;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/D;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public K()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/i;->K()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public L(LD8/g;)Lv8/k;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    invoke-static {v0}, LO7/y;->x0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LO7/z;->L(LD8/g;)Lv8/k;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, LO7/y;->i:LC8/G0;

    .line 15
    .line 16
    invoke-virtual {v0}, LC8/G0;->k()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const/16 v0, 0xe

    .line 25
    .line 26
    invoke-static {v0}, LO7/y;->x0(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-object p1

    .line 30
    :cond_2
    new-instance v0, Lv8/t;

    .line 31
    .line 32
    invoke-direct {p0}, LO7/y;->H0()LC8/G0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, p1, v1}, Lv8/t;-><init>(Lv8/k;LC8/G0;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public O()LL7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->O()LL7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public P()Lv8/k;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->P()Lv8/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0xf

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public R()LL7/e;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->R()LL7/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public a()LL7/e;
    .locals 2

    .line 3
    iget-object v0, p0, LO7/y;->h:LO7/z;

    invoke-interface {v0}, LL7/e;->a()LL7/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, LO7/y;->x0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic a()LL7/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/y;->a()LL7/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LL7/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LO7/y;->a()LL7/e;

    move-result-object v0

    return-object v0
.end method

.method public b()LL7/m;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->b()LL7/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public bridge synthetic c(LC8/G0;)LL7/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/y;->I0(LC8/G0;)LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public f()Ljava/util/Collection;
    .locals 5

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->f()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LL7/d;

    .line 31
    .line 32
    invoke-interface {v2}, LL7/z;->s()LL7/z$a;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v2}, LL7/d;->a()LL7/d;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v3, v4}, LL7/z$a;->r(LL7/b;)LL7/z$a;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v2}, LL7/D;->k()LL7/E;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v3, v4}, LL7/z$a;->s(LL7/E;)LL7/z$a;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v2}, LL7/D;->getVisibility()LL7/u;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v3, v4}, LL7/z$a;->b(LL7/u;)LL7/z$a;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v2}, LL7/b;->getKind()LL7/b$a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v3, v2}, LL7/z$a;->i(LL7/b$a;)LL7/z$a;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-interface {v2, v3}, LL7/z$a;->k(Z)LL7/z$a;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, LL7/z$a;->build()LL7/z;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, LL7/d;

    .line 78
    .line 79
    invoke-direct {p0}, LO7/y;->H0()LC8/G0;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v2, v3}, LL7/d;->c(LC8/G0;)LL7/d;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    return-object v1
.end method

.method public g()LL7/h0;
    .locals 2

    .line 1
    sget-object v0, LL7/h0;->a:LL7/h0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x1d

    .line 6
    .line 7
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public getAnnotations()LM7/h;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LM7/a;->getAnnotations()LM7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x13

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public getKind()LL7/f;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->getKind()LL7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x19

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public getName()Lk8/f;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/J;->getName()Lk8/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x14

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public getVisibility()LL7/u;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->getVisibility()LL7/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x1b

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/D;->isExternal()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->isInline()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j()LC8/v0;
    .locals 5

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LO7/y;->i:LC8/G0;

    .line 8
    .line 9
    invoke-virtual {v1}, LC8/G0;->k()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0

    .line 22
    :cond_1
    iget-object v1, p0, LO7/y;->m:LC8/v0;

    .line 23
    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    invoke-direct {p0}, LO7/y;->H0()LC8/G0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0}, LC8/v0;->g()Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, LC8/S;

    .line 58
    .line 59
    sget-object v4, LC8/N0;->k:LC8/N0;

    .line 60
    .line 61
    invoke-virtual {v1, v3, v4}, LC8/G0;->p(LC8/S;LC8/N0;)LC8/S;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance v0, LC8/u;

    .line 70
    .line 71
    iget-object v1, p0, LO7/y;->k:Ljava/util/List;

    .line 72
    .line 73
    sget-object v3, LB8/f;->e:LB8/n;

    .line 74
    .line 75
    invoke-direct {v0, p0, v1, v2, v3}, LC8/u;-><init>(LL7/e;Ljava/util/List;Ljava/util/Collection;LB8/n;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, LO7/y;->m:LC8/v0;

    .line 79
    .line 80
    :cond_3
    iget-object v0, p0, LO7/y;->m:LC8/v0;

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 86
    .line 87
    .line 88
    :cond_4
    return-object v0
.end method

.method public k()LL7/E;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->k()LL7/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x1a

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n0(LC8/E0;)Lv8/k;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    invoke-static {v0}, LO7/y;->x0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Lo8/i;->g(LL7/m;)LL7/H;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Ls8/e;->r(LL7/H;)LD8/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, p1, v0}, LO7/y;->G(LC8/E0;LD8/g;)Lv8/k;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xb

    .line 23
    .line 24
    invoke-static {v0}, LO7/y;->x0(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-object p1
.end method

.method public r()LC8/d0;
    .locals 5

    .line 1
    invoke-virtual {p0}, LO7/y;->j()LC8/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LC8/v0;->getParameters()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LC8/J0;->g(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, LC8/x;->a:LC8/x;

    .line 14
    .line 15
    invoke-virtual {p0}, LO7/y;->getAnnotations()LM7/h;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v1, v2, v3, v3}, LC8/x;->a(LM7/h;LC8/v0;LL7/m;)LC8/r0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, LO7/y;->j()LC8/v0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p0}, LO7/y;->A0()Lv8/k;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v1, v2, v0, v3, v4}, LC8/V;->m(LC8/r0;LC8/v0;Ljava/util/List;ZLv8/k;)LC8/d0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/16 v1, 0x10

    .line 40
    .line 41
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v0
.end method

.method public t()Ljava/util/List;
    .locals 2

    .line 1
    invoke-direct {p0}, LO7/y;->H0()LC8/G0;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LO7/y;->l:Ljava/util/List;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public v0()Lv8/k;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->v0()Lv8/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x1c

    .line 10
    .line 11
    invoke-static {v1}, LO7/y;->x0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public w0()LL7/r0;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->w0()LL7/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v1, LO7/y$b;

    .line 12
    .line 13
    invoke-direct {v1, p0}, LO7/y$b;-><init>(LO7/y;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, LL7/r0;->b(Lkotlin/jvm/functions/Function1;)LL7/r0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-object v0, p0, LO7/y;->h:LO7/z;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/e;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
