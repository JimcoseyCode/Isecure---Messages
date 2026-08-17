.class public Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private nextSensorId:I

.field private final reactContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;"
        }
    .end annotation
.end field

.field private final sensors:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/swmansion/reanimated/sensor/ReanimatedSensor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->nextSensorId:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->sensors:Ljava/util/HashMap;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->reactContext:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public registerSensor(Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;ILcom/swmansion/reanimated/nativeProxy/SensorSetter;)I
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->reactContext:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;-><init>(Ljava/lang/ref/WeakReference;Lcom/swmansion/reanimated/sensor/ReanimatedSensorType;ILcom/swmansion/reanimated/nativeProxy/SensorSetter;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->initialize()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->nextSensorId:I

    .line 15
    .line 16
    add-int/lit8 p2, p1, 0x1

    .line 17
    .line 18
    iput p2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->nextSensorId:I

    .line 19
    .line 20
    iget-object p2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->sensors:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p2, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return p1

    .line 30
    :cond_0
    const/4 p1, -0x1

    .line 31
    return p1
.end method

.method public unregisterSensor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->sensors:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/swmansion/reanimated/sensor/ReanimatedSensor;->cancel()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorContainer;->sensors:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
