.class public Lexpo/modules/notifications/service/NotificationsService;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/service/NotificationsService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008 \u0010\u0016J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u001f\u0010%\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u001f\u0010&\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008&\u0010\u0016J\u001f\u0010\'\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u0016J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008(\u0010\u0016J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008)\u0010\u0016J\u001f\u0010*\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008*\u0010\u0016\u00a8\u0006,"
    }
    d2 = {
        "Lexpo/modules/notifications/service/NotificationsService;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lexpo/modules/notifications/service/interfaces/PresentationDelegate;",
        "getPresentationDelegate",
        "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;",
        "Lexpo/modules/notifications/service/interfaces/HandlingDelegate;",
        "getHandlingDelegate",
        "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;",
        "Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;",
        "getCategoriesDelegate",
        "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;",
        "Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;",
        "getSchedulingDelegate",
        "(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;",
        "Landroid/content/Intent;",
        "intent",
        "Li7/B;",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "handleIntent",
        "onPresentNotification",
        "Landroid/os/Bundle;",
        "onGetAllPresentedNotifications",
        "(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;",
        "onDismissNotifications",
        "onDismissAllNotifications",
        "onReceiveNotification",
        "onReceiveNotificationResponse",
        "onNotificationsDropped",
        "onGetCategories",
        "onSetCategory",
        "onDeleteCategory",
        "onGetAllScheduledNotifications",
        "onGetScheduledNotification",
        "onScheduleNotification",
        "onNotificationTriggered",
        "onRemoveScheduledNotifications",
        "onRemoveAllScheduledNotifications",
        "onSetupScheduledNotifications",
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
.field public static final Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

.field private static final DELETE_CATEGORY_TYPE:Ljava/lang/String; = "deleteCategory"

.field private static final DISMISS_ALL_TYPE:Ljava/lang/String; = "dismissAll"

.field private static final DISMISS_SELECTED_TYPE:Ljava/lang/String; = "dismissSelected"

.field private static final DROPPED_TYPE:Ljava/lang/String; = "dropped"

.field public static final ERROR_CODE:I = 0x1

.field public static final EVENT_TYPE_KEY:Ljava/lang/String; = "type"

.field public static final EXCEPTION_KEY:Ljava/lang/String; = "exception"

.field private static final GET_ALL_DISPLAYED_TYPE:Ljava/lang/String; = "getAllDisplayed"

.field private static final GET_ALL_SCHEDULED_TYPE:Ljava/lang/String; = "getAllScheduled"

.field private static final GET_CATEGORIES_TYPE:Ljava/lang/String; = "getCategories"

.field private static final GET_SCHEDULED_TYPE:Ljava/lang/String; = "getScheduled"

.field public static final GOOGLE_MESSAGE_ID_KEY:Ljava/lang/String; = "google.message_id"

.field public static final IDENTIFIERS_KEY:Ljava/lang/String; = "identifiers"

.field public static final IDENTIFIER_KEY:Ljava/lang/String; = "identifier"

.field public static final NOTIFICATIONS_KEY:Ljava/lang/String; = "notifications"

.field public static final NOTIFICATION_ACTION_BYTES_KEY:Ljava/lang/String; = "notificationActionBytes"

.field public static final NOTIFICATION_ACTION_KEY:Ljava/lang/String; = "notificationAction"

.field public static final NOTIFICATION_BEHAVIOR_KEY:Ljava/lang/String; = "notificationBehavior"

.field public static final NOTIFICATION_BYTES_KEY:Ljava/lang/String; = "notificationBytes"

.field public static final NOTIFICATION_CATEGORIES_KEY:Ljava/lang/String; = "notificationCategories"

.field public static final NOTIFICATION_CATEGORY_KEY:Ljava/lang/String; = "notificationCategory"

.field public static final NOTIFICATION_EVENT_ACTION:Ljava/lang/String; = "expo.modules.notifications.NOTIFICATION_EVENT"

.field public static final NOTIFICATION_KEY:Ljava/lang/String; = "notification"

.field public static final NOTIFICATION_REQUESTS_KEY:Ljava/lang/String; = "notificationRequests"

.field public static final NOTIFICATION_REQUEST_KEY:Ljava/lang/String; = "notificationRequest"

.field public static final NOTIFICATION_RESPONSE_KEY:Ljava/lang/String; = "notificationResponse"

.field private static final PRESENT_TYPE:Ljava/lang/String; = "present"

.field public static final RECEIVER_KEY:Ljava/lang/String; = "receiver"

.field private static final RECEIVE_RESPONSE_TYPE:Ljava/lang/String; = "receiveResponse"

.field private static final RECEIVE_TYPE:Ljava/lang/String; = "receive"

.field private static final REMOVE_ALL_TYPE:Ljava/lang/String; = "removeAll"

.field private static final REMOVE_SELECTED_TYPE:Ljava/lang/String; = "removeSelected"

.field private static final SCHEDULE_TYPE:Ljava/lang/String; = "schedule"

.field private static final SETUP_ACTIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final SET_CATEGORY_TYPE:Ljava/lang/String; = "setCategory"

.field public static final SUCCEEDED_KEY:Ljava/lang/String; = "succeeded"

.field public static final SUCCESS_CODE:I = 0x0

.field public static final TEXT_INPUT_NOTIFICATION_RESPONSE_KEY:Ljava/lang/String; = "textInputNotificationResponse"

.field private static final TRIGGER_TYPE:Ljava/lang/String; = "trigger"

.field public static final USER_TEXT_RESPONSE_KEY:Ljava/lang/String; = "userTextResponse"


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lexpo/modules/notifications/service/NotificationsService$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/notifications/service/NotificationsService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    .line 8
    .line 9
    const-string v0, "android.intent.action.QUICKBOOT_POWERON"

    .line 10
    .line 11
    const-string v1, "com.htc.intent.action.QUICKBOOT_POWERON"

    .line 12
    .line 13
    const-string v2, "android.intent.action.BOOT_COMPLETED"

    .line 14
    .line 15
    const-string v3, "android.intent.action.REBOOT"

    .line 16
    .line 17
    const-string v4, "android.intent.action.MY_PACKAGE_REPLACED"

    .line 18
    .line 19
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lexpo/modules/notifications/service/NotificationsService;->SETUP_ACTIONS:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/notifications/service/NotificationsService;->onReceive$lambda$1(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getSETUP_ACTIONS$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->SETUP_ACTIONS:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final onReceive$lambda$1(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)Li7/B;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p2, p3, p0}, Lexpo/modules/notifications/service/NotificationsService;->handleIntent(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 13
    .line 14
    .line 15
    sget-object p0, Li7/B;->a:Li7/B;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method protected getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoCategoriesDelegate;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lexpo/modules/notifications/service/delegates/ExpoCategoriesDelegate;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method protected getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoHandlingDelegate;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lexpo/modules/notifications/service/delegates/ExpoHandlingDelegate;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method protected getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v0, p1, v1, v2, v1}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;-><init>(Landroid/content/Context;Landroidx/core/app/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method protected getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/notifications/service/delegates/ExpoSchedulingDelegate;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lexpo/modules/notifications/service/delegates/ExpoSchedulingDelegate;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public handleIntent(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->SETUP_ACTIONS:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lj7/q;->X(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onSetupScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "expo.modules.notifications.NOTIFICATION_EVENT"

    .line 32
    .line 33
    const-string v2, ". Ignoring."

    .line 34
    .line 35
    if-ne v0, v1, :cond_6

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const-string v3, "receiver"

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v0, v1

    .line 52
    :goto_0
    instance-of v3, v0, Landroid/os/ResultReceiver;

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    check-cast v0, Landroid/os/ResultReceiver;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v0, v1

    .line 60
    :goto_1
    :try_start_0
    const-string v3, "type"

    .line 61
    .line 62
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    sparse-switch v4, :sswitch_data_0

    .line 73
    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :sswitch_0
    const-string v1, "setCategory"

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onSetCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto/16 :goto_2

    .line 90
    .line 91
    :catch_0
    move-exception p1

    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :sswitch_1
    const-string v4, "dropped"

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onNotificationsDropped(Landroid/content/Context;Landroid/content/Intent;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_2

    .line 106
    .line 107
    :sswitch_2
    const-string v4, "removeAll"

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onRemoveAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :sswitch_3
    const-string v4, "receive"

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_4

    .line 127
    .line 128
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onReceiveNotification(Landroid/content/Context;Landroid/content/Intent;)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :sswitch_4
    const-string v1, "getCategories"

    .line 134
    .line 135
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_4

    .line 140
    .line 141
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetCategories(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    goto/16 :goto_2

    .line 146
    .line 147
    :sswitch_5
    const-string v4, "dismissAll"

    .line 148
    .line 149
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_4

    .line 154
    .line 155
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onDismissAllNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_2

    .line 159
    .line 160
    :sswitch_6
    const-string v1, "getScheduled"

    .line 161
    .line 162
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_4

    .line 167
    .line 168
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetScheduledNotification(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    goto/16 :goto_2

    .line 173
    .line 174
    :sswitch_7
    const-string v4, "present"

    .line 175
    .line 176
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eqz v4, :cond_4

    .line 181
    .line 182
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onPresentNotification(Landroid/content/Context;Landroid/content/Intent;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :sswitch_8
    const-string v4, "removeSelected"

    .line 187
    .line 188
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_4

    .line 193
    .line 194
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onRemoveScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :sswitch_9
    const-string v4, "dismissSelected"

    .line 199
    .line 200
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_4

    .line 205
    .line 206
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onDismissNotifications(Landroid/content/Context;Landroid/content/Intent;)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :sswitch_a
    const-string v4, "schedule"

    .line 211
    .line 212
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_4

    .line 217
    .line 218
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onScheduleNotification(Landroid/content/Context;Landroid/content/Intent;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :sswitch_b
    const-string v4, "trigger"

    .line 223
    .line 224
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-eqz v4, :cond_4

    .line 229
    .line 230
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onNotificationTriggered(Landroid/content/Context;Landroid/content/Intent;)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :sswitch_c
    const-string v1, "getAllDisplayed"

    .line 235
    .line 236
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_4

    .line 241
    .line 242
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetAllPresentedNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    goto :goto_2

    .line 247
    :sswitch_d
    const-string v1, "getAllScheduled"

    .line 248
    .line 249
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-eqz v1, :cond_4

    .line 254
    .line 255
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onGetAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    goto :goto_2

    .line 260
    :sswitch_e
    const-string v1, "deleteCategory"

    .line 261
    .line 262
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_4

    .line 267
    .line 268
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onDeleteCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    goto :goto_2

    .line 273
    :sswitch_f
    const-string v4, "receiveResponse"

    .line 274
    .line 275
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_4

    .line 280
    .line 281
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/NotificationsService;->onReceiveNotificationResponse(Landroid/content/Context;Landroid/content/Intent;)V

    .line 282
    .line 283
    .line 284
    :goto_2
    if-eqz v0, :cond_3

    .line 285
    .line 286
    const/4 p1, 0x0

    .line 287
    invoke-virtual {v0, p1, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 288
    .line 289
    .line 290
    sget-object p1, Li7/B;->a:Li7/B;

    .line 291
    .line 292
    :cond_3
    return-void

    .line 293
    :cond_4
    :goto_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 294
    .line 295
    new-instance v1, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const-string v4, "Received event of unrecognized type: "

    .line 301
    .line 302
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    :goto_4
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 326
    .line 327
    .line 328
    if-eqz v0, :cond_5

    .line 329
    .line 330
    new-instance p2, Landroid/os/Bundle;

    .line 331
    .line 332
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v1, "exception"

    .line 336
    .line 337
    invoke-virtual {p2, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 338
    .line 339
    .line 340
    sget-object p1, Li7/B;->a:Li7/B;

    .line 341
    .line 342
    const/4 p1, 0x1

    .line 343
    invoke-virtual {v0, p1, p2}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 344
    .line 345
    .line 346
    :cond_5
    return-void

    .line 347
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 348
    .line 349
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 356
    .line 357
    .line 358
    const-string v1, "Received intent of unrecognized action: "

    .line 359
    .line 360
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw p1

    .line 377
    :sswitch_data_0
    .sparse-switch
        -0x7fcfa7bc -> :sswitch_f
        -0x775b3437 -> :sswitch_e
        -0x6768c17e -> :sswitch_d
        -0x4f12854a -> :sswitch_c
        -0x3f2caa48 -> :sswitch_b
        -0x29996d69 -> :sswitch_a
        -0x226a20bb -> :sswitch_9
        -0x180374c1 -> :sswitch_8
        -0x12f88745 -> :sswitch_7
        -0xa26ce09 -> :sswitch_6
        0x26a6cab7 -> :sswitch_5
        0x3b87fe12 -> :sswitch_4
        0x408272e3 -> :sswitch_3
        0x4c6f0a7d -> :sswitch_2
        0x72c867c0 -> :sswitch_1
        0x79955b80 -> :sswitch_0
    .end sparse-switch
.end method

.method public onDeleteCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    const-string v1, "identifier"

    .line 27
    .line 28
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p2, 0x0

    .line 34
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;->deleteCategory(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const-string p2, "succeeded"

    .line 42
    .line 43
    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public onDismissAllNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->dismissAllNotifications()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onDismissNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const-string v0, "identifiers"

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x0

    .line 29
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2}, Lj7/j;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->dismissNotifications(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public onGetAllPresentedNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->getAllPresentedNotifications()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "notifications"

    .line 30
    .line 31
    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public onGetAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->getAllScheduledNotifications()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "notificationRequests"

    .line 30
    .line 31
    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public onGetCategories(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;->getCategories()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "notificationCategories"

    .line 30
    .line 31
    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public onGetScheduledNotification(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    const-string v1, "identifier"

    .line 27
    .line 28
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p2, 0x0

    .line 34
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->getScheduledNotification(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationRequest;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "notificationRequest"

    .line 42
    .line 43
    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public onNotificationTriggered(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const-string v0, "identifier"

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x0

    .line 29
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->triggerNotification(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onNotificationsDropped(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/HandlingDelegate;->handleNotificationsDropped()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onPresentNotification(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getPresentationDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/PresentationDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string v2, "notification"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lexpo/modules/notifications/notifications/model/Notification;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v1

    .line 32
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    const-string v1, "notificationBehavior"

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    move-object v1, p2

    .line 48
    check-cast v1, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 49
    .line 50
    :cond_1
    invoke-interface {p1, v0, v1}, Lexpo/modules/notifications/service/interfaces/PresentationDelegate;->presentNotification(Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v6, Lexpo/modules/notifications/service/b;

    .line 11
    .line 12
    invoke-direct {v6, p2, v0, p0, p1}, Lexpo/modules/notifications/service/b;-><init>(Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;Lexpo/modules/notifications/service/NotificationsService;Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    const/16 v7, 0x1f

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v1 .. v8}, Lm7/a;->b(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILw7/a;ILjava/lang/Object;)Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onReceiveNotification(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "notification"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    check-cast p2, Lexpo/modules/notifications/notifications/model/Notification;

    .line 25
    .line 26
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/HandlingDelegate;->handleNotification(Lexpo/modules/notifications/notifications/model/Notification;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onReceiveNotificationResponse(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->Companion:Lexpo/modules/notifications/service/NotificationsService$Companion;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lexpo/modules/notifications/service/NotificationsService$Companion;->getNotificationResponseFromBroadcastIntent(Landroid/content/Intent;)Lexpo/modules/notifications/notifications/model/NotificationResponse;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getHandlingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/HandlingDelegate;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/HandlingDelegate;->handleNotificationResponse(Lexpo/modules/notifications/notifications/model/NotificationResponse;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onRemoveAllScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->removeAllScheduledNotifications()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onRemoveScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const-string v0, "identifiers"

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x0

    .line 29
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2}, Lj7/j;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->removeScheduledNotifications(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public onScheduleNotification(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const-string v0, "notificationRequest"

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lexpo/modules/notifications/notifications/model/NotificationRequest;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p2, 0x0

    .line 31
    :goto_0
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->scheduleNotification(Lexpo/modules/notifications/notifications/model/NotificationRequest;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onSetCategory(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getCategoriesDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v1, "notificationCategory"

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, Lexpo/modules/notifications/notifications/model/NotificationCategory;

    .line 30
    .line 31
    invoke-interface {p1, p2}, Lexpo/modules/notifications/service/interfaces/CategoriesDelegate;->setCategory(Lexpo/modules/notifications/notifications/model/NotificationCategory;)Lexpo/modules/notifications/notifications/model/NotificationCategory;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public onSetupScheduledNotifications(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lexpo/modules/notifications/service/NotificationsService;->getSchedulingDelegate(Landroid/content/Context;)Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;->setupScheduledNotifications()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
