.class public final Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerInterface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "LB6/a;",
        ">;",
        "Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerInterface<",
        "LB6/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00132\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J!\u0010\u0018\u001a\u00020\u00132\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR0\u0010\u001f\u001a\u001e\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\u00000\u00000\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "LB6/a;",
        "Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerInterface;",
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
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/a;",
        "view",
        "",
        "value",
        "Li7/B;",
        "setContentInsetBottom",
        "(LB6/a;D)V",
        "setContentInsetTop",
        "",
        "setApplyWorkaroundForContentInsetHitTestBug",
        "(LB6/a;Z)V",
        "Lw6/a;",
        "manager",
        "Lw6/a;",
        "Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "mDelegate",
        "Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate;",
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
.field private final mDelegate:Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate<",
            "LB6/a;",
            "Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;",
            ">;"
        }
    .end annotation
.end field

.field private final manager:Lw6/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lw6/a;

    .line 7
    .line 8
    invoke-direct {v0}, Lw6/a;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->manager:Lw6/a;

    .line 12
    .line 13
    new-instance v0, Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->mDelegate:Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/a;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->manager:Lw6/a;

    invoke-virtual {v0, p1}, Lw6/a;->a(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/a;

    move-result-object p1

    return-object p1
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "LB6/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->mDelegate:Lcom/facebook/react/viewmanagers/ClippingScrollViewDecoratorViewManagerDelegate;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ClippingScrollViewDecoratorView"

    .line 2
    .line 3
    return-object v0
.end method

.method public setApplyWorkaroundForContentInsetHitTestBug(LB6/a;Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2}, LB6/a;->setApplyWorkaroundForContentInsetHitTestBug(Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setApplyWorkaroundForContentInsetHitTestBug(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, LB6/a;

    invoke-virtual {p0, p1, p2}, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->setApplyWorkaroundForContentInsetHitTestBug(LB6/a;Z)V

    return-void
.end method

.method public setContentInsetBottom(LB6/a;D)V
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2, p3}, LB6/a;->setContentInsetBottom(D)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setContentInsetBottom(Landroid/view/View;D)V
    .locals 0

    .line 1
    check-cast p1, LB6/a;

    invoke-virtual {p0, p1, p2, p3}, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->setContentInsetBottom(LB6/a;D)V

    return-void
.end method

.method public setContentInsetTop(LB6/a;D)V
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2, p3}, LB6/a;->setContentInsetTop(D)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setContentInsetTop(Landroid/view/View;D)V
    .locals 0

    .line 1
    check-cast p1, LB6/a;

    invoke-virtual {p0, p1, p2, p3}, Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;->setContentInsetTop(LB6/a;D)V

    return-void
.end method
