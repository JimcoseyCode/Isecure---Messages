.class public final Lcom/facebook/react/uimanager/JSTouchDispatcher;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J)\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/JSTouchDispatcher;",
        "",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "<init>",
        "(Landroid/view/ViewGroup;)V",
        "",
        "surfaceId",
        "reactTag",
        "Lcom/facebook/react/bridge/ReactContext;",
        "reactContext",
        "Li7/B;",
        "markActiveTouchForTag",
        "(IILcom/facebook/react/bridge/ReactContext;)V",
        "sweepActiveTouchForTag",
        "Landroid/view/MotionEvent;",
        "ev",
        "findTargetTagAndSetCoordinates",
        "(Landroid/view/MotionEvent;)I",
        "androidEvent",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "eventDispatcher",
        "dispatchCancelEvent",
        "(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V",
        "onChildStartedNativeGesture",
        "(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V",
        "onChildEndedNativeGesture",
        "handleTouchEvent",
        "Landroid/view/ViewGroup;",
        "targetTag",
        "I",
        "",
        "targetCoordinates",
        "[F",
        "",
        "childIsHandlingNativeGesture",
        "Z",
        "",
        "gestureStartTime",
        "J",
        "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;",
        "touchEventCoalescingKeyHelper",
        "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;",
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


# instance fields
.field private childIsHandlingNativeGesture:Z

.field private gestureStartTime:J

