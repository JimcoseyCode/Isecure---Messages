.class public final Lcom/facebook/react/uimanager/style/RadialGradient;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/style/Gradient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/RadialGradient$Companion;,
        Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;,
        Lcom/facebook/react/uimanager/style/RadialGradient$Position;,
        Lcom/facebook/react/uimanager/style/RadialGradient$Shape;,
        Lcom/facebook/react/uimanager/style/RadialGradient$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 &2\u00020\u0001:\u0004&\'()B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002J<\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006*"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/RadialGradient;",
        "Lcom/facebook/react/uimanager/style/Gradient;",
        "shape",
        "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;",
        "size",
        "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;",
        "position",
        "Lcom/facebook/react/uimanager/style/RadialGradient$Position;",
        "colorStops",
        "",
        "Lcom/facebook/react/uimanager/style/ColorStop;",
        "<init>",
        "(Lcom/facebook/react/uimanager/style/RadialGradient$Shape;Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;Lcom/facebook/react/uimanager/style/RadialGradient$Position;Ljava/util/List;)V",
        "getShape",
        "()Lcom/facebook/react/uimanager/style/RadialGradient$Shape;",
        "getSize",
        "()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;",
        "getPosition",
        "()Lcom/facebook/react/uimanager/style/RadialGradient$Position;",
        "getColorStops",
        "()Ljava/util/List;",
        "getShader",
        "Landroid/graphics/Shader;",
        "width",
        "",
        "height",
        "radiusToSide",
        "Lkotlin/Pair;",
        "centerX",
        "centerY",
        "sizeKeyword",
        "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;",
        "calculateEllipseRadius",
        "offsetX",
        "offsetY",
        "aspectRatio",
        "radiusToCorner",
        "calculateRadius",
        "Companion",
        "Shape",
        "GradientSize",
        "Position",
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


# static fields
.field public static final Companion:Lcom/facebook/react/uimanager/style/RadialGradient$Companion;


# instance fields
.field private final colorStops:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/ColorStop;",
            ">;"
        }
    .end annotation
.end field

.field private final position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

.field private final shape:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

.field private final size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/RadialGradient$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/style/RadialGradient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/style/RadialGradient;->Companion:Lcom/facebook/react/uimanager/style/RadialGradient$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/style/RadialGradient$Shape;Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;Lcom/facebook/react/uimanager/style/RadialGradient$Position;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/style/RadialGradient$Shape;",
            "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;",
            "Lcom/facebook/react/uimanager/style/RadialGradient$Position;",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/ColorStop;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "shape"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "size"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "position"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "colorStops"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->shape:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->colorStops:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method

