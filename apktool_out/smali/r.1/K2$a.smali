.class Lr/K2$a;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/K2;->b(LF/k1$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/K2$b;

.field final synthetic b:Lr/K2;


# direct methods
.method constructor <init>(Lr/K2;Lr/K2$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/K2$a;->b:Lr/K2;

    .line 2
    .line 3
    iput-object p2, p0, Lr/K2$a;->a:Lr/K2$b;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraCaptureSession;->getInputSurface()Landroid/view/Surface;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lr/K2$a;->a:Lr/K2$b;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {p1, v1}, LL/a;->c(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lr/K2$b;->d(Landroid/media/ImageWriter;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
