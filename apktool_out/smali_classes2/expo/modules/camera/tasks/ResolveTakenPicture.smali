.class public final Lexpo/modules/camera/tasks/ResolveTakenPicture;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0010\u000c\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\'\u0010#\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0004\u0008\'\u0010(R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010)R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010*R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010+R\u0016\u0010\t\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010,R\u0018\u0010\u000c\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010.R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010/R\u0014\u00102\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u00101\u00a8\u00063"
    }
    d2 = {
        "Lexpo/modules/camera/tasks/ResolveTakenPicture;",
        "",
        "",
        "imageData",
        "Lexpo/modules/kotlin/Promise;",
        "promise",
        "Lexpo/modules/camera/PictureOptions;",
        "options",
        "",
        "mirror",
        "Lexpo/modules/kotlin/runtime/Runtime;",
        "Lexpo/modules/kotlin/RuntimeContext;",
        "runtimeContext",
        "Ljava/io/File;",
        "directory",
        "Lexpo/modules/camera/tasks/PictureSavedDelegate;",
        "pictureSavedDelegate",
        "<init>",
        "([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;ZLexpo/modules/kotlin/runtime/Runtime;Ljava/io/File;Lexpo/modules/camera/tasks/PictureSavedDelegate;)V",
        "Landroid/os/Bundle;",
        "processImage",
        "()Landroid/os/Bundle;",
        "skipProcessing",
        "response",
        "Li7/B;",
        "onComplete",
        "(Landroid/os/Bundle;)V",
        "",
        "orientation",
        "Landroid/graphics/BitmapFactory$Options;",
        "bitmapOptions",
        "Landroid/graphics/Bitmap;",
        "decodeBitmap",
        "([BILexpo/modules/camera/PictureOptions;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;",
        "angle",
        "decodeAndRotateBitmap",
        "([BILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;",
        "getImageRotation",
        "(I)I",
        "resolve",
        "(Ln7/f;)Ljava/lang/Object;",
        "[B",
        "Lexpo/modules/kotlin/Promise;",
        "Lexpo/modules/camera/PictureOptions;",
        "Z",
        "Lexpo/modules/kotlin/runtime/Runtime;",
        "Ljava/io/File;",
        "Lexpo/modules/camera/tasks/PictureSavedDelegate;",
        "getQuality",
        "()I",
        "quality",
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
.field private final directory:Ljava/io/File;

.field private imageData:[B

.field private mirror:Z

.field private options:Lexpo/modules/camera/PictureOptions;

.field private pictureSavedDelegate:Lexpo/modules/camera/tasks/PictureSavedDelegate;

.field private promise:Lexpo/modules/kotlin/Promise;

.field private final runtimeContext:Lexpo/modules/kotlin/runtime/Runtime;


# direct methods
.method public constructor <init>([BLexpo/modules/kotlin/Promise;Lexpo/modules/camera/PictureOptions;ZLexpo/modules/kotlin/runtime/Runtime;Ljava/io/File;Lexpo/modules/camera/tasks/PictureSavedDelegate;)V
    .locals 1

    .line 1
    const-string v0, "imageData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "options"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "runtimeContext"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "directory"

    .line 22
    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "pictureSavedDelegate"

    .line 27
    .line 28
    invoke-static {p7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    .line 35
    .line 36
    iput-object p2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 37
    .line 38
    iput-object p3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 39
    .line 40
    iput-boolean p4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    .line 41
    .line 42
    iput-object p5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->runtimeContext:Lexpo/modules/kotlin/runtime/Runtime;

    .line 43
    .line 44
    iput-object p6, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->directory:Ljava/io/File;

    .line 45
    .line 46
    iput-object p7, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->pictureSavedDelegate:Lexpo/modules/camera/tasks/PictureSavedDelegate;

    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic access$getOptions$p(Lexpo/modules/camera/tasks/ResolveTakenPicture;)Lexpo/modules/camera/PictureOptions;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$onComplete(Lexpo/modules/camera/tasks/ResolveTakenPicture;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->onComplete(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$processImage(Lexpo/modules/camera/tasks/ResolveTakenPicture;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->processImage()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final decodeAndRotateBitmap([BILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    array-length v1, p1

    .line 3
    invoke-static {p1, v0, v1, p3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    new-instance v7, Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 20
    .line 21
    .line 22
    int-to-float p1, p2

    .line 23
    invoke-virtual {v7, p1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 24
    .line 25
    .line 26
    iget-boolean p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const/high16 p1, -0x40800000    # -1.0f

    .line 31
    .line 32
    const/high16 p2, 0x3f800000    # 1.0f

    .line 33
    .line 34
    invoke-virtual {v7, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const/4 v8, 0x1

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string p2, "createBitmap(...)"

    .line 53
    .line 54
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-nez p2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-nez p2, :cond_2

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    :cond_2
    return-object p1

    .line 73
    :catch_0
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object v2
.end method

.method private final decodeBitmap([BILexpo/modules/camera/PictureOptions;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-virtual {p3}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->getImageRotation(I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-direct {p0, p1, p2, p4}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->decodeAndRotateBitmap([BILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p2, 0x0

    .line 17
    array-length p3, p1

    .line 18
    invoke-static {p1, p2, p3, p4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method private final getImageRotation(I)I
    .locals 3

    .line 1
    const/16 v0, 0xb4

    .line 2
    .line 3
    const/16 v1, 0x5a

    .line 4
    .line 5
    const/16 v2, 0x10e

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :pswitch_0
    return v2

    .line 13
    :pswitch_1
    return v1

    .line 14
    :pswitch_2
    return v0

    .line 15
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final getQuality()I
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getQuality()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const/16 v2, 0x64

    .line 8
    .line 9
    int-to-double v2, v2

    .line 10
    mul-double/2addr v0, v2

    .line 11
    double-to-int v0, v0

    .line 12
    return v0
.end method

.method private final onComplete(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 5
    .line 6
    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getFastMode()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    new-instance v0, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 18
    .line 19
    invoke-virtual {v1}, Lexpo/modules/camera/PictureOptions;->getId()Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const-string v2, "id"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    const-string v1, "data"

    .line 35
    .line 36
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->pictureSavedDelegate:Lexpo/modules/camera/tasks/PictureSavedDelegate;

    .line 40
    .line 41
    invoke-interface {p1, v0}, Lexpo/modules/camera/tasks/PictureSavedDelegate;->onPictureSaved(Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    const-string v0, "Required value was null."

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private final processImage()Landroid/os/Bundle;
    .locals 11

    .line 1
    const-string v0, "Orientation"

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 4
    .line 5
    invoke-virtual {v1}, Lexpo/modules/camera/PictureOptions;->getSkipProcessing()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->skipProcessing()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 18
    .line 19
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    .line 23
    .line 24
    :try_start_1
    new-instance v3, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v4, LX0/a;

    .line 30
    .line 31
    invoke-direct {v4, v2}, LX0/a;-><init>(Ljava/io/InputStream;)V

    .line 32
    .line 33
    .line 34
    iget-object v5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 35
    .line 36
    invoke-virtual {v5}, Lexpo/modules/camera/PictureOptions;->getAdditionalExif()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-static {v4, v5}, Lexpo/modules/camera/utils/CameraViewHelper;->setExifData(LX0/a;Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 50
    invoke-virtual {v4, v0, v5}, LX0/a;->m(Ljava/lang/String;I)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    iget-boolean v7, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->mirror:Z

    .line 55
    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    invoke-static {v6}, Lexpo/modules/camera/tasks/ResolveTakenPictureKt;->getMirroredOrientation(I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v4, v0, v7}, LX0/a;->f0(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 70
    .line 71
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 72
    .line 73
    .line 74
    iput v5, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 75
    .line 76
    new-instance v5, Lkotlin/jvm/internal/C;

    .line 77
    .line 78
    invoke-direct {v5}, Lkotlin/jvm/internal/C;-><init>()V

    .line 79
    .line 80
    .line 81
    move-object v7, v1

    .line 82
    :goto_1
    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 83
    .line 84
    iget-object v9, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 85
    .line 86
    invoke-virtual {v9}, Lexpo/modules/camera/PictureOptions;->getMaxDownsampling()I

    .line 87
    .line 88
    .line 89
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    const/4 v10, 0x2

    .line 91
    if-gt v8, v9, :cond_3

    .line 92
    .line 93
    :try_start_2
    iget-object v8, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    .line 94
    .line 95
    iget-object v9, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 96
    .line 97
    invoke-direct {p0, v8, v6, v9, v0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->decodeBitmap([BILexpo/modules/camera/PictureOptions;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    iput-object v8, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catch_0
    move-exception v7

    .line 105
    :try_start_3
    iget v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 106
    .line 107
    mul-int/2addr v8, v10

    .line 108
    iput v8, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    :goto_2
    iget-object v0, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 112
    .line 113
    if-nez v0, :cond_4

    .line 114
    .line 115
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 116
    .line 117
    const-string v3, "ERR_CAMERA_OUT_OF_MEMORY"

    .line 118
    .line 119
    const-string v4, "Cannot allocate enough space to process the taken picture."

    .line 120
    .line 121
    invoke-interface {v0, v3, v4, v7}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    .line 123
    .line 124
    :try_start_4
    invoke-static {v2, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    :catch_1
    move-exception v0

    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_4
    :try_start_5
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 132
    .line 133
    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-static {v4}, Lexpo/modules/camera/utils/CameraViewHelper;->getExifData(LX0/a;)Landroid/os/Bundle;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v6, "exif"

    .line 144
    .line 145
    invoke-virtual {v3, v6, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 146
    .line 147
    .line 148
    :cond_5
    const-string v0, "width"

    .line 149
    .line 150
    iget-object v6, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, Landroid/graphics/Bitmap;

    .line 153
    .line 154
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-virtual {v3, v0, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    const-string v0, "height"

    .line 162
    .line 163
    iget-object v6, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v6, Landroid/graphics/Bitmap;

    .line 166
    .line 167
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    invoke-virtual {v3, v0, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 175
    .line 176
    invoke-virtual {v0}, Lexpo/modules/camera/PictureOptions;->getPictureRef()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    iget-object v0, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 183
    .line 184
    new-instance v4, Lexpo/modules/camera/PictureRef;

    .line 185
    .line 186
    iget-object v5, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v5, Landroid/graphics/Bitmap;

    .line 189
    .line 190
    iget-object v6, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->runtimeContext:Lexpo/modules/kotlin/runtime/Runtime;

    .line 191
    .line 192
    invoke-direct {v4, v5, v6}, Lexpo/modules/camera/PictureRef;-><init>(Landroid/graphics/Bitmap;Lexpo/modules/kotlin/runtime/Runtime;)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v0, v4}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 196
    .line 197
    .line 198
    :try_start_6
    invoke-static {v2, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 199
    .line 200
    .line 201
    goto/16 :goto_4

    .line 202
    .line 203
    :cond_6
    :try_start_7
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 204
    .line 205
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 206
    .line 207
    .line 208
    :try_start_8
    iget-object v6, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 209
    .line 210
    invoke-virtual {v6}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    sget-object v7, Lexpo/modules/camera/PictureFormat;->PNG:Lexpo/modules/camera/PictureFormat;

    .line 215
    .line 216
    if-ne v6, v7, :cond_7

    .line 217
    .line 218
    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :catchall_1
    move-exception v3

    .line 222
    goto :goto_5

    .line 223
    :cond_7
    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 224
    .line 225
    :goto_3
    iget-object v7, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v7, Landroid/graphics/Bitmap;

    .line 228
    .line 229
    invoke-direct {p0}, Lexpo/modules/camera/tasks/ResolveTakenPicture;->getQuality()I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    invoke-virtual {v7, v6, v8, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 234
    .line 235
    .line 236
    iget-object v6, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->directory:Ljava/io/File;

    .line 237
    .line 238
    iget-object v7, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 239
    .line 240
    invoke-virtual {v7}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-virtual {v7}, Lexpo/modules/camera/PictureFormat;->toExtension()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    invoke-static {v6, v0, v7}, Lexpo/modules/camera/tasks/ResolveTakenPictureKt;->writeStreamToFile(Ljava/io/File;Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    iget-object v5, v5, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v5, Landroid/graphics/Bitmap;

    .line 255
    .line 256
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 257
    .line 258
    .line 259
    iget-object v5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 260
    .line 261
    invoke-virtual {v5}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_8

    .line 266
    .line 267
    new-instance v5, LX0/a;

    .line 268
    .line 269
    invoke-direct {v5, v6}, LX0/a;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v5, v4}, Lexpo/modules/camera/utils/CameraViewHelper;->addExifData(LX0/a;LX0/a;)V

    .line 273
    .line 274
    .line 275
    :cond_8
    new-instance v4, Ljava/io/File;

    .line 276
    .line 277
    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    const-string v5, "toString(...)"

    .line 289
    .line 290
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v5, "uri"

    .line 294
    .line 295
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    const-string v4, "format"

    .line 299
    .line 300
    iget-object v5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 301
    .line 302
    invoke-virtual {v5}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v5}, Lexpo/modules/camera/PictureFormat;->toExtension()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 314
    .line 315
    invoke-virtual {v4}, Lexpo/modules/camera/PictureOptions;->getBase64()Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_9

    .line 320
    .line 321
    const-string v4, "base64"

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-static {v5, v10}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    :cond_9
    sget-object v4, Li7/B;->a:Li7/B;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 335
    .line 336
    :try_start_9
    invoke-static {v0, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 337
    .line 338
    .line 339
    :try_start_a
    invoke-static {v2, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    .line 340
    .line 341
    .line 342
    :goto_4
    return-object v3

    .line 343
    :goto_5
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 344
    :catchall_2
    move-exception v4

    .line 345
    :try_start_c
    invoke-static {v0, v3}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 346
    .line 347
    .line 348
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 349
    :goto_6
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 350
    :catchall_3
    move-exception v3

    .line 351
    :try_start_e
    invoke-static {v2, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    throw v3
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1

    .line 355
    :goto_7
    instance-of v2, v0, Landroid/content/res/Resources$NotFoundException;

    .line 356
    .line 357
    const-string v3, "E_TAKING_PICTURE_FAILED"

    .line 358
    .line 359
    if-eqz v2, :cond_a

    .line 360
    .line 361
    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 362
    .line 363
    const-string v4, "Documents directory of the app could not be found."

    .line 364
    .line 365
    invoke-interface {v2, v3, v4, v0}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_a
    instance-of v2, v0, Ljava/io/IOException;

    .line 370
    .line 371
    if-eqz v2, :cond_b

    .line 372
    .line 373
    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 374
    .line 375
    const-string v4, "An unknown I/O exception has occurred."

    .line 376
    .line 377
    invoke-interface {v2, v3, v4, v0}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_b
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 382
    .line 383
    if-eqz v2, :cond_c

    .line 384
    .line 385
    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 386
    .line 387
    const-string v4, "An incompatible parameter has been passed in. "

    .line 388
    .line 389
    invoke-interface {v2, v3, v4, v0}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_c
    instance-of v2, v0, Lexpo/modules/camera/CameraExceptions$WriteImageException;

    .line 394
    .line 395
    if-eqz v2, :cond_d

    .line 396
    .line 397
    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 398
    .line 399
    move-object v3, v0

    .line 400
    check-cast v3, Lexpo/modules/kotlin/exception/CodedException;

    .line 401
    .line 402
    invoke-interface {v2, v3}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 403
    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_d
    iget-object v2, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 407
    .line 408
    const-string v4, "An unknown exception has occurred."

    .line 409
    .line 410
    invoke-interface {v2, v3, v4, v0}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 411
    .line 412
    .line 413
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 414
    .line 415
    .line 416
    return-object v1
.end method

.method private final skipProcessing()Landroid/os/Bundle;
    .locals 8

    .line 1
    const-string v0, "E_TAKING_PICTURE_FAILED"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 5
    .line 6
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :try_start_1
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->directory:Ljava/io/File;

    .line 15
    .line 16
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 17
    .line 18
    invoke-virtual {v4}, Lexpo/modules/camera/PictureOptions;->getImageType()Lexpo/modules/camera/PictureFormat;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Lexpo/modules/camera/PictureFormat;->toExtension()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v3, v2, v4}, Lexpo/modules/camera/tasks/ResolveTakenPictureKt;->writeStreamToFile(Ljava/io/File;Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v4, Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "toString(...)"

    .line 44
    .line 45
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, LX0/a;

    .line 49
    .line 50
    invoke-direct {v5, v3}, LX0/a;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v3, Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v6, "uri"

    .line 59
    .line 60
    invoke-virtual {v3, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "width"

    .line 64
    .line 65
    const-string v6, "ImageWidth"

    .line 66
    .line 67
    const/4 v7, -0x1

    .line 68
    invoke-virtual {v5, v6, v7}, LX0/a;->m(Ljava/lang/String;I)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    invoke-virtual {v3, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    const-string v4, "height"

    .line 76
    .line 77
    const-string v6, "ImageLength"

    .line 78
    .line 79
    invoke-virtual {v5, v6, v7}, LX0/a;->m(Ljava/lang/String;I)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-virtual {v3, v4, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 87
    .line 88
    invoke-virtual {v4}, Lexpo/modules/camera/PictureOptions;->getExif()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_0

    .line 93
    .line 94
    invoke-static {v5}, Lexpo/modules/camera/utils/CameraViewHelper;->getExifData(LX0/a;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const-string v5, "exif"

    .line 99
    .line 100
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v3

    .line 105
    goto :goto_1

    .line 106
    :cond_0
    :goto_0
    iget-object v4, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->options:Lexpo/modules/camera/PictureOptions;

    .line 107
    .line 108
    invoke-virtual {v4}, Lexpo/modules/camera/PictureOptions;->getBase64()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_1

    .line 113
    .line 114
    const-string v4, "base64"

    .line 115
    .line 116
    iget-object v5, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->imageData:[B

    .line 117
    .line 118
    const/4 v6, 0x2

    .line 119
    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    :cond_1
    :try_start_2
    invoke-static {v2, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 127
    .line 128
    .line 129
    return-object v3

    .line 130
    :catch_0
    move-exception v2

    .line 131
    goto :goto_2

    .line 132
    :catch_1
    move-exception v2

    .line 133
    goto :goto_3

    .line 134
    :goto_1
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 135
    :catchall_1
    move-exception v4

    .line 136
    :try_start_4
    invoke-static {v2, v3}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 140
    :goto_2
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 141
    .line 142
    const-string v4, "An unknown exception has occurred."

    .line 143
    .line 144
    invoke-interface {v3, v0, v4, v2}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :goto_3
    iget-object v3, p0, Lexpo/modules/camera/tasks/ResolveTakenPicture;->promise:Lexpo/modules/kotlin/Promise;

    .line 152
    .line 153
    const-string v4, "An unknown I/O exception has occurred."

    .line 154
    .line 155
    invoke-interface {v3, v0, v4, v2}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 159
    .line 160
    .line 161
    :goto_4
    return-object v1
.end method


# virtual methods
.method public final resolve(Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/camera/tasks/ResolveTakenPicture$resolve$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lexpo/modules/camera/tasks/ResolveTakenPicture$resolve$2;-><init>(Lexpo/modules/camera/tasks/ResolveTakenPicture;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 23
    .line 24
    return-object p1
.end method
