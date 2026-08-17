.class public final Lexpo/modules/kotlin/jni/PromiseImpl;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/Promise;


# annotations
.annotation build Lexpo/modules/core/interfaces/DoNotStrip;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\r\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0012J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0014J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0016J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0018J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u001aJ\u001f\u0010\r\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u001cJ%\u0010\r\u001a\u00020\u00072\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001dH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u001eJ+\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00192\u0008\u0010 \u001a\u0004\u0018\u00010\u00192\u0008\u0010\"\u001a\u0004\u0018\u00010!H\u0016\u00a2\u0006\u0004\u0008#\u0010$J+\u0010*\u001a\u00020\u00072\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0%2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019\u00a2\u0006\u0004\u0008*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010.R$\u0010/\u001a\u00020\u00132\u0006\u0010\u000c\u001a\u00020\u00138\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u001e\u0010\'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105\u00a8\u00066"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/PromiseImpl;",
        "Lexpo/modules/kotlin/Promise;",
        "Lexpo/modules/kotlin/jni/JavaCallback;",
        "callback",
        "<init>",
        "(Lexpo/modules/kotlin/jni/JavaCallback;)V",
        "Lkotlin/Function0;",
        "Li7/B;",
        "body",
        "checkIfWasSettled",
        "(Lw7/a;)V",
        "",
        "value",
        "resolve",
        "(Ljava/lang/Object;)V",
        "()V",
        "",
        "result",
        "(I)V",
        "",
        "(Z)V",
        "",
        "(D)V",
        "",
        "(F)V",
        "",
        "(Ljava/lang/String;)V",
        "",
        "(Ljava/util/Collection;)V",
        "",
        "(Ljava/util/Map;)V",
        "code",
        "message",
        "",
        "cause",
        "reject",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "Ljava/lang/ref/WeakReference;",
        "Lexpo/modules/kotlin/AppContext;",
        "appContextHolder",
        "moduleName",
        "functionName",
        "decorateWithDebugInformation",
        "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;)V",
        "Lexpo/modules/kotlin/jni/JavaCallback;",
        "getCallback$expo_modules_core_release",
        "()Lexpo/modules/kotlin/jni/JavaCallback;",
        "wasSettled",
        "Z",
        "getWasSettled$expo_modules_core_release",
        "()Z",
        "Ljava/lang/ref/WeakReference;",
        "fullFunctionName",
        "Ljava/lang/String;",
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
.field private appContextHolder:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/kotlin/AppContext;",
            ">;"
        }
    .end annotation
.end field

.field private final callback:Lexpo/modules/kotlin/jni/JavaCallback;
    .annotation build Lexpo/modules/core/interfaces/DoNotStrip;
    .end annotation
.end field

.field private fullFunctionName:Ljava/lang/String;

.field private wasSettled:Z


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/JavaCallback;)V
    .locals 1
    .annotation build Lexpo/modules/core/interfaces/DoNotStrip;
    .end annotation

    .line 1
    const-string v0, "callback"

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
    iput-object p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 10
    .line 11
    return-void
.end method

.method private final checkIfWasSettled(Lw7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "unknown"

    .line 12
    .line 13
    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lexpo/modules/kotlin/AppContext;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 29
    .line 30
    .line 31
    :cond_1
    throw p1

    .line 32
    :cond_2
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final decorateWithDebugInformation(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lexpo/modules/kotlin/AppContext;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "appContextHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "moduleName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "functionName"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p2, "."

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method public final getCallback$expo_modules_core_release()Lexpo/modules/kotlin/jni/JavaCallback;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWasSettled$expo_modules_core_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    .line 2
    .line 3
    return v0
.end method

.method public reject(Lexpo/modules/kotlin/exception/CodedException;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/Promise$DefaultImpls;->reject(Lexpo/modules/kotlin/Promise;Lexpo/modules/kotlin/exception/CodedException;)V

    return-void
.end method

.method public reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    const-string v1, "unknown"

    if-eqz v0, :cond_2

    .line 3
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    invoke-direct {p1, v1}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 4
    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lexpo/modules/kotlin/AppContext;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 5
    :cond_1
    throw p1

    .line 6
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    if-nez p2, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    if-nez p2, :cond_4

    move-object p2, v1

    :cond_4
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve()V
    .locals 2

    .line 7
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 8
    new-instance v0, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "unknown"

    :cond_0
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/AppContext;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 10
    :cond_1
    throw v0

    .line 11
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke()V

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(D)V
    .locals 1

    .line 25
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 26
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p2, "unknown"

    :cond_0
    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 27
    iget-object p2, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lexpo/modules/kotlin/AppContext;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 28
    :cond_1
    throw p1

    .line 29
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(D)V

    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(F)V
    .locals 1

    .line 31
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 32
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/AppContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 34
    :cond_1
    throw p1

    .line 35
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(F)V

    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(I)V
    .locals 1

    .line 13
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 14
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/AppContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 16
    :cond_1
    throw p1

    .line 17
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(I)V

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 2
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/AppContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 4
    :cond_1
    throw p1

    .line 5
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(Ljava/lang/String;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 38
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/AppContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 40
    :cond_1
    throw p1

    .line 41
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 44
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/AppContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 46
    :cond_1
    throw p1

    .line 47
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(Ljava/util/Collection;)V

    const/4 p1, 0x1

    .line 48
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(Ljava/util/Map;)V
    .locals 1
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

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 50
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/AppContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 52
    :cond_1
    throw p1

    .line 53
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(Ljava/util/Map;)V

    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method

.method public resolve(Z)V
    .locals 1

    .line 19
    iget-boolean v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    if-eqz v0, :cond_2

    .line 20
    new-instance p1, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;

    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->fullFunctionName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    invoke-direct {p1, v0}, Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;-><init>(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->appContextHolder:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/AppContext;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getJsLogger()Lexpo/modules/core/logging/Logger;

    .line 22
    :cond_1
    throw p1

    .line 23
    :cond_2
    iget-object v0, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->callback:Lexpo/modules/kotlin/jni/JavaCallback;

    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaCallback;->invoke(Z)V

    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lexpo/modules/kotlin/jni/PromiseImpl;->wasSettled:Z

    return-void
.end method
