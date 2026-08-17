.class public final Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u000eJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u000eJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000cH\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u000eJ\u0010\u0010\u001f\u001a\u00020\u001dH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u000eJ\u0012\u0010!\u001a\u0004\u0018\u00010 H\u0096@\u00a2\u0006\u0004\u0008!\u0010\u000eJ\u0010\u0010#\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008#\u0010\u000eJ\u0010\u0010%\u001a\u00020$H\u0096@\u00a2\u0006\u0004\u0008%\u0010\u000eJ\u0018\u0010*\u001a\u00020$2\u0006\u0010\'\u001a\u00020&H\u0096@\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010-\u001a\u00020+2\u0006\u0010\'\u001a\u00020&H\u0096@\u00a2\u0006\u0004\u0008,\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00082\u00103R\"\u00106\u001a\u0010\u0012\u000c\u0012\n 5*\u0004\u0018\u00010\u00080\u0008048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R$\u0010\u0003\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R\u0014\u0010E\u001a\u00020B8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010D\u00a8\u0006F"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;",
        "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetDelegate;",
        "Landroid/net/Uri;",
        "contentUri",
        "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "assetDeleter",
        "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;",
        "systemPermissionsDelegate",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/net/Uri;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V",
        "",
        "getCreationTime",
        "(Ln7/f;)Ljava/lang/Object;",
        "getDuration",
        "",
        "getFilename",
        "",
        "getHeight",
        "getWidth",
        "Lexpo/modules/medialibrary/next/records/Shape;",
        "getShape",
        "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;",
        "getMediaType",
        "getModificationTime",
        "getUri",
        "Lexpo/modules/medialibrary/next/records/AssetInfo;",
        "getInfo",
        "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;",
        "getMimeType-dctPOJs",
        "getMimeType",
        "Lexpo/modules/medialibrary/next/records/Location;",
        "getLocation",
        "Landroid/os/Bundle;",
        "getExif",
        "Li7/B;",
        "delete",
        "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;",
        "relativePath",
        "move-dXLngQ8",
        "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "move",
        "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
        "copy-dXLngQ8",
        "copy",
        "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "getAssetDeleter",
        "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;",
        "getSystemPermissionsDelegate",
        "()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "contextRef",
        "Ljava/lang/ref/WeakReference;",
        "value",
        "Landroid/net/Uri;",
        "getContentUri",
        "()Landroid/net/Uri;",
        "Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;",
        "mediaStoreToAssetAdapter$delegate",
        "Lkotlin/Lazy;",
        "getMediaStoreToAssetAdapter",
        "()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;",
        "mediaStoreToAssetAdapter",
        "Landroid/content/ContentResolver;",
        "getContentResolver",
        "()Landroid/content/ContentResolver;",
        "contentResolver",
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
.field private final assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

.field private contentUri:Landroid/net/Uri;

.field private final contextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final mediaStoreToAssetAdapter$delegate:Lkotlin/Lazy;

