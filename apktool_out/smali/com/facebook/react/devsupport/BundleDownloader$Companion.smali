.class public final Lcom/facebook/react/devsupport/BundleDownloader$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/BundleDownloader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/BundleDownloader$Companion;",
        "",
        "<init>",
        "()V",
        "Lt9/j;",
        "body",
        "Ljava/io/File;",
        "outputFile",
        "",
        "storePlainJSInFile",
        "(Lt9/j;Ljava/io/File;)Z",
        "",
        "url",
        "Le9/t;",
        "headers",
        "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;",
        "bundleInfo",
        "Li7/B;",
        "populateBundleInfo",
        "(Ljava/lang/String;Le9/t;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V",
        "TAG",
        "Ljava/lang/String;",
        "",
        "FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER",
        "I",
        "ReactAndroid_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/BundleDownloader$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$populateBundleInfo(Lcom/facebook/react/devsupport/BundleDownloader$Companion;Ljava/lang/String;Le9/t;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/BundleDownloader$Companion;->populateBundleInfo(Ljava/lang/String;Le9/t;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$storePlainJSInFile(Lcom/facebook/react/devsupport/BundleDownloader$Companion;Lt9/j;Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/BundleDownloader$Companion;->storePlainJSInFile(Lt9/j;Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final populateBundleInfo(Ljava/lang/String;Le9/t;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p1}, Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;->set_url$ReactAndroid_release(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "X-Metro-Files-Changed-Count"

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Le9/t;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p3, p1}, Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;->setFilesChangedCount$ReactAndroid_release(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception p1

    .line 21
    const/4 p2, -0x2

    .line 22
    invoke-virtual {p3, p2}, Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;->setFilesChangedCount$ReactAndroid_release(I)V

    .line 23
    .line 24
    .line 25
    const-string p2, "BundleDownloader"

    .line 26
    .line 27
    const-string p3, "Can\'t populate bundle info: "

    .line 28
    .line 29
    invoke-static {p2, p3, p1}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private final storePlainJSInFile(Lt9/j;Ljava/io/File;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lt9/c;->a()Lt9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Lt9/b;->c(Ljava/io/File;)Lt9/D;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :try_start_0
    invoke-interface {p1, p2}, Lt9/j;->r0(Lt9/D;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p2, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :catchall_1
    move-exception v0

    .line 21
    invoke-static {p2, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method
