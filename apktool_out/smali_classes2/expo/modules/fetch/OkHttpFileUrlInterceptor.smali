.class public final Lexpo/modules/fetch/OkHttpFileUrlInterceptor;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le9/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lexpo/modules/fetch/OkHttpFileUrlInterceptor;",
        "Le9/v;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Le9/u;",
        "url",
        "",
        "restoreFileUrl",
        "(Le9/u;)Ljava/lang/String;",
        "Le9/B;",
        "request",
        "Le9/D;",
        "createFileNotFoundResponse",
        "(Le9/B;)Le9/D;",
        "fileName",
        "Le9/x;",
        "createMediaType",
        "(Ljava/lang/String;)Le9/x;",
        "Le9/v$a;",
        "chain",
        "intercept",
        "(Le9/v$a;)Le9/D;",
        "Le9/E;",
        "createAssetResponseBody",
        "(Landroid/content/Context;Ljava/lang/String;)Le9/E;",
        "Ljava/lang/ref/WeakReference;",
        "Ljava/lang/ref/WeakReference;",
        "Companion",
        "expo_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;


# instance fields
.field private final context:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->Companion:Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->context:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void
.end method

.method private final createFileNotFoundResponse(Le9/B;)Le9/D;
    .locals 4

    .line 1
    new-instance v0, Le9/D$a;

    .line 2
    .line 3
    invoke-direct {v0}, Le9/D$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Le9/D$a;->r(Le9/B;)Le9/D$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Le9/A;->i:Le9/A;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Le9/D$a;->p(Le9/A;)Le9/D$a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 v0, 0x194

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Le9/D$a;->g(I)Le9/D$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "File not found"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Le9/D$a;->m(Ljava/lang/String;)Le9/D$a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v1, Le9/E;->Companion:Le9/E$b;

    .line 29
    .line 30
    sget-object v2, Le9/x;->g:Le9/x$a;

    .line 31
    .line 32
    const-string v3, "text/plain"

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Le9/x$a;->b(Ljava/lang/String;)Le9/x;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v0, v2}, Le9/E$b;->e(Ljava/lang/String;Le9/x;)Le9/E;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Le9/D$a;->b(Le9/E;)Le9/D$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Le9/D$a;->c()Le9/D;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method private final createMediaType(Ljava/lang/String;)Le9/x;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/net/URLConnection;->guessContentTypeFromName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "application/octet-stream"

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    move-object p1, v0

    .line 10
    :cond_0
    sget-object v1, Le9/x;->g:Le9/x$a;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Le9/x$a;->c(Ljava/lang/String;)Le9/x;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Le9/x$a;->b(Ljava/lang/String;)Le9/x;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    return-object p1
.end method

.method private final restoreFileUrl(Le9/u;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Le9/u;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x0

    .line 7
    const-string v1, "http://filesystem.local"

    .line 8
    .line 9
    const-string v2, "file://"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, LP8/q;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method


# virtual methods
.method public final createAssetResponseBody(Landroid/content/Context;Ljava/lang/String;)Le9/E;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "open(...)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Le9/E;->Companion:Le9/E$b;

    .line 25
    .line 26
    invoke-static {p1}, Lt9/s;->k(Ljava/io/InputStream;)Lt9/F;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lt9/s;->d(Lt9/F;)Lt9/j;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {p0, p2}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->createMediaType(Ljava/lang/String;)Le9/x;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x0

    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    invoke-static/range {v1 .. v7}, Le9/E$b;->i(Le9/E$b;Lt9/j;Le9/x;JILjava/lang/Object;)Le9/E;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method public intercept(Le9/v$a;)Le9/D;
    .locals 8

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Le9/v$a;->d()Le9/B;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Le9/B;->p()Le9/u;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {p0, v1}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->restoreFileUrl(Le9/u;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "file://"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static {v1, v2, v3, v4, v5}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, v0}, Le9/v$a;->a(Le9/B;)Le9/D;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    const-string p1, "file:///android_asset/"

    .line 35
    .line 36
    invoke-static {v1, p1, v3, v4, v5}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const-string v3, "OK"

    .line 41
    .line 42
    const/16 v4, 0xc8

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {v1, p1}, LP8/q;->w0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->context:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/content/Context;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {p0, v1, p1}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->createAssetResponseBody(Landroid/content/Context;Ljava/lang/String;)Le9/E;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v1, Le9/D$a;

    .line 65
    .line 66
    invoke-direct {v1}, Le9/D$a;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Le9/D$a;->r(Le9/B;)Le9/D$a;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v2, Le9/A;->i:Le9/A;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Le9/D$a;->p(Le9/A;)Le9/D$a;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1, v4}, Le9/D$a;->g(I)Le9/D$a;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1, v3}, Le9/D$a;->m(Ljava/lang/String;)Le9/D$a;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1, p1}, Le9/D$a;->b(Le9/E;)Le9/D$a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Le9/D$a;->c()Le9/D;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    return-object p1

    .line 96
    :catch_0
    invoke-direct {p0, v0}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->createFileNotFoundResponse(Le9/B;)Le9/D;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_1
    new-instance p1, Lexpo/modules/fetch/FetchAndroidContextLostException;

    .line 102
    .line 103
    invoke-direct {p1}, Lexpo/modules/fetch/FetchAndroidContextLostException;-><init>()V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_2
    const/4 p1, 0x7

    .line 108
    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v1, "substring(...)"

    .line 113
    .line 114
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Ljava/io/File;

    .line 118
    .line 119
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_3

    .line 127
    .line 128
    invoke-direct {p0, v0}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->createFileNotFoundResponse(Le9/B;)Le9/D;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :cond_3
    sget-object p1, Le9/E;->Companion:Le9/E$b;

    .line 134
    .line 135
    invoke-static {v1}, Lt9/s;->j(Ljava/io/File;)Lt9/F;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v2}, Lt9/s;->d(Lt9/F;)Lt9/j;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const-string v6, "getName(...)"

    .line 148
    .line 149
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p0, v5}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->createMediaType(Ljava/lang/String;)Le9/x;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    invoke-virtual {p1, v2, v5, v6, v7}, Le9/E$b;->f(Lt9/j;Le9/x;J)Le9/E;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    new-instance v1, Le9/D$a;

    .line 165
    .line 166
    invoke-direct {v1}, Le9/D$a;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v0}, Le9/D$a;->r(Le9/B;)Le9/D$a;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sget-object v1, Le9/A;->i:Le9/A;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Le9/D$a;->p(Le9/A;)Le9/D$a;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0, v4}, Le9/D$a;->g(I)Le9/D$a;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0, v3}, Le9/D$a;->m(Ljava/lang/String;)Le9/D$a;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0, p1}, Le9/D$a;->b(Le9/E;)Le9/D$a;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p1}, Le9/D$a;->c()Le9/D;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    return-object p1
.end method
