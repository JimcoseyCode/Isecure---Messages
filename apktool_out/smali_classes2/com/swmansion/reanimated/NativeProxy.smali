.class public Lcom/swmansion/reanimated/NativeProxy;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final CMD_BACKGROUND_COLOR:I = 0xf

.field private static final CMD_BORDER_BOTTOM_COLOR:I = 0x2a

.field private static final CMD_BORDER_BOTTOM_END_RADIUS:I = 0x1c

.field private static final CMD_BORDER_BOTTOM_LEFT_RADIUS:I = 0x19

.field private static final CMD_BORDER_BOTTOM_RIGHT_RADIUS:I = 0x1a

.field private static final CMD_BORDER_BOTTOM_START_RADIUS:I = 0x1b

.field private static final CMD_BORDER_COLOR:I = 0x28

.field private static final CMD_BORDER_END_COLOR:I = 0x2e

.field private static final CMD_BORDER_END_END_RADIUS:I = 0x20

.field private static final CMD_BORDER_END_START_RADIUS:I = 0x1f

.field private static final CMD_BORDER_LEFT_COLOR:I = 0x2b

.field private static final CMD_BORDER_RADIUS:I = 0x14

.field private static final CMD_BORDER_RIGHT_COLOR:I = 0x2c

.field private static final CMD_BORDER_START_COLOR:I = 0x2d

.field private static final CMD_BORDER_START_END_RADIUS:I = 0x1e

.field private static final CMD_BORDER_START_START_RADIUS:I = 0x1d

.field private static final CMD_BORDER_TOP_COLOR:I = 0x29

.field private static final CMD_BORDER_TOP_END_RADIUS:I = 0x18

.field private static final CMD_BORDER_TOP_LEFT_RADIUS:I = 0x15

.field private static final CMD_BORDER_TOP_RIGHT_RADIUS:I = 0x16

.field private static final CMD_BORDER_TOP_START_RADIUS:I = 0x17

.field private static final CMD_COLOR:I = 0x10

.field private static final CMD_ELEVATION:I = 0xb

.field private static final CMD_END_OF_TRANSFORM:I = 0x3

.field private static final CMD_END_OF_VIEW:I = 0x4

.field private static final CMD_OPACITY:I = 0xa

.field private static final CMD_SHADOW_OPACITY:I = 0xd

.field private static final CMD_SHADOW_RADIUS:I = 0xe

.field private static final CMD_START_OF_TRANSFORM:I = 0x2

.field private static final CMD_START_OF_VIEW:I = 0x1

.field private static final CMD_TINT_COLOR:I = 0x11

.field private static final CMD_TRANSFORM_MATRIX:I = 0x6f

.field private static final CMD_TRANSFORM_PERSPECTIVE:I = 0x70

.field private static final CMD_TRANSFORM_ROTATE:I = 0x69

.field private static final CMD_TRANSFORM_ROTATE_X:I = 0x6a

.field private static final CMD_TRANSFORM_ROTATE_Y:I = 0x6b

.field private static final CMD_TRANSFORM_ROTATE_Z:I = 0x6c

.field private static final CMD_TRANSFORM_SCALE:I = 0x66

.field private static final CMD_TRANSFORM_SCALE_X:I = 0x67

.field private static final CMD_TRANSFORM_SCALE_Y:I = 0x68

.field private static final CMD_TRANSFORM_SKEW_X:I = 0x6d

.field private static final CMD_TRANSFORM_SKEW_Y:I = 0x6e

.field private static final CMD_TRANSFORM_TRANSLATE_X:I = 0x64

.field private static final CMD_TRANSFORM_TRANSLATE_Y:I = 0x65

.field private static final CMD_UNIT_DEG:I = 0xc8

.field private static final CMD_UNIT_PERCENT:I = 0xcb

.field private static final CMD_UNIT_PX:I = 0xca

.field private static final CMD_UNIT_RAD:I = 0xc9

