.class public LO7/K;
.super LO7/Y;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LL7/Z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO7/K$a;
    }
.end annotation


# instance fields
.field private A:LL7/c0;

.field private B:LL7/c0;

.field private C:Ljava/util/List;

.field private D:LO7/L;

.field private E:LL7/b0;

.field private F:Z

.field private G:LL7/w;

.field private H:LL7/w;

.field private final o:LL7/E;

.field private p:LL7/u;

.field private q:Ljava/util/Collection;

.field private final r:LL7/Z;

.field private final s:LL7/b$a;

.field private final t:Z

.field private final u:Z

.field private final v:Z

.field private final w:Z

.field private final x:Z

.field private final y:Z

.field private z:Ljava/util/List;


# direct methods
.method protected constructor <init>(LL7/m;LL7/Z;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;LL7/h0;ZZZZZZ)V
    .locals 8

    move-object/from16 v7, p8

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_1
    if-nez p4, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_2
    if-nez p5, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_3
    if-nez p7, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_4
    if-nez v7, :cond_5

    const/4 v0, 0x5

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_5
    if-nez p9, :cond_6

    const/4 v0, 0x6

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_6
    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move v5, p6

    move-object v3, p7

    move-object/from16 v6, p9

    .line 1
    invoke-direct/range {v0 .. v6}, LO7/Y;-><init>(LL7/m;LM7/h;Lk8/f;LC8/S;ZLL7/h0;)V

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, LO7/K;->q:Ljava/util/Collection;

    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, LO7/K;->z:Ljava/util/List;

    .line 4
    iput-object p4, p0, LO7/K;->o:LL7/E;

    .line 5
    iput-object p5, p0, LO7/K;->p:LL7/u;

    if-nez p2, :cond_7

    move-object v1, p0

    goto :goto_0

    :cond_7
    move-object v1, p2

    .line 6
    :goto_0
    iput-object v1, p0, LO7/K;->r:LL7/Z;

    .line 7
    iput-object v7, p0, LO7/K;->s:LL7/b$a;

    move/from16 v1, p10

    .line 8
    iput-boolean v1, p0, LO7/K;->t:Z

    move/from16 v1, p11

    .line 9
    iput-boolean v1, p0, LO7/K;->u:Z

    move/from16 v1, p12

    .line 10
    iput-boolean v1, p0, LO7/K;->v:Z

    move/from16 v1, p13

    .line 11
    iput-boolean v1, p0, LO7/K;->w:Z

    move/from16 v1, p14

    .line 12
    iput-boolean v1, p0, LO7/K;->x:Z

    move/from16 v1, p15

    .line 13
    iput-boolean v1, p0, LO7/K;->y:Z

    return-void
.end method

