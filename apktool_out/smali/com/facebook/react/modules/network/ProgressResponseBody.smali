.class public final Lcom/facebook/react/modules/network/ProgressResponseBody;
.super Le9/E;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u000f\u0010\u0008\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/facebook/react/modules/network/ProgressResponseBody;",
        "Le9/E;",
        "responseBody",
        "Lcom/facebook/react/modules/network/ProgressListener;",
        "progressListener",
        "<init>",
        "(Le9/E;Lcom/facebook/react/modules/network/ProgressListener;)V",
        "Lt9/F;",
        "source",
        "(Lt9/F;)Lt9/F;",
        "Le9/x;",
        "contentType",
        "()Le9/x;",
        "",
        "contentLength",
        "()J",
        "totalBytesRead",
        "Lt9/j;",
        "()Lt9/j;",
        "Le9/E;",
        "Lcom/facebook/react/modules/network/ProgressListener;",
        "bufferedSource",
        "Lt9/j;",
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
.field private bufferedSource:Lt9/j;

.field private final progressListener:Lcom/facebook/react/modules/network/ProgressListener;

.field private final responseBody:Le9/E;

.field private totalBytesRead:J


# direct methods
.method public constructor <init>(Le9/E;Lcom/facebook/react/modules/network/ProgressListener;)V
    .locals 1

    .line 1
    const-string v0, "responseBody"

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
    invoke-direct {p0}, Le9/E;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->responseBody:Le9/E;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->progressListener:Lcom/facebook/react/modules/network/ProgressListener;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getProgressListener$p(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lcom/facebook/react/modules/network/ProgressListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->progressListener:Lcom/facebook/react/modules/network/ProgressListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getResponseBody$p(Lcom/facebook/react/modules/network/ProgressResponseBody;)Le9/E;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->responseBody:Le9/E;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTotalBytesRead$p(Lcom/facebook/react/modules/network/ProgressResponseBody;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->totalBytesRead:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$setTotalBytesRead$p(Lcom/facebook/react/modules/network/ProgressResponseBody;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->totalBytesRead:J

    .line 2
    .line 3
    return-void
.end method

.method private final source(Lt9/F;)Lt9/F;
    .locals 1

    .line 4
    new-instance v0, Lcom/facebook/react/modules/network/ProgressResponseBody$source$1;

    invoke-direct {v0, p1, p0}, Lcom/facebook/react/modules/network/ProgressResponseBody$source$1;-><init>(Lt9/F;Lcom/facebook/react/modules/network/ProgressResponseBody;)V

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->responseBody:Le9/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/E;->contentLength()J

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
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->responseBody:Le9/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/E;->contentType()Le9/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public source()Lt9/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->bufferedSource:Lt9/j;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lt9/c;->a()Lt9/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->responseBody:Le9/E;

    invoke-virtual {v1}, Le9/E;->source()Lt9/j;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/react/modules/network/ProgressResponseBody;->source(Lt9/F;)Lt9/F;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt9/b;->b(Lt9/F;)Lt9/j;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->bufferedSource:Lt9/j;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->bufferedSource:Lt9/j;

    if-nez v0, :cond_1

    const-string v0, "bufferedSource"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method public final totalBytesRead()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->totalBytesRead:J

    .line 2
    .line 3
    return-wide v0
.end method
