.class public final Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/BundleDownloader;->downloadBundleFromURL(Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Le9/B$a;)V
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
        "com/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1",
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
.field final synthetic $bundleInfo:Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;

.field final synthetic $callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

.field final synthetic $outputFile:Ljava/io/File;

.field final synthetic this$0:Lcom/facebook/react/devsupport/BundleDownloader;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/BundleDownloader;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->$callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->$outputFile:Ljava/io/File;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->$bundleInfo:Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onFailure(Le9/e;Ljava/io/IOException;)V
    .locals 4

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "e"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/devsupport/BundleDownloader;->access$getDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;)Le9/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/facebook/react/devsupport/BundleDownloader;->access$getDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;)Le9/e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Le9/e;->s()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x1

    .line 33
    if-ne v0, v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/BundleDownloader;->access$setDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;Le9/e;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Le9/e;->d()Le9/B;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Le9/B;->d()Le9/u;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Le9/u;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->$callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 54
    .line 55
    sget-object v1, Lcom/facebook/react/common/DebugServerException;->Companion:Lcom/facebook/react/common/DebugServerException$Companion;

    .line 56
    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v3, "URL: "

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "Could not connect to development server."

    .line 75
    .line 76
    invoke-virtual {v1, p1, v3, v2, p2}, Lcom/facebook/react/common/DebugServerException$Companion;->makeGeneric(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/common/DebugServerException;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {v0, p1}, Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;->onFailure(Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 85
    .line 86
    invoke-static {p1, v1}, Lcom/facebook/react/devsupport/BundleDownloader;->access$setDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;Le9/e;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public onResponse(Le9/e;Le9/D;)V
    .locals 10
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
    iget-object v0, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->this$0:Lcom/facebook/react/devsupport/BundleDownloader;

    .line 12
    .line 13
    iget-object v4, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->$outputFile:Ljava/io/File;

    .line 14
    .line 15
    iget-object v5, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->$bundleInfo:Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;

    .line 16
    .line 17
    iget-object v6, p0, Lcom/facebook/react/devsupport/BundleDownloader$downloadBundleFromURL$1;->$callback:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 18
    .line 19
    :try_start_0
    invoke-static {v0}, Lcom/facebook/react/devsupport/BundleDownloader;->access$getDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;)Le9/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v8, 0x0

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-static {v0}, Lcom/facebook/react/devsupport/BundleDownloader;->access$getDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;)Le9/e;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 30
    const/4 v1, 0x1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    :try_start_1
    invoke-interface {p1}, Le9/e;->s()Z

    .line 34
    .line 35
    .line 36
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    if-ne p1, v1, :cond_1

    .line 38
    .line 39
    :cond_0
    move-object p1, p2

    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v9, p2

    .line 45
    move-object p2, p1

    .line 46
    move-object p1, v9

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    :try_start_2
    invoke-static {v0, v8}, Lcom/facebook/react/devsupport/BundleDownloader;->access$setDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;Le9/e;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Le9/D;->m()Le9/B;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Le9/B;->d()Le9/u;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Le9/u;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v2, "content-type"

    .line 65
    .line 66
    const/4 v3, 0x2

    .line 67
    invoke-static {p2, v2, v8, v3, v8}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 71
    if-nez v2, :cond_2

    .line 72
    .line 73
    :try_start_3
    const-string v2, ""
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    :cond_2
    :try_start_4
    const-string v3, "multipart/mixed;.*boundary=\"([^\"]+)\""

    .line 76
    .line 77
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-lez v2, :cond_3

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1}, Lo3/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    move-object v3, v1

    .line 106
    check-cast v3, Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 109
    .line 110
    .line 111
    move-object v1, p1

    .line 112
    move-object v2, p2

    .line 113
    :try_start_5
    invoke-static/range {v0 .. v6}, Lcom/facebook/react/devsupport/BundleDownloader;->access$processMultipartResponse(Lcom/facebook/react/devsupport/BundleDownloader;Ljava/lang/String;Le9/D;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 114
    .line 115
    .line 116
    move-object p1, v2

    .line 117
    goto :goto_2

    .line 118
    :catchall_1
    move-exception v0

    .line 119
    move-object p1, v2

    .line 120
    :goto_0
    move-object p2, v0

    .line 121
    goto :goto_5

    .line 122
    :catchall_2
    move-exception v0

    .line 123
    move-object p1, p2

    .line 124
    goto :goto_0

    .line 125
    :cond_3
    move-object v1, p1

    .line 126
    move-object p1, p2

    .line 127
    :try_start_6
    invoke-virtual {p1}, Le9/D;->d()Le9/E;

    .line 128
    .line 129
    .line 130
    move-result-object p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 131
    if-eqz p2, :cond_4

    .line 132
    .line 133
    :try_start_7
    invoke-virtual {p1}, Le9/D;->e()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {p1}, Le9/D;->k()Le9/t;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    move-object v7, v6

    .line 142
    move-object v6, v5

    .line 143
    move-object v5, v4

    .line 144
    invoke-virtual {p2}, Le9/E;->source()Lt9/j;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static/range {v0 .. v7}, Lcom/facebook/react/devsupport/BundleDownloader;->access$processBundleResult(Lcom/facebook/react/devsupport/BundleDownloader;Ljava/lang/String;ILe9/t;Lt9/j;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :catchall_3
    move-exception v0

    .line 153
    move-object v1, v0

    .line 154
    goto :goto_3

    .line 155
    :cond_4
    :goto_1
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 156
    .line 157
    :try_start_8
    invoke-static {p2, v8}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :goto_2
    sget-object p2, Li7/B;->a:Li7/B;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 161
    .line 162
    invoke-static {p1, v8}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :catchall_4
    move-exception v0

    .line 167
    goto :goto_0

    .line 168
    :goto_3
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 169
    :catchall_5
    move-exception v0

    .line 170
    :try_start_a
    invoke-static {p2, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :goto_4
    invoke-static {v0, v8}, Lcom/facebook/react/devsupport/BundleDownloader;->access$setDownloadBundleFromURLCall$p(Lcom/facebook/react/devsupport/BundleDownloader;Le9/e;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v8}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :goto_5
    :try_start_b
    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 182
    :catchall_6
    move-exception v0

    .line 183
    invoke-static {p1, p2}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    throw v0
.end method
