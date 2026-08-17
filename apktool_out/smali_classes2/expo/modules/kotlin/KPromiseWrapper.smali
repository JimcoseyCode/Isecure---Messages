.class public final Lexpo/modules/kotlin/KPromiseWrapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/Promise;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/kotlin/KPromiseWrapper;",
        "Lexpo/modules/kotlin/Promise;",
        "Lcom/facebook/react/bridge/Promise;",
        "bridgePromise",
        "<init>",
        "(Lcom/facebook/react/bridge/Promise;)V",
        "",
        "value",
        "Li7/B;",
        "resolve",
        "(Ljava/lang/Object;)V",
        "",
        "code",
        "message",
        "",
        "cause",
        "reject",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "Lcom/facebook/react/bridge/Promise;",
        "expo-modules-core_release"
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
.field private final bridgePromise:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    const-string v0, "bridgePromise"

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
    iput-object p1, p0, Lexpo/modules/kotlin/KPromiseWrapper;->bridgePromise:Lcom/facebook/react/bridge/Promise;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public reject(Lexpo/modules/kotlin/exception/CodedException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->reject(Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/exception/CodedException;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lexpo/modules/kotlin/KPromiseWrapper;->bridgePromise:Lcom/facebook/react/bridge/Promise;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public resolve()V
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;)V

    return-void
.end method

.method public resolve(D)V
    .locals 0

    .line 2
    invoke-static {p0, p1, p2}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;D)V

    return-void
.end method

.method public resolve(F)V
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;F)V

    return-void
.end method

.method public resolve(I)V
    .locals 0

    .line 4
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;I)V

    return-void
.end method

.method public resolve(Ljava/lang/Object;)V
    .locals 7

    .line 9
    iget-object v0, p0, Lexpo/modules/kotlin/KPromiseWrapper;->bridgePromise:Lcom/facebook/react/bridge/Promise;

    .line 10
    sget-object v1, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->INSTANCE:Lexpo/modules/kotlin/types/JSTypeConverterProvider;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->convertToJSValue$default(Lexpo/modules/kotlin/types/JSTypeConverterProvider;Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;ZILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public resolve(Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;Ljava/lang/String;)V

    return-void
.end method

.method public resolve(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 6
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;Ljava/util/Collection;)V

    return-void
.end method

.method public resolve(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;Ljava/util/Map;)V

    return-void
.end method

.method public resolve(Z)V
    .locals 0

    .line 8
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->resolve(Lexpo/modules/kotlin/Promise;Z)V

    return-void
.end method
