.class public final Ly/V;
.super Ly/J0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/V$c;,
        Ly/V$i;,
        Ly/V$b;,
        Ly/V$e;,
        Ly/V$f;,
        Ly/V$g;,
        Ly/V$d;,
        Ly/V$h;,
        Ly/V$j;
    }
.end annotation


# static fields
.field public static final D:Ly/V$c;

.field static final E:LN/b;


# instance fields
.field private A:LE/Y;

.field private B:LF/k1$c;

.field private final C:LE/y;

.field private final r:LF/F0$a;

.field private final s:I

.field private final t:Ljava/util/concurrent/atomic/AtomicReference;

.field private final u:I

.field private v:I

.field private w:Landroid/util/Rational;

.field private x:LK/k;

.field y:LF/k1$b;

.field private z:LE/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly/V$c;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/V$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly/V;->D:Ly/V$c;

    .line 7
    .line 8
    new-instance v0, LN/b;

    .line 9
    .line 10
    invoke-direct {v0}, LN/b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ly/V;->E:LN/b;

    .line 14
    .line 15
    return-void
.end method

.method constructor <init>(LF/C0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ly/J0;-><init>(LF/D1;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ly/S;

    .line 5
    .line 6
    invoke-direct {p1}, Ly/S;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ly/V;->r:LF/F0$a;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    iput p1, p0, Ly/V;->v:I

    .line 21
    .line 22
    iput-object v0, p0, Ly/V;->w:Landroid/util/Rational;

    .line 23
    .line 24
    new-instance p1, Ly/V$a;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Ly/V$a;-><init>(Ly/V;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ly/V;->C:LE/y;

    .line 30
    .line 31
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LF/C0;

    .line 36
    .line 37
    sget-object v0, LF/C0;->Q:LF/j0$a;

    .line 38
    .line 39
    invoke-interface {p1, v0}, LF/h1;->b(LF/j0$a;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, LF/C0;->g0()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, Ly/V;->s:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v0, 0x1

    .line 53
    iput v0, p0, Ly/V;->s:I

    .line 54
    .line 55
    :goto_0
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p1, v0}, LF/C0;->i0(I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Ly/V;->u:I

    .line 61
    .line 62
    invoke-virtual {p1}, LF/C0;->m0()Ly/V$i;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, LK/k;->g(Ly/V$i;)LK/k;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Ly/V;->x:LK/k;

    .line 71
    .line 72
    return-void
.end method

.method private A0()LF/m1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LF/M;->i()LF/E;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, LF/E;->R(LF/m1;)LF/m1;

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method private B0()Landroid/graphics/Rect;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly/J0;->E()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ly/J0;->h()Landroid/util/Size;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v0, p0, Ly/V;->w:Landroid/util/Rational;

    .line 16
    .line 17
    invoke-static {v0}, LO/b;->h(Landroid/util/Rational;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    check-cast v0, LF/M;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ly/J0;->t(LF/M;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    new-instance v2, Landroid/util/Rational;

    .line 37
    .line 38
    iget-object v3, p0, Ly/V;->w:Landroid/util/Rational;

    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/util/Rational;->getDenominator()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iget-object v4, p0, Ly/V;->w:Landroid/util/Rational;

    .line 45
    .line 46
    invoke-virtual {v4}, Landroid/util/Rational;->getNumerator()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-direct {v2, v3, v4}, Landroid/util/Rational;-><init>(II)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, LH/z;->i(I)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v2, p0, Ly/V;->w:Landroid/util/Rational;

    .line 61
    .line 62
    :goto_0
    invoke-static {v1, v2}, LO/b;->a(Landroid/util/Size;Landroid/util/Rational;)Landroid/graphics/Rect;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    new-instance v0, Landroid/graphics/Rect;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method private static D0(Ljava/util/List;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/util/Pair;

    .line 20
    .line 21
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    return v0
.end method

.method private static E0(LF/R0;)Z
    .locals 2

    .line 1
    sget-object v0, LF/C0;->U:LF/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private static F0(LF/R0;)Z
    .locals 2

    .line 1
    sget-object v0, LF/C0;->U:LF/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private static G0(LF/R0;)Z
    .locals 2

    .line 1
    sget-object v0, LF/C0;->U:LF/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private I0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, LF/M;->i()LF/E;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {v0, v2}, LF/E;->R(LF/m1;)LF/m1;

    .line 19
    .line 20
    .line 21
    return v1
.end method

.method private K0(Ljava/util/concurrent/Executor;Ly/V$e;Ly/V$f;)V
    .locals 3

    .line 1
    new-instance p1, Ly/X;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, "Not bound to a valid Camera ["

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "]"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x4

    .line 27
    invoke-direct {p1, v2, v0, v1}, Ly/X;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ly/V$e;->onError(Ly/X;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-interface {p3, p1}, Ly/V$f;->a(Ly/X;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string p2, "Must have either in-memory or on-disk callback."

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method private O0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly/V;->x:LK/k;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ly/V;->P0(Ly/V$i;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private P0(Ly/V$i;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/J0;->j()LF/I;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LF/I;->c(Ly/V$i;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private T0(Ljava/util/concurrent/Executor;Ly/V$e;Ly/V$f;Ly/V$g;Ly/V$g;)V
    .locals 14

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly/V;->w0()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x3

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ly/V;->x:LK/k;

    .line 12
    .line 13
    invoke-virtual {v0}, LK/k;->h()Ly/V$i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0}, Ly/J0;->G()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, LF/D0;->J()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    :goto_1
    move v12, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    const/4 v1, 0x0

    .line 55
    goto :goto_1

    .line 56
    :goto_2
    if-nez v12, :cond_4

    .line 57
    .line 58
    iget-object v1, p0, Ly/V;->A:LE/Y;

    .line 59
    .line 60
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    check-cast v1, LE/Y;

    .line 64
    .line 65
    invoke-direct {p0}, Ly/V;->B0()Landroid/graphics/Rect;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {p0}, Ly/J0;->y()Landroid/graphics/Matrix;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {p0, v0}, Ly/J0;->t(LF/M;)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    invoke-direct {p0}, Ly/V;->y0()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    invoke-virtual {p0}, Ly/V;->v0()I

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    iget-object v0, p0, Ly/V;->y:LF/k1$b;

    .line 86
    .line 87
    invoke-virtual {v0}, LF/k1$b;->s()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    move-object v2, p1

    .line 92
    move-object/from16 v3, p2

    .line 93
    .line 94
    move-object/from16 v4, p3

    .line 95
    .line 96
    move-object/from16 v5, p4

    .line 97
    .line 98
    move-object/from16 v6, p5

    .line 99
    .line 100
    invoke-static/range {v2 .. v13}, LE/i0;->v(Ljava/util/concurrent/Executor;Ly/V$e;Ly/V$f;Ly/V$g;Ly/V$g;Landroid/graphics/Rect;Landroid/graphics/Matrix;IIIZLjava/util/List;)LE/i0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {v1, p1}, LE/Y;->e(LE/i0;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    const-string v0, "Simultaneous capture RAW and JPEG needs two output file options"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_5
    :goto_3
    invoke-direct/range {p0 .. p3}, Ly/V;->K0(Ljava/util/concurrent/Executor;Ly/V$e;Ly/V$f;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method private U0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ly/J0;->j()LF/I;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, Ly/V;->w0()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-interface {v1, v2}, LF/I;->h(I)V

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public static synthetic g0(Ly/V;LF/k1;LF/k1$g;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Ly/V;->A:LE/Y;

    .line 9
    .line 10
    invoke-interface {p1}, LE/Y;->pause()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Ly/V;->r0(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ly/J0;->k()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, LF/C0;

    .line 26
    .line 27
    invoke-virtual {p0}, Ly/J0;->g()LF/o1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LF/o1;

    .line 36
    .line 37
    invoke-direct {p0, p1, p2, v0}, Ly/V;->s0(Ljava/lang/String;LF/C0;LF/o1;)LF/k1$b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Ly/V;->y:LF/k1$b;

    .line 42
    .line 43
    invoke-virtual {p1}, LF/k1$b;->p()LF/k1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Ly/M;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Ly/J0;->d0(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ly/J0;->L()V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Ly/V;->A:LE/Y;

    .line 58
    .line 59
    invoke-interface {p0}, LE/Y;->b()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static synthetic h0(LF/F0;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-interface {p0}, LF/F0;->b()Landroidx/camera/core/o;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :try_start_1
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    :try_start_2
    invoke-interface {p0}, Landroidx/camera/core/o;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    :try_start_3
    invoke-interface {p0}, Landroidx/camera/core/o;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_1
    move-exception p0

    .line 22
    :try_start_4
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    .line 26
    :catch_0
    :cond_1
    return-void
.end method

.method public static synthetic i0(Ly/V;Ljava/util/concurrent/Executor;Ly/V$e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ly/V;->S0(Ljava/util/concurrent/Executor;Ly/V$e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j0(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method private k0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly/V;->x:LK/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LK/k;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly/V;->A:LE/Y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, LE/Y;->c()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method static synthetic l0(LF/R0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ly/V;->E0(LF/R0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic m0(LF/R0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ly/V;->F0(LF/R0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic n0(LF/R0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ly/V;->G0(LF/R0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private o0(LF/D1$b;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly/J0;->o()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LA/b;

    .line 23
    .line 24
    instance-of v3, v2, LC/d;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    check-cast v2, LC/d;

    .line 29
    .line 30
    invoke-virtual {v2}, LC/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {p1}, Ly/I;->b()LF/R0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object v0, LF/C0;->U:LF/j0$a;

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {p1, v0, v1}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method private p0(ILandroid/util/Size;)LE/G;
    .locals 0

    .line 1
    invoke-direct {p0}, Ly/V;->A0()LF/m1;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1
.end method

.method private q0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ly/V;->r0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private r0(Z)V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly/V;->B:LF/k1$c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LF/k1$c;->b()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Ly/V;->B:LF/k1$c;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Ly/V;->z:LE/z;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, LE/z;->a()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Ly/V;->z:LE/z;

    .line 22
    .line 23
    :cond_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Ly/V;->A:LE/Y;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, LE/Y;->c()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Ly/V;->A:LE/Y;

    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0}, Ly/J0;->j()LF/I;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, LF/I;->a()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private s0(Ljava/lang/String;LF/C0;LF/o1;)LF/k1$b;
    .locals 8

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    const-string v0, "createPipeline(cameraId: %s, streamSpec: %s)"

    .line 5
    .line 6
    filled-new-array {p1, p3}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, LF/o1;->f()Landroid/util/Size;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    check-cast p1, LF/M;

    .line 25
    .line 26
    invoke-interface {p1}, LF/M;->o()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    xor-int/lit8 v6, p1, 0x1

    .line 31
    .line 32
    iget-object p1, p0, Ly/V;->z:LE/z;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-static {v6}, LH0/g;->i(Z)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Ly/V;->z:LE/z;

    .line 40
    .line 41
    invoke-virtual {p1}, LE/z;->a()V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, LF/M;->d()Ly/q;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Ly/V;->x0(Ly/q;)Ly/W;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Ly/W;->d()Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0}, Ly/V;->z0()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v2, "The specified output format ("

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ly/V;->z0()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v2, ") is not supported by current configuration. Supported output formats: "

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {v0, p1}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Ly/V;->H0()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    const/4 v0, 0x0

    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    invoke-virtual {p2}, LF/C0;->r()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-direct {p0, p1, v3}, Ly/V;->p0(ILandroid/util/Size;)LE/G;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    move-object v7, p1

    .line 120
    goto :goto_0

    .line 121
    :cond_1
    move-object v7, v0

    .line 122
    :goto_0
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eqz p1, :cond_2

    .line 127
    .line 128
    :try_start_0
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p1}, LF/M;->r()LF/L;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p1}, LF/L;->r()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    instance-of v1, p1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 141
    .line 142
    if-eqz v1, :cond_2

    .line 143
    .line 144
    check-cast p1, Landroid/hardware/camera2/CameraCharacteristics;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    .line 146
    move-object v0, p1

    .line 147
    :catch_0
    :cond_2
    move-object v4, v0

    .line 148
    new-instance v1, LE/z;

    .line 149
    .line 150
    invoke-virtual {p0}, Ly/J0;->n()Ly/k;

    .line 151
    .line 152
    .line 153
    const/4 v5, 0x0

    .line 154
    move-object v2, p2

    .line 155
    invoke-direct/range {v1 .. v7}, LE/z;-><init>(LF/C0;Landroid/util/Size;Landroid/hardware/camera2/CameraCharacteristics;Ly/k;ZLE/G;)V

    .line 156
    .line 157
    .line 158
    iput-object v1, p0, Ly/V;->z:LE/z;

    .line 159
    .line 160
    iget-object p1, p0, Ly/V;->A:LE/Y;

    .line 161
    .line 162
    if-nez p1, :cond_3

    .line 163
    .line 164
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-interface {p1}, LF/D1;->s()LE/Y$b;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iget-object p2, p0, Ly/V;->C:LE/y;

    .line 173
    .line 174
    invoke-interface {p1, p2}, LE/Y$b;->a(LE/y;)LE/Y;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, p0, Ly/V;->A:LE/Y;

    .line 179
    .line 180
    :cond_3
    iget-object p1, p0, Ly/V;->A:LE/Y;

    .line 181
    .line 182
    iget-object p2, p0, Ly/V;->z:LE/z;

    .line 183
    .line 184
    invoke-interface {p1, p2}, LE/Y;->d(LE/z;)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Ly/V;->z:LE/z;

    .line 188
    .line 189
    invoke-virtual {p3}, LF/o1;->f()Landroid/util/Size;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p1, p2}, LE/z;->f(Landroid/util/Size;)LF/k1$b;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p3}, LF/o1;->g()I

    .line 198
    .line 199
    .line 200
    move-result p2

    .line 201
    invoke-virtual {p1, p2}, LF/k1$b;->A(I)LF/k1$b;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Ly/V;->v0()I

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    const/4 v0, 0x2

    .line 209
    if-ne p2, v0, :cond_4

    .line 210
    .line 211
    invoke-virtual {p3}, LF/o1;->h()Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-nez p2, :cond_4

    .line 216
    .line 217
    invoke-virtual {p0}, Ly/J0;->j()LF/I;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    invoke-interface {p2, p1}, LF/I;->b(LF/k1$b;)V

    .line 222
    .line 223
    .line 224
    :cond_4
    invoke-virtual {p3}, LF/o1;->d()LF/j0;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    if-eqz p2, :cond_5

    .line 229
    .line 230
    invoke-virtual {p3}, LF/o1;->d()LF/j0;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-virtual {p1, p2}, LF/k1$b;->g(LF/j0;)LF/k1$b;

    .line 235
    .line 236
    .line 237
    :cond_5
    iget-object p2, p0, Ly/V;->B:LF/k1$c;

    .line 238
    .line 239
    if-eqz p2, :cond_6

    .line 240
    .line 241
    invoke-virtual {p2}, LF/k1$c;->b()V

    .line 242
    .line 243
    .line 244
    :cond_6
    new-instance p2, LF/k1$c;

    .line 245
    .line 246
    new-instance p3, Ly/T;

    .line 247
    .line 248
    invoke-direct {p3, p0}, Ly/T;-><init>(Ly/V;)V

    .line 249
    .line 250
    .line 251
    invoke-direct {p2, p3}, LF/k1$c;-><init>(LF/k1$d;)V

    .line 252
    .line 253
    .line 254
    iput-object p2, p0, Ly/V;->B:LF/k1$c;

    .line 255
    .line 256
    invoke-virtual {p1, p2}, LF/k1$b;->u(LF/k1$d;)LF/k1$b;

    .line 257
    .line 258
    .line 259
    return-object p1
.end method

.method private u0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ly/i;->d()Ly/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ly/q;->k()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, -0x1

    .line 17
    return v0
.end method

.method public static x0(Ly/q;)Ly/W;
    .locals 1

    .line 1
    new-instance v0, Ly/V$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ly/V$d;-><init>(Ly/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private y0()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LF/C0;

    .line 6
    .line 7
    sget-object v1, LF/C0;->Z:LF/j0$a;

    .line 8
    .line 9
    invoke-interface {v0, v1}, LF/h1;->b(LF/j0$a;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, LF/C0;->l0()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    iget v0, p0, Ly/V;->s:I

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "CaptureMode "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget v2, p0, Ly/V;->s:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, " is invalid"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    :goto_0
    const/16 v0, 0x5f

    .line 62
    .line 63
    return v0

    .line 64
    :cond_3
    const/16 v0, 0x64

    .line 65
    .line 66
    return v0
.end method


# virtual methods
.method public B()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public C0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/J0;->C()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public D(LF/j0;)LF/D1$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ly/V$b;->f(LF/j0;)Ly/V$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public H0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LF/C0;->c0:LF/j0$a;

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method J0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {p0}, Ly/V;->w0()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-void

    .line 31
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
.end method

.method public L0(Landroid/util/Rational;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly/V;->w:Landroid/util/Rational;

    .line 2
    .line 3
    return-void
.end method

.method public M0(I)V
    .locals 3

    .line 1
    const-string v0, "ImageCapture"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "setFlashMode: flashMode = "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    if-eq p1, v0, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    if-eq p1, v0, :cond_3

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-ne p1, v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Ly/V;->x:LK/k;

    .line 35
    .line 36
    invoke-virtual {v0}, LK/k;->h()Ly/V$i;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-direct {p0}, Ly/V;->u0()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string v0, "Not a front camera despite setting FLASH_MODE_SCREEN"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string v0, "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "Invalid flash mode: "

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_3
    :goto_0
    iget-object v0, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 95
    .line 96
    monitor-enter v0

    .line 97
    :try_start_0
    iput p1, p0, Ly/V;->v:I

    .line 98
    .line 99
    invoke-direct {p0}, Ly/V;->U0()V

    .line 100
    .line 101
    .line 102
    monitor-exit v0

    .line 103
    return-void

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    throw p1
.end method

.method public N0(Ly/V$i;)V
    .locals 0

    .line 1
    invoke-static {p1}, LK/k;->g(Ly/V$i;)LK/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ly/V;->x:LK/k;

    .line 6
    .line 7
    invoke-direct {p0}, Ly/V;->O0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public O()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Attached camera cannot be null"

    .line 6
    .line 7
    invoke-static {v0, v1}, LH0/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ly/V;->w0()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x3

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-direct {p0}, Ly/V;->u0()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string v1, "Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method public P()V
    .locals 2

    .line 1
    const-string v0, "ImageCapture"

    .line 2
    .line 3
    const-string v1, "onCameraControlReady"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ly/V;->U0()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ly/V;->O0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method protected Q(LF/L;LF/D1$b;)LF/D1;
    .locals 8

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x23

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x100

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-direct {p0, p2}, Ly/V;->o0(LF/D1$b;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, LF/L;->w()LF/g1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-class v5, Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;

    .line 27
    .line 28
    invoke-virtual {p1, v5}, LF/g1;->a(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sget-object v6, LF/C0;->X:LF/j0$a;

    .line 41
    .line 42
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-interface {v5, v6, v7}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p1, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    const-string v5, "ImageCapture"

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    const-string p1, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."

    .line 57
    .line 58
    invoke-static {v5, p1}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string p1, "Requesting software JPEG due to device quirk."

    .line 63
    .line 64
    invoke-static {v5, p1}, Ly/h0;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1, v6, v7}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Ly/V;->t0(LF/R0;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    sget-object v6, LF/C0;->T:LF/j0$a;

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-interface {v5, v6, v7}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/Integer;

    .line 94
    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    invoke-direct {p0}, Ly/V;->I0()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-ne v0, v3, :cond_2

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    const/4 v0, 0x0

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 113
    :goto_2
    const-string v2, "Cannot set non-JPEG buffer format with Extensions enabled."

    .line 114
    .line 115
    invoke-static {v0, v2}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sget-object v2, LF/D0;->j:LF/j0$a;

    .line 123
    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {v0, v2, p1}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_5
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-static {v5}, Ly/V;->E0(LF/R0;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_6

    .line 149
    .line 150
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    sget-object v1, LF/D0;->j:LF/j0$a;

    .line 155
    .line 156
    invoke-interface {p1, v1, v0}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_4

    .line 160
    .line 161
    :cond_6
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-static {v5}, Ly/V;->F0(LF/R0;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_7

    .line 170
    .line 171
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    sget-object v1, LF/D0;->j:LF/j0$a;

    .line 176
    .line 177
    invoke-interface {p1, v1, v0}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    sget-object v0, LF/D0;->k:LF/j0$a;

    .line 185
    .line 186
    invoke-interface {p1, v0, v4}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_7
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Ly/V;->G0(LF/R0;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_8

    .line 199
    .line 200
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    sget-object v0, LF/D0;->j:LF/j0$a;

    .line 205
    .line 206
    const/16 v1, 0x1005

    .line 207
    .line 208
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-interface {p1, v0, v1}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    sget-object v0, LF/D0;->l:LF/j0$a;

    .line 220
    .line 221
    sget-object v1, Ly/H;->c:Ly/H;

    .line 222
    .line 223
    invoke-interface {p1, v0, v1}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_8
    if-eqz p1, :cond_9

    .line 228
    .line 229
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    sget-object v0, LF/D0;->j:LF/j0$a;

    .line 234
    .line 235
    invoke-interface {p1, v0, v2}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_9
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    sget-object v0, LF/E0;->t:LF/j0$a;

    .line 244
    .line 245
    invoke-interface {p1, v0, v7}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, Ljava/util/List;

    .line 250
    .line 251
    if-nez p1, :cond_a

    .line 252
    .line 253
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    sget-object v0, LF/D0;->j:LF/j0$a;

    .line 258
    .line 259
    invoke-interface {p1, v0, v4}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_a
    invoke-static {p1, v3}, Ly/V;->D0(Ljava/util/List;I)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_b

    .line 268
    .line 269
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    sget-object v0, LF/D0;->j:LF/j0$a;

    .line 274
    .line 275
    invoke-interface {p1, v0, v4}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_b
    invoke-static {p1, v1}, Ly/V;->D0(Ljava/util/List;I)Z

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    if-eqz p1, :cond_c

    .line 284
    .line 285
    invoke-interface {p2}, Ly/I;->b()LF/R0;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    sget-object v0, LF/D0;->j:LF/j0$a;

    .line 290
    .line 291
    invoke-interface {p1, v0, v2}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_c
    :goto_4
    invoke-interface {p2}, LF/D1$b;->c()LF/D1;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    return-object p1
.end method

.method public Q0(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly/V;->C0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1}, Ly/J0;->a0(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Ly/V;->w:Landroid/util/Rational;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, LH/c;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {p1}, LH/c;->b(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sub-int/2addr p1, v0

    .line 24
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object v0, p0, Ly/V;->w:Landroid/util/Rational;

    .line 29
    .line 30
    invoke-static {p1, v0}, LO/b;->f(ILandroid/util/Rational;)Landroid/util/Rational;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ly/V;->w:Landroid/util/Rational;

    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method R0(Ljava/util/List;)Lm5/a;
    .locals 3

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly/J0;->j()LF/I;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, Ly/V;->s:I

    .line 9
    .line 10
    iget v2, p0, Ly/V;->u:I

    .line 11
    .line 12
    invoke-interface {v0, p1, v1, v2}, LF/I;->e(Ljava/util/List;II)Lm5/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Ly/U;

    .line 17
    .line 18
    invoke-direct {v0}, Ly/U;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p1, v0, v1}, LJ/n;->x(Lm5/a;Ln/a;Ljava/util/concurrent/Executor;)Lm5/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public S()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly/V;->k0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public S0(Ljava/util/concurrent/Executor;Ly/V$e;)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ly/Q;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, p2}, Ly/Q;-><init>(Ly/V;Ljava/util/concurrent/Executor;Ly/V$e;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    move-object v2, p0

    .line 28
    move-object v3, p1

    .line 29
    move-object v4, p2

    .line 30
    invoke-direct/range {v2 .. v7}, Ly/V;->T0(Ljava/util/concurrent/Executor;Ly/V$e;Ly/V$f;Ly/V$g;Ly/V$g;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method protected T(LF/j0;)LF/o1;
    .locals 1

    .line 1
    iget-object v0, p0, Ly/V;->y:LF/k1$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF/k1$b;->g(LF/j0;)LF/k1$b;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly/V;->y:LF/k1$b;

    .line 7
    .line 8
    invoke-virtual {v0}, LF/k1$b;->p()LF/k1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Ly/M;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Ly/J0;->d0(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ly/J0;->g()LF/o1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, LF/o1;->i()LF/o1$a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, p1}, LF/o1$a;->d(LF/j0;)LF/o1$a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LF/o1$a;->a()LF/o1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method protected U(LF/o1;LF/o1;)LF/o1;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", secondaryStreamSpec "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-string v0, "ImageCapture"

    .line 27
    .line 28
    invoke-static {v0, p2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ly/J0;->k()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, LF/C0;

    .line 40
    .line 41
    invoke-direct {p0, p2, v0, p1}, Ly/V;->s0(Ljava/lang/String;LF/C0;LF/o1;)LF/k1$b;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iput-object p2, p0, Ly/V;->y:LF/k1$b;

    .line 46
    .line 47
    invoke-virtual {p2}, LF/k1$b;->p()LF/k1;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Ly/M;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p0, p2}, Ly/J0;->d0(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ly/J0;->J()V

    .line 59
    .line 60
    .line 61
    return-object p1
.end method

.method public V()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ly/V;->k0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ly/V;->q0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Ly/V;->P0(Ly/V$i;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method V0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Ly/V;->w0()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Ly/V;->U0()V

    .line 30
    .line 31
    .line 32
    :cond_1
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1
.end method

.method public m(ZLF/E1;)LF/D1;
    .locals 3

    .line 1
    sget-object v0, Ly/V;->D:Ly/V$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly/V$c;->a()LF/C0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, LF/D1;->G()LF/E1$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Ly/V;->v0()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-interface {p2, v1, v2}, LF/E1;->a(LF/E1$b;I)LF/j0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ly/V$c;->a()LF/C0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p2, p1}, LF/j0;->W(LF/j0;LF/j0;)LF/j0;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :cond_0
    if-nez p2, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return-object p1

    .line 33
    :cond_1
    invoke-virtual {p0, p2}, Ly/V;->D(LF/j0;)LF/D1$b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, LF/D1$b;->c()LF/D1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method t0(LF/R0;)Z
    .locals 7

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, LF/C0;->X:LF/j0$a;

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-interface {p1, v1, v2}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-direct {p0}, Ly/V;->I0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v4, "ImageCapture"

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const-string v0, "Software JPEG cannot be used with Extensions."

    .line 27
    .line 28
    invoke-static {v4, v0}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move v0, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x1

    .line 34
    :goto_0
    sget-object v5, LF/C0;->T:LF/j0$a;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-interface {p1, v5, v6}, LF/j0;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/lang/Integer;

    .line 42
    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/16 v6, 0x100

    .line 50
    .line 51
    if-eq v5, v6, :cond_1

    .line 52
    .line 53
    const-string v0, "Software JPEG cannot be used with non-JPEG output buffer format."

    .line 54
    .line 55
    invoke-static {v4, v0}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move v3, v0

    .line 60
    :goto_1
    if-nez v3, :cond_2

    .line 61
    .line 62
    const-string v0, "Unable to support software JPEG. Disabling."

    .line 63
    .line 64
    invoke-static {v4, v0}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v1, v2}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ImageCapture:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ly/J0;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public v0()I
    .locals 1

    .line 1
    iget v0, p0, Ly/V;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public w0()I
    .locals 3

    .line 1
    iget-object v0, p0, Ly/V;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ly/V;->v:I

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LF/C0;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-virtual {v1, v2}, LF/C0;->h0(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return v1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
.end method

.method public z0()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LF/C0;->U:LF/j0$a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v0, v1, v2}, LF/h1;->f(LF/j0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-static {v0}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
.end method