.field private final targetCoordinates:[F

.field private targetTag:I

.field private final touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

.field private final viewGroup:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "viewGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    iput p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    new-array p1, p1, [F

    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    .line 18
    .line 19
    const-wide/high16 v0, -0x8000000000000000L

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 22
    .line 23
    new-instance p1, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    .line 24
    .line 25
    invoke-direct {p1}, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    .line 29
    .line 30
    return-void
.end method

.method private final dispatchCancelEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 12

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const-string p1, "ReactNative"

    .line 7
    .line 8
    const-string p2, "Can\'t cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?"

    .line 9
    .line 10
    invoke-static {p1, p2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->childIsHandlingNativeGesture:Z

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    xor-int/2addr v0, v1

    .line 18
    const-string v2, "Expected to not have already sent a cancel for this gesture"

    .line 19
    .line 20
    invoke-static {v0, v2}, Lo3/a;->b(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Lo3/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 28
    .line 29
    sget-object v2, Lcom/facebook/react/uimanager/events/TouchEvent;->Companion:Lcom/facebook/react/uimanager/events/TouchEvent$Companion;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget v4, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 38
    .line 39
    sget-object v5, Lcom/facebook/react/uimanager/events/TouchEventType;->CANCEL:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 40
    .line 41
    iget-wide v7, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 42
    .line 43
    iget-object v0, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    aget v9, v0, v6

    .line 47
    .line 48
    aget v10, v0, v1

    .line 49
    .line 50
    iget-object v11, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    .line 51
    .line 52
    move-object v6, p1

    .line 53
    invoke-virtual/range {v2 .. v11}, Lcom/facebook/react/uimanager/events/TouchEvent$Companion;->obtain(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p2, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private final findTargetTagAndSetCoordinates(Landroid/view/MotionEvent;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, p1, v1, v2, v3}, Lcom/facebook/react/uimanager/TouchTargetHelper;->findTargetTagAndCoordinatesForTouch(FFLandroid/view/ViewGroup;[F[I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method private final markActiveTouchForTag(IILcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x2

    .line 5
    invoke-static {p3, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getUIManager(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    invoke-interface {p3, p1, p2}, Lcom/facebook/react/bridge/UIManager;->markActiveTouchForTag(II)V

    .line 12
    .line 13
    .line 14
    :cond_1
    :goto_0
    return-void
.end method

.method private final sweepActiveTouchForTag(IILcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x2

    .line 5
    invoke-static {p3, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getUIManager(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    invoke-interface {p3, p1, p2}, Lcom/facebook/react/bridge/UIManager;->sweepActiveTouchForTag(II)V

    .line 12
    .line 13
    .line 14
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final handleTouchEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->handleTouchEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method

.method public final handleTouchEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "ev"

    move-object/from16 v8, p1

    invoke-static {v8, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "eventDispatcher"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 3
    const-string v4, "ReactNative"

    const/4 v14, -0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v3, :cond_1

    .line 4
    iget v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    if-eq v3, v14, :cond_0

    .line 5
    const-string v3, "Got DOWN touch before receiving UP or CANCEL from last gesture"

    invoke-static {v4, v3}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_0
    iput-boolean v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->childIsHandlingNativeGesture:Z

    .line 7
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 8
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->findTargetTagAndSetCoordinates(Landroid/view/MotionEvent;)I

    move-result v3

    iput v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 9
    iget-object v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {v3}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v3

    .line 10
    iget v4, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    invoke-direct {v0, v3, v4, v2}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->markActiveTouchForTag(IILcom/facebook/react/bridge/ReactContext;)V

    .line 11
    sget-object v4, Lcom/facebook/react/uimanager/events/TouchEvent;->Companion:Lcom/facebook/react/uimanager/events/TouchEvent$Companion;

    .line 12
    iget-object v2, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v2

    move v7, v6

    .line 13
    iget v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    move v9, v7

    .line 14
    sget-object v7, Lcom/facebook/react/uimanager/events/TouchEventType;->START:Lcom/facebook/react/uimanager/events/TouchEventType;

    move v11, v9

    .line 15
    iget-wide v9, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 16
    iget-object v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    aget v11, v3, v11

    .line 17
    aget v12, v3, v5

    .line 18
    iget-object v13, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    move v5, v2

    .line 19
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/TouchEvent$Companion;->obtain(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;

    move-result-object v2

    .line 20
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void

    :cond_1
    move v11, v6

    .line 21
    iget-boolean v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->childIsHandlingNativeGesture:Z

    if-eqz v6, :cond_2

    return-void

    .line 22
    :cond_2
    iget v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    if-ne v6, v14, :cond_3

    .line 23
    const-string v1, "Unexpected state: received touch event but didn\'t get starting ACTION_DOWN for this gesture before"

    .line 24
    invoke-static {v4, v1}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-wide/high16 v7, -0x8000000000000000L

    if-ne v3, v5, :cond_4

    .line 25
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->findTargetTagAndSetCoordinates(Landroid/view/MotionEvent;)I

    .line 26
    iget-object v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {v3}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v3

    .line 27
    sget-object v4, Lcom/facebook/react/uimanager/events/TouchEvent;->Companion:Lcom/facebook/react/uimanager/events/TouchEvent$Companion;

    .line 28
    iget v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    move-wide v8, v7

    .line 29
    sget-object v7, Lcom/facebook/react/uimanager/events/TouchEventType;->END:Lcom/facebook/react/uimanager/events/TouchEventType;

    move-wide v12, v8

    .line 30
    iget-wide v9, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 31
    iget-object v8, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    aget v11, v8, v11

    .line 32
    aget v5, v8, v5

    move-wide v15, v12

    .line 33
    iget-object v13, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    move-object/from16 v8, p1

    move v12, v5

    move v5, v3

    .line 34
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/TouchEvent$Companion;->obtain(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;

    move-result-object v3

    .line 35
    invoke-interface {v1, v3}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 36
    iget v1, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    invoke-direct {v0, v5, v1, v2}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->sweepActiveTouchForTag(IILcom/facebook/react/bridge/ReactContext;)V

    .line 37
    iput v14, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    const-wide/high16 v12, -0x8000000000000000L

    .line 38
    iput-wide v12, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    return-void

    :cond_4
    move-wide v12, v7

    const/4 v7, 0x2

    if-ne v3, v7, :cond_5

    .line 39
    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->findTargetTagAndSetCoordinates(Landroid/view/MotionEvent;)I

    .line 40
    sget-object v4, Lcom/facebook/react/uimanager/events/TouchEvent;->Companion:Lcom/facebook/react/uimanager/events/TouchEvent$Companion;

    .line 41
    iget-object v2, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v2

    .line 42
    iget v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 43
    sget-object v7, Lcom/facebook/react/uimanager/events/TouchEventType;->MOVE:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 44
    iget-wide v9, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 45
    iget-object v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    aget v11, v3, v11

    .line 46
    aget v12, v3, v5

    .line 47
    iget-object v13, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    move-object/from16 v8, p1

    move v5, v2

    .line 48
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/TouchEvent$Companion;->obtain(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;

    move-result-object v2

    .line 49
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void

    :cond_5
    const/4 v7, 0x5

    if-ne v3, v7, :cond_6

    .line 50
    sget-object v4, Lcom/facebook/react/uimanager/events/TouchEvent;->Companion:Lcom/facebook/react/uimanager/events/TouchEvent$Companion;

    .line 51
    iget-object v2, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v2

    .line 52
    iget v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 53
    sget-object v7, Lcom/facebook/react/uimanager/events/TouchEventType;->START:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 54
    iget-wide v9, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 55
    iget-object v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    aget v11, v3, v11

    .line 56
    aget v12, v3, v5

    .line 57
    iget-object v13, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    move-object/from16 v8, p1

    move v5, v2

    .line 58
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/TouchEvent$Companion;->obtain(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;

    move-result-object v2

    .line 59
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void

    :cond_6
    const/4 v7, 0x6

    if-ne v3, v7, :cond_7

    .line 60
    sget-object v4, Lcom/facebook/react/uimanager/events/TouchEvent;->Companion:Lcom/facebook/react/uimanager/events/TouchEvent$Companion;

    .line 61
    iget-object v2, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v2

    .line 62
    iget v6, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 63
    sget-object v7, Lcom/facebook/react/uimanager/events/TouchEventType;->END:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 64
    iget-wide v9, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    .line 65
    iget-object v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetCoordinates:[F

    aget v11, v3, v11

    .line 66
    aget v12, v3, v5

    .line 67
    iget-object v13, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    move-object/from16 v8, p1

    move v5, v2

    .line 68
    invoke-virtual/range {v4 .. v13}, Lcom/facebook/react/uimanager/events/TouchEvent$Companion;->obtain(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;

    move-result-object v2

    .line 69
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    return-void

    :cond_7
    const/4 v5, 0x3

    if-ne v3, v5, :cond_9

    .line 70
    iget-object v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->touchEventCoalescingKeyHelper:Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->hasCoalescingKey(J)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 71
    invoke-direct/range {p0 .. p2}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->dispatchCancelEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    goto :goto_0

    .line 72
    :cond_8
    const-string v1, "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN"

    .line 73
    invoke-static {v4, v1}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    :goto_0
    iget-object v1, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result v1

    .line 75
    iget v3, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->sweepActiveTouchForTag(IILcom/facebook/react/bridge/ReactContext;)V

    .line 76
    iput v14, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    .line 77
    iput-wide v12, v0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->gestureStartTime:J

    return-void

    .line 78
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Warning : touch event was ignored. Action="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " Target="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-static {v4, v1}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onChildEndedNativeGesture(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    .line 1
    const-string v0, "androidEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "eventDispatcher"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->childIsHandlingNativeGesture:Z

    .line 13
    .line 14
    return-void
.end method

.method public final onChildStartedNativeGesture(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    const-string v0, "androidEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->onChildStartedNativeGesture(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method

.method public final onChildStartedNativeGesture(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/common/annotations/UnstableReactNativeAPI;
    .end annotation

    const-string v0, "androidEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->childIsHandlingNativeGesture:Z

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->dispatchCancelEvent(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->childIsHandlingNativeGesture:Z

    .line 5
    iget p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_1

    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->sweepActiveTouchOnChildNativeGesturesAndroid()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->viewGroup:Landroid/view/ViewGroup;

    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    move-result p1

    .line 7
    iget v0, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    invoke-direct {p0, p1, v0, p3}, Lcom/facebook/react/uimanager/JSTouchDispatcher;->sweepActiveTouchForTag(IILcom/facebook/react/bridge/ReactContext;)V

    .line 8
    :cond_1
    iput p2, p0, Lcom/facebook/react/uimanager/JSTouchDispatcher;->targetTag:I

    return-void
.end method
