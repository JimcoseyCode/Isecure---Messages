.class public final enum Lexpo/modules/sharing/ShareType;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/sharing/ShareType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/sharing/ShareType;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/sharing/ShareType;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "Text",
        "Url",
        "Audio",
        "Image",
        "Video",
        "File",
        "Companion",
        "expo-sharing_release"
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

.field private static final synthetic $VALUES:[Lexpo/modules/sharing/ShareType;

.field public static final enum Audio:Lexpo/modules/sharing/ShareType;

.field public static final Companion:Lexpo/modules/sharing/ShareType$Companion;

.field public static final enum File:Lexpo/modules/sharing/ShareType;

.field public static final enum Image:Lexpo/modules/sharing/ShareType;

.field public static final enum Text:Lexpo/modules/sharing/ShareType;

.field public static final enum Url:Lexpo/modules/sharing/ShareType;

.field public static final enum Video:Lexpo/modules/sharing/ShareType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/sharing/ShareType;
    .locals 6

    .line 1
    sget-object v0, Lexpo/modules/sharing/ShareType;->Text:Lexpo/modules/sharing/ShareType;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/sharing/ShareType;->Url:Lexpo/modules/sharing/ShareType;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/sharing/ShareType;->Audio:Lexpo/modules/sharing/ShareType;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/sharing/ShareType;->Image:Lexpo/modules/sharing/ShareType;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/sharing/ShareType;->Video:Lexpo/modules/sharing/ShareType;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/sharing/ShareType;->File:Lexpo/modules/sharing/ShareType;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lexpo/modules/sharing/ShareType;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/sharing/ShareType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "text"

    .line 5
    .line 6
    const-string v3, "Text"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/sharing/ShareType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/sharing/ShareType;->Text:Lexpo/modules/sharing/ShareType;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/sharing/ShareType;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "url"

    .line 17
    .line 18
    const-string v3, "Url"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/sharing/ShareType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/sharing/ShareType;->Url:Lexpo/modules/sharing/ShareType;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/sharing/ShareType;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "audio"

    .line 29
    .line 30
    const-string v3, "Audio"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/sharing/ShareType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/sharing/ShareType;->Audio:Lexpo/modules/sharing/ShareType;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/sharing/ShareType;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "image"

    .line 41
    .line 42
    const-string v3, "Image"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/sharing/ShareType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lexpo/modules/sharing/ShareType;->Image:Lexpo/modules/sharing/ShareType;

    .line 48
    .line 49
    new-instance v0, Lexpo/modules/sharing/ShareType;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "video"

    .line 53
    .line 54
    const-string v3, "Video"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/sharing/ShareType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lexpo/modules/sharing/ShareType;->Video:Lexpo/modules/sharing/ShareType;

    .line 60
    .line 61
    new-instance v0, Lexpo/modules/sharing/ShareType;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "file"

    .line 65
    .line 66
    const-string v3, "File"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/sharing/ShareType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lexpo/modules/sharing/ShareType;->File:Lexpo/modules/sharing/ShareType;

    .line 72
    .line 73
    invoke-static {}, Lexpo/modules/sharing/ShareType;->$values()[Lexpo/modules/sharing/ShareType;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lexpo/modules/sharing/ShareType;->$VALUES:[Lexpo/modules/sharing/ShareType;

    .line 78
    .line 79
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lexpo/modules/sharing/ShareType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 84
    .line 85
    new-instance v0, Lexpo/modules/sharing/ShareType$Companion;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-direct {v0, v1}, Lexpo/modules/sharing/ShareType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lexpo/modules/sharing/ShareType;->Companion:Lexpo/modules/sharing/ShareType$Companion;

    .line 92
    .line 93
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
    iput-object p3, p0, Lexpo/modules/sharing/ShareType;->value:Ljava/lang/String;

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
    sget-object v0, Lexpo/modules/sharing/ShareType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/sharing/ShareType;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/sharing/ShareType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/sharing/ShareType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/sharing/ShareType;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/sharing/ShareType;->$VALUES:[Lexpo/modules/sharing/ShareType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/sharing/ShareType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/sharing/ShareType;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
