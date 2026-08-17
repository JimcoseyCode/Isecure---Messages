.class public final enum Lexpo/modules/notifications/notifications/enums/NotificationVisibility;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/notifications/notifications/enums/NotificationVisibility;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

.field public static final enum PRIVATE:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

.field public static final enum PUBLIC:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

.field public static final enum SECRET:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

.field public static final enum UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;


# instance fields
.field private final mEnumValue:I

.field private final mNativeVisibility:I


# direct methods
.method private static synthetic $values()[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;
    .locals 4

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->PUBLIC:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->PRIVATE:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->SECRET:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;-><init>(Ljava/lang/String;III)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->PUBLIC:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 11
    .line 12
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 13
    .line 14
    const-string v1, "PRIVATE"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v2, v4}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;-><init>(Ljava/lang/String;III)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->PRIVATE:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 21
    .line 22
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 23
    .line 24
    const-string v1, "SECRET"

    .line 25
    .line 26
    const/4 v5, -0x1

    .line 27
    const/4 v6, 0x3

    .line 28
    invoke-direct {v0, v1, v4, v5, v6}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;-><init>(Ljava/lang/String;III)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->SECRET:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 32
    .line 33
    new-instance v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 34
    .line 35
    const-string v1, "UNKNOWN"

    .line 36
    .line 37
    invoke-direct {v0, v1, v6, v3, v2}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;-><init>(Ljava/lang/String;III)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 41
    .line 42
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->$values()[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->$VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 47
    .line 48
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
    iput p3, p0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->mNativeVisibility:I

    .line 5
    .line 6
    iput p4, p0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->mEnumValue:I

    .line 7
    .line 8
    return-void
.end method

.method public static fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/NotificationVisibility;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->values()[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->getEnumValue()I

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
    sget-object p0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 22
    .line 23
    return-object p0
.end method

.method public static fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/NotificationVisibility;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->values()[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->getNativeValue()I

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
    sget-object p0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 22
    .line 23
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/NotificationVisibility;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->$VALUES:[Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getEnumValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->mEnumValue:I

    .line 2
    .line 3
    return v0
.end method

.method public getNativeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->mNativeVisibility:I

    .line 2
    .line 3
    return v0
.end method
