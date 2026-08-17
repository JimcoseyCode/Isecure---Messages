.class public final Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/text/style/LineHeightSpan;
.implements Lcom/facebook/react/views/text/internal/span/ReactSpan;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;",
        "Landroid/text/style/LineHeightSpan;",
        "Lcom/facebook/react/views/text/internal/span/ReactSpan;",
        "",
        "height",
        "<init>",
        "(F)V",
        "",
        "text",
        "",
        "start",
        "end",
        "spanstartv",
        "v",
        "Landroid/graphics/Paint$FontMetricsInt;",
        "fm",
        "Li7/B;",
        "chooseHeight",
        "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V",
        "lineHeight",
        "I",
        "getLineHeight",
        "()I",
        "ReactAndroid_release"
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
.field private final lineHeight:I


# direct methods
.method public constructor <init>(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    float-to-double v0, p1

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    double-to-int p1, v0

    .line 10
    iput p1, p0, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;->lineHeight:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 4

    .line 1
    const-string p4, "text"

    .line 2
    .line 3
    invoke-static {p1, p4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "fm"

    .line 7
    .line 8
    invoke-static {p6, p4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget p4, p0, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;->lineHeight:I

    .line 12
    .line 13
    iget p5, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 14
    .line 15
    neg-int v0, p5

    .line 16
    iget v1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    sub-int/2addr p4, v0

    .line 20
    int-to-float p4, p4

    .line 21
    const/high16 v0, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr p4, v0

    .line 24
    float-to-double v0, p4

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    double-to-float p4, v2

    .line 30
    float-to-int p4, p4

    .line 31
    sub-int/2addr p5, p4

    .line 32
    iput p5, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 33
    .line 34
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    double-to-float p5, v0

    .line 41
    float-to-int p5, p5

    .line 42
    add-int/2addr p4, p5

    .line 43
    iput p4, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 44
    .line 45
    if-nez p2, :cond_0

    .line 46
    .line 47
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 48
    .line 49
    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 50
    .line 51
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-ne p3, p1, :cond_1

    .line 56
    .line 57
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 58
    .line 59
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final getLineHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;->lineHeight:I

    .line 2
    .line 3
    return v0
.end method
