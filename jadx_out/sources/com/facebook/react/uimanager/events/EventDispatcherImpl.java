package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.ReactChoreographer;
import i7.C2735B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003STRB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00072\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\tJ\u001b\u0010\u001a\u001a\u00020\u00072\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\tJ\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\tJ\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\u000f\u0010(\u001a\u00020\u0007H\u0017¢\u0006\u0004\b(\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u000604R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R,\u00109\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001507j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020!0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0018\u0010@\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/facebook/react/uimanager/events/EventDispatcherImpl;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Li7/B;", "maybePostFrameCallbackFromNonUI", "()V", "stopFrameCallback", "moveStagedEventsToDispatchQueue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewTag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "coalescingKey", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getEventCookie", "(ILjava/lang/String;S)J", "Lcom/facebook/react/uimanager/events/Event;", "event", "addEventToEventsToDispatch", "(Lcom/facebook/react/uimanager/events/Event;)V", "clearEventsToDispatch", "dispatchEvent", "dispatchAllEvents", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "listener", "addListener", "(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V", "removeListener", "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;", "addBatchEventDispatchedListener", "(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V", "removeBatchEventDispatchedListener", "onHostResume", "onHostPause", "onHostDestroy", "onCatalystInstanceDestroyed", "Lcom/facebook/react/bridge/ReactApplicationContext;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventsStagingLock", "Ljava/lang/Object;", "eventsToDispatchLock", "Landroid/util/LongSparseArray;", "eventCookieToLastEventIdx", "Landroid/util/LongSparseArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventNameToEventId", "Ljava/util/Map;", "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;", "dispatchEventsRunnable", "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eventStaging", "Ljava/util/ArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "postEventDispatchListeners", "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;", "currentFrameCallback", "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "hasDispatchScheduledCount", "Ljava/util/concurrent/atomic/AtomicInteger;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventsToDispatch", "[Lcom/facebook/react/uimanager/events/Event;", "eventsToDispatchSize", "I", "Lcom/facebook/react/uimanager/events/EventEmitterImpl;", "reactEventEmitter", "Lcom/facebook/react/uimanager/events/EventEmitterImpl;", "nextEventTypeId", "S", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasDispatchScheduled", "Z", "Companion", "ScheduleDispatchFrameCallback", "DispatchEventsRunnable", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventDispatcherImpl implements EventDispatcher, LifecycleEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Comparator<Event<?>> EVENT_COMPARATOR = new Comparator() { // from class: com.facebook.react.uimanager.events.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return EventDispatcherImpl.EVENT_COMPARATOR$lambda$5((Event) obj, (Event) obj2);
        }
    };
    private final ScheduleDispatchFrameCallback currentFrameCallback;
    private final DispatchEventsRunnable dispatchEventsRunnable;
    private final LongSparseArray<Integer> eventCookieToLastEventIdx;
    private final Map<String, Short> eventNameToEventId;
    private final ArrayList<Event<?>> eventStaging;
    private final Object eventsStagingLock;
    private Event<?>[] eventsToDispatch;
    private final Object eventsToDispatchLock;
    private int eventsToDispatchSize;
    private volatile boolean hasDispatchScheduled;
    private final AtomicInteger hasDispatchScheduledCount;
    private final CopyOnWriteArrayList<EventDispatcherListener> listeners;
    private short nextEventTypeId;
    private final CopyOnWriteArrayList<BatchEventDispatchedListener> postEventDispatchListeners;
    private final ReactApplicationContext reactContext;
    private final EventEmitterImpl reactEventEmitter;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/events/EventDispatcherImpl$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "EVENT_COMPARATOR", "Ljava/util/Comparator;", "Lcom/facebook/react/uimanager/events/Event;", "getEventCookie", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewTag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventTypeId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "coalescingKey", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getEventCookie(int viewTag, short eventTypeId, short coalescingKey) {
            return ((((long) eventTypeId) & 65535) << 32) | ((long) viewTag) | ((((long) coalescingKey) & 65535) << 48);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;", "Ljava/lang/Runnable;", "<init>", "(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V", "Li7/B;", "run", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class DispatchEventsRunnable implements Runnable {
        public DispatchEventsRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B3.a.c(0L, "DispatchEventsRunnable");
            try {
                B3.a.f(0L, "ScheduleDispatchFrameCallback", EventDispatcherImpl.this.hasDispatchScheduledCount.getAndIncrement());
                EventDispatcherImpl.this.hasDispatchScheduled = false;
                Object obj = EventDispatcherImpl.this.eventsToDispatchLock;
                EventDispatcherImpl eventDispatcherImpl = EventDispatcherImpl.this;
                synchronized (obj) {
                    try {
                        if (eventDispatcherImpl.eventsToDispatchSize > 0) {
                            if (eventDispatcherImpl.eventsToDispatchSize > 1) {
                                Arrays.sort(eventDispatcherImpl.eventsToDispatch, 0, eventDispatcherImpl.eventsToDispatchSize, EventDispatcherImpl.EVENT_COMPARATOR);
                            }
                            int i10 = eventDispatcherImpl.eventsToDispatchSize;
                            for (int i11 = 0; i11 < i10; i11++) {
                                Event event = eventDispatcherImpl.eventsToDispatch[i11];
                                if (event != null) {
                                    B3.a.f(0L, event.getEventName(), event.getUniqueID());
                                    event.dispatchModern(eventDispatcherImpl.reactEventEmitter);
                                    event.dispose();
                                }
                            }
                            eventDispatcherImpl.clearEventsToDispatch();
                            eventDispatcherImpl.eventCookieToLastEventIdx.clear();
                        }
                        C2735B c2735b = C2735B.f28704a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = EventDispatcherImpl.this.postEventDispatchListeners.iterator();
                AbstractC2855l.f(it, "iterator(...)");
                while (it.hasNext()) {
                    ((BatchEventDispatchedListener) it.next()).onBatchEventDispatched();
                }
            } finally {
                B3.a.i(0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "frameTimeNanos", "Li7/B;", "doFrame", "(J)V", "stop", "()V", "maybePost", "post", "maybePostFromNonUI", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isPosted", "Z", "shouldStop", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class ScheduleDispatchFrameCallback implements Choreographer.FrameCallback {
        private volatile boolean isPosted;
        private boolean shouldStop;

        public ScheduleDispatchFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            UiThreadUtil.assertOnUiThread();
            if (this.shouldStop) {
                this.isPosted = false;
            } else {
                post();
            }
            B3.a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                EventDispatcherImpl.this.moveStagedEventsToDispatchQueue();
                if (!EventDispatcherImpl.this.hasDispatchScheduled) {
                    EventDispatcherImpl.this.hasDispatchScheduled = true;
                    B3.a.l(0L, "ScheduleDispatchFrameCallback", EventDispatcherImpl.this.hasDispatchScheduledCount.get());
                    EventDispatcherImpl.this.reactContext.runOnJSQueueThread(EventDispatcherImpl.this.dispatchEventsRunnable);
                }
            } finally {
                B3.a.i(0L);
            }
        }

        public final void maybePost() {
            if (this.isPosted) {
                return;
            }
            this.isPosted = true;
            post();
        }

        public final void maybePostFromNonUI() {
            if (this.isPosted) {
                return;
            }
            if (EventDispatcherImpl.this.reactContext.isOnUiQueueThread()) {
                maybePost();
            } else {
                EventDispatcherImpl.this.reactContext.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20599g.maybePost();
                    }
                });
            }
        }

        public final void post() {
            ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, EventDispatcherImpl.this.currentFrameCallback);
        }

        public final void stop() {
            this.shouldStop = true;
        }
    }

    public EventDispatcherImpl(ReactApplicationContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.eventsStagingLock = new Object();
        this.eventsToDispatchLock = new Object();
        this.eventCookieToLastEventIdx = new LongSparseArray<>();
        this.eventNameToEventId = new LinkedHashMap();
        this.dispatchEventsRunnable = new DispatchEventsRunnable();
        this.eventStaging = new ArrayList<>();
        this.listeners = new CopyOnWriteArrayList<>();
        this.postEventDispatchListeners = new CopyOnWriteArrayList<>();
        this.currentFrameCallback = new ScheduleDispatchFrameCallback();
        this.hasDispatchScheduledCount = new AtomicInteger();
        this.eventsToDispatch = new Event[16];
        reactContext.addLifecycleEventListener(this);
        this.reactEventEmitter = new EventEmitterImpl(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EVENT_COMPARATOR$lambda$5(Event event, Event event2) {
        if (event == null && event2 == null) {
            return 0;
        }
        if (event == null) {
            return -1;
        }
        if (event2 == null) {
            return 1;
        }
        long timestampMs = event.getTimestampMs() - event2.getTimestampMs();
        if (timestampMs == 0) {
            return 0;
        }
        return timestampMs < 0 ? -1 : 1;
    }

    private final void addEventToEventsToDispatch(Event<?> event) {
        int i10 = this.eventsToDispatchSize;
        Event<?>[] eventArr = this.eventsToDispatch;
        if (i10 == eventArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(eventArr, eventArr.length * 2);
            AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
            this.eventsToDispatch = (Event[]) objArrCopyOf;
        }
        Event<?>[] eventArr2 = this.eventsToDispatch;
        int i11 = this.eventsToDispatchSize;
        this.eventsToDispatchSize = i11 + 1;
        eventArr2[i11] = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearEventsToDispatch() {
        Arrays.fill(this.eventsToDispatch, 0, this.eventsToDispatchSize, (Object) null);
        this.eventsToDispatchSize = 0;
    }

    private final long getEventCookie(int viewTag, String eventName, short coalescingKey) {
        short sShortValue;
        Short sh = this.eventNameToEventId.get(eventName);
        if (sh != null) {
            sShortValue = sh.shortValue();
        } else {
            short s10 = this.nextEventTypeId;
            this.nextEventTypeId = (short) (s10 + 1);
            this.eventNameToEventId.put(eventName, Short.valueOf(s10));
            sShortValue = s10;
        }
        return INSTANCE.getEventCookie(viewTag, sShortValue, coalescingKey);
    }

    private final void maybePostFrameCallbackFromNonUI() {
        this.currentFrameCallback.maybePostFromNonUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveStagedEventsToDispatchQueue() {
        synchronized (this.eventsStagingLock) {
            synchronized (this.eventsToDispatchLock) {
                try {
                    int size = this.eventStaging.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Event<?> event = this.eventStaging.get(i10);
                        AbstractC2855l.f(event, "get(...)");
                        Event<?> event2 = event;
                        if (event2.canCoalesce()) {
                            long eventCookie = getEventCookie(event2.getViewTag(), event2.getEventName(), event2.getCoalescingKey());
                            Integer num = this.eventCookieToLastEventIdx.get(eventCookie);
                            Event<?> event3 = null;
                            if (num == null) {
                                this.eventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.eventsToDispatchSize));
                            } else {
                                Event<?> event4 = this.eventsToDispatch[num.intValue()];
                                if (event4 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                Event<?> eventCoalesce = event2.coalesce(event4);
                                if (eventCoalesce != event4) {
                                    this.eventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.eventsToDispatchSize));
                                    this.eventsToDispatch[num.intValue()] = null;
                                    event3 = event4;
                                    event2 = eventCoalesce;
                                } else {
                                    event3 = event2;
                                    event2 = null;
                                }
                            }
                            if (event2 != null) {
                                addEventToEventsToDispatch(event2);
                            }
                            if (event3 != null) {
                                event3.dispose();
                            }
                        } else {
                            addEventToEventsToDispatch(event2);
                        }
                    }
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.eventStaging.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopFrameCallback() {
        UiThreadUtil.assertOnUiThread();
        this.currentFrameCallback.stop();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addBatchEventDispatchedListener(BatchEventDispatchedListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.postEventDispatchListeners.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addListener(EventDispatcherListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() {
        maybePostFrameCallbackFromNonUI();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event<?> event) {
        AbstractC2855l.g(event, "event");
        if (!event.getIsInitialized()) {
            throw new IllegalArgumentException("Dispatched event hasn't been initialized");
        }
        Iterator<EventDispatcherListener> it = this.listeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onEventDispatch(event);
        }
        synchronized (this.eventsStagingLock) {
            this.eventStaging.add(event);
            B3.a.l(0L, event.getEventName(), event.getUniqueID());
            C2735B c2735b = C2735B.f28704a;
        }
        maybePostFrameCallbackFromNonUI();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f20598g.stopFrameCallback();
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        maybePostFrameCallbackFromNonUI();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeBatchEventDispatchedListener(BatchEventDispatchedListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.postEventDispatchListeners.remove(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeListener(EventDispatcherListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.listeners.remove(listener);
    }
}
