.class public interface abstract Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J.\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0008H\u00a6@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;",
        "",
        "",
        "id",
        "Lexpo/modules/medialibrary/next/objects/album/Album;",
        "create",
        "(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/album/Album;",
        "albumName",
        "",
        "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
        "assets",
        "",
        "deleteOriginalAssets",
        "createFromAssets",
        "(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "filePaths",
        "createFromFilePaths",
        "(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;",
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


# virtual methods
.method public abstract create(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/album/Album;
.end method

.method public abstract createFromAssets(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
            ">;Z",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract createFromFilePaths(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
