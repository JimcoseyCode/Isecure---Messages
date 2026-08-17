.class public final Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a6\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "",
        "assetIds",
        "albumId",
        "",
        "copyToAlbum",
        "addAssetsToAlbum",
        "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;",
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
.method public static final addAssetsToAlbum(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[",
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
    new-instance v1, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;

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
    invoke-direct/range {v1 .. v6}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;-><init>(ZLandroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)V

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
