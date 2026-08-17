.class public final Lcom/swmansion/rnscreens/g0$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/core/view/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 4

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "insets"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Landroidx/core/view/a0;->W(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "onApplyWindowInsets(...)"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v0, 0x1e

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-lt p2, v0, :cond_0

    .line 26
    .line 27
    invoke-static {}, Landroidx/core/view/L0$p;->f()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1, p2}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "getInsets(...)"

    .line 36
    .line 37
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance p2, Landroidx/core/view/L0$a;

    .line 41
    .line 42
    invoke-direct {p2}, Landroidx/core/view/L0$a;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroidx/core/view/L0$p;->f()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v2, p1, Lx0/e;->a:I

    .line 50
    .line 51
    iget v3, p1, Lx0/e;->c:I

    .line 52
    .line 53
    iget p1, p1, Lx0/e;->d:I

    .line 54
    .line 55
    invoke-static {v2, v1, v3, p1}, Lx0/e;->c(IIII)Lx0/e;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2, v0, p1}, Landroidx/core/view/L0$a;->b(ILx0/e;)Landroidx/core/view/L0$a;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Landroidx/core/view/L0$a;->a()Landroidx/core/view/L0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string p2, "build(...)"

    .line 68
    .line 69
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_0
    invoke-virtual {p1}, Landroidx/core/view/L0;->k()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p1}, Landroidx/core/view/L0;->l()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p1}, Landroidx/core/view/L0;->j()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p1, p2, v1, v0, v2}, Landroidx/core/view/L0;->r(IIII)Landroidx/core/view/L0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string p2, "replaceSystemWindowInsets(...)"

    .line 90
    .line 91
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object p1
.end method
