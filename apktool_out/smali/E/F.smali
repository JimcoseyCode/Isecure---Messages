.class public LE/F;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/F0;


# instance fields
.field private final a:LF/F0;

.field private b:LE/S;


# direct methods
.method constructor <init>(LF/F0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/F;->a:LF/F0;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(LE/F;LF/F0$a;LF/F0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p0}, LF/F0$a;->a(LF/F0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private j(Landroidx/camera/core/o;)Landroidx/camera/core/o;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget-object v1, p0, LE/F;->b:LE/S;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-static {}, LF/u1;->b()LF/u1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    new-instance v1, Landroid/util/Pair;

    .line 15
    .line 16
    iget-object v2, p0, LE/F;->b:LE/S;

    .line 17
    .line 18
    invoke-virtual {v2}, LE/S;->j()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, p0, LE/F;->b:LE/S;

    .line 23
    .line 24
    invoke-virtual {v3}, LE/S;->i()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, LF/u1;->a(Landroid/util/Pair;)LF/u1;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    iput-object v0, p0, LE/F;->b:LE/S;

    .line 41
    .line 42
    new-instance v0, Landroidx/camera/core/s;

    .line 43
    .line 44
    new-instance v2, Landroid/util/Size;

    .line 45
    .line 46
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    .line 55
    .line 56
    .line 57
    new-instance v3, LK/c;

    .line 58
    .line 59
    new-instance v4, LT/l;

    .line 60
    .line 61
    invoke-interface {p1}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-interface {v5}, Ly/Y;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    invoke-direct {v4, v1, v5, v6}, LT/l;-><init>(LF/u1;J)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v3, v4}, LK/c;-><init>(LF/B;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, p1, v2, v3}, Landroidx/camera/core/s;-><init>(Landroidx/camera/core/o;Landroid/util/Size;Ly/Y;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method


# virtual methods
.method public b()Landroidx/camera/core/o;
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->b()Landroidx/camera/core/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, LE/F;->j(Landroidx/camera/core/o;)Landroidx/camera/core/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(LF/F0$a;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    new-instance v1, LE/E;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LE/E;-><init>(LE/F;LF/F0$a;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, LF/F0;->e(LF/F0$a;Ljava/util/concurrent/Executor;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()Landroidx/camera/core/o;
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->g()Landroidx/camera/core/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, LE/F;->j(Landroidx/camera/core/o;)Landroidx/camera/core/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->getSurface()Landroid/view/Surface;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/F;->a:LF/F0;

    .line 2
    .line 3
    invoke-interface {v0}, LF/F0;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method h(LE/S;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE/F;->b:LE/S;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "Pending request should be null"

    .line 9
    .line 10
    invoke-static {v0, v1}, LH0/g;->j(ZLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LE/F;->b:LE/S;

    .line 14
    .line 15
    return-void
.end method

.method i()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LE/F;->b:LE/S;

    .line 3
    .line 4
    return-void
.end method
