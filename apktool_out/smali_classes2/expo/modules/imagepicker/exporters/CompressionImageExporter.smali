.class public final Lexpo/modules/imagepicker/exporters/CompressionImageExporter;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/imagepicker/exporters/ImageExporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lexpo/modules/imagepicker/exporters/CompressionImageExporter;",
        "Lexpo/modules/imagepicker/exporters/ImageExporter;",
        "Lexpo/modules/kotlin/providers/AppContextProvider;",
        "appContextProvider",
        "",
        "quality",
        "<init>",
        "(Lexpo/modules/kotlin/providers/AppContextProvider;D)V",
        "Landroid/net/Uri;",
        "source",
        "Landroid/graphics/Bitmap;",
        "readBitmap",
        "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;",
        "bitmap",
        "Ljava/io/File;",
        "output",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "compressFormat",
        "",
        "writeImage",
        "(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Ln7/f;)Ljava/lang/Object;",
        "Landroid/content/ContentResolver;",
        "contentResolver",
        "Lexpo/modules/imagepicker/exporters/ImageExportResult;",
        "exportAsync",
        "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/kotlin/providers/AppContextProvider;",
        "",
        "compressQuality",
        "I",
        "expo-image-picker_release"
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
.field private final appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

.field private final compressQuality:I


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/providers/AppContextProvider;D)V
    .locals 2

    .line 1
    const-string v0, "appContextProvider"

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
    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    .line 10
    .line 11
    const/16 p1, 0x64

    .line 12
    .line 13
    int-to-double v0, p1

    .line 14
    mul-double/2addr p2, v0

    .line 15
    double-to-int p1, p2

    .line 16
    iput p1, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->compressQuality:I

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->readBitmap$lambda$0(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getCompressQuality$p(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)I
    .locals 0

    .line 1
    iget p0, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->compressQuality:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$readBitmap(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->readBitmap(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$writeImage(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->writeImage(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/io/File;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->writeImage$lambda$2(Ljava/io/File;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final readBitmap(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;-><init>(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p2, Lexpo/modules/imagepicker/exporters/b;

    .line 54
    .line 55
    invoke-direct {p2, p0, p1}, Lexpo/modules/imagepicker/exporters/b;-><init>(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/net/Uri;)V

    .line 56
    .line 57
    .line 58
    iput v3, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$readBitmap$1;->label:I

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    invoke-static {p1, p2, v0, v3, p1}, LR8/x0;->c(Ln7/j;Lw7/a;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-ne p2, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object p2
.end method

.method private static final readBitmap$lambda$0(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget-object p0, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    .line 2
    .line 3
    invoke-interface {p0}, Lexpo/modules/kotlin/providers/AppContextProvider;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lexpo/modules/kotlin/AppContext;->getServices()Lexpo/modules/kotlin/services/ServicesRegistry;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lexpo/modules/kotlin/services/ServicesRegistry;->getRegistry()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-class v0, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;

    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of v0, p0, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :cond_0
    check-cast p0, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "toString(...)"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v0}, Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;->loadImageForManipulationFromURL(Ljava/lang/String;)Ljava/util/concurrent/Future;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    return-object p0

    .line 52
    :catch_0
    move-exception p0

    .line 53
    new-instance v0, Lexpo/modules/imagepicker/FailedToReadFileException;

    .line 54
    .line 55
    invoke-static {p1}, LC0/a;->a(Landroid/net/Uri;)Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {v0, p1, p0}, Lexpo/modules/imagepicker/FailedToReadFileException;-><init>(Ljava/io/File;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_1
    new-instance p0, Lexpo/modules/imagepicker/MissingModuleException;

    .line 64
    .line 65
    const-string p1, "ImageLoader"

    .line 66
    .line 67
    invoke-direct {p0, p1}, Lexpo/modules/imagepicker/MissingModuleException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0
.end method

.method private final writeImage(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Ln7/f;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/io/File;",
            "Landroid/graphics/Bitmap$CompressFormat;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/imagepicker/exporters/a;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1, p3, p0}, Lexpo/modules/imagepicker/exporters/a;-><init>(Ljava/io/File;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, v0, p4, p1, p2}, LR8/x0;->c(Ln7/j;Lw7/a;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method private static final writeImage$lambda$2(Ljava/io/File;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)Z
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :try_start_1
    iget p3, p3, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->compressQuality:I

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 9
    .line 10
    .line 11
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    const/4 p2, 0x0

    .line 13
    :try_start_2
    invoke-static {v0, p2}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 14
    .line 15
    .line 16
    return p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 21
    :catchall_1
    move-exception p2

    .line 22
    :try_start_4
    invoke-static {v0, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw p2
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 26
    :goto_0
    new-instance p2, Lexpo/modules/imagepicker/FailedToWriteFileException;

    .line 27
    .line 28
    invoke-direct {p2, p0, p1}, Lexpo/modules/imagepicker/FailedToWriteFileException;-><init>(Ljava/io/File;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw p2
.end method


# virtual methods
.method public exportAsync(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/io/File;",
            "Landroid/content/ContentResolver;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;-><init>(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v5, :cond_4

    .line 39
    .line 40
    if-eq v2, v4, :cond_3

    .line 41
    .line 42
    if-ne v2, v3, :cond_2

    .line 43
    .line 44
    iget-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$1:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Landroid/graphics/Bitmap;

    .line 47
    .line 48
    iget-object p2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p2, Ljava/io/File;

    .line 51
    .line 52
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    move-object v4, p1

    .line 56
    move-object v3, p2

    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    iget-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$3:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Landroid/graphics/Bitmap;

    .line 70
    .line 71
    iget-object p2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$2:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, Landroid/content/ContentResolver;

    .line 74
    .line 75
    iget-object p3, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p3, Ljava/io/File;

    .line 78
    .line 79
    iget-object v2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Landroid/net/Uri;

    .line 82
    .line 83
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move-object v8, p3

    .line 87
    move-object p3, p2

    .line 88
    move-object p2, v8

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    iget-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$2:Ljava/lang/Object;

    .line 91
    .line 92
    move-object p3, p1

    .line 93
    check-cast p3, Landroid/content/ContentResolver;

    .line 94
    .line 95
    iget-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    move-object p2, p1

    .line 98
    check-cast p2, Ljava/io/File;

    .line 99
    .line 100
    iget-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Landroid/net/Uri;

    .line 103
    .line 104
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iput-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object p2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p3, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$2:Ljava/lang/Object;

    .line 116
    .line 117
    iput v5, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->label:I

    .line 118
    .line 119
    invoke-direct {p0, p1, v0}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->readBitmap(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    if-ne p4, v1, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    :goto_1
    check-cast p4, Landroid/graphics/Bitmap;

    .line 127
    .line 128
    invoke-static {p2}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->toBitmapCompressFormat(Ljava/io/File;)Landroid/graphics/Bitmap$CompressFormat;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iput-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object p2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$1:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object p3, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$2:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object p4, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$3:Ljava/lang/Object;

    .line 139
    .line 140
    iput v4, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->label:I

    .line 141
    .line 142
    invoke-direct {p0, p4, p2, v2, v0}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->writeImage(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Ln7/f;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    if-ne v2, v1, :cond_7

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    move-object v2, p1

    .line 150
    move-object p1, p4

    .line 151
    :goto_2
    iput-object p2, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p1, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$1:Ljava/lang/Object;

    .line 154
    .line 155
    const/4 p4, 0x0

    .line 156
    iput-object p4, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$2:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object p4, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->L$3:Ljava/lang/Object;

    .line 159
    .line 160
    iput v3, v0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$1;->label:I

    .line 161
    .line 162
    invoke-static {v2, p2, p3, v0}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->copyExifData(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    if-ne p3, v1, :cond_1

    .line 167
    .line 168
    :goto_3
    return-object v1

    .line 169
    :goto_4
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    new-instance v2, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2;

    .line 178
    .line 179
    move-object v5, p0

    .line 180
    invoke-direct/range {v2 .. v7}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2;-><init>(Ljava/io/File;Landroid/graphics/Bitmap;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;II)V

    .line 181
    .line 182
    .line 183
    return-object v2
.end method