.method private static synthetic G(I)V
    .locals 11

    .line 1
    const/16 v0, 0x2a

    .line 2
    .line 3
    const/16 v1, 0x29

    .line 4
    .line 5
    const/16 v2, 0x27

    .line 6
    .line 7
    const/16 v3, 0x26

    .line 8
    .line 9
    const/16 v4, 0x1c

    .line 10
    .line 11
    if-eq p0, v4, :cond_0

    .line 12
    .line 13
    if-eq p0, v3, :cond_0

    .line 14
    .line 15
    if-eq p0, v2, :cond_0

    .line 16
    .line 17
    if-eq p0, v1, :cond_0

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    packed-switch p0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    .line 28
    .line 29
    :goto_0
    const/4 v6, 0x2

    .line 30
    if-eq p0, v4, :cond_1

    .line 31
    .line 32
    if-eq p0, v3, :cond_1

    .line 33
    .line 34
    if-eq p0, v2, :cond_1

    .line 35
    .line 36
    if-eq p0, v1, :cond_1

    .line 37
    .line 38
    if-eq p0, v0, :cond_1

    .line 39
    .line 40
    packed-switch p0, :pswitch_data_1

    .line 41
    .line 42
    .line 43
    const/4 v7, 0x3

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :pswitch_1
    move v7, v6

    .line 46
    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    .line 47
    .line 48
    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl"

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    packed-switch p0, :pswitch_data_2

    .line 52
    .line 53
    .line 54
    :pswitch_2
    const-string v10, "containingDeclaration"

    .line 55
    .line 56
    aput-object v10, v7, v9

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :pswitch_3
    const-string v10, "overriddenDescriptors"

    .line 61
    .line 62
    aput-object v10, v7, v9

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :pswitch_4
    const-string v10, "newName"

    .line 67
    .line 68
    aput-object v10, v7, v9

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :pswitch_5
    const-string v10, "newVisibility"

    .line 72
    .line 73
    aput-object v10, v7, v9

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :pswitch_6
    const-string v10, "newModality"

    .line 77
    .line 78
    aput-object v10, v7, v9

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :pswitch_7
    const-string v10, "newOwner"

    .line 82
    .line 83
    aput-object v10, v7, v9

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :pswitch_8
    const-string v10, "accessorDescriptor"

    .line 87
    .line 88
    aput-object v10, v7, v9

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :pswitch_9
    const-string v10, "substitutor"

    .line 92
    .line 93
    aput-object v10, v7, v9

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :pswitch_a
    const-string v10, "copyConfiguration"

    .line 97
    .line 98
    aput-object v10, v7, v9

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :pswitch_b
    const-string v10, "originalSubstitutor"

    .line 102
    .line 103
    aput-object v10, v7, v9

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :pswitch_c
    aput-object v8, v7, v9

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :pswitch_d
    const-string v10, "contextReceiverParameters"

    .line 110
    .line 111
    aput-object v10, v7, v9

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :pswitch_e
    const-string v10, "typeParameters"

    .line 115
    .line 116
    aput-object v10, v7, v9

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :pswitch_f
    const-string v10, "outType"

    .line 120
    .line 121
    aput-object v10, v7, v9

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :pswitch_10
    const-string v10, "inType"

    .line 125
    .line 126
    aput-object v10, v7, v9

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :pswitch_11
    const-string v10, "source"

    .line 130
    .line 131
    aput-object v10, v7, v9

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :pswitch_12
    const-string v10, "kind"

    .line 135
    .line 136
    aput-object v10, v7, v9

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :pswitch_13
    const-string v10, "name"

    .line 140
    .line 141
    aput-object v10, v7, v9

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :pswitch_14
    const-string v10, "visibility"

    .line 145
    .line 146
    aput-object v10, v7, v9

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :pswitch_15
    const-string v10, "modality"

    .line 150
    .line 151
    aput-object v10, v7, v9

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :pswitch_16
    const-string v10, "annotations"

    .line 155
    .line 156
    aput-object v10, v7, v9

    .line 157
    .line 158
    :goto_2
    const/4 v9, 0x1

    .line 159
    if-eq p0, v4, :cond_6

    .line 160
    .line 161
    if-eq p0, v3, :cond_5

    .line 162
    .line 163
    if-eq p0, v2, :cond_4

    .line 164
    .line 165
    if-eq p0, v1, :cond_3

    .line 166
    .line 167
    if-eq p0, v0, :cond_2

    .line 168
    .line 169
    packed-switch p0, :pswitch_data_3

    .line 170
    .line 171
    .line 172
    aput-object v8, v7, v9

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :pswitch_17
    const-string v8, "getAccessors"

    .line 176
    .line 177
    aput-object v8, v7, v9

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :pswitch_18
    const-string v8, "getVisibility"

    .line 181
    .line 182
    aput-object v8, v7, v9

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :pswitch_19
    const-string v8, "getModality"

    .line 186
    .line 187
    aput-object v8, v7, v9

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :pswitch_1a
    const-string v8, "getReturnType"

    .line 191
    .line 192
    aput-object v8, v7, v9

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :pswitch_1b
    const-string v8, "getContextReceiverParameters"

    .line 196
    .line 197
    aput-object v8, v7, v9

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :pswitch_1c
    const-string v8, "getTypeParameters"

    .line 201
    .line 202
    aput-object v8, v7, v9

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_2
    const-string v8, "copy"

    .line 206
    .line 207
    aput-object v8, v7, v9

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_3
    const-string v8, "getOverriddenDescriptors"

    .line 211
    .line 212
    aput-object v8, v7, v9

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_4
    const-string v8, "getKind"

    .line 216
    .line 217
    aput-object v8, v7, v9

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_5
    const-string v8, "getOriginal"

    .line 221
    .line 222
    aput-object v8, v7, v9

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    const-string v8, "getSourceToUseForCopy"

    .line 226
    .line 227
    aput-object v8, v7, v9

    .line 228
    .line 229
    :goto_3
    packed-switch p0, :pswitch_data_4

    .line 230
    .line 231
    .line 232
    const-string v8, "<init>"

    .line 233
    .line 234
    aput-object v8, v7, v6

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :pswitch_1d
    const-string v8, "setOverriddenDescriptors"

    .line 238
    .line 239
    aput-object v8, v7, v6

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :pswitch_1e
    const-string v8, "createSubstitutedCopy"

    .line 243
    .line 244
    aput-object v8, v7, v6

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :pswitch_1f
    const-string v8, "getSubstitutedInitialSignatureDescriptor"

    .line 248
    .line 249
    aput-object v8, v7, v6

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :pswitch_20
    const-string v8, "doSubstitute"

    .line 253
    .line 254
    aput-object v8, v7, v6

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :pswitch_21
    const-string v8, "substitute"

    .line 258
    .line 259
    aput-object v8, v7, v6

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :pswitch_22
    const-string v8, "setVisibility"

    .line 263
    .line 264
    aput-object v8, v7, v6

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :pswitch_23
    const-string v8, "setType"

    .line 268
    .line 269
    aput-object v8, v7, v6

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :pswitch_24
    const-string v8, "setInType"

    .line 273
    .line 274
    aput-object v8, v7, v6

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :pswitch_25
    const-string v8, "create"

    .line 278
    .line 279
    aput-object v8, v7, v6

    .line 280
    .line 281
    :goto_4
    :pswitch_26
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    if-eq p0, v4, :cond_7

    .line 286
    .line 287
    if-eq p0, v3, :cond_7

    .line 288
    .line 289
    if-eq p0, v2, :cond_7

    .line 290
    .line 291
    if-eq p0, v1, :cond_7

    .line 292
    .line 293
    if-eq p0, v0, :cond_7

    .line 294
    .line 295
    packed-switch p0, :pswitch_data_5

    .line 296
    .line 297
    .line 298
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 299
    .line 300
    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_7
    :pswitch_27
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    :goto_5
    throw p0

    .line 310
    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_2
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_14
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_12
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_c
        :pswitch_3
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x15
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_21
        :pswitch_26
        :pswitch_20
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_26
        :pswitch_26
        :pswitch_1d
        :pswitch_26
        :pswitch_26
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x15
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
    .end packed-switch
