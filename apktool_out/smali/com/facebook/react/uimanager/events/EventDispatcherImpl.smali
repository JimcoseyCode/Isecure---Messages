.class public final Lcom/facebook/react/uimanager/events/EventDispatcherImpl;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/events/EventDispatcher;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;,
        Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;,
        Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003STRB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00072\n\u0010\u0016\u001a\u0006\u0012\u0002\u0008\u00030\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\tJ\u001b\u0010\u001a\u001a\u00020\u00072\n\u0010\u0016\u001a\u0006\u0012\u0002\u0008\u00030\u0015H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008$\u0010#J\u000f\u0010%\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008%\u0010\tJ\u000f\u0010&\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008&\u0010\tJ\u000f\u0010\'\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\'\u0010\tJ\u000f\u0010(\u001a\u00020\u0007H\u0017\u00a2\u0006\u0004\u0008(\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010,R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000c0.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0018\u00105\u001a\u000604R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R,\u00109\u001a\u001a\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u001507j\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0015`88\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u001c0;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020!0;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010=R\u0018\u0010@\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\"\u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00150E8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0016\u0010H\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0016\u0010M\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008P\u0010Q\u00a8\u0006U"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/events/EventDispatcherImpl;",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "Lcom/facebook/react/bridge/LifecycleEventListener;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "Li7/B;",
        "maybePostFrameCallbackFromNonUI",
        "()V",
        "stopFrameCallback",
        "moveStagedEventsToDispatchQueue",
        "",
        "viewTag",
        "",
        "eventName",
        "",
        "coalescingKey",
        "",
        "getEventCookie",
        "(ILjava/lang/String;S)J",
        "Lcom/facebook/react/uimanager/events/Event;",
        "event",
        "addEventToEventsToDispatch",
        "(Lcom/facebook/react/uimanager/events/Event;)V",
        "clearEventsToDispatch",
        "dispatchEvent",
        "dispatchAllEvents",
        "Lcom/facebook/react/uimanager/events/EventDispatcherListener;",
        "listener",
        "addListener",
        "(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V",
        "removeListener",
        "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;",
        "addBatchEventDispatchedListener",
        "(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V",
        "removeBatchEventDispatchedListener",
        "onHostResume",
        "onHostPause",
        "onHostDestroy",
        "onCatalystInstanceDestroyed",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "",
        "eventsStagingLock",
        "Ljava/lang/Object;",
        "eventsToDispatchLock",
        "Landroid/util/LongSparseArray;",
        "eventCookieToLastEventIdx",
        "Landroid/util/LongSparseArray;",
        "",
        "eventNameToEventId",
        "Ljava/util/Map;",
        "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;",
        "dispatchEventsRunnable",
        "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "eventStaging",
        "Ljava/util/ArrayList;",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "listeners",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "postEventDispatchListeners",
        "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;",
        "currentFrameCallback",
        "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "hasDispatchScheduledCount",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "",
        "eventsToDispatch",
        "[Lcom/facebook/react/uimanager/events/Event;",
        "eventsToDispatchSize",
        "I",
        "Lcom/facebook/react/uimanager/events/EventEmitterImpl;",
        "reactEventEmitter",
        "Lcom/facebook/react/uimanager/events/EventEmitterImpl;",
        "nextEventTypeId",
        "S",
        "",
        "hasDispatchScheduled",
        "Z",
        "Companion",
        "ScheduleDispatchFrameCallback",
        "DispatchEventsRunnable",
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
.field public static final Companion:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;

.field private static final EVENT_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private final currentFrameCallback:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

.field private final dispatchEventsRunnable:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;

.field private final eventCookieToLastEventIdx:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final eventNameToEventId:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation
.end field

.field private final eventStaging:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final eventsStagingLock:Ljava/lang/Object;

.field private eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;"
        }
    .end annotation
.end field

.field private final eventsToDispatchLock:Ljava/lang/Object;

.field private eventsToDispatchSize:I

.field private volatile hasDispatchScheduled:Z

.field private final hasDispatchScheduledCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final listeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/facebook/react/uimanager/events/EventDispatcherListener;",
            ">;"
        }
    .end annotation
.end field

.field private nextEventTypeId:S

.field private final postEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;",
            ">;"
        }
    .end annotation
