.class final Lcom/swmansion/rnscreens/gamma/tabs/l$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/gamma/tabs/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/swmansion/rnscreens/gamma/tabs/l;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$c;->a:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$c;->a:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->o(Lcom/swmansion/rnscreens/gamma/tabs/l;)Landroid/widget/FrameLayout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$c;->a:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->p(Lcom/swmansion/rnscreens/gamma/tabs/l;)Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getShouldUseRepeatedTabSelectionPopToRootSpecialEffect()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    sget-object v2, LQ6/f;->a:LQ6/f;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, LQ6/f;->a(Landroid/view/View;)Lcom/swmansion/rnscreens/S;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/S;->d0()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    return v3

    .line 39
    :cond_0
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x0

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    sget-object v1, LQ6/f;->a:LQ6/f;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, LQ6/f;->b(Landroid/view/View;)Landroid/widget/ScrollView;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-lez v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 69
    .line 70
    .line 71
    return v3

    .line 72
    :cond_1
    return v2
.end method
