.class public interface abstract Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# virtual methods
.method public abstract createNotificationChannelGroup(Ljava/lang/String;Ljava/lang/CharSequence;Lexpo/modules/core/arguments/ReadableArguments;)Landroid/app/NotificationChannelGroup;
.end method

.method public abstract deleteNotificationChannelGroup(Ljava/lang/String;)V
.end method

.method public abstract getNotificationChannelGroup(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;
.end method

.method public abstract getNotificationChannelGroups()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannelGroup;",
            ">;"
        }
    .end annotation
.end method
