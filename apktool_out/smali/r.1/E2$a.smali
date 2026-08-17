.class Lr/E2$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lr/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/E2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/E2;


# direct methods
.method constructor <init>(Lr/E2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/E2$a;->a:Lr/E2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/E2$a;->a:Lr/E2;

    .line 2
    .line 3
    iget-object v0, v0, Lr/E2;->e:Lr/E2$b;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr/E2$b;->a(Landroid/hardware/camera2/TotalCaptureResult;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return p1
.end method
