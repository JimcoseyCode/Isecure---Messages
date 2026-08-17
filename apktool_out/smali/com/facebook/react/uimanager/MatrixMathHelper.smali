.class public final Lcom/facebook/react/uimanager/MatrixMathHelper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0013\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008;\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001KB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008$\u0010%J/\u0010(\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010*\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00082\u0010.J\u0017\u00103\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u00083\u00104J\u001f\u00106\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00086\u00107J\u001f\u00109\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u00089\u00107J\u001f\u0010:\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008:\u00107J\'\u0010=\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008=\u0010>J/\u0010@\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008@\u0010AJ\u001f\u0010C\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008C\u00107J\u001f\u0010D\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008D\u00107J\u001f\u0010E\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008E\u00107J\u001f\u0010F\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008F\u00107J\u001f\u0010G\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008G\u00107J\u001d\u0010H\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0004\u00a2\u0006\u0004\u0008H\u00107R\u0014\u0010I\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008I\u0010J\u00a8\u0006L"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/MatrixMathHelper;",
        "",
        "<init>",
        "()V",
        "",
        "d",
        "",
        "isZero",
        "(D)Z",
        "",
        "out",
        "a",
        "b",
        "Li7/B;",
        "multiplyInto",
        "([D[D[D)V",
        "transformMatrix",
        "Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;",
        "ctx",
        "decomposeMatrix",
        "([DLcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;)V",
        "matrix",
        "determinant",
        "([D)D",
        "inverse",
        "([D)[D",
        "m",
        "transpose",
        "v",
        "result",
        "multiplyVectorByMatrix",
        "v3Length",
        "vector",
        "norm",
        "v3Normalize",
        "([DD)[D",
        "v3Dot",
        "([D[D)D",
        "aScale",
        "bScale",
        "v3Combine",
        "([D[DDD)[D",
        "v3Cross",
        "([D[D)[D",
        "n",
        "roundTo3Places",
        "(D)D",
        "createIdentityMatrix",
        "()[D",
        "degrees",
        "degreesToRadians",
        "resetIdentityMatrix",
        "([D)V",
        "perspective",
        "applyPerspective",
        "([DD)V",
        "factor",
        "applyScaleX",
        "applyScaleY",
        "x",
        "y",
        "applyTranslate2D",
        "([DDD)V",
        "z",
        "applyTranslate3D",
        "([DDDD)V",
        "radians",
        "applySkewX",
        "applySkewY",
        "applyRotateX",
        "applyRotateY",
        "applyRotateZ",
        "applyScaleZ",
        "EPSILON",
        "D",
        "MatrixDecompositionContext",
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
.field private static final EPSILON:D = 1.0E-5

.field public static final INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/MatrixMathHelper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

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

.method public static final applyPerspective([DD)V
    .locals 2

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    int-to-double v0, v0

    .line 8
    div-double/2addr v0, p1

    .line 9
    const/16 p1, 0xb

    .line 10
    .line 11
    aput-wide v0, p0, p1

    .line 12
    .line 13
    return-void
.end method

.method public static final applyRotateX([DD)V
    .locals 3

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    aput-wide v1, p0, v0

    .line 12
    .line 13
    const/4 v0, 0x6

    .line 14
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    aput-wide v1, p0, v0

    .line 19
    .line 20
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    neg-double v0, v0

    .line 25
    const/16 v2, 0x9

    .line 26
    .line 27
    aput-wide v0, p0, v2

    .line 28
    .line 29
    const/16 v0, 0xa

    .line 30
    .line 31
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    aput-wide p1, p0, v0

    .line 36
    .line 37
    return-void
.end method

.method public static final applyRotateY([DD)V
    .locals 3

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    aput-wide v1, p0, v0

    .line 12
    .line 13
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    neg-double v0, v0

    .line 18
    const/4 v2, 0x2

    .line 19
    aput-wide v0, p0, v2

    .line 20
    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    aput-wide v1, p0, v0

    .line 28
    .line 29
    const/16 v0, 0xa

    .line 30
    .line 31
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    aput-wide p1, p0, v0

    .line 36
    .line 37
    return-void
.end method

.method public static final applyRotateZ([DD)V
    .locals 3

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    aput-wide v1, p0, v0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    aput-wide v1, p0, v0

    .line 19
    .line 20
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    neg-double v0, v0

    .line 25
    const/4 v2, 0x4

    .line 26
    aput-wide v0, p0, v2

    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    aput-wide p1, p0, v0

    .line 34
    .line 35
    return-void
.end method

.method public static final applyScaleX([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aput-wide p1, p0, v0

    .line 8
    .line 9
    return-void
.end method

.method public static final applyScaleY([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    aput-wide p1, p0, v0

    .line 8
    .line 9
    return-void
.end method

.method public static final applySkewX([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    aput-wide p1, p0, v0

    .line 12
    .line 13
    return-void
.end method

.method public static final applySkewY([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    aput-wide p1, p0, v0

    .line 12
    .line 13
    return-void
.end method

.method public static final applyTranslate2D([DDD)V
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xc

    .line 7
    .line 8
    aput-wide p1, p0, v0

    .line 9
    .line 10
    const/16 p1, 0xd

    .line 11
    .line 12
    aput-wide p3, p0, p1

    .line 13
    .line 14
    return-void
.end method

.method public static final applyTranslate3D([DDDD)V
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xc

    .line 7
    .line 8
    aput-wide p1, p0, v0

    .line 9
    .line 10
    const/16 p1, 0xd

    .line 11
    .line 12
    aput-wide p3, p0, p1

    .line 13
    .line 14
    const/16 p1, 0xe

    .line 15
    .line 16
    aput-wide p5, p0, p1

    .line 17
    .line 18
    return-void
.end method

.method public static final createIdentityMatrix()[D
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final decomposeMatrix([DLcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "transformMatrix"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "ctx"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    array-length v2, v0

    .line 16
    const/16 v5, 0x10

    .line 17
    .line 18
    if-ne v2, v5, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x0

    .line 23
    :goto_0
    invoke-static {v2}, Lo3/a;->a(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->perspective:[D

    .line 27
    .line 28
    iget-object v6, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->scale:[D

    .line 29
    .line 30
    iget-object v7, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->skew:[D

    .line 31
    .line 32
    iget-object v8, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->translation:[D

    .line 33
    .line 34
    iget-object v1, v1, Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;->rotationDegrees:[D

    .line 35
    .line 36
    sget-object v9, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 37
    .line 38
    const/16 v10, 0xf

    .line 39
    .line 40
    aget-wide v11, v0, v10

    .line 41
    .line 42
    invoke-direct {v9, v11, v12}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_1
    const/4 v9, 0x4

    .line 50
    new-array v11, v9, [[D

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_1
    if-ge v12, v9, :cond_2

    .line 54
    .line 55
    new-array v13, v9, [D

    .line 56
    .line 57
    aput-object v13, v11, v12

    .line 58
    .line 59
    add-int/lit8 v12, v12, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-array v5, v5, [D

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    :goto_2
    const-wide/16 v13, 0x0

    .line 66
    .line 67
    const/4 v15, 0x3

    .line 68
    if-ge v12, v9, :cond_5

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    :goto_3
    if-ge v3, v9, :cond_4

    .line 74
    .line 75
    mul-int/lit8 v17, v12, 0x4

    .line 76
    .line 77
    add-int v17, v17, v3

    .line 78
    .line 79
    aget-wide v18, v0, v17

    .line 80
    .line 81
    aget-wide v20, v0, v10

    .line 82
    .line 83
    div-double v18, v18, v20

    .line 84
    .line 85
    aget-object v20, v11, v12

    .line 86
    .line 87
    aput-wide v18, v20, v3

    .line 88
    .line 89
    if-ne v3, v15, :cond_3

    .line 90
    .line 91
    move-wide/from16 v18, v13

    .line 92
    .line 93
    :cond_3
    aput-wide v18, v5, v17

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    add-int/lit8 v12, v12, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const/16 v16, 0x0

    .line 102
    .line 103
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 104
    .line 105
    aput-wide v17, v5, v10

    .line 106
    .line 107
    sget-object v0, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 108
    .line 109
    move-object v10, v5

    .line 110
    const/4 v3, 0x1

    .line 111
    invoke-static {v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->determinant([D)D

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    invoke-direct {v0, v4, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_6

    .line 120
    .line 121
    :goto_4
    return-void

    .line 122
    :cond_6
    aget-object v4, v11, v16

    .line 123
    .line 124
    move/from16 p0, v3

    .line 125
    .line 126
    aget-wide v3, v4, v15

    .line 127
    .line 128
    invoke-direct {v0, v3, v4}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_8

    .line 133
    .line 134
    aget-object v3, v11, p0

    .line 135
    .line 136
    const/16 p1, 0x2

    .line 137
    .line 138
    aget-wide v4, v3, v15

    .line 139
    .line 140
    invoke-direct {v0, v4, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_9

    .line 145
    .line 146
    aget-object v3, v11, p1

    .line 147
    .line 148
    aget-wide v4, v3, v15

    .line 149
    .line 150
    invoke-direct {v0, v4, v5}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_7

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_7
    aput-wide v13, v2, p1

    .line 158
    .line 159
    aput-wide v13, v2, p0

    .line 160
    .line 161
    aput-wide v13, v2, v16

    .line 162
    .line 163
    aput-wide v17, v2, v15

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    const/16 p1, 0x2

    .line 167
    .line 168
    :cond_9
    :goto_5
    aget-object v0, v11, v16

    .line 169
    .line 170
    aget-wide v3, v0, v15

    .line 171
    .line 172
    aget-object v0, v11, p0

    .line 173
    .line 174
    aget-wide v17, v0, v15

    .line 175
    .line 176
    aget-object v0, v11, p1

    .line 177
    .line 178
    aget-wide v19, v0, v15

    .line 179
    .line 180
    aget-object v0, v11, v15

    .line 181
    .line 182
    aget-wide v21, v0, v15

    .line 183
    .line 184
    new-array v0, v9, [D

    .line 185
    .line 186
    aput-wide v3, v0, v16

    .line 187
    .line 188
    aput-wide v17, v0, p0

    .line 189
    .line 190
    aput-wide v19, v0, p1

    .line 191
    .line 192
    aput-wide v21, v0, v15

    .line 193
    .line 194
    invoke-static {v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->inverse([D)[D

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->transpose([D)[D

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-static {v0, v3, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyVectorByMatrix([D[D[D)V

    .line 203
    .line 204
    .line 205
    :goto_6
    move/from16 v0, v16

    .line 206
    .line 207
    :goto_7
    if-ge v0, v15, :cond_a

    .line 208
    .line 209
    aget-object v2, v11, v15

    .line 210
    .line 211
    aget-wide v3, v2, v0

    .line 212
    .line 213
    aput-wide v3, v8, v0

    .line 214
    .line 215
    add-int/lit8 v0, v0, 0x1

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_a
    new-array v0, v15, [[D

    .line 219
    .line 220
    move/from16 v2, v16

    .line 221
    .line 222
    :goto_8
    if-ge v2, v15, :cond_b

    .line 223
    .line 224
    new-array v3, v15, [D

    .line 225
    .line 226
    aput-object v3, v0, v2

    .line 227
    .line 228
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_b
    move/from16 v2, v16

    .line 232
    .line 233
    :goto_9
    if-ge v2, v15, :cond_c

    .line 234
    .line 235
    aget-object v3, v0, v2

    .line 236
    .line 237
    aget-object v4, v11, v2

    .line 238
    .line 239
    aget-wide v8, v4, v16

    .line 240
    .line 241
    aput-wide v8, v3, v16

    .line 242
    .line 243
    aget-wide v8, v4, p0

    .line 244
    .line 245
    aput-wide v8, v3, p0

    .line 246
    .line 247
    aget-wide v8, v4, p1

    .line 248
    .line 249
    aput-wide v8, v3, p1

    .line 250
    .line 251
    add-int/lit8 v2, v2, 0x1

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_c
    aget-object v2, v0, v16

    .line 255
    .line 256
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 257
    .line 258
    .line 259
    move-result-wide v2

    .line 260
    aput-wide v2, v6, v16

    .line 261
    .line 262
    aget-object v4, v0, v16

    .line 263
    .line 264
    invoke-static {v4, v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    aput-object v2, v0, v16

    .line 269
    .line 270
    aget-object v3, v0, p0

    .line 271
    .line 272
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 273
    .line 274
    .line 275
    move-result-wide v2

    .line 276
    aput-wide v2, v7, v16

    .line 277
    .line 278
    aget-object v17, v0, p0

    .line 279
    .line 280
    aget-object v18, v0, v16

    .line 281
    .line 282
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 283
    .line 284
    neg-double v2, v2

    .line 285
    move-wide/from16 v21, v2

    .line 286
    .line 287
    invoke-static/range {v17 .. v22}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    aput-object v2, v0, p0

    .line 292
    .line 293
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    aput-wide v2, v6, p0

    .line 298
    .line 299
    aget-object v4, v0, p0

    .line 300
    .line 301
    invoke-static {v4, v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    aput-object v2, v0, p0

    .line 306
    .line 307
    aget-wide v2, v7, v16

    .line 308
    .line 309
    aget-wide v4, v6, p0

    .line 310
    .line 311
    div-double/2addr v2, v4

    .line 312
    aput-wide v2, v7, v16

    .line 313
    .line 314
    aget-object v2, v0, v16

    .line 315
    .line 316
    aget-object v3, v0, p1

    .line 317
    .line 318
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    aput-wide v2, v7, p0

    .line 323
    .line 324
    aget-object v17, v0, p1

    .line 325
    .line 326
    aget-object v18, v0, v16

    .line 327
    .line 328
    neg-double v2, v2

    .line 329
    move-wide/from16 v21, v2

    .line 330
    .line 331
    invoke-static/range {v17 .. v22}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    aput-object v2, v0, p1

    .line 336
    .line 337
    aget-object v3, v0, p0

    .line 338
    .line 339
    invoke-static {v3, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 340
    .line 341
    .line 342
    move-result-wide v2

    .line 343
    aput-wide v2, v7, p1

    .line 344
    .line 345
    aget-object v17, v0, p1

    .line 346
    .line 347
    aget-object v18, v0, p0

    .line 348
    .line 349
    neg-double v2, v2

    .line 350
    move-wide/from16 v21, v2

    .line 351
    .line 352
    invoke-static/range {v17 .. v22}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Combine([D[DDD)[D

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    aput-object v2, v0, p1

    .line 357
    .line 358
    invoke-static {v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 359
    .line 360
    .line 361
    move-result-wide v2

    .line 362
    aput-wide v2, v6, p1

    .line 363
    .line 364
    aget-object v4, v0, p1

    .line 365
    .line 366
    invoke-static {v4, v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Normalize([DD)[D

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    aput-object v2, v0, p1

    .line 371
    .line 372
    aget-wide v3, v7, p0

    .line 373
    .line 374
    aget-wide v8, v6, p1

    .line 375
    .line 376
    div-double/2addr v3, v8

    .line 377
    aput-wide v3, v7, p0

    .line 378
    .line 379
    aget-wide v3, v7, p1

    .line 380
    .line 381
    div-double/2addr v3, v8

    .line 382
    aput-wide v3, v7, p1

    .line 383
    .line 384
    aget-object v3, v0, p0

    .line 385
    .line 386
    invoke-static {v3, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Cross([D[D)[D

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    aget-object v3, v0, v16

    .line 391
    .line 392
    invoke-static {v3, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Dot([D[D)D

    .line 393
    .line 394
    .line 395
    move-result-wide v2

    .line 396
    cmpg-double v2, v2, v13

    .line 397
    .line 398
    if-gez v2, :cond_d

    .line 399
    .line 400
    move/from16 v2, v16

    .line 401
    .line 402
    :goto_a
    if-ge v2, v15, :cond_d

    .line 403
    .line 404
    aget-wide v3, v6, v2

    .line 405
    .line 406
    const-wide/high16 v7, -0x4010000000000000L    # -1.0

    .line 407
    .line 408
    mul-double/2addr v3, v7

    .line 409
    aput-wide v3, v6, v2

    .line 410
    .line 411
    aget-object v3, v0, v2

    .line 412
    .line 413
    aget-wide v4, v3, v16

    .line 414
    .line 415
    mul-double/2addr v4, v7

    .line 416
    aput-wide v4, v3, v16

    .line 417
    .line 418
    aget-wide v4, v3, p0

    .line 419
    .line 420
    mul-double/2addr v4, v7

    .line 421
    aput-wide v4, v3, p0

    .line 422
    .line 423
    aget-wide v4, v3, p1

    .line 424
    .line 425
    mul-double/2addr v4, v7

    .line 426
    aput-wide v4, v3, p1

    .line 427
    .line 428
    add-int/lit8 v2, v2, 0x1

    .line 429
    .line 430
    goto :goto_a

    .line 431
    :cond_d
    aget-object v2, v0, p1

    .line 432
    .line 433
    aget-wide v3, v2, p0

    .line 434
    .line 435
    aget-wide v5, v2, p1

    .line 436
    .line 437
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 438
    .line 439
    .line 440
    move-result-wide v2

    .line 441
    neg-double v2, v2

    .line 442
    const-wide v4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    mul-double/2addr v2, v4

    .line 448
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 449
    .line 450
    .line 451
    move-result-wide v2

    .line 452
    aput-wide v2, v1, v16

    .line 453
    .line 454
    aget-object v2, v0, p1

    .line 455
    .line 456
    aget-wide v6, v2, v16

    .line 457
    .line 458
    neg-double v6, v6

    .line 459
    aget-wide v8, v2, p0

    .line 460
    .line 461
    mul-double/2addr v8, v8

    .line 462
    aget-wide v10, v2, p1

    .line 463
    .line 464
    mul-double/2addr v10, v10

    .line 465
    add-double/2addr v8, v10

    .line 466
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    .line 467
    .line 468
    .line 469
    move-result-wide v2

    .line 470
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 471
    .line 472
    .line 473
    move-result-wide v2

    .line 474
    neg-double v2, v2

    .line 475
    mul-double/2addr v2, v4

    .line 476
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 477
    .line 478
    .line 479
    move-result-wide v2

    .line 480
    aput-wide v2, v1, p0

    .line 481
    .line 482
    aget-object v2, v0, p0

    .line 483
    .line 484
    aget-wide v6, v2, v16

    .line 485
    .line 486
    aget-object v0, v0, v16

    .line 487
    .line 488
    aget-wide v2, v0, v16

    .line 489
    .line 490
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 491
    .line 492
    .line 493
    move-result-wide v2

    .line 494
    neg-double v2, v2

    .line 495
    mul-double/2addr v2, v4

    .line 496
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/MatrixMathHelper;->roundTo3Places(D)D

    .line 497
    .line 498
    .line 499
    move-result-wide v2

    .line 500
    aput-wide v2, v1, p1

    .line 501
    .line 502
    return-void
.end method

.method public static final degreesToRadians(D)D
    .locals 2

    .line 1
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double/2addr p0, v0

    .line 7
    const/16 v0, 0xb4

    .line 8
    .line 9
    int-to-double v0, v0

    .line 10
    div-double/2addr p0, v0

    .line 11
    return-wide p0
.end method

.method public static final determinant([D)D
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "matrix"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-wide v1, v0, v1

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aget-wide v3, v0, v3

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    aget-wide v5, v0, v5

    .line 16
    .line 17
    const/4 v7, 0x3

    .line 18
    aget-wide v7, v0, v7

    .line 19
    .line 20
    const/4 v9, 0x4

    .line 21
    aget-wide v9, v0, v9

    .line 22
    .line 23
    const/4 v11, 0x5

    .line 24
    aget-wide v11, v0, v11

    .line 25
    .line 26
    const/4 v13, 0x6

    .line 27
    aget-wide v13, v0, v13

    .line 28
    .line 29
    const/4 v15, 0x7

    .line 30
    aget-wide v15, v0, v15

    .line 31
    .line 32
    const/16 v17, 0x8

    .line 33
    .line 34
    aget-wide v17, v0, v17

    .line 35
    .line 36
    const/16 v19, 0x9

    .line 37
    .line 38
    aget-wide v19, v0, v19

    .line 39
    .line 40
    const/16 v21, 0xa

    .line 41
    .line 42
    aget-wide v21, v0, v21

    .line 43
    .line 44
    const/16 v23, 0xb

    .line 45
    .line 46
    aget-wide v23, v0, v23

    .line 47
    .line 48
    const/16 v25, 0xc

    .line 49
    .line 50
    aget-wide v25, v0, v25

    .line 51
    .line 52
    const/16 v27, 0xd

    .line 53
    .line 54
    aget-wide v27, v0, v27

    .line 55
    .line 56
    const/16 v29, 0xe

    .line 57
    .line 58
    aget-wide v29, v0, v29

    .line 59
    .line 60
    const/16 v31, 0xf

    .line 61
    .line 62
    aget-wide v31, v0, v31

    .line 63
    .line 64
    mul-double v33, v7, v13

    .line 65
    .line 66
    mul-double v35, v33, v19

    .line 67
    .line 68
    mul-double v35, v35, v25

    .line 69
    .line 70
    mul-double v37, v5, v15

    .line 71
    .line 72
    mul-double v39, v37, v19

    .line 73
    .line 74
    mul-double v39, v39, v25

    .line 75
    .line 76
    sub-double v35, v35, v39

    .line 77
    .line 78
    mul-double v39, v7, v11

    .line 79
    .line 80
    mul-double v41, v39, v21

    .line 81
    .line 82
    mul-double v41, v41, v25

    .line 83
    .line 84
    sub-double v35, v35, v41

    .line 85
    .line 86
    mul-double v41, v3, v15

    .line 87
    .line 88
    mul-double v43, v41, v21

    .line 89
    .line 90
    mul-double v43, v43, v25

    .line 91
    .line 92
    add-double v35, v35, v43

    .line 93
    .line 94
    mul-double v43, v5, v11

    .line 95
    .line 96
    mul-double v45, v43, v23

    .line 97
    .line 98
    mul-double v45, v45, v25

    .line 99
    .line 100
    add-double v35, v35, v45

    .line 101
    .line 102
    mul-double v45, v3, v13

    .line 103
    .line 104
    mul-double v47, v45, v23

    .line 105
    .line 106
    mul-double v47, v47, v25

    .line 107
    .line 108
    sub-double v35, v35, v47

    .line 109
    .line 110
    mul-double v33, v33, v17

    .line 111
    .line 112
    mul-double v33, v33, v27

    .line 113
    .line 114
    sub-double v35, v35, v33

    .line 115
    .line 116
    mul-double v37, v37, v17

    .line 117
    .line 118
    mul-double v37, v37, v27

    .line 119
    .line 120
    add-double v35, v35, v37

    .line 121
    .line 122
    mul-double/2addr v7, v9

    .line 123
    mul-double v25, v7, v21

    .line 124
    .line 125
    mul-double v25, v25, v27

    .line 126
    .line 127
    add-double v35, v35, v25

    .line 128
    .line 129
    mul-double/2addr v15, v1

    .line 130
    mul-double v25, v15, v21

    .line 131
    .line 132
    mul-double v25, v25, v27

    .line 133
    .line 134
    sub-double v35, v35, v25

    .line 135
    .line 136
    mul-double/2addr v5, v9

    .line 137
    mul-double v25, v5, v23

    .line 138
    .line 139
    mul-double v25, v25, v27

    .line 140
    .line 141
    sub-double v35, v35, v25

    .line 142
    .line 143
    mul-double/2addr v13, v1

    .line 144
    mul-double v25, v13, v23

    .line 145
    .line 146
    mul-double v25, v25, v27

    .line 147
    .line 148
    add-double v35, v35, v25

    .line 149
    .line 150
    mul-double v39, v39, v17

    .line 151
    .line 152
    mul-double v39, v39, v29

    .line 153
    .line 154
    add-double v35, v35, v39

    .line 155
    .line 156
    mul-double v41, v41, v17

    .line 157
    .line 158
    mul-double v41, v41, v29

    .line 159
    .line 160
    sub-double v35, v35, v41

    .line 161
    .line 162
    mul-double v7, v7, v19

    .line 163
    .line 164
    mul-double v7, v7, v29

    .line 165
    .line 166
    sub-double v35, v35, v7

    .line 167
    .line 168
    mul-double v15, v15, v19

    .line 169
    .line 170
    mul-double v15, v15, v29

    .line 171
    .line 172
    add-double v35, v35, v15

    .line 173
    .line 174
    mul-double/2addr v3, v9

    .line 175
    mul-double v7, v3, v23

    .line 176
    .line 177
    mul-double v7, v7, v29

    .line 178
    .line 179
    add-double v35, v35, v7

    .line 180
    .line 181
    mul-double/2addr v1, v11

    .line 182
    mul-double v23, v23, v1

    .line 183
    .line 184
    mul-double v23, v23, v29

    .line 185
    .line 186
    sub-double v35, v35, v23

    .line 187
    .line 188
    mul-double v43, v43, v17

    .line 189
    .line 190
    mul-double v43, v43, v31

    .line 191
    .line 192
    sub-double v35, v35, v43

    .line 193
    .line 194
    mul-double v45, v45, v17

    .line 195
    .line 196
    mul-double v45, v45, v31

    .line 197
    .line 198
    add-double v35, v35, v45

    .line 199
    .line 200
    mul-double v5, v5, v19

    .line 201
    .line 202
    mul-double v5, v5, v31

    .line 203
    .line 204
    add-double v35, v35, v5

    .line 205
    .line 206
    mul-double v13, v13, v19

    .line 207
    .line 208
    mul-double v13, v13, v31

    .line 209
    .line 210
    sub-double v35, v35, v13

    .line 211
    .line 212
    mul-double v3, v3, v21

    .line 213
    .line 214
    mul-double v3, v3, v31

    .line 215
    .line 216
    sub-double v35, v35, v3

    .line 217
    .line 218
    mul-double v1, v1, v21

    .line 219
    .line 220
    mul-double v1, v1, v31

    .line 221
    .line 222
    add-double v35, v35, v1

    .line 223
    .line 224
    return-wide v35
.end method

.method public static final inverse([D)[D
    .locals 111

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "matrix"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->determinant([D)D

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    sget-object v3, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 13
    .line 14
    invoke-direct {v3, v1, v2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    aget-wide v4, v0, v3

    .line 23
    .line 24
    const/4 v6, 0x1

    .line 25
    aget-wide v7, v0, v6

    .line 26
    .line 27
    const/4 v9, 0x2

    .line 28
    aget-wide v10, v0, v9

    .line 29
    .line 30
    const/4 v12, 0x3

    .line 31
    aget-wide v13, v0, v12

    .line 32
    .line 33
    const/4 v15, 0x4

    .line 34
    aget-wide v16, v0, v15

    .line 35
    .line 36
    const/16 v18, 0x5

    .line 37
    .line 38
    aget-wide v19, v0, v18

    .line 39
    .line 40
    const/16 v21, 0x6

    .line 41
    .line 42
    aget-wide v22, v0, v21

    .line 43
    .line 44
    const/16 v24, 0x7

    .line 45
    .line 46
    aget-wide v25, v0, v24

    .line 47
    .line 48
    const/16 v27, 0x8

    .line 49
    .line 50
    aget-wide v28, v0, v27

    .line 51
    .line 52
    const/16 v30, 0x9

    .line 53
    .line 54
    aget-wide v31, v0, v30

    .line 55
    .line 56
    const/16 v33, 0xa

    .line 57
    .line 58
    aget-wide v34, v0, v33

    .line 59
    .line 60
    const/16 v36, 0xb

    .line 61
    .line 62
    aget-wide v37, v0, v36

    .line 63
    .line 64
    const/16 v39, 0xc

    .line 65
    .line 66
    aget-wide v40, v0, v39

    .line 67
    .line 68
    const/16 v42, 0xd

    .line 69
    .line 70
    aget-wide v43, v0, v42

    .line 71
    .line 72
    const/16 v45, 0xe

    .line 73
    .line 74
    aget-wide v46, v0, v45

    .line 75
    .line 76
    const/16 v48, 0xf

    .line 77
    .line 78
    aget-wide v49, v0, v48

    .line 79
    .line 80
    mul-double v51, v22, v37

    .line 81
    .line 82
    mul-double v53, v51, v43

    .line 83
    .line 84
    mul-double v55, v25, v34

    .line 85
    .line 86
    mul-double v57, v55, v43

    .line 87
    .line 88
    sub-double v53, v53, v57

    .line 89
    .line 90
    mul-double v57, v25, v31

    .line 91
    .line 92
    mul-double v59, v57, v46

    .line 93
    .line 94
    add-double v53, v53, v59

    .line 95
    .line 96
    mul-double v59, v19, v37

    .line 97
    .line 98
    mul-double v61, v59, v46

    .line 99
    .line 100
    sub-double v53, v53, v61

    .line 101
    .line 102
    mul-double v61, v22, v31

    .line 103
    .line 104
    mul-double v63, v61, v49

    .line 105
    .line 106
    sub-double v53, v53, v63

    .line 107
    .line 108
    mul-double v63, v19, v34

    .line 109
    .line 110
    mul-double v65, v63, v49

    .line 111
    .line 112
    add-double v53, v53, v65

    .line 113
    .line 114
    div-double v53, v53, v1

    .line 115
    .line 116
    mul-double v65, v13, v34

    .line 117
    .line 118
    mul-double v67, v65, v43

    .line 119
    .line 120
    mul-double v69, v10, v37

    .line 121
    .line 122
    mul-double v71, v69, v43

    .line 123
    .line 124
    sub-double v67, v67, v71

    .line 125
    .line 126
    mul-double v71, v13, v31

    .line 127
    .line 128
    mul-double v73, v71, v46

    .line 129
    .line 130
    sub-double v67, v67, v73

    .line 131
    .line 132
    mul-double v73, v7, v37

    .line 133
    .line 134
    mul-double v75, v73, v46

    .line 135
    .line 136
    add-double v67, v67, v75

    .line 137
    .line 138
    mul-double v75, v10, v31

    .line 139
    .line 140
    mul-double v77, v75, v49

    .line 141
    .line 142
    add-double v67, v67, v77

    .line 143
    .line 144
    mul-double v77, v7, v34

    .line 145
    .line 146
    mul-double v79, v77, v49

    .line 147
    .line 148
    sub-double v67, v67, v79

    .line 149
    .line 150
    div-double v67, v67, v1

    .line 151
    .line 152
    mul-double v79, v10, v25

    .line 153
    .line 154
    mul-double v81, v79, v43

    .line 155
    .line 156
    mul-double v83, v13, v22

    .line 157
    .line 158
    mul-double v85, v83, v43

    .line 159
    .line 160
    sub-double v81, v81, v85

    .line 161
    .line 162
    mul-double v85, v13, v19

    .line 163
    .line 164
    mul-double v87, v85, v46

    .line 165
    .line 166
    add-double v81, v81, v87

    .line 167
    .line 168
    mul-double v87, v7, v25

    .line 169
    .line 170
    mul-double v89, v87, v46

    .line 171
    .line 172
    sub-double v81, v81, v89

    .line 173
    .line 174
    mul-double v89, v10, v19

    .line 175
    .line 176
    mul-double v91, v89, v49

    .line 177
    .line 178
    sub-double v81, v81, v91

    .line 179
    .line 180
    mul-double v91, v7, v22

    .line 181
    .line 182
    mul-double v93, v91, v49

    .line 183
    .line 184
    add-double v81, v81, v93

    .line 185
    .line 186
    div-double v81, v81, v1

    .line 187
    .line 188
    mul-double v93, v83, v31

    .line 189
    .line 190
    mul-double v95, v79, v31

    .line 191
    .line 192
    sub-double v93, v93, v95

    .line 193
    .line 194
    mul-double v95, v85, v34

    .line 195
    .line 196
    sub-double v93, v93, v95

    .line 197
    .line 198
    mul-double v95, v87, v34

    .line 199
    .line 200
    add-double v93, v93, v95

    .line 201
    .line 202
    mul-double v95, v89, v37

    .line 203
    .line 204
    add-double v93, v93, v95

    .line 205
    .line 206
    mul-double v95, v91, v37

    .line 207
    .line 208
    sub-double v93, v93, v95

    .line 209
    .line 210
    div-double v93, v93, v1

    .line 211
    .line 212
    mul-double v55, v55, v40

    .line 213
    .line 214
    mul-double v51, v51, v40

    .line 215
    .line 216
    sub-double v55, v55, v51

    .line 217
    .line 218
    mul-double v51, v25, v28

    .line 219
    .line 220
    mul-double v95, v51, v46

    .line 221
    .line 222
    sub-double v55, v55, v95

    .line 223
    .line 224
    mul-double v95, v16, v37

    .line 225
    .line 226
    mul-double v97, v95, v46

    .line 227
    .line 228
    add-double v55, v55, v97

    .line 229
    .line 230
    mul-double v97, v22, v28

    .line 231
    .line 232
    mul-double v99, v97, v49

    .line 233
    .line 234
    add-double v55, v55, v99

    .line 235
    .line 236
    mul-double v99, v16, v34

    .line 237
    .line 238
    mul-double v101, v99, v49

    .line 239
    .line 240
    sub-double v55, v55, v101

    .line 241
    .line 242
    div-double v55, v55, v1

    .line 243
    .line 244
    mul-double v69, v69, v40

    .line 245
    .line 246
    mul-double v65, v65, v40

    .line 247
    .line 248
    sub-double v69, v69, v65

    .line 249
    .line 250
    mul-double v65, v13, v28

    .line 251
    .line 252
    mul-double v101, v65, v46

    .line 253
    .line 254
    add-double v69, v69, v101

    .line 255
    .line 256
    mul-double v101, v4, v37

    .line 257
    .line 258
    mul-double v103, v101, v46

    .line 259
    .line 260
    sub-double v69, v69, v103

    .line 261
    .line 262
    mul-double v103, v10, v28

    .line 263
    .line 264
    mul-double v105, v103, v49

    .line 265
    .line 266
    sub-double v69, v69, v105

    .line 267
    .line 268
    mul-double v105, v4, v34

    .line 269
    .line 270
    mul-double v107, v105, v49

    .line 271
    .line 272
    add-double v69, v69, v107

    .line 273
    .line 274
    div-double v69, v69, v1

    .line 275
    .line 276
    mul-double v107, v83, v40

    .line 277
    .line 278
    mul-double v109, v79, v40

    .line 279
    .line 280
    sub-double v107, v107, v109

    .line 281
    .line 282
    mul-double v13, v13, v16

    .line 283
    .line 284
    mul-double v109, v13, v46

    .line 285
    .line 286
    sub-double v107, v107, v109

    .line 287
    .line 288
    mul-double v25, v25, v4

    .line 289
    .line 290
    mul-double v109, v25, v46

    .line 291
    .line 292
    add-double v107, v107, v109

    .line 293
    .line 294
    mul-double v10, v10, v16

    .line 295
    .line 296
    mul-double v109, v10, v49

    .line 297
    .line 298
    add-double v107, v107, v109

    .line 299
    .line 300
    mul-double v22, v22, v4

    .line 301
    .line 302
    mul-double v109, v22, v49

    .line 303
    .line 304
    sub-double v107, v107, v109

    .line 305
    .line 306
    div-double v107, v107, v1

    .line 307
    .line 308
    mul-double v79, v79, v28

    .line 309
    .line 310
    mul-double v83, v83, v28

    .line 311
    .line 312
    sub-double v79, v79, v83

    .line 313
    .line 314
    mul-double v83, v13, v34

    .line 315
    .line 316
    add-double v79, v79, v83

    .line 317
    .line 318
    mul-double v83, v25, v34

    .line 319
    .line 320
    sub-double v79, v79, v83

    .line 321
    .line 322
    mul-double v83, v10, v37

    .line 323
    .line 324
    sub-double v79, v79, v83

    .line 325
    .line 326
    mul-double v83, v22, v37

    .line 327
    .line 328
    add-double v79, v79, v83

    .line 329
    .line 330
    div-double v79, v79, v1

    .line 331
    .line 332
    mul-double v59, v59, v40

    .line 333
    .line 334
    mul-double v57, v57, v40

    .line 335
    .line 336
    sub-double v59, v59, v57

    .line 337
    .line 338
    mul-double v51, v51, v43

    .line 339
    .line 340
    add-double v59, v59, v51

    .line 341
    .line 342
    mul-double v95, v95, v43

    .line 343
    .line 344
    sub-double v59, v59, v95

    .line 345
    .line 346
    mul-double v51, v19, v28

    .line 347
    .line 348
    mul-double v57, v51, v49

    .line 349
    .line 350
    sub-double v59, v59, v57

    .line 351
    .line 352
    mul-double v57, v16, v31

    .line 353
    .line 354
    mul-double v83, v57, v49

    .line 355
    .line 356
    add-double v59, v59, v83

    .line 357
    .line 358
    div-double v59, v59, v1

    .line 359
    .line 360
    mul-double v71, v71, v40

    .line 361
    .line 362
    mul-double v73, v73, v40

    .line 363
    .line 364
    sub-double v71, v71, v73

    .line 365
    .line 366
    mul-double v65, v65, v43

    .line 367
    .line 368
    sub-double v71, v71, v65

    .line 369
    .line 370
    mul-double v101, v101, v43

    .line 371
    .line 372
    add-double v71, v71, v101

    .line 373
    .line 374
    mul-double v65, v7, v28

    .line 375
    .line 376
    mul-double v73, v65, v49

    .line 377
    .line 378
    add-double v71, v71, v73

    .line 379
    .line 380
    mul-double v73, v4, v31

    .line 381
    .line 382
    mul-double v83, v73, v49

    .line 383
    .line 384
    sub-double v71, v71, v83

    .line 385
    .line 386
    div-double v71, v71, v1

    .line 387
    .line 388
    mul-double v83, v87, v40

    .line 389
    .line 390
    mul-double v95, v85, v40

    .line 391
    .line 392
    sub-double v83, v83, v95

    .line 393
    .line 394
    mul-double v95, v13, v43

    .line 395
    .line 396
    add-double v83, v83, v95

    .line 397
    .line 398
    mul-double v95, v25, v43

    .line 399
    .line 400
    sub-double v83, v83, v95

    .line 401
    .line 402
    mul-double v7, v7, v16

    .line 403
    .line 404
    mul-double v16, v7, v49

    .line 405
    .line 406
    sub-double v83, v83, v16

    .line 407
    .line 408
    mul-double v4, v4, v19

    .line 409
    .line 410
    mul-double v49, v49, v4

    .line 411
    .line 412
    add-double v83, v83, v49

    .line 413
    .line 414
    div-double v83, v83, v1

    .line 415
    .line 416
    mul-double v85, v85, v28

    .line 417
    .line 418
    mul-double v87, v87, v28

    .line 419
    .line 420
    sub-double v85, v85, v87

    .line 421
    .line 422
    mul-double v13, v13, v31

    .line 423
    .line 424
    sub-double v85, v85, v13

    .line 425
    .line 426
    mul-double v25, v25, v31

    .line 427
    .line 428
    add-double v85, v85, v25

    .line 429
    .line 430
    mul-double v13, v7, v37

    .line 431
    .line 432
    add-double v85, v85, v13

    .line 433
    .line 434
    mul-double v37, v37, v4

    .line 435
    .line 436
    sub-double v85, v85, v37

    .line 437
    .line 438
    div-double v85, v85, v1

    .line 439
    .line 440
    mul-double v61, v61, v40

    .line 441
    .line 442
    mul-double v63, v63, v40

    .line 443
    .line 444
    sub-double v61, v61, v63

    .line 445
    .line 446
    mul-double v97, v97, v43

    .line 447
    .line 448
    sub-double v61, v61, v97

    .line 449
    .line 450
    mul-double v99, v99, v43

    .line 451
    .line 452
    add-double v61, v61, v99

    .line 453
    .line 454
    mul-double v51, v51, v46

    .line 455
    .line 456
    add-double v61, v61, v51

    .line 457
    .line 458
    mul-double v57, v57, v46

    .line 459
    .line 460
    sub-double v61, v61, v57

    .line 461
    .line 462
    div-double v61, v61, v1

    .line 463
    .line 464
    mul-double v77, v77, v40

    .line 465
    .line 466
    mul-double v75, v75, v40

    .line 467
    .line 468
    sub-double v77, v77, v75

    .line 469
    .line 470
    mul-double v103, v103, v43

    .line 471
    .line 472
    add-double v77, v77, v103

    .line 473
    .line 474
    mul-double v105, v105, v43

    .line 475
    .line 476
    sub-double v77, v77, v105

    .line 477
    .line 478
    mul-double v65, v65, v46

    .line 479
    .line 480
    sub-double v77, v77, v65

    .line 481
    .line 482
    mul-double v73, v73, v46

    .line 483
    .line 484
    add-double v77, v77, v73

    .line 485
    .line 486
    div-double v77, v77, v1

    .line 487
    .line 488
    mul-double v13, v89, v40

    .line 489
    .line 490
    mul-double v40, v40, v91

    .line 491
    .line 492
    sub-double v13, v13, v40

    .line 493
    .line 494
    mul-double v16, v10, v43

    .line 495
    .line 496
    sub-double v13, v13, v16

    .line 497
    .line 498
    mul-double v43, v43, v22

    .line 499
    .line 500
    add-double v13, v13, v43

    .line 501
    .line 502
    mul-double v16, v7, v46

    .line 503
    .line 504
    add-double v13, v13, v16

    .line 505
    .line 506
    mul-double v46, v46, v4

    .line 507
    .line 508
    sub-double v13, v13, v46

    .line 509
    .line 510
    div-double/2addr v13, v1

    .line 511
    mul-double v91, v91, v28

    .line 512
    .line 513
    mul-double v89, v89, v28

    .line 514
    .line 515
    sub-double v91, v91, v89

    .line 516
    .line 517
    mul-double v10, v10, v31

    .line 518
    .line 519
    add-double v91, v91, v10

    .line 520
    .line 521
    mul-double v22, v22, v31

    .line 522
    .line 523
    sub-double v91, v91, v22

    .line 524
    .line 525
    mul-double v7, v7, v34

    .line 526
    .line 527
    sub-double v91, v91, v7

    .line 528
    .line 529
    mul-double v4, v4, v34

    .line 530
    .line 531
    add-double v91, v91, v4

    .line 532
    .line 533
    div-double v91, v91, v1

    .line 534
    .line 535
    const/16 v0, 0x10

    .line 536
    .line 537
    new-array v0, v0, [D

    .line 538
    .line 539
    aput-wide v53, v0, v3

    .line 540
    .line 541
    aput-wide v67, v0, v6

    .line 542
    .line 543
    aput-wide v81, v0, v9

    .line 544
    .line 545
    aput-wide v93, v0, v12

    .line 546
    .line 547
    aput-wide v55, v0, v15

    .line 548
    .line 549
    aput-wide v69, v0, v18

    .line 550
    .line 551
    aput-wide v107, v0, v21

    .line 552
    .line 553
    aput-wide v79, v0, v24

    .line 554
    .line 555
    aput-wide v59, v0, v27

    .line 556
    .line 557
    aput-wide v71, v0, v30

    .line 558
    .line 559
    aput-wide v83, v0, v33

    .line 560
    .line 561
    aput-wide v85, v0, v36

    .line 562
    .line 563
    aput-wide v61, v0, v39

    .line 564
    .line 565
    aput-wide v77, v0, v42

    .line 566
    .line 567
    aput-wide v13, v0, v45

    .line 568
    .line 569
    aput-wide v91, v0, v48

    .line 570
    .line 571
    return-object v0
.end method

.method private final isZero(D)Z
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmpg-double p1, p1, v2

    .line 19
    .line 20
    if-gez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    return v1
.end method

.method public static final multiplyInto([D[D[D)V
    .locals 63

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "out"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "a"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "b"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aget-wide v4, v1, v3

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    aget-wide v7, v1, v6

    .line 27
    .line 28
    const/4 v9, 0x2

    .line 29
    aget-wide v10, v1, v9

    .line 30
    .line 31
    const/4 v12, 0x3

    .line 32
    aget-wide v13, v1, v12

    .line 33
    .line 34
    const/4 v15, 0x4

    .line 35
    aget-wide v16, v1, v15

    .line 36
    .line 37
    const/16 v18, 0x5

    .line 38
    .line 39
    aget-wide v19, v1, v18

    .line 40
    .line 41
    const/16 v21, 0x6

    .line 42
    .line 43
    aget-wide v22, v1, v21

    .line 44
    .line 45
    const/16 v24, 0x7

    .line 46
    .line 47
    aget-wide v25, v1, v24

    .line 48
    .line 49
    const/16 v27, 0x8

    .line 50
    .line 51
    aget-wide v28, v1, v27

    .line 52
    .line 53
    const/16 v30, 0x9

    .line 54
    .line 55
    aget-wide v31, v1, v30

    .line 56
    .line 57
    const/16 v33, 0xa

    .line 58
    .line 59
    aget-wide v34, v1, v33

    .line 60
    .line 61
    const/16 v36, 0xb

    .line 62
    .line 63
    aget-wide v37, v1, v36

    .line 64
    .line 65
    const/16 v39, 0xc

    .line 66
    .line 67
    aget-wide v40, v1, v39

    .line 68
    .line 69
    const/16 v42, 0xd

    .line 70
    .line 71
    aget-wide v43, v1, v42

    .line 72
    .line 73
    const/16 v45, 0xe

    .line 74
    .line 75
    aget-wide v46, v1, v45

    .line 76
    .line 77
    const/16 v48, 0xf

    .line 78
    .line 79
    aget-wide v49, v1, v48

    .line 80
    .line 81
    aget-wide v51, v2, v3

    .line 82
    .line 83
    aget-wide v53, v2, v6

    .line 84
    .line 85
    aget-wide v55, v2, v9

    .line 86
    .line 87
    aget-wide v57, v2, v12

    .line 88
    .line 89
    mul-double v59, v51, v4

    .line 90
    .line 91
    mul-double v61, v53, v16

    .line 92
    .line 93
    add-double v59, v59, v61

    .line 94
    .line 95
    mul-double v61, v55, v28

    .line 96
    .line 97
    add-double v59, v59, v61

    .line 98
    .line 99
    mul-double v61, v57, v40

    .line 100
    .line 101
    add-double v59, v59, v61

    .line 102
    .line 103
    aput-wide v59, v0, v3

    .line 104
    .line 105
    mul-double v59, v51, v7

    .line 106
    .line 107
    mul-double v61, v53, v19

    .line 108
    .line 109
    add-double v59, v59, v61

    .line 110
    .line 111
    mul-double v61, v55, v31

    .line 112
    .line 113
    add-double v59, v59, v61

    .line 114
    .line 115
    mul-double v61, v57, v43

    .line 116
    .line 117
    add-double v59, v59, v61

    .line 118
    .line 119
    aput-wide v59, v0, v6

    .line 120
    .line 121
    mul-double v59, v51, v10

    .line 122
    .line 123
    mul-double v61, v53, v22

    .line 124
    .line 125
    add-double v59, v59, v61

    .line 126
    .line 127
    mul-double v61, v55, v34

    .line 128
    .line 129
    add-double v59, v59, v61

    .line 130
    .line 131
    mul-double v61, v57, v46

    .line 132
    .line 133
    add-double v59, v59, v61

    .line 134
    .line 135
    aput-wide v59, v0, v9

    .line 136
    .line 137
    mul-double v51, v51, v13

    .line 138
    .line 139
    mul-double v53, v53, v25

    .line 140
    .line 141
    add-double v51, v51, v53

    .line 142
    .line 143
    mul-double v55, v55, v37

    .line 144
    .line 145
    add-double v51, v51, v55

    .line 146
    .line 147
    mul-double v57, v57, v49

    .line 148
    .line 149
    add-double v51, v51, v57

    .line 150
    .line 151
    aput-wide v51, v0, v12

    .line 152
    .line 153
    aget-wide v51, v2, v15

    .line 154
    .line 155
    aget-wide v53, v2, v18

    .line 156
    .line 157
    aget-wide v55, v2, v21

    .line 158
    .line 159
    aget-wide v57, v2, v24

    .line 160
    .line 161
    mul-double v59, v51, v4

    .line 162
    .line 163
    mul-double v61, v53, v16

    .line 164
    .line 165
    add-double v59, v59, v61

    .line 166
    .line 167
    mul-double v61, v55, v28

    .line 168
    .line 169
    add-double v59, v59, v61

    .line 170
    .line 171
    mul-double v61, v57, v40

    .line 172
    .line 173
    add-double v59, v59, v61

    .line 174
    .line 175
    aput-wide v59, v0, v15

    .line 176
    .line 177
    mul-double v59, v51, v7

    .line 178
    .line 179
    mul-double v61, v53, v19

    .line 180
    .line 181
    add-double v59, v59, v61

    .line 182
    .line 183
    mul-double v61, v55, v31

    .line 184
    .line 185
    add-double v59, v59, v61

    .line 186
    .line 187
    mul-double v61, v57, v43

    .line 188
    .line 189
    add-double v59, v59, v61

    .line 190
    .line 191
    aput-wide v59, v0, v18

    .line 192
    .line 193
    mul-double v59, v51, v10

    .line 194
    .line 195
    mul-double v61, v53, v22

    .line 196
    .line 197
    add-double v59, v59, v61

    .line 198
    .line 199
    mul-double v61, v55, v34

    .line 200
    .line 201
    add-double v59, v59, v61

    .line 202
    .line 203
    mul-double v61, v57, v46

    .line 204
    .line 205
    add-double v59, v59, v61

    .line 206
    .line 207
    aput-wide v59, v0, v21

    .line 208
    .line 209
    mul-double v51, v51, v13

    .line 210
    .line 211
    mul-double v53, v53, v25

    .line 212
    .line 213
    add-double v51, v51, v53

    .line 214
    .line 215
    mul-double v55, v55, v37

    .line 216
    .line 217
    add-double v51, v51, v55

    .line 218
    .line 219
    mul-double v57, v57, v49

    .line 220
    .line 221
    add-double v51, v51, v57

    .line 222
    .line 223
    aput-wide v51, v0, v24

    .line 224
    .line 225
    aget-wide v51, v2, v27

    .line 226
    .line 227
    aget-wide v53, v2, v30

    .line 228
    .line 229
    aget-wide v55, v2, v33

    .line 230
    .line 231
    aget-wide v57, v2, v36

    .line 232
    .line 233
    mul-double v59, v51, v4

    .line 234
    .line 235
    mul-double v61, v53, v16

    .line 236
    .line 237
    add-double v59, v59, v61

    .line 238
    .line 239
    mul-double v61, v55, v28

    .line 240
    .line 241
    add-double v59, v59, v61

    .line 242
    .line 243
    mul-double v61, v57, v40

    .line 244
    .line 245
    add-double v59, v59, v61

    .line 246
    .line 247
    aput-wide v59, v0, v27

    .line 248
    .line 249
    mul-double v59, v51, v7

    .line 250
    .line 251
    mul-double v61, v53, v19

    .line 252
    .line 253
    add-double v59, v59, v61

    .line 254
    .line 255
    mul-double v61, v55, v31

    .line 256
    .line 257
    add-double v59, v59, v61

    .line 258
    .line 259
    mul-double v61, v57, v43

    .line 260
    .line 261
    add-double v59, v59, v61

    .line 262
    .line 263
    aput-wide v59, v0, v30

    .line 264
    .line 265
    mul-double v59, v51, v10

    .line 266
    .line 267
    mul-double v61, v53, v22

    .line 268
    .line 269
    add-double v59, v59, v61

    .line 270
    .line 271
    mul-double v61, v55, v34

    .line 272
    .line 273
    add-double v59, v59, v61

    .line 274
    .line 275
    mul-double v61, v57, v46

    .line 276
    .line 277
    add-double v59, v59, v61

    .line 278
    .line 279
    aput-wide v59, v0, v33

    .line 280
    .line 281
    mul-double v51, v51, v13

    .line 282
    .line 283
    mul-double v53, v53, v25

    .line 284
    .line 285
    add-double v51, v51, v53

    .line 286
    .line 287
    mul-double v55, v55, v37

    .line 288
    .line 289
    add-double v51, v51, v55

    .line 290
    .line 291
    mul-double v57, v57, v49

    .line 292
    .line 293
    add-double v51, v51, v57

    .line 294
    .line 295
    aput-wide v51, v0, v36

    .line 296
    .line 297
    aget-wide v51, v2, v39

    .line 298
    .line 299
    aget-wide v53, v2, v42

    .line 300
    .line 301
    aget-wide v55, v2, v45

    .line 302
    .line 303
    aget-wide v1, v2, v48

    .line 304
    .line 305
    mul-double v4, v4, v51

    .line 306
    .line 307
    mul-double v16, v16, v53

    .line 308
    .line 309
    add-double v4, v4, v16

    .line 310
    .line 311
    mul-double v28, v28, v55

    .line 312
    .line 313
    add-double v4, v4, v28

    .line 314
    .line 315
    mul-double v40, v40, v1

    .line 316
    .line 317
    add-double v4, v4, v40

    .line 318
    .line 319
    aput-wide v4, v0, v39

    .line 320
    .line 321
    mul-double v7, v7, v51

    .line 322
    .line 323
    mul-double v19, v19, v53

    .line 324
    .line 325
    add-double v7, v7, v19

    .line 326
    .line 327
    mul-double v31, v31, v55

    .line 328
    .line 329
    add-double v7, v7, v31

    .line 330
    .line 331
    mul-double v43, v43, v1

    .line 332
    .line 333
    add-double v7, v7, v43

    .line 334
    .line 335
    aput-wide v7, v0, v42

    .line 336
    .line 337
    mul-double v10, v10, v51

    .line 338
    .line 339
    mul-double v22, v22, v53

    .line 340
    .line 341
    add-double v10, v10, v22

    .line 342
    .line 343
    mul-double v34, v34, v55

    .line 344
    .line 345
    add-double v10, v10, v34

    .line 346
    .line 347
    mul-double v46, v46, v1

    .line 348
    .line 349
    add-double v10, v10, v46

    .line 350
    .line 351
    aput-wide v10, v0, v45

    .line 352
    .line 353
    mul-double v51, v51, v13

    .line 354
    .line 355
    mul-double v53, v53, v25

    .line 356
    .line 357
    add-double v51, v51, v53

    .line 358
    .line 359
    mul-double v55, v55, v37

    .line 360
    .line 361
    add-double v51, v51, v55

    .line 362
    .line 363
    mul-double v1, v1, v49

    .line 364
    .line 365
    add-double v51, v51, v1

    .line 366
    .line 367
    aput-wide v51, v0, v48

    .line 368
    .line 369
    return-void
.end method

.method public static final multiplyVectorByMatrix([D[D[D)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "v"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "m"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "result"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aget-wide v4, v0, v3

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    aget-wide v7, v0, v6

    .line 27
    .line 28
    const/4 v9, 0x2

    .line 29
    aget-wide v10, v0, v9

    .line 30
    .line 31
    const/4 v12, 0x3

    .line 32
    aget-wide v13, v0, v12

    .line 33
    .line 34
    aget-wide v15, v1, v3

    .line 35
    .line 36
    mul-double/2addr v15, v4

    .line 37
    const/4 v0, 0x4

    .line 38
    aget-wide v17, v1, v0

    .line 39
    .line 40
    mul-double v17, v17, v7

    .line 41
    .line 42
    add-double v15, v15, v17

    .line 43
    .line 44
    const/16 v0, 0x8

    .line 45
    .line 46
    aget-wide v17, v1, v0

    .line 47
    .line 48
    mul-double v17, v17, v10

    .line 49
    .line 50
    add-double v15, v15, v17

    .line 51
    .line 52
    const/16 v0, 0xc

    .line 53
    .line 54
    aget-wide v17, v1, v0

    .line 55
    .line 56
    mul-double v17, v17, v13

    .line 57
    .line 58
    add-double v15, v15, v17

    .line 59
    .line 60
    aput-wide v15, v2, v3

    .line 61
    .line 62
    aget-wide v15, v1, v6

    .line 63
    .line 64
    mul-double/2addr v15, v4

    .line 65
    const/4 v0, 0x5

    .line 66
    aget-wide v17, v1, v0

    .line 67
    .line 68
    mul-double v17, v17, v7

    .line 69
    .line 70
    add-double v15, v15, v17

    .line 71
    .line 72
    const/16 v0, 0x9

    .line 73
    .line 74
    aget-wide v17, v1, v0

    .line 75
    .line 76
    mul-double v17, v17, v10

    .line 77
    .line 78
    add-double v15, v15, v17

    .line 79
    .line 80
    const/16 v0, 0xd

    .line 81
    .line 82
    aget-wide v17, v1, v0

    .line 83
    .line 84
    mul-double v17, v17, v13

    .line 85
    .line 86
    add-double v15, v15, v17

    .line 87
    .line 88
    aput-wide v15, v2, v6

    .line 89
    .line 90
    aget-wide v15, v1, v9

    .line 91
    .line 92
    mul-double/2addr v15, v4

    .line 93
    const/4 v0, 0x6

    .line 94
    aget-wide v17, v1, v0

    .line 95
    .line 96
    mul-double v17, v17, v7

    .line 97
    .line 98
    add-double v15, v15, v17

    .line 99
    .line 100
    const/16 v0, 0xa

    .line 101
    .line 102
    aget-wide v17, v1, v0

    .line 103
    .line 104
    mul-double v17, v17, v10

    .line 105
    .line 106
    add-double v15, v15, v17

    .line 107
    .line 108
    const/16 v0, 0xe

    .line 109
    .line 110
    aget-wide v17, v1, v0

    .line 111
    .line 112
    mul-double v17, v17, v13

    .line 113
    .line 114
    add-double v15, v15, v17

    .line 115
    .line 116
    aput-wide v15, v2, v9

    .line 117
    .line 118
    aget-wide v15, v1, v12

    .line 119
    .line 120
    mul-double/2addr v4, v15

    .line 121
    const/4 v0, 0x7

    .line 122
    aget-wide v15, v1, v0

    .line 123
    .line 124
    mul-double/2addr v7, v15

    .line 125
    add-double/2addr v4, v7

    .line 126
    const/16 v0, 0xb

    .line 127
    .line 128
    aget-wide v6, v1, v0

    .line 129
    .line 130
    mul-double/2addr v10, v6

    .line 131
    add-double/2addr v4, v10

    .line 132
    const/16 v0, 0xf

    .line 133
    .line 134
    aget-wide v0, v1, v0

    .line 135
    .line 136
    mul-double/2addr v13, v0

    .line 137
    add-double/2addr v4, v13

    .line 138
    aput-wide v4, v2, v12

    .line 139
    .line 140
    return-void
.end method

.method public static final resetIdentityMatrix([D)V
    .locals 3

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xe

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    aput-wide v1, p0, v0

    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    aput-wide v1, p0, v0

    .line 15
    .line 16
    const/16 v0, 0xc

    .line 17
    .line 18
    aput-wide v1, p0, v0

    .line 19
    .line 20
    const/16 v0, 0xb

    .line 21
    .line 22
    aput-wide v1, p0, v0

    .line 23
    .line 24
    const/16 v0, 0x9

    .line 25
    .line 26
    aput-wide v1, p0, v0

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    aput-wide v1, p0, v0

    .line 31
    .line 32
    const/4 v0, 0x7

    .line 33
    aput-wide v1, p0, v0

    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    aput-wide v1, p0, v0

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    aput-wide v1, p0, v0

    .line 40
    .line 41
    const/4 v0, 0x3

    .line 42
    aput-wide v1, p0, v0

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    aput-wide v1, p0, v0

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    aput-wide v1, p0, v0

    .line 49
    .line 50
    const/16 v0, 0xf

    .line 51
    .line 52
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 53
    .line 54
    aput-wide v1, p0, v0

    .line 55
    .line 56
    const/16 v0, 0xa

    .line 57
    .line 58
    aput-wide v1, p0, v0

    .line 59
    .line 60
    const/4 v0, 0x5

    .line 61
    aput-wide v1, p0, v0

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    aput-wide v1, p0, v0

    .line 65
    .line 66
    return-void
.end method

.method public static final roundTo3Places(D)D
    .locals 2

    .line 1
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double/2addr p0, v0

    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    long-to-double p0, p0

    .line 12
    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr p0, v0

    .line 18
    return-wide p0
.end method

.method public static final transpose([D)[D
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "m"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-wide v2, v0, v1

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    aget-wide v5, v0, v4

    .line 13
    .line 14
    const/16 v7, 0x8

    .line 15
    .line 16
    aget-wide v8, v0, v7

    .line 17
    .line 18
    const/16 v10, 0xc

    .line 19
    .line 20
    aget-wide v11, v0, v10

    .line 21
    .line 22
    const/4 v13, 0x1

    .line 23
    aget-wide v14, v0, v13

    .line 24
    .line 25
    const/16 v16, 0x5

    .line 26
    .line 27
    aget-wide v17, v0, v16

    .line 28
    .line 29
    const/16 v19, 0x9

    .line 30
    .line 31
    aget-wide v20, v0, v19

    .line 32
    .line 33
    const/16 v22, 0xd

    .line 34
    .line 35
    aget-wide v23, v0, v22

    .line 36
    .line 37
    const/16 v25, 0x2

    .line 38
    .line 39
    aget-wide v26, v0, v25

    .line 40
    .line 41
    const/16 v28, 0x6

    .line 42
    .line 43
    aget-wide v29, v0, v28

    .line 44
    .line 45
    const/16 v31, 0xa

    .line 46
    .line 47
    aget-wide v32, v0, v31

    .line 48
    .line 49
    const/16 v34, 0xe

    .line 50
    .line 51
    aget-wide v35, v0, v34

    .line 52
    .line 53
    const/16 v37, 0x3

    .line 54
    .line 55
    aget-wide v38, v0, v37

    .line 56
    .line 57
    const/16 v40, 0x7

    .line 58
    .line 59
    aget-wide v41, v0, v40

    .line 60
    .line 61
    const/16 v43, 0xb

    .line 62
    .line 63
    aget-wide v44, v0, v43

    .line 64
    .line 65
    const/16 v46, 0xf

    .line 66
    .line 67
    aget-wide v47, v0, v46

    .line 68
    .line 69
    const/16 v0, 0x10

    .line 70
    .line 71
    new-array v0, v0, [D

    .line 72
    .line 73
    aput-wide v2, v0, v1

    .line 74
    .line 75
    aput-wide v5, v0, v13

    .line 76
    .line 77
    aput-wide v8, v0, v25

    .line 78
    .line 79
    aput-wide v11, v0, v37

    .line 80
    .line 81
    aput-wide v14, v0, v4

    .line 82
    .line 83
    aput-wide v17, v0, v16

    .line 84
    .line 85
    aput-wide v20, v0, v28

    .line 86
    .line 87
    aput-wide v23, v0, v40

    .line 88
    .line 89
    aput-wide v26, v0, v7

    .line 90
    .line 91
    aput-wide v29, v0, v19

    .line 92
    .line 93
    aput-wide v32, v0, v31

    .line 94
    .line 95
    aput-wide v35, v0, v43

    .line 96
    .line 97
    aput-wide v38, v0, v10

    .line 98
    .line 99
    aput-wide v41, v0, v22

    .line 100
    .line 101
    aput-wide v44, v0, v34

    .line 102
    .line 103
    aput-wide v47, v0, v46

    .line 104
    .line 105
    return-object v0
.end method

.method public static final v3Combine([D[DDD)[D
    .locals 9

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-wide v1, p0, v0

    .line 13
    .line 14
    mul-double/2addr v1, p2

    .line 15
    aget-wide v3, p1, v0

    .line 16
    .line 17
    mul-double/2addr v3, p4

    .line 18
    add-double/2addr v1, v3

    .line 19
    const/4 v3, 0x1

    .line 20
    aget-wide v4, p0, v3

    .line 21
    .line 22
    mul-double/2addr v4, p2

    .line 23
    aget-wide v6, p1, v3

    .line 24
    .line 25
    mul-double/2addr v6, p4

    .line 26
    add-double/2addr v4, v6

    .line 27
    const/4 v6, 0x2

    .line 28
    aget-wide v7, p0, v6

    .line 29
    .line 30
    mul-double/2addr p2, v7

    .line 31
    aget-wide p0, p1, v6

    .line 32
    .line 33
    mul-double/2addr p4, p0

    .line 34
    add-double/2addr p2, p4

    .line 35
    const/4 p0, 0x3

    .line 36
    new-array p0, p0, [D

    .line 37
    .line 38
    aput-wide v1, p0, v0

    .line 39
    .line 40
    aput-wide v4, p0, v3

    .line 41
    .line 42
    aput-wide p2, p0, v6

    .line 43
    .line 44
    return-object p0
.end method

.method public static final v3Cross([D[D)[D
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "a"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "b"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    aget-wide v3, v0, v2

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aget-wide v6, v1, v5

    .line 20
    .line 21
    mul-double v8, v3, v6

    .line 22
    .line 23
    aget-wide v10, v0, v5

    .line 24
    .line 25
    aget-wide v12, v1, v2

    .line 26
    .line 27
    mul-double v14, v10, v12

    .line 28
    .line 29
    sub-double/2addr v8, v14

    .line 30
    const/4 v14, 0x0

    .line 31
    aget-wide v15, v1, v14

    .line 32
    .line 33
    mul-double/2addr v10, v15

    .line 34
    aget-wide v17, v0, v14

    .line 35
    .line 36
    mul-double v6, v6, v17

    .line 37
    .line 38
    sub-double/2addr v10, v6

    .line 39
    mul-double v17, v17, v12

    .line 40
    .line 41
    mul-double/2addr v3, v15

    .line 42
    sub-double v17, v17, v3

    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    new-array v0, v0, [D

    .line 46
    .line 47
    aput-wide v8, v0, v14

    .line 48
    .line 49
    aput-wide v10, v0, v2

    .line 50
    .line 51
    aput-wide v17, v0, v5

    .line 52
    .line 53
    return-object v0
.end method

.method public static final v3Dot([D[D)D
    .locals 7

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-wide v1, p0, v0

    .line 13
    .line 14
    aget-wide v3, p1, v0

    .line 15
    .line 16
    mul-double/2addr v1, v3

    .line 17
    const/4 v0, 0x1

    .line 18
    aget-wide v3, p0, v0

    .line 19
    .line 20
    aget-wide v5, p1, v0

    .line 21
    .line 22
    mul-double/2addr v3, v5

    .line 23
    add-double/2addr v1, v3

    .line 24
    const/4 v0, 0x2

    .line 25
    aget-wide v3, p0, v0

    .line 26
    .line 27
    aget-wide p0, p1, v0

    .line 28
    .line 29
    mul-double/2addr v3, p0

    .line 30
    add-double/2addr v1, v3

    .line 31
    return-wide v1
.end method

.method public static final v3Length([D)D
    .locals 4

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-wide v0, p0, v0

    .line 8
    .line 9
    mul-double/2addr v0, v0

    .line 10
    const/4 v2, 0x1

    .line 11
    aget-wide v2, p0, v2

    .line 12
    .line 13
    mul-double/2addr v2, v2

    .line 14
    add-double/2addr v0, v2

    .line 15
    const/4 v2, 0x2

    .line 16
    aget-wide v2, p0, v2

    .line 17
    .line 18
    mul-double/2addr v2, v2

    .line 19
    add-double/2addr v0, v2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0
.end method

.method public static final v3Normalize([DD)[D
    .locals 9

    .line 1
    const-string v0, "vector"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    int-to-double v1, v0

    .line 8
    sget-object v3, Lcom/facebook/react/uimanager/MatrixMathHelper;->INSTANCE:Lcom/facebook/react/uimanager/MatrixMathHelper;

    .line 9
    .line 10
    invoke-direct {v3, p1, p2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->isZero(D)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Lcom/facebook/react/uimanager/MatrixMathHelper;->v3Length([D)D

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    :cond_0
    div-double/2addr v1, p1

    .line 21
    const/4 p1, 0x0

    .line 22
    aget-wide v3, p0, p1

    .line 23
    .line 24
    mul-double/2addr v3, v1

    .line 25
    aget-wide v5, p0, v0

    .line 26
    .line 27
    mul-double/2addr v5, v1

    .line 28
    const/4 p2, 0x2

    .line 29
    aget-wide v7, p0, p2

    .line 30
    .line 31
    mul-double/2addr v7, v1

    .line 32
    const/4 p0, 0x3

    .line 33
    new-array p0, p0, [D

    .line 34
    .line 35
    aput-wide v3, p0, p1

    .line 36
    .line 37
    aput-wide v5, p0, v0

    .line 38
    .line 39
    aput-wide v7, p0, p2

    .line 40
    .line 41
    return-object p0
.end method


# virtual methods
.method public final applyScaleZ([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    aput-wide p2, p1, v0

    .line 9
    .line 10
    return-void
.end method
