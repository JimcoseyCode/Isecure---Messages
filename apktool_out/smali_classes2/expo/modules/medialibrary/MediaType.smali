.class public final enum Lexpo/modules/medialibrary/MediaType;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/medialibrary/MediaType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/medialibrary/MediaType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001b\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/medialibrary/MediaType;",
        "",
        "apiName",
        "",
        "mediaColumn",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V",
        "getApiName",
        "()Ljava/lang/String;",
        "getMediaColumn",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "AUDIO",
        "PHOTO",
        "VIDEO",
        "UNKNOWN",
        "ALL",
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

.field private static final synthetic $VALUES:[Lexpo/modules/medialibrary/MediaType;

.field public static final enum ALL:Lexpo/modules/medialibrary/MediaType;

.field public static final enum AUDIO:Lexpo/modules/medialibrary/MediaType;

.field public static final Companion:Lexpo/modules/medialibrary/MediaType$Companion;

.field public static final enum PHOTO:Lexpo/modules/medialibrary/MediaType;

.field public static final enum UNKNOWN:Lexpo/modules/medialibrary/MediaType;

.field public static final enum VIDEO:Lexpo/modules/medialibrary/MediaType;


# instance fields
.field private final apiName:Ljava/lang/String;

.field private final mediaColumn:Ljava/lang/Integer;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/medialibrary/MediaType;
    .locals 5

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/MediaType;->AUDIO:Lexpo/modules/medialibrary/MediaType;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/medialibrary/MediaType;->PHOTO:Lexpo/modules/medialibrary/MediaType;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/medialibrary/MediaType;->VIDEO:Lexpo/modules/medialibrary/MediaType;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/medialibrary/MediaType;->UNKNOWN:Lexpo/modules/medialibrary/MediaType;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/medialibrary/MediaType;->ALL:Lexpo/modules/medialibrary/MediaType;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lexpo/modules/medialibrary/MediaType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/MediaType;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const-string v3, "AUDIO"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const-string v5, "audio"

    .line 12
    .line 13
    invoke-direct {v0, v3, v4, v5, v2}, Lexpo/modules/medialibrary/MediaType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->AUDIO:Lexpo/modules/medialibrary/MediaType;

    .line 17
    .line 18
    new-instance v0, Lexpo/modules/medialibrary/MediaType;

    .line 19
    .line 20
    const-string v2, "photo"

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const-string v6, "PHOTO"

    .line 28
    .line 29
    invoke-direct {v0, v6, v3, v2, v5}, Lexpo/modules/medialibrary/MediaType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->PHOTO:Lexpo/modules/medialibrary/MediaType;

    .line 33
    .line 34
    new-instance v0, Lexpo/modules/medialibrary/MediaType;

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v5, "VIDEO"

    .line 42
    .line 43
    const-string v6, "video"

    .line 44
    .line 45
    invoke-direct {v0, v5, v1, v6, v3}, Lexpo/modules/medialibrary/MediaType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->VIDEO:Lexpo/modules/medialibrary/MediaType;

    .line 49
    .line 50
    new-instance v0, Lexpo/modules/medialibrary/MediaType;

    .line 51
    .line 52
    const-string v1, "unknown"

    .line 53
    .line 54
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v4, "UNKNOWN"

    .line 59
    .line 60
    invoke-direct {v0, v4, v2, v1, v3}, Lexpo/modules/medialibrary/MediaType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->UNKNOWN:Lexpo/modules/medialibrary/MediaType;

    .line 64
    .line 65
    new-instance v0, Lexpo/modules/medialibrary/MediaType;

    .line 66
    .line 67
    const-string v1, "ALL"

    .line 68
    .line 69
    const/4 v2, 0x4

    .line 70
    const-string v3, "all"

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-direct {v0, v1, v2, v3, v4}, Lexpo/modules/medialibrary/MediaType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V

    .line 74
    .line 75
    .line 76
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->ALL:Lexpo/modules/medialibrary/MediaType;

    .line 77
    .line 78
    invoke-static {}, Lexpo/modules/medialibrary/MediaType;->$values()[Lexpo/modules/medialibrary/MediaType;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->$VALUES:[Lexpo/modules/medialibrary/MediaType;

    .line 83
    .line 84
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 89
    .line 90
    new-instance v0, Lexpo/modules/medialibrary/MediaType$Companion;

    .line 91
    .line 92
    invoke-direct {v0, v4}, Lexpo/modules/medialibrary/MediaType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lexpo/modules/medialibrary/MediaType;->Companion:Lexpo/modules/medialibrary/MediaType$Companion;

    .line 96
    .line 97
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/medialibrary/MediaType;->apiName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lexpo/modules/medialibrary/MediaType;->mediaColumn:Ljava/lang/Integer;

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
    sget-object v0, Lexpo/modules/medialibrary/MediaType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/medialibrary/MediaType;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/medialibrary/MediaType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/medialibrary/MediaType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/medialibrary/MediaType;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/MediaType;->$VALUES:[Lexpo/modules/medialibrary/MediaType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/medialibrary/MediaType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getApiName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/MediaType;->apiName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMediaColumn()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/MediaType;->mediaColumn:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
