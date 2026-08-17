.class public interface abstract Lcom/facebook/react/bridge/JSBundleLoaderDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008f\u0018\u00002\u00020\u0001J\'\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\r\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0010\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/bridge/JSBundleLoaderDelegate;",
        "",
        "Landroid/content/res/AssetManager;",
        "assetManager",
        "",
        "assetURL",
        "",
        "loadSynchronously",
        "Li7/B;",
        "loadScriptFromAssets",
        "(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V",
        "fileName",
        "sourceURL",
        "loadScriptFromFile",
        "(Ljava/lang/String;Ljava/lang/String;Z)V",
        "loadSplitBundleFromFile",
        "(Ljava/lang/String;Ljava/lang/String;)V",
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


# virtual methods
.method public abstract loadScriptFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V
.end method

.method public abstract loadScriptFromFile(Ljava/lang/String;Ljava/lang/String;Z)V
.end method

.method public abstract loadSplitBundleFromFile(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract setSourceURLs(Ljava/lang/String;Ljava/lang/String;)V
.end method
