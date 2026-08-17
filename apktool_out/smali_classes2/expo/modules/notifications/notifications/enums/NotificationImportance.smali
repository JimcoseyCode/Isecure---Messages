.class public final enum Lexpo/modules/notifications/notifications/enums/NotificationImportance;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/notifications/notifications/enums/NotificationImportance;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum HIGH:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum LOW:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum MAX:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum MIN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum NONE:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

.field public static final enum UNSPECIFIED:Lexpo/modules/notifications/notifications/enums/NotificationImportance;


# instance fields
.field private final mEnumValue:I

.field private final mNativeImportance:I


# direct methods
.method private static synthetic $values()[Lexpo/modules/notifications/notifications/enums/NotificationImportance;
    .locals 8

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->UNSPECIFIED:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->NONE:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->MIN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->LOW:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->HIGH:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->MAX:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 14
    .line 15
    sget-object v7, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 2
    .line 3
    const-string v1, "UNSPECIFIED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, -0x3e8

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-direct {v0, v1, v2, v3, v4}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->UNSPECIFIED:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 13
    .line 14
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 15
    .line 16
    const-string v1, "NONE"

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-direct {v0, v1, v4, v2, v3}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->NONE:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 23
    .line 24
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 25
    .line 26
    const-string v1, "MIN"

    .line 27
    .line 28
    const/4 v5, 0x3

    .line 29
    invoke-direct {v0, v1, v3, v4, v5}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->MIN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 33
    .line 34
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 35
    .line 36
    const-string v1, "LOW"

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    invoke-direct {v0, v1, v5, v3, v4}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->LOW:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 43
    .line 44
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 45
    .line 46
    const-string v1, "DEFAULT"

    .line 47
    .line 48
    const/4 v3, 0x5

    .line 49
    invoke-direct {v0, v1, v4, v5, v3}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 53
    .line 54
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 55
    .line 56
    const-string v1, "HIGH"

    .line 57
    .line 58
    const/4 v6, 0x6

    .line 59
    invoke-direct {v0, v1, v3, v4, v6}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->HIGH:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 63
    .line 64
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 65
    .line 66
    const-string v1, "MAX"

    .line 67
    .line 68
    const/4 v4, 0x7

    .line 69
    invoke-direct {v0, v1, v6, v3, v4}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->MAX:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 73
    .line 74
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 75
    .line 76
    const-string v1, "UNKNOWN"

    .line 77
    .line 78
    invoke-direct {v0, v1, v4, v5, v2}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;-><init>(Ljava/lang/String;III)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 82
    .line 83
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->$values()[Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->$VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 88
    .line 89
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->mNativeImportance:I

    .line 5
    .line 6
    iput p4, p0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->mEnumValue:I

    .line 7
    .line 8
    return-void
.end method

.method public static fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/NotificationImportance;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->values()[Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->getEnumValue()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ne v4, p0, :cond_0

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 22
    .line 23
    return-object p0
.end method

.method public static fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/NotificationImportance;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->values()[Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->getNativeValue()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ne v4, p0, :cond_0

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 22
    .line 23
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/NotificationImportance;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/notifications/notifications/enums/NotificationImportance;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->$VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lexpo/modules/notifications/notifications/enums/NotificationImportance;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/notifications/notifications/enums/NotificationImportance;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getEnumValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->mEnumValue:I

    .line 2
    .line 3
    return v0
.end method

.method public getNativeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/NotificationImportance;->mNativeImportance:I

    .line 2
    .line 3
    return v0
.end method
