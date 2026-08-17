.class public final Lcom/swmansion/rnscreens/D$b;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/D;-><init>(Lcom/facebook/react/bridge/ReactContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/swmansion/rnscreens/D;


# direct methods
.method constructor <init>(Lcom/swmansion/rnscreens/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 3

    .line 1
    const-string v0, "bottomSheet"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-static {p1, p2}, Lcom/swmansion/rnscreens/D;->j(Lcom/swmansion/rnscreens/D;F)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/swmansion/rnscreens/D;->g(Lcom/swmansion/rnscreens/D;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/swmansion/rnscreens/D;->d(Lcom/swmansion/rnscreens/D;)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iget-object v0, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/swmansion/rnscreens/D;->f(Lcom/swmansion/rnscreens/D;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 37
    .line 38
    invoke-static {v1}, Lcom/swmansion/rnscreens/D;->e(Lcom/swmansion/rnscreens/D;)F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {v1, v2}, Lcom/swmansion/rnscreens/D;->m(Lcom/swmansion/rnscreens/D;F)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v2, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 47
    .line 48
    invoke-static {v2}, Lcom/swmansion/rnscreens/D;->c(Lcom/swmansion/rnscreens/D;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/swmansion/rnscreens/D;->n(IIII)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 4

    .line 1
    const-string v0, "bottomSheet"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LL6/q;->a:LL6/q;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, LL6/q;->b(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 p1, 0x3

    .line 16
    if-eq p2, p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    if-eq p2, p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x6

    .line 22
    if-eq p2, p1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/swmansion/rnscreens/D;->d(Lcom/swmansion/rnscreens/D;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 32
    .line 33
    invoke-static {v1}, Lcom/swmansion/rnscreens/D;->f(Lcom/swmansion/rnscreens/D;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 38
    .line 39
    invoke-static {v2, p2}, Lcom/swmansion/rnscreens/D;->l(Lcom/swmansion/rnscreens/D;I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iget-object v3, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 44
    .line 45
    invoke-static {v3}, Lcom/swmansion/rnscreens/D;->c(Lcom/swmansion/rnscreens/D;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/swmansion/rnscreens/D;->n(IIII)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/D$b;->a:Lcom/swmansion/rnscreens/D;

    .line 53
    .line 54
    invoke-static {p1, p2}, Lcom/swmansion/rnscreens/D;->k(Lcom/swmansion/rnscreens/D;I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
