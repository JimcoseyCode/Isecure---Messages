.class public final enum Lexpo/modules/notifications/notifications/enums/NotificationPriority;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/notifications/notifications/enums/NotificationPriority;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationPriority;

.field public static final enum DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

.field public static final enum HIGH:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

.field public static final enum LOW:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

.field public static final enum MAX:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

.field public static final enum MIN:Lexpo/modules/notifications/notifications/enums/NotificationPriority;


# instance fields
.field private final mEnumValue:Ljava/lang/String;

.field private final mNativePriority:I


# direct methods
.method private static synthetic $values()[Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 5

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->MIN:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->LOW:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->HIGH:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->MAX:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    const-string v2, "min"

    .line 5
    .line 6
    const-string v3, "MIN"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-direct {v0, v3, v4, v1, v2}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->MIN:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 13
    .line 14
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    const-string v2, "low"

    .line 18
    .line 19
    const-string v3, "LOW"

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-direct {v0, v3, v5, v1, v2}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->LOW:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 26
    .line 27
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 28
    .line 29
    const-string v1, "default"

    .line 30
    .line 31
    const-string v2, "DEFAULT"

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-direct {v0, v2, v3, v4, v1}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 38
    .line 39
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    const-string v2, "high"

    .line 43
    .line 44
    const-string v4, "HIGH"

    .line 45
    .line 46
    invoke-direct {v0, v4, v1, v5, v2}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->HIGH:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 50
    .line 51
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    const-string v2, "max"

    .line 55
    .line 56
    const-string v4, "MAX"

    .line 57
    .line 58
    invoke-direct {v0, v4, v1, v3, v2}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->MAX:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 62
    .line 63
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->$values()[Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->$VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 68
    .line 69
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->mNativePriority:I

    .line 5
    .line 6
    iput-object p4, p0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->mEnumValue:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static fromEnumValue(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->values()[Lexpo/modules/notifications/notifications/enums/NotificationPriority;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getEnumValue()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    return-object v3

    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->values()[Lexpo/modules/notifications/notifications/enums/NotificationPriority;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

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
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->$VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lexpo/modules/notifications/notifications/enums/NotificationPriority;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getEnumValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->mEnumValue:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNativeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->mNativePriority:I

    .line 2
    .line 3
    return v0
.end method
