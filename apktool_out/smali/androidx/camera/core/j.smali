.class abstract Landroidx/camera/core/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/F0$a;


# instance fields
.field private a:Landroidx/camera/core/g$a;

.field private volatile b:I

.field private volatile c:I

.field private volatile d:I

.field private volatile e:Z

.field private volatile f:Z

.field private g:Ljava/util/concurrent/Executor;

.field private h:Landroidx/camera/core/r;

.field private i:Landroid/media/ImageWriter;

.field private j:Landroid/graphics/Rect;

.field private k:Landroid/graphics/Rect;

.field private l:Landroid/graphics/Matrix;

.field private m:Landroid/graphics/Matrix;

.field n:Ljava/nio/ByteBuffer;

.field o:Ljava/nio/ByteBuffer;

.field p:Ljava/nio/ByteBuffer;

.field q:Ljava/nio/ByteBuffer;

.field r:Ljava/nio/ByteBuffer;

.field s:Ljava/nio/ByteBuffer;

.field private final t:Ljava/lang/Object;

.field protected u:Z


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Landroidx/camera/core/j;->d:I

    .line 6
    .line 7
    new-instance v1, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Landroidx/camera/core/j;->j:Landroid/graphics/Rect;

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Landroidx/camera/core/j;->k:Landroid/graphics/Rect;

    .line 20
    .line 21
    new-instance v1, Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Landroidx/camera/core/j;->l:Landroid/graphics/Matrix;

    .line 27
    .line 28
    new-instance v1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Landroidx/camera/core/j;->m:Landroid/graphics/Matrix;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Landroidx/camera/core/j;->t:Ljava/lang/Object;

    .line 41
    .line 42
    iput-boolean v0, p0, Landroidx/camera/core/j;->u:Z

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/j;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/g$a;Landroidx/concurrent/futures/c$a;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/camera/core/j;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {p1}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ly/Y;->b()LF/u1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p1}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ly/Y;->a()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    iget-boolean v0, p0, Landroidx/camera/core/j;->e:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :goto_0
    move v4, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget p0, p0, Landroidx/camera/core/j;->b:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    invoke-interface {p1}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0}, Ly/Y;->c()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    move-object v5, p2

    .line 40
    invoke-static/range {v1 .. v6}, Ly/e0;->f(LF/u1;JILandroid/graphics/Matrix;I)Ly/Y;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p1, Landroidx/camera/core/s;

    .line 45
    .line 46
    invoke-direct {p1, p3, p0}, Landroidx/camera/core/s;-><init>(Landroidx/camera/core/o;Ly/Y;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4}, Landroid/graphics/Rect;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    invoke-interface {p1, p4}, Landroidx/camera/core/o;->b0(Landroid/graphics/Rect;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-interface {p5, p1}, Landroidx/camera/core/g$a;->analyze(Landroidx/camera/core/o;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    invoke-virtual {p6, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    new-instance p0, LD0/k;

    .line 67
    .line 68
    const-string p1, "ImageAnalysis is detached"

    .line 69
    .line 70
    invoke-direct {p0, p1}, LD0/k;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p6, p0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static synthetic c(Landroidx/camera/core/j;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/g$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/camera/core/h;

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    move-object v6, p6

    .line 12
    move-object v7, p7

    .line 13
    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/h;-><init>(Landroidx/camera/core/j;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/g$a;Landroidx/concurrent/futures/c$a;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    const-string p0, "analyzeImage"

    .line 20
    .line 21
    return-object p0
.end method

.method private g(Landroidx/camera/core/o;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/camera/core/j;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x3

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    iget v0, p0, Landroidx/camera/core/j;->d:I

    .line 9
    .line 10
    if-ne v0, v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v0, p0, Landroidx/camera/core/j;->d:I

    .line 14
    .line 15
    if-ne v0, v2, :cond_7

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/camera/core/j;->n:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    if-nez v0, :cond_7

    .line 20
    .line 21
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    mul-int/2addr v0, p1

    .line 30
    mul-int/lit8 v0, v0, 0x4

    .line 31
    .line 32
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Landroidx/camera/core/j;->n:Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/j;->o:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    mul-int/2addr v0, v1

    .line 52
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Landroidx/camera/core/j;->o:Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    :cond_2
    iget-object v0, p0, Landroidx/camera/core/j;->o:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Landroidx/camera/core/j;->p:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    mul-int/2addr v0, v4

    .line 77
    div-int/lit8 v0, v0, 0x4

    .line 78
    .line 79
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Landroidx/camera/core/j;->p:Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    :cond_3
    iget-object v0, p0, Landroidx/camera/core/j;->p:Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Landroidx/camera/core/j;->q:Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    mul-int/2addr v0, v4

    .line 103
    div-int/lit8 v0, v0, 0x4

    .line 104
    .line 105
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Landroidx/camera/core/j;->q:Ljava/nio/ByteBuffer;

    .line 110
    .line 111
    :cond_4
    iget-object v0, p0, Landroidx/camera/core/j;->q:Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 114
    .line 115
    .line 116
    iget v0, p0, Landroidx/camera/core/j;->d:I

    .line 117
    .line 118
    if-ne v0, v3, :cond_7

    .line 119
    .line 120
    iget-object v0, p0, Landroidx/camera/core/j;->r:Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    mul-int/2addr v0, v3

    .line 133
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iput-object v0, p0, Landroidx/camera/core/j;->r:Ljava/nio/ByteBuffer;

    .line 138
    .line 139
    :cond_5
    iget-object v0, p0, Landroidx/camera/core/j;->r:Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Landroidx/camera/core/j;->s:Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    if-nez v0, :cond_6

    .line 147
    .line 148
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    mul-int/2addr v0, p1

    .line 157
    div-int/2addr v0, v2

    .line 158
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iput-object p1, p0, Landroidx/camera/core/j;->s:Ljava/nio/ByteBuffer;

    .line 163
    .line 164
    :cond_6
    iget-object p1, p0, Landroidx/camera/core/j;->s:Ljava/nio/ByteBuffer;

    .line 165
    .line 166
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 167
    .line 168
    .line 169
    :cond_7
    return-void
.end method

.method private static h(IIIII)Landroidx/camera/core/r;
    .locals 1

    .line 1
    const/16 v0, 0x5a

    .line 2
    .line 3
    if-eq p2, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x10e

    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 13
    :goto_1
    if-eqz p2, :cond_2

    .line 14
    .line 15
    move v0, p1

    .line 16
    goto :goto_2

    .line 17
    :cond_2
    move v0, p0

    .line 18
    :goto_2
    if-eqz p2, :cond_3

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_3
    move p0, p1

    .line 22
    :goto_3
    new-instance p1, Landroidx/camera/core/r;

    .line 23
    .line 24
    invoke-static {v0, p0, p3, p4}, Landroidx/camera/core/p;->a(IIII)LF/F0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {p1, p0}, Landroidx/camera/core/r;-><init>(LF/F0;)V

    .line 29
    .line 30
    .line 31
    return-object p1
.end method

.method static j(IIIII)Landroid/graphics/Matrix;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    if-lez p4, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroid/graphics/RectF;

    .line 9
    .line 10
    int-to-float p0, p0

    .line 11
    int-to-float p1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2, v2, p0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 14
    .line 15
    .line 16
    sget-object p0, LH/z;->a:Landroid/graphics/RectF;

    .line 17
    .line 18
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 21
    .line 22
    .line 23
    int-to-float p0, p4

    .line 24
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 25
    .line 26
    .line 27
    new-instance p0, Landroid/graphics/RectF;

    .line 28
    .line 29
    int-to-float p1, p2

    .line 30
    int-to-float p2, p3

    .line 31
    invoke-direct {p0, v2, v2, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, LH/z;->c(Landroid/graphics/RectF;)Landroid/graphics/Matrix;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    return-object v0
.end method

.method static k(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 7
    .line 8
    .line 9
    new-instance p0, Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method private m(IIII)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/j;->b:I

    .line 2
    .line 3
    invoke-static {p1, p2, p3, p4, v0}, Landroidx/camera/core/j;->j(IIIII)Landroid/graphics/Matrix;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Landroidx/camera/core/j;->j:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-static {p2, p1}, Landroidx/camera/core/j;->k(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Landroidx/camera/core/j;->k:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget-object p2, p0, Landroidx/camera/core/j;->m:Landroid/graphics/Matrix;

    .line 16
    .line 17
    iget-object p3, p0, Landroidx/camera/core/j;->l:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {p2, p3, p1}, Landroid/graphics/Matrix;->setConcat(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private n(Landroidx/camera/core/o;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/r;->j()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v1, p0, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/camera/core/r;->c()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/camera/core/r;->f()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v0, p1, p2, v1, v2}, Landroidx/camera/core/j;->h(IIIII)Landroidx/camera/core/r;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;

    .line 34
    .line 35
    iget p1, p0, Landroidx/camera/core/j;->d:I

    .line 36
    .line 37
    const/4 p2, 0x1

    .line 38
    if-ne p1, p2, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Landroidx/camera/core/j;->i:Landroid/media/ImageWriter;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, LL/a;->a(Landroid/media/ImageWriter;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object p1, p0, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/camera/core/r;->getSurface()Landroid/view/Surface;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p2, p0, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;

    .line 54
    .line 55
    invoke-virtual {p2}, Landroidx/camera/core/r;->f()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-static {p1, p2}, LL/a;->c(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Landroidx/camera/core/j;->i:Landroid/media/ImageWriter;

    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(LF/F0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/camera/core/j;->d(LF/F0;)Landroidx/camera/core/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/camera/core/j;->l(Landroidx/camera/core/o;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void

    .line 14
    :goto_0
    const-string v0, "ImageAnalysisAnalyzer"

    .line 15
    .line 16
    const-string v1, "Failed to acquire image."

    .line 17
    .line 18
    invoke-static {v0, v1, p1}, Ly/h0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method abstract d(LF/F0;)Landroidx/camera/core/o;
.end method

.method e(Landroidx/camera/core/o;)Lm5/a;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-boolean v0, v1, Landroidx/camera/core/j;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, v1, Landroidx/camera/core/j;->b:I

    .line 10
    .line 11
    move v8, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v8, 0x0

    .line 14
    :goto_0
    iget-object v3, v1, Landroidx/camera/core/j;->t:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v3

    .line 17
    :try_start_0
    iget-object v0, v1, Landroidx/camera/core/j;->g:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    iget-object v10, v1, Landroidx/camera/core/j;->a:Landroidx/camera/core/g$a;

    .line 20
    .line 21
    iget-boolean v4, v1, Landroidx/camera/core/j;->e:Z

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    iget v4, v1, Landroidx/camera/core/j;->c:I

    .line 27
    .line 28
    if-eq v8, v4, :cond_1

    .line 29
    .line 30
    move v12, v11

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object v14, v3

    .line 34
    goto/16 :goto_b

    .line 35
    .line 36
    :cond_1
    const/4 v12, 0x0

    .line 37
    :goto_1
    if-eqz v12, :cond_2

    .line 38
    .line 39
    invoke-direct {v1, v2, v8}, Landroidx/camera/core/j;->n(Landroidx/camera/core/o;I)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-boolean v4, v1, Landroidx/camera/core/j;->e:Z

    .line 43
    .line 44
    const/4 v5, 0x3

    .line 45
    if-nez v4, :cond_4

    .line 46
    .line 47
    iget v4, v1, Landroidx/camera/core/j;->d:I

    .line 48
    .line 49
    if-ne v4, v5, :cond_3

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    :goto_2
    move-object v4, v3

    .line 53
    goto :goto_4

    .line 54
    :cond_4
    :goto_3
    invoke-direct/range {p0 .. p1}, Landroidx/camera/core/j;->g(Landroidx/camera/core/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :goto_4
    :try_start_1
    iget-object v3, v1, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    :try_start_2
    iget-object v4, v1, Landroidx/camera/core/j;->i:Landroid/media/ImageWriter;

    .line 62
    .line 63
    iget-object v7, v1, Landroidx/camera/core/j;->n:Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    move v13, v5

    .line 66
    iget-object v5, v1, Landroidx/camera/core/j;->o:Ljava/nio/ByteBuffer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 67
    .line 68
    move-object v14, v6

    .line 69
    :try_start_3
    iget-object v6, v1, Landroidx/camera/core/j;->p:Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    iget-object v15, v1, Landroidx/camera/core/j;->q:Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    move-object/from16 v16, v6

    .line 74
    .line 75
    iget-object v6, v1, Landroidx/camera/core/j;->r:Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    iget-object v9, v1, Landroidx/camera/core/j;->s:Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    monitor-exit v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 80
    if-eqz v10, :cond_d

    .line 81
    .line 82
    if-eqz v0, :cond_d

    .line 83
    .line 84
    iget-boolean v14, v1, Landroidx/camera/core/j;->u:Z

    .line 85
    .line 86
    if-eqz v14, :cond_d

    .line 87
    .line 88
    if-eqz v3, :cond_7

    .line 89
    .line 90
    iget v6, v1, Landroidx/camera/core/j;->d:I

    .line 91
    .line 92
    const/4 v9, 0x2

    .line 93
    if-ne v6, v9, :cond_5

    .line 94
    .line 95
    iget-boolean v4, v1, Landroidx/camera/core/j;->f:Z

    .line 96
    .line 97
    invoke-static {v2, v3, v7, v8, v4}, Landroidx/camera/core/ImageProcessingUtil;->g(Landroidx/camera/core/o;LF/F0;Ljava/nio/ByteBuffer;IZ)Landroidx/camera/core/o;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    :goto_5
    move-object v2, v3

    .line 102
    goto :goto_6

    .line 103
    :cond_5
    iget v6, v1, Landroidx/camera/core/j;->d:I

    .line 104
    .line 105
    if-ne v6, v11, :cond_9

    .line 106
    .line 107
    iget-boolean v6, v1, Landroidx/camera/core/j;->f:Z

    .line 108
    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    invoke-static {v2}, Landroidx/camera/core/ImageProcessingUtil;->c(Landroidx/camera/core/o;)Z

    .line 112
    .line 113
    .line 114
    :cond_6
    if-eqz v4, :cond_9

    .line 115
    .line 116
    if-eqz v5, :cond_9

    .line 117
    .line 118
    if-eqz v16, :cond_9

    .line 119
    .line 120
    if-eqz v15, :cond_9

    .line 121
    .line 122
    move-object v7, v15

    .line 123
    move-object/from16 v6, v16

    .line 124
    .line 125
    invoke-static/range {v2 .. v8}, Landroidx/camera/core/ImageProcessingUtil;->n(Landroidx/camera/core/o;LF/F0;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/o;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    goto :goto_5

    .line 130
    :cond_7
    move-object v3, v5

    .line 131
    move-object v5, v15

    .line 132
    iget v2, v1, Landroidx/camera/core/j;->d:I

    .line 133
    .line 134
    if-ne v2, v13, :cond_9

    .line 135
    .line 136
    iget-boolean v2, v1, Landroidx/camera/core/j;->f:Z

    .line 137
    .line 138
    if-eqz v2, :cond_8

    .line 139
    .line 140
    invoke-static/range {p1 .. p1}, Landroidx/camera/core/ImageProcessingUtil;->c(Landroidx/camera/core/o;)Z

    .line 141
    .line 142
    .line 143
    :cond_8
    if-eqz v3, :cond_9

    .line 144
    .line 145
    if-eqz v16, :cond_9

    .line 146
    .line 147
    if-eqz v5, :cond_9

    .line 148
    .line 149
    if-eqz v6, :cond_9

    .line 150
    .line 151
    if-eqz v9, :cond_9

    .line 152
    .line 153
    move-object/from16 v2, p1

    .line 154
    .line 155
    move-object v7, v9

    .line 156
    move-object/from16 v4, v16

    .line 157
    .line 158
    invoke-static/range {v2 .. v8}, Landroidx/camera/core/ImageProcessingUtil;->o(Landroidx/camera/core/o;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/o;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    goto :goto_5

    .line 163
    :cond_9
    const/4 v2, 0x0

    .line 164
    :goto_6
    if-nez v2, :cond_a

    .line 165
    .line 166
    move v9, v11

    .line 167
    goto :goto_7

    .line 168
    :cond_a
    const/4 v9, 0x0

    .line 169
    :goto_7
    if-eqz v9, :cond_b

    .line 170
    .line 171
    move-object/from16 v5, p1

    .line 172
    .line 173
    goto :goto_8

    .line 174
    :cond_b
    move-object v5, v2

    .line 175
    :goto_8
    new-instance v6, Landroid/graphics/Rect;

    .line 176
    .line 177
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v4, Landroid/graphics/Matrix;

    .line 181
    .line 182
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 183
    .line 184
    .line 185
    iget-object v2, v1, Landroidx/camera/core/j;->t:Ljava/lang/Object;

    .line 186
    .line 187
    monitor-enter v2

    .line 188
    if-eqz v12, :cond_c

    .line 189
    .line 190
    if-nez v9, :cond_c

    .line 191
    .line 192
    :try_start_4
    invoke-interface/range {p1 .. p1}, Landroidx/camera/core/o;->getWidth()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-interface/range {p1 .. p1}, Landroidx/camera/core/o;->getHeight()I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    invoke-interface {v5}, Landroidx/camera/core/o;->getWidth()I

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    invoke-interface {v5}, Landroidx/camera/core/o;->getHeight()I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    invoke-direct {v1, v3, v7, v9, v11}, Landroidx/camera/core/j;->m(IIII)V

    .line 209
    .line 210
    .line 211
    goto :goto_9

    .line 212
    :catchall_1
    move-exception v0

    .line 213
    goto :goto_a

    .line 214
    :cond_c
    :goto_9
    iput v8, v1, Landroidx/camera/core/j;->c:I

    .line 215
    .line 216
    iget-object v3, v1, Landroidx/camera/core/j;->k:Landroid/graphics/Rect;

    .line 217
    .line 218
    invoke-virtual {v6, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 219
    .line 220
    .line 221
    iget-object v3, v1, Landroidx/camera/core/j;->m:Landroid/graphics/Matrix;

    .line 222
    .line 223
    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 224
    .line 225
    .line 226
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 227
    move-object v2, v0

    .line 228
    new-instance v0, Landroidx/camera/core/i;

    .line 229
    .line 230
    move-object/from16 v3, p1

    .line 231
    .line 232
    move-object v7, v10

    .line 233
    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/i;-><init>(Landroidx/camera/core/j;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/g$a;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    return-object v0

    .line 241
    :goto_a
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 242
    throw v0

    .line 243
    :cond_d
    new-instance v0, LD0/k;

    .line 244
    .line 245
    const-string v1, "No analyzer or executor currently set."

    .line 246
    .line 247
    invoke-direct {v0, v1}, LD0/k;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v0}, LJ/n;->n(Ljava/lang/Throwable;)Lm5/a;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    return-object v0

    .line 255
    :catchall_2
    move-exception v0

    .line 256
    goto :goto_b

    .line 257
    :catchall_3
    move-exception v0

    .line 258
    move-object v14, v6

    .line 259
    goto :goto_b

    .line 260
    :catchall_4
    move-exception v0

    .line 261
    move-object v14, v4

    .line 262
    :goto_b
    :try_start_6
    monitor-exit v14
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 263
    throw v0
.end method

.method abstract f()V
.end method

.method i()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/camera/core/j;->u:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/j;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method abstract l(Landroidx/camera/core/o;)V
.end method

.method o(Ljava/util/concurrent/Executor;Landroidx/camera/core/g$a;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/camera/core/j;->f()V

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/j;->t:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iput-object p2, p0, Landroidx/camera/core/j;->a:Landroidx/camera/core/g$a;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/camera/core/j;->g:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
.end method

.method p(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/camera/core/j;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method q(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/core/j;->d:I

    .line 2
    .line 3
    return-void
.end method

.method r(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/camera/core/j;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method s(Landroidx/camera/core/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/j;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/j;->h:Landroidx/camera/core/r;

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

.method t(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/core/j;->b:I

    .line 2
    .line 3
    return-void
.end method

.method u(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/j;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/j;->l:Landroid/graphics/Matrix;

    .line 5
    .line 6
    new-instance p1, Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/camera/core/j;->l:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-direct {p1, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/camera/core/j;->m:Landroid/graphics/Matrix;

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1
.end method

.method v(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/j;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/j;->j:Landroid/graphics/Rect;

    .line 5
    .line 6
    new-instance p1, Landroid/graphics/Rect;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/camera/core/j;->j:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {p1, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/camera/core/j;->k:Landroid/graphics/Rect;

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1
.end method
