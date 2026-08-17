.class public final LB6/a;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final g:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private h:D

.field private i:D

.field private j:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

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
    iput-object p1, p0, LB6/a;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    return-void
.end method

.method private final c()V
    .locals 10

    .line 1
    invoke-direct {p0, p0}, LB6/a;->d(Landroid/view/View;)Landroid/widget/ScrollView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 10
    .line 11
    .line 12
    iget-wide v2, p0, LB6/a;->i:D

    .line 13
    .line 14
    double-to-float v2, v2

    .line 15
    invoke-static {v2}, Lr6/f;->b(F)D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    double-to-int v2, v2

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    check-cast v3, Landroid/view/ViewGroup;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-nez v3, :cond_2

    .line 33
    .line 34
    :goto_1
    return-void

    .line 35
    :cond_2
    int-to-float v4, v2

    .line 36
    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    iget-wide v6, p0, LB6/a;->h:D

    .line 52
    .line 53
    iget-wide v8, p0, LB6/a;->i:D

    .line 54
    .line 55
    add-double/2addr v6, v8

    .line 56
    double-to-float v6, v6

    .line 57
    invoke-static {v6}, Lr6/f;->b(F)D

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    double-to-int v6, v6

    .line 62
    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 63
    .line 64
    .line 65
    iget v3, p0, LB6/a;->j:I

    .line 66
    .line 67
    sub-int v3, v2, v3

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->scrollBy(II)V

    .line 72
    .line 73
    .line 74
    :cond_3
    iput v2, p0, LB6/a;->j:I

    .line 75
    .line 76
    return-void
.end method

.method private final d(Landroid/view/View;)Landroid/widget/ScrollView;
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/widget/ScrollView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/widget/ScrollView;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :goto_0
    move-object v2, p1

    .line 15
    check-cast v2, Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v0, v3, :cond_1

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {p0, v1}, LB6/a;->d(Landroid/view/View;)Landroid/widget/ScrollView;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, LB6/a;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

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
    invoke-direct {p0}, LB6/a;->c()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setApplyWorkaroundForContentInsetHitTestBug(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setContentInsetBottom(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, LB6/a;->h:D

    .line 2
    .line 3
    invoke-direct {p0}, LB6/a;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setContentInsetTop(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, LB6/a;->i:D

    .line 2
    .line 3
    invoke-direct {p0}, LB6/a;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
