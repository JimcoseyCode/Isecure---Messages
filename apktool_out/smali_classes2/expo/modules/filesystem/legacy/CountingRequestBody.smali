.class public final Lexpo/modules/filesystem/legacy/CountingRequestBody;
.super Le9/C;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/filesystem/legacy/CountingRequestBody;",
        "Le9/C;",
        "requestBody",
        "Lexpo/modules/filesystem/legacy/CountingRequestListener;",
        "progressListener",
        "<init>",
        "(Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V",
        "Le9/x;",
        "contentType",
        "()Le9/x;",
        "",
        "contentLength",
        "()J",
        "Lt9/i;",
        "sink",
        "Li7/B;",
        "writeTo",
        "(Lt9/i;)V",
        "Le9/C;",
        "Lexpo/modules/filesystem/legacy/CountingRequestListener;",
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
.field private final progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

.field private final requestBody:Le9/C;


# direct methods
.method public constructor <init>(Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V
    .locals 1

    .line 1
    const-string v0, "requestBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "progressListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Le9/C;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/filesystem/legacy/CountingRequestBody;->requestBody:Le9/C;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/filesystem/legacy/CountingRequestBody;->progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/CountingRequestBody;->requestBody:Le9/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/C;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/CountingRequestBody;->requestBody:Le9/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/C;->contentType()Le9/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public writeTo(Lt9/i;)V
    .locals 2

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/filesystem/legacy/CountingSink;

    .line 7
    .line 8
    iget-object v1, p0, Lexpo/modules/filesystem/legacy/CountingRequestBody;->progressListener:Lexpo/modules/filesystem/legacy/CountingRequestListener;

    .line 9
    .line 10
    invoke-direct {v0, p1, p0, v1}, Lexpo/modules/filesystem/legacy/CountingSink;-><init>(Lt9/D;Le9/C;Lexpo/modules/filesystem/legacy/CountingRequestListener;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lt9/s;->c(Lt9/D;)Lt9/i;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lexpo/modules/filesystem/legacy/CountingRequestBody;->requestBody:Le9/C;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Le9/C;->writeTo(Lt9/i;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lt9/i;->flush()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
