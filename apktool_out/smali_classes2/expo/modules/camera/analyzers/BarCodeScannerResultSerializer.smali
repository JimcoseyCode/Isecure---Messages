.class public final Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JI\u0010\u000f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u000cj\u0008\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\r0\u000b2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "cornerPoints",
        "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
        "boundingBox",
        "",
        "density",
        "Landroid/util/Pair;",
        "Ljava/util/ArrayList;",
        "Landroid/os/Bundle;",
        "Lkotlin/collections/ArrayList;",
        "getCornerPointsAndBoundingBox",
        "(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;F)Landroid/util/Pair;",
        "width",
        "height",
        "getSize",
        "(FF)Landroid/os/Bundle;",
        "x",
        "y",
        "getPoint",
        "Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "result",
        "toBundle",
        "(Lexpo/modules/camera/utils/BarCodeScannerResult;F)Landroid/os/Bundle;",
        "Lf6/a;",
        "barcode",
        "Lk6/a;",
        "inputImage",
        "parseBarcodeScanningResult",
        "(Lf6/a;Lk6/a;)Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "parseExtraDate",
        "(Lf6/a;)Landroid/os/Bundle;",
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


# static fields
.field public static final INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;F)Landroid/util/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
            "F)",
            "Landroid/util/Pair<",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v3, v1, v2}, Lq7/c;->b(III)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ltz v1, :cond_0

    .line 19
    .line 20
    :goto_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    int-to-float v2, v2

    .line 31
    div-float/2addr v2, p3

    .line 32
    add-int/lit8 v4, v3, 0x1

    .line 33
    .line 34
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    int-to-float v4, v4

    .line 45
    div-float/2addr v4, p3

    .line 46
    invoke-direct {p0, v2, v4}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getPoint(FF)Landroid/os/Bundle;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    if-eq v3, v1, :cond_0

    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    .line 64
    .line 65
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getX()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    int-to-float v2, v2

    .line 70
    div-float/2addr v2, p3

    .line 71
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getY()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    int-to-float v3, v3

    .line 76
    div-float/2addr v3, p3

    .line 77
    invoke-direct {v1, v2, v3}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getPoint(FF)Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v3, "origin"

    .line 82
    .line 83
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    int-to-float v2, v2

    .line 91
    div-float/2addr v2, p3

    .line 92
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getHeight()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    int-to-float p2, p2

    .line 97
    div-float/2addr p2, p3

    .line 98
    invoke-direct {v1, v2, p2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getSize(FF)Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    const-string p3, "size"

    .line 103
    .line 104
    invoke-virtual {p1, p3, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 105
    .line 106
    .line 107
    new-instance p2, Landroid/util/Pair;

    .line 108
    .line 109
    invoke-direct {p2, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object p2
.end method

.method private final getPoint(FF)Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "x"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 9
    .line 10
    .line 11
    const-string p1, "y"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method private final getSize(FF)Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "width"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 9
    .line 10
    .line 11
    const-string p1, "height"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static synthetic parseBarcodeScanningResult$default(Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;Lf6/a;Lk6/a;ILjava/lang/Object;)Lexpo/modules/camera/utils/BarCodeScannerResult;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->parseBarcodeScanningResult(Lf6/a;Lk6/a;)Lexpo/modules/camera/utils/BarCodeScannerResult;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final parseBarcodeScanningResult(Lf6/a;Lk6/a;)Lexpo/modules/camera/utils/BarCodeScannerResult;
    .locals 9

    .line 1
    const-string v0, "barcode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lf6/a;->k()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lf6/a;->j()[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/String;

    .line 19
    .line 20
    sget-object v2, LP8/d;->b:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 23
    .line 24
    .line 25
    move-object v4, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :cond_1
    move-object v4, v0

    .line 29
    :goto_0
    invoke-virtual {p1}, Lf6/a;->n()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x1

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    move-object v3, v4

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {p1}, Lf6/a;->d()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v3, v0

    .line 43
    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lf6/a;->c()[Landroid/graphics/Point;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    array-length v2, v0

    .line 56
    move v5, v1

    .line 57
    :goto_2
    if-ge v5, v2, :cond_3

    .line 58
    .line 59
    aget-object v7, v0, v5

    .line 60
    .line 61
    iget v8, v7, Landroid/graphics/Point;->x:I

    .line 62
    .line 63
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    iget v7, v7, Landroid/graphics/Point;->y:I

    .line 68
    .line 69
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    filled-new-array {v8, v7}, [Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-static {v7}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-interface {v6, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v5, v5, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-virtual {p0, p1}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->parseExtraDate(Lf6/a;)Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    move v0, v1

    .line 92
    new-instance v1, Lexpo/modules/camera/utils/BarCodeScannerResult;

    .line 93
    .line 94
    invoke-virtual {p1}, Lf6/a;->g()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz p2, :cond_4

    .line 99
    .line 100
    invoke-virtual {p2}, Lk6/a;->g()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    move v7, p1

    .line 105
    goto :goto_3

    .line 106
    :cond_4
    move v7, v0

    .line 107
    :goto_3
    if-eqz p2, :cond_5

    .line 108
    .line 109
    invoke-virtual {p2}, Lk6/a;->k()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    move v8, p1

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    move v8, v0

    .line 116
    :goto_4
    invoke-direct/range {v1 .. v8}, Lexpo/modules/camera/utils/BarCodeScannerResult;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;II)V

    .line 117
    .line 118
    .line 119
    return-object v1
.end method

.method public final parseExtraDate(Lf6/a;)Landroid/os/Bundle;
    .locals 12

    .line 1
    const-string v0, "barcode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lf6/a;->n()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "address"

    .line 17
    .line 18
    const-string v4, "email"

    .line 19
    .line 20
    const-string v5, "phone"

    .line 21
    .line 22
    const-string v6, "lastName"

    .line 23
    .line 24
    const-string v7, "middleName"

    .line 25
    .line 26
    const-string v8, "firstName"

    .line 27
    .line 28
    const-string v9, "url"

    .line 29
    .line 30
    const-string v10, "type"

    .line 31
    .line 32
    const/4 v11, 0x0

    .line 33
    if-eq v1, v2, :cond_1e

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    if-eq v1, v2, :cond_1a

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    if-eq v1, v2, :cond_17

    .line 40
    .line 41
    const/4 v2, 0x6

    .line 42
    if-eq v1, v2, :cond_14

    .line 43
    .line 44
    packed-switch v1, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Lf6/a;->e()Lf6/a$e;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v1, "driverLicense"

    .line 53
    .line 54
    invoke-virtual {v0, v10, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1}, Lf6/a$e;->e()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object v1, v11

    .line 65
    :goto_0
    invoke-virtual {v0, v8, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1}, Lf6/a$e;->i()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v1, v11

    .line 76
    :goto_1
    invoke-virtual {v0, v7, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Lf6/a$e;->g()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    move-object v1, v11

    .line 87
    :goto_2
    invoke-virtual {v0, v6, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1}, Lf6/a$e;->h()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    move-object v1, v11

    .line 98
    :goto_3
    const-string v2, "licenseNumber"

    .line 99
    .line 100
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    invoke-virtual {p1}, Lf6/a$e;->d()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    goto :goto_4

    .line 110
    :cond_4
    move-object v1, v11

    .line 111
    :goto_4
    const-string v2, "expiryDate"

    .line 112
    .line 113
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    invoke-virtual {p1}, Lf6/a$e;->f()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    goto :goto_5

    .line 123
    :cond_5
    move-object v1, v11

    .line 124
    :goto_5
    const-string v2, "issueDate"

    .line 125
    .line 126
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    invoke-virtual {p1}, Lf6/a$e;->c()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    goto :goto_6

    .line 136
    :cond_6
    move-object v1, v11

    .line 137
    :goto_6
    const-string v2, "addressStreet"

    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    invoke-virtual {p1}, Lf6/a$e;->a()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    goto :goto_7

    .line 149
    :cond_7
    move-object v1, v11

    .line 150
    :goto_7
    const-string v2, "addressCity"

    .line 151
    .line 152
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    if-eqz p1, :cond_8

    .line 156
    .line 157
    invoke-virtual {p1}, Lf6/a$e;->b()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    :cond_8
    const-string p1, "addressState"

    .line 162
    .line 163
    invoke-virtual {v0, p1, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_1
    invoke-virtual {p1}, Lf6/a;->a()Lf6/a$c;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    const-string v1, "calendarEvent"

    .line 172
    .line 173
    invoke-virtual {v0, v10, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    if-eqz p1, :cond_9

    .line 177
    .line 178
    invoke-virtual {p1}, Lf6/a$c;->e()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    goto :goto_8

    .line 183
    :cond_9
    move-object v1, v11

    .line 184
    :goto_8
    const-string v2, "summary"

    .line 185
    .line 186
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    if-eqz p1, :cond_a

    .line 190
    .line 191
    invoke-virtual {p1}, Lf6/a$c;->a()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    goto :goto_9

    .line 196
    :cond_a
    move-object v1, v11

    .line 197
    :goto_9
    const-string v2, "description"

    .line 198
    .line 199
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    if-eqz p1, :cond_b

    .line 203
    .line 204
    invoke-virtual {p1}, Lf6/a$c;->c()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    goto :goto_a

    .line 209
    :cond_b
    move-object v1, v11

    .line 210
    :goto_a
    const-string v2, "location"

    .line 211
    .line 212
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    if-eqz p1, :cond_c

    .line 216
    .line 217
    invoke-virtual {p1}, Lf6/a$c;->d()Lf6/a$b;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    if-eqz v1, :cond_c

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    goto :goto_b

    .line 228
    :cond_c
    move-object v1, v11

    .line 229
    :goto_b
    const-string v2, "start"

    .line 230
    .line 231
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    if-eqz p1, :cond_d

    .line 235
    .line 236
    invoke-virtual {p1}, Lf6/a$c;->b()Lf6/a$b;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    if-eqz p1, :cond_d

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    :cond_d
    const-string p1, "end"

    .line 247
    .line 248
    invoke-virtual {v0, p1, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_2
    invoke-virtual {p1}, Lf6/a;->h()Lf6/a$g;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    const-string v1, "geoPoint"

    .line 257
    .line 258
    invoke-virtual {v0, v10, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    if-eqz p1, :cond_e

    .line 262
    .line 263
    invoke-virtual {p1}, Lf6/a$g;->a()D

    .line 264
    .line 265
    .line 266
    move-result-wide v1

    .line 267
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    goto :goto_c

    .line 272
    :cond_e
    move-object v1, v11

    .line 273
    :goto_c
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    const-string v2, "lat"

    .line 278
    .line 279
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    if-eqz p1, :cond_f

    .line 283
    .line 284
    invoke-virtual {p1}, Lf6/a$g;->b()D

    .line 285
    .line 286
    .line 287
    move-result-wide v1

    .line 288
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    :cond_f
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    const-string v1, "lng"

    .line 297
    .line 298
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_3
    invoke-virtual {p1}, Lf6/a;->o()Lf6/a$l;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    const-string v1, "wifi"

    .line 307
    .line 308
    invoke-virtual {v0, v10, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    if-eqz p1, :cond_10

    .line 312
    .line 313
    invoke-virtual {p1}, Lf6/a$l;->c()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    goto :goto_d

    .line 318
    :cond_10
    move-object v1, v11

    .line 319
    :goto_d
    const-string v2, "ssid"

    .line 320
    .line 321
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    if-eqz p1, :cond_11

    .line 325
    .line 326
    invoke-virtual {p1}, Lf6/a$l;->b()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    goto :goto_e

    .line 331
    :cond_11
    move-object v1, v11

    .line 332
    :goto_e
    const-string v2, "password"

    .line 333
    .line 334
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    if-eqz p1, :cond_12

    .line 338
    .line 339
    invoke-virtual {p1}, Lf6/a$l;->a()I

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    :cond_12
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    invoke-virtual {v0, v10, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_4
    invoke-virtual {p1}, Lf6/a;->m()Lf6/a$k;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {v0, v10, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    if-eqz p1, :cond_13

    .line 363
    .line 364
    invoke-virtual {p1}, Lf6/a$k;->a()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v11

    .line 368
    :cond_13
    invoke-virtual {v0, v9, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return-object v0

    .line 372
    :cond_14
    invoke-virtual {p1}, Lf6/a;->l()Lf6/a$j;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    const-string v1, "sms"

    .line 377
    .line 378
    invoke-virtual {v0, v10, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    if-eqz p1, :cond_15

    .line 382
    .line 383
    invoke-virtual {p1}, Lf6/a$j;->b()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    goto :goto_f

    .line 388
    :cond_15
    move-object v1, v11

    .line 389
    :goto_f
    const-string v2, "phoneNumber"

    .line 390
    .line 391
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    if-eqz p1, :cond_16

    .line 395
    .line 396
    invoke-virtual {p1}, Lf6/a$j;->a()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    :cond_16
    const-string p1, "message"

    .line 401
    .line 402
    invoke-virtual {v0, p1, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    return-object v0

    .line 406
    :cond_17
    invoke-virtual {p1}, Lf6/a;->i()Lf6/a$i;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-virtual {v0, v10, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    if-eqz p1, :cond_18

    .line 414
    .line 415
    invoke-virtual {p1}, Lf6/a$i;->a()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    goto :goto_10

    .line 420
    :cond_18
    move-object v1, v11

    .line 421
    :goto_10
    const-string v2, "number"

    .line 422
    .line 423
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    if-eqz p1, :cond_19

    .line 427
    .line 428
    invoke-virtual {p1}, Lf6/a$i;->b()I

    .line 429
    .line 430
    .line 431
    move-result p1

    .line 432
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    :cond_19
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    const-string v1, "phoneNumberType"

    .line 441
    .line 442
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    return-object v0

    .line 446
    :cond_1a
    invoke-virtual {p1}, Lf6/a;->f()Lf6/a$f;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    invoke-virtual {v0, v10, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    if-eqz p1, :cond_1b

    .line 454
    .line 455
    invoke-virtual {p1}, Lf6/a$f;->a()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    goto :goto_11

    .line 460
    :cond_1b
    move-object v1, v11

    .line 461
    :goto_11
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    if-eqz p1, :cond_1c

    .line 465
    .line 466
    invoke-virtual {p1}, Lf6/a$f;->c()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    goto :goto_12

    .line 471
    :cond_1c
    move-object v1, v11

    .line 472
    :goto_12
    const-string v2, "subject"

    .line 473
    .line 474
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    if-eqz p1, :cond_1d

    .line 478
    .line 479
    invoke-virtual {p1}, Lf6/a$f;->b()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v11

    .line 483
    :cond_1d
    const-string p1, "body"

    .line 484
    .line 485
    invoke-virtual {v0, p1, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    return-object v0

    .line 489
    :cond_1e
    invoke-virtual {p1}, Lf6/a;->b()Lf6/a$d;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    const-string v1, "contactInfo"

    .line 494
    .line 495
    invoke-virtual {v0, v10, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    if-eqz p1, :cond_1f

    .line 499
    .line 500
    invoke-virtual {p1}, Lf6/a$d;->c()Lf6/a$h;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    if-eqz v1, :cond_1f

    .line 505
    .line 506
    invoke-virtual {v1}, Lf6/a$h;->a()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    goto :goto_13

    .line 511
    :cond_1f
    move-object v1, v11

    .line 512
    :goto_13
    invoke-virtual {v0, v8, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    if-eqz p1, :cond_20

    .line 516
    .line 517
    invoke-virtual {p1}, Lf6/a$d;->c()Lf6/a$h;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    if-eqz v1, :cond_20

    .line 522
    .line 523
    invoke-virtual {v1}, Lf6/a$h;->c()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    goto :goto_14

    .line 528
    :cond_20
    move-object v1, v11

    .line 529
    :goto_14
    invoke-virtual {v0, v7, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    if-eqz p1, :cond_21

    .line 533
    .line 534
    invoke-virtual {p1}, Lf6/a$d;->c()Lf6/a$h;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    if-eqz v1, :cond_21

    .line 539
    .line 540
    invoke-virtual {v1}, Lf6/a$h;->b()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    goto :goto_15

    .line 545
    :cond_21
    move-object v1, v11

    .line 546
    :goto_15
    invoke-virtual {v0, v6, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    if-eqz p1, :cond_22

    .line 550
    .line 551
    invoke-virtual {p1}, Lf6/a$d;->f()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    goto :goto_16

    .line 556
    :cond_22
    move-object v1, v11

    .line 557
    :goto_16
    const-string v2, "title"

    .line 558
    .line 559
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    if-eqz p1, :cond_23

    .line 563
    .line 564
    invoke-virtual {p1}, Lf6/a$d;->d()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    goto :goto_17

    .line 569
    :cond_23
    move-object v1, v11

    .line 570
    :goto_17
    const-string v2, "organization"

    .line 571
    .line 572
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    if-eqz p1, :cond_24

    .line 576
    .line 577
    invoke-virtual {p1}, Lf6/a$d;->b()Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    if-eqz v1, :cond_24

    .line 582
    .line 583
    invoke-static {v1}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    check-cast v1, Lf6/a$f;

    .line 588
    .line 589
    if-eqz v1, :cond_24

    .line 590
    .line 591
    invoke-virtual {v1}, Lf6/a$f;->a()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    goto :goto_18

    .line 596
    :cond_24
    move-object v1, v11

    .line 597
    :goto_18
    invoke-virtual {v0, v4, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    if-eqz p1, :cond_25

    .line 601
    .line 602
    invoke-virtual {p1}, Lf6/a$d;->e()Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    if-eqz v1, :cond_25

    .line 607
    .line 608
    invoke-static {v1}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    check-cast v1, Lf6/a$i;

    .line 613
    .line 614
    if-eqz v1, :cond_25

    .line 615
    .line 616
    invoke-virtual {v1}, Lf6/a$i;->a()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    goto :goto_19

    .line 621
    :cond_25
    move-object v1, v11

    .line 622
    :goto_19
    invoke-virtual {v0, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    if-eqz p1, :cond_26

    .line 626
    .line 627
    invoke-virtual {p1}, Lf6/a$d;->g()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    if-eqz v1, :cond_26

    .line 632
    .line 633
    invoke-static {v1}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    check-cast v1, Ljava/lang/String;

    .line 638
    .line 639
    goto :goto_1a

    .line 640
    :cond_26
    move-object v1, v11

    .line 641
    :goto_1a
    invoke-virtual {v0, v9, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    if-eqz p1, :cond_27

    .line 645
    .line 646
    invoke-virtual {p1}, Lf6/a$d;->a()Ljava/util/List;

    .line 647
    .line 648
    .line 649
    move-result-object p1

    .line 650
    if-eqz p1, :cond_27

    .line 651
    .line 652
    invoke-static {p1}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object p1

    .line 656
    check-cast p1, Lf6/a$a;

    .line 657
    .line 658
    if-eqz p1, :cond_27

    .line 659
    .line 660
    invoke-virtual {p1}, Lf6/a$a;->a()[Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    if-eqz p1, :cond_27

    .line 665
    .line 666
    invoke-static {p1}, Lj7/j;->G([Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    move-object v11, p1

    .line 671
    check-cast v11, Ljava/lang/String;

    .line 672
    .line 673
    :cond_27
    invoke-virtual {v0, v3, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    return-object v0

    .line 677
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toBundle(Lexpo/modules/camera/utils/BarCodeScannerResult;F)Landroid/os/Bundle;
    .locals 3

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "data"

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getValue()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "raw"

    .line 21
    .line 22
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getRaw()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "type"

    .line 30
    .line 31
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getType()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const-string v1, "extra"

    .line 39
    .line 40
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getExtra()Landroid/os/Bundle;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    .line 48
    .line 49
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getCornerPoints()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getBoundingBox()Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v1, v2, p1, p2}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;F)Landroid/util/Pair;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p2, Ljava/util/ArrayList;

    .line 64
    .line 65
    const-string v1, "cornerPoints"

    .line 66
    .line 67
    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Landroid/os/Bundle;

    .line 73
    .line 74
    const-string p2, "bounds"

    .line 75
    .line 76
    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method
