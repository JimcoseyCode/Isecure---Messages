.class public final Lexpo/modules/medialibrary/next/MediaLibraryNextModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\'\u001a\u00020(H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\u0008\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\r\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\r\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\r\u001a\u0004\u0008\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\r\u001a\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/MediaLibraryNextModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "systemPermissionsDelegate",
        "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;",
        "getSystemPermissionsDelegate",
        "()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;",
        "systemPermissionsDelegate$delegate",
        "Lkotlin/Lazy;",
        "mediaStorePermissionsDelegate",
        "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;",
        "getMediaStorePermissionsDelegate",
        "()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;",
        "mediaStorePermissionsDelegate$delegate",
        "albumQuery",
        "Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;",
        "getAlbumQuery",
        "()Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;",
        "albumQuery$delegate",
        "albumFactory",
        "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;",
        "getAlbumFactory",
        "()Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;",
        "albumFactory$delegate",
        "assetFactory",
        "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;",
        "getAssetFactory",
        "()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;",
        "assetFactory$delegate",
        "assetDeleter",
        "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "getAssetDeleter",
        "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "assetDeleter$delegate",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
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
.field private final albumFactory$delegate:Lkotlin/Lazy;

.field private final albumQuery$delegate:Lkotlin/Lazy;

.field private final assetDeleter$delegate:Lkotlin/Lazy;

.field private final assetFactory$delegate:Lkotlin/Lazy;

.field private final mediaStorePermissionsDelegate$delegate:Lkotlin/Lazy;

.field private final systemPermissionsDelegate$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/medialibrary/next/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/a;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->systemPermissionsDelegate$delegate:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, Lexpo/modules/medialibrary/next/b;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/b;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->mediaStorePermissionsDelegate$delegate:Lkotlin/Lazy;

    .line 25
    .line 26
    new-instance v0, Lexpo/modules/medialibrary/next/c;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/c;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->albumQuery$delegate:Lkotlin/Lazy;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/medialibrary/next/d;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/d;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->albumFactory$delegate:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Lexpo/modules/medialibrary/next/e;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/e;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->assetFactory$delegate:Lkotlin/Lazy;

    .line 58
    .line 59
    new-instance v0, Lexpo/modules/medialibrary/next/f;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/f;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->assetDeleter$delegate:Lkotlin/Lazy;

    .line 69
    .line 70
    return-void
.end method

