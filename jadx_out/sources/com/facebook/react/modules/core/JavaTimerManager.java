package com.facebook.react.modules.core;

import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.SystemClock;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0005RSTUQB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ'\u0010#\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0018H\u0017¢\u0006\u0004\b*\u0010\u001bJ\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020!H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001fH\u0000¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010C\u001a\u00060BR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u00060ER\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\b\u0018\u00010HR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010+\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020;0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006V"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/jstasks/HeadlessJsTaskEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;", "javaScriptTimerExecutor", "Lcom/facebook/react/modules/core/ReactChoreographer;", "reactChoreographer", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;Lcom/facebook/react/modules/core/ReactChoreographer;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V", "Li7/B;", "maybeSetChoreographerIdleCallback", "()V", "maybeIdleCallback", "setChoreographerCallback", "clearFrameCallback", "setChoreographerIdleCallback", "clearChoreographerIdleCallback", "onHostPause", "onHostDestroy", "onHostResume", PointerEventHelper.POINTER_TYPE_UNKNOWN, "taskId", "onHeadlessJsTaskStart", "(I)V", "onHeadlessJsTaskFinish", "onInstanceDestroy", "timerId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "delay", PointerEventHelper.POINTER_TYPE_UNKNOWN, "repeat", "createTimer", "(IJZ)V", "duration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsSchedulingTime", "createAndMaybeCallTimer", "(IIDZ)V", "deleteTimer", "sendIdleEvents", "setSendIdleEvents", "(Z)V", "rangeMs", "hasActiveTimersInRange$ReactAndroid_release", "(J)Z", "hasActiveTimersInRange", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;", "Lcom/facebook/react/modules/core/ReactChoreographer;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timerGuard", "Ljava/lang/Object;", "idleCallbackGuard", "Landroid/util/SparseArray;", "Lcom/facebook/react/modules/core/JavaTimerManager$Timer;", "timerIdsToTimers", "Landroid/util/SparseArray;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPaused", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRunningTasks", "Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;", "timerFrameCallback", "Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;", "Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;", "idleFrameCallback", "Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;", "Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;", "currentIdleCallbackRunnable", "Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;", "frameCallbackPosted", "Z", "frameIdleCallbackPosted", "Ljava/util/PriorityQueue;", "timers", "Ljava/util/PriorityQueue;", "Companion", "Timer", "TimerFrameCallback", "IdleFrameCallback", "IdleCallbackRunnable", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class JavaTimerManager implements LifecycleEventListener, HeadlessJsTaskEventListener {
    private static final Companion Companion = new Companion(null);
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    private static final int TIMER_QUEUE_CAPACITY = 11;
    private IdleCallbackRunnable currentIdleCallbackRunnable;
    private final DevSupportManager devSupportManager;
    private boolean frameCallbackPosted;
    private boolean frameIdleCallbackPosted;
    private final Object idleCallbackGuard;
    private final IdleFrameCallback idleFrameCallback;
    private final AtomicBoolean isPaused;
    private final AtomicBoolean isRunningTasks;
    private final JavaScriptTimerExecutor javaScriptTimerExecutor;
    private final ReactApplicationContext reactApplicationContext;
    private final ReactChoreographer reactChoreographer;
    private boolean sendIdleEvents;
    private final TimerFrameCallback timerFrameCallback;
    private final Object timerGuard;
    private final SparseArray<Timer> timerIdsToTimers;
    private final PriorityQueue<Timer> timers;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "IDLE_CALLBACK_FRAME_DEADLINE_MS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "FRAME_DURATION_MS", "TIMER_QUEUE_CAPACITY", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isTimerInRange", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timer", "Lcom/facebook/react/modules/core/JavaTimerManager$Timer;", "rangeMs", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isTimerInRange(Timer timer, long rangeMs) {
            return !timer.getRepeat() && ((long) timer.getInterval()) < rangeMs;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;", "Ljava/lang/Runnable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "frameStartTime", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;J)V", "Li7/B;", "run", "()V", "cancel", "J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isCancelled", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class IdleCallbackRunnable implements Runnable {
        private final long frameStartTime;
        private volatile boolean isCancelled;

        public IdleCallbackRunnable(long j10) {
            this.frameStartTime = j10;
        }

        public final void cancel() {
            this.isCancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            if (this.isCancelled) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - (this.frameStartTime / ((long) 1000000));
            long jCurrentTimeMillis = SystemClock.currentTimeMillis() - jUptimeMillis;
            if (JavaTimerManager.FRAME_DURATION_MS - jUptimeMillis < JavaTimerManager.IDLE_CALLBACK_FRAME_DEADLINE_MS) {
                return;
            }
            Object obj = JavaTimerManager.this.idleCallbackGuard;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z10 = javaTimerManager.sendIdleEvents;
                C2735B c2735b = C2735B.f28704a;
            }
            if (z10) {
                JavaTimerManager.this.javaScriptTimerExecutor.callIdleCallbacks(jCurrentTimeMillis);
            }
            JavaTimerManager.this.currentIdleCallbackRunnable = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "frameTimeNanos", "Li7/B;", "doFrame", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class IdleFrameCallback implements Choreographer.FrameCallback {
        public IdleFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                IdleCallbackRunnable idleCallbackRunnable = JavaTimerManager.this.currentIdleCallbackRunnable;
                if (idleCallbackRunnable != null) {
                    idleCallbackRunnable.cancel();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.currentIdleCallbackRunnable = javaTimerManager.new IdleCallbackRunnable(frameTimeNanos);
                JavaTimerManager.this.reactApplicationContext.runOnJSQueueThread(JavaTimerManager.this.currentIdleCallbackRunnable);
                JavaTimerManager.this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$Timer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timerId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "targetTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "interval", "repeat", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(IJIZ)V", "getTimerId", "()I", "getTargetTime", "()J", "setTargetTime", "(J)V", "getInterval", "getRepeat", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Timer {
        private final int interval;
        private final boolean repeat;
        private long targetTime;
        private final int timerId;

        public Timer(int i10, long j10, int i11, boolean z10) {
            this.timerId = i10;
            this.targetTime = j10;
            this.interval = i11;
            this.repeat = z10;
        }

        public final int getInterval() {
            return this.interval;
        }

        public final boolean getRepeat() {
            return this.repeat;
        }

        public final long getTargetTime() {
            return this.targetTime;
        }

        public final int getTimerId() {
            return this.timerId;
        }

        public final void setTargetTime(long j10) {
            this.targetTime = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "frameTimeNanos", "Li7/B;", "doFrame", "(J)V", "Lcom/facebook/react/bridge/WritableArray;", "timersToCall", "Lcom/facebook/react/bridge/WritableArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class TimerFrameCallback implements Choreographer.FrameCallback {
        private WritableArray timersToCall;

        public TimerFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            Timer timer;
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                long j10 = frameTimeNanos / ((long) 1000000);
                Object obj = JavaTimerManager.this.timerGuard;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.timers.isEmpty()) {
                        try {
                            Object objPeek = javaTimerManager.timers.peek();
                            AbstractC2855l.d(objPeek);
                            if (((Timer) objPeek).getTargetTime() >= j10 || (timer = (Timer) javaTimerManager.timers.poll()) == null) {
                                break;
                            }
                            if (this.timersToCall == null) {
                                this.timersToCall = Arguments.createArray();
                            }
                            WritableArray writableArray = this.timersToCall;
                            if (writableArray != null) {
                                writableArray.pushInt(timer.getTimerId());
                            }
                            if (timer.getRepeat()) {
                                timer.setTargetTime(((long) timer.getInterval()) + j10);
                                javaTimerManager.timers.add(timer);
                            } else {
                                javaTimerManager.timerIdsToTimers.remove(timer.getTimerId());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    C2735B c2735b = C2735B.f28704a;
                }
                WritableArray writableArray2 = this.timersToCall;
                if (writableArray2 != null) {
                    JavaTimerManager.this.javaScriptTimerExecutor.callTimers(writableArray2);
                    this.timersToCall = null;
                }
                JavaTimerManager.this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, JavaScriptTimerExecutor javaScriptTimerExecutor, ReactChoreographer reactChoreographer, DevSupportManager devSupportManager) {
        AbstractC2855l.g(reactApplicationContext, "reactApplicationContext");
        AbstractC2855l.g(javaScriptTimerExecutor, "javaScriptTimerExecutor");
        AbstractC2855l.g(reactChoreographer, "reactChoreographer");
        AbstractC2855l.g(devSupportManager, "devSupportManager");
        this.reactApplicationContext = reactApplicationContext;
        this.javaScriptTimerExecutor = javaScriptTimerExecutor;
        this.reactChoreographer = reactChoreographer;
        this.devSupportManager = devSupportManager;
        this.timerGuard = new Object();
        this.idleCallbackGuard = new Object();
        this.timerIdsToTimers = new SparseArray<>();
        this.isPaused = new AtomicBoolean(true);
        this.isRunningTasks = new AtomicBoolean(false);
        this.timerFrameCallback = new TimerFrameCallback();
        this.idleFrameCallback = new IdleFrameCallback();
        final Function2 function2 = new Function2() { // from class: com.facebook.react.modules.core.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(JavaTimerManager.timers$lambda$0((JavaTimerManager.Timer) obj, (JavaTimerManager.Timer) obj2));
            }
        };
        this.timers = new PriorityQueue<>(11, new Comparator() { // from class: com.facebook.react.modules.core.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return JavaTimerManager.timers$lambda$1(function2, obj, obj2);
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        HeadlessJsTaskContext.INSTANCE.getInstance(reactApplicationContext).addTaskEventListener(this);
    }

    private final void clearChoreographerIdleCallback() {
        if (this.frameIdleCallbackPosted) {
            this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.idleFrameCallback);
            this.frameIdleCallbackPosted = false;
        }
    }

    private final void clearFrameCallback() {
        HeadlessJsTaskContext companion = HeadlessJsTaskContext.INSTANCE.getInstance(this.reactApplicationContext);
        if (this.frameCallbackPosted && this.isPaused.get() && !companion.hasActiveTasks()) {
            this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.timerFrameCallback);
            this.frameCallbackPosted = false;
        }
    }

    private final void maybeIdleCallback() {
        if (!this.isPaused.get() || this.isRunningTasks.get()) {
            return;
        }
        clearFrameCallback();
    }

    private final void maybeSetChoreographerIdleCallback() {
        synchronized (this.idleCallbackGuard) {
            try {
                if (this.sendIdleEvents) {
                    setChoreographerIdleCallback();
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void setChoreographerCallback() {
        if (this.frameCallbackPosted) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.timerFrameCallback);
        this.frameCallbackPosted = true;
    }

    private final void setChoreographerIdleCallback() {
        if (this.frameIdleCallbackPosted) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.idleFrameCallback);
        this.frameIdleCallbackPosted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSendIdleEvents$lambda$7(JavaTimerManager javaTimerManager, boolean z10) {
        synchronized (javaTimerManager.idleCallbackGuard) {
            try {
                if (z10) {
                    javaTimerManager.setChoreographerIdleCallback();
                } else {
                    javaTimerManager.clearChoreographerIdleCallback();
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int timers$lambda$0(Timer timer, Timer timer2) {
        return AbstractC3624a.a(timer.getTargetTime() - timer2.getTargetTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int timers$lambda$1(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public void createAndMaybeCallTimer(int timerId, int duration, double jsSchedulingTime, boolean repeat) {
        long jCurrentTimeMillis = SystemClock.currentTimeMillis();
        long j10 = (long) jsSchedulingTime;
        if (this.devSupportManager.getIsDevSupportEnabled() && Math.abs(j10 - jCurrentTimeMillis) > 60000) {
            this.javaScriptTimerExecutor.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j10 - jCurrentTimeMillis) + ((long) duration));
        if (duration != 0 || repeat) {
            createTimer(timerId, jMax, repeat);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(timerId);
        this.javaScriptTimerExecutor.callTimers(writableArrayCreateArray);
    }

    public void createTimer(int timerId, long delay, boolean repeat) {
        Timer timer = new Timer(timerId, (SystemClock.nanoTime() / ((long) 1000000)) + delay, (int) delay, repeat);
        synchronized (this.timerGuard) {
            this.timers.add(timer);
            this.timerIdsToTimers.put(timerId, timer);
            C2735B c2735b = C2735B.f28704a;
        }
    }

    public void deleteTimer(int timerId) {
        synchronized (this.timerGuard) {
            Timer timer = this.timerIdsToTimers.get(timerId);
            if (timer == null) {
                return;
            }
            this.timerIdsToTimers.remove(timerId);
            this.timers.remove(timer);
        }
    }

    public final boolean hasActiveTimersInRange$ReactAndroid_release(long rangeMs) {
        synchronized (this.timerGuard) {
            Timer timerPeek = this.timers.peek();
            if (timerPeek == null) {
                return false;
            }
            if (Companion.isTimerInRange(timerPeek, rangeMs)) {
                return true;
            }
            Iterator<Timer> it = this.timers.iterator();
            AbstractC2855l.f(it, "iterator(...)");
            while (it.hasNext()) {
                Timer next = it.next();
                Companion companion = Companion;
                AbstractC2855l.d(next);
                if (companion.isTimerInRange(next, rangeMs)) {
                    return true;
                }
            }
            C2735B c2735b = C2735B.f28704a;
            return false;
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int taskId) {
        if (HeadlessJsTaskContext.INSTANCE.getInstance(this.reactApplicationContext).hasActiveTasks()) {
            return;
        }
        this.isRunningTasks.set(false);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int taskId) {
        if (this.isRunningTasks.getAndSet(true)) {
            return;
        }
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    public void onInstanceDestroy() {
        HeadlessJsTaskContext.INSTANCE.getInstance(this.reactApplicationContext).removeTaskEventListener(this);
        this.reactApplicationContext.removeLifecycleEventListener(this);
        clearFrameCallback();
        clearChoreographerIdleCallback();
    }

    public void setSendIdleEvents(final boolean sendIdleEvents) {
        synchronized (this.idleCallbackGuard) {
            this.sendIdleEvents = sendIdleEvents;
            C2735B c2735b = C2735B.f28704a;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.d
            @Override // java.lang.Runnable
            public final void run() {
                JavaTimerManager.setSendIdleEvents$lambda$7(this.f20413g, sendIdleEvents);
            }
        });
    }
}
