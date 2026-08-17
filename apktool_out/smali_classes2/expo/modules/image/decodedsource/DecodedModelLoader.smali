.class public final Lexpo/modules/image/decodedsource/DecodedModelLoader;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LB1/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ5\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/image/decodedsource/DecodedModelLoader;",
        "LB1/n;",
        "Lexpo/modules/image/decodedsource/DecodedModel;",
        "Landroid/graphics/drawable/Drawable;",
        "<init>",
        "()V",
        "model",
        "",
        "handles",
        "(Lexpo/modules/image/decodedsource/DecodedModel;)Z",
        "",
        "width",
        "height",
        "Lv1/h;",
        "options",
        "LB1/n$a;",
        "buildLoadData",
        "(Lexpo/modules/image/decodedsource/DecodedModel;IILv1/h;)LB1/n$a;",
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public buildLoadData(Lexpo/modules/image/decodedsource/DecodedModel;IILv1/h;)LB1/n$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/image/decodedsource/DecodedModel;",
            "II",
            "Lv1/h;",
            ")",
            "LB1/n$a;"
        }
    .end annotation

    const-string p2, "model"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "options"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, LB1/n$a;

    new-instance p3, LP1/c;

    invoke-direct {p3, p1}, LP1/c;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lexpo/modules/image/decodedsource/DecodedFetcher;

    invoke-virtual {p1}, Lexpo/modules/image/decodedsource/DecodedModel;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {p4, p1}, Lexpo/modules/image/decodedsource/DecodedFetcher;-><init>(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p2, p3, p4}, LB1/n$a;-><init>(Lv1/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public bridge synthetic buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/image/decodedsource/DecodedModel;

    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/image/decodedsource/DecodedModelLoader;->buildLoadData(Lexpo/modules/image/decodedsource/DecodedModel;IILv1/h;)LB1/n$a;

    move-result-object p1

    return-object p1
.end method

.method public handles(Lexpo/modules/image/decodedsource/DecodedModel;)Z
    .locals 1

    .line 1
    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Lexpo/modules/image/decodedsource/DecodedModel;

    invoke-virtual {p0, p1}, Lexpo/modules/image/decodedsource/DecodedModelLoader;->handles(Lexpo/modules/image/decodedsource/DecodedModel;)Z

    move-result p1

    return p1
.end method
