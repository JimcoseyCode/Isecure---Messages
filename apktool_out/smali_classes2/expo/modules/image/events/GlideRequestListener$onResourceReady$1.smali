.class final Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/events/GlideRequestListener;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.image.events.GlideRequestListener$onResourceReady$1"
    f = "GlideRequestListener.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $dataSource:Lv1/a;

.field final synthetic $imageWrapper:Lexpo/modules/image/ExpoImageViewWrapper;

.field final synthetic $intrinsicHeight:I

.field final synthetic $intrinsicWidth:I

.field final synthetic $model:Ljava/lang/Object;

.field final synthetic $resource:Landroid/graphics/drawable/Drawable;

.field label:I


# direct methods
.method constructor <init>(Lexpo/modules/image/ExpoImageViewWrapper;Lv1/a;Ljava/lang/Object;IILandroid/graphics/drawable/Drawable;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/image/ExpoImageViewWrapper;",
            "Lv1/a;",
            "Ljava/lang/Object;",
            "II",
            "Landroid/graphics/drawable/Drawable;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$imageWrapper:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$dataSource:Lv1/a;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$model:Ljava/lang/Object;

    .line 6
    .line 7
    iput p4, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$intrinsicWidth:I

    .line 8
    .line 9
    iput p5, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$intrinsicHeight:I

    .line 10
    .line 11
    iput-object p6, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$resource:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$imageWrapper:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$dataSource:Lv1/a;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$model:Ljava/lang/Object;

    .line 8
    .line 9
    iget v4, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$intrinsicWidth:I

    .line 10
    .line 11
    iget v5, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$intrinsicHeight:I

    .line 12
    .line 13
    iget-object v6, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$resource:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;-><init>(Lexpo/modules/image/ExpoImageViewWrapper;Lv1/a;Ljava/lang/Object;IILandroid/graphics/drawable/Drawable;Ln7/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$imageWrapper:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/image/ExpoImageViewWrapper;->getOnLoad$expo_image_release()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lexpo/modules/image/records/ImageLoadEvent;

    .line 18
    .line 19
    sget-object v1, Lexpo/modules/image/enums/ImageCacheType;->Companion:Lexpo/modules/image/enums/ImageCacheType$Companion;

    .line 20
    .line 21
    iget-object v2, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$dataSource:Lv1/a;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lexpo/modules/image/enums/ImageCacheType$Companion;->fromNativeValue(Lv1/a;)Lexpo/modules/image/enums/ImageCacheType;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "getDefault(...)"

    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "toLowerCase(...)"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lexpo/modules/image/records/ImageSource;

    .line 50
    .line 51
    iget-object v2, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$model:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget v5, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$intrinsicWidth:I

    .line 58
    .line 59
    iget v6, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$intrinsicHeight:I

    .line 60
    .line 61
    iget-object v2, p0, Lexpo/modules/image/events/GlideRequestListener$onResourceReady$1;->$resource:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    instance-of v8, v2, Landroid/graphics/drawable/Animatable;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-direct/range {v3 .. v8}, Lexpo/modules/image/records/ImageSource;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1, v3}, Lexpo/modules/image/records/ImageLoadEvent;-><init>(Ljava/lang/String;Lexpo/modules/image/records/ImageSource;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p1, Li7/B;->a:Li7/B;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
.end method
