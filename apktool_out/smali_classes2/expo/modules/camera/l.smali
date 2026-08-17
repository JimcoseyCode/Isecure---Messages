.class public final synthetic Lexpo/modules/camera/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/camera/tasks/PictureSavedDelegate;


# instance fields
.field public final synthetic a:Lexpo/modules/camera/PictureOptions;

.field public final synthetic b:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/camera/l;->a:Lexpo/modules/camera/PictureOptions;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/camera/l;->b:Lexpo/modules/camera/ExpoCameraView;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onPictureSaved(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/l;->a:Lexpo/modules/camera/PictureOptions;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/camera/l;->b:Lexpo/modules/camera/ExpoCameraView;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;->c(Lexpo/modules/camera/PictureOptions;Lexpo/modules/camera/ExpoCameraView;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
