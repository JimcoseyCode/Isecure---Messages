.class public final Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/medialibrary/albums/AssetFileStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;",
        "",
        "<init>",
        "()V",
        "copyStrategy",
        "Lexpo/modules/medialibrary/albums/AssetFileStrategy;",
        "getCopyStrategy",
        "()Lexpo/modules/medialibrary/albums/AssetFileStrategy;",
        "moveStrategy",
        "getMoveStrategy",
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


# static fields
.field static final synthetic $$INSTANCE:Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;

.field private static final copyStrategy:Lexpo/modules/medialibrary/albums/AssetFileStrategy;

.field private static final moveStrategy:Lexpo/modules/medialibrary/albums/AssetFileStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->$$INSTANCE:Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;

    .line 7
    .line 8
    new-instance v0, Lexpo/modules/medialibrary/albums/b;

    .line 9
    .line 10
    invoke-direct {v0}, Lexpo/modules/medialibrary/albums/b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->copyStrategy:Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 14
    .line 15
    new-instance v0, Lexpo/modules/medialibrary/albums/c;

    .line 16
    .line 17
    invoke-direct {v0}, Lexpo/modules/medialibrary/albums/c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->moveStrategy:Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->moveStrategy$lambda$1(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->copyStrategy$lambda$0(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final copyStrategy$lambda$0(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    const-string v0, "src"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dir"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "<unused var>"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p2, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 17
    .line 18
    invoke-virtual {p2, p0, p1}, Lexpo/modules/medialibrary/MediaLibraryUtils;->safeCopyFile(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static final moveStrategy$lambda$1(Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Ljava/io/File;
    .locals 6

    .line 1
    const-string v0, "src"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dir"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "context"

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
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    instance-of v0, p0, Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    check-cast v0, Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;

    .line 28
    .line 29
    invoke-virtual {v0}, Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;->getAssetId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0}, Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;->getMimeType()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x2

    .line 39
    const-string v4, "video"

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-static {v0, v4, v2, v3, v5}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    sget-object v0, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-static {v0, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-static {v0, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v1, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 73
    .line 74
    invoke-virtual {v1, p0, p1}, Lexpo/modules/medialibrary/MediaLibraryUtils;->safeCopyFile(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, v0, v5}, Lexpo/modules/medialibrary/c;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)I

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_1
    sget-object v0, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 87
    .line 88
    invoke-virtual {v0, p0, p1}, Lexpo/modules/medialibrary/MediaLibraryUtils;->safeMoveFile(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {}, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->getEXTERNAL_CONTENT_URI()Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    filled-new-array {p0}, [Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string v1, "_data=?"

    .line 109
    .line 110
    invoke-virtual {p2, v0, v1, p0}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    return-object p1
.end method


# virtual methods
.method public final getCopyStrategy()Lexpo/modules/medialibrary/albums/AssetFileStrategy;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->copyStrategy:Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMoveStrategy()Lexpo/modules/medialibrary/albums/AssetFileStrategy;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/albums/AssetFileStrategy$Companion;->moveStrategy:Lexpo/modules/medialibrary/albums/AssetFileStrategy;

    .line 2
    .line 3
    return-object v0
.end method
