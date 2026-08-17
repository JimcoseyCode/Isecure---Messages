.class public final Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevSupportManagerBase;->fetchSplitBundleAndCreateBundleLoader(Ljava/lang/String;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J-\u0010\n\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u000cj\u0002`\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "com/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1",
        "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;",
        "Li7/B;",
        "onSuccess",
        "()V",
        "",
        "status",
        "",
        "done",
        "total",
        "onProgress",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "cause",
        "onFailure",
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
.field final synthetic $bundleFile:Ljava/io/File;

.field final synthetic $bundleUrl:Ljava/lang/String;

.field final synthetic $callback:Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;

.field final synthetic this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$bundleUrl:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$bundleFile:Ljava/io/File;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$callback:Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->onFailure$lambda$1(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->onSuccess$lambda$0(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final onFailure$lambda$1(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$hideSplitBundleDevLoadingView(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final onSuccess$lambda$0(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$hideSplitBundleDevLoadingView(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "cause"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 7
    .line 8
    new-instance v1, Lcom/facebook/react/devsupport/T;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/facebook/react/devsupport/T;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$callback:Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$bundleUrl:Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {v0, v1, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;->onError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onProgress(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getDevLoadingViewManager()Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;->updateProgress(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public onSuccess()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 2
    .line 3
    new-instance v1, Lcom/facebook/react/devsupport/S;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lcom/facebook/react/devsupport/S;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$bundleUrl:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$bundleFile:Ljava/io/File;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "getAbsolutePath(...)"

    .line 37
    .line 38
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createCachedSplitBundleFromNetworkLoader(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;->$callback:Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;

    .line 46
    .line 47
    invoke-interface {v1, v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;->onSuccess(Lcom/facebook/react/bridge/JSBundleLoader;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
.end method
