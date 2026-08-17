.class public final synthetic Lr/G1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lr/y$c;


# instance fields
.field public final synthetic a:Lr/K1;

.field public final synthetic b:J

.field public final synthetic c:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Lr/K1;JLandroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/G1;->a:Lr/K1;

    .line 5
    .line 6
    iput-wide p2, p0, Lr/G1;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lr/G1;->c:Landroidx/concurrent/futures/c$a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr/G1;->a:Lr/K1;

    .line 2
    .line 3
    iget-wide v1, p0, Lr/G1;->b:J

    .line 4
    .line 5
    iget-object v3, p0, Lr/G1;->c:Landroidx/concurrent/futures/c$a;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3, p1}, Lr/K1;->i(Lr/K1;JLandroidx/concurrent/futures/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
