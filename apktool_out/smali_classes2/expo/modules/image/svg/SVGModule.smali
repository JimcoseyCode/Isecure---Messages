.class public final Lexpo/modules/image/svg/SVGModule;
.super LK1/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/image/svg/SVGModule;",
        "LK1/b;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lcom/bumptech/glide/b;",
        "glide",
        "Lcom/bumptech/glide/h;",
        "registry",
        "Li7/B;",
        "registerComponents",
        "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V",
        "expo-image_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


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
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "glide"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "registry"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1, p2, p3}, LK1/b;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Lexpo/modules/image/svg/SVGDecoder;

    .line 20
    .line 21
    invoke-direct {p2}, Lexpo/modules/image/svg/SVGDecoder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v0, Ljava/io/InputStream;

    .line 25
    .line 26
    const-class v1, LU1/g;

    .line 27
    .line 28
    invoke-virtual {p3, v0, v1, p2}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Ljava/lang/Class;Lv1/j;)Lcom/bumptech/glide/h;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    new-instance p3, Lexpo/modules/image/svg/SVGDrawableTranscoder;

    .line 33
    .line 34
    invoke-direct {p3, p1}, Lexpo/modules/image/svg/SVGDrawableTranscoder;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    const-class p1, Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-virtual {p2, v1, p1, p3}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;LI1/e;)Lcom/bumptech/glide/h;

    .line 40
    .line 41
    .line 42
    return-void
.end method
