.class public final Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000cH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u000cH\u0083@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J$\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018H\u0083@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ$\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018H\u0086@\u00a2\u0006\u0004\u0008\u001d\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010 R\u0014\u0010!\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "uri",
        "",
        "resolveWithAdditionalData",
        "Ljava/io/File;",
        "albumFile",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;ZLjava/io/File;)V",
        "Landroid/net/Uri;",
        "normalizeAssetUri",
        "(Ljava/lang/String;)Landroid/net/Uri;",
        "createContentResolverAssetEntry",
        "()Landroid/net/Uri;",
        "localFile",
        "assetUri",
        "",
        "writeFileContentsToAsset",
        "(Ljava/io/File;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;",
        "Ljava/util/ArrayList;",
        "Landroid/os/Bundle;",
        "Lkotlin/collections/ArrayList;",
        "createAssetUsingContentResolver",
        "(Ln7/f;)Ljava/lang/Object;",
        "createAssetFileLegacy",
        "(Ljava/io/File;)Ljava/io/File;",
        "execute",
        "Landroid/content/Context;",
        "Z",
        "Ljava/io/File;",
        "mUri",
        "Landroid/net/Uri;",
        "isFileExtensionPresent",
        "()Z",
        "expo-media-library_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final albumFile:Ljava/io/File;

.field private final context:Landroid/content/Context;

.field private final mUri:Landroid/net/Uri;

.field private final resolveWithAdditionalData:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLjava/io/File;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->context:Landroid/content/Context;

    .line 3
    iput-boolean p3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->resolveWithAdditionalData:Z

    .line 4
    iput-object p4, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->albumFile:Ljava/io/File;

    .line 5
    invoke-direct {p0, p2}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->normalizeAssetUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->mUri:Landroid/net/Uri;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLjava/io/File;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x1

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/io/File;)V

    return-void
.end method

