.class Landroidx/core/view/l1$d$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/WindowInsetsAnimationControlListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/l1$d;->a(IJLandroid/view/animation/Interpolator;Landroid/os/CancellationSignal;Landroidx/core/view/D0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Landroidx/core/view/K0;

.field final synthetic b:Landroidx/core/view/D0;

.field final synthetic c:Landroidx/core/view/l1$d;


# direct methods
.method constructor <init>(Landroidx/core/view/l1$d;Landroidx/core/view/D0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/core/view/l1$d$a;->c:Landroidx/core/view/l1$d;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/core/view/l1$d$a;->b:Landroidx/core/view/D0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/core/view/l1$d$a;->a:Landroidx/core/view/K0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onCancelled(Landroid/view/WindowInsetsAnimationController;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/l1$d$a;->b:Landroidx/core/view/D0;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Landroidx/core/view/l1$d$a;->a:Landroidx/core/view/K0;

    .line 8
    .line 9
    :goto_0
    invoke-interface {v0, p1}, Landroidx/core/view/D0;->a(Landroidx/core/view/K0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onFinished(Landroid/view/WindowInsetsAnimationController;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/core/view/l1$d$a;->b:Landroidx/core/view/D0;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/core/view/l1$d$a;->a:Landroidx/core/view/K0;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Landroidx/core/view/D0;->c(Landroidx/core/view/K0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onReady(Landroid/view/WindowInsetsAnimationController;I)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/core/view/K0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/core/view/K0;-><init>(Landroid/view/WindowInsetsAnimationController;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroidx/core/view/l1$d$a;->a:Landroidx/core/view/K0;

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/core/view/l1$d$a;->b:Landroidx/core/view/D0;

    .line 9
    .line 10
    invoke-interface {p1, v0, p2}, Landroidx/core/view/D0;->b(Landroidx/core/view/K0;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
