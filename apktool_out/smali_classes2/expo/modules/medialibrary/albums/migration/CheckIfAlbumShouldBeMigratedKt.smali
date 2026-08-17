.class public final Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\"\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083@\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "albumId",
        "",
        "checkIfAlbumShouldBeMigrated",
        "(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "Ljava/io/File;",
        "getAlbumDirectory",
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
.method public static final synthetic access$getAlbumDirectory(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt;->getAlbumDirectory(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final checkIfAlbumShouldBeMigrated(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;-><init>(Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;->label:I

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
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1;->label:I

    .line 54
    .line 55
    invoke-static {p0, p1, v0}, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt;->getAlbumDirectory(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-ne p2, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    check-cast p2, Ljava/io/File;

    .line 63
    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/io/File;->canWrite()Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    xor-int/2addr p0, v3

    .line 71
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    new-instance p0, Lexpo/modules/medialibrary/AlbumNotFound;

    .line 77
    .line 78
    invoke-direct {p0}, Lexpo/modules/medialibrary/AlbumNotFound;-><init>()V

    .line 79
    .line 80
    .line 81
    throw p0
.end method

.method private static final getAlbumDirectory(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
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
    new-instance v1, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$getAlbumDirectory$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lexpo/modules/medialibrary/albums/migration/CheckIfAlbumShouldBeMigratedKt$getAlbumDirectory$2;-><init>(Ljava/lang/String;Landroid/content/Context;Ln7/f;)V

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
