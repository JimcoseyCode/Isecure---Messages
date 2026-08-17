.class public final Lexpo/modules/camera/CameraViewModule$definition$1$7$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "expo/modules/camera/CameraViewModule$definition$1$7$1",
        "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Li7/B;",
        "onSuccess",
        "(Landroid/graphics/Bitmap;)V",
        "",
        "cause",
        "onFailure",
        "(Ljava/lang/Throwable;)V",
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
.field final synthetic $barcodeTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $promise:Lexpo/modules/kotlin/Promise;

.field final synthetic $url:Ljava/lang/String;

.field final synthetic this$0:Lexpo/modules/camera/CameraViewModule;


# direct methods
.method constructor <init>(Ljava/util/List;Lexpo/modules/camera/CameraViewModule;Lexpo/modules/kotlin/Promise;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;",
            "Lexpo/modules/camera/CameraViewModule;",
            "Lexpo/modules/kotlin/Promise;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$barcodeTypes:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$url:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 2
    .line 3
    new-instance v0, Lexpo/modules/camera/CameraExceptions$ImageRetrievalException;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$url:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lexpo/modules/camera/CameraExceptions$ImageRetrievalException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onSuccess(Landroid/graphics/Bitmap;)V
    .locals 12

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v2, Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;

    .line 7
    .line 8
    invoke-direct {v2}, Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$barcodeTypes:Ljava/util/List;

    .line 12
    .line 13
    new-instance v5, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    invoke-static {v0, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lexpo/modules/camera/records/BarcodeType;

    .line 39
    .line 40
    invoke-virtual {v1}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v2, v5}, Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;->setSettings(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->this$0:Lexpo/modules/camera/CameraViewModule;

    .line 56
    .line 57
    invoke-static {v0}, Lexpo/modules/camera/CameraViewModule;->access$getModuleScope$p(Lexpo/modules/camera/CameraViewModule;)LR8/N;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;

    .line 62
    .line 63
    iget-object v4, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    move-object v3, p1

    .line 67
    invoke-direct/range {v1 .. v6}, Lexpo/modules/camera/CameraViewModule$definition$1$7$1$onSuccess$1;-><init>(Lexpo/modules/camera/analyzers/MLKitBarCodeScanner;Landroid/graphics/Bitmap;Lexpo/modules/kotlin/Promise;Ljava/util/List;Ln7/f;)V

    .line 68
    .line 69
    .line 70
    const/4 v10, 0x3

    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    move-object v6, v0

    .line 75
    move-object v9, v1

    .line 76
    invoke-static/range {v6 .. v11}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catch_0
    iget-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$1$7$1;->$promise:Lexpo/modules/kotlin/Promise;

    .line 81
    .line 82
    new-instance v0, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;

    .line 83
    .line 84
    invoke-direct {v0}, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method
