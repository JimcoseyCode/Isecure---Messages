.class public final Lexpo/modules/camera/CameraViewModuleKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0006\"\u0019\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0003\u0010\u0004\"\u0019\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "cameraEvents",
        "",
        "",
        "getCameraEvents",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "cameraPermissions",
        "getCameraPermissions",
        "expo-camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final cameraEvents:[Ljava/lang/String;

.field private static final cameraPermissions:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v5, "onPictureSaved"

    .line 2
    .line 3
    const-string v6, "onAvailableLensesChanged"

    .line 4
    .line 5
    const-string v0, "onCameraReady"

    .line 6
    .line 7
    const-string v1, "onMountError"

    .line 8
    .line 9
    const-string v2, "onBarcodeScanned"

    .line 10
    .line 11
    const-string v3, "onFacesDetected"

    .line 12
    .line 13
    const-string v4, "onFaceDetectionError"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraEvents:[Ljava/lang/String;

    .line 20
    .line 21
    sget-object v0, Lexpo/modules/core/utilities/VRUtilities;->Companion:Lexpo/modules/core/utilities/VRUtilities$Companion;

    .line 22
    .line 23
    invoke-virtual {v0}, Lexpo/modules/core/utilities/VRUtilities$Companion;->isQuest()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    const-string v2, "android.permission.CAMERA"

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    new-array v0, v0, [Ljava/lang/String;

    .line 35
    .line 36
    aput-object v2, v0, v3

    .line 37
    .line 38
    const-string v2, "horizonos.permission.HEADSET_CAMERA"

    .line 39
    .line 40
    aput-object v2, v0, v1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-array v0, v1, [Ljava/lang/String;

    .line 44
    .line 45
    aput-object v2, v0, v3

    .line 46
    .line 47
    :goto_0
    sput-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraPermissions:[Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method

.method public static final getCameraEvents()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraEvents:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getCameraPermissions()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/camera/CameraViewModuleKt;->cameraPermissions:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
