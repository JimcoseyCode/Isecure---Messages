.class public final Lcom/reactnativepagerview/PagerViewViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNCViewPager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativepagerview/PagerViewViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/reactnativepagerview/b;",
        ">;",
        "Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface<",
        "Lcom/reactnativepagerview/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0016\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 G2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001HB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016\u00a2\u0006\u0004\u0008+\u0010,J!\u0010.\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017\u00a2\u0006\u0004\u0008.\u0010/J#\u00100\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0008\u0010-\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0004\u00080\u00101J!\u00102\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017\u00a2\u0006\u0004\u00082\u0010)J#\u00103\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0008\u0010-\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0004\u00083\u00101J!\u00104\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017\u00a2\u0006\u0004\u00084\u0010)J!\u00105\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017\u00a2\u0006\u0004\u00085\u0010)J#\u00106\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0008\u0010-\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0004\u00086\u00101J!\u00107\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017\u00a2\u0006\u0004\u00087\u0010/J#\u00108\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0008\u0010-\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0004\u00088\u00101J\'\u0010;\u001a\u00020\u00102\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020*\u00a2\u0006\u0004\u0008;\u0010<J!\u0010=\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008=\u0010)J!\u0010>\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008>\u0010)J!\u0010@\u001a\u00020\u00102\u0008\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010?\u001a\u00020*H\u0016\u00a2\u0006\u0004\u0008@\u0010/J\'\u0010C\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0B0AH\u0016\u00a2\u0006\u0004\u0008C\u0010DR\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010F\u00a8\u0006I"
    }
    d2 = {
        "Lcom/reactnativepagerview/PagerViewViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/reactnativepagerview/b;",
        "Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface;",
        "<init>",
        "()V",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getDelegate",
        "()Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "root",
        "commandId",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "args",
        "Li7/B;",
        "receiveCommand",
        "(Lcom/reactnativepagerview/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "reactContext",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/b;",
        "host",
        "Landroid/view/View;",
        "child",
        "",
        "index",
        "addView",
        "(Lcom/reactnativepagerview/b;Landroid/view/View;I)V",
        "parent",
        "getChildCount",
        "(Lcom/reactnativepagerview/b;)I",
        "getChildAt",
        "(Lcom/reactnativepagerview/b;I)Landroid/view/View;",
        "view",
        "removeView",
        "(Lcom/reactnativepagerview/b;Landroid/view/View;)V",
        "removeAllViews",
        "(Lcom/reactnativepagerview/b;)V",
        "removeViewAt",
        "(Lcom/reactnativepagerview/b;I)V",
        "",
        "needsCustomLayoutForChildren",
        "()Z",
        "value",
        "setScrollEnabled",
        "(Lcom/reactnativepagerview/b;Z)V",
        "setLayoutDirection",
        "(Lcom/reactnativepagerview/b;Ljava/lang/String;)V",
        "setInitialPage",
        "setOrientation",
        "setOffscreenPageLimit",
        "setPageMargin",
        "setOverScrollMode",
        "setOverdrag",
        "setKeyboardDismissMode",
        "selectedPage",
        "scrollWithAnimation",
        "goTo",
        "(Lcom/reactnativepagerview/b;IZ)V",
        "setPage",
        "setPageWithoutAnimation",
        "scrollEnabled",
        "setScrollEnabledImperatively",
        "",
        "",
        "getExportedCustomDirectEventTypeConstants",
        "()Ljava/util/Map;",
        "mDelegate",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "Companion",
        "a",
        "react-native-pager-view_release"
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
.field public static final Companion:Lcom/reactnativepagerview/PagerViewViewManager$a;


# instance fields
.field private final mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/reactnativepagerview/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/reactnativepagerview/PagerViewViewManager$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/reactnativepagerview/PagerViewViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/reactnativepagerview/PagerViewViewManager;->Companion:Lcom/reactnativepagerview/PagerViewViewManager$a;

    .line 8
    .line 9
    sget-object v0, Lcom/reactnativepagerview/a;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
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
    new-instance v0, Lcom/facebook/react/viewmanagers/RNCViewPagerManagerDelegate;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/facebook/react/viewmanagers/RNCViewPagerManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->createViewInstance$lambda$0(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final createViewInstance$lambda$0(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/b;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/reactnativepagerview/PagerViewViewManager$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager$b;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/b;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/viewpager2/widget/ViewPager2;->g(Landroidx/viewpager2/widget/ViewPager2$i;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    new-instance v0, LE6/c;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-direct {v0, p2, p0}, LE6/c;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic addView(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativepagerview/PagerViewViewManager;->addView(Lcom/reactnativepagerview/b;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic addView(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativepagerview/PagerViewViewManager;->addView(Lcom/reactnativepagerview/b;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/reactnativepagerview/b;Landroid/view/View;I)V
    .locals 1

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2, p3}, Lcom/reactnativepagerview/i;->e(Lcom/reactnativepagerview/b;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/b;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/b;
    .locals 4

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/reactnativepagerview/b;

    invoke-direct {v0, p1}, Lcom/reactnativepagerview/b;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 4
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 6
    new-instance v2, Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {v2, p1}, Landroidx/viewpager2/widget/ViewPager2;-><init>(Landroid/content/Context;)V

    .line 7
    new-instance v3, Lcom/reactnativepagerview/j;

    invoke-direct {v3}, Lcom/reactnativepagerview/j;-><init>()V

    invoke-virtual {v2, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 8
    invoke-virtual {v2, v1}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 9
    new-instance v1, Lcom/reactnativepagerview/d;

    invoke-direct {v1, v2, p1, v0}, Lcom/reactnativepagerview/d;-><init>(Landroidx/viewpager2/widget/ViewPager2;Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/reactnativepagerview/b;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 10
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public bridge synthetic getChildAt(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildAt(Lcom/reactnativepagerview/b;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildAt(Lcom/reactnativepagerview/b;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildAt(Lcom/reactnativepagerview/b;I)Landroid/view/View;
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->h(Lcom/reactnativepagerview/b;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/View;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildCount(Lcom/reactnativepagerview/b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/ViewGroup;)I
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->getChildCount(Lcom/reactnativepagerview/b;)I

    move-result p1

    return p1
.end method

.method public getChildCount(Lcom/reactnativepagerview/b;)I
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1}, Lcom/reactnativepagerview/i;->i(Lcom/reactnativepagerview/b;)I

    move-result p1

    return p1
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/reactnativepagerview/b;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    .line 2
    .line 3
    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    const-string v0, "onPageScroll"

    .line 2
    .line 3
    const-string v1, "registrationName"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const-string v0, "onPageScrollStateChanged"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const-string v0, "onPageSelected"

    .line 16
    .line 17
    invoke-static {v1, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const-string v2, "topPageScroll"

    .line 22
    .line 23
    const-string v4, "topPageScrollStateChanged"

    .line 24
    .line 25
    const-string v6, "topPageSelected"

    .line 26
    .line 27
    invoke-static/range {v2 .. v7}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNCViewPager"

    .line 2
    .line 3
    return-object v0
.end method

.method public final goTo(Lcom/reactnativepagerview/b;IZ)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/reactnativepagerview/i;->j(Lcom/reactnativepagerview/b;)Landroidx/viewpager2/widget/ViewPager2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lo3/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$h;->d()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-lez v2, :cond_2

    .line 36
    .line 37
    if-ltz p2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-ge p2, v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2, p3}, Lcom/reactnativepagerview/i;->q(Landroidx/viewpager2/widget/ViewPager2;IZ)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/reactnativepagerview/i;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativepagerview/PagerViewViewManager;->receiveCommand(Lcom/reactnativepagerview/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/reactnativepagerview/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/reactnativepagerview/PagerViewViewManager;->mDelegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/ViewManagerDelegate;->kotlinCompat$receiveCommandNullableArgs(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1}, Lcom/reactnativepagerview/PagerViewViewManager;->removeAllViews(Lcom/reactnativepagerview/b;)V

    return-void
.end method

.method public removeAllViews(Lcom/reactnativepagerview/b;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1}, Lcom/reactnativepagerview/i;->n(Lcom/reactnativepagerview/b;)V

    return-void
.end method

.method public bridge synthetic removeView(Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->removeView(Lcom/reactnativepagerview/b;Landroid/view/View;)V

    return-void
.end method

.method public removeView(Lcom/reactnativepagerview/b;Landroid/view/View;)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->o(Lcom/reactnativepagerview/b;Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->removeViewAt(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->removeViewAt(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public removeViewAt(Lcom/reactnativepagerview/b;I)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->p(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public bridge synthetic setInitialPage(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setInitialPage(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public setInitialPage(Lcom/reactnativepagerview/b;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0x0
        name = "initialPage"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->r(Lcom/reactnativepagerview/b;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setKeyboardDismissMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setKeyboardDismissMode(Lcom/reactnativepagerview/b;Ljava/lang/String;)V

    return-void
.end method

.method public setKeyboardDismissMode(Lcom/reactnativepagerview/b;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "keyboardDismissMode"
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic setLayoutDirection(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setLayoutDirection(Lcom/reactnativepagerview/b;Ljava/lang/String;)V

    return-void
.end method

.method public setLayoutDirection(Lcom/reactnativepagerview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "layoutDirection"
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->t(Lcom/reactnativepagerview/b;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOffscreenPageLimit(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOffscreenPageLimit(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public setOffscreenPageLimit(Lcom/reactnativepagerview/b;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = -0x1
        name = "offscreenPageLimit"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->u(Lcom/reactnativepagerview/b;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOrientation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOrientation(Lcom/reactnativepagerview/b;Ljava/lang/String;)V

    return-void
.end method

.method public setOrientation(Lcom/reactnativepagerview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "orientation"
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->v(Lcom/reactnativepagerview/b;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOverScrollMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOverScrollMode(Lcom/reactnativepagerview/b;Ljava/lang/String;)V

    return-void
.end method

.method public setOverScrollMode(Lcom/reactnativepagerview/b;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "overScrollMode"
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->w(Lcom/reactnativepagerview/b;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setOverdrag(Landroid/view/View;Z)V
    .locals 0

    .line 2
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setOverdrag(Lcom/reactnativepagerview/b;Z)V

    return-void
.end method

.method public setOverdrag(Lcom/reactnativepagerview/b;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "overdrag"
    .end annotation

    .line 1
    return-void
.end method

.method public bridge synthetic setPage(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setPage(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public setPage(Lcom/reactnativepagerview/b;I)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/reactnativepagerview/PagerViewViewManager;->goTo(Lcom/reactnativepagerview/b;IZ)V

    return-void
.end method

.method public bridge synthetic setPageMargin(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setPageMargin(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public setPageMargin(Lcom/reactnativepagerview/b;I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultInt = 0x0
        name = "pageMargin"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->x(Lcom/reactnativepagerview/b;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setPageWithoutAnimation(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setPageWithoutAnimation(Lcom/reactnativepagerview/b;I)V

    return-void
.end method

.method public setPageWithoutAnimation(Lcom/reactnativepagerview/b;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/reactnativepagerview/PagerViewViewManager;->goTo(Lcom/reactnativepagerview/b;IZ)V

    return-void
.end method

.method public bridge synthetic setScrollEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setScrollEnabled(Lcom/reactnativepagerview/b;Z)V

    return-void
.end method

.method public setScrollEnabled(Lcom/reactnativepagerview/b;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        defaultBoolean = true
        name = "scrollEnabled"
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->z(Lcom/reactnativepagerview/b;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setScrollEnabledImperatively(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativepagerview/b;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativepagerview/PagerViewViewManager;->setScrollEnabledImperatively(Lcom/reactnativepagerview/b;Z)V

    return-void
.end method

.method public setScrollEnabledImperatively(Lcom/reactnativepagerview/b;Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lcom/reactnativepagerview/i;->a:Lcom/reactnativepagerview/i;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativepagerview/i;->z(Lcom/reactnativepagerview/b;Z)V

    :cond_0
    return-void
.end method
