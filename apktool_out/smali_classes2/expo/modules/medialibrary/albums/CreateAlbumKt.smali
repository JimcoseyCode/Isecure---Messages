.class public final Lexpo/modules/medialibrary/albums/CreateAlbumKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a2\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a*\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "albumName",
        "assetId",
        "",
        "copyAsset",
        "Landroid/os/Bundle;",
        "createAlbum",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "assetUri",
        "createAlbumWithInitialFileUri",
        "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;",
        "expo-media-library_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final createAlbum(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move-object v5, p1

    .line 10
    move-object v4, p2

    .line 11
    move v2, p3

    .line 12
    invoke-direct/range {v1 .. v6}, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbum$2;-><init>(ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p4}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final createAlbumWithInitialFileUri(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;-><init>(Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object p3

    .line 45
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_2
    iget-object p0, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    move-object p1, p0

    .line 56
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    iget-object p0, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object p3, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v5, "getContentResolver(...)"

    .line 76
    .line 77
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3, v2, p2}, Lexpo/modules/medialibrary/MediaLibraryUtils;->getMimeType(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    const-string v2, "`."

    .line 85
    .line 86
    if-eqz p3, :cond_8

    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_7

    .line 93
    .line 94
    invoke-static {p3, p1}, Lexpo/modules/medialibrary/albums/AlbumUtilsKt;->createAlbumFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    new-instance v2, Ljava/io/File;

    .line 99
    .line 100
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    new-instance v2, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 110
    .line 111
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const-string v5, "toString(...)"

    .line 116
    .line 117
    invoke-static {p2, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v5, 0x0

    .line 121
    invoke-direct {v2, p0, p2, v5, p3}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/io/File;)V

    .line 122
    .line 123
    .line 124
    iput-object p0, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object p1, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->L$1:Ljava/lang/Object;

    .line 127
    .line 128
    iput v4, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->label:I

    .line 129
    .line 130
    invoke-virtual {v2, v0}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->execute(Ln7/f;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-ne p2, v1, :cond_4

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    :goto_1
    const/4 p2, 0x0

    .line 138
    iput-object p2, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->L$0:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object p2, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->L$1:Ljava/lang/Object;

    .line 141
    .line 142
    iput v3, v0, Lexpo/modules/medialibrary/albums/CreateAlbumKt$createAlbumWithInitialFileUri$1;->label:I

    .line 143
    .line 144
    invoke-static {p0, p1, v0}, Lexpo/modules/medialibrary/albums/GetAlbumKt;->getAlbum(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v1, :cond_5

    .line 149
    .line 150
    :goto_2
    return-object v1

    .line 151
    :cond_5
    return-object p0

    .line 152
    :cond_6
    new-instance p0, Lexpo/modules/medialibrary/AlbumException;

    .line 153
    .line 154
    new-instance p1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string p3, "Failed to create album: the local media file with uri: `"

    .line 160
    .line 161
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p2, "` does not exist."

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {p0, p1}, Lexpo/modules/medialibrary/AlbumException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_7
    new-instance p0, Lexpo/modules/medialibrary/AlbumException;

    .line 181
    .line 182
    new-instance p1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string p3, "Failed to create album: could not determine path of the asset with uri: `"

    .line 188
    .line 189
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-direct {p0, p1}, Lexpo/modules/medialibrary/AlbumException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p0

    .line 206
    :cond_8
    new-instance p0, Lexpo/modules/medialibrary/AlbumException;

    .line 207
    .line 208
    new-instance p1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    const-string p3, "Failed to create album: could not determine MIME type of the asset with uri: `"

    .line 214
    .line 215
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-direct {p0, p1}, Lexpo/modules/medialibrary/AlbumException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p0
.end method