.end field

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final reactEventEmitter:Lcom/facebook/react/uimanager/events/EventEmitterImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->Companion:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/uimanager/events/b;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->EVENT_COMPARATOR:Ljava/util/Comparator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsStagingLock:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchLock:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v0, Landroid/util/LongSparseArray;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventCookieToLastEventIdx:Landroid/util/LongSparseArray;

    .line 31
    .line 32
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventNameToEventId:Ljava/util/Map;

    .line 38
    .line 39
    new-instance v0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;-><init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->dispatchEventsRunnable:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;

    .line 45
    .line 46
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventStaging:Ljava/util/ArrayList;

    .line 52
    .line 53
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->postEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 66
    .line 67
    new-instance v0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 68
    .line 69
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;-><init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->currentFrameCallback:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->hasDispatchScheduledCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 80
    .line 81
    const/16 v0, 0x10

    .line 82
    .line 83
    new-array v0, v0, [Lcom/facebook/react/uimanager/events/Event;

    .line 84
    .line 85
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 86
    .line 87
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 91
    .line 92
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/EventEmitterImpl;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->reactEventEmitter:Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 96
    .line 97
    return-void
.end method

.method private static final EVENT_COMPARATOR$lambda$5(Lcom/facebook/react/uimanager/events/Event;Lcom/facebook/react/uimanager/events/Event;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, -0x1

    .line 8
    if-nez p0, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    const/4 v2, 0x1

    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    return v2

    .line 15
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getTimestampMs()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/Event;->getTimestampMs()J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    sub-long/2addr v3, p0

    .line 24
    const-wide/16 p0, 0x0

    .line 25
    .line 26
    cmp-long p0, v3, p0

    .line 27
    .line 28
    if-nez p0, :cond_3

    .line 29
    .line 30
    return v0

    .line 31
    :cond_3
    if-gez p0, :cond_4

    .line 32
    .line 33
    return v1

    .line 34
    :cond_4
    return v2
.end method

.method public static synthetic a(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->onCatalystInstanceDestroyed$lambda$2(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$clearEventsToDispatch(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->clearEventsToDispatch()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCurrentFrameCallback$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->currentFrameCallback:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDispatchEventsRunnable$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->dispatchEventsRunnable:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getEVENT_COMPARATOR$cp()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->EVENT_COMPARATOR:Ljava/util/Comparator;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getEventCookieToLastEventIdx$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Landroid/util/LongSparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventCookieToLastEventIdx:Landroid/util/LongSparseArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getEventsToDispatch$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)[Lcom/facebook/react/uimanager/events/Event;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getEventsToDispatchLock$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchLock:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getEventsToDispatchSize$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getHasDispatchScheduled$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->hasDispatchScheduled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getHasDispatchScheduledCount$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->hasDispatchScheduledCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPostEventDispatchListeners$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->postEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getReactContext$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getReactEventEmitter$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/EventEmitterImpl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->reactEventEmitter:Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$moveStagedEventsToDispatchQueue(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->moveStagedEventsToDispatchQueue()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setHasDispatchScheduled$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->hasDispatchScheduled:Z

    .line 2
    .line 3
    return-void
.end method

.method private final addEventToEventsToDispatch(Lcom/facebook/react/uimanager/events/Event;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    array-length v0, v1

    .line 9
    mul-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "copyOf(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v0, [Lcom/facebook/react/uimanager/events/Event;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 25
    .line 26
    iget v1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 27
    .line 28
    add-int/lit8 v2, v1, 0x1

    .line 29
    .line 30
    iput v2, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 31
    .line 32
    aput-object p1, v0, v1

    .line 33
    .line 34
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/uimanager/events/Event;Lcom/facebook/react/uimanager/events/Event;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->EVENT_COMPARATOR$lambda$5(Lcom/facebook/react/uimanager/events/Event;Lcom/facebook/react/uimanager/events/Event;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final clearEventsToDispatch()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 11
    .line 12
    return-void
.end method

.method private final getEventCookie(ILjava/lang/String;S)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventNameToEventId:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Short;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-short v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->nextEventTypeId:S

    .line 17
    .line 18
    add-int/lit8 v1, v0, 0x1

    .line 19
    .line 20
    int-to-short v1, v1

    .line 21
    iput-short v1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->nextEventTypeId:S

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventNameToEventId:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v2, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move p2, v0

    .line 33
    :goto_0
    sget-object v0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->Companion:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;

    .line 34
    .line 35
    invoke-static {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;->access$getEventCookie(Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;ISS)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    return-wide p1
.end method

.method private final maybePostFrameCallbackFromNonUI()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->currentFrameCallback:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;->maybePostFromNonUI()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final moveStagedEventsToDispatchQueue()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsStagingLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchLock:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    iget-object v2, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventStaging:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v2, :cond_6

    .line 15
    .line 16
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventStaging:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-string v5, "get(...)"

    .line 23
    .line 24
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v4, Lcom/facebook/react/uimanager/events/Event;

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->canCoalesce()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    invoke-direct {p0, v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->addEventToEventsToDispatch(Lcom/facebook/react/uimanager/events/Event;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :catchall_0
    move-exception v2

    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->getEventName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/Event;->getCoalescingKey()S

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-direct {p0, v5, v6, v7}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->getEventCookie(ILjava/lang/String;S)J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    iget-object v7, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventCookieToLastEventIdx:Landroid/util/LongSparseArray;

    .line 59
    .line 60
    invoke-virtual {v7, v5, v6}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    check-cast v7, Ljava/lang/Integer;

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    if-nez v7, :cond_1

    .line 68
    .line 69
    iget-object v7, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventCookieToLastEventIdx:Landroid/util/LongSparseArray;

    .line 70
    .line 71
    iget v9, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 72
    .line 73
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v7, v5, v6, v9}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    iget-object v9, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    aget-object v9, v9, v10

    .line 88
    .line 89
    if-eqz v9, :cond_5

    .line 90
    .line 91
    invoke-virtual {v4, v9}, Lcom/facebook/react/uimanager/events/Event;->coalesce(Lcom/facebook/react/uimanager/events/Event;)Lcom/facebook/react/uimanager/events/Event;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    if-eq v10, v9, :cond_2

    .line 96
    .line 97
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventCookieToLastEventIdx:Landroid/util/LongSparseArray;

    .line 98
    .line 99
    iget v11, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatchSize:I

    .line 100
    .line 101
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-virtual {v4, v5, v6, v11}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsToDispatch:[Lcom/facebook/react/uimanager/events/Event;

    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    aput-object v8, v4, v5

    .line 115
    .line 116
    move-object v8, v9

    .line 117
    move-object v4, v10

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    move-object v12, v8

    .line 120
    move-object v8, v4

    .line 121
    move-object v4, v12

    .line 122
    :goto_1
    if-eqz v4, :cond_3

    .line 123
    .line 124
    invoke-direct {p0, v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->addEventToEventsToDispatch(Lcom/facebook/react/uimanager/events/Event;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    if-eqz v8, :cond_4

    .line 128
    .line 129
    invoke-virtual {v8}, Lcom/facebook/react/uimanager/events/Event;->dispose()V

    .line 130
    .line 131
    .line 132
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    const-string v2, "Required value was null."

    .line 136
    .line 137
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v3

    .line 143
    :cond_6
    sget-object v2, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    .line 145
    :try_start_2
    monitor-exit v1

    .line 146
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventStaging:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    .line 150
    .line 151
    monitor-exit v0

    .line 152
    return-void

    .line 153
    :catchall_1
    move-exception v1

    .line 154
    goto :goto_4

    .line 155
    :goto_3
    :try_start_3
    monitor-exit v1

    .line 156
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 157
    :goto_4
    monitor-exit v0

    .line 158
    throw v1
.end method

.method private static final onCatalystInstanceDestroyed$lambda$2(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->stopFrameCallback()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final stopFrameCallback()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->currentFrameCallback:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;->stop()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public addBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->postEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public addListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public dispatchAllEvents()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->maybePostFrameCallbackFromNonUI()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/Event;->isInitialized()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "iterator(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/facebook/react/uimanager/events/EventDispatcherListener;

    .line 34
    .line 35
    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/events/EventDispatcherListener;->onEventDispatch(Lcom/facebook/react/uimanager/events/Event;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventsStagingLock:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v0

    .line 42
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->eventStaging:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/Event;->getEventName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/Event;->getUniqueID()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    invoke-static {v2, v3, v1, p1}, LB3/a;->l(JLjava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    monitor-exit v0

    .line 63
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->maybePostFrameCallbackFromNonUI()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v0

    .line 69
    throw p1

    .line 70
    :cond_1
    const-string p1, "Dispatched event hasn\'t been initialized"

    .line 71
    .line 72
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0
.end method

.method public onCatalystInstanceDestroyed()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/a;-><init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->stopFrameCallback()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onHostPause()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->stopFrameCallback()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onHostResume()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->maybePostFrameCallbackFromNonUI()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public removeBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->postEventDispatchListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public removeListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
