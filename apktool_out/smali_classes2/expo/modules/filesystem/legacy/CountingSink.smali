.class final Lexpo/modules/filesystem/legacy/CountingSink;
.super Lt9/m;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lexpo/modules/filesystem/legacy/CountingSink;",
        "Lt9/m;",
        "Lt9/D;",
        "sink",
        "Le9/C;",
        "requestBody",
        "Lexpo/modules/filesystem/legacy/CountingRequestListener;",
        "progressListener",
        "<init>",
        "(Lt9/D;Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V",
        "Lt9/h;",
        "source",
        "",
        "byteCount",
        "Li7/B;",
        "write",
        "(Lt9/h;J)V",
        "Le9/C;",
        "Lexpo/modules/filesystem/legacy/CountingRequestListener;",
        "bytesWritten",
        "J",
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
.field private bytesWritten:J

.field private final progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

.field private final requestBody:Le9/C;


# direct methods
.method public constructor <init>(Lt9/D;Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requestBody"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "progressListener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lt9/m;-><init>(Lt9/D;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lexpo/modules/filesystem/legacy/CountingSink;->requestBody:Le9/C;

    .line 20
    .line 21
    iput-object p3, p0, Lexpo/modules/filesystem/legacy/CountingSink;->progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public write(Lt9/h;J)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lt9/m;->write(Lt9/h;J)V

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, Lexpo/modules/filesystem/legacy/CountingSink;->bytesWritten:J

    .line 10
    .line 11
    add-long/2addr v0, p2

    .line 12
    iput-wide v0, p0, Lexpo/modules/filesystem/legacy/CountingSink;->bytesWritten:J

    .line 13
    .line 14
    iget-object p1, p0, Lexpo/modules/filesystem/legacy/CountingSink;->progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    .line 15
    .line 16
    iget-object p2, p0, Lexpo/modules/filesystem/legacy/CountingSink;->requestBody:Le9/C;

    .line 17
    .line 18
    invoke-virtual {p2}, Le9/C;->contentLength()J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    invoke-interface {p1, v0, v1, p2, p3}, Lexpo/modules/filesystem/legacy/CountingRequestListener;->onProgress(JJ)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
