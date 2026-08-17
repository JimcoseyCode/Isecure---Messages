.class Landroidx/core/view/L0$k;
.super Landroidx/core/view/L0$j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/L0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "k"
.end annotation


# instance fields
.field private o:Lx0/e;

.field private p:Lx0/e;

.field private q:Lx0/e;


# direct methods
.method constructor <init>(Landroidx/core/view/L0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/core/view/L0$j;-><init>(Landroidx/core/view/L0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/core/view/L0$k;->o:Lx0/e;

    .line 3
    iput-object p1, p0, Landroidx/core/view/L0$k;->p:Lx0/e;

    .line 4
    iput-object p1, p0, Landroidx/core/view/L0$k;->q:Lx0/e;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/L0;Landroidx/core/view/L0$k;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/core/view/L0$j;-><init>(Landroidx/core/view/L0;Landroidx/core/view/L0$j;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Landroidx/core/view/L0$k;->o:Lx0/e;

    .line 7
    iput-object p1, p0, Landroidx/core/view/L0$k;->p:Lx0/e;

    .line 8
    iput-object p1, p0, Landroidx/core/view/L0$k;->q:Lx0/e;

    return-void
.end method


# virtual methods
.method i()Lx0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$k;->p:Lx0/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/core/view/X0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lx0/e;->f(Landroid/graphics/Insets;)Lx0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/core/view/L0$k;->p:Lx0/e;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/core/view/L0$k;->p:Lx0/e;

    .line 18
    .line 19
    return-object v0
.end method

.method k()Lx0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$k;->o:Lx0/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/core/view/Y0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lx0/e;->f(Landroid/graphics/Insets;)Lx0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/core/view/L0$k;->o:Lx0/e;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/core/view/L0$k;->o:Lx0/e;

    .line 18
    .line 19
    return-object v0
.end method

.method m()Lx0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$k;->q:Lx0/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/core/view/V0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lx0/e;->f(Landroid/graphics/Insets;)Lx0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/core/view/L0$k;->q:Lx0/e;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/core/view/L0$k;->q:Lx0/e;

    .line 18
    .line 19
    return-object v0
.end method

.method n(IIII)Landroidx/core/view/L0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Landroidx/core/view/W0;->a(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroidx/core/view/L0;->y(Landroid/view/WindowInsets;)Landroidx/core/view/L0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public u(Lx0/e;)V
    .locals 0

    .line 1
    return-void
.end method
