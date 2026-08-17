.class public final Lcom/facebook/react/uimanager/TransformHelper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/TransformHelper$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0016JA\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ3\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ:\u0010!\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010 H\u0083 \u00a2\u0006\u0004\u0008!\u0010\"R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\r0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/TransformHelper;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "transformMap",
        "",
        "key",
        "",
        "convertToRadians",
        "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "transforms",
        "",
        "result",
        "Li7/B;",
        "processTransform",
        "(Lcom/facebook/react/bridge/ReadableArray;[D)V",
        "",
        "viewWidth",
        "viewHeight",
        "transformOrigin",
        "(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;)V",
        "",
        "allowPercentageResolution",
        "(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V",
        "stringValue",
        "dimension",
        "parseTranslateValue",
        "(Ljava/lang/String;D)D",
        "getTranslateForTransformOrigin",
        "(FFLcom/facebook/react/bridge/ReadableArray;Z)[D",
        "Lcom/facebook/react/bridge/NativeArray;",
        "nativeProcessTransform",
        "(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V",
        "Ljava/lang/ThreadLocal;",
        "helperMatrix",
        "Ljava/lang/ThreadLocal;",
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
.field public static final INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

.field private static final helperMatrix:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "[D>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/TransformHelper;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/TransformHelper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    .line 7
    .line 8
    new-instance v0, Lcom/facebook/react/uimanager/TransformHelper$helperMatrix$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/facebook/react/uimanager/TransformHelper$helperMatrix$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/facebook/react/uimanager/TransformHelper;->helperMatrix:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
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

