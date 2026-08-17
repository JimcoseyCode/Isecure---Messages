.class Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->processNotificationWithBehavior(Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Lexpo/modules/kotlin/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;

.field final synthetic val$behavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

.field final synthetic val$promise:Lexpo/modules/kotlin/Promise;


# direct methods
.method constructor <init>(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Lexpo/modules/kotlin/Promise;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->this$0:Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->val$behavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->val$promise:Lexpo/modules/kotlin/Promise;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->this$0:Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;

    .line 4
    .line 5
    invoke-static {v1}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->b(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->this$0:Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;

    .line 10
    .line 11
    invoke-static {v2}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->d(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)Lexpo/modules/notifications/notifications/model/Notification;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->val$behavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 16
    .line 17
    new-instance v4, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1$1;

    .line 18
    .line 19
    iget-object v5, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->this$0:Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;

    .line 20
    .line 21
    invoke-static {v5}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->c(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-direct {v4, p0, v5}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1$1;-><init>(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;Landroid/os/Handler;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2, v3, v4}, Lexpo/modules/notifications/service/NotificationsService$Companion;->present(Landroid/content/Context;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Landroid/os/ResultReceiver;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask$1;->this$0:Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;

    .line 32
    .line 33
    invoke-static {v0}, Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;->e(Lexpo/modules/notifications/notifications/handling/SingleNotificationHandlerTask;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
