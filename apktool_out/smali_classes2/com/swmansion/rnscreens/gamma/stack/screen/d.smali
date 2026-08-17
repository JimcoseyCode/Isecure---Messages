.class public final Lcom/swmansion/rnscreens/gamma/stack/screen/d;
.super Landroidx/fragment/app/Fragment;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final g:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

.field private h:Lcom/swmansion/rnscreens/gamma/stack/screen/b;


# direct methods
.method public constructor <init>(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V
    .locals 1

    .line 1
    const-string v0, "stackScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->g:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->g:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 7
    .line 8
    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->g:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/stack/screen/a;->c()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->h:Lcom/swmansion/rnscreens/gamma/stack/screen/b;

    .line 6
    .line 7
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->g:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/r;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v0, "getViewLifecycleOwner(...)"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/stack/screen/a;->a(Landroidx/lifecycle/r;)Lcom/swmansion/rnscreens/gamma/stack/screen/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->h:Lcom/swmansion/rnscreens/gamma/stack/screen/b;

    .line 25
    .line 26
    return-void
.end method

.method public final w()Lcom/swmansion/rnscreens/gamma/stack/screen/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->g:Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 2
    .line 3
    return-object v0
.end method
