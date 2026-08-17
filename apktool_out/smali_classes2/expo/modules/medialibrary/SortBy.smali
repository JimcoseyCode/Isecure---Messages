.class public final enum Lexpo/modules/medialibrary/SortBy;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/medialibrary/SortBy$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/medialibrary/SortBy;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u0000 \u00112\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/medialibrary/SortBy;",
        "",
        "keyName",
        "",
        "mediaColumnName",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getKeyName",
        "()Ljava/lang/String;",
        "getMediaColumnName",
        "DEFAULT",
        "CREATION_TIME",
        "MODIFICATION_TIME",
        "MEDIA_TYPE",
        "WIDTH",
        "HEIGHT",
        "DURATION",
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

.field private static final synthetic $VALUES:[Lexpo/modules/medialibrary/SortBy;

.field public static final enum CREATION_TIME:Lexpo/modules/medialibrary/SortBy;

.field public static final Companion:Lexpo/modules/medialibrary/SortBy$Companion;

.field public static final enum DEFAULT:Lexpo/modules/medialibrary/SortBy;

.field public static final enum DURATION:Lexpo/modules/medialibrary/SortBy;

.field public static final enum HEIGHT:Lexpo/modules/medialibrary/SortBy;

.field public static final enum MEDIA_TYPE:Lexpo/modules/medialibrary/SortBy;

.field public static final enum MODIFICATION_TIME:Lexpo/modules/medialibrary/SortBy;

.field public static final enum WIDTH:Lexpo/modules/medialibrary/SortBy;


# instance fields
.field private final keyName:Ljava/lang/String;

.field private final mediaColumnName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/medialibrary/SortBy;
    .locals 7

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/SortBy;->DEFAULT:Lexpo/modules/medialibrary/SortBy;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/medialibrary/SortBy;->CREATION_TIME:Lexpo/modules/medialibrary/SortBy;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/medialibrary/SortBy;->MODIFICATION_TIME:Lexpo/modules/medialibrary/SortBy;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/medialibrary/SortBy;->MEDIA_TYPE:Lexpo/modules/medialibrary/SortBy;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/medialibrary/SortBy;->WIDTH:Lexpo/modules/medialibrary/SortBy;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/medialibrary/SortBy;->HEIGHT:Lexpo/modules/medialibrary/SortBy;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/medialibrary/SortBy;->DURATION:Lexpo/modules/medialibrary/SortBy;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lexpo/modules/medialibrary/SortBy;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/SortBy;

    .line 2
    .line 3
    const-string v1, "default"

    .line 4
    .line 5
    const-string v2, "_id"

    .line 6
    .line 7
    const-string v3, "DEFAULT"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lexpo/modules/medialibrary/SortBy;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->DEFAULT:Lexpo/modules/medialibrary/SortBy;

    .line 14
    .line 15
    new-instance v0, Lexpo/modules/medialibrary/SortBy;

    .line 16
    .line 17
    const-string v1, "creationTime"

    .line 18
    .line 19
    const-string v2, "datetaken"

    .line 20
    .line 21
    const-string v3, "CREATION_TIME"

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v0, v3, v4, v1, v2}, Lexpo/modules/medialibrary/SortBy;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->CREATION_TIME:Lexpo/modules/medialibrary/SortBy;

    .line 28
    .line 29
    new-instance v0, Lexpo/modules/medialibrary/SortBy;

    .line 30
    .line 31
    const-string v1, "modificationTime"

    .line 32
    .line 33
    const-string v2, "date_modified"

    .line 34
    .line 35
    const-string v3, "MODIFICATION_TIME"

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    invoke-direct {v0, v3, v4, v1, v2}, Lexpo/modules/medialibrary/SortBy;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->MODIFICATION_TIME:Lexpo/modules/medialibrary/SortBy;

    .line 42
    .line 43
    new-instance v0, Lexpo/modules/medialibrary/SortBy;

    .line 44
    .line 45
    const-string v1, "mediaType"

    .line 46
    .line 47
    const-string v2, "media_type"

    .line 48
    .line 49
    const-string v3, "MEDIA_TYPE"

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    invoke-direct {v0, v3, v4, v1, v2}, Lexpo/modules/medialibrary/SortBy;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->MEDIA_TYPE:Lexpo/modules/medialibrary/SortBy;

    .line 56
    .line 57
    new-instance v0, Lexpo/modules/medialibrary/SortBy;

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    const-string v2, "width"

    .line 61
    .line 62
    const-string v3, "WIDTH"

    .line 63
    .line 64
    invoke-direct {v0, v3, v1, v2, v2}, Lexpo/modules/medialibrary/SortBy;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->WIDTH:Lexpo/modules/medialibrary/SortBy;

    .line 68
    .line 69
    new-instance v0, Lexpo/modules/medialibrary/SortBy;

    .line 70
    .line 71
    const/4 v1, 0x5

    .line 72
    const-string v2, "height"

    .line 73
    .line 74
    const-string v3, "HEIGHT"

    .line 75
    .line 76
    invoke-direct {v0, v3, v1, v2, v2}, Lexpo/modules/medialibrary/SortBy;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->HEIGHT:Lexpo/modules/medialibrary/SortBy;

    .line 80
    .line 81
    new-instance v0, Lexpo/modules/medialibrary/SortBy;

    .line 82
    .line 83
    const/4 v1, 0x6

    .line 84
    const-string v2, "duration"

    .line 85
    .line 86
    const-string v3, "DURATION"

    .line 87
    .line 88
    invoke-direct {v0, v3, v1, v2, v2}, Lexpo/modules/medialibrary/SortBy;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->DURATION:Lexpo/modules/medialibrary/SortBy;

    .line 92
    .line 93
    invoke-static {}, Lexpo/modules/medialibrary/SortBy;->$values()[Lexpo/modules/medialibrary/SortBy;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->$VALUES:[Lexpo/modules/medialibrary/SortBy;

    .line 98
    .line 99
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 104
    .line 105
    new-instance v0, Lexpo/modules/medialibrary/SortBy$Companion;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-direct {v0, v1}, Lexpo/modules/medialibrary/SortBy$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 109
    .line 110
    .line 111
    sput-object v0, Lexpo/modules/medialibrary/SortBy;->Companion:Lexpo/modules/medialibrary/SortBy$Companion;

    .line 112
    .line 113
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/medialibrary/SortBy;->keyName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lexpo/modules/medialibrary/SortBy;->mediaColumnName:Ljava/lang/String;

    .line 7
    .line 8
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
    sget-object v0, Lexpo/modules/medialibrary/SortBy;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/medialibrary/SortBy;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/medialibrary/SortBy;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/medialibrary/SortBy;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/medialibrary/SortBy;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/SortBy;->$VALUES:[Lexpo/modules/medialibrary/SortBy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/medialibrary/SortBy;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getKeyName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/SortBy;->keyName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMediaColumnName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/SortBy;->mediaColumnName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
