.class public abstract Lo8/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo8/h$a;
    }
.end annotation


# direct methods
.method private static synthetic a(I)V
    .locals 11

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    if-eq p0, v2, :cond_0

    .line 8
    .line 9
    if-eq p0, v1, :cond_0

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    .line 17
    .line 18
    :goto_0
    const/4 v4, 0x2

    .line 19
    if-eq p0, v2, :cond_1

    .line 20
    .line 21
    if-eq p0, v1, :cond_1

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v5, v4

    .line 28
    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    .line 29
    .line 30
    const-string v6, "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory"

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    packed-switch p0, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    :pswitch_0
    const-string v8, "propertyDescriptor"

    .line 37
    .line 38
    aput-object v8, v5, v7

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :pswitch_1
    const-string v8, "owner"

    .line 42
    .line 43
    aput-object v8, v5, v7

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :pswitch_2
    const-string v8, "descriptor"

    .line 47
    .line 48
    aput-object v8, v5, v7

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :pswitch_3
    const-string v8, "enumClass"

    .line 52
    .line 53
    aput-object v8, v5, v7

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :pswitch_4
    const-string v8, "source"

    .line 57
    .line 58
    aput-object v8, v5, v7

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :pswitch_5
    const-string v8, "containingClass"

    .line 62
    .line 63
    aput-object v8, v5, v7

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :pswitch_6
    aput-object v6, v5, v7

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :pswitch_7
    const-string v8, "visibility"

    .line 70
    .line 71
    aput-object v8, v5, v7

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :pswitch_8
    const-string v8, "sourceElement"

    .line 75
    .line 76
    aput-object v8, v5, v7

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :pswitch_9
    const-string v8, "parameterAnnotations"

    .line 80
    .line 81
    aput-object v8, v5, v7

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :pswitch_a
    const-string v8, "annotations"

    .line 85
    .line 86
    aput-object v8, v5, v7

    .line 87
    .line 88
    :goto_2
    const-string v7, "createSetter"

    .line 89
    .line 90
    const-string v8, "createEnumValuesMethod"

    .line 91
    .line 92
    const-string v9, "createEnumValueOfMethod"

    .line 93
    .line 94
    const/4 v10, 0x1

    .line 95
    if-eq p0, v2, :cond_4

    .line 96
    .line 97
    if-eq p0, v1, :cond_3

    .line 98
    .line 99
    if-eq p0, v0, :cond_2

    .line 100
    .line 101
    aput-object v6, v5, v10

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_2
    aput-object v9, v5, v10

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    aput-object v8, v5, v10

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    aput-object v7, v5, v10

    .line 111
    .line 112
    :goto_3
    packed-switch p0, :pswitch_data_1

    .line 113
    .line 114
    .line 115
    const-string v6, "createDefaultSetter"

    .line 116
    .line 117
    aput-object v6, v5, v4

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :pswitch_b
    const-string v6, "createContextReceiverParameterForClass"

    .line 121
    .line 122
    aput-object v6, v5, v4

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :pswitch_c
    const-string v6, "createContextReceiverParameterForCallable"

    .line 126
    .line 127
    aput-object v6, v5, v4

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :pswitch_d
    const-string v6, "createExtensionReceiverParameterForCallable"

    .line 131
    .line 132
    aput-object v6, v5, v4

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :pswitch_e
    const-string v6, "isEnumSpecialMethod"

    .line 136
    .line 137
    aput-object v6, v5, v4

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :pswitch_f
    const-string v6, "isEnumValueOfMethod"

    .line 141
    .line 142
    aput-object v6, v5, v4

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :pswitch_10
    const-string v6, "isEnumValuesMethod"

    .line 146
    .line 147
    aput-object v6, v5, v4

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :pswitch_11
    const-string v6, "createEnumEntriesProperty"

    .line 151
    .line 152
    aput-object v6, v5, v4

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :pswitch_12
    aput-object v9, v5, v4

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :pswitch_13
    aput-object v8, v5, v4

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :pswitch_14
    const-string v6, "createPrimaryConstructorForObject"

    .line 162
    .line 163
    aput-object v6, v5, v4

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :pswitch_15
    const-string v6, "createGetter"

    .line 167
    .line 168
    aput-object v6, v5, v4

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :pswitch_16
    const-string v6, "createDefaultGetter"

    .line 172
    .line 173
    aput-object v6, v5, v4

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :pswitch_17
    aput-object v7, v5, v4

    .line 177
    .line 178
    :goto_4
    :pswitch_18
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    if-eq p0, v2, :cond_5

    .line 183
    .line 184
    if-eq p0, v1, :cond_5

    .line 185
    .line 186
    if-eq p0, v0, :cond_5

    .line 187
    .line 188
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 189
    .line 190
    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 195
    .line 196
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :goto_5
    throw p0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
    .end packed-switch

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_18
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_18
        :pswitch_12
        :pswitch_18
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public static b(LL7/a;LC8/S;Lk8/f;LM7/h;I)LL7/c0;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p3, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x21

    .line 11
    .line 12
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_2
    new-instance v1, LO7/N;

    .line 20
    .line 21
    new-instance v2, Lw8/c;

    .line 22
    .line 23
    invoke-direct {v2, p0, p1, p2, v0}, Lw8/c;-><init>(LL7/a;LC8/S;Lk8/f;Lw8/g;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p4}, Lk8/g;->a(I)Lk8/f;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v1, p0, v2, p3, p1}, LO7/N;-><init>(LL7/m;Lw8/g;LM7/h;Lk8/f;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public static c(LL7/e;LC8/S;Lk8/f;LM7/h;I)LL7/c0;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x22

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p3, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x23

    .line 11
    .line 12
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_2
    new-instance v1, LO7/N;

    .line 20
    .line 21
    new-instance v2, Lw8/b;

    .line 22
    .line 23
    invoke-direct {v2, p0, p1, p2, v0}, Lw8/b;-><init>(LL7/e;LC8/S;Lk8/f;Lw8/g;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p4}, Lk8/g;->a(I)Lk8/f;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v1, p0, v2, p3, p1}, LO7/N;-><init>(LL7/m;Lw8/g;LM7/h;Lk8/f;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public static d(LL7/Z;LM7/h;)LO7/L;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0xe

    .line 11
    .line 12
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {p0, p1, v0, v1, v1}, Lo8/h;->j(LL7/Z;LM7/h;ZZZ)LO7/L;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static e(LL7/Z;LM7/h;LM7/h;)LO7/M;
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p2, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 17
    .line 18
    .line 19
    :cond_2
    const/4 v6, 0x0

    .line 20
    invoke-interface {p0}, LL7/p;->g()LL7/h0;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v1, p0

    .line 27
    move-object v2, p1

    .line 28
    move-object v3, p2

    .line 29
    invoke-static/range {v1 .. v7}, Lo8/h;->n(LL7/Z;LM7/h;LM7/h;ZZZLL7/h0;)LO7/M;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static f(LL7/e;)LL7/Z;
    .locals 23

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static/range {p0 .. p0}, Lo8/i;->g(LL7/m;)LL7/H;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lo8/v;->a(LL7/H;)Lo8/u;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1, v0}, Lo8/u;->a(LL7/H;)LL7/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    sget-object v2, LM7/h;->a:LM7/h$a;

    .line 25
    .line 26
    invoke-virtual {v2}, LM7/h$a;->b()LM7/h;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sget-object v5, LL7/E;->h:LL7/E;

    .line 31
    .line 32
    sget-object v6, LL7/t;->e:LL7/u;

    .line 33
    .line 34
    sget-object v8, LI7/o;->e:Lk8/f;

    .line 35
    .line 36
    sget-object v9, LL7/b$a;->j:LL7/b$a;

    .line 37
    .line 38
    invoke-interface/range {p0 .. p0}, LL7/p;->g()LL7/h0;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const/4 v15, 0x0

    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    move-object/from16 v3, p0

    .line 51
    .line 52
    invoke-static/range {v3 .. v16}, LO7/K;->L0(LL7/m;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;LL7/h0;ZZZZZZ)LO7/K;

    .line 53
    .line 54
    .line 55
    move-result-object v17

    .line 56
    new-instance v3, LO7/L;

    .line 57
    .line 58
    invoke-virtual {v2}, LM7/h$a;->b()LM7/h;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    const/4 v14, 0x0

    .line 63
    invoke-interface/range {p0 .. p0}, LL7/p;->g()LL7/h0;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    const/4 v10, 0x0

    .line 68
    move-object v8, v5

    .line 69
    move-object v13, v9

    .line 70
    move-object v5, v3

    .line 71
    move-object v9, v6

    .line 72
    move-object/from16 v6, v17

    .line 73
    .line 74
    invoke-direct/range {v5 .. v15}, LO7/L;-><init>(LL7/Z;LM7/h;LL7/E;LL7/u;ZZZLL7/b$a;LL7/a0;LL7/h0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v5, v1}, LO7/K;->R0(LO7/L;LL7/b0;)V

    .line 78
    .line 79
    .line 80
    sget-object v1, LC8/r0;->h:LC8/r0$a;

    .line 81
    .line 82
    invoke-virtual {v1}, LC8/r0$a;->j()LC8/r0;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v2, LC8/D0;

    .line 91
    .line 92
    invoke-interface/range {p0 .. p0}, LL7/e;->r()LC8/d0;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-direct {v2, v3}, LC8/D0;-><init>(LC8/S;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    const/4 v3, 0x0

    .line 104
    invoke-static {v1, v0, v2, v3}, LC8/V;->i(LC8/r0;LC8/v0;Ljava/util/List;Z)LC8/d0;

    .line 105
    .line 106
    .line 107
    move-result-object v18

    .line 108
    sget-object v19, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 109
    .line 110
    const/16 v20, 0x0

    .line 111
    .line 112
    const/16 v21, 0x0

    .line 113
    .line 114
    move-object/from16 v22, v19

    .line 115
    .line 116
    invoke-virtual/range {v17 .. v22}, LO7/K;->Y0(LC8/S;Ljava/util/List;LL7/c0;LL7/c0;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6}, LO7/K;->getReturnType()LC8/S;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v5, v0}, LO7/L;->M0(LC8/S;)V

    .line 124
    .line 125
    .line 126
    return-object v6
