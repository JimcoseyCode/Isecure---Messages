.class public final LI1/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LI1/e;


# instance fields
.field private final a:Ly1/d;

.field private final b:LI1/e;

.field private final c:LI1/e;


# direct methods
.method public constructor <init>(Ly1/d;LI1/e;LI1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI1/c;->a:Ly1/d;

    .line 5
    .line 6
    iput-object p2, p0, LI1/c;->b:LI1/e;

    .line 7
    .line 8
    iput-object p3, p0, LI1/c;->c:LI1/e;

    .line 9
    .line 10
    return-void
.end method

.method private static a(Lx1/v;)Lx1/v;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public transcode(Lx1/v;Lv1/h;)Lx1/v;
    .locals 2

    .line 1
    invoke-interface {p1}, Lx1/v;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LI1/c;->b:LI1/e;

    .line 12
    .line 13
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, LI1/c;->a:Ly1/d;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/bumptech/glide/load/resource/bitmap/g;->d(Landroid/graphics/Bitmap;Ly1/d;)Lcom/bumptech/glide/load/resource/bitmap/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1, v0, p2}, LI1/e;->transcode(Lx1/v;Lv1/h;)Lx1/v;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    instance-of v0, v0, LH1/c;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, LI1/c;->c:LI1/e;

    .line 35
    .line 36
    invoke-static {p1}, LI1/c;->a(Lx1/v;)Lx1/v;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {v0, p1, p2}, LI1/e;->transcode(Lx1/v;Lv1/h;)Lx1/v;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return-object p1
.end method
