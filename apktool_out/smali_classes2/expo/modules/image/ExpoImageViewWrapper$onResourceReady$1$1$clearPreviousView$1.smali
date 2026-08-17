.class final Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/ExpoImageViewWrapper;->onResourceReady(Lexpo/modules/image/ImageViewWrapperTarget;Landroid/graphics/drawable/Drawable;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $previousView:Lexpo/modules/image/ExpoImageView;

.field final synthetic $target:Lexpo/modules/image/ImageViewWrapperTarget;

.field final synthetic this$0:Lexpo/modules/image/ExpoImageViewWrapper;


# direct methods
.method constructor <init>(Lexpo/modules/image/ExpoImageView;Lexpo/modules/image/ImageViewWrapperTarget;Lexpo/modules/image/ExpoImageViewWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;->$previousView:Lexpo/modules/image/ExpoImageView;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;->$target:Lexpo/modules/image/ImageViewWrapperTarget;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;->this$0:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Lexpo/modules/image/ImageViewWrapperTarget;
    .locals 3

    .line 2
    iget-object v0, p0, Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;->$previousView:Lexpo/modules/image/ExpoImageView;

    .line 3
    invoke-virtual {v0}, Lexpo/modules/image/ExpoImageView;->recycleView()Lexpo/modules/image/ImageViewWrapperTarget;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;->$target:Lexpo/modules/image/ImageViewWrapperTarget;

    iget-object v2, p0, Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;->this$0:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-virtual {v2}, Lexpo/modules/image/ExpoImageViewWrapper;->getRequestManager$expo_image_release()Lcom/bumptech/glide/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/image/ImageViewWrapperTarget;->clear(Lcom/bumptech/glide/k;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/image/ExpoImageViewWrapper$onResourceReady$1$1$clearPreviousView$1;->invoke()Lexpo/modules/image/ImageViewWrapperTarget;

    move-result-object v0

    return-object v0
.end method
