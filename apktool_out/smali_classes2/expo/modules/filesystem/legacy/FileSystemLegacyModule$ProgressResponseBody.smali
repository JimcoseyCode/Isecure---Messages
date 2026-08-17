.class final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;
.super Le9/E;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ProgressResponseBody"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0008\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0011R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;",
        "Le9/E;",
        "responseBody",
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;",
        "progressListener",
        "<init>",
        "(Le9/E;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;)V",
        "Lt9/F;",
        "source",
        "(Lt9/F;)Lt9/F;",
        "Le9/x;",
        "contentType",
        "()Le9/x;",
        "",
        "contentLength",
        "()J",
        "Lt9/j;",
        "()Lt9/j;",
        "Le9/E;",
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;",
        "bufferedSource",
        "Lt9/j;",
        "expo-file-system_release"
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
.field private bufferedSource:Lt9/j;

.field private final progressListener:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

.field private final responseBody:Le9/E;


# direct methods
.method public constructor <init>(Le9/E;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;)V
    .locals 1

    .line 1
    const-string v0, "progressListener"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Le9/E;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Le9/E;

    .line 10
    .line 11
    iput-object p2, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->progressListener:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic access$getProgressListener$p(Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;)Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->progressListener:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getResponseBody$p(Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;)Le9/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Le9/E;

    .line 2
    .line 3
    return-object p0
.end method

.method private final source(Lt9/F;)Lt9/F;
    .locals 1

    .line 2
    new-instance v0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody$source$1;

    invoke-direct {v0, p1, p0}, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody$source$1;-><init>(Lt9/F;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;)V

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Le9/E;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Le9/E;->contentLength()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Le9/E;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Le9/E;->contentType()Le9/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public source()Lt9/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->bufferedSource:Lt9/j;

    if-nez v0, :cond_0

    iget-object v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->responseBody:Le9/E;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le9/E;->source()Lt9/j;

    move-result-object v0

    invoke-direct {p0, v0}, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;->source(Lt9/F;)Lt9/F;

    move-result-object v0

    invoke-static {v0}, Lt9/s;->d(Lt9/F;)Lt9/j;

    move-result-object v0

    :cond_0
    return-object v0
.end method