.method private final convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D
    .locals 5

    .line 1
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const-string p2, "rad"

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {p1, p2, v0, v1, v3}, LP8/q;->w(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/4 v4, 0x3

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-static {p1, v4}, LP8/q;->f1(Ljava/lang/String;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p2, "deg"

    .line 35
    .line 36
    invoke-static {p1, p2, v0, v1, v3}, LP8/q;->w(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-static {p1, v4}, LP8/q;->f1(Ljava/lang/String;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    move v2, v0

    .line 47
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    :goto_1
    if-eqz v2, :cond_3

    .line 57
    .line 58
    return-wide p1

    .line 59
    :cond_3
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/MatrixMathHelper;->degreesToRadians(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    return-wide p1
.end method

.method private final getTranslateForTransformOrigin(FFLcom/facebook/react/bridge/ReadableArray;Z)[D
    .locals 20

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_6

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    cmpg-float v5, v1, v4

    .line 12
    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    cmpg-float v4, v0, v4

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    float-to-double v4, v0

    .line 22
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 23
    .line 24
    div-double/2addr v4, v6

    .line 25
    float-to-double v8, v1

    .line 26
    div-double/2addr v8, v6

    .line 27
    const/4 v6, 0x3

    .line 28
    new-array v7, v6, [D

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    aput-wide v4, v7, v10

    .line 32
    .line 33
    const/4 v11, 0x1

    .line 34
    aput-wide v8, v7, v11

    .line 35
    .line 36
    const-wide/16 v12, 0x0

    .line 37
    .line 38
    const/4 v14, 0x2

    .line 39
    aput-wide v12, v7, v14

    .line 40
    .line 41
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    move v13, v10

    .line 50
    :goto_0
    if-ge v13, v12, :cond_5

    .line 51
    .line 52
    invoke-interface {v2, v13}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 53
    .line 54
    .line 55
    move-result-object v15

    .line 56
    sget-object v16, Lcom/facebook/react/uimanager/TransformHelper$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 57
    .line 58
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    aget v15, v16, v15

    .line 63
    .line 64
    if-eq v15, v11, :cond_4

    .line 65
    .line 66
    if-eq v15, v14, :cond_2

    .line 67
    .line 68
    :cond_1
    move v15, v10

    .line 69
    move/from16 v19, v11

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_2
    if-eqz p4, :cond_1

    .line 73
    .line 74
    invoke-interface {v2, v13}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    invoke-static {v15}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-string v6, "%"

    .line 82
    .line 83
    invoke-static {v15, v6, v10, v14, v3}, LP8/q;->w(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_1

    .line 88
    .line 89
    invoke-static {v15, v11}, LP8/q;->f1(Ljava/lang/String;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 94
    .line 95
    .line 96
    move-result-wide v17

    .line 97
    if-nez v13, :cond_3

    .line 98
    .line 99
    move v6, v0

    .line 100
    :goto_1
    move v15, v10

    .line 101
    move/from16 v19, v11

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move v6, v1

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    float-to-double v10, v6

    .line 107
    mul-double v10, v10, v17

    .line 108
    .line 109
    const-wide/high16 v17, 0x4059000000000000L    # 100.0

    .line 110
    .line 111
    div-double v10, v10, v17

    .line 112
    .line 113
    aput-wide v10, v7, v13

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move v15, v10

    .line 117
    move/from16 v19, v11

    .line 118
    .line 119
    invoke-interface {v2, v13}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 120
    .line 121
    .line 122
    move-result-wide v10

    .line 123
    aput-wide v10, v7, v13

    .line 124
    .line 125
    :goto_3
    add-int/lit8 v13, v13, 0x1

    .line 126
    .line 127
    move v10, v15

    .line 128
    move/from16 v11, v19

    .line 129
    .line 130
    const/4 v6, 0x3

    .line 131
    goto :goto_0

    .line 132
    :cond_5
    move v15, v10

    .line 133
    move/from16 v19, v11

    .line 134
    .line 135
    neg-double v0, v4

    .line 136
    aget-wide v2, v7, v15

    .line 137
    .line 138
    add-double/2addr v0, v2

    .line 139
    neg-double v2, v8

    .line 140
    aget-wide v4, v7, v19

    .line 141
    .line 142
    add-double/2addr v2, v4

    .line 143
    aget-wide v4, v7, v14

    .line 144
    .line 145
    const/4 v6, 0x3

    .line 146
    new-array v6, v6, [D

    .line 147
    .line 148
    aput-wide v0, v6, v15

    .line 149
    .line 150
    aput-wide v2, v6, v19

    .line 151
    .line 152
    aput-wide v4, v6, v14

    .line 153
    .line 154
    return-object v6

    .line 155
    :cond_6
    :goto_4
    return-object v3
.end method

.method private static final native nativeProcessTransform(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V
.end method

.method private final parseTranslateValue(Ljava/lang/String;D)D
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "%"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {p1, v0, v3, v1, v2}, LP8/q;->w(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {p1, v0}, LP8/q;->f1(Ljava/lang/String;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    mul-double/2addr v0, p2

    .line 22
    const-wide/high16 p1, 0x4059000000000000L    # 100.0

    .line 23
    .line 24
    div-double/2addr v0, p1

    .line 25
    return-wide v0

    .line 26
    :cond_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-wide p1

    .line 31
    :catch_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string p3, "Invalid translate value: "

    .line 37
    .line 38
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "ReactNative"

    .line 49
    .line 50
    invoke-static {p2, p1}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-wide/16 p1, 0x0

    .line 54
    .line 55
    return-wide p1
.end method

.method public static final processTransform(Lcom/facebook/react/bridge/ReadableArray;[D)V
    .locals 7

    const-string v0, "transforms"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 1
    invoke-static/range {v1 .. v6}, Lcom/facebook/react/uimanager/TransformHelper;->processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V

    return-void
.end method

.method public static final processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;)V
    .locals 7

    const-string v0, "transforms"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    .line 2
    invoke-static/range {v1 .. v6}, Lcom/facebook/react/uimanager/TransformHelper;->processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V

    return-void
.end method

.method public static final processTransform(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    const-string v6, "transforms"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "result"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    .line 3
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->useNativeTransformHelperAndroid()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 4
    instance-of v7, v0, Lcom/facebook/react/bridge/NativeArray;

    if-eqz v7, :cond_1

    if-nez v4, :cond_0

    move v7, v6

    goto :goto_0

    .line 5
    :cond_0
    instance-of v7, v4, Lcom/facebook/react/bridge/NativeArray;

    :goto_0
    if-eqz v7, :cond_1

    .line 6
    check-cast v0, Lcom/facebook/react/bridge/NativeArray;

    check-cast v4, Lcom/facebook/react/bridge/NativeArray;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/uimanager/TransformHelper;->nativeProcessTransform(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V

    return-void

    .line 7
    :cond_1
    sget-object v7, Lcom/facebook/react/uimanager/TransformHelper;->helperMatrix:Ljava/lang/ThreadLocal;

    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    move-object v8, v7

    check-cast v8, [D

    .line 8
    invoke-static {v1}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 9
    sget-object v7, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-direct {v7, v2, v3, v4, v5}, Lcom/facebook/react/uimanager/TransformHelper;->getTranslateForTransformOrigin(FFLcom/facebook/react/bridge/ReadableArray;Z)[D

    move-result-object v4

    const/4 v7, 0x2

    const/4 v15, 0x0

    if-eqz v4, :cond_2

    .line 10
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 11
    aget-wide v9, v4, v15

    aget-wide v11, v4, v6

    aget-wide v13, v4, v7

    invoke-static/range {v8 .. v14}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate3D([DDDD)V

    .line 12
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    .line 13
    :cond_2
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v9

    const/16 v10, 0x10

    if-ne v9, v10, :cond_4

    invoke-interface {v0, v15}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    sget-object v11, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v9, v11, :cond_4

    .line 14
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 15
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    move v3, v15

    :goto_1
    if-ge v3, v2, :cond_3

    .line 16
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v9

    aput-wide v9, v8, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 17
    :cond_3
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    goto/16 :goto_11

    .line 18
    :cond_4
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v9

    move v11, v15

    :goto_2
    if-ge v11, v9, :cond_19

    .line 19
    invoke-interface {v0, v11}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 20
    invoke-interface {v12}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v13

    invoke-interface {v13}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v13

    .line 21
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 22
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v14

    move/from16 v16, v11

    sparse-switch v14, :sswitch_data_0

    :goto_3
    move v6, v9

    const/16 v7, 0x10

    goto/16 :goto_d

    :sswitch_0
    const-string v10, "rotateZ"

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    goto :goto_3

    :cond_5
    move v6, v9

    const/16 v7, 0x10

    goto/16 :goto_9

    :sswitch_1
    const-string v10, "rotateY"

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_3

    .line 23
    :cond_6
    sget-object v10, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-direct {v10, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v10

    .line 24
    invoke-static {v8, v10, v11}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyRotateY([DD)V

    :goto_4
    move v6, v9

    const/16 v7, 0x10

    goto/16 :goto_10

    .line 25
    :sswitch_2
    const-string v10, "rotateX"

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    goto :goto_3

    .line 26
    :cond_7
    sget-object v10, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-direct {v10, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v10

    .line 27
    invoke-static {v8, v10, v11}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyRotateX([DD)V

    goto :goto_4

    .line 28
    :sswitch_3
    const-string v14, "translate"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    goto :goto_3

    .line 29
    :cond_8
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 30
    invoke-interface {v12, v15}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v13

    sget-object v14, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v13, v14, :cond_9

    if-eqz v5, :cond_9

    .line 31
    sget-object v13, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-interface {v12, v15}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    move-object v11, v8

    float-to-double v7, v2

    invoke-direct {v13, v10, v7, v8}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v7

    goto :goto_5

    :cond_9
    move-object v11, v8

    .line 32
    invoke-interface {v12, v15}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v7

    .line 33
    :goto_5
    invoke-interface {v12, v6}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v10

    if-ne v10, v14, :cond_a

    if-eqz v5, :cond_a

    .line 34
    sget-object v10, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-interface {v12, v6}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    move-wide/from16 v19, v7

    float-to-double v6, v3

    invoke-direct {v10, v13, v6, v7}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v6

    goto :goto_6

    :cond_a
    move-wide/from16 v19, v7

    .line 35
    invoke-interface {v12, v6}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v7

    move-wide v6, v7

    .line 36
    :goto_6
    invoke-interface {v12}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v8

    const/4 v10, 0x2

    if-le v8, v10, :cond_b

    invoke-interface {v12, v10}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v12

    move-wide v13, v12

    :goto_7
    move-object v8, v11

    move-wide v11, v6

    move v6, v9

    move-wide/from16 v9, v19

    const/16 v7, 0x10

    goto :goto_8

    :cond_b
    const-wide/16 v13, 0x0

    goto :goto_7

    .line 37
    :goto_8
    invoke-static/range {v8 .. v14}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate3D([DDDD)V

    goto/16 :goto_10

    :sswitch_4
    move v6, v9

    const/16 v7, 0x10

    .line 38
    const-string v9, "perspective"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    goto/16 :goto_d

    .line 39
    :cond_c
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyPerspective([DD)V

    goto/16 :goto_10

    :sswitch_5
    move v6, v9

    const/16 v7, 0x10

    .line 40
    const-string v9, "skewY"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    goto/16 :goto_d

    .line 41
    :cond_d
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-direct {v9, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v9

    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applySkewY([DD)V

    goto/16 :goto_10

    :sswitch_6
    move v6, v9

    const/16 v7, 0x10

    .line 42
    const-string v9, "skewX"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    goto/16 :goto_d

    .line 43
    :cond_e
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-direct {v9, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v9

    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applySkewX([DD)V

    goto/16 :goto_10

    :sswitch_7
    move v6, v9

    const/16 v7, 0x10

    .line 44
    const-string v9, "scale"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    goto/16 :goto_d

    .line 45
    :cond_f
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 46
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleX([DD)V

    .line 47
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleY([DD)V

    goto/16 :goto_10

    :sswitch_8
    move v6, v9

    const/16 v7, 0x10

    .line 48
    const-string v9, "scaleY"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    goto/16 :goto_d

    .line 49
    :cond_10
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleY([DD)V

    goto/16 :goto_10

    :sswitch_9
    move v6, v9

    const/16 v7, 0x10

    .line 50
    const-string v9, "scaleX"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    goto/16 :goto_d

    .line 51
    :cond_11
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyScaleX([DD)V

    goto/16 :goto_10

    :sswitch_a
    move v6, v9

    const/16 v7, 0x10

    .line 52
    const-string v9, "rotate"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    goto/16 :goto_d

    .line 53
    :cond_12
    :goto_9
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-direct {v9, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->convertToRadians(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v9

    .line 54
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyRotateZ([DD)V

    goto/16 :goto_10

    :sswitch_b
    move v6, v9

    const/16 v7, 0x10

    .line 55
    const-string v9, "matrix"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    goto :goto_d

    .line 56
    :cond_13
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    move v10, v15

    :goto_a
    if-ge v10, v7, :cond_18

    .line 57
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v11

    aput-wide v11, v8, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :sswitch_c
    move v6, v9

    const/16 v7, 0x10

    .line 58
    const-string v9, "translateY"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    goto :goto_d

    .line 59
    :cond_14
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    sget-object v10, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v9, v10, :cond_15

    if-eqz v5, :cond_15

    .line 60
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    float-to-double v11, v3

    invoke-direct {v9, v10, v11, v12}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v9

    :goto_b
    const-wide/16 v11, 0x0

    goto :goto_c

    .line 61
    :cond_15
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    goto :goto_b

    .line 62
    :goto_c
    invoke-static {v8, v11, v12, v9, v10}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate2D([DDD)V

    goto :goto_10

    :sswitch_d
    move v6, v9

    const/16 v7, 0x10

    .line 63
    const-string v9, "translateX"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_16

    .line 64
    :goto_d
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Unsupported transform type: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "ReactNative"

    invoke-static {v10, v9}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_10

    .line 65
    :cond_16
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    sget-object v10, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v9, v10, :cond_17

    if-eqz v5, :cond_17

    .line 66
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->INSTANCE:Lcom/facebook/react/uimanager/TransformHelper;

    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    float-to-double v11, v2

    invoke-direct {v9, v10, v11, v12}, Lcom/facebook/react/uimanager/TransformHelper;->parseTranslateValue(Ljava/lang/String;D)D

    move-result-wide v9

    :goto_e
    const-wide/16 v11, 0x0

    goto :goto_f

    .line 67
    :cond_17
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    goto :goto_e

    .line 68
    :goto_f
    invoke-static {v8, v9, v10, v11, v12}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate2D([DDD)V

    .line 69
    :cond_18
    :goto_10
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    add-int/lit8 v11, v16, 0x1

    move v9, v6

    move v10, v7

    const/4 v6, 0x1

    const/4 v7, 0x2

    goto/16 :goto_2

    :cond_19
    :goto_11
    if-eqz v4, :cond_1a

    .line 70
    invoke-static {v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->resetIdentityMatrix([D)V

    .line 71
    aget-wide v2, v4, v15

    neg-double v9, v2

    const/16 v18, 0x1

    aget-wide v2, v4, v18

    neg-double v11, v2

    const/16 v17, 0x2

    aget-wide v2, v4, v17

    neg-double v13, v2

    invoke-static/range {v8 .. v14}, Lcom/facebook/react/uimanager/MatrixMathHelper;->applyTranslate3D([DDDD)V

    .line 72
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/MatrixMathHelper;->multiplyInto([D[D[D)V

    :cond_1a
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x66a2c736 -> :sswitch_d
        -0x66a2c735 -> :sswitch_c
        -0x4072683f -> :sswitch_b
        -0x372522a5 -> :sswitch_a
        -0x3621dfb2 -> :sswitch_9
        -0x3621dfb1 -> :sswitch_8
        0x683094a -> :sswitch_7
        0x686bc8e -> :sswitch_6
        0x686bc8f -> :sswitch_5
        0xc653a3c -> :sswitch_4
        0x3ec0f14e -> :sswitch_3
        0x5280ce5d -> :sswitch_2
        0x5280ce5e -> :sswitch_1
        0x5280ce5f -> :sswitch_0
    .end sparse-switch
.end method
