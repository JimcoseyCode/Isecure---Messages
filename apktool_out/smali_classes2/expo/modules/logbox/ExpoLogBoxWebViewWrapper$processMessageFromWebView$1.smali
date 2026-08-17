.class final Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;->processMessageFromWebView(Ljava/lang/String;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Li7/B;",
        "<anonymous>",
        "(LR8/N;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.logbox.ExpoLogBoxWebViewWrapper$processMessageFromWebView$1"
    f = "ExpoLogBoxWebViewWrapper.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $actionId:Lcom/google/gson/k;

.field final synthetic $args:Lcom/google/gson/e;

.field final synthetic $uid:Lcom/google/gson/k;

.field label:I

.field final synthetic this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;


# direct methods
.method constructor <init>(Lcom/google/gson/e;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/e;",
            "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;",
            "Lcom/google/gson/k;",
            "Lcom/google/gson/k;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$args:Lcom/google/gson/e;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$uid:Lcom/google/gson/k;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$actionId:Lcom/google/gson/k;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic c(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/String;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->invokeSuspend$lambda$0(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/String;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/String;)Li7/B;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/gson/k;->w()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getAsString(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/gson/k;->w()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p3, p1, p2}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;->sendReturn(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Li7/B;->a:Li7/B;

    .line 21
    .line 22
    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/Exception;)Li7/B;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/gson/k;->w()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getAsString(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/gson/k;->w()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p3, p1, p2}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;->sendReturn(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Li7/B;->a:Li7/B;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic t(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/Exception;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->invokeSuspend$lambda$1(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ljava/lang/Exception;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 6
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
    new-instance v0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$args:Lcom/google/gson/e;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$uid:Lcom/google/gson/k;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$actionId:Lcom/google/gson/k;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;-><init>(Lcom/google/gson/e;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;Ln7/f;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$args:Lcom/google/gson/e;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lcom/google/gson/e;->v(I)Lcom/google/gson/f;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/google/gson/f;->t()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$args:Lcom/google/gson/e;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/google/gson/e;->v(I)Lcom/google/gson/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/google/gson/f;->p()Lcom/google/gson/k;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/google/gson/k;->A()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$args:Lcom/google/gson/e;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lcom/google/gson/e;->v(I)Lcom/google/gson/f;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/google/gson/f;->p()Lcom/google/gson/k;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/google/gson/k;->w()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    move-object v3, p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object v3, v1

    .line 58
    :goto_0
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$args:Lcom/google/gson/e;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    invoke-virtual {p1, v0}, Lcom/google/gson/e;->v(I)Lcom/google/gson/f;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/google/gson/f;->o()Lcom/google/gson/i;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "method"

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/google/gson/i;->A(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lcom/google/gson/i;->w(Ljava/lang/String;)Lcom/google/gson/f;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Lcom/google/gson/f;->t()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lcom/google/gson/i;->z(Ljava/lang/String;)Lcom/google/gson/k;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Lcom/google/gson/k;->A()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_1

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Lcom/google/gson/i;->z(Ljava/lang/String;)Lcom/google/gson/k;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lcom/google/gson/k;->w()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    move-object v0, v1

    .line 107
    :goto_1
    const-string v2, "body"

    .line 108
    .line 109
    invoke-virtual {p1, v2}, Lcom/google/gson/i;->A(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_2

    .line 114
    .line 115
    invoke-virtual {p1, v2}, Lcom/google/gson/i;->w(Ljava/lang/String;)Lcom/google/gson/f;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Lcom/google/gson/f;->t()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_2

    .line 124
    .line 125
    invoke-virtual {p1, v2}, Lcom/google/gson/i;->z(Ljava/lang/String;)Lcom/google/gson/k;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v4}, Lcom/google/gson/k;->A()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_2

    .line 134
    .line 135
    invoke-virtual {p1, v2}, Lcom/google/gson/i;->z(Ljava/lang/String;)Lcom/google/gson/k;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Lcom/google/gson/k;->w()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :cond_2
    if-eqz v3, :cond_5

    .line 144
    .line 145
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 146
    .line 147
    invoke-virtual {p1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;->getActions()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->getFetchTextAsync()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;->getAction()Lw7/q;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-nez v0, :cond_3

    .line 160
    .line 161
    const-string v0, "GET"

    .line 162
    .line 163
    :cond_3
    move-object v4, v0

    .line 164
    if-nez v1, :cond_4

    .line 165
    .line 166
    const-string v1, ""

    .line 167
    .line 168
    :cond_4
    move-object v5, v1

    .line 169
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 170
    .line 171
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$uid:Lcom/google/gson/k;

    .line 172
    .line 173
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$actionId:Lcom/google/gson/k;

    .line 174
    .line 175
    new-instance v6, Lexpo/modules/logbox/h;

    .line 176
    .line 177
    invoke-direct {v6, p1, v0, v1}, Lexpo/modules/logbox/h;-><init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->this$0:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 181
    .line 182
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$uid:Lcom/google/gson/k;

    .line 183
    .line 184
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$processMessageFromWebView$1;->$actionId:Lcom/google/gson/k;

    .line 185
    .line 186
    new-instance v7, Lexpo/modules/logbox/i;

    .line 187
    .line 188
    invoke-direct {v7, p1, v0, v1}, Lexpo/modules/logbox/i;-><init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;Lcom/google/gson/k;Lcom/google/gson/k;)V

    .line 189
    .line 190
    .line 191
    invoke-interface/range {v2 .. v7}, Lw7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_5
    sget-object p1, Li7/B;->a:Li7/B;

    .line 195
    .line 196
    return-object p1

    .line 197
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 198
    .line 199
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 200
    .line 201
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw p1
.end method