.field private static final CMD_Z_INDEX:I = 0xc


# instance fields
.field private final ANIMATIONS_DRAG_FACTOR:I

.field protected cppVersion:Ljava/lang/String;

.field private firstUptime:Ljava/lang/Long;

.field private final gestureHandlerStateManager:LH6/a;

.field private final keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

.field protected final mContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;"
        }
    .end annotation
.end field

.field protected final mFabricUIManager:Lcom/facebook/react/fabric/FabricUIManager;

.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Lq3/a;
    .end annotation
.end field

.field private final mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected mNodesManager:Lcom/swmansion/reanimated/NodesManager;

.field protected final mWorkletsModule:Lcom/swmansion/worklets/WorkletsModule;

.field private final reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

.field private slowAnimationsEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "reanimated"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/swmansion/worklets/WorkletsModule;Lcom/swmansion/reanimated/NodesManager;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->firstUptime:Ljava/lang/Long;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/swmansion/reanimated/NativeProxy;->slowAnimationsEnabled:Z

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    iput v1, p0, Lcom/swmansion/reanimated/NativeProxy;->ANIMATIONS_DRAG_FACTOR:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lcom/swmansion/reanimated/NativeProxy;->cppVersion:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lcom/swmansion/reanimated/NativeProxy;->mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->assertOnJSQueueThread()V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lcom/swmansion/reanimated/NativeProxy;->mWorkletsModule:Lcom/swmansion/worklets/WorkletsModule;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mContext:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    new-instance v2, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 44
    .line 45
    invoke-direct {v2, v0}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lcom/swmansion/reanimated/NativeProxy;->reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 49
    .line 50
    new-instance v2, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 51
    .line 52
    invoke-direct {v2, v0}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;-><init>(Ljava/lang/ref/WeakReference;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Lcom/swmansion/reanimated/NativeProxy;->keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 56
    .line 57
    invoke-direct {p0}, Lcom/swmansion/reanimated/NativeProxy;->addDevMenuOption()V

    .line 58
    .line 59
    .line 60
    :try_start_0
    const-class v0, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;

    .line 61
    .line 62
    sget-object v2, Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;->Companion:Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$a;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, LH6/a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    move-object v1, v0

    .line 71
    :catch_0
    iput-object v1, p0, Lcom/swmansion/reanimated/NativeProxy;->gestureHandlerStateManager:LH6/a;

    .line 72
    .line 73
    iput-object p3, p0, Lcom/swmansion/reanimated/NativeProxy;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 74
    .line 75
    const/4 p3, 0x2

    .line 76
    invoke-static {p1, p3}, Lcom/facebook/react/uimanager/UIManagerHelper;->getUIManager(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    move-object v5, p3

    .line 81
    check-cast v5, Lcom/facebook/react/fabric/FabricUIManager;

    .line 82
    .line 83
    iput-object v5, p0, Lcom/swmansion/reanimated/NativeProxy;->mFabricUIManager:Lcom/facebook/react/fabric/FabricUIManager;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/swmansion/worklets/JSCallInvokerResolver;->getJSCallInvokerHolder(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->get()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    move-object v0, p0

    .line 101
    move-object v1, p2

    .line 102
    invoke-direct/range {v0 .. v5}, Lcom/swmansion/reanimated/NativeProxy;->initHybrid(Lcom/swmansion/worklets/WorkletsModule;JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/jni/HybridData;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, v0, Lcom/swmansion/reanimated/NativeProxy;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 107
    .line 108
    return-void
.end method

.method public static synthetic a(Lcom/swmansion/reanimated/NativeProxy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/reanimated/NativeProxy;->toggleSlowAnimations()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private addDevMenuOption()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mContext:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    new-instance v1, Lcom/swmansion/reanimated/a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/swmansion/reanimated/a;-><init>(Lcom/swmansion/reanimated/NativeProxy;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/swmansion/reanimated/DevMenuUtils;->addDevMenuOption(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static commandToString(I)Ljava/lang/String;
    .locals 3

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    packed-switch p0, :pswitch_data_1

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_2

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Unknown command: "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :pswitch_0
    const-string p0, "borderEndColor"

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    const-string p0, "borderStartColor"

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_2
    const-string p0, "borderRightColor"

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_3
    const-string p0, "borderLeftColor"

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_4
    const-string p0, "borderBottomColor"

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_5
    const-string p0, "borderTopColor"

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_6
    const-string p0, "borderColor"

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_7
    const-string p0, "borderEndEndRadius"

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_8
    const-string p0, "borderEndStartRadius"

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_9
    const-string p0, "borderStartEndRadius"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_a
    const-string p0, "borderStartStartRadius"

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_b
    const-string p0, "borderBottomEndRadius"

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_c
    const-string p0, "borderBottomStartRadius"

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_d
    const-string p0, "borderBottomRightRadius"

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_e
    const-string p0, "borderBottomLeftRadius"

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_f
    const-string p0, "borderTopEndRadius"

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_10
    const-string p0, "borderTopStartRadius"

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_11
    const-string p0, "borderTopRightRadius"

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_12
    const-string p0, "borderTopLeftRadius"

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_13
    const-string p0, "borderRadius"

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_14
    const-string p0, "tintColor"

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_15
    const-string p0, "color"

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_16
    const-string p0, "backgroundColor"

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_17
    const-string p0, "shadowRadius"

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_18
    const-string p0, "shadowOpacity"

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_19
    const-string p0, "zIndex"

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_1a
    const-string p0, "elevation"

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_1b
    const-string p0, "opacity"

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :pswitch_data_1
    .packed-switch 0x14
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
    .end packed-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :pswitch_data_2
    .packed-switch 0x28
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private native initHybrid(Lcom/swmansion/worklets/WorkletsModule;JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/jni/HybridData;
.end method

.method private native invalidateCpp()V
.end method

.method private toggleSlowAnimations()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/reanimated/NativeProxy;->slowAnimationsEnabled:Z

    .line 2
    .line 3
    xor-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput-boolean v1, p0, Lcom/swmansion/reanimated/NativeProxy;->slowAnimationsEnabled:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->firstUptime:Ljava/lang/Long;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 20
    .line 21
    iget-boolean v1, p0, Lcom/swmansion/reanimated/NativeProxy;->slowAnimationsEnabled:Z

    .line 22
    .line 23
    const/16 v2, 0xa

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/swmansion/reanimated/NodesManager;->enableSlowAnimations(ZI)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mWorkletsModule:Lcom/swmansion/worklets/WorkletsModule;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/swmansion/worklets/WorkletsModule;->toggleSlowAnimations()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private static transformCommandToString(I)Ljava/lang/String;
    .locals 3

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "Unknown transform command: "

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :pswitch_0
    const-string p0, "perspective"

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    const-string p0, "matrix"

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_2
    const-string p0, "skewY"

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_3
    const-string p0, "skewX"

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_4
    const-string p0, "rotateZ"

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_5
    const-string p0, "rotateY"

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_6
    const-string p0, "rotateX"

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_7
    const-string p0, "rotate"

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_8
    const-string p0, "scaleY"

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_9
    const-string p0, "scaleX"

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_a
    const-string p0, "scale"

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_b
    const-string p0, "translateY"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_c
    const-string p0, "translateX"

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x64
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
    .end packed-switch
.end method


# virtual methods
.method protected checkCppVersion()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->cppVersion:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/swmansion/reanimated/NativeProxy;->getReanimatedJavaVersion()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/swmansion/reanimated/NativeProxy;->cppVersion:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v3, "[Reanimated] Mismatch between Java code version and C++ code version ("

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " vs. "

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->cppVersion:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information."

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 57
    .line 58
    const-string v1, "[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information."

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public getAnimationTimestamp()J
    .locals 6
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/reanimated/NativeProxy;->slowAnimationsEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->firstUptime:Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-object v4, p0, Lcom/swmansion/reanimated/NativeProxy;->firstUptime:Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    sub-long/2addr v2, v4

    .line 22
    const-wide/16 v4, 0xa

    .line 23
    .line 24
    div-long/2addr v2, v4

    .line 25
    add-long/2addr v0, v2

    .line 26
    return-wide v0

    .line 27
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    return-wide v0
.end method

.method protected getHybridData()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIsReducedMotion()Z
    .locals 2
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mContext:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "transition_animation_scale"

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 27
    .line 28
    :goto_0
    const/4 v1, 0x0

    .line 29
    cmpl-float v0, v0, v1

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    return v0
.end method

.method public getReanimatedJavaVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    const-string v0, "4.2.1"

    .line 2
    .line 3
    return-object v0
.end method

.method protected native installJSIBindings()V
.end method

.method protected invalidate()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mInvalidated:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/swmansion/reanimated/NativeProxy;->invalidateCpp()V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public native isAnyHandlerWaitingForEvent(Ljava/lang/String;I)Z
.end method

.method maybeFlushUIUpdatesQueue()V
    .locals 2
    .annotation build Lq3/a;
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/swmansion/reanimated/NodesManager;->isAnimationRunning()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lcom/swmansion/reanimated/NodesManager;->performOperations(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public native performOperations(Z)V
.end method

.method public preserveMountedTags([I)Z
    .locals 3
    .annotation build Lq3/a;
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->isOnUiThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :goto_0
    array-length v0, p1

    .line 10
    if-ge v1, v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mFabricUIManager:Lcom/facebook/react/fabric/FabricUIManager;

    .line 13
    .line 14
    aget v2, p1, v1

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/facebook/react/fabric/FabricUIManager;->resolveView(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    aput v0, p1, v1

    .line 24
    .line 25
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public registerEventHandler(Lcom/swmansion/reanimated/nativeProxy/EventHandler;)V
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/reanimated/NodesManager;->getEventNameResolver()Lcom/facebook/react/uimanager/UIManagerModule$CustomEventNamesResolver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p1, Lcom/swmansion/reanimated/nativeProxy/EventHandler;->mCustomEventNamesResolver:Lcom/facebook/react/uimanager/UIManagerModule$CustomEventNamesResolver;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/NodesManager;->registerEventHandler(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public registerSensor(IILcom/swmansion/reanimated/nativeProxy/SensorSetter;)I
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;->getInstanceById(I)Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->registerSensor(Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;ILcom/swmansion/reanimated/nativeProxy/SensorSetter;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public requestRender(Lcom/swmansion/reanimated/nativeProxy/AnimationFrameCallback;)V
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/NodesManager;->postOnAnimation(Lcom/swmansion/reanimated/NodesManager$OnAnimationFrame;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method protected setCppVersion(Ljava/lang/String;)V
    .locals 0
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/swmansion/reanimated/NativeProxy;->cppVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setGestureState(II)V
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->gestureHandlerStateManager:LH6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, LH6/a;->setGestureHandlerState(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public subscribeForKeyboardEvents(Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;ZZ)I
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->subscribeForKeyboardUpdates(Lcom/swmansion/reanimated/keyboard/KeyboardWorkletWrapper;ZZ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public synchronouslyUpdateUIProps([I[D)V
    .locals 17
    .annotation build Lq3/a;
    .end annotation

    .line 1
    invoke-static/range {p1 .. p1}, Ljava/util/Arrays;->stream([I)Ljava/util/stream/IntStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/stream/IntStream;->iterator()Ljava/util/PrimitiveIterator$OfInt;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static/range {p2 .. p2}, Ljava/util/Arrays;->stream([D)Ljava/util/stream/DoubleStream;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/stream/DoubleStream;->iterator()Ljava/util/PrimitiveIterator$OfDouble;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 18
    .line 19
    invoke-direct {v2}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v3, -0x1

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_b

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eq v4, v5, :cond_a

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    const-string v6, "%"

    .line 38
    .line 39
    const/16 v7, 0xcb

    .line 40
    .line 41
    const/16 v8, 0xca

    .line 42
    .line 43
    const-string v9, "Unknown unit command"

    .line 44
    .line 45
    if-eq v4, v5, :cond_3

    .line 46
    .line 47
    const/4 v5, 0x4

    .line 48
    if-eq v4, v5, :cond_2

    .line 49
    .line 50
    packed-switch v4, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    packed-switch v4, :pswitch_data_1

    .line 54
    .line 55
    .line 56
    packed-switch v4, :pswitch_data_2

    .line 57
    .line 58
    .line 59
    new-instance v0, Ljava/lang/RuntimeException;

    .line 60
    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v2, "Unexcepted command: "

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :pswitch_0
    invoke-static {v4}, Lcom/swmansion/reanimated/NativeProxy;->commandToString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v1}, Ljava/util/PrimitiveIterator$OfDouble;->nextDouble()D

    .line 87
    .line 88
    .line 89
    move-result-wide v10

    .line 90
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eq v5, v8, :cond_1

    .line 95
    .line 96
    if-ne v5, v7, :cond_0

    .line 97
    .line 98
    new-instance v5, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v2, v4, v5}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    move-object/from16 v4, p0

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 120
    .line 121
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :cond_1
    invoke-virtual {v2, v4, v10, v11}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :pswitch_1
    invoke-static {v4}, Lcom/swmansion/reanimated/NativeProxy;->commandToString(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-virtual {v2, v4, v5}, Lcom/facebook/react/bridge/JavaOnlyMap;->putInt(Ljava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :pswitch_2
    invoke-static {v4}, Lcom/swmansion/reanimated/NativeProxy;->commandToString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-interface {v1}, Ljava/util/PrimitiveIterator$OfDouble;->nextDouble()D

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    invoke-virtual {v2, v4, v5, v6}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    move-object/from16 v4, p0

    .line 154
    .line 155
    iget-object v5, v4, Lcom/swmansion/reanimated/NativeProxy;->mFabricUIManager:Lcom/facebook/react/fabric/FabricUIManager;

    .line 156
    .line 157
    invoke-virtual {v5, v3, v2}, Lcom/facebook/react/fabric/FabricUIManager;->synchronouslyUpdateViewOnUIThread(ILcom/facebook/react/bridge/ReadableMap;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_3
    move-object/from16 v4, p0

    .line 163
    .line 164
    new-instance v5, Lcom/facebook/react/bridge/JavaOnlyArray;

    .line 165
    .line 166
    invoke-direct {v5}, Lcom/facebook/react/bridge/JavaOnlyArray;-><init>()V

    .line 167
    .line 168
    .line 169
    :goto_2
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    const/4 v11, 0x3

    .line 174
    if-ne v10, v11, :cond_4

    .line 175
    .line 176
    const-string v6, "transform"

    .line 177
    .line 178
    invoke-virtual {v2, v6, v5}, Lcom/facebook/react/bridge/JavaOnlyMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_4
    invoke-static {v10}, Lcom/swmansion/reanimated/NativeProxy;->transformCommandToString(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    packed-switch v10, :pswitch_data_3

    .line 188
    .line 189
    .line 190
    new-instance v0, Ljava/lang/RuntimeException;

    .line 191
    .line 192
    new-instance v1, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v2, "Unknown transform type: "

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :pswitch_3
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    new-instance v12, Lcom/facebook/react/bridge/JavaOnlyArray;

    .line 218
    .line 219
    invoke-direct {v12}, Lcom/facebook/react/bridge/JavaOnlyArray;-><init>()V

    .line 220
    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    :goto_3
    if-ge v13, v10, :cond_5

    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/PrimitiveIterator$OfDouble;->nextDouble()D

    .line 226
    .line 227
    .line 228
    move-result-wide v14

    .line 229
    invoke-virtual {v12, v14, v15}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushDouble(D)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v13, v13, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_5
    filled-new-array {v11, v12}, [Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    invoke-static {v10}, Lcom/facebook/react/bridge/JavaOnlyMap;->of([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    invoke-virtual {v5, v10}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :pswitch_4
    invoke-interface {v1}, Ljava/util/PrimitiveIterator$OfDouble;->nextDouble()D

    .line 248
    .line 249
    .line 250
    move-result-wide v12

    .line 251
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    const/16 v14, 0xc8

    .line 256
    .line 257
    if-eq v10, v14, :cond_7

    .line 258
    .line 259
    const/16 v14, 0xc9

    .line 260
    .line 261
    if-ne v10, v14, :cond_6

    .line 262
    .line 263
    const-string v10, "rad"

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 267
    .line 268
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :cond_7
    const-string v10, "deg"

    .line 273
    .line 274
    :goto_4
    new-instance v14, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    filled-new-array {v11, v10}, [Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    invoke-static {v10}, Lcom/facebook/react/bridge/JavaOnlyMap;->of([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    invoke-virtual {v5, v10}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_2

    .line 301
    .line 302
    :pswitch_5
    invoke-interface {v1}, Ljava/util/PrimitiveIterator$OfDouble;->nextDouble()D

    .line 303
    .line 304
    .line 305
    move-result-wide v12

    .line 306
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    filled-new-array {v11, v10}, [Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    invoke-static {v10}, Lcom/facebook/react/bridge/JavaOnlyMap;->of([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    invoke-virtual {v5, v10}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_2

    .line 322
    .line 323
    :pswitch_6
    invoke-interface {v1}, Ljava/util/PrimitiveIterator$OfDouble;->nextDouble()D

    .line 324
    .line 325
    .line 326
    move-result-wide v12

    .line 327
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    if-eq v10, v8, :cond_9

    .line 332
    .line 333
    if-ne v10, v7, :cond_8

    .line 334
    .line 335
    new-instance v10, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v10, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    filled-new-array {v11, v10}, [Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    invoke-static {v10}, Lcom/facebook/react/bridge/JavaOnlyMap;->of([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 355
    .line 356
    .line 357
    move-result-object v10

    .line 358
    invoke-virtual {v5, v10}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_2

    .line 362
    .line 363
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    .line 364
    .line 365
    invoke-direct {v0, v9}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw v0

    .line 369
    :cond_9
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    filled-new-array {v11, v10}, [Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    invoke-static {v10}, Lcom/facebook/react/bridge/JavaOnlyMap;->of([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    invoke-virtual {v5, v10}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_2

    .line 385
    .line 386
    :cond_a
    move-object/from16 v4, p0

    .line 387
    .line 388
    invoke-interface {v0}, Ljava/util/PrimitiveIterator$OfInt;->nextInt()I

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    new-instance v3, Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 393
    .line 394
    invoke-direct {v3}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    .line 395
    .line 396
    .line 397
    move-object/from16 v16, v3

    .line 398
    .line 399
    move v3, v2

    .line 400
    move-object/from16 v2, v16

    .line 401
    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :cond_b
    move-object/from16 v4, p0

    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    :pswitch_data_1
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    :pswitch_data_2
    .packed-switch 0x28
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    :pswitch_data_3
    .packed-switch 0x64
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method

.method public unregisterSensor(I)V
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->reanimatedSensorContainer:Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->unregisterSensor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public unsubscribeFromKeyboardEvents(I)V
    .locals 1
    .annotation build Lq3/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NativeProxy;->keyboardAnimationManager:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->unsubscribeFromKeyboardUpdates(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
