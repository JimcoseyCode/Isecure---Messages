.class public Lexpo/modules/notifications/notifications/model/NotificationContent;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;
.implements Lexpo/modules/notifications/notifications/interfaces/INotificationContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lexpo/modules/notifications/notifications/model/NotificationContent;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x584cbe313dee942L


# instance fields
.field private mAutoDismiss:Z

.field private mBadgeCount:Ljava/lang/Number;

.field private mBody:Lorg/json/JSONObject;

.field private mCategoryId:Ljava/lang/String;

.field private mColor:Ljava/lang/Number;

.field private mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

.field private mShouldPlayDefaultSound:Z

.field private mShouldUseDefaultVibrationPattern:Z

.field private mSound:Landroid/net/Uri;

.field private mSticky:Z

.field private mSubtitle:Ljava/lang/String;

.field private mText:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;

.field private mVibrationPattern:[J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/model/NotificationContent$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/notifications/notifications/model/NotificationContent$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/notifications/notifications/model/NotificationContent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->createLongArray()[J

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 11
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :catch_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 14
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-ne p1, v2, :cond_4

    move v1, v2

    :cond_4
    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    return-void
.end method

.method static bridge synthetic a(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic b(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/Number;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic c(Lexpo/modules/notifications/notifications/model/NotificationContent;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic d(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic e(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/Number;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic f(Lexpo/modules/notifications/notifications/model/NotificationContent;Lexpo/modules/notifications/notifications/enums/NotificationPriority;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic g(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic h(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic i(Lexpo/modules/notifications/notifications/model/NotificationContent;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic j(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic l(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic n(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic o(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic p(Lexpo/modules/notifications/notifications/model/NotificationContent;[J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 2
    .line 3
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Number;

    .line 30
    .line 31
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x1

    .line 39
    if-ne v0, v2, :cond_0

    .line 40
    .line 41
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v0, v1

    .line 44
    :goto_0
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 63
    .line 64
    :goto_1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-ne v0, v2, :cond_2

    .line 69
    .line 70
    move v0, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v0, v1

    .line 73
    :goto_2
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-gez v0, :cond_3

    .line 80
    .line 81
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_3
    new-array v4, v0, [J

    .line 85
    .line 86
    iput-object v4, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 87
    .line 88
    move v4, v1

    .line 89
    :goto_3
    if-ge v4, v0, :cond_4

    .line 90
    .line 91
    iget-object v5, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readLong()J

    .line 94
    .line 95
    .line 96
    move-result-wide v6

    .line 97
    aput-wide v6, v5, v4

    .line 98
    .line 99
    add-int/lit8 v4, v4, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    :goto_4
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/lang/String;

    .line 107
    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_5
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 114
    .line 115
    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iput-object v4, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    :catch_0
    :goto_5
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Ljava/lang/Number;

    .line 125
    .line 126
    if-eqz v0, :cond_6

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-static {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->fromNativeValue(I)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 137
    .line 138
    :cond_6
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Ljava/lang/Number;

    .line 143
    .line 144
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-ne v0, v2, :cond_7

    .line 151
    .line 152
    move v0, v2

    .line 153
    goto :goto_6

    .line 154
    :cond_7
    move v0, v1

    .line 155
    :goto_6
    iput-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Ljava/lang/String;

    .line 162
    .line 163
    if-nez v0, :cond_8

    .line 164
    .line 165
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_8
    new-instance v3, Ljava/lang/String;

    .line 169
    .line 170
    invoke-direct {v3, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iput-object v3, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 174
    .line 175
    :goto_7
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readByte()B

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-ne p1, v2, :cond_9

    .line 180
    .line 181
    move v1, v2

    .line 182
    :cond_9
    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    .line 183
    .line 184
    return-void
.end method

.method private readObjectNoData()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 1
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    move-object v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const/4 v0, -0x1

    .line 50
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    array-length v0, v0

    .line 55
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 59
    .line 60
    array-length v2, v0

    .line 61
    const/4 v3, 0x0

    .line 62
    :goto_1
    if-ge v3, v2, :cond_2

    .line 63
    .line 64
    aget-wide v4, v0, v3

    .line 65
    .line 66
    invoke-virtual {p1, v4, v5}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_2
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move-object v0, v1

    .line 82
    :goto_3
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    move-object v0, v1

    .line 99
    :goto_4
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    :cond_5
    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeByte(I)V

    .line 126
    .line 127
    .line 128
    return-void
.end method


# virtual methods
.method public containsImage()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getBadgeCount()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBody()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCategoryId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getColor()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImage(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const-string p2, "expo.modules.notifications.large_notification_icon"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/16 v2, 0x80

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    return-object p1

    .line 40
    :catch_0
    :cond_0
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method public getPriority()Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShouldPlayDefaultSound()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 2
    .line 3
    return v0
.end method

.method public getShouldUseDefaultVibrationPattern()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSoundName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getSubText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVibrationPattern()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public isAutoDismiss()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 2
    .line 3
    return v0
.end method

.method public isSticky()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    .line 2
    .line 3
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mText:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSubtitle:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBadgeCount:Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 19
    .line 20
    .line 21
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldPlayDefaultSound:Z

    .line 22
    .line 23
    int-to-byte p2, p2

    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSound:Landroid/net/Uri;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 31
    .line 32
    .line 33
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mShouldUseDefaultVibrationPattern:Z

    .line 34
    .line 35
    int-to-byte p2, p2

    .line 36
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mVibrationPattern:[J

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeLongArray([J)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mBody:Lorg/json/JSONObject;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object p2, v0

    .line 55
    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mPriority:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    invoke-virtual {p2}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->getNativeValue()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 71
    .line 72
    .line 73
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mColor:Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 76
    .line 77
    .line 78
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mAutoDismiss:Z

    .line 79
    .line 80
    int-to-byte p2, p2

    .line 81
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mCategoryId:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-boolean p2, p0, Lexpo/modules/notifications/notifications/model/NotificationContent;->mSticky:Z

    .line 90
    .line 91
    int-to-byte p2, p2

    .line 92
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
