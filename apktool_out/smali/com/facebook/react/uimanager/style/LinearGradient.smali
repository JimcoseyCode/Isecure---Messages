.class public final Lcom/facebook/react/uimanager/style/LinearGradient;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/style/Gradient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/LinearGradient$Companion;,
        Lcom/facebook/react/uimanager/style/LinearGradient$Direction;,
        Lcom/facebook/react/uimanager/style/LinearGradient$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0013H\u0002J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/LinearGradient;",
        "Lcom/facebook/react/uimanager/style/Gradient;",
        "direction",
        "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;",
        "colorStops",
        "",
        "Lcom/facebook/react/uimanager/style/ColorStop;",
        "<init>",
        "(Lcom/facebook/react/uimanager/style/LinearGradient$Direction;Ljava/util/List;)V",
        "getDirection",
        "()Lcom/facebook/react/uimanager/style/LinearGradient$Direction;",
        "getColorStops",
        "()Ljava/util/List;",
        "getShader",
        "Landroid/graphics/Shader;",
        "width",
        "",
        "height",
        "getAngleForKeyword",
        "",
        "keyword",
        "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;",
        "endPointsFromAngle",
        "Lkotlin/Pair;",
        "",
        "angle",
        "Companion",
        "Direction",
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
.field public static final Companion:Lcom/facebook/react/uimanager/style/LinearGradient$Companion;


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

