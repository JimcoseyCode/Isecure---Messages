.class public abstract Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/notifications/notifications/interfaces/NotificationBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000 12\u00020\u0001:\u00011B\u0019\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0005\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00088\u0004@BX\u0084\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0011R\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u001f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010!R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0014\u00100\u001a\u00020-8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/\u00a8\u00062"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;",
        "Lexpo/modules/notifications/notifications/interfaces/NotificationBuilder;",
        "Landroid/content/Context;",
        "context",
        "Lexpo/modules/notifications/notifications/model/Notification;",
        "notification",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;)V",
        "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;",
        "behavior",
        "setAllowedBehavior",
        "(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)Lexpo/modules/notifications/notifications/interfaces/NotificationBuilder;",
        "Landroidx/core/app/l$e;",
        "createBuilder",
        "()Landroidx/core/app/l$e;",
        "Landroid/app/NotificationChannel;",
        "createFallbackChannel",
        "()Landroid/app/NotificationChannel;",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Lexpo/modules/notifications/notifications/model/Notification;",
        "getNotification",
        "()Lexpo/modules/notifications/notifications/model/Notification;",
        "value",
        "notificationBehavior",
        "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;",
        "getNotificationBehavior",
        "()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;",
        "getFallbackNotificationChannel",
        "fallbackNotificationChannel",
        "",
        "getFallbackChannelName",
        "()Ljava/lang/String;",
        "fallbackChannelName",
        "Landroid/app/NotificationManager;",
        "getNotificationManager",
        "()Landroid/app/NotificationManager;",
        "notificationManager",
        "getChannelId",
        "channelId",
        "Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;",
        "getNotificationsChannelManager",
        "()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;",
        "notificationsChannelManager",
        "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "getNotificationContent",
        "()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "notificationContent",
        "Companion",
        "expo-notifications_release"
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
.field public static final Companion:Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder$Companion;

.field private static final FALLBACK_CHANNEL_ID:Ljava/lang/String; = "expo_notifications_fallback_notification_channel"

.field private static final FALLBACK_CHANNEL_IMPORTANCE:I


# instance fields
.field private final context:Landroid/content/Context;

.field private final notification:Lexpo/modules/notifications/notifications/model/Notification;

.field private notificationBehavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->Companion:Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder$Companion;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    sput v0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->FALLBACK_CHANNEL_IMPORTANCE:I

    .line 11
    .line 12
    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notification"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->context:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 17
    .line 18
    return-void
.end method

.method private final getFallbackChannelName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->context:Landroid/content/Context;

    .line 2
    .line 3
    sget v1, Lexpo/modules/notifications/R$string;->expo_notifications_fallback_channel_name:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private final getFallbackNotificationChannel()Landroid/app/NotificationChannel;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getNotificationManager()Landroid/app/NotificationManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "expo_notifications_fallback_notification_channel"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ln4/b;->a(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->createFallbackChannel()Landroid/app/NotificationChannel;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    return-object v0
.end method

.method private final getNotificationManager()Landroid/app/NotificationManager;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->context:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "notification"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Landroid/app/NotificationManager;

    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public final createBuilder()Landroidx/core/app/l$e;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getChannelId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroidx/core/app/l$e;

    .line 8
    .line 9
    iget-object v2, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->context:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v1, v2, v0}, Landroidx/core/app/l$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    new-instance v0, Landroidx/core/app/l$e;

    .line 16
    .line 17
    iget-object v1, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->context:Landroid/content/Context;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Landroidx/core/app/l$e;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method protected final createFallbackChannel()Landroid/app/NotificationChannel;
    .locals 3

    .line 1
    invoke-static {}, Lcom/ov/message/d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getFallbackChannelName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->FALLBACK_CHANNEL_IMPORTANCE:I

    .line 9
    .line 10
    const-string v2, "expo_notifications_fallback_notification_channel"

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Ln4/f;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1}, Lcom/ov/message/g;->a(Landroid/app/NotificationChannel;Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/ov/message/h;->a(Landroid/app/NotificationChannel;Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getNotificationManager()Landroid/app/NotificationManager;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1, v0}, Ln4/c;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method protected final getChannelId()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 10
    .line 11
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/Notification;->getNotificationRequest()Lexpo/modules/notifications/notifications/model/NotificationRequest;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/NotificationRequest;->getTrigger()Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :cond_1
    const-string v0, "format(...)"

    .line 22
    .line 23
    const-string v1, "expo_notifications_fallback_notification_channel"

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "Couldn\'t get channel for the notifications - trigger is \'null\'. Fallback to \'%s\' channel"

    .line 39
    .line 40
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getFallbackNotificationChannel()Landroid/app/NotificationChannel;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lexpo/modules/notifications/notifications/channels/serializers/h;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :cond_2
    invoke-interface {v2}, Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;->getNotificationChannel()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-nez v2, :cond_3

    .line 64
    .line 65
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getFallbackNotificationChannel()Landroid/app/NotificationChannel;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lexpo/modules/notifications/notifications/channels/serializers/h;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    :cond_3
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getNotificationsChannelManager()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v3, v2}, Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-nez v3, :cond_4

    .line 86
    .line 87
    sget-object v3, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 88
    .line 89
    const/4 v3, 0x2

    .line 90
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v2, "Channel \'%s\' doesn\'t exists. Fallback to \'%s\' channel"

    .line 99
    .line 100
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->getFallbackNotificationChannel()Landroid/app/NotificationChannel;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lexpo/modules/notifications/notifications/channels/serializers/h;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_4
    invoke-static {v3}, Lexpo/modules/notifications/notifications/channels/serializers/h;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0
.end method

.method protected final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final getNotification()Lexpo/modules/notifications/notifications/model/Notification;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final getNotificationBehavior()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->notificationBehavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final getNotificationContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/Notification;->getNotificationRequest()Lexpo/modules/notifications/notifications/model/NotificationRequest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/NotificationRequest;->getContent()Lexpo/modules/notifications/notifications/interfaces/INotificationContent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getContent(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public getNotificationsChannelManager()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->context:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v2, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;

    .line 6
    .line 7
    invoke-direct {v2, v1}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;-><init>(Landroid/content/Context;Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public setAllowedBehavior(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)Lexpo/modules/notifications/notifications/interfaces/NotificationBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/presentation/builders/BaseNotificationBuilder;->notificationBehavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    return-object p0
.end method
