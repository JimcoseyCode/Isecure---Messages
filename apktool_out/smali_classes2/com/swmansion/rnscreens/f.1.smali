.class public abstract Lcom/swmansion/rnscreens/f;
.super Landroid/view/ViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/f$a;
    }
.end annotation


# static fields
.field public static final l:Lcom/swmansion/rnscreens/f$a;


# instance fields
.field private g:Lcom/facebook/react/uimanager/StateWrapper;

.field private h:F

.field private i:F

.field private j:F

.field private k:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/f;->l:Lcom/swmansion/rnscreens/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b(IIII)V
    .locals 4

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-static {p1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    int-to-float p2, p2

    .line 7
    invoke-static {p2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    int-to-float p3, p3

    .line 12
    invoke-static {p3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    int-to-float p4, p4

    .line 17
    invoke-static {p4}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    iget v0, p0, Lcom/swmansion/rnscreens/f;->h:F

    .line 22
    .line 23
    sub-float/2addr v0, p1

    .line 24
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const v1, 0x3f666666    # 0.9f

    .line 29
    .line 30
    .line 31
    cmpg-float v0, v0, v1

    .line 32
    .line 33
    if-gez v0, :cond_0

    .line 34
    .line 35
    iget v0, p0, Lcom/swmansion/rnscreens/f;->i:F

    .line 36
    .line 37
    sub-float/2addr v0, p2

    .line 38
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    cmpg-float v0, v0, v1

    .line 43
    .line 44
    if-gez v0, :cond_0

    .line 45
    .line 46
    iget v0, p0, Lcom/swmansion/rnscreens/f;->j:F

    .line 47
    .line 48
    sub-float/2addr v0, p3

    .line 49
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    cmpg-float v0, v0, v1

    .line 54
    .line 55
    if-gez v0, :cond_0

    .line 56
    .line 57
    iget v0, p0, Lcom/swmansion/rnscreens/f;->k:F

    .line 58
    .line 59
    sub-float/2addr v0, p4

    .line 60
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    cmpg-float v0, v0, v1

    .line 65
    .line 66
    if-gez v0, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    iput p1, p0, Lcom/swmansion/rnscreens/f;->h:F

    .line 70
    .line 71
    iput p2, p0, Lcom/swmansion/rnscreens/f;->i:F

    .line 72
    .line 73
    iput p3, p0, Lcom/swmansion/rnscreens/f;->j:F

    .line 74
    .line 75
    iput p4, p0, Lcom/swmansion/rnscreens/f;->k:F

    .line 76
    .line 77
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 78
    .line 79
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v1, "frameWidth"

    .line 83
    .line 84
    float-to-double v2, p1

    .line 85
    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 86
    .line 87
    .line 88
    const-string p1, "frameHeight"

    .line 89
    .line 90
    float-to-double v1, p2

    .line 91
    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 92
    .line 93
    .line 94
    const-string p1, "paddingStart"

    .line 95
    .line 96
    float-to-double p2, p3

    .line 97
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 98
    .line 99
    .line 100
    const-string p1, "paddingEnd"

    .line 101
    .line 102
    float-to-double p2, p4

    .line 103
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/swmansion/rnscreens/f;->g:Lcom/facebook/react/uimanager/StateWrapper;

    .line 107
    .line 108
    if-eqz p1, :cond_1

    .line 109
    .line 110
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/StateWrapper;->updateState(Lcom/facebook/react/bridge/WritableMap;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/swmansion/rnscreens/f;->b(IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setStateWrapper(Lcom/facebook/react/uimanager/StateWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/f;->g:Lcom/facebook/react/uimanager/StateWrapper;

    .line 2
    .line 3
    return-void
.end method