.field private final systemPermissionsDelegate:Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "contentUri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "assetDeleter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "systemPermissionsDelegate"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "context"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 25
    .line 26
    iput-object p3, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->systemPermissionsDelegate:Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 27
    .line 28
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-direct {p2, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->contextRef:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->contentUri:Landroid/net/Uri;

    .line 36
    .line 37
    new-instance p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/a;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/a;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->mediaStoreToAssetAdapter$delegate:Lkotlin/Lazy;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic a(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->mediaStoreToAssetAdapter_delegate$lambda$0(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Landroid/content/ContentResolver;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContextRef$p(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->contextRef:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setContentUri$p(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->contentUri:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method private final getContentResolver()Landroid/content/ContentResolver;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->contextRef:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-static {v0}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/exceptions/ContentResolverNotObtainedException;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v2, v1, v2}, Lexpo/modules/medialibrary/next/exceptions/ContentResolverNotObtainedException;-><init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method private final getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->mediaStoreToAssetAdapter$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final mediaStoreToAssetAdapter_delegate$lambda$0(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;)Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 2
    .line 3
    iget-object p0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->contextRef:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-static {p0}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public copy-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
    new-instance v1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$copy$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ljava/lang/String;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public delete(Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    new-instance v1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$delete$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$delete$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 23
    .line 24
    return-object p1
.end method

.method public final getAssetDeleter()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContentUri()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->contentUri:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCreationTime(Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getCreationTime$1;->label:I

    .line 62
    .line 63
    invoke-static {p1, v2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetDateTaken(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Long;

    .line 71
    .line 72
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformCreationTime(Ljava/lang/Long;)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public getDuration(Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;->label:I

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
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;->label:I

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaType(Ln7/f;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    :goto_1
    sget-object v2, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->VIDEO:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 70
    .line 71
    if-eq p1, v2, :cond_5

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    return-object p1

    .line 75
    :cond_5
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getDuration$1;->label:I

    .line 84
    .line 85
    invoke-static {p1, v2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetDuration(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-ne p1, v1, :cond_6

    .line 90
    .line 91
    :goto_2
    return-object v1

    .line 92
    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformDuration(Ljava/lang/Long;)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
.end method

.method public getExif(Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    new-instance v1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getExif$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getExif$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

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

.method public getFilename(Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getFilename$1;->label:I

    .line 62
    .line 63
    invoke-static {p1, v2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetDisplayName(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_4
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 76
    .line 77
    const-string v0, "Filename"

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-direct {p1, v0, v2, v1, v2}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method public getHeight(Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x2

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v3, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;->label:I

    .line 69
    .line 70
    invoke-static {p1, v2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetHeight(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getHeight$1;->label:I

    .line 88
    .line 89
    invoke-virtual {v2, p1, v3, v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformHeight(Ljava/lang/Integer;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v1, :cond_5

    .line 94
    .line 95
    :goto_2
    return-object v1

    .line 96
    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Integer;

    .line 97
    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :cond_6
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 110
    .line 111
    const-string v0, "Height"

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-direct {p1, v0, v1, v4, v1}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    .line 116
    .line 117
    throw p1
.end method

.method public getInfo(Ln7/f;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;

    .line 11
    .line 12
    iget v3, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x4

    .line 38
    const/4 v6, 0x3

    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v4, :cond_5

    .line 43
    .line 44
    if-eq v4, v7, :cond_4

    .line 45
    .line 46
    if-eq v4, v8, :cond_3

    .line 47
    .line 48
    if-eq v4, v6, :cond_2

    .line 49
    .line 50
    if-ne v4, v5, :cond_1

    .line 51
    .line 52
    iget-object v3, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$2:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ljava/lang/Integer;

    .line 55
    .line 56
    iget-object v4, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$1:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 59
    .line 60
    iget-object v2, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;

    .line 63
    .line 64
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v17, v4

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :cond_2
    iget-object v4, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 82
    .line 83
    iget-object v6, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v6, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;

    .line 86
    .line 87
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object/from16 v20, v6

    .line 91
    .line 92
    move-object v6, v4

    .line 93
    move-object/from16 v4, v20

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    iget-object v4, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;

    .line 99
    .line 100
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    iput v7, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->label:I

    .line 120
    .line 121
    invoke-static {v1, v4, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetMediaStoreItem(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-ne v1, v3, :cond_6

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    :goto_1
    move-object v4, v1

    .line 129
    check-cast v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;

    .line 130
    .line 131
    if-eqz v4, :cond_e

    .line 132
    .line 133
    iput-object v4, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$0:Ljava/lang/Object;

    .line 134
    .line 135
    iput v8, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->label:I

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaType(Ln7/f;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-ne v1, v3, :cond_7

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    :goto_2
    check-cast v1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 145
    .line 146
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {v4}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;->getHeight()Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    iput-object v4, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$0:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v1, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$1:Ljava/lang/Object;

    .line 161
    .line 162
    iput v6, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->label:I

    .line 163
    .line 164
    invoke-virtual {v7, v10, v11, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformHeight(Ljava/lang/Integer;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    if-ne v6, v3, :cond_8

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    move-object/from16 v20, v6

    .line 172
    .line 173
    move-object v6, v1

    .line 174
    move-object/from16 v1, v20

    .line 175
    .line 176
    :goto_3
    check-cast v1, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v4}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;->getWidth()Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    iput-object v4, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$0:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v6, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$1:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object v1, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->L$2:Ljava/lang/Object;

    .line 195
    .line 196
    iput v5, v2, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getInfo$1;->label:I

    .line 197
    .line 198
    invoke-virtual {v7, v10, v11, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformWidth(Ljava/lang/Integer;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-ne v2, v3, :cond_9

    .line 203
    .line 204
    :goto_4
    return-object v3

    .line 205
    :cond_9
    move-object v3, v1

    .line 206
    move-object v1, v2

    .line 207
    move-object v2, v4

    .line 208
    move-object/from16 v17, v6

    .line 209
    .line 210
    :goto_5
    check-cast v1, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;->getDateTaken()Ljava/lang/Long;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v4, v5}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformCreationTime(Ljava/lang/Long;)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-virtual {v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;->getDateModified()Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-virtual {v4, v5}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformModificationTime(Ljava/lang/Long;)Ljava/lang/Long;

    .line 237
    .line 238
    .line 239
    move-result-object v18

    .line 240
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-virtual {v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;->getDuration()Ljava/lang/Long;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    invoke-virtual {v4, v5}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformDuration(Ljava/lang/Long;)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    invoke-virtual {v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;->getDisplayName()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    if-eqz v14, :cond_d

    .line 257
    .line 258
    if-eqz v3, :cond_c

    .line 259
    .line 260
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    if-eqz v1, :cond_b

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v16

    .line 270
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;->getData()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v1, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 279
    .line 280
    .line 281
    move-result-object v19

    .line 282
    if-eqz v19, :cond_a

    .line 283
    .line 284
    new-instance v10, Lexpo/modules/medialibrary/next/records/AssetInfo;

    .line 285
    .line 286
    invoke-direct/range {v10 .. v19}, Lexpo/modules/medialibrary/next/records/AssetInfo;-><init>(Landroid/net/Uri;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;IILexpo/modules/medialibrary/next/objects/wrappers/MediaType;Ljava/lang/Long;Landroid/net/Uri;)V

    .line 287
    .line 288
    .line 289
    return-object v10

    .line 290
    :cond_a
    new-instance v1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 291
    .line 292
    const-string v2, "Uri"

    .line 293
    .line 294
    invoke-direct {v1, v2, v9, v8, v9}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 295
    .line 296
    .line 297
    throw v1

    .line 298
    :cond_b
    new-instance v1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 299
    .line 300
    const-string v2, "Width"

    .line 301
    .line 302
    invoke-direct {v1, v2, v9, v8, v9}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 303
    .line 304
    .line 305
    throw v1

    .line 306
    :cond_c
    new-instance v1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 307
    .line 308
    const-string v2, "Height"

    .line 309
    .line 310
    invoke-direct {v1, v2, v9, v8, v9}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 311
    .line 312
    .line 313
    throw v1

    .line 314
    :cond_d
    new-instance v1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 315
    .line 316
    const-string v2, "Filename"

    .line 317
    .line 318
    invoke-direct {v1, v2, v9, v8, v9}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 319
    .line 320
    .line 321
    throw v1

    .line 322
    :cond_e
    new-instance v1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 323
    .line 324
    const-string v2, "Info"

    .line 325
    .line 326
    invoke-direct {v1, v2, v9, v8, v9}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 327
    .line 328
    .line 329
    throw v1
.end method

.method public getLocation(Ln7/f;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->systemPermissionsDelegate:Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 2
    .line 3
    invoke-virtual {p1}, Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;->requireReadPermissions()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    :try_start_0
    new-instance v1, LX0/a;

    .line 22
    .line 23
    invoke-direct {v1, p1}, LX0/a;-><init>(Ljava/io/InputStream;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, LX0/a;->q()[D

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    aget-wide v2, v1, v2

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    aget-wide v4, v1, v4

    .line 37
    .line 38
    new-instance v1, Lexpo/modules/medialibrary/next/records/Location;

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v1, v2, v3}, Lexpo/modules/medialibrary/next/records/Location;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    move-object v1, v0

    .line 55
    :goto_0
    invoke-static {p1, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    :catchall_1
    move-exception v1

    .line 61
    invoke-static {p1, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_1
    return-object v0
.end method

.method public getMediaType(Ln7/f;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType$Companion;->fromContentUri(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public getMimeType-dctPOJs(Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;

    .line 41
    .line 42
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p1, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_3
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;

    .line 77
    .line 78
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getMimeType$1;->label:I

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getUri(Ln7/f;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-ne v0, v1, :cond_4

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_4
    move-object v4, v0

    .line 90
    move-object v0, p1

    .line 91
    move-object p1, v4

    .line 92
    :goto_1
    check-cast p1, Landroid/net/Uri;

    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;->from-dctPOJs(Landroid/net/Uri;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1
.end method

.method public getModificationTime(Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getModificationTime$1;->label:I

    .line 62
    .line 63
    invoke-static {p1, v2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetDateModified(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Long;

    .line 71
    .line 72
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformModificationTime(Ljava/lang/Long;)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public getShape(Ln7/f;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->label:I

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
    iget v0, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->I$0:I

    .line 42
    .line 43
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->label:I

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getWidth(Ln7/f;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->I$0:I

    .line 78
    .line 79
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getShape$1;->label:I

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getHeight(Ln7/f;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    .line 87
    :goto_2
    return-object v1

    .line 88
    :cond_5
    move-object v5, v0

    .line 89
    move v0, p1

    .line 90
    move-object p1, v5

    .line 91
    :goto_3
    check-cast p1, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    new-instance v1, Lexpo/modules/medialibrary/next/records/Shape;

    .line 98
    .line 99
    invoke-direct {v1, v0, p1}, Lexpo/modules/medialibrary/next/records/Shape;-><init>(II)V

    .line 100
    .line 101
    .line 102
    if-lez v0, :cond_6

    .line 103
    .line 104
    if-lez p1, :cond_6

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_6
    const/4 p1, 0x0

    .line 108
    return-object p1
.end method

.method public final getSystemPermissionsDelegate()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->systemPermissionsDelegate:Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUri(Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getUri$1;->label:I

    .line 62
    .line 63
    invoke-static {p1, v2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetData(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 84
    .line 85
    const-string v0, "Uri"

    .line 86
    .line 87
    const/4 v1, 0x2

    .line 88
    const/4 v2, 0x0

    .line 89
    invoke-direct {p1, v0, v2, v1, v2}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public getWidth(Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x2

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v3, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentResolver()Landroid/content/ContentResolver;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;->label:I

    .line 69
    .line 70
    invoke-static {p1, v2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetWidth(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getMediaStoreToAssetAdapter()Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;->getContentUri()Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$getWidth$1;->label:I

    .line 88
    .line 89
    invoke-virtual {v2, p1, v3, v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformWidth(Ljava/lang/Integer;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v1, :cond_5

    .line 94
    .line 95
    :goto_2
    return-object v1

    .line 96
    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Integer;

    .line 97
    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :cond_6
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;

    .line 110
    .line 111
    const-string v0, "Width"

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-direct {p1, v0, v1, v4, v1}, Lexpo/modules/medialibrary/next/exceptions/AssetPropertyNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    .line 116
    .line 117
    throw p1
.end method

.method public move-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
    new-instance v1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate$move$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetLegacyDelegate;Ljava/lang/String;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 23
    .line 24
    return-object p1
.end method
