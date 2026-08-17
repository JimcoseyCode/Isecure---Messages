.class public final Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;
.super Landroid/view/OrientationEventListener;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/ExpoCameraView;-><init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "expo/modules/camera/ExpoCameraView$orientationEventListener$2$1",
        "Landroid/view/OrientationEventListener;",
        "",
        "orientation",
        "Li7/B;",
        "onOrientationChanged",
        "(I)V",
        "expo-camera_release"
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
.field final synthetic this$0:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method constructor <init>(Lexpo/modules/camera/ExpoCameraView;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    const/16 v0, 0x2d

    .line 6
    .line 7
    const/16 v1, 0x87

    .line 8
    .line 9
    if-gt v0, p1, :cond_1

    .line 10
    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x3

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/16 v0, 0xe1

    .line 16
    .line 17
    if-gt v1, p1, :cond_2

    .line 18
    .line 19
    if-ge p1, v0, :cond_2

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    if-gt v0, p1, :cond_3

    .line 24
    .line 25
    const/16 v0, 0x13b

    .line 26
    .line 27
    if-ge p1, v0, :cond_3

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_3
    const/4 p1, 0x0

    .line 32
    :goto_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 33
    .line 34
    invoke-static {v0}, Lexpo/modules/camera/ExpoCameraView;->access$getImageAnalysisUseCase$p(Lexpo/modules/camera/ExpoCameraView;)Landroidx/camera/core/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroidx/camera/core/g;->u0(I)V

    .line 41
    .line 42
    .line 43
    :cond_4
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 44
    .line 45
    invoke-static {v0}, Lexpo/modules/camera/ExpoCameraView;->access$getImageCaptureUseCase$p(Lexpo/modules/camera/ExpoCameraView;)Ly/V;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ly/V;->Q0(I)V

    .line 52
    .line 53
    .line 54
    :cond_5
    :goto_1
    return-void
.end method
