.class public final Lexpo/modules/medialibrary/assets/CreateAssetKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aJ\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0008\u0018\u0001`\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "uri",
        "",
        "resolveWithAdditionalData",
        "albumId",
        "Ljava/util/ArrayList;",
        "Landroid/os/Bundle;",
        "Lkotlin/collections/ArrayList;",
        "createAssetWithAlbumId",
        "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ln7/f;)Ljava/lang/Object;",
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
.method public static final createAssetWithAlbumId(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;-><init>(Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p4

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    iget-boolean p2, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->Z$0:Z

    .line 55
    .line 56
    iget-object p0, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->L$1:Ljava/lang/Object;

    .line 57
    .line 58
    move-object p1, p0

    .line 59
    check-cast p1, Ljava/lang/String;

    .line 60
    .line 61
    iget-object p0, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Landroid/content/Context;

    .line 64
    .line 65
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    if-eqz p3, :cond_5

    .line 73
    .line 74
    iput-object p0, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p1, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    iput-boolean p2, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->Z$0:Z

    .line 79
    .line 80
    iput v4, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->label:I

    .line 81
    .line 82
    invoke-static {p0, p3, v0}, Lexpo/modules/medialibrary/albums/AlbumUtilsKt;->getAlbumFileOrNull(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p4

    .line 86
    if-ne p4, v1, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    :goto_1
    check-cast p4, Ljava/io/File;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    move-object p4, v5

    .line 93
    :goto_2
    new-instance p3, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;

    .line 94
    .line 95
    invoke-direct {p3, p0, p1, p2, p4}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/io/File;)V

    .line 96
    .line 97
    .line 98
    iput-object v5, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v5, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    iput v3, v0, Lexpo/modules/medialibrary/assets/CreateAssetKt$createAssetWithAlbumId$1;->label:I

    .line 103
    .line 104
    invoke-virtual {p3, v0}, Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumFile;->execute(Ln7/f;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-ne p0, v1, :cond_6

    .line 109
    .line 110
    :goto_3
    return-object v1

    .line 111
    :cond_6
    return-object p0
.end method

.method public static synthetic createAssetWithAlbumId$default(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lexpo/modules/medialibrary/assets/CreateAssetKt;->createAssetWithAlbumId(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
