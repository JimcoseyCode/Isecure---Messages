.class public LE/D;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP/y;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LP/z;)Landroidx/camera/core/o;
    .locals 8

    .line 1
    invoke-virtual {p1}, LP/z;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/camera/core/o;

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ly/Y;->b()LF/u1;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v0}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ly/Y;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    invoke-virtual {p1}, LP/z;->f()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p1}, LP/z;->g()Landroid/graphics/Matrix;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-interface {v0}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ly/Y;->c()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-static/range {v2 .. v7}, Ly/e0;->f(LF/u1;JILandroid/graphics/Matrix;I)Ly/Y;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Landroidx/camera/core/s;

    .line 44
    .line 45
    invoke-virtual {p1}, LP/z;->h()Landroid/util/Size;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-direct {v2, v0, v3, v1}, Landroidx/camera/core/s;-><init>(Landroidx/camera/core/o;Landroid/util/Size;Ly/Y;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LP/z;->b()Landroid/graphics/Rect;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {v2, p1}, Landroidx/camera/core/o;->b0(Landroid/graphics/Rect;)V

    .line 57
    .line 58
    .line 59
    return-object v2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE/D;->a(LP/z;)Landroidx/camera/core/o;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
