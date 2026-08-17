.class public final Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le9/v;


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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Le9/v$a;",
        "chain",
        "Le9/D;",
        "intercept",
        "(Le9/v$a;)Le9/D;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $reactApplicationContext$inlined:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic $requestId$inlined:I

.field final synthetic $responseType$inlined:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1;->$responseType$inlined:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1;->$reactApplicationContext$inlined:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    iput p3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1;->$requestId$inlined:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final intercept(Le9/v$a;)Le9/D;
    .locals 6

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
    invoke-interface {p1, v0}, Le9/v$a;->a(Le9/B;)Le9/D;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Le9/D;->d()Le9/E;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 21
    .line 22
    new-instance v2, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1;->$responseType$inlined:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1;->$reactApplicationContext$inlined:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 27
    .line 28
    iget v5, p0, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$$inlined$-addNetworkInterceptor$1;->$requestId$inlined:I

    .line 29
    .line 30
    invoke-direct {v2, v3, v4, v5}, Lcom/facebook/react/modules/network/NetworkingModule$sendRequestInternalReal$1$responseBody$1;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v0, v2}, Lcom/facebook/react/modules/network/ProgressResponseBody;-><init>(Le9/E;Lcom/facebook/react/modules/network/ProgressListener;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Le9/D;->u0()Le9/D$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1, v1}, Le9/D$a;->b(Le9/E;)Le9/D$a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Le9/D$a;->c()Le9/D;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "Required value was null."

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method
