.class public LT2/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT2/d$c;,
        LT2/d$b;
    }
.end annotation


# instance fields
.field private final a:LR2/a;

.field private final b:LT2/d$b;

.field private final c:Landroid/graphics/Paint;

.field private final d:Z


# direct methods
.method public constructor <init>(LR2/a;ZLT2/d$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT2/d;->a:LR2/a;

    .line 5
    .line 6
    iput-object p3, p0, LT2/d;->b:LT2/d$b;

    .line 7
    .line 8
    iput-boolean p2, p0, LT2/d;->d:Z

    .line 9
    .line 10
    new-instance p1, Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LT2/d;->c:Landroid/graphics/Paint;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 27
    .line 28
    sget-object p3, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 29
    .line 30
    invoke-direct {p2, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private a(Landroid/graphics/Canvas;LR2/b;)V
    .locals 7

    .line 1
    iget v0, p2, LR2/b;->b:I

    .line 2
    .line 3
    int-to-float v2, v0

    .line 4
    iget v1, p2, LR2/b;->c:I

    .line 5
    .line 6
    int-to-float v3, v1

    .line 7
    iget v4, p2, LR2/b;->d:I

    .line 8
    .line 9
    add-int/2addr v0, v4

    .line 10
    int-to-float v4, v0

    .line 11
    iget p2, p2, LR2/b;->e:I

    .line 12
    .line 13
    add-int/2addr v1, p2

    .line 14
    int-to-float v5, v1

    .line 15
    iget-object v6, p0, LT2/d;->c:Landroid/graphics/Paint;

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private b(I)LT2/d$c;
    .locals 2

    .line 1
    iget-object v0, p0, LT2/d;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LR2/a;->c(I)LR2/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, LR2/b;->g:LR2/b$b;

    .line 8
    .line 9
    sget-object v1, LR2/b$b;->g:LR2/b$b;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object p1, LT2/d$c;->g:LT2/d$c;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object v1, LR2/b$b;->h:LR2/b$b;

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    invoke-direct {p0, p1}, LT2/d;->c(LR2/b;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    sget-object p1, LT2/d$c;->h:LT2/d$c;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    sget-object p1, LT2/d$c;->g:LT2/d$c;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_2
    sget-object p1, LR2/b$b;->i:LR2/b$b;

    .line 33
    .line 34
    if-ne v0, p1, :cond_3

    .line 35
    .line 36
    sget-object p1, LT2/d$c;->i:LT2/d$c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_3
    sget-object p1, LT2/d$c;->j:LT2/d$c;

    .line 40
    .line 41
    return-object p1
.end method

.method private c(LR2/b;)Z
    .locals 2

    .line 1
    iget v0, p1, LR2/b;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p1, LR2/b;->c:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p1, LR2/b;->d:I

    .line 10
    .line 11
    iget-object v1, p0, LT2/d;->a:LR2/a;

    .line 12
    .line 13
    invoke-interface {v1}, LR2/a;->j()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget p1, p1, LR2/b;->e:I

    .line 20
    .line 21
    iget-object v0, p0, LT2/d;->a:LR2/a;

    .line 22
    .line 23
    invoke-interface {v0}, LR2/a;->h()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ne p1, v0, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method private d(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, LT2/d;->a:LR2/a;

    .line 6
    .line 7
    invoke-interface {v1, p1}, LR2/a;->c(I)LR2/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, LT2/d;->a:LR2/a;

    .line 12
    .line 13
    sub-int/2addr p1, v0

    .line 14
    invoke-interface {v2, p1}, LR2/a;->c(I)LR2/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v2, v1, LR2/b;->f:LR2/b$a;

    .line 19
    .line 20
    sget-object v3, LR2/b$a;->h:LR2/b$a;

    .line 21
    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, v1}, LT2/d;->c(LR2/b;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    return v0

    .line 31
    :cond_1
    iget-object v1, p1, LR2/b;->g:LR2/b$b;

    .line 32
    .line 33
    sget-object v2, LR2/b$b;->h:LR2/b$b;

    .line 34
    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, p1}, LT2/d;->c(LR2/b;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method private e(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iget-object p1, p0, LT2/d;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {p1}, LR2/a;->k()LR2/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, LR2/e;->c()Ll3/a;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private f(ILandroid/graphics/Canvas;)I
    .locals 6

    .line 1
    :goto_0
    if-ltz p1, :cond_8

    .line 2
    .line 3
    invoke-direct {p0, p1}, LT2/d;->b(I)LT2/d$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LT2/d$a;->a:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v0, v2, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_6

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    add-int/2addr p1, v1

    .line 26
    return p1

    .line 27
    :cond_1
    iget-object v0, p0, LT2/d;->a:LR2/a;

    .line 28
    .line 29
    invoke-interface {v0, p1}, LR2/a;->c(I)LR2/b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, p0, LT2/d;->b:LT2/d$b;

    .line 34
    .line 35
    invoke-interface {v2, p1}, LT2/d$b;->b(I)Lg2/a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    :try_start_0
    invoke-virtual {v2}, Lg2/a;->J()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroid/graphics/Bitmap;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {p2, v3, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    iget-object v3, v0, LR2/b;->g:LR2/b$b;

    .line 53
    .line 54
    sget-object v4, LR2/b$b;->h:LR2/b$b;

    .line 55
    .line 56
    if-ne v3, v4, :cond_2

    .line 57
    .line 58
    invoke-direct {p0, p2, v0}, LT2/d;->a(Landroid/graphics/Canvas;LR2/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    :goto_1
    add-int/2addr p1, v1

    .line 65
    iget-boolean p2, p0, LT2/d;->d:Z

    .line 66
    .line 67
    if-nez p2, :cond_3

    .line 68
    .line 69
    invoke-virtual {v2}, Lg2/a;->close()V

    .line 70
    .line 71
    .line 72
    :cond_3
    return p1

    .line 73
    :goto_2
    iget-boolean p2, p0, LT2/d;->d:Z

    .line 74
    .line 75
    if-nez p2, :cond_4

    .line 76
    .line 77
    invoke-virtual {v2}, Lg2/a;->close()V

    .line 78
    .line 79
    .line 80
    :cond_4
    throw p1

    .line 81
    :cond_5
    invoke-direct {p0, p1}, LT2/d;->d(I)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    :cond_6
    return p1

    .line 88
    :cond_7
    :goto_3
    add-int/lit8 p1, p1, -0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    const/4 p1, 0x0

    .line 92
    return p1
.end method


# virtual methods
.method public g(ILandroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LT2/d;->a:LR2/a;

    .line 7
    .line 8
    invoke-interface {p2, p1, v0}, LR2/a;->i(ILandroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public h(ILandroid/graphics/Bitmap;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, LT2/d;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LT2/d;->g(ILandroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Landroid/graphics/Canvas;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, LT2/d;->d(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    add-int/lit8 v1, p1, -0x1

    .line 27
    .line 28
    invoke-direct {p0, v1, v0}, LT2/d;->f(ILandroid/graphics/Canvas;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v1, p1

    .line 34
    :goto_0
    if-ge v1, p1, :cond_5

    .line 35
    .line 36
    iget-object v2, p0, LT2/d;->a:LR2/a;

    .line 37
    .line 38
    invoke-interface {v2, v1}, LR2/a;->c(I)LR2/b;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v3, v2, LR2/b;->g:LR2/b$b;

    .line 43
    .line 44
    sget-object v4, LR2/b$b;->i:LR2/b$b;

    .line 45
    .line 46
    if-ne v3, v4, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object v4, v2, LR2/b;->f:LR2/b$a;

    .line 50
    .line 51
    sget-object v5, LR2/b$a;->h:LR2/b$a;

    .line 52
    .line 53
    if-ne v4, v5, :cond_3

    .line 54
    .line 55
    invoke-direct {p0, v0, v2}, LT2/d;->a(Landroid/graphics/Canvas;LR2/b;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object v4, p0, LT2/d;->a:LR2/a;

    .line 59
    .line 60
    invoke-interface {v4, v1, v0}, LR2/a;->e(ILandroid/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, LT2/d;->b:LT2/d$b;

    .line 64
    .line 65
    invoke-interface {v4, v1, p2}, LT2/d$b;->a(ILandroid/graphics/Bitmap;)V

    .line 66
    .line 67
    .line 68
    sget-object v4, LR2/b$b;->h:LR2/b$b;

    .line 69
    .line 70
    if-ne v3, v4, :cond_4

    .line 71
    .line 72
    invoke-direct {p0, v0, v2}, LT2/d;->a(Landroid/graphics/Canvas;LR2/b;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    iget-object v1, p0, LT2/d;->a:LR2/a;

    .line 79
    .line 80
    invoke-interface {v1, p1}, LR2/a;->c(I)LR2/b;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v2, v1, LR2/b;->f:LR2/b$a;

    .line 85
    .line 86
    sget-object v3, LR2/b$a;->h:LR2/b$a;

    .line 87
    .line 88
    if-ne v2, v3, :cond_6

    .line 89
    .line 90
    invoke-direct {p0, v0, v1}, LT2/d;->a(Landroid/graphics/Canvas;LR2/b;)V

    .line 91
    .line 92
    .line 93
    :cond_6
    iget-object v1, p0, LT2/d;->a:LR2/a;

    .line 94
    .line 95
    invoke-interface {v1, p1, v0}, LR2/a;->e(ILandroid/graphics/Canvas;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, p2}, LT2/d;->e(Landroid/graphics/Bitmap;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
