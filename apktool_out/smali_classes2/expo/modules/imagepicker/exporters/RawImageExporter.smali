.class public final Lexpo/modules/imagepicker/exporters/RawImageExporter;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/imagepicker/exporters/ImageExporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/imagepicker/exporters/RawImageExporter;",
        "Lexpo/modules/imagepicker/exporters/ImageExporter;",
        "<init>",
        "()V",
        "Landroid/net/Uri;",
        "source",
        "Ljava/io/File;",
        "output",
        "Landroid/content/ContentResolver;",
        "contentResolver",
        "Lexpo/modules/imagepicker/exporters/ImageExportResult;",
        "exportAsync",
        "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public exportAsync(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/io/File;",
            "Landroid/content/ContentResolver;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;-><init>(Lexpo/modules/imagepicker/exporters/RawImageExporter;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    check-cast p2, Ljava/io/File;

    .line 42
    .line 43
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p4}, Li7/p;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    iput v3, v0, Lexpo/modules/imagepicker/exporters/RawImageExporter$exportAsync$1;->label:I

    .line 61
    .line 62
    invoke-static {p1, p2, p3, v0}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->copyFile(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    new-instance p1, Lexpo/modules/imagepicker/exporters/DimensionsExporter;

    .line 70
    .line 71
    invoke-direct {p1, p2}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;-><init>(Ljava/io/File;)V

    .line 72
    .line 73
    .line 74
    new-instance p3, Lexpo/modules/imagepicker/exporters/ImageExportResult;

    .line 75
    .line 76
    invoke-virtual {p1}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    invoke-virtual {p1}, Lexpo/modules/imagepicker/exporters/DimensionsExporter;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-direct {p3, p4, p1, p2}, Lexpo/modules/imagepicker/exporters/ImageExportResult;-><init>(IILjava/io/File;)V

    .line 85
    .line 86
    .line 87
    return-object p3
.end method
