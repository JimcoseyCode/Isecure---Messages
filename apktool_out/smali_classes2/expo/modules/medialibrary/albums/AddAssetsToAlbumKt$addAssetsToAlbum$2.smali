.class final Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt;->addAssetsToAlbum(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "",
        "<anonymous>",
        "(LR8/N;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.albums.AddAssetsToAlbumKt$addAssetsToAlbum$2"
    f = "AddAssetsToAlbum.kt"
    l = {
        0x1a,
        0x33
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $albumId:Ljava/lang/String;

.field final synthetic $assetIds:[Ljava/lang/String;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $copyToAlbum:Z

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(ZLandroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$copyToAlbum:Z

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$context:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$albumId:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$assetIds:[Ljava/lang/String;

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

.method public static synthetic c(Ljava/util/concurrent/atomic/AtomicInteger;LR8/w;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->invokeSuspend$lambda$1(Ljava/util/concurrent/atomic/AtomicInteger;LR8/w;Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final invokeSuspend$lambda$1(Ljava/util/concurrent/atomic/AtomicInteger;LR8/w;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-interface {p1, p0}, LR8/w;->l0(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
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
    new-instance v0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;

    .line 2
    .line 3
    iget-boolean v1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$copyToAlbum:Z

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$context:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$albumId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$assetIds:[Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;-><init>(ZLandroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-object v1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$1:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 30
    .line 31
    iget-object v4, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, LR8/N;

    .line 34
    .line 35
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v4, p1

    .line 45
    check-cast v4, LR8/N;

    .line 46
    .line 47
    iget-boolean p1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$copyToAlbum:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    sget-object p1, Lexpo/modules/medialibrary/albums/AssetFileStrategy;->Companion:Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;

    .line 52
    .line 53
    invoke-virtual {p1}, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->getCopyStrategy()Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_0
    move-object v1, p1

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-object p1, Lexpo/modules/medialibrary/albums/AssetFileStrategy;->Companion:Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;

    .line 60
    .line 61
    invoke-virtual {p1}, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->getMoveStrategy()Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    goto :goto_0

    .line 66
    :goto_1
    iget-object p1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$context:Landroid/content/Context;

    .line 67
    .line 68
    iget-object v5, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$albumId:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v4, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    iput v3, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->label:I

    .line 75
    .line 76
    invoke-static {p1, v5, p0}, Lexpo/modules/medialibrary/albums/AlbumUtilsKt;->getAlbumFile(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_4

    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_4
    :goto_2
    check-cast p1, Ljava/io/File;

    .line 85
    .line 86
    invoke-interface {v4}, LR8/N;->i()Ln7/j;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v5}, LR8/D0;->g(Ln7/j;)V

    .line 91
    .line 92
    .line 93
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 v6, 0x1e

    .line 96
    .line 97
    if-lt v5, v6, :cond_6

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/io/File;->canWrite()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    new-instance p1, Lexpo/modules/medialibrary/PermissionsException;

    .line 107
    .line 108
    const-string v0, "The application doesn\'t have permission to write to the album\'s directory. For more information, check out https://expo.fyi/android-r."

    .line 109
    .line 110
    invoke-direct {p1, v0}, Lexpo/modules/medialibrary/PermissionsException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_6
    :goto_3
    sget-object v5, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 115
    .line 116
    iget-object v6, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$context:Landroid/content/Context;

    .line 117
    .line 118
    iget-object v7, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$assetIds:[Ljava/lang/String;

    .line 119
    .line 120
    array-length v8, v7

    .line 121
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, [Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v5, v6, v7}, Lexpo/modules/medialibrary/MediaLibraryUtils;->getAssetsById(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-interface {v4}, LR8/N;->i()Ln7/j;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-static {v6}, LR8/D0;->g(Ln7/j;)V

    .line 136
    .line 137
    .line 138
    iget-object v6, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$context:Landroid/content/Context;

    .line 139
    .line 140
    new-instance v7, Ljava/util/ArrayList;

    .line 141
    .line 142
    const/16 v8, 0xa

    .line 143
    .line 144
    invoke-static {v5, v8}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_7

    .line 160
    .line 161
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    check-cast v8, Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;

    .line 166
    .line 167
    invoke-interface {v1, v8, p1, v6}, Lexpo/modules/medialibrary/albums/AssetFileStrategy;->apply(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_7
    invoke-interface {v4}, LR8/N;->i()Ln7/j;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {p1}, LR8/D0;->g(Ln7/j;)V

    .line 184
    .line 185
    .line 186
    const/4 p1, 0x0

    .line 187
    invoke-static {p1, v3, p1}, LR8/y;->b(LR8/A0;ILjava/lang/Object;)LR8/w;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 192
    .line 193
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 198
    .line 199
    .line 200
    iget-object v4, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->$context:Landroid/content/Context;

    .line 201
    .line 202
    const/4 v5, 0x0

    .line 203
    new-array v5, v5, [Ljava/lang/String;

    .line 204
    .line 205
    invoke-interface {v7, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    check-cast v5, [Ljava/lang/String;

    .line 210
    .line 211
    new-instance v6, Lexpo/modules/medialibrary/albums/a;

    .line 212
    .line 213
    invoke-direct {v6, v3, v1}, Lexpo/modules/medialibrary/albums/a;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;LR8/w;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v4, v5, p1, v6}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 217
    .line 218
    .line 219
    iput-object p1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$0:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object p1, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->L$1:Ljava/lang/Object;

    .line 222
    .line 223
    iput v2, p0, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->label:I

    .line 224
    .line 225
    invoke-interface {v1, p0}, LR8/V;->I(Ln7/f;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    if-ne p1, v0, :cond_8

    .line 230
    .line 231
    :goto_5
    return-object v0

    .line 232
    :cond_8
    return-object p1
.end method
