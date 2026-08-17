.class public final Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2;
.super Lexpo/modules/imagepicker/exporters/ImageExportResult;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->exportAsync(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "expo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2",
        "Lexpo/modules/imagepicker/exporters/ImageExportResult;",
        "Landroid/content/ContentResolver;",
        "contentResolver",
        "Ljava/io/ByteArrayOutputStream;",
        "data",
        "(Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;",
        "expo-image-picker_release"
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
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic this$0:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;


# direct methods
.method constructor <init>(Ljava/io/File;Landroid/graphics/Bitmap;Lexpo/modules/imagepicker/exporters/CompressionImageExporter;II)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2;->$bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput-object p3, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2;->this$0:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    .line 4
    .line 5
    invoke-direct {p0, p4, p5, p1}, Lexpo/modules/imagepicker/exporters/ImageExportResult;-><init>(IILjava/io/File;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public data(Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2;->$bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 9
    .line 10
    iget-object v1, p0, Lexpo/modules/imagepicker/exporters/CompressionImageExporter$exportAsync$2;->this$0:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    .line 11
    .line 12
    invoke-static {v1}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->access$getCompressQuality$p(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p2, v0, v1, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 17
    .line 18
    .line 19
    return-object p1
.end method
