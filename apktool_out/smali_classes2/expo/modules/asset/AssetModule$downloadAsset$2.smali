.class final Lexpo/modules/asset/AssetModule$downloadAsset$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/asset/AssetModule;->downloadAsset(Lexpo/modules/kotlin/AppContext;Ljava/net/URI;Ljava/io/File;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LR8/N;",
        "Landroid/net/Uri;",
        "kotlin.jvm.PlatformType",
        "<anonymous>",
        "(LR8/N;)Landroid/net/Uri;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.asset.AssetModule$downloadAsset$2"
    f = "AssetModule.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $localUrl:Ljava/io/File;

.field final synthetic $uri:Ljava/net/URI;

.field label:I

.field final synthetic this$0:Lexpo/modules/asset/AssetModule;


# direct methods
.method constructor <init>(Ljava/net/URI;Lexpo/modules/asset/AssetModule;Ljava/io/File;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Lexpo/modules/asset/AssetModule;",
            "Ljava/io/File;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->this$0:Lexpo/modules/asset/AssetModule;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$localUrl:Ljava/io/File;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/asset/AssetModule$downloadAsset$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->this$0:Lexpo/modules/asset/AssetModule;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$localUrl:Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/asset/AssetModule$downloadAsset$2;-><init>(Ljava/net/URI;Lexpo/modules/asset/AssetModule;Ljava/io/File;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/asset/AssetModule$downloadAsset$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/asset/AssetModule$downloadAsset$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/asset/AssetModule$downloadAsset$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/asset/AssetModule$downloadAsset$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "toString(...)"

    .line 2
    .line 3
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->label:I

    .line 7
    .line 8
    if-nez v1, :cond_3

    .line 9
    .line 10
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object p1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ":"

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static {p1, v1, v3, v2, v4}, LP8/q;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->this$0:Lexpo/modules/asset/AssetModule;

    .line 34
    .line 35
    invoke-static {p1}, Lexpo/modules/asset/AssetModule;->access$getContext(Lexpo/modules/asset/AssetModule;)Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v1}, Lexpo/modules/asset/ResourceAssetKt;->openAssetResourceStream(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object p1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, "file:///android_res/"

    .line 63
    .line 64
    invoke-static {p1, v1, v3, v2, v4}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->this$0:Lexpo/modules/asset/AssetModule;

    .line 71
    .line 72
    invoke-static {p1}, Lexpo/modules/asset/AssetModule;->access$getContext(Lexpo/modules/asset/AssetModule;)Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v1}, Lexpo/modules/asset/ResourceAssetKt;->openAndroidResStream(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    iget-object p1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :goto_0
    iget-object v1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$localUrl:Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    :try_start_1
    new-instance v5, Ljava/io/FileOutputStream;

    .line 103
    .line 104
    invoke-direct {v5, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    :try_start_2
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v5, v3, v2, v4}, Lt7/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v2

    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    cmp-long v2, v2, v6

    .line 117
    .line 118
    if-nez v2, :cond_2

    .line 119
    .line 120
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catchall_0
    move-exception v1

    .line 125
    goto :goto_2

    .line 126
    :cond_2
    :goto_1
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    .line 128
    :try_start_3
    invoke-static {v5, v4}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 129
    .line 130
    .line 131
    :try_start_4
    invoke-static {p1, v4}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$localUrl:Ljava/io/File;

    .line 135
    .line 136
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 137
    .line 138
    .line 139
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 140
    return-object p1

    .line 141
    :catchall_1
    move-exception v1

    .line 142
    goto :goto_3

    .line 143
    :goto_2
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 144
    :catchall_2
    move-exception v2

    .line 145
    :try_start_6
    invoke-static {v5, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 149
    :goto_3
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 150
    :catchall_3
    move-exception v2

    .line 151
    :try_start_8
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    throw v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 155
    :catch_0
    new-instance p1, Lexpo/modules/asset/UnableToDownloadAssetException;

    .line 156
    .line 157
    iget-object v1, p0, Lexpo/modules/asset/AssetModule$downloadAsset$2;->$uri:Ljava/net/URI;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-direct {p1, v1}, Lexpo/modules/asset/UnableToDownloadAssetException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 173
    .line 174
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1
.end method
