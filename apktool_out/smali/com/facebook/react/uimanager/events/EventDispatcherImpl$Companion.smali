.class public final Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/EventDispatcherImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\n\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;",
        "",
        "<init>",
        "()V",
        "EVENT_COMPARATOR",
        "Ljava/util/Comparator;",
        "Lcom/facebook/react/uimanager/events/Event;",
        "getEventCookie",
        "",
        "viewTag",
        "",
        "eventTypeId",
        "",
        "coalescingKey",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getEventCookie(Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;ISS)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;->getEventCookie(ISS)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method private final getEventCookie(ISS)J
    .locals 5

    .line 1
    int-to-long v0, p1

    .line 2
    int-to-long p1, p2

    .line 3
    const-wide/32 v2, 0xffff

    .line 4
    .line 5
    .line 6
    and-long/2addr p1, v2

    .line 7
    const/16 v4, 0x20

    .line 8
    .line 9
    shl-long/2addr p1, v4

    .line 10
    or-long/2addr p1, v0

    .line 11
    int-to-long v0, p3

    .line 12
    and-long/2addr v0, v2

    .line 13
    const/16 p3, 0x30

    .line 14
    .line 15
    shl-long/2addr v0, p3

    .line 16
    or-long/2addr p1, v0

    .line 17
    return-wide p1
.end method
