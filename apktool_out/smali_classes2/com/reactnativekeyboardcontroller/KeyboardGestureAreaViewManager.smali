.class public final Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;
.super Lcom/facebook/react/views/view/ReactViewManager;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerInterface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/views/view/ReactViewManager;",
        "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerInterface<",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0017\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00142\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0004\u0008\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R0\u0010#\u001a\u001e\u0012\u000c\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \"*\u0004\u0018\u00010\u00000\u00000!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;",
        "Lcom/facebook/react/views/view/ReactViewManager;",
        "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerInterface;",
        "Lcom/facebook/react/views/view/ReactViewGroup;",
        "<init>",
        "()V",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getDelegate",
        "()Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "context",
        "LB6/g;",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/g;",
        "view",
        "",
        "value",
        "Li7/B;",
        "setOffset",
        "(Lcom/facebook/react/views/view/ReactViewGroup;D)V",
        "setInterpolator",
        "(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V",
        "",
        "setShowOnSwipeUp",
        "(Lcom/facebook/react/views/view/ReactViewGroup;Z)V",
        "setEnableSwipeToDismiss",
        "setTextInputNativeID",
        "Lw6/d;",
        "manager",
        "Lw6/d;",
        "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "mDelegate",
        "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;",
        "react-native-keyboard-controller_release"
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
.field private final mDelegate:Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate<",
            "Lcom/facebook/react/views/view/ReactViewGroup;",
            "Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;",
            ">;"
        }
    .end annotation
.end field

.field private final manager:Lw6/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw6/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lw6/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->manager:Lw6/d;

    .line 10
    .line 11
    new-instance v0, Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->mDelegate:Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->manager:Lw6/d;

    invoke-virtual {v0, p1}, Lw6/d;->a(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/view/ReactViewGroup;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/g;

    move-result-object p1

    return-object p1
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/facebook/react/views/view/ReactViewGroup;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->mDelegate:Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "KeyboardGestureArea"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic setEnableSwipeToDismiss(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->setEnableSwipeToDismiss(Lcom/facebook/react/views/view/ReactViewGroup;Z)V

    return-void
.end method

.method public setEnableSwipeToDismiss(Lcom/facebook/react/views/view/ReactViewGroup;Z)V
    .locals 2
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "enableSwipeToDismiss"
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->manager:Lw6/d;

    const-string v1, "null cannot be cast to non-null type com.reactnativekeyboardcontroller.views.KeyboardGestureAreaReactViewGroup"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LB6/g;

    invoke-virtual {v0, p1, p2}, Lw6/d;->d(LB6/g;Z)V

    return-void
.end method

.method public bridge synthetic setInterpolator(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->setInterpolator(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V

    return-void
.end method

.method public setInterpolator(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "interpolator"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->manager:Lw6/d;

    check-cast p1, LB6/g;

    if-nez p2, :cond_0

    const-string p2, "linear"

    :cond_0
    invoke-virtual {v0, p1, p2}, Lw6/d;->b(LB6/g;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setOffset(Landroid/view/View;D)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->setOffset(Lcom/facebook/react/views/view/ReactViewGroup;D)V

    return-void
.end method

.method public setOffset(Lcom/facebook/react/views/view/ReactViewGroup;D)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "offset"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->manager:Lw6/d;

    check-cast p1, LB6/g;

    invoke-virtual {v0, p1, p2, p3}, Lw6/d;->c(LB6/g;D)V

    return-void
.end method

.method public bridge synthetic setShowOnSwipeUp(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->setShowOnSwipeUp(Lcom/facebook/react/views/view/ReactViewGroup;Z)V

    return-void
.end method

.method public setShowOnSwipeUp(Lcom/facebook/react/views/view/ReactViewGroup;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "showOnSwipeUp"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->manager:Lw6/d;

    check-cast p1, LB6/g;

    invoke-virtual {v0, p1, p2}, Lw6/d;->e(LB6/g;Z)V

    return-void
.end method

.method public bridge synthetic setTextInputNativeID(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;->setTextInputNativeID(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V

    return-void
.end method

.method public setTextInputNativeID(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "textInputNativeID"
    .end annotation

    .line 1
    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
