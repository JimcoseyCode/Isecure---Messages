.class public Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;
.super Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final AUTO_DISMISS_KEY:Ljava/lang/String; = "autoDismiss"

.field private static final BADGE_KEY:Ljava/lang/String; = "badge"

.field private static final BODY_KEY:Ljava/lang/String; = "data"

.field private static final CATEGORY_IDENTIFIER_KEY:Ljava/lang/String; = "categoryIdentifier"

.field private static final COLOR_KEY:Ljava/lang/String; = "color"

.field private static final PRIORITY_KEY:Ljava/lang/String; = "priority"

.field private static final SOUND_KEY:Ljava/lang/String; = "sound"

.field private static final STICKY_KEY:Ljava/lang/String; = "sticky"

.field private static final SUBTITLE_KEY:Ljava/lang/String; = "subtitle"

.field private static final TEXT_KEY:Ljava/lang/String; = "body"

.field private static final TITLE_KEY:Ljava/lang/String; = "title"

.field private static final VIBRATE_KEY:Ljava/lang/String; = "vibrate"


# instance fields
.field private mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/notifications/notifications/SoundResolver;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method protected getAutoDismiss(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 1
    const-string v0, "autoDismiss"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method protected getBadgeCount(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;
    .locals 2

    .line 1
    const-string v0, "badge"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return-object p1
.end method

.method protected getBody(Lexpo/modules/core/arguments/ReadableArguments;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "data"

    .line 3
    .line 4
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getMap(Ljava/lang/String;)Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v1, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :catch_0
    :cond_0
    return-object v0
.end method

.method protected getCategoryId(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "categoryIdentifier"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method protected getColor(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;
    .locals 3

    .line 1
    const-string v0, "color"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object p1

    .line 23
    :catch_0
    :cond_0
    return-object v1
.end method

.method protected getPriority(Lexpo/modules/core/arguments/ReadableArguments;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 1

    .line 1
    const-string v0, "priority"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->fromEnumValue(Ljava/lang/String;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method protected getSound(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;
    .locals 1

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;->resolve(Ljava/lang/String;)Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method protected getSticky(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 1
    const-string v0, "sticky"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method protected getVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)[J
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "vibrate"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getList(Ljava/lang/String;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v0, v0, [J

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_1

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    instance-of v2, v2, Ljava/lang/Number;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    aput-wide v2, v0, v1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v0, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;

    .line 48
    .line 49
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, v1, p1}, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    throw v0
    :try_end_0
    .catch Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :cond_1
    return-object v0

    .line 58
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    return-object p1
.end method

.method public setPayload(Lexpo/modules/core/arguments/ReadableArguments;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 2

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setTitle(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "subtitle"

    .line 12
    .line 13
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setSubtitle(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "body"

    .line 22
    .line 23
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setText(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getBody(Lexpo/modules/core/arguments/ReadableArguments;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setBody(Lorg/json/JSONObject;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getPriority(Lexpo/modules/core/arguments/ReadableArguments;)Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setPriority(Lexpo/modules/notifications/notifications/enums/NotificationPriority;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getBadgeCount(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setBadgeCount(Ljava/lang/Number;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getColor(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/Number;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setColor(Ljava/lang/Number;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getAutoDismiss(Lexpo/modules/core/arguments/ReadableArguments;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setAutoDismiss(Z)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getCategoryId(Lexpo/modules/core/arguments/ReadableArguments;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setCategoryId(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getSticky(Lexpo/modules/core/arguments/ReadableArguments;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setSticky(Z)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->shouldPlayDefaultSound(Lexpo/modules/core/arguments/ReadableArguments;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->useDefaultSound()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getSound(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setSound(Landroid/net/Uri;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->shouldUseDefaultVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->useDefaultVibrationPattern()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_1
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)[J

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->setVibrationPattern([J)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 118
    .line 119
    .line 120
    return-object p0
.end method

.method protected shouldPlayDefaultSound(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v1, v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/notifications/ArgumentsNotificationContentBuilder;->getSound(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method protected shouldUseDefaultVibrationPattern(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 2

    .line 1
    const-string v0, "vibrate"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-interface {p1, v0, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    xor-int/2addr p1, v1

    .line 9
    return p1
.end method
