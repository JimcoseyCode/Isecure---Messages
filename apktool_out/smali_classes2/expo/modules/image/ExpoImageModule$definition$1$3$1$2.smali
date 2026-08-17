.class public final Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LM1/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/ExpoImageModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LM1/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J9\u0010\u000b\u001a\u00020\t2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ=\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "expo/modules/image/ExpoImageModule$definition$1$3$1$2",
        "LM1/e;",
        "Landroid/graphics/drawable/Drawable;",
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
.field final synthetic $failed:Lkotlin/jvm/internal/z;

.field final synthetic $imagesLoaded:Lkotlin/jvm/internal/A;

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic $urls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/z;Lexpo/modules/kotlin/Promise;Lkotlin/jvm/internal/A;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/z;",
            "Lexpo/modules/kotlin/Promise;",
            "Lkotlin/jvm/internal/A;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$failed:Lkotlin/jvm/internal/z;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$promise:Lexpo/modules/kotlin/Promise;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$imagesLoaded:Lkotlin/jvm/internal/A;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$urls:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
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
    const-string p1, "target"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$failed:Lkotlin/jvm/internal/z;

    .line 7
    .line 8
    iget-boolean p2, p1, Lkotlin/jvm/internal/z;->g:Z

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    iput-boolean p3, p1, Lkotlin/jvm/internal/z;->g:Z

    .line 14
    .line 15
    iget-object p1, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$promise:Lexpo/modules/kotlin/Promise;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-interface {p1, p2}, Lexpo/modules/kotlin/Promise;->resolve(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return p3
.end method

.method public onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z
    .locals 0
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

    const-string p5, "resource"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "model"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dataSource"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$imagesLoaded:Lkotlin/jvm/internal/A;

    iget p2, p1, Lkotlin/jvm/internal/A;->g:I

    const/4 p3, 0x1

    add-int/2addr p2, p3

    iput p2, p1, Lkotlin/jvm/internal/A;->g:I

    .line 3
    iget-object p1, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$urls:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne p2, p1, :cond_0

    .line 4
    iget-object p1, p0, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->$promise:Lexpo/modules/kotlin/Promise;

    invoke-interface {p1, p3}, Lexpo/modules/kotlin/Promise;->resolve(Z)V

    :cond_0
    return p3
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;LN1/d;Lv1/a;Z)Z

    move-result p1

    return p1
.end method
