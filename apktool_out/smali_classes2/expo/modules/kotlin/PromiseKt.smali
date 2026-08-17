.class public final Lexpo/modules/kotlin/PromiseKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "unknownCode",
        "",
        "toBridgePromise",
        "Lcom/facebook/react/bridge/Promise;",
        "Lexpo/modules/kotlin/Promise;",
        "expo-modules-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final unknownCode:Ljava/lang/String; = "UnknownCode"


# direct methods
.method public static final toBridgePromise(Lexpo/modules/kotlin/Promise;)Lcom/facebook/react/bridge/Promise;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lexpo/modules/kotlin/PromiseKt$toBridgePromise$resolveMethod$1;

    .line 11
    .line 12
    move-object v1, p0

    .line 13
    check-cast v1, Lexpo/modules/kotlin/jni/PromiseImpl;

    .line 14
    .line 15
    invoke-virtual {v1}, Lexpo/modules/kotlin/jni/PromiseImpl;->getCallback$expo_modules_core_release()Lexpo/modules/kotlin/jni/JavaCallback;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/PromiseKt$toBridgePromise$resolveMethod$1;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/PromiseKt$toBridgePromise$resolveMethod$2;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lexpo/modules/kotlin/PromiseKt$toBridgePromise$resolveMethod$2;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    new-instance v1, Lexpo/modules/kotlin/PromiseKt$toBridgePromise$1;

    .line 29
    .line 30
    invoke-direct {v1, v0, p0}, Lexpo/modules/kotlin/PromiseKt$toBridgePromise$1;-><init>(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/Promise;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method
