package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000232B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\u000bH\u0017¢\u0006\u0004\b \u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010*\u001a\u00060)R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/facebook/react/uimanager/events/FabricEventDispatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "fabricEventEmitter", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "Lcom/facebook/react/uimanager/events/Event;", "event", "Li7/B;", "dispatchSynchronous", "(Lcom/facebook/react/uimanager/events/Event;)V", "scheduleDispatchOfBatchedEvents", "()V", "cancelDispatchOfBatchedEvents", "dispatchEvent", "dispatchAllEvents", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "listener", "addListener", "(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V", "removeListener", "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;", "addBatchEventDispatchedListener", "(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V", "removeBatchEventDispatchedListener", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "onCatalystInstanceDestroyed", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/uimanager/events/EventEmitterImpl;", "eventEmitter", "Lcom/facebook/react/uimanager/events/EventEmitterImpl;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "postEventDispatchListeners", "Lcom/facebook/react/uimanager/events/FabricEventDispatcher$ScheduleDispatchFrameCallback;", "currentFrameCallback", "Lcom/facebook/react/uimanager/events/FabricEventDispatcher$ScheduleDispatchFrameCallback;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isDispatchScheduled", "Z", "Ljava/lang/Runnable;", "dispatchEventsRunnable", "Ljava/lang/Runnable;", "Companion", "ScheduleDispatchFrameCallback", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FabricEventDispatcher implements EventDispatcher, LifecycleEventListener {
    private static final Companion Companion = new Companion(null);
    private static final Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
    private final ScheduleDispatchFrameCallback currentFrameCallback;
    private final Runnable dispatchEventsRunnable;
    private final EventEmitterImpl eventEmitter;
    private boolean isDispatchScheduled;
    private final CopyOnWriteArrayList<EventDispatcherListener> listeners;
    private final CopyOnWriteArrayList<BatchEventDispatchedListener> postEventDispatchListeners;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/uimanager/events/FabricEventDispatcher$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "uiThreadHandler", "Landroid/os/Handler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/events/FabricEventDispatcher$ScheduleDispatchFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/uimanager/events/FabricEventDispatcher;)V", "Li7/B;", "dispatchBatchedEvents", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "frameTimeNanos", "doFrame", "(J)V", "stop", "resume", "maybeDispatchBatchedEvents", "maybeScheduleDispatchOfBatchedEvents", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isFrameCallbackDispatchScheduled", "Z", "shouldStop", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class ScheduleDispatchFrameCallback implements Choreographer.FrameCallback {
        private volatile boolean isFrameCallbackDispatchScheduled;
        private boolean shouldStop;

        public ScheduleDispatchFrameCallback() {
        }

        private final void dispatchBatchedEvents() {
            ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, FabricEventDispatcher.this.currentFrameCallback);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            UiThreadUtil.assertOnUiThread();
            if (this.shouldStop) {
                this.isFrameCallbackDispatchScheduled = false;
            } else {
                dispatchBatchedEvents();
            }
            B3.a.c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = FabricEventDispatcher.this.postEventDispatchListeners.iterator();
                AbstractC2855l.f(it, "iterator(...)");
                while (it.hasNext()) {
                    ((BatchEventDispatchedListener) it.next()).onBatchEventDispatched();
                }
            } finally {
                B3.a.i(0L);
            }
        }

        public final void maybeDispatchBatchedEvents() {
            if (this.isFrameCallbackDispatchScheduled) {
                return;
            }
            this.isFrameCallbackDispatchScheduled = true;
            dispatchBatchedEvents();
        }

        public final void maybeScheduleDispatchOfBatchedEvents() {
            if (this.isFrameCallbackDispatchScheduled) {
                return;
            }
            if (FabricEventDispatcher.this.reactContext.isOnUiQueueThread()) {
                maybeDispatchBatchedEvents();
            } else {
                FabricEventDispatcher.this.reactContext.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20602g.maybeDispatchBatchedEvents();
                    }
                });
            }
        }

        public final void resume() {
            this.shouldStop = false;
        }

        public final void stop() {
            this.shouldStop = true;
        }
    }

    public FabricEventDispatcher(ReactApplicationContext reactContext, RCTModernEventEmitter fabricEventEmitter) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(fabricEventEmitter, "fabricEventEmitter");
        this.reactContext = reactContext;
        EventEmitterImpl eventEmitterImpl = new EventEmitterImpl(reactContext);
        this.eventEmitter = eventEmitterImpl;
        this.listeners = new CopyOnWriteArrayList<>();
        this.postEventDispatchListeners = new CopyOnWriteArrayList<>();
        this.currentFrameCallback = new ScheduleDispatchFrameCallback();
        this.dispatchEventsRunnable = new Runnable() { // from class: com.facebook.react.uimanager.events.e
            @Override // java.lang.Runnable
            public final void run() {
                FabricEventDispatcher.dispatchEventsRunnable$lambda$0(this.f20601g);
            }
        };
        reactContext.addLifecycleEventListener(this);
        eventEmitterImpl.registerFabricEventEmitter(fabricEventEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelDispatchOfBatchedEvents() {
        UiThreadUtil.assertOnUiThread();
        if (!ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            this.currentFrameCallback.stop();
        } else {
            this.isDispatchScheduled = false;
            uiThreadHandler.removeCallbacks(this.dispatchEventsRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEventsRunnable$lambda$0(FabricEventDispatcher fabricEventDispatcher) {
        fabricEventDispatcher.isDispatchScheduled = false;
        B3.a.c(0L, "BatchEventDispatchedListeners");
        try {
            Iterator<BatchEventDispatchedListener> it = fabricEventDispatcher.postEventDispatchListeners.iterator();
            AbstractC2855l.f(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().onBatchEventDispatched();
            }
        } finally {
            B3.a.i(0L);
        }
    }

    private final void dispatchSynchronous(Event<?> event) {
        B3.a.c(0L, "FabricEventDispatcher.dispatchSynchronous('" + event.getEventName() + "')");
        try {
            UIManager uIManager = UIManagerHelper.getUIManager(this.reactContext, 2);
            if (uIManager instanceof SynchronousEventReceiver) {
                ((SynchronousEventReceiver) uIManager).receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), event.internal_getEventData$ReactAndroid_release(), event.internal_getEventCategory$ReactAndroid_release(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new IllegalStateException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
            B3.a.i(0L);
        } catch (Throwable th) {
            B3.a.i(0L);
            throw th;
        }
    }

    private final void scheduleDispatchOfBatchedEvents() {
        if (!ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            this.currentFrameCallback.maybeScheduleDispatchOfBatchedEvents();
        } else {
            if (this.isDispatchScheduled) {
                return;
            }
            this.isDispatchScheduled = true;
            uiThreadHandler.postAtFrontOfQueue(this.dispatchEventsRunnable);
        }
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
        scheduleDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event<?> event) {
        AbstractC2855l.g(event, "event");
        Iterator<EventDispatcherListener> it = this.listeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onEventDispatch(event);
        }
        if (event.internal_experimental_isSynchronous$ReactAndroid_release()) {
            dispatchSynchronous(event);
        } else {
            event.dispatchModern(this.eventEmitter);
        }
        event.dispose();
        scheduleDispatchOfBatchedEvents();
    }

    public final void invalidate() {
        this.eventEmitter.registerFabricEventEmitter(null);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f20600g.cancelDispatchOfBatchedEvents();
            }
        });
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void onCatalystInstanceDestroyed() {
        invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        cancelDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        cancelDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        scheduleDispatchOfBatchedEvents();
        if (ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            return;
        }
        this.currentFrameCallback.resume();
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
