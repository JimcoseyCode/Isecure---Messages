.class public final Lexpo/modules/medialibrary/next/extensions/ContextExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a6\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroid/content/Context;",
        "",
        "path",
        "mimeType",
        "Lkotlin/Pair;",
        "Landroid/net/Uri;",
        "scanFile",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "expo-media-library_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final scanFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ln7/l;

    .line 2
    .line 3
    invoke-static {p3}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ln7/l;-><init>(Ln7/f;)V

    .line 8
    .line 9
    .line 10
    filled-new-array {p1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    filled-new-array {p2}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    new-instance v1, Lexpo/modules/medialibrary/next/extensions/ContextExtensionsKt$scanFile$2$1;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lexpo/modules/medialibrary/next/extensions/ContextExtensionsKt$scanFile$2$1;-><init>(Ln7/f;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1, p2, v1}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ln7/l;->a()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-ne p0, p1, :cond_0

    .line 35
    .line 36
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object p0
.end method

.method public static synthetic scanFile$default(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/medialibrary/next/extensions/ContextExtensionsKt;->scanFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
