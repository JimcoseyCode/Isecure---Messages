.class public Lcom/github/penfeizhou/animation/glide/GlideAnimationModule;
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
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, LK1/b;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LO3/b;

    .line 5
    .line 6
    invoke-direct {p1}, LO3/b;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LO3/c;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LO3/c;-><init>(Lv1/j;)V

    .line 12
    .line 13
    .line 14
    const-class v1, Ljava/io/InputStream;

    .line 15
    .line 16
    const-class v2, Lcom/github/penfeizhou/animation/decode/b;

    .line 17
    .line 18
    invoke-virtual {p3, v1, v2, v0}, Lcom/bumptech/glide/h;->p(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 19
    .line 20
    .line 21
    const-class v0, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {p3, v0, v2, p1}, Lcom/bumptech/glide/h;->p(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 24
    .line 25
    .line 26
    new-instance p1, Lcom/github/penfeizhou/animation/glide/b;

    .line 27
    .line 28
    invoke-direct {p1}, Lcom/github/penfeizhou/animation/glide/b;-><init>()V

    .line 29
    .line 30
    .line 31
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    invoke-virtual {p3, v2, v0, p1}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;LI1/e;)Lcom/bumptech/glide/h;

    .line 34
    .line 35
    .line 36
    new-instance p1, Lcom/github/penfeizhou/animation/glide/a;

    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/bumptech/glide/b;->g()Ly1/d;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-direct {p1, p2}, Lcom/github/penfeizhou/animation/glide/a;-><init>(Ly1/d;)V

    .line 43
    .line 44
    .line 45
    const-class p2, Landroid/graphics/Bitmap;

    .line 46
    .line 47
    invoke-virtual {p3, v2, p2, p1}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;LI1/e;)Lcom/bumptech/glide/h;

    .line 48
    .line 49
    .line 50
    return-void
.end method
