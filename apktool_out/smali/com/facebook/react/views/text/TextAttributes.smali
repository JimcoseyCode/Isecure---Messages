.class public final Lcom/facebook/react/views/text/TextAttributes;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/TextAttributes$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000J\u0008\u0010*\u001a\u00020+H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\r\"\u0004\u0008\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\r\"\u0004\u0008\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\r\"\u0004\u0008\u0018\u0010\u000fR\u0012\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\r\"\u0004\u0008\u001f\u0010\u000fR\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u0011\u0010$\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\rR\u0011\u0010&\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\rR\u0011\u0010(\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\r\u00a8\u0006-"
    }
    d2 = {
        "Lcom/facebook/react/views/text/TextAttributes;",
        "",
        "<init>",
        "()V",
        "allowFontScaling",
        "",
        "getAllowFontScaling",
        "()Z",
        "setAllowFontScaling",
        "(Z)V",
        "fontSize",
        "",
        "getFontSize",
        "()F",
        "setFontSize",
        "(F)V",
        "lineHeight",
        "getLineHeight",
        "setLineHeight",
        "letterSpacing",
        "getLetterSpacing",
        "setLetterSpacing",
        "heightOfTallestInlineViewOrImage",
        "getHeightOfTallestInlineViewOrImage",
        "setHeightOfTallestInlineViewOrImage",
        "textTransform",
        "Lcom/facebook/react/views/text/TextTransform;",
        "applyChild",
        "child",
        "maxFontSizeMultiplier",
        "getMaxFontSizeMultiplier",
        "setMaxFontSizeMultiplier",
        "effectiveFontSize",
        "",
        "getEffectiveFontSize",
        "()I",
        "effectiveLineHeight",
        "getEffectiveLineHeight",
        "effectiveLetterSpacing",
        "getEffectiveLetterSpacing",
        "effectiveMaxFontSizeMultiplier",
        "getEffectiveMaxFontSizeMultiplier",
        "toString",
        "",
        "Companion",
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
.field public static final Companion:Lcom/facebook/react/views/text/TextAttributes$Companion;

.field public static final DEFAULT_MAX_FONT_SIZE_MULTIPLIER:F


# instance fields
.field private allowFontScaling:Z

.field private fontSize:F

.field private heightOfTallestInlineViewOrImage:F

.field private letterSpacing:F

.field private lineHeight:F

.field private maxFontSizeMultiplier:F

.field public textTransform:Lcom/facebook/react/views/text/TextTransform;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/TextAttributes$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/TextAttributes$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/TextAttributes;->Companion:Lcom/facebook/react/views/text/TextAttributes$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 6
    .line 7
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 8
    .line 9
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 10
    .line 11
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 12
    .line 13
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 14
    .line 15
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 16
    .line 17
    sget-object v1, Lcom/facebook/react/views/text/TextTransform;->UNSET:Lcom/facebook/react/views/text/TextTransform;

    .line 18
    .line 19
    iput-object v1, p0, Lcom/facebook/react/views/text/TextAttributes;->textTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 20
    .line 21
    iput v0, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final applyChild(Lcom/facebook/react/views/text/TextAttributes;)Lcom/facebook/react/views/text/TextAttributes;
    .locals 2

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/views/text/TextAttributes;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/facebook/react/views/text/TextAttributes;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 12
    .line 13
    iput-boolean v1, v0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 14
    .line 15
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 27
    .line 28
    :goto_0
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 29
    .line 30
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 42
    .line 43
    :goto_1
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 44
    .line 45
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 57
    .line 58
    :goto_2
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 59
    .line 60
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 72
    .line 73
    :goto_3
    invoke-virtual {v0, v1}, Lcom/facebook/react/views/text/TextAttributes;->setMaxFontSizeMultiplier(F)V

    .line 74
    .line 75
    .line 76
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 77
    .line 78
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    iget v1, p1, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 88
    .line 89
    :goto_4
    iput v1, v0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 90
    .line 91
    iget-object p1, p1, Lcom/facebook/react/views/text/TextAttributes;->textTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 92
    .line 93
    sget-object v1, Lcom/facebook/react/views/text/TextTransform;->UNSET:Lcom/facebook/react/views/text/TextTransform;

    .line 94
    .line 95
    if-eq p1, v1, :cond_5

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_5
    iget-object p1, p0, Lcom/facebook/react/views/text/TextAttributes;->textTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 99
    .line 100
    :goto_5
    iput-object p1, v0, Lcom/facebook/react/views/text/TextAttributes;->textTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 101
    .line 102
    return-object v0
.end method

.method public final getAllowFontScaling()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getEffectiveFontSize()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/high16 v0, 0x41600000    # 14.0f

    .line 13
    .line 14
    :goto_0
    iget-boolean v1, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(FF)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    float-to-double v0, v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    :goto_1
    double-to-int v0, v0

    .line 32
    return v0

    .line 33
    :cond_1
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    float-to-double v0, v0

    .line 38
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    goto :goto_1
.end method

.method public final getEffectiveLetterSpacing()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(FF)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 28
    .line 29
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-float v1, v1

    .line 38
    div-float/2addr v0, v1

    .line 39
    return v0
.end method

.method public final getEffectiveLineHeight()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(FF)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 28
    .line 29
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 42
    .line 43
    cmpl-float v2, v1, v0

    .line 44
    .line 45
    if-lez v2, :cond_2

    .line 46
    .line 47
    return v1

    .line 48
    :cond_2
    return v0
.end method

.method public final getEffectiveMaxFontSizeMultiplier()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public final getFontSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getHeightOfTallestInlineViewOrImage()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 2
    .line 3
    return v0
.end method

.method public final getLetterSpacing()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 2
    .line 3
    return v0
.end method

.method public final getLineHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxFontSizeMultiplier()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 2
    .line 3
    return v0
.end method

.method public final setAllowFontScaling(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFontSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 2
    .line 3
    return-void
.end method

.method public final setHeightOfTallestInlineViewOrImage(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 2
    .line 3
    return-void
.end method

.method public final setLetterSpacing(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 2
    .line 3
    return-void
.end method

.method public final setLineHeight(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxFontSizeMultiplier(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpg-float v0, p1, v0

    .line 10
    .line 11
    if-gez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string p1, "ReactNative"

    .line 20
    .line 21
    const-string v0, "maxFontSizeMultiplier must be NaN, 0, or >= 1"

    .line 22
    .line 23
    invoke-static {p1, v0}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 27
    .line 28
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    :goto_0
    iput p1, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 32
    .line 33
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/TextAttributes;->allowFontScaling:Z

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/views/text/TextAttributes;->fontSize:F

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget v3, p0, Lcom/facebook/react/views/text/TextAttributes;->heightOfTallestInlineViewOrImage:F

    .line 10
    .line 11
    iget v4, p0, Lcom/facebook/react/views/text/TextAttributes;->letterSpacing:F

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLetterSpacing()F

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget v6, p0, Lcom/facebook/react/views/text/TextAttributes;->lineHeight:F

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveLineHeight()F

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    iget-object v8, p0, Lcom/facebook/react/views/text/TextAttributes;->textTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 24
    .line 25
    iget v9, p0, Lcom/facebook/react/views/text/TextAttributes;->maxFontSizeMultiplier:F

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveMaxFontSizeMultiplier()F

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    new-instance v11, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v12, "\n        TextAttributes {\n          getAllowFontScaling(): "

    .line 37
    .line 38
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "\n          getFontSize(): "

    .line 45
    .line 46
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, "\n          getEffectiveFontSize(): "

    .line 53
    .line 54
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, "\n          getHeightOfTallestInlineViewOrImage(): "

    .line 61
    .line 62
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, "\n          getLetterSpacing(): "

    .line 69
    .line 70
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, "\n          getEffectiveLetterSpacing(): "

    .line 77
    .line 78
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, "\n          getLineHeight(): "

    .line 85
    .line 86
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, "\n          getEffectiveLineHeight(): "

    .line 93
    .line 94
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, "\n          getTextTransform(): "

    .line 101
    .line 102
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, "\n          getMaxFontSizeMultiplier(): "

    .line 109
    .line 110
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, "\n          getEffectiveMaxFontSizeMultiplier(): "

    .line 117
    .line 118
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v0, "\n        }\n      "

    .line 125
    .line 126
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, LP8/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0
.end method
