.class public abstract Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;
.super Lexpo/modules/kotlin/functions/AnyFunction;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000b\u0010\u000fR\"\u0010\n\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "Lexpo/modules/kotlin/functions/AnyFunction;",
        "",
        "name",
        "",
        "Lexpo/modules/kotlin/types/AnyType;",
        "desiredArgsTypes",
        "<init>",
        "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V",
        "Lexpo/modules/kotlin/functions/Queues;",
        "queue",
        "runOnQueue",
        "(Lexpo/modules/kotlin/functions/Queues;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "LR8/N;",
        "scope",
        "(LR8/N;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "Lexpo/modules/kotlin/functions/FunctionQueue;",
        "Lexpo/modules/kotlin/functions/FunctionQueue;",
        "getQueue",
        "()Lexpo/modules/kotlin/functions/FunctionQueue;",
        "setQueue",
        "(Lexpo/modules/kotlin/functions/FunctionQueue;)V",
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
.field private queue:Lexpo/modules/kotlin/functions/FunctionQueue;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "desiredArgsTypes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/functions/AnyFunction;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lexpo/modules/kotlin/functions/Queues;->DEFAULT:Lexpo/modules/kotlin/functions/Queues;

    .line 15
    .line 16
    iput-object p1, p0, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->queue:Lexpo/modules/kotlin/functions/FunctionQueue;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method protected final getQueue()Lexpo/modules/kotlin/functions/FunctionQueue;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->queue:Lexpo/modules/kotlin/functions/FunctionQueue;

    .line 2
    .line 3
    return-object v0
.end method

.method public final runOnQueue(LR8/N;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/kotlin/functions/CustomQueue;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/functions/CustomQueue;-><init>(LR8/N;)V

    iput-object v0, p0, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->queue:Lexpo/modules/kotlin/functions/FunctionQueue;

    return-object p0
.end method

.method public final runOnQueue(Lexpo/modules/kotlin/functions/Queues;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;
    .locals 1

    const-string v0, "queue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->queue:Lexpo/modules/kotlin/functions/FunctionQueue;

    return-object p0
.end method

.method protected final setQueue(Lexpo/modules/kotlin/functions/FunctionQueue;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->queue:Lexpo/modules/kotlin/functions/FunctionQueue;

    .line 7
    .line 8
    return-void
.end method
