.class Landroidx/fragment/app/q$a;
.super Landroidx/fragment/app/v;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/core/content/b;
.implements Landroidx/core/content/c;
.implements Landroidx/core/app/q;
.implements Landroidx/core/app/r;
.implements Landroidx/lifecycle/W;
.implements Landroidx/activity/V;
.implements Ld/f;
.implements Lh1/i;
.implements Landroidx/fragment/app/F;
.implements Landroidx/core/view/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic l:Landroidx/fragment/app/q;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/fragment/app/v;-><init>(Landroidx/fragment/app/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroidx/fragment/app/q;->onAttachFragment(Landroidx/fragment/app/Fragment;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addMenuProvider(Landroidx/core/view/B;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->addMenuProvider(Landroidx/core/view/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnConfigurationChangedListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->addOnConfigurationChangedListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnMultiWindowModeChangedListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->addOnMultiWindowModeChangedListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnPictureInPictureModeChangedListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->addOnPictureInPictureModeChangedListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOnTrimMemoryListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->addOnTrimMemoryListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public getActivityResultRegistry()Ld/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/q;->getActivityResultRegistry()Ld/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/k;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/q;->mFragmentLifecycleRegistry:Landroidx/lifecycle/t;

    .line 4
    .line 5
    return-object v0
.end method

.method public getOnBackPressedDispatcher()Landroidx/activity/T;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/q;->getOnBackPressedDispatcher()Landroidx/activity/T;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSavedStateRegistry()Lh1/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/q;->getSavedStateRegistry()Lh1/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/V;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/q;->getViewModelStore()Landroidx/lifecycle/V;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/q;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic i()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q$a;->q()Landroidx/fragment/app/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public j()Landroid/view/LayoutInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public l(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/core/app/b;->u(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public o()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/q$a;->p()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/q;->invalidateMenu()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q()Landroidx/fragment/app/q;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public removeMenuProvider(Landroidx/core/view/B;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->removeMenuProvider(Landroidx/core/view/B;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnConfigurationChangedListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->removeOnConfigurationChangedListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnMultiWindowModeChangedListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->removeOnMultiWindowModeChangedListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnPictureInPictureModeChangedListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->removeOnPictureInPictureModeChangedListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeOnTrimMemoryListener(LH0/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/q$a;->l:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/q;->removeOnTrimMemoryListener(LH0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
