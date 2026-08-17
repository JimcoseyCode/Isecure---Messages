.class public final Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/FileSystemModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lw7/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "LR8/N;",
        "",
        "",
        "<destruct>",
        "<anonymous>",
        "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;",
        "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$4"
    f = "FileSystemModule.kt"
    l = {
        0x11b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ln7/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "[",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;

    invoke-direct {p1, p3}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;-><init>(Ln7/f;)V

    iput-object p2, p1, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ln7/f;

    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->invoke(LR8/N;[Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$5:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;

    .line 17
    .line 18
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$4:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Le9/B;

    .line 21
    .line 22
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$3:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Le9/z;

    .line 25
    .line 26
    iget-object v0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$2:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/net/URI;

    .line 29
    .line 30
    iget-object v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$1:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lexpo/modules/filesystem/FileSystemPath;

    .line 33
    .line 34
    iget-object v5, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Lexpo/modules/filesystem/DownloadOptions;

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, [Ljava/lang/Object;

    .line 57
    .line 58
    aget-object v1, p1, v3

    .line 59
    .line 60
    aget-object v5, p1, v4

    .line 61
    .line 62
    aget-object p1, p1, v2

    .line 63
    .line 64
    check-cast p1, Lexpo/modules/filesystem/DownloadOptions;

    .line 65
    .line 66
    check-cast v5, Lexpo/modules/filesystem/FileSystemPath;

    .line 67
    .line 68
    check-cast v1, Ljava/net/URI;

    .line 69
    .line 70
    sget-object v6, Lexpo/modules/kotlin/services/FilePermissionService$Permission;->WRITE:Lexpo/modules/kotlin/services/FilePermissionService$Permission;

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Lexpo/modules/filesystem/FileSystemPath;->validatePermission(Lexpo/modules/kotlin/services/FilePermissionService$Permission;)V

    .line 73
    .line 74
    .line 75
    new-instance v6, Le9/B$a;

    .line 76
    .line 77
    invoke-direct {v6}, Le9/B$a;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const-string v8, "toURL(...)"

    .line 85
    .line 86
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v7}, Le9/B$a;->n(Ljava/net/URL;)Le9/B$a;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    invoke-virtual {p1}, Lexpo/modules/filesystem/DownloadOptions;->getHeaders()Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    if-eqz v7, :cond_2

    .line 100
    .line 101
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_2

    .line 114
    .line 115
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    check-cast v8, Ljava/util/Map$Entry;

    .line 120
    .line 121
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    check-cast v9, Ljava/lang/String;

    .line 126
    .line 127
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    check-cast v8, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v6, v9, v8}, Le9/B$a;->a(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_2
    invoke-virtual {v6}, Le9/B$a;->b()Le9/B;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    new-instance v7, Le9/z;

    .line 142
    .line 143
    invoke-direct {v7}, Le9/z;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v5, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$1:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v1, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$2:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v7, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$3:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v6, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$4:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object p0, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->L$5:Ljava/lang/Object;

    .line 157
    .line 158
    iput v4, p0, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$$inlined$Coroutine$4;->label:I

    .line 159
    .line 160
    new-instance v8, LR8/o;

    .line 161
    .line 162
    invoke-static {p0}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    invoke-direct {v8, v9, v4}, LR8/o;-><init>(Ln7/f;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, LR8/o;->F()V

    .line 170
    .line 171
    .line 172
    new-instance v9, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$lambda$8$$inlined$await$1;

    .line 173
    .line 174
    invoke-direct {v9, v8}, Lexpo/modules/filesystem/FileSystemModule$definition$lambda$62$lambda$8$$inlined$await$1;-><init>(LR8/m;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7, v6}, Le9/z;->a(Le9/B;)Le9/e;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-interface {v6, v9}, Le9/e;->t0(Le9/f;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8}, LR8/o;->z()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    if-ne v6, v7, :cond_3

    .line 193
    .line 194
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 195
    .line 196
    .line 197
    :cond_3
    if-ne v6, v0, :cond_4

    .line 198
    .line 199
    return-object v0

    .line 200
    :cond_4
    move-object v0, v1

    .line 201
    move-object v1, v5

    .line 202
    move-object v5, p1

    .line 203
    move-object p1, v6

    .line 204
    :goto_1
    check-cast p1, Le9/D;

    .line 205
    .line 206
    invoke-virtual {p1}, Le9/D;->k0()Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-eqz v6, :cond_9

    .line 211
    .line 212
    invoke-virtual {p1}, Le9/D;->g0()Le9/t;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    const-string v7, "content-disposition"

    .line 217
    .line 218
    invoke-virtual {v6, v7}, Le9/t;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {p1}, Le9/D;->g0()Le9/t;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    const-string v8, "content-type"

    .line 227
    .line 228
    invoke-virtual {v7, v8}, Le9/t;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v0, v6, v7}, Landroid/webkit/URLUtil;->guessFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    instance-of v6, v1, Lexpo/modules/filesystem/FileSystemDirectory;

    .line 241
    .line 242
    if-eqz v6, :cond_5

    .line 243
    .line 244
    new-instance v6, Ljava/io/File;

    .line 245
    .line 246
    invoke-virtual {v1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-direct {v6, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_5
    invoke-virtual {v1}, Lexpo/modules/filesystem/FileSystemPath;->getJavaFile()Ljava/io/File;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    :goto_2
    if-eqz v5, :cond_6

    .line 259
    .line 260
    invoke-virtual {v5}, Lexpo/modules/filesystem/DownloadOptions;->getIdempotent()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-ne v0, v4, :cond_6

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_6
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_8

    .line 272
    .line 273
    :goto_3
    invoke-virtual {p1}, Le9/D;->r()Le9/E;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-eqz p1, :cond_7

    .line 278
    .line 279
    invoke-virtual {p1}, Le9/E;->byteStream()Ljava/io/InputStream;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 284
    .line 285
    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .line 287
    .line 288
    const/4 v1, 0x0

    .line 289
    :try_start_1
    invoke-static {p1, v0, v3, v2, v1}, Lt7/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    .line 291
    .line 292
    :try_start_2
    invoke-static {v0, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 293
    .line 294
    .line 295
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v6}, Ljava/io/File;->toURI()Ljava/net/URI;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    return-object p1

    .line 303
    :catchall_0
    move-exception v0

    .line 304
    goto :goto_4

    .line 305
    :catchall_1
    move-exception v1

    .line 306
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 307
    :catchall_2
    move-exception v2

    .line 308
    :try_start_4
    invoke-static {v0, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 312
    :goto_4
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 313
    :catchall_3
    move-exception v1

    .line 314
    invoke-static {p1, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    throw v1

    .line 318
    :cond_7
    new-instance p1, Lexpo/modules/filesystem/UnableToDownloadException;

    .line 319
    .line 320
    const-string v0, "response body is null"

    .line 321
    .line 322
    invoke-direct {p1, v0}, Lexpo/modules/filesystem/UnableToDownloadException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw p1

    .line 326
    :cond_8
    new-instance p1, Lexpo/modules/filesystem/DestinationAlreadyExistsException;

    .line 327
    .line 328
    invoke-direct {p1}, Lexpo/modules/filesystem/DestinationAlreadyExistsException;-><init>()V

    .line 329
    .line 330
    .line 331
    throw p1

    .line 332
    :cond_9
    new-instance v0, Lexpo/modules/filesystem/UnableToDownloadException;

    .line 333
    .line 334
    invoke-virtual {p1}, Le9/D;->I()I

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    new-instance v1, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    const-string v2, "response has status: "

    .line 344
    .line 345
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-direct {v0, p1}, Lexpo/modules/filesystem/UnableToDownloadException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v0
.end method
