.class public final Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ScrollViewT:",
        "Landroid/view/ViewGroup;",
        ":",
        "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/react/bridge/UIManagerListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000*\u0010\u0008\u0000\u0010\u0003*\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u00020\u0004:\u00011B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\r\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\r\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ\r\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u000cJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0014R\u0014\u0010\u0005\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0018\u0010\'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u001aR\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0014\u00100\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/\u00a8\u00062"
    }
    d2 = {
        "Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;",
        "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;",
        "Landroid/view/ViewGroup;",
        "ScrollViewT",
        "Lcom/facebook/react/bridge/UIManagerListener;",
        "scrollView",
        "",
        "horizontal",
        "<init>",
        "(Landroid/view/ViewGroup;Z)V",
        "Li7/B;",
        "updateScrollPositionInternal",
        "()V",
        "computeTargetView",
        "start",
        "stop",
        "updateScrollPosition",
        "Lcom/facebook/react/bridge/UIManager;",
        "uiManager",
        "willDispatchViewUpdates",
        "(Lcom/facebook/react/bridge/UIManager;)V",
        "willMountItems",
        "didMountItems",
        "didDispatchMountItems",
        "didScheduleMountItems",
        "Landroid/view/ViewGroup;",
        "Z",
        "Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;",
        "config",
        "Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;",
        "getConfig",
        "()Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;",
        "setConfig",
        "(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;)V",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/view/View;",
        "firstVisibleViewRef",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/graphics/Rect;",
        "prevFirstVisibleFrame",
        "Landroid/graphics/Rect;",
        "isListening",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "getContentView",
        "()Lcom/facebook/react/views/view/ReactViewGroup;",
        "contentView",
        "getUIManager",
        "()Lcom/facebook/react/bridge/UIManager;",
        "uIManager",
        "Config",
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
.field private config:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

.field private firstVisibleViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final horizontal:Z

.field private isListening:Z

.field private prevFirstVisibleFrame:Landroid/graphics/Rect;

.field private final scrollView:Landroid/view/ViewGroup;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TScrollViewT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TScrollViewT;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->scrollView:Landroid/view/ViewGroup;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->horizontal:Z

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->willDispatchViewUpdates$lambda$0(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final computeTargetView()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->config:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_5

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->scrollView:Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_5

    .line 11
    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->getContentView()Lcom/facebook/react/views/view/ReactViewGroup;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_2

    .line 16
    .line 17
    goto :goto_5

    .line 18
    :cond_2
    iget-boolean v3, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->horizontal:Z

    .line 19
    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_0

    .line 27
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->getMinIndexForVisible()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_1
    if-ge v0, v3, :cond_7

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-boolean v5, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->horizontal:Z

    .line 46
    .line 47
    if-eqz v5, :cond_4

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/view/View;->getX()F

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    :goto_2
    int-to-float v6, v6

    .line 58
    add-float/2addr v5, v6

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    goto :goto_2

    .line 69
    :goto_3
    int-to-float v6, v1

    .line 70
    cmpl-float v5, v5, v6

    .line 71
    .line 72
    if-gtz v5, :cond_6

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    add-int/lit8 v5, v5, -0x1

    .line 79
    .line 80
    if-ne v0, v5, :cond_5

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    :goto_4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 87
    .line 88
    invoke-direct {v0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->firstVisibleViewRef:Ljava/lang/ref/WeakReference;

    .line 92
    .line 93
    new-instance v0, Landroid/graphics/Rect;

    .line 94
    .line 95
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->prevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 102
    .line 103
    :cond_7
    :goto_5
    return-void
.end method

.method private final getContentView()Lcom/facebook/react/views/view/ReactViewGroup;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->scrollView:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    check-cast v0, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 13
    .line 14
    return-object v0
.end method

.method private final getUIManager()Lcom/facebook/react/bridge/UIManager;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->scrollView:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 12
    .line 13
    const-string v1, "Required value was null."

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v2, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->scrollView:Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 v2, 0x0

    .line 27
    :goto_1
    invoke-static {v2}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v0, v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getUIManager(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method private final updateScrollPositionInternal()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->config:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->firstVisibleViewRef:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :cond_1
    iget-object v2, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->prevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 14
    .line 15
    if-nez v2, :cond_2

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_2
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/view/View;

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    iget-object v3, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->scrollView:Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-nez v3, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    new-instance v4, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v4}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 39
    .line 40
    .line 41
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->horizontal:Z

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    iget v1, v4, Landroid/graphics/Rect;->left:I

    .line 47
    .line 48
    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 49
    .line 50
    sub-int/2addr v1, v2

    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    move-object v6, v3

    .line 58
    check-cast v6, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;

    .line 59
    .line 60
    add-int/2addr v1, v2

    .line 61
    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-interface {v6, v1, v7}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->scrollToPreservingMomentum(II)V

    .line 66
    .line 67
    .line 68
    iput-object v4, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->prevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->getAutoScrollToTopThreshold()Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->getAutoScrollToTopThreshold()Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-gt v2, v0, :cond_6

    .line 85
    .line 86
    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-interface {v6, v5, v0}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->reactSmoothScrollTo(II)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    iget v1, v4, Landroid/graphics/Rect;->top:I

    .line 95
    .line 96
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 97
    .line 98
    sub-int/2addr v1, v2

    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    move-object v6, v3

    .line 106
    check-cast v6, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;

    .line 107
    .line 108
    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    add-int/2addr v1, v2

    .line 113
    invoke-interface {v6, v7, v1}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->scrollToPreservingMomentum(II)V

    .line 114
    .line 115
    .line 116
    iput-object v4, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->prevFirstVisibleFrame:Landroid/graphics/Rect;

    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->getAutoScrollToTopThreshold()Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;->getAutoScrollToTopThreshold()Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-gt v2, v0, :cond_6

    .line 133
    .line 134
    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-interface {v6, v0, v5}, Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;->reactSmoothScrollTo(II)V

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_0
    return-void
.end method

.method private static final willDispatchViewUpdates$lambda$0(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->computeTargetView()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public didDispatchMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public didMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->updateScrollPositionInternal()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public didScheduleMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getConfig()Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->config:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setConfig(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->config:Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper$Config;

    .line 2
    .line 3
    return-void
.end method

.method public final start()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->isListening:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->isListening:Z

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->getUIManager()Lcom/facebook/react/bridge/UIManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p0}, Lcom/facebook/react/bridge/UIManager;->addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final stop()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->isListening:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->isListening:Z

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->getUIManager()Lcom/facebook/react/bridge/UIManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0, p0}, Lcom/facebook/react/bridge/UIManager;->removeUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final updateScrollPosition()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->scrollView:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->updateScrollPositionInternal()V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/facebook/react/views/scroll/a;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/facebook/react/views/scroll/a;-><init>(Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public willMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 1

    .line 1
    const-string v0, "uiManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/MaintainVisibleScrollPositionHelper;->computeTargetView()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
