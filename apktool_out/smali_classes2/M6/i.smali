.class public final LM6/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lcom/swmansion/rnscreens/y;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/y;)V
    .locals 1

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Li7/B;
    .locals 4

    .line 1
    invoke-virtual {p0}, LM6/i;->f()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LM6/f;

    .line 8
    .line 9
    invoke-virtual {p0}, LM6/i;->g()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v1, v2, v3}, LM6/f;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Li7/B;->a:Li7/B;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public final b()Li7/B;
    .locals 4

    .line 1
    invoke-virtual {p0}, LM6/i;->f()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LM6/g;

    .line 8
    .line 9
    invoke-virtual {p0}, LM6/i;->g()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v1, v2, v3}, LM6/g;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Li7/B;->a:Li7/B;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public final c()Li7/B;
    .locals 4

    .line 1
    invoke-virtual {p0}, LM6/i;->f()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LM6/k;

    .line 8
    .line 9
    invoke-virtual {p0}, LM6/i;->g()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v1, v2, v3}, LM6/k;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Li7/B;->a:Li7/B;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public final d()Li7/B;
    .locals 4

    .line 1
    invoke-virtual {p0}, LM6/i;->f()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LM6/l;

    .line 8
    .line 9
    invoke-virtual {p0}, LM6/i;->g()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v1, v2, v3}, LM6/l;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Li7/B;->a:Li7/B;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public final e(FZZ)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, LB7/d;->k(FFF)F

    .line 5
    .line 6
    .line 7
    move-result v5

    .line 8
    sget-object p1, Lcom/swmansion/rnscreens/F;->n:Lcom/swmansion/rnscreens/F$a;

    .line 9
    .line 10
    invoke-virtual {p1, v5}, Lcom/swmansion/rnscreens/F$a;->a(F)S

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    invoke-virtual {p0}, LM6/i;->f()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v2, LM6/j;

    .line 21
    .line 22
    invoke-virtual {p0}, LM6/i;->g()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget-object v0, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    move v6, p2

    .line 33
    move v7, p3

    .line 34
    invoke-direct/range {v2 .. v8}, LM6/j;-><init>(IIFZZS)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final f()Lcom/facebook/react/uimanager/events/EventDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getReactEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget-object v0, p0, LM6/i;->a:Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
