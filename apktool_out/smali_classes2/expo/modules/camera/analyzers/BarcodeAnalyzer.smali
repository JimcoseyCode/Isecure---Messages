.class public final Lexpo/modules/camera/analyzers/BarcodeAnalyzer;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/camera/core/g$a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR#\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/camera/analyzers/BarcodeAnalyzer;",
        "Landroidx/camera/core/g$a;",
        "",
        "Lexpo/modules/camera/records/BarcodeType;",
        "formats",
        "Lkotlin/Function1;",
        "Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "Li7/B;",
        "onComplete",
        "<init>",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V",
        "Landroidx/camera/core/o;",
        "imageProxy",
        "analyze",
        "(Landroidx/camera/core/o;)V",
        "Lkotlin/jvm/functions/Function1;",
        "getOnComplete",
        "()Lkotlin/jvm/functions/Function1;",
        "",
        "barcodeFormats",
        "I",
        "Le6/b;",
        "barcodeScannerOptions",
        "Le6/b;",
        "Le6/a;",
        "barcodeScanner",
        "Le6/a;",
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
.field private final barcodeFormats:I

.field private barcodeScanner:Le6/a;

.field private barcodeScannerOptions:Le6/b;

.field private final onComplete:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "formats"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onComplete"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->onComplete:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    move p1, v0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/16 v1, 0xa

    .line 28
    .line 29
    invoke-static {p1, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lexpo/modules/camera/records/BarcodeType;

    .line 51
    .line 52
    invoke-virtual {v1}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    check-cast p2, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    or-int/2addr p2, v1

    .line 101
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    check-cast p2, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    :goto_2
    iput p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeFormats:I

    .line 113
    .line 114
    new-instance p2, Le6/b$a;

    .line 115
    .line 116
    invoke-direct {p2}, Le6/b$a;-><init>()V

    .line 117
    .line 118
    .line 119
    new-array v0, v0, [I

    .line 120
    .line 121
    invoke-virtual {p2, p1, v0}, Le6/b$a;->b(I[I)Le6/b$a;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Le6/b$a;->a()Le6/b;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const-string p2, "build(...)"

    .line 130
    .line 131
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeScannerOptions:Le6/b;

    .line 135
    .line 136
    invoke-static {p1}, Le6/c;->a(Le6/b;)Le6/a;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const-string p2, "getClient(...)"

    .line 141
    .line 142
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeScanner:Le6/a;

    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 149
    .line 150
    const-string p2, "Empty collection can\'t be reduced."

    .line 151
    .line 152
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1
.end method

.method public static synthetic a(Landroidx/camera/core/o;LP4/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$9(Landroidx/camera/core/o;LP4/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final analyze$lambda$6(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;IILjava/util/List;)Li7/B;
    .locals 9

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Li7/B;->a:Li7/B;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p3}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    check-cast p3, Lf6/a;

    .line 18
    .line 19
    invoke-virtual {p3}, Lf6/a;->k()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p3}, Lf6/a;->j()[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v1, Ljava/lang/String;

    .line 32
    .line 33
    sget-object v2, LP8/d;->b:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 36
    .line 37
    .line 38
    move-object v4, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :cond_2
    move-object v4, v0

    .line 42
    :goto_0
    invoke-virtual {p3}, Lf6/a;->c()[Landroid/graphics/Point;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    mul-int/lit8 v1, v1, 0x2

    .line 50
    .line 51
    new-array v1, v1, [I

    .line 52
    .line 53
    array-length v2, v0

    .line 54
    const/4 v3, 0x0

    .line 55
    move v5, v3

    .line 56
    :goto_1
    if-ge v3, v2, :cond_3

    .line 57
    .line 58
    aget-object v6, v0, v3

    .line 59
    .line 60
    add-int/lit8 v7, v5, 0x1

    .line 61
    .line 62
    mul-int/lit8 v5, v5, 0x2

    .line 63
    .line 64
    iget v8, v6, Landroid/graphics/Point;->x:I

    .line 65
    .line 66
    aput v8, v1, v5

    .line 67
    .line 68
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    iget v6, v6, Landroid/graphics/Point;->y:I

    .line 71
    .line 72
    aput v6, v1, v5

    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    move v5, v7

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {v1}, Lj7/j;->C0([I)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    :goto_2
    move-object v6, v0

    .line 86
    goto :goto_4

    .line 87
    :cond_5
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :goto_4
    sget-object v0, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->INSTANCE:Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;

    .line 94
    .line 95
    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p3}, Lexpo/modules/camera/analyzers/BarCodeScannerResultSerializer;->parseExtraDate(Lf6/a;)Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    iget-object p0, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->onComplete:Lkotlin/jvm/functions/Function1;

    .line 103
    .line 104
    new-instance v1, Lexpo/modules/camera/utils/BarCodeScannerResult;

    .line 105
    .line 106
    invoke-virtual {p3}, Lf6/a;->g()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {p3}, Lf6/a;->d()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    move v7, p1

    .line 115
    move v8, p2

    .line 116
    invoke-direct/range {v1 .. v8}, Lexpo/modules/camera/utils/BarCodeScannerResult;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;II)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    sget-object p0, Li7/B;->a:Li7/B;

    .line 123
    .line 124
    return-object p0
.end method

.method private static final analyze$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final analyze$lambda$8(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private static final analyze$lambda$9(Landroidx/camera/core/o;LP4/l;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Landroidx/camera/core/o;->close()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;IILjava/util/List;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$6(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;IILjava/util/List;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->analyze$lambda$8(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public analyze(Landroidx/camera/core/o;)V
    .locals 4

    .line 1
    const-string v0, "imageProxy"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/camera/core/o;->p0()Landroid/media/Image;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    invoke-interface {p1}, Landroidx/camera/core/o;->i()Ly/Y;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ly/Y;->e()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v0, v1}, Lk6/a;->b(Landroid/media/Image;I)Lk6/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "fromMediaImage(...)"

    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0x5a

    .line 30
    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    const/16 v2, 0x10e

    .line 34
    .line 35
    if-ne v1, v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 41
    :goto_1
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :goto_2
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    :goto_3
    iget-object v3, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->barcodeScanner:Le6/a;

    .line 64
    .line 65
    invoke-interface {v3, v0}, Le6/a;->s0(Lk6/a;)LP4/l;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v3, Lexpo/modules/camera/analyzers/a;

    .line 70
    .line 71
    invoke-direct {v3, p0, v1, v2}, Lexpo/modules/camera/analyzers/a;-><init>(Lexpo/modules/camera/analyzers/BarcodeAnalyzer;II)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Lexpo/modules/camera/analyzers/b;

    .line 75
    .line 76
    invoke-direct {v1, v3}, Lexpo/modules/camera/analyzers/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, LP4/l;->g(LP4/h;)LP4/l;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Lexpo/modules/camera/analyzers/c;

    .line 84
    .line 85
    invoke-direct {v1}, Lexpo/modules/camera/analyzers/c;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, LP4/l;->e(LP4/g;)LP4/l;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-instance v1, Lexpo/modules/camera/analyzers/d;

    .line 93
    .line 94
    invoke-direct {v1, p1}, Lexpo/modules/camera/analyzers/d;-><init>(Landroidx/camera/core/o;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, LP4/l;->c(LP4/f;)LP4/l;

    .line 98
    .line 99
    .line 100
    :cond_4
    return-void
.end method

.method public bridge synthetic getDefaultTargetResolution()Landroid/util/Size;
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/camera/core/g$a;->getDefaultTargetResolution()Landroid/util/Size;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getOnComplete()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;->onComplete:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getTargetCoordinateSystem()I
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/camera/core/g$a;->getTargetCoordinateSystem()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic updateTransform(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/camera/core/g$a;->updateTransform(Landroid/graphics/Matrix;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
