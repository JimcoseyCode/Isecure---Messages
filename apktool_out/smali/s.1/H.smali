.class public final synthetic Ls/H;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ls/F$b;

.field public final synthetic h:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ls/F$b;Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/H;->g:Ls/F$b;

    .line 5
    .line 6
    iput-object p2, p0, Ls/H;->h:Landroid/hardware/camera2/CameraDevice;

    .line 7
    .line 8
    iput p3, p0, Ls/H;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls/H;->g:Ls/F$b;

    .line 2
    .line 3
    iget-object v1, p0, Ls/H;->h:Landroid/hardware/camera2/CameraDevice;

    .line 4
    .line 5
    iget v2, p0, Ls/H;->i:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ls/F$b;->b(Ls/F$b;Landroid/hardware/camera2/CameraDevice;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
