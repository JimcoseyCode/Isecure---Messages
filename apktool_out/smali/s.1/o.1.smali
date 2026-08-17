.class public final synthetic Ls/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ls/i$b;

.field public final synthetic h:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic i:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic j:Landroid/view/Surface;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Ls/i$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/o;->g:Ls/i$b;

    .line 5
    .line 6
    iput-object p2, p0, Ls/o;->h:Landroid/hardware/camera2/CameraCaptureSession;

    .line 7
    .line 8
    iput-object p3, p0, Ls/o;->i:Landroid/hardware/camera2/CaptureRequest;

    .line 9
    .line 10
    iput-object p4, p0, Ls/o;->j:Landroid/view/Surface;

    .line 11
    .line 12
    iput-wide p5, p0, Ls/o;->k:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Ls/o;->g:Ls/i$b;

    .line 2
    .line 3
    iget-object v1, p0, Ls/o;->h:Landroid/hardware/camera2/CameraCaptureSession;

    .line 4
    .line 5
    iget-object v2, p0, Ls/o;->i:Landroid/hardware/camera2/CaptureRequest;

    .line 6
    .line 7
    iget-object v3, p0, Ls/o;->j:Landroid/view/Surface;

    .line 8
    .line 9
    iget-wide v4, p0, Ls/o;->k:J

    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Ls/i$b;->e(Ls/i$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
