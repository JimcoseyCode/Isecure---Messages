.class public final enum Lexpo/modules/notifications/notifications/enums/AudioUsage;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/notifications/notifications/enums/AudioUsage;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum ALARM:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum ASSISTANCE_ACCESSIBILITY:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum ASSISTANCE_NAVIGATION_GUIDANCE:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum ASSISTANCE_SONIFICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum GAME:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum MEDIA:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum NOTIFICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum NOTIFICATION_COMMUNICATION_DELAYED:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum NOTIFICATION_COMMUNICATION_INSTANT:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum NOTIFICATION_COMMUNICATION_REQUEST:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum NOTIFICATION_EVENT:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum NOTIFICATION_RINGTONE:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum VOICE_COMMUNICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

.field public static final enum VOICE_COMMUNICATION_SIGNALLING:Lexpo/modules/notifications/notifications/enums/AudioUsage;


# instance fields
.field private final mEnumValue:I

.field private final mNativeVisibility:I


# direct methods
.method private static synthetic $values()[Lexpo/modules/notifications/notifications/enums/AudioUsage;
    .locals 15

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/notifications/notifications/enums/AudioUsage;->MEDIA:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/notifications/notifications/enums/AudioUsage;->VOICE_COMMUNICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/notifications/notifications/enums/AudioUsage;->VOICE_COMMUNICATION_SIGNALLING:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ALARM:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_RINGTONE:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 14
    .line 15
    sget-object v7, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_COMMUNICATION_REQUEST:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 16
    .line 17
    sget-object v8, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_COMMUNICATION_INSTANT:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 18
    .line 19
    sget-object v9, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_COMMUNICATION_DELAYED:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 20
    .line 21
    sget-object v10, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_EVENT:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 22
    .line 23
    sget-object v11, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ASSISTANCE_ACCESSIBILITY:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 24
    .line 25
    sget-object v12, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ASSISTANCE_NAVIGATION_GUIDANCE:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 26
    .line 27
    sget-object v13, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ASSISTANCE_SONIFICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 28
    .line 29
    sget-object v14, Lexpo/modules/notifications/notifications/enums/AudioUsage;->GAME:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 30
    .line 31
    filled-new-array/range {v0 .. v14}, [Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 10
    .line 11
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 12
    .line 13
    const-string v1, "MEDIA"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->MEDIA:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 20
    .line 21
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 22
    .line 23
    const-string v1, "VOICE_COMMUNICATION"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->VOICE_COMMUNICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 30
    .line 31
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 32
    .line 33
    const-string v1, "VOICE_COMMUNICATION_SIGNALLING"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->VOICE_COMMUNICATION_SIGNALLING:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 40
    .line 41
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 42
    .line 43
    const-string v1, "ALARM"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ALARM:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 50
    .line 51
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 52
    .line 53
    const-string v1, "NOTIFICATION"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 60
    .line 61
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 62
    .line 63
    const-string v1, "NOTIFICATION_RINGTONE"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_RINGTONE:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 70
    .line 71
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 72
    .line 73
    const-string v1, "NOTIFICATION_COMMUNICATION_REQUEST"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_COMMUNICATION_REQUEST:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 80
    .line 81
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 82
    .line 83
    const-string v1, "NOTIFICATION_COMMUNICATION_INSTANT"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_COMMUNICATION_INSTANT:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 91
    .line 92
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 93
    .line 94
    const-string v1, "NOTIFICATION_COMMUNICATION_DELAYED"

    .line 95
    .line 96
    const/16 v2, 0x9

    .line 97
    .line 98
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_COMMUNICATION_DELAYED:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 102
    .line 103
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 104
    .line 105
    const-string v1, "NOTIFICATION_EVENT"

    .line 106
    .line 107
    const/16 v2, 0xa

    .line 108
    .line 109
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 110
    .line 111
    .line 112
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->NOTIFICATION_EVENT:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 113
    .line 114
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 115
    .line 116
    const-string v1, "ASSISTANCE_ACCESSIBILITY"

    .line 117
    .line 118
    const/16 v2, 0xb

    .line 119
    .line 120
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ASSISTANCE_ACCESSIBILITY:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 124
    .line 125
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 126
    .line 127
    const-string v1, "ASSISTANCE_NAVIGATION_GUIDANCE"

    .line 128
    .line 129
    const/16 v2, 0xc

    .line 130
    .line 131
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ASSISTANCE_NAVIGATION_GUIDANCE:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 135
    .line 136
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 137
    .line 138
    const-string v1, "ASSISTANCE_SONIFICATION"

    .line 139
    .line 140
    const/16 v2, 0xd

    .line 141
    .line 142
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 143
    .line 144
    .line 145
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->ASSISTANCE_SONIFICATION:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 146
    .line 147
    new-instance v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 148
    .line 149
    const-string v1, "GAME"

    .line 150
    .line 151
    const/16 v2, 0xe

    .line 152
    .line 153
    invoke-direct {v0, v1, v2, v2, v2}, Lexpo/modules/notifications/notifications/enums/AudioUsage;-><init>(Ljava/lang/String;III)V

    .line 154
    .line 155
    .line 156
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->GAME:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 157
    .line 158
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->$values()[Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    sput-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->$VALUES:[Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 163
    .line 164
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
    iput p3, p0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->mNativeVisibility:I

    .line 5
    .line 6
    iput p4, p0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->mEnumValue:I

    .line 7
    .line 8
    return-void
.end method

.method public static fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/AudioUsage;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->values()[Lexpo/modules/notifications/notifications/enums/AudioUsage;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->getEnumValue()I

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
    sget-object p0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 22
    .line 23
    return-object p0
.end method

.method public static fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/AudioUsage;
    .locals 5

    .line 1
    invoke-static {}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->values()[Lexpo/modules/notifications/notifications/enums/AudioUsage;

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
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->getEnumValue()I

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
    sget-object p0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->UNKNOWN:Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 22
    .line 23
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/AudioUsage;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/notifications/notifications/enums/AudioUsage;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->$VALUES:[Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lexpo/modules/notifications/notifications/enums/AudioUsage;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getEnumValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->mEnumValue:I

    .line 2
    .line 3
    return v0
.end method

.method public getNativeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/notifications/notifications/enums/AudioUsage;->mNativeVisibility:I

    .line 2
    .line 3
    return v0
.end method
