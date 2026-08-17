.class public final Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/modules/network/ProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/NetworkingModule;->sendRequestInternalReal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "com/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1",
        "Lcom/facebook/react/modules/network/ProgressListener;",
        "",
        "bytesWritten",
        "contentLength",
        "",
        "done",
        "Li7/B;",
        "onProgress",
        "(JJZ)V",
        "last",
        "J",
        "getLast",
        "()J",
        "setLast",
        "(J)V",
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
.field final synthetic $reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic $requestId:I

.field final synthetic $responseType:Ljava/lang/String;

.field private last:J


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->$responseType:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    iput p3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->$requestId:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->last:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final getLast()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->last:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public onProgress(JJZ)V
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-nez p5, :cond_0

    .line 6
    .line 7
    sget-object p5, Lcom/facebook/react/modules/network/NetworkingModule;->Companion:Lcom/facebook/react/modules/network/NetworkingModule$Companion;

    .line 8
    .line 9
    iget-wide v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->last:J

    .line 10
    .line 11
    invoke-static {p5, v0, v1, v2, v3}, Lcom/facebook/react/modules/network/NetworkingModule$Companion;->access$shouldDispatch(Lcom/facebook/react/modules/network/NetworkingModule$Companion;JJ)Z

    .line 12
    .line 13
    .line 14
    move-result p5

    .line 15
    if-nez p5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p5, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->$responseType:Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "text"

    .line 21
    .line 22
    invoke-static {p5, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p5

    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :cond_1
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 30
    .line 31
    iget v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->$requestId:I

    .line 32
    .line 33
    move-wide v4, p1

    .line 34
    move-wide v6, p3

    .line 35
    invoke-static/range {v2 .. v7}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onDataReceivedProgress(Lcom/facebook/react/bridge/ReactApplicationContext;IJJ)V

    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->last:J

    .line 39
    .line 40
    return-void
.end method

.method public final setLast(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;->last:J

    .line 2
    .line 3
    return-void
.end method
