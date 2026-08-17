package com.facebook.react.jstasks;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u00011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u000eJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u001dR\"\u0010\u0003\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/facebook/react/jstasks/HeadlessJsTaskContext;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "taskConfig", PointerEventHelper.POINTER_TYPE_UNKNOWN, "taskId", "Li7/B;", "startTask", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;I)V", "removeTimeout", "(I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "timeout", "scheduleTaskTimeout", "(IJ)V", "Lcom/facebook/react/jstasks/HeadlessJsTaskEventListener;", "listener", "addTaskEventListener", "(Lcom/facebook/react/jstasks/HeadlessJsTaskEventListener;)V", "removeTaskEventListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasActiveTasks", "()Z", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)I", "retryTask", "(I)Z", "finishTask", "isTaskRunning", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "headlessJsTaskEventListeners", "Ljava/util/Set;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastTaskId", "Ljava/util/concurrent/atomic/AtomicInteger;", "activeTasks", PointerEventHelper.POINTER_TYPE_UNKNOWN, "activeTaskConfigs", "Ljava/util/Map;", "Landroid/util/SparseArray;", "Ljava/lang/Runnable;", "taskTimeouts", "Landroid/util/SparseArray;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeadlessJsTaskContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final WeakHashMap<ReactContext, HeadlessJsTaskContext> INSTANCES = new WeakHashMap<>();
    private final Map<Integer, HeadlessJsTaskConfig> activeTaskConfigs;
    private final Set<Integer> activeTasks;
    private final Set<HeadlessJsTaskEventListener> headlessJsTaskEventListeners;
    private final AtomicInteger lastTaskId;
    private final WeakReference<ReactContext> reactContext;
    private final SparseArray<Runnable> taskTimeouts;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/jstasks/HeadlessJsTaskContext$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "INSTANCES", "Ljava/util/WeakHashMap;", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/jstasks/HeadlessJsTaskContext;", "getInstance", "context", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HeadlessJsTaskContext getInstance(ReactContext context) {
            AbstractC2855l.g(context, "context");
            WeakHashMap weakHashMap = HeadlessJsTaskContext.INSTANCES;
            Object headlessJsTaskContext = weakHashMap.get(context);
            if (headlessJsTaskContext == null) {
                headlessJsTaskContext = new HeadlessJsTaskContext(context, null);
                weakHashMap.put(context, headlessJsTaskContext);
            }
            return (HeadlessJsTaskContext) headlessJsTaskContext;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeadlessJsTaskContext(ReactContext reactContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTask$lambda$4(HeadlessJsTaskContext headlessJsTaskContext, int i10) {
        Iterator<HeadlessJsTaskEventListener> it = headlessJsTaskContext.headlessJsTaskEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onHeadlessJsTaskFinish(i10);
        }
    }

    public static final HeadlessJsTaskContext getInstance(ReactContext reactContext) {
        return INSTANCE.getInstance(reactContext);
    }

    private final void removeTimeout(int taskId) {
        Runnable runnable = this.taskTimeouts.get(taskId);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.taskTimeouts.remove(taskId);
        }
    }

    private final void scheduleTaskTimeout(final int taskId, long timeout) {
        Runnable runnable = new Runnable() { // from class: s3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f32278g.finishTask(taskId);
            }
        };
        this.taskTimeouts.append(taskId, runnable);
        UiThreadUtil.runOnUiThread(runnable, timeout);
    }

    public final synchronized void addTaskEventListener(HeadlessJsTaskEventListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.headlessJsTaskEventListeners.add(listener);
        Iterator<Integer> it = this.activeTasks.iterator();
        while (it.hasNext()) {
            listener.onHeadlessJsTaskStart(it.next().intValue());
        }
    }

    public final synchronized void finishTask(final int taskId) {
        boolean zRemove = this.activeTasks.remove(Integer.valueOf(taskId));
        this.activeTaskConfigs.remove(Integer.valueOf(taskId));
        removeTimeout(taskId);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: s3.c
                @Override // java.lang.Runnable
                public final void run() {
                    HeadlessJsTaskContext.finishTask$lambda$4(this.f32280g, taskId);
                }
            });
        }
    }

    public final boolean hasActiveTasks() {
        return !this.activeTasks.isEmpty();
    }

    public final synchronized boolean isTaskRunning(int taskId) {
        return this.activeTasks.contains(Integer.valueOf(taskId));
    }

    public final void removeTaskEventListener(HeadlessJsTaskEventListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.headlessJsTaskEventListeners.remove(listener);
    }

    public final synchronized boolean retryTask(final int taskId) {
        HeadlessJsTaskConfig headlessJsTaskConfig = this.activeTaskConfigs.get(Integer.valueOf(taskId));
        if (headlessJsTaskConfig == null) {
            throw new IllegalStateException(("Tried to retrieve non-existent task config with id " + taskId + ".").toString());
        }
        HeadlessJsTaskRetryPolicy retryPolicy = headlessJsTaskConfig.getRetryPolicy();
        if (retryPolicy != null && retryPolicy.canRetry()) {
            removeTimeout(taskId);
            final HeadlessJsTaskConfig headlessJsTaskConfig2 = new HeadlessJsTaskConfig(headlessJsTaskConfig.getTaskKey(), headlessJsTaskConfig.getData(), headlessJsTaskConfig.getTimeout(), headlessJsTaskConfig.getIsAllowedInForeground(), retryPolicy.update());
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: s3.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32275g.startTask(headlessJsTaskConfig2, taskId);
                }
            }, retryPolicy.getDelay());
            return true;
        }
        return false;
    }

    public final synchronized int startTask(HeadlessJsTaskConfig taskConfig) {
        int iIncrementAndGet;
        AbstractC2855l.g(taskConfig, "taskConfig");
        iIncrementAndGet = this.lastTaskId.incrementAndGet();
        startTask(taskConfig, iIncrementAndGet);
        return iIncrementAndGet;
    }

    private HeadlessJsTaskContext(ReactContext reactContext) {
        this.reactContext = new WeakReference<>(reactContext);
        this.headlessJsTaskEventListeners = new CopyOnWriteArraySet();
        this.lastTaskId = new AtomicInteger(0);
        this.activeTasks = new CopyOnWriteArraySet();
        this.activeTaskConfigs = new ConcurrentHashMap();
        this.taskTimeouts = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void startTask(HeadlessJsTaskConfig taskConfig, int taskId) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) AbstractC3007a.d(this.reactContext.get(), "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !taskConfig.getIsAllowedInForeground()) {
                throw new IllegalStateException(("Tried to start task " + taskConfig.getTaskKey() + " while in foreground, but this is not allowed.").toString());
            }
            this.activeTasks.add(Integer.valueOf(taskId));
            this.activeTaskConfigs.put(Integer.valueOf(taskId), new HeadlessJsTaskConfig(taskConfig));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(taskId, taskConfig.getTaskKey(), taskConfig.getData());
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            if (taskConfig.getTimeout() > 0) {
                scheduleTaskTimeout(taskId, taskConfig.getTimeout());
            }
            Iterator<HeadlessJsTaskEventListener> it = this.headlessJsTaskEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onHeadlessJsTaskStart(taskId);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
