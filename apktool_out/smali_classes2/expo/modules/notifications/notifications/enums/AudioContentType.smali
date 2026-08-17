.class public final enum Lexpo/modules/notifications/notifications/enums/AudioContentType;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/notifications/notifications/enums/AudioContentType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lexpo/modules/notifications/notifications/enums/AudioContentType;

.field public static final enum MOVIE:Lexpo/modules/notifications/notifications/enums/AudioContentType;

.field public static final enum MUSIC:Lexpo/modules/notifications/notifications/enums/AudioContentType;

.field public static final enum SONIFICIATION:Lexpo/modules/notifications/notifications/enums/AudioContentType;

.field public static final enum SPEECH:Lexpo/modules/notifications/notifications/enums/AudioContentType;

.field public static final enum UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioContentType;


# instance fields
.field private final mEnumValue:I

.field private final mNativeVisibility:I


# direct methods
.method private static synthetic $values()[Lexpo/modules/notifications/notifications/enums/AudioContentType;
    .locals 5

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/notifications/notifications/enums/AudioContentType;->SPEECH:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/notifications/notifications/enums/AudioContentType;->MUSIC:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/notifications/notifications/enums/AudioContentType;->MOVIE:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/notifications/notifications/enums/AudioContentType;->SONIFICIATION:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioContentType;-><init>(Ljava/lang/String;III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 10
    .line 11
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 12
    .line 13
    const-string v1, "SPEECH"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioContentType;-><init>(Ljava/lang/String;III)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->SPEECH:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 20
    .line 21
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 22
    .line 23
    const-string v1, "MUSIC"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioContentType;-><init>(Ljava/lang/String;III)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->MUSIC:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 30
    .line 31
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 32
    .line 33
    const-string v1, "MOVIE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioContentType;-><init>(Ljava/lang/String;III)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->MOVIE:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 40
    .line 41
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 42
    .line 43
    const-string v1, "SONIFICIATION"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioContentType;-><init>(Ljava/lang/String;III)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->SONIFICIATION:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 50
    .line 51
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->$values()[Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->$VALUES:[Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 56
    .line 57
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
    iput p3, p0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->mNativeVisibility:I

    .line 5
    .line 6
    iput p4, p0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->mEnumValue:I

    .line 7
    .line 8
    return-void
.end method

.method public static fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/AudioContentType;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->values()[Lexpo/modules/notifications/notifications/enums/AudioContentType;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->getEnumValue()I

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
    sget-object p0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 22
    .line 23
    return-object p0
.end method

.method public static fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/AudioContentType;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->values()[Lexpo/modules/notifications/notifications/enums/AudioContentType;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->getEnumValue()I

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
    sget-object p0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 22
    .line 23
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/AudioContentType;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/notifications/notifications/enums/AudioContentType;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->$VALUES:[Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lexpo/modules/notifications/notifications/enums/AudioContentType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getEnumValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->mEnumValue:I

    .line 2
    .line 3
    return v0
.end method

.method public getNativeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/AudioContentType;->mNativeVisibility:I

    .line 2
    .line 3
    return v0
.end method