.method public static final synthetic access$getAlbumFactory(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAlbumFactory()Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getAlbumQuery(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAlbumQuery()Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getAssetDeleter(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getAssetFactory(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetFactory()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContext(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getMediaStorePermissionsDelegate(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getMediaStorePermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getSystemPermissionsDelegate(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getSystemPermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final albumFactory_delegate$lambda$3(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;

    .line 8
    .line 9
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetFactory()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getMediaStorePermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, v1, v2, v3, p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;-><init>(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;

    .line 30
    .line 31
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetFactory()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, v1, v2, p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;-><init>(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method private static final albumQuery_delegate$lambda$2(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAlbumFactory()Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, v1, p0}, Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;-><init>(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private static final assetDeleter_delegate$lambda$5(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetModernDeleter;

    .line 8
    .line 9
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getMediaStorePermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetModernDeleter;-><init>(Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;

    .line 18
    .line 19
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getSystemPermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, v1, p0}, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetLegacyDeleter;-><init>(Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method private static final assetFactory_delegate$lambda$4(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 8
    .line 9
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getMediaStorePermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, v1, v2, p0}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;-><init>(Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetLegacyFactory;

    .line 26
    .line 27
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getSystemPermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, v1, v2, p0}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetLegacyFactory;-><init>(Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static synthetic b(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->albumFactory_delegate$lambda$3(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->mediaStorePermissionsDelegate_delegate$lambda$1(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->assetFactory_delegate$lambda$4(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->assetDeleter_delegate$lambda$5(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->albumQuery_delegate$lambda$2(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->systemPermissionsDelegate_delegate$lambda$0(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getAlbumFactory()Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->albumFactory$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getAlbumQuery()Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->albumQuery$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->assetDeleter$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getAssetFactory()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->assetFactory$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    .line 13
    .line 14
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final getMediaStorePermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->mediaStorePermissionsDelegate$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getSystemPermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->systemPermissionsDelegate$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final mediaStorePermissionsDelegate_delegate$lambda$1(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;-><init>(Lexpo/modules/kotlin/AppContext;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final systemPermissionsDelegate_delegate$lambda$0(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;-><init>(Lexpo/modules/kotlin/AppContext;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 41

    move-object/from16 v1, p0

    .line 1
    const-string v0, "delete"

    const-string v2, "get"

    const-string v3, "id"

    const-string v4, "constructor"

    const-string v5, "getSimpleName(...)"

    const-class v6, Ljava/lang/Integer;

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lexpo/modules/kotlin/types/Either;

    const-class v9, Landroid/net/Uri;

    const-class v10, Ljava/lang/Long;

    const-class v11, Ljava/lang/String;

    const-class v12, Ljava/lang/Object;

    const-class v13, Ljava/util/List;

    const-class v14, Lexpo/modules/medialibrary/next/records/AssetField;

    const-class v15, Lexpo/modules/medialibrary/next/objects/album/Album;

    const-class v16, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    const-class v17, Lexpo/modules/medialibrary/next/objects/query/Query;

    move-object/from16 v18, v6

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    move-object/from16 v19, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ".ModuleDefinition"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v8

    const-string v8, "["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "ExpoModulesCore"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "] "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 4
    invoke-static {v6}, Ll1/a;->c(Ljava/lang/String;)V

    .line 5
    :try_start_0
    new-instance v6, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    invoke-direct {v6, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 6
    const-string v7, "ExpoMediaLibraryNext"

    invoke-virtual {v6, v7}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 7
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v24

    .line 8
    new-instance v21, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 9
    invoke-virtual {v6}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v8, "Required value was null."

    if-eqz v7, :cond_4f

    :try_start_1
    invoke-virtual {v7}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v22

    .line 10
    invoke-static/range {v24 .. v24}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    sget-object v27, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    move-object/from16 v23, v7

    .line 12
    new-instance v7, Lkotlin/Pair;

    move-object/from16 v28, v9

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    move-object/from16 v29, v10

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v7, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_0

    .line 14
    sget-object v7, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Class$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Class$1;

    .line 15
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v30, v11

    .line 16
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v31, v12

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    move-object/from16 v32, v13

    const/4 v13, 0x0

    invoke-direct {v11, v12, v13, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v7, 0x0

    .line 17
    invoke-direct {v9, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v9

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    move-object/from16 v30, v11

    move-object/from16 v31, v12

    move-object/from16 v32, v13

    move-object/from16 v25, v7

    .line 18
    :goto_0
    invoke-virtual {v6}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v26

    .line 19
    invoke-direct/range {v21 .. v26}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v7, v21

    .line 20
    new-instance v9, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v11

    .line 21
    new-instance v12, Lkotlin/Pair;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v12, v13, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    if-nez v12, :cond_1

    .line 23
    sget-object v12, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Constructor$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Constructor$1;

    .line 24
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v21, v14

    .line 25
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v22, v15

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    move-object/from16 v23, v8

    const/4 v8, 0x0

    invoke-direct {v14, v15, v8, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 26
    invoke-direct {v13, v14, v11}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v12, v13

    goto :goto_1

    :cond_1
    move-object/from16 v23, v8

    move-object/from16 v21, v14

    move-object/from16 v22, v15

    .line 27
    :goto_1
    filled-new-array {v12}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v8

    .line 28
    sget-object v11, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 29
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v12

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v12, :cond_2

    new-instance v12, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v12, v13}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 30
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v13

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    :cond_2
    new-instance v13, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Constructor$2;

    invoke-direct {v13, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Constructor$2;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 32
    invoke-direct {v9, v4, v8, v12, v13}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 33
    invoke-virtual {v7, v9}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 34
    new-instance v8, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual {v7}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v9

    invoke-direct {v8, v9, v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 35
    new-instance v9, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v8}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v13

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v14, v15}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v12}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v12

    .line 36
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v13

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    invoke-interface {v13, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v13, :cond_3

    new-instance v13, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    invoke-direct {v13, v15}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 37
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v15

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v15, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_3
    new-instance v14, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Property$1;

    invoke-direct {v14}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Property$1;-><init>()V

    .line 39
    invoke-direct {v9, v2, v12, v13, v14}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 40
    invoke-virtual {v8}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v12

    invoke-virtual {v9, v12}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v12, 0x1

    .line 41
    invoke-virtual {v9, v12}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 42
    invoke-virtual {v8, v9}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 43
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    const-string v8, "getCreationTime"

    invoke-virtual {v7, v8}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v8

    .line 45
    new-instance v9, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v8}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v14

    .line 46
    new-instance v15, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v15, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    if-nez v12, :cond_4

    .line 48
    sget-object v12, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$1;

    .line 49
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v26, v11

    .line 50
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v33, v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    move-object/from16 v34, v2

    const/4 v2, 0x0

    invoke-direct {v11, v6, v2, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 51
    invoke-direct {v15, v11, v14}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v12, v15

    goto :goto_2

    :cond_4
    move-object/from16 v34, v2

    move-object/from16 v33, v6

    move-object/from16 v26, v11

    .line 52
    :goto_2
    filled-new-array {v12}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 53
    new-instance v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$2;

    const/4 v15, 0x0

    invoke-direct {v6, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$2;-><init>(Ln7/f;)V

    .line 54
    invoke-direct {v9, v13, v2, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 55
    invoke-virtual {v8, v9}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 56
    const-string v2, "getDuration"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 57
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 58
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_5

    .line 60
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$3;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$3;

    .line 61
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 62
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 63
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 64
    :cond_5
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 65
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$4;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$4;-><init>(Ln7/f;)V

    .line 66
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 67
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 68
    const-string v2, "getExif"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 69
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 70
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_6

    .line 72
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$5;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$5;

    .line 73
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 74
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 75
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 76
    :cond_6
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 77
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$6;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$6;-><init>(Ln7/f;)V

    .line 78
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 79
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 80
    const-string v2, "getInfo"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 81
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 82
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_7

    .line 84
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$7;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$7;

    .line 85
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 86
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 87
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 88
    :cond_7
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 89
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$8;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$8;-><init>(Ln7/f;)V

    .line 90
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 91
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 92
    const-string v2, "getLocation"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 93
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 94
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_8

    .line 96
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$9;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$9;

    .line 97
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 98
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 99
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 100
    :cond_8
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 101
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$10;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$10;-><init>(Ln7/f;)V

    .line 102
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 103
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 104
    const-string v2, "getFilename"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 105
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 106
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_9

    .line 108
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$11;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$11;

    .line 109
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 110
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 111
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 112
    :cond_9
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 113
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$12;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$12;-><init>(Ln7/f;)V

    .line 114
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 115
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 116
    const-string v2, "getHeight"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 117
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 118
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_a

    .line 120
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$13;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$13;

    .line 121
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 122
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 123
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 124
    :cond_a
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 125
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$14;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$14;-><init>(Ln7/f;)V

    .line 126
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 127
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 128
    const-string v2, "getMediaType"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 129
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 130
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_b

    .line 132
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$15;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$15;

    .line 133
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 134
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 135
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 136
    :cond_b
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 137
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$16;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$16;-><init>(Ln7/f;)V

    .line 138
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 139
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 140
    const-string v2, "getModificationTime"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 141
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 142
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_c

    .line 144
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$17;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$17;

    .line 145
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 146
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 147
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 148
    :cond_c
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 149
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$18;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$18;-><init>(Ln7/f;)V

    .line 150
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 151
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 152
    const-string v2, "getShape"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 153
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 154
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_d

    .line 156
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$19;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$19;

    .line 157
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 158
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 159
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 160
    :cond_d
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 161
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$20;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$20;-><init>(Ln7/f;)V

    .line 162
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 163
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 164
    const-string v2, "getUri"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 165
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 166
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_e

    .line 168
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$21;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$21;

    .line 169
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 170
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 171
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 172
    :cond_e
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 173
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$22;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$22;-><init>(Ln7/f;)V

    .line 174
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 175
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 176
    const-string v2, "getWidth"

    invoke-virtual {v7, v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 177
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 178
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 179
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_f

    .line 180
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$23;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$23;

    .line 181
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 182
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 183
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 184
    :cond_f
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 185
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$24;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$24;-><init>(Ln7/f;)V

    .line 186
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 187
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 188
    invoke-virtual {v7, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v2

    .line 189
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 190
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 191
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_10

    .line 192
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$25;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$25;

    .line 193
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 194
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 195
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 196
    :cond_10
    filled-new-array {v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 197
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$26;

    const/4 v15, 0x0

    invoke-direct {v11, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$26;-><init>(Ln7/f;)V

    .line 198
    invoke-direct {v6, v8, v9, v11}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 199
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 200
    invoke-virtual/range {v33 .. v33}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v7}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v38

    .line 202
    new-instance v35, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 203
    invoke-virtual/range {v33 .. v33}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v2

    if-eqz v2, :cond_4e

    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v36

    .line 204
    invoke-static/range {v38 .. v38}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_11

    .line 207
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Class$2;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Class$2;

    .line 208
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 209
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v15, 0x0

    .line 210
    invoke-direct {v7, v8, v15}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v39, v7

    goto :goto_3

    :cond_11
    move-object/from16 v39, v6

    .line 211
    :goto_3
    invoke-virtual/range {v33 .. v33}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v40

    move-object/from16 v37, v2

    .line 212
    invoke-direct/range {v35 .. v40}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v2, v35

    .line 213
    new-instance v6, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 214
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_12

    .line 216
    sget-object v8, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$1;

    .line 217
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 218
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 219
    invoke-direct {v9, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 220
    :cond_12
    filled-new-array {v8}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 221
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v8

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v8, :cond_13

    new-instance v8, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 222
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-interface {v9, v11, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    :cond_13
    new-instance v9, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;

    invoke-direct {v9, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 224
    invoke-direct {v6, v4, v7, v8, v9}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 225
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 226
    new-instance v6, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual {v2}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v7

    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 227
    new-instance v7, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v6}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v9

    const/4 v11, 0x2

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v11, v15}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v8}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v8

    .line 228
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v9, :cond_14

    new-instance v9, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v9, v11}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 229
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-interface {v11, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    :cond_14
    new-instance v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Property$1;

    invoke-direct {v11}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Property$1;-><init>()V

    move-object/from16 v12, v34

    .line 231
    invoke-direct {v7, v12, v8, v9, v11}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 232
    invoke-virtual {v6}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v8

    invoke-virtual {v7, v8}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v8, 0x1

    .line 233
    invoke-virtual {v7, v8}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 234
    invoke-virtual {v6, v7}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 235
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    const-string v3, "getTitle"

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 237
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v8

    .line 238
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v9, v11, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 239
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_15

    .line 240
    sget-object v9, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$1;

    .line 241
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 242
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 243
    invoke-direct {v11, v12, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v11

    .line 244
    :cond_15
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v8

    .line 245
    new-instance v9, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$2;

    const/4 v15, 0x0

    invoke-direct {v9, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$2;-><init>(Ln7/f;)V

    .line 246
    invoke-direct {v6, v7, v8, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 247
    invoke-virtual {v3, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 248
    const-string v3, "getAssets"

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 249
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v8

    .line 250
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v9, v11, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 251
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_16

    .line 252
    sget-object v9, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$3;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$3;

    .line 253
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 254
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 255
    invoke-direct {v11, v12, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v11

    .line 256
    :cond_16
    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v8

    .line 257
    new-instance v9, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$4;

    const/4 v15, 0x0

    invoke-direct {v9, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$4;-><init>(Ln7/f;)V

    .line 258
    invoke-direct {v6, v7, v8, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 259
    invoke-virtual {v3, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 260
    const-string v3, "add"

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v3

    .line 261
    new-instance v6, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v8

    .line 262
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v9, v11, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_17

    .line 264
    sget-object v9, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$5;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$5;

    .line 265
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 266
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 267
    invoke-direct {v11, v12, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v11

    .line 268
    :cond_17
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 269
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_18

    .line 270
    sget-object v11, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$6;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$6;

    .line 271
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 272
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 273
    invoke-direct {v12, v13, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v12

    .line 274
    :cond_18
    filled-new-array {v9, v11}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v8

    .line 275
    new-instance v9, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$7;

    const/4 v15, 0x0

    invoke-direct {v9, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$7;-><init>(Ln7/f;)V

    .line 276
    invoke-direct {v6, v7, v8, v9}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 277
    invoke-virtual {v3, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 278
    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 279
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 280
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_19

    .line 282
    sget-object v8, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$8;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$8;

    .line 283
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 284
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 285
    invoke-direct {v9, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 286
    :cond_19
    filled-new-array {v8}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 287
    new-instance v8, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$9;

    const/4 v15, 0x0

    invoke-direct {v8, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$9;-><init>(Ln7/f;)V

    .line 288
    invoke-direct {v3, v6, v7, v8}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 289
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 290
    invoke-virtual/range {v33 .. v33}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 292
    new-instance v11, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 293
    invoke-virtual/range {v33 .. v33}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v0

    if-eqz v0, :cond_4d

    invoke-virtual {v0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v12

    .line 294
    invoke-static {v14}, Lv7/a;->b(LC7/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    new-instance v0, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-direct {v0, v2, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 296
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_1a

    .line 297
    sget-object v0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Class$3;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Class$3;

    .line 298
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 299
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v15, 0x0

    invoke-direct {v3, v5, v15, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v15, 0x0

    .line 300
    invoke-direct {v2, v3, v15}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v15, v2

    goto :goto_4

    :cond_1a
    move-object v15, v0

    .line 301
    :goto_4
    invoke-virtual/range {v33 .. v33}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v16

    .line 302
    invoke-direct/range {v11 .. v16}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 303
    new-instance v0, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v15, 0x0

    new-array v2, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 304
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v3

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v3, :cond_1b

    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v3, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 305
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    :cond_1b
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1;

    invoke-direct {v5, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    invoke-direct {v0, v4, v2, v3, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 307
    invoke-virtual {v11, v0}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 308
    const-string v0, "limit"

    .line 309
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 310
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 311
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1c

    .line 312
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$1;

    .line 313
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 314
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 315
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 316
    :cond_1c
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 317
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_1d

    .line 318
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$2;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$2;

    .line 319
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 320
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 321
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 322
    :cond_1d
    filled-new-array {v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 323
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_1e

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 324
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    :cond_1e
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$3;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$3;-><init>()V

    .line 326
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 327
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    const-string v0, "offset"

    .line 329
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 330
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 331
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1f

    .line 332
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$4;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$4;

    .line 333
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 334
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 335
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 336
    :cond_1f
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 337
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_20

    .line 338
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$5;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$5;

    .line 339
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 340
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 341
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 342
    :cond_20
    filled-new-array {v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 343
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_21

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 344
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    :cond_21
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$6;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$6;-><init>()V

    .line 346
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 347
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    const-string v0, "album"

    .line 349
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 350
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 351
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_22

    .line 352
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$7;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$7;

    .line 353
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 354
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 355
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 356
    :cond_22
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 357
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_23

    .line 358
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$8;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$8;

    .line 359
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 360
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 361
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 362
    :cond_23
    filled-new-array {v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 363
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_24

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 364
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    :cond_24
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$9;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$9;-><init>()V

    .line 366
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 367
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    const-string v0, "eq"

    .line 369
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 370
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 371
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_25

    .line 372
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$10;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$10;

    .line 373
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 374
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 375
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 376
    :cond_25
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 377
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_26

    .line 378
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$11;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$11;

    .line 379
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 380
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 381
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 382
    :cond_26
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 383
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_27

    .line 384
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$12;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$12;

    .line 385
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 386
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 387
    invoke-direct {v7, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 388
    :cond_27
    filled-new-array {v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 389
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_28

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 390
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    :cond_28
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$13;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$13;-><init>()V

    .line 392
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 393
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    const-string v0, "within"

    .line 395
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 396
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 397
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_29

    .line 398
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$14;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$14;

    .line 399
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 400
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 401
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 402
    :cond_29
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 403
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2a

    .line 404
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$15;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$15;

    .line 405
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 406
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 407
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 408
    :cond_2a
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_2b

    .line 410
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$16;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$16;

    .line 411
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 412
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 413
    invoke-direct {v7, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 414
    :cond_2b
    filled-new-array {v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 415
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_2c

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 416
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    :cond_2c
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$17;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$17;-><init>()V

    .line 418
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 419
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    const-string v0, "gt"

    .line 421
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 422
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 423
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2d

    .line 424
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$18;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$18;

    .line 425
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 426
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 427
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 428
    :cond_2d
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 429
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2e

    .line 430
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$19;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$19;

    .line 431
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 432
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 433
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 434
    :cond_2e
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_2f

    .line 436
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$20;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$20;

    .line 437
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 438
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 439
    invoke-direct {v7, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 440
    :cond_2f
    filled-new-array {v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 441
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_30

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 442
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    :cond_30
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$21;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$21;-><init>()V

    .line 444
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 445
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    const-string v0, "gte"

    .line 447
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 448
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 449
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_31

    .line 450
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$22;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$22;

    .line 451
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 452
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 453
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 454
    :cond_31
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 455
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_32

    .line 456
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$23;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$23;

    .line 457
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 458
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 459
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 460
    :cond_32
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 461
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_33

    .line 462
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$24;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$24;

    .line 463
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 464
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 465
    invoke-direct {v7, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 466
    :cond_33
    filled-new-array {v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 467
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_34

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 468
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    :cond_34
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$25;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$25;-><init>()V

    .line 470
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 471
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    const-string v0, "lt"

    .line 473
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 474
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 475
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_35

    .line 476
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$26;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$26;

    .line 477
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 478
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 479
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 480
    :cond_35
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 481
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_36

    .line 482
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$27;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$27;

    .line 483
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 484
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 485
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 486
    :cond_36
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 487
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_37

    .line 488
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$28;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$28;

    .line 489
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 490
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 491
    invoke-direct {v7, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 492
    :cond_37
    filled-new-array {v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 493
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_38

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 494
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    :cond_38
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$29;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$29;-><init>()V

    .line 496
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 497
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    const-string v0, "lte"

    .line 499
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 500
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 501
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_39

    .line 502
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$30;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$30;

    .line 503
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 504
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 505
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 506
    :cond_39
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 507
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_3a

    .line 508
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$31;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$31;

    .line 509
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 510
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 511
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 512
    :cond_3a
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 513
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_3b

    .line 514
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$32;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$32;

    .line 515
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 516
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 517
    invoke-direct {v7, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 518
    :cond_3b
    filled-new-array {v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 519
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_3c

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 520
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    :cond_3c
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$33;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$33;-><init>()V

    .line 522
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 523
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    const-string v0, "orderBy"

    .line 525
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 526
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 527
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_3d

    .line 528
    sget-object v4, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$34;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$34;

    .line 529
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 530
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x0

    invoke-direct {v6, v7, v15, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 531
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 532
    :cond_3d
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 533
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_3e

    .line 534
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$35;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$35;

    .line 535
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 536
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 537
    invoke-direct {v6, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 538
    :cond_3e
    filled-new-array {v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 539
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_3f

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 540
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    :cond_3f
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$36;

    invoke-direct {v5}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$36;-><init>()V

    .line 542
    invoke-direct {v2, v0, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 543
    invoke-virtual {v11}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    const-string v0, "exe"

    invoke-virtual {v11, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 545
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    .line 546
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 547
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_40

    .line 548
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Coroutine$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Coroutine$1;

    .line 549
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 550
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 551
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 552
    :cond_40
    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 553
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Coroutine$2;

    const/4 v15, 0x0

    invoke-direct {v5, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Coroutine$2;-><init>(Ln7/f;)V

    .line 554
    invoke-direct {v2, v3, v4, v5}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 555
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 556
    invoke-virtual/range {v33 .. v33}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v11}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    const-string v0, "createAsset"

    move-object/from16 v2, v33

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 558
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 559
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 560
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_41

    .line 561
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$1;

    .line 562
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 563
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v8, v9, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 564
    invoke-direct {v7, v8, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 565
    :cond_41
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 566
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_42

    .line 567
    sget-object v7, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$2;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$2;

    .line 568
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 569
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x1

    invoke-direct {v11, v12, v13, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 570
    invoke-direct {v8, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v8

    .line 571
    :cond_42
    filled-new-array {v6, v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 572
    new-instance v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;

    const/4 v15, 0x0

    invoke-direct {v6, v15, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 573
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 574
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 575
    const-string v0, "createAlbum"

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 576
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 577
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 578
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_43

    .line 579
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$4;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$4;

    .line 580
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 581
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v8, v11, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 582
    invoke-direct {v7, v8, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 583
    :cond_43
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-direct {v7, v8, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 584
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_44

    .line 585
    sget-object v7, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$5;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$5;

    .line 586
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 587
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 588
    invoke-direct {v8, v11, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v8

    .line 589
    :cond_44
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v8, v11, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 590
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_45

    .line 591
    sget-object v8, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$6;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$6;

    .line 592
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 593
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x0

    invoke-direct {v12, v13, v15, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 594
    invoke-direct {v11, v12, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v11

    .line 595
    :cond_45
    filled-new-array {v6, v7, v8}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 596
    new-instance v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;

    const/4 v15, 0x0

    invoke-direct {v6, v15, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 597
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 598
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 599
    const-string v0, "getAlbum"

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 600
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 601
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 602
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_46

    .line 603
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$8;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$8;

    .line 604
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 605
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v8, v11, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 606
    invoke-direct {v7, v8, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 607
    :cond_46
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 608
    new-instance v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$9;

    const/4 v15, 0x0

    invoke-direct {v6, v15, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$9;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 609
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 610
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 611
    const-string v0, "deleteAlbums"

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 612
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 613
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 614
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_47

    .line 615
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$10;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$10;

    .line 616
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 617
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v8, v11, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 618
    invoke-direct {v7, v8, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 619
    :cond_47
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 620
    new-instance v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;

    const/4 v15, 0x0

    invoke-direct {v6, v15, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 621
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 622
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 623
    const-string v0, "deleteAssets"

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->AsyncFunction(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;

    move-result-object v0

    .line 624
    new-instance v3, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 625
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 626
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_48

    .line 627
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$12;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$12;

    .line 628
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 629
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v8, v11, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 630
    invoke-direct {v7, v8, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 631
    :cond_48
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 632
    new-instance v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13;

    const/4 v15, 0x0

    invoke-direct {v6, v15, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13;-><init>(Ln7/f;Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 633
    invoke-direct {v3, v4, v5, v6}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 634
    invoke-virtual {v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 635
    const-string v0, "requestPermissionsAsync"

    .line 636
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    .line 637
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 638
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_49

    .line 639
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$1;

    .line 640
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 641
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 642
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 643
    :cond_49
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 644
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_4a

    .line 645
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$2;

    .line 646
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 647
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v13, 0x1

    invoke-direct {v8, v11, v13, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 648
    invoke-direct {v7, v8, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 649
    :cond_4a
    filled-new-array {v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 650
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$3;

    invoke-direct {v5, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$3;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 651
    invoke-direct {v3, v0, v4, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 652
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    const-string v0, "getPermissionsAsync"

    .line 654
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    .line 655
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 656
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_4b

    .line 657
    sget-object v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$4;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$4;

    .line 658
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 659
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x0

    invoke-direct {v7, v8, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 660
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 661
    :cond_4b
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 662
    invoke-virtual/range {v27 .. v27}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_4c

    .line 663
    sget-object v6, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$5;->INSTANCE:Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$5;

    .line 664
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 665
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v13, 0x1

    invoke-direct {v8, v9, v13, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 666
    invoke-direct {v7, v8, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 667
    :cond_4c
    filled-new-array {v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 668
    new-instance v5, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$6;

    invoke-direct {v5, v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$6;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V

    .line 669
    invoke-direct {v3, v0, v4, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 670
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    new-instance v0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$1$11;

    const/4 v15, 0x0

    invoke-direct {v0, v1, v15}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$1$11;-><init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;Ln7/f;)V

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->RegisterActivityContracts(Lkotlin/jvm/functions/Function2;)V

    .line 672
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 673
    invoke-static {}, Ll1/a;->f()V

    return-object v0

    .line 674
    :cond_4d
    :try_start_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    move-object/from16 v2, v23

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4e
    move-object/from16 v2, v23

    .line 675
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4f
    move-object v2, v8

    .line 676
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 677
    :goto_5
    invoke-static {}, Ll1/a;->f()V

    throw v0
.end method
