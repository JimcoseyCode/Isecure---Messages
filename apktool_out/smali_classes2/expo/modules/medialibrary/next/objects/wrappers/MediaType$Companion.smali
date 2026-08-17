.class public final Lexpo/modules/medialibrary/next/objects/wrappers/MediaType$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType$Companion;",
        "",
        "<init>",
        "()V",
        "fromString",
        "Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;",
        "string",
        "",
        "fromMediaStoreValue",
        "mediaStoreValue",
        "",
        "fromContentUri",
        "contentUri",
        "Landroid/net/Uri;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromContentUri(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;
    .locals 1

    .line 1
    const-string v0, "contentUri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "images"

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->IMAGE:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const-string v0, "video"

    .line 22
    .line 23
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->VIDEO:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    const-string v0, "audio"

    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->AUDIO:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_2
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->UNKNOWN:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 44
    .line 45
    return-object p1
.end method

.method public final fromMediaStoreValue(I)Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->UNKNOWN:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->VIDEO:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->AUDIO:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_2
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->IMAGE:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 20
    .line 21
    return-object p1
.end method

.method public final fromString(Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;
    .locals 2

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "toLowerCase(...)"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, 0x58d9bd6

    .line 22
    .line 23
    .line 24
    if-eq v0, v1, :cond_4

    .line 25
    .line 26
    const v1, 0x5faa95b

    .line 27
    .line 28
    .line 29
    if-eq v0, v1, :cond_2

    .line 30
    .line 31
    const v1, 0x6b0147b

    .line 32
    .line 33
    .line 34
    if-eq v0, v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v0, "video"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->VIDEO:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    const-string v0, "image"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->IMAGE:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_4
    const-string v0, "audio"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_5

    .line 68
    .line 69
    :goto_0
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->UNKNOWN:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_5
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->AUDIO:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 73
    .line 74
    return-object p1
.end method
