.class public final Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNSBottomTabs"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/gamma/tabs/l;",
        ">;",
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface<",
        "Lcom/swmansion/rnscreens/gamma/tabs/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0018\u0008\u0007\u0018\u0000 B2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001CB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008#\u0010$J!\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u0008&\u0010\'J!\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\u0008(\u0010\'J!\u0010*\u001a\u00020\u00152\u0008\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017\u00a2\u0006\u0004\u0008*\u0010+J!\u0010-\u001a\u00020\u00152\u0008\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008-\u0010.J!\u0010/\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017\u00a2\u0006\u0004\u0008/\u00100J!\u00101\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017\u00a2\u0006\u0004\u00081\u00100J!\u00102\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017\u00a2\u0006\u0004\u00082\u00100J!\u00103\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u00083\u0010\'J!\u00104\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u00084\u0010\'J!\u00105\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u00085\u00100J!\u00106\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u00086\u00100J\u001f\u00107\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017\u00a2\u0006\u0004\u00087\u0010.J!\u00108\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u00088\u0010\'J!\u00109\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u00089\u0010\'J!\u0010:\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u0008:\u0010\'J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017\u00a2\u0006\u0004\u0008;\u0010.J!\u0010<\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u0008<\u0010\'J!\u0010=\u001a\u00020\u00152\u0008\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017\u00a2\u0006\u0004\u0008=\u0010+J!\u0010>\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0004\u0008>\u0010\'J!\u0010?\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017\u00a2\u0006\u0004\u0008?\u00100R\u001a\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010A\u00a8\u0006D"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/swmansion/rnscreens/gamma/tabs/l;",
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;",
        "<init>",
        "()V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "reactContext",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/l;",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getDelegate",
        "()Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "parent",
        "Landroid/view/View;",
        "child",
        "",
        "index",
        "Li7/B;",
        "addView",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;I)V",
        "removeView",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;)V",
        "removeViewAt",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;I)V",
        "removeAllViews",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;)V",
        "",
        "",
        "getExportedCustomDirectEventTypeConstants",
        "()Ljava/util/Map;",
        "view",
        "addEventEmitters",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/l;)V",
        "value",
        "setTabBarBackgroundColor",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V",
        "setTabBarTintColor",
        "",
        "setTabBarItemTitleFontSize",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;F)V",
        "",
        "setControlNavigationStateInJS",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V",
        "setTabBarItemTitleFontFamily",
        "(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V",
        "setTabBarItemTitleFontWeight",
        "setTabBarItemTitleFontStyle",
        "setTabBarItemTitleFontColor",
        "setTabBarItemIconColor",
        "setTabBarMinimizeBehavior",
        "setTabBarControllerMode",
        "setTabBarHidden",
        "setNativeContainerBackgroundColor",
        "setTabBarItemTitleFontColorActive",
        "setTabBarItemActiveIndicatorColor",
        "setTabBarItemActiveIndicatorEnabled",
        "setTabBarItemIconColorActive",
        "setTabBarItemTitleFontSizeActive",
        "setTabBarItemRippleColor",
        "setTabBarItemLabelVisibilityMode",
        "delegate",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "Companion",
        "a",
        "react-native-screens_release"
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
.field public static final Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSBottomTabs"


# instance fields
.field private final delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/swmansion/rnscreens/gamma/tabs/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager$a;

    .line 8
    .line 9
    return-void
.end method

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
    new-instance v0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V

    .line 3
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->B()V

    return-void
.end method

