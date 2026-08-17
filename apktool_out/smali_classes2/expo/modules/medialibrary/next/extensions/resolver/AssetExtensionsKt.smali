.class public final Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0005\u001a\u001e\u0010\u0008\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\u0005\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\u0005\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u0005\u001a\u001e\u0010\u000c\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\u0005\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u0005\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u0005\u001a\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0005\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a!\u0010$\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\"\u0010#\u001a)\u0010\'\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0004\u0008%\u0010&\u001a\u0019\u0010)\u001a\u00020\u001a*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003\u00a2\u0006\u0004\u0008)\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Landroid/content/ContentResolver;",
        "Landroid/net/Uri;",
        "contentUri",
        "",
        "queryAssetDisplayName",
        "(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;",
        "",
        "queryAssetDateTaken",
        "queryAssetDateModified",
        "queryAssetDuration",
        "",
        "queryAssetWidth",
        "queryAssetHeight",
        "queryAssetData",
        "queryAssetBucketId",
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;",
        "queryAssetMediaStoreItem",
        "displayName",
        "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;",
        "mimeType",
        "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;",
        "relativePath",
        "insertPendingAsset-cT81_0k",
        "(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "insertPendingAsset",
        "uri",
        "Li7/B;",
        "publishPendingAsset",
        "(Landroid/content/ContentResolver;Landroid/net/Uri;)V",
        "Landroid/content/ContentValues;",
        "values",
        "safeUpdate",
        "(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;)I",
        "newRelativePath",
        "updateRelativePath-XUFtwTY",
        "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)V",
        "updateRelativePath",
        "updateRelativePathAndName-SGAlvP8",
        "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V",
        "updateRelativePathAndName",
        "assetPath",
        "deleteBy",
        "(Landroid/content/ContentResolver;Ljava/lang/String;)V",
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
.method public static final deleteBy(Landroid/content/ContentResolver;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "assetPath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->getEXTERNAL_CONTENT_URI()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "_data=?"

    .line 16
    .line 17
    filled-new-array {p1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, v0, v1, p1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final insertPendingAsset-cT81_0k(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
    new-instance v1, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$insertPendingAsset$2;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move-object v4, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v5, p3

    .line 12
    invoke-direct/range {v1 .. v6}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$insertPendingAsset$2;-><init>(Ljava/lang/String;Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ln7/f;)V

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

.method public static final publishPendingAsset(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "uri"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/content/ContentValues;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "is_pending"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->safeUpdate(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;)I

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final queryAssetBucketId(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->BucketId:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetBucketId$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetBucketId$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final queryAssetData(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Data:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetData$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetData$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final queryAssetDateModified(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DateModified:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDateModified$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDateModified$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final queryAssetDateTaken(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DateTaken:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDateTaken$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDateTaken$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final queryAssetDisplayName(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DisplayName:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDisplayName$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDisplayName$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final queryAssetDuration(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Duration:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDuration$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetDuration$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final queryAssetHeight(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Height:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetHeight$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetHeight$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final queryAssetMediaStoreItem(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
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
    new-instance v1, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetMediaStoreItem$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetMediaStoreItem$2;-><init>(Landroid/net/Uri;Landroid/content/ContentResolver;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final queryAssetWidth(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Width:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getColumn()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetWidth$2;->INSTANCE:Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt$queryAssetWidth$2;

    .line 8
    .line 9
    const/16 v9, 0x38

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v8, p2

    .line 18
    invoke-static/range {v1 .. v10}, Lexpo/modules/medialibrary/next/extensions/resolver/QueryOneKt;->queryOne$default(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final safeUpdate(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;)I
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "uri"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "values"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x1e

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-lt v0, v1, :cond_0

    .line 22
    .line 23
    invoke-static {p0, p1, p2, v2}, Lexpo/modules/medialibrary/albums/migration/a;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Landroid/os/Bundle;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_0
    invoke-virtual {p0, p1, p2, v2, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public static final updateRelativePath-XUFtwTY(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "$this$updateRelativePath"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentUri"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "newRelativePath"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/content/ContentValues;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "relative_path"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p1, v0, p2, p2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final updateRelativePathAndName-SGAlvP8(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "$this$updateRelativePathAndName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentUri"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "newRelativePath"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "displayName"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/content/ContentValues;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "relative_path"

    .line 27
    .line 28
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p2, "_display_name"

    .line 32
    .line 33
    invoke-virtual {v0, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-virtual {p0, p1, v0, p2, p2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-void
.end method
