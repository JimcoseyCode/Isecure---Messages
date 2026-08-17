.class public final Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2;
.super LN1/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/imageloader/ImageLoaderService;->loadImageForDisplayFromURL(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LN1/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\u000c\u0012\u0006\u0008\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "expo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2",
        "LN1/a;",
        "Landroid/graphics/Bitmap;",
        "resource",
        "LO1/b;",
        "transition",
        "Li7/B;",
        "onResourceReady",
        "(Landroid/graphics/Bitmap;LO1/b;)V",
        "Landroid/graphics/drawable/Drawable;",
        "placeholder",
        "onLoadCleared",
        "(Landroid/graphics/drawable/Drawable;)V",
        "errorDrawable",
        "onLoadFailed",
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
.field final synthetic $resultListener:Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;


# direct methods
.method constructor <init>(Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2;->$resultListener:Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;

    .line 2
    .line 3
    invoke-direct {p0}, LN1/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onLoadCleared(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onLoadFailed(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, LN1/a;->onLoadFailed(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2;->$resultListener:Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/Exception;

    .line 7
    .line 8
    const-string v1, "Loading bitmap failed"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;->onFailure(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onResourceReady(Landroid/graphics/Bitmap;LO1/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "LO1/b;",
            ")V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2;->$resultListener:Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;

    invoke-interface {p2, p1}, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;->onSuccess(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;LO1/b;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/imageloader/ImageLoaderService$loadImageForDisplayFromURL$2;->onResourceReady(Landroid/graphics/Bitmap;LO1/b;)V

    return-void
.end method
