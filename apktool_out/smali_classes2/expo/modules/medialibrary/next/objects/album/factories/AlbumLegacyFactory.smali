.class public final Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ.\u0010\u0014\u001a\u00020\u00112\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ.\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00182\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ&\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00182\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\nH\u0096@\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\"\u0010(\u001a\u0010\u0012\u000c\u0012\n \'*\u0004\u0018\u00010\u00060\u00060&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;",
        "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;",
        "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;",
        "assetFactory",
        "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "assetDeleter",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Landroid/content/Context;)V",
        "",
        "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
        "assets",
        "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;",
        "relativePath",
        "",
        "deleteOriginalAssets",
        "Li7/B;",
        "processAssetsLocation-KTsBHyQ",
        "(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;",
        "processAssetsLocation",
        "createAlbumDirectoryIfNotExists-YsBE8GI",
        "(Ljava/lang/String;)V",
        "createAlbumDirectoryIfNotExists",
        "",
        "id",
        "Lexpo/modules/medialibrary/next/objects/album/Album;",
        "create",
        "(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/album/Album;",
        "albumName",
        "createFromAssets",
        "(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "filePaths",
        "createFromFilePaths",
        "(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;",
        "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "contextRef",
        "Ljava/lang/ref/WeakReference;",
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

.field private final assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

.field private final contextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "assetFactory"

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
    const-string v0, "context"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 20
    .line 21
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 22
    .line 23
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->contextRef:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    return-void
.end method

