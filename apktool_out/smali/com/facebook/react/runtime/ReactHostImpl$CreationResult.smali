.class final Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/runtime/ReactHostImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CreationResult"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;",
        "",
        "instance",
        "Lcom/facebook/react/runtime/ReactInstance;",
        "context",
        "Lcom/facebook/react/bridge/ReactContext;",
        "isReloading",
        "",
        "<init>",
        "(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/ReactContext;Z)V",
        "getInstance",
        "()Lcom/facebook/react/runtime/ReactInstance;",
        "getContext",
        "()Lcom/facebook/react/bridge/ReactContext;",
        "()Z",
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
.field private final context:Lcom/facebook/react/bridge/ReactContext;

.field private final instance:Lcom/facebook/react/runtime/ReactInstance;

.field private final isReloading:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/ReactContext;Z)V
    .locals 1

    .line 1
    const-string v0, "instance"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;->instance:Lcom/facebook/react/runtime/ReactInstance;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;->context:Lcom/facebook/react/bridge/ReactContext;

    .line 17
    .line 18
    iput-boolean p3, p0, Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;->isReloading:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final getContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;->context:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInstance()Lcom/facebook/react/runtime/ReactInstance;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;->instance:Lcom/facebook/react/runtime/ReactInstance;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isReloading()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;->isReloading:Z

    .line 2
    .line 3
    return v0
.end method
