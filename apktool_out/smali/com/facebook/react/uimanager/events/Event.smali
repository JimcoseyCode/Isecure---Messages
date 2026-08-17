.class public abstract Lcom/facebook/react/uimanager/events/Event;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/Event$Companion;,
        Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/facebook/react/uimanager/events/Event<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\n\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008&\u0018\u0000 C*\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0002DCB\t\u0008\u0014\u00a2\u0006\u0004\u0008\u0003\u0010\u0004B\u0011\u0008\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0003\u0010\u0007B\u0019\u0008\u0014\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0003\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u0007J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000eJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0013\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00002\u000c\u0010\u0012\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0000H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0004J\r\u0010\u0019\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0019\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0014\u00a2\u0006\u0004\u0008\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0000\u00a2\u0006\u0004\u0008$\u0010#J\u000f\u0010&\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010)\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008(\u0010\'J\u000f\u0010*\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\u0008*\u0010\u0011J\u000f\u0010,\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008+\u0010\u0011J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008.\u0010/R$\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00081\u0010\u0011R$\u0010\u0008\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010\'R$\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00058\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00085\u0010\'R$\u0010\r\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u00106\u001a\u0004\u00087\u00108R\u0017\u00109\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u00089\u00103\u001a\u0004\u0008:\u0010\'R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0011\u0010?\u001a\u00020\u001a8G\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010\u001cR\u0016\u0010B\u001a\u0004\u0018\u00010;8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010A\u00a8\u0006E"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/events/Event;",
        "T",
        "",
        "<init>",
        "()V",
        "",
        "viewTag",
        "(I)V",
        "surfaceId",
        "(II)V",
        "Li7/B;",
        "init",
        "",
        "timestampMs",
        "(IIJ)V",
        "",
        "canCoalesce",
        "()Z",
        "otherEvent",
        "coalesce",
        "(Lcom/facebook/react/uimanager/events/Event;)Lcom/facebook/react/uimanager/events/Event;",
        "",
        "getCoalescingKey",
        "()S",
        "onDispose",
        "dispose",
        "",
        "getEventName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/uimanager/events/RCTEventEmitter;",
        "rctEventEmitter",
        "dispatch",
        "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V",
        "Lcom/facebook/react/bridge/WritableMap;",
        "getEventData",
        "()Lcom/facebook/react/bridge/WritableMap;",
        "internal_getEventData$ReactAndroid_release",
        "internal_getEventData",
        "getEventCategory",
        "()I",
        "internal_getEventCategory$ReactAndroid_release",
        "internal_getEventCategory",
        "experimental_isSynchronous",
        "internal_experimental_isSynchronous$ReactAndroid_release",
        "internal_experimental_isSynchronous",
        "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;",
        "dispatchModern",
        "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V",
        "value",
        "isInitialized",
        "Z",
        "I",
        "getSurfaceId",
        "getViewTag",
        "J",
        "getTimestampMs",
        "()J",
        "uniqueID",
        "getUniqueID",
        "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;",
        "eventAnimationDriverMatchSpecCached",
        "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;",
        "internal_getEventNameCompat",
        "eventName",
        "getEventAnimationDriverMatchSpec",
        "()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;",
        "eventAnimationDriverMatchSpec",
        "Companion",
        "EventAnimationDriverMatchSpec",
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


# static fields
.field private static final Companion:Lcom/facebook/react/uimanager/events/Event$Companion;

.field private static uniqueIdCounter:I


# instance fields
.field private eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;

.field private isInitialized:Z

.field private surfaceId:I

.field private timestampMs:J

.field private final uniqueID:I

.field private viewTag:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/Event$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/Event$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/events/Event;->Companion:Lcom/facebook/react/uimanager/events/Event$Companion;

    .line 8
    .line 9
    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lcom/facebook/react/uimanager/events/Event;->uniqueIdCounter:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/Event;->uniqueIdCounter:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/Event;->uniqueID:I

    return-void
.end method

.method protected constructor <init>(I)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget v0, Lcom/facebook/react/uimanager/events/Event;->uniqueIdCounter:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/Event;->uniqueIdCounter:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/Event;->uniqueID:I

    .line 5
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/events/Event;->init(I)V

    return-void
.end method

.method protected constructor <init>(II)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget v0, Lcom/facebook/react/uimanager/events/Event;->uniqueIdCounter:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/Event;->uniqueIdCounter:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/Event;->uniqueID:I

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;->init(II)V

    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public coalesce(Lcom/facebook/react/uimanager/events/Event;)Lcom/facebook/react/uimanager/events/Event;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;)",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/uimanager/events/Event;->timestampMs:J

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-wide v2, p1, Lcom/facebook/react/uimanager/events/Event;->timestampMs:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    :goto_0
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-ltz v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    return-object p1
.end method

.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 3

    .line 1
    const-string v0, "rctEventEmitter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/react/uimanager/events/Event;->viewTag:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->internal_getEventNameCompat()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 9

    .line 1
    const-string v0, "rctEventEmitter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v2, p0, Lcom/facebook/react/uimanager/events/Event;->surfaceId:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq v2, v0, :cond_0

    .line 10
    .line 11
    iget v3, p0, Lcom/facebook/react/uimanager/events/Event;->viewTag:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->internal_getEventNameCompat()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->canCoalesce()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getCoalescingKey()S

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getEventCategory()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    move-object v1, p1

    .line 34
    invoke-interface/range {v1 .. v8}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    move-object v1, p1

    .line 39
    invoke-virtual {p0, v1}, Lcom/facebook/react/uimanager/events/Event;->dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/Event;->isInitialized:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->onDispose()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected experimental_isSynchronous()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getCoalescingKey()S
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/Event;->eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/events/Event$eventAnimationDriverMatchSpec$1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/Event$eventAnimationDriverMatchSpec$1;-><init>(Lcom/facebook/react/uimanager/events/Event;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/Event;->eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/Event;->eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;

    .line 13
    .line 14
    return-object v0
.end method

.method protected getEventCategory()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public abstract getEventName()Ljava/lang/String;
.end method

.method public final getSurfaceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/Event;->surfaceId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTimestampMs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/uimanager/events/Event;->timestampMs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getUniqueID()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/Event;->uniqueID:I

    .line 2
    .line 3
    return v0
.end method

.method public final getViewTag()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/Event;->viewTag:I

    .line 2
    .line 3
    return v0
.end method

.method protected final init(I)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/uimanager/events/Event;->init(II)V

    return-void
.end method

.method protected final init(II)V
    .locals 2

    .line 6
    invoke-static {}, Lcom/facebook/react/common/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/facebook/react/uimanager/events/Event;->init(IIJ)V

    return-void
.end method

.method protected final init(IIJ)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/facebook/react/uimanager/events/Event;->surfaceId:I

    .line 3
    iput p2, p0, Lcom/facebook/react/uimanager/events/Event;->viewTag:I

    .line 4
    iput-wide p3, p0, Lcom/facebook/react/uimanager/events/Event;->timestampMs:J

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/Event;->isInitialized:Z

    return-void
.end method

.method public final internal_experimental_isSynchronous$ReactAndroid_release()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->experimental_isSynchronous()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final internal_getEventCategory$ReactAndroid_release()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getEventCategory()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final internal_getEventData$ReactAndroid_release()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final internal_getEventNameCompat()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getEventName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/Event;->isInitialized:Z

    .line 2
    .line 3
    return v0
.end method

.method public onDispose()V
    .locals 0

    .line 1
    return-void
.end method
