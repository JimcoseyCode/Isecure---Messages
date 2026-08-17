.class public final Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/okhttp/GlideUrlWrapperLoader$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LB1/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J7\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;",
        "LB1/n;",
        "Lexpo/modules/image/okhttp/GlideUrlWrapper;",
        "Ljava/io/InputStream;",
        "Le9/z;",
        "commonClient",
        "<init>",
        "(Le9/z;)V",
        "model",
        "",
        "width",
        "height",
        "Lv1/h;",
        "options",
        "LB1/n$a;",
        "buildLoadData",
        "(Lexpo/modules/image/okhttp/GlideUrlWrapper;IILv1/h;)LB1/n$a;",
        "",
        "handles",
        "(Lexpo/modules/image/okhttp/GlideUrlWrapper;)Z",
        "Le9/z;",
        "Factory",
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
.field private final commonClient:Le9/z;


# direct methods
.method public constructor <init>(Le9/z;)V
    .locals 1

    .line 1
    const-string v0, "commonClient"

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
    iput-object p1, p0, Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;->commonClient:Le9/z;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lexpo/modules/image/okhttp/GlideUrlWrapper;JJZ)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;->buildLoadData$lambda$1$lambda$0(Lexpo/modules/image/okhttp/GlideUrlWrapper;JJZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lexpo/modules/image/okhttp/GlideUrlWrapper;Le9/v$a;)Le9/D;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;->buildLoadData$lambda$1(Lexpo/modules/image/okhttp/GlideUrlWrapper;Le9/v$a;)Le9/D;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final buildLoadData$lambda$1(Lexpo/modules/image/okhttp/GlideUrlWrapper;Le9/v$a;)Le9/D;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Le9/v$a;->d()Le9/B;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Le9/v$a;->a(Le9/B;)Le9/D;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Le9/D;->u0()Le9/D$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 19
    .line 20
    invoke-virtual {p1}, Le9/D;->r()Le9/E;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance v2, Lexpo/modules/image/okhttp/b;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Lexpo/modules/image/okhttp/b;-><init>(Lexpo/modules/image/okhttp/GlideUrlWrapper;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p1, v2}, Lcom/facebook/react/modules/network/ProgressResponseBody;-><init>(Le9/E;Lcom/facebook/react/modules/network/ProgressListener;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Le9/D$a;->b(Le9/E;)Le9/D$a;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Le9/D$a;->c()Le9/D;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p1, "Required value was null."

    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method private static final buildLoadData$lambda$1$lambda$0(Lexpo/modules/image/okhttp/GlideUrlWrapper;JJZ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lexpo/modules/image/okhttp/GlideUrlWrapper;->getProgressListener()Lexpo/modules/image/events/OkHttpProgressListener;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p5}, Lexpo/modules/image/events/OkHttpProgressListener;->onProgress(JJZ)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public buildLoadData(Lexpo/modules/image/okhttp/GlideUrlWrapper;IILv1/h;)LB1/n$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/image/okhttp/GlideUrlWrapper;",
            "II",
            "Lv1/h;",
            ")",
            "LB1/n$a;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/bumptech/glide/integration/okhttp3/a;

    .line 3
    iget-object v1, p0, Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;->commonClient:Le9/z;

    .line 4
    invoke-virtual {v1}, Le9/z;->C()Le9/z$a;

    move-result-object v1

    .line 5
    new-instance v2, Lexpo/modules/image/okhttp/a;

    invoke-direct {v2, p1}, Lexpo/modules/image/okhttp/a;-><init>(Lexpo/modules/image/okhttp/GlideUrlWrapper;)V

    invoke-virtual {v1, v2}, Le9/z$a;->a(Le9/v;)Le9/z$a;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Le9/z$a;->c()Le9/z;

    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/bumptech/glide/integration/okhttp3/a;-><init>(Le9/e$a;)V

    .line 8
    invoke-virtual {p1}, Lexpo/modules/image/okhttp/GlideUrlWrapper;->getGlideUrl()LB1/h;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/bumptech/glide/integration/okhttp3/a;->a(LB1/h;IILv1/h;)LB1/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/image/okhttp/GlideUrlWrapper;

    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;->buildLoadData(Lexpo/modules/image/okhttp/GlideUrlWrapper;IILv1/h;)LB1/n$a;

    move-result-object p1

    return-object p1
.end method

.method public handles(Lexpo/modules/image/okhttp/GlideUrlWrapper;)Z
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
    check-cast p1, Lexpo/modules/image/okhttp/GlideUrlWrapper;

    invoke-virtual {p0, p1}, Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;->handles(Lexpo/modules/image/okhttp/GlideUrlWrapper;)Z

    move-result p1

    return p1
.end method
