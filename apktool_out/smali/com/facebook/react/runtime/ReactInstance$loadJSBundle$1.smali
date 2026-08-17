.class public final Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/JSBundleLoaderDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactInstance;->loadJSBundle(Lcom/facebook/react/bridge/JSBundleLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u000b\u00a8\u0006\u0014"
    }
    d2 = {
        "com/facebook/react/runtime/ReactInstance$loadJSBundle$1",
        "Lcom/facebook/react/bridge/JSBundleLoaderDelegate;",
        "",
        "fileName",
        "sourceURL",
        "",
        "loadSynchronously",
        "Li7/B;",
        "loadScriptFromFile",
        "(Ljava/lang/String;Ljava/lang/String;Z)V",
        "loadSplitBundleFromFile",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Landroid/content/res/AssetManager;",
        "assetManager",
        "assetURL",
        "loadScriptFromAssets",
        "(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V",
        "deviceURL",
        "remoteURL",
        "setSourceURLs",
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
.field final synthetic this$0:Lcom/facebook/react/runtime/ReactInstance;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;->this$0:Lcom/facebook/react/runtime/ReactInstance;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public loadScriptFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    const-string p3, "assetManager"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "assetURL"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;->this$0:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/facebook/react/runtime/ReactInstance;->access$getContext$p(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/BridgelessReactContext;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3, p2}, Lcom/facebook/react/runtime/BridgelessReactContext;->setSourceURL(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;->this$0:Lcom/facebook/react/runtime/ReactInstance;

    .line 21
    .line 22
    invoke-static {p3, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->access$loadJSBundleFromAssets(Lcom/facebook/react/runtime/ReactInstance;Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public loadScriptFromFile(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    const-string p3, "fileName"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "sourceURL"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;->this$0:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/facebook/react/runtime/ReactInstance;->access$getContext$p(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/BridgelessReactContext;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3, p2}, Lcom/facebook/react/runtime/BridgelessReactContext;->setSourceURL(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;->this$0:Lcom/facebook/react/runtime/ReactInstance;

    .line 21
    .line 22
    invoke-static {p3, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->access$loadJSBundleFromFile(Lcom/facebook/react/runtime/ReactInstance;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public loadSplitBundleFromFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceURL"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;->this$0:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {v0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->access$loadJSBundleFromFile(Lcom/facebook/react/runtime/ReactInstance;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setSourceURLs(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "deviceURL"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "remoteURL"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactInstance$loadJSBundle$1;->this$0:Lcom/facebook/react/runtime/ReactInstance;

    .line 12
    .line 13
    invoke-static {p2}, Lcom/facebook/react/runtime/ReactInstance;->access$getContext$p(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/BridgelessReactContext;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2, p1}, Lcom/facebook/react/runtime/BridgelessReactContext;->setSourceURL(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
