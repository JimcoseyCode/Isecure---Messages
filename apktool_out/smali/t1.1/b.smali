.class public final Lt1/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv1/j;


# instance fields
.field private final a:Ly1/d;


# direct methods
.method public constructor <init>(Ly1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LQ1/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ly1/d;

    .line 9
    .line 10
    iput-object p1, p0, Lt1/b;->a:Ly1/d;

    .line 11
    .line 12
    return-void
.end method

.method private c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 20
    .line 21
    .line 22
    return-object v0
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;IILv1/h;)Lx1/v;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lt1/b;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lorg/aomedia/avif/android/AvifDecoder$Info;

    .line 6
    .line 7
    invoke-direct {p2}, Lorg/aomedia/avif/android/AvifDecoder$Info;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-static {p1, p3, p2}, Lorg/aomedia/avif/android/AvifDecoder;->getInfo(Ljava/nio/ByteBuffer;ILorg/aomedia/avif/android/AvifDecoder$Info;)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 v0, 0x0

    .line 19
    if-nez p3, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    sget-object p3, Lcom/bumptech/glide/load/resource/bitmap/t;->f:Lv1/g;

    .line 23
    .line 24
    invoke-virtual {p4, p3}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    sget-object p4, Lv1/b;->h:Lv1/b;

    .line 29
    .line 30
    if-ne p3, p4, :cond_1

    .line 31
    .line 32
    sget-object p3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget p3, p2, Lorg/aomedia/avif/android/AvifDecoder$Info;->depth:I

    .line 36
    .line 37
    const/16 p4, 0x8

    .line 38
    .line 39
    if-ne p3, p4, :cond_2

    .line 40
    .line 41
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {}, Lt1/a;->a()Landroid/graphics/Bitmap$Config;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    :goto_0
    iget-object p4, p0, Lt1/b;->a:Ly1/d;

    .line 49
    .line 50
    iget v1, p2, Lorg/aomedia/avif/android/AvifDecoder$Info;->width:I

    .line 51
    .line 52
    iget p2, p2, Lorg/aomedia/avif/android/AvifDecoder$Info;->height:I

    .line 53
    .line 54
    invoke-interface {p4, v1, p2, p3}, Ly1/d;->d(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    invoke-static {p1, p3, p2}, Lorg/aomedia/avif/android/AvifDecoder;->decode(Ljava/nio/ByteBuffer;ILandroid/graphics/Bitmap;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    iget-object p1, p0, Lt1/b;->a:Ly1/d;

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ly1/d;->c(Landroid/graphics/Bitmap;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_3
    iget-object p1, p0, Lt1/b;->a:Ly1/d;

    .line 75
    .line 76
    invoke-static {p2, p1}, Lcom/bumptech/glide/load/resource/bitmap/g;->d(Landroid/graphics/Bitmap;Ly1/d;)Lcom/bumptech/glide/load/resource/bitmap/g;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public b(Ljava/nio/ByteBuffer;Lv1/h;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt1/b;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lorg/aomedia/avif/android/AvifDecoder;->isAvifImage(Ljava/nio/ByteBuffer;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic decode(Ljava/lang/Object;IILv1/h;)Lx1/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lt1/b;->a(Ljava/nio/ByteBuffer;IILv1/h;)Lx1/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;Lv1/h;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt1/b;->b(Ljava/nio/ByteBuffer;Lv1/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