.end method

.method static synthetic J0(LO7/K;)LL7/c0;
    .locals 0

    .line 1
    iget-object p0, p0, LO7/K;->A:LL7/c0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static L0(LL7/m;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;LL7/h0;ZZZZZZ)LO7/K;
    .locals 17

    if-nez p0, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x8

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_1
    if-nez p2, :cond_2

    const/16 v0, 0x9

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_2
    if-nez p3, :cond_3

    const/16 v0, 0xa

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_3
    if-nez p5, :cond_4

    const/16 v0, 0xb

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_4
    if-nez p6, :cond_5

    const/16 v0, 0xc

    invoke-static {v0}, LO7/K;->G(I)V

    :cond_5
    if-nez p7, :cond_6

    const/16 v0, 0xd

    invoke-static {v0}, LO7/K;->G(I)V

    .line 1
    :cond_6
    new-instance v1, LO7/K;

    const/4 v3, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move/from16 v16, p13

    invoke-direct/range {v1 .. v16}, LO7/K;-><init>(LL7/m;LL7/Z;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;LL7/h0;ZZZZZZ)V

    return-object v1
.end method

.method private P0(ZLL7/Z;)LL7/h0;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, LO7/K;->a()LL7/Z;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-interface {p2}, LL7/p;->g()LL7/h0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    sget-object p1, LL7/h0;->a:LL7/h0;

    .line 16
    .line 17
    :goto_1
    if-nez p1, :cond_2

    .line 18
    .line 19
    const/16 p2, 0x1c

    .line 20
    .line 21
    invoke-static {p2}, LO7/K;->G(I)V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-object p1
.end method

