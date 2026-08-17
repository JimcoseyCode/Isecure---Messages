.class public final Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le9/f;


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
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2",
        "Le9/f;",
        "Le9/e;",
        "call",
        "Ljava/io/IOException;",
        "e",
        "Li7/B;",
        "onFailure",
        "(Le9/e;Ljava/io/IOException;)V",
        "Le9/D;",
        "response",
        "onResponse",
        "(Le9/e;Le9/D;)V",
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
.field final synthetic $devToolsRequestId:Ljava/lang/String;

.field final synthetic $reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic $requestId:I

.field final synthetic $responseType:Ljava/lang/String;

.field final synthetic $url:Ljava/lang/String;

.field final synthetic $useIncrementalUpdates:Z

.field final synthetic this$0:Lcom/facebook/react/modules/network/NetworkingModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/network/NetworkingModule;ILcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->this$0:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$url:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$responseType:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$useIncrementalUpdates:Z

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public onFailure(Le9/e;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "e"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->this$0:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/facebook/react/modules/network/NetworkingModule;->access$getShuttingDown$p(Lcom/facebook/react/modules/network/NetworkingModule;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->this$0:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 21
    .line 22
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 23
    .line 24
    invoke-static {p1, v0}, Lcom/facebook/react/modules/network/NetworkingModule;->access$removeRequest(Lcom/facebook/react/modules/network/NetworkingModule;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "Error while executing request: "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 59
    .line 60
    iget v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 61
    .line 62
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1, v2, p1, p2}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onRequestError(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public onResponse(Le9/e;Le9/D;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->this$0:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/facebook/react/modules/network/NetworkingModule;->access$getShuttingDown$p(Lcom/facebook/react/modules/network/NetworkingModule;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->this$0:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 22
    .line 23
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 24
    .line 25
    invoke-static {p1, v0}, Lcom/facebook/react/modules/network/NetworkingModule;->access$removeRequest(Lcom/facebook/react/modules/network/NetworkingModule;I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 29
    .line 30
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 31
    .line 32
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$url:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p1, v0, v1, v2, p2}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onResponseReceived(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Le9/D;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p2}, Le9/D;->d()Le9/E;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v0, 0x0

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 47
    .line 48
    iget p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 49
    .line 50
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 51
    .line 52
    const-string v2, "Response body is null"

    .line 53
    .line 54
    invoke-static {p1, p2, v1, v2, v0}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onRequestError(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catch_0
    move-exception p1

    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :cond_1
    const-string v1, "gzip"

    .line 62
    .line 63
    const-string v2, "Content-Encoding"

    .line 64
    .line 65
    const/4 v3, 0x2

    .line 66
    invoke-static {p2, v2, v0, v3, v0}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/4 v4, 0x1

    .line 71
    invoke-static {v1, v2, v4}, LP8/q;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    new-instance v1, Lt9/p;

    .line 78
    .line 79
    invoke-virtual {p1}, Le9/E;->source()Lt9/j;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {v1, p1}, Lt9/p;-><init>(Lt9/F;)V

    .line 84
    .line 85
    .line 86
    const-string p1, "Content-Type"

    .line 87
    .line 88
    invoke-static {p2, p1, v0, v3, v0}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    sget-object v0, Le9/x;->g:Le9/x$a;

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Le9/x$a;->a(Ljava/lang/String;)Le9/x;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :cond_2
    sget-object p1, Le9/E;->Companion:Le9/E$b;

    .line 101
    .line 102
    invoke-static {}, Lt9/c;->a()Lt9/b;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2, v1}, Lt9/b;->b(Lt9/F;)Lt9/j;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-wide/16 v5, -0x1

    .line 111
    .line 112
    invoke-virtual {p1, v0, v5, v6, v1}, Le9/E$b;->a(Le9/x;JLt9/j;)Le9/E;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :cond_3
    if-eqz p1, :cond_9

    .line 117
    .line 118
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->this$0:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 119
    .line 120
    invoke-static {v0}, Lcom/facebook/react/modules/network/NetworkingModule;->access$getResponseHandlers$p(Lcom/facebook/react/modules/network/NetworkingModule;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;

    .line 139
    .line 140
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$responseType:Ljava/lang/String;

    .line 141
    .line 142
    invoke-interface {v1, v2}, Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;->supports(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_4

    .line 147
    .line 148
    invoke-virtual {p1}, Le9/E;->bytes()[B

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-interface {v1, p2}, Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;->toResponseData([B)Lcom/facebook/react/bridge/WritableMap;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 157
    .line 158
    iget v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 159
    .line 160
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v1, v2, v3, v0, p2}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onDataReceived(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;[B)V

    .line 163
    .line 164
    .line 165
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 166
    .line 167
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 168
    .line 169
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {p1}, Le9/E;->contentLength()J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    invoke-static {p2, v0, v1, v2, v3}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onRequestSuccess(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_5
    iget-boolean v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$useIncrementalUpdates:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .line 181
    const-string v1, "text"

    .line 182
    .line 183
    if-eqz v0, :cond_6

    .line 184
    .line 185
    :try_start_1
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$responseType:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_6

    .line 192
    .line 193
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->this$0:Lcom/facebook/react/modules/network/NetworkingModule;

    .line 194
    .line 195
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 196
    .line 197
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {p2, v0, v1, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->access$readWithProgress(Lcom/facebook/react/modules/network/NetworkingModule;ILjava/lang/String;Le9/E;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 203
    .line 204
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 205
    .line 206
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {p1}, Le9/E;->contentLength()J

    .line 209
    .line 210
    .line 211
    move-result-wide v2

    .line 212
    invoke-static {p2, v0, v1, v2, v3}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onRequestSuccess(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_6
    const-string v0, ""

    .line 217
    .line 218
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$responseType:Ljava/lang/String;

    .line 219
    .line 220
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 224
    if-eqz v1, :cond_7

    .line 225
    .line 226
    :try_start_2
    invoke-virtual {p1}, Le9/E;->string()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 230
    goto :goto_0

    .line 231
    :catch_1
    move-exception v1

    .line 232
    :try_start_3
    invoke-virtual {p2}, Le9/D;->m()Le9/B;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-virtual {p2}, Le9/B;->c()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    const-string v2, "HEAD"

    .line 241
    .line 242
    invoke-static {p2, v2, v4}, LP8/q;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-nez p2, :cond_8

    .line 247
    .line 248
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 249
    .line 250
    iget v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 251
    .line 252
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-static {p2, v2, v3, v4, v1}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onRequestError(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    goto :goto_0

    .line 262
    :cond_7
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$responseType:Ljava/lang/String;

    .line 263
    .line 264
    const-string v1, "base64"

    .line 265
    .line 266
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p2

    .line 270
    if-eqz p2, :cond_8

    .line 271
    .line 272
    invoke-virtual {p1}, Le9/E;->bytes()[B

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-static {p2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    :cond_8
    :goto_0
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 281
    .line 282
    iget v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 283
    .line 284
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 285
    .line 286
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$responseType:Ljava/lang/String;

    .line 287
    .line 288
    invoke-static {p2, v1, v2, v0, v3}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onDataReceived(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 292
    .line 293
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 294
    .line 295
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {p1}, Le9/E;->contentLength()J

    .line 298
    .line 299
    .line 300
    move-result-wide v2

    .line 301
    invoke-static {p2, v0, v1, v2, v3}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onRequestSuccess(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;J)V

    .line 302
    .line 303
    .line 304
    goto :goto_2

    .line 305
    :cond_9
    const-string p1, "Required value was null."

    .line 306
    .line 307
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 308
    .line 309
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw p2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 313
    :goto_1
    iget-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 314
    .line 315
    iget v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$requestId:I

    .line 316
    .line 317
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$2;->$devToolsRequestId:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-static {p2, v0, v1, v2, p1}, Lcom/facebook/react/modules/network/NetworkEventUtil;->onRequestError(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    :goto_2
    return-void
.end method
