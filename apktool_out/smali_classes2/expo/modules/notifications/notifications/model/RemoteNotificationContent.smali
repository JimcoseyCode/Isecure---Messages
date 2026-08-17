.class public final Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/notifications/notifications/interfaces/INotificationContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u0016\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0004\n\u0002\u0008\u0005\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u001a\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001f\u001a\u0004\u0008#\u0010!R\u001a\u0010$\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\u0010R\u001c\u0010\'\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u001f\u001a\u0004\u0008(\u0010!R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u001a\u00103\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00083\u0010%\u001a\u0004\u00083\u0010\u0010R\u0017\u00104\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010%\u001a\u0004\u00084\u0010\u0010R\u001c\u00105\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00085\u0010\u001f\u001a\u0004\u00086\u0010!R\u001a\u00107\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00087\u0010%\u001a\u0004\u00087\u0010\u0010R\u001c\u00108\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u0010\u001f\u001a\u0004\u00089\u0010!R\u001c\u0010:\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R\u0014\u0010?\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010\u0010R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010BR\u0016\u0010G\u001a\u0004\u0018\u00010D8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010F\u00a8\u0006I"
    }
    d2 = {
        "Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;",
        "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "remoteMessage",
        "<init>",
        "(Lcom/google/firebase/messaging/RemoteMessage;)V",
        "Landroid/os/Parcel;",
        "parcel",
        "(Landroid/os/Parcel;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/Bitmap;",
        "getImage",
        "(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;",
        "",
        "containsImage",
        "()Z",
        "",
        "describeContents",
        "()I",
        "dest",
        "flags",
        "Li7/B;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "Lexpo/modules/notifications/notifications/model/NotificationData;",
        "notificationData",
        "Ljava/util/Map;",
        "",
        "title",
        "Ljava/lang/String;",
        "getTitle",
        "()Ljava/lang/String;",
        "text",
        "getText",
        "shouldPlayDefaultSound",
        "Z",
        "getShouldPlayDefaultSound",
        "soundName",
        "getSoundName",
        "",
        "vibrationPattern",
        "[J",
        "getVibrationPattern",
        "()[J",
        "Lorg/json/JSONObject;",
        "body",
        "Lorg/json/JSONObject;",
        "getBody",
        "()Lorg/json/JSONObject;",
        "isAutoDismiss",
        "isDataOnly",
        "categoryId",
        "getCategoryId",
        "isSticky",
        "subText",
        "getSubText",
        "badgeCount",
        "Ljava/lang/Integer;",
        "getBadgeCount",
        "()Ljava/lang/Integer;",
        "getShouldUseDefaultVibrationPattern",
        "shouldUseDefaultVibrationPattern",
        "Lexpo/modules/notifications/notifications/enums/NotificationPriority;",
        "getPriority",
        "()Lexpo/modules/notifications/notifications/enums/NotificationPriority;",
        "priority",
        "",
        "getColor",
        "()Ljava/lang/Number;",
        "color",
        "CREATOR",
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
.field public static final CREATOR:Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;


# instance fields
.field private final badgeCount:Ljava/lang/Integer;

.field private final body:Lorg/json/JSONObject;

.field private final categoryId:Ljava/lang/String;

.field private final isAutoDismiss:Z

.field private final isDataOnly:Z

.field private final isSticky:Z

.field private final notificationData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

.field private final shouldPlayDefaultSound:Z

.field private final soundName:Ljava/lang/String;

.field private final subText:Ljava/lang/String;

.field private final text:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final vibrationPattern:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->CREATOR:Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    const-class v0, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    check-cast p1, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-direct {p0, p1}, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;-><init>(Lcom/google/firebase/messaging/RemoteMessage;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 4

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 2
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->s()Ljava/util/Map;

    move-result-object v0

    const-string v1, "getData(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->constructor-impl(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->notificationData:Ljava/util/Map;

    .line 3
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$b;->w()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getTitle-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->title:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$b;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getMessage-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->text:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$b;->s()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_5

    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getShouldPlayDefaultSound-impl(Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->shouldPlayDefaultSound:Z

    .line 6
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$b;->s()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getSound-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_7
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->soundName:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$b;->z()[J

    move-result-object v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getVibrationPattern-impl(Ljava/util/Map;)[J

    move-result-object v1

    :cond_9
    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->vibrationPattern:[J

    .line 8
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getBody-impl(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->body:Lorg/json/JSONObject;

    .line 9
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getAutoDismiss-impl(Ljava/util/Map;)Z

    move-result v1

    iput-boolean v1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isAutoDismiss:Z

    .line 10
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    move-result-object p1

    if-nez p1, :cond_a

    move v2, v3

    :cond_a
    iput-boolean v2, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isDataOnly:Z

    .line 11
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getCategoryId-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->categoryId:Ljava/lang/String;

    .line 12
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->isSticky-impl(Ljava/util/Map;)Z

    move-result p1

    iput-boolean p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isSticky:Z

    .line 13
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getSubText-impl(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->subText:Ljava/lang/String;

    .line 14
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getBadge-impl(Ljava/util/Map;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->badgeCount:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public containsImage()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage$b;->l()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getBadgeCount()Ljava/lang/Integer;
    .locals 1

    .line 2
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->badgeCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public bridge synthetic getBadgeCount()Ljava/lang/Number;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->getBadgeCount()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getBody()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->body:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCategoryId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->categoryId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getColor()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage$b;->f()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->notificationData:Ljava/util/Map;

    .line 16
    .line 17
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getColor-impl(Ljava/util/Map;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    return-object v0
.end method

.method public getImage(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$b;->l()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move-object v1, p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v0

    .line 17
    :goto_0
    if-eqz v1, :cond_2

    .line 18
    .line 19
    const/4 v7, 0x6

    .line 20
    const/4 v8, 0x0

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    move-object v6, p2

    .line 26
    invoke-static/range {v1 .. v8}, Lexpo/modules/notifications/notifications/presentation/builders/DownloadImageKt;->downloadImage$default(Landroid/net/Uri;JJLn7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-ne p1, p2, :cond_1

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_2
    return-object v0
.end method

.method public getPriority()Lexpo/modules/notifications/notifications/enums/NotificationPriority;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->D0()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->HIGH:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    sget-object v0, Lexpo/modules/notifications/notifications/enums/NotificationPriority;->DEFAULT:Lexpo/modules/notifications/notifications/enums/NotificationPriority;

    .line 14
    .line 15
    return-object v0
.end method

.method public getShouldPlayDefaultSound()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->shouldPlayDefaultSound:Z

    .line 2
    .line 3
    return v0
.end method

.method public getShouldUseDefaultVibrationPattern()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage;->u0()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/messaging/RemoteMessage$b;->i()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->notificationData:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {v0}, Lexpo/modules/notifications/notifications/model/NotificationData;->getShouldUseDefaultVibrationPattern-impl(Ljava/util/Map;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method

.method public getSoundName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->soundName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSubText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->subText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->text:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVibrationPattern()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->vibrationPattern:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public isAutoDismiss()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isAutoDismiss:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isDataOnly()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isDataOnly:Z

    .line 2
    .line 3
    return v0
.end method

.method public isSticky()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->isSticky:Z

    .line 2
    .line 3
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;->remoteMessage:Lcom/google/firebase/messaging/RemoteMessage;

    .line 7
    .line 8
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
