.class public final Lcom/facebook/react/uimanager/style/CornerRadii;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B!\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\u0006\u0010\u000f\u001a\u00020\u0000J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/CornerRadii;",
        "",
        "horizontal",
        "",
        "vertical",
        "<init>",
        "(FF)V",
        "length",
        "Lcom/facebook/react/uimanager/LengthPercentage;",
        "referenceWidth",
        "referenceHeight",
        "(Lcom/facebook/react/uimanager/LengthPercentage;FF)V",
        "getHorizontal",
        "()F",
        "getVertical",
        "toPixelFromDIP",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final horizontal:F

.field private final vertical:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/facebook/react/uimanager/style/CornerRadii;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 4
    iput p2, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    return-void
.end method

.method public synthetic constructor <init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/style/CornerRadii;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/LengthPercentage;FF)V
    .locals 1

    const-string v0, "length"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    move-result p2

    invoke-virtual {p1, p3}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    move-result p1

    invoke-direct {p0, p2, p1}, Lcom/facebook/react/uimanager/style/CornerRadii;-><init>(FF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/facebook/react/uimanager/style/CornerRadii;FFILjava/lang/Object;)Lcom/facebook/react/uimanager/style/CornerRadii;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/uimanager/style/CornerRadii;->copy(FF)Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 2
    .line 3
    return v0
.end method

.method public final component2()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 2
    .line 3
    return v0
.end method

.method public final copy(FF)Lcom/facebook/react/uimanager/style/CornerRadii;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/facebook/react/uimanager/style/CornerRadii;-><init>(FF)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 12
    .line 13
    iget v1, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 14
    .line 15
    iget v3, p1, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 25
    .line 26
    iget p1, p1, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 27
    .line 28
    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final getHorizontal()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 2
    .line 3
    return v0
.end method

.method public final getVertical()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
.end method

.method public final toPixelFromDIP()Lcom/facebook/react/uimanager/style/CornerRadii;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/CornerRadii;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 4
    .line 5
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 10
    .line 11
    invoke-static {v2}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/uimanager/style/CornerRadii;-><init>(FF)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->horizontal:F

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/uimanager/style/CornerRadii;->vertical:F

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "CornerRadii(horizontal="

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", vertical="

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, ")"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
