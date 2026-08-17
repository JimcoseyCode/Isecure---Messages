.class public final enum Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u0086\u0081\u0002\u0018\u0000 \u00192\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0012J\u000c\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u0012\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0012\u00a2\u0006\u0002\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;",
        "",
        "column",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getColumn",
        "()Ljava/lang/String;",
        "DisplayName",
        "Height",
        "Width",
        "DateTaken",
        "DateModified",
        "Duration",
        "Data",
        "BucketId",
        "columnIndex",
        "",
        "Landroid/database/Cursor;",
        "getString",
        "getInt",
        "(Landroid/database/Cursor;)Ljava/lang/Integer;",
        "getLong",
        "",
        "(Landroid/database/Cursor;)Ljava/lang/Long;",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final enum BucketId:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final Companion:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty$Companion;

.field public static final enum Data:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final enum DateModified:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final enum DateTaken:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final enum DisplayName:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final enum Duration:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final enum Height:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

.field public static final enum Width:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;


# instance fields
.field private final column:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;
    .locals 8

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DisplayName:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Height:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Width:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DateTaken:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DateModified:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Duration:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Data:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 14
    .line 15
    sget-object v7, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->BucketId:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "_display_name"

    .line 5
    .line 6
    const-string v3, "DisplayName"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DisplayName:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "height"

    .line 17
    .line 18
    const-string v3, "Height"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Height:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "width"

    .line 29
    .line 30
    const-string v3, "Width"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Width:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "datetaken"

    .line 41
    .line 42
    const-string v3, "DateTaken"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DateTaken:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 48
    .line 49
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "date_modified"

    .line 53
    .line 54
    const-string v3, "DateModified"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->DateModified:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 60
    .line 61
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "duration"

    .line 65
    .line 66
    const-string v3, "Duration"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Duration:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 72
    .line 73
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "_data"

    .line 77
    .line 78
    const-string v3, "Data"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Data:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 84
    .line 85
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    const-string v2, "bucket_id"

    .line 89
    .line 90
    const-string v3, "BucketId"

    .line 91
    .line 92
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->BucketId:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 96
    .line 97
    invoke-static {}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->$values()[Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->$VALUES:[Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 102
    .line 103
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 108
    .line 109
    new-instance v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty$Companion;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    invoke-direct {v0, v1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 113
    .line 114
    .line 115
    sput-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->Companion:Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty$Companion;

    .line 116
    .line 117
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->column:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->$VALUES:[Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final columnIndex(Landroid/database/Cursor;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->column:Ljava/lang/String;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final getColumn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->column:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInt(Landroid/database/Cursor;)Ljava/lang/Integer;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->columnIndex(Landroid/database/Cursor;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final getLong(Landroid/database/Cursor;)Ljava/lang/Long;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->columnIndex(Landroid/database/Cursor;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final getString(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreProperty;->columnIndex(Landroid/database/Cursor;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
