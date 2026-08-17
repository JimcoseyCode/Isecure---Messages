.class public final Lcom/facebook/react/modules/network/RequestBodyUtil$create$1;
.super Le9/C;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/RequestBodyUtil;->create(Le9/x;Ljava/io/InputStream;)Le9/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/facebook/react/modules/network/RequestBodyUtil$create$1",
        "Le9/C;",
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
.field final synthetic $inputStream:Ljava/io/InputStream;

.field final synthetic $mediaType:Le9/x;


# direct methods
.method constructor <init>(Le9/x;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/RequestBodyUtil$create$1;->$mediaType:Le9/x;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/network/RequestBodyUtil$create$1;->$inputStream:Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-direct {p0}, Le9/C;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/RequestBodyUtil$create$1;->$inputStream:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0

    .line 9
    :catch_0
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/RequestBodyUtil$create$1;->$mediaType:Le9/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lt9/i;)V
    .locals 3
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
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-static {}, Lt9/c;->a()Lt9/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/facebook/react/modules/network/RequestBodyUtil$create$1;->$inputStream:Ljava/io/InputStream;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lt9/b;->e(Ljava/io/InputStream;)Lt9/F;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Lt9/i;->G(Lt9/F;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object p1, Lcom/facebook/react/modules/network/RequestBodyUtil;->INSTANCE:Lcom/facebook/react/modules/network/RequestBodyUtil;

    .line 23
    .line 24
    invoke-static {p1, v0}, Lcom/facebook/react/modules/network/RequestBodyUtil;->access$closeQuietly(Lcom/facebook/react/modules/network/RequestBodyUtil;Lt9/F;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v1, Lcom/facebook/react/modules/network/RequestBodyUtil;->INSTANCE:Lcom/facebook/react/modules/network/RequestBodyUtil;

    .line 32
    .line 33
    invoke-static {v1, v0}, Lcom/facebook/react/modules/network/RequestBodyUtil;->access$closeQuietly(Lcom/facebook/react/modules/network/RequestBodyUtil;Lt9/F;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    throw p1
.end method
