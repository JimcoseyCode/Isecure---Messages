.class Landroidx/core/view/K0$a;
.super Landroidx/core/view/K0$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/K0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/view/WindowInsetsAnimationController;


# direct methods
.method constructor <init>(Landroid/view/WindowInsetsAnimationController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/core/view/K0$b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/core/view/K0$a;->a:Landroid/view/WindowInsetsAnimationController;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method a(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/K0$a;->a:Landroid/view/WindowInsetsAnimationController;

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/core/view/E0;->a(Landroid/view/WindowInsetsAnimationController;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/K0$a;->a:Landroid/view/WindowInsetsAnimationController;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/G0;->a(Landroid/view/WindowInsetsAnimationController;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()Lx0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/K0$a;->a:Landroid/view/WindowInsetsAnimationController;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/H0;->a(Landroid/view/WindowInsetsAnimationController;)Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lx0/e;->f(Landroid/graphics/Insets;)Lx0/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public d()Lx0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/K0$a;->a:Landroid/view/WindowInsetsAnimationController;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/J0;->a(Landroid/view/WindowInsetsAnimationController;)Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lx0/e;->f(Landroid/graphics/Insets;)Lx0/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public e()Lx0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/K0$a;->a:Landroid/view/WindowInsetsAnimationController;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/F0;->a(Landroid/view/WindowInsetsAnimationController;)Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lx0/e;->f(Landroid/graphics/Insets;)Lx0/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public f(Lx0/e;FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/K0$a;->a:Landroid/view/WindowInsetsAnimationController;

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
    invoke-virtual {p1}, Lx0/e;->g()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-static {v0, p1, p2, p3}, Landroidx/core/view/I0;->a(Landroid/view/WindowInsetsAnimationController;Landroid/graphics/Insets;FF)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