.method public static final synthetic access$processAssetsLocation-KTsBHyQ(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->processAssetsLocation-KTsBHyQ(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final createAlbumDirectoryIfNotExists-YsBE8GI(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->toFilePath-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v1

    .line 25
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 29
    .line 30
    const-string v0, "Could not create album directory"

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    invoke-direct {p1, v0, v1, v2, v1}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method private final getContentResolver()Landroid/content/ContentResolver;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->contextRef:Ljava/lang/ref/WeakReference;

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
    new-instance v0, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 15
    .line 16
    const-string v1, "Failed to create album: ContentResolver is unavailable."

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v0, v1, v3, v2, v3}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method private final processAssetsLocation-KTsBHyQ(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;-><init>(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->label:I

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
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/util/Collection;

    .line 44
    .line 45
    iget-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Ljava/util/Iterator;

    .line 48
    .line 49
    iget-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p3, Ljava/util/Collection;

    .line 52
    .line 53
    iget-object v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_2
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ljava/util/Collection;

    .line 73
    .line 74
    iget-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p2, Ljava/util/Iterator;

    .line 77
    .line 78
    iget-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p3, Ljava/util/Collection;

    .line 81
    .line 82
    iget-object v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const/16 p4, 0xa

    .line 94
    .line 95
    if-eqz p3, :cond_6

    .line 96
    .line 97
    new-instance p3, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-static {p1, p4}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 100
    .line 101
    .line 102
    move-result p4

    .line 103
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    move-object v5, p2

    .line 111
    move-object p2, p1

    .line 112
    move-object p1, p3

    .line 113
    move-object p3, v5

    .line 114
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result p4

    .line 118
    if-eqz p4, :cond_5

    .line 119
    .line 120
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    check-cast p4, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 125
    .line 126
    iput-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 133
    .line 134
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->label:I

    .line 135
    .line 136
    invoke-virtual {p4, p3, v0}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->move-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p4

    .line 140
    if-ne p4, v1, :cond_4

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_4
    move-object v2, p3

    .line 144
    move-object p3, p1

    .line 145
    :goto_2
    sget-object p4, Li7/B;->a:Li7/B;

    .line 146
    .line 147
    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-object p1, p3

    .line 151
    move-object p3, v2

    .line 152
    goto :goto_1

    .line 153
    :cond_5
    check-cast p1, Ljava/util/List;

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_6
    new-instance p3, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-static {p1, p4}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 159
    .line 160
    .line 161
    move-result p4

    .line 162
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    move-object v5, p2

    .line 170
    move-object p2, p1

    .line 171
    move-object p1, p3

    .line 172
    move-object p3, v5

    .line 173
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result p4

    .line 177
    if-eqz p4, :cond_8

    .line 178
    .line 179
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p4

    .line 183
    check-cast p4, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 184
    .line 185
    iput-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 192
    .line 193
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$processAssetsLocation$1;->label:I

    .line 194
    .line 195
    invoke-virtual {p4, p3, v0}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->copy-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p4

    .line 199
    if-ne p4, v1, :cond_7

    .line 200
    .line 201
    :goto_4
    return-object v1

    .line 202
    :cond_7
    move-object v2, p3

    .line 203
    move-object p3, p1

    .line 204
    :goto_5
    check-cast p4, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 205
    .line 206
    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-object p1, p3

    .line 210
    move-object p3, v2

    .line 211
    goto :goto_3

    .line 212
    :cond_8
    check-cast p1, Ljava/util/List;

    .line 213
    .line 214
    :goto_6
    sget-object p1, Li7/B;->a:Li7/B;

    .line 215
    .line 216
    return-object p1
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/album/Album;
    .locals 4

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/Album;

    .line 7
    .line 8
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 9
    .line 10
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 11
    .line 12
    iget-object v3, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->contextRef:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-static {v3}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v0, p1, v1, v2, v3}, Lexpo/modules/medialibrary/next/objects/album/Album;-><init>(Ljava/lang/String;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public createFromAssets(Ljava/lang/String;Ljava/util/List;ZLn7/f;)Ljava/lang/Object;
    .locals 6
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

    .line 1
    instance-of p3, p4, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    move-object p3, p4

    .line 6
    check-cast p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;

    .line 7
    .line 8
    iget v0, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->label:I

    .line 9
    .line 10
    const/high16 v1, -0x80000000

    .line 11
    .line 12
    and-int v2, v0, v1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    sub-int/2addr v0, v1

    .line 17
    iput v0, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;

    .line 21
    .line 22
    invoke-direct {p3, p0, p4}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;-><init>(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->label:I

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    if-eq v1, v3, :cond_3

    .line 40
    .line 41
    if-eq v1, v4, :cond_2

    .line 42
    .line 43
    if-ne v1, v2, :cond_1

    .line 44
    .line 45
    iget-object p1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catch_1
    move-exception p1

    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    iget-object p1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    iget-object p2, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Ljava/util/List;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-object p1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    move-object p2, p1

    .line 83
    check-cast p2, Ljava/util/List;

    .line 84
    .line 85
    iget-object p1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Ljava/lang/String;

    .line 88
    .line 89
    :try_start_2
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    check-cast p4, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;

    .line 93
    .line 94
    invoke-virtual {p4}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->unbox-impl()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p4
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :try_start_3
    invoke-static {p2}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    check-cast p4, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 107
    .line 108
    if-eqz p4, :cond_9

    .line 109
    .line 110
    iput-object p1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object p2, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 113
    .line 114
    iput v3, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->label:I

    .line 115
    .line 116
    invoke-virtual {p4, p3}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->getMimeType-dctPOJs(Ln7/f;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    if-ne p4, v0, :cond_5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    :goto_1
    check-cast p4, Ljava/lang/String;

    .line 124
    .line 125
    sget-object v1, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;

    .line 126
    .line 127
    invoke-virtual {v1, p4, p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;->create-wht0CjE(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-direct {p0, p1}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->createAlbumDirectoryIfNotExists-YsBE8GI(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iput-object p2, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object p1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 137
    .line 138
    iput v4, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->label:I

    .line 139
    .line 140
    invoke-direct {p0, p2, p1, v3, p3}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->processAssetsLocation-KTsBHyQ(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    if-ne p4, v0, :cond_6

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    :goto_2
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->getContentResolver()Landroid/content/ContentResolver;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    const/4 v1, 0x0

    .line 152
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    check-cast p2, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 157
    .line 158
    invoke-virtual {p2}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->getContentUri()Landroid/net/Uri;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    iput-object p1, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v5, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 165
    .line 166
    iput v2, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromAssets$1;->label:I

    .line 167
    .line 168
    invoke-static {p4, p2, p3}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetBucketId(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    if-ne p4, v0, :cond_7

    .line 173
    .line 174
    :goto_3
    return-object v0

    .line 175
    :cond_7
    :goto_4
    check-cast p4, Ljava/lang/Integer;

    .line 176
    .line 177
    if-eqz p4, :cond_8

    .line 178
    .line 179
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    new-instance p2, Lexpo/modules/medialibrary/next/objects/album/Album;

    .line 184
    .line 185
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object p3, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 190
    .line 191
    iget-object p4, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 192
    .line 193
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->contextRef:Ljava/lang/ref/WeakReference;

    .line 194
    .line 195
    invoke-static {v0}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {p2, p1, p3, p4, v0}, Lexpo/modules/medialibrary/next/objects/album/Album;-><init>(Ljava/lang/String;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    return-object p2

    .line 203
    :cond_8
    new-instance p2, Lexpo/modules/medialibrary/next/exceptions/AlbumNotFoundException;

    .line 204
    .line 205
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->toFilePath-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    new-instance p3, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const-string p4, "Could not find album with filePath: "

    .line 215
    .line 216
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {p2, p1, v5, v4, v5}, Lexpo/modules/medialibrary/next/exceptions/AlbumNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 227
    .line 228
    .line 229
    throw p2

    .line 230
    :cond_9
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 231
    .line 232
    const-string p2, "No assets provided"

    .line 233
    .line 234
    invoke-direct {p1, p2, v5, v4, v5}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 235
    .line 236
    .line 237
    throw p1
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 238
    :goto_5
    new-instance p2, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p3

    .line 244
    new-instance p4, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    const-string v0, "IO error while creating album: "

    .line 250
    .line 251
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p3

    .line 261
    invoke-direct {p2, p3, p1}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    throw p2

    .line 265
    :goto_6
    new-instance p2, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p3

    .line 271
    new-instance p4, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string v0, "Missing WRITE_EXTERNAL_STORAGE permission: "

    .line 277
    .line 278
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p3

    .line 288
    invoke-direct {p2, p3, p1}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    throw p2
.end method

.method public createFromFilePaths(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;
    .locals 8
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

    .line 1
    instance-of v0, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;-><init>(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$3:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Ljava/util/Collection;

    .line 62
    .line 63
    iget-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$2:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p2, Ljava/util/Iterator;

    .line 66
    .line 67
    iget-object v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Ljava/util/Collection;

    .line 70
    .line 71
    iget-object v6, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v7, v0

    .line 79
    move-object v0, p2

    .line 80
    move-object p2, v6

    .line 81
    move-object v6, v7

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p2}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    check-cast p3, Landroid/net/Uri;

    .line 91
    .line 92
    if-eqz p3, :cond_8

    .line 93
    .line 94
    sget-object v2, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;

    .line 95
    .line 96
    invoke-virtual {v2, p3}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;->from-dctPOJs(Landroid/net/Uri;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    sget-object v2, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;

    .line 101
    .line 102
    invoke-virtual {v2, p3, p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;->create-wht0CjE(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance p3, Ljava/util/ArrayList;

    .line 107
    .line 108
    const/16 v2, 0xa

    .line 109
    .line 110
    invoke-static {p2, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    move-object v7, p2

    .line 122
    move-object p2, p1

    .line 123
    move-object p1, p3

    .line 124
    move-object p3, v7

    .line 125
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_5

    .line 130
    .line 131
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Landroid/net/Uri;

    .line 136
    .line 137
    iget-object v6, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 138
    .line 139
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$0:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$1:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$2:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$3:Ljava/lang/Object;

    .line 146
    .line 147
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->label:I

    .line 148
    .line 149
    invoke-interface {v6, v2, p2, v0}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;->create-BuevYFM(Landroid/net/Uri;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-ne v2, v1, :cond_4

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    move-object v6, v0

    .line 157
    move-object v0, p3

    .line 158
    move-object p3, v2

    .line 159
    move-object v2, p1

    .line 160
    :goto_2
    check-cast p3, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 161
    .line 162
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-object p3, v0

    .line 166
    move-object p1, v2

    .line 167
    move-object v0, v6

    .line 168
    goto :goto_1

    .line 169
    :cond_5
    check-cast p1, Ljava/util/List;

    .line 170
    .line 171
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->getContentResolver()Landroid/content/ContentResolver;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 181
    .line 182
    invoke-virtual {p1}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->getContentUri()Landroid/net/Uri;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$0:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v5, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$1:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v5, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$2:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v5, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->L$3:Ljava/lang/Object;

    .line 193
    .line 194
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory$createFromFilePaths$1;->label:I

    .line 195
    .line 196
    invoke-static {p3, p1, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetBucketId(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    if-ne p3, v1, :cond_6

    .line 201
    .line 202
    :goto_3
    return-object v1

    .line 203
    :cond_6
    move-object p1, p2

    .line 204
    :goto_4
    check-cast p3, Ljava/lang/Integer;

    .line 205
    .line 206
    if-eqz p3, :cond_7

    .line 207
    .line 208
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    new-instance p2, Lexpo/modules/medialibrary/next/objects/album/Album;

    .line 213
    .line 214
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iget-object p3, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 219
    .line 220
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 221
    .line 222
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumLegacyFactory;->contextRef:Ljava/lang/ref/WeakReference;

    .line 223
    .line 224
    invoke-static {v1}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-direct {p2, p1, p3, v0, v1}, Lexpo/modules/medialibrary/next/objects/album/Album;-><init>(Ljava/lang/String;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V

    .line 229
    .line 230
    .line 231
    return-object p2

    .line 232
    :cond_7
    new-instance p2, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 233
    .line 234
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    new-instance p3, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string v0, "Could not find album with relativePath: "

    .line 244
    .line 245
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-direct {p2, p1, v5, v4, v5}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 256
    .line 257
    .line 258
    throw p2

    .line 259
    :cond_8
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 260
    .line 261
    const-string p2, "No file paths provided"

    .line 262
    .line 263
    invoke-direct {p1, p2, v5, v4, v5}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 264
    .line 265
    .line 266
    throw p1
.end method
