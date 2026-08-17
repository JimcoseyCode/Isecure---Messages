.class public final Lcom/facebook/react/animated/NativeAnimatedModule$disconnectAnimatedNodeFromView$1;
.super Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->disconnectAnimatedNodeFromView(DD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00060\u0001R\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "com/facebook/react/animated/NativeAnimatedModule$disconnectAnimatedNodeFromView$1",
        "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;",
        "Lcom/facebook/react/animated/NativeAnimatedModule;",
        "Lcom/facebook/react/animated/NativeAnimatedNodesManager;",
        "animatedNodesManager",
        "Li7/B;",
        "execute",
        "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V",
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
.field final synthetic $animatedNodeTag:I

.field final synthetic $viewTag:I


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;II)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$disconnectAnimatedNodeFromView$1;->$animatedNodeTag:I

    .line 2
    .line 3
    iput p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$disconnectAnimatedNodeFromView$1;->$viewTag:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V
    .locals 2

    .line 1
    const-string v0, "animatedNodesManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$disconnectAnimatedNodeFromView$1;->$animatedNodeTag:I

    .line 7
    .line 8
    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$disconnectAnimatedNodeFromView$1;->$viewTag:I

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->disconnectAnimatedNodeFromView(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
