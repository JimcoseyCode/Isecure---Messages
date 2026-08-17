.class public Ld3/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static t:Z


# instance fields
.field private final g:Lg2/a;

.field private final h:Lc2/n;

.field private i:LQ2/c;

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:LX2/b;

.field private q:Landroid/graphics/ColorSpace;

.field private r:Ljava/lang/String;

.field private s:Z


# direct methods
.method public constructor <init>(Lc2/n;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object v0, LQ2/c;->d:LQ2/c;

    iput-object v0, p0, Ld3/k;->i:LQ2/c;

    const/4 v0, -0x1

    .line 14
    iput v0, p0, Ld3/k;->j:I

    const/4 v1, 0x0

    .line 15
    iput v1, p0, Ld3/k;->k:I

    .line 16
    iput v0, p0, Ld3/k;->l:I

    .line 17
    iput v0, p0, Ld3/k;->m:I

    const/4 v1, 0x1

    .line 18
    iput v1, p0, Ld3/k;->n:I

    .line 19
    iput v0, p0, Ld3/k;->o:I

    .line 20
    invoke-static {p1}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 22
    iput-object p1, p0, Ld3/k;->h:Lc2/n;

    return-void
.end method

.method public constructor <init>(Lc2/n;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Ld3/k;-><init>(Lc2/n;)V

    .line 24
    iput p2, p0, Ld3/k;->o:I

    return-void
.end method

.method public constructor <init>(Lg2/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, LQ2/c;->d:LQ2/c;

    iput-object v0, p0, Ld3/k;->i:LQ2/c;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Ld3/k;->j:I

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Ld3/k;->k:I

    .line 5
    iput v0, p0, Ld3/k;->l:I

    .line 6
    iput v0, p0, Ld3/k;->m:I

    const/4 v1, 0x1

    .line 7
    iput v1, p0, Ld3/k;->n:I

    .line 8
    iput v0, p0, Ld3/k;->o:I

    .line 9
    invoke-static {p1}, Lg2/a;->d0(Lg2/a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lc2/k;->b(Ljava/lang/Boolean;)V

    .line 10
    invoke-virtual {p1}, Lg2/a;->k()Lg2/a;

    move-result-object p1

    iput-object p1, p0, Ld3/k;->g:Lg2/a;

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Ld3/k;->h:Lc2/n;

    return-void
.end method

.method private A0()Lcom/facebook/imageutils/ImageMetaData;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ld3/k;->J()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {v0}, Lcom/facebook/imageutils/BitmapUtil;->decodeDimensionsAndColorSpace(Ljava/io/InputStream;)Lcom/facebook/imageutils/ImageMetaData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/facebook/imageutils/ImageMetaData;->getColorSpace()Landroid/graphics/ColorSpace;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iput-object v2, p0, Ld3/k;->q:Landroid/graphics/ColorSpace;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/facebook/imageutils/ImageMetaData;->getDimensions()Lkotlin/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Ld3/k;->l:I

    .line 32
    .line 33
    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iput v2, p0, Ld3/k;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 51
    .line 52
    .line 53
    :catch_0
    :cond_1
    return-object v1

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    const/4 v0, 0x0

    .line 56
    :goto_1
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 59
    .line 60
    .line 61
    :catch_1
    :cond_2
    throw v1
.end method

.method private D0()Lkotlin/Pair;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld3/k;->J()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-static {v0}, Lcom/facebook/imageutils/WebpUtil;->getSize(Ljava/io/InputStream;)Lkotlin/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, p0, Ld3/k;->l:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iput v1, p0, Ld3/k;->m:I

    .line 38
    .line 39
    :cond_1
    return-object v0
.end method

.method public static e(Ld3/k;)Ld3/k;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/k;->d()Ld3/k;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method private i0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ld3/k;->J()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LQ2/e;->d(Ljava/io/InputStream;)LQ2/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Ld3/k;->i:LQ2/c;

    .line 10
    .line 11
    invoke-static {v0}, LQ2/b;->b(LQ2/c;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Ld3/k;->D0()Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0}, Ld3/k;->A0()Lcom/facebook/imageutils/ImageMetaData;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lcom/facebook/imageutils/ImageMetaData;->getDimensions()Lkotlin/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    sget-object v2, LQ2/b;->b:LQ2/c;

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    if-ne v0, v2, :cond_1

    .line 34
    .line 35
    iget v2, p0, Ld3/k;->j:I

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Ld3/k;->J()Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lcom/facebook/imageutils/JfifUtil;->getOrientation(Ljava/io/InputStream;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, Ld3/k;->k:I

    .line 50
    .line 51
    invoke-static {v0}, Lcom/facebook/imageutils/JfifUtil;->getAutoRotateAngleFromOrientation(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, Ld3/k;->j:I

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    sget-object v1, LQ2/b;->l:LQ2/c;

    .line 59
    .line 60
    if-ne v0, v1, :cond_2

    .line 61
    .line 62
    iget v0, p0, Ld3/k;->j:I

    .line 63
    .line 64
    if-ne v0, v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Ld3/k;->J()Ljava/io/InputStream;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lcom/facebook/imageutils/HeifExifUtil;->getOrientation(Ljava/io/InputStream;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, Ld3/k;->k:I

    .line 75
    .line 76
    invoke-static {v0}, Lcom/facebook/imageutils/JfifUtil;->getAutoRotateAngleFromOrientation(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Ld3/k;->j:I

    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    iget v0, p0, Ld3/k;->j:I

    .line 84
    .line 85
    if-ne v0, v3, :cond_3

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    iput v0, p0, Ld3/k;->j:I

    .line 89
    .line 90
    :cond_3
    return-void
.end method

.method public static k(Ld3/k;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/k;->close()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static l0(Ld3/k;)Z
    .locals 1

    .line 1
    iget v0, p0, Ld3/k;->j:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ld3/k;->l:I

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    iget p0, p0, Ld3/k;->m:I

    .line 10
    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static u0(Ld3/k;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ld3/k;->t0()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private y0()V
    .locals 1

    .line 1
    iget v0, p0, Ld3/k;->l:I

    .line 2
    .line 3
    if-ltz v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Ld3/k;->m:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ld3/k;->w0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public A()Landroid/graphics/ColorSpace;
    .locals 1

    .line 1
    invoke-direct {p0}, Ld3/k;->y0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld3/k;->q:Landroid/graphics/ColorSpace;

    .line 5
    .line 6
    return-object v0
.end method

.method public B(I)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ld3/k;->r()Lg2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    invoke-virtual {p0}, Ld3/k;->X()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    new-array v2, p1, [B

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Lg2/a;->J()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lf2/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Lg2/a;->close()V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :try_start_1
    invoke-interface {v3, v1, v2, v1, p1}, Lf2/h;->h(I[BII)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lg2/a;->close()V

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    mul-int/lit8 v3, p1, 0x2

    .line 42
    .line 43
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    if-ge v1, p1, :cond_2

    .line 47
    .line 48
    aget-byte v3, v2, v1

    .line 49
    .line 50
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v4, "%02X"

    .line 59
    .line 60
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    invoke-virtual {v0}, Lg2/a;->close()V

    .line 77
    .line 78
    .line 79
    throw p1
.end method

.method public F()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ld3/k;->y0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ld3/k;->j:I

    .line 5
    .line 6
    return v0
.end method

.method public I()LQ2/c;
    .locals 1

    .line 1
    invoke-direct {p0}, Ld3/k;->y0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld3/k;->i:LQ2/c;

    .line 5
    .line 6
    return-object v0
.end method

.method public I0()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ld3/k;->y0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ld3/k;->k:I

    .line 5
    .line 6
    return v0
.end method

.method public J()Ljava/io/InputStream;
    .locals 3

    .line 1
    iget-object v0, p0, Ld3/k;->h:Lc2/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lc2/n;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/io/InputStream;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 13
    .line 14
    invoke-static {v0}, Lg2/a;->r(Lg2/a;)Lg2/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_0
    new-instance v1, Lf2/j;

    .line 21
    .line 22
    invoke-virtual {v0}, Lg2/a;->J()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lf2/h;

    .line 27
    .line 28
    invoke-direct {v1, v2}, Lf2/j;-><init>(Lf2/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lg2/a;->B(Lg2/a;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    invoke-static {v0}, Lg2/a;->B(Lg2/a;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    return-object v0
.end method

.method public J0(LX2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld3/k;->p:LX2/b;

    .line 2
    .line 3
    return-void
.end method

.method public K0(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld3/k;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public L0(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld3/k;->m:I

    .line 2
    .line 3
    return-void
.end method

.method public M()Ljava/io/InputStream;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld3/k;->J()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/io/InputStream;

    .line 10
    .line 11
    return-object v0
.end method

.method public M0(LQ2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld3/k;->i:LQ2/c;

    .line 2
    .line 3
    return-void
.end method

.method public N0(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld3/k;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public O0(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld3/k;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public P0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld3/k;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public Q0(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld3/k;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public W()I
    .locals 1

    .line 1
    iget v0, p0, Ld3/k;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public X()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lg2/a;->J()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lg2/a;->J()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lf2/h;

    .line 18
    .line 19
    invoke-interface {v0}, Lf2/h;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    iget v0, p0, Ld3/k;->o:I

    .line 25
    .line 26
    return v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/a;->B(Lg2/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Ld3/k;
    .locals 3

    .line 1
    iget-object v0, p0, Ld3/k;->h:Lc2/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ld3/k;

    .line 6
    .line 7
    iget v2, p0, Ld3/k;->o:I

    .line 8
    .line 9
    invoke-direct {v1, v0, v2}, Ld3/k;-><init>(Lc2/n;I)V

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 14
    .line 15
    invoke-static {v0}, Lg2/a;->r(Lg2/a;)Lg2/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :try_start_0
    new-instance v1, Ld3/k;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ld3/k;-><init>(Lg2/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {v0}, Lg2/a;->B(Lg2/a;)V

    .line 29
    .line 30
    .line 31
    :goto_1
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ld3/k;->m(Ld3/k;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-object v1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-static {v0}, Lg2/a;->B(Lg2/a;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public d0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/k;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected g0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld3/k;->s:Z

    .line 2
    .line 3
    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ld3/k;->y0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ld3/k;->m:I

    .line 5
    .line 6
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ld3/k;->y0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ld3/k;->l:I

    .line 5
    .line 6
    return v0
.end method

.method public k0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ld3/k;->i:LQ2/c;

    .line 2
    .line 3
    sget-object v1, LQ2/b;->b:LQ2/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, LQ2/b;->m:LQ2/c;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    iget-object v0, p0, Ld3/k;->h:Lc2/n;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 19
    .line 20
    invoke-static {v0}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 24
    .line 25
    invoke-virtual {v0}, Lg2/a;->J()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lf2/h;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    if-ge p1, v3, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    add-int/lit8 v3, p1, -0x2

    .line 37
    .line 38
    invoke-interface {v0, v3}, Lf2/h;->g(I)B

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, -0x1

    .line 43
    if-ne v3, v4, :cond_3

    .line 44
    .line 45
    sub-int/2addr p1, v2

    .line 46
    invoke-interface {v0, p1}, Lf2/h;->g(I)B

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/16 v0, -0x27

    .line 51
    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    return v2

    .line 55
    :cond_3
    return v1
.end method

.method public m(Ld3/k;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ld3/k;->I()LQ2/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Ld3/k;->i:LQ2/c;

    .line 6
    .line 7
    invoke-virtual {p1}, Ld3/k;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Ld3/k;->l:I

    .line 12
    .line 13
    invoke-virtual {p1}, Ld3/k;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Ld3/k;->m:I

    .line 18
    .line 19
    invoke-virtual {p1}, Ld3/k;->F()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Ld3/k;->j:I

    .line 24
    .line 25
    invoke-virtual {p1}, Ld3/k;->I0()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Ld3/k;->k:I

    .line 30
    .line 31
    invoke-virtual {p1}, Ld3/k;->W()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Ld3/k;->n:I

    .line 36
    .line 37
    invoke-virtual {p1}, Ld3/k;->X()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Ld3/k;->o:I

    .line 42
    .line 43
    invoke-virtual {p1}, Ld3/k;->s()LX2/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Ld3/k;->p:LX2/b;

    .line 48
    .line 49
    invoke-virtual {p1}, Ld3/k;->A()Landroid/graphics/ColorSpace;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Ld3/k;->q:Landroid/graphics/ColorSpace;

    .line 54
    .line 55
    invoke-virtual {p1}, Ld3/k;->g0()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput-boolean p1, p0, Ld3/k;->s:Z

    .line 60
    .line 61
    return-void
.end method

.method public r()Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/a;->r(Lg2/a;)Lg2/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public s()LX2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/k;->p:LX2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public declared-synchronized t0()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ld3/k;->g:Lg2/a;

    .line 3
    .line 4
    invoke-static {v0}, Lg2/a;->d0(Lg2/a;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Ld3/k;->h:Lc2/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 20
    :goto_1
    monitor-exit p0

    .line 21
    return v0

    .line 22
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public w0()V
    .locals 1

    .line 1
    sget-boolean v0, Ld3/k;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Ld3/k;->i0()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v0, p0, Ld3/k;->s:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    invoke-direct {p0}, Ld3/k;->i0()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Ld3/k;->s:Z

    .line 19
    .line 20
    return-void
.end method
