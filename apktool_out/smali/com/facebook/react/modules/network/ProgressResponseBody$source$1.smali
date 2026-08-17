.class public final Lcom/facebook/react/modules/network/ProgressResponseBody$source$1;
.super Lt9/n;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/ProgressResponseBody;->source(Lt9/F;)Lt9/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "com/facebook/react/modules/network/ProgressResponseBody$source$1",
        "Lt9/n;",
        "Lt9/h;",
        "sink",
        "",
        "byteCount",
        "read",
        "(Lt9/h;J)J",
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
.field final synthetic this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;


# direct methods
.method constructor <init>(Lt9/F;Lcom/facebook/react/modules/network/ProgressResponseBody;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$source$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lt9/n;-><init>(Lt9/F;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public read(Lt9/h;J)J
    .locals 9
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
    invoke-super {p0, p1, p2, p3}, Lt9/n;->read(Lt9/h;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$source$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    cmp-long v0, p1, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$getTotalBytesRead$p(Lcom/facebook/react/modules/network/ProgressResponseBody;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    add-long/2addr v1, p1

    .line 23
    invoke-static {p3, v1, v2}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$setTotalBytesRead$p(Lcom/facebook/react/modules/network/ProgressResponseBody;J)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$getProgressListener$p(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lcom/facebook/react/modules/network/ProgressListener;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$getTotalBytesRead$p(Lcom/facebook/react/modules/network/ProgressResponseBody;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$getResponseBody$p(Lcom/facebook/react/modules/network/ProgressResponseBody;)Le9/E;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p3}, Le9/E;->contentLength()J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const/4 p3, 0x1

    .line 45
    :goto_0
    move v8, p3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 p3, 0x0

    .line 48
    goto :goto_0

    .line 49
    :goto_1
    invoke-interface/range {v3 .. v8}, Lcom/facebook/react/modules/network/ProgressListener;->onProgress(JJZ)V

    .line 50
    .line 51
    .line 52
    return-wide p1
.end method
