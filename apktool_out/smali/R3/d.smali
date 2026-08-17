.class public LR3/d;
.super Lcom/github/penfeizhou/animation/decode/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final f:Landroid/graphics/PorterDuffXfermode;

.field private static final g:Landroid/graphics/PorterDuffXfermode;


# instance fields
.field final a:I

.field final b:I

.field final c:Z

.field final d:Z

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LR3/d;->f:Landroid/graphics/PorterDuffXfermode;

    .line 9
    .line 10
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    .line 11
    .line 12
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LR3/d;->g:Landroid/graphics/PorterDuffXfermode;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(LS3/a;LR3/c;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/github/penfeizhou/animation/decode/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 2
    .line 3
    .line 4
    iget p1, p2, LR3/c;->f:I

    .line 5
    .line 6
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 7
    .line 8
    iget p1, p2, LR3/c;->g:I

    .line 9
    .line 10
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 11
    .line 12
    iget p1, p2, LR3/c;->d:I

    .line 13
    .line 14
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 15
    .line 16
    iget p1, p2, LR3/c;->e:I

    .line 17
    .line 18
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 19
    .line 20
    iget p1, p2, LR3/c;->h:I

    .line 21
    .line 22
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const/16 p1, 0x64

    .line 27
    .line 28
    iput p1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p2}, LR3/c;->d()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput-boolean p1, p0, LR3/d;->c:Z

    .line 35
    .line 36
    invoke-virtual {p2}, LR3/c;->e()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput-boolean p1, p0, LR3/d;->d:Z

    .line 41
    .line 42
    iget p1, p2, LR3/e;->c:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x18

    .line 45
    .line 46
    iput p1, p0, LR3/d;->a:I

    .line 47
    .line 48
    iget p1, p2, LR3/e;->b:I

    .line 49
    .line 50
    add-int/lit8 v0, p1, -0x10

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    and-int/2addr p1, v1

    .line 54
    add-int/2addr v0, p1

    .line 55
    iput v0, p0, LR3/d;->b:I

    .line 56
    .line 57
    iget-object p1, p2, LR3/c;->j:LR3/a;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v1, 0x0

    .line 63
    :goto_0
    iput-boolean v1, p0, LR3/d;->e:Z

    .line 64
    .line 65
    return-void
.end method

