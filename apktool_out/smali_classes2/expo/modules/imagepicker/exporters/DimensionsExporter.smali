.class public final Lexpo/modules/imagepicker/exporters/DimensionsExporter;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0006\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/imagepicker/exporters/DimensionsExporter;",
        "",
        "file",
        "Ljava/io/File;",
        "<init>",
        "(Ljava/io/File;)V",
        "isRotatedLandscape",
        "",
        "()Z",
        "isRotatedLandscape$delegate",
        "Lkotlin/Lazy;",
        "metadata",
        "Landroid/graphics/BitmapFactory$Options;",
        "getMetadata",
        "()Landroid/graphics/BitmapFactory$Options;",
        "metadata$delegate",
        "width",
        "",
        "getWidth",
        "()I",
        "height",
        "getHeight",
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
.field private final file:Ljava/io/File;

.field private final isRotatedLandscape$delegate:Lkotlin/Lazy;

.field private final metadata$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->file:Ljava/io/File;

    .line 10
    .line 11
    new-instance p1, Lexpo/modules/imagepicker/exporters/c;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lexpo/modules/imagepicker/exporters/c;-><init>(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape$delegate:Lkotlin/Lazy;

    .line 21
    .line 22
    new-instance p1, Lexpo/modules/imagepicker/exporters/d;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lexpo/modules/imagepicker/exporters/d;-><init>(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->metadata$delegate:Lkotlin/Lazy;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape_delegate$lambda$0(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->metadata_delegate$lambda$2(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getMetadata()Landroid/graphics/BitmapFactory$Options;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->metadata$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/BitmapFactory$Options;

    .line 8
    .line 9
    return-object v0
.end method

.method private final isRotatedLandscape()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private static final isRotatedLandscape_delegate$lambda$0(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Z
    .locals 2

    .line 1
    new-instance v0, LX0/a;

    .line 2
    .line 3
    iget-object p0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->file:Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, LX0/a;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string p0, "Orientation"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, p0, v1}, LX0/a;->m(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x6

    .line 20
    if-eq p0, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x7

    .line 30
    if-ne p0, v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method private static final metadata_delegate$lambda$2(Lexpo/modules/imagepicker/exporters/DimensionsExporter;)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    iget-object p0, p0, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->file:Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final getHeight()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 19
    .line 20
    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->isRotatedLandscape()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    invoke-direct {p0}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getMetadata()Landroid/graphics/BitmapFactory$Options;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 19
    .line 20
    return v0
.end method
