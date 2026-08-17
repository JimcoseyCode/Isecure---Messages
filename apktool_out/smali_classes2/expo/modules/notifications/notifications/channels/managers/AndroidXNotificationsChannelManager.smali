.class public Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;


# instance fields
.field private final mNotificationManager:Landroidx/core/app/p;

.field private mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

.field private final mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/core/app/p;->h(Landroid/content/Context;)Landroidx/core/app/p;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/p;

    .line 9
    .line 10
    new-instance v0, Lexpo/modules/notifications/notifications/SoundResolver;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    .line 16
    .line 17
    iput-object p2, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method protected configureChannelWithOptions(Ljava/lang/Object;Lexpo/modules/core/arguments/ReadableArguments;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lexpo/modules/notifications/notifications/channels/managers/d;->a(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_0

    .line 8
    .line 9
    :cond_0
    invoke-static {p1}, Lexpo/modules/notifications/notifications/channels/i;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "bypassDnd"

    .line 14
    .line 15
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p1, v0}, Lexpo/modules/notifications/notifications/channels/managers/f;->a(Landroid/app/NotificationChannel;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    const-string v0, "description"

    .line 29
    .line 30
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p1, v0}, Lcom/ov/message/f;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    const-string v0, "lightColor"

    .line 44
    .line 45
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {p1, v0}, Lcom/ov/message/c;->a(Landroid/app/NotificationChannel;I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    const-string v0, "groupId"

    .line 63
    .line 64
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    .line 75
    .line 76
    invoke-interface {v1, v0}, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;->getNotificationChannelGroup(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    iget-object v1, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationsChannelGroupManager:Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;

    .line 83
    .line 84
    new-instance v2, Lexpo/modules/core/arguments/MapArguments;

    .line 85
    .line 86
    invoke-direct {v2}, Lexpo/modules/core/arguments/MapArguments;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1, v0, v0, v2}, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;->createNotificationChannelGroup(Ljava/lang/String;Ljava/lang/CharSequence;Lexpo/modules/core/arguments/ReadableArguments;)Landroid/app/NotificationChannelGroup;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :cond_4
    invoke-static {v1}, Lexpo/modules/notifications/notifications/channels/managers/g;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {p1, v0}, Lexpo/modules/notifications/notifications/channels/managers/h;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    const-string v0, "lockscreenVisibility"

    .line 101
    .line 102
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/NotificationVisibility;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/enums/NotificationVisibility;->getNativeValue()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-static {p1, v0}, Lexpo/modules/notifications/notifications/channels/managers/i;->a(Landroid/app/NotificationChannel;I)V

    .line 123
    .line 124
    .line 125
    :cond_6
    const-string v0, "showBadge"

    .line 126
    .line 127
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-static {p1, v0}, Lcom/ov/message/g;->a(Landroid/app/NotificationChannel;Z)V

    .line 138
    .line 139
    .line 140
    :cond_7
    const-string v0, "sound"

    .line 141
    .line 142
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    const-string v1, "audioAttributes"

    .line 147
    .line 148
    if-nez v0, :cond_8

    .line 149
    .line 150
    invoke-interface {p2, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_9

    .line 155
    .line 156
    :cond_8
    invoke-virtual {p0, p2}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->createSoundUriFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {p2, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getArguments(Ljava/lang/String;)Lexpo/modules/core/arguments/ReadableArguments;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {p0, v1}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->createAttributesFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/media/AudioAttributes;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {p1, v0, v1}, Lexpo/modules/notifications/notifications/channels/managers/j;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 169
    .line 170
    .line 171
    :cond_9
    const-string v0, "vibrationPattern"

    .line 172
    .line 173
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getList(Ljava/lang/String;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {p0, v0}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->createVibrationPatternFromList(Ljava/util/List;)[J

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {p1, v0}, Lexpo/modules/notifications/notifications/channels/managers/e;->a(Landroid/app/NotificationChannel;[J)V

    .line 188
    .line 189
    .line 190
    :cond_a
    const-string v0, "enableLights"

    .line 191
    .line 192
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_b

    .line 197
    .line 198
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    invoke-static {p1, v0}, Lcom/ov/message/b;->a(Landroid/app/NotificationChannel;Z)V

    .line 203
    .line 204
    .line 205
    :cond_b
    const-string v0, "enableVibrate"

    .line 206
    .line 207
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_c

    .line 212
    .line 213
    invoke-interface {p2, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    invoke-static {p1, p2}, Lcom/ov/message/h;->a(Landroid/app/NotificationChannel;Z)V

    .line 218
    .line 219
    .line 220
    :cond_c
    :goto_0
    return-void
.end method

.method protected createAttributesFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/media/AudioAttributes;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "usage"

    .line 11
    .line 12
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/AudioUsage;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/enums/AudioUsage;->getNativeValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 31
    .line 32
    .line 33
    :cond_1
    const-string v1, "contentType"

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->fromEnumValue(I)Lexpo/modules/notifications/notifications/enums/AudioContentType;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/enums/AudioContentType;->getNativeValue()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 54
    .line 55
    .line 56
    :cond_2
    const-string v1, "flags"

    .line 57
    .line 58
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getArguments(Ljava/lang/String;)Lexpo/modules/core/arguments/ReadableArguments;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v1, "enforceAudibility"

    .line 69
    .line 70
    invoke-interface {p1, v1}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const-string v2, "requestHardwareAudioVideoSynchronization"

    .line 75
    .line 76
    invoke-interface {p1, v2}, Lexpo/modules/core/arguments/ReadableArguments;->getBoolean(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    or-int/lit8 v1, v1, 0x10

    .line 83
    .line 84
    :cond_3
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public createNotificationChannel(Ljava/lang/String;Ljava/lang/CharSequence;ILexpo/modules/core/arguments/ReadableArguments;)Landroid/app/NotificationChannel;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Ln4/f;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p2, p4}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->configureChannelWithOptions(Ljava/lang/Object;Lexpo/modules/core/arguments/ReadableArguments;)V

    .line 6
    .line 7
    .line 8
    iget-object p3, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/p;

    .line 9
    .line 10
    invoke-virtual {p3, p2}, Landroidx/core/app/p;->d(Landroid/app/NotificationChannel;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/p;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroidx/core/app/p;->k(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method protected createSoundUriFromArguments(Lexpo/modules/core/arguments/ReadableArguments;)Landroid/net/Uri;
    .locals 2

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;->resolve(Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method protected createVibrationPatternFromList(Ljava/util/List;)[J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [J

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    instance-of v2, v2, Ljava/lang/Number;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    aput-wide v2, v0, v1

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v0, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;

    .line 42
    .line 43
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, v1, p1}, Lexpo/modules/notifications/notifications/channels/InvalidVibrationPatternException;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    return-object v0
.end method

.method public customSoundExists(Lexpo/modules/core/arguments/ReadableArguments;)Z
    .locals 3

    .line 1
    const-string v0, "sound"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-interface {p1, v0}, Lexpo/modules/core/arguments/ReadableArguments;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mSoundResolver:Lexpo/modules/notifications/notifications/SoundResolver;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lexpo/modules/notifications/notifications/SoundResolver;->resourceExists(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public deleteNotificationChannel(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/app/p;->f(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/app/p;->k(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getNotificationChannels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;->mNotificationManager:Landroidx/core/app/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/app/p;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