.end method

.method public static g(LL7/e;)LL7/g0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x18

    .line 6
    .line 7
    invoke-static {v1}, Lo8/h;->a(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v1, LM7/h;->a:LM7/h$a;

    .line 11
    .line 12
    invoke-virtual {v1}, LM7/h$a;->b()LM7/h;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, LI7/o;->f:Lk8/f;

    .line 17
    .line 18
    sget-object v4, LL7/b$a;->j:LL7/b$a;

    .line 19
    .line 20
    invoke-interface {v0}, LL7/p;->g()LL7/h0;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {v0, v2, v3, v4, v5}, LO7/O;->i1(LL7/m;LM7/h;Lk8/f;LL7/b$a;LL7/h0;)LO7/O;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    move-object v7, v6

    .line 29
    new-instance v6, LO7/V;

    .line 30
    .line 31
    invoke-virtual {v1}, LM7/h$a;->b()LM7/h;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    const-string v1, "value"

    .line 36
    .line 37
    invoke-static {v1}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    invoke-static {v0}, Ls8/e;->m(LL7/m;)LI7/i;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, LI7/i;->W()LC8/d0;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    invoke-interface {v0}, LL7/p;->g()LL7/h0;

    .line 52
    .line 53
    .line 54
    move-result-object v17

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v13, 0x0

    .line 58
    const/4 v14, 0x0

    .line 59
    const/4 v15, 0x0

    .line 60
    invoke-direct/range {v6 .. v17}, LO7/V;-><init>(LL7/a;LL7/t0;ILM7/h;Lk8/f;LC8/S;ZZZLC8/S;LL7/h0;)V

    .line 61
    .line 62
    .line 63
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    invoke-interface {v0}, LL7/e;->r()LC8/d0;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    sget-object v13, LL7/E;->h:LL7/E;

    .line 74
    .line 75
    sget-object v14, LL7/t;->e:LL7/u;

    .line 76
    .line 77
    move-object v6, v7

    .line 78
    const/4 v7, 0x0

    .line 79
    move-object v10, v9

    .line 80
    invoke-virtual/range {v6 .. v14}, LO7/O;->k1(LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;)LO7/O;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    const/16 v1, 0x19

    .line 87
    .line 88
    invoke-static {v1}, Lo8/h;->a(I)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-object v0
.end method

.method public static h(LL7/e;)LL7/g0;
    .locals 13

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x16

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 9
    .line 10
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, LI7/o;->d:Lk8/f;

    .line 15
    .line 16
    sget-object v2, LL7/b$a;->j:LL7/b$a;

    .line 17
    .line 18
    invoke-interface {p0}, LL7/p;->g()LL7/h0;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {p0, v0, v1, v2, v3}, LO7/O;->i1(LL7/m;LM7/h;Lk8/f;LL7/b$a;LL7/h0;)LO7/O;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p0}, Ls8/e;->m(LL7/m;)LI7/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, LC8/N0;->k:LC8/N0;

    .line 33
    .line 34
    invoke-interface {p0}, LL7/e;->r()LC8/d0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, v1, p0}, LI7/i;->l(LC8/N0;LC8/S;)LC8/d0;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    sget-object v11, LL7/E;->h:LL7/E;

    .line 43
    .line 44
    sget-object v12, LL7/t;->e:LL7/u;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    move-object v8, v7

    .line 49
    move-object v9, v7

    .line 50
    invoke-virtual/range {v4 .. v12}, LO7/O;->k1(LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;)LO7/O;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    const/16 v0, 0x17

    .line 57
    .line 58
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-object p0
.end method

