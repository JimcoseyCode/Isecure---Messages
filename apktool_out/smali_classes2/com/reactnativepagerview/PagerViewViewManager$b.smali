.class public final Lcom/reactnativepagerview/PagerViewViewManager$b;
.super Landroidx/viewpager2/widget/ViewPager2$i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativepagerview/PagerViewViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/uimanager/ThemedReactContext;

.field final synthetic b:Lcom/reactnativepagerview/b;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->b:Lcom/reactnativepagerview/b;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$i;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$i;->a(I)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    const-string p1, "settling"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "Unsupported pageScrollState"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    const-string p1, "dragging"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const-string p1, "idle"

    .line 27
    .line 28
    :goto_0
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->b:Lcom/reactnativepagerview/b;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    new-instance v1, LE6/b;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->b:Lcom/reactnativepagerview/b;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-direct {v1, v2, p1}, LE6/b;-><init>(ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method

.method public b(IFI)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/viewpager2/widget/ViewPager2$i;->b(IFI)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->b:Lcom/reactnativepagerview/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p3, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    new-instance v0, LE6/a;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->b:Lcom/reactnativepagerview/b;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {v0, v1, p1, p2}, LE6/a;-><init>(IIF)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p3, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$i;->c(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->b:Lcom/reactnativepagerview/b;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, LE6/c;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/reactnativepagerview/PagerViewViewManager$b;->b:Lcom/reactnativepagerview/b;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-direct {v1, v2, p1}, LE6/c;-><init>(II)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
