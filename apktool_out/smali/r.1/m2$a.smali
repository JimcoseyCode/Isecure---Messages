.class Lr/m2$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/m2;->o(Landroid/hardware/camera2/CameraDevice;Lt/p;Ljava/util/List;)Lm5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/m2;


# direct methods
.method constructor <init>(Lr/m2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/m2$a;->a:Lr/m2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lr/m2$a;->a:Lr/m2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr/m2;->e()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr/m2$a;->a:Lr/m2;

    .line 7
    .line 8
    iget-object v0, p1, Lr/m2;->b:Lr/p1;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lr/p1;->i(Lr/g2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr/m2$a;->a(Ljava/lang/Void;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
