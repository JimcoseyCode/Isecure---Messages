.class public Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final HANDLE_NOTIFICATION_EVENT_NAME:Ljava/lang/String; = "onHandleNotification"

.field private static final HANDLE_NOTIFICATION_TIMEOUT_EVENT_NAME:Ljava/lang/String; = "onHandleNotificationTimeout"

.field private static final SECONDS_TO_TIMEOUT:I = 0x3


# instance fields
.field private mContext:Landroid/content/Context;

.field private mDelegate:Lexpo/modules/notifications/notifications/handling/NotificationsHandler;

.field private mEventEmitter:Lexpo/modules/core/interfaces/services/EventEmitter;

.field private mHandler:Landroid/os/Handler;

.field private mNotification:Lexpo/modules/notifications/notifications/model/Notification;

.field private mTimeoutRunnable:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Landroid/content/Context;Lexpo/modules/core/interfaces/services/EventEmitter;Landroid/os/Handler;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/handling/NotificationsHandler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/notifications/notifications/handling/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lexpo/modules/notifications/notifications/handling/a;-><init>(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mTimeoutRunnable:Ljava/lang/Runnable;

    .line 10
    .line 11
    iput-object p1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mContext:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p3, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mHandler:Landroid/os/Handler;

    .line 14
    .line 15
    iput-object p2, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mEventEmitter:Lexpo/modules/core/interfaces/services/EventEmitter;

    .line 16
    .line 17
    iput-object p4, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mNotification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 18
    .line 19
    iput-object p5, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mDelegate:Lexpo/modules/notifications/notifications/handling/NotificationsHandler;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->handleTimeout()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic b(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic c(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic d(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)Lexpo/modules/notifications/notifications/model/Notification;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mNotification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->finish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private finish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mTimeoutRunnable:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mDelegate:Lexpo/modules/notifications/notifications/handling/NotificationsHandler;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lexpo/modules/notifications/notifications/handling/NotificationsHandler;->onTaskFinished(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private handleTimeout()V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->getIdentifier()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mNotification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 16
    .line 17
    invoke-static {v1}, Lexpo/modules/notifications/notifications/NotificationSerializer;->toBundle(Lexpo/modules/notifications/notifications/model/Notification;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "notification"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mEventEmitter:Lexpo/modules/core/interfaces/services/EventEmitter;

    .line 27
    .line 28
    const-string v2, "onHandleNotificationTimeout"

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Lexpo/modules/core/interfaces/services/EventEmitter;->emit(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->finish()V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method getIdentifier()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mNotification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/Notification;->getNotificationRequest()Lexpo/modules/notifications/notifications/model/NotificationRequest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/NotificationRequest;->getIdentifier()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method processNotificationWithBehavior(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Lexpo/modules/kotlin/Promise;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;-><init>(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Lexpo/modules/kotlin/Promise;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method start()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->getIdentifier()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mNotification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 16
    .line 17
    invoke-static {v1}, Lexpo/modules/notifications/notifications/NotificationSerializer;->toBundle(Lexpo/modules/notifications/notifications/model/Notification;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "notification"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mEventEmitter:Lexpo/modules/core/interfaces/services/EventEmitter;

    .line 27
    .line 28
    const-string v2, "onHandleNotification"

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Lexpo/modules/core/interfaces/services/EventEmitter;->emit(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mHandler:Landroid/os/Handler;

    .line 34
    .line 35
    iget-object v1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->mTimeoutRunnable:Ljava/lang/Runnable;

    .line 36
    .line 37
    const-wide/16 v2, 0xbb8

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method stop()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->finish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
