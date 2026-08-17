.class public final synthetic Landroidx/camera/view/B;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroidx/camera/view/D;

.field public final synthetic h:Landroid/view/Surface;

.field public final synthetic i:Lm5/a;

.field public final synthetic j:Ly/I0;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/D;Landroid/view/Surface;Lm5/a;Ly/I0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/camera/view/B;->g:Landroidx/camera/view/D;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/camera/view/B;->h:Landroid/view/Surface;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/camera/view/B;->i:Lm5/a;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/camera/view/B;->j:Ly/I0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/view/B;->g:Landroidx/camera/view/D;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/view/B;->h:Landroid/view/Surface;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/camera/view/B;->i:Lm5/a;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/camera/view/B;->j:Ly/I0;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/camera/view/D;->k(Landroidx/camera/view/D;Landroid/view/Surface;Lm5/a;Ly/I0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
