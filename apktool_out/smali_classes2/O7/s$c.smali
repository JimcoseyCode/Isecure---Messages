.class public LO7/s$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LL7/z$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field protected a:LC8/E0;

.field protected b:LL7/m;

.field protected c:LL7/E;

.field protected d:LL7/u;

.field protected e:LL7/z;

.field protected f:LL7/b$a;

.field protected g:Ljava/util/List;

.field protected h:Ljava/util/List;

.field protected i:LL7/c0;

.field protected j:LL7/c0;

.field protected k:LC8/S;

.field protected l:Lk8/f;

.field protected m:Z

.field protected n:Z

.field protected o:Z

.field protected p:Z

.field private q:Z

.field private r:Ljava/util/List;

.field private s:LM7/h;

.field private t:Z

.field private u:Ljava/util/Map;

.field private v:Ljava/lang/Boolean;

.field protected w:Z

.field final synthetic x:LO7/s;


# direct methods
.method public constructor <init>(LO7/s;LC8/E0;LL7/m;LL7/E;LL7/u;LL7/b$a;Ljava/util/List;Ljava/util/List;LL7/c0;LC8/S;Lk8/f;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    if-nez p3, :cond_1

    .line 9
    .line 10
    invoke-static {v1}, LO7/s$c;->u(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p4, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-static {v2}, LO7/s$c;->u(I)V

    .line 17
    .line 18
    .line 19
    :cond_2
    if-nez p5, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-static {v2}, LO7/s$c;->u(I)V

    .line 23
    .line 24
    .line 25
    :cond_3
    if-nez p6, :cond_4

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-static {v2}, LO7/s$c;->u(I)V

    .line 29
    .line 30
    .line 31
    :cond_4
    if-nez p7, :cond_5

    .line 32
    .line 33
    const/4 v2, 0x5

    .line 34
    invoke-static {v2}, LO7/s$c;->u(I)V

    .line 35
    .line 36
    .line 37
    :cond_5
    if-nez p8, :cond_6

    .line 38
    .line 39
    const/4 v2, 0x6

    .line 40
    invoke-static {v2}, LO7/s$c;->u(I)V

    .line 41
    .line 42
    .line 43
    :cond_6
    if-nez p10, :cond_7

    .line 44
    .line 45
    const/4 v2, 0x7

    .line 46
    invoke-static {v2}, LO7/s$c;->u(I)V

    .line 47
    .line 48
    .line 49
    :cond_7
    iput-object p1, p0, LO7/s$c;->x:LO7/s;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    iput-object v2, p0, LO7/s$c;->e:LL7/z;

    .line 56
    .line 57
    invoke-static {p1}, LO7/s;->C0(LO7/s;)LL7/c0;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iput-object v3, p0, LO7/s$c;->j:LL7/c0;

    .line 62
    .line 63
    iput-boolean v1, p0, LO7/s$c;->m:Z

    .line 64
    .line 65
    iput-boolean v0, p0, LO7/s$c;->n:Z

    .line 66
    .line 67
    iput-boolean v0, p0, LO7/s$c;->o:Z

    .line 68
    .line 69
    iput-boolean v0, p0, LO7/s$c;->p:Z

    .line 70
    .line 71
    invoke-virtual {p1}, LO7/s;->t0()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iput-boolean v1, p0, LO7/s$c;->q:Z

    .line 76
    .line 77
    iput-object v2, p0, LO7/s$c;->r:Ljava/util/List;

    .line 78
    .line 79
    iput-object v2, p0, LO7/s$c;->s:LM7/h;

    .line 80
    .line 81
    invoke-virtual {p1}, LO7/s;->z0()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput-boolean p1, p0, LO7/s$c;->t:Z

    .line 86
    .line 87
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, LO7/s$c;->u:Ljava/util/Map;

    .line 93
    .line 94
    iput-object v2, p0, LO7/s$c;->v:Ljava/lang/Boolean;

    .line 95
    .line 96
    iput-boolean v0, p0, LO7/s$c;->w:Z

    .line 97
    .line 98
    iput-object p2, p0, LO7/s$c;->a:LC8/E0;

    .line 99
    .line 100
    iput-object p3, p0, LO7/s$c;->b:LL7/m;

    .line 101
    .line 102
    iput-object p4, p0, LO7/s$c;->c:LL7/E;

    .line 103
    .line 104
    iput-object p5, p0, LO7/s$c;->d:LL7/u;

    .line 105
    .line 106
    iput-object p6, p0, LO7/s$c;->f:LL7/b$a;

    .line 107
    .line 108
    iput-object p7, p0, LO7/s$c;->g:Ljava/util/List;

    .line 109
    .line 110
    iput-object p8, p0, LO7/s$c;->h:Ljava/util/List;

    .line 111
    .line 112
    iput-object p9, p0, LO7/s$c;->i:LL7/c0;

    .line 113
    .line 114
    iput-object p10, p0, LO7/s$c;->k:LC8/S;

    .line 115
    .line 116
    iput-object p11, p0, LO7/s$c;->l:Lk8/f;

    .line 117
    .line 118
    return-void
.end method

.method static synthetic A(LO7/s$c;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, LO7/s$c;->u:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic u(I)V
    .locals 17

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    .line 8
    .line 9
    :goto_0
    const/4 v1, 0x2

    .line 10
    packed-switch p0, :pswitch_data_1

    .line 11
    .line 12
    .line 13
    :pswitch_2
    const/4 v2, 0x3

    .line 14
    goto :goto_1

    .line 15
    :pswitch_3
    move v2, v1

    .line 16
    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    packed-switch p0, :pswitch_data_2

    .line 22
    .line 23
    .line 24
    :pswitch_4
    const-string v5, "substitution"

    .line 25
    .line 26
    aput-object v5, v2, v4

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :pswitch_5
    const-string v5, "userDataKey"

    .line 30
    .line 31
    aput-object v5, v2, v4

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :pswitch_6
    const-string v5, "additionalAnnotations"

    .line 35
    .line 36
    aput-object v5, v2, v4

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :pswitch_7
    const-string v5, "contextReceiverParameters"

    .line 40
    .line 41
    aput-object v5, v2, v4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :pswitch_8
    const-string v5, "type"

    .line 45
    .line 46
    aput-object v5, v2, v4

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :pswitch_9
    const-string v5, "parameters"

    .line 50
    .line 51
    aput-object v5, v2, v4

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :pswitch_a
    const-string v5, "name"

    .line 55
    .line 56
    aput-object v5, v2, v4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :pswitch_b
    const-string v5, "visibility"

    .line 60
    .line 61
    aput-object v5, v2, v4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :pswitch_c
    const-string v5, "modality"

    .line 65
    .line 66
    aput-object v5, v2, v4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :pswitch_d
    aput-object v3, v2, v4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :pswitch_e
    const-string v5, "owner"

    .line 73
    .line 74
    aput-object v5, v2, v4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :pswitch_f
    const-string v5, "newReturnType"

    .line 78
    .line 79
    aput-object v5, v2, v4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :pswitch_10
    const-string v5, "newContextReceiverParameters"

    .line 83
    .line 84
    aput-object v5, v2, v4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :pswitch_11
    const-string v5, "newValueParameterDescriptors"

    .line 88
    .line 89
    aput-object v5, v2, v4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :pswitch_12
    const-string v5, "kind"

    .line 93
    .line 94
    aput-object v5, v2, v4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :pswitch_13
    const-string v5, "newVisibility"

    .line 98
    .line 99
    aput-object v5, v2, v4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :pswitch_14
    const-string v5, "newModality"

    .line 103
    .line 104
    aput-object v5, v2, v4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :pswitch_15
    const-string v5, "newOwner"

    .line 108
    .line 109
    aput-object v5, v2, v4

    .line 110
    .line 111
    :goto_2
    const-string v4, "setOwner"

    .line 112
    .line 113
    const-string v5, "setModality"

    .line 114
    .line 115
    const-string v6, "setVisibility"

    .line 116
    .line 117
    const-string v7, "setKind"

    .line 118
    .line 119
    const-string v8, "setName"

    .line 120
    .line 121
    const-string v9, "setValueParameters"

    .line 122
    .line 123
    const-string v10, "setTypeParameters"

    .line 124
    .line 125
    const-string v11, "setReturnType"

    .line 126
    .line 127
    const-string v12, "setContextReceiverParameters"

    .line 128
    .line 129
    const-string v13, "setAdditionalAnnotations"

    .line 130
    .line 131
    const-string v14, "setSubstitution"

    .line 132
    .line 133
    const-string v15, "putUserData"

    .line 134
    .line 135
    const/16 v16, 0x1

    .line 136
    .line 137
    packed-switch p0, :pswitch_data_3

    .line 138
    .line 139
    .line 140
    :pswitch_16
    aput-object v3, v2, v16

    .line 141
    .line 142
    goto/16 :goto_3

    .line 143
    .line 144
    :pswitch_17
    const-string v3, "setJustForTypeSubstitution"

    .line 145
    .line 146
    aput-object v3, v2, v16

    .line 147
    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :pswitch_18
    const-string v3, "getSubstitution"

    .line 151
    .line 152
    aput-object v3, v2, v16

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :pswitch_19
    aput-object v15, v2, v16

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :pswitch_1a
    aput-object v14, v2, v16

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :pswitch_1b
    aput-object v13, v2, v16

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :pswitch_1c
    const-string v3, "setHiddenForResolutionEverywhereBesideSupercalls"

    .line 165
    .line 166
    aput-object v3, v2, v16

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :pswitch_1d
    const-string v3, "setHiddenToOvercomeSignatureClash"

    .line 170
    .line 171
    aput-object v3, v2, v16

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :pswitch_1e
    const-string v3, "setDropOriginalInContainingParts"

    .line 175
    .line 176
    aput-object v3, v2, v16

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_1f
    const-string v3, "setPreserveSourceElement"

    .line 180
    .line 181
    aput-object v3, v2, v16

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :pswitch_20
    const-string v3, "setSignatureChange"

    .line 185
    .line 186
    aput-object v3, v2, v16

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :pswitch_21
    const-string v3, "setOriginal"

    .line 190
    .line 191
    aput-object v3, v2, v16

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :pswitch_22
    const-string v3, "setDispatchReceiverParameter"

    .line 195
    .line 196
    aput-object v3, v2, v16

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_23
    const-string v3, "setExtensionReceiverParameter"

    .line 200
    .line 201
    aput-object v3, v2, v16

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :pswitch_24
    aput-object v12, v2, v16

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :pswitch_25
    aput-object v11, v2, v16

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :pswitch_26
    aput-object v10, v2, v16

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :pswitch_27
    aput-object v9, v2, v16

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :pswitch_28
    aput-object v8, v2, v16

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :pswitch_29
    const-string v3, "setCopyOverrides"

    .line 220
    .line 221
    aput-object v3, v2, v16

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :pswitch_2a
    aput-object v7, v2, v16

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :pswitch_2b
    aput-object v6, v2, v16

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :pswitch_2c
    aput-object v5, v2, v16

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :pswitch_2d
    aput-object v4, v2, v16

    .line 234
    .line 235
    :goto_3
    packed-switch p0, :pswitch_data_4

    .line 236
    .line 237
    .line 238
    const-string v3, "<init>"

    .line 239
    .line 240
    aput-object v3, v2, v1

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :pswitch_2e
    aput-object v15, v2, v1

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :pswitch_2f
    aput-object v14, v2, v1

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :pswitch_30
    aput-object v13, v2, v1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :pswitch_31
    aput-object v12, v2, v1

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :pswitch_32
    aput-object v11, v2, v1

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :pswitch_33
    aput-object v10, v2, v1

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :pswitch_34
    aput-object v9, v2, v1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :pswitch_35
    aput-object v8, v2, v1

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :pswitch_36
    aput-object v7, v2, v1

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :pswitch_37
    aput-object v6, v2, v1

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_38
    aput-object v5, v2, v1

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :pswitch_39
    aput-object v4, v2, v1

    .line 277
    .line 278
    :goto_4
    :pswitch_3a
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    packed-switch p0, :pswitch_data_5

    .line 283
    .line 284
    .line 285
    :pswitch_3b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 286
    .line 287
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :pswitch_3c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :goto_5
    throw v1

    .line 297
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_d
        :pswitch_12
        :pswitch_d
        :pswitch_d
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_9
        :pswitch_d
        :pswitch_8
        :pswitch_d
        :pswitch_7
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_6
        :pswitch_d
        :pswitch_4
        :pswitch_d
        :pswitch_5
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_2d
        :pswitch_16
        :pswitch_2c
        :pswitch_16
        :pswitch_2b
        :pswitch_16
        :pswitch_2a
        :pswitch_29
        :pswitch_16
        :pswitch_28
        :pswitch_16
        :pswitch_27
        :pswitch_16
        :pswitch_26
        :pswitch_16
        :pswitch_25
        :pswitch_16
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_16
        :pswitch_1b
        :pswitch_16
        :pswitch_1a
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x8
        :pswitch_39
        :pswitch_3a
        :pswitch_38
        :pswitch_3a
        :pswitch_37
        :pswitch_3a
        :pswitch_36
        :pswitch_3a
        :pswitch_3a
        :pswitch_35
        :pswitch_3a
        :pswitch_34
        :pswitch_3a
        :pswitch_33
        :pswitch_3a
        :pswitch_32
        :pswitch_3a
        :pswitch_31
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_30
        :pswitch_3a
        :pswitch_2f
        :pswitch_3a
        :pswitch_2e
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3b
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
    .end packed-switch
.end method

.method static synthetic v(LO7/s$c;)LM7/h;
    .locals 0

    .line 1
    iget-object p0, p0, LO7/s$c;->s:LM7/h;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic w(LO7/s$c;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LO7/s$c;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic x(LO7/s$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LO7/s$c;->q:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic y(LO7/s$c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LO7/s$c;->t:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic z(LO7/s$c;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, LO7/s$c;->v:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public B(LM7/h;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x23

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->s:LM7/h;

    .line 9
    .line 10
    return-object p0
.end method

.method public C(Z)LO7/s$c;
    .locals 0

    .line 1
    iput-boolean p1, p0, LO7/s$c;->m:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public D(LL7/c0;)LO7/s$c;
    .locals 0

    .line 1
    iput-object p1, p0, LO7/s$c;->j:LL7/c0;

    .line 2
    .line 3
    return-object p0
.end method

.method public E()LO7/s$c;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LO7/s$c;->p:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public F(LL7/c0;)LO7/s$c;
    .locals 0

    .line 1
    iput-object p1, p0, LO7/s$c;->i:LL7/c0;

    .line 2
    .line 3
    return-object p0
.end method

.method public G(Z)LO7/s$c;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LO7/s$c;->v:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-object p0
.end method

.method public H()LO7/s$c;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LO7/s$c;->t:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public I()LO7/s$c;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LO7/s$c;->q:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public J(Z)LO7/s$c;
    .locals 0

    .line 1
    iput-boolean p1, p0, LO7/s$c;->w:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public K(LL7/b$a;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->f:LL7/b$a;

    .line 9
    .line 10
    return-object p0
.end method

.method public L(LL7/E;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->c:LL7/E;

    .line 9
    .line 10
    return-object p0
.end method

.method public M(Lk8/f;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->l:Lk8/f;

    .line 9
    .line 10
    return-object p0
.end method

.method public N(LL7/b;)LO7/s$c;
    .locals 0

    .line 1
    check-cast p1, LL7/z;

    .line 2
    .line 3
    iput-object p1, p0, LO7/s$c;->e:LL7/z;

    .line 4
    .line 5
    return-object p0
.end method

.method public O(LL7/m;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->b:LL7/m;

    .line 9
    .line 10
    return-object p0
.end method

.method public P()LO7/s$c;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LO7/s$c;->o:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public Q(LC8/S;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x17

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->k:LC8/S;

    .line 9
    .line 10
    return-object p0
.end method

.method public R()LO7/s$c;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LO7/s$c;->n:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public S(LC8/E0;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x25

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->a:LC8/E0;

    .line 9
    .line 10
    return-object p0
.end method

.method public T(Ljava/util/List;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x15

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->r:Ljava/util/List;

    .line 9
    .line 10
    return-object p0
.end method

.method public U(Ljava/util/List;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x13

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->g:Ljava/util/List;

    .line 9
    .line 10
    return-object p0
.end method

.method public V(LL7/u;)LO7/s$c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, LO7/s$c;->d:LL7/u;

    .line 9
    .line 10
    return-object p0
.end method

.method public bridge synthetic a()LL7/z$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/s$c;->E()LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic b(LL7/u;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->V(LL7/u;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public build()LL7/z;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/s$c;->x:LO7/s;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LO7/s;->J0(LO7/s$c;)LL7/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic c(LM7/h;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->B(LM7/h;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(Ljava/util/List;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->U(Ljava/util/List;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(LL7/a$a;Ljava/lang/Object;)LL7/z$a;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x27

    .line 4
    .line 5
    invoke-static {v0}, LO7/s$c;->u(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LO7/s$c;->u:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public bridge synthetic f(LC8/S;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->Q(LC8/S;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic g(LL7/c0;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->F(LL7/c0;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic h()LL7/z$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/s$c;->P()LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic i(LL7/b$a;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->K(LL7/b$a;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic j()LL7/z$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/s$c;->H()LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic k(Z)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->C(Z)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic l(Lk8/f;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->M(Lk8/f;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic m(LL7/m;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->O(LL7/m;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic n(Ljava/util/List;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->T(Ljava/util/List;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic o(LL7/c0;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->D(LL7/c0;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic p(LC8/E0;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->S(LC8/E0;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic q()LL7/z$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/s$c;->I()LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic r(LL7/b;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->N(LL7/b;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic s(LL7/E;)LL7/z$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/s$c;->L(LL7/E;)LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic t()LL7/z$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/s$c;->R()LO7/s$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
