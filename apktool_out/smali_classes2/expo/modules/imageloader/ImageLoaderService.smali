.class public final Lexpo/modules/imageloader/ImageLoaderService;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;


# annotations
.annotation runtime Lexpo/modules/kotlin/services/ServiceInterface;
    clazz = Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u000c\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/imageloader/ImageLoaderService;",
        "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "url",
        "normalizeAssetsUrl",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Ljava/util/concurrent/Future;",
        "Landroid/graphics/Bitmap;",
        "loadImageForDisplayFromURL",
        "(Ljava/lang/String;)Ljava/util/concurrent/Future;",
        "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;",
        "resultListener",
        "Li7/B;",
        "(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V",
        "loadImageForManipulationFromURL",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "expo-image-loader_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/imageloader/ImageLoaderService;->context:Landroid/content/Context;

    .line 10
    .line 11
    return-void
.end method

.method private final normalizeAssetsUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "asset:///"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {p1, v2, v3, v0, v1}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "/"

    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v5, 0x6

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v1, p1

    .line 23
    invoke-static/range {v1 .. v6}, LP8/q;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lj7/q;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v1, "file:///android_asset/"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_0
    move-object v1, p1

    .line 50
    return-object v1
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/imageloader/ImageLoaderService;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadImageForDisplayFromURL(Ljava/lang/String;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/imageloader/SimpleSettableFuture;

    invoke-direct {v0}, Lexpo/modules/imageloader/SimpleSettableFuture;-><init>()V

    .line 2
    new-instance v1, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$1;

    invoke-direct {v1, v0}, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$1;-><init>(Lexpo/modules/imageloader/SimpleSettableFuture;)V

    .line 3
    invoke-virtual {p0, p1, v1}, Lexpo/modules/imageloader/ImageLoaderService;->loadImageForDisplayFromURL(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V

    return-object v0
.end method

.method public loadImageForDisplayFromURL(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lexpo/modules/imageloader/ImageLoaderService;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/b;->v(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/bumptech/glide/k;->b()Lcom/bumptech/glide/j;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->y0(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object p1

    .line 7
    new-instance v0, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2;

    invoke-direct {v0, p2}, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2;-><init>(Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->q0(LN1/d;)LN1/d;

    return-void
.end method

.method public loadImageForManipulationFromURL(Ljava/lang/String;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/imageloader/SimpleSettableFuture;

    invoke-direct {v0}, Lexpo/modules/imageloader/SimpleSettableFuture;-><init>()V

    .line 2
    new-instance v1, Lexpo/modules/imageloader/ImageLoaderService$loadImageForManipulationFromURL$1;

    invoke-direct {v1, v0}, Lexpo/modules/imageloader/ImageLoaderService$loadImageForManipulationFromURL$1;-><init>(Lexpo/modules/imageloader/SimpleSettableFuture;)V

    .line 3
    invoke-virtual {p0, p1, v1}, Lexpo/modules/imageloader/ImageLoaderService;->loadImageForManipulationFromURL(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V

    return-object v0
.end method

.method public loadImageForManipulationFromURL(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V
    .locals 2

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1}, Lexpo/modules/imageloader/ImageLoaderService;->normalizeAssetsUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lexpo/modules/imageloader/ImageLoaderService;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/b;->v(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/bumptech/glide/k;->b()Lcom/bumptech/glide/j;

    move-result-object v0

    .line 7
    sget-object v1, Lx1/j;->b:Lx1/j;

    invoke-virtual {v0, v1}, LM1/a;->g(Lx1/j;)LM1/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, LM1/a;->a0(Z)LM1/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    .line 9
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->y0(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object p1

    .line 10
    new-instance v0, Lexpo/modules/imageloader/ImageLoaderService$loadImageForManipulationFromURL$2;

    invoke-direct {v0, p2}, Lexpo/modules/imageloader/ImageLoaderService$loadImageForManipulationFromURL$2;-><init>(Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->q0(LN1/d;)LN1/d;

    return-void
.end method
