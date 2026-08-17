.class public final Lexpo/modules/image/thumbhash/ThumbhashModelLoader;
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
        "Lexpo/modules/image/thumbhash/ThumbhashModelLoader;",
        "LB1/n;",
        "Lexpo/modules/image/thumbhash/ThumbhashModel;",
        "Landroid/graphics/Bitmap;",
        "<init>",
        "()V",
        "model",
        "",
        "handles",
        "(Lexpo/modules/image/thumbhash/ThumbhashModel;)Z",
        "",
        "width",
        "height",
        "Lv1/h;",
        "options",
        "LB1/n$a;",
        "buildLoadData",
        "(Lexpo/modules/image/thumbhash/ThumbhashModel;IILv1/h;)LB1/n$a;",
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
.method public buildLoadData(Lexpo/modules/image/thumbhash/ThumbhashModel;IILv1/h;)LB1/n$a;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/image/thumbhash/ThumbhashModel;",
            "II",
            "Lv1/h;",
            ")",
            "LB1/n$a;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "model"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "options"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lexpo/modules/image/thumbhash/ThumbhashModel;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    const-string v1, "getPathSegments(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const-string v3, "/"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lj7/q;->o0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "\\"

    const-string v13, "/"

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, LP8/q;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, LB1/n$a;

    .line 4
    new-instance v3, LP1/c;

    invoke-direct {v3, v0}, LP1/c;-><init>(Ljava/lang/Object;)V

    .line 5
    new-instance v0, Lexpo/modules/image/thumbhash/ThumbhashFetcher;

    invoke-direct {v0, v1}, Lexpo/modules/image/thumbhash/ThumbhashFetcher;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-direct {v2, v3, v0}, LB1/n$a;-><init>(Lv1/f;Lcom/bumptech/glide/load/data/d;)V

    return-object v2
.end method

.method public bridge synthetic buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/image/thumbhash/ThumbhashModel;

    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/image/thumbhash/ThumbhashModelLoader;->buildLoadData(Lexpo/modules/image/thumbhash/ThumbhashModel;IILv1/h;)LB1/n$a;

    move-result-object p1

    return-object p1
.end method

.method public handles(Lexpo/modules/image/thumbhash/ThumbhashModel;)Z
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
    check-cast p1, Lexpo/modules/image/thumbhash/ThumbhashModel;

    invoke-virtual {p0, p1}, Lexpo/modules/image/thumbhash/ThumbhashModelLoader;->handles(Lexpo/modules/image/thumbhash/ThumbhashModel;)Z

    move-result p1

    return p1
.end method