.method public static final synthetic access$createAssetUsingContentResolver(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->createAssetUsingContentResolver(Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$createContentResolverAssetEntry(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Landroid/net/Uri;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->createContentResolverAssetEntry()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMUri$p(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->mUri:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getResolveWithAdditionalData$p(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->resolveWithAdditionalData:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$writeFileContentsToAsset(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ljava/io/File;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->writeFileContentsToAsset(Ljava/io/File;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final createAssetFileLegacy(Ljava/io/File;)Ljava/io/File;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->mUri:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 16
    .line 17
    iget-object v2, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->context:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "getContentResolver(...)"

    .line 24
    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->mUri:Landroid/net/Uri;

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Lexpo/modules/medialibrary/MediaLibraryUtils;->getMimeType(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    invoke-virtual {v1, v2, p1}, Lexpo/modules/medialibrary/MediaLibraryUtils;->getEnvDirectoryForAssetType(Ljava/lang/String;Z)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_0
    invoke-virtual {v1, v0, p1}, Lexpo/modules/medialibrary/MediaLibraryUtils;->safeCopyFile(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    new-instance p1, Lexpo/modules/medialibrary/AssetFileException;

    .line 61
    .line 62
    const-string v0, "Could not create asset record. Related file does not exist."

    .line 63
    .line 64
    invoke-direct {p1, v0}, Lexpo/modules/medialibrary/AssetFileException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    new-instance p1, Lexpo/modules/medialibrary/AssetFileException;

    .line 69
    .line 70
    const-string v0, "Could not guess file type."

    .line 71
    .line 72
    invoke-direct {p1, v0}, Lexpo/modules/medialibrary/AssetFileException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method

.method static synthetic createAssetFileLegacy$default(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ljava/io/File;ILjava/lang/Object;)Ljava/io/File;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->createAssetFileLegacy(Ljava/io/File;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final createAssetUsingContentResolver(Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$createAssetUsingContentResolver$2;-><init>(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private final createContentResolverAssetEntry()Landroid/net/Uri;
    .locals 8

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->context:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->mUri:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {v1, v0, v2}, Lexpo/modules/medialibrary/MediaLibraryUtils;->getMimeType(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->mUri:Landroid/net/Uri;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->albumFile:Ljava/io/File;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const-string v7, "getExternalStorageDirectory(...)"

    .line 34
    .line 35
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v4, v6}, Lt7/j;->B(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    :cond_0
    invoke-virtual {v1, v2, v5}, Lexpo/modules/medialibrary/MediaLibraryUtils;->getRelativePathForAssetType(Ljava/lang/String;Z)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :cond_1
    invoke-virtual {v1, v2}, Lexpo/modules/medialibrary/MediaLibraryUtils;->mimeTypeToExternalUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v6, Landroid/content/ContentValues;

    .line 59
    .line 60
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v7, "_display_name"

    .line 64
    .line 65
    invoke-virtual {v6, v7, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v3, "mime_type"

    .line 69
    .line 70
    invoke-virtual {v6, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v2, "relative_path"

    .line 74
    .line 75
    invoke-virtual {v6, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v2, "is_pending"

    .line 79
    .line 80
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v6, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1, v6}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0
.end method

.method private final isFileExtensionPresent()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->mUri:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x0

    .line 12
    const-string v4, "."

    .line 13
    .line 14
    invoke-static {v0, v4, v1, v2, v3}, LP8/q;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    return v1
.end method

.method private final normalizeAssetUri(Ljava/lang/String;)Landroid/net/Uri;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "/"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {p1, v2, v3, v0, v1}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/io/File;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method private final writeFileContentsToAsset(Ljava/io/File;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$writeFileContentsToAsset$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$writeFileContentsToAsset$2;-><init>(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ljava/io/File;Landroid/net/Uri;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method


# virtual methods
.method public final execute(Ln7/f;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;-><init>(Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_1

    .line 40
    .line 41
    if-eq v2, v5, :cond_3

    .line 42
    .line 43
    if-ne v2, v4, :cond_2

    .line 44
    .line 45
    :cond_1
    :try_start_0
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :catch_1
    move-exception p1

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :catch_2
    move-exception p1

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_3
    :try_start_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->isFileExtensionPresent()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_b

    .line 78
    .line 79
    :try_start_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 80
    .line 81
    const/16 v2, 0x1e

    .line 82
    .line 83
    if-lt p1, v2, :cond_6

    .line 84
    .line 85
    iput v6, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;->label:I

    .line 86
    .line 87
    invoke-direct {p0, v0}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->createAssetUsingContentResolver(Ln7/f;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v1, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    return-object p1

    .line 95
    :cond_6
    iget-object p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->albumFile:Ljava/io/File;

    .line 96
    .line 97
    invoke-direct {p0, p1}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->createAssetFileLegacy(Ljava/io/File;)Ljava/io/File;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {v0}, Ln7/f;->getContext()Ln7/j;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v2}, LR8/D0;->g(Ln7/j;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 109
    .line 110
    iget-object v6, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->context:Landroid/content/Context;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    filled-new-array {p1}, [Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput v5, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;->label:I

    .line 121
    .line 122
    invoke-virtual {v2, v6, p1, v3, v0}, Lexpo/modules/medialibrary/MediaLibraryUtils;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v1, :cond_7

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    :goto_1
    check-cast p1, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Landroid/net/Uri;

    .line 142
    .line 143
    invoke-interface {v0}, Ln7/f;->getContext()Ln7/j;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-static {v5}, LR8/D0;->g(Ln7/j;)V

    .line 148
    .line 149
    .line 150
    if-eqz p1, :cond_a

    .line 151
    .line 152
    iget-boolean p1, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->resolveWithAdditionalData:Z

    .line 153
    .line 154
    if-eqz p1, :cond_9

    .line 155
    .line 156
    const-string p1, "_data=?"

    .line 157
    .line 158
    filled-new-array {v2}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iget-object v3, p0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->context:Landroid/content/Context;

    .line 163
    .line 164
    iput v4, v0, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile$execute$1;->label:I

    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    invoke-static {v3, p1, v2, v4, v0}, Lexpo/modules/medialibrary/assets/AssetUtilsKt;->queryAssetInfo(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-ne p1, v1, :cond_8

    .line 172
    .line 173
    :goto_2
    return-object v1

    .line 174
    :cond_8
    return-object p1

    .line 175
    :cond_9
    return-object v3

    .line 176
    :cond_a
    new-instance p1, Lexpo/modules/medialibrary/AssetException;

    .line 177
    .line 178
    invoke-direct {p1}, Lexpo/modules/medialibrary/AssetException;-><init>()V

    .line 179
    .line 180
    .line 181
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 182
    :goto_3
    new-instance v0, Lexpo/modules/medialibrary/UnableToSaveException;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v3, "Could not create asset: "

    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-direct {v0, v1, p1}, Lexpo/modules/medialibrary/UnableToSaveException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :goto_4
    new-instance v0, Lexpo/modules/medialibrary/UnableToLoadPermissionException;

    .line 210
    .line 211
    const-string v1, "Could not get asset: need READ_EXTERNAL_STORAGE permission"

    .line 212
    .line 213
    invoke-direct {v0, v1, p1}, Lexpo/modules/medialibrary/UnableToLoadPermissionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    throw v0

    .line 217
    :goto_5
    new-instance v0, Ljava/io/IOException;

    .line 218
    .line 219
    const-string v1, "Unable to copy file into external storage."

    .line 220
    .line 221
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw v0

    .line 225
    :cond_b
    new-instance p1, Lexpo/modules/medialibrary/AssetFileException;

    .line 226
    .line 227
    const-string v0, "Could not get the file\'s extension."

    .line 228
    .line 229
    invoke-direct {p1, v0}, Lexpo/modules/medialibrary/AssetFileException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p1
.end method
