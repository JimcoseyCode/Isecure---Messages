.class public final Lcom/facebook/react/views/virtual/view/ReactVirtualView;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;
.implements Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/virtual/view/ReactVirtualView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u000b2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008$\u0010 J\u000f\u0010&\u001a\u00020\u000bH\u0010\u00a2\u0006\u0004\u0008%\u0010 J\u000f\u0010\'\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\'\u0010 J\u000f\u0010)\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008(\u0010 J\u000f\u0010*\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008*\u0010 J7\u00101\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0014\u00a2\u0006\u0004\u00081\u00102JY\u00109\u001a\u00020\u000b2\u0008\u00104\u001a\u0004\u0018\u0001032\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020,2\u0006\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020,H\u0016\u00a2\u0006\u0004\u00089\u0010:J3\u0010A\u001a\u00020\u000b2\u0008\u0010;\u001a\u0004\u0018\u00010\u001c2\u0008\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0016\u00a2\u0006\u0004\u0008A\u0010BJ\u0019\u00101\u001a\u00020\u000b2\u0008\u0010;\u001a\u0004\u0018\u00010\u001cH\u0016\u00a2\u0006\u0004\u00081\u0010CJ\u0017\u00109\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u00089\u0010CJ/\u0010H\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020,H\u0014\u00a2\u0006\u0004\u0008H\u0010IJ\u001f\u0010L\u001a\u00020\u000b2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010JH\u0016\u00a2\u0006\u0004\u0008L\u0010MJ+\u0010T\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020N2\u000e\u0008\u0002\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020N0PH\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008R\u0010SR$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010U\u001a\u0004\u0008V\u0010W\"\u0004\u0008X\u0010\u001aR\"\u0010Z\u001a\u00020Y8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR\"\u0010h\u001a\u00020g8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR\u001a\u0010n\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010qR\u0014\u0010r\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010iR\u0016\u0010t\u001a\u0004\u0018\u00010s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0018\u0010v\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\u0014\u0010x\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u0014\u0010z\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010yR\u0014\u0010{\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010yR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008|\u0010yR\u0016\u0010}\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u0016\u0010\u007f\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010~R\u0018\u0010\u0080\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010oR\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010N8@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0084\u0001"
    }
    d2 = {
        "Lcom/facebook/react/views/virtual/view/ReactVirtualView;",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;",
        "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;",
        "Landroid/view/View$OnLayoutChangeListener;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "checkRectChange",
        "Li7/B;",
        "dispatchOnModeChangeIfNeeded",
        "(Z)V",
        "Landroid/graphics/Rect;",
        "rect1",
        "rect2",
        "rectsOverlap",
        "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z",
        "Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "oldMode",
        "newMode",
        "maybeEmitModeChanges",
        "(Lcom/facebook/react/views/virtual/VirtualViewMode;Lcom/facebook/react/views/virtual/VirtualViewMode;)V",
        "mode",
        "emitAsyncModeChange",
        "(Lcom/facebook/react/views/virtual/VirtualViewMode;)V",
        "emitSyncModeChange",
        "Landroid/view/ViewGroup;",
        "getParentScrollView",
        "()Landroid/view/ViewGroup;",
        "cleanupLayoutListeners",
        "()V",
        "addListeners",
        "traverseParentStack",
        "(Z)Landroid/view/ViewGroup;",
        "updateParentOffset",
        "recycleView$ReactAndroid_release",
        "recycleView",
        "onAttachedToWindow",
        "doAttachedToWindow$ReactAndroid_release",
        "doAttachedToWindow",
        "onDetachedFromWindow",
        "changed",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "Landroid/view/View;",
        "v",
        "oldLeft",
        "oldTop",
        "oldRight",
        "oldBottom",
        "onLayoutChange",
        "(Landroid/view/View;IIIIIIII)V",
        "scrollView",
        "Lcom/facebook/react/views/scroll/ScrollEventType;",
        "scrollEventType",
        "",
        "xVelocity",
        "yVelocity",
        "onScroll",
        "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V",
        "(Landroid/view/ViewGroup;)V",
        "w",
        "h",
        "oldw",
        "oldh",
        "onSizeChanged",
        "(IIII)V",
        "",
        "excludedViews",
        "updateClippingRect",
        "(Ljava/util/Set;)V",
        "",
        "subtag",
        "Lkotlin/Function0;",
        "block",
        "debugLog$ReactAndroid_release",
        "(Ljava/lang/String;Lw7/a;)V",
        "debugLog",
        "Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "getMode$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "setMode$ReactAndroid_release",
        "Lcom/facebook/react/views/virtual/VirtualViewRenderState;",
        "renderState",
        "Lcom/facebook/react/views/virtual/VirtualViewRenderState;",
        "getRenderState$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtual/VirtualViewRenderState;",
        "setRenderState$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtual/VirtualViewRenderState;)V",
        "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;",
        "modeChangeEmitter",
        "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;",
        "getModeChangeEmitter$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;",
        "setModeChangeEmitter$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V",
        "",
        "prerenderRatio",
        "D",
        "getPrerenderRatio$ReactAndroid_release",
        "()D",
        "setPrerenderRatio$ReactAndroid_release",
        "(D)V",
        "debugLogEnabled",
        "Z",
        "getDebugLogEnabled$ReactAndroid_release",
        "()Z",
        "hysteresisRatio",
        "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;",
        "onWindowFocusChangeListener",
        "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;",
        "parentScrollView",
        "Landroid/view/View;",
        "lastRect",
        "Landroid/graphics/Rect;",
        "targetRect",
        "thresholdRect",
        "lastClippingRect",
        "offsetX",
        "I",
        "offsetY",
        "offsetChanged",
        "getNativeId$ReactAndroid_release",
        "()Ljava/lang/String;",
        "nativeId",
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
.field private final debugLogEnabled:Z

.field private final hysteresisRatio:D

.field private final lastClippingRect:Landroid/graphics/Rect;

.field private final lastRect:Landroid/graphics/Rect;

.field private mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

.field private modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

.field private offsetChanged:Z

.field private offsetX:I

.field private offsetY:I

.field private final onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

.field private parentScrollView:Landroid/view/View;

.field private prerenderRatio:D

.field private renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

.field private final targetRect:Landroid/graphics/Rect;

.field private final thresholdRect:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lcom/facebook/react/views/virtual/VirtualViewRenderState;->Unknown:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 12
    .line 13
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->virtualViewPrerenderRatio()D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->prerenderRatio:D

    .line 18
    .line 19
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput-boolean p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->debugLogEnabled:Z

    .line 24
    .line 25
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->virtualViewHysteresisRatio()D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iput-wide v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->hysteresisRatio:D

    .line 30
    .line 31
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewWindowFocusDetection()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/facebook/react/views/virtual/view/a;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/facebook/react/views/virtual/view/a;-><init>(Lcom/facebook/react/views/virtual/view/ReactVirtualView;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 45
    .line 46
    new-instance p1, Landroid/graphics/Rect;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    .line 52
    .line 53
    new-instance p1, Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 59
    .line 60
    new-instance p1, Landroid/graphics/Rect;

    .line 61
    .line 62
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 66
    .line 67
    new-instance p1, Landroid/graphics/Rect;

    .line 68
    .line 69
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastClippingRect:Landroid/graphics/Rect;

    .line 73
    .line 74
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/views/virtual/view/ReactVirtualView;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->onWindowFocusChangeListener$lambda$0(Lcom/facebook/react/views/virtual/view/ReactVirtualView;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final cleanupLayoutListeners()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->traverseParentStack(Z)Landroid/view/ViewGroup;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic debugLog$ReactAndroid_release$default(Lcom/facebook/react/views/virtual/view/ReactVirtualView;Ljava/lang/String;Lw7/a;ILjava/lang/Object;)V
    .locals 3

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/facebook/react/views/virtual/view/ReactVirtualView$debugLog$1;->INSTANCE:Lcom/facebook/react/views/virtual/view/ReactVirtualView$debugLog$1;

    .line 6
    .line 7
    :cond_0
    const-string p3, "subtag"

    .line 8
    .line 9
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string p3, "block"

    .line 13
    .line 14
    invoke-static {p2, p3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_2

    .line 22
    .line 23
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    const-string p4, "]"

    .line 28
    .line 29
    const-string v0, "]["

    .line 30
    .line 31
    const-string v1, " ["

    .line 32
    .line 33
    const-string v2, "ReactVirtualView:"

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    new-instance p3, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p2}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p1, p0}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p2}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p1, p0}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    return-void
.end method

