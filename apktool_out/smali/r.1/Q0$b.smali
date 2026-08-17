.class public final Lr/Q0$b;
.super Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/Q0;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/Q0;


# direct methods
.method constructor <init>(Lr/Q0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/Q0$b;->a:Lr/Q0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onCameraAccessPrioritiesChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/Q0$b;->a:Lr/Q0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr/Q0;->d()Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lr/Q0;->n(Lr/Q0;Lm5/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onCameraAvailable(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "cameraId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr/Q0$b;->a:Lr/Q0;

    .line 7
    .line 8
    invoke-virtual {p1}, Lr/Q0;->d()Lm5/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1, v0}, Lr/Q0;->n(Lr/Q0;Lm5/a;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onCameraUnavailable(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "cameraId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr/Q0$b;->a:Lr/Q0;

    .line 7
    .line 8
    invoke-virtual {p1}, Lr/Q0;->d()Lm5/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1, v0}, Lr/Q0;->n(Lr/Q0;Lm5/a;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
