.class abstract Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "UIThreadOperation"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008\u00a2\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;",
        "",
        "<init>",
        "(Lcom/facebook/react/animated/NativeAnimatedModule;)V",
        "Lcom/facebook/react/animated/NativeAnimatedNodesManager;",
        "animatedNodesManager",
        "Li7/B;",
        "execute",
        "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V",
        "",
        "batchNumber",
        "J",
        "getBatchNumber",
        "()J",
        "setBatchNumber",
        "(J)V",
        "ReactAndroid_release"
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
.field private batchNumber:J

.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method public constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->batchNumber:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V
.end method

.method public final getBatchNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->batchNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final setBatchNumber(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->batchNumber:J

    .line 2
    .line 3
    return-void
.end method
