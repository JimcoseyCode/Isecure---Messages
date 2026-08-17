.class public final LJ6/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/i$a;,
        LJ6/i$b;
    }
.end annotation


# static fields
.field public static final n:LJ6/i$a;

.field private static final o:Landroid/graphics/PointF;

.field private static final p:[F

.field private static final q:Landroid/graphics/Matrix;

.field private static final r:[F

.field private static final s:Ljava/util/Comparator;


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private final b:LJ6/j;

.field private final c:LJ6/D;

.field private final d:Landroid/view/ViewGroup;

.field private e:F

.field private final f:Ljava/util/ArrayList;

.field private final g:Ljava/util/ArrayList;

.field private final h:Ljava/util/ArrayList;

.field private final i:Ljava/util/HashSet;

.field private j:Z

.field private k:I

.field private l:Z

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ6/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ6/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ6/i;->n:LJ6/i$a;

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/PointF;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LJ6/i;->o:Landroid/graphics/PointF;

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    new-array v1, v0, [F

    .line 18
    .line 19
    sput-object v1, LJ6/i;->p:[F

    .line 20
    .line 21
    new-instance v1, Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v1, LJ6/i;->q:Landroid/graphics/Matrix;

    .line 27
    .line 28
    new-array v0, v0, [F

    .line 29
    .line 30
    sput-object v0, LJ6/i;->r:[F

    .line 31
    .line 32
    new-instance v0, LJ6/f;

    .line 33
    .line 34
    invoke-direct {v0}, LJ6/f;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, LJ6/i;->s:Ljava/util/Comparator;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;LJ6/j;LJ6/D;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "wrapperView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handlerRegistry"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "viewConfigHelper"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "rootView"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 25
    .line 26
    iput-object p2, p0, LJ6/i;->b:LJ6/j;

    .line 27
    .line 28
    iput-object p3, p0, LJ6/i;->c:LJ6/D;

    .line 29
    .line 30
    iput-object p4, p0, LJ6/i;->d:Landroid/view/ViewGroup;

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 45
    .line 46
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, LJ6/i;->h:Ljava/util/ArrayList;

    .line 52
    .line 53
    new-instance p1, Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, LJ6/i;->i:Ljava/util/HashSet;

    .line 59
    .line 60
    return-void
.end method

.method private final C(LJ6/d;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, LJ6/d;->w0(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, LJ6/d;->x0(Z)V

    .line 20
    .line 21
    .line 22
    const v0, 0x7fffffff

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, LJ6/d;->v0(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2, p0}, LJ6/d;->q0(Landroid/view/View;LJ6/i;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private final D(Landroid/view/View;[FILandroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, LJ6/i;->b:LJ6/j;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LJ6/j;->a(Landroid/view/View;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "iterator(...)"

    .line 17
    .line 18
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move v4, v2

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_3

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, LJ6/d;

    .line 33
    .line 34
    invoke-virtual {v5}, LJ6/d;->d0()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_0

    .line 39
    .line 40
    aget v6, p2, v2

    .line 41
    .line 42
    aget v7, p2, v1

    .line 43
    .line 44
    invoke-virtual {v5, p1, v6, v7}, LJ6/d;->g0(Landroid/view/View;FF)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-direct {p0, v5, p4}, LJ6/i;->I(LJ6/d;Landroid/view/MotionEvent;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-direct {p0, v5, p1}, LJ6/i;->C(LJ6/d;Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, p3}, LJ6/d;->O0(I)V

    .line 62
    .line 63
    .line 64
    move v4, v1

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    sget-object p4, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    monitor-exit v0

    .line 71
    goto :goto_2

    .line 72
    :goto_1
    monitor-exit v0

    .line 73
    throw p1

    .line 74
    :cond_4
    move v4, v2

    .line 75
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result p4

    .line 79
    int-to-float p4, p4

    .line 80
    aget v0, p2, v2

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    cmpg-float v3, v2, v0

    .line 84
    .line 85
    if-gtz v3, :cond_5

    .line 86
    .line 87
    cmpg-float p4, v0, p4

    .line 88
    .line 89
    if-gtz p4, :cond_5

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    int-to-float p4, p4

    .line 96
    aget v0, p2, v1

    .line 97
    .line 98
    cmpg-float v2, v2, v0

    .line 99
    .line 100
    if-gtz v2, :cond_5

    .line 101
    .line 102
    cmpg-float p4, v0, p4

    .line 103
    .line 104
    if-gtz p4, :cond_5

    .line 105
    .line 106
    invoke-direct {p0, p1}, LJ6/i;->y(Landroid/view/View;)Z

    .line 107
    .line 108
    .line 109
    move-result p4

    .line 110
    if-eqz p4, :cond_5

    .line 111
    .line 112
    invoke-direct {p0, p1, p2, p3}, LJ6/i;->p(Landroid/view/View;[FI)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    return v1

    .line 119
    :cond_5
    return v4
.end method

.method private final E()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ6/i;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, LJ6/i;->k:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0}, LJ6/i;->l()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LJ6/i;->l:Z

    .line 16
    .line 17
    return-void
.end method

.method private final G(LJ6/d;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LJ6/d;

    .line 28
    .line 29
    invoke-virtual {p1, v2}, LJ6/d;->Y(LJ6/d;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, LJ6/d;->S()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x4

    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    sget-object v3, LJ6/i;->n:LJ6/i$a;

    .line 43
    .line 44
    invoke-static {v3, p1, v2}, LJ6/i$a;->a(LJ6/i$a;LJ6/d;LJ6/d;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1, v2}, LJ6/d;->c0(LJ6/d;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_2
    return v1
.end method

.method private final H(LJ6/d;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LJ6/d;

    .line 28
    .line 29
    sget-object v3, LJ6/i;->n:LJ6/i$a;

    .line 30
    .line 31
    invoke-static {v3, p1, v2}, LJ6/i$a;->e(LJ6/i$a;LJ6/d;LJ6/d;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, LJ6/d;->S()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x5

    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_2
    return v1
.end method

.method private final I(LJ6/d;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LJ6/m;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    instance-of p1, p1, Lcom/swmansion/gesturehandler/react/k$b;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, Lcom/swmansion/gesturehandler/react/a;->c(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private final J(Landroid/view/View;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/swmansion/gesturehandler/react/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    check-cast p1, Lcom/swmansion/gesturehandler/react/l;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/swmansion/gesturehandler/react/l;->d()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method private final M(Landroid/view/View;[FILandroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LJ6/i;->J(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, LJ6/i;->c:LJ6/D;

    .line 10
    .line 11
    invoke-interface {v0, p1}, LJ6/D;->a(Landroid/view/View;)LJ6/v;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v2, LJ6/i$b;->a:[I

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    aget v0, v2, v0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-eq v0, v2, :cond_c

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-eq v0, v3, :cond_9

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    if-eq v0, v3, :cond_5

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    if-ne v0, v3, :cond_4

    .line 34
    .line 35
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    move-object v0, p1

    .line 40
    check-cast v0, Landroid/view/ViewGroup;

    .line 41
    .line 42
    invoke-direct {p0, v0, p2, p3, p4}, LJ6/i;->r(Landroid/view/ViewGroup;[FILandroid/view/MotionEvent;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v0, v1

    .line 48
    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, LJ6/i;->D(Landroid/view/View;[FILandroid/view/MotionEvent;)Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-nez p3, :cond_3

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    sget-object p3, LJ6/i;->n:LJ6/i$a;

    .line 57
    .line 58
    invoke-static {p3, p1, p2}, LJ6/i$a;->f(LJ6/i$a;Landroid/view/View;[F)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    return v1

    .line 66
    :cond_3
    :goto_1
    return v2

    .line 67
    :cond_4
    new-instance p1, Li7/m;

    .line 68
    .line 69
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_5
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    move-object v0, p1

    .line 78
    check-cast v0, Landroid/view/ViewGroup;

    .line 79
    .line 80
    invoke-direct {p0, v0, p2, p3, p4}, LJ6/i;->r(Landroid/view/ViewGroup;[FILandroid/view/MotionEvent;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    invoke-direct {p0, p1, p2, p3, p4}, LJ6/i;->D(Landroid/view/View;[FILandroid/view/MotionEvent;)Z

    .line 87
    .line 88
    .line 89
    :cond_6
    return v0

    .line 90
    :cond_7
    instance-of v0, p1, Landroid/widget/EditText;

    .line 91
    .line 92
    if-eqz v0, :cond_8

    .line 93
    .line 94
    invoke-direct {p0, p1, p2, p3, p4}, LJ6/i;->D(Landroid/view/View;[FILandroid/view/MotionEvent;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    return p1

    .line 99
    :cond_8
    return v1

    .line 100
    :cond_9
    invoke-direct {p0, p1, p2, p3, p4}, LJ6/i;->D(Landroid/view/View;[FILandroid/view/MotionEvent;)Z

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-nez p3, :cond_b

    .line 105
    .line 106
    sget-object p3, LJ6/i;->n:LJ6/i$a;

    .line 107
    .line 108
    invoke-static {p3, p1, p2}, LJ6/i$a;->f(LJ6/i$a;Landroid/view/View;[F)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_a

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_a
    return v1

    .line 116
    :cond_b
    :goto_2
    return v2

    .line 117
    :cond_c
    return v1
.end method

.method private final N(LJ6/d;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LJ6/i;->H(LJ6/d;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-direct {p0, p1}, LJ6/i;->G(LJ6/d;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0, p1}, LJ6/i;->u(LJ6/d;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-direct {p0, p1}, LJ6/i;->h(LJ6/d;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-direct {p0, p1}, LJ6/i;->z(LJ6/d;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, LJ6/d;->x0(Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    :goto_0
    invoke-virtual {p1}, LJ6/d;->q()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic a(LJ6/d;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0}, LJ6/i;->g(LJ6/d;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LJ6/d;LJ6/d;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, LJ6/i;->t(LJ6/d;LJ6/d;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(LJ6/d;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LJ6/i;->m(LJ6/d;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic d()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    sget-object v0, LJ6/i;->q:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e()[F
    .locals 1

    .line 1
    sget-object v0, LJ6/i;->p:[F

    .line 2
    .line 3
    return-object v0
.end method

.method private static final g(LJ6/d;)Li7/B;
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ6/d;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LJ6/d;->B()V

    .line 8
    .line 9
    .line 10
    sget-object p0, Li7/B;->a:Li7/B;

    .line 11
    .line 12
    return-object p0
.end method

.method private final h(LJ6/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LJ6/i;->i:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {p1}, LJ6/d;->T()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, LJ6/d;->x0(Z)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, LJ6/i;->m:I

    .line 33
    .line 34
    add-int/lit8 v1, v0, 0x1

    .line 35
    .line 36
    iput v1, p0, LJ6/i;->m:I

    .line 37
    .line 38
    invoke-virtual {p1, v0}, LJ6/d;->v0(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private final i(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, LJ6/i;->e:F

    .line 12
    .line 13
    cmpl-float p1, p1, v0

    .line 14
    .line 15
    if-ltz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method private final j()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lj7/q;->O(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, LJ6/d;

    .line 26
    .line 27
    invoke-virtual {v1}, LJ6/d;->q()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, LJ6/i;->h:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LJ6/i;->h:Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v1, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-static {v0}, Lj7/q;->O(Ljava/util/List;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, LJ6/d;

    .line 64
    .line 65
    invoke-virtual {v1}, LJ6/d;->q()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    return-void
.end method

.method private final k()V
    .locals 3

    .line 1
    iget-object v0, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LJ6/d;

    .line 22
    .line 23
    invoke-virtual {v1}, LJ6/d;->a0()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, LJ6/i;->i:Ljava/util/HashSet;

    .line 35
    .line 36
    invoke-virtual {v1}, LJ6/d;->T()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method private final l()V
    .locals 5

    .line 1
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lj7/q;->O(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LJ6/d;

    .line 23
    .line 24
    sget-object v3, LJ6/i;->n:LJ6/i$a;

    .line 25
    .line 26
    invoke-virtual {v1}, LJ6/d;->S()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {v3, v4}, LJ6/i$a;->b(LJ6/i$a;I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, LJ6/d;->a0()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, LJ6/d;->r0()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, LJ6/d;->w0(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, LJ6/d;->x0(Z)V

    .line 49
    .line 50
    .line 51
    const v2, 0x7fffffff

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, LJ6/d;->v0(I)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance v1, LJ6/g;

    .line 61
    .line 62
    invoke-direct {v1}, LJ6/g;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Lj7/q;->G(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 66
    .line 67
    .line 68
    iput-boolean v2, p0, LJ6/i;->l:Z

    .line 69
    .line 70
    return-void
.end method

.method private static final m(LJ6/d;)Z
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LJ6/i;->n:LJ6/i$a;

    .line 7
    .line 8
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v0, v1}, LJ6/i$a;->b(LJ6/i$a;I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LJ6/d;->a0()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method private final n(LJ6/d;Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LJ6/d;->W()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, LJ6/i;->x(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, LJ6/d;->q()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1, p2}, LJ6/d;->S0(Landroid/view/MotionEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p1}, LJ6/d;->W()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "obtain(...)"

    .line 35
    .line 36
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v1, v2}, LJ6/i;->K(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1}, LJ6/d;->N()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1, v1, p2}, LJ6/d;->R0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p1}, LJ6/d;->a0()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    const/4 v2, 0x2

    .line 65
    if-eq v0, v2, :cond_9

    .line 66
    .line 67
    :cond_3
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v4, 0x1

    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    move v2, v4

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move v2, v3

    .line 78
    :goto_0
    invoke-virtual {p1, v1, p2}, LJ6/d;->X(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, LJ6/d;->Z()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_6

    .line 86
    .line 87
    invoke-virtual {p1}, LJ6/d;->R()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1, v3}, LJ6/d;->H0(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, LJ6/d;->t0()V

    .line 97
    .line 98
    .line 99
    :cond_5
    invoke-virtual {p1, v1}, LJ6/d;->v(Landroid/view/MotionEvent;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    invoke-virtual {p1}, LJ6/d;->N()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_7

    .line 107
    .line 108
    if-eqz v2, :cond_7

    .line 109
    .line 110
    invoke-virtual {p1, v1, p2}, LJ6/d;->R0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    if-eq v0, v4, :cond_8

    .line 114
    .line 115
    const/4 p2, 0x6

    .line 116
    if-eq v0, p2, :cond_8

    .line 117
    .line 118
    const/16 p2, 0xa

    .line 119
    .line 120
    if-eq v0, p2, :cond_8

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_8
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    invoke-virtual {v1, p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    invoke-virtual {p1, p2}, LJ6/d;->P0(I)V

    .line 132
    .line 133
    .line 134
    :cond_9
    :goto_1
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method private final o(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ6/i;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ6/i;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v1, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LJ6/i;->h:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, LJ6/i;->s:Ljava/util/Comparator;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lj7/q;->y(Ljava/util/List;Ljava/util/Comparator;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LJ6/i;->h:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "iterator(...)"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, LJ6/d;

    .line 42
    .line 43
    invoke-direct {p0, v1, p1}, LJ6/i;->n(LJ6/d;Landroid/view/MotionEvent;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method

.method private final p(Landroid/view/View;[FI)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-eqz v0, :cond_4

    .line 8
    .line 9
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz v3, :cond_3

    .line 12
    .line 13
    instance-of v3, v0, Lcom/swmansion/gesturehandler/react/l;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object v3, v0

    .line 18
    check-cast v3, Lcom/swmansion/gesturehandler/react/l;

    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/swmansion/gesturehandler/react/l;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_0
    move-object v3, v0

    .line 28
    check-cast v3, Landroid/view/ViewGroup;

    .line 29
    .line 30
    iget-object v4, p0, LJ6/i;->b:LJ6/j;

    .line 31
    .line 32
    move-object v5, v0

    .line 33
    check-cast v5, Landroid/view/View;

    .line 34
    .line 35
    invoke-interface {v4, v5}, LJ6/j;->a(Landroid/view/View;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    monitor-enter v4

    .line 42
    :try_start_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const-string v6, "iterator(...)"

    .line 47
    .line 48
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, LJ6/d;

    .line 62
    .line 63
    invoke-virtual {v6}, LJ6/d;->d0()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_1

    .line 68
    .line 69
    aget v7, p2, v1

    .line 70
    .line 71
    const/4 v8, 0x1

    .line 72
    aget v9, p2, v8

    .line 73
    .line 74
    invoke-virtual {v6, p1, v7, v9}, LJ6/d;->g0(Landroid/view/View;FF)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_1

    .line 79
    .line 80
    invoke-direct {p0, v6, v3}, LJ6/i;->C(LJ6/d;Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, p3}, LJ6/d;->O0(I)V

    .line 84
    .line 85
    .line 86
    move v2, v8

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    sget-object v3, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    monitor-exit v4

    .line 93
    goto :goto_3

    .line 94
    :goto_2
    monitor-exit v4

    .line 95
    throw p1

    .line 96
    :cond_3
    :goto_3
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_0

    .line 101
    :cond_4
    :goto_4
    return v2
.end method

.method private final q(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget-object v2, LJ6/i;->r:[F

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    aput v4, v2, v3

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    aput v0, v2, v3

    .line 24
    .line 25
    iget-object v0, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 26
    .line 27
    invoke-direct {p0, v0, v2, v1, p1}, LJ6/i;->M(Landroid/view/View;[FILandroid/view/MotionEvent;)Z

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 31
    .line 32
    invoke-direct {p0, v0, v2, v1, p1}, LJ6/i;->r(Landroid/view/ViewGroup;[FILandroid/view/MotionEvent;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private final r(Landroid/view/ViewGroup;[FILandroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-direct {p0, p1}, LJ6/i;->J(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v0, v2

    .line 15
    :goto_0
    const/4 v3, -0x1

    .line 16
    if-ge v3, v0, :cond_5

    .line 17
    .line 18
    iget-object v3, p0, LJ6/i;->c:LJ6/D;

    .line 19
    .line 20
    invoke-interface {v3, p1, v0}, LJ6/D;->c(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    invoke-direct {p0, v8}, LJ6/i;->i(Landroid/view/View;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    sget-object v9, LJ6/i;->o:Landroid/graphics/PointF;

    .line 31
    .line 32
    sget-object v4, LJ6/i;->n:LJ6/i$a;

    .line 33
    .line 34
    aget v5, p2, v1

    .line 35
    .line 36
    aget v6, p2, v2

    .line 37
    .line 38
    move-object v7, p1

    .line 39
    invoke-static/range {v4 .. v9}, LJ6/i$a;->g(LJ6/i$a;FFLandroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/PointF;)V

    .line 40
    .line 41
    .line 42
    aget p1, p2, v1

    .line 43
    .line 44
    aget v3, p2, v2

    .line 45
    .line 46
    iget v5, v9, Landroid/graphics/PointF;->x:F

    .line 47
    .line 48
    aput v5, p2, v1

    .line 49
    .line 50
    iget v5, v9, Landroid/graphics/PointF;->y:F

    .line 51
    .line 52
    aput v5, p2, v2

    .line 53
    .line 54
    invoke-direct {p0, v8}, LJ6/i;->w(Landroid/view/View;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    aget v5, p2, v1

    .line 61
    .line 62
    aget v6, p2, v2

    .line 63
    .line 64
    invoke-static {v4, v5, v6, v8}, LJ6/i$a;->c(LJ6/i$a;FFLandroid/view/View;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v4, v1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :goto_1
    invoke-direct {p0, v8, p2, p3, p4}, LJ6/i;->M(Landroid/view/View;[FILandroid/view/MotionEvent;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    :goto_2
    aput p1, p2, v1

    .line 78
    .line 79
    aput v3, p2, v2

    .line 80
    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    return v2

    .line 84
    :cond_3
    move-object v7, p1

    .line 85
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 86
    .line 87
    move-object p1, v7

    .line 88
    goto :goto_0

    .line 89
    :cond_5
    return v1
.end method

.method private static final t(LJ6/d;LJ6/d;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, LJ6/d;->Z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LJ6/d;->Z()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, LJ6/d;->a0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, LJ6/d;->a0()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, LJ6/d;->G()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, LJ6/d;->G()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    sub-int/2addr p1, p0

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->signum(I)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_2
    invoke-virtual {p0}, LJ6/d;->Z()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, -0x1

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    invoke-virtual {p1}, LJ6/d;->Z()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v2, 0x1

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    return v2

    .line 55
    :cond_4
    invoke-virtual {p0}, LJ6/d;->a0()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_5

    .line 60
    .line 61
    return v1

    .line 62
    :cond_5
    invoke-virtual {p1}, LJ6/d;->a0()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_6

    .line 67
    .line 68
    return v2

    .line 69
    :cond_6
    const/4 p0, 0x0

    .line 70
    return p0
.end method

.method private final u(LJ6/d;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LJ6/d;

    .line 28
    .line 29
    sget-object v3, LJ6/i;->n:LJ6/i$a;

    .line 30
    .line 31
    invoke-virtual {v2}, LJ6/d;->S()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-static {v3, v4}, LJ6/i$a;->b(LJ6/i$a;I)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-static {v3, p1, v2}, LJ6/i$a;->e(LJ6/i$a;LJ6/d;LJ6/d;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_2
    return v1
.end method

.method private final w(Landroid/view/View;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LJ6/i;->c:LJ6/D;

    .line 6
    .line 7
    check-cast p1, Landroid/view/ViewGroup;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LJ6/D;->b(Landroid/view/ViewGroup;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 19
    return p1
.end method

.method private final x(Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne p1, v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eq p1, v1, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    iget-object v1, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 27
    .line 28
    if-ne p1, v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    return v0
.end method

.method private final y(Landroid/view/View;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, LJ6/i;->p:[F

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput v4, v3, v1

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    aput v4, v3, v5

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 30
    .line 31
    .line 32
    aget v2, v3, v1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    int-to-float v6, v6

    .line 39
    add-float/2addr v2, v6

    .line 40
    aget v3, v3, v5

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    int-to-float v6, v6

    .line 47
    add-float/2addr v3, v6

    .line 48
    cmpg-float v6, v2, v4

    .line 49
    .line 50
    if-ltz v6, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    int-to-float v6, v6

    .line 57
    add-float/2addr v2, v6

    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    int-to-float v6, v6

    .line 63
    cmpl-float v2, v2, v6

    .line 64
    .line 65
    if-gtz v2, :cond_3

    .line 66
    .line 67
    cmpg-float v2, v3, v4

    .line 68
    .line 69
    if-ltz v2, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    int-to-float p1, p1

    .line 76
    add-float/2addr v3, p1

    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    int-to-float p1, p1

    .line 82
    cmpl-float p1, v3, p1

    .line 83
    .line 84
    if-lez p1, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    return v1

    .line 88
    :cond_3
    :goto_1
    return v5
.end method

.method private final z(LJ6/d;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v1}, LJ6/d;->x0(Z)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p1, v2}, LJ6/d;->w0(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v2}, LJ6/d;->H0(Z)V

    .line 14
    .line 15
    .line 16
    iget v3, p0, LJ6/i;->m:I

    .line 17
    .line 18
    add-int/lit8 v4, v3, 0x1

    .line 19
    .line 20
    iput v4, p0, LJ6/i;->m:I

    .line 21
    .line 22
    invoke-virtual {p1, v3}, LJ6/d;->v0(I)V

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static {v3}, Lj7/q;->O(Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, LJ6/d;

    .line 46
    .line 47
    sget-object v5, LJ6/i;->n:LJ6/i$a;

    .line 48
    .line 49
    invoke-static {v5, v4, p1}, LJ6/i$a;->d(LJ6/i$a;LJ6/d;LJ6/d;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-virtual {v4}, LJ6/d;->q()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v3, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-static {v3}, Lj7/q;->O(Ljava/util/List;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, LJ6/d;

    .line 80
    .line 81
    sget-object v5, LJ6/i;->n:LJ6/i$a;

    .line 82
    .line 83
    invoke-static {v5, v4, p1}, LJ6/i$a;->d(LJ6/i$a;LJ6/d;LJ6/d;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    invoke-virtual {v4, v1}, LJ6/d;->x0(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-direct {p0}, LJ6/i;->k()V

    .line 94
    .line 95
    .line 96
    if-eq v0, v2, :cond_4

    .line 97
    .line 98
    const/4 v2, 0x3

    .line 99
    if-eq v0, v2, :cond_4

    .line 100
    .line 101
    const/4 v2, 0x2

    .line 102
    const/4 v3, 0x4

    .line 103
    invoke-virtual {p1, v3, v2}, LJ6/d;->w(II)V

    .line 104
    .line 105
    .line 106
    if-eq v0, v3, :cond_4

    .line 107
    .line 108
    const/4 v2, 0x5

    .line 109
    invoke-virtual {p1, v2, v3}, LJ6/d;->w(II)V

    .line 110
    .line 111
    .line 112
    if-eq v0, v2, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1, v1, v2}, LJ6/d;->w(II)V

    .line 115
    .line 116
    .line 117
    :cond_4
    return-void
.end method


# virtual methods
.method public final A(LJ6/d;II)V
    .locals 8

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, LJ6/i;->k:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    add-int/2addr v0, v1

    .line 10
    iput v0, p0, LJ6/i;->k:I

    .line 11
    .line 12
    sget-object v0, LJ6/i;->n:LJ6/i$a;

    .line 13
    .line 14
    invoke-static {v0, p2}, LJ6/i$a;->b(LJ6/i$a;I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x3

    .line 20
    const/4 v4, 0x5

    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    iget-object v0, p0, LJ6/i;->g:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_4

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, LJ6/d;

    .line 44
    .line 45
    sget-object v6, LJ6/i;->n:LJ6/i$a;

    .line 46
    .line 47
    invoke-static {v6, v5, p1}, LJ6/i$a;->e(LJ6/i$a;LJ6/d;LJ6/d;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    iget-object v6, p0, LJ6/i;->i:Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-virtual {v5}, LJ6/d;->T()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-nez v6, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    if-ne p2, v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {v5}, LJ6/d;->q()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, LJ6/d;->S()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-ne v6, v4, :cond_2

    .line 80
    .line 81
    invoke-virtual {v5, v3, v2}, LJ6/d;->w(II)V

    .line 82
    .line 83
    .line 84
    :cond_2
    const/4 v6, 0x0

    .line 85
    invoke-virtual {v5, v6}, LJ6/d;->x0(Z)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-direct {p0, v5}, LJ6/i;->N(LJ6/d;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-direct {p0}, LJ6/i;->k()V

    .line 94
    .line 95
    .line 96
    :cond_5
    const/4 v0, 0x4

    .line 97
    if-ne p2, v0, :cond_6

    .line 98
    .line 99
    invoke-direct {p0, p1}, LJ6/i;->N(LJ6/d;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    if-eq p3, v0, :cond_9

    .line 104
    .line 105
    if-ne p3, v4, :cond_7

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_7
    if-nez p3, :cond_8

    .line 109
    .line 110
    if-eq p2, v3, :cond_c

    .line 111
    .line 112
    :cond_8
    invoke-virtual {p1, p2, p3}, LJ6/d;->w(II)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_9
    :goto_1
    invoke-virtual {p1}, LJ6/d;->Z()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_a

    .line 121
    .line 122
    invoke-virtual {p1, p2, p3}, LJ6/d;->w(II)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_a
    if-ne p3, v0, :cond_c

    .line 127
    .line 128
    if-eq p2, v3, :cond_b

    .line 129
    .line 130
    if-ne p2, v1, :cond_c

    .line 131
    .line 132
    :cond_b
    invoke-virtual {p1, p2, v2}, LJ6/d;->w(II)V

    .line 133
    .line 134
    .line 135
    :cond_c
    :goto_2
    iget p1, p0, LJ6/i;->k:I

    .line 136
    .line 137
    sub-int/2addr p1, v1

    .line 138
    iput p1, p0, LJ6/i;->k:I

    .line 139
    .line 140
    invoke-direct {p0}, LJ6/i;->E()V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final B(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LJ6/i;->j:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x3

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x5

    .line 19
    if-eq v1, v3, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x7

    .line 22
    if-eq v1, v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-direct {p0}, LJ6/i;->j()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-direct {p0, p1}, LJ6/i;->q(Landroid/view/MotionEvent;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-direct {p0, p1}, LJ6/i;->o(Landroid/view/MotionEvent;)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    iput-boolean v3, p0, LJ6/i;->j:Z

    .line 37
    .line 38
    iget-boolean v3, p0, LJ6/i;->l:Z

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iget v3, p0, LJ6/i;->k:I

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    invoke-direct {p0}, LJ6/i;->l()V

    .line 47
    .line 48
    .line 49
    :cond_2
    if-eq v1, v0, :cond_3

    .line 50
    .line 51
    if-eq v1, v2, :cond_3

    .line 52
    .line 53
    const/16 v2, 0xa

    .line 54
    .line 55
    if-eq v1, v2, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object v1, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    iget-object v1, p0, LJ6/i;->d:Landroid/view/ViewGroup;

    .line 67
    .line 68
    instance-of v2, v1, Lcom/facebook/react/uimanager/RootView;

    .line 69
    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    move-object v2, v1

    .line 73
    check-cast v2, Lcom/facebook/react/uimanager/RootView;

    .line 74
    .line 75
    invoke-interface {v2, v1, p1}, Lcom/facebook/react/uimanager/RootView;->onChildEndedNativeGesture(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_1
    return v0
.end method

.method public final F(F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/i;->e:F

    .line 2
    .line 3
    return-void
.end method

.method public final K(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget-object v1, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v0, p2}, LJ6/i;->K(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 30
    .line 31
    .line 32
    :cond_2
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    add-float/2addr v1, v2

    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-float v2, v2

    .line 49
    sub-float/2addr v1, v2

    .line 50
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    int-to-float v0, v0

    .line 59
    add-float/2addr v2, v0

    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    int-to-float v0, v0

    .line 65
    sub-float/2addr v2, v0

    .line 66
    invoke-virtual {p2, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    sget-object v0, LJ6/i;->q:Landroid/graphics/Matrix;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_1
    return-object p2
.end method

.method public final L(Landroid/view/View;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 4

    .line 1
    const-string v0, "point"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget-object v1, p0, LJ6/i;->a:Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, v0, p2}, LJ6/i;->L(Landroid/view/View;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 30
    .line 31
    .line 32
    :cond_2
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    sub-int/2addr v2, v3

    .line 45
    int-to-float v2, v2

    .line 46
    add-float/2addr v1, v2

    .line 47
    iput v1, p2, Landroid/graphics/PointF;->x:F

    .line 48
    .line 49
    iget v1, p2, Landroid/graphics/PointF;->y:F

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    sub-int/2addr v0, v2

    .line 60
    int-to-float v0, v0

    .line 61
    add-float/2addr v1, v0

    .line 62
    iput v1, p2, Landroid/graphics/PointF;->y:F

    .line 63
    .line 64
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget-object v0, LJ6/i;->q:Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 81
    .line 82
    .line 83
    sget-object p1, LJ6/i;->r:[F

    .line 84
    .line 85
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    aput v1, p1, v2

    .line 89
    .line 90
    iget v1, p2, Landroid/graphics/PointF;->y:F

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    aput v1, p1, v3

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 96
    .line 97
    .line 98
    aget v0, p1, v2

    .line 99
    .line 100
    iput v0, p2, Landroid/graphics/PointF;->x:F

    .line 101
    .line 102
    aget p1, p1, v3

    .line 103
    .line 104
    iput p1, p2, Landroid/graphics/PointF;->y:F

    .line 105
    .line 106
    :cond_4
    :goto_1
    return-object p2
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ6/i;->b:LJ6/j;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LJ6/j;->a(Landroid/view/View;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, LJ6/d;

    .line 29
    .line 30
    instance-of v2, v1, LJ6/q;

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-direct {p0, v1, p1}, LJ6/i;->C(LJ6/d;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, LJ6/h;

    .line 39
    .line 40
    invoke-direct {v2, v1}, LJ6/h;-><init>(LJ6/d;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, LJ6/d;->T0(Lw7/a;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method

.method public final s(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ6/i;->b:LJ6/j;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LJ6/j;->a(Landroid/view/View;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final v()Z
    .locals 4

    .line 1
    iget-object v0, p0, LJ6/i;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LJ6/d;

    .line 28
    .line 29
    invoke-virtual {v2}, LJ6/d;->S()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x4

    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_2
    return v1
.end method
