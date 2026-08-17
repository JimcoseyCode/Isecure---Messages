.class public final synthetic Ly/a0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/camera/core/e$a;


# instance fields
.field public final synthetic a:Landroidx/camera/core/o;

.field public final synthetic b:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/o;Landroidx/camera/core/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/a0;->a:Landroidx/camera/core/o;

    .line 5
    .line 6
    iput-object p2, p0, Ly/a0;->b:Landroidx/camera/core/o;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly/a0;->a:Landroidx/camera/core/o;

    .line 2
    .line 3
    iget-object v1, p0, Ly/a0;->b:Landroidx/camera/core/o;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Landroidx/camera/core/ImageProcessingUtil;->a(Landroidx/camera/core/o;Landroidx/camera/core/o;Landroidx/camera/core/o;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
