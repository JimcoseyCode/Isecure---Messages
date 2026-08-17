.class public interface abstract Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$UpdateCallback;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "UpdateCallback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$UpdateCallback;",
        "",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "e",
        "Li7/B;",
        "onFailure",
        "(Ljava/lang/Exception;)V",
        "Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$Update;",
        "update",
        "onSuccess",
        "(Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$Update;)V",
        "",
        "successfulAssetCount",
        "failedAssetCount",
        "totalAssetCount",
        "onProgress",
        "(III)V",
        "Lorg/json/JSONObject;",
        "manifest",
        "",
        "onManifestLoaded",
        "(Lorg/json/JSONObject;)Z",
        "expo-updates-interface_release"
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
.method public abstract onFailure(Ljava/lang/Exception;)V
.end method

.method public abstract onManifestLoaded(Lorg/json/JSONObject;)Z
.end method

.method public abstract onProgress(III)V
.end method

.method public abstract onSuccess(Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$Update;)V
.end method
