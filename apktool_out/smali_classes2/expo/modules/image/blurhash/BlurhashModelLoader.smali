.class public final Lexpo/modules/image/blurhash/BlurhashModelLoader;
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
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JA\u0010\u000f\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J5\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lexpo/modules/image/blurhash/BlurhashModelLoader;",
        "LB1/n;",
        "Lexpo/modules/image/blurhash/BlurhashModel;",
        "Landroid/graphics/Bitmap;",
        "<init>",
        "()V",
        "T",
        "Landroid/net/Uri;",
        "uri",
        "",
        "index",
        "default",
        "Lkotlin/Function1;",
        "",
        "converter",
        "getPath",
        "(Landroid/net/Uri;ILjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "model",
        "",
        "handles",
        "(Lexpo/modules/image/blurhash/BlurhashModel;)Z",
        "width",
        "height",
        "Lv1/h;",
        "options",
        "LB1/n$a;",
        "buildLoadData",
        "(Lexpo/modules/image/blurhash/BlurhashModel;IILv1/h;)LB1/n$a;",
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

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/image/blurhash/BlurhashModelLoader;->buildLoadData$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final buildLoadData$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private final getPath(Landroid/net/Uri;ILjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/net/Uri;",
            "ITT;",
            "Lkotlin/jvm/functions/Function1;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getPathSegments(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lj7/q;->h0(Ljava/util/List;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-object p3

    .line 19
    :cond_0
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method


# virtual methods
.method public buildLoadData(Lexpo/modules/image/blurhash/BlurhashModel;IILv1/h;)LB1/n$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/image/blurhash/BlurhashModel;",
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
    invoke-virtual {p1}, Lexpo/modules/image/blurhash/BlurhashModel;->getUri()Landroid/net/Uri;

    move-result-object p2

    new-instance p3, Lexpo/modules/image/blurhash/a;

    invoke-direct {p3}, Lexpo/modules/image/blurhash/a;-><init>()V

    const/4 p4, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p2, p4, v0, p3}, Lexpo/modules/image/blurhash/BlurhashModelLoader;->getPath(Landroid/net/Uri;ILjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 3
    new-instance p3, LB1/n$a;

    .line 4
    new-instance p4, LP1/c;

    invoke-direct {p4, p1}, LP1/c;-><init>(Ljava/lang/Object;)V

    .line 5
    new-instance v0, Lexpo/modules/image/blurhash/BlurHashFetcher;

    invoke-virtual {p1}, Lexpo/modules/image/blurhash/BlurhashModel;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lexpo/modules/image/blurhash/BlurhashModel;->getHeight()I

    move-result p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, p2, v1, p1, v2}, Lexpo/modules/image/blurhash/BlurHashFetcher;-><init>(Ljava/lang/String;IIF)V

    .line 6
    invoke-direct {p3, p4, v0}, LB1/n$a;-><init>(Lv1/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p3
.end method

.method public bridge synthetic buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/image/blurhash/BlurhashModel;

    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/image/blurhash/BlurhashModelLoader;->buildLoadData(Lexpo/modules/image/blurhash/BlurhashModel;IILv1/h;)LB1/n$a;

    move-result-object p1

    return-object p1
.end method

.method public handles(Lexpo/modules/image/blurhash/BlurhashModel;)Z
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
    check-cast p1, Lexpo/modules/image/blurhash/BlurhashModel;

    invoke-virtual {p0, p1}, Lexpo/modules/image/blurhash/BlurhashModelLoader;->handles(Lexpo/modules/image/blurhash/BlurhashModel;)Z

    move-result p1

    return p1
.end method
