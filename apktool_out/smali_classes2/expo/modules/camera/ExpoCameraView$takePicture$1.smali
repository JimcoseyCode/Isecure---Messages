.class public final Lexpo/modules/camera/ExpoCameraView$takePicture$1;
.super Ly/V$e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/ExpoCameraView;->takePicture(Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/runtime/Runtime;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "expo/modules/camera/ExpoCameraView$takePicture$1",
        "Ly/V$e;",
        "Li7/B;",
        "onCaptureStarted",
        "()V",
        "Landroidx/camera/core/o;",
        "image",
        "onCaptureSuccess",
        "(Landroidx/camera/core/o;)V",
        "Ly/X;",
        "exception",
        "onError",
        "(Ly/X;)V",
        "expo-camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $cacheDirectory:Ljava/io/File;

.field final synthetic $hasShutterSound:Z

.field final synthetic $options:Lexpo/modules/camera/PictureOptions;

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic $runtimeContext:Lexpo/modules/kotlin/runtime/Runtime;

.field final synthetic $volume:I

.field final synthetic this$0:Lexpo/modules/camera/ExpoCameraView;


# direct methods
.method constructor <init>(ZILexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/runtime/Runtime;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$hasShutterSound:Z

    .line 2
    .line 3
    iput p2, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$volume:I

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$options:Lexpo/modules/camera/PictureOptions;

    .line 8
    .line 9
    iput-object p5, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 10
    .line 11
    iput-object p6, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$cacheDirectory:Ljava/io/File;

    .line 12
    .line 13
    iput-object p7, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$runtimeContext:Lexpo/modules/kotlin/runtime/Runtime;

    .line 14
    .line 15
    invoke-direct {p0}, Ly/V$e;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->onCaptureStarted$lambda$1$lambda$0(Lexpo/modules/camera/ExpoCameraView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->onCaptureStarted$lambda$1(Lexpo/modules/camera/ExpoCameraView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final onCaptureStarted$lambda$1(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lexpo/modules/camera/k;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lexpo/modules/camera/k;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    .line 21
    .line 22
    .line 23
    const-wide/16 v2, 0x32

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static final onCaptureStarted$lambda$1$lambda$0(Lexpo/modules/camera/ExpoCameraView;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onCaptureStarted()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$hasShutterSound:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$volume:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/media/MediaActionSound;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/media/MediaActionSound;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/media/MediaActionSound;->play(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 19
    .line 20
    invoke-virtual {v0}, Lexpo/modules/camera/ExpoCameraView;->getAnimateShutter()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 34
    .line 35
    new-instance v2, Lexpo/modules/camera/j;

    .line 36
    .line 37
    invoke-direct {v2, v1}, Lexpo/modules/camera/j;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v3, 0x64

    .line 41
    .line 42
    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public onCaptureSuccess(Landroidx/camera/core/o;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "image"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v2}, Landroidx/camera/core/o;->p()[Landroidx/camera/core/o$a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v3, "getPlanes(...)"

    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzerKt;->toByteArray([Landroidx/camera/core/o$a;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v1, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$options:Lexpo/modules/camera/PictureOptions;

    .line 24
    .line 25
    invoke-virtual {v1}, Lexpo/modules/camera/PictureOptions;->getFastMode()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-interface {v1, v3}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v10, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$cacheDirectory:Ljava/io/File;

    .line 38
    .line 39
    iget-object v5, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->this$0:Lexpo/modules/camera/ExpoCameraView;

    .line 40
    .line 41
    iget-object v7, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 42
    .line 43
    iget-object v8, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$options:Lexpo/modules/camera/PictureOptions;

    .line 44
    .line 45
    iget-object v9, v0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$runtimeContext:Lexpo/modules/kotlin/runtime/Runtime;

    .line 46
    .line 47
    invoke-static {v5}, Lexpo/modules/camera/ExpoCameraView;->access$getScope$p(Lexpo/modules/camera/ExpoCameraView;)LR8/N;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v14, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    move-object v4, v14

    .line 55
    invoke-direct/range {v4 .. v11}, Lexpo/modules/camera/ExpoCameraView$takePicture$1$onCaptureSuccess$1$1;-><init>(Lexpo/modules/camera/ExpoCameraView;[BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/runtime/Runtime;Ljava/io/File;Ln7/f;)V

    .line 56
    .line 57
    .line 58
    const/4 v15, 0x3

    .line 59
    const/16 v16, 0x0

    .line 60
    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    move-object v11, v1

    .line 64
    invoke-static/range {v11 .. v16}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 65
    .line 66
    .line 67
    invoke-interface {v2}, Landroidx/camera/core/o;->close()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public onError(Ly/X;)V
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView$takePicture$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 7
    .line 8
    new-instance v0, Lexpo/modules/camera/CameraExceptions$ImageCaptureFailed;

    .line 9
    .line 10
    invoke-direct {v0}, Lexpo/modules/camera/CameraExceptions$ImageCaptureFailed;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
