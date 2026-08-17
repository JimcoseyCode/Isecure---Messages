.class public interface abstract Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# virtual methods
.method public abstract createNotificationChannel(Ljava/lang/String;Ljava/lang/CharSequence;ILexpo/modules/core/arguments/ReadableArguments;)Landroid/app/NotificationChannel;
.end method

.method public abstract customSoundExists(Lexpo/modules/core/arguments/ReadableArguments;)Z
.end method

.method public abstract deleteNotificationChannel(Ljava/lang/String;)V
.end method

.method public abstract getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;
.end method

.method public abstract getNotificationChannels()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation
.end method
