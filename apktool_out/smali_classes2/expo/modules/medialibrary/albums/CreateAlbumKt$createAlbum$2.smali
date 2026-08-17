.class final Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/albums/CreateAlbumKt;->createAlbum(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Landroid/os/Bundle;",
        "<anonymous>",
        "(LR8/N;)Landroid/os/Bundle;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.albums.CreateAlbumKt$createAlbum$2"
    f = "CreateAlbum.kt"
    l = {
        0x20,
        0x27
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $albumName:Ljava/lang/String;

.field final synthetic $assetId:Ljava/lang/String;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $copyAsset:Z

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$copyAsset:Z

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$context:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$assetId:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$albumName:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;

    .line 2
    .line 3
    iget-boolean v1, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$copyAsset:Z

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$context:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$assetId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$albumName:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;-><init>(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :catch_0
    move-exception p1

    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :catch_1
    move-exception p1

    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v1, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, LR8/N;

    .line 38
    .line 39
    :try_start_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    check-cast v1, LR8/N;

    .line 50
    .line 51
    :try_start_2
    iget-boolean p1, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$copyAsset:Z

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    sget-object p1, Lexpo/modules/medialibrary/albums/AssetFileStrategy;->Companion:Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;

    .line 56
    .line 57
    invoke-virtual {p1}, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->getCopyStrategy()Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    sget-object p1, Lexpo/modules/medialibrary/albums/AssetFileStrategy;->Companion:Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;

    .line 63
    .line 64
    invoke-virtual {p1}, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->getMoveStrategy()Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :goto_0
    sget-object v5, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 69
    .line 70
    iget-object v6, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$context:Landroid/content/Context;

    .line 71
    .line 72
    iget-object v7, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$assetId:Ljava/lang/String;

    .line 73
    .line 74
    filled-new-array {v7}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v5, v6, v7}, Lexpo/modules/medialibrary/MediaLibraryUtils;->getAssetsById(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const/4 v7, 0x0

    .line 83
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;

    .line 88
    .line 89
    invoke-virtual {v6}, Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;->getMimeType()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    iget-object v8, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$albumName:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v7, v8}, Lexpo/modules/medialibrary/albums/AlbumUtilsKt;->createAlbumFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    iget-object v8, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$context:Landroid/content/Context;

    .line 100
    .line 101
    invoke-interface {p1, v6, v7, v8}, Lexpo/modules/medialibrary/albums/AssetFileStrategy;->apply(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {v1}, LR8/N;->i()Ln7/j;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-static {v6}, LR8/D0;->g(Ln7/j;)V

    .line 110
    .line 111
    .line 112
    iget-object v6, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$context:Landroid/content/Context;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    filled-new-array {p1}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object v1, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    iput v4, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->label:I

    .line 125
    .line 126
    invoke-virtual {v5, v6, p1, v2, p0}, Lexpo/modules/medialibrary/MediaLibraryUtils;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_4

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    :goto_1
    check-cast p1, Lkotlin/Pair;

    .line 134
    .line 135
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Landroid/net/Uri;

    .line 146
    .line 147
    invoke-interface {v1}, LR8/N;->i()Ln7/j;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, LR8/D0;->g(Ln7/j;)V

    .line 152
    .line 153
    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    const-string p1, "_data=?"

    .line 157
    .line 158
    filled-new-array {v4}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v4, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->$context:Landroid/content/Context;

    .line 163
    .line 164
    iput-object v2, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->L$0:Ljava/lang/Object;

    .line 165
    .line 166
    iput v3, p0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;->label:I

    .line 167
    .line 168
    invoke-static {v4, p1, v1, p0}, Lexpo/modules/medialibrary/albums/AlbumUtilsKt;->queryAlbum(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-ne p1, v0, :cond_5

    .line 173
    .line 174
    :goto_2
    return-object v0

    .line 175
    :cond_5
    :goto_3
    check-cast p1, Landroid/os/Bundle;

    .line 176
    .line 177
    return-object p1

    .line 178
    :cond_6
    new-instance p1, Lexpo/modules/medialibrary/AlbumException;

    .line 179
    .line 180
    const-string v0, "Could not add image to album."

    .line 181
    .line 182
    invoke-direct {p1, v0}, Lexpo/modules/medialibrary/AlbumException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p1
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 186
    :goto_4
    new-instance v0, Lexpo/modules/medialibrary/UnableToLoadException;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v3, "Could not read file or parse EXIF tags: "

    .line 198
    .line 199
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-direct {v0, v1, p1}, Lexpo/modules/medialibrary/UnableToLoadException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :goto_5
    new-instance v0, Lexpo/modules/medialibrary/UnableToLoadException;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    new-instance v2, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string v3, "Could not create album: need WRITE_EXTERNAL_STORAGE permission: "

    .line 225
    .line 226
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-direct {v0, v1, p1}, Lexpo/modules/medialibrary/UnableToLoadException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    throw v0
.end method
