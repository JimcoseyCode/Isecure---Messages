.class public final LK/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/f$a;,
        LK/f$b;
    }
.end annotation


# instance fields
.field private final A:LK/m;

.field private final g:LF/e;

.field private final h:LF/e;

.field private final i:LF/E1;

.field private final j:Ly/p;

.field private final k:Ljava/util/List;

.field private final l:Ljava/util/List;

.field private final m:Lz/a;

.field private n:Ly/L0;

.field private o:Ljava/util/List;

.field private p:I

.field private q:Landroid/util/Range;

.field private final r:LF/E;

.field private final s:Ljava/lang/Object;

.field private t:Z

.field private u:LF/j0;

.field private v:Ly/J0;

.field private w:LT/g;

.field private final x:Ly/F;

.field private final y:Ly/F;

.field private final z:LN/e;


# direct methods
.method public constructor <init>(LF/M;LF/M;LF/d;LF/d;Ly/F;Ly/F;Lz/a;LK/m;LF/E1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LK/f;->k:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LK/f;->l:Ljava/util/List;

    .line 17
    .line 18
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    iput-object v0, p0, LK/f;->o:Ljava/util/List;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, LK/f;->p:I

    .line 24
    .line 25
    sget-object v0, LF/o1;->a:Landroid/util/Range;

    .line 26
    .line 27
    iput-object v0, p0, LK/f;->q:Landroid/util/Range;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, LK/f;->t:Z

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, LK/f;->u:LF/j0;

    .line 41
    .line 42
    new-instance v1, LN/e;

    .line 43
    .line 44
    invoke-direct {v1}, LN/e;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, LK/f;->z:LN/e;

    .line 48
    .line 49
    invoke-virtual {p3}, LF/d;->B()LF/E;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-object v1, p0, LK/f;->r:LF/E;

    .line 54
    .line 55
    new-instance v1, LF/e;

    .line 56
    .line 57
    invoke-direct {v1, p1, p3}, LF/e;-><init>(LF/M;LF/d;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, LK/f;->g:LF/e;

    .line 61
    .line 62
    if-eqz p2, :cond_0

    .line 63
    .line 64
    if-eqz p4, :cond_0

    .line 65
    .line 66
    new-instance p1, LF/e;

    .line 67
    .line 68
    invoke-direct {p1, p2, p4}, LF/e;-><init>(LF/M;LF/d;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, LK/f;->h:LF/e;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iput-object v0, p0, LK/f;->h:LF/e;

    .line 75
    .line 76
    :goto_0
    iput-object p5, p0, LK/f;->x:Ly/F;

    .line 77
    .line 78
    iput-object p6, p0, LK/f;->y:Ly/F;

    .line 79
    .line 80
    iput-object p7, p0, LK/f;->m:Lz/a;

    .line 81
    .line 82
    iput-object p9, p0, LK/f;->i:LF/E1;

    .line 83
    .line 84
    invoke-static {p3, p4}, Ly/p;->b(LF/d;LF/d;)Ly/p;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, LK/f;->j:Ly/p;

    .line 89
    .line 90
    iput-object p8, p0, LK/f;->A:LK/m;

    .line 91
    .line 92
    return-void
.end method

.method private A(Ljava/util/Collection;LT/g;)Ly/J0;
    .locals 2

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, LT/g;->s0()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :goto_0
    invoke-direct {p0}, LK/f;->V()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    invoke-static {v1}, LK/f;->X(Ljava/util/Collection;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, LK/f;->v:Ly/J0;

    .line 37
    .line 38
    invoke-static {p1}, LK/f;->b0(Ly/J0;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, LK/f;->v:Ly/J0;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-direct {p0}, LK/f;->F()Ly/p0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-static {v1}, LK/f;->W(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    iget-object p1, p0, LK/f;->v:Ly/J0;

    .line 59
    .line 60
    invoke-static {p1}, LK/f;->Z(Ly/J0;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, LK/f;->v:Ly/J0;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-direct {p0}, LK/f;->E()Ly/V;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    const/4 p1, 0x0

    .line 75
    :goto_1
    monitor-exit v0

    .line 76
    return-object p1

    .line 77
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    throw p1
.end method

.method private static B(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    const-string v1, "Cannot compute viewport crop rects zero sized sensor rect."

    .line 17
    .line 18
    invoke-static {v0, v1}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-float v2, v2

    .line 38
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    int-to-float p1, p1

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 48
    .line 49
    invoke-virtual {p0, v1, v0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method private C(Ljava/util/Collection;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LK/f;->P()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, LK/f;->R(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, LK/f;->S(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "Extensions are not supported for use with Raw image capture."

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    const-string v0, "Extensions are only supported for use with standard dynamic range."

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_2
    :goto_0
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v0

    .line 39
    :try_start_0
    iget-object v1, p0, LK/f;->o:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    invoke-static {p1}, LK/f;->T(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    invoke-static {p1}, LK/f;->S(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string v1, "Ultra HDR image and Raw capture does not support for use with CameraEffect."

    .line 65
    .line 66
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_4
    :goto_1
    monitor-exit v0

    .line 71
    return-void

    .line 72
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw p1
.end method

.method private static D(Ljava/util/Collection;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ly/J0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Ly/J0;->Y(Ljava/util/Set;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method private E()Ly/V;
    .locals 2

    .line 1
    new-instance v0, Ly/V$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/V$b;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ImageCapture-Extra"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ly/V$b;->r(Ljava/lang/String;)Ly/V$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ly/V$b;->e()Ly/V;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method private F()Ly/p0;
    .locals 2

    .line 1
    new-instance v0, Ly/p0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/p0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Preview-Extra"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ly/p0$a;->o(Ljava/lang/String;)Ly/p0$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ly/p0$a;->e()Ly/p0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, LK/d;

    .line 17
    .line 18
    invoke-direct {v1}, LK/d;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ly/p0;->p0(Ly/p0$c;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method private G(Ljava/util/Collection;Z)LT/g;
    .locals 9

    .line 1
    iget-object v1, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-direct {p0, p1, p2}, LK/f;->N(Ljava/util/Collection;Z)Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p2, 0x2

    .line 13
    const/4 v0, 0x0

    .line 14
    if-ge p1, p2, :cond_1

    .line 15
    .line 16
    invoke-direct {p0}, LK/f;->P()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {v7}, LK/f;->U(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    move-object p1, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    monitor-exit v1

    .line 33
    return-object v0

    .line 34
    :cond_1
    iget-object p1, p0, LK/f;->w:LT/g;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, LT/g;->s0()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1, v7}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, LK/f;->w:LT/g;

    .line 49
    .line 50
    invoke-virtual {p1, v7}, LT/g;->B0(Ljava/util/Set;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, LK/f;->w:LT/g;

    .line 54
    .line 55
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    monitor-exit v1

    .line 59
    return-object p1

    .line 60
    :cond_2
    invoke-static {v7}, LK/f;->d0(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    monitor-exit v1

    .line 67
    return-object v0

    .line 68
    :cond_3
    new-instance v2, LT/g;

    .line 69
    .line 70
    iget-object v3, p0, LK/f;->g:LF/e;

    .line 71
    .line 72
    iget-object v4, p0, LK/f;->h:LF/e;

    .line 73
    .line 74
    iget-object v5, p0, LK/f;->x:Ly/F;

    .line 75
    .line 76
    iget-object v6, p0, LK/f;->y:Ly/F;

    .line 77
    .line 78
    iget-object v8, p0, LK/f;->i:LF/E1;

    .line 79
    .line 80
    invoke-direct/range {v2 .. v8}, LT/g;-><init>(LF/M;LF/M;Ly/F;Ly/F;Ljava/util/Set;LF/E1;)V

    .line 81
    .line 82
    .line 83
    monitor-exit v1

    .line 84
    return-object v2

    .line 85
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    throw p1
.end method

.method private static I(LF/E1;LT/g;)LF/D1;
    .locals 2

    .line 1
    new-instance v0, Ly/p0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/p0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ly/p0$a;->e()Ly/p0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p0}, Ly/p0;->m(ZLF/E1;)LF/D1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-static {p0}, LF/S0;->j0(LF/j0;)LF/S0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object v0, LK/q;->N:LF/j0$a;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, LF/S0;->k0(LF/j0$a;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, LT/g;->D(LF/j0;)LF/D1$b;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, LF/D1$b;->c()LF/D1;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private K()I
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/f;->m:Lz/a;

    .line 5
    .line 6
    invoke-interface {v1}, Lz/a;->c()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    monitor-exit v0

    .line 15
    return v1

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    monitor-exit v0

    .line 19
    const/4 v0, 0x0

    .line 20
    return v0

    .line 21
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw v1
.end method

.method static L(Ljava/util/Collection;LF/E1;LF/E1;ILandroid/util/Range;)Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ly/J0;

    .line 21
    .line 22
    invoke-static {v1}, LT/g;->w0(Ly/J0;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, LT/g;

    .line 30
    .line 31
    invoke-static {p1, v2}, LK/f;->I(LF/E1;LT/g;)LF/D1;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v1, v2, p1}, Ly/J0;->m(ZLF/E1;)LF/D1;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :goto_1
    const/4 v3, 0x1

    .line 42
    invoke-virtual {v1, v3, p2}, Ly/J0;->m(ZLF/E1;)LF/D1;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v1, v3, p3, p4}, LK/f;->v(Ly/J0;LF/D1;ILandroid/util/Range;)LF/D1;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    new-instance v4, LK/f$b;

    .line 51
    .line 52
    invoke-direct {v4, v2, v3}, LK/f$b;-><init>(LF/D1;LF/D1;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v0
.end method

.method private M(Z)I
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/f;->o:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p1
.end method

.method private N(Ljava/util/Collection;Z)Ljava/util/Set;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2}, LK/f;->M(Z)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ly/J0;

    .line 25
    .line 26
    invoke-static {v1}, LT/g;->w0(Ly/J0;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    xor-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    const-string v3, "Only support one level of sharing for now."

    .line 33
    .line 34
    invoke-static {v2, v3}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p2}, Ly/J0;->F(I)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-object v0
.end method

.method private P()Z
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/f;->r:LF/E;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-interface {v1, v2}, LF/E;->R(LF/m1;)LF/m1;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method private static Q(LF/o1;LF/k1;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LF/o1;->d()LF/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, LF/k1;->g()LF/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-object v1, p0

    .line 13
    check-cast v1, LF/j0;

    .line 14
    .line 15
    invoke-interface {v1}, LF/j0;->a()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p1}, LF/k1;->g()LF/j0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, LF/j0;->a()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v2, 0x1

    .line 36
    if-eq v1, p1, :cond_0

    .line 37
    .line 38
    return v2

    .line 39
    :cond_0
    invoke-interface {p0}, LF/j0;->a()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, LF/j0$a;

    .line 58
    .line 59
    invoke-interface {v0, v1}, LF/j0;->b(LF/j0$a;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    invoke-interface {v0, v1}, LF/j0;->d(LF/j0$a;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {p0, v1}, LF/j0;->d(LF/j0$a;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v3, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_1

    .line 78
    .line 79
    :cond_2
    return v2

    .line 80
    :cond_3
    const/4 p0, 0x0

    .line 81
    return p0
.end method

.method private static R(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ly/J0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ly/J0;->l()LF/D1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, LF/D0;->l()Ly/H;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, LK/f;->a0(Ly/H;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method private static S(Ljava/util/Collection;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ly/J0;

    .line 16
    .line 17
    invoke-static {v0}, LK/f;->Z(Ly/J0;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v0}, Ly/J0;->l()LF/D1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, LF/C0;->U:LF/j0$a;

    .line 29
    .line 30
    invoke-interface {v0, v1}, LF/h1;->b(LF/j0$a;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, v1}, LF/h1;->d(LF/j0$a;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-static {v0}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x2

    .line 53
    if-ne v0, v1, :cond_0

    .line 54
    .line 55
    const/4 p0, 0x1

    .line 56
    return p0

    .line 57
    :cond_2
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method private static T(Ljava/util/Collection;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ly/J0;

    .line 16
    .line 17
    invoke-static {v0}, LK/f;->Z(Ly/J0;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v0}, Ly/J0;->l()LF/D1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, LF/C0;->U:LF/j0$a;

    .line 29
    .line 30
    invoke-interface {v0, v1}, LF/h1;->b(LF/j0$a;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, v1}, LF/h1;->d(LF/j0$a;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-static {v0}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x1

    .line 53
    if-ne v0, v1, :cond_0

    .line 54
    .line 55
    return v1

    .line 56
    :cond_2
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method static U(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ly/J0;

    .line 16
    .line 17
    invoke-static {v0}, LK/f;->e0(Ly/J0;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method private V()Z
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/f;->r:LF/E;

    .line 5
    .line 6
    invoke-interface {v1}, LF/E;->D()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    monitor-exit v0

    .line 16
    return v2

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1
.end method

.method private static W(Ljava/util/Collection;)Z
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    move v2, v1

    .line 8
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_3

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ly/J0;

    .line 20
    .line 21
    invoke-static {v3}, LK/f;->b0(Ly/J0;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_2

    .line 26
    .line 27
    invoke-static {v3}, LT/g;->w0(Ly/J0;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v3}, LK/f;->Z(Ly/J0;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    move v2, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    move v1, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    if-eqz v1, :cond_4

    .line 45
    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    return v4

    .line 49
    :cond_4
    return v0
.end method

.method private static X(Ljava/util/Collection;)Z
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    move v2, v1

    .line 8
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_3

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ly/J0;

    .line 20
    .line 21
    invoke-static {v3}, LK/f;->b0(Ly/J0;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_2

    .line 26
    .line 27
    invoke-static {v3}, LT/g;->w0(Ly/J0;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v3}, LK/f;->Z(Ly/J0;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    move v1, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    move v2, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    if-eqz v1, :cond_4

    .line 45
    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    return v4

    .line 49
    :cond_4
    return v0
.end method

.method private static varargs Y([Ljava/util/List;)Z
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v1, v0, :cond_3

    .line 5
    .line 6
    aget-object v3, p0, v1

    .line 7
    .line 8
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ly/J0;

    .line 23
    .line 24
    invoke-virtual {v4}, Ly/J0;->o()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    :cond_1
    if-eqz v2, :cond_2

    .line 32
    .line 33
    return v2

    .line 34
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    return v2
.end method

.method private static Z(Ly/J0;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Ly/V;

    .line 2
    .line 3
    return p0
.end method

.method private static a0(Ly/H;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly/H;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    move v0, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    invoke-virtual {p0}, Ly/H;->b()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Ly/H;->b()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    move p0, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move p0, v2

    .line 29
    :goto_1
    if-nez v0, :cond_3

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    return v2

    .line 35
    :cond_3
    :goto_2
    return v3
.end method

.method private static b0(Ly/J0;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Ly/p0;

    .line 2
    .line 3
    return p0
.end method

.method private c0()Z
    .locals 2

    .line 1
    invoke-direct {p0}, LK/f;->P()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LK/f;->h:LF/e;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, LK/f;->p:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method static d0(Ljava/util/Collection;)Z
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x1

    .line 4
    filled-new-array {v2, v0, v1}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ly/J0;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    const/4 v6, 0x3

    .line 32
    if-ge v5, v6, :cond_0

    .line 33
    .line 34
    aget v6, v0, v5

    .line 35
    .line 36
    invoke-virtual {v3, v6}, Ly/J0;->F(I)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_2

    .line 41
    .line 42
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    return v4

    .line 53
    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return v2
.end method

.method public static synthetic e(Ly/I0;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ly/I0;->q()Landroid/util/Size;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Ly/I0;->q()Landroid/util/Size;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    .line 27
    .line 28
    .line 29
    new-instance v1, Landroid/view/Surface;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, LK/e;

    .line 39
    .line 40
    invoke-direct {v3, v1, v0}, LK/e;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1, v2, v3}, Ly/I0;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;LH0/a;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static e0(Ly/J0;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, LF/D1;->G:LF/j0$a;

    .line 9
    .line 10
    invoke-interface {v1, v2}, LF/h1;->b(LF/j0$a;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, LF/D1;->G()LF/E1$b;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object v1, LF/E1$b;->j:LF/E1$b;

    .line 25
    .line 26
    if-ne p0, v1, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v0

    .line 31
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    :cond_2
    return v0
.end method

.method public static synthetic g(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Ly/I0$g;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static g0(Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ly/J0;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/Set;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ly/J0;->Y(Ljava/util/Set;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method private h0()V
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/f;->u:LF/j0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, LK/f;->g:LF/e;

    .line 9
    .line 10
    invoke-virtual {v1}, LF/e;->h()LF/I;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, LK/f;->u:LF/j0;

    .line 15
    .line 16
    invoke-interface {v1, v2}, LF/I;->j(LF/j0;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
.end method

.method private static j0(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ly/J0;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v2}, Ly/J0;->X(Ly/k;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw v2

    .line 45
    :cond_1
    return-object v0
.end method

.method private n0(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-direct {p0}, LK/f;->P()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, LK/f;->U(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    iget-object v0, p0, LK/f;->z:LN/e;

    .line 16
    .line 17
    iget-object v1, p0, LK/f;->g:LF/e;

    .line 18
    .line 19
    invoke-virtual {v1}, LF/e;->r()LF/L;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, LF/L;->f()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1, p1}, LN/e;->a(Ljava/lang/String;Ljava/util/Collection;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method static p0(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-static {p0, p1}, LK/f;->j0(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, LK/f;->j0(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string p2, "Unused effects: "

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "CameraUseCaseAdapter"

    .line 41
    .line 42
    invoke-static {p1, p0}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method private q0(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 9

    .line 1
    iget-object v1, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, LK/f;->n:Ly/L0;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 15
    .line 16
    invoke-virtual {v0}, LF/e;->r()LF/L;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ly/q;->k()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    :goto_0
    move v3, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 32
    .line 33
    invoke-virtual {v0}, LF/e;->r()LF/L;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, LF/L;->i()Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v0, p0, LK/f;->n:Ly/L0;

    .line 42
    .line 43
    invoke-virtual {v0}, Ly/L0;->a()Landroid/util/Rational;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 48
    .line 49
    invoke-virtual {v0}, LF/e;->r()LF/L;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v5, p0, LK/f;->n:Ly/L0;

    .line 54
    .line 55
    invoke-virtual {v5}, Ly/L0;->c()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-interface {v0, v5}, Ly/q;->p(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    iget-object v0, p0, LK/f;->n:Ly/L0;

    .line 64
    .line 65
    invoke-virtual {v0}, Ly/L0;->d()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    iget-object v0, p0, LK/f;->n:Ly/L0;

    .line 70
    .line 71
    invoke-virtual {v0}, Ly/L0;->b()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    move-object v8, p1

    .line 76
    invoke-static/range {v2 .. v8}, LK/s;->a(Landroid/graphics/Rect;ZLandroid/util/Rational;IIILjava/util/Map;)Ljava/util/Map;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Ly/J0;

    .line 95
    .line 96
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Landroid/graphics/Rect;

    .line 101
    .line 102
    invoke-static {v3}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Ly/J0;->b0(Landroid/graphics/Rect;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    move-object p1, v0

    .line 114
    goto :goto_4

    .line 115
    :cond_1
    move-object v8, p1

    .line 116
    :cond_2
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_3

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, Ly/J0;

    .line 131
    .line 132
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 133
    .line 134
    invoke-virtual {v0}, LF/e;->r()LF/L;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v0}, LF/L;->i()Landroid/graphics/Rect;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {v8, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    check-cast v2, LF/o1;

    .line 147
    .line 148
    invoke-static {v2}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, LF/o1;

    .line 153
    .line 154
    invoke-virtual {v2}, LF/o1;->f()Landroid/util/Size;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v0, v2}, LK/f;->B(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {p2, v0}, Ly/J0;->Z(Landroid/graphics/Matrix;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_3
    monitor-exit v1

    .line 167
    return-void

    .line 168
    :goto_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    throw p1
.end method

.method private s(LK/b;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LK/b;->g()LK/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK/l;->b()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, LK/b;->b()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v0, v1}, LK/f;->q0(Ljava/util/Map;Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LK/f;->o:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {p1}, LK/b;->b()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1}, LK/b;->a()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v0, v1, v2}, LK/f;->p0(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, LK/b;->d()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ly/J0;

    .line 48
    .line 49
    iget-object v2, p0, LK/f;->g:LF/e;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ly/J0;->c0(LF/M;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 56
    .line 57
    invoke-virtual {p1}, LK/b;->d()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, LF/e;->m(Ljava/util/Collection;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, LK/f;->h:LF/e;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1}, LK/b;->d()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_1

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ly/J0;

    .line 87
    .line 88
    iget-object v2, p0, LK/f;->h:LF/e;

    .line 89
    .line 90
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    check-cast v2, LF/M;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ly/J0;->c0(LF/M;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iget-object v0, p0, LK/f;->h:LF/e;

    .line 100
    .line 101
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, LK/b;->d()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, LF/e;->m(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-virtual {p1}, LK/b;->d()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    invoke-virtual {p1}, LK/b;->e()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Ly/J0;

    .line 140
    .line 141
    invoke-virtual {p1}, LK/b;->g()LK/l;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, LK/l;->b()Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_3

    .line 154
    .line 155
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, LF/o1;

    .line 160
    .line 161
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, LF/o1;->d()LF/j0;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-eqz v3, :cond_3

    .line 169
    .line 170
    invoke-virtual {v1}, Ly/J0;->z()LF/k1;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v2, v4}, LK/f;->Q(LF/o1;LF/k1;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_3

    .line 179
    .line 180
    invoke-virtual {v1, v3}, Ly/J0;->f0(LF/j0;)V

    .line 181
    .line 182
    .line 183
    iget-boolean v2, p0, LK/f;->t:Z

    .line 184
    .line 185
    if-eqz v2, :cond_3

    .line 186
    .line 187
    iget-object v2, p0, LK/f;->g:LF/e;

    .line 188
    .line 189
    invoke-virtual {v2, v1}, LF/e;->k(Ly/J0;)V

    .line 190
    .line 191
    .line 192
    iget-object v2, p0, LK/f;->h:LF/e;

    .line 193
    .line 194
    if-eqz v2, :cond_3

    .line 195
    .line 196
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v1}, LF/e;->k(Ly/J0;)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_4
    invoke-virtual {p1}, LK/b;->c()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_6

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Ly/J0;

    .line 222
    .line 223
    invoke-virtual {p1}, LK/b;->j()Ljava/util/Map;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, LK/f$b;

    .line 232
    .line 233
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    iget-object v3, p0, LK/f;->h:LF/e;

    .line 237
    .line 238
    if-eqz v3, :cond_5

    .line 239
    .line 240
    iget-object v4, p0, LK/f;->g:LF/e;

    .line 241
    .line 242
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    check-cast v3, LF/M;

    .line 246
    .line 247
    iget-object v5, v2, LK/f$b;->a:LF/D1;

    .line 248
    .line 249
    iget-object v2, v2, LK/f$b;->b:LF/D1;

    .line 250
    .line 251
    invoke-virtual {v1, v4, v3, v5, v2}, Ly/J0;->d(LF/M;LF/M;LF/D1;LF/D1;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, LK/b;->g()LK/l;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v2}, LK/l;->b()Ljava/util/Map;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, LF/o1;

    .line 267
    .line 268
    invoke-static {v2}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    check-cast v2, LF/o1;

    .line 273
    .line 274
    invoke-virtual {p1}, LK/b;->h()LK/l;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-static {v3}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, LK/l;

    .line 283
    .line 284
    invoke-virtual {v3}, LK/l;->b()Ljava/util/Map;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    check-cast v3, LF/o1;

    .line 293
    .line 294
    invoke-virtual {v1, v2, v3}, Ly/J0;->e0(LF/o1;LF/o1;)V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_5
    iget-object v3, p0, LK/f;->g:LF/e;

    .line 299
    .line 300
    iget-object v4, v2, LK/f$b;->a:LF/D1;

    .line 301
    .line 302
    iget-object v2, v2, LK/f$b;->b:LF/D1;

    .line 303
    .line 304
    const/4 v5, 0x0

    .line 305
    invoke-virtual {v1, v3, v5, v4, v2}, Ly/J0;->d(LF/M;LF/M;LF/D1;LF/D1;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1}, LK/b;->g()LK/l;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v2}, LK/l;->b()Ljava/util/Map;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    check-cast v2, LF/o1;

    .line 321
    .line 322
    invoke-static {v2}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    check-cast v2, LF/o1;

    .line 327
    .line 328
    invoke-virtual {v1, v2, v5}, Ly/J0;->e0(LF/o1;LF/o1;)V

    .line 329
    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_6
    iget-boolean v0, p0, LK/f;->t:Z

    .line 333
    .line 334
    if-eqz v0, :cond_7

    .line 335
    .line 336
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 337
    .line 338
    invoke-virtual {p1}, LK/b;->c()Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-virtual {v0, v1}, LF/e;->l(Ljava/util/Collection;)V

    .line 343
    .line 344
    .line 345
    iget-object v0, p0, LK/f;->h:LF/e;

    .line 346
    .line 347
    if-eqz v0, :cond_7

    .line 348
    .line 349
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1}, LK/b;->c()Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v0, v1}, LF/e;->l(Ljava/util/Collection;)V

    .line 357
    .line 358
    .line 359
    :cond_7
    invoke-virtual {p1}, LK/b;->c()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_8

    .line 372
    .line 373
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    check-cast v1, Ly/J0;

    .line 378
    .line 379
    invoke-virtual {v1}, Ly/J0;->M()V

    .line 380
    .line 381
    .line 382
    goto :goto_4

    .line 383
    :cond_8
    iget-object v0, p0, LK/f;->k:Ljava/util/List;

    .line 384
    .line 385
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 386
    .line 387
    .line 388
    iget-object v0, p0, LK/f;->k:Ljava/util/List;

    .line 389
    .line 390
    invoke-virtual {p1}, LK/b;->a()Ljava/util/Collection;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 395
    .line 396
    .line 397
    iget-object v0, p0, LK/f;->l:Ljava/util/List;

    .line 398
    .line 399
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 400
    .line 401
    .line 402
    iget-object v0, p0, LK/f;->l:Ljava/util/List;

    .line 403
    .line 404
    invoke-virtual {p1}, LK/b;->b()Ljava/util/Collection;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 409
    .line 410
    .line 411
    invoke-virtual {p1}, LK/b;->f()Ly/J0;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    iput-object v0, p0, LK/f;->v:Ly/J0;

    .line 416
    .line 417
    invoke-virtual {p1}, LK/b;->i()LT/g;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    iput-object p1, p0, LK/f;->w:LT/g;

    .line 422
    .line 423
    return-void
.end method

.method private t()V
    .locals 2

    .line 1
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 2
    .line 3
    iget-object v1, p0, LK/f;->r:LF/E;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LF/e;->q(LF/E;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LK/f;->h:LF/e;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LK/f;->r:LF/E;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, LF/e;->q(LF/E;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static u(Ljava/util/Collection;LB/b;)Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ly/J0;

    .line 21
    .line 22
    invoke-virtual {v1}, Ly/J0;->o()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, LB/b;->a()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const/4 v2, 0x0

    .line 37
    :goto_1
    invoke-virtual {v1, v2}, Ly/J0;->Y(Ljava/util/Set;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
.end method

.method private static v(Ly/J0;LF/D1;ILandroid/util/Range;)LF/D1;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, LF/S0;->j0(LF/j0;)LF/S0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, LF/S0;->i0()LF/S0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    sget-object v0, LF/D1;->B:LF/j0$a;

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p1, v0, p2}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p2, LF/o1;->a:Landroid/util/Range;

    .line 22
    .line 23
    invoke-virtual {p2, p3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    sget-object p2, LF/D1;->C:LF/j0$a;

    .line 30
    .line 31
    sget-object v0, LF/j0$c;->h:LF/j0$c;

    .line 32
    .line 33
    invoke-virtual {p1, p2, v0, p3}, LF/S0;->t(LF/j0$a;LF/j0$c;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p2, LF/D1;->D:LF/j0$a;

    .line 37
    .line 38
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1, p2, p3}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0, p1}, Ly/J0;->D(LF/j0;)LF/D1$b;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, LF/D1$b;->c()LF/D1;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method private x()V
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/f;->g:LF/e;

    .line 5
    .line 6
    invoke-virtual {v1}, LF/e;->h()LF/I;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, LF/I;->m()LF/j0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, p0, LK/f;->u:LF/j0;

    .line 15
    .line 16
    invoke-interface {v1}, LF/I;->n()V

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
.end method

.method private y(Ljava/util/Collection;ZZ)LK/b;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v13, p3

    .line 6
    .line 7
    invoke-direct/range {p0 .. p1}, LK/f;->C(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-direct/range {p0 .. p1}, LK/f;->n0(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-direct {v1, v3, v2, v13}, LK/f;->y(Ljava/util/Collection;ZZ)LK/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    invoke-direct/range {p0 .. p2}, LK/f;->G(Ljava/util/Collection;Z)LT/g;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {v1, v3, v0}, LK/f;->A(Ljava/util/Collection;LT/g;)Ly/J0;

    .line 29
    .line 30
    .line 31
    move-result-object v14

    .line 32
    invoke-static {v3, v14, v0}, LK/f;->z(Ljava/util/Collection;Ly/J0;LT/g;)Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v15

    .line 36
    new-instance v7, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v7, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    iget-object v4, v1, LK/f;->l:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v7, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    new-instance v8, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v8, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    iget-object v4, v1, LK/f;->l:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v8, v4}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    new-instance v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    iget-object v5, v1, LK/f;->l:Ljava/util/List;

    .line 59
    .line 60
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v4, v15}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    .line 66
    iget-object v5, v1, LK/f;->r:LF/E;

    .line 67
    .line 68
    invoke-interface {v5}, LF/E;->j()LF/E1;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iget-object v6, v1, LK/f;->i:LF/E1;

    .line 73
    .line 74
    iget v9, v1, LK/f;->p:I

    .line 75
    .line 76
    iget-object v10, v1, LK/f;->q:Landroid/util/Range;

    .line 77
    .line 78
    invoke-static {v7, v5, v6, v9, v10}, LK/f;->L(Ljava/util/Collection;LF/E1;LF/E1;ILandroid/util/Range;)Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    move-result-object v16

    .line 82
    const/4 v5, 0x2

    .line 83
    new-array v5, v5, [Ljava/util/List;

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    aput-object v7, v5, v6

    .line 87
    .line 88
    aput-object v8, v5, v2

    .line 89
    .line 90
    invoke-static {v5}, LK/f;->Y([Ljava/util/List;)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    move-object v5, v4

    .line 95
    :try_start_0
    iget-object v4, v1, LK/f;->A:LK/m;

    .line 96
    .line 97
    move-object v6, v5

    .line 98
    invoke-direct {v1}, LK/f;->K()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    iget-object v9, v1, LK/f;->g:LF/e;

    .line 103
    .line 104
    invoke-virtual {v9}, LF/e;->r()LF/L;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    move-object v10, v6

    .line 109
    move-object v6, v9

    .line 110
    iget-object v9, v1, LK/f;->r:LF/E;

    .line 111
    .line 112
    move-object v11, v10

    .line 113
    iget v10, v1, LK/f;->p:I

    .line 114
    .line 115
    move-object/from16 v17, v11

    .line 116
    .line 117
    iget-object v11, v1, LK/f;->q:Landroid/util/Range;

    .line 118
    .line 119
    invoke-interface/range {v4 .. v13}, LK/m;->b(ILF/L;Ljava/util/List;Ljava/util/List;LF/E;ILandroid/util/Range;ZZ)LK/l;

    .line 120
    .line 121
    .line 122
    move-result-object v18
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :try_start_1
    iget-object v4, v1, LK/f;->h:LF/e;

    .line 124
    .line 125
    if-eqz v4, :cond_1

    .line 126
    .line 127
    iget-object v4, v1, LK/f;->A:LK/m;

    .line 128
    .line 129
    invoke-direct {v1}, LK/f;->K()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    iget-object v6, v1, LK/f;->h:LF/e;

    .line 134
    .line 135
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6}, LF/e;->r()LF/L;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iget-object v9, v1, LK/f;->r:LF/E;

    .line 143
    .line 144
    iget v10, v1, LK/f;->p:I

    .line 145
    .line 146
    iget-object v11, v1, LK/f;->q:Landroid/util/Range;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 147
    .line 148
    move/from16 v13, p3

    .line 149
    .line 150
    :try_start_2
    invoke-interface/range {v4 .. v13}, LK/m;->b(ILF/L;Ljava/util/List;Ljava/util/List;LF/E;ILandroid/util/Range;ZZ)LK/l;

    .line 151
    .line 152
    .line 153
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 154
    :goto_0
    move-object v12, v2

    .line 155
    goto :goto_1

    .line 156
    :catch_0
    move-exception v0

    .line 157
    goto :goto_2

    .line 158
    :catch_1
    move-exception v0

    .line 159
    move/from16 v13, p3

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_1
    const/4 v2, 0x0

    .line 163
    goto :goto_0

    .line 164
    :goto_1
    new-instance v2, LK/b;

    .line 165
    .line 166
    move-object v5, v7

    .line 167
    move-object v6, v8

    .line 168
    move-object v9, v14

    .line 169
    move-object v4, v15

    .line 170
    move-object/from16 v10, v16

    .line 171
    .line 172
    move-object/from16 v7, v17

    .line 173
    .line 174
    move-object/from16 v11, v18

    .line 175
    .line 176
    move-object v8, v0

    .line 177
    invoke-direct/range {v2 .. v12}, LK/b;-><init>(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;LT/g;Ly/J0;Ljava/util/Map;LK/l;LK/l;)V

    .line 178
    .line 179
    .line 180
    return-object v2

    .line 181
    :goto_2
    if-nez p2, :cond_2

    .line 182
    .line 183
    invoke-direct {v1}, LK/f;->c0()Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-eqz v4, :cond_2

    .line 188
    .line 189
    invoke-direct {v1, v3, v2, v13}, LK/f;->y(Ljava/util/Collection;ZZ)LK/b;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    return-object v0

    .line 194
    :cond_2
    throw v0
.end method

.method static z(Ljava/util/Collection;Ly/J0;LT/g;)Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, LT/g;->s0()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {v0, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-object v0
.end method


# virtual methods
.method public H()V
    .locals 4

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LK/f;->t:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, LK/f;->g:LF/e;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v3, p0, LK/f;->l:Ljava/util/List;

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, LF/e;->m(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LK/f;->h:LF/e;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, LK/f;->l:Ljava/util/List;

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, LF/e;->m(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    invoke-direct {p0}, LK/f;->x()V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    iput-boolean v1, p0, LK/f;->t:Z

    .line 42
    .line 43
    :cond_1
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v1
.end method

.method public J()Ly/p;
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->j:Ly/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public O()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v2, p0, LK/f;->k:Ljava/util/List;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-object v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method public b()Ly/j;
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/e;->b()Ly/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Ly/q;
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/e;->d()Ly/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f0(Ljava/util/Collection;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, LK/f;->D(Ljava/util/Collection;)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    iget-object v2, p0, LK/f;->k:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LK/f;->h:LF/e;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v2

    .line 25
    :goto_0
    invoke-direct {p0, v1, p1, v2}, LK/f;->y(Ljava/util/Collection;ZZ)LK/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, LK/f;->s(LK/b;)V

    .line 30
    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1
.end method

.method public i0(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LK/f;->o:Ljava/util/List;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public j(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->g:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF/e;->j(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(Ljava/util/Collection;LB/b;)V
    .locals 3

    .line 1
    const-string v0, "CameraUseCaseAdapter"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "addUseCases: appUseCasesToAdd = "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, ", featureGroup = "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v0

    .line 34
    :try_start_0
    invoke-direct {p0}, LK/f;->t()V

    .line 35
    .line 36
    .line 37
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    iget-object v2, p0, LK/f;->k:Ljava/util/List;

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p2}, LK/f;->u(Ljava/util/Collection;LB/b;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :try_start_1
    iget-object p2, p0, LK/f;->h:LF/e;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move p2, v2

    .line 59
    :goto_0
    invoke-direct {p0, v1, p2, v2}, LK/f;->y(Ljava/util/Collection;ZZ)LK/b;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-direct {p0, p2}, LK/f;->s(LK/b;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    .line 66
    :try_start_2
    monitor-exit v0

    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_1

    .line 70
    :catch_0
    move-exception p2

    .line 71
    invoke-static {p1}, LK/f;->g0(Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, LK/f$a;

    .line 75
    .line 76
    invoke-direct {p1, p2}, LK/f$a;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    throw p1
.end method

.method public k0(Landroid/util/Range;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LK/f;->q:Landroid/util/Range;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public l0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput p1, p0, LK/f;->p:I

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public m0(Ly/L0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LK/f;->n:Ly/L0;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public o0(Ljava/util/Collection;LB/b;Z)LK/b;
    .locals 3

    .line 1
    const-string v0, "CameraUseCaseAdapter"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "simulateAddUseCases: appUseCasesToAdd = "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, ", featureGroup = "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v0

    .line 34
    :try_start_0
    invoke-direct {p0}, LK/f;->t()V

    .line 35
    .line 36
    .line 37
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    iget-object v2, p0, LK/f;->k:Ljava/util/List;

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p2}, LK/f;->u(Ljava/util/Collection;LB/b;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :try_start_1
    iget-object p2, p0, LK/f;->h:LF/e;

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 p2, 0x0

    .line 58
    :goto_0
    invoke-direct {p0, v1, p2, p3}, LK/f;->y(Ljava/util/Collection;ZZ)LK/b;

    .line 59
    .line 60
    .line 61
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    :try_start_2
    invoke-static {p1}, LK/f;->g0(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    return-object p2

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto :goto_2

    .line 69
    :catchall_1
    move-exception p2

    .line 70
    goto :goto_1

    .line 71
    :catch_0
    move-exception p2

    .line 72
    :try_start_3
    new-instance p3, LK/f$a;

    .line 73
    .line 74
    invoke-direct {p3, p2}, LK/f$a;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    :goto_1
    :try_start_4
    invoke-static {p1}, LK/f;->g0(Ljava/util/Map;)V

    .line 79
    .line 80
    .line 81
    throw p2

    .line 82
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 83
    throw p1
.end method

.method public w()V
    .locals 3

    .line 1
    iget-object v0, p0, LK/f;->s:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LK/f;->t:Z

    .line 5
    .line 6
    if-nez v1, :cond_3

    .line 7
    .line 8
    iget-object v1, p0, LK/f;->l:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, LK/f;->g:LF/e;

    .line 17
    .line 18
    iget-object v2, p0, LK/f;->r:LF/E;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, LF/e;->q(LF/E;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, LK/f;->h:LF/e;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, LK/f;->r:LF/E;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, LF/e;->q(LF/E;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    :goto_0
    iget-object v1, p0, LK/f;->g:LF/e;

    .line 36
    .line 37
    iget-object v2, p0, LK/f;->l:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, LF/e;->l(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, LK/f;->h:LF/e;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, LK/f;->l:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, LF/e;->l(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-direct {p0}, LK/f;->h0()V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, LK/f;->l:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ly/J0;

    .line 71
    .line 72
    invoke-virtual {v2}, Ly/J0;->M()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    const/4 v1, 0x1

    .line 77
    iput-boolean v1, p0, LK/f;->t:Z

    .line 78
    .line 79
    :cond_3
    monitor-exit v0

    .line 80
    return-void

    .line 81
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    throw v1
.end method
