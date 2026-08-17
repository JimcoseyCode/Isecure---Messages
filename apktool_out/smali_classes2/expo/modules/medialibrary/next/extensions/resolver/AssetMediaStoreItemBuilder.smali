.class public final Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;,
        Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u000fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;",
        "",
        "<init>",
        "()V",
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;",
        "build",
        "()Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;",
        "Landroid/database/Cursor;",
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;",
        "property",
        "Li7/B;",
        "set",
        "(Landroid/database/Cursor;Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;)V",
        "",
        "displayName",
        "Ljava/lang/String;",
        "",
        "height",
        "Ljava/lang/Integer;",
        "width",
        "",
        "dateTaken",
        "Ljava/lang/Long;",
        "dateModified",
        "duration",
        "data",
        "bucketId",
        "Companion",
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
.field public static final Companion:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;


# instance fields
.field private bucketId:Ljava/lang/String;

.field private data:Ljava/lang/String;

.field private dateModified:Ljava/lang/Long;

.field private dateTaken:Ljava/lang/Long;

.field private displayName:Ljava/lang/String;

.field private duration:Ljava/lang/Long;

.field private height:Ljava/lang/Integer;

.field private width:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->Companion:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final build()Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;
    .locals 9

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->displayName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->height:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->width:Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->dateTaken:Ljava/lang/Long;

    .line 10
    .line 11
    iget-object v5, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->dateModified:Ljava/lang/Long;

    .line 12
    .line 13
    iget-object v6, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->duration:Ljava/lang/Long;

    .line 14
    .line 15
    iget-object v7, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->data:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->bucketId:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v8}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final set(Landroid/database/Cursor;Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "property"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    aget v0, v0, v1

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    new-instance p1, Li7/m;

    .line 23
    .line 24
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :pswitch_0
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getString(Landroid/database/Cursor;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->bucketId:Ljava/lang/String;

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getLong(Landroid/database/Cursor;)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->duration:Ljava/lang/Long;

    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getLong(Landroid/database/Cursor;)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->dateModified:Ljava/lang/Long;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_3
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getLong(Landroid/database/Cursor;)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->dateTaken:Ljava/lang/Long;

    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_4
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getInt(Landroid/database/Cursor;)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->width:Ljava/lang/Integer;

    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_5
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getInt(Landroid/database/Cursor;)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->height:Ljava/lang/Integer;

    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_6
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getString(Landroid/database/Cursor;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->displayName:Ljava/lang/String;

    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_7
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->getString(Landroid/database/Cursor;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItemBuilder;->data:Ljava/lang/String;

    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
