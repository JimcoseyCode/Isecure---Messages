.class public final Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ.\u0010\u0016\u001a\u00020\u00132\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ.\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00172\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ&\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00172\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u000cH\u0096@\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010%R\"\u0010(\u001a\u0010\u0012\u000c\u0012\n \'*\u0004\u0018\u00010\u00080\u00080&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;",
        "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;",
        "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;",
        "assetFactory",
        "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;",
        "assetDeleter",
        "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;",
        "mediaStorePermissionsDelegate",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Landroid/content/Context;)V",
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
        "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;",
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

.field private final mediaStorePermissionsDelegate:Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;


# direct methods
.method public constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;Landroid/content/Context;)V
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
    const-string v0, "mediaStorePermissionsDelegate"

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
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 25
    .line 26
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 27
    .line 28
    iput-object p3, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->mediaStorePermissionsDelegate:Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 29
    .line 30
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->contextRef:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    return-void
.end method

.method public static final synthetic access$processAssetsLocation-KTsBHyQ(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->processAssetsLocation-KTsBHyQ(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getContentResolver()Landroid/content/ContentResolver;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->contextRef:Ljava/lang/ref/WeakReference;

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
    .locals 8
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
    instance-of v0, p4, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;-><init>(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/16 v6, 0xa

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/util/Collection;

    .line 49
    .line 50
    iget-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Ljava/util/Iterator;

    .line 53
    .line 54
    iget-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p3, Ljava/util/Collection;

    .line 57
    .line 58
    iget-object v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_2
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Ljava/util/Collection;

    .line 78
    .line 79
    iget-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, Ljava/util/Iterator;

    .line 82
    .line 83
    iget-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p3, Ljava/util/Collection;

    .line 86
    .line 87
    iget-object v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v2, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :cond_3
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    move-object p2, p1

    .line 99
    check-cast p2, Ljava/lang/String;

    .line 100
    .line 101
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Ljava/util/List;

    .line 104
    .line 105
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    if-eqz p3, :cond_9

    .line 113
    .line 114
    iget-object p3, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->mediaStorePermissionsDelegate:Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;

    .line 115
    .line 116
    new-instance p4, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-static {p1, v6}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    invoke-direct {p4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_5

    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 140
    .line 141
    invoke-virtual {v3}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->getContentUri()Landroid/net/Uri;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-interface {p4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 152
    .line 153
    iput v5, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->label:I

    .line 154
    .line 155
    invoke-virtual {p3, p4, v0}, Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;->requestMediaLibraryWritePermission(Ljava/lang/Iterable;Ln7/f;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    if-ne p3, v1, :cond_6

    .line 160
    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :cond_6
    :goto_2
    new-instance p3, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-static {p1, v6}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 166
    .line 167
    .line 168
    move-result p4

    .line 169
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    move-object v2, p2

    .line 177
    move-object p2, p1

    .line 178
    :goto_3
    move-object p1, p3

    .line 179
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result p3

    .line 183
    if-eqz p3, :cond_8

    .line 184
    .line 185
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    check-cast p3, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 190
    .line 191
    iput-object v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 198
    .line 199
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->label:I

    .line 200
    .line 201
    invoke-virtual {p3, v2, v0}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->move-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    if-ne p3, v1, :cond_7

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_7
    move-object p3, p1

    .line 209
    :goto_4
    sget-object p4, Li7/B;->a:Li7/B;

    .line 210
    .line 211
    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_8
    check-cast p1, Ljava/util/List;

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_9
    new-instance p3, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-static {p1, v6}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 221
    .line 222
    .line 223
    move-result p4

    .line 224
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    move-object v7, p2

    .line 232
    move-object p2, p1

    .line 233
    move-object p1, p3

    .line 234
    move-object p3, v7

    .line 235
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result p4

    .line 239
    if-eqz p4, :cond_b

    .line 240
    .line 241
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p4

    .line 245
    check-cast p4, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 246
    .line 247
    iput-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$0:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$1:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$2:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->L$3:Ljava/lang/Object;

    .line 254
    .line 255
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$processAssetsLocation$1;->label:I

    .line 256
    .line 257
    invoke-virtual {p4, p3, v0}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->copy-dXLngQ8(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p4

    .line 261
    if-ne p4, v1, :cond_a

    .line 262
    .line 263
    :goto_6
    return-object v1

    .line 264
    :cond_a
    move-object v2, p3

    .line 265
    move-object p3, p1

    .line 266
    :goto_7
    check-cast p4, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 267
    .line 268
    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-object p1, p3

    .line 272
    move-object p3, v2

    .line 273
    goto :goto_5

    .line 274
    :cond_b
    check-cast p1, Ljava/util/List;

    .line 275
    .line 276
    :goto_8
    sget-object p1, Li7/B;->a:Li7/B;

    .line 277
    .line 278
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
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 9
    .line 10
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 11
    .line 12
    iget-object v3, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->contextRef:Ljava/lang/ref/WeakReference;

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
    .locals 7
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
    instance-of v0, p4, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;-><init>(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x2

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v4, :cond_3

    .line 40
    .line 41
    if-eq v2, v6, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

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
    goto :goto_4

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :catch_1
    move-exception p1

    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Ljava/lang/String;

    .line 70
    .line 71
    :try_start_1
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-boolean p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->Z$0:Z

    .line 76
    .line 77
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    move-object p2, p1

    .line 80
    check-cast p2, Ljava/util/List;

    .line 81
    .line 82
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Ljava/lang/String;

    .line 85
    .line 86
    :try_start_2
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    check-cast p4, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;

    .line 90
    .line 91
    invoke-virtual {p4}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->unbox-impl()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p4
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    const/4 p4, 0x0

    .line 100
    :try_start_3
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    check-cast p4, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 105
    .line 106
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 109
    .line 110
    iput-boolean p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->Z$0:Z

    .line 111
    .line 112
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->label:I

    .line 113
    .line 114
    invoke-virtual {p4, v0}, Lexpo/modules/medialibrary/next/objects/asset/Asset;->getMimeType-dctPOJs(Ln7/f;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p4

    .line 118
    if-ne p4, v1, :cond_5

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    :goto_1
    check-cast p4, Ljava/lang/String;

    .line 122
    .line 123
    sget-object v2, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;

    .line 124
    .line 125
    invoke-virtual {v2, p4, p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;->create-wht0CjE(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v5, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput v6, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->label:I

    .line 134
    .line 135
    invoke-direct {p0, p2, p1, p3, v0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->processAssetsLocation-KTsBHyQ(Ljava/util/List;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-ne p2, v1, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    :goto_2
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->getContentResolver()Landroid/content/ContentResolver;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromAssets$1;->label:I

    .line 149
    .line 150
    invoke-static {p2, p1, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AlbumExtensionsKt;->queryAlbumId-qTZuolk(Landroid/content/ContentResolver;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p4

    .line 154
    if-ne p4, v1, :cond_7

    .line 155
    .line 156
    :goto_3
    return-object v1

    .line 157
    :cond_7
    :goto_4
    check-cast p4, Ljava/lang/String;

    .line 158
    .line 159
    if-eqz p4, :cond_8

    .line 160
    .line 161
    new-instance p1, Lexpo/modules/medialibrary/next/objects/album/Album;

    .line 162
    .line 163
    iget-object p2, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 164
    .line 165
    iget-object p3, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 166
    .line 167
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->contextRef:Ljava/lang/ref/WeakReference;

    .line 168
    .line 169
    invoke-static {v0}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-direct {p1, p4, p2, p3, v0}, Lexpo/modules/medialibrary/next/objects/album/Album;-><init>(Ljava/lang/String;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V

    .line 174
    .line 175
    .line 176
    return-object p1

    .line 177
    :cond_8
    new-instance p2, Lexpo/modules/medialibrary/next/exceptions/AlbumNotFoundException;

    .line 178
    .line 179
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    new-instance p3, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    const-string p4, "Could not find album with relativePath: "

    .line 189
    .line 190
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-direct {p2, p1, v5, v6, v5}, Lexpo/modules/medialibrary/next/exceptions/AlbumNotFoundException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 201
    .line 202
    .line 203
    throw p2
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 204
    :goto_5
    new-instance p2, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    new-instance p4, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v0, "I/O error while creating album: "

    .line 216
    .line 217
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p3

    .line 227
    invoke-direct {p2, p3, p1}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    throw p2

    .line 231
    :goto_6
    new-instance p2, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p3

    .line 237
    new-instance p4, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v0, "Security Exception: "

    .line 243
    .line 244
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    invoke-direct {p2, p3, p1}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    throw p2
.end method

.method public createFromFilePaths(Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;
    .locals 7
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
    instance-of v0, p3, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->label:I

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
    iput v1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;-><init>(Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->label:I

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
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    iget-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/Iterator;

    .line 57
    .line 58
    iget-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p3}, Li7/p;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object p3, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Landroid/net/Uri;

    .line 77
    .line 78
    invoke-virtual {p3, v2}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;->from-dctPOJs(Landroid/net/Uri;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    sget-object v2, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;

    .line 83
    .line 84
    invoke-virtual {v2, p3, p1}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;->create-wht0CjE(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    move-object v6, p2

    .line 93
    move-object p2, p1

    .line 94
    move-object p1, v6

    .line 95
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    if-eqz p3, :cond_5

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    check-cast p3, Landroid/net/Uri;

    .line 106
    .line 107
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 108
    .line 109
    iput-object p2, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->L$1:Ljava/lang/Object;

    .line 112
    .line 113
    iput v3, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->label:I

    .line 114
    .line 115
    invoke-interface {v2, p3, p2, v0}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;->create-BuevYFM(Landroid/net/Uri;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    if-ne p3, v1, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->getContentResolver()Landroid/content/ContentResolver;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object v5, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->L$0:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v5, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    iput v4, v0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory$createFromFilePaths$1;->label:I

    .line 131
    .line 132
    invoke-static {p1, p2, v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AlbumExtensionsKt;->queryAlbumId-qTZuolk(Landroid/content/ContentResolver;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    if-ne p3, v1, :cond_6

    .line 137
    .line 138
    :goto_2
    return-object v1

    .line 139
    :cond_6
    :goto_3
    check-cast p3, Ljava/lang/String;

    .line 140
    .line 141
    if-eqz p3, :cond_7

    .line 142
    .line 143
    new-instance p1, Lexpo/modules/medialibrary/next/objects/album/Album;

    .line 144
    .line 145
    iget-object p2, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetDeleter:Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    .line 146
    .line 147
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->assetFactory:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 148
    .line 149
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/album/factories/AlbumModernFactory;->contextRef:Ljava/lang/ref/WeakReference;

    .line 150
    .line 151
    invoke-static {v1}, Lexpo/modules/medialibrary/next/extensions/WeakReferenceExtensionsKt;->getOrThrow(Ljava/lang/ref/WeakReference;)Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-direct {p1, p3, p2, v0, v1}, Lexpo/modules/medialibrary/next/objects/album/Album;-><init>(Ljava/lang/String;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_7
    new-instance p1, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;

    .line 160
    .line 161
    const-string p2, "Failed to create album: newly created album was not found in the MediaStore."

    .line 162
    .line 163
    invoke-direct {p1, p2, v5, v4, v5}, Lexpo/modules/medialibrary/next/exceptions/AlbumCouldNotBeCreated;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 164
    .line 165
    .line 166
    throw p1
.end method