.method private final calculateEllipseRadius(FFF)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    cmpg-float v0, p3, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 16
    .line 17
    .line 18
    cmpg-float v0, v0, v2

    .line 19
    .line 20
    if-gtz v0, :cond_1

    .line 21
    .line 22
    mul-float/2addr p1, p1

    .line 23
    mul-float/2addr p2, p2

    .line 24
    mul-float/2addr p2, p3

    .line 25
    mul-float/2addr p2, p3

    .line 26
    add-float/2addr p1, p2

    .line 27
    float-to-double p1, p1

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    double-to-float p1, p1

    .line 33
    new-instance p2, Lkotlin/Pair;

    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    div-float/2addr p1, p3

    .line 40
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object p2

    .line 48
    :cond_1
    :goto_0
    new-instance p1, Lkotlin/Pair;

    .line 49
    .line 50
    invoke-direct {p1, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method

.method private final calculateRadius(FFFF)Lkotlin/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF)",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    check-cast v0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Keyword;->getKeyword()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    sget-object v0, Lcom/facebook/react/uimanager/style/RadialGradient$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 14
    .line 15
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aget v0, v0, v1

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    :cond_0
    move-object v1, p0

    .line 34
    move v2, p1

    .line 35
    move v3, p2

    .line 36
    move v4, p3

    .line 37
    move v5, p4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Li7/m;

    .line 40
    .line 41
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :goto_0
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/uimanager/style/RadialGradient;->radiusToCorner(FFFFLcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_2
    move-object v1, p0

    .line 51
    move v2, p1

    .line 52
    move v3, p2

    .line 53
    move v4, p3

    .line 54
    move v5, p4

    .line 55
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/uimanager/style/RadialGradient;->radiusToSide(FFFFLcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_3
    move-object v1, p0

    .line 61
    move v2, p1

    .line 62
    move v3, p2

    .line 63
    move v4, p3

    .line 64
    move v5, p4

    .line 65
    instance-of p1, v0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 66
    .line 67
    if-eqz p1, :cond_7

    .line 68
    .line 69
    check-cast v0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->getX()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/LengthPercentage;->getType()Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p2, Lcom/facebook/react/uimanager/LengthPercentageType;->PERCENT:Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 80
    .line 81
    if-ne p1, p2, :cond_4

    .line 82
    .line 83
    iget-object p1, v1, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 84
    .line 85
    check-cast p1, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->getX()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1, v4}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    sget-object p1, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 97
    .line 98
    iget-object p3, v1, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 99
    .line 100
    check-cast p3, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 101
    .line 102
    invoke-virtual {p3}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->getX()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    invoke-virtual {p3, v4}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    invoke-virtual {p1, p3}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(F)F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    :goto_1
    iget-object p3, v1, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 115
    .line 116
    check-cast p3, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 117
    .line 118
    invoke-virtual {p3}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->getY()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    invoke-virtual {p3}, Lcom/facebook/react/uimanager/LengthPercentage;->getType()Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    if-ne p3, p2, :cond_5

    .line 127
    .line 128
    iget-object p2, v1, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 129
    .line 130
    check-cast p2, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 131
    .line 132
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->getY()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p2, v5}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    sget-object p2, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 142
    .line 143
    iget-object p3, v1, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 144
    .line 145
    check-cast p3, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;

    .line 146
    .line 147
    invoke-virtual {p3}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->getY()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-virtual {p3, v5}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 152
    .line 153
    .line 154
    move-result p3

    .line 155
    invoke-virtual {p2, p3}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(F)F

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    :goto_2
    iget-object p3, v1, Lcom/facebook/react/uimanager/style/RadialGradient;->shape:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 160
    .line 161
    sget-object p4, Lcom/facebook/react/uimanager/style/RadialGradient$Shape;->CIRCLE:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 162
    .line 163
    if-ne p3, p4, :cond_6

    .line 164
    .line 165
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    new-instance p2, Lkotlin/Pair;

    .line 170
    .line 171
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-direct {p2, p3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    return-object p2

    .line 183
    :cond_6
    new-instance p3, Lkotlin/Pair;

    .line 184
    .line 185
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-direct {p3, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-object p3

    .line 197
    :cond_7
    move v1, v2

    .line 198
    move v2, v3

    .line 199
    move v3, v4

    .line 200
    move v4, v5

    .line 201
    sget-object v5, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;->FARTHEST_CORNER:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;

    .line 202
    .line 203
    move-object v0, p0

    .line 204
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/uimanager/style/RadialGradient;->radiusToCorner(FFFFLcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)Lkotlin/Pair;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    return-object p1
.end method

.method private final radiusToCorner(FFFFLcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)Lkotlin/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF",
            "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-direct {v0, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lkotlin/Pair;

    .line 12
    .line 13
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lkotlin/Pair;

    .line 21
    .line 22
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-direct {v3, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Lkotlin/Pair;

    .line 34
    .line 35
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-direct {v4, v1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    filled-new-array {v0, v2, v3, v4}, [Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v1, 0x0

    .line 47
    aget-object v2, v0, v1

    .line 48
    .line 49
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    sub-float v2, p1, v2

    .line 60
    .line 61
    float-to-double v2, v2

    .line 62
    const/4 v4, 0x2

    .line 63
    int-to-double v4, v4

    .line 64
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    double-to-float v2, v2

    .line 69
    aget-object v3, v0, v1

    .line 70
    .line 71
    invoke-virtual {v3}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    sub-float v3, p2, v3

    .line 82
    .line 83
    float-to-double v6, v3

    .line 84
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    double-to-float v3, v6

    .line 89
    add-float/2addr v2, v3

    .line 90
    float-to-double v2, v2

    .line 91
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    double-to-float v2, v2

    .line 96
    sget-object v3, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;->CLOSEST_CORNER:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;

    .line 97
    .line 98
    const/4 v6, 0x1

    .line 99
    if-ne p5, v3, :cond_0

    .line 100
    .line 101
    move p5, v6

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move p5, v1

    .line 104
    :goto_0
    const/4 v3, 0x4

    .line 105
    if-ge v6, v3, :cond_3

    .line 106
    .line 107
    aget-object v3, v0, v6

    .line 108
    .line 109
    invoke-virtual {v3}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    sub-float v3, p1, v3

    .line 120
    .line 121
    float-to-double v7, v3

    .line 122
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 123
    .line 124
    .line 125
    move-result-wide v7

    .line 126
    double-to-float v3, v7

    .line 127
    aget-object v7, v0, v6

    .line 128
    .line 129
    invoke-virtual {v7}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    check-cast v7, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    sub-float v7, p2, v7

    .line 140
    .line 141
    float-to-double v7, v7

    .line 142
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 143
    .line 144
    .line 145
    move-result-wide v7

    .line 146
    double-to-float v7, v7

    .line 147
    add-float/2addr v3, v7

    .line 148
    float-to-double v7, v3

    .line 149
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 150
    .line 151
    .line 152
    move-result-wide v7

    .line 153
    double-to-float v3, v7

    .line 154
    if-eqz p5, :cond_1

    .line 155
    .line 156
    cmpg-float v7, v3, v2

    .line 157
    .line 158
    if-gez v7, :cond_2

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_1
    cmpl-float v7, v3, v2

    .line 162
    .line 163
    if-lez v7, :cond_2

    .line 164
    .line 165
    :goto_1
    move v2, v3

    .line 166
    move v1, v6

    .line 167
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_3
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->shape:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 171
    .line 172
    sget-object v4, Lcom/facebook/react/uimanager/style/RadialGradient$Shape;->CIRCLE:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 173
    .line 174
    if-ne v3, v4, :cond_4

    .line 175
    .line 176
    new-instance p1, Lkotlin/Pair;

    .line 177
    .line 178
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    return-object p1

    .line 190
    :cond_4
    if-eqz p5, :cond_5

    .line 191
    .line 192
    sget-object p5, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;->CLOSEST_SIDE:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;

    .line 193
    .line 194
    :goto_2
    move-object v2, p0

    .line 195
    move v3, p1

    .line 196
    move v4, p2

    .line 197
    move v5, p3

    .line 198
    move v6, p4

    .line 199
    move-object v7, p5

    .line 200
    goto :goto_3

    .line 201
    :cond_5
    sget-object p5, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;->FARTHEST_SIDE:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :goto_3
    invoke-direct/range {v2 .. v7}, Lcom/facebook/react/uimanager/style/RadialGradient;->radiusToSide(FFFFLcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)Lkotlin/Pair;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    aget-object p2, v0, v1

    .line 209
    .line 210
    invoke-virtual {p2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    check-cast p2, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    sub-float/2addr p2, v3

    .line 221
    aget-object p3, v0, v1

    .line 222
    .line 223
    invoke-virtual {p3}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p3

    .line 227
    check-cast p3, Ljava/lang/Number;

    .line 228
    .line 229
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 230
    .line 231
    .line 232
    move-result p3

    .line 233
    sub-float/2addr p3, v4

    .line 234
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p4

    .line 238
    check-cast p4, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 241
    .line 242
    .line 243
    move-result p4

    .line 244
    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    div-float/2addr p4, p1

    .line 255
    invoke-direct {p0, p2, p3, p4}, Lcom/facebook/react/uimanager/style/RadialGradient;->calculateEllipseRadius(FFF)Lkotlin/Pair;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    return-object p1
.end method

.method private final radiusToSide(FFFFLcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;)Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF",
            "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    sget-object v0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;->CLOSEST_SIDE:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$KeywordType;

    .line 4
    .line 5
    if-ne p5, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p2, p4}, Ljava/lang/Math;->min(FF)F

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p2, p4}, Ljava/lang/Math;->max(FF)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    :goto_0
    iget-object p3, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->shape:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 25
    .line 26
    sget-object p4, Lcom/facebook/react/uimanager/style/RadialGradient$Shape;->CIRCLE:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 27
    .line 28
    if-ne p3, p4, :cond_2

    .line 29
    .line 30
    if-ne p5, v0, :cond_1

    .line 31
    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    :goto_1
    new-instance p2, Lkotlin/Pair;

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p2, p3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object p2

    .line 55
    :cond_2
    new-instance p3, Lkotlin/Pair;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p3, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object p3
.end method


# virtual methods
.method public final getColorStops()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/ColorStop;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->colorStops:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPosition()Lcom/facebook/react/uimanager/style/RadialGradient$Position;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShader(FF)Landroid/graphics/Shader;
    .locals 10

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    div-float v1, p1, v0

    .line 4
    .line 5
    div-float v0, p2, v0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getTop()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getTop()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/LengthPercentage;->getType()Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v2, Lcom/facebook/react/uimanager/LengthPercentageType;->PERCENT:Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 26
    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getTop()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getTop()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2, p2}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :cond_1
    :goto_0
    move v4, v0

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getBottom()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getBottom()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/LengthPercentage;->getType()Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v2, Lcom/facebook/react/uimanager/LengthPercentageType;->PERCENT:Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 77
    .line 78
    if-ne v0, v2, :cond_3

    .line 79
    .line 80
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getBottom()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    :goto_1
    sub-float v0, p2, v0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    sget-object v0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getBottom()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2, p2}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(F)F

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    goto :goto_1

    .line 110
    :goto_2
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getLeft()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getLeft()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/LengthPercentage;->getType()Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->PERCENT:Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 129
    .line 130
    if-ne v0, v1, :cond_4

    .line 131
    .line 132
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getLeft()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    :goto_3
    move v1, v0

    .line 143
    goto :goto_4

    .line 144
    :cond_4
    sget-object v0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 145
    .line 146
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 147
    .line 148
    invoke-virtual {v1}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getLeft()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(F)F

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    goto :goto_3

    .line 161
    :cond_5
    :goto_4
    move v3, v1

    .line 162
    goto :goto_6

    .line 163
    :cond_6
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getRight()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-eqz v0, :cond_5

    .line 170
    .line 171
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getRight()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/LengthPercentage;->getType()Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    sget-object v1, Lcom/facebook/react/uimanager/LengthPercentageType;->PERCENT:Lcom/facebook/react/uimanager/LengthPercentageType;

    .line 182
    .line 183
    if-ne v0, v1, :cond_7

    .line 184
    .line 185
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getRight()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    :goto_5
    sub-float v0, p1, v0

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    sget-object v0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 199
    .line 200
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->position:Lcom/facebook/react/uimanager/style/RadialGradient$Position;

    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/facebook/react/uimanager/style/RadialGradient$Position;->getRight()Lcom/facebook/react/uimanager/LengthPercentage;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/LengthPercentage;->resolve(F)F

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(F)F

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    goto :goto_5

    .line 215
    :goto_6
    invoke-direct {p0, v3, v4, p1, p2}, Lcom/facebook/react/uimanager/style/RadialGradient;->calculateRadius(FFFF)Lkotlin/Pair;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    check-cast p2, Ljava/lang/Number;

    .line 224
    .line 225
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    check-cast p1, Ljava/lang/Number;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    sget-object v0, Lcom/facebook/react/uimanager/style/ColorStopUtils;->INSTANCE:Lcom/facebook/react/uimanager/style/ColorStopUtils;

    .line 240
    .line 241
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->colorStops:Ljava/util/List;

    .line 242
    .line 243
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/style/ColorStopUtils;->getFixedColorStops(Ljava/util/List;F)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    new-array v6, v1, [I

    .line 256
    .line 257
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    new-array v7, v1, [F

    .line 262
    .line 263
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    const/4 v1, 0x0

    .line 268
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_a

    .line 273
    .line 274
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    add-int/lit8 v5, v1, 0x1

    .line 279
    .line 280
    if-gez v1, :cond_8

    .line 281
    .line 282
    invoke-static {}, Lj7/q;->t()V

    .line 283
    .line 284
    .line 285
    :cond_8
    check-cast v2, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 286
    .line 287
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getColor()Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    if-eqz v8, :cond_9

    .line 292
    .line 293
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    if-eqz v9, :cond_9

    .line 298
    .line 299
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    aput v8, v6, v1

    .line 304
    .line 305
    invoke-virtual {v2}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    aput v2, v7, v1

    .line 314
    .line 315
    :cond_9
    move v1, v5

    .line 316
    goto :goto_7

    .line 317
    :cond_a
    const v0, 0x3727c5ac    # 1.0E-5f

    .line 318
    .line 319
    .line 320
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    new-instance v2, Landroid/graphics/RadialGradient;

    .line 325
    .line 326
    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 327
    .line 328
    invoke-direct/range {v2 .. v8}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 329
    .line 330
    .line 331
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->shape:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 332
    .line 333
    sget-object v1, Lcom/facebook/react/uimanager/style/RadialGradient$Shape;->CIRCLE:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 334
    .line 335
    if-ne v0, v1, :cond_b

    .line 336
    .line 337
    return-object v2

    .line 338
    :cond_b
    invoke-static {p2, p1}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-nez v0, :cond_c

    .line 343
    .line 344
    new-instance v0, Landroid/graphics/Matrix;

    .line 345
    .line 346
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 347
    .line 348
    .line 349
    const/high16 v1, 0x3f800000    # 1.0f

    .line 350
    .line 351
    div-float/2addr p1, p2

    .line 352
    invoke-virtual {v0, v1, p1, v3, v4}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 356
    .line 357
    .line 358
    :cond_c
    return-object v2
.end method

.method public final getShape()Lcom/facebook/react/uimanager/style/RadialGradient$Shape;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->shape:Lcom/facebook/react/uimanager/style/RadialGradient$Shape;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSize()Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient;->size:Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;

    .line 2
    .line 3
    return-object v0
.end method