.method private b(LS3/b;)I
    .locals 4

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    iget v1, p0, LR3/d;->b:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    invoke-virtual {p1, v0}, Lcom/github/penfeizhou/animation/io/b;->d(I)V

    .line 7
    .line 8
    .line 9
    const-string v1, "RIFF"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LS3/b;->h(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, LS3/b;->j(I)V

    .line 15
    .line 16
    .line 17
    const-string v1, "WEBP"

    .line 18
    .line 19
    invoke-virtual {p1, v1}, LS3/b;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget v1, LR3/k;->g:I

    .line 23
    .line 24
    invoke-virtual {p1, v1}, LS3/b;->j(I)V

    .line 25
    .line 26
    .line 27
    const/16 v1, 0xa

    .line 28
    .line 29
    invoke-virtual {p1, v1}, LS3/b;->j(I)V

    .line 30
    .line 31
    .line 32
    iget-boolean v1, p0, LR3/d;->e:Z

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/16 v1, 0x10

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v1, v2

    .line 41
    :goto_0
    int-to-byte v1, v1

    .line 42
    invoke-virtual {p1, v1}, Lcom/github/penfeizhou/animation/io/b;->b(B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, LS3/b;->i(I)V

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameWidth:I

    .line 49
    .line 50
    invoke-virtual {p1, v1}, LS3/b;->g(I)V

    .line 51
    .line 52
    .line 53
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameHeight:I

    .line 54
    .line 55
    invoke-virtual {p1, v1}, LS3/b;->g(I)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 59
    .line 60
    check-cast v1, LS3/a;

    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/github/penfeizhou/animation/io/c;->reset()V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 66
    .line 67
    check-cast v1, LS3/a;

    .line 68
    .line 69
    iget v2, p0, LR3/d;->a:I

    .line 70
    .line 71
    int-to-long v2, v2

    .line 72
    invoke-virtual {v1, v2, v3}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/a;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 76
    .line 77
    check-cast v1, LS3/a;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/b;->f()[B

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/b;->a()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iget v3, p0, LR3/d;->b:I

    .line 88
    .line 89
    invoke-virtual {v1, v2, p1, v3}, Lcom/github/penfeizhou/animation/io/c;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    return v0

    .line 93
    :catch_0
    move-exception p1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 95
    .line 96
    .line 97
    return v0
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;LS3/b;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    iput p3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 13
    .line 14
    iput-object p4, v0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    invoke-direct {p0, p5}, LR3/d;->b(LS3/b;)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p5}, Lcom/github/penfeizhou/animation/io/b;->f()[B

    .line 21
    .line 22
    .line 23
    move-result-object p5

    .line 24
    :try_start_0
    invoke-static {p5, v1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 35
    .line 36
    iput p3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 37
    .line 38
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 39
    .line 40
    invoke-static {p5, v1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object p5

    .line 44
    :goto_0
    if-eqz p5, :cond_1

    .line 45
    .line 46
    iget-boolean p4, p0, LR3/d;->c:Z

    .line 47
    .line 48
    if-eqz p4, :cond_0

    .line 49
    .line 50
    sget-object p4, LR3/d;->g:Landroid/graphics/PorterDuffXfermode;

    .line 51
    .line 52
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    sget-object p4, LR3/d;->f:Landroid/graphics/PorterDuffXfermode;

    .line 57
    .line 58
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 59
    .line 60
    .line 61
    :goto_1
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    .line 62
    .line 63
    iput v1, p4, Landroid/graphics/Rect;->left:I

    .line 64
    .line 65
    iput v1, p4, Landroid/graphics/Rect;->top:I

    .line 66
    .line 67
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iput v0, p4, Landroid/graphics/Rect;->right:I

    .line 72
    .line 73
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    .line 74
    .line 75
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iput v0, p4, Landroid/graphics/Rect;->bottom:I

    .line 80
    .line 81
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    .line 82
    .line 83
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameX:I

    .line 84
    .line 85
    int-to-float v1, v0

    .line 86
    const/high16 v2, 0x40000000    # 2.0f

    .line 87
    .line 88
    mul-float/2addr v1, v2

    .line 89
    int-to-float p3, p3

    .line 90
    div-float/2addr v1, p3

    .line 91
    float-to-int v1, v1

    .line 92
    iput v1, p4, Landroid/graphics/Rect;->left:I

    .line 93
    .line 94
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 95
    .line 96
    int-to-float v1, v1

    .line 97
    mul-float/2addr v1, v2

    .line 98
    div-float/2addr v1, p3

    .line 99
    float-to-int v1, v1

    .line 100
    iput v1, p4, Landroid/graphics/Rect;->top:I

    .line 101
    .line 102
    int-to-float v0, v0

    .line 103
    mul-float/2addr v0, v2

    .line 104
    div-float/2addr v0, p3

    .line 105
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    int-to-float v1, v1

    .line 110
    add-float/2addr v0, v1

    .line 111
    float-to-int v0, v0

    .line 112
    iput v0, p4, Landroid/graphics/Rect;->right:I

    .line 113
    .line 114
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    .line 115
    .line 116
    iget v0, p0, Lcom/github/penfeizhou/animation/decode/a;->frameY:I

    .line 117
    .line 118
    int-to-float v0, v0

    .line 119
    mul-float/2addr v0, v2

    .line 120
    div-float/2addr v0, p3

    .line 121
    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    int-to-float p3, p3

    .line 126
    add-float/2addr v0, p3

    .line 127
    float-to-int p3, v0

    .line 128
    iput p3, p4, Landroid/graphics/Rect;->bottom:I

    .line 129
    .line 130
    iget-object p3, p0, Lcom/github/penfeizhou/animation/decode/a;->srcRect:Landroid/graphics/Rect;

    .line 131
    .line 132
    iget-object p4, p0, Lcom/github/penfeizhou/animation/decode/a;->dstRect:Landroid/graphics/Rect;

    .line 133
    .line 134
    invoke-virtual {p1, p5, p3, p4, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 135
    .line 136
    .line 137
    move-object p4, p5

    .line 138
    :cond_1
    return-object p4
.end method

.method public bridge synthetic draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;Lcom/github/penfeizhou/animation/io/e;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    check-cast p5, LS3/b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, LR3/d;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;ILandroid/graphics/Bitmap;LS3/b;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
