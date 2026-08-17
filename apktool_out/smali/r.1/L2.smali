.class public final synthetic Lr/L2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/media/ImageWriter$OnImageReleasedListener;


# instance fields
.field public final synthetic a:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/L2;->a:Landroidx/camera/core/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onImageReleased(Landroid/media/ImageWriter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/L2;->a:Landroidx/camera/core/o;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lr/K2$b;->a(Landroidx/camera/core/o;Landroid/media/ImageWriter;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
