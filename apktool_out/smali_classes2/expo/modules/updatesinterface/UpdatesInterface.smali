.class public interface abstract Lexpo/modules/updatesinterface/UpdatesInterface;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updatesinterface/UpdatesInterface$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0008\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/updatesinterface/UpdatesInterface;",
        "",
        "isEnabled",
        "",
        "()Z",
        "runtimeVersion",
        "",
        "getRuntimeVersion",
        "()Ljava/lang/String;",
        "updateUrl",
        "Landroid/net/Uri;",
        "getUpdateUrl",
        "()Landroid/net/Uri;",
        "launchedUpdateId",
        "Ljava/util/UUID;",
        "getLaunchedUpdateId",
        "()Ljava/util/UUID;",
        "embeddedUpdateId",
        "getEmbeddedUpdateId",
        "launchAssetPath",
        "getLaunchAssetPath",
        "subscribeToUpdatesStateChanges",
        "Lexpo/modules/updatesinterface/UpdatesStateChangeSubscription;",
        "listener",
        "Lexpo/modules/updatesinterface/UpdatesStateChangeListener;",
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
.method public abstract getEmbeddedUpdateId()Ljava/util/UUID;
.end method

.method public abstract getLaunchAssetPath()Ljava/lang/String;
.end method

.method public abstract getLaunchedUpdateId()Ljava/util/UUID;
.end method

.method public abstract getRuntimeVersion()Ljava/lang/String;
.end method

.method public abstract getUpdateUrl()Landroid/net/Uri;
.end method

.method public abstract isEnabled()Z
.end method

.method public abstract subscribeToUpdatesStateChanges(Lexpo/modules/updatesinterface/UpdatesStateChangeListener;)Lexpo/modules/updatesinterface/UpdatesStateChangeSubscription;
.end method
