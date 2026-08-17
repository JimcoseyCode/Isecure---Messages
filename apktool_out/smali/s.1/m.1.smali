.class public final synthetic Ls/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ls/i$b;

.field public final synthetic h:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic i:I

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Ls/i$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/m;->g:Ls/i$b;

    .line 5
    .line 6
    iput-object p2, p0, Ls/m;->h:Landroid/hardware/camera2/CameraCaptureSession;

    .line 7
    .line 8
    iput p3, p0, Ls/m;->i:I

    .line 9
    .line 10
    iput-wide p4, p0, Ls/m;->j:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Ls/m;->g:Ls/i$b;

    .line 2
    .line 3
    iget-object v1, p0, Ls/m;->h:Landroid/hardware/camera2/CameraCaptureSession;

    .line 4
    .line 5
    iget v2, p0, Ls/m;->i:I

    .line 6
    .line 7
    iget-wide v3, p0, Ls/m;->j:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Ls/i$b;->d(Ls/i$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
