.class public final synthetic Lr/i1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/a;


# instance fields
.field public final synthetic a:Lr/l1;

.field public final synthetic b:LF/k1;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(Lr/l1;LF/k1;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/i1;->a:Lr/l1;

    .line 5
    .line 6
    iput-object p2, p0, Lr/i1;->b:LF/k1;

    .line 7
    .line 8
    iput-object p3, p0, Lr/i1;->c:Landroid/hardware/camera2/CameraDevice;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lm5/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lr/i1;->a:Lr/l1;

    .line 2
    .line 3
    iget-object v1, p0, Lr/i1;->b:LF/k1;

    .line 4
    .line 5
    iget-object v2, p0, Lr/i1;->c:Landroid/hardware/camera2/CameraDevice;

    .line 6
    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Lr/l1;->l(Lr/l1;LF/k1;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lm5/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
