.class public final Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;",
        "",
        "<init>",
        "()V",
        "buildAssetMediaStoreItem",
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;",
        "Landroid/database/Cursor;",
        "includeDuration",
        "",
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
    invoke-direct {p0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildAssetMediaStoreItem(Landroid/database/Cursor;Z)Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->values()[Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    array-length v3, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    :goto_0
    if-ge v4, v3, :cond_2

    .line 23
    .line 24
    aget-object v5, v1, v4

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    sget-object v6, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Duration:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 29
    .line 30
    if-eq v5, v6, :cond_1

    .line 31
    .line 32
    :cond_0
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 53
    .line 54
    invoke-virtual {v0, p1, v1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->set(Landroid/database/Cursor;Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-virtual {v0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->build()Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method
