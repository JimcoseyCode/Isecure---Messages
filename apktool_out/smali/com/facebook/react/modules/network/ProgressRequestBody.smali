.class public final Lcom/facebook/react/modules/network/ProgressRequestBody;
.super Le9/C;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/facebook/react/modules/network/ProgressRequestBody;",
        "Le9/C;",
        "requestBody",
        "Lcom/facebook/react/modules/network/ProgressListener;",
        "progressListener",
        "<init>",
        "(Le9/C;Lcom/facebook/react/modules/network/ProgressListener;)V",
        "Lt9/i;",
        "sink",
        "Lt9/D;",
        "outputStreamSink",
        "(Lt9/i;)Lt9/D;",
        "Le9/x;",
        "contentType",
        "()Le9/x;",
        "",
        "contentLength",
        "()J",
        "Li7/B;",
        "writeTo",
        "(Lt9/i;)V",
        "",
        "getBodyPreview",
        "()Ljava/lang/String;",
        "Le9/C;",
        "Lcom/facebook/react/modules/network/ProgressListener;",
        "J",
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


# instance fields
.field private contentLength:J

.field private final progressListener:Lcom/facebook/react/modules/network/ProgressListener;

.field private final requestBody:Le9/C;


# direct methods
.method public constructor <init>(Le9/C;Lcom/facebook/react/modules/network/ProgressListener;)V
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
    iput-object p1, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->requestBody:Le9/C;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->progressListener:Lcom/facebook/react/modules/network/ProgressListener;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getProgressListener$p(Lcom/facebook/react/modules/network/ProgressRequestBody;)Lcom/facebook/react/modules/network/ProgressListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->progressListener:Lcom/facebook/react/modules/network/ProgressListener;

    .line 2
    .line 3
    return-object p0
.end method

.method private final outputStreamSink(Lt9/i;)Lt9/D;
    .locals 2

    .line 1
    invoke-static {}, Lt9/c;->a()Lt9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lt9/i;->E0()Ljava/io/OutputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Lcom/facebook/react/modules/network/ProgressRequestBody$outputStreamSink$1;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lcom/facebook/react/modules/network/ProgressRequestBody$outputStreamSink$1;-><init>(Lcom/facebook/react/modules/network/ProgressRequestBody;Ljava/io/OutputStream;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lt9/b;->d(Ljava/io/OutputStream;)Lt9/D;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method


# virtual methods
.method public contentLength()J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->contentLength:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->requestBody:Le9/C;

    .line 10
    .line 11
    invoke-virtual {v0}, Le9/C;->contentLength()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->contentLength:J

    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->contentLength:J

    .line 18
    .line 19
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->requestBody:Le9/C;

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

.method public final getBodyPreview()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "[Preview unavailable]"

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lt9/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lt9/c;->a()Lt9/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/ProgressRequestBody;->outputStreamSink(Lt9/i;)Lt9/D;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lt9/b;->a(Lt9/D;)Lt9/i;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0}, Lcom/facebook/react/modules/network/ProgressRequestBody;->contentLength()J

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody;->requestBody:Le9/C;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Le9/C;->writeTo(Lt9/i;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Lt9/i;->flush()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
