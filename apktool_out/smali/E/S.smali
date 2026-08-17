.class LE/S;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:I

.field b:LE/i0;

.field private final c:Landroid/graphics/Rect;

.field private final d:I

.field private final e:I

.field private final f:Landroid/graphics/Matrix;

.field private final g:LE/X;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/util/List;

.field final j:Lm5/a;

.field private k:I


# direct methods
.method constructor <init>(LF/g0;LE/i0;LE/X;Lm5/a;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, LE/S;->k:I

    .line 6
    .line 7
    iput p5, p0, LE/S;->a:I

    .line 8
    .line 9
    iput-object p2, p0, LE/S;->b:LE/i0;

    .line 10
    .line 11
    invoke-virtual {p2}, LE/i0;->m()Ly/V$g;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, LE/i0;->o()Ly/V$g;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, LE/i0;->k()I

    .line 18
    .line 19
    .line 20
    move-result p5

    .line 21
    iput p5, p0, LE/S;->e:I

    .line 22
    .line 23
    invoke-virtual {p2}, LE/i0;->n()I

    .line 24
    .line 25
    .line 26
    move-result p5

    .line 27
    iput p5, p0, LE/S;->d:I

    .line 28
    .line 29
    invoke-virtual {p2}, LE/i0;->i()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object p5

    .line 33
    iput-object p5, p0, LE/S;->c:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {p2}, LE/i0;->p()Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iput-object p2, p0, LE/S;->f:Landroid/graphics/Matrix;

    .line 40
    .line 41
    iput-object p3, p0, LE/S;->g:LE/X;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, LE/S;->h:Ljava/lang/String;

    .line 52
    .line 53
    new-instance p2, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, LE/S;->i:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {p1}, LF/g0;->a()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    check-cast p1, Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_0

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, LF/i0;

    .line 84
    .line 85
    iget-object p3, p0, LE/S;->i:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {p2}, LF/i0;->getId()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    iput-object p4, p0, LE/S;->j:Lm5/a;

    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method a()Lm5/a;
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->j:Lm5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method b()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->c:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method c()I
    .locals 1

    .line 1
    iget v0, p0, LE/S;->e:I

    .line 2
    .line 3
    return v0
.end method

.method d()Ly/V$g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, LE/S;->a:I

    .line 2
    .line 3
    return v0
.end method

.method f()I
    .locals 1

    .line 1
    iget v0, p0, LE/S;->d:I

    .line 2
    .line 3
    return v0
.end method

.method g()Ly/V$g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method h()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method k()LE/i0;
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->b:LE/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method l()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 2
    .line 3
    invoke-interface {v0}, LE/X;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method m()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LE/S;->d()Ly/V$g;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE/S;->g()Ly/V$g;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0
.end method

.method n(Ly/X;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE/X;->c(Ly/X;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method o(I)V
    .locals 1

    .line 1
    iget v0, p0, LE/S;->k:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, LE/S;->k:I

    .line 6
    .line 7
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LE/X;->onCaptureProcessProgressed(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method p()V
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 2
    .line 3
    invoke-interface {v0}, LE/X;->g()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method q(Landroidx/camera/core/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE/X;->h(Landroidx/camera/core/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method r(Ly/V$h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE/X;->f(Ly/V$h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method s()V
    .locals 2

    .line 1
    iget v0, p0, LE/S;->k:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x64

    .line 7
    .line 8
    invoke-virtual {p0, v0}, LE/S;->o(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 12
    .line 13
    invoke-interface {v0}, LE/X;->d()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method t(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE/X;->e(Landroid/graphics/Bitmap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method u(Ly/X;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/S;->g:LE/X;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE/X;->b(Ly/X;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
