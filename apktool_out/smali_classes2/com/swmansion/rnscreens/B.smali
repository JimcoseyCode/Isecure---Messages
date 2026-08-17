.class public final Lcom/swmansion/rnscreens/B;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/B$a;
    }
.end annotation


# instance fields
.field private g:Lcom/swmansion/rnscreens/B$a;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
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
    return-void
.end method


# virtual methods
.method public final getDelegate$react_native_screens_release()Lcom/swmansion/rnscreens/B$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/B;->g:Lcom/swmansion/rnscreens/B$a;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/B;->g:Lcom/swmansion/rnscreens/B$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move v5, p5

    .line 10
    invoke-interface/range {v0 .. v5}, Lcom/swmansion/rnscreens/B$a;->a(ZIIII)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/B$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/B;->g:Lcom/swmansion/rnscreens/B$a;

    .line 2
    .line 3
    return-void
.end method
