.class public Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field private final display:Landroid/view/Display;

.field private final interval:D

.field private lastRead:D

.field private orientation:[F

.field private quaternion:[F

.field private rotation:[F

.field private setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/nativeProxy/SensorSetter;DLandroid/view/Display;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    long-to-double v0, v0

    .line 9
    iput-wide v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 10
    .line 11
    const/16 v0, 0x9

    .line 12
    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    new-array v0, v0, [F

    .line 19
    .line 20
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    new-array v0, v0, [F

    .line 24
    .line 25
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 26
    .line 27
    iput-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 28
    .line 29
    iput-wide p2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->interval:D

    .line 30
    .line 31
    iput-object p4, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->display:Landroid/view/Display;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 13

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-double v0, v0

    .line 6
    iget-wide v2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 7
    .line 8
    sub-double v2, v0, v2

    .line 9
    .line 10
    iget-wide v4, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->interval:D

    .line 11
    .line 12
    cmpg-double v2, v2, v4

    .line 13
    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v2, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/hardware/Sensor;->getType()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iput-wide v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 24
    .line 25
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->display:Landroid/view/Display;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x3

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x2

    .line 35
    if-eq v0, v4, :cond_3

    .line 36
    .line 37
    if-eq v0, v5, :cond_2

    .line 38
    .line 39
    if-eq v0, v1, :cond_1

    .line 40
    .line 41
    move v0, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v0, 0x10e

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/16 v0, 0xb4

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const/16 v0, 0x5a

    .line 50
    .line 51
    :goto_0
    if-eq v2, v5, :cond_4

    .line 52
    .line 53
    const/4 v6, 0x4

    .line 54
    if-eq v2, v6, :cond_4

    .line 55
    .line 56
    packed-switch v2, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string v0, "[Reanimated] Unknown sensor type."

    .line 62
    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :pswitch_0
    iget-object v2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 68
    .line 69
    iget-object v7, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 70
    .line 71
    invoke-static {v2, v7}, Landroid/hardware/SensorManager;->getQuaternionFromVector([F[F)V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 75
    .line 76
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 77
    .line 78
    invoke-static {v2, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 82
    .line 83
    iget-object v2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 84
    .line 85
    invoke-static {p1, v2}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 89
    .line 90
    aget v2, p1, v4

    .line 91
    .line 92
    aget v7, p1, v1

    .line 93
    .line 94
    aget v8, p1, v5

    .line 95
    .line 96
    neg-float v8, v8

    .line 97
    aget p1, p1, v3

    .line 98
    .line 99
    iget-object v9, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 100
    .line 101
    aget v10, v9, v3

    .line 102
    .line 103
    neg-float v10, v10

    .line 104
    aget v11, v9, v4

    .line 105
    .line 106
    neg-float v11, v11

    .line 107
    aget v9, v9, v5

    .line 108
    .line 109
    const/4 v12, 0x7

    .line 110
    new-array v12, v12, [F

    .line 111
    .line 112
    aput v2, v12, v3

    .line 113
    .line 114
    aput v7, v12, v4

    .line 115
    .line 116
    aput v8, v12, v5

    .line 117
    .line 118
    aput p1, v12, v1

    .line 119
    .line 120
    aput v10, v12, v6

    .line 121
    .line 122
    const/4 p1, 0x5

    .line 123
    aput v11, v12, p1

    .line 124
    .line 125
    const/4 p1, 0x6

    .line 126
    aput v9, v12, p1

    .line 127
    .line 128
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 129
    .line 130
    invoke-virtual {p1, v12, v0}, Lcom/swmansion/reanimated/nativeProxy/SensorSetter;->sensorSetter([FI)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_1
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 135
    .line 136
    aget v2, p1, v3

    .line 137
    .line 138
    neg-float v2, v2

    .line 139
    aget v6, p1, v4

    .line 140
    .line 141
    neg-float v6, v6

    .line 142
    aget p1, p1, v5

    .line 143
    .line 144
    neg-float p1, p1

    .line 145
    new-array v1, v1, [F

    .line 146
    .line 147
    aput v2, v1, v3

    .line 148
    .line 149
    aput v6, v1, v4

    .line 150
    .line 151
    aput p1, v1, v5

    .line 152
    .line 153
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 154
    .line 155
    invoke-virtual {p1, v1, v0}, Lcom/swmansion/reanimated/nativeProxy/SensorSetter;->sensorSetter([FI)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_4
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 160
    .line 161
    aget v2, p1, v3

    .line 162
    .line 163
    aget v6, p1, v4

    .line 164
    .line 165
    aget p1, p1, v5

    .line 166
    .line 167
    new-array v1, v1, [F

    .line 168
    .line 169
    aput v2, v1, v3

    .line 170
    .line 171
    aput v6, v1, v4

    .line 172
    .line 173
    aput p1, v1, v5

    .line 174
    .line 175
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 176
    .line 177
    invoke-virtual {p1, v1, v0}, Lcom/swmansion/reanimated/nativeProxy/SensorSetter;->sensorSetter([FI)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
