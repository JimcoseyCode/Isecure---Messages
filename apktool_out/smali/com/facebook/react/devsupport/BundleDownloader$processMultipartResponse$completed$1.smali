.class public final Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/BundleDownloader;->processMultipartResponse(Ljava/lang/String;Le9/D;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "com/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1",
        "Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;",
        "",
        "",
        "headers",
        "Lt9/h;",
        "body",
        "",
        "isLastChunk",
        "Li7/B;",
        "onChunkComplete",
        "(Ljava/util/Map;Lt9/h;Z)V",
        "",
        "loaded",
        "total",
        "onChunkProgress",
        "(Ljava/util/Map;JJ)V",
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
.field final synthetic $bundleInfo:Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;

.field final synthetic $callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

.field final synthetic $outputFile:Ljava/io/File;

.field final synthetic $response:Le9/D;

.field final synthetic $url:Ljava/lang/String;

.field final synthetic this$0:Lcom/facebook/react/devsupport/BundleDownloader;


# direct methods
.method constructor <init>(Le9/D;Lcom/facebook/react/devsupport/BundleDownloader;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$response:Le9/D;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$url:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$outputFile:Ljava/io/File;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$bundleInfo:Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public onChunkComplete(Ljava/util/Map;Lt9/h;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lt9/h;",
            "Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "total"

    .line 2
    .line 3
    const-string v1, "done"

    .line 4
    .line 5
    const-string v2, "status"

    .line 6
    .line 7
    const-string v3, "headers"

    .line 8
    .line 9
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "body"

    .line 13
    .line 14
    invoke-static {p2, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    iget-object p3, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$response:Le9/D;

    .line 20
    .line 21
    invoke-virtual {p3}, Le9/D;->e()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    const-string v0, "X-Http-Status"

    .line 26
    .line 27
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const-string p3, "0"

    .line 34
    .line 35
    invoke-interface {p1, v0, p3}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    check-cast p3, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    :cond_0
    move v2, p3

    .line 46
    iget-object v0, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$url:Ljava/lang/String;

    .line 49
    .line 50
    sget-object p3, Le9/t;->h:Le9/t$b;

    .line 51
    .line 52
    invoke-virtual {p3, p1}, Le9/t$b;->a(Ljava/util/Map;)Le9/t;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v5, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$outputFile:Ljava/io/File;

    .line 57
    .line 58
    iget-object v6, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$bundleInfo:Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;

    .line 59
    .line 60
    iget-object v7, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 61
    .line 62
    move-object v4, p2

    .line 63
    invoke-static/range {v0 .. v7}, Lcom/facebook/react/devsupport/BundleDownloader;->access$processBundleResult(Lcom/facebook/react/devsupport/BundleDownloader;Ljava/lang/String;ILe9/t;Lt9/j;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    move-object v4, p2

    .line 68
    const-string p2, "Content-Type"

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_6

    .line 75
    .line 76
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string p2, "application/json"

    .line 81
    .line 82
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_2
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 90
    .line 91
    invoke-virtual {v4}, Lt9/h;->q0()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    goto :goto_0

    .line 109
    :catch_0
    move-exception v0

    .line 110
    move-object p1, v0

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    const-string p2, "Bundling"

    .line 113
    .line 114
    :goto_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    const/4 v2, 0x0

    .line 119
    if-eqz p3, :cond_4

    .line 120
    .line 121
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    goto :goto_1

    .line 130
    :cond_4
    move-object p3, v2

    .line 131
    :goto_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :cond_5
    iget-object p1, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 146
    .line 147
    invoke-interface {p1, p2, p3, v2}, Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;->onProgress(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string p3, "Error parsing progress JSON. "

    .line 157
    .line 158
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const-string p2, "ReactNative"

    .line 169
    .line 170
    invoke-static {p2, p1}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_3
    return-void
.end method

.method public onChunkProgress(Ljava/util/Map;JJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;JJ)V"
        }
    .end annotation

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Content-Type"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "application/javascript"

    .line 13
    .line 14
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/facebook/react/devsupport/BundleDownloader$processMultipartResponse$completed$1;->$callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 21
    .line 22
    const/16 v0, 0x400

    .line 23
    .line 24
    int-to-long v0, v0

    .line 25
    div-long/2addr p2, v0

    .line 26
    long-to-int p2, p2

    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    div-long/2addr p4, v0

    .line 32
    long-to-int p3, p4

    .line 33
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    const-string p4, "Downloading"

    .line 38
    .line 39
    invoke-interface {p1, p4, p2, p3}, Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;->onProgress(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method
