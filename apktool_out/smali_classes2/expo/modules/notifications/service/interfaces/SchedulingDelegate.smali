.class public interface abstract Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00022\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0005H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0004\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/notifications/service/interfaces/SchedulingDelegate;",
        "",
        "Li7/B;",
        "setupScheduledNotifications",
        "()V",
        "",
        "Lexpo/modules/notifications/notifications/model/NotificationRequest;",
        "getAllScheduledNotifications",
        "()Ljava/util/Collection;",
        "",
        "identifier",
        "getScheduledNotification",
        "(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationRequest;",
        "request",
        "scheduleNotification",
        "(Lexpo/modules/notifications/notifications/model/NotificationRequest;)V",
        "triggerNotification",
        "(Ljava/lang/String;)V",
        "identifiers",
        "removeScheduledNotifications",
        "(Ljava/util/Collection;)V",
        "removeAllScheduledNotifications",
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
.method public abstract getAllScheduledNotifications()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lexpo/modules/notifications/notifications/model/NotificationRequest;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getScheduledNotification(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationRequest;
.end method

.method public abstract removeAllScheduledNotifications()V
.end method

.method public abstract removeScheduledNotifications(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract scheduleNotification(Lexpo/modules/notifications/notifications/model/NotificationRequest;)V
.end method

.method public abstract setupScheduledNotifications()V
.end method

.method public abstract triggerNotification(Ljava/lang/String;)V
.end method
