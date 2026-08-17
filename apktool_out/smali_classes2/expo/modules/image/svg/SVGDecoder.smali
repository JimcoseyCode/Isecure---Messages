.class public final Lexpo/modules/image/svg/SVGDecoder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv1/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv1/j;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ7\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/image/svg/SVGDecoder;",
        "Lv1/j;",
        "Ljava/io/InputStream;",
        "LU1/g;",
        "<init>",
        "()V",
        "source",
        "Lv1/h;",
        "options",
        "",
        "handles",
        "(Ljava/io/InputStream;Lv1/h;)Z",
        "",
        "width",
        "height",
        "Lx1/v;",
        "decode",
        "(Ljava/io/InputStream;IILv1/h;)Lx1/v;",
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
.method public decode(Ljava/io/InputStream;IILv1/h;)Lx1/v;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II",
            "Lv1/h;",
            ")",
            "Lx1/v;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-static {p1}, LU1/g;->l(Ljava/io/InputStream;)LU1/g;

    move-result-object p1

    const-string p4, "getFromInputStream(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, LU1/g;->g()Landroid/graphics/RectF;

    move-result-object p4

    if-nez p4, :cond_2

    .line 4
    invoke-virtual {p1}, LU1/g;->h()F

    move-result p4

    .line 5
    invoke-virtual {p1}, LU1/g;->f()F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v2, p4, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v1, v0, v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v1, v1, p4, v0}, LU1/g;->u(FFFF)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    int-to-float p2, p2

    .line 7
    invoke-virtual {p1, p2}, LU1/g;->v(F)V

    int-to-float p2, p3

    .line 8
    invoke-virtual {p1, p2}, LU1/g;->t(F)V

    .line 9
    new-instance p2, LD1/m;

    invoke-direct {p2, p1}, LD1/m;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch LU1/j; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    .line 10
    :goto_1
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Cannot load SVG from stream"

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public bridge synthetic decode(Ljava/lang/Object;IILv1/h;)Lx1/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/image/svg/SVGDecoder;->decode(Ljava/io/InputStream;IILv1/h;)Lx1/v;

    move-result-object p1

    return-object p1
.end method

.method public handles(Ljava/io/InputStream;Lv1/h;)Z
    .locals 1

    .line 1
    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "options"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;Lv1/h;)Z
    .locals 0

    .line 2
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/image/svg/SVGDecoder;->handles(Ljava/io/InputStream;Lv1/h;)Z

    move-result p1

    return p1
.end method
