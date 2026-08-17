.class public final Lexpo/modules/image/events/GlideRequestListener;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LM1/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LM1/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J9\u0010\u0010\u001a\u00020\u000e2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J=\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/image/events/GlideRequestListener;",
        "LM1/e;",
        "Landroid/graphics/drawable/Drawable;",
        "Ljava/lang/ref/WeakReference;",
        "Lexpo/modules/image/ExpoImageViewWrapper;",
        "expoImageViewWrapper",
        "<init>",
        "(Ljava/lang/ref/WeakReference;)V",
        "Lx1/q;",
        "e",
        "",
        "model",
        "LN1/d;",
        "target",
        "",
        "isFirstResource",
        "onLoadFailed",
        "(Lx1/q;Ljava/lang/Object;LN1/d;Z)Z",
        "resource",
        "Lv1/a;",
        "dataSource",
        "onResourceReady",
        "(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z",
        "Ljava/lang/ref/WeakReference;",
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


# instance fields
.field private final expoImageViewWrapper:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/image/ExpoImageViewWrapper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/image/ExpoImageViewWrapper;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "expoImageViewWrapper"

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
    iput-object p1, p0, Lexpo/modules/image/events/GlideRequestListener;->expoImageViewWrapper:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onLoadFailed(Lx1/q;Ljava/lang/Object;LN1/d;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/q;",
            "Ljava/lang/Object;",
            "LN1/d;",
            "Z)Z"
        }
    .end annotation

    .line 1
    const-string p2, "target"

    .line 2
    .line 3
    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lx1/q;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const-string p3, "\n call GlideException#logRootCauses(String) for more detail"

    .line 15
    .line 16
    invoke-static {p2, p3}, LP8/q;->x0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p2, "Unknown error"

    .line 24
    .line 25
    :goto_0
    iget-object p3, p0, Lexpo/modules/image/events/GlideRequestListener;->expoImageViewWrapper:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    check-cast p3, Lexpo/modules/image/ExpoImageViewWrapper;

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    invoke-virtual {p3}, Lexpo/modules/image/ExpoImageViewWrapper;->getOnError$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    new-instance p4, Lexpo/modules/image/records/ImageErrorEvent;

    .line 42
    .line 43
    invoke-direct {p4, p2}, Lexpo/modules/image/records/ImageErrorEvent;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p3, p4}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    if-eqz p1, :cond_2

    .line 50
    .line 51
    const-string p2, "ExpoImage"

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lx1/q;->g(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method public onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Object;",
            "LN1/d;",
            "Lv1/a;",
            "Z)Z"
        }
    .end annotation

    move-object/from16 v6, p1

    const-string v0, "resource"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSource"

    move-object/from16 v2, p4

    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, v6, Lexpo/modules/image/svg/SVGPictureDrawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v4, v6

    check-cast v4, Lexpo/modules/image/svg/SVGPictureDrawable;

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lexpo/modules/image/svg/SVGPictureDrawable;->getSvgIntrinsicWidth()I

    move-result v4

    goto :goto_1

    .line 3
    :cond_1
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    :goto_1
    if-eqz v0, :cond_2

    .line 4
    move-object v1, v6

    check-cast v1, Lexpo/modules/image/svg/SVGPictureDrawable;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lexpo/modules/image/svg/SVGPictureDrawable;->getSvgIntrinsicHeight()I

    move-result v0

    :goto_2
    move-object/from16 v8, p0

    move v5, v0

    goto :goto_3

    .line 5
    :cond_3
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    goto :goto_2

    .line 6
    :goto_3
    iget-object v0, v8, Lexpo/modules/image/events/GlideRequestListener;->expoImageViewWrapper:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lexpo/modules/image/ExpoImageViewWrapper;

    const/4 v9, 0x0

    if-nez v1, :cond_4

    return v9

    .line 7
    :cond_4
    invoke-virtual {v1}, Lexpo/modules/kotlin/views/ExpoView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getMainQueue()LR8/N;

    move-result-object v10

    new-instance v13, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;

    const/4 v7, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v7}, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;-><init>(Lexpo/modules/image/ExpoImageViewWrapper;Lv1/a;Ljava/lang/Object;IILandroid/graphics/drawable/Drawable;Ln7/f;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    return v9
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lexpo/modules/image/events/GlideRequestListener;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z

    move-result p1

    return p1
.end method
