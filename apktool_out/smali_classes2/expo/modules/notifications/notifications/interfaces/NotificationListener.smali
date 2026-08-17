.class public interface abstract Lexpo/modules/notifications/notifications/interfaces/NotificationListener;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/interfaces/NotificationListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/interfaces/NotificationListener;",
        "",
        "Lexpo/modules/notifications/notifications/model/Notification;",
        "notification",
        "Li7/B;",
        "onNotificationReceived",
        "(Lexpo/modules/notifications/notifications/model/Notification;)V",
        "Lexpo/modules/notifications/notifications/model/NotificationResponse;",
        "response",
        "",
        "onNotificationResponseReceived",
        "(Lexpo/modules/notifications/notifications/model/NotificationResponse;)Z",
        "Landroid/os/Bundle;",
        "extras",
        "onNotificationResponseIntentReceived",
        "(Landroid/os/Bundle;)V",
        "onNotificationsDropped",
        "()V",
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


# virtual methods
.method public abstract onNotificationReceived(Lexpo/modules/notifications/notifications/model/Notification;)V
.end method

.method public abstract onNotificationResponseIntentReceived(Landroid/os/Bundle;)V
.end method

.method public abstract onNotificationResponseReceived(Lexpo/modules/notifications/notifications/model/NotificationResponse;)Z
.end method

.method public abstract onNotificationsDropped()V
.end method
