.class public final Lexpo/modules/fetch/NativeRequest;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lexpo/modules/fetch/NativeRequest;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "Lexpo/modules/fetch/NativeResponse;",
        "response",
        "<init>",
        "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/fetch/NativeResponse;)V",
        "Le9/z;",
        "client",
        "Ljava/net/URL;",
        "url",
        "Lexpo/modules/fetch/NativeRequestInit;",
        "requestInit",
        "",
        "requestBody",
        "Li7/B;",
        "start",
        "(Le9/z;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V",
        "cancel",
        "()V",
        "Lexpo/modules/fetch/NativeResponse;",
        "getResponse$expo_release",
        "()Lexpo/modules/fetch/NativeResponse;",
        "Lexpo/modules/fetch/RequestHolder;",
        "requestHolder",
        "Lexpo/modules/fetch/RequestHolder;",
        "Le9/e;",
        "task",
        "Le9/e;",
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


# instance fields
.field private final requestHolder:Lexpo/modules/fetch/RequestHolder;

.field private final response:Lexpo/modules/fetch/NativeResponse;

.field private task:Le9/e;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/AppContext;Lexpo/modules/fetch/NativeResponse;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Lexpo/modules/kotlin/AppContext;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    .line 15
    .line 16
    new-instance p1, Lexpo/modules/fetch/RequestHolder;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-direct {p1, p2}, Lexpo/modules/fetch/RequestHolder;-><init>(Le9/B;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lexpo/modules/fetch/NativeRequest;->requestHolder:Lexpo/modules/fetch/RequestHolder;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->task:Le9/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Le9/e;->cancel()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    .line 10
    .line 11
    invoke-virtual {v0}, Lexpo/modules/fetch/NativeResponse;->emitRequestCanceled()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final getResponse$expo_release()Lexpo/modules/fetch/NativeResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    .line 2
    .line 3
    return-object v0
.end method

.method public final start(Le9/z;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V
    .locals 11

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "requestInit"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Le9/z;->C()Le9/z$a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getCredentials()Lexpo/modules/fetch/NativeRequestCredentials;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lexpo/modules/fetch/NativeRequestCredentials;->INCLUDE:Lexpo/modules/fetch/NativeRequestCredentials;

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    sget-object v0, Le9/n;->a:Le9/n;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Le9/z$a;->g(Le9/n;)Le9/z$a;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getRedirect()Lexpo/modules/fetch/NativeRequestRedirect;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Lexpo/modules/fetch/NativeRequestRedirect;->FOLLOW:Lexpo/modules/fetch/NativeRequestRedirect;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Le9/z$a;->i(Z)Le9/z$a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Le9/z$a;->j(Z)Le9/z$a;

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p1}, Le9/z$a;->c()Le9/z;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    .line 53
    .line 54
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getRedirect()Lexpo/modules/fetch/NativeRequestRedirect;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Lexpo/modules/fetch/NativeResponse;->setRedirectMode(Lexpo/modules/fetch/NativeRequestRedirect;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getHeaders()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lexpo/modules/fetch/RequestUtilsKt;->toHeaders(Ljava/util/List;)Le9/t;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "Content-Type"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Le9/t;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/4 v3, 0x0

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    sget-object v4, Le9/x;->g:Le9/x$a;

    .line 79
    .line 80
    invoke-virtual {v4, v1}, Le9/x$a;->c(Ljava/lang/String;)Le9/x;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    move-object v6, v1

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    move-object v6, v3

    .line 87
    :goto_0
    if-eqz p4, :cond_3

    .line 88
    .line 89
    sget-object v4, Le9/C;->Companion:Le9/C$a;

    .line 90
    .line 91
    const/4 v9, 0x6

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    move-object v5, p4

    .line 96
    invoke-static/range {v4 .. v10}, Le9/C$a;->k(Le9/C$a;[BLe9/x;IIILjava/lang/Object;)Le9/C;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    if-nez p4, :cond_5

    .line 101
    .line 102
    :cond_3
    invoke-static {}, Lexpo/modules/fetch/NativeRequestKt;->getMETHODS_REQUIRING_BODY()[Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getMethod()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {p4, v1}, Lj7/j;->B([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    if-eqz p4, :cond_4

    .line 115
    .line 116
    sget-object v4, Le9/C;->Companion:Le9/C$a;

    .line 117
    .line 118
    const/4 p4, 0x1

    .line 119
    new-array v5, p4, [B

    .line 120
    .line 121
    aput-byte v2, v5, v2

    .line 122
    .line 123
    const/4 v9, 0x6

    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    invoke-static/range {v4 .. v10}, Le9/C$a;->k(Le9/C$a;[BLe9/x;IIILjava/lang/Object;)Le9/C;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :cond_4
    move-object p4, v3

    .line 132
    :cond_5
    new-instance v1, Le9/B$a;

    .line 133
    .line 134
    invoke-direct {v1}, Le9/B$a;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v0}, Le9/B$a;->f(Le9/t;)Le9/B$a;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getMethod()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-virtual {v0, p3, p4}, Le9/B$a;->g(Ljava/lang/String;Le9/C;)Le9/B$a;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    sget-object p4, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->Companion:Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;

    .line 150
    .line 151
    invoke-virtual {p4, p2}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;->handleFileUrl(Ljava/net/URL;)Ljava/net/URL;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p3, p2}, Le9/B$a;->n(Ljava/net/URL;)Le9/B$a;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p2}, Le9/B$a;->b()Le9/B;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    iget-object p3, p0, Lexpo/modules/fetch/NativeRequest;->requestHolder:Lexpo/modules/fetch/RequestHolder;

    .line 164
    .line 165
    invoke-virtual {p3, p2}, Lexpo/modules/fetch/RequestHolder;->setRequest(Le9/B;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, Le9/z;->a(Le9/B;)Le9/e;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iput-object p1, p0, Lexpo/modules/fetch/NativeRequest;->task:Le9/e;

    .line 173
    .line 174
    if-eqz p1, :cond_6

    .line 175
    .line 176
    iget-object p2, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    .line 177
    .line 178
    invoke-interface {p1, p2}, Le9/e;->t0(Le9/f;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    iget-object p1, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    .line 182
    .line 183
    invoke-virtual {p1}, Lexpo/modules/fetch/NativeResponse;->onStarted()V

    .line 184
    .line 185
    .line 186
    return-void
.end method
