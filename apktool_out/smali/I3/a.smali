.class public LI3/a;
.super Lcom/github/penfeizhou/animation/decode/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private v:Lorg/aomedia/avif/android/AvifDecoder;


# direct methods
.method public constructor <init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/github/penfeizhou/animation/decode/b;-><init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected bridge synthetic A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LI3/a;->W(Lcom/github/penfeizhou/animation/io/Reader;)LJ3/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public B()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method protected bridge synthetic C()Lcom/github/penfeizhou/animation/io/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI3/a;->X()LJ3/b;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    return-object v0
.end method

.method protected bridge synthetic K(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    check-cast p1, LJ3/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LI3/a;->Y(LJ3/a;)Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected M()V
    .locals 1

    .line 1
    iget-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->release()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method protected O(Lcom/github/penfeizhou/animation/decode/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 8
    .line 9
    invoke-virtual {v1}, Lorg/aomedia/avif/android/AvifDecoder;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->I(II)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget v2, p0, Lcom/github/penfeizhou/animation/decode/b;->e:I

    .line 23
    .line 24
    check-cast p1, LI3/b;

    .line 25
    .line 26
    iget p1, p1, LI3/b;->a:I

    .line 27
    .line 28
    if-eq v2, p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, p1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nthFrame(ILandroid/graphics/Bitmap;)I

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-nez v2, :cond_2

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-virtual {v1, p1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nthFrame(ILandroid/graphics/Bitmap;)I

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nextFrame(Landroid/graphics/Bitmap;)I

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 47
    .line 48
    .line 49
    :try_start_0
    iget-object p1, p0, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {p0, v0}, Lcom/github/penfeizhou/animation/decode/b;->L(Landroid/graphics/Bitmap;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method protected W(Lcom/github/penfeizhou/animation/io/Reader;)LJ3/a;
    .locals 1

    .line 1
    new-instance v0, LJ3/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LJ3/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected X()LJ3/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected Y(LJ3/a;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    invoke-virtual {p1}, LJ3/a;->a()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lorg/aomedia/avif/android/AvifDecoder;->create(Ljava/nio/ByteBuffer;)Lorg/aomedia/avif/android/AvifDecoder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Rect;

    .line 12
    .line 13
    iget-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 14
    .line 15
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 20
    .line 21
    invoke-virtual {v1}, Lorg/aomedia/avif/android/AvifDecoder;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {p1, v2, v2, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method

.method public u(I)Lcom/github/penfeizhou/animation/decode/a;
    .locals 6

    .line 1
    new-instance v0, LI3/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LI3/b;-><init>(LJ3/a;)V

    .line 5
    .line 6
    .line 7
    iput p1, v0, LI3/b;->a:I

    .line 8
    .line 9
    iget-object v1, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/aomedia/avif/android/AvifDecoder;->getFrameDurations()[D

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    aget-wide v2, v1, p1

    .line 16
    .line 17
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr v2, v4

    .line 23
    double-to-int p1, v2

    .line 24
    iput p1, v0, Lcom/github/penfeizhou/animation/decode/a;->frameDuration:I

    .line 25
    .line 26
    return-object v0
.end method

.method public v(I)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    iget-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->s()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, LI3/a;->B()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    div-int/2addr v0, v1

    .line 20
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/decode/b;->s()Landroid/graphics/Rect;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0}, LI3/a;->B()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    div-int/2addr v1, v2

    .line 33
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 34
    .line 35
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 40
    .line 41
    invoke-virtual {v1, p1, v0}, Lorg/aomedia/avif/android/AvifDecoder;->nthFrame(ILandroid/graphics/Bitmap;)I

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public w()I
    .locals 1

    .line 1
    iget-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getFrameCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method protected x()I
    .locals 2

    .line 1
    iget-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getFrameCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    iget-object v0, p0, LI3/a;->v:Lorg/aomedia/avif/android/AvifDecoder;

    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/aomedia/avif/android/AvifDecoder;->getRepetitionCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method
