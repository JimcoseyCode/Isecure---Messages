.class public final Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;
.super Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->queueAndExecuteBatchedOperations(Lcom/facebook/react/bridge/ReadableArray;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00060\u0001R\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "com/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1",
        "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;",
        "Lcom/facebook/react/animated/NativeAnimatedModule;",
        "Lcom/facebook/react/animated/NativeAnimatedNodesManager;",
        "animatedNodesManager",
        "Li7/B;",
        "execute",
        "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V",
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
.field final synthetic $opBufferSize:I

.field final synthetic $opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opBufferSize:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/animated/NativeAnimatedModule;IDD)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->execute$lambda$1(Lcom/facebook/react/animated/NativeAnimatedModule;IDD)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final execute$lambda$1(Lcom/facebook/react/animated/NativeAnimatedModule;IDD)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "tag"

    .line 11
    .line 12
    invoke-virtual {v1, v2, p1}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    const-string p1, "value"

    .line 16
    .line 17
    invoke-virtual {v1, p1, p2, p3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 18
    .line 19
    .line 20
    const-string p1, "offset"

    .line 21
    .line 22
    invoke-virtual {v1, p1, p4, p5}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$getReactApplicationContextIfActiveOrWarn(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const-string p1, "onAnimatedValueUpdate"

    .line 32
    .line 33
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V
    .locals 7

    .line 1
    const-string v0, "animatedNodesManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$getReactApplicationContextIfActiveOrWarn(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    iget v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opBufferSize:I

    .line 13
    .line 14
    if-ge v0, v1, :cond_6

    .line 15
    .line 16
    sget-object v1, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;->Companion:Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes$Companion;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x1

    .line 21
    .line 22
    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes$Companion;->fromId(I)Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    aget v1, v2, v1

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const-string v4, "Required value was null."

    .line 40
    .line 41
    packed-switch v1, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    new-instance p1, Li7/m;

    .line 45
    .line 46
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :pswitch_0
    add-int/lit8 v0, v0, 0x2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_1
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 54
    .line 55
    add-int/lit8 v2, v0, 0x2

    .line 56
    .line 57
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 62
    .line 63
    invoke-static {v3, v1}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$decrementInFlightAnimationsForViewTag(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 67
    .line 68
    add-int/lit8 v5, v0, 0x3

    .line 69
    .line 70
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_0

    .line 75
    .line 76
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x4

    .line 79
    .line 80
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->removeAnimatedEventFromView(ILjava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :pswitch_2
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 95
    .line 96
    add-int/lit8 v2, v0, 0x2

    .line 97
    .line 98
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 103
    .line 104
    add-int/lit8 v5, v0, 0x3

    .line 105
    .line 106
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-eqz v2, :cond_2

    .line 111
    .line 112
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 113
    .line 114
    add-int/lit8 v0, v0, 0x4

    .line 115
    .line 116
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-eqz v3, :cond_1

    .line 121
    .line 122
    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->addAnimatedEventToView(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 133
    .line 134
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :pswitch_3
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 139
    .line 140
    add-int/lit8 v0, v0, 0x2

    .line 141
    .line 142
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->dropAnimatedNode(I)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :pswitch_4
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 152
    .line 153
    add-int/lit8 v0, v0, 0x2

    .line 154
    .line 155
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->restoreDefaultValues(I)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :pswitch_5
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 165
    .line 166
    add-int/lit8 v2, v0, 0x2

    .line 167
    .line 168
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 173
    .line 174
    add-int/lit8 v0, v0, 0x3

    .line 175
    .line 176
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 181
    .line 182
    invoke-static {v3, v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$decrementInFlightAnimationsForViewTag(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->disconnectAnimatedNodeFromView(II)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :pswitch_6
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 191
    .line 192
    add-int/lit8 v2, v0, 0x2

    .line 193
    .line 194
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 199
    .line 200
    add-int/lit8 v0, v0, 0x3

    .line 201
    .line 202
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->connectAnimatedNodeToView(II)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :pswitch_7
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 212
    .line 213
    add-int/lit8 v0, v0, 0x2

    .line 214
    .line 215
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->extractAnimatedNodeOffset(I)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :pswitch_8
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 225
    .line 226
    add-int/lit8 v0, v0, 0x2

    .line 227
    .line 228
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->flattenAnimatedNodeOffset(I)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :pswitch_9
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 238
    .line 239
    add-int/lit8 v2, v0, 0x2

    .line 240
    .line 241
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 246
    .line 247
    add-int/lit8 v0, v0, 0x3

    .line 248
    .line 249
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 250
    .line 251
    .line 252
    move-result-wide v2

    .line 253
    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->setAnimatedNodeOffset(ID)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :pswitch_a
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 259
    .line 260
    add-int/lit8 v2, v0, 0x2

    .line 261
    .line 262
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 267
    .line 268
    add-int/lit8 v0, v0, 0x3

    .line 269
    .line 270
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 271
    .line 272
    .line 273
    move-result-wide v2

    .line 274
    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->setAnimatedNodeValue(ID)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :pswitch_b
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 280
    .line 281
    add-int/lit8 v0, v0, 0x2

    .line 282
    .line 283
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->stopAnimation(I)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :pswitch_c
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 293
    .line 294
    add-int/lit8 v5, v0, 0x2

    .line 295
    .line 296
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 301
    .line 302
    add-int/lit8 v6, v0, 0x3

    .line 303
    .line 304
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    iget-object v5, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 309
    .line 310
    add-int/lit8 v0, v0, 0x4

    .line 311
    .line 312
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    if-eqz v5, :cond_3

    .line 317
    .line 318
    invoke-virtual {p1, v1, v3, v5, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->startAnimatingNode(IILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 324
    .line 325
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw p1

    .line 329
    :pswitch_d
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 330
    .line 331
    add-int/lit8 v2, v0, 0x2

    .line 332
    .line 333
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 338
    .line 339
    add-int/lit8 v0, v0, 0x3

    .line 340
    .line 341
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->disconnectAnimatedNodes(II)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :pswitch_e
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 351
    .line 352
    add-int/lit8 v2, v0, 0x2

    .line 353
    .line 354
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 359
    .line 360
    add-int/lit8 v0, v0, 0x3

    .line 361
    .line 362
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->connectAnimatedNodes(II)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :pswitch_f
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 372
    .line 373
    add-int/lit8 v0, v0, 0x2

    .line 374
    .line 375
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    invoke-virtual {p1, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->stopListeningToAnimatedNodeValue(I)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_0

    .line 383
    .line 384
    :pswitch_10
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 385
    .line 386
    add-int/lit8 v0, v0, 0x2

    .line 387
    .line 388
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 393
    .line 394
    new-instance v3, Lcom/facebook/react/animated/e;

    .line 395
    .line 396
    invoke-direct {v3, v2, v1}, Lcom/facebook/react/animated/e;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1, v1, v3}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->startListeningToAnimatedNodeValue(ILcom/facebook/react/animated/AnimatedNodeValueListener;)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :pswitch_11
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 405
    .line 406
    add-int/lit8 v0, v0, 0x2

    .line 407
    .line 408
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->getValue(ILcom/facebook/react/bridge/Callback;)V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_0

    .line 416
    .line 417
    :pswitch_12
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 418
    .line 419
    add-int/lit8 v2, v0, 0x2

    .line 420
    .line 421
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 426
    .line 427
    add-int/lit8 v0, v0, 0x3

    .line 428
    .line 429
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    if-eqz v2, :cond_4

    .line 434
    .line 435
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->updateAnimatedNodeConfig(ILcom/facebook/react/bridge/ReadableMap;)V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 441
    .line 442
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw p1

    .line 446
    :pswitch_13
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 447
    .line 448
    add-int/lit8 v2, v0, 0x2

    .line 449
    .line 450
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    iget-object v3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1;->$opsAndArgs:Lcom/facebook/react/bridge/ReadableArray;

    .line 455
    .line 456
    add-int/lit8 v0, v0, 0x3

    .line 457
    .line 458
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    if-eqz v2, :cond_5

    .line 463
    .line 464
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->createAnimatedNode(ILcom/facebook/react/bridge/ReadableMap;)V

    .line 465
    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 470
    .line 471
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw p1

    .line 475
    :cond_6
    return-void

    .line 476
    nop

    .line 477
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
