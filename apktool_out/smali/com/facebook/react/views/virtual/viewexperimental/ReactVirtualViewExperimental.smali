.class public final Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/views/scroll/VirtualView;
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\nJ7\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJY\u0010%\u001a\u00020\u00082\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008%\u0010&J/\u0010+\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0014\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008-\u0010\nJ\u000f\u0010/\u001a\u00020\u0008H\u0010\u00a2\u0006\u0004\u0008.\u0010\nJ\u001f\u00104\u001a\u00020\u00082\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016\u00a2\u0006\u0004\u00084\u00105J\u001f\u00108\u001a\u00020\u00082\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000106H\u0016\u00a2\u0006\u0004\u00088\u00109J+\u0010@\u001a\u00020\u00082\u0006\u0010;\u001a\u00020:2\u000e\u0008\u0002\u0010=\u001a\u0008\u0012\u0004\u0012\u00020:0<H\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008>\u0010?R$\u0010A\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR\"\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010W\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0014\u0010Y\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010XR\u001a\u0010Z\u001a\u0002028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008Z\u0010X\u001a\u0004\u0008[\u0010\\R\u0016\u0010]\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0016\u0010_\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010^R\u0016\u0010`\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008`\u0010aR\u0016\u0010d\u001a\u0004\u0018\u00010:8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008b\u0010cR\u0014\u0010f\u001a\u00020:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008e\u0010c\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006g"
    }
    d2 = {
        "Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "Lcom/facebook/react/views/scroll/VirtualView;",
        "Landroid/view/View$OnLayoutChangeListener;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Li7/B;",
        "updateParentOffset",
        "()V",
        "reportRectChangeToContainer",
        "Lcom/facebook/react/views/scroll/VirtualViewContainer;",
        "getScrollView",
        "()Lcom/facebook/react/views/scroll/VirtualViewContainer;",
        "cleanupLayoutListeners",
        "",
        "addListeners",
        "traverseParentStack",
        "(Z)Lcom/facebook/react/views/scroll/VirtualViewContainer;",
        "onAttachedToWindow",
        "doAttachedToWindow$ReactAndroid_release",
        "doAttachedToWindow",
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
        "w",
        "h",
        "oldw",
        "oldh",
        "onSizeChanged",
        "(IIII)V",
        "onDetachedFromWindow",
        "recycleView$ReactAndroid_release",
        "recycleView",
        "Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "newMode",
        "Landroid/graphics/Rect;",
        "thresholdRect",
        "onModeChange",
        "(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;)V",
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
        "mode",
        "Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "getMode$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "setMode$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtual/VirtualViewMode;)V",
        "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;",
        "modeChangeEmitter",
        "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;",
        "getModeChangeEmitter$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;",
        "setModeChangeEmitter$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V",
        "Lcom/facebook/react/views/virtual/VirtualViewRenderState;",
        "renderState",
        "Lcom/facebook/react/views/virtual/VirtualViewRenderState;",
        "getRenderState$ReactAndroid_release",
        "()Lcom/facebook/react/views/virtual/VirtualViewRenderState;",
        "setRenderState$ReactAndroid_release",
        "(Lcom/facebook/react/views/virtual/VirtualViewRenderState;)V",
        "scrollView",
        "Lcom/facebook/react/views/scroll/VirtualViewContainer;",
        "lastContainerRelativeRect",
        "Landroid/graphics/Rect;",
        "lastClippingRect",
        "containerRelativeRect",
        "getContainerRelativeRect",
        "()Landroid/graphics/Rect;",
        "offsetX",
        "I",
        "offsetY",
        "hadLayout",
        "Z",
        "getNativeId$ReactAndroid_release",
        "()Ljava/lang/String;",
        "nativeId",
        "getVirtualViewID",
        "virtualViewID",
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
.field private final containerRelativeRect:Landroid/graphics/Rect;

.field private hadLayout:Z

.field private final lastClippingRect:Landroid/graphics/Rect;

.field private final lastContainerRelativeRect:Landroid/graphics/Rect;

.field private mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

.field private modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

.field private offsetX:I

.field private offsetY:I

.field private renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

.field private scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

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
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 12
    .line 13
    new-instance p1, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastContainerRelativeRect:Landroid/graphics/Rect;

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastClippingRect:Landroid/graphics/Rect;

    .line 26
    .line 27
    new-instance p1, Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->containerRelativeRect:Landroid/graphics/Rect;

    .line 33
    .line 34
    return-void
.end method

.method private final cleanupLayoutListeners()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->traverseParentStack(Z)Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic debugLog$ReactAndroid_release$default(Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;Ljava/lang/String;Lw7/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental$debugLog$1;->INSTANCE:Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental$debugLog$1;

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
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance p3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p4, "ReactVirtualViewExperimental:["

    .line 39
    .line 40
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p0, "]:"

    .line 47
    .line 48
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p2}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {p0, p1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method private final getScrollView()Lcom/facebook/react/views/scroll/VirtualViewContainer;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->traverseParentStack(Z)Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method private final reportRectChangeToContainer()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastContainerRelativeRect:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "ReactVirtualViewExperimental:["

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, "]:"

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "reportRectChangeToContainer"

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, "no rect change "

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v0, v1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/VirtualViewContainer;->getVirtualViewContainerState()Lcom/facebook/react/views/scroll/VirtualViewContainerState;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->onChange(Lcom/facebook/react/views/scroll/VirtualView;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastContainerRelativeRect:Landroid/graphics/Rect;

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    return-void
.end method

.method private final traverseParentStack(Z)Lcom/facebook/react/views/scroll/VirtualViewContainer;
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
    if-eqz v0, :cond_3

    .line 7
    .line 8
    instance-of v2, v0, Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v0, Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    instance-of v2, v0, Lcom/facebook/react/uimanager/ReactRoot;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_1
    instance-of v1, v0, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    return-object v1
.end method

.method private final updateParentOffset()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 8
    .line 9
    iput v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    instance-of v2, v1, Landroid/view/View;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 28
    .line 29
    move-object v3, v1

    .line 30
    check-cast v3, Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/2addr v2, v4

    .line 37
    iput v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 38
    .line 39
    iget v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v2, v3

    .line 46
    iput v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 47
    .line 48
    :cond_1
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 62
    .line 63
    add-int/2addr v1, v2

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget v3, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 69
    .line 70
    add-int/2addr v2, v3

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iget v4, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 76
    .line 77
    add-int/2addr v3, v4

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    iget v5, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 83
    .line 84
    add-int/2addr v4, v5

    .line 85
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 86
    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final debugLog$ReactAndroid_release(Ljava/lang/String;Lw7/a;)V
    .locals 3
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
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "ReactVirtualViewExperimental:["

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, "]:"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
    check-cast p2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p1, p2}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public final doAttachedToWindow$ReactAndroid_release()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getScrollView()Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->hadLayout:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->updateParentOffset()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->reportRectChangeToContainer()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "ReactVirtualViewExperimental:["

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, "]:"

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "doAttachedToWindow"

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, ""

    .line 61
    .line 62
    invoke-static {v0, v1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
.end method

.method public getContainerRelativeRect()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->containerRelativeRect:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMode$ReactAndroid_release()Lcom/facebook/react/views/virtual/VirtualViewMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModeChangeEmitter$ReactAndroid_release()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

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

.method public final getRenderState$ReactAndroid_release()Lcom/facebook/react/views/virtual/VirtualViewRenderState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVirtualViewID()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getNativeId$ReactAndroid_release()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "unknown"

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ":::"

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->doAttachedToWindow$ReactAndroid_release()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->recycleView$ReactAndroid_release()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/facebook/react/views/view/ReactViewGroup;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move v0, p5

    .line 5
    move p5, p4

    .line 6
    move p4, p3

    .line 7
    move p3, p2

    .line 8
    move p2, p1

    .line 9
    move-object p1, p0

    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p1, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->hadLayout:Z

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget v1, p1, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 20
    .line 21
    add-int/2addr p3, v1

    .line 22
    iget v2, p1, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 23
    .line 24
    add-int/2addr p4, v2

    .line 25
    add-int/2addr p5, v1

    .line 26
    add-int/2addr v0, v2

    .line 27
    invoke-virtual {p2, p3, p4, p5, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance p3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string p4, "ReactVirtualViewExperimental:["

    .line 52
    .line 53
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p2, "]:"

    .line 60
    .line 61
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p2, "onLayout"

    .line 65
    .line 66
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    new-instance p4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string p5, "containerRelativeRect="

    .line 83
    .line 84
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-static {p2, p3}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->reportRectChangeToContainer()V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    if-ne p6, p2, :cond_1

    .line 2
    .line 3
    if-eq p7, p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->updateParentOffset()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string p3, "ReactVirtualViewExperimental:["

    .line 32
    .line 33
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, "]:"

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, "onLayoutChange"

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance p3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string p4, "containerRelativeRect="

    .line 63
    .line 64
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-static {p1, p2}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->reportRectChangeToContainer()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public onModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;)V
    .locals 8

    .line 1
    const-string v0, "newMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "thresholdRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_1
    sget-object v0, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->updateClippingRect(Ljava/util/Set;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    iget-object v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 32
    .line 33
    const-string v3, "]:"

    .line 34
    .line 35
    const-string v4, "ReactVirtualViewExperimental:["

    .line 36
    .line 37
    const-string v5, "onModeChange"

    .line 38
    .line 39
    if-ne p1, v2, :cond_3

    .line 40
    .line 41
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_b

    .line 46
    .line 47
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_b

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "no change "

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p2, p1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 100
    .line 101
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_4

    .line 106
    .line 107
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    new-instance v7, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    new-instance v4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v5, "->"

    .line 147
    .line 148
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v3, v4}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_4
    if-ne v2, v0, :cond_5

    .line 162
    .line 163
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->updateClippingRect(Ljava/util/Set;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    sget-object v1, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    aget p1, v1, p1

    .line 173
    .line 174
    const/4 v1, 0x1

    .line 175
    if-eq p1, v1, :cond_8

    .line 176
    .line 177
    const/4 v1, 0x2

    .line 178
    const/4 v3, 0x0

    .line 179
    if-eq p1, v1, :cond_7

    .line 180
    .line 181
    const/4 v0, 0x3

    .line 182
    if-ne p1, v0, :cond_6

    .line 183
    .line 184
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 185
    .line 186
    if-eqz p1, :cond_b

    .line 187
    .line 188
    sget-object v0, Lcom/facebook/react/views/virtual/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-interface {p1, v0, v1, p2, v3}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_6
    new-instance p1, Li7/m;

    .line 199
    .line 200
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :cond_7
    if-eq v2, v0, :cond_b

    .line 205
    .line 206
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 207
    .line 208
    if-eqz p1, :cond_b

    .line 209
    .line 210
    sget-object v0, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-interface {p1, v0, v1, p2, v3}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_8
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 221
    .line 222
    sget-object v3, Lcom/facebook/react/views/virtual/VirtualViewRenderState;->Unknown:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 223
    .line 224
    if-ne p1, v3, :cond_9

    .line 225
    .line 226
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 227
    .line 228
    if-eqz p1, :cond_b

    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-interface {p1, v0, v2, p2, v1}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_9
    sget-object v3, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 239
    .line 240
    if-ne v2, v3, :cond_a

    .line 241
    .line 242
    sget-object v2, Lcom/facebook/react/views/virtual/VirtualViewRenderState;->Rendered:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

    .line 243
    .line 244
    if-ne p1, v2, :cond_a

    .line 245
    .line 246
    return-void

    .line 247
    :cond_a
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 248
    .line 249
    if-eqz p1, :cond_b

    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-interface {p1, v0, v2, p2, v1}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;->emitModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 256
    .line 257
    .line 258
    :cond_b
    :goto_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/ReactViewGroup;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget p3, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 13
    .line 14
    add-int/2addr p2, p3

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    iget p4, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 20
    .line 21
    add-int/2addr p3, p4

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    iget v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetX:I

    .line 27
    .line 28
    add-int/2addr p4, v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->offsetY:I

    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimentalKt;->access$getIS_DEBUG_BUILD$p()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getVirtualViewID()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string p3, "ReactVirtualViewExperimental:["

    .line 61
    .line 62
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p1, "]:"

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, "onSizeChanged"

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    new-instance p3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string p4, "container="

    .line 92
    .line 93
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p1, p2}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->reportRectChangeToContainer()V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public recycleView$ReactAndroid_release()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->cleanupLayoutListeners()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/VirtualViewContainer;->getVirtualViewContainerState()Lcom/facebook/react/views/scroll/VirtualViewContainerState;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->remove(Lcom/facebook/react/views/scroll/VirtualView;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->hadLayout:Z

    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastContainerRelativeRect:Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastClippingRect:Landroid/graphics/Rect;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setMode$ReactAndroid_release(Lcom/facebook/react/views/virtual/VirtualViewMode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 2
    .line 3
    return-void
.end method

.method public final setModeChangeEmitter$ReactAndroid_release(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->modeChangeEmitter:Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;

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
    iput-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->renderState:Lcom/facebook/react/views/virtual/VirtualViewRenderState;

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
    iget-object v0, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

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
    iget-object v2, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->scrollView:Lcom/facebook/react/views/scroll/VirtualViewContainer;

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
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 82
    .line 83
    neg-int v1, v1

    .line 84
    invoke-virtual {p0}, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 89
    .line 90
    neg-int v2, v2

    .line 91
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastClippingRect:Landroid/graphics/Rect;

    .line 95
    .line 96
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    :goto_1
    return-void

    .line 103
    :cond_5
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->updateClippingToRect$ReactAndroid_release(Landroid/graphics/Rect;Ljava/util/Set;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;->lastClippingRect:Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1
.end method