.field private final direction:Lcom/facebook/react/uimanager/style/LinearGradient$Direction;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/LinearGradient$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/style/LinearGradient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient;->Companion:Lcom/facebook/react/uimanager/style/LinearGradient$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/style/LinearGradient$Direction;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/style/LinearGradient$Direction;",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/style/ColorStop;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "direction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "colorStops"

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
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->direction:Lcom/facebook/react/uimanager/style/LinearGradient$Direction;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->colorStops:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method private final endPointsFromAngle(DFF)Lkotlin/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DFF)",
            "Lkotlin/Pair<",
            "[F[F>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x168

    .line 2
    .line 3
    int-to-double v0, v0

    .line 4
    rem-double/2addr p1, v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpg-double v4, p1, v2

    .line 8
    .line 9
    if-gez v4, :cond_0

    .line 10
    .line 11
    add-double/2addr p1, v0

    .line 12
    :cond_0
    cmpg-double v0, p1, v2

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x2

    .line 17
    const/4 v4, 0x0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance p1, Lkotlin/Pair;

    .line 21
    .line 22
    new-array p2, v3, [F

    .line 23
    .line 24
    aput v4, p2, v2

    .line 25
    .line 26
    aput p3, p2, v1

    .line 27
    .line 28
    new-array p3, v3, [F

    .line 29
    .line 30
    fill-array-data p3, :array_0

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    const-wide v5, 0x4056800000000000L    # 90.0

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmpg-double v0, p1, v5

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    new-instance p1, Lkotlin/Pair;

    .line 47
    .line 48
    new-array p2, v3, [F

    .line 49
    .line 50
    fill-array-data p2, :array_1

    .line 51
    .line 52
    .line 53
    new-array p3, v3, [F

    .line 54
    .line 55
    aput p4, p3, v2

    .line 56
    .line 57
    aput v4, p3, v1

    .line 58
    .line 59
    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_2
    const-wide v5, 0x4066800000000000L    # 180.0

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmpg-double v5, p1, v5

    .line 69
    .line 70
    if-nez v5, :cond_3

    .line 71
    .line 72
    new-instance p1, Lkotlin/Pair;

    .line 73
    .line 74
    new-array p2, v3, [F

    .line 75
    .line 76
    fill-array-data p2, :array_2

    .line 77
    .line 78
    .line 79
    new-array p4, v3, [F

    .line 80
    .line 81
    aput v4, p4, v2

    .line 82
    .line 83
    aput p3, p4, v1

    .line 84
    .line 85
    invoke-direct {p1, p2, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_3
    const-wide v6, 0x4070e00000000000L    # 270.0

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    cmpg-double v6, p1, v6

    .line 95
    .line 96
    if-nez v6, :cond_4

    .line 97
    .line 98
    new-instance p1, Lkotlin/Pair;

    .line 99
    .line 100
    new-array p2, v3, [F

    .line 101
    .line 102
    aput p4, p2, v2

    .line 103
    .line 104
    aput v4, p2, v1

    .line 105
    .line 106
    new-array p3, v3, [F

    .line 107
    .line 108
    fill-array-data p3, :array_3

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_4
    const/16 v4, 0x5a

    .line 116
    .line 117
    int-to-double v7, v4

    .line 118
    sub-double/2addr v7, p1

    .line 119
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 120
    .line 121
    .line 122
    move-result-wide p1

    .line 123
    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    .line 124
    .line 125
    .line 126
    move-result-wide p1

    .line 127
    double-to-float p1, p1

    .line 128
    const/4 p2, -0x1

    .line 129
    int-to-float p2, p2

    .line 130
    div-float/2addr p2, p1

    .line 131
    int-to-float v4, v3

    .line 132
    div-float/2addr p3, v4

    .line 133
    div-float/2addr p4, v4

    .line 134
    if-gez v0, :cond_5

    .line 135
    .line 136
    new-array v0, v3, [F

    .line 137
    .line 138
    aput p4, v0, v2

    .line 139
    .line 140
    aput p3, v0, v1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_5
    if-gez v5, :cond_6

    .line 144
    .line 145
    new-array v0, v3, [F

    .line 146
    .line 147
    aput p4, v0, v2

    .line 148
    .line 149
    neg-float v4, p3

    .line 150
    aput v4, v0, v1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_6
    if-gez v6, :cond_7

    .line 154
    .line 155
    new-array v0, v3, [F

    .line 156
    .line 157
    neg-float v4, p4

    .line 158
    aput v4, v0, v2

    .line 159
    .line 160
    neg-float v4, p3

    .line 161
    aput v4, v0, v1

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_7
    new-array v0, v3, [F

    .line 165
    .line 166
    neg-float v4, p4

    .line 167
    aput v4, v0, v2

    .line 168
    .line 169
    aput p3, v0, v1

    .line 170
    .line 171
    :goto_0
    aget v4, v0, v1

    .line 172
    .line 173
    aget v0, v0, v2

    .line 174
    .line 175
    mul-float/2addr v0, p2

    .line 176
    sub-float/2addr v4, v0

    .line 177
    sub-float/2addr p1, p2

    .line 178
    div-float p1, v4, p1

    .line 179
    .line 180
    mul-float/2addr p2, p1

    .line 181
    add-float/2addr p2, v4

    .line 182
    add-float v0, p4, p1

    .line 183
    .line 184
    sub-float v4, p3, p2

    .line 185
    .line 186
    new-array v5, v3, [F

    .line 187
    .line 188
    aput v0, v5, v2

    .line 189
    .line 190
    aput v4, v5, v1

    .line 191
    .line 192
    sub-float/2addr p4, p1

    .line 193
    add-float/2addr p3, p2

    .line 194
    new-array p1, v3, [F

    .line 195
    .line 196
    aput p4, p1, v2

    .line 197
    .line 198
    aput p3, p1, v1

    .line 199
    .line 200
    new-instance p2, Lkotlin/Pair;

    .line 201
    .line 202
    invoke-direct {p2, p1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    return-object p2

    .line 206
    nop

    .line 207
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private final getAngleForKeyword(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;DD)D
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0x5a

    .line 11
    .line 12
    if-eq p1, v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    div-double/2addr p4, p2

    .line 24
    invoke-static {p4, p5}, Ljava/lang/Math;->atan(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    const/16 p3, 0xb4

    .line 33
    .line 34
    :goto_0
    int-to-double p3, p3

    .line 35
    :goto_1
    add-double/2addr p1, p3

    .line 36
    return-wide p1

    .line 37
    :cond_0
    new-instance p1, Li7/m;

    .line 38
    .line 39
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    div-double/2addr p2, p4

    .line 44
    invoke-static {p2, p3}, Ljava/lang/Math;->atan(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    const/16 p3, 0x10e

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    div-double/2addr p2, p4

    .line 56
    invoke-static {p2, p3}, Ljava/lang/Math;->atan(D)D

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    int-to-double p3, v1

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    div-double/2addr p2, p4

    .line 67
    invoke-static {p2, p3}, Ljava/lang/Math;->atan(D)D

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    int-to-double p3, v1

    .line 76
    sub-double/2addr p3, p1

    .line 77
    return-wide p3
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
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->colorStops:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDirection()Lcom/facebook/react/uimanager/style/LinearGradient$Direction;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->direction:Lcom/facebook/react/uimanager/style/LinearGradient$Direction;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShader(FF)Landroid/graphics/Shader;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/LinearGradient;->direction:Lcom/facebook/react/uimanager/style/LinearGradient$Direction;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Angle;->getAngle()D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    move-wide v2, v0

    .line 14
    move-object v1, p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of v1, v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;

    .line 17
    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    check-cast v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$Keyword;->getKeyword()Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    float-to-double v3, p1

    .line 27
    float-to-double v5, p2

    .line 28
    move-object v1, p0

    .line 29
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/uimanager/style/LinearGradient;->getAngleForKeyword(Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;DD)D

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    :goto_0
    invoke-direct {p0, v2, v3, p2, p1}, Lcom/facebook/react/uimanager/style/LinearGradient;->endPointsFromAngle(DFF)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, [F

    .line 42
    .line 43
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, [F

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    aget v2, p1, v0

    .line 51
    .line 52
    aget v3, p2, v0

    .line 53
    .line 54
    sub-float/2addr v2, v3

    .line 55
    const/4 v3, 0x1

    .line 56
    aget v4, p1, v3

    .line 57
    .line 58
    aget v5, p2, v3

    .line 59
    .line 60
    sub-float/2addr v4, v5

    .line 61
    mul-float/2addr v2, v2

    .line 62
    mul-float/2addr v4, v4

    .line 63
    add-float/2addr v2, v4

    .line 64
    float-to-double v4, v2

    .line 65
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    double-to-float v2, v4

    .line 70
    sget-object v4, Lcom/facebook/react/uimanager/style/ColorStopUtils;->INSTANCE:Lcom/facebook/react/uimanager/style/ColorStopUtils;

    .line 71
    .line 72
    iget-object v5, v1, Lcom/facebook/react/uimanager/style/LinearGradient;->colorStops:Ljava/util/List;

    .line 73
    .line 74
    invoke-virtual {v4, v5, v2}, Lcom/facebook/react/uimanager/style/ColorStopUtils;->getFixedColorStops(Ljava/util/List;F)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    new-array v10, v4, [I

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    new-array v11, v4, [F

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move v4, v0

    .line 95
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    add-int/lit8 v6, v4, 0x1

    .line 106
    .line 107
    if-gez v4, :cond_1

    .line 108
    .line 109
    invoke-static {}, Lj7/q;->t()V

    .line 110
    .line 111
    .line 112
    :cond_1
    check-cast v5, Lcom/facebook/react/uimanager/style/ProcessedColorStop;

    .line 113
    .line 114
    invoke-virtual {v5}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getColor()Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    if-eqz v7, :cond_2

    .line 119
    .line 120
    invoke-virtual {v5}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    if-eqz v8, :cond_2

    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    aput v7, v10, v4

    .line 131
    .line 132
    invoke-virtual {v5}, Lcom/facebook/react/uimanager/style/ProcessedColorStop;->getPosition()Ljava/lang/Float;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    aput v5, v11, v4

    .line 141
    .line 142
    :cond_2
    move v4, v6

    .line 143
    goto :goto_1

    .line 144
    :cond_3
    new-instance v5, Landroid/graphics/LinearGradient;

    .line 145
    .line 146
    aget v6, p2, v0

    .line 147
    .line 148
    aget v7, p2, v3

    .line 149
    .line 150
    aget v8, p1, v0

    .line 151
    .line 152
    aget v9, p1, v3

    .line 153
    .line 154
    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 155
    .line 156
    invoke-direct/range {v5 .. v12}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 157
    .line 158
    .line 159
    return-object v5

    .line 160
    :cond_4
    move-object v1, p0

    .line 161
    new-instance p1, Li7/m;

    .line 162
    .line 163
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 164
    .line 165
    .line 166
    throw p1
.end method
