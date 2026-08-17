.class public final Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactHostImpl;->loadJSBundleFromMetro()Lcom/facebook/react/runtime/internal/bolts/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0008\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "com/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1",
        "Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;",
        "Li7/B;",
        "onSuccess",
        "()V",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "cause",
        "onError",
        "(Ljava/lang/Exception;)V",
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
.field final synthetic $asyncDevSupportManager:Lcom/facebook/react/devsupport/DevSupportManagerBase;

.field final synthetic $bundleURL:Ljava/lang/String;

.field final synthetic $method:Ljava/lang/String;

.field final synthetic $taskCompletionSource:Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource<",
            "Lcom/facebook/react/bridge/JSBundleLoader;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/runtime/ReactHostImpl;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/devsupport/DevSupportManagerBase;",
            "Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource<",
            "Lcom/facebook/react/bridge/JSBundleLoader;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->this$0:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$method:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$bundleURL:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$asyncDevSupportManager:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$taskCompletionSource:Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "cause"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$taskCompletionSource:Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;->setError(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onSuccess()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->this$0:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->access$getStateTracker$p(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/runtime/ReactHostStateTracker;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$method:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "Creating BundleLoader"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/runtime/ReactHostStateTracker;->enterState(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$bundleURL:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$asyncDevSupportManager:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getDownloadedJSBundleFile()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createCachedBundleFromNetworkLoader(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$loadJSBundleFromMetro$1;->$taskCompletionSource:Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lcom/facebook/react/runtime/internal/bolts/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
