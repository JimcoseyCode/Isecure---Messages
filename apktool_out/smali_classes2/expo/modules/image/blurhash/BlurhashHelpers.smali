.class public final Lexpo/modules/image/blurhash/BlurhashHelpers;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/blurhash/BlurhashHelpers$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lexpo/modules/image/blurhash/BlurhashHelpers;",
        "",
        "<init>",
        "()V",
        "srgbToLinear",
        "",
        "colorEnc",
        "",
        "linearTosRGB",
        "value",
        "signPow",
        "exp",
        "getBitsPerPixel",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "expo-image_release"
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
.field public static final INSTANCE:Lexpo/modules/image/blurhash/BlurhashHelpers;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/image/blurhash/BlurhashHelpers;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/image/blurhash/BlurhashHelpers;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/image/blurhash/BlurhashHelpers;->INSTANCE:Lexpo/modules/image/blurhash/BlurhashHelpers;

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


# virtual methods
.method public final getBitsPerPixel(Landroid/graphics/Bitmap;)I
    .locals 2

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lexpo/modules/image/blurhash/BlurhashHelpers$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget p1, v0, p1

    .line 21
    .line 22
    :goto_0
    const/4 v0, 0x1

    .line 23
    if-eq p1, v0, :cond_4

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    const/16 v1, 0x10

    .line 27
    .line 28
    if-eq p1, v0, :cond_3

    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    if-eq p1, v0, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    if-eq p1, v0, :cond_1

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    return p1

    .line 38
    :cond_1
    return v1

    .line 39
    :cond_2
    const/16 p1, 0x8

    .line 40
    .line 41
    return p1

    .line 42
    :cond_3
    return v1

    .line 43
    :cond_4
    const/16 p1, 0x20

    .line 44
    .line 45
    return p1
.end method

.method public final linearTosRGB(F)I
    .locals 7

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    float-to-double v0, p1

    .line 13
    const-wide v2, 0x3f69a5c37387b719L    # 0.0031308

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmpg-double p1, v0, v2

    .line 19
    .line 20
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 21
    .line 22
    const/16 v4, 0xff

    .line 23
    .line 24
    if-gtz p1, :cond_0

    .line 25
    .line 26
    const-wide v5, 0x4029d70a3d70a3d7L    # 12.92

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    :goto_0
    mul-double/2addr v0, v5

    .line 32
    int-to-double v4, v4

    .line 33
    mul-double/2addr v0, v4

    .line 34
    add-double/2addr v0, v2

    .line 35
    double-to-int p1, v0

    .line 36
    return p1

    .line 37
    :cond_0
    const p1, 0x3ed55555

    .line 38
    .line 39
    .line 40
    float-to-double v5, p1

    .line 41
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    double-to-float p1, v0

    .line 46
    float-to-double v0, p1

    .line 47
    const-wide v5, 0x3fac28f5c28f5c29L    # 0.055

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    sub-double/2addr v0, v5

    .line 53
    const-wide v5, 0x3ff0e147ae147ae1L    # 1.055

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_0
.end method

.method public final signPow(FF)F
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    float-to-double v0, v0

    .line 6
    float-to-double v2, p2

    .line 7
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    double-to-float p2, v0

    .line 12
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    mul-float/2addr p2, p1

    .line 17
    return p2
.end method

.method public final srgbToLinear(I)F
    .locals 4

    .line 1
    int-to-float p1, p1

    .line 2
    const/high16 v0, 0x437f0000    # 255.0f

    .line 3
    .line 4
    div-float/2addr p1, v0

    .line 5
    const v0, 0x3d25aee6    # 0.04045f

    .line 6
    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const v0, 0x414eb852    # 12.92f

    .line 13
    .line 14
    .line 15
    div-float/2addr p1, v0

    .line 16
    return p1

    .line 17
    :cond_0
    const v0, 0x3d6147ae    # 0.055f

    .line 18
    .line 19
    .line 20
    add-float/2addr p1, v0

    .line 21
    const v0, 0x3f870a3d    # 1.055f

    .line 22
    .line 23
    .line 24
    div-float/2addr p1, v0

    .line 25
    float-to-double v0, p1

    .line 26
    const p1, 0x4019999a    # 2.4f

    .line 27
    .line 28
    .line 29
    float-to-double v2, p1

    .line 30
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    double-to-float p1, v0

    .line 35
    return p1
.end method
