.class public final Lcom/facebook/react/animated/SpringAnimation;
.super Lcom/facebook/react/animated/AnimationDriver;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/SpringAnimation$Companion;,
        Lcom/facebook/react/animated/SpringAnimation$PhysicsState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0000\u0018\u0000 .2\u00020\u0001:\u0002/.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001aR\u0016\u0010\"\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001aR\u0016\u0010#\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001aR\u0016\u0010$\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001aR\u0016\u0010%\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001aR\u0016\u0010\'\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010(R\u0016\u0010*\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u001aR\u0014\u0010+\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0014\u0010-\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010,\u00a8\u00060"
    }
    d2 = {
        "Lcom/facebook/react/animated/SpringAnimation;",
        "Lcom/facebook/react/animated/AnimationDriver;",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "config",
        "<init>",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "Lcom/facebook/react/animated/SpringAnimation$PhysicsState;",
        "state",
        "",
        "getDisplacementDistanceForState",
        "(Lcom/facebook/react/animated/SpringAnimation$PhysicsState;)D",
        "realDeltaTime",
        "Li7/B;",
        "advance",
        "(D)V",
        "resetConfig",
        "",
        "frameTimeNanos",
        "runAnimationStep",
        "(J)V",
        "lastTime",
        "J",
        "",
        "springStarted",
        "Z",
        "springStiffness",
        "D",
        "springDamping",
        "springMass",
        "initialVelocity",
        "overshootClampingEnabled",
        "currentState",
        "Lcom/facebook/react/animated/SpringAnimation$PhysicsState;",
        "startValue",
        "endValue",
        "restSpeedThreshold",
        "displacementFromRestThreshold",
        "timeAccumulator",
        "",
        "iterations",
        "I",
        "currentLoop",
        "originalValue",
        "isAtRest",
        "()Z",
        "isOvershooting",
        "Companion",
        "PhysicsState",
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
.field public static final Companion:Lcom/facebook/react/animated/SpringAnimation$Companion;

.field private static final MAX_DELTA_TIME_SEC:D = 0.064


# instance fields
.field private currentLoop:I

.field private final currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

.field private displacementFromRestThreshold:D

.field private endValue:D

.field private initialVelocity:D

.field private iterations:I

.field private lastTime:J

.field private originalValue:D

.field private overshootClampingEnabled:Z

.field private restSpeedThreshold:D

.field private springDamping:D

.field private springMass:D

.field private springStarted:Z

.field private springStiffness:D

.field private startValue:D

.field private timeAccumulator:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/animated/SpringAnimation$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/animated/SpringAnimation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/animated/SpringAnimation;->Companion:Lcom/facebook/react/animated/SpringAnimation$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 8

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimationDriver;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    invoke-direct/range {v1 .. v7}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;-><init>(DDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 21
    .line 22
    const-string v0, "initialVelocity"

    .line 23
    .line 24
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setVelocity(D)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/SpringAnimation;->resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final advance(D)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    const-wide v1, 0x3fb0624dd2f1a9fcL    # 0.064

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmpl-double v3, p1, v1

    .line 17
    .line 18
    if-lez v3, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-wide/from16 v1, p1

    .line 22
    .line 23
    :goto_0
    iget-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 24
    .line 25
    add-double/2addr v3, v1

    .line 26
    iput-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 27
    .line 28
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->springDamping:D

    .line 29
    .line 30
    iget-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->springMass:D

    .line 31
    .line 32
    iget-wide v5, v0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 33
    .line 34
    iget-wide v7, v0, Lcom/facebook/react/animated/SpringAnimation;->initialVelocity:D

    .line 35
    .line 36
    neg-double v7, v7

    .line 37
    const/4 v9, 0x2

    .line 38
    int-to-double v9, v9

    .line 39
    mul-double v11, v5, v3

    .line 40
    .line 41
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v11

    .line 45
    mul-double/2addr v9, v11

    .line 46
    div-double/2addr v1, v9

    .line 47
    div-double/2addr v5, v3

    .line 48
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    mul-double v5, v1, v1

    .line 53
    .line 54
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 55
    .line 56
    sub-double v5, v9, v5

    .line 57
    .line 58
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    mul-double/2addr v5, v3

    .line 63
    iget-wide v11, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 64
    .line 65
    iget-wide v13, v0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 66
    .line 67
    sub-double/2addr v11, v13

    .line 68
    iget-wide v13, v0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 69
    .line 70
    cmpg-double v9, v1, v9

    .line 71
    .line 72
    if-gez v9, :cond_2

    .line 73
    .line 74
    neg-double v9, v1

    .line 75
    mul-double/2addr v9, v3

    .line 76
    mul-double/2addr v9, v13

    .line 77
    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    move-wide/from16 p1, v1

    .line 82
    .line 83
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 84
    .line 85
    mul-double v3, v3, p1

    .line 86
    .line 87
    mul-double v15, v3, v11

    .line 88
    .line 89
    add-double/2addr v7, v15

    .line 90
    div-double v15, v7, v5

    .line 91
    .line 92
    mul-double/2addr v13, v5

    .line 93
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v17

    .line 97
    mul-double v15, v15, v17

    .line 98
    .line 99
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 100
    .line 101
    .line 102
    move-result-wide v17

    .line 103
    mul-double v17, v17, v11

    .line 104
    .line 105
    add-double v15, v15, v17

    .line 106
    .line 107
    mul-double/2addr v15, v9

    .line 108
    sub-double/2addr v1, v15

    .line 109
    mul-double/2addr v3, v9

    .line 110
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide v15

    .line 114
    mul-double/2addr v15, v7

    .line 115
    div-double/2addr v15, v5

    .line 116
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 117
    .line 118
    .line 119
    move-result-wide v17

    .line 120
    mul-double v17, v17, v11

    .line 121
    .line 122
    add-double v15, v15, v17

    .line 123
    .line 124
    mul-double/2addr v3, v15

    .line 125
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 126
    .line 127
    .line 128
    move-result-wide v15

    .line 129
    mul-double/2addr v15, v7

    .line 130
    mul-double/2addr v5, v11

    .line 131
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v7

    .line 135
    mul-double/2addr v5, v7

    .line 136
    sub-double/2addr v15, v5

    .line 137
    mul-double/2addr v9, v15

    .line 138
    sub-double/2addr v3, v9

    .line 139
    goto :goto_1

    .line 140
    :cond_2
    neg-double v1, v3

    .line 141
    mul-double/2addr v1, v13

    .line 142
    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v1

    .line 146
    iget-wide v5, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 147
    .line 148
    mul-double v9, v3, v11

    .line 149
    .line 150
    add-double/2addr v9, v7

    .line 151
    mul-double/2addr v9, v13

    .line 152
    add-double/2addr v9, v11

    .line 153
    mul-double/2addr v9, v1

    .line 154
    sub-double/2addr v5, v9

    .line 155
    mul-double v9, v13, v3

    .line 156
    .line 157
    const/4 v15, 0x1

    .line 158
    move-wide/from16 p1, v1

    .line 159
    .line 160
    int-to-double v1, v15

    .line 161
    sub-double/2addr v9, v1

    .line 162
    mul-double/2addr v7, v9

    .line 163
    mul-double/2addr v13, v11

    .line 164
    mul-double/2addr v3, v3

    .line 165
    mul-double/2addr v13, v3

    .line 166
    add-double/2addr v7, v13

    .line 167
    mul-double v3, p1, v7

    .line 168
    .line 169
    move-wide v1, v5

    .line 170
    :goto_1
    iget-object v5, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 171
    .line 172
    invoke-virtual {v5, v1, v2}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setPosition(D)V

    .line 173
    .line 174
    .line 175
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 176
    .line 177
    invoke-virtual {v1, v3, v4}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setVelocity(D)V

    .line 178
    .line 179
    .line 180
    invoke-direct {v0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_4

    .line 185
    .line 186
    iget-boolean v1, v0, Lcom/facebook/react/animated/SpringAnimation;->overshootClampingEnabled:Z

    .line 187
    .line 188
    if-eqz v1, :cond_3

    .line 189
    .line 190
    invoke-direct {v0}, Lcom/facebook/react/animated/SpringAnimation;->isOvershooting()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_3

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_3
    :goto_2
    return-void

    .line 198
    :cond_4
    :goto_3
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 199
    .line 200
    const-wide/16 v3, 0x0

    .line 201
    .line 202
    cmpl-double v1, v1, v3

    .line 203
    .line 204
    if-lez v1, :cond_5

    .line 205
    .line 206
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 207
    .line 208
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 209
    .line 210
    iget-object v5, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 211
    .line 212
    invoke-virtual {v5, v1, v2}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setPosition(D)V

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_5
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 219
    .line 220
    .line 221
    move-result-wide v1

    .line 222
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 223
    .line 224
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 225
    .line 226
    :goto_4
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 227
    .line 228
    invoke-virtual {v1, v3, v4}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setVelocity(D)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method private final getDisplacementDistanceForState(Lcom/facebook/react/animated/SpringAnimation$PhysicsState;)D
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    sub-double/2addr v0, v2

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method private final isAtRest()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getVelocity()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->restSpeedThreshold:D

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-gtz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/facebook/react/animated/SpringAnimation;->getDisplacementDistanceForState(Lcom/facebook/react/animated/SpringAnimation$PhysicsState;)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->displacementFromRestThreshold:D

    .line 24
    .line 25
    cmpg-double v0, v0, v2

    .line 26
    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    cmpg-double v0, v0, v2

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method private final isOvershooting()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmpl-double v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-gez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 24
    .line 25
    cmpl-double v0, v0, v2

    .line 26
    .line 27
    if-gtz v0, :cond_1

    .line 28
    .line 29
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 30
    .line 31
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 32
    .line 33
    cmpl-double v0, v0, v2

    .line 34
    .line 35
    if-lez v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 44
    .line 45
    cmpg-double v0, v0, v2

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    :cond_1
    const/4 v0, 0x1

    .line 50
    return v0

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    return v0
.end method


# virtual methods
.method public resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "stiffness"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStiffness:D

    .line 13
    .line 14
    const-string v0, "damping"

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springDamping:D

    .line 21
    .line 22
    const-string v0, "mass"

    .line 23
    .line 24
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springMass:D

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getVelocity()D

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->initialVelocity:D

    .line 37
    .line 38
    const-string v0, "toValue"

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->endValue:D

    .line 45
    .line 46
    const-string v0, "restSpeedThreshold"

    .line 47
    .line 48
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->restSpeedThreshold:D

    .line 53
    .line 54
    const-string v0, "restDisplacementThreshold"

    .line 55
    .line 56
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->displacementFromRestThreshold:D

    .line 61
    .line 62
    const-string v0, "overshootClamping"

    .line 63
    .line 64
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput-boolean v0, p0, Lcom/facebook/react/animated/SpringAnimation;->overshootClampingEnabled:Z

    .line 69
    .line 70
    const-string v0, "iterations"

    .line 71
    .line 72
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/4 v2, 0x1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move p1, v2

    .line 85
    :goto_0
    iput p1, p0, Lcom/facebook/react/animated/SpringAnimation;->iterations:I

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    if-nez p1, :cond_1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move v2, v0

    .line 92
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 93
    .line 94
    iput v0, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 95
    .line 96
    const-wide/16 v1, 0x0

    .line 97
    .line 98
    iput-wide v1, p0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 99
    .line 100
    iput-boolean v0, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 101
    .line 102
    return-void
.end method

.method public runAnimationStep(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->animatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    const v1, 0xf4240

    .line 6
    .line 7
    .line 8
    int-to-long v1, v1

    .line 9
    div-long/2addr p1, v1

    .line 10
    iget-boolean v1, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-wide v3, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 20
    .line 21
    iput-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->originalValue:D

    .line 22
    .line 23
    iput v2, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 26
    .line 27
    iget-wide v3, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 28
    .line 29
    invoke-virtual {v1, v3, v4}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->setPosition(D)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    iput-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->startValue:D

    .line 39
    .line 40
    iput-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->lastTime:J

    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    iput-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->timeAccumulator:D

    .line 45
    .line 46
    iput-boolean v2, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 47
    .line 48
    :cond_1
    iget-wide v3, p0, Lcom/facebook/react/animated/SpringAnimation;->lastTime:J

    .line 49
    .line 50
    sub-long v3, p1, v3

    .line 51
    .line 52
    long-to-double v3, v3

    .line 53
    const-wide v5, 0x408f400000000000L    # 1000.0

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    div-double/2addr v3, v5

    .line 59
    invoke-direct {p0, v3, v4}, Lcom/facebook/react/animated/SpringAnimation;->advance(D)V

    .line 60
    .line 61
    .line 62
    iput-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->lastTime:J

    .line 63
    .line 64
    iget-object p1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->getPosition()D

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    iput-wide p1, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    iget p1, p0, Lcom/facebook/react/animated/SpringAnimation;->iterations:I

    .line 79
    .line 80
    const/4 p2, -0x1

    .line 81
    if-eq p1, p2, :cond_3

    .line 82
    .line 83
    iget p2, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 84
    .line 85
    if-ge p2, p1, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->hasFinished:Z

    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 92
    iput-boolean p1, p0, Lcom/facebook/react/animated/SpringAnimation;->springStarted:Z

    .line 93
    .line 94
    iget-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->originalValue:D

    .line 95
    .line 96
    iput-wide p1, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 97
    .line 98
    iget p1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 99
    .line 100
    add-int/2addr p1, v2

    .line 101
    iput p1, p0, Lcom/facebook/react/animated/SpringAnimation;->currentLoop:I

    .line 102
    .line 103
    :cond_4
    return-void

    .line 104
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    const-string p2, "Animated value should not be null"

    .line 107
    .line 108
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1
.end method