.method private final dispatchOnModeChangeIfNeeded(Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_1
    iget-boolean v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->updateParentOffset()V

    .line 20
    .line 21
    .line 22
    :cond_2
    iget-object v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iget v4, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetX:I

    .line 29
    .line 30
    add-int/2addr v3, v4

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget v5, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetY:I

    .line 36
    .line 37
    add-int/2addr v4, v5

    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetX:I

    .line 43
    .line 44
    add-int/2addr v5, v6

    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget v7, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetY:I

    .line 50
    .line 51
    add-int/2addr v6, v7

    .line 52
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 53
    .line 54
    .line 55
    iget-object v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    const-string v4, " threshold="

    .line 79
    .line 80
    const-string v5, "dispatchOnModeChangeIfNeeded"

    .line 81
    .line 82
    const-string v6, "]"

    .line 83
    .line 84
    const-string v7, "]["

    .line 85
    .line 86
    const-string v8, " ["

    .line 87
    .line 88
    const-string v9, "ReactVirtualView:"

    .line 89
    .line 90
    if-nez v3, :cond_3

    .line 91
    .line 92
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 93
    .line 94
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    :cond_3
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 101
    .line 102
    invoke-virtual {v3}, Landroid/graphics/Rect;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_6

    .line 107
    .line 108
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_15

    .line 113
    .line 114
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    const-string v2, "empty rects target="

    .line 119
    .line 120
    if-eqz v1, :cond_5

    .line 121
    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 138
    .line 139
    invoke-virtual {v3}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-object v5, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 144
    .line 145
    invoke-virtual {v5}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    new-instance v9, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    new-instance v5, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v1, v2}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 225
    .line 226
    invoke-virtual {v3}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    iget-object v5, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 231
    .line 232
    invoke-virtual {v5}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    new-instance v9, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    new-instance v5, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v1, v2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_6
    invoke-virtual {v0}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingRect()V

    .line 297
    .line 298
    .line 299
    if-eqz p1, :cond_9

    .line 300
    .line 301
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    .line 302
    .line 303
    invoke-virtual {v3}, Landroid/graphics/Rect;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-nez v3, :cond_8

    .line 308
    .line 309
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    .line 310
    .line 311
    iget-object v10, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 312
    .line 313
    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_8

    .line 318
    .line 319
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_15

    .line 324
    .line 325
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    const-string v2, "no rect change"

    .line 330
    .line 331
    if-eqz v1, :cond_7

    .line 332
    .line 333
    new-instance v1, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    new-instance v5, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-static {v1, v2}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    new-instance v5, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-static {v1, v2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :cond_8
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    .line 442
    .line 443
    iget-object v10, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 444
    .line 445
    invoke-virtual {v3, v10}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 446
    .line 447
    .line 448
    :cond_9
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 449
    .line 450
    iget-object v10, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 451
    .line 452
    invoke-direct {v0, v3, v10}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-eqz v3, :cond_c

    .line 457
    .line 458
    iget-object v1, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 459
    .line 460
    if-eqz v1, :cond_b

    .line 461
    .line 462
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    if-eqz v1, :cond_a

    .line 467
    .line 468
    sget-object v1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 469
    .line 470
    goto/16 :goto_2

    .line 471
    .line 472
    :cond_a
    sget-object v1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 473
    .line 474
    goto/16 :goto_2

    .line 475
    .line 476
    :cond_b
    sget-object v1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 477
    .line 478
    goto/16 :goto_2

    .line 479
    .line 480
    :cond_c
    iget-wide v10, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->prerenderRatio:D

    .line 481
    .line 482
    const-wide/16 v12, 0x0

    .line 483
    .line 484
    cmpl-double v3, v10, v12

    .line 485
    .line 486
    if-lez v3, :cond_d

    .line 487
    .line 488
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 489
    .line 490
    neg-int v14, v2

    .line 491
    int-to-double v14, v14

    .line 492
    mul-double/2addr v14, v10

    .line 493
    double-to-int v14, v14

    .line 494
    neg-int v15, v1

    .line 495
    move-wide/from16 v16, v12

    .line 496
    .line 497
    int-to-double v12, v15

    .line 498
    mul-double/2addr v12, v10

    .line 499
    double-to-int v10, v12

    .line 500
    invoke-virtual {v3, v14, v10}, Landroid/graphics/Rect;->inset(II)V

    .line 501
    .line 502
    .line 503
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 504
    .line 505
    iget-object v10, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 506
    .line 507
    invoke-direct {v0, v3, v10}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    goto :goto_0

    .line 512
    :cond_d
    move-wide/from16 v16, v12

    .line 513
    .line 514
    const/4 v3, 0x0

    .line 515
    :goto_0
    if-eqz v3, :cond_e

    .line 516
    .line 517
    sget-object v1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 518
    .line 519
    goto/16 :goto_2

    .line 520
    .line 521
    :cond_e
    iget-object v3, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 522
    .line 523
    if-eqz v3, :cond_12

    .line 524
    .line 525
    iget-wide v10, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->hysteresisRatio:D

    .line 526
    .line 527
    cmpl-double v12, v10, v16

    .line 528
    .line 529
    if-lez v12, :cond_12

    .line 530
    .line 531
    iget-object v12, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 532
    .line 533
    neg-int v2, v2

    .line 534
    int-to-double v13, v2

    .line 535
    mul-double/2addr v13, v10

    .line 536
    double-to-int v2, v13

    .line 537
    neg-int v1, v1

    .line 538
    int-to-double v13, v1

    .line 539
    mul-double/2addr v13, v10

    .line 540
    double-to-int v1, v13

    .line 541
    invoke-virtual {v12, v2, v1}, Landroid/graphics/Rect;->inset(II)V

    .line 542
    .line 543
    .line 544
    iget-object v1, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 545
    .line 546
    iget-object v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 547
    .line 548
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    if-eqz v1, :cond_11

    .line 553
    .line 554
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    if-eqz v1, :cond_10

    .line 559
    .line 560
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    const-string v2, "hysteresis, mode="

    .line 565
    .line 566
    if-eqz v1, :cond_f

    .line 567
    .line 568
    new-instance v1, Ljava/lang/StringBuilder;

    .line 569
    .line 570
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    new-instance v10, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 599
    .line 600
    .line 601
    move-result v10

    .line 602
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    new-instance v12, Ljava/lang/StringBuilder;

    .line 607
    .line 608
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    invoke-static {v1, v2}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    goto :goto_1

    .line 637
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 638
    .line 639
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    new-instance v10, Ljava/lang/StringBuilder;

    .line 653
    .line 654
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 668
    .line 669
    .line 670
    move-result v10

    .line 671
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v11

    .line 675
    new-instance v12, Ljava/lang/StringBuilder;

    .line 676
    .line 677
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    invoke-static {v1, v2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    :cond_10
    :goto_1
    move-object v1, v3

    .line 706
    goto :goto_2

    .line 707
    :cond_11
    sget-object v1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 708
    .line 709
    iget-object v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 710
    .line 711
    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    .line 712
    .line 713
    .line 714
    goto :goto_2

    .line 715
    :cond_12
    sget-object v1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 716
    .line 717
    iget-object v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 718
    .line 719
    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    .line 720
    .line 721
    .line 722
    :goto_2
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    if-eqz v2, :cond_14

    .line 727
    .line 728
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    const-string v3, " target="

    .line 733
    .line 734
    const-string v10, "mode="

    .line 735
    .line 736
    if-eqz v2, :cond_13

    .line 737
    .line 738
    new-instance v2, Ljava/lang/StringBuilder;

    .line 739
    .line 740
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    iget-object v5, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 754
    .line 755
    iget-object v9, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 756
    .line 757
    invoke-virtual {v9}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v9

    .line 761
    iget-object v11, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 762
    .line 763
    invoke-virtual {v11}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v11

    .line 767
    new-instance v12, Ljava/lang/StringBuilder;

    .line 768
    .line 769
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 795
    .line 796
    .line 797
    move-result v4

    .line 798
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    new-instance v9, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    invoke-static {v2, v3}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    goto :goto_3

    .line 833
    :cond_13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 834
    .line 835
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    iget-object v5, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 849
    .line 850
    iget-object v9, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 851
    .line 852
    invoke-virtual {v9}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v9

    .line 856
    iget-object v11, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 857
    .line 858
    invoke-virtual {v11}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v11

    .line 862
    new-instance v12, Ljava/lang/StringBuilder;

    .line 863
    .line 864
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 890
    .line 891
    .line 892
    move-result v4

    .line 893
    invoke-virtual {v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v5

    .line 897
    new-instance v9, Ljava/lang/StringBuilder;

    .line 898
    .line 899
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 903
    .line 904
    .line 905
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v3

    .line 924
    invoke-static {v2, v3}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    :cond_14
    :goto_3
    iget-object v2, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 928
    .line 929
    if-ne v1, v2, :cond_16

    .line 930
    .line 931
    :cond_15
    :goto_4
    return-void

    .line 932
    :cond_16
    iput-object v1, v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 933
    .line 934
    invoke-direct {v0, v2, v1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->maybeEmitModeChanges(Lcom/facebook/react/views/virtual/VirtualViewMode;Lcom/facebook/react/views/virtual/VirtualViewMode;)V

    .line 935
    .line 936
    .line 937
    return-void
.end method

.method private final emitAsyncModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-interface {v0, p1, v1, v2, v3}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private final emitSyncModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->thresholdRect:Landroid/graphics/Rect;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-interface {v0, p1, v1, v2, v3}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private final getParentScrollView()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->traverseParentStack(Z)Landroid/view/ViewGroup;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method private final maybeEmitModeChanges(Lcom/facebook/react/views/virtual/VirtualViewMode;Lcom/facebook/react/views/virtual/VirtualViewMode;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "]"

    .line 12
    .line 13
    const-string v2, "]["

    .line 14
    .line 15
    const-string v3, " ["

    .line 16
    .line 17
    const-string v4, "->"

    .line 18
    .line 19
    const-string v5, "ReactVirtualView:"

    .line 20
    .line 21
    const-string v6, "Mode change"

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v5, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    new-instance v7, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v0, v1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v5, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    new-instance v7, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v0, v1}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    new-instance v1, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v2, "VirtualView::mode change "

    .line 178
    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, " -> "

    .line 186
    .line 187
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v2, ", nativeID="

    .line 194
    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    const-wide/16 v1, 0x0

    .line 206
    .line 207
    invoke-static {v1, v2, v0}, LB3/a;->c(JLjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    sget-object v0, Lcom/facebook/react/views/virtual/view/ReactVirtualView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 211
    .line 212
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    aget p2, v0, p2

    .line 217
    .line 218
    const/4 v0, 0x1

    .line 219
    if-eq p2, v0, :cond_4

    .line 220
    .line 221
    const/4 v0, 0x2

    .line 222
    if-eq p2, v0, :cond_3

    .line 223
    .line 224
    const/4 p1, 0x3

    .line 225
    if-ne p2, p1, :cond_2

    .line 226
    .line 227
    sget-object p1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 228
    .line 229
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->emitAsyncModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;)V

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_2
    new-instance p1, Li7/m;

    .line 234
    .line 235
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 236
    .line 237
    .line 238
    throw p1

    .line 239
    :cond_3
    sget-object p2, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 240
    .line 241
    if-eq p1, p2, :cond_7

    .line 242
    .line 243
    sget-object p1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 244
    .line 245
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->emitAsyncModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;)V

    .line 246
    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_4
    iget-object p2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 250
    .line 251
    sget-object v0, Lcom/facebook/react/views/virtual/VirtualViewRenderState;->Unknown:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 252
    .line 253
    if-ne p2, v0, :cond_5

    .line 254
    .line 255
    sget-object p1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 256
    .line 257
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->emitSyncModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;)V

    .line 258
    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_5
    sget-object v0, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 262
    .line 263
    if-ne p1, v0, :cond_6

    .line 264
    .line 265
    sget-object p1, Lcom/facebook/react/views/virtual/VirtualViewRenderState;->Rendered:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 266
    .line 267
    if-ne p2, p1, :cond_6

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_6
    sget-object p1, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 271
    .line 272
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->emitSyncModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;)V

    .line 273
    .line 274
    .line 275
    :cond_7
    :goto_1
    invoke-static {v1, v2}, LB3/a;->i(J)V

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method private static final onWindowFocusChangeListener$lambda$0(Lcom/facebook/react/views/virtual/view/ReactVirtualView;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 3

    .line 1
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 2
    .line 3
    iget v1, p2, Landroid/graphics/Rect;->bottom:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 9
    .line 10
    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    iget v1, p2, Landroid/graphics/Rect;->right:I

    .line 18
    .line 19
    if-ge v0, v1, :cond_2

    .line 20
    .line 21
    iget p2, p2, Landroid/graphics/Rect;->left:I

    .line 22
    .line 23
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 24
    .line 25
    if-lt p2, p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_2
    :goto_0
    return v2
.end method

.method private final traverseParentStack(Z)Landroid/view/ViewGroup;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    instance-of v2, v0, Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    instance-of v2, v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    check-cast v0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    instance-of v2, v0, Lcom/facebook/react/uimanager/ReactRoot;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_2
    instance-of v1, v0, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    check-cast v1, Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 35
    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_4
    return-object v1
.end method

.method private final updateParentOffset()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetX:I

    .line 8
    .line 9
    iput v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetY:I

    .line 10
    .line 11
    iput-boolean v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    instance-of v2, v1, Landroid/view/View;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget v2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetX:I

    .line 30
    .line 31
    move-object v3, v1

    .line 32
    check-cast v3, Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    add-int/2addr v2, v4

    .line 39
    iput v2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetX:I

    .line 40
    .line 41
    iget v2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetY:I

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    add-int/2addr v2, v3

    .line 48
    iput v2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetY:I

    .line 49
    .line 50
    :cond_1
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final debugLog$ReactAndroid_release(Ljava/lang/String;Lw7/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "subtag"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const-string v1, "]"

    .line 22
    .line 23
    const-string v2, "]["

    .line 24
    .line 25
    const-string v3, " ["

    .line 26
    .line 27
    const-string v4, "ReactVirtualView:"

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p2}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-instance v5, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-static {p1, p2}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p2}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    new-instance v5, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-static {p1, p2}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_1
    return-void
.end method

.method public final doAttachedToWindow$ReactAndroid_release()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getParentScrollView()Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    .line 9
    .line 10
    invoke-static {p0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->addScrollListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->addLayoutChangeListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    iput-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getDebugLogEnabled$ReactAndroid_release()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-static {}, Lcom/facebook/react/views/virtual/view/ReactVirtualViewKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const-string v1, "]"

    .line 31
    .line 32
    const-string v2, "]["

    .line 33
    .line 34
    const-string v3, " ["

    .line 35
    .line 36
    const-string v4, ""

    .line 37
    .line 38
    const-string v5, "ReactVirtualView:"

    .line 39
    .line 40
    const-string v6, "onAttachedToWindow"

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    new-instance v7, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0, v1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    new-instance v7, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v0, v1}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 162
    .line 163
    .line 164
    :cond_3
    const/4 v0, 0x0

    .line 165
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final getDebugLogEnabled$ReactAndroid_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->debugLogEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getMode$ReactAndroid_release()Lcom/facebook/react/views/virtual/VirtualViewMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModeChangeEmitter$ReactAndroid_release()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNativeId$ReactAndroid_release()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, Lcom/facebook/react/R$id;->view_tag_native_id:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final getPrerenderRatio$ReactAndroid_release()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->prerenderRatio:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRenderState$ReactAndroid_release()Lcom/facebook/react/views/virtual/VirtualViewRenderState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->doAttachedToWindow$ReactAndroid_release()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeScrollListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeLayoutChangeListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->onWindowFocusChangeListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->cleanupLayoutListeners()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onLayout(Landroid/view/ViewGroup;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/facebook/react/views/view/ReactViewGroup;->onLayout(ZIIII)V

    move p2, p1

    move-object p1, p0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p1, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    const/4 p2, 0x0

    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    :cond_0
    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    const/4 p4, 0x1

    if-nez p1, :cond_1

    if-ne p6, p2, :cond_1

    if-eq p7, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p4

    :goto_1
    iput-boolean p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    .line 2
    invoke-direct {p0, p4}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    return-void
.end method

.method public onLayoutChange(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "scrollView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    :cond_0
    return-void
.end method

.method public onScroll(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/ReactViewGroup;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->dispatchOnModeChangeIfNeeded(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public recycleView$ReactAndroid_release()V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeScrollListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper;->removeLayoutChangeListener(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->cleanupLayoutListeners()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastRect:Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetX:I

    .line 24
    .line 25
    iput v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetY:I

    .line 26
    .line 27
    iput-boolean v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->offsetChanged:Z

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastClippingRect:Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final setMode$ReactAndroid_release(Lcom/facebook/react/views/virtual/VirtualViewMode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 2
    .line 3
    return-void
.end method

.method public final setModeChangeEmitter$ReactAndroid_release(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 2
    .line 3
    return-void
.end method

.method public final setPrerenderRatio$ReactAndroid_release(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->prerenderRatio:D

    .line 2
    .line 3
    return-void
.end method

.method public final setRenderState$ReactAndroid_release(Lcom/facebook/react/views/virtual/VirtualViewRenderState;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 7
    .line 8
    return-void
.end method

.method public updateClippingRect(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->get_removeClippedSubviews$ReactAndroid_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingRect(Ljava/util/Set;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->getClippingRect$ReactAndroid_release()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "Required value was null."

    .line 21
    .line 22
    if-eqz v0, :cond_7

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->parentScrollView:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v2, :cond_6

    .line 27
    .line 28
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup"

    .line 29
    .line 30
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v2, Lcom/facebook/react/uimanager/ReactClippingViewGroup;

    .line 34
    .line 35
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewClippingWithoutScrollViewClipping()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-interface {v2}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->getRemoveClippedSubviews()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-interface {v2, v0}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->getClippingRect(Landroid/graphics/Rect;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    check-cast v2, Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-interface {v2}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->getRemoveClippedSubviews()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingRect(Ljava/util/Set;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    invoke-interface {v2, v0}, Lcom/facebook/react/uimanager/ReactClippingViewGroup;->getClippingRect(Landroid/graphics/Rect;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->targetRect:Landroid/graphics/Rect;

    .line 76
    .line 77
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 78
    .line 79
    neg-int v2, v2

    .line 80
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 81
    .line 82
    neg-int v1, v1

    .line 83
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastClippingRect:Landroid/graphics/Rect;

    .line 87
    .line 88
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    :goto_1
    return-void

    .line 95
    :cond_5
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingToRect$ReactAndroid_release(Landroid/graphics/Rect;Ljava/util/Set;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->lastClippingRect:Landroid/graphics/Rect;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
.end method
