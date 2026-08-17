.class public final Lcom/margelo/nitro/utils/ThreadUtils;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/margelo/nitro/utils/ThreadUtils$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/margelo/nitro/utils/ThreadUtils;",
        "",
        "<init>",
        "()V",
        "Companion",
        "react-native-nitro-modules_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lq3/a;
.end annotation


# static fields
.field public static final Companion:Lcom/margelo/nitro/utils/ThreadUtils$Companion;

.field private static final handler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/margelo/nitro/utils/ThreadUtils$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/margelo/nitro/utils/ThreadUtils$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/margelo/nitro/utils/ThreadUtils;->Companion:Lcom/margelo/nitro/utils/ThreadUtils$Companion;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/margelo/nitro/utils/ThreadUtils;->handler:Landroid/os/Handler;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getHandler$cp()Landroid/os/Handler;
    .locals 1

    .line 1
    sget-object v0, Lcom/margelo/nitro/utils/ThreadUtils;->handler:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getCurrentThreadName()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lq3/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/margelo/nitro/utils/ThreadUtils;->Companion:Lcom/margelo/nitro/utils/ThreadUtils$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/margelo/nitro/utils/ThreadUtils$Companion;->getCurrentThreadName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final isOnUIThread()Z
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lq3/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/margelo/nitro/utils/ThreadUtils;->Companion:Lcom/margelo/nitro/utils/ThreadUtils$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/margelo/nitro/utils/ThreadUtils$Companion;->isOnUIThread()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final runOnUIThread(Ljava/lang/Runnable;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lq3/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/margelo/nitro/utils/ThreadUtils;->Companion:Lcom/margelo/nitro/utils/ThreadUtils$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/margelo/nitro/utils/ThreadUtils$Companion;->runOnUIThread(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final setCurrentThreadName(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lq3/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/margelo/nitro/utils/ThreadUtils;->Companion:Lcom/margelo/nitro/utils/ThreadUtils$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/margelo/nitro/utils/ThreadUtils$Companion;->setCurrentThreadName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