.method public bridge synthetic addView(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->addView(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic addView(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->addView(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;I)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    instance-of v0, p2, Lcom/swmansion/rnscreens/gamma/tabs/a;

    if-eqz v0, :cond_0

    .line 4
    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/a;

    invoke-virtual {p1, p2, p3}, Lcom/swmansion/rnscreens/gamma/tabs/l;->A(Lcom/swmansion/rnscreens/gamma/tabs/a;I)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "[RNScreens] Attempt to attach child that is not of type javaClass"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/l;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/l;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/swmansion/rnscreens/gamma/tabs/l;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 2
    .line 3
    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, LS6/e;->d:LS6/e$a;

    .line 2
    .line 3
    invoke-static {v0}, LQ6/a;->a(LP6/b;)Lkotlin/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lj7/K;->m([Lkotlin/Pair;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNSBottomTabs"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->removeAllViews(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    return-void
.end method

.method public removeAllViews(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->D()V

    return-void
.end method

.method public bridge synthetic removeView(Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->removeView(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;)V

    return-void
.end method

.method public removeView(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p2, Lcom/swmansion/rnscreens/gamma/tabs/a;

    if-eqz v0, :cond_0

    .line 3
    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/a;

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->G(Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "[RNScreens] Attempt to detach child that is not of type javaClass"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic removeViewAt(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->removeViewAt(Lcom/swmansion/rnscreens/gamma/tabs/l;I)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->removeViewAt(Lcom/swmansion/rnscreens/gamma/tabs/l;I)V

    return-void
.end method

.method public removeViewAt(Lcom/swmansion/rnscreens/gamma/tabs/l;I)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->H(I)V

    return-void
.end method

.method public bridge synthetic setControlNavigationStateInJS(Landroid/view/View;Z)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setControlNavigationStateInJS(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V

    return-void
.end method

.method public setControlNavigationStateInJS(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic setNativeContainerBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setNativeContainerBackgroundColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setNativeContainerBackgroundColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "nativeContainerBackgroundColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setNativeContainerBackgroundColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarBackgroundColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarBackgroundColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarBackgroundColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarBackgroundColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarControllerMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarControllerMode(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V

    return-void
.end method

.method public setTabBarControllerMode(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V
    .locals 0

    .line 1
    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTabBarHidden(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarHidden(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V

    return-void
.end method

.method public setTabBarHidden(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarHidden"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarHidden(Z)V

    return-void
.end method

.method public bridge synthetic setTabBarItemActiveIndicatorColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemActiveIndicatorColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemActiveIndicatorColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemActiveIndicatorColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemActiveIndicatorColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemActiveIndicatorEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemActiveIndicatorEnabled(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V

    return-void
.end method

.method public setTabBarItemActiveIndicatorEnabled(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarItemActiveIndicatorEnabled"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemActiveIndicatorEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setTabBarItemIconColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemIconColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemIconColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemIconColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemIconColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemIconColorActive(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemIconColorActive(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemIconColorActive(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemIconColorActive"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemIconColorActive(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemLabelVisibilityMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemLabelVisibilityMode(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V

    return-void
.end method

.method public setTabBarItemLabelVisibilityMode(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarItemLabelVisibilityMode"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemLabelVisibilityMode(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemRippleColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemRippleColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemRippleColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemRippleColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemRippleColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemTitleFontColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemTitleFontColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemTitleFontColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemTitleFontColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemTitleFontColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemTitleFontColorActive(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemTitleFontColorActive(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemTitleFontColorActive(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemTitleFontColorActive"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemTitleFontColorActive(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemTitleFontFamily(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V

    return-void
.end method

.method public setTabBarItemTitleFontFamily(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarItemTitleFontFamily"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemTitleFontFamily(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemTitleFontSize(Landroid/view/View;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemTitleFontSize(Lcom/swmansion/rnscreens/gamma/tabs/l;F)V

    return-void
.end method

.method public setTabBarItemTitleFontSize(Lcom/swmansion/rnscreens/gamma/tabs/l;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarItemTitleFontSize"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemTitleFontSize(Ljava/lang/Float;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setTabBarItemTitleFontSizeActive(Landroid/view/View;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemTitleFontSizeActive(Lcom/swmansion/rnscreens/gamma/tabs/l;F)V

    return-void
.end method

.method public setTabBarItemTitleFontSizeActive(Lcom/swmansion/rnscreens/gamma/tabs/l;F)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarItemTitleFontSizeActive"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemTitleFontSizeActive(Ljava/lang/Float;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setTabBarItemTitleFontStyle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemTitleFontStyle(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V

    return-void
.end method

.method public setTabBarItemTitleFontStyle(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarItemTitleFontStyle"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemTitleFontStyle(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarItemTitleFontWeight(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V

    return-void
.end method

.method public setTabBarItemTitleFontWeight(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabBarItemTitleFontWeight"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setTabBarItemTitleFontWeight(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTabBarMinimizeBehavior(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarMinimizeBehavior(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V

    return-void
.end method

.method public setTabBarMinimizeBehavior(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V
    .locals 0

    .line 1
    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTabBarTintColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;->setTabBarTintColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarTintColor(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
