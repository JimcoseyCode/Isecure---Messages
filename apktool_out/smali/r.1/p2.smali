.class public final synthetic Lr/p2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/a;


# instance fields
.field public final synthetic a:Lr/q2;

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic c:Lt/p;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lr/q2;Landroid/hardware/camera2/CameraDevice;Lt/p;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/p2;->a:Lr/q2;

    .line 5
    .line 6
    iput-object p2, p0, Lr/p2;->b:Landroid/hardware/camera2/CameraDevice;

    .line 7
    .line 8
    iput-object p3, p0, Lr/p2;->c:Lt/p;

    .line 9
    .line 10
    iput-object p4, p0, Lr/p2;->d:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lm5/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lr/p2;->a:Lr/q2;

    .line 2
    .line 3
    iget-object v1, p0, Lr/p2;->b:Landroid/hardware/camera2/CameraDevice;

    .line 4
    .line 5
    iget-object v2, p0, Lr/p2;->c:Lt/p;

    .line 6
    .line 7
    iget-object v3, p0, Lr/p2;->d:Ljava/util/List;

    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, Lr/q2;->I(Lr/q2;Landroid/hardware/camera2/CameraDevice;Lt/p;Ljava/util/List;Ljava/util/List;)Lm5/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
