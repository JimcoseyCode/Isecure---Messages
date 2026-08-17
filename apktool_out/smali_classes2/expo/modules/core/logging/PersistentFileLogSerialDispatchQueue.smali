.class public final Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00052\u0010\u0010\u0007\u001a\u000c\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u0003R$\u0010\u000c\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u0012\u0004\u0008\u0011\u0010\u0003\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function0;",
        "Li7/B;",
        "Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueueBlock;",
        "block",
        "add",
        "(Lw7/a;)V",
        "stop",
        "LT8/g;",
        "channel",
        "LT8/g;",
        "LR8/A0;",
        "queueRunner",
        "LR8/A0;",
        "getQueueRunner$annotations",
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
.field private final channel:LT8/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LT8/g;"
        }
    .end annotation
.end field

.field private final queueRunner:LR8/A0;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    const/4 v1, -0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2, v2, v0, v2}, LT8/j;->b(ILT8/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LT8/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;->channel:LT8/g;

    .line 12
    .line 13
    sget-object v3, LR8/t0;->g:LR8/t0;

    .line 14
    .line 15
    new-instance v6, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue$queueRunner$1;

    .line 16
    .line 17
    invoke-direct {v6, p0, v2}, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue$queueRunner$1;-><init>(Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;Ln7/f;)V

    .line 18
    .line 19
    .line 20
    const/4 v7, 0x3

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-static/range {v3 .. v8}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;->queueRunner:LR8/A0;

    .line 29
    .line 30
    return-void
.end method

.method public static final synthetic access$getChannel$p(Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;)LT8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;->channel:LT8/g;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic getQueueRunner$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final add(Lw7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue$add$1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue$add$1;-><init>(Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;Lw7/a;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-static {v1, v0, p1, v1}, LR8/i;->f(Ln7/j;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;->queueRunner:LR8/A0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, LR8/A0$a;->a(LR8/A0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
