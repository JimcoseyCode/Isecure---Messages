.class public final LJ6/u;
.super LJ6/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/u$a;
    }
.end annotation


# instance fields
.field private O:D

.field private P:D

.field private Q:F

.field private R:F

.field private S:LJ6/y;

.field private T:F

.field private U:F

.field private final V:LJ6/y$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LJ6/d;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 5
    .line 6
    iput v0, p0, LJ6/u;->Q:F

    .line 7
    .line 8
    iput v0, p0, LJ6/u;->R:F

    .line 9
    .line 10
    new-instance v0, LJ6/u$b;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LJ6/u$b;-><init>(LJ6/u;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LJ6/u;->V:LJ6/y$b;

    .line 16
    .line 17
    return-void
.end method

.method public static final synthetic U0(LJ6/u;)F
    .locals 0

    .line 1
    iget p0, p0, LJ6/u;->U:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic V0(LJ6/u;)F
    .locals 0

    .line 1
    iget p0, p0, LJ6/u;->T:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic W0(LJ6/u;D)V
    .locals 0

    .line 1
    iput-wide p1, p0, LJ6/u;->O:D

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic X0(LJ6/u;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/u;->T:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic Y0(LJ6/u;D)V
    .locals 0

    .line 1
    iput-wide p1, p0, LJ6/u;->P:D

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final Z0()F
    .locals 1

    .line 1
    iget v0, p0, LJ6/u;->Q:F

    .line 2
    .line 3
    return v0
.end method

.method public final a1()F
    .locals 1

    .line 1
    iget v0, p0, LJ6/u;->R:F

    .line 2
    .line 3
    return v0
.end method

.method public final b1()D
    .locals 2

    .line 1
    iget-wide v0, p0, LJ6/u;->O:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c1()D
    .locals 2

    .line 1
    iget-wide v0, p0, LJ6/u;->P:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public l(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LJ6/u;->t0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super {p0, p1}, LJ6/d;->l(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method protected l0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceEvent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, LJ6/d;->W()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, LJ6/u;->t0()V

    .line 29
    .line 30
    .line 31
    new-instance v1, LJ6/y;

    .line 32
    .line 33
    iget-object v2, p0, LJ6/u;->V:LJ6/y$b;

    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, LJ6/y;-><init>(Landroid/content/Context;LJ6/y$b;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, LJ6/u;->S:LJ6/y;

    .line 39
    .line 40
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v0, v0

    .line 49
    iput v0, p0, LJ6/u;->U:F

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, LJ6/u;->Q:F

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput p1, p0, LJ6/u;->R:F

    .line 62
    .line 63
    invoke-virtual {p0}, LJ6/d;->p()V

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-object p1, p0, LJ6/u;->S:LJ6/y;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1, p2}, LJ6/y;->k(Landroid/view/MotionEvent;)Z

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object p1, p0, LJ6/u;->S:LJ6/y;

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    new-instance v0, Landroid/graphics/PointF;

    .line 78
    .line 79
    invoke-virtual {p1}, LJ6/y;->e()F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p1}, LJ6/y;->f()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, LJ6/d;->Q0(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 95
    .line 96
    iput v0, p0, LJ6/u;->Q:F

    .line 97
    .line 98
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 99
    .line 100
    iput p1, p0, LJ6/u;->R:F

    .line 101
    .line 102
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    const/4 p2, 0x1

    .line 107
    if-ne p1, p2, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/4 p2, 0x4

    .line 114
    if-ne p1, p2, :cond_3

    .line 115
    .line 116
    invoke-virtual {p0}, LJ6/d;->B()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 121
    .line 122
    .line 123
    :cond_4
    return-void
.end method

.method protected o0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LJ6/u;->S:LJ6/y;

    .line 3
    .line 4
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 5
    .line 6
    iput v0, p0, LJ6/u;->Q:F

    .line 7
    .line 8
    iput v0, p0, LJ6/u;->R:F

    .line 9
    .line 10
    invoke-virtual {p0}, LJ6/u;->t0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public t0()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LJ6/u;->P:D

    .line 4
    .line 5
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    iput-wide v0, p0, LJ6/u;->O:D

    .line 8
    .line 9
    return-void
.end method
