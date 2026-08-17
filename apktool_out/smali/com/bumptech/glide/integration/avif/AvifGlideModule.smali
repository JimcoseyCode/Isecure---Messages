.class public final Lcom/bumptech/glide/integration/avif/AvifGlideModule;
.super LK1/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LK1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V
    .locals 7

    .line 1
    new-instance v0, Lt1/b;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/bumptech/glide/b;->g()Ly1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lt1/b;-><init>(Ly1/d;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "Bitmap"

    .line 11
    .line 12
    const-class v2, Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    const-class v3, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    invoke-virtual {p3, v1, v2, v3, v0}, Lcom/bumptech/glide/h;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 17
    .line 18
    .line 19
    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-direct {v4, v5, v0}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;Lv1/j;)V

    .line 26
    .line 27
    .line 28
    const-string v5, "BitmapDrawable"

    .line 29
    .line 30
    const-class v6, Landroid/graphics/drawable/BitmapDrawable;

    .line 31
    .line 32
    invoke-virtual {p3, v5, v2, v6, v4}, Lcom/bumptech/glide/h;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lt1/c;

    .line 36
    .line 37
    invoke-virtual {p3}, Lcom/bumptech/glide/h;->g()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {p2}, Lcom/bumptech/glide/b;->f()Ly1/b;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-direct {v2, v4, v0, p2}, Lt1/c;-><init>(Ljava/util/List;Lt1/b;Ly1/b;)V

    .line 46
    .line 47
    .line 48
    const-class p2, Ljava/io/InputStream;

    .line 49
    .line 50
    invoke-virtual {p3, v1, p2, v3, v2}, Lcom/bumptech/glide/h;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 51
    .line 52
    .line 53
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {v0, p1, v2}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;Lv1/j;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, v5, p2, v6, v0}, Lcom/bumptech/glide/h;->q(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 63
    .line 64
    .line 65
    return-void
.end method