.method public static i(LL7/a;LC8/S;LM7/h;)LL7/c0;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1e

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x1f

    .line 11
    .line 12
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_2
    new-instance v1, LO7/N;

    .line 20
    .line 21
    new-instance v2, Lw8/d;

    .line 22
    .line 23
    invoke-direct {v2, p0, p1, v0}, Lw8/d;-><init>(LL7/a;LC8/S;Lw8/g;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, p0, v2, p2}, LO7/N;-><init>(LL7/m;Lw8/g;LM7/h;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public static j(LL7/Z;LM7/h;ZZZ)LO7/L;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xf

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-interface {p0}, LL7/p;->g()LL7/h0;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    move-object v1, p0

    .line 20
    move-object v2, p1

    .line 21
    move v3, p2

    .line 22
    move v4, p3

    .line 23
    move v5, p4

    .line 24
    invoke-static/range {v1 .. v6}, Lo8/h;->k(LL7/Z;LM7/h;ZZZLL7/h0;)LO7/L;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static k(LL7/Z;LM7/h;ZZZLL7/h0;)LO7/L;
    .locals 12

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x12

    .line 11
    .line 12
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-nez p5, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x13

    .line 18
    .line 19
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    new-instance v1, LO7/L;

    .line 23
    .line 24
    invoke-interface {p0}, LL7/D;->k()LL7/E;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {p0}, LL7/D;->getVisibility()LL7/u;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    sget-object v9, LL7/b$a;->g:LL7/b$a;

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    move-object v2, p0

    .line 36
    move-object v3, p1

    .line 37
    move v6, p2

    .line 38
    move v7, p3

    .line 39
    move/from16 v8, p4

    .line 40
    .line 41
    move-object/from16 v11, p5

    .line 42
    .line 43
    invoke-direct/range {v1 .. v11}, LO7/L;-><init>(LL7/Z;LM7/h;LL7/E;LL7/u;ZZZLL7/b$a;LL7/a0;LL7/h0;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public static l(LL7/e;LL7/h0;)LO7/i;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x14

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x15

    .line 11
    .line 12
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    new-instance v0, Lo8/h$a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, Lo8/h$a;-><init>(LL7/e;LL7/h0;Z)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static m(LL7/Z;LM7/h;LM7/h;ZZZLL7/u;LL7/h0;)LO7/M;
    .locals 12

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    if-nez p2, :cond_2

    .line 15
    .line 16
    const/16 v0, 0x9

    .line 17
    .line 18
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 19
    .line 20
    .line 21
    :cond_2
    if-nez p6, :cond_3

    .line 22
    .line 23
    const/16 v0, 0xa

    .line 24
    .line 25
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 26
    .line 27
    .line 28
    :cond_3
    if-nez p7, :cond_4

    .line 29
    .line 30
    const/16 v0, 0xb

    .line 31
    .line 32
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 33
    .line 34
    .line 35
    :cond_4
    new-instance v1, LO7/M;

    .line 36
    .line 37
    invoke-interface {p0}, LL7/D;->k()LL7/E;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    sget-object v9, LL7/b$a;->g:LL7/b$a;

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    move-object v2, p0

    .line 45
    move-object v3, p1

    .line 46
    move v6, p3

    .line 47
    move/from16 v7, p4

    .line 48
    .line 49
    move/from16 v8, p5

    .line 50
    .line 51
    move-object/from16 v5, p6

    .line 52
    .line 53
    move-object/from16 v11, p7

    .line 54
    .line 55
    invoke-direct/range {v1 .. v11}, LO7/M;-><init>(LL7/Z;LM7/h;LL7/E;LL7/u;ZZZLL7/b$a;LL7/b0;LL7/h0;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0}, LL7/s0;->getType()LC8/S;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v1, p0, p2}, LO7/M;->L0(LL7/b0;LC8/S;LM7/h;)LO7/V;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v1, p0}, LO7/M;->N0(LL7/t0;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method

.method public static n(LL7/Z;LM7/h;LM7/h;ZZZLL7/h0;)LO7/M;
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p2, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 17
    .line 18
    .line 19
    :cond_2
    if-nez p6, :cond_3

    .line 20
    .line 21
    const/4 v0, 0x6

    .line 22
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 23
    .line 24
    .line 25
    :cond_3
    invoke-interface {p0}, LL7/D;->getVisibility()LL7/u;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    move-object v1, p0

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p2

    .line 32
    move v4, p3

    .line 33
    move v5, p4

    .line 34
    move v6, p5

    .line 35
    move-object v8, p6

    .line 36
    invoke-static/range {v1 .. v8}, Lo8/h;->m(LL7/Z;LM7/h;LM7/h;ZZZLL7/u;LL7/h0;)LO7/M;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method private static o(LL7/z;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1d

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p0}, LL7/b;->getKind()LL7/b$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, LL7/b$a;->j:LL7/b$a;

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, LL7/z;->b()LL7/m;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lo8/i;->A(LL7/m;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static p(LL7/z;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1c

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p0}, LL7/J;->getName()Lk8/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, LI7/o;->f:Lk8/f;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lk8/f;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Lo8/h;->o(LL7/z;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static q(LL7/z;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1b

    .line 4
    .line 5
    invoke-static {v0}, Lo8/h;->a(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p0}, LL7/J;->getName()Lk8/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, LI7/o;->d:Lk8/f;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lk8/f;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Lo8/h;->o(LL7/z;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method
