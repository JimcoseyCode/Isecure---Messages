.class final Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;->presentNotification(Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.notifications.service.delegates.ExpoPresentationDelegate$presentNotification$1"
    f = "ExpoPresentationDelegate.kt"
    l = {
        0x6a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $behavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

.field final synthetic $notification:Lexpo/modules/notifications/notifications/model/Notification;

.field label:I

.field final synthetic this$0:Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;


# direct methods
.method constructor <init>(Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;",
            "Lexpo/modules/notifications/notifications/model/Notification;",
            "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->this$0:Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$behavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->this$0:Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$behavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;-><init>(Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->this$0:Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;

    .line 28
    .line 29
    iget-object v1, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 30
    .line 31
    iget-object v3, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$behavior:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 32
    .line 33
    iput v2, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->label:I

    .line 34
    .line 35
    invoke-virtual {p1, v1, v3, p0}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;->createNotification(Lexpo/modules/notifications/notifications/model/Notification;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;Ln7/f;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    check-cast p1, Landroid/app/Notification;

    .line 43
    .line 44
    iget-object v0, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->this$0:Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;

    .line 45
    .line 46
    invoke-virtual {v0}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Landroidx/core/app/p;->h(Landroid/content/Context;)Landroidx/core/app/p;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 55
    .line 56
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/model/Notification;->getNotificationRequest()Lexpo/modules/notifications/notifications/model/NotificationRequest;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/model/NotificationRequest;->getIdentifier()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->this$0:Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;

    .line 65
    .line 66
    iget-object v3, p0, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate$presentNotification$1;->$notification:Lexpo/modules/notifications/notifications/model/Notification;

    .line 67
    .line 68
    invoke-virtual {v3}, Lexpo/modules/notifications/notifications/model/Notification;->getNotificationRequest()Lexpo/modules/notifications/notifications/model/NotificationRequest;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, Lexpo/modules/notifications/service/delegates/ExpoPresentationDelegate;->getNotifyId(Lexpo/modules/notifications/notifications/model/NotificationRequest;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {v0, v1, v2, p1}, Landroidx/core/app/p;->o(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Li7/B;->a:Li7/B;

    .line 80
    .line 81
    return-object p1
.end method
