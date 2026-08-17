.class public final LC6/b;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final g:Lcom/facebook/react/uimanager/ThemedReactContext;


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
    iput-object p1, p0, LC6/b;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    .line 1
    iget-object v0, p0, LC6/b;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    invoke-static {v0}, LC6/c;->b(Lcom/facebook/react/uimanager/ThemedReactContext;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-super {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setBackgroundColor(I)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "onApplyWindowInsets(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/ReactViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LC6/b;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 5
    .line 6
    invoke-static {v0}, LC6/c;->b(Lcom/facebook/react/uimanager/ThemedReactContext;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-super {p0, v0}, Lcom/facebook/react/views/view/ReactViewGroup;->setBackgroundColor(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LC6/b;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 5
    .line 6
    invoke-static {p1}, LC6/c;->b(Lcom/facebook/react/uimanager/ThemedReactContext;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;->setBackgroundColor(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    return-void
.end method
