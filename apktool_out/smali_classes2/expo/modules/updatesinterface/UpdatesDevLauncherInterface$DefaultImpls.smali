.class public final Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface$DefaultImpls;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getEmbeddedUpdateId(Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface;)Ljava/util/UUID;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updatesinterface/UpdatesInterface$DefaultImpls;->getEmbeddedUpdateId(Lexpo/modules/updatesinterface/UpdatesInterface;)Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static getLaunchAssetPath(Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updatesinterface/UpdatesInterface$DefaultImpls;->getLaunchAssetPath(Lexpo/modules/updatesinterface/UpdatesInterface;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static getLaunchedUpdateId(Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface;)Ljava/util/UUID;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updatesinterface/UpdatesInterface$DefaultImpls;->getLaunchedUpdateId(Lexpo/modules/updatesinterface/UpdatesInterface;)Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static isEnabled(Lexpo/modules/updatesinterface/UpdatesDevLauncherInterface;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updatesinterface/UpdatesInterface$DefaultImpls;->isEnabled(Lexpo/modules/updatesinterface/UpdatesInterface;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
