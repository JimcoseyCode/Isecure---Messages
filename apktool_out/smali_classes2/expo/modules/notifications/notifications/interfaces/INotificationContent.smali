.class public interface abstract Lexpo/modules/notifications/notifications/interfaces/INotificationContent;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0004\n\u0002\u0008\t\n\u0002\u0010\u0016\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000cR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0004R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u000cR\u0014\u0010\u001b\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0004R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u0016\u0010\'\u001a\u0004\u0018\u00010$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u0014R\u0014\u0010*\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u0004R\u0016\u0010,\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u000cR\u0014\u0010-\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\u0004\u00a8\u0006."
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "Landroid/os/Parcelable;",
        "",
        "containsImage",
        "()Z",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/Bitmap;",
        "getImage",
        "(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;",
        "",
        "getTitle",
        "()Ljava/lang/String;",
        "title",
        "getText",
        "text",
        "getSubText",
        "subText",
        "",
        "getBadgeCount",
        "()Ljava/lang/Number;",
        "badgeCount",
        "getShouldPlayDefaultSound",
        "shouldPlayDefaultSound",
        "getSoundName",
        "soundName",
        "getShouldUseDefaultVibrationPattern",
        "shouldUseDefaultVibrationPattern",
        "",
        "getVibrationPattern",
        "()[J",
        "vibrationPattern",
        "Lorg/json/JSONObject;",
        "getBody",
        "()Lorg/json/JSONObject;",
        "body",
        "Lexpo/modules/notifications/notifications/enums/NotificationPriority;",
        "getPriority",
        "()Lexpo/modules/notifications/notifications/enums/NotificationPriority;",
        "priority",
        "getColor",
        "color",
        "isAutoDismiss",
        "getCategoryId",
        "categoryId",
        "isSticky",
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
.method public abstract containsImage()Z
.end method

.method public abstract getBadgeCount()Ljava/lang/Number;
.end method

.method public abstract getBody()Lorg/json/JSONObject;
.end method

.method public abstract getCategoryId()Ljava/lang/String;
.end method

.method public abstract getColor()Ljava/lang/Number;
.end method

.method public abstract getImage(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPriority()Lexpo/modules/notifications/notifications/enums/NotificationPriority;
.end method

.method public abstract getShouldPlayDefaultSound()Z
.end method

.method public abstract getShouldUseDefaultVibrationPattern()Z
.end method

.method public abstract getSoundName()Ljava/lang/String;
.end method

.method public abstract getSubText()Ljava/lang/String;
.end method

.method public abstract getText()Ljava/lang/String;
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getVibrationPattern()[J
.end method

.method public abstract isAutoDismiss()Z
.end method

.method public abstract isSticky()Z
.end method