.method private static Q0(LC8/G0;LL7/Y;)LL7/z;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x1e

    .line 4
    .line 5
    invoke-static {v0}, LO7/K;->G(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x1f

    .line 11
    .line 12
    invoke-static {v0}, LO7/K;->G(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-interface {p1}, LL7/z;->Z()LL7/z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, LL7/z;->Z()LL7/z;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1, p0}, LL7/z;->c(LC8/G0;)LL7/z;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method private static V0(LL7/u;LL7/b$a;)LL7/u;
    .locals 1

    .line 1
    sget-object v0, LL7/b$a;->h:LL7/b$a;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LL7/u;->f()LL7/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, LL7/t;->g(LL7/u;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget-object p0, LL7/t;->h:LL7/u;

    .line 16
    .line 17
    :cond_0
    return-object p0
.end method

.method private static a1(LC8/G0;LL7/Z;LL7/c0;)LL7/c0;
    .locals 4

    .line 1
    invoke-interface {p2}, LL7/s0;->getType()LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LC8/N0;->l:LC8/N0;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, LC8/G0;->p(LC8/S;LC8/N0;)LC8/S;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, LO7/N;

    .line 16
    .line 17
    new-instance v1, Lw8/c;

    .line 18
    .line 19
    invoke-interface {p2}, LL7/c0;->getValue()Lw8/g;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lw8/f;

    .line 24
    .line 25
    invoke-interface {v2}, Lw8/f;->a()Lk8/f;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {p2}, LL7/c0;->getValue()Lw8/g;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct {v1, p1, p0, v2, v3}, Lw8/c;-><init>(LL7/a;LC8/S;Lk8/f;Lw8/g;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p2}, LM7/a;->getAnnotations()LM7/h;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v0, p1, v1, p0}, LO7/N;-><init>(LL7/m;Lw8/g;LM7/h;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method private static b1(LC8/G0;LL7/Z;LL7/c0;)LL7/c0;
    .locals 3

    .line 1
    invoke-interface {p2}, LL7/s0;->getType()LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LC8/N0;->l:LC8/N0;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, LC8/G0;->p(LC8/S;LC8/N0;)LC8/S;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, LO7/N;

    .line 16
    .line 17
    new-instance v1, Lw8/d;

    .line 18
    .line 19
    invoke-interface {p2}, LL7/c0;->getValue()Lw8/g;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, p1, p0, v2}, Lw8/d;-><init>(LL7/a;LC8/S;Lw8/g;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, LM7/a;->getAnnotations()LM7/h;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p1, v1, p0}, LO7/N;-><init>(LL7/m;Lw8/g;LM7/h;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method


# virtual methods
.method public B0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO7/K;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public E0(LL7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, LL7/o;->c(LL7/Z;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO7/K;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public K0(LL7/m;LL7/E;LL7/u;LL7/b$a;Z)LL7/Z;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/K;->U0()LO7/K$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LO7/K$a;->u(LL7/m;)LO7/K$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, LO7/K$a;->t(LL7/b;)LO7/K$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p2}, LO7/K$a;->s(LL7/E;)LO7/K$a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, p3}, LO7/K$a;->w(LL7/u;)LO7/K$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, p4}, LO7/K$a;->r(LL7/b$a;)LO7/K$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1, p5}, LO7/K$a;->q(Z)LO7/K$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, LO7/K$a;->n()LL7/Z;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const/16 p2, 0x2a

    .line 37
    .line 38
    invoke-static {p2}, LO7/K;->G(I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-object p1
.end method

.method public M()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO7/K;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method protected M0(LL7/m;LL7/E;LL7/u;LL7/Z;LL7/b$a;Lk8/f;LL7/h0;)LO7/K;
    .locals 17

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    invoke-static {v0}, LO7/K;->G(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x21

    .line 11
    .line 12
    invoke-static {v0}, LO7/K;->G(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-nez p3, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x22

    .line 18
    .line 19
    invoke-static {v0}, LO7/K;->G(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    if-nez p5, :cond_3

    .line 23
    .line 24
    const/16 v0, 0x23

    .line 25
    .line 26
    invoke-static {v0}, LO7/K;->G(I)V

    .line 27
    .line 28
    .line 29
    :cond_3
    if-nez p6, :cond_4

    .line 30
    .line 31
    const/16 v0, 0x24

    .line 32
    .line 33
    invoke-static {v0}, LO7/K;->G(I)V

    .line 34
    .line 35
    .line 36
    :cond_4
    if-nez p7, :cond_5

    .line 37
    .line 38
    const/16 v0, 0x25

    .line 39
    .line 40
    invoke-static {v0}, LO7/K;->G(I)V

    .line 41
    .line 42
    .line 43
    :cond_5
    new-instance v1, LO7/K;

    .line 44
    .line 45
    invoke-virtual/range {p0 .. p0}, LM7/b;->getAnnotations()LM7/h;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual/range {p0 .. p0}, LO7/Y;->d0()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual/range {p0 .. p0}, LO7/K;->o0()Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    invoke-virtual/range {p0 .. p0}, LO7/K;->isConst()Z

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    invoke-virtual/range {p0 .. p0}, LO7/K;->J()Z

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    invoke-virtual/range {p0 .. p0}, LO7/K;->B0()Z

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    invoke-virtual/range {p0 .. p0}, LO7/K;->isExternal()Z

    .line 70
    .line 71
    .line 72
    move-result v15

    .line 73
    invoke-virtual/range {p0 .. p0}, LO7/K;->M()Z

    .line 74
    .line 75
    .line 76
    move-result v16

    .line 77
    move-object/from16 v2, p1

    .line 78
    .line 79
    move-object/from16 v5, p2

    .line 80
    .line 81
    move-object/from16 v6, p3

    .line 82
    .line 83
    move-object/from16 v3, p4

    .line 84
    .line 85
    move-object/from16 v9, p5

    .line 86
    .line 87
    move-object/from16 v8, p6

    .line 88
    .line 89
    move-object/from16 v10, p7

    .line 90
    .line 91
    invoke-direct/range {v1 .. v16}, LO7/K;-><init>(LL7/m;LL7/Z;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;LL7/h0;ZZZZZZ)V

    .line 92
    .line 93
    .line 94
    return-object v1
.end method

.method protected N0(LO7/K$a;)LL7/Z;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x1d

    .line 6
    .line 7
    invoke-static {v1}, LO7/K;->G(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static/range {p1 .. p1}, LO7/K$a;->b(LO7/K$a;)LL7/m;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static/range {p1 .. p1}, LO7/K$a;->f(LO7/K$a;)LL7/E;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static/range {p1 .. p1}, LO7/K$a;->g(LO7/K$a;)LL7/u;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static/range {p1 .. p1}, LO7/K$a;->h(LO7/K$a;)LL7/Z;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static/range {p1 .. p1}, LO7/K$a;->i(LO7/K$a;)LL7/b$a;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static/range {p1 .. p1}, LO7/K$a;->j(LO7/K$a;)Lk8/f;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-static/range {p1 .. p1}, LO7/K$a;->k(LO7/K$a;)Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-static/range {p1 .. p1}, LO7/K$a;->h(LO7/K$a;)LL7/Z;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-direct {v0, v7, v8}, LO7/K;->P0(ZLL7/Z;)LL7/h0;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual/range {v0 .. v7}, LO7/K;->M0(LL7/m;LL7/E;LL7/u;LL7/Z;LL7/b$a;Lk8/f;LL7/h0;)LO7/K;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-static/range {p1 .. p1}, LO7/K$a;->l(LO7/K$a;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, LO7/K;->getTypeParameters()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static/range {p1 .. p1}, LO7/K$a;->l(LO7/K$a;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_0
    new-instance v10, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, LO7/K$a;->m(LO7/K$a;)LC8/E0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v1, v2, v9, v10}, LC8/C;->b(Ljava/util/List;LC8/E0;LL7/m;Ljava/util/List;)LC8/G0;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static/range {p1 .. p1}, LO7/K$a;->c(LO7/K$a;)LC8/S;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sget-object v2, LC8/N0;->m:LC8/N0;

    .line 87
    .line 88
    invoke-virtual {v5, v1, v2}, LC8/G0;->p(LC8/S;LC8/N0;)LC8/S;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/16 v19, 0x0

    .line 93
    .line 94
    if-nez v2, :cond_2

    .line 95
    .line 96
    return-object v19

    .line 97
    :cond_2
    sget-object v3, LC8/N0;->l:LC8/N0;

    .line 98
    .line 99
    invoke-virtual {v5, v1, v3}, LC8/G0;->p(LC8/S;LC8/N0;)LC8/S;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    invoke-virtual {v9, v1}, LO7/K;->W0(LC8/S;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    invoke-static/range {p1 .. p1}, LO7/K$a;->d(LO7/K$a;)LL7/c0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-interface {v1, v5}, LL7/c0;->c(LC8/G0;)LL7/c0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-nez v1, :cond_4

    .line 119
    .line 120
    return-object v19

    .line 121
    :cond_4
    move-object v11, v1

    .line 122
    goto :goto_1

    .line 123
    :cond_5
    move-object/from16 v11, v19

    .line 124
    .line 125
    :goto_1
    iget-object v1, v0, LO7/K;->B:LL7/c0;

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    invoke-static {v5, v9, v1}, LO7/K;->b1(LC8/G0;LL7/Z;LL7/c0;)LL7/c0;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    move-object v12, v1

    .line 134
    goto :goto_2

    .line 135
    :cond_6
    move-object/from16 v12, v19

    .line 136
    .line 137
    :goto_2
    new-instance v13, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, LO7/K;->z:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_8

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, LL7/c0;

    .line 159
    .line 160
    invoke-static {v5, v9, v3}, LO7/K;->a1(LC8/G0;LL7/Z;LL7/c0;)LL7/c0;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    move-object v8, v9

    .line 171
    move-object v9, v2

    .line 172
    invoke-virtual/range {v8 .. v13}, LO7/K;->Y0(LC8/S;Ljava/util/List;LL7/c0;LL7/c0;Ljava/util/List;)V

    .line 173
    .line 174
    .line 175
    move-object v9, v8

    .line 176
    iget-object v1, v0, LO7/K;->D:LO7/L;

    .line 177
    .line 178
    if-nez v1, :cond_9

    .line 179
    .line 180
    move-object/from16 v1, v19

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_9
    new-instance v8, LO7/L;

    .line 184
    .line 185
    iget-object v1, v0, LO7/K;->D:LO7/L;

    .line 186
    .line 187
    invoke-virtual {v1}, LM7/b;->getAnnotations()LM7/h;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-static/range {p1 .. p1}, LO7/K$a;->f(LO7/K$a;)LL7/E;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    iget-object v1, v0, LO7/K;->D:LO7/L;

    .line 196
    .line 197
    invoke-virtual {v1}, LO7/J;->getVisibility()LL7/u;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static/range {p1 .. p1}, LO7/K$a;->i(LO7/K$a;)LL7/b$a;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v1, v2}, LO7/K;->V0(LL7/u;LL7/b$a;)LL7/u;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    iget-object v1, v0, LO7/K;->D:LO7/L;

    .line 210
    .line 211
    invoke-virtual {v1}, LO7/J;->S()Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    iget-object v1, v0, LO7/K;->D:LO7/L;

    .line 216
    .line 217
    invoke-virtual {v1}, LO7/J;->isExternal()Z

    .line 218
    .line 219
    .line 220
    move-result v14

    .line 221
    iget-object v1, v0, LO7/K;->D:LO7/L;

    .line 222
    .line 223
    invoke-virtual {v1}, LO7/J;->isInline()Z

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    invoke-static/range {p1 .. p1}, LO7/K$a;->i(LO7/K$a;)LL7/b$a;

    .line 228
    .line 229
    .line 230
    move-result-object v16

    .line 231
    invoke-virtual/range {p1 .. p1}, LO7/K$a;->o()LL7/a0;

    .line 232
    .line 233
    .line 234
    move-result-object v17

    .line 235
    sget-object v18, LL7/h0;->a:LL7/h0;

    .line 236
    .line 237
    invoke-direct/range {v8 .. v18}, LO7/L;-><init>(LL7/Z;LM7/h;LL7/E;LL7/u;ZZZLL7/b$a;LL7/a0;LL7/h0;)V

    .line 238
    .line 239
    .line 240
    move-object v1, v8

    .line 241
    :goto_4
    if-eqz v1, :cond_b

    .line 242
    .line 243
    iget-object v2, v0, LO7/K;->D:LO7/L;

    .line 244
    .line 245
    invoke-virtual {v2}, LO7/L;->getReturnType()LC8/S;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget-object v3, v0, LO7/K;->D:LO7/L;

    .line 250
    .line 251
    invoke-static {v5, v3}, LO7/K;->Q0(LC8/G0;LL7/Y;)LL7/z;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v1, v3}, LO7/J;->J0(LL7/z;)V

    .line 256
    .line 257
    .line 258
    if-eqz v2, :cond_a

    .line 259
    .line 260
    sget-object v3, LC8/N0;->m:LC8/N0;

    .line 261
    .line 262
    invoke-virtual {v5, v2, v3}, LC8/G0;->p(LC8/S;LC8/N0;)LC8/S;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    goto :goto_5

    .line 267
    :cond_a
    move-object/from16 v2, v19

    .line 268
    .line 269
    :goto_5
    invoke-virtual {v1, v2}, LO7/L;->M0(LC8/S;)V

    .line 270
    .line 271
    .line 272
    :cond_b
    iget-object v2, v0, LO7/K;->E:LL7/b0;

    .line 273
    .line 274
    if-nez v2, :cond_c

    .line 275
    .line 276
    move-object/from16 v3, v19

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_c
    new-instance v8, LO7/M;

    .line 280
    .line 281
    iget-object v2, v0, LO7/K;->E:LL7/b0;

    .line 282
    .line 283
    invoke-interface {v2}, LM7/a;->getAnnotations()LM7/h;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    invoke-static/range {p1 .. p1}, LO7/K$a;->f(LO7/K$a;)LL7/E;

    .line 288
    .line 289
    .line 290
    move-result-object v11

    .line 291
    iget-object v2, v0, LO7/K;->E:LL7/b0;

    .line 292
    .line 293
    invoke-interface {v2}, LL7/D;->getVisibility()LL7/u;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-static/range {p1 .. p1}, LO7/K$a;->i(LO7/K$a;)LL7/b$a;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-static {v2, v3}, LO7/K;->V0(LL7/u;LL7/b$a;)LL7/u;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    iget-object v2, v0, LO7/K;->E:LL7/b0;

    .line 306
    .line 307
    invoke-interface {v2}, LL7/Y;->S()Z

    .line 308
    .line 309
    .line 310
    move-result v13

    .line 311
    iget-object v2, v0, LO7/K;->E:LL7/b0;

    .line 312
    .line 313
    invoke-interface {v2}, LL7/D;->isExternal()Z

    .line 314
    .line 315
    .line 316
    move-result v14

    .line 317
    iget-object v2, v0, LO7/K;->E:LL7/b0;

    .line 318
    .line 319
    invoke-interface {v2}, LL7/z;->isInline()Z

    .line 320
    .line 321
    .line 322
    move-result v15

    .line 323
    invoke-static/range {p1 .. p1}, LO7/K$a;->i(LO7/K$a;)LL7/b$a;

    .line 324
    .line 325
    .line 326
    move-result-object v16

    .line 327
    invoke-virtual/range {p1 .. p1}, LO7/K$a;->p()LL7/b0;

    .line 328
    .line 329
    .line 330
    move-result-object v17

    .line 331
    sget-object v18, LL7/h0;->a:LL7/h0;

    .line 332
    .line 333
    invoke-direct/range {v8 .. v18}, LO7/M;-><init>(LL7/Z;LM7/h;LL7/E;LL7/u;ZZZLL7/b$a;LL7/b0;LL7/h0;)V

    .line 334
    .line 335
    .line 336
    move-object v3, v8

    .line 337
    :goto_6
    if-eqz v3, :cond_f

    .line 338
    .line 339
    iget-object v2, v0, LO7/K;->E:LL7/b0;

    .line 340
    .line 341
    invoke-interface {v2}, LL7/a;->i()Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    const/4 v7, 0x0

    .line 346
    const/4 v8, 0x0

    .line 347
    const/4 v6, 0x0

    .line 348
    invoke-static/range {v3 .. v8}, LO7/s;->M0(LL7/z;Ljava/util/List;LC8/G0;ZZ[Z)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const/4 v4, 0x0

    .line 353
    const/4 v6, 0x1

    .line 354
    if-nez v2, :cond_d

    .line 355
    .line 356
    invoke-virtual {v9, v6}, LO7/K;->X0(Z)V

    .line 357
    .line 358
    .line 359
    invoke-static/range {p1 .. p1}, LO7/K$a;->b(LO7/K$a;)LL7/m;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-static {v2}, Ls8/e;->m(LL7/m;)LI7/i;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v2}, LI7/i;->H()LC8/d0;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    iget-object v7, v0, LO7/K;->E:LL7/b0;

    .line 372
    .line 373
    invoke-interface {v7}, LL7/a;->i()Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    check-cast v7, LL7/t0;

    .line 382
    .line 383
    invoke-interface {v7}, LM7/a;->getAnnotations()LM7/h;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    invoke-static {v3, v2, v7}, LO7/M;->L0(LL7/b0;LC8/S;LM7/h;)LO7/V;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    :cond_d
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    if-ne v7, v6, :cond_e

    .line 400
    .line 401
    iget-object v6, v0, LO7/K;->E:LL7/b0;

    .line 402
    .line 403
    invoke-static {v5, v6}, LO7/K;->Q0(LC8/G0;LL7/Y;)LL7/z;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    invoke-virtual {v3, v6}, LO7/J;->J0(LL7/z;)V

    .line 408
    .line 409
    .line 410
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    check-cast v2, LL7/t0;

    .line 415
    .line 416
    invoke-virtual {v3, v2}, LO7/M;->N0(LL7/t0;)V

    .line 417
    .line 418
    .line 419
    goto :goto_7

    .line 420
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 421
    .line 422
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 423
    .line 424
    .line 425
    throw v1

    .line 426
    :cond_f
    :goto_7
    iget-object v2, v0, LO7/K;->G:LL7/w;

    .line 427
    .line 428
    if-nez v2, :cond_10

    .line 429
    .line 430
    move-object/from16 v4, v19

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_10
    new-instance v4, LO7/r;

    .line 434
    .line 435
    invoke-interface {v2}, LM7/a;->getAnnotations()LM7/h;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-direct {v4, v2, v9}, LO7/r;-><init>(LM7/h;LL7/Z;)V

    .line 440
    .line 441
    .line 442
    :goto_8
    iget-object v2, v0, LO7/K;->H:LL7/w;

    .line 443
    .line 444
    if-nez v2, :cond_11

    .line 445
    .line 446
    move-object/from16 v6, v19

    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_11
    new-instance v6, LO7/r;

    .line 450
    .line 451
    invoke-interface {v2}, LM7/a;->getAnnotations()LM7/h;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-direct {v6, v2, v9}, LO7/r;-><init>(LM7/h;LL7/Z;)V

    .line 456
    .line 457
    .line 458
    :goto_9
    invoke-virtual {v9, v1, v3, v4, v6}, LO7/K;->S0(LO7/L;LL7/b0;LL7/w;LL7/w;)V

    .line 459
    .line 460
    .line 461
    invoke-static/range {p1 .. p1}, LO7/K$a;->e(LO7/K$a;)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-eqz v1, :cond_13

    .line 466
    .line 467
    invoke-static {}, LM8/l;->o()LM8/l;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-virtual {v0}, LO7/K;->e()Ljava/util/Collection;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    if-eqz v3, :cond_12

    .line 484
    .line 485
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    check-cast v3, LL7/Z;

    .line 490
    .line 491
    invoke-interface {v3, v5}, LL7/Z;->c(LC8/G0;)LL7/Z;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    goto :goto_a

    .line 499
    :cond_12
    invoke-virtual {v9, v1}, LO7/K;->u0(Ljava/util/Collection;)V

    .line 500
    .line 501
    .line 502
    :cond_13
    invoke-virtual {v0}, LO7/K;->isConst()Z

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-eqz v1, :cond_14

    .line 507
    .line 508
    iget-object v1, v0, LO7/Y;->n:Lw7/a;

    .line 509
    .line 510
    if-eqz v1, :cond_14

    .line 511
    .line 512
    iget-object v2, v0, LO7/Y;->m:LB8/j;

    .line 513
    .line 514
    invoke-virtual {v9, v2, v1}, LO7/Y;->H0(LB8/j;Lw7/a;)V

    .line 515
    .line 516
    .line 517
    :cond_14
    return-object v9
.end method

.method public O0()LO7/L;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/K;->D:LO7/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public R0(LO7/L;LL7/b0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0, v0}, LO7/K;->S0(LO7/L;LL7/b0;LL7/w;LL7/w;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public S0(LO7/L;LL7/b0;LL7/w;LL7/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/K;->D:LO7/L;

    .line 2
    .line 3
    iput-object p2, p0, LO7/K;->E:LL7/b0;

    .line 4
    .line 5
    iput-object p3, p0, LO7/K;->G:LL7/w;

    .line 6
    .line 7
    iput-object p4, p0, LO7/K;->H:LL7/w;

    .line 8
    .line 9
    return-void
.end method

.method public T0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO7/K;->F:Z

    .line 2
    .line 3
    return v0
.end method

.method public U0()LO7/K$a;
    .locals 1

    .line 1
    new-instance v0, LO7/K$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LO7/K$a;-><init>(LO7/K;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public W0(LC8/S;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 p1, 0xe

    .line 4
    .line 5
    invoke-static {p1}, LO7/K;->G(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public X0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LO7/K;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method public Y0(LC8/S;Ljava/util/List;LL7/c0;LL7/c0;Ljava/util/List;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-static {v0}, LO7/K;->G(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x12

    .line 11
    .line 12
    invoke-static {v0}, LO7/K;->G(I)V

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
    invoke-static {v0}, LO7/K;->G(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    invoke-virtual {p0, p1}, LO7/X;->C0(LC8/S;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LO7/K;->C:Ljava/util/List;

    .line 31
    .line 32
    iput-object p4, p0, LO7/K;->B:LL7/c0;

    .line 33
    .line 34
    iput-object p3, p0, LO7/K;->A:LL7/c0;

    .line 35
    .line 36
    iput-object p5, p0, LO7/K;->z:Ljava/util/List;

    .line 37
    .line 38
    return-void
.end method

.method public Z0(LL7/u;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x14

    .line 4
    .line 5
    invoke-static {v0}, LO7/K;->G(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/K;->p:LL7/u;

    .line 9
    .line 10
    return-void
.end method

.method public a()LL7/Z;
    .locals 2

    .line 4
    iget-object v0, p0, LO7/K;->r:LL7/Z;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LL7/Z;->a()LL7/Z;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x26

    invoke-static {v1}, LO7/K;->G(I)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic a()LL7/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/K;->a()LL7/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LL7/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, LO7/K;->a()LL7/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LL7/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, LO7/K;->a()LL7/Z;

    move-result-object v0

    return-object v0
.end method

.method public a0()LL7/c0;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/K;->A:LL7/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(LC8/G0;)LL7/Z;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x1b

    invoke-static {v0}, LO7/K;->G(I)V

    .line 2
    :cond_0
    invoke-virtual {p1}, LC8/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 3
    :cond_1
    invoke-virtual {p0}, LO7/K;->U0()LO7/K$a;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, LC8/G0;->j()LC8/E0;

    move-result-object p1

    invoke-virtual {v0, p1}, LO7/K$a;->v(LC8/E0;)LO7/K$a;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, LO7/K;->a()LL7/Z;

    move-result-object v0

    invoke-virtual {p1, v0}, LO7/K$a;->t(LL7/b;)LO7/K$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, LO7/K$a;->n()LL7/Z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(LC8/G0;)LL7/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/K;->c(LC8/G0;)LL7/Z;

    move-result-object p1

    return-object p1
.end method

.method public e()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/K;->q:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/16 v1, 0x29

    .line 11
    .line 12
    invoke-static {v1}, LO7/K;->G(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-object v0
.end method

.method public g0(LL7/a$a;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public bridge synthetic getGetter()LL7/a0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/K;->O0()LO7/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getKind()LL7/b$a;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/K;->s:LL7/b$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x27

    .line 6
    .line 7
    invoke-static {v1}, LO7/K;->G(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public getReturnType()LC8/S;
    .locals 2

    .line 1
    invoke-virtual {p0}, LO7/X;->getType()LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    invoke-static {v1}, LO7/K;->G(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LO7/K;->C:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "typeParameters == null for "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public getVisibility()LL7/u;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/K;->p:LL7/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x19

    .line 6
    .line 7
    invoke-static {v1}, LO7/K;->G(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public h()LL7/b0;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/K;->E:LL7/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public h0()LL7/c0;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/K;->B:LL7/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public i0()LL7/w;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/K;->H:LL7/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public isConst()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO7/K;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO7/K;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public k()LL7/E;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/K;->o:LL7/E;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x18

    .line 6
    .line 7
    invoke-static {v1}, LO7/K;->G(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public l0()LL7/w;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/K;->G:LL7/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/K;->z:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x16

    .line 6
    .line 7
    invoke-static {v1}, LO7/K;->G(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public o0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LO7/K;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public u()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LO7/K;->D:LO7/L;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, LO7/K;->E:LL7/b0;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    return-object v0
.end method

.method public u0(Ljava/util/Collection;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x28

    .line 4
    .line 5
    invoke-static {v0}, LO7/K;->G(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/K;->q:Ljava/util/Collection;

    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic x(LL7/m;LL7/E;LL7/u;LL7/b$a;Z)LL7/b;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, LO7/K;->K0(LL7/m;LL7/E;LL7/u;LL7/b$a;Z)LL7/Z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic x0()LL7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/K;->a()LL7/Z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
